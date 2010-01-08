package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/*****************************
 * 
 * Test case for POSTagger.
 * Passes sentences to the POSTagger
 * and checks whether the outputs match.
 * As well as checking that all 3 taggers
 * produce the same amount of tokens
 * 
 * @author lh359
 *****************************/
public class ChemistryPOSTaggerTest {

	private ChemistryPOSTagger posTagger;
	private POSContainer posContainer;

	@Before
	public void setUp() {
		if (posTagger == null) {
			posTagger = new ChemistryPOSTagger();
		}
	}
	
	@Ignore
	@Test
	public void encodingCheck() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/characterEncoding.txt");
		System.out.println(sentence);
		
		System.out.println(sentence.length());
		
		System.exit(0);
	}

	@Test
	public void sentence1() {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test1.txt");
		posContainer = posTagger.runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref1.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();
	}


	@Test
	public void sentence2() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test2.txt");
		posContainer = posTagger.runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref2.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();
	}

	@Test
	public void sentence3() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test3.txt");
		posContainer = posTagger.runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref3.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();
	}

	@Test
	public void sentence4() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test4.txt");
		posContainer = posTagger.runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref4.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();
	}

	@Test
	public void sentence5() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test5.txt");
		posContainer = posTagger.runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref5.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();

	}
	
	@Test
	public void sentence6() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test6.txt");
		posContainer = posTagger.runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref6.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();

	}


	private void checkLengthofTags() {
		Assert.assertEquals(posContainer.wordTokenList.size(),
				posContainer.oscarTagList.size());
		Assert.assertEquals(posContainer.oscarTagList.size(),
				posContainer.regexTagList.size());
		Assert.assertEquals(posContainer.regexTagList.size(),
				posContainer.brownTagList.size());
	}
	private String readSentence(String resourceName) {
		// requires sentence with no newlines except possibly at end 
		String sentence = null;
		try {
			InputStream refStream = this.getClass().getClassLoader().getResourceAsStream(resourceName);
			BufferedReader br = new BufferedReader(new InputStreamReader(refStream, Charset.forName("UTF-8")));
			sentence = br.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Cannot read sentence: "+resourceName);
		}
		Assert.assertNotNull(sentence);
		return sentence.trim();
	}

}