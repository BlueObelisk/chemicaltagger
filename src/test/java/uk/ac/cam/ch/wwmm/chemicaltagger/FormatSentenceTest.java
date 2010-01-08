package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.tree.Tree;
import org.junit.Assert;
import org.junit.Test;


public class FormatSentenceTest {
	
	
	@Test	
	public void sentence1() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/formatTest/sentence1.txt");

		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/formatTest/ref1.txt");
		Assert.assertEquals(ref,Utils.formatSentence(sentence));


	}
	
	private String readSentence(String resourceName) {
		// requires sentence with no newlines except possibly at end 
		String sentence = null;
		try {
			InputStream refStream = this.getClass().getClassLoader().getResourceAsStream(resourceName);
			BufferedReader br = new BufferedReader(new InputStreamReader(refStream));
			sentence = br.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Cannot read sentence: "+resourceName);
		}
		Assert.assertNotNull(sentence);
		return sentence.trim();
	}

}
