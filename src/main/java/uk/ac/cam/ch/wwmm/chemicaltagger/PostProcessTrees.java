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

public class PostProcessTrees {
	private HashMap<String, String> actionMap = new HashMap<String, String>();
	static List<String> splitList = new ArrayList<String>();
	
	static{
		splitList.add("comma");
		splitList.add("cc");
		splitList.add("stop");
		splitList.add("rb-conj");
	}

	public HashMap<String, String> getActionMap() {
		return actionMap;
	}

	
	public PostProcessTrees(HashMap<String, String> postProcessActionMap) {
		this.actionMap = postProcessActionMap;
	}

	public PostProcessTrees() {
		actionMap = new HashMap<String, String>();
		loadDefaultActionMap();
	}

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
		// actionMap.put("VB-SUSPEND", "Add");
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
		//actionMap.put("NN-DRY", "Dry"); dryness doesn't make sense as an action
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
	public Document process(Document doc) {
		Element root = new Element("Document");
		Nodes nodes = doc.query("//Sentence");
		for (int i = 0; i < nodes.size(); i++) {
			Element sentenceNode = (Element) nodes.get(i);
			Element newSentenceNode = processSentence(sentenceNode);
			root.appendChild(newSentenceNode);
		}

		processDissolve(root);

		Document processedDoc = new Document(root);
		return processedDoc;

	}

	private Element processDissolve(Element root) {
		Nodes nodes = root.query("//DissolvePhrase");
		for (int i = 0; i < nodes.size(); i++) {
			Element dissolveElement = (Element) nodes.get(i);
			dissolveElement.setLocalName("ActionPhrase");
			Attribute attribute = new Attribute("type", "Dissolve");

			dissolveElement.addAttribute(attribute);
			processSolvent(dissolveElement);
		}
		return root;
	}

	private Element processSentence(Element sentenceNode) {
		Element newSentence = new Element("Sentence");
		List<Element> elementList = new ArrayList<Element>();

		boolean seenVerbOrAtionNoun = false;//a verb or a noun like purification
		Element actionPhrase = null;
		for (int i = 0; i < sentenceNode.getChildCount(); i++) {

			Element phraseElement = (Element) sentenceNode.getChild(i);

			String actionElementName = findFirstActionElementName(phraseElement);
			if (actionElementName != null || phraseElement.getLocalName().equals("VerbPhrase")) {
				if (seenVerbOrAtionNoun) {
					if (actionPhrase != null) {
						addListToNode(actionPhrase, elementList);
						appendActionPhrase(newSentence, actionPhrase);
						actionPhrase = null;

					} else {
						addListToNode(newSentence, elementList);

					}
					elementList = new ArrayList<Element>();

				}
				seenVerbOrAtionNoun = true;

				if (actionElementName !=null){
					List<String> elementNames = elementListToSelfAndDescendentElementNames(elementList);
					if (!elementNames.contains("NN-EXAMPLE")) {
						actionPhrase = new Element("ActionPhrase");
						Attribute attribute = new Attribute("type", actionMap.get(actionElementName));
						// System.out.println("* I contain keyword:: "
						// + actionName);
						actionPhrase.addAttribute(attribute);
						elementList.add(phraseElement);
					}
				}
				else {
					elementList.add(phraseElement);
	
					List<String> elementNames = elementListToSelfAndDescendentElementNames(elementList);
	
					if (elementNames.contains("TimePhrase")) {
						Attribute attribute = new Attribute("type", "Wait");
						actionPhrase = createActionPhrase(elementList,
								phraseElement, attribute);
						appendActionPhrase(newSentence, actionPhrase);
						actionPhrase = null;
	
						elementList = new ArrayList<Element>();
						seenVerbOrAtionNoun = false;
					}
					if (elementNames.contains("MultipleApparatus")) {
	
						Attribute attribute = new Attribute("type",
								"ApparatusAction");
						actionPhrase = createActionPhrase(elementList,
								phraseElement, attribute);
						appendActionPhrase(newSentence, actionPhrase);
						actionPhrase = null;
	
						elementList = new ArrayList<Element>();
						seenVerbOrAtionNoun = false;
					}
				}
			} else if (seenVerbOrAtionNoun
					& splitList.contains(phraseElement.getLocalName()
							.toLowerCase())) {

				elementList.add(phraseElement);
				if (actionPhrase != null) {

					addListToNode(actionPhrase, elementList);
					appendActionPhrase(newSentence, actionPhrase);
					actionPhrase = null;

				} else
					addListToNode(newSentence, elementList);


				elementList = new ArrayList<Element>();
				seenVerbOrAtionNoun = false;
			} else if (splitList.contains(phraseElement.getLocalName()
					.toLowerCase())) {
				Element newPhraseElement = (Element) phraseElement.copy();
			    newSentence.appendChild(newPhraseElement);
				if (actionPhrase != null) {

					addListToNode(actionPhrase, elementList);
					appendActionPhrase(newSentence, actionPhrase);
					elementList = new ArrayList<Element>();
					actionPhrase = null;
					

				}
				List<String> elementNames = elementListToSelfAndDescendentElementNames(elementList);
				if (elementNames.contains("TimePhrase")) {

					Attribute attribute = new Attribute("type", "Wait");
					actionPhrase = createActionPhrase(elementList,
							phraseElement, attribute);
					appendActionPhrase(newSentence, actionPhrase);
					actionPhrase = null;

					elementList = new ArrayList<Element>();
				}

			} else {
				elementList.add(phraseElement);
			}

		}

		if (elementList.size() > 0) {
			addListToNode(newSentence, elementList);
		}
		newSentence = checkForRolePrepPhrase(newSentence);
		return newSentence;
	}

