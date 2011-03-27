package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import nu.xom.Element;

import org.apache.commons.lang.StringUtils;

/********************************************
 * A container class that stores the 
 * grammatical structure of the text .
 * 
 * @author lh359
 ********************************************/
public class POSContainer {

	private final static String SPACE = " ";
	
	private String inputText;
	private boolean prioritiseOscar = true;

	private List<String> wordTokenList = new ArrayList<String>();
	private List<WWMMTag> oscarTagList = new ArrayList<WWMMTag>();
	private List<WWMMTag> regexTagList = new ArrayList<WWMMTag>();
	private List<WWMMTag> brownTagList = new ArrayList<WWMMTag>();
	private List<WWMMTag> combinedTagsList = new ArrayList<WWMMTag>();
	private Element spectrumElementList;

	/******************************
	 * Default constructor method.
	 ******************************/
	public POSContainer() {
	}
	
	
	/**************************************
	 * Setter method for InputText.
	 * @param inputText (String)
	 ***************************************/
	public void setInputText(String inputText) {

		this.inputText = inputText;
	}

	/**************************************
	 * Getter method for InputText.
	 * @return inputText (String)
	 **************************************/
	public String getInputText() {
		return inputText;
	}

	/**************************************
	 * Setter method for prioritiseOscar.
	 * @param prioritiseOscart (boolean)
	 ***************************************/
	public void setPrioritiseOscar(boolean prioritiseOscar) {
		this.prioritiseOscar = prioritiseOscar;
	}

	/**************************************
	 * Getter method for prioritiseOscar.
	 * @return prioritiseOscart (boolean)
	 ***************************************/
	public boolean getPrioritiseOscar() {
		return prioritiseOscar;
	}
	
	/**************************************
	 * Setter method for WordTokenList.
	 * @param wordTokenList (List<String>)
	 ***************************************/	
	public void setWordTokenList(List<String> wordTokenList) {
		this.wordTokenList = wordTokenList;
	}
	
	/**************************************
	 * Getter method for WordTokenList.
	 * @return wordTokenList (List<String>)
	 ***************************************/
	public List<String> getWordTokenList() {
		return wordTokenList;	
	}

	/**************************************
	 * Setter method for OscarTagList.
	 * @param oscarTagList (List<WWMMTag>)
	 ***************************************/
	public void setOscarTagList(List<WWMMTag> oscarTagList) {
		this.oscarTagList = oscarTagList;
	}
	
	/**************************************
	 * Getter method for OscarTagList.
	 * @return oscarTagList (List<WWMMTag>)
	 ***************************************/
	public List<WWMMTag> getOscarTagList() {
		return oscarTagList;
	}

	/**************************************
	 * Setter method for RegexTagList.
	 * @param regexTagList (List<WWMMTag>)
	 ***************************************/
	public void setRegexTagList(List<WWMMTag> regexTagList) {
		this.regexTagList = regexTagList;
	}

	/**************************************
	 * Getter method for RegexTagList.
	 * @return regexTagList (List<WWMMTag>)
	 ***************************************/
	public List<WWMMTag> getRegexTagList() {
		return regexTagList;
	}


	/**************************************
	 * Setter method for BrownTagList.
	 * @param brownTagList (List<WWMMTag>)
	 ***************************************/
	public void setBrownTagList(List<WWMMTag> brownTagList) {
		this.brownTagList = brownTagList;
	}

	/**************************************
	 * Getter method for BrownTagList.
	 * @return brownTagList (List<WWMMTag>)
	 ***************************************/
	public List<WWMMTag> getBrownTagList() {
		return brownTagList;
	}

	/**************************************
	 * Setter method for SpectrumList.
	 * @param spectrumList (List<Element>)
	 ***************************************/
	public void setSpectrumList(List<Element> spectrumList) {

		spectrumElementList = new Element("SpectrumList");
		for (Element element : spectrumList) {
			spectrumElementList.appendChild(element);
		}
	}

	/**************************************
	 * Getter method for SpectrumList.
	 * @return spectrumList (List<Element>)
	 ***************************************/
	public Element getSpectrumElementList() {
		return spectrumElementList;
	}
	
	/**************************************
	 * Setter method for CombinedTagsList.
	 * @param combinedTagsList (List<WWMMTag>)
	 ***************************************/
	public void setCombinedTagsList(List<WWMMTag> combinedTagsList) {
		this.combinedTagsList = combinedTagsList;
	}

	/**************************************
	 * Setter method for CombinedTagsList.
	 * @param combinedTagsList (List<WWMMTag>)
	 ***************************************/
	public List<WWMMTag> getCombinedTagsList() {
		return combinedTagsList;
	}

	/**************************************
	 * Adds token to wordTokenList.
	 * @param token (String)
	 ***************************************/
	public void addToTokenList(String token) {
		getWordTokenList().add(token);
	}

	/**************************************
	 * Creates a wordTokenList from a sentence string.
	 * @param sentence (String)
	 ***************************************/
	public void createWordTokenListFromSentence(String sentence) {
		for (String token : sentence.split(" ")) {
			getWordTokenList().add(token);
		}
	}

	/**************************************
	 * Adds tags to oscarTagList.
	 * @param oscarTag (String)
	 ***************************************/
	public void addToOSCARList(String oscarTag) {
		getOscarTagList().add(new WWMMTag("OSCAR-" + oscarTag));
	}


