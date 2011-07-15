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

import java.util.Arrays;
import java.util.List;

/****************************************
 * A whitespace tokeniser to be used as a 
 * substitute to the OSCAR tokeniser.
 * Can be converted into OSCAR tokens.
 * @author lh359
 *
 *****************************************/
public class WhiteSpaceTokeniser implements ChemicalTaggerTokeniser {
	
	
	/*****************************
	 * Default constructor method.
	 ***************************/
	public WhiteSpaceTokeniser(){
		
	}

	/********************************************
	 * Tokenises a String on white space.
	 * @param  inputSentence (String)
	 * @return List<String>
	 *****************************************/
	public List<String> tokenise(String inputSentence){
		return Arrays.asList(inputSentence.split("\\s+"));
	}

}
