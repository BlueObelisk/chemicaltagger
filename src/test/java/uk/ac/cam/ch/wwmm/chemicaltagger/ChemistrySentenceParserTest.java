package uk.ac.cam.ch.wwmm.chemicaltagger;

import junit.framework.Assert;
import nu.xom.Element;

import org.antlr.runtime.tree.Tree;
import org.junit.Test;
/*
 * Passes Tagged Sentences to the antlr chunker
 * then checks the output of the AST tree using the checkNodes(Tree) module 
 */

public class ChemistrySentenceParserTest {

	@Test
	public void testSentence() {
		String sentenceFilename = "src/test/resources/taggedText/sentence1.txt";
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				sentenceFilename);
		chemChunkParser.parseTagsToXMLFile("target/test.xml");

	}

	@Test	
	public void testSentence1() {
		String sentenceFilename = "src/test/resources/taggedText/sentence1.txt";
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				sentenceFilename);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}

	@Test	
	public void testSentence2() {
		String sentenceFilename = "src/test/resources/taggedText/sentence2.txt";
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				sentenceFilename);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}

	@Test	
	public void testSentence3() {
		String sentenceFilename = "src/test/resources/taggedText/sentence3.txt";
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				sentenceFilename);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}
	@Test	
	public void testSentence4() {
		String sentenceFilename = "src/test/resources/taggedText/sentence4.txt";
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				sentenceFilename);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}	
	
	@Test	
	public void testSentence5() {
		String sentenceFilename = "src/test/resources/taggedText/sentence5.txt";
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				sentenceFilename);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}	
	/*
	 * Goes through the nodes of a tree and checks for unexpected tokens(when type=0)
	 */
	private void checkNodes(Tree astTree) {
		int nodeCount = astTree.getChildCount();
		Element newNode = null;
		for (int i = 0; i < nodeCount; i++) {
			String text = astTree.getChild(i).getText();
			int type = astTree.getChild(i).getType();
			System.err.println("**********type = " + type + " text= " + text);
			Assert.assertNotSame(0, type);
			checkNodes(astTree.getChild(i));

		}
	}

}
