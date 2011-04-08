package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import nu.xom.Attribute;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.Node;
import nu.xom.Nodes;
/***********************************************
 * Passes tagged sentences to the ANTLR grammar. 
 * And converts the output to an XML document.
 * 
 * @author lh359, dl387
 *****************************************/
public class PostProcessTrees {
	private HashMap<String, String> actionMap = new HashMap<String, String>();
	private static List<String> splitList = new ArrayList<String>();
    private boolean includeWaitPhrase = true;     
	static{
		splitList.add("comma");
		splitList.add("cc");
		splitList.add("stop");
		splitList.add("colon");
		splitList.add("rb-conj");
	}

	/********************************
	 * Default Constructor method.
	 ********************************/
	public PostProcessTrees() {
		actionMap = new HashMap<String, String>();
	}
	
	/********************************
	 * Getter method for actionMap.
	 * @return actionMap (HashMap)
	 ********************************/
	public HashMap<String, String> getActionMap() {
		return actionMap;
	}

	/********************************
	 * Getter method for actionMap.
	 * "param actionMap (HashMap)
	 ********************************/
	public void setActionMap(HashMap<String, String> actionMap) {
		this.actionMap = actionMap;
		includeWaitPhrase = false;
	}
	
	/********************************
	 * Loads default ActionMap for ChemicalTagger.
	 ********************************/
	public void loadDefaultActionMap(){
		// Add Tokens
		actionMap.put("VB-ADD", "Add");
		actionMap.put("NN-ADD", "Add");
		actionMap.put("VB-CHARGE", "Add");
		actionMap.put("NN-MIXTURE", "Add");
		actionMap.put("VB-CONTAIN", "Add");
		actionMap.put("VB-DILUTE", "Add");
		actionMap.put("VB-DROP", "Add");
		actionMap.put("VB-FILL", "Add");
		actionMap.put("VB-TREAT", "Add");
		// Apparatus Tokens
		actionMap.put("VB-APPARATUS", "ApparatusAction");
		// Concentrate Tokens
		actionMap.put("VB-CONCENTRATE", "Concentrate");
		actionMap.put("NN-CONCENTRATE", "Concentrate");
		// Cool Tokens
		actionMap.put("VB-COOL", "Cool");
		// Degass Tokens
		actionMap.put("VB-DEGASS", "Degass");
		actionMap.put("VB-SUBJECT", "Degass");
		// Dissolve Tokens
		actionMap.put("VB-DISSOLVE", "Dissolve");
		// Dry Tokens
		actionMap.put("VB-DRY", "Dry");
		// Extract Tokens
		actionMap.put("VB-EXTRACT", "Extract");
		actionMap.put("NN-EXTRACT", "Extract");

		// Filter Tokens
		actionMap.put("VB-FILTER", "Filter");
		actionMap.put("NN-FILTER", "Filter");

		// Heat Tokens
		actionMap.put("VB-HEAT", "Heat");
		actionMap.put("VB-INCREASE", "Heat");
		actionMap.put("VB-SUBMERGE", "Heat");
		// Partition Tokens
		actionMap.put("VB-PARTITION", "Partition");

		// Precipitate Tokens
		actionMap.put("VB-PRECIPITATE", "Precipitate");
		actionMap.put("NN-PRECIPITATE", "Precipitate");
		
		// Purify Tokens
		actionMap.put("VB-PURIFY", "Purify");
		actionMap.put("NN-PURIFY", "Purify");

		// Quench Tokens
		actionMap.put("VB-QUENCH", "Quench");

		// Recover Tokens
		actionMap.put("VB-RECOVER", "Recover");
		// Remove Tokens
		actionMap.put("VB-REMOVE", "Remove");
		actionMap.put("NN-REMOVE", "Remove");

		// Stir Tokens
		actionMap.put("VB-STIR", "Stir");
		// Synthesize Tokens
		actionMap.put("VB-SYNTHESIZE", "Synthesize");
		actionMap.put("NN-SYNTHESIZE", "Synthesize");

		// Wait Tokens
		actionMap.put("VB-WAIT", "Wait");

		// Wash Tokens
		actionMap.put("VB-WASH", "Wash");
		// Yield Tokens
		actionMap.put("VB-YIELD", "Yield");
	}
	
