package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import java.io.File;

import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;
import org.junit.Test;

import uk.ac.cam.ch.wwmm.chemicaltagger.ASTtoXML;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistrySentenceParser;
import uk.ac.cam.ch.wwmm.chemicaltagger.POSContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.Utils;

public class ExtractFromXMLTest {

	private final Logger LOG = Logger.getLogger(ExtractFromXMLTest.class);

	@Test
	public void testGetPatentContent() {

		String path = "src/test/resources/uk/ac/cam/ch/wwmm/chemicaltagger/xmlFiles/";

		File patentDirectory = new File(path);
		String[] patentDir = patentDirectory.list();
		for (String file : patentDir) {


			String test = "The refined procedure for the synthesis of (I) is as follows: A solution of 2,6-diisopropyl aniline (4.695 g, 26.5 mmol s) and formic acid (7.314 g, 159.0 mmol, 6eq.) in chloroform (20 ml) was refluxed with continuous stirring for 16 hrs. The colour of the solution changed from yellow to green to colorless over the course of the reaction. The solvent and excess formic acid were removed under vacuum to yield the title compound as a white solid. Needle-like single crystals suitable for X-ray analysis were obtained from slow evaporation of a chloroform solution (5.00 g, 92%). 1 -NMR (CDCl , p.p.m.): Two rotomers observed in 2:1 ratio.";
			test = "Minor Rotomer: 1.20 (d, J = 6.9 Hz, 12H, -CH(CH ) ), 3.20 (septet, J = 6.9 Hz, 2H, -CH(CH ) ) 7.02 (d, J = 11.2 Hz, 1H, -NH-), 7.19 (m, 2H, aromatic), 7.30 (m, 1H, aromatic), 8.0 (d, J = 11.2 Hz, 1H, -C(H)=O). C-NMR (CDCl , p.p.m.), Major Rotomer: 23.77 (-CH(CH ) ), 28.6 (-CH(CH ) ), 123.9, 129.0, 130.4, 146.9, 165.9 (-C(H)=O). ESI-MS (m/ ): calcd. for C13H19NO; ";
			
			POSContainer posContainer = ChemistryPOSTagger.getInstance()
					.runTaggers(test);

			ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);

			chemistrySentenceParser.parseTags(); Tree t = chemistrySentenceParser.getParseTree();
			ASTtoXML ast2XML = new ASTtoXML();
			Utils.writeXMLToFile(ast2XML.convert(t),
					"target/taggedExperiment.xml");

		}
	}

}
