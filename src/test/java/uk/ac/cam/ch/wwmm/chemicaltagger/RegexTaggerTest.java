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

import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/***********************************************
 * Tests the RegexTagger Class
 * @author lh359, dl387
 ***********************************************/

public class RegexTaggerTest {
	
	
    private RegexTagger regexTagger;
	private final static String SPACE = " ";
	@Before
	public void setUp() {
		if (regexTagger == null) {
			regexTagger = new RegexTagger();
		}
	}
	
	@Test
	public void sentence1() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/regexTest/sentence1.txt");
        String regexTaggedSentence = regexTag(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/regexTest/ref1.txt");
		Assert.assertEquals(ref,regexTaggedSentence);


	}
	
	private String regexTag(String sentence) {
		StringBuilder regexTaggedSentence = new StringBuilder(); 
        String cleanSentence = Formatter.normaliseText(sentence);
        POSContainer posContainer = new POSContainer();
        posContainer.setWordTokenList(new WhiteSpaceTokeniser().tokenise(cleanSentence));
        posContainer.registerTagList(regexTagger.runTagger(posContainer.getWordTokenList(), null));
        
        List<String> regexTagList = posContainer.getTagListContainer().get(0);
		
        /****************************
         * Check that lengths of 
         * token and tags are the same
         ****************************/
        Assert.assertEquals(posContainer.getWordTokenList().size(), regexTagList.size());
        
        /************************
         * Append the tokens recoginesed
         * by the regexTagger to regexTaggedSentence
         ***********************/
       for (int i = 0; i < regexTagList.size(); i++) {
			
			if (!regexTagList.get(i).equals("nil")){
				regexTaggedSentence.append(regexTagList.get(i));
				regexTaggedSentence.append(SPACE);
				regexTaggedSentence.append(posContainer.getWordTokenList().get(i).getSurface());
				regexTaggedSentence.append(SPACE);

			}
			
		}
        
		return regexTaggedSentence.toString().trim();
	}


}
