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

import java.util.List;

import uk.ac.cam.ch.wwmm.oscar.document.Token;


/*****************************************************
 * An interface for a tagger.
 * The tagger given a list of tokens should return a tag for each token
 * 
 * @author lh359
 *****************************************************/
public interface Tagger {
	

	/*****************************************************
	 * Runs the tagger against the tokens and returns the tags as a list
	 * @param inputSentence
	 * @param tokenList (List<Token>)
	 * @return posContainer (POSContainer) 
	 *****************************************************/
	public List<String> runTagger(List<Token> tokenList, String inputSentence);

	public List<String> getIgnoredTags() ;
}
