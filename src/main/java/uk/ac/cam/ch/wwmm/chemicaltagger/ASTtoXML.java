package uk.ac.cam.ch.wwmm.chemicaltagger;

import nu.xom.Document;
import nu.xom.Element;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import uk.ac.cam.ch.wwmm.pregenerated.ChemicalChunkerParser;

/*****************************
 * 
 * Converts ASTTrees to XML.
 * 
 * @author lh359
 *****************************/
public class ASTtoXML {

	final Logger LOG = Logger.getLogger(ASTtoXML.class);

	public ASTtoXML() {
	}

	/********************************************
	 * Main Function Converts astTree to XML Document. Calls the recursive
	 * function getNodes.
	 * 
	 * @param astTree
	 *            (Tree)
	 * @return doc (Document)
	 *******************************************/
	public Document convert(Tree astTree) {

		return convert(astTree, false);
	}

	/********************************************
	 * Main Function Converts astTree to XML Document. Calls the recursive
	 * function getNodes.
	 * 
	 * @param astTree
	 *            (Tree)
	 * @return doc (Document)
	 *******************************************/
	public Document convert(Tree astTree, boolean postProcess) {
		Element root = new Element("Document");
		Document doc = null;
		if (astTree.getChildCount() > 0) {
			if (StringUtils.isNotEmpty(astTree.getText())) {
				Element sentenceNode = new Element("Sentence");
				root.appendChild(getNodes(astTree, sentenceNode));
				doc = new Document(root);

			} else
				doc = new Document(getNodes(astTree, root));
		}
		if (postProcess) {
			PostProcessTrees procTree = new PostProcessTrees();
			if (doc == null)
				return null;
			doc = procTree.process(doc);
		}
		return doc;
	}

	/************************
	 * Set the types of phrases
	 * 
	 * @param doc
	 * @return
	 */

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

		int nodeCount = astTree.getChildCount();

		for (int i = 0; i < nodeCount; i++) {
			Tree astChild = astTree.getChild(i);
			String text = astChild.getText();
			int type = astChild.getType();
			if (type != Token.INVALID_TOKEN_TYPE) {
				if (astChild.getChildCount() == 0) {
					// if (type == ChemicalChunkerParser.TOKEN) {
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
