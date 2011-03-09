package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import nu.xom.Element;

import org.apache.commons.lang.StringUtils;

import antlr.TokenWithIndex;

import uk.ac.cam.ch.wwmm.chemicaltagger.WWMMTag.TagType;

/********************************************
 * A container class that stores the grammatical structure of the text .
 * 
 * @author lh359
 ********************************************/
public class POSContainer {

	public List<String> wordTokenList = new ArrayList<String>();
	public List<WWMMTag> oscarTagList = new ArrayList<WWMMTag>();

	public void setOscarTagList(List<WWMMTag> oscarTagList) {
		this.oscarTagList = oscarTagList;
	}

	public List<WWMMTag> regexTagList = new ArrayList<WWMMTag>();
	public List<WWMMTag> brownTagList = new ArrayList<WWMMTag>();
	private List<WWMMTag> combinedTagsList = new ArrayList<WWMMTag>();
	private Element spectrumElementList;
	private boolean prioritiseOscar = true;

	public void setPrioritiseOscar(boolean prioritiseOscar) {
		this.prioritiseOscar = prioritiseOscar;
	}

	public Element getSpectrumElementList() {
		return spectrumElementList;
	}

	public void setSpectrumList(List<Element> spectraList) {

		spectrumElementList = new Element("SpectrumList");
		for (Element element : spectraList) {
			spectrumElementList.appendChild(element);
		}

	}

	private String inputText;
	// private final Logger LOG = Logger.getLogger(POSContainer.class);
	private static String SPACE = " ";

	public POSContainer() {
	}

	public void addToTokenList(String token) {
		wordTokenList.add(token);
	}

	public void addToTokenListFromSentenceString(String sentence) {
		for (String token : sentence.split(" ")) {
			wordTokenList.add(token);
		}

	}

	public List<String> getTokenList() {
		return wordTokenList;
	}

	public void addToOSCARList(String oscarTag) {

		oscarTagList.add(new WWMMTag("OSCAR-" + oscarTag));

	}

	public void addToOSCARList(String oscarTag, TagType type) {
		oscarTagList.add(new WWMMTag("OSCAR-" + oscarTag, type));
	}

	public void addToRegexList(String regexTag) {
		regexTagList.add(new WWMMTag(regexTag));

	}

	public void addToBrownListFromStringArray(String[] brownTags) {
		for (String string : brownTags) {
			if (StringUtils.isEmpty(string)) {
				brownTagList.add(new WWMMTag("NN"));
			} else {
				brownTagList.add(new WWMMTag(string));
			}
		}
	}

	public List<WWMMTag> getCombinedTagsList() {
		return combinedTagsList;
	}

	public void setCombinedTagsList(List<WWMMTag> newCombinedTagsList) {
		this.combinedTagsList = newCombinedTagsList;
	}

	/***************************************
	 * Combines the output of all 3 taggers.
	 ***************************************/
	public void combineTaggers() {
		List<List<WWMMTag>> tagOrder = new ArrayList<List<WWMMTag>>();
		if (prioritiseOscar) {
			tagOrder.add(oscarTagList);
			tagOrder.add(regexTagList);
		} else {
			tagOrder.add(regexTagList);
			tagOrder.add(oscarTagList);
		}
		tagOrder.add(brownTagList);

		List<WWMMTag> firstTagger = tagOrder.get(0);
		for (int i = 0; i < firstTagger.size(); i++) {
			if (!firstTagger.get(i).getPOS().toLowerCase().equals("nil")) {
				combinedTagsList.add(firstTagger.get(i));
			} else {
				for (int taggedIndex = 1; taggedIndex < tagOrder.size(); taggedIndex++) {
					List<WWMMTag> backOffTagger = tagOrder.get(taggedIndex);
					if (!backOffTagger.get(i).getPOS().equals("nil")) {
						combinedTagsList.add(backOffTagger.get(i));
						taggedIndex = tagOrder.size();
					}
				}
			}

		}

	}

	/*********************************************
	 * Gets the output of the string and tag as: "TAG TOKEN"
	 * 
	 * @return tokenTagTupleString (String).
	 *********************************************/
	public String getTokenTagTupleAsString() {
		StringBuilder tokenTagTupleString = new StringBuilder();

		for (int i = 0; i < wordTokenList.size(); i++) {
			if (StringUtils.isNotEmpty(combinedTagsList.get(i).POS)
					&& StringUtils.isNotEmpty(wordTokenList.get(i))) {
				tokenTagTupleString.append(combinedTagsList.get(i).POS);
				tokenTagTupleString.append(SPACE);
				tokenTagTupleString.append(wordTokenList.get(i));
				tokenTagTupleString.append(SPACE);
			}
		}

		return tokenTagTupleString.toString().trim();

	}

