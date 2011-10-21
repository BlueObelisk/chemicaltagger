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
import java.util.List;

import uk.ac.cam.ch.wwmm.oscar.Oscar;
import uk.ac.cam.ch.wwmm.oscar.document.NamedEntity;
import uk.ac.cam.ch.wwmm.oscar.document.Token;
import uk.ac.cam.ch.wwmm.oscar.document.TokenSequence;
import uk.ac.cam.ch.wwmm.oscarMEMM.MEMMRecogniser;

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
		MEMMRecogniser recogniser = new MEMMRecogniser();
		recogniser.setDeprioritiseOnts(true);
		recogniser.setCprPseudoConfidence(0);
		recogniser.setOntPseudoConfidence(0);
		oscar.setRecogniser(recogniser);
	}

	/***********************************************
	 * Runs OSCAR over a list of tokens and returns a list of tags
	 * @param tokenList (List<Token>)
	 * @return tagList (List<String>)
	 ***********************************************/
	public List<String> runTagger(List<Token> tokenList, String inputSentence) {
		List<TokenSequence> tokenSequences = Arrays.asList(generateOscarTokenSequence(tokenList, inputSentence));
		List<NamedEntity> neList = oscar.recogniseNamedEntities(tokenSequences);
        List<String> ignoreOscarList = Arrays.asList("cpr", "ont");
		List<String> tagList = new ArrayList<String>();
		String nilTag = "nil";
		for (int i = 0; i < tokenList.size(); i++) {
			tagList.add(nilTag);
		}
		for (NamedEntity ne : neList) {
			if (!ignoreOscarList.contains(ne.getType().getName().toLowerCase())) {
				List<Token> tokens = ne.getTokens();
                 
				for (Token token : tokens) {
					tagList.set(token.getIndex(), "OSCAR-"+ne.getType().getName());
				}
			}
		}
		return tagList;
	}

	public List<String> getIgnoredTags() {
		return null;
	}
	
	/*********************************************
	 * Generates an OSCAR TokenSequence from a list of tokens
	 * @param oscarTokens (List<Token>)
	 * @param inputText (String)
	 * @return tokenSequence (TokenSequence)
	 ********************************************/
	protected  TokenSequence generateOscarTokenSequence(List<Token> oscarTokens, String inputText) {
		TokenSequence tokSeq = new TokenSequence(inputText, 0, null, oscarTokens);
		for (Token token : tokSeq.getTokens()) {
			token.setTokenSequence(tokSeq);
		}
		return tokSeq;
	}
}
