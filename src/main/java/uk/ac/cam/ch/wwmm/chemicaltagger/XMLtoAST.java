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

import java.util.ArrayList;
import java.util.List;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Text;

import org.antlr.runtime.tree.ParseTree;

/*****************************
 * Converts ANTLR ASTTrees into XML Documents.
 * 
 * @author lh359
 *****************************/

public class XMLtoAST {

	private List<String> SentenceList;
	private ParseTree parseTree;

	public XMLtoAST() {
		SentenceList = new ArrayList<String>();
	}

	/********************************************
	 * Converts AST Trees to XML Document.
	 * 
	 * @param astTree
	 *            (Tree)
	 * @param annotateActionPhrases
	 *            (boolean)
	 * @return doc (Document)
	 *******************************************/
	public Document convert(Document doc) {
		parseTree = new ParseTree("Document");
		SentenceList = new ArrayList<String>();
		getNodes(doc.getRootElement(), parseTree);

		return doc;
	}

	public String getStringTree() {
		return parseTree.toStringTree();
	}

	public List<String> getSentenceList() {
		return SentenceList;
	}

	/**********************************************
	 * A recursive function that goes through the leaves of the tree to create
	 * XML nodes.
	 * 
	 * @param astTree
	 *            (Tree)
	 * @param node
	 *            (Element)
	 * @return node (Element)
	 **********************************************/
	public void getNodes(Element docElement, ParseTree treeNode) {

		int nodeCount = docElement.getChildCount();

		for (int i = 0; i < nodeCount; i++) {
			if (docElement.getChild(i) instanceof Text) {
				treeNode.addChild(new ParseTree(docElement.getChild(i)
						.getValue()));
			}

			else {
				Element docChild = (Element) docElement.getChild(i);
				String name = docChild.getLocalName();

				if (docChild.getAttribute("type") != null) {
					name = docChild.getLocalName() + "_"
							+ docChild.getAttributeValue("type");
				}
				ParseTree subTree = new ParseTree(name);
				treeNode.addChild(subTree);

				getNodes(docChild, subTree);
				if (name.startsWith("Sentence")
						&& !(docChild.toXML().contains("Unmatched"))) {
					SentenceList.add(subTree.toStringTree());
				}

			}
		}

	}

}