	/**********************************************
	 * Adds action phrases and roles to documents.
	 * @param  doc (Document)
	 * @return processedDoc (Document)
	 ********************************************/
	public Document process(Document doc) {
		if (actionMap.size() == 0) {
			loadDefaultActionMap();
		}
		Element root = new Element("Document");
		Nodes nodes = doc.query("//Sentence");
		for (int i = 0; i < nodes.size(); i++) {
			Element sentenceNode = (Element) nodes.get(i);
			Element newSentenceNode = processActionPhrases(sentenceNode);
			root.appendChild(newSentenceNode);
		}

		processDissolve(root);
		Document processedDoc = new Document(root);
		return processedDoc;

	}
	/******************************************
	 * Converts DissolvePhrases (as they are recognised by the ANTLR grammar),
	 * and converts them into "ActionPhrase type='Dissolve'".
	 * @param  dissolveElement (Element)
	 * @return dissolveElement (Element)
	 ********************************/
	private Element processDissolve(Element dissolveElement) {
		Nodes nodes = dissolveElement.query("//DissolvePhrase");
		for (int i = 0; i < nodes.size(); i++) {
			Element newDissolveElement = (Element) nodes.get(i);
			newDissolveElement.setLocalName("ActionPhrase");
			Attribute attribute = new Attribute("type", "Dissolve");

			newDissolveElement.addAttribute(attribute);
			processSolvent(newDissolveElement);
		}
		return dissolveElement;
	}

	/******************************************
	 * Adds action phrases to the documents.
	 * @param  sentenceNode (Element)
	 * @return newSentence (Element)
	 ********************************/
	private Element processActionPhrases(Element sentenceNode) {
		Element newSentence = new Element("Sentence");
		List<Element> elementList = new ArrayList<Element>();

		boolean seenVerbOrAtionNoun = false;//a verb or a noun like purification
		Element actionPhrase = null;
		for (int i = 0; i < sentenceNode.getChildCount(); i++) {

			Element phraseElement = (Element) sentenceNode.getChild(i);

			String actionElementName = findFirstActionElementName(phraseElement);
			if (actionElementName != null || phraseElement.getLocalName().equals("VerbPhrase")) {
				if (seenVerbOrAtionNoun) {
					if (actionPhrase != null) {//This the start of a new phrase, so add all seen elements into the previous actionPhrase
						addListToParentNode(actionPhrase, elementList);
						appendActionPhrase(newSentence, actionPhrase);
						actionPhrase = null;
					} else {
						addListToParentNode(newSentence, elementList);
					}
					elementList = new ArrayList<Element>();
				}
				seenVerbOrAtionNoun = true;

				elementList.add(phraseElement);
                List<String> elementNames = elementListToSelfAndDescendentElementNames(elementList);
                if (!elementNames.contains("NN-EXAMPLE")){//prevents "example of synthesis" like phrases being misidentified as action phrases
					if (actionElementName !=null) {
						actionPhrase = new Element("ActionPhrase");
						Attribute attribute = new Attribute("type", actionMap.get(actionElementName));
						// System.out.println("* I contain keyword:: " + actionName);
						actionPhrase.addAttribute(attribute);
					}
					else if (elementNames.contains("TimePhrase") && includeWaitPhrase) {
                        Attribute attribute = new Attribute("type", "Wait");
                        actionPhrase = createActionPhrase(elementList, attribute);
                        appendActionPhrase(newSentence, actionPhrase);
                        actionPhrase = null;

                        elementList = new ArrayList<Element>();
                        seenVerbOrAtionNoun = false;
	                }
	                else if (elementNames.contains("MultipleApparatus")) {
                        Attribute attribute = new Attribute("type", "ApparatusAction");
                        actionPhrase = createActionPhrase(elementList, attribute);
                        appendActionPhrase(newSentence, actionPhrase);
                        actionPhrase = null;
                        elementList = new ArrayList<Element>();
                        seenVerbOrAtionNoun = false;
	                }
                }
			} else if (splitList.contains(phraseElement.getLocalName().toLowerCase())) {
				if (actionPhrase != null) {
					addListToParentNode(actionPhrase, elementList);
					appendActionPhrase(newSentence, actionPhrase);
					elementList = new ArrayList<Element>();
					actionPhrase = null;
				} else {
					//add nodes to sentence if a verbOrAtionNoun has been seen, otherwise keep waiting for an action term
					if (seenVerbOrAtionNoun){
						addListToParentNode(newSentence, elementList);
						elementList = new ArrayList<Element>();
					}
					else{
	                   List<String> elementNames = elementListToSelfAndDescendentElementNames(elementList);
	                   if (elementNames.contains("TimePhrase") && includeWaitPhrase) {
	                	   Attribute attribute = new Attribute("type", "Wait");
	                	   actionPhrase = createActionPhrase(elementList, attribute);
	                       appendActionPhrase(newSentence, actionPhrase);
	                       actionPhrase = null;
	                       elementList = new ArrayList<Element>();
	                   }
					}
				}
				if (elementList.isEmpty()){//append the punctuation directly if they are not within a phrase
				    newSentence.appendChild(new Element(phraseElement));
				}
				else{
					elementList.add(phraseElement);
				}
				seenVerbOrAtionNoun = false;
			} else {
				elementList.add(phraseElement);
			}
		}

		if (elementList.size() > 0) {
			addListToParentNode(newSentence, elementList);
		}
		newSentence = checkForRolePrepPhrase(newSentence);
		return newSentence;
	}

