package uk.ac.cam.ch.wwmm.chemicaltagger.roles;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Node;
import nu.xom.Nodes;

import org.apache.log4j.Logger;

import antlr.Utils;

import uk.ac.cam.ch.wwmm.chemicaltagger.extractText.ExtractFromXML;

public class RoleIdentifier {

	private ParsedDocumentCreator docCreator = null;
	private static Logger LOG = Logger.getLogger(RoleIdentifier.class);
	private ExtractFromXML sentenceExtractor = new ExtractFromXML();

	public Collection<NamedEntityWithRoles> getRoles(String text) {
		if (docCreator == null) docCreator = new ParsedDocumentCreator();
		return getRoles(docCreator.runChemicalTagger(text));
	}
	
	public Collection<NamedEntityWithRoles> getRoles(Document parsedDoc) {

		Map<String,NamedEntityWithRoles> roleMap = new HashMap<String,NamedEntityWithRoles>();
		uk.ac.cam.ch.wwmm.chemicaltagger.Utils.writeXMLToFile(parsedDoc, "target/roles.xml");
		Nodes nodes = parsedDoc.query("//MOLECULE");
		for (int i = 0; i < nodes.size(); i++) {
			Element nodeElement = (Element) nodes.get(i);
			String role = "None";
			String chemicalName = "";
			if (nodeElement.getAttribute("role") != null)
				role = nodeElement.getAttribute("role").getValue();
			Nodes chemicalNodes = nodeElement.query(".//OSCAR-CM");
			for (int j = 0; j < chemicalNodes.size(); j++) {
				Element chemicalElement = (Element) chemicalNodes.get(j);
				chemicalName = chemicalName + " " + chemicalElement.getValue();
			}

			NamedEntityWithRoles roles = roleMap.get(chemicalName);
			if (roles == null) {
				roles = new NamedEntityWithRoles(chemicalName);
				roleMap.put(chemicalName, roles);
			}
			roles.addRole(new Role(role, getParentSentenceAsString(nodeElement.getParent())));

			roleMap.put(chemicalName, roles);
		}

		return roleMap.values();
	}
	
	private String getParentSentenceAsString(Node nodeElement) {
		if (nodeElement == null) return "";
		if (nodeElement instanceof Element) {
			if ("Sentence".equals(((Element)nodeElement).getLocalName())) {
				return sentenceExtractor.getStringValue((Element)nodeElement, " ");
			}
		}
		return getParentSentenceAsString(nodeElement.getParent());
	}

	public static void main(String[] args) {
		RoleIdentifier roleIdent = new RoleIdentifier();
		Collection<NamedEntityWithRoles> identifiedRoles = roleIdent.getRoles(
			"Potassium was washed with acetone. Salt in water"
		);
		LOG.info(identifiedRoles);
	}
}
