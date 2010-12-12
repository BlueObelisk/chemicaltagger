package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import nu.xom.Document;

import org.antlr.runtime.tree.Tree;

public class ParsedDocumentCreator {

	private ChemistryPOSTagger chemPos;

	public ParsedDocumentCreator() {
		chemPos = ChemistryPOSTagger.getInstance();
	}

	public Document runChemicalTagger(String text) {
		POSContainer posContainer = chemPos.runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = null;
		try {
			in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		Document doc = ast2XML.convert(t, true);
		return doc;
	}

}
