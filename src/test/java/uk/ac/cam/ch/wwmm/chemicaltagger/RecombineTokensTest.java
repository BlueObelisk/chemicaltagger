/**
 * Copyright 2011 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
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

import java.util.List;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.cam.ch.wwmm.oscar.document.Token;

/************************************
 * Tests the RecombineTokens Class.
 * @author lh359
 ************************************/
public class RecombineTokensTest {

	private static OscarTagger oscarTagger;
	private static RegexTagger regexTagger;
	private static OpenNLPTagger openNLPTagger;
	private static OscarTokeniser oscarTokeniser;
	@BeforeClass
	public static void setup(){
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		oscarTokeniser = (OscarTokeniser)posTagger.getCTTokeniser();
		oscarTagger = posTagger.getOscarTagger();
		regexTagger = posTagger.getRegexTagger();
		openNLPTagger = posTagger.getOpenNLPTagger();
	    
	}
	
	@AfterClass
	public static void cleanUp(){
		oscarTokeniser = null;
		oscarTagger = null;
		regexTagger = null;
		openNLPTagger = null;
	}
	
	@Test
	public void testRecombineSentence1() {
		POSContainer posContainer = new POSContainer();
		String inputSentence = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/sentence1.txt");
		String expectedOutput = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/ref1.txt");
		inputSentence = Formatter.normaliseText(inputSentence);
        posContainer.setInputText(inputSentence);
		posContainer.setWordTokenList(oscarTokeniser.tokenise(inputSentence));
		posContainer.registerTagList(oscarTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(regexTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(openNLPTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.combineTaggers();
		int beforeRecombined = posContainer.getCombinedTagsList().size();
		posContainer = RecombineTokens.recombineTokens(posContainer);
		int afterRecombined = posContainer.getCombinedTagsList().size();
		Assert.assertNotSame("Different Size of combined List",
				beforeRecombined, afterRecombined);
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());

	}

	@Test
	public void testRecombineSentence2() {
		POSContainer posContainer = new POSContainer();
		String inputSentence = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/sentence2.txt");
		String expectedOutput = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/ref2.txt");
		inputSentence = Formatter.normaliseText(inputSentence);
        posContainer.setInputText(inputSentence);
		posContainer.setWordTokenList(oscarTokeniser.tokenise(inputSentence));
		posContainer.registerTagList(oscarTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(regexTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(openNLPTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.combineTaggers();
		int beforeRecombined = posContainer.getCombinedTagsList().size();
		posContainer = RecombineTokens.recombineTokens(posContainer);
		int afterRecombined = posContainer.getCombinedTagsList().size();
		Assert.assertNotSame(beforeRecombined, afterRecombined);
		new PostProcessTags(posContainer).correctCombinedTagsList();
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testRecombineSentence3() {
		POSContainer posContainer = new POSContainer();
		String inputSentence = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/sentence3.txt");
		String expectedOutput = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/ref3.txt");
		inputSentence = Formatter.normaliseText(inputSentence);
        posContainer.setInputText(inputSentence);
		posContainer.setWordTokenList(oscarTokeniser.tokenise(inputSentence));
		posContainer.registerTagList(oscarTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(regexTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(openNLPTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.combineTaggers();
		int beforeRecombined = posContainer.getCombinedTagsList().size();
		posContainer = RecombineTokens.recombineTokens(posContainer);
		int afterRecombined = posContainer.getCombinedTagsList().size();
		Assert.assertNotSame(beforeRecombined, afterRecombined);
		new PostProcessTags(posContainer).correctCombinedTagsList();
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());
	}



	@Test
	public void testRecombineSentence4() {
		POSContainer posContainer = new POSContainer();
		String inputSentence = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/sentence4.txt");
		String expectedOutput = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/ref4.txt");
		inputSentence = Formatter.normaliseText(inputSentence);
        posContainer.setInputText(inputSentence);
		posContainer.setWordTokenList(oscarTokeniser.tokenise(inputSentence));
		posContainer.registerTagList(oscarTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(regexTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(openNLPTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.combineTaggers();
		int beforeRecombined = posContainer.getCombinedTagsList().size();
		posContainer = RecombineTokens.recombineTokens(posContainer);
		int afterRecombined = posContainer.getCombinedTagsList().size();
		Assert.assertNotSame(beforeRecombined, afterRecombined);
		new PostProcessTags(posContainer).correctCombinedTagsList();
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());
	}

	@Test
	public void testRecombineSentence5() {
		POSContainer posContainer = new POSContainer();
		String inputSentence = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/sentence5.txt");
		String expectedOutput = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/ref5.txt");
		inputSentence = Formatter.normaliseText(inputSentence);
        posContainer.setInputText(inputSentence);
		posContainer.setWordTokenList(oscarTokeniser.tokenise(inputSentence));
		posContainer.registerTagList(oscarTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(regexTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(openNLPTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.combineTaggers();
		int beforeRecombined = posContainer.getCombinedTagsList().size();
		posContainer = RecombineTokens.recombineTokens(posContainer);
		int afterRecombined = posContainer.getCombinedTagsList().size();
		Assert.assertNotSame(beforeRecombined, afterRecombined);
		new PostProcessTags(posContainer).correctCombinedTagsList();
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());
	}
	
	
	
	@Test
	public void testCelciusDotRecombination() {//recombine 50C . to 50C.
		POSContainer posContainer = new POSContainer();
		String inputSentence = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/celciusDot.txt");
		String expectedOutput = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/celciusDotRef.txt");
		inputSentence = Formatter.normaliseText(inputSentence);
        posContainer.setInputText(inputSentence);
		posContainer.setWordTokenList(oscarTokeniser.tokenise(inputSentence));
		posContainer.registerTagList(oscarTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(regexTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(openNLPTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.combineTaggers();
		int beforeRecombined = posContainer.getCombinedTagsList().size();
		posContainer = RecombineTokens.recombineTokens(posContainer);
		int afterRecombined = posContainer.getCombinedTagsList().size();
		Assert.assertNotSame(beforeRecombined, afterRecombined);
		new PostProcessTags(posContainer).correctCombinedTagsList();
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());
	}
	
	
	@Test
	public void testOxidationRecombineSentence() {
		POSContainer posContainer = new POSContainer();
		String inputSentence = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/oxidation.txt");
		String expectedOutput = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/oxidationRef.txt");
		inputSentence = Formatter.normaliseText(inputSentence);
        posContainer.setInputText(inputSentence);
		posContainer.setWordTokenList(oscarTokeniser.tokenise(inputSentence));
		posContainer.registerTagList(oscarTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(regexTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.registerTagList(openNLPTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		posContainer.combineTaggers();
		new PostProcessTags(posContainer).correctCombinedTagsList();
		Assert.assertEquals("Combined all the hyphenated words",expectedOutput, posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testForMissingInput1() {
		POSContainer posContainer = new POSContainer();
		String inputSentence = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/missingInput1.txt");
		inputSentence = Formatter.normaliseText(inputSentence);
        posContainer.setInputText(inputSentence);
		posContainer.setWordTokenList(oscarTokeniser.tokenise(inputSentence));
		posContainer.registerTagList(oscarTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""), tokenListToConcatenatedString(posContainer.getWordTokenList()).toLowerCase());
		posContainer.registerTagList(regexTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""), tokenListToConcatenatedString(posContainer.getWordTokenList()).toLowerCase());
		posContainer.registerTagList(openNLPTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""), tokenListToConcatenatedString(posContainer.getWordTokenList()).toLowerCase());
		posContainer.combineTaggers();
		posContainer = RecombineTokens.recombineTokens(posContainer);
		new PostProcessTags(posContainer).correctCombinedTagsList();
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""), tokenListToConcatenatedString(posContainer.getWordTokenList()).toLowerCase());
	

	}
	@Test
	public void testForMissingInput2() {
		POSContainer posContainer = new POSContainer();
		
		String inputSentence = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/recombineTokens/missingInput2.txt");
		inputSentence = Formatter.normaliseText(inputSentence);
        posContainer.setInputText(inputSentence);
        
		posContainer.setWordTokenList(oscarTokeniser.tokenise(inputSentence));
		posContainer.registerTagList(oscarTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""), tokenListToConcatenatedString(posContainer.getWordTokenList()).toLowerCase());
		posContainer.registerTagList(regexTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""), tokenListToConcatenatedString(posContainer.getWordTokenList()).toLowerCase());
		posContainer.registerTagList(openNLPTagger.runTagger(posContainer.getWordTokenList(), inputSentence));
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""), tokenListToConcatenatedString(posContainer.getWordTokenList()).toLowerCase());
		posContainer.combineTaggers();
		posContainer = RecombineTokens.recombineTokens(posContainer);
		new PostProcessTags(posContainer).correctCombinedTagsList();
		Assert.assertEquals(inputSentence.toLowerCase().replace(" ", ""), tokenListToConcatenatedString(posContainer.getWordTokenList()).toLowerCase());
	}
	
	private String tokenListToConcatenatedString(List<Token> tokens){
		StringBuilder sb = new StringBuilder();
		for (Token token : tokens) {
			sb.append(token.getSurface());
		}
		return sb.toString();
	}
}
