package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Nodes;

import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.xmlcml.cml.base.CMLUtil;
import org.xmlcml.cml.testutil.JumboTestUtils;

/*****************************
 * Tests that an experimental paragraph is parsed properly and checks the XML output.
 * @author pm286
 *****************************/

public class ConverterTest {
	private static final String DOCUMENT_ELEMENT = "Document";

	@Test
	public void runMe() throws Exception {
		new File("target/converter/out/").mkdirs();
		String fileOut = "target/converter/out/experiment.tagged.xml";
		InputStream refStream = Utils
				.getInputStream(this.getClass(),
						"/uk/ac/cam/ch/wwmm/chemicaltagger/converter/ref/experiment.tagged.xml");
		InputStream inStream = Utils
				.getInputStream(this.getClass(),
						"/uk/ac/cam/ch/wwmm/chemicaltagger/converter/in/experiment.xml");
		Document out = createTagged(inStream);
		Document ref = null;
		try {
			ref = new Builder().build(refStream);
		} catch (Exception e) {
			throw new RuntimeException("bug ", e);
		}
		OutputStream outStream = new FileOutputStream(fileOut);
		CMLUtil.debug(out.getRootElement(), outStream, 0);
		JumboTestUtils.assertEqualsCanonically("chemical tagger",
				ref.getRootElement(), out.getRootElement(), true);
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
			} else {
				String text = pNodes.get(0).getValue().replaceAll("\\s+", " ");
				doc = createTagged(text);
			}
		}
		return doc;
	}

	private Document createTagged(String text) {
		POSContainer posContainer = ChemistryPOSTagger.getInstance()
				.runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				tagged);
		Document doc = new Document(new Element(DOCUMENT_ELEMENT));
		try {
			chemistrySentenceParser.parseTags();
			Tree t = chemistrySentenceParser.getParseTree();
			ASTtoXML ast2XML = new ASTtoXML();
			doc = ast2XML.convert(t, false);
		} catch (Exception e) {
			throw new RuntimeException("Cannot parse with ANTLR: ", e);
		}
		return doc;
	}

}
