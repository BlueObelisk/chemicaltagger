package uk.ac.cam.ch.wwmm.chemicaltagger;

import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import org.junit.Assert;
import org.junit.Test;


public class FormatSentenceTest {
	
	
	@Test	
	public void sentence1() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/formatTest/sentence1.txt");
        String cleanSentence = Utils.formatSentence(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/formatTest/ref1.txt");
		Assert.assertEquals(ref,cleanSentence);


	}
	
}
