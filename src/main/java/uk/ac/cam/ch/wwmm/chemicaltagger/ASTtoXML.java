package uk.ac.cam.ch.wwmm.chemicaltagger;


import nu.xom.Document;
import nu.xom.Element;

import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;


public class ASTtoXML {

    final Logger LOG = Logger.getLogger(ASTtoXML.class);

    public ASTtoXML() {
    }



    public Document convert(Tree astTree) {
    	System.err.println(astTree.toStringTree());
        Element root = new Element("Document");
        Document doc = new Document(getNodes(astTree, root));
        return doc;
    }

	public Element getNodes(Tree astTree, Element node) {

		int nodeCount = astTree.getChildCount();
		Element newNode = null;
		for (int i = 0; i < nodeCount; i++) {
			String text = astTree.getChild(i).getText();
			int type = astTree.getChild(i).getType();
			System.err.println("**********type = " + type + " text= " + text);
			if (type == 9) {
				newNode.appendChild(text);
			} else if (type != 0) {
				// text = CMLUtil.makeNCName(text);
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

