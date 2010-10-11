package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nu.xom.Attribute;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Nodes;

public class PostProcessTrees {
	public final static HashMap<String, String> actionMap = new HashMap<String, String>();
	private String actionName;

	public PostProcessTrees() {
		// Add Tokens
		actionMap.put("VB-ADD", "Add");
		actionMap.put("NN-ADD", "Add");
		actionMap.put("VB-CHARGE", "Add");
		actionMap.put("NN-MIXTURE", "Add");
		actionMap.put("VB-CONTAIN", "Add");
		actionMap.put("VB-DROP", "Add");
		actionMap.put("VB-FILL", "Add");
		actionMap.put("VB-SUSPEND", "Add");
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

		// Dissolve Tokens
		actionMap.put("VB-DISSOLVE", "Dissolve");
		// Dry Tokens
		actionMap.put("VB-DRY", "Dry");
		actionMap.put("NN-DRY", "Dry");
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
		actionMap.put("VB-PRECIPITATE", "Precipitate");
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
		processSolvent(root);
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
		}
		return root;
	}

	private Element processSentence(Element sentenceNode) {
		Element newSentence = new Element("Sentence");
		List<Element> elementList = new ArrayList<Element>();
		List<String> splitList = new ArrayList<String>();
		splitList.add("comma");
		splitList.add("cc");
		splitList.add("stop");
		splitList.add("rb-conj");
		
		boolean seenVerb = false;
		Element actionPhrase = null;
		for (int i = 0; i < sentenceNode.getChildCount(); i++) {

			Element phraseElement = (Element) sentenceNode.getChild(i);

			String content = phraseElement.toXML();
//			System.out.println("--Phrase is " + phraseElement.toXML());
			if (containsKeyword(content)) {

				
				
				if (phraseElement.getLocalName().contains("VerbPhrase")) {

					if (seenVerb) {
//						System.out
//								.println("-- I have seen a verb and I am currently a verb");
//
//						System.out
//								.println("--- ActionPhrase at the moment is  "
//										+ actionPhrase);
						if (actionPhrase != null) {
							addListToNode(actionPhrase, elementList);
							newSentence.appendChild(actionPhrase);
							actionPhrase = null;

						} else {
							addListToNode(newSentence, elementList);

						}
						elementList = new ArrayList<Element>();
//						System.out.println("---- New sentence is "
//								+ newSentence.toXML());

					}
					seenVerb = true;

				}
				actionPhrase = new Element("ActionPhrase");
				Attribute attribute = new Attribute("type", actionName);
//				System.out.println("* I contain keyword:: "
//						+ actionName);
				actionPhrase.addAttribute(attribute);
				elementList.add(phraseElement);

				
			} else if (phraseElement.getLocalName().contains("VerbPhrase")) {
				
				if (seenVerb) {
//					System.out
//							.println("-- I have seen a verb and I am currently a verb");
//
//					System.out
//							.println("--- ActionPhrase at the moment is  "
//									+ actionPhrase);
					if (actionPhrase != null) {
						addListToNode(actionPhrase, elementList);
						newSentence.appendChild(actionPhrase);
						actionPhrase = null;

					} else {
						addListToNode(newSentence, elementList);

					}
					elementList = new ArrayList<Element>();
//					System.out.println("---- New sentence is "
//							+ newSentence.toXML());

				}
				elementList.add(phraseElement);
				

				seenVerb = true;
//				System.out.println("** I contain a verb:: ");
				String elementListContent = elementListToString(elementList);

				if (elementListContent.toLowerCase().contains("timephrase")){
					actionPhrase = new Element("ActionPhrase");
					Attribute attribute = new Attribute("type", "Wait");
//					System.out.println("* I contain keyword:: "
//							+ actionPhrase.toXML());
					actionPhrase.addAttribute(attribute);
					
					addListToNode(actionPhrase, elementList);
					newSentence.appendChild(actionPhrase);
					actionPhrase = null;

					elementList = new ArrayList<Element>();
					seenVerb = false;
				}
				if (elementListContent.toLowerCase().contains("multipleapparatus")){

					actionPhrase = new Element("ActionPhrase");
					Attribute attribute = new Attribute("type", "ApparatusAction");
//					System.out.println("* I contain keyword:: "
//							+ actionPhrase.toXML());
					actionPhrase.addAttribute(attribute);
					
					addListToNode(actionPhrase, elementList);
					newSentence.appendChild(actionPhrase);
					actionPhrase = null;

					elementList = new ArrayList<Element>();
					seenVerb = false;
				}
				// elementList = new ArrayList<Element>();
			} else if (seenVerb
					& splitList.contains(phraseElement.getLocalName()
							.toLowerCase())) {

//				System.out
//						.println("*** I have seen a verb and I am currently a stop word ");
//
//				System.out.println("**** ActionPhrase at the moment is  "
//						+ actionPhrase);
				elementList.add(phraseElement);
				if (actionPhrase != null) {
					addListToNode(actionPhrase, elementList);
					newSentence.appendChild(actionPhrase);
					actionPhrase = null;

				} else
					addListToNode(newSentence, elementList);
				
//				System.out.println("***** New sentence is "
//						+ newSentence.toXML());
				elementList = new ArrayList<Element>();
				seenVerb = false;
			}
			else if (splitList.contains(phraseElement.getLocalName()
							.toLowerCase())) {

				if (actionPhrase!= null){
					
					addListToNode(actionPhrase, elementList);
					newSentence.appendChild(actionPhrase);
					elementList = new ArrayList<Element>();
					actionPhrase = null;
				}
				String elementListContent = elementListToString(elementList);
				if (elementListContent.toLowerCase().contains("timephrase")){
					actionPhrase = new Element("ActionPhrase");
					Attribute attribute = new Attribute("type", "Wait");
//					System.out.println("* I contain keyword:: "
//							+ actionPhrase.toXML());
					actionPhrase.addAttribute(attribute);
					elementList.add(phraseElement);
					addListToNode(actionPhrase, elementList);
					newSentence.appendChild(actionPhrase);
					actionPhrase = null;

					elementList = new ArrayList<Element>();
				}

				
			}
			else {
				elementList.add(phraseElement);
			}

		}

		if (elementList.size() > 0) {
			addListToNode(newSentence, elementList);
		}
		return newSentence;
	}

	private String elementListToString(List<Element> elementList) {
		// TODO Auto-generated method stub
		String elementContent = "";
		for (Element element : elementList) {
			elementContent = elementContent + element.toXML();
		}
		
		return elementContent;
			
		
	}
	private void addListToNode(Element parentNode, List<Element> elementList) {
		for (Element element : elementList) {
			Element newElement = (Element) element.copy();

			parentNode.appendChild(newElement);
		}

	}

	private Element processSolvent(Element root) {
		Nodes nodes = root.query("//ActionPhrase");

		for (int i = 0; i < nodes.size(); i++) {
			Element actionElement = (Element) nodes.get(i);
			// System.out.println(actionElement.getAttributeValue("type"));
			if (actionElement.getAttributeValue("type").equals("Dissolve")) {

				addSolventRole(actionElement, "IN-IN", false);
			}
			if (actionElement.getAttributeValue("type").equals("Wash")) {

				addSolventRole(actionElement, "IN-WITH", false);
			}

		}
		return root;
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

	private boolean containsKeyword(String content) {
		for (String keyword : actionMap.keySet()) {
			if (content.contains(keyword)) {
				actionName = actionMap.get(keyword);
				return true;
			}
		}
		return false;
	}

}
