package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.List;

import nu.xom.Element;

import org.apache.commons.lang.StringUtils;

import uk.ac.cam.ch.wwmm.oscar.document.TokenSequence;

/********************************************
 * A container class that stores the 
 * grammatical structure of the text .
 * 
 * @author lh359
 ********************************************/
public class POSContainer {

	private static String SPACE = " ";
	
	private String inputText;
	private boolean prioritiseOscar = true;

	private List<String> wordTokenList = new ArrayList<String>();
	private List<String> oscarTagList = new ArrayList<String>();
	private List<String> regexTagList = new ArrayList<String>();
	private List<String> brownTagList = new ArrayList<String>();
	private List<String> combinedTagsList = new ArrayList<String>();
	private Element spectrumElementList;
	private List<TokenSequence> tokenSequenceList;

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
	 * @param prioritiseOscar (boolean)
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
	 * Setter method for TokenSequenceList.
	 * @param tokenSequenceList (List<TokenSequence>)
	 ***************************************/	
	public void setTokenSequenceList(List<TokenSequence> tokenSequenceList) {
		this.tokenSequenceList = tokenSequenceList;
		
	}

	/**************************************
	 * Getter method for TokenSequenceList.
	 * @return tokenSequenceList (List<TokenSequence>)
	 ***************************************/
	public List<TokenSequence> getTokenSequenceList() {
		return tokenSequenceList;
	}
	/**************************************
	 * Setter method for OscarTagList.
	 * @param oscarTagList (List<String>)
	 ***************************************/
	public void setOscarTagList(List<String> oscarTagList) {
		this.oscarTagList = oscarTagList;
	}
	
	/**************************************
	 * Getter method for OscarTagList.
	 * @return oscarTagList (List<String>)
	 ***************************************/
	public List<String> getOscarTagList() {
		return oscarTagList;
	}

	/**************************************
	 * Setter method for RegexTagList.
	 * @param regexTagList (List<String>)
	 ***************************************/
	public void setRegexTagList(List<String> regexTagList) {
		this.regexTagList = regexTagList;
	}

	/**************************************
	 * Getter method for RegexTagList.
	 * @return regexTagList (List<String>)
	 ***************************************/
	public List<String> getRegexTagList() {
		return regexTagList;
	}


	/**************************************
	 * Setter method for BrownTagList.
	 * @param brownTagList (List<String>)
	 ***************************************/
	public void setBrownTagList(List<String> brownTagList) {
		this.brownTagList = brownTagList;
	}

	/**************************************
	 * Getter method for BrownTagList.
	 * @return brownTagList (List<String>)
	 ***************************************/
	public List<String> getBrownTagList() {
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
	 * @param combinedTagsList (List<String>)
	 ***************************************/
	public void setCombinedTagsList(List<String> combinedTagsList) {
		this.combinedTagsList = combinedTagsList;
	}

	/**************************************
	 * Getter method for CombinedTagsList.
	 * @return combinedTagsList (List<String>)
	 ***************************************/
	public List<String> getCombinedTagsList() {
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
		getOscarTagList().add("OSCAR-" + oscarTag);
	}


	/**************************************
	 * Adds tags to regexTagList.
	 * @param regexTag (String)
	 ***************************************/
	public void addToRegexTagList(String regexTag) {
		getRegexTagList().add(regexTag);

	}

	/**************************************
	 * Creates the brownTagList from the openNLP string Array format.
	 * @param brownTags (String[])
	 ***************************************/
	public void createBrownTagListFromStringArray(String[] brownTags) {
		for (String string : brownTags) {
			if (StringUtils.isEmpty(string)) {
				getBrownTagList().add("NN");
			} else {
				getBrownTagList().add(string);
			}
		}
	}


	/***************************************
	 * Combines the output of all 3 taggers.
	 ***************************************/
	public void combineTaggers() {
		List<List<String>> tagOrder = new ArrayList<List<String>>();
		if (prioritiseOscar) {
			tagOrder.add(getOscarTagList());
			tagOrder.add(getRegexTagList());
		} else {
			tagOrder.add(getRegexTagList());
			tagOrder.add(getOscarTagList());
		}
		tagOrder.add(getBrownTagList());

		List<String> firstTagger = tagOrder.get(0);
		for (int i = 0; i < firstTagger.size(); i++) {
			if (!firstTagger.get(i).toLowerCase().equals("nil")) {
				combinedTagsList.add(firstTagger.get(i));
			} else {
				for (int taggedIndex = 1; taggedIndex < tagOrder.size(); taggedIndex++) {
					List<String> backOffTagger = tagOrder.get(taggedIndex);
					if (!backOffTagger.get(i).equals("nil")) {
						combinedTagsList.add(backOffTagger.get(i));
						taggedIndex = tagOrder.size();
					}
				}
			}

		}

	}

	/*********************************************
	 * Gets the output of the string and tag as: "TAG TOKEN".
	 * 
	 * @return tokenTagTupleString (String).
	 *********************************************/
	public String getTokenTagTupleAsString() {
		StringBuilder tokenTagTupleString = new StringBuilder();

		for (int i = 0; i < getWordTokenList().size(); i++) {
			if (StringUtils.isNotEmpty(combinedTagsList.get(i))
					&& StringUtils.isNotEmpty(getWordTokenList().get(i))) {
				tokenTagTupleString.append(combinedTagsList.get(i));
				tokenTagTupleString.append(SPACE);
				tokenTagTupleString.append(getWordTokenList().get(i));
				tokenTagTupleString.append(SPACE);
			}
		}

		return tokenTagTupleString.toString().trim();

	}

}
