package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Nodes;

import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;

public class RoleIdentifier {

	private ParsedDocumentCreator docCreator = null;
	private String text;
	private ChemistryPOSTagger chemPos;
	private static Logger LOG = Logger.getLogger(RoleIdentifier.class);

	
	public RoleIdentifier() {
		chemPos = ChemistryPOSTagger.getInstance();
	}

	public HashMap<String, List<String>> getRoles(String text) {
		if (docCreator == null) docCreator = new ParsedDocumentCreator();
		return getRoles(docCreator.runChemicalTagger(text));
	}
	
	public HashMap<String, List<String>> getRoles(Document parsedDoc) {
		HashMap<String, List<String>> roleMap = new HashMap<String, List<String>>();
		Nodes nodes = parsedDoc.query("//MOLECULE");
		for (int i = 0; i < nodes.size(); i++) {
			List<String> roles = new ArrayList<String>();
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

			if (roleMap.containsKey(chemicalName))
				roles = roleMap.get(chemicalName);

			roles.add(role);
			roleMap.put(chemicalName, roles);
		}

		return roleMap;
	}

	public static void main(String[] args) {
		RoleIdentifier roleIdent = new RoleIdentifier();
		HashMap<String, List<String>> identifiedRoles = roleIdent.getRoles(
			"Potassium was washed with acetone. Salt in water"
		);
		System.out.println(identifiedRoles);
	}
}
