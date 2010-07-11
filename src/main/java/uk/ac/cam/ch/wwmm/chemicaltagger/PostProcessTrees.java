package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nu.xom.Attribute;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Node;
import nu.xom.Nodes;

public class PostProcessTrees {
	public final static HashMap<String, String> actionMap = new HashMap<String, String>();
	private String actionName;
	public PostProcessTrees(){
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
		actionMap.put("VB-APPARATUS", "Apparatus");
		actionMap.put("NN-APPARATUS", "Apparatus");
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
			Element sentenceNode = (Element)nodes.get(i);
			Element newSentenceNode = processSentence(sentenceNode); 
			root.appendChild(newSentenceNode);
		}
		Element processedRoot = processDissolve(root);
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
	    
	    for (int i = 0; i < sentenceNode.getChildCount(); i++) {
	    	
			Element phraseElement = (Element) sentenceNode.getChild(i);
			
			String content = phraseElement.toXML();
			
			if (containsKeyword(content)){
				Element actionPhrase = new Element("ActionPhrase");
				Attribute attribute = new Attribute("type", actionName);
				
				actionPhrase.addAttribute(attribute);
				elementList.add(phraseElement);
				if (i + 1 < sentenceNode.getChildCount()){
					Element nextPhraseElement = (Element) sentenceNode.getChild(i+1);
					if (nextPhraseElement.getLocalName().contains("PrepPhrase")){
					    elementList.add(nextPhraseElement);
					    i++;
					}
					else if (actionName.contains("Yield") & nextPhraseElement.getLocalName().contains("NounPhrase")){
				
						    elementList.add(nextPhraseElement);
						    i++;
					}
				}
				addListToNode(actionPhrase,elementList);
				newSentence.appendChild(actionPhrase);
				elementList = new ArrayList<Element>();
			    	
			}
			else if (phraseElement.getLocalName().contains("VerbPhrase")){
					elementList.add(phraseElement);
				    addListToNode(newSentence,elementList);
					elementList = new ArrayList<Element>();
				}
			else{
				elementList.add(phraseElement);
			}
			
		}
	    if (elementList.size() > 0){
			addListToNode(newSentence,elementList);
		}
		return newSentence;
	}
	
	
	
	private void addListToNode(Element parentNode, List<Element> elementList) {
		for (Element element : elementList) {
			Element newElement = (Element) element.copy();
			
			parentNode.appendChild(newElement);
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
