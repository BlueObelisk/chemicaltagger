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
	private List<String> posTagList = new ArrayList<String>();
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
	 * Setter method for posTagList.
	 * @param posTagList (List<String>)
	 ***************************************/
	public void setPosTagList(List<String> posTagList) {
		this.posTagList = posTagList;
	}

	/**************************************
	 * Getter method for posTagList.
	 * @return posTagList (List<String>)
	 ***************************************/
	public List<String> getPosTagList() {
		return posTagList;
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
		wordTokenList.add(token);
	}

	/**************************************
	 * Creates a wordTokenList from a sentence string.
	 * @param sentence (String)
	 ***************************************/
	public void createWordTokenListFromSentence(String sentence) {
		for (String token : sentence.split(" ")) {
			wordTokenList.add(token);
		}
	}

	/**************************************
	 * Adds tags to oscarTagList.
	 * @param oscarTag (String)
	 ***************************************/
	public void addToOSCARList(String oscarTag) {
		oscarTagList.add("OSCAR-" + oscarTag);
	}


	/**************************************
	 * Adds tags to regexTagList.
	 * @param regexTag (String)
	 ***************************************/
	public void addToRegexTagList(String regexTag) {
		regexTagList.add(regexTag);

	}

	/**************************************
	 * Creates the posTagList from the openNLP string Array format.
	 * @param posTags (String[])
	 ***************************************/
	public void createPosTagListFromStringArray(String[] posTags) {
		for (String posTag : posTags) {
			if (StringUtils.isEmpty(posTag)) {
				posTagList.add("NN");
			} 
			else if (posTag.equals(".")){
				posTagList.add("STOP");
			}
			else if (posTag.equals(",")){
				posTagList.add("COMMA");
			}
			else if (posTag.equals(":")){
				posTagList.add("COLON");
			}
			else{
				posTagList.add(posTag);
			}
		}
	}


	/***************************************
	 * Combines the output of all 3 taggers.
	 ***************************************/
	public void combineTaggers() {
		List<List<String>> tagOrder = new ArrayList<List<String>>();
		if (prioritiseOscar) {
			tagOrder.add(oscarTagList);
			tagOrder.add(regexTagList);
		} else {
			tagOrder.add(regexTagList);
			tagOrder.add(oscarTagList);
		}
		tagOrder.add(posTagList);

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

		for (int i = 0; i < wordTokenList.size(); i++) {
			if (StringUtils.isNotEmpty(combinedTagsList.get(i))
					&& StringUtils.isNotEmpty(wordTokenList.get(i))) {
				tokenTagTupleString.append(combinedTagsList.get(i));
				tokenTagTupleString.append(SPACE);
				tokenTagTupleString.append(wordTokenList.get(i));
				tokenTagTupleString.append(SPACE);
			}
		}

		return tokenTagTupleString.toString().trim();

	}

}
