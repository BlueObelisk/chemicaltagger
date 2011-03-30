package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import nu.xom.Element;
import nu.xom.Nodes;

import org.antlr.runtime.tree.Tree;


/*****************************
 * Static methods used in the test classes.
 * 
 * @author dl387
 *****************************/

public class UtilityMethods {

	/*************************************************************
	 * Checks whether the text children of the astTree are the same as the text present in the tagged text.
	 * 
	 * @param astTree
	 * @param taggedText
	 **********************************************************/
	static void checkTreeText(Tree astTree, String taggedText) {
		List<String> textChildren = new ArrayList<String>();
		List<String> referenceChildren = new ArrayList<String>();
		UtilityMethods.getTextChildrenFromAst(astTree, textChildren);
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

	/*****************************************************************************
	 * Goes through the nodes of a tree and checks for unexpected tokens(when type=0).
	 * @param astTree(Tree)
	 *****************************************************************************/
	static void checkForErrorNodes(Tree astTree) {
		int nodeCount = astTree.getChildCount();
		for (int i = 0; i < nodeCount; i++) {
			String text = astTree.getChild(i).getText();
			int type = astTree.getChild(i).getType();
			Assert.assertNotSame("Antlr Parse Fails for the for the text '"
					+ text + "'", 0, type);
			checkForErrorNodes(astTree.getChild(i));
	
		}
	}

	/************************************************
	 * Gets the children from an Abstract Tree.
	 * @param astTree
	 * @param textChildren
	 *************************************************/
	static void getTextChildrenFromAst(Tree astTree, List<String> textChildren) {
		int nodeCount = astTree.getChildCount();
		for (int i = 0; i < nodeCount; i++) {
			Tree child = astTree.getChild(i);
			getTextChildrenFromAst(child, textChildren);
		}
		if (nodeCount==0){
			textChildren.add(astTree.getText());
		}
	}
	
	/************************************************
	 *Write out files
	 *************************************************/
	static void writeOut(Nodes nodes, String name) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("target/"+name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < nodes.size(); i++) {
			try {
				fileWriter.write(ExtractFromXML.getStringValue((Element) nodes.get(i), " ")+"\n");
			    fileWriter.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}