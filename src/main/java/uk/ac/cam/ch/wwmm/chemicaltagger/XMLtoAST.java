package uk.ac.cam.ch.wwmm.chemicaltagger;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Text;

import org.antlr.runtime.tree.ParseTree;

/*****************************
 * Converts ANTLR ASTTrees into
 *  XML Documents.
 * 
 * @author lh359
 *****************************/

public class XMLtoAST {




	/********************************************
	 * Converts AST Trees to XML Document.
	 * 
	 * @param astTree (Tree)
	 * @param annotateActionPhrases (boolean)
	 * @return doc (Document)
	 *******************************************/
	public Document convert(Document doc) {
		ParseTree tree =  new ParseTree("Document");
		getNodes(doc.getRootElement(),tree);
	    System.out.println(tree.toStringTree());
	
	
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
	public void getNodes(Element docElement, ParseTree treeNode) {
        
		int nodeCount = docElement.getChildCount();

		for (int i = 0; i < nodeCount; i++) {
			if ( docElement.getChild(i)  instanceof Text) {
                treeNode.addChild(new ParseTree(docElement.getChild(i).getValue()));
			}
			
			else {
				Element docChild = (Element) docElement.getChild(i) ;
                String name = docChild.getLocalName();
                if (docChild.getAttribute("type") != null) {
                	name = docChild.getLocalName()+"_"+docChild.getAttributeValue("type");
                }
				ParseTree subTree = new ParseTree(name);
				treeNode.addChild(subTree);
				getNodes(docChild,subTree);
			}
		}
		
	}
	
	

}
