package uk.ac.cam.ch.wwmm.chemicaltagger;


import nu.xom.Document;
import nu.xom.Element;

import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;

/*****************************
 * 
 * Converts ASTTrees to XML.
 * @author lh359
 *****************************/
public class ASTtoXML {

    final Logger LOG = Logger.getLogger(ASTtoXML.class);

    public ASTtoXML() {
    }



	/********************************************
	 * Main Function
	 * Converts astTree to XML Document.
	 * Calls the recursive function getNodes.
	 * @param astTree (Tree)
	 * @return doc (Document)
	 *******************************************/
    public Document convert(Tree astTree) {
    	System.err.println(astTree.toStringTree());
        Element root = new Element("Document");
        Document doc = new Document(getNodes(astTree, root));
        return doc;
    }

    /**********************************************
     * A recursive function that goes through 
     * the leaves of the tree to create XML nodes.
     * @param astTree (Tree)
     * @param node (Element)
     * @return node (Element)
     **********************************************/
	public Element getNodes(Tree astTree, Element node) {

		int nodeCount = astTree.getChildCount();
		Element newNode = null;
		for (int i = 0; i < nodeCount; i++) {
			String text = astTree.getChild(i).getText();
			int type = astTree.getChild(i).getType();
			LOG.debug("Type = " + type + " text= " + text);
			if (type == 9) {
				newNode.appendChild(text);
			} else if (type != 0) {
				text = Utils.makeNCName(text);
				try {
					newNode = new Element(text);
					node.appendChild(newNode);
					getNodes(astTree.getChild(i), newNode);
				} catch (Exception e) {
					LOG.debug("Can't Parse " + e.getMessage());
				}
			}

		}
		return node;
	}
}

