package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

/************************************
 * Tests the PostProcessingTags Class.
 * @author lh359
 ************************************/
public class PostProcessTagsTest {
	
	@Test
	public void testMistaggedChemistry() {
          String sentence = "ROMP of 1. ATRP was performed on 3 ml of a benzene compound under 25\u00B0c";
  		  String expected = "NN-SYNTHESIZE ROMP IN-OF of CD 1 STOP . NN-SYNTHESIZE ATRP VBD was VBN performed IN-ON on CD 3 NN-VOL ml IN-OF of DT a OSCAR-CM benzene NN-CHEMENTITY compound IN-UNDER under CD 25 NN-TEMP \u00B0c";
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
	
	@Test
	public void testLetterLabelledExample() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-EXAMPLE", "NNP");
        List<String> tokens = Arrays.asList("example", "A");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("NN-EXAMPLE example NN-IDENTIFIER A", posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testNotALetterLabelledExample() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("IN-IN", "DT", "NN-EXAMPLE", "DT", "NN-APPARATUS");
        List<String> tokens = Arrays.asList("In", "this", "example", "a", "flask");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("IN-IN In DT this NN-EXAMPLE example DT a NN-APPARATUS flask", posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testLetterLabelledProcedure() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-METHOD", "OSCAR-CM");
        List<String> tokens = Arrays.asList("step", "B");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("NN-METHOD step NN-IDENTIFIER B", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetterLabelledProcedure2() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-METHOD", "NNP");
        List<String> tokens = Arrays.asList("procedure", "E");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("NN-METHOD procedure NN-IDENTIFIER E", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetterLabelledProcedure3() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("-LRB-", "DT", "-RRB-");
        List<String> tokens = Arrays.asList("(", "A", ")");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("-LRB- ( NN-IDENTIFIER A -RRB- )", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testRomanNumberLabelledProcedure1() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-METHOD", "PRP");
        List<String> tokens = Arrays.asList("procedure", "i");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("NN-METHOD procedure NN-IDENTIFIER i", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testRomanNumberLabelledProcedure2() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-METHOD", "NNP");
        List<String> tokens = Arrays.asList("procedure", "X");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("NN-METHOD procedure NN-IDENTIFIER X", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testRomanNumberLabelledProcedure3() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("-LRB-", "PRP", "-RRB-");
        List<String> tokens = Arrays.asList("(", "i", ")");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags().correctCombinedTagsList(posContainer);
        Assert.assertEquals("-LRB- ( NN-IDENTIFIER i -RRB- )", posContainer.getTokenTagTupleAsString());
    }
}
