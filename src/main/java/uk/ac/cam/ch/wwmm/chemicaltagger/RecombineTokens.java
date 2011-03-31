package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/******************************************
 * Combines non-chemical hyphened tokens that have been split by OSCAR.
 * @author lh359
 *******************************************/
public class RecombineTokens {
	
	/****************************
	 * Default Constructor Method
	 ***************************/
	public RecombineTokens(){
		
	}
	/*********************************************
	 * Indexes the tokens that need combining and then calls combineTokens.
	 * @param posContainer (POSContainer) .
	 * @return posContainer (POSContainer) .
	 *********************************************/
	public static POSContainer recombineHyphenedTokens(POSContainer posContainer) {
		String previousTag = "";
		String nextTag = "";
		List<Integer> totalIndexList = new ArrayList<Integer>();
		List<String> nonHyphenTags = Arrays.asList(new String[] { "dash",
				"comma", "cc", "stop" });
		List<Integer> indexList = new ArrayList<Integer>();
		LinkedHashMap<Integer, List<Integer>> indexMap = new LinkedHashMap<Integer, List<Integer>>();
		for (int currentIndex = 0; currentIndex < posContainer.getWordTokenList().size(); currentIndex++) {
			if (indexList.size() > 0)
				totalIndexList.addAll(indexList);
			indexList = new ArrayList<Integer>();

			if (posContainer.getCombinedTagsList().get(currentIndex).toLowerCase()
					.equals("dash")) {
				if (currentIndex == 0
						&& currentIndex + 1 < posContainer.getWordTokenList().size()) {
					indexList.add(currentIndex);
					indexList.add(currentIndex + 1);
					indexMap.put(indexList.get(0), indexList);
				} else if (currentIndex + 1 == posContainer.getWordTokenList().size()) {
					indexList.add(currentIndex - 1);
					indexList.add(currentIndex);
					indexMap.put(indexList.get(0), indexList);
				} else {

					previousTag = posContainer.getCombinedTagsList().get(currentIndex - 1)
							;
					nextTag = posContainer.getCombinedTagsList().get(currentIndex + 1);

					if (!(previousTag.startsWith("OSCAR-CM")
							& nextTag.startsWith("OSCAR-CM") & !posContainer.getWordTokenList()
							.get(currentIndex + 1).startsWith("-")) && !(nextTag.startsWith("CD") && previousTag.startsWith("NN"))) {
						if (totalIndexList.contains(currentIndex - 1)) {

							List<Integer> keySet = new ArrayList<Integer>(
									indexMap.keySet());
							indexList = new ArrayList<Integer>();
							indexList = indexMap
									.get(keySet.get(keySet.size() - 1));
							indexList.add(currentIndex);
							if (currentIndex + 1 < posContainer.getWordTokenList().size())
								indexList.add(currentIndex + 1);
							indexMap.put(indexList.get(0), indexList);

						} else if (nonHyphenTags.contains(previousTag
								.toLowerCase())) {
							indexList.add(currentIndex);
							indexList.add(currentIndex + 1);
							indexMap.put(indexList.get(0), indexList);

						} else if (nonHyphenTags
								.contains(nextTag.toLowerCase())) {

							indexList.add(currentIndex - 1);
							indexList.add(currentIndex);
							indexMap.put(indexList.get(0), indexList);
						} else {

							indexList.add(currentIndex - 1);
							indexList.add(currentIndex);
							indexList.add(currentIndex + 1);
							indexMap.put(indexList.get(0), indexList);

						}
					}
				}

			}

		}

		return combineTokens(posContainer, indexMap);

	}

	/*****************************************
	 * Combines the tokens based on the indices in indexMap.
	 * @param posContainer (POSContainer)
	 * @param indexMap (LinkedHashMap)
	*****************************************/
	private static POSContainer combineTokens(POSContainer posContainer, LinkedHashMap<Integer, List<Integer>> indexMap) {
		if (indexMap.size() > 0) {

			List<String> newWordTokenList = new ArrayList<String>();
			List<String> newCombinedTagsList = new ArrayList<String>();

			for (int i = 0; i < posContainer.getWordTokenList().size(); i++) {
				StringBuilder multiTokenWord = new StringBuilder();
				String tagName;

				if (!indexMap.keySet().contains(i)) {
					newWordTokenList.add(posContainer.getWordTokenList().get(i));
					newCombinedTagsList.add(posContainer.getCombinedTagsList().get(i));
				} else {
					List<Integer> indexList = indexMap.get(i);
					tagName = getTagName(posContainer,indexList);
					for (Integer integer : indexList) {
						multiTokenWord.append(posContainer.getWordTokenList().get(integer));
					}
					newWordTokenList.add(multiTokenWord.toString());
					newCombinedTagsList.add(tagName);
					i = i + indexList.size() - 1;
				}
			}
			posContainer.setWordTokenList(newWordTokenList);
			posContainer.setCombinedTagsList(newCombinedTagsList);
		}
        return posContainer;

	}

	/*****************************************
	 * Creates a new tagname for the combined tokens.
	 * Sets the tag to JJ-CHEM if one of the tags are an 
	 * adjective or verb in the past tense.
	 * @param posContainer (POSContainer)
	 * @param indexList (List<Integer>)
	*****************************************/
	private static String getTagName(POSContainer posContainer,List<Integer> indexList) {
		String tagName = "";

		List<String> jjChemList = Arrays.asList(new String[] { "jj", "vbn","jj-chem" });

		for (Integer integer : indexList) {
			String tag = posContainer.getCombinedTagsList().get(integer);
			if (!tagName.toLowerCase().startsWith("oscar") & tag.contains("-"))
				tagName = tag;

			if (tagName.equals("") & !tag.toLowerCase().equals("dash"))
				tagName = tag;
			if (jjChemList.contains(tag.toLowerCase()))
				tagName = "JJ-CHEM";

		}
		return tagName;
	}



}
