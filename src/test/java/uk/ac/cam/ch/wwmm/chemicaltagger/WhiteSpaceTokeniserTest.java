package uk.ac.cam.ch.wwmm.chemicaltagger;

import junit.framework.Assert;

import org.junit.Test;

/************************************
 * Tests the WhiteSpaceTokeniser Class.
 * @author lh359
 ************************************/
public class WhiteSpaceTokeniserTest {
	
	@Test
	public void testWhiteSpaceTokenisation() {
		String sentence = "It was at Mt. xyz station (44°11' N-10°42' E) .";
		String expected = "PRP It VBD was IN at NNP Mt. NN xyz NN station -LRB- ( NN 44°11' JJ-CHEM N-10°42' NNP E -RRB- ) STOP .";
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getInstance();
		posTagger.setUseOscarTokeniser(false);
		POSContainer posContainer =posTagger.runTaggers(sentence);
        Assert.assertEquals("WhiteSpace Tokenisation result",expected, posContainer.getTokenTagTupleAsString());
		posTagger.setUseOscarTokeniser(true);

	}
	
	@Test
	public void testWhiteSpaceTokenisationWithChemicals() {
		String sentence = "Water samples were collected from Mt. xyz .";
		String expected = "OSCAR-CM Water NNS samples VBD were VB-RECOVER collected IN-FROM from NNP Mt. NNP xyz STOP .";
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getInstance();
		posTagger.setUseOscarTokeniser(false);
		POSContainer posContainer =posTagger.runTaggers(sentence);
        Assert.assertEquals("WhiteSpace Tokenisation result",expected, posContainer.getTokenTagTupleAsString());
		posTagger.setUseOscarTokeniser(true);

	}


}
