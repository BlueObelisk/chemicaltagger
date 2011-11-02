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

import static junit.framework.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import uk.ac.cam.ch.wwmm.oscar.document.Token;

/***********************************************
 * Tests the ACPTokeniser Class
 * @author lh359
 * @author dl387
 ***********************************************/

public class ACPTokeniserTest {
	@Test	
	public void testSplitFullStop() {
		assertEquals("reaction .", acpTokenise("reaction."));
	}

	@Test	
	public void testDontSplitAbbreviations() {
		assertEquals("e.g.", acpTokenise("e.g."));
		assertEquals("A.M.", acpTokenise("A.M."));
	}
	
	@Test	
	public void testSplitPeriodAfterDegrees() {
		assertEquals("After heating to 50 \u00b0C . the mixture was stired .", acpTokenise("After heating to 50 \u00b0C. the mixture was stired."));
	}
	
	@Test	
	public void testSplitPeriodAfterDegrees2() {
		assertEquals("100 \u00b0C . ,",  acpTokenise("100 \u00b0C.,"));
	}
	
	@Test	
	public void testSplitPeriodAfterDegrees3() {
		assertEquals("235-238 \u00b0C . )",  acpTokenise("235-238 \u00b0C.)"));
	}
	
	@Test
	public void testSplitKelvin() {
		assertEquals("273.15 K .", acpTokenise("273.15 K."));
	}
	
	@Test	
	public void testSplitBracketsOff() {
		assertEquals("( compound 5 )", acpTokenise("(compound 5)"));
		assertEquals("( solid )", acpTokenise("(solid)"));
	}

	@Test	
	public void testDontSplitBracketsOffInChemicalNames() {
		assertEquals("(ethyl)benzene", acpTokenise("(ethyl)benzene"));
	}
	
	@Test	
	public void testColonSplittingExceptinTimes() {
		assertEquals("Example 1 :", acpTokenise("Example 1:"));
		assertEquals("octanol : water", acpTokenise("octanol:water"));
		assertEquals("14:00", acpTokenise("14:00"));
		assertEquals("6:00pm", acpTokenise("6:00pm"));
	}

	@Test	
	public void testHyphenedDirectionPattern() {
		String normalisedText = acpTokenise("60\u00b0 N-60\u00b0");
		assertEquals("60\u00b0 N - 60\u00b0", normalisedText);
	}
	
	private static String acpTokenise(String str) {
		List<Token> tokens = new ACPTokeniser().tokenise(str);
		return Utils.tokensToSpaceDelimitedStr(tokens);
	}
}
