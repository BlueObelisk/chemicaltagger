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
import java.util.List;

import org.apache.commons.lang.StringUtils;

import uk.ac.cam.ch.wwmm.oscar.Oscar;
import uk.ac.cam.ch.wwmm.oscar.document.Token;
import uk.ac.cam.ch.wwmm.oscar.document.TokenSequence;

public class OscarTokeniser implements ChemicalTaggerTokeniser {

	private Oscar oscar;

	/*********************
	 * Public Constructor method.
	 * @param oscar (Oscar)
	 */
	public OscarTokeniser(Oscar oscar) {
		this.oscar = oscar;
	}

	/*****************************************************
	 * Tokenises an inputText using OSCAR tokeniser. 
	 * Sets the tokens to POSContainer's wordTokenList and
	 * tokenSequenceList.
	 * @param posContainer (POSContainer)
	 * @return posContainer (POSContainer)
	 *****************************************************/
	public POSContainer tokenise(POSContainer posContainer) {
		List<String> wordTokenList = new ArrayList<String>();
		String sentence = posContainer.getInputText();
		// Oscar doesn't do normalisation just yet
		// sentence = oscar.normalise(sentence);

		List<TokenSequence>  tokSequenceList = oscar.tokenise(sentence);
		for (TokenSequence tokenSequence : tokSequenceList) {
			for (Token token : tokenSequence.getTokens()) {

				for (String subWord : token.getSurface().trim().split(" ")) {
					if (StringUtils.isNotEmpty(subWord)){
						wordTokenList.add(subWord);
					}
				}

			}
		}
		posContainer.setTokenSequenceList(tokSequenceList);
		posContainer.setWordTokenList(wordTokenList);
		return posContainer;
	}

}
