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

import org.junit.Assert;
import nu.xom.Document;
import nu.xom.Nodes;

import org.antlr.runtime.tree.Tree;
import org.junit.Test;

/*****************************************************
 * Tests the tagging and parsing within ChemicalTagger.
 * Tests, normalising, tagging, antlr parsing, the output of the XML Document and 
 * checks that nothing gets lost in the processing.
 * 
 * @author lh359, dl387
 *****************************/
public class FullParseTest {

	@Test
	public void testFullParse1()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph1.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref1.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph1.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph1.txt");
		Assert.assertEquals("Sentence node size",4, sentenceNodes.size());
		Assert.assertEquals("Action node size",10, actionNodes.size());
		Assert.assertEquals("Molecule node size",7, moleculeNodes.size());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse2()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph2.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref2.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph2.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph2.txt");
		Assert.assertEquals("Sentence node size",3, sentenceNodes.size());
		Assert.assertEquals("Action node size",10, actionNodes.size());
		Assert.assertEquals("Molecule node size",6, moleculeNodes.size());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse3()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph3.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref3.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph3.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph3.txt");
		Assert.assertEquals("Sentence node size",6, sentenceNodes.size());
		Assert.assertEquals("Action node size",15, actionNodes.size());
		Assert.assertEquals("Molecule node size",9, moleculeNodes.size());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse4()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph4.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref4.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph4.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph4.txt");
		Assert.assertEquals("Sentence node size",5, sentenceNodes.size());
		Assert.assertEquals("Action node size",10, actionNodes.size());
		Assert.assertEquals("Molecule node size",8, moleculeNodes.size());
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse5()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph5.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref5.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		text = posContainer.getInputText();
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph5.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph5.txt");
		Assert.assertEquals("Sentence node size",4, sentenceNodes.size());
		Assert.assertEquals("Action node size",8, actionNodes.size());
		Assert.assertEquals("Molecule node size",9, moleculeNodes.size());
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse6()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph6.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref6.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		text = posContainer.getInputText();
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph6.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph6.txt");
		Assert.assertEquals("Sentence node size",2, sentenceNodes.size());
		Assert.assertEquals("Action node size",7, actionNodes.size());
		Assert.assertEquals("Molecule node size",5, moleculeNodes.size());
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse7()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph7.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref7.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		text = posContainer.getInputText();
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph7.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph7.txt");
		Assert.assertEquals("Sentence node size",4, sentenceNodes.size());
		Assert.assertEquals("Action node size",8, actionNodes.size());
		Assert.assertEquals("Molecule node size",9, moleculeNodes.size());
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse8()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph8.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref8.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph8.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph8.txt");
		Assert.assertEquals("Sentence node size",4, sentenceNodes.size());
		Assert.assertEquals("Action node size",7, actionNodes.size());
		Assert.assertEquals("Molecule node size",7, moleculeNodes.size());
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse9()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph9.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref9.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		text = posContainer.getInputText();
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph9.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph9.txt");
		Assert.assertEquals("Sentence node size",9, sentenceNodes.size());
		Assert.assertEquals("Action node size",15, actionNodes.size());
		Assert.assertEquals("Molecule node size",11, moleculeNodes.size());
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	
	@Test
	public void testFullParse10()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph10.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref10.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		text = posContainer.getInputText();
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();		
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph10.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph10.txt");
		Assert.assertEquals("Sentence node size",10, sentenceNodes.size());
		Assert.assertEquals("Action node size",30, actionNodes.size());
		Assert.assertEquals("Molecule node size",23, moleculeNodes.size());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse11()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph11.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref11.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph11.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph11.txt");
		Assert.assertEquals("Sentence node size",1, sentenceNodes.size());
		Assert.assertEquals("Action node size",2, actionNodes.size());
		Assert.assertEquals("Molecule node size",3, moleculeNodes.size());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse12()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph12.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref12.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes nounPhraseNodes = doc.query("//NounPhrase");
		Nodes verbPhraseNodes = doc.query("//VerbPhrase");
		UtilityMethods.compareParsedToExpectedOutput(verbPhraseNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/verbPhrases12.txt");
		UtilityMethods.compareParsedToExpectedOutput(nounPhraseNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/nounPhrases12.txt");
		Assert.assertEquals("Sentence node size",1, sentenceNodes.size());
		Assert.assertEquals("NounPhrases size",2, nounPhraseNodes.size());
		Assert.assertEquals("VerbPhrases size",1, verbPhraseNodes.size());
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse13()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph13.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref13.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes nounPhraseNodes = doc.query("//NounPhrase");
		Nodes verbPhraseNodes = doc.query("//VerbPhrase");
		UtilityMethods.compareParsedToExpectedOutput(nounPhraseNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/nounPhrases13.txt");
		UtilityMethods.compareParsedToExpectedOutput(verbPhraseNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/verbPhrases13.txt");
		Assert.assertEquals("Sentence node size",1, sentenceNodes.size());
		Assert.assertEquals("NounPhrases size",2, nounPhraseNodes.size());
		Assert.assertEquals("VerbPhrases size",1, verbPhraseNodes.size());
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}



	@Test
	public void testFullParse14()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph14.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref14.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph14.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph14.txt");
        Assert.assertEquals("Sentence node size",1, sentenceNodes.size());
		Assert.assertEquals("Action node size",0, actionNodes.size());
		Assert.assertEquals("Molecule node size",5, moleculeNodes.size());
		Assert.assertEquals(1, doc.query("//Sentence").size());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());
	}

	@Test
	public void testFullParse15()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph15.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref15.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph15.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph15.txt");
        Assert.assertEquals("Sentence node size",1, sentenceNodes.size());
		Assert.assertEquals("Action node size",4, actionNodes.size());
		Assert.assertEquals("Molecule node size",4, moleculeNodes.size());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());

	}

	@Test
	public void testFullParse16()  {
		String text = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/paragraph16.txt");
		String expectedTags = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/ref16.txt");
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		Assert.assertEquals("Spectra List size", 0, posContainer.getSpectrumElementList().getChildCount());
		Assert.assertEquals("Tagging Output",expectedTags, posContainer.getTokenTagTupleAsString());
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		Document doc = chemistrySentenceParser.makeXMLDocument();
		Nodes sentenceNodes = doc.query("//Sentence");
		Nodes actionNodes = doc.query("//ActionPhrase");
		Nodes moleculeNodes = doc.query("//MOLECULE");
		UtilityMethods.compareParsedToExpectedOutput(moleculeNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/moleculeParagraph16.txt");
		UtilityMethods.compareParsedToExpectedOutput(actionNodes, "/uk/ac/cam/ch/wwmm/chemicaltagger/fullParseTest/actionsParagraph16.txt");
		Assert.assertEquals("Sentence node size",1, sentenceNodes.size());
		Assert.assertEquals("Action node size",2, actionNodes.size());
		Assert.assertEquals("Molecule node size",2, moleculeNodes.size());
		Assert.assertEquals("Input string is equal to output content", text.replace(" ", "").toLowerCase(), doc.getValue().toLowerCase());

	}


}
