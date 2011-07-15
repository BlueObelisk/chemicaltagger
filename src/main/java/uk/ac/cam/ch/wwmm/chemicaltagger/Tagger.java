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

import java.util.List;


/*****************************************************
 * Runs the OpenNLP tagger .
 * 
 * @author lh359, dmj30,jat45
 *****************************************************/
public interface Tagger {
	

	
	/*****************************************************
	 * Runs the tagger against the text and stores the tags in
	 * POSContainer.
	 * @param inputSentence TODO
	 * @param posContainer (POSContainer)
	 * @return posContainer (POSContainer) 
	 *****************************************************/
	public List<String> runTagger(List<String> tokenList, String inputSentence);

	public List<String> getIgnoredTags() ;
}
