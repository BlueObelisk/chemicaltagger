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

import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import uk.ac.cam.ch.wwmm.oscar.document.Token;


/***********************************************
 * Tests the RegexTagger Class
 * @author lh359, dl387
 ***********************************************/

public class RegexTaggerTest {
    private RegexTagger regexTagger;

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
		Assert.assertEquals(ref, regexTaggedSentence);
	}

    @Test
    public void sentence2() { // lets make sure this does not take forever
        String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/regexTest/sentence2.txt");
        String regexTaggedSentence = regexTag(sentence);
        String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/regexTest/ref2.txt");
        Assert.assertEquals(ref, regexTaggedSentence);
    }

	private String regexTag(String sentence) {
		List<Token> tokens = new WhiteSpaceTokeniser().tokenise(sentence);
        List<String> regexTagList = regexTagger.runTagger(tokens, sentence);

        /****************************
         * Check that lengths of 
         * token and tags are the same
         ****************************/
        Assert.assertEquals(tokens.size(), regexTagList.size());

        /************************
         * Append the tokens recognised
         * by the regexTagger to regexTaggedSentence
         ***********************/
		StringBuilder regexTaggedSentence = new StringBuilder();
		for (int i = 0; i < regexTagList.size(); i++) {
			if (!regexTagList.get(i).equals("nil")){
				regexTaggedSentence.append(regexTagList.get(i));
				regexTaggedSentence.append(' ');
				regexTaggedSentence.append(tokens.get(i).getSurface());
				regexTaggedSentence.append(' ');
			}
		}

		return regexTaggedSentence.toString().trim();
	}


}
