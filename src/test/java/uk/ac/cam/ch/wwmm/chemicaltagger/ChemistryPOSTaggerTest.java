package uk.ac.cam.ch.wwmm.chemicaltagger;

import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

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

}