	/**************************************
	 * Adds tags to regexTagList.
	 * @param regexTag (String)
	 ***************************************/
	public void addToRegexTagList(String regexTag) {
		getRegexTagList().add(new WWMMTag(regexTag));

	}

	/**************************************
	 * Creates the brownTagList from the openNLP string Array format.
	 * @param brownTags (String[])
	 ***************************************/
	public void createBrownTagListFromStringArray(String[] brownTags) {
		for (String string : brownTags) {
			if (StringUtils.isEmpty(string)) {
				getBrownTagList().add(new WWMMTag("NN"));
			} else {
				getBrownTagList().add(new WWMMTag(string));
			}
		}
	}


	/***************************************
	 * Combines the output of all 3 taggers.
	 ***************************************/
	public void combineTaggers() {
		List<List<WWMMTag>> tagOrder = new ArrayList<List<WWMMTag>>();
		if (prioritiseOscar) {
			tagOrder.add(getOscarTagList());
			tagOrder.add(getRegexTagList());
		} else {
			tagOrder.add(getRegexTagList());
			tagOrder.add(getOscarTagList());
		}
		tagOrder.add(getBrownTagList());

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

		for (int i = 0; i < getWordTokenList().size(); i++) {
			if (StringUtils.isNotEmpty(combinedTagsList.get(i).POS)
					&& StringUtils.isNotEmpty(getWordTokenList().get(i))) {
				tokenTagTupleString.append(combinedTagsList.get(i).POS);
				tokenTagTupleString.append(SPACE);
				tokenTagTupleString.append(getWordTokenList().get(i));
				tokenTagTupleString.append(SPACE);
			}
		}

		return tokenTagTupleString.toString().trim();

	}

	

	/*********************************************
	 * Combines non-chemical hyphened tokens that have been split by OSCAR.
	 * Indexes the tokens that need combining and then calls combineTokens.
	 *********************************************/
	public void recombineHyphenedTokens() {
		String previousTag = "";
		String nextTag = "";
		List<Integer> totalIndexList = new ArrayList<Integer>();
		List<String> nonHyphenTags = Arrays.asList(new String[] { "dash",
				"comma", "cc", "stop" });
		List<Integer> indexList = new ArrayList<Integer>();
		LinkedHashMap<Integer, List<Integer>> indexMap = new LinkedHashMap<Integer, List<Integer>>();
		for (int currentIndex = 0; currentIndex < getWordTokenList().size(); currentIndex++) {
			if (indexList.size() > 0)
				totalIndexList.addAll(indexList);
			indexList = new ArrayList<Integer>();

			if (combinedTagsList.get(currentIndex).getPOS().toLowerCase()
					.equals("dash")) {
				if (currentIndex == 0
						&& currentIndex + 1 < getWordTokenList().size()) {
					indexList.add(currentIndex);
					indexList.add(currentIndex + 1);
					indexMap.put(indexList.get(0), indexList);
				} else if (currentIndex + 1 == getWordTokenList().size()) {
					indexList.add(currentIndex - 1);
					indexList.add(currentIndex);
					indexMap.put(indexList.get(0), indexList);
				} else {

					previousTag = combinedTagsList.get(currentIndex - 1)
							.getPOS();
					nextTag = combinedTagsList.get(currentIndex + 1).getPOS();

					if (!(previousTag.startsWith("OSCAR-CM")
							& nextTag.startsWith("OSCAR-CM") & !getWordTokenList()
							.get(currentIndex + 1).startsWith("-")) && !(nextTag.startsWith("CD") && previousTag.startsWith("NN"))) {
						if (totalIndexList.contains(currentIndex - 1)) {

							List<Integer> keySet = new ArrayList<Integer>(
									indexMap.keySet());
							indexList = new ArrayList<Integer>();
							indexList = indexMap
									.get(keySet.get(keySet.size() - 1));
							indexList.add(currentIndex);
							if (currentIndex + 1 < getWordTokenList().size())
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

	/*****************************************
	 * Combines the tokens based on the indices in indexMap.
	 * @param indexMap (LinkedHashMap)
	*****************************************/
	private void combineTokens(LinkedHashMap<Integer, List<Integer>> indexMap) {
		if (indexMap.size() > 0) {

			List<String> newWordTokenList = new ArrayList<String>();
			List<WWMMTag> newCombinedTagsList = new ArrayList<WWMMTag>();

			for (int i = 0; i < getWordTokenList().size(); i++) {
				StringBuilder multiTokenWord = new StringBuilder();
				String tagName;

				if (!indexMap.keySet().contains(i)) {
					newWordTokenList.add(getWordTokenList().get(i));
					newCombinedTagsList.add(combinedTagsList.get(i));
				} else {
					List<Integer> indexList = indexMap.get(i);
					tagName = getTagName(indexList);
					for (Integer integer : indexList) {
						multiTokenWord.append(getWordTokenList().get(integer));
					}
					newWordTokenList.add(multiTokenWord.toString());
					newCombinedTagsList.add(new WWMMTag(tagName));
					i = i + indexList.size() - 1;
				}
			}
			setWordTokenList(newWordTokenList);
			setCombinedTagsList(newCombinedTagsList);

		}

	}

	/*****************************************
	 * Creates a new tagname for the combined tokens.
	 * Sets the tag to JJ-CHEM if one of the tags are an 
	 * adjective or verb in the past tense.
	 * @param indexList (List<Integer>)
	*****************************************/
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
		return tagName;
	}



}