	public void printOutTags() {

		System.out.println("Token List is " + this.wordTokenList);
		for (int i = 0; i < wordTokenList.size(); i++) {
			System.out.println("WORD:" + wordTokenList.get(i));
			System.out.println("\t>>OSCAR TAG: " + oscarTagList.get(i).POS);
			System.out.println("\t>>REGEX TAG: " + regexTagList.get(i).POS);
			System.out.println("\t>>OPENNLP TAG: " + brownTagList.get(i).POS);
			System.out.println("\t>>COMBINED TAG: "
					+ combinedTagsList.get(i).POS);

		}

	}

	public void setTokenList(List<String> newTokenList) {
		this.wordTokenList = newTokenList;

	}

	public List<WWMMTag> getOscarList() {
		return this.oscarTagList;
	}

	public void recombineHyphenedTokens() {
		String previousTag = "";
		String nextTag = "";
		List<Integer> totalIndexList = new ArrayList<Integer>();
		List<String> nonHyphenTags = Arrays.asList(new String[] { "dash",
				"comma", "cc", "stop" });
		List<Integer> indexList = new ArrayList<Integer>();
		Map<Integer, List<Integer>> indexMap = new LinkedHashMap<Integer, List<Integer>>();
		for (int currentIndex = 0; currentIndex < wordTokenList.size(); currentIndex++) {
			if (indexList.size() > 0)
				totalIndexList.addAll(indexList);
			indexList = new ArrayList<Integer>();

			if (combinedTagsList.get(currentIndex).getPOS().toLowerCase()
					.equals("dash")) {
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

					previousTag = combinedTagsList.get(currentIndex - 1)
							.getPOS();
					nextTag = combinedTagsList.get(currentIndex + 1).getPOS();

					if (!(previousTag.startsWith("OSCAR-CM")
							& nextTag.startsWith("OSCAR-CM") & !wordTokenList
							.get(currentIndex + 1).startsWith("-")) && !(nextTag.startsWith("CD") && previousTag.startsWith("NN"))) {
						if (totalIndexList.contains(currentIndex - 1)) {

							List<Integer> keySet = new ArrayList<Integer>(
									indexMap.keySet());
							indexList = new ArrayList<Integer>();
							indexList = indexMap
									.get(keySet.get(keySet.size() - 1));
							indexList.add(currentIndex);
							if (currentIndex + 1 < wordTokenList.size())
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

		combineTokens(indexMap);

	}

	private void combineTokens(Map<Integer, List<Integer>> indexMap) {
		if (indexMap.size() > 0) {

			List<String> newWordTokenList = new ArrayList<String>();
			List<WWMMTag> newCombinedTagsList = new ArrayList<WWMMTag>();

			for (int i = 0; i < wordTokenList.size(); i++) {
				StringBuilder multiTokenWord = new StringBuilder();
				String tagName;

				if (!indexMap.keySet().contains(i)) {
					newWordTokenList.add(wordTokenList.get(i));
					newCombinedTagsList.add(combinedTagsList.get(i));
				} else {
					List<Integer> indexList = indexMap.get(i);
					tagName = getTagName(indexList);
					for (Integer integer : indexList) {
						multiTokenWord.append(wordTokenList.get(integer));
					}
					newWordTokenList.add(multiTokenWord.toString());
					newCombinedTagsList.add(new WWMMTag(tagName));
					i = i + indexList.size() - 1;
				}
			}
			setTokenList(newWordTokenList);
			setCombinedTagsList(newCombinedTagsList);

		}

	}

	private String getTagName(List<Integer> indexList) {
		String tagName = "";

		List<String> jjChemList = Arrays.asList(new String[] { "jj", "vbn" });

		for (Integer integer : indexList) {
			String tag = combinedTagsList.get(integer).getPOS();
			if (!tagName.toLowerCase().startsWith("oscar") & tag.contains("-"))
				tagName = tag;

			if (tagName.equals("") & !tag.toLowerCase().equals("dash"))
				tagName = tag;
			if (jjChemList.contains(tag.toLowerCase()))
				tagName = "JJ-CHEM";

		}
		// TODO Auto-generated method stub
		return tagName;
	}

	public void setInputText(String inputText) {

		this.inputText = inputText;
	}

	public String getInputText() {
		return inputText;
	}

}
