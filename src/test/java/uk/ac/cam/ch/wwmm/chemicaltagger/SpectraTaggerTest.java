package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;

import junit.framework.Assert;
import nu.xom.Document;

import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class SpectraTaggerTest {


	@Test
	public void sentence1() throws IOException {
		String text = "The title compound was synthesized from ethyl 3-cyclopropyl-4H-furo[3,2-b]pyrrole-5-carboxylate (110 mg, 0.50 mmol) according to General Procedure 2 and was purified by flash chromatography (Isco CombiFlash, 0-60% EtOAc/heptane) to afford 3-cyclopropyl-4H-furo[3,2-b]pyrrole-5-carboxylic acid 31 (34 mg, 35%). 1H NMR (400 MHz, CD3OD) \u03B4 ppm 0.67-0.72 (m, 2H), 0.86-0.92 (m, 2H), 1.75-1.84 (m, 1H), 6.64 (s, 1H), 7.34 (d, J=0.83 Hz, 1H); LCMS-MS (ESI\u2212) 189.8 (M\u2212H); HPLC (UV=95.9%), (ELSD=100%). ";
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getInstance();
		posTagger.setRunSpectraTaggerFlag(true);
		POSContainer posContainer = posTagger.runTaggers(text);
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);

		chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		Document doc = new ASTtoXML().convert(t);

		doc.getRootElement().appendChild(posContainer.getSpectrumElementList());

		Assert.assertEquals("SpectrumList size:", 1, doc
				.query("//SpectrumList").size());
		Assert.assertEquals("Spectrum size:", 3, doc.query("//spectrum").size());
		Utils.writeXMLToFile(doc, "target/spectra.xml");

	}

}
