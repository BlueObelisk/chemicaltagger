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
import org.junit.Assert;

import org.junit.Test;

/************************************
 * Tests the WhiteSpaceTokeniser Class.
 * @author lh359
 ************************************/
public class WhiteSpaceTokeniserTest {

	@Test
	public void testWhiteSpaceTokenisation() {
		String sentence = "It was at Mt. xyz station (44\u00b011' N-10\u00b042' E) .";
		String spaceDelimitedTokens = Utils.tokensToSpaceDelimitedStr(new WhiteSpaceTokeniser().tokenise(sentence));
        Assert.assertEquals("WhiteSpace Tokenisation result", sentence, spaceDelimitedTokens);
	}
	
	@Test
	public void testWhiteSpaceTokenisationWithChemicals() {
		String sentence = "Water samples were collected from Mt. xyz .";
		String spaceDelimitedTokens = Utils.tokensToSpaceDelimitedStr(new WhiteSpaceTokeniser().tokenise(sentence));
        Assert.assertEquals("WhiteSpace Tokenisation result", sentence, spaceDelimitedTokens);
	}


}
