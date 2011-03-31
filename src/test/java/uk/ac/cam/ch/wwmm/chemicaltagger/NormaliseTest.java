package uk.ac.cam.ch.wwmm.chemicaltagger;

import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import org.junit.Assert;
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
		Assert.assertEquals(ref,cleanSentence);


	}
	
}
