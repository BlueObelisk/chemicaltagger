/**
 * Copyright 2011 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
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
import java.util.Arrays;
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
 * Passes tagged sentences to the ANTLR grammar. And converts the output to an
 * XML document.
 * 
 * @author lh359, dl387
 *****************************************/
public class PostProcessTrees {
	private HashMap<String, String> actionMap = new HashMap<String, String>();
	private static List<String> splitList = Arrays.asList("comma", "cc", "stop", "colon", "rb-conj");
	private boolean includeWaitPhrase = true;

	/********************************
	 * Default Constructor method.
	 ********************************/
	public PostProcessTrees() {
		actionMap = new HashMap<String, String>();
	}

	/********************************
	 * Getter method for actionMap.
	 * 
	 * @return actionMap (HashMap)
	 ********************************/
	public HashMap<String, String> getActionMap() {
		return actionMap;
	}

	/********************************
	 * Getter method for actionMap.
	 * 
	 * @param actionMap
	 *            (HashMap)
	 ********************************/
	public void setActionMap(HashMap<String, String> actionMap) {
		this.actionMap = actionMap;
		includeWaitPhrase = false;
	}

	/********************************
	 * Loads default ActionMap for ChemicalTagger.
	 ********************************/
	public void loadDefaultActionMap() {
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
	 * 
	 * @param doc
	 *            (Document)
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
		assignRolesByFollowingWord(root);

		Document processedDoc = new Document(root);
		return processedDoc;

	}

	/******************************************
	 * Converts DissolvePhrases (as they are recognised by the ANTLR grammar),
	 * and converts them into "ActionPhrase type='Dissolve'".
	 * 
	 * @param dissolveElement
	 *            (Element)
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
	

	/**
	 * Looks for the pattern OSCARCM followed by NN-CHEMENTITY
	 * to assign things like "ethanol solvent" as solvents
	 * or "palladium catalyst" as catalysts
	 * @param root
	 */
	private void assignRolesByFollowingWord(Element root) {
		Nodes oscarcms = root.query("//OSCARCM");
		for (int i = 0; i < oscarcms.size(); i++) {
			Element oscarcm = (Element) oscarcms.get(i);
			Element nextEl = Utils.getNextTerminalElement(oscarcm);
			if (nextEl!=null && nextEl.getLocalName().equals("NN-CHEMENTITY")){
				Element molecule = (Element) oscarcm.getParent();
				if (molecule !=null && molecule.getLocalName().equals("MOLECULE")){
					String nnChementity = nextEl.getValue().toLowerCase();
					if (nnChementity.contains("solvent")){
						molecule.addAttribute(new Attribute("role", "Solvent"));
					}
					else if (nnChementity.contains("catalyst") || nnChementity.contains("accelerant")){
						molecule.addAttribute(new Attribute("role", "Catalyst"));
					}
				}
			}
		}
	}

