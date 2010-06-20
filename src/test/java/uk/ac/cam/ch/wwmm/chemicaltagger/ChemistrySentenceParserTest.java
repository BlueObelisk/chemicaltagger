package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.InputStream;

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
		InputStream taggedStream = getInputStream("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence1.txt");
		
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				taggedStream);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}

	@Test	
	public void testSentence2() {
		InputStream taggedStream = getInputStream("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence2.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				taggedStream);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}

	@Test	
	public void testSentence3() {
		InputStream taggedStream = getInputStream("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence3.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				taggedStream);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}
	@Test	
	public void testSentence4() {
		InputStream taggedStream = getInputStream("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence4.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				taggedStream);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}	
	
	@Test	
	public void testSentence5() {
		InputStream taggedStream = getInputStream("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence5.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				taggedStream);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}	
	@Test	
	public void testSentence6() {
		InputStream taggedStream = getInputStream("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence6.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				taggedStream);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}	


	@Test	
	public void testSentence7() {
		InputStream taggedStream = getInputStream("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence7.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				taggedStream);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}	

	@Test	
	public void testSentence8() {
		InputStream taggedStream = getInputStream("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence8.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(
				taggedStream);
		Tree t = chemChunkParser.parseTags();
		checkNodes(t);

	}	
	
	
	private InputStream getInputStream(String resourceName){
		InputStream inStream = this.getClass().getClassLoader().getResourceAsStream(resourceName);
		return inStream;
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
			//Log.info("****Text="+text+" type=="+type);
			Assert.assertNotSame("Antlr Parse Fails for the for the text '"+text+"'",0, type);
			checkNodes(astTree.getChild(i));

		}
	}

}
