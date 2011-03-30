package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.Assert;
import nu.xom.Document;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

/*****************************
 * Passes Tagged Sentences to the antlr chunker. Then checks the output of the
 * AST tree using the checkNodes(astTree) module.
 * 
 * @author lh359, dl387
 *****************************/

public class ChemistrySentenceParserTest {

	@Test
	public void testSentence1() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence1.txt");

		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence2() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence2.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence3() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence3.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence4() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence4.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence5() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence5.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence6() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence6.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence7() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence7.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence8() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence8.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testEmptyInput() {
		InputStream in = IOUtils.toInputStream("");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(in);
		chemChunkParser.parseTags();
		Document doc = chemChunkParser.makeXMLDocument();
		Assert.assertNull(doc);
	}

}
