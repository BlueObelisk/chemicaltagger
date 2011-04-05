package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.HashMap;

import nu.xom.Document;
import nu.xom.Element;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/*****************************
 * Converts ANTLR ASTTrees into
 *  XML Documents.
 * 
 * @author lh359
 *****************************/

public class ASTtoXML {

	private static final Logger LOG = Logger.getLogger(ASTtoXML.class);

	/********************************************
	 * Default constructor method.
	 *******************************************/
	public ASTtoXML() {
	}

	/********************************************
	 * Overloading Method that converts astTree 
	 * to XML Document with ActionPhrases Included.
	 * 
	 * @param astTree (Tree)
	 *            
	 * @return doc (Document)
	 *******************************************/
	public final Document convert(final Tree astTree) {

		return convert(astTree, true);
	}

	/********************************************
	 * Converts AST Trees to XML Document.
	 * 
	 * @param astTree (Tree)
	 * @param annotateActionPhrases (boolean)
	 * @return doc (Document)
	 *******************************************/
	public final Document convert(final Tree astTree, final boolean annotateActionPhrases) {
		Element root = new Element("Document");
		Document doc = null;
		if (astTree.getChildCount() > 0) {
			if (StringUtils.isNotEmpty(astTree.getText())) {
				Element sentenceNode = new Element("Sentence");
				root.appendChild(getNodes(astTree, sentenceNode));
				doc = new Document(root);

			} else {
				doc = new Document(getNodes(astTree, root));
			}
		}
		if (annotateActionPhrases) {
			PostProcessTrees procTree = new PostProcessTrees();
			if (doc == null){
				return null;
			}
			doc = procTree.process(doc);
		}
		return doc;
	}

	
	/********************************************
	 * Converts astTree to XML Document.
	 * Postprocesses the treenodes with a userdefined 
	 * hashmap. 
	 * 
	 * @param astTree (Tree)
	 * @param annotateActionPhrases (boolean)
	 * @param actionPhraseDictionary (HashMap)
	 * @return doc (Document)
	 *******************************************/
	public final Document convert(final Tree astTree, final boolean annotateActionPhrases,
			final HashMap<String, String> actionPhraseDictionary) {
		
		Element root = new Element("Document");
		Document doc = null;
		if (astTree.getChildCount() > 0) {
			if (StringUtils.isNotEmpty(astTree.getText())) {
				Element sentenceNode = new Element("Sentence");
				root.appendChild(getNodes(astTree, sentenceNode));
				doc = new Document(root);

			} else {
				doc = new Document(getNodes(astTree, root));
			}
		}
		if (annotateActionPhrases) {
			PostProcessTrees procTree = new PostProcessTrees();
			procTree.setActionMap(actionPhraseDictionary);
			if (doc == null) {
				return null;
			}
			doc = procTree.process(doc);
		}
		return doc;
	}

	/**********************************************
	 * A recursive function that goes through the 
	 * leaves of the tree to create XML nodes.
	 * 
	 * @param astTree (Tree)
	 * @param node (Element)
	 * @return node (Element)
	 **********************************************/
	public final Element getNodes(final Tree astTree, final Element node) {

		int nodeCount = astTree.getChildCount();

		for (int i = 0; i < nodeCount; i++) {
			Tree astChild = astTree.getChild(i);
			String text = astChild.getText();
			int type = astChild.getType();
			if (type != Token.INVALID_TOKEN_TYPE) {
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