	/****************************************
	 * Adds solvent roles for nodes within the
	 * ActionPhrases.
	 * Checks within dissolve,wash and extract phrases. 
	 * @param actionElement (Element)
	 * @return actionElement (Element)
	 ****************************************/
	private Element processSolvent(Element actionElement) {

		if (!actionElement.getLocalName().toLowerCase()
				.contains("actionphrase")) {
			Nodes actionNodes = actionElement.query(".//ActionPhrase");
			if (actionNodes.size() == 0){
				actionElement = null;
			}	
			else {
				actionElement = (Element) actionNodes.get(0);
			}
		}
		if (actionElement != null) {
			if (actionElement.getAttributeValue("type").equals("Dissolve")) {
				addSolventRole(actionElement, "IN-IN", false);
			}
			if (actionElement.getAttributeValue("type").equals("Wash")) {
				addSolventRole(actionElement, "IN-WITH", false);
			}
			if (actionElement.getAttributeValue("type").equals("Extract")) {

				addSolventRole(actionElement, "IN-WITH", false);
			}

			if (actionElement.getAttributeValue("type").equals("Add")) {
				if (actionElement.query(".//VB-DILUTE").size() > 0) {
					addSolventRole(actionElement, "IN-WITH", false);
				}
			}

			if (actionElement.getAttributeValue("type").equals("Purify")) {
				if ((actionElement.query(".//NN-CHROMATOGRAPHY").size() > 0)
						&& (actionElement.query(".//MIXTURE").size() > 0)) {
					findMixtureSolvents(actionElement);

				}
			}

		}

		return actionElement;
	}

	/****************************************
	 * Adds ActionPhrase tags to the document.
	 * @param newSentence (Element)
	 * @param actionElement (Element)
	 **********************************/
	private void appendActionPhrase(Element newSentence, Element actionElement) {

		actionElement = processSolvent(actionElement);
		newSentence.appendChild(actionElement);

	}


	/********************************************************************************
	 * Checks for role in preparation phrases that have the format 'Using hexane as an eluent/solvent'.
	 * @param newSentence (Element)
	 * @return newSentence (Element)
	 **************************************************************************/
	private Element checkForRolePrepPhrase(Element newSentence) {
		Nodes nodes = newSentence.query(".//RolePrepPhrase");
		if (nodes.size() == 0){
			return newSentence;
		}
		else {
			for (int i = 0; i < nodes.size(); i++) {
				Node roleNode = nodes.get(i);
				
				Element rolePhrase = (Element) roleNode;
				Element parentPhrase = (Element)rolePhrase.getParent();
				
				int roleIndex = parentPhrase.indexOf(roleNode);
				
				String role = getRole(rolePhrase);
				if (roleIndex > 0 && role!=null) {
					Element previousElement = (Element) parentPhrase
							.getChild(roleIndex - 1);
					if (previousElement.getLocalName().toLowerCase()
							.equals("nounphrase") || previousElement.getLocalName().toLowerCase()
							.equals("prepphrase")) {
						setRole(previousElement, role);
					}
				}
			}
		}
		return newSentence;
	}

	/*****************************************
	 * Adds a role attribute to Molecule Nodes.
	 * @param previousElement (Element)
	 * @param role (String)
	 ******************************************/

	private void setRole(Element previousElement, String role) {
		Nodes moleculeNodes = previousElement.query(".//MOLECULE");
		for (int i = 0; i < moleculeNodes.size(); i++) {
			Element moleculeElement = (Element) moleculeNodes.get(i);
			moleculeElement.addAttribute(new Attribute("role", role));
		}
	}
	/*******************************************************************
	 * This gets the role from preposition phrases that start with 'As'.
	 * E.g: As a solvent/ as an eluent .
	 * @param rolePhrase (Element)
	 * @return role (String)
	 /*****************************************************************/
	private String getRole(Element rolePhrase) {
		String role = null;
		Nodes roleNameNodes = rolePhrase.query(".//NN-CHEMENTITY");
		if (roleNameNodes.size() != 1) {
			return null;
		}
		else {
			Node roleNameNode = roleNameNodes.get(0);
			role = roleNameNode.getValue();
		}
		if (role.toLowerCase().contains("eluent")
				|| role.toLowerCase().contains("solvent")) {
			role = "Solvent";
		}
		return role;
	}

	/*************************************************************************
	 * Takes a list of elements and returns a list of their localnames.
	 * @param elementList (List<Element>)
	 * @return elementNames (List<String>)
	 **************************************************************************/
	private List<String> elementListToSelfAndDescendentElementNames(List<Element> elementList) {
		List<String> elementNames = new ArrayList<String>();
		for (Element element : elementList) {
			elementNames.addAll(getElementAndDescendantElementNameList(element));
		}
		return elementNames;
	}
	
