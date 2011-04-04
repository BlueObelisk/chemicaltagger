package uk.ac.cam.ch.wwmm.chemicaltagger;
import static uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger.*;
import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

/************************************
 * Tests the WhiteSpaceTokeniser Class.
 * @author lh359
 ************************************/
public class WhiteSpaceTokeniserTest {
	
	@Ignore
	@Test
	public void testWhiteSpaceTokenisation() {
		String sentence = "It was at Mt. xyz station (44°11' N-10°42' E) .";
		String expected = "PRP It VBD was IN at NNP Mt. NN xyz NN station -LRB- ( NN 44°11' JJ-CHEM N-10°42' NNP E -RRB- ) STOP .";
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(sentence,
				DEFAULT_PRIORITISE_OSCAR, false,
				DEFAULT_USE_SPECTRA_TAGGER);
        Assert.assertEquals("WhiteSpace Tokenisation result",expected, posContainer.getTokenTagTupleAsString());
	}
	
	@Ignore
	@Test
	public void testWhiteSpaceTokenisationWithChemicals() {
		String sentence = "Water samples were collected from Mt. xyz .";
		String expected = "OSCAR-CM Water NNS samples VBD were VB-RECOVER collected IN-FROM from NNP Mt. NNP xyz STOP .";
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(sentence,
				DEFAULT_PRIORITISE_OSCAR, false,
				DEFAULT_USE_SPECTRA_TAGGER);
		Assert.assertEquals("WhiteSpace Tokenisation result",expected, posContainer.getTokenTagTupleAsString());
	}


}
