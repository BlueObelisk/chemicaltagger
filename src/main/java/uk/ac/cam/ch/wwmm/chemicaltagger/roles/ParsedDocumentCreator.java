package uk.ac.cam.ch.wwmm.chemicaltagger.roles;

import nu.xom.Document;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistrySentenceParser;
import uk.ac.cam.ch.wwmm.chemicaltagger.POSContainer;

public class ParsedDocumentCreator {

	private ChemistryPOSTagger chemPos;

	public ParsedDocumentCreator() {
		chemPos = ChemistryPOSTagger.getInstance();
	}

	public Document runChemicalTagger(String text) {
		POSContainer posContainer = chemPos.runTaggers(text);

		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);

		chemistrySentenceParser.parseTags();
		Document doc = chemistrySentenceParser.makeXMLDocument();
		return doc;
	}

}
