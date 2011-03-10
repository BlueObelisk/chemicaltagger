package uk.ac.cam.ch.wwmm.chemicaltagger.roles;

import java.io.IOException;
import java.io.InputStream;

import nu.xom.Document;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.IOUtils;

import uk.ac.cam.ch.wwmm.chemicaltagger.ASTtoXML;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistrySentenceParser;
import uk.ac.cam.ch.wwmm.chemicaltagger.POSContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.Utils;

public class ParsedDocumentCreator {

	private ChemistryPOSTagger chemPos;

	public ParsedDocumentCreator() {
		chemPos = ChemistryPOSTagger.getInstance();
	}

	public Document runChemicalTagger(String text) {
		POSContainer posContainer = chemPos.runTaggers(text);

		InputStream in =  null;
		try {
			String tagTuple = posContainer.getTokenTagTupleAsString();
			in = IOUtils.toInputStream(tagTuple, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		chemistrySentenceParser.parseTags();
		Document doc = chemistrySentenceParser.makeXMLDocument();
		return doc;
	}

}
