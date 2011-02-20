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
	public void testRecombineSentence4() {

		OscarTagger oscarTagger = new OscarTagger();
		RegexTagger regexTagger = new RegexTagger();
		OpenNLPTagger openNLPTagger = OpenNLPTagger.getInstance();
		POSContainer posContainer = new POSContainer();
		String inputSentence = "the reaction solution was degassed using three freeze-vacuum-thaw cycles.";

		String expectedOutput = "DT-THE the NN-CHEMENTITY reaction NN-CHEMENTITY solution VBD was VB-DEGASS degassed VB-USE using CD three JJ-CHEM freeze-vacuum-thaw NN-CYCLE cycles STOP .";
		 
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
	public void testRecombineSentence5() {

		OscarTagger oscarTagger = new OscarTagger();
		RegexTagger regexTagger = new RegexTagger();
		OpenNLPTagger openNLPTagger = OpenNLPTagger.getInstance();
		POSContainer posContainer = new POSContainer();
		String inputSentence = "This is a five-part-multi-tokened-word";

		String expectedOutput = "DT This NN is DT a JJ-CHEM five-part-multi-tokened-word";
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
	public void testRecombinedSentence6(){
		OscarTagger oscarTagger = new OscarTagger();
		RegexTagger regexTagger = new RegexTagger();
		OpenNLPTagger openNLPTagger = OpenNLPTagger.getInstance();
		POSContainer posContainer = new POSContainer();
		String inputSentence = "HyperBranched Polymerization . A typical polymerization procedure was as follows . Cp2TiCl2 ( 25 mg , 0.1 × 10 -3 M ) , Zn ( 7 mg , 0.1 × 10 -3 M ) and dioxane ( 0.5 mL ) were added into a 5 mL glass tube , and then the reaction solution was degassed using three freeze-vacuum-thaw cycles , and reacted at room temperature for 10 min , until the solution turned lime green . GMA ( 0.355 g , 2.5 × 10 -3 M ) , St ( 0.260 g , 2.5 × 10 -3 M ) , CuBr 2 ( 23 mg , 0.1 × 10 -3 M ) and bpy ( 48 mg , 0.3 × 10 -3 M ) were added into the reaction solution , and the tube was again degassed using three freeze-vacuum-thaw cycles . The tube was then sealed under a vacuum , and the sealed tube was immersed in an oil bath at 90 °C . After polymerization for 4 h , the tube was rapidly cooled to room temperature . The polymer solution in THF was passed through a short column of neutral alumina to remove the metal salt . After two precipitations by addition of the polymer solution into petroleum ether ( 30-60 °C ) , the hyperbranched P(GMA-co-St)-Brn(HP(GMA-St)-Brn) was obtained in a 51 % yield after filtration and drying in a vacuum oven at 30 °C overnight . The monomer conversion was determined gravimetrically . was 78000 and was 1.19 .";
		inputSentence = Utils.formatSentence(inputSentence);
		String expectedOutput = "JJ-CHEM HyperBranched NN-CHEMENTITY Polymerization STOP . DT A JJ typical NN-SYNTHESIZE polymerization NN-METHOD procedure VBD was IN-AS as VBZ follows STOP . OSCAR-CM Cp2TiCl2 -LRB- ( CD 25 NN-MASS mg COMMA , CD 0.1 CD-UNICODE × CD 10 CD -3 NN-MOLAR M -RRB- ) COMMA , OSCAR-CM Zn -LRB- ( CD 7 NN-MASS mg COMMA , CD 0.1 CD-UNICODE × CD 10 CD -3 NN-MOLAR M -RRB- ) CC and OSCAR-CM dioxane -LRB- ( CD 0.5 NN-VOL mL -RRB- ) VBD were VB-ADD added IN-INTO into DT a CD 5 NN-VOL mL NN-STATE glass NN-APPARATUS tube COMMA , CC and RB-CONJ then DT-THE the NN-CHEMENTITY reaction NN-CHEMENTITY solution VBD was VB-DEGASS degassed VB-USE using CD three JJ-CHEM freeze-vacuum-thaw NN-CYCLE cycles COMMA , CC and VB-SYNTHESIZE reacted IN at NN-TEMP room NN-TEMP temperature IN-FOR for CD 10 NN-TIME min COMMA , IN until DT-THE the NN-CHEMENTITY solution VBD turned JJ lime JJ green STOP . NNP GMA -LRB- ( CD 0.355 NN-MASS g COMMA , CD 2.5 CD-UNICODE × CD 10 CD -3 NN-MOLAR M -RRB- ) COMMA , OSCAR-CM St -LRB- ( CD 0.260 NN-MASS g COMMA , CD 2.5 CD-UNICODE × CD 10 CD -3 NN-MOLAR M -RRB- ) COMMA , NNP CuBr OSCAR-CD 2 -LRB- ( CD 23 NN-MASS mg COMMA , CD 0.1 CD-UNICODE × CD 10 CD -3 NN-MOLAR M -RRB- ) CC and OSCAR-CM bpy -LRB- ( CD 48 NN-MASS mg COMMA , CD 0.3 CD-UNICODE × CD 10 CD -3 NN-MOLAR M -RRB- ) VBD were VB-ADD added IN-INTO into DT-THE the NN-CHEMENTITY reaction NN-CHEMENTITY solution COMMA , CC and DT-THE the NN-APPARATUS tube VBD was RB again VB-DEGASS degassed VB-USE using CD three JJ-CHEM freeze-vacuum-thaw NN-CYCLE cycles STOP . DT-THE The NN-APPARATUS tube VBD was RB-CONJ then VB-APPARATUS sealed IN-UNDER under DT a NN-CHEMENTITY vacuum COMMA , CC and DT-THE the JJ sealed NN-APPARATUS tube VBD was VB-IMMERSE immersed IN-IN in DT an NN-STATE oil NN-APPARATUS bath IN at CD 90 NN-TEMP °C STOP . IN-AFTER After NN-CHEMENTITY polymerization IN-FOR for CD 4 NN-TIME h COMMA , DT-THE the NN-APPARATUS tube VBD was RB rapidly VB-COOL cooled TO to NN-TEMP room NN-TEMP temperature STOP . DT-THE The NN-CHEMENTITY polymer NN-CHEMENTITY solution IN-IN in OSCAR-CM THF VBD was VBN passed IN through DT a JJ short NN-COLUMN column IN-OF of JJ neutral OSCAR-CM alumina TO to VB-REMOVE remove DT-THE the NN-CHEMENTITY metal OSCAR-CM salt STOP . IN-AFTER After CD two NNS precipitations IN-BY by NN-ADD addition IN-OF of DT-THE the NN-CHEMENTITY polymer NN-CHEMENTITY solution IN-INTO into NN-CHEMENTITY petroleum OSCAR-CM ether -LRB- ( JJ 30-60 NN-TEMP °C -RRB- ) COMMA , DT-THE the JJ-CHEM hyperbranched OSCAR-CM P(GMA-co-St)-Brn(HP(GMA-St)-Brn) VBD was VB-YIELD obtained IN-IN in DT a CD 51 NN-PERCENT % NN-YIELD yield IN-AFTER after NN-FILTER filtration CC and VB-DRY drying IN-IN in DT a NN-CHEMENTITY vacuum NN-APPARATUS oven IN at CD 30 NN-TEMP °C NN-TIME overnight STOP . DT-THE The NN-CHEMENTITY monomer NN conversion VBD was VBN determined RB gravimetrically STOP . VBD was CD 78000 CC and VBD was CD 1.19 STOP .";

        posContainer.setInputText(inputSentence);
		posContainer = oscarTagger.runTagger(posContainer);

		posContainer = regexTagger.runTagger(posContainer);
		posContainer = openNLPTagger.runTagger(posContainer);

		posContainer.combineTaggers();

		int beforeRecombined = posContainer.getCombinedTagsList().size();
		posContainer.recombineHyphenedTokens();
		int afterRecombined = posContainer.getCombinedTagsList().size();
		posContainer =  new PostProcessTags().correctCombinedTagsList(posContainer);
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());
		Assert.assertNotSame(beforeRecombined, afterRecombined);

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
	public void testForMissingInput1() {

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
	@Test
	public void testForMissingInput2() {

		OscarTagger oscarTagger = new OscarTagger();
		RegexTagger regexTagger = new RegexTagger();
		OpenNLPTagger openNLPTagger = OpenNLPTagger.getInstance();
		POSContainer posContainer = new POSContainer();
		String inputSentence = "This is a 5-part-multi-tokened-word.";
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
