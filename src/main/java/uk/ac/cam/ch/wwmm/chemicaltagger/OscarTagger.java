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
	 * Runs OSCAR over a list of tokens.
	 * 
	 * @param posContainer  (POSContainer)
	 * @return posContainer (POSContainer)
	 ***********************************************/
	public List<String> runTagger(POSContainer posContainer) {

		List<NamedEntity> neList = oscar.recogniseNamedEntities(posContainer.getTokenSequenceList());
        List<String> ignoreOscarList = Arrays.asList("cpr");
		List<String> tokenList = posContainer.getWordTokenList();
		List<String> oscarList = new ArrayList<String>();
		String tag = "nil";
		for (int i = 0; i < tokenList.size(); i++) {
			oscarList.add(tag);
		}
		for (NamedEntity ne : neList) {
			if (!ignoreOscarList.contains(ne.getType().getName().toLowerCase())) {
				List<Token> tokens = ne.getTokens();
                 
				for (Token token : tokens) {
					if (tokenList.get(token.getIndex()).contains(token.getSurface())) {
						oscarList.set(token.getIndex(), "OSCAR-"+ne.getType().getName());
					}
				}
			}
		}
		posContainer.registerTagList(oscarList);
		return oscarList;
	}
	public List<String> getIgnoredTags() {
		return null;
	}
}
