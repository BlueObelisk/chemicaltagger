/**
 * Copyright 2012 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
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
import java.util.List;

import nu.xom.Element;

import org.apache.commons.lang3.StringUtils;

import uk.ac.cam.ch.wwmm.oscar.document.Token;

/********************************************
 * A container class that stores the grammatical structure of the text .
 * 
 * @author lh359
 ********************************************/
public class POSContainer {

	private static String SPACE = " ";

	private String inputText;
	private boolean prioritiseOscar = true;
	private List<Token> wordTokenList = new ArrayList<Token>();
	private List<String> combinedTagsList = new ArrayList<String>();
	private List<List<String>> tagListContainer = new ArrayList<List<String>>();
	public List<List<String>> getTagListContainer() {
		return tagListContainer;
	}

	private Element spectrumElementList;

	/******************************
	 * Default constructor method.
	 ******************************/
	public POSContainer() {
	}

	/**************************************
	 * Setter method for InputText.
	 * 
	 * @param inputText (String)
	 ***************************************/
	public void setInputText(String inputText) {

		this.inputText = inputText;
	}

	/**************************************
	 * Getter method for InputText.
	 * 
	 * @return inputText (String)
	 **************************************/
	public String getInputText() {
		return inputText;
	}

	/**************************************
	 * Setter method for prioritiseOscar.
	 * 
	 * @param prioritiseOscar (boolean)
	 ***************************************/
	public void setPrioritiseOscar(boolean prioritiseOscar) {
		this.prioritiseOscar = prioritiseOscar;
	}

	/**************************************
	 * Getter method for prioritiseOscar.
	 * 
	 * @return prioritiseOscart (boolean)
	 ***************************************/
	public boolean getPrioritiseOscar() {
		return prioritiseOscar;
	}

	/**************************************
	 * Setter method for WordTokenList.
	 * 
	 * @param wordTokenList (List<Token>)
	 ***************************************/
	public void setWordTokenList(List<Token> wordTokenList) {
		this.wordTokenList = wordTokenList;
	}

	/**************************************
	 * Getter method for WordTokenList.
	 * 
	 * @return wordTokenList (List<Token>)
	 ***************************************/
	public List<Token> getWordTokenList() {
		return wordTokenList;
	}

	/**************************************
	 * Setter method for SpectrumList.
	 * 
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
	 * 
	 * @return spectrumList (List<Element>)
	 ***************************************/
	public Element getSpectrumElementList() {
		return spectrumElementList;
	}

	/**************************************
	 * Setter method for CombinedTagsList.
	 * 
	 * @param combinedTagsList (List<String>)
	 ***************************************/
	public void setCombinedTagsList(List<String> combinedTagsList) {
		this.combinedTagsList = combinedTagsList;
	}

	/**************************************
	 * Getter method for CombinedTagsList.
	 * 
	 * @return combinedTagsList (List<String>)
	 ***************************************/
	public List<String> getCombinedTagsList() {
		return combinedTagsList;
	}

	/**************************************
	 * Adds token to wordTokenList.
	 * 
	 * @param token (Token)
	 ***************************************/
	public void addToTokenList(Token token) {
		wordTokenList.add(token);
	}

	/***************************************
	 * Combines the output of all the taggers.
	 ***************************************/
	public void combineTaggers() {
		int size = tagListContainer.get(0).size();
		for (int i = 0; i < size; i++) {
			for (List<String> tagList : tagListContainer) {
				if (tagList.get(i).equals("nil")) {
					continue;
				}
				else {
					combinedTagsList.add(tagList.get(i));
					break;
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
					&& StringUtils.isNotEmpty(wordTokenList.get(i).getSurface())) {
				tokenTagTupleString.append(combinedTagsList.get(i));
				tokenTagTupleString.append(SPACE);
				tokenTagTupleString.append(wordTokenList.get(i).getSurface());
				tokenTagTupleString.append(SPACE);
			}
		}
		return tokenTagTupleString.toString().trim();
	}

	/********************************************
	 * Adds tagLists to the tagListContainer
	 * @param tagList
	 */
	public void registerTagList(List<String> tagList) {
		tagListContainer.add(tagList);
		
	}

}
