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

import static org.junit.Assert.assertEquals;
import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import java.util.List;

import org.junit.Test;

import uk.ac.cam.ch.wwmm.oscar.document.Token;

/***********************************************
 * Tests the Formatter Class
 * @author lh359
 ***********************************************/

public class FormatterTest {

	@Test	
	public void testNormaliseSentence() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/formatTest/sentence1.txt");
        String cleanSentence = Formatter.normaliseText(Utils.cleanHTMLText(sentence));
        List<Token> tokens = new OscarTokeniser().tokenise(cleanSentence);
        tokens = Formatter.subTokeniseTokens(tokens);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/formatTest/ref1.txt");
		assertEquals(ref, Utils.tokensToSpaceDelimitedStr(tokens));
	}

	@Test	
	public void testCelciusTokenisation1() {
		List<Token> tokens = new OscarTokeniser().tokenise("100 \u00b0C.,");
		tokens = Formatter.subTokeniseTokens(tokens);
		assertEquals("100 \u00b0C . ,",  Utils.tokensToSpaceDelimitedStr(tokens));
	}
	
	@Test	
	public void testCelciusTokenisation2() {
		List<Token> tokens = new OscarTokeniser().tokenise("235-238\u00b0C.)");
		tokens = Formatter.subTokeniseTokens(tokens);
		assertEquals("235-238 \u00b0C . )",  Utils.tokensToSpaceDelimitedStr(tokens));
	}
	
	@Test	
	public void testHyphenNormalisation() {
		assertEquals("----", Formatter.normaliseText("\u2012\u2013\u2014-"));
	}

	@Test	
	public void testCelciusJoining() {
		String normalisedText = Formatter.normaliseText("100 \u00b0 C");
		assertEquals("100 \u00b0C", normalisedText);
	}

	@Test	
	public void testSulphCorrection() {
		assertEquals("sulfide", Formatter.normaliseText("sulphide"));
	}

	@Test	
	public void testWhiteSpaceRemoval() {
		assertEquals("foo bar baz foo bar", Formatter.normaliseText("foo\rbar\nbaz\tfoo  \n bar"));
	}

	@Test
	public void testOxidationStateErroneousSpace(){
		String normalisedText = Formatter.normaliseText("The compound copper (I) chloride is normally misrecognised.");
		assertEquals("The compound copper(I) chloride is normally misrecognised.", normalisedText);
	}

	@Test
	public void testChargeErroneousSpace(){
		String normalisedText = Formatter.normaliseText("The compound copper (1+) chloride is normally misrecognised.");
		assertEquals("The compound copper(1+) chloride is normally misrecognised.", normalisedText);
	}

	@Test
	public void testCompoundReference(){
		String normalisedText = Formatter.normaliseText("This reference to compound (I) should be untouched.");
		assertEquals("This reference to compound (I) should be untouched.", normalisedText);
	}
	
	
	
	
	@Test
	public void testAmountSplitting() {
		assertEquals("5 gram", whiteSpaceTokeniseAndSubtokenise("5gram"));
		assertEquals("5 M", whiteSpaceTokeniseAndSubtokenise("5M"));
		assertEquals("5 ml", whiteSpaceTokeniseAndSubtokenise("5ml"));
		assertEquals("3 dm3", whiteSpaceTokeniseAndSubtokenise("3dm3"));
		assertEquals("7 cm3", whiteSpaceTokeniseAndSubtokenise("7cm3"));
		assertEquals("4.5 eq", whiteSpaceTokeniseAndSubtokenise("4.5eq"));
		assertEquals("5.3 g", whiteSpaceTokeniseAndSubtokenise("5.3g"));
		assertEquals("5g", whiteSpaceTokeniseAndSubtokenise("5g"));//could be an identifier
		assertEquals("5 L", whiteSpaceTokeniseAndSubtokenise("5L"));
		assertEquals("5l", whiteSpaceTokeniseAndSubtokenise("5l"));//could be an identifier
		assertEquals("5 mol", whiteSpaceTokeniseAndSubtokenise("5mol"));
		assertEquals("2 mmolar", whiteSpaceTokeniseAndSubtokenise("2mmolar"));
	}

	@Test	
	public void testpHSplitting() {
		String normalisedText = whiteSpaceTokeniseAndSubtokenise("pH6.5");
		assertEquals("pH 6.5", normalisedText);
		assertEquals("pHenyl", whiteSpaceTokeniseAndSubtokenise("pHenyl"));
	}

	@Test	
	public void testTemperatureSplitting() {
		assertEquals("50 \u00b0C", whiteSpaceTokeniseAndSubtokenise("50\u00b0C"));
		assertEquals("50-100 \u00b0C", whiteSpaceTokeniseAndSubtokenise("50-100\u00b0C"));
	}

	@Test	
	public void testSplitPercentSign1() {
		String normalisedText = whiteSpaceTokeniseAndSubtokenise("30%");
		assertEquals("30 %", normalisedText);
	}
	
	@Test	
	public void testSplitPercentSign2() {
		String normalisedText = whiteSpaceTokeniseAndSubtokenise("25%-30%");
		assertEquals("25 % - 30 %", normalisedText);
	}
	
	@Test	
	public void testSplitBracketsOffOxidationState() {
		assertEquals("( V )", whiteSpaceTokeniseAndSubtokenise("(V)"));
	}

	private static String whiteSpaceTokeniseAndSubtokenise(String str) {
		List<Token> tokens = new WhiteSpaceTokeniser().tokenise(str);
		tokens = Formatter.subTokeniseTokens(tokens);
		return Utils.tokensToSpaceDelimitedStr(tokens);
	}
}
