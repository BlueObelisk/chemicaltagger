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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import nu.xom.Element;
import nu.xom.Nodes;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.IOUtils;

/*****************************
 * Static methods used in the test classes.
 * 
 * @author dl387
 *****************************/

public class UtilityMethods {

	/*************************************************************
	 * Checks whether the text children of the astTree are the same as the text
	 * present in the tagged text.
	 * 
	 * @param astTree
	 * @param taggedText
	 **********************************************************/
	static void checkTreeText(Tree astTree, String taggedText) {
		List<String> textChildren = new ArrayList<String>();
		List<String> referenceChildren = new ArrayList<String>();
		UtilityMethods.getTextChildrenFromAst(astTree, textChildren);
		String[] reference = taggedText.split(" ");
		for (int i = 0; i < reference.length; i++) {
			if (i % 2 == 1) {
				referenceChildren.add(reference[i]);
			}
		}
		Assert.assertEquals(referenceChildren.size(), textChildren.size());
		for (int i = 0; i < referenceChildren.size(); i++) {
			Assert.assertEquals(referenceChildren.get(i), textChildren.get(i));
		}
	}

	/*****************************************************************************
	 * Goes through the nodes of a tree and checks for unexpected tokens(when
	 * type=0).
	 * 
	 * @param astTree
	 *            (Tree)
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
	 * 
	 * @param astTree
	 * @param textChildren
	 *************************************************/
	static void getTextChildrenFromAst(Tree astTree, List<String> textChildren) {
		int nodeCount = astTree.getChildCount();
		for (int i = 0; i < nodeCount; i++) {
			Tree child = astTree.getChild(i);
			getTextChildrenFromAst(child, textChildren);
		}
		if (nodeCount == 0) {
			textChildren.add(astTree.getText());
		}
	}

	/************************************************
	 * Compares the contents of the nodes with the expected outputs.
	 * @param parsedNodes
	 * @param fileName
	 **************************************************/
	
	@SuppressWarnings("unchecked")
	static void compareParsedToExpectedOutput(Nodes parsedNodes, String fileName) {

		List<String> expectedList = new ArrayList<String>();
		List<String> actualList = new ArrayList<String>(); 
		try {
			InputStream in  = Utils.getInputStream(new UtilityMethods().getClass(), fileName);
			expectedList = IOUtils.readLines(in,"UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < parsedNodes.size(); i++) {

			String type = "None";
			Element nodeElement = (Element) parsedNodes.get(i);
			if (nodeElement.getAttribute("type") != null)
				type = nodeElement.getAttribute("type").getValue();
                actualList.add(type+": "+ExtractFromXML.getStringValue(nodeElement, " "));
		}
		List<String> tmpExpectedList = new ArrayList<String>(expectedList);
		// Checks if expectedList contains all the nodes of actualList
		expectedList.removeAll(actualList);

		
		Assert.assertTrue("ExpectedList has all nodes from the actualList", expectedList.isEmpty());
	
    	// Checks if actualList contains all the nodes of expectedList
		actualList.removeAll(tmpExpectedList);
        Assert.assertTrue("ActualList has all nodes from the expectedList", actualList.isEmpty());
	}


}