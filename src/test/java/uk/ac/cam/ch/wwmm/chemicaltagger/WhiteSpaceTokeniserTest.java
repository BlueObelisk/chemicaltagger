package uk.ac.cam.ch.wwmm.chemicaltagger;
import static uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger.DEFAULT_PRIORITISE_OSCAR;
import static uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger.DEFAULT_USE_SPECTRA_TAGGER;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.cam.ch.wwmm.oscar.Oscar;

/************************************
 * Tests the WhiteSpaceTokeniser Class.
 * @author lh359
 ************************************/
public class WhiteSpaceTokeniserTest {
	private static ChemistryPOSTagger posTagger; 
	@BeforeClass
	public static void setup(){
		posTagger = new ChemistryPOSTagger(new WhiteSpaceTokeniser(), new OscarTagger(new Oscar()), new RegexTagger(), OpenNLPTagger.getInstance());
	}
	
	@AfterClass
	public static void cleanUp(){
		posTagger = null;
	}
	
	@Test
	public void testWhiteSpaceTokenisation() {
		String sentence = "It was at Mt. xyz station (44°11' N-10°42' E) .";
		String expected = "PRP It VBD was IN at NNP Mt. NN xyz NN station -LRB- ( NN 44°11' JJ-CHEM N-10°42' NNP E -RRB- ) STOP .";
		POSContainer posContainer = posTagger.runTaggers(sentence, DEFAULT_PRIORITISE_OSCAR,DEFAULT_USE_SPECTRA_TAGGER);
        Assert.assertEquals("WhiteSpace Tokenisation result",expected, posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testWhiteSpaceTokenisationWithChemicals() {
		String sentence = "Water samples were collected from Mt. xyz .";
		String expected = "OSCAR-CM Water NNS samples VBD were VB-RECOVER collected IN-FROM from NNP Mt. NNP xyz STOP .";
		POSContainer posContainer = posTagger.runTaggers(sentence,DEFAULT_PRIORITISE_OSCAR, DEFAULT_USE_SPECTRA_TAGGER);
		Assert.assertEquals("WhiteSpace Tokenisation result",expected, posContainer.getTokenTagTupleAsString());
	}


}
