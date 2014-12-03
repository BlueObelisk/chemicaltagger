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

import java.util.HashMap;

import nu.xom.Document;
import nu.xom.Element;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.Tree;
import org.apache.log4j.Logger;

/*****************************
 * Converts ANTLR ASTTrees into XML Documents.
 * 
 * @author lh359
 *****************************/

public class ASTtoXML {

	private static Logger LOG = Logger.getLogger(ASTtoXML.class);

	/********************************************
	 * Default constructor method.
	 *******************************************/
	public ASTtoXML() {
	}

	/********************************************
	 * Overloading Method that converts astTree to XML Document with
	 * ActionPhrases Included.
	 * 
	 * @param astTree
	 *            (Tree)
	 * 
	 * @return doc (Document)
	 *******************************************/
	public Document convert(Tree astTree) {

		return convert(astTree, true);
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
	public Document convert(Tree astTree, boolean annotateActionPhrases) {
		Element root = new Element("Document");
		Document doc;

		if (astTree.getChildCount() > 0) {
			if (astTree.getPayload() != null) {
				Element sentenceNode = new Element("Sentence");
				root.appendChild(getNodes(astTree, sentenceNode));
				doc = new Document(root);

			} else {
				doc = new Document(getNodes(astTree, root));
			}
		} else {
			doc = new Document(root);
		}
		if (annotateActionPhrases) {
			PostProcessTrees procTree = new PostProcessTrees();
			doc = procTree.process(doc);
		}
		return doc;
	}

	/********************************************
	 * Converts astTree to XML Document. Postprocesses the treenodes with a
	 * userdefined hashmap.
	 * 
	 * @param astTree
	 *            (Tree)
	 * @param annotateActionPhrases
	 *            (boolean)
	 * @param actionPhraseDictionary
	 *            (HashMap)
	 * @return doc (Document)
	 *******************************************/
	public Document convert(Tree astTree, boolean annotateActionPhrases,
			HashMap<String, String> actionPhraseDictionary) {

		Element root = new Element("Document");
		Document doc;

		if (astTree.getChildCount() > 0) {
			if (astTree.getPayload() != null) {
				Element sentenceNode = new Element("Sentence");
				root.appendChild(getNodes(astTree, sentenceNode));
				doc = new Document(root);

			} else {
				doc = new Document(getNodes(astTree, root));
			}
		} else {
			doc = new Document(root);
		}
		if (annotateActionPhrases) {
			PostProcessTrees procTree = new PostProcessTrees();
			procTree.setActionMap(actionPhraseDictionary);

			doc = procTree.process(doc);
		}
		return doc;
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
	public Element getNodes(Tree astTree, Element node) {

		boolean isValid = false;
		
		int nodeCount = astTree.getChildCount();

		for (int i = 0; i < nodeCount; i++) {
			Tree astChild = astTree.getChild(i);

			String text = null;

			try {
				Token token = (Token) astChild.getPayload();
				text = token.getText();
				int type = token.getType();
				if (type != Token.INVALID_TYPE) {
					isValid = true;
				}
						
			}

			catch (Exception e) {
				// TODO: handle exception
			}

			try {
				RuleContext ruleContext = (RuleContext) astChild.getPayload();
				text = ruleContext.getText();
			}

			catch (Exception e) {
				// TODO: handle exception
			}

			// int type = token.getType();
			//if (type != Token.INVALID_TYPE) {
			if (isValid) {
				if (astChild.getChildCount() == 0) {
					node.appendChild(text);
				} else {
					text = Utils.makeNCName(text);
					try {
						Element newNode = new Element(text);
						node.appendChild(newNode);
						getNodes(astChild, newNode);
					} catch (Exception e) {
						LOG.debug("Can't Parse " + e.getMessage());
					}
				}
			} else {
				Element unmatched = new Element("UnmatchedPhrase");
				unmatched.appendChild(text);
				node.appendChild(unmatched);
			}
		}
		return node;
	}
}
