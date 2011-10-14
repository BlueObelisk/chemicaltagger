/**
 * Copyright 2011 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import uk.ac.cam.ch.wwmm.oscar.document.Token;

/******************************************
 * Combines tokens that have been erroneously split by OSCAR.
 * @author lh359
 *******************************************/
public class RecombineTokens {
	
	/****************************
	 * Hides Utility Class Constructor.
	 ***************************/
	private RecombineTokens(){
		
	}

	/*********************************************
	 * Indexes the tokens that need combining and then calls combineTokens.
	 * @param posContainer (POSContainer) .
	 * @return posContainer (POSContainer) .
	 *********************************************/
	public static POSContainer recombineTokens(POSContainer posContainer) {
		List<Integer> totalIndexList = new ArrayList<Integer>();
		List<String> nonHyphenTags = Arrays.asList(new String[] { "dash",
				"comma", "cc", "stop" });
		List<Integer> indexList = new ArrayList<Integer>();
		List<Token> wordTokenList = posContainer.getWordTokenList();
		List<String> combinedTagList = posContainer.getCombinedTagsList();
		LinkedHashMap<Integer, List<Integer>> indexMap = new LinkedHashMap<Integer, List<Integer>>();
		for (int currentIndex = 0; currentIndex < wordTokenList.size(); currentIndex++) {
			if (indexList.size() > 0){
				totalIndexList.addAll(indexList);
			}	
			indexList = new ArrayList<Integer>();

			String currentTagLc = combinedTagList.get(currentIndex).toLowerCase();
			if (currentTagLc.equals("dash")) {
				if (currentIndex == 0
						&& currentIndex + 1 < wordTokenList.size()) {
					indexList.add(currentIndex);
					indexList.add(currentIndex + 1);
					indexMap.put(indexList.get(0), indexList);
				} else if (currentIndex + 1 == wordTokenList.size()) {
					indexList.add(currentIndex - 1);
					indexList.add(currentIndex);
					indexMap.put(indexList.get(0), indexList);
				} else {

					String previousTag = combinedTagList.get(currentIndex - 1);
					String nextTag = combinedTagList.get(currentIndex + 1);

					if (!(previousTag.startsWith("OSCAR-CM")
							&& nextTag.startsWith("OSCAR-CM") && !wordTokenList.get(currentIndex + 1).getSurface().startsWith("-")) 
							&& !(nextTag.startsWith("CD") && previousTag.startsWith("NN")) &&  !isAHyphenedUnit(previousTag,nextTag)) {
						
						if (totalIndexList.contains(currentIndex - 1)) {

							List<Integer> keySet = new ArrayList<Integer>(
									indexMap.keySet());
							indexList = new ArrayList<Integer>();
							indexList = indexMap
									.get(keySet.get(keySet.size() - 1));
							indexList.add(currentIndex);
							if (currentIndex + 1 < wordTokenList.size()){
								indexList.add(currentIndex + 1);
							}	
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
					else if (wordTokenList.get(currentIndex).getSurface().equals("/")
							&& previousTag.equals("NN-AMOUNT") && nextTag.equals("NN-VOL")){
						indexList.add(currentIndex - 1);
						indexList.add(currentIndex);
						indexList.add(currentIndex + 1);
						indexMap.put(indexList.get(0), indexList);
						combinedTagList.set(currentIndex - 1, "NN-MOLAR");
						combinedTagList.set(currentIndex + 1, "NN-MOLAR");
					}
				}
			}
			else if (currentTagLc.equals("nn-temp")) {//Identifies cases such as "50C . was" and corrects them to "50C. was"
				if (wordTokenList.get(currentIndex).getSurface().toLowerCase().endsWith("c") && currentIndex >0 && currentIndex + 2 < wordTokenList.size()){
					String nextTag = combinedTagList.get(currentIndex + 1);
					if (nextTag.equalsIgnoreCase("stop")){
						String previousWord = wordTokenList.get(currentIndex - 1).getSurface();
						if (Character.isDigit(previousWord.charAt(previousWord.length()-1))){
							String wordAfterStop = wordTokenList.get(currentIndex + 2).getSurface();
							//if appears to be the start of a new sentence
							if (!Character.isUpperCase(wordAfterStop.charAt(0)) && !Character.isDigit(wordAfterStop.charAt(0))){
								indexList = new ArrayList<Integer>();
								indexList.add(currentIndex);
								indexList.add(currentIndex + 1);
								indexMap.put(indexList.get(0), indexList);
							}
						}
					}
				}
			}
			else if (currentTagLc.equals("nn-time")) {//Identifies cases such as "min . and" and corrects them to "min. and"
				if (wordTokenList.get(currentIndex).getSurface().equalsIgnoreCase("min") && currentIndex >0 && currentIndex + 2 < wordTokenList.size()){
					String nextTag = combinedTagList.get(currentIndex + 1);
					if (nextTag.equalsIgnoreCase("stop")){
						String wordAfterStop = wordTokenList.get(currentIndex + 2).getSurface();
						if (!Character.isUpperCase(wordAfterStop.charAt(0))){
							indexList = new ArrayList<Integer>();
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

	/***********************************
	 * Checks if both tags are units separated by slashes
	 * @param previousTag
	 * @param nextTag
	 * @return boolean
	 */
	private static boolean isAHyphenedUnit(String previousTag, String nextTag) {
		List<String> quantityUnits = Arrays.asList("nn-vol", "nn-area", "nn-perarea", "nn-pressure","nn-parts", "nn-moles", "nn-persecond", "nn-timeunit", "nn-mass", "nn-pertimeunit","nn-vol","nn-amount","nn-units" );
		
		if (quantityUnits.contains(previousTag.toLowerCase()) && quantityUnits.contains(nextTag.toLowerCase()))
			return true;
		else
		return false;
	}

	/*****************************************
	 * Combines the tokens based on the indices in indexMap.
	 * @param posContainer (POSContainer)
	 * @param indexMap (LinkedHashMap)
	 * @return posContainer (POSContainer)
	*****************************************/
	private static POSContainer combineTokens(POSContainer posContainer, LinkedHashMap<Integer, List<Integer>> indexMap) {
		if (indexMap.size() > 0) {

			List<Token> newWordTokenList = new ArrayList<Token>();
			List<String> newCombinedTagsList = new ArrayList<String>();

			int tokenIndex = 0;
			for (int i = 0; i < posContainer.getWordTokenList().size(); i++) {
				Token newToken;
				if (!indexMap.keySet().contains(i)) {
					newToken = posContainer.getWordTokenList().get(i);
					newCombinedTagsList.add(posContainer.getCombinedTagsList().get(i));
				} else {
					List<Integer> indexList = indexMap.get(i);
					String tagName = getTagName(posContainer,indexList);
					StringBuilder multiTokenWord = new StringBuilder();
					for (Integer integer : indexList) {
						multiTokenWord.append(posContainer.getWordTokenList().get(integer).getSurface());
					}
					int start = posContainer.getWordTokenList().get(indexList.get(0)).getStart();
					int end = posContainer.getWordTokenList().get(indexList.get(indexList.size()-1)).getEnd();
					newToken = new Token(multiTokenWord.toString(), start, end, null, posContainer.getWordTokenList().get(indexList.get(indexList.size()-1)).getBioType(), null);
					newCombinedTagsList.add(tagName);
					i = i + indexList.size() - 1;
				}
				newToken.setIndex(tokenIndex++);
				newWordTokenList.add(newToken);
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
	 * @return tagName (String)
	*****************************************/
	private static String getTagName(POSContainer posContainer,List<Integer> indexList) {
		String tagName = "";
		List<String> jjChemList = Arrays.asList(new String[] { "jj", "vbn","jj-chem" });
		for (Integer integer : indexList) {
			String tag = posContainer.getCombinedTagsList().get(integer);
			if (!tagName.toLowerCase().startsWith("oscar") & tag.contains("-")){
				tagName = tag;
			}
			if (tagName.equals("") & !tag.toLowerCase().equals("dash")){
				tagName = tag;
			}
			if (jjChemList.contains(tag.toLowerCase())){
				tagName = "JJ-CHEM";
			}
		}
		return tagName;
	}



}
