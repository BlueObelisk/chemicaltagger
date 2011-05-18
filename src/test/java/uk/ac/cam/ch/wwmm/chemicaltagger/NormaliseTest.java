package uk.ac.cam.ch.wwmm.chemicaltagger;

import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import static org.junit.Assert.*;
import org.junit.Test;

/***********************************************
 * Tests the Formatter Class
 * @author lh359
 ***********************************************/

public class NormaliseTest {
	
	
	@Test	
	public void testNormaliseSentence() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/formatTest/sentence1.txt");
        String cleanSentence = Formatter.normaliseText(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/formatTest/ref1.txt");
		assertEquals(ref,cleanSentence);
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
	
}
