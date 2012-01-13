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
package uk.ac.cam.ch.wwmm.chemicaltagger.modelParser;

import nu.xom.Document;
import nu.xom.Element;
import opennlp.tools.parser.Parse;

import org.apache.commons.lang.StringUtils;

/*****************************
 * Converts OpenNLP Parse Trees into XML Documents.
 * 
 * @author lh359
 *****************************/

public class ParseTreetoXML {


	/********************************************
	 * Default constructor method.
	 *******************************************/
	public ParseTreetoXML() {
	}

	/********************************************
	 * Converts Parse Trees to XML Document.
	 * 
	 * @param parseTree
	 *            (Tree)
	 *******************************************/
	public Document convert(Parse parseTree) {
		Element root = new Element("Document");
		Document doc;

		if (parseTree.getChildCount() > 0) {
			if (StringUtils.isNotEmpty(parseTree.getText())) {
				Element sentenceNode = new Element("Sentence");
				root.appendChild(getNodes(parseTree, sentenceNode));
				doc = new Document(root);

			} else {
				doc = new Document(getNodes(parseTree, root));
			}
		} else {
			doc = new Document(root);
		}

		return doc;
	}

	/**********************************************
	 * A recursive function that goes through the leaves of the tree to create
	 * XML nodes.
	 * 
	 * @param parseTree (Tree)
	 * @param node (Element)
	 * @return node (Element)
	 **********************************************/
	public Element getNodes(Parse parseTree, Element node) {

		for (Parse treeNode : parseTree.getChildren()) {
			if (treeNode.getChildCount() == 0) {
				String text = treeNode.toString();
				node.appendChild(text);
			} else {

				Element newNode = new Element(treeNode.getType());
				node.appendChild(newNode);
				getNodes(treeNode, newNode);

			}
		}
		return node;
	}
}
