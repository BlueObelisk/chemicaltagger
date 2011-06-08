package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

/************************************
 * Tests the PostProcessingTags Class.
 * @author lh359
 ************************************/
public class PostProcessTagsTest {
	
	@Test
	public void testMistaggedChemistry() {
		
          String sentence = "ROMP of 1. ATRP was performed on 3 ml of a benzene compound under 25\u00B0c";
  		  String expected = "NN-SYNTHESIZE ROMP IN-OF of CD-ALPHANUM 1 STOP . NN-SYNTHESIZE ATRP VBD was VBN performed IN-ON on CD 3 NN-VOL ml IN-OF of DT a OSCAR-CM benzene NN-CHEMENTITY compound IN-UNDER under CD 25 NN-TEMP \u00B0c";
          POSContainer posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
          Assert.assertEquals(expected,posContainer.getTokenTagTupleAsString());
 	}

	@Test
	public void testMistaggedVerbs() {
		
          String sentence = "The benzene worked form was filled";
  		  String expected = "DT-THE The OSCAR-CM benzene JJ worked NN form VBD was VB-FILL filled";
          POSContainer posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(sentence);
          Assert.assertEquals(expected,posContainer.getTokenTagTupleAsString());
 	}

	
	@Test
	public void testVerbWithDigits() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("VB");
        List<String> tokens = Arrays.asList("44\u00B011'");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("NN 44\u00B011'", posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testYieldAsAnAdjective() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("DT-THE", "VB-YIELD", "NN-CHEMENTITY");
        List<String> tokens = Arrays.asList("The", "yielded", "product");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("DT-THE The JJ-CHEM yielded NN-CHEMENTITY product", posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testFormAsAVerb() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("VB");
        List<String> tokens = Arrays.asList("form");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("VB-YIELD form", posContainer.getTokenTagTupleAsString());
	}
	
	
}
