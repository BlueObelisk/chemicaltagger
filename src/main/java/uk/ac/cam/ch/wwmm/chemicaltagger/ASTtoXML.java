package uk.ac.cam.ch.wwmm.chemicaltagger;


import java.util.HashMap;

import nu.xom.Attribute;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Nodes;

import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;

/*****************************
*
* Converts ASTTrees to XML.
* @author lh359
*****************************/
public class ASTtoXML {

   final Logger LOG = Logger.getLogger(ASTtoXML.class);
   public final static HashMap<String, String> actionMap = new HashMap<String, String>();
         public ASTtoXML() {
              //Add Tokens
       actionMap.put("VB-ADD", "Add");
       actionMap.put("NN-ADD", "Add");
       actionMap.put("VB-CHARGE", "Add");
       actionMap.put("NN-MIXTURE", "Add");
       actionMap.put("VB-CONTAIN", "Add");
       actionMap.put("VB-DROP", "Add");
       actionMap.put("VB-FILL", "Add");
       actionMap.put("VB-SUSPEND", "Add");
       actionMap.put("VB-TREAT", "Add");
                                         //        Apparatus Tokens
       actionMap.put("VB-APPARATUS", "Apparatus");
       actionMap.put("NN-APPARATUS", "Apparatus");
              //        Concentrate Tokens
       actionMap.put("VB-CONCENTRATE", "Concentrate");
       actionMap.put("NN-CONCENTRATE", "Concentrate");
              //        Cool Tokens
       actionMap.put("VB-COOL", "Cool");
              //        Degass Tokens
       actionMap.put("VB-DEGASS", "Degass");

//        Dissolve Tokens
       actionMap.put("VB-DISSOLVE", "Dissolve");
       //        Dry Tokens
       actionMap.put("VB-DRY", "Dry");
       actionMap.put("NN-DRY", "Dry");
       //        Extract Tokens
       actionMap.put("VB-EXTRACT", "Extract");
       actionMap.put("NN-EXTRACT", "Extract");

   //        Filter Tokens
       actionMap.put("VB-FILTER", "Filter");
       actionMap.put("NN-FILTER", "Filter");

//        Heat Tokens
       actionMap.put("VB-HEAT", "Heat");
       actionMap.put("VB-INCREASE", "Heat");
              //        Partition Tokens
       actionMap.put("VB-PARTITION", "Partition");

//        Precipitate Tokens
       actionMap.put("VB-PRECIPITATE", "Precipitate");
       actionMap.put("VB-PRECIPITATE", "Precipitate");
       //        Purify Tokens

       actionMap.put("VB-PURIFY", "Purify");
       actionMap.put("NN-PURIFY", "Purify");

//        Quench Tokens
       actionMap.put("VB-QUENCH", "Quench");

//        Recover Tokens
       actionMap.put("VB-RECOVER", "Recover");
       //        Remove Tokens
       actionMap.put("VB-REMOVE", "Remove");
       actionMap.put("NN-REMOVE", "Remove");

       //        Stir Tokens
       actionMap.put("VB-STIR", "Stir");
       //        Synthesize Tokens
       actionMap.put("VB-SYNTHESIZE", "Synthesize");
       actionMap.put("NN-SYNTHESIZE", "Synthesize");

//        Wait Tokens
       actionMap.put("VB-WAIT", "Wait");

//        Wash Tokens
       actionMap.put("VB-WASH", "Wash");
//        Yield Tokens
       actionMap.put("VB-YIELD", "Yield");
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
       doc = setAttribute(doc);
       return doc;
   }

      /************************
    * Set the types of phrases
    * @param doc
    * @return
    */
   private Document setAttribute(Document doc) {
       // TODO Auto-generated method stub
       Nodes nodes = doc.query("//NounPhrase|//VerbPhrase");
       for (int i = 0; i < nodes.size(); i++) {
           Element node = (Element) nodes.get(i);
           String content = node.toXML();
           for (String keyword: actionMap.keySet()){
               if (content.contains(keyword)){
                   Attribute attribute = new Attribute("type", actionMap.get(keyword));
                   node.addAttribute(attribute);
               }
           }
                             }
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
           //LOG.debug("Type = " + type + " text= " + text);
           if (type == 10) {
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

