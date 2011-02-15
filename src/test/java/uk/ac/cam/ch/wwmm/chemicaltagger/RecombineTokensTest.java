package uk.ac.cam.ch.wwmm.chemicaltagger;

import junit.framework.Assert;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class RecombineTokensTest {

	
	
	@Test
	public void testRecombineSentence1() {

		OscarTagger oscarTagger = new OscarTagger();
		RegexTagger regexTagger = new RegexTagger();
		OpenNLPTagger openNLPTagger = OpenNLPTagger.getInstance();
		POSContainer posContainer = new POSContainer();
		String inputSentence = "Preparation of Sulfonated Poly(phthalazinone ether ether ketone) 7a. To a 25 mL three-necked round-bottomed flask fitted with a Dean-stark trap, a nitrogen inlet/outlet, and magnetic stirrer was added ";

		inputSentence = Utils.formatSentence(inputSentence);
        posContainer.setInputText(inputSentence);
		posContainer = oscarTagger.runTagger(posContainer);

		posContainer = regexTagger.runTagger(posContainer);
		posContainer = openNLPTagger.runTagger(posContainer);

		posContainer.combineTaggers();
		int beforeRecombined = posContainer.getCombinedTagsList().size();
		posContainer.recombineHyphenedTokens();
		int afterRecombined = posContainer.getCombinedTagsList().size();
		Assert.assertNotSame("Different Size of combined List",
				beforeRecombined, afterRecombined);
	
	}

	@Test
	public void testRecombineSentence2() {

		OscarTagger oscarTagger = new OscarTagger();
		RegexTagger regexTagger = new RegexTagger();
		OpenNLPTagger openNLPTagger = OpenNLPTagger.getInstance();
		POSContainer posContainer = new POSContainer();
		String inputSentence = "The synthetic procedure for partially EA- or BA-modified HPEI is exemplified for HPEI25K-EA 0.79: 1.00 g of HPEI25K";
		String expectedOutput = "DT-THE The JJ synthetic NN-METHOD procedure IN-FOR for RB partially NN EA- CC or JJ-CHEM BA-modified OSCAR-CM HPEI VBZ is VBN exemplified IN-FOR for OSCAR-CM HPEI25K-EA CD 0.79 COLON : CD 1.00 NN-MASS g IN-OF of OSCAR-CM HPEI25K";
		inputSentence = Utils.formatSentence(inputSentence);

        posContainer.setInputText(inputSentence);

		posContainer = oscarTagger.runTagger(posContainer);

		posContainer = regexTagger.runTagger(posContainer);
		posContainer = openNLPTagger.runTagger(posContainer);

		posContainer.combineTaggers();
		int beforeRecombined = posContainer.getCombinedTagsList().size();
		posContainer.recombineHyphenedTokens();
		int afterRecombined = posContainer.getCombinedTagsList().size();
		Assert.assertNotSame(beforeRecombined, afterRecombined);
		posContainer =  new PostProcessTags().correctCombinedTagsList(posContainer);
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testRecombineSentence3() {

		OscarTagger oscarTagger = new OscarTagger();
		RegexTagger regexTagger = new RegexTagger();
		OpenNLPTagger openNLPTagger = OpenNLPTagger.getInstance();
		POSContainer posContainer = new POSContainer();
		String inputSentence = "to give a white precipitate of diblock copolymer PNBE- -PSt";

		String expectedOutput = "TO to VB-YIELD give DT a JJ white NN-CHEMENTITY precipitate IN-OF of JJ-CHEM diblock NN-CHEMENTITY copolymer OSCAR-CM PNBE--PSt";
		inputSentence = Utils.formatSentence(inputSentence);

        posContainer.setInputText(inputSentence);
		posContainer = oscarTagger.runTagger(posContainer);

		posContainer = regexTagger.runTagger(posContainer);
		posContainer = openNLPTagger.runTagger(posContainer);

		posContainer.combineTaggers();
		int beforeRecombined = posContainer.getCombinedTagsList().size();
		posContainer.recombineHyphenedTokens();
		int afterRecombined = posContainer.getCombinedTagsList().size();
		Assert.assertNotSame(beforeRecombined, afterRecombined);
		posContainer =  new PostProcessTags().correctCombinedTagsList(posContainer);
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());
	}
	@Test
	public void testOxidationRecombineSentence() {

		OscarTagger oscarTagger = new OscarTagger();
		RegexTagger regexTagger = new RegexTagger();
		OpenNLPTagger openNLPTagger = OpenNLPTagger.getInstance();
		POSContainer posContainer = new POSContainer();
		String inputSentence = "The resultant mixture was added dropwise to Cu(II) nitrate hexahydrate (1.00 mmol ) .";

		String expectedOutput = "DT-THE The NN resultant NN-CHEMENTITY mixture VBD was VB-ADD added RB dropwise TO to OSCAR-CM Cu(II) OSCAR-CM nitrate OSCAR-CM hexahydrate -LRB- ( CD 1.00 NN-AMOUNT mmol -RRB- ) STOP .";
		inputSentence = Utils.formatSentence(inputSentence);

        posContainer.setInputText(inputSentence);
		posContainer = oscarTagger.runTagger(posContainer);

		posContainer = regexTagger.runTagger(posContainer);
		posContainer = openNLPTagger.runTagger(posContainer);

		posContainer.combineTaggers();
		posContainer =  new PostProcessTags().correctCombinedTagsList(posContainer);
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testForMissingInput() {

		OscarTagger oscarTagger = new OscarTagger();
		RegexTagger regexTagger = new RegexTagger();
		OpenNLPTagger openNLPTagger = OpenNLPTagger.getInstance();
		POSContainer posContainer = new POSContainer();
		String inputSentence = "The residue obtained was purified by flash chromatography (silica gel, 0-5% methanol/methylene chloride).";
		inputSentence = Utils.formatSentence(inputSentence);

        posContainer.setInputText(inputSentence);
		posContainer = oscarTagger.runTagger(posContainer);
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""),StringUtils.join(posContainer.getTokenList().listIterator(),"").toLowerCase());

		posContainer = regexTagger.runTagger(posContainer);
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""),StringUtils.join(posContainer.getTokenList().listIterator(),"").toLowerCase());
		posContainer = openNLPTagger.runTagger(posContainer);
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""),StringUtils.join(posContainer.getTokenList().listIterator(),"").toLowerCase());
		posContainer.combineTaggers();
		posContainer.recombineHyphenedTokens();

		posContainer =  new PostProcessTags().correctCombinedTagsList(posContainer);
		System.out.println(StringUtils.join(posContainer.getTokenList().listIterator()," "));
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""),StringUtils.join(posContainer.getTokenList().listIterator(),"").toLowerCase());
	

	}
}
