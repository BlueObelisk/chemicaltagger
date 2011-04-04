package uk.ac.cam.ch.wwmm.chemicaltagger;

import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import org.junit.Assert;
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

	private POSContainer posContainer;



	@Test
	public void sentence1() {

		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test1.txt");
		posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref1.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();
	}


	@Test
	public void sentence2() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test2.txt");
		posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref2.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();
	}

	@Test
	public void sentence3() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test3.txt");
		posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref3.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();
	}

	@Test
	public void sentence4() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test4.txt");
		posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref4.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();
	}

	@Test
	public void sentence5() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test5.txt");
		posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref5.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();

	}
	
	@Test
	public void sentence6() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test6.txt");
		posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref6.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();

	}
	@Test
	public void sentence7() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test7.txt");
		posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref7.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();

	}

	@Test
	public void sentence8() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/test8.txt");
		posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/tagTest/ref8.txt");
		Assert.assertEquals(ref, posContainer.getTokenTagTupleAsString());
		checkLengthofTags();

	}
	
	

	@Test
	public void emptyInput() {
		String sentence = "";
		posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
		Assert.assertEquals(0, posContainer.getCombinedTagsList().size());
		Assert.assertEquals(0, posContainer.getWordTokenList().size());
		Assert.assertEquals("", posContainer.getTokenTagTupleAsString());
	}
    



	private void checkLengthofTags() {
		Assert.assertEquals(posContainer.getRegexTagList().size(),
				posContainer.getOscarTagList().size());
		Assert.assertEquals(posContainer.getOscarTagList().size(),
				posContainer.getRegexTagList().size());
		Assert.assertEquals(posContainer.getRegexTagList().size(),
				posContainer.getBrownTagList().size());
	}

}