	/******************
	 * Adds ActionPhrase to our new Sentences
	 * 
	 * @param newSentence
	 * @param actionElement
	 */
	private void appendActionPhrase(Element newSentence, Element actionElement) {

		actionElement = processSolvent(actionElement);
		newSentence.appendChild(actionElement);

	}

	/******************
	 * 
	 * @param elementList
	 * @param phraseElement
	 * @param attribute
	 * @return
	 */
	private Element createActionPhrase(List<Element> elementList,
			Element phraseElement, Attribute attribute) {
		Element actionPhrase = new Element("ActionPhrase");
		actionPhrase.addAttribute(attribute);
		elementList.add(phraseElement);
		addListToNode(actionPhrase, elementList);
		return actionPhrase;
	}

	/*
	 * This checks for rolePrepPhrases which are in the format of 'Using hexane
	 * as an eluent/solvent'
	 */
	private Element checkForRolePrepPhrase(Element newSentence) {
		Nodes nodes = newSentence.query(".//RolePrepPhrase");
		if (nodes.size() == 0)
			return newSentence;
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
							.equals("prepphrase"))
						setRole(previousElement, role);
				}
			}
		}
		return newSentence;
	}

	/*
	 * This gets the role from the rolePrepPhrase (as a solvent/ as an eluent)
	 */

	private void setRole(Element previousElement, String role) {
		Nodes moleculeNodes = previousElement.query(".//MOLECULE");
		for (int i = 0; i < moleculeNodes.size(); i++) {
			Element moleculeElement = (Element) moleculeNodes.get(i);
			moleculeElement.addAttribute(new Attribute("role", role));
		}
	}

	private String getRole(Element rolePhrase) {
		String role = null;
		Nodes roleNameNodes = rolePhrase.query(".//NN-CHEMENTITY");
		if (roleNameNodes.size() != 1)
			return null;
		else {
			Node roleNameNode = roleNameNodes.get(0);
			role = roleNameNode.getValue();
		}
		if (role.toLowerCase().contains("eluent")
				|| role.toLowerCase().contains("solvent"))
			role = "Solvent";
		return role;
	}

	private List<String> elementListToSelfAndDescendentElementNames(List<Element> elementList) {
		List<String> elementNames = new ArrayList<String>();
		for (Element element : elementList) {
			elementNames.addAll(getElementAndDescendantElementNameList(element));
		}
		return elementNames;
	}
	
	/**
	 * Given an element returns in document order the element's descendants localnames.
	 * The startingElement's localname will be the first in the list
	 * @param startingElement
	 * @return
	 */
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

	private void addListToNode(Element parentNode, List<Element> elementList) {
		for (Element element : elementList) {
			Element newElement = (Element) element.copy();

			parentNode.appendChild(newElement);
		}

	}

	private Element processSolvent(Element actionElement) {

		/*
		 * This is for elements that
		 */

		if (!actionElement.getLocalName().toLowerCase()
				.contains("actionphrase")) {
			Nodes actionNodes = actionElement.query(".//ActionPhrase");
			if (actionNodes.size() == 0)
				actionElement = null;
			else
				actionElement = (Element) actionNodes.get(0);
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
				if (actionElement.query(".//VB-DILUTE").size() > 0)
					addSolventRole(actionElement, "IN-WITH", false);
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

	private void findMixtureSolvents(Element actionElement) {
		Element mixtureElement = (Element) actionElement.query(".//MIXTURE")
				.get(0);
		Nodes moleculeNodes = mixtureElement.query(".//OSCAR-CM");
		//System.out.println("Molecule nodes " + moleculeNodes.size());
		for (int i = 0; i < moleculeNodes.size(); i++) {

			Element moleculeElement = (Element) moleculeNodes.get(i);
			Element newElement = (Element) moleculeElement.copy();
			moleculeElement.setLocalName("MOLECULE");
			moleculeElement.removeChild(0);
			moleculeElement.appendChild(newElement);
			moleculeElement.addAttribute(new Attribute("role", "Solvent"));
		}
	}

	private void addSolventRole(Element solventElement, String preposition,
			boolean seenPreposition) {

		for (int i = 0; i < solventElement.getChildCount(); i++) {
			Element child = (Element) solventElement.getChild(i);
			if (child.getLocalName().toLowerCase().contains("phrase")) {
				addSolventRole(child, preposition, seenPreposition);
			}
			if (child.getLocalName().toLowerCase().contains("molecule")
					&& seenPreposition) {
				Attribute attribute = new Attribute("role", "Solvent");

				child.addAttribute(attribute);
			}
			if (child.getLocalName().equals(preposition))
				seenPreposition = true;
		}

	}

	/**
	 * Given an element searches through its descendants in document order and returns the first
	 * element with a localname corresponding to an entry in the actionMap
	 * or null if none of their names are present in the actionMap
	 * @param startingElement
	 * @return
	 */
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
