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
import java.util.LinkedList;
import java.util.List;

import uk.ac.cam.ch.wwmm.oscar.Oscar;
import uk.ac.cam.ch.wwmm.oscar.document.NamedEntity;
import uk.ac.cam.ch.wwmm.oscar.document.Token;
import uk.ac.cam.ch.wwmm.oscar.document.TokenSequence;

/*****************************************************
 * Runs the OSCAR tagger .
 * 
 * @author lh359, dmj30
 *****************************************************/

public class OscarTagger implements Tagger {

	protected Oscar oscar;

	/*****************************
	 * Default constructor method.
	 * @param oscar (Oscar)
	 ***************************/
	public OscarTagger(Oscar oscar) {
		this.oscar = oscar;
	}

	/***********************************************
	 * Runs OSCAR over a list of tokens and returns a list of tags
	 * @param tokenList (List<String>)
	 * @return tagList (List<String>)
	 ***********************************************/
	public List<String> runTagger(List<String> tokenList, String inputSentence) {

		List<TokenSequence> tokenSequenceList = convertToOscarTokenSequences(tokenList, inputSentence);
		List<NamedEntity> neList = oscar.recogniseNamedEntities(tokenSequenceList);
        List<String> ignoreOscarList = Arrays.asList("cpr");
		List<String> tagList = new ArrayList<String>();
		String tag = "nil";
		for (int i = 0; i < tokenList.size(); i++) {
			tagList.add(tag);
		}
		for (NamedEntity ne : neList) {
			if (!ignoreOscarList.contains(ne.getType().getName().toLowerCase())) {
				List<Token> tokens = ne.getTokens();
                 
				for (Token token : tokens) {
					if (tokenList.get(token.getIndex()).contains(token.getSurface())) {
						tagList.set(token.getIndex(), "OSCAR-"+ne.getType().getName());
					}
				}
			}
		}
		return tagList;
	}
	public List<String> getIgnoredTags() {
		return null;
	}
	
	/*********************************************
	 * Converts a list of words into a list of Oscar TokenSequences.
	 * @param wordTokenList (List<String>)
	 * @param inputText (String)
	 * @return tokenSequenceList (List<TokenSequence>)
	 ********************************************/
	protected  List<TokenSequence> convertToOscarTokenSequences(List<String> wordTokenList, String inputText) {
		List<Token> oscarTokens = convertWordlistToOscarTokens(wordTokenList,inputText);
		List<TokenSequence> tokenSequenceList = makeTokenSequences(inputText, oscarTokens);
		return tokenSequenceList;
	}

	/*************************************************
	 * Converts a list of words into a list of Oscar Tokens.
	 * @param wordTokenList (List<String>)
	 * @param inputSentence 
	 * @return oscarTokens (List<Token>)
	 ***********************************************/
	private List<Token> convertWordlistToOscarTokens(List<String> wordTokenList, String inputSentence) {

		int index = 0;
		List<Token> oscarTokens = new LinkedList<Token>();
		String subSentence = inputSentence;
		int endIndex = 0;
		int startIndex = 0;
		int offSet = 0;
		boolean endFlag = true;

		for (String word : wordTokenList)  {
			startIndex = subSentence.indexOf(word);
			offSet = offSet + endIndex;
			endIndex = startIndex + word.length();
			Token oscarToken = new Token(word, startIndex+ offSet, endIndex+ offSet, null, null, null);
			oscarToken.setIndex(index);
			oscarTokens.add(oscarToken);
			subSentence = subSentence.substring(endIndex);
			index++;
			
			if (word.equals(".") & !endFlag) {
				index = 0;
				endFlag = true;
			}
		}
		return oscarTokens;
	}

    /***************************************************
     * Creates a list of tokenSequences from the Oscar tokens. 
     * @param surfaceText (String)
     * @param oscarTokens (List<IToken>)
     * @return tokSequenceList (List<TokenSequence>)
     *****************************************************/
	private List<TokenSequence> makeTokenSequences(String surfaceText,	List<Token> oscarTokens) {

		TokenSequence tokSeq = new TokenSequence(surfaceText, 0, null, oscarTokens);
		List<TokenSequence> tokSequenceList = new ArrayList<TokenSequence>();
		tokSequenceList.add(tokSeq);
		tokSequenceList = postProcess(tokSequenceList);

		return tokSequenceList;
	}
	
	/***************************************************
     * PostProcessing the tokenSequenceList by adding tokenSequences to each token within the tokenList.
     * The TokenSequences are used by the Oscar Tokens for lookahead.
     * @param  tokSequenceList    (List<TokenSequence>)
     * @return newTokSequenceList (List<TokenSequence>)
     *****************************************************/
	private List<TokenSequence> postProcess(List<TokenSequence> tokSequenceList) {
		List<TokenSequence> newTokSequenceList = new ArrayList<TokenSequence>();
		for (TokenSequence tokenSequence : tokSequenceList) {
			for (Token token : tokenSequence.getTokens()) {
				token.setTokenSequence(tokenSequence);
			}
			TokenSequence newTokenSequence = new TokenSequence(
					tokenSequence.getSurface(), tokenSequence.getOffset(),
					tokenSequence.getDoc(), tokenSequence.getTokens());
			newTokSequenceList.add(newTokenSequence);
		}
		return newTokSequenceList;
	}

}
