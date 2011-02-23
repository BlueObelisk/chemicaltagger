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
			System.out.println(tagTuple);
			in = IOUtils.toInputStream(tagTuple, "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		ASTtoXML ast2XML = new ASTtoXML();
		Document doc = ast2XML.convert(t, true);
		Utils.writeXMLToFile(doc, "target/roleIdentifier.xml");
		return doc;
	}

}
