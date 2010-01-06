package uk.ac.cam.ch.wwmm.chemicaltagger;

import junit.framework.Assert;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

/*****************************
 * Passes Tagged Sentences to
 * the antlr chunker.
 * Then checks the output of 
 * the AST tree using the 
 * checkNodes(astTree) module.
 *  
 * @author lh359 
 *****************************/

public class ChemistrySentenceParserTest {



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
	/*****************************
	 * CheckNodes(Tree astTree)
	 * 
	 * @param astTree
	 * Goes through the nodes of a
	 * tree and checks for unexpected
	 * tokens(when type=0)
	 *****************************/
	private void checkNodes(Tree astTree) {
		int nodeCount = astTree.getChildCount();
		for (int i = 0; i < nodeCount; i++) {
			String text = astTree.getChild(i).getText();
			int type = astTree.getChild(i).getType();
			Assert.assertNotSame("Type was 0 for the text '"+text+"'",0, type);
			checkNodes(astTree.getChild(i));

		}
	}

}
