package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import nu.xom.Document;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

/*****************************
 * Passes Tagged Sentences to the antlr chunker. Then checks the output of the
 * AST tree using the checkNodes(astTree) module.
 * 
 * @author lh359
 *****************************/

public class ChemistrySentenceParserTest {

	@Test
	public void testSentence1() throws IOException {
		String input = getInputFromFile("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence1.txt");

		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		checkForErrorNodes(t);
		checkTreeText(t, input);
	}

	@Test
	public void testSentence2() throws IOException {
		String input = getInputFromFile("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence2.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		checkForErrorNodes(t);
		checkTreeText(t, input);
	}

	@Test
	public void testSentence3() throws IOException {
		String input = getInputFromFile("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence3.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		checkForErrorNodes(t);
		checkTreeText(t, input);
	}

	@Test
	public void testSentence4() throws IOException {
		String input = getInputFromFile("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence4.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		checkForErrorNodes(t);
		checkTreeText(t, input);
	}

	@Test
	public void testSentence5() throws IOException {
		String input = getInputFromFile("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence5.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		checkForErrorNodes(t);
		checkTreeText(t, input);
	}

	@Test
	public void testSentence6() throws IOException {
		String input = getInputFromFile("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence6.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		checkForErrorNodes(t);
		checkTreeText(t, input);
	}

	@Test
	public void testSentence7() throws IOException {
		String input = getInputFromFile("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence7.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		checkForErrorNodes(t);
		checkTreeText(t, input);
	}

	@Test
	public void testSentence8() throws IOException {
		String input = getInputFromFile("uk/ac/cam/ch/wwmm/chemicaltagger/parseTest/sentence8.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		checkForErrorNodes(t);
		checkTreeText(t, input);
	}

	@Test
	public void testEmptyInput() {
		InputStream in = IOUtils.toInputStream("");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(in);
		chemChunkParser.parseTags();
		Document doc = chemChunkParser.makeXMLDocument();
		Assert.assertNull(doc);
	}

	private String getInputFromFile(String resourceName) throws IOException {
		InputStream inStream = this.getClass().getClassLoader()
				.getResourceAsStream(resourceName);
		return IOUtils.toString(inStream);
	}
	
	

	/*****************************
	 * CheckNodes(Tree astTree)
	 * 
	 * @param astTree
	 *            Goes through the nodes of a tree and checks for unexpected
	 *            tokens(when type=0)
	 *****************************/
	private void checkForErrorNodes(Tree astTree) {
		int nodeCount = astTree.getChildCount();
		for (int i = 0; i < nodeCount; i++) {
			String text = astTree.getChild(i).getText();
			int type = astTree.getChild(i).getType();
			// Log.info("****Text="+text+" type=="+type);
			Assert.assertNotSame("Antlr Parse Fails for the for the text '"
					+ text + "'", 0, type);
			checkForErrorNodes(astTree.getChild(i));

		}
	}
	
	/****************************
	 * Checks whether the text children of the astTree are the same as the text present
	 * in the tagged text.
	 * 
	 * @param astTree
	 * @param taggedText
	 ***************************/
	private void checkTreeText(Tree astTree, String taggedText) {
		List<String> textChildren = new ArrayList<String>();
		List<String> referenceChildren = new ArrayList<String>();
		getTextChildrenFromAst(astTree, textChildren);
		String[] reference  =taggedText.split(" ");
		for (int i = 0; i < reference.length; i++) {
			if (i%2==1){
				referenceChildren.add(reference[i]);
			}
		}
		Assert.assertEquals(referenceChildren.size(), textChildren.size());
		for (int i = 0; i < referenceChildren.size(); i++) {
			Assert.assertEquals(referenceChildren.get(i), textChildren.get(i));
		}
	}

	private void getTextChildrenFromAst(Tree astTree, List<String> textChildren) {
		int nodeCount = astTree.getChildCount();
		for (int i = 0; i < nodeCount; i++) {
			Tree child = astTree.getChild(i);
			getTextChildrenFromAst(child, textChildren);
		}
		if (nodeCount==0){
			textChildren.add(astTree.getText());
		}
	}

}