	/*************************************************************************
	 * Given an element returns in document order the element's descendants localnames.
	 * The startingElement's localname will be the first in the list
	 * @param startingElement (Element)
	 * @return elementNames (List<String>)
	 ************************************************************************/
	private List<String> getElementAndDescendantElementNameList(Element startingElement) {
		List<String> elementNames = new ArrayList<String>();
		elementNames.add(startingElement.getLocalName());
		LinkedList<Element> stack = new LinkedList<Element>();
		Elements children =startingElement.getChildElements();
		for (int i = children.size() -1; i >= 0; i--) {
			stack.add(children.get(i));
		}
		while (stack.size()>0){
			Element currentElement =stack.removeLast();
			elementNames.add(currentElement.getLocalName());
			children =currentElement.getChildElements();
			for (int i = children.size() -1; i >= 0; i--) {
				Element child =children.get(i);
				stack.add(child);
			}
		}
		return elementNames;
	}

	/****************************************************
	 * Adds a list of Elements to a parent node.
	 * @param parentNode (Element)
	 * @param elementList (List<Element>)
	 ****************************************************/
	private void addListToParentNode(Element parentNode, List<Element> elementList) {
		for (Element element : elementList) {
			Element newElement = (Element) element.copy();

			parentNode.appendChild(newElement);
		}

	}
	
	/*******************************************************************************
	 * Creates an actionPhrase element with the given children and attribute.
	 * @param children (List<Element>)
	 * @param attribute (Attribute)
	 * @return actionPhrase (Element)
	 ********************************************************************************/
    private Element createActionPhrase(List<Element> children, Attribute attribute) {
	    Element actionPhrase = new Element("ActionPhrase");
	    actionPhrase.addAttribute(attribute);
	    addListToParentNode(actionPhrase, children);
	    return actionPhrase;
	}

   /**********************************************
    * Searches for solvents in mixture phrases.
    * @param actionElement (Element)
    **********************************************/
	private void findMixtureSolvents(Element actionElement) {
		Element mixtureElement = (Element) actionElement.query(".//MIXTURE")
				.get(0);
		Nodes moleculeNodes = mixtureElement.query(".//OSCAR-CM");
		for (int i = 0; i < moleculeNodes.size(); i++) {

			Element moleculeElement = (Element) moleculeNodes.get(i);
			Element newElement = (Element) moleculeElement.copy();
			moleculeElement.setLocalName("MOLECULE");
			moleculeElement.removeChild(0);
			moleculeElement.appendChild(newElement);
			moleculeElement.addAttribute(new Attribute("role", "Solvent"));
		}
	}
    /***********************************************************************
     * Adds solvent roles to molecule nodes.
     * Searches for molecule nodes that are after prepositions and adds a 
     * role="Solvent" attribute.
     * @param solventElement (Element)
     * @param preposition (String)
     * @param seenPreposition (boolean)
     ***********************************************************************/
	private void addSolventRole(Element solventElement, String preposition,
			boolean seenPreposition) {

		for (int i = 0; i < solventElement.getChildCount(); i++) {
			if (!solventElement.getLocalName().contains("Unmatched")){
			Element child = (Element) solventElement.getChild(i);
			if (child.getLocalName().toLowerCase().contains("phrase")) {
				addSolventRole(child, preposition, seenPreposition);
			}
			if (child.getLocalName().toLowerCase().contains("molecule")
					&& seenPreposition) {
				Attribute attribute = new Attribute("role", "Solvent");
				child.addAttribute(attribute);
			}
			if (child.getLocalName().equals(preposition)) {
				seenPreposition = true;
			}
		   }
		}
	}

	/**********************************************************************
	 * Given an element searches through its descendants in document order and returns the first
	 * element with a localname corresponding to an entry in the actionMap
	 * or null if none of their names are present in the actionMap.
	 * @param startingElement (Element)
	 * @return elementName (String)
	 **********************************************************************/
	private String findFirstActionElementName(Element startingElement) {
		LinkedList<Element> stack = new LinkedList<Element>();
		Elements children =startingElement.getChildElements();
		for (int i = children.size() -1; i >= 0; i--) {
			stack.add(children.get(i));
		}
		while (stack.size()>0){
			Element currentElement =stack.removeLast();
			String elementName = currentElement.getLocalName();
			if (actionMap.containsKey(elementName)){
				return elementName;
			}
			children =currentElement.getChildElements();
			for (int i = children.size() -1; i >= 0; i--) {
				Element child =children.get(i);
				stack.add(child);
			}
		}
		return null;
	}

}
