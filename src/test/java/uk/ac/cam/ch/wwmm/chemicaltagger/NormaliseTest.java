package uk.ac.cam.ch.wwmm.chemicaltagger;

import static org.junit.Assert.assertEquals;
import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import org.junit.Test;

/***********************************************
 * Tests the Formatter Class
 * @author lh359
 ***********************************************/

public class NormaliseTest {
	
	
	@Test	
	public void testNormaliseSentence() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/formatTest/sentence1.txt");
		
        String cleanSentence = Formatter.normaliseText(Utils.cleanHTMLText(sentence));
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/formatTest/ref1.txt");
		assertEquals(ref,cleanSentence);
	}
	
	@Test	
	public void testHyphenNormalisation() {
		assertEquals("----", Formatter.normaliseText("\u2012\u2013\u2014-"));
	}

	@Test	
	public void testWhiteSpaceRemoval() {
		assertEquals("foo bar baz foo bar", Formatter.normaliseText("foo\rbar\nbaz\tfoo  \n bar"));
	}
	
	@Test	
	public void testCelciusJoining() {
		String normalisedText = Formatter.normaliseText("100 \u00b0 C");
		assertEquals("100 \u00b0C", normalisedText);
	}
	
	
	@Test	
	public void testSplitFullStop() {
		assertEquals("reaction .", Formatter.normaliseText("reaction."));
	}
	
	@Test	
	public void testDontSplitAbbreviations() {
		assertEquals("e.g.", Formatter.normaliseText("e.g."));
		assertEquals("A.M.", Formatter.normaliseText("A.M."));
	}
	
	@Test	
	public void testSplitPeriodAfterDegrees() {
		assertEquals("After heating to 50 \u00b0C . the mixture was stired .", Formatter.normaliseText("After heating to 50 \u00b0C. the mixture was stired."));
	}
	
	@Test
	public void testSplitKelvin() {
		assertEquals("273.15 K .", Formatter.normaliseText("273.15 K."));
	}
	
	@Test	
	public void testSplitBracketsOff() {
		assertEquals("( compound 5 )", Formatter.normaliseText("(compound 5)"));
		assertEquals("( solid )", Formatter.normaliseText("(solid)"));
	}
	
	
	@Test	
	public void testDontSplitBracketsOffInChemicalNames() {
		assertEquals("(ethyl)benzene", Formatter.normaliseText("(ethyl)benzene"));
	}

	@Test	
	public void testAmountSplitting() {
		assertEquals("5 gram", Formatter.normaliseText("5gram"));
		assertEquals("5 M", Formatter.normaliseText("5M"));
		assertEquals("5 ml", Formatter.normaliseText("5ml"));
		assertEquals("3 dm3", Formatter.normaliseText("3dm3"));
		assertEquals("7 cm3", Formatter.normaliseText("7cm3"));
		assertEquals("4.5 eq", Formatter.normaliseText("4.5eq"));
		assertEquals("5.3 g", Formatter.normaliseText("5.3g"));
		assertEquals("5g", Formatter.normaliseText("5g"));//could be an identifier
		assertEquals("5 L", Formatter.normaliseText("5L"));
		assertEquals("5l", Formatter.normaliseText("5l"));//could be an identifier
	}
	
	@Test	
	public void testpHSplitting() {
		String normalisedText = Formatter.normaliseText("pH6.5");
		assertEquals("pH 6.5", normalisedText);
		assertEquals("pHenyl", Formatter.normaliseText("pHenyl"));
	}
	
	@Test	
	public void testTemperatureSplitting() {
		assertEquals("50 \u00b0C", Formatter.normaliseText("50\u00b0C"));
	}
	
	@Test	
	public void testColonSplittingExceptinTimes() {
		assertEquals("Example 1 :", Formatter.normaliseText("Example 1:"));
		assertEquals("octanol : water", Formatter.normaliseText("octanol:water"));
		assertEquals("14:00", Formatter.normaliseText("14:00"));
		assertEquals("6:00pm", Formatter.normaliseText("6:00pm"));
	}
	
	@Test	
	public void testSulphCorrection() {
		assertEquals("sulfide", Formatter.normaliseText("sulphide"));
	}
	
	@Test	
	public void testCelciusJoining2() {
		String normalisedText = Formatter.normaliseText("100 \u00b0 C.,");
		assertEquals("100 \u00b0C. ,", normalisedText);
	}
	
	@Test	
	public void testCelciusJoining3() {
		String normalisedText = Formatter.normaliseText("235-238\u00b0 C.)");
		assertEquals("235-238 \u00b0C. )", normalisedText);
	}
}
