/**
 * Copyright 2012 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import uk.ac.cam.ch.wwmm.oscar.document.Token;
import uk.ac.cam.ch.wwmm.oscar.types.BioTag;
import uk.ac.cam.ch.wwmm.oscar.types.BioType;

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
        List<Token> tokens = toTokens("44\u00B011'");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN 44\u00B011'", posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testYieldAsAnAdjective() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("DT-THE", "VB-YIELD", "NN-CHEMENTITY");
        List<Token> tokens = toTokens("The", "yielded", "product");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("DT-THE The JJ-CHEM yielded NN-CHEMENTITY product", posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testYieldAsANoun1() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("CD", "NN-PERCENT", "VB-YIELD");
        List<Token> tokens = toTokens("30", "%", "yield");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("CD 30 NN-PERCENT % NN-YIELD yield", posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testYieldAsANoun2() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("VB-YIELD", "IN-OF", "CD", "NN-PERCENT");
        List<Token> tokens = toTokens("yield", "of", "30", "%");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-YIELD yield IN-OF of CD 30 NN-PERCENT %" , posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testFormAsAVerb() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("VB");
        List<Token> tokens = toTokens("form");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("VB-YIELD form", posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testLetterLabelledExample() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-EXAMPLE", "NNP");
        List<Token> tokens = toTokens("example", "A");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-EXAMPLE example NN-IDENTIFIER A", posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testNotALetterLabelledExample() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("IN-IN", "DT", "NN-EXAMPLE", "DT", "NN-APPARATUS");
        List<Token> tokens = toTokens("In", "this", "example", "a", "flask");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("IN-IN In DT this NN-EXAMPLE example DT a NN-APPARATUS flask", posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testLetterLabelledProcedure() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-METHOD", "OSCAR-CM");
        List<Token> tokens = toTokens("step", "B");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-METHOD step NN-IDENTIFIER B", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetterLabelledProcedure2() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-METHOD", "NN");
        List<Token> tokens = toTokens("step", "b");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-METHOD step NN-IDENTIFIER b", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetterLabelledProcedure3() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-METHOD", "NNP");
        List<Token> tokens = toTokens("procedure", "E");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-METHOD procedure NN-IDENTIFIER E", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetterLabelledProcedure4() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("-LRB-", "DT", "-RRB-");
        List<Token> tokens = toTokens("(", "A", ")");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("-LRB- ( NN-IDENTIFIER A -RRB- )", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetterLabelledProcedure5() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("DT", "STOP");
        List<Token> tokens = toTokens("a", ".");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-IDENTIFIER a STOP .", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetterLabelledProcedure6() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("DT", "COLON");
        List<Token> tokens = toTokens("a", ":");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-IDENTIFIER a COLON :", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testRomanNumberLabelledProcedure1() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-METHOD", "PRP");
        List<Token> tokens = toTokens("procedure", "i");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-METHOD procedure NN-IDENTIFIER i", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testRomanNumberLabelledProcedure2() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-METHOD", "NNP");
        List<Token> tokens = toTokens("procedure", "X");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-METHOD procedure NN-IDENTIFIER X", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testRomanNumberLabelledProcedure3() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("-LRB-", "PRP", "-RRB-");
        List<Token> tokens = toTokens("(", "i", ")");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("-LRB- ( NN-IDENTIFIER i -RRB- )", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testRomanNumberLabelledProcedureHeading() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN", "-RRB-");
        List<Token> tokens = toTokens("i", ")");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-IDENTIFIER i -RRB- )", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testRomanNumberLabelledCompound() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-CHEMENTITY", "NN");
        List<Token> tokens = toTokens("compound", "X");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-CHEMENTITY compound NN-IDENTIFIER X", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetteraLabelledCompound() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("CD", "NN-MASS", "IN-OF", "DT", "STOP");
        List<Token> tokens = toTokens("50", "g", "of", "a", ".");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("CD 50 NN-MASS g IN-OF of NN-IDENTIFIER a STOP .", posContainer.getTokenTagTupleAsString());
     }
	
	@Test
	public void testNotLetteraLabelledCompound() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("CD", "NN-MASS", "IN-OF", "DT", "JJ", "NN-STATE");
        List<Token> tokens = toTokens("50", "g", "of", "a", "brown", "liquid");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("CD 50 NN-MASS g IN-OF of DT a JJ brown NN-STATE liquid", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetterLabelledProcedureHeading1() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("DT", "-RRB-");
        List<Token> tokens = toTokens("a", ")");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-IDENTIFIER a -RRB- )", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetterLabelledProcedureHeading2() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("-LRB-", "DT", "-RRB-");
        List<Token> tokens = toTokens("(", "a", ")");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("-LRB- ( NN-IDENTIFIER a -RRB- )", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testLetterAbbreviation() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN-TIME", "-LRB-", "DT", "-RRB-");
        List<Token> tokens = toTokens("hours", "(", "h", ")");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-TIME hours -LRB- ( NN-TIME h -RRB- )", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testNounUsedAsAnAdjectiveColour() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN", "NN-STATE");
        List<Token> tokens = toTokens("amber", "oil");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("JJ amber NN-STATE oil", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testPrecipitateNN() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN");
        List<Token> tokens = toTokens("precipitate");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-CHEMENTITY precipitate", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testPrecipitateVB() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("VB");
        List<Token> tokens = toTokens("precipitate");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("VB-PRECIPITATE precipitate", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testFormulasAsAChementity() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("NN", "CD");
        List<Token> tokens = toTokens("formula", "5");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("NN-CHEMENTITY formula CD 5", posContainer.getTokenTagTupleAsString());
    }

	//Cases where post process tags was making erroneous corrections
	@Test
	public void testNNMethodIsNotaJJ() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("TO", "NN-METHOD", "NNP" , "IN-OF");
        List<Token> tokens = toTokens("to", "Step", "C", "of");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("TO to NN-METHOD Step NN-IDENTIFIER C IN-OF of", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testVBYieldIsNotaJJ() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("OSCAR-CM", "VB-YIELD", "OSCAR-CM");
        List<Token> tokens = toTokens("hexane", "provided", "2-chloropyridine");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("OSCAR-CM hexane VB-YIELD provided OSCAR-CM 2-chloropyridine", posContainer.getTokenTagTupleAsString());
    }
	
	@Test
	public void testVBUseIsNotaJJ() {
        POSContainer posContainer = new POSContainer();
        List<String> tags = Arrays.asList("OSCAR-CM", "VB-USE", "OSCAR-CM");
        List<Token> tokens = toTokens("ethanol", "using", "palladium");
        posContainer.setCombinedTagsList(tags);
        posContainer.setWordTokenList(tokens);
        new PostProcessTags(posContainer).correctCombinedTagsList();
        Assert.assertEquals("OSCAR-CM ethanol VB-USE using OSCAR-CM palladium", posContainer.getTokenTagTupleAsString());
    }
	
	private List<Token> toTokens(String... tokenSurfaces){
		List<Token> tokens = new ArrayList<Token>();
		int pos = 0;
		for (String surface : tokenSurfaces) {
			tokens.add(new Token(surface, pos, pos +surface.length(), null, new BioType(BioTag.O), null));
			pos+=surface.length() +1;
		}
		return tokens;
	}
}