	/******************************************
	 * Adds action phrases to the documents.
	 * 
	 * @param sentenceNode
	 *            (Element)
	 * @return newSentence (Element)
	 ********************************/
	private Element processActionPhrases(Element sentenceNode) {
		Element newSentence = new Element("Sentence");
		List<Element> elementList = new ArrayList<Element>();

		boolean seenVerbOrAtionNoun = false;// a verb or a noun like
											// purification
		Element actionPhrase = null;
		Elements sentenceChildren = sentenceNode.getChildElements();
		for (int i = 0; i < sentenceChildren.size(); i++) {
			Element phraseElement = sentenceChildren.get(i);

			String actionElementName = findFirstActionElementNameOutsideOfAMolecule(phraseElement);
			if (actionElementName != null
					|| phraseElement.getLocalName().equals("VerbPhrase")) {
				if (seenVerbOrAtionNoun) {
					if (actionPhrase != null) {// This the start of a new
												// phrase, so add all seen
												// elements into the previous
												// actionPhrase
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
				//TODO is this condition a good idea?
				if (!hasNNExampleOutsideOfProcedure(elementList)) {//not something like "example of synthesis"
					if (actionElementName != null) {
						actionPhrase = new Element("ActionPhrase");
						Attribute attribute = new Attribute("type",
								actionMap.get(actionElementName));
						actionPhrase.addAttribute(attribute);
					}
					else{
						List<String> elementNames = elementListToSelfAndDescendentElementNames(elementList);
						if (elementNames.contains("TimePhrase")
								&& includeWaitPhrase) {
							Attribute attribute = new Attribute("type", "Wait");
							actionPhrase = createActionPhrase(elementList,
									attribute);
							appendActionPhrase(newSentence, actionPhrase);
							actionPhrase = null;
	
							elementList = new ArrayList<Element>();
							seenVerbOrAtionNoun = false;
						} else if (elementNames.contains("MultipleApparatus")) {
							Attribute attribute = new Attribute("type",
									"ApparatusAction");
							actionPhrase = createActionPhrase(elementList,
									attribute);
							appendActionPhrase(newSentence, actionPhrase);
							actionPhrase = null;
							elementList = new ArrayList<Element>();
							seenVerbOrAtionNoun = false;
						}
					}
				}
			} else if (splitList.contains(phraseElement.getLocalName()
					.toLowerCase())) {
				if (actionPhrase != null) {
					addListToParentNode(actionPhrase, elementList);
					appendActionPhrase(newSentence, actionPhrase);
					elementList = new ArrayList<Element>();
					actionPhrase = null;
				} else {
					// add nodes to sentence if a verbOrAtionNoun has been seen,
					// otherwise keep waiting for an action term
					if (seenVerbOrAtionNoun) {
						addListToParentNode(newSentence, elementList);
						elementList = new ArrayList<Element>();
					} else {
						List<String> elementNames = elementListToSelfAndDescendentElementNames(elementList);
						if (elementNames.contains("TimePhrase")
								&& includeWaitPhrase) {
							Attribute attribute = new Attribute("type", "Wait");
							actionPhrase = createActionPhrase(elementList,
									attribute);
							appendActionPhrase(newSentence, actionPhrase);
							actionPhrase = null;
							elementList = new ArrayList<Element>();
						}
					}
				}
				if (elementList.isEmpty()) {// append the punctuation directly
											// if they are not within a phrase
					newSentence.appendChild(new Element(phraseElement));
				} else {
					elementList.add(phraseElement);
				}
				seenVerbOrAtionNoun = false;
			} else {
				elementList.add(phraseElement);
			}
		}

		if (elementList.size() > 0) {
			if (actionPhrase != null) {
				addListToParentNode(actionPhrase, elementList);
				appendActionPhrase(newSentence, actionPhrase);
			}
			else{
				addListToParentNode(newSentence, elementList);
			}
		}
		newSentence = checkForRolePrepPhrase(newSentence);

		return newSentence;
	}

	/**
	 * Are any of the given elements or their descendants NN-EXAMPLE nodes outside of a PROCEDURE node
	 * @param elementList
	 * @return
	 */
	private boolean hasNNExampleOutsideOfProcedure(List<Element> elementList) {
		for (Element element : elementList) {
			Nodes exampleNodes = element.query(".//NN-EXAMPLE");
			for (int i = 0; i < exampleNodes.size(); i++) {
				Element exampleEl = (Element) exampleNodes.get(i);
				if (!((Element)exampleEl.getParent()).getLocalName().equals("PROCEDURE")){
					return true;
				}
			}
		}
		return false;
	}

	/****************************************
	 * Adds solvent roles for nodes within the ActionPhrases. Checks within
	 * dissolve,wash and extract phrases.
	 * 
	 * @param actionElement
	 *            (Element)
	 * @return actionElement (Element)
	 ****************************************/
	private Element processSolvent(Element actionElement) {

		if (!actionElement.getLocalName().toLowerCase()
				.contains("actionphrase")) {
			Nodes actionNodes = actionElement.query(".//ActionPhrase");
			if (actionNodes.size() == 0) {
				actionElement = null;
			} else {
				actionElement = (Element) actionNodes.get(0);
			}
		}
		if (actionElement != null) {
			if (actionElement.getAttributeValue("type").equals("Dissolve")) {
				addSolventRole(actionElement, "IN-IN");
			}
			if (actionElement.getAttributeValue("type").equals("Wash")) {
				addSolventRole(actionElement, "IN-WITH");
			}
			if (actionElement.getAttributeValue("type").equals("Extract")) {

				addSolventRole(actionElement, "IN-WITH");
			}

			if (actionElement.getAttributeValue("type").equals("Add")) {
				if (actionElement.query(".//VB-DILUTE").size() > 0) {
					addSolventRole(actionElement, "IN-WITH");
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
	 * 
	 * @param newSentence
	 *            (Element)
	 * @param actionElement
	 *            (Element)
	 **********************************/
	private void appendActionPhrase(Element newSentence, Element actionElement) {

		actionElement = processSolvent(actionElement);
		newSentence.appendChild(actionElement);

	}

	/********************************************************************************
	 * Checks for role in preparation phrases that have the format 'Using hexane
	 * as an eluent/solvent'.
	 * 
	 * @param newSentence
	 *            (Element)
	 * @return newSentence (Element)
	 **************************************************************************/
	private Element checkForRolePrepPhrase(Element newSentence) {
		Nodes nodes = newSentence.query(".//RolePrepPhrase");
		if (nodes.size() == 0) {
			return newSentence;
		} else {
			for (int i = 0; i < nodes.size(); i++) {
				Node roleNode = nodes.get(i);

				Element rolePhrase = (Element) roleNode;

				String role = getRole(rolePhrase);
				if (role != null) {
					Element previousElement = getPreviousElementOrElementBeforeVerbs(rolePhrase);
					if (previousElement !=null && 
							(previousElement.getLocalName().equalsIgnoreCase("nounphrase")
							|| previousElement.getLocalName().equalsIgnoreCase("prepphrase"))) {
						setRole(previousElement, role);
					}
				}
			}
		}
		return newSentence;
	}

	private Element getPreviousElementOrElementBeforeVerbs(Element rolePhrase) {
		Element previousElement = Utils.getPreviousSiblingOrParentsSibling(rolePhrase);
		List<String> elementsToIgnore = Arrays.asList("vbd", "vbn", "vbz", "comma");
		while (previousElement !=null && elementsToIgnore.contains(previousElement.getLocalName().toLowerCase())){
			previousElement = Utils.getPreviousSiblingOrParentsSibling(previousElement);
		}
		return previousElement;
	}

	/*****************************************
	 * Adds a role attribute to Molecule Nodes.
	 * 
	 * @param previousElement
	 *            (Element)
	 * @param role
	 *            (String)
	 ******************************************/

	private void setRole(Element previousElement, String role) {
		Nodes moleculeNodes = previousElement.query(".//MOLECULE");
		for (int i = 0; i < moleculeNodes.size(); i++) {
			Element moleculeElement = (Element) moleculeNodes.get(i);
			moleculeElement.addAttribute(new Attribute("role", role));
		}
	}

	/*******************************************************************
	 * This gets the role from preposition phrases that start with 'As'. E.g: As
	 * a solvent/ as an eluent .
	 * 
	 * @param rolePhrase
	 *            (Element)
	 * @return role (String) /
	 *****************************************************************/
	private String getRole(Element rolePhrase) {
		String role = null;
		Nodes roleNameNodes = rolePhrase.query(".//NN-CHEMENTITY");
		if (roleNameNodes.size() != 1) {
			return null;
		} else {
			Node roleNameNode = roleNameNodes.get(0);
			role = roleNameNode.getValue();
		}
		if (role.toLowerCase().contains("eluent")
				|| role.toLowerCase().contains("solvent")) {
			role = "Solvent";
		}
		else if (role.toLowerCase().contains("catalyst")
				|| role.toLowerCase().contains("accelerant")) {
			role = "Catalyst";
		}
		return role;
	}

	/*************************************************************************
	 * Takes a list of elements and returns a list of their localnames.
	 * 
	 * @param elementList
	 *            (List<Element>)
	 * @return elementNames (List<String>)
	 **************************************************************************/
	private List<String> elementListToSelfAndDescendentElementNames(
			List<Element> elementList) {
		List<String> elementNames = new ArrayList<String>();
		for (Element element : elementList) {
			elementNames
					.addAll(getElementAndDescendantElementNameList(element));
		}
		return elementNames;
	}

	/*************************************************************************
	 * Given an element returns in document order the element's descendants
	 * localnames. The startingElement's localname will be the first in the list
	 * 
	 * @param startingElement
	 *            (Element)
	 * @return elementNames (List<String>)
	 ************************************************************************/
	private List<String> getElementAndDescendantElementNameList(
			Element startingElement) {
		List<String> elementNames = new ArrayList<String>();
		elementNames.add(startingElement.getLocalName());
		LinkedList<Element> stack = new LinkedList<Element>();
		Elements children = startingElement.getChildElements();
		for (int i = children.size() - 1; i >= 0; i--) {
			stack.add(children.get(i));
		}
		while (stack.size() > 0) {
			Element currentElement = stack.removeLast();
			elementNames.add(currentElement.getLocalName());
			children = currentElement.getChildElements();
			for (int i = children.size() - 1; i >= 0; i--) {
				Element child = children.get(i);
				stack.add(child);
			}
		}
		return elementNames;
	}

	/****************************************************
	 * Adds a list of Elements to a parent node.
	 * 
	 * @param parentNode
	 *            (Element)
	 * @param elementList
	 *            (List<Element>)
	 ****************************************************/
	private void addListToParentNode(Element parentNode,
			List<Element> elementList) {
		for (Element element : elementList) {
			Element newElement = (Element) element.copy();

			parentNode.appendChild(newElement);
		}

	}

	/*******************************************************************************
	 * Creates an actionPhrase element with the given children and attribute.
	 * 
	 * @param children
	 *            (List<Element>)
	 * @param attribute
	 *            (Attribute)
	 * @return actionPhrase (Element)
	 ********************************************************************************/
	private Element createActionPhrase(List<Element> children,
			Attribute attribute) {
		Element actionPhrase = new Element("ActionPhrase");
		actionPhrase.addAttribute(attribute);
		addListToParentNode(actionPhrase, children);
		return actionPhrase;
	}

	/**********************************************
	 * Searches for solvents in mixture phrases.
	 * 
	 * @param actionElement
	 *            (Element)
	 **********************************************/
	private void findMixtureSolvents(Element actionElement) {
		Element mixtureElement = (Element) actionElement.query(".//MIXTURE")
				.get(0);
		Nodes oscarCMNodes = mixtureElement.query(".//OSCARCM");
		for (int i = 0; i < oscarCMNodes.size(); i++) {

			Element oscarCMElement = (Element) oscarCMNodes.get(i);
			Element moleculeElement;
			if (((Element)oscarCMElement.getParent()).getLocalName().equals("MOLECULE")){
				moleculeElement = (Element) oscarCMElement.getParent();
			}
			else{
				Element newElement = (Element) oscarCMElement.copy();
				oscarCMElement.setLocalName("MOLECULE");
				oscarCMElement.removeChildren();
				oscarCMElement.appendChild(newElement);
				moleculeElement = oscarCMElement;
			}
			moleculeElement.addAttribute(new Attribute("role", "Solvent"));
		}
	}

	/***********************************************************************
	 * Adds solvent roles to molecule nodes. Searches for molecule nodes that
	 * are after the given preposition and adds a role="Solvent" attribute.
	 * 
	 * @param solventElement
	 *            (Element)
	 * @param preposition
	 *            (String)
	 ***********************************************************************/
	private void addSolventRole(Element solventElement, String preposition) {
		if (solventElement.getLocalName().contains("Unmatched")) {
			return;
		}
		boolean seenPreposition = false;
		boolean foundAtleastOneSolvent = false;
		LinkedList<Element> elementsToInvestigate = new LinkedList<Element>();
		Elements children = solventElement.getChildElements();
		for (int i = 0; i < children.size(); i++) {
			elementsToInvestigate.add(children.get(i));
		}
		while (!elementsToInvestigate.isEmpty()) {
			Element elementToInvestigate = elementsToInvestigate.removeFirst();
			String localNameLC = elementToInvestigate.getLocalName().toLowerCase();
			if (localNameLC.contains("phrase") || localNameLC.contains("ratio")) {//children of phrases will be recursively investigated
				Elements elChildren = elementToInvestigate.getChildElements();
				for (int i = elChildren.size() -1; i >=0 ; i--) {
					elementsToInvestigate.add(0, elChildren.get(i));
				}
			}
			else if (localNameLC.contains("molecule") && seenPreposition) {
				if (foundAtleastOneSolvent && moleculeDoesNotLookLikeASolvent(elementToInvestigate)){
					return;
				}
				elementToInvestigate.addAttribute(new Attribute("role", "Solvent"));
				foundAtleastOneSolvent = true;
			}
			else if (elementToInvestigate.getLocalName().equals(preposition)) {
				seenPreposition = true;
			}
		}
	}

	/**
	 * Checks for the presence of a mass or an amount.
	 * These are rarely specified for a solvent
	 * @param elementToInvestigate
	 * @return
	 */
	private boolean moleculeDoesNotLookLikeASolvent(Element molecule) {
		return molecule.query(".//MASS").size() >0 || molecule.query(".//AMOUNT").size() >0;
	}

	/**********************************************************************
	 * Given an element searches through its descendants in document order and
	 * returns the first element with a localname corresponding to an entry in
	 * the actionMap or null if none of their names are present in the
	 * actionMap.
	 * 
	 * Molecule and UnnamedMolecule elements are not recursively investigated to prevent
	 * mistakes such as "Compound obtained from example 4" which is not a yield
	 * 
	 * @param startingElement
	 *            (Element)
	 * @return elementName (String)
	 **********************************************************************/
	private String findFirstActionElementNameOutsideOfAMolecule(Element startingElement) {
		LinkedList<Element> stack = new LinkedList<Element>();
		Elements children = startingElement.getChildElements();
		for (int i = children.size() - 1; i >= 0; i--) {
			stack.add(children.get(i));
		}
		while (stack.size() > 0) {
			Element currentElement = stack.removeLast();
			String elementName = currentElement.getLocalName();
			if (actionMap.containsKey(elementName)) {
				return elementName;
			}
			if (elementName.equals("UNNAMEDMOLECULE")|| elementName.equals("MOLECULE")){
				continue;
			}
			children = currentElement.getChildElements();
			for (int i = children.size() - 1; i >= 0; i--) {
				Element child = children.get(i);
				stack.add(child);
			}
		}
		return null;
	}

}
