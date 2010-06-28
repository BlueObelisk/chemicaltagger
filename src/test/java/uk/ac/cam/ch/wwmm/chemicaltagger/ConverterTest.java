package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Nodes;

import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.xmlcml.cml.base.CMLUtil;
import org.xmlcml.cml.testutil.JumboTestUtils;

public class ConverterTest {
	private static final String DOCUMENT_ELEMENT = "Document";

	@Test
	public void runMe() throws Exception {
		String fileIn = "src/test/resources/converter/in/experiment.xml";
		String fileOut = "converter/out/experiment.tagged.xml";
		String fileRef = "src/test/resources/converter/ref/experiment.tagged.xml";
		InputStream in = new FileInputStream(fileIn);
		Document out = createTagged(in);
		Document ref = CMLUtil.parseQuietlyToDocument(new File(fileRef));
//		OutputStream outStream = new FileOutputStream(fileOut);
		JumboTestUtils.assertEqualsCanonically(
				"chemical tagger", ref.getRootElement(), out.getRootElement(), true);
	}
	
	private Document createTagged(InputStream inputStream) {
		Document inDocument = null;
		try {
			inDocument = new Builder().build(inputStream);
		} catch (Exception e) {
			throw new RuntimeException("Cannot parse experimental ", e);
		}
		Document doc = new Document(new Element(DOCUMENT_ELEMENT));
		if (inDocument != null) {
			Nodes pNodes = inDocument.query("*/*[local-name()='p']");
			if (pNodes.size() != 1) {
//				recordElement.addError("Need exactly one p in experimental; found "+pNodes.size());
			} else {
				// ignore inline markup for now
				String text = pNodes.get(0).getValue().replaceAll("\\s+", " ");
				doc = createTagged(text);
			}
		}
		return doc;
	}
	

	private Document createTagged(String text) {
//		String text = "A solution of 124C (7.0 g, 32.4 mmol) in concentrate H2SO4 (9.5 mL) was added to a solution of concentrate H2SO4 (9.5 mL) and fuming HNO3 (13 mL) and the mixture was heated at 60°C for 30 min. After cooling to room temperature, the reaction mixture was added to iced 6M solution of NaOH (150 mL) and neutralized to pH 6 with 1N NaOH solution. The reaction mixture was extracted with dichloromethane (4x100 mL). The combined organic phases were dried over Na2SO4, filtered and concentrated to give 124D as a solid."; 
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = null;
		try {
			in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		} catch (Exception e) {
			throw new RuntimeException("cannot read chemical input: "+tagged, e);
		}
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(in);
		Document doc = new Document(new Element(DOCUMENT_ELEMENT));
		try {
			Tree t = chemistrySentenceParser.parseTags();
			ASTtoXML ast2XML = new ASTtoXML();
			doc = ast2XML.convert(t);
		} catch (Exception e) {
			throw new RuntimeException("Cannot parse with ANTLR: ", e);
		}
		return doc;
	}



}
