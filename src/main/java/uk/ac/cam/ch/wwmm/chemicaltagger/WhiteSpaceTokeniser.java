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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import uk.ac.cam.ch.wwmm.oscar.document.Token;
import uk.ac.cam.ch.wwmm.oscar.types.BioTag;
import uk.ac.cam.ch.wwmm.oscar.types.BioType;

/****************************************
 * A whitespace tokeniser to be used as a 
 * substitute to the OSCAR tokeniser.
 * @author lh359
 * @author dl387
 *
 *****************************************/
public class WhiteSpaceTokeniser implements ChemicalTaggerTokeniser {
	
	private static Pattern tokenPattern = Pattern.compile("\\S+");
	
	/*****************************
	 * Default constructor method.
	 ***************************/
	public WhiteSpaceTokeniser(){
		
	}

	/********************************************
	 * Tokenises a String on white space.
	 * @param  inputSentence (String)
	 * @return List<Token>
	 *****************************************/
	public List<Token> tokenise(String inputSentence){
		List<Token> tokens = new ArrayList<Token>();
		Matcher m = tokenPattern.matcher(inputSentence);
		int tokenIndex = 0;
		while (m.find()) {
			int start = m.start();
			int end = m.end();
			String value = m.group();
			Token t = new Token(value, start, end, null, new BioType(BioTag.O), null);
			t.setIndex(tokenIndex++);
			tokens.add(t);
		}
		return tokens;
	}

}
