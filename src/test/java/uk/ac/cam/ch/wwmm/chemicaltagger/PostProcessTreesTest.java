package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import junit.framework.Assert;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Nodes;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.apache.log4j.Logger;
import org.junit.Test;

import uk.ac.cam.ch.wwmm.chemicaltagger.roles.ParsedDocumentCreator;


public class PostProcessTreesTest {
	
	private static Logger LOG = Logger.getLogger(PostProcessTreesTest.class);

	@Test
	public void testProcessACTAFile() throws ValidityException, ParsingException, IOException{
		PostProcessTrees postProcess = new PostProcessTrees();
		InputStream xmlStream = new Utils().getInputStream("uk/ac/cam/ch/wwmm/chemicaltagger/postProcessTrees/ACTA-f-00fc0883.xml");
		Document doc = new Builder().build(xmlStream);
		Document newDoc = postProcess.process(doc);
		
        Assert.assertEquals(doc.getValue(), newDoc.getValue());
		
	}
	
	@Test
	public void testProcessParagraph() throws ValidityException, ParsingException, IOException{
		PostProcessTrees postProcess = new PostProcessTrees();
		InputStream xmlStream = new Utils().getInputStream("uk/ac/cam/ch/wwmm/chemicaltagger/postProcessTrees/file5.xml");
		Document doc = new Builder().build(xmlStream);
		Document newDoc = postProcess.process(doc);
//		Utils.writeXMLToFile(newDoc,"target/testPara.xml");
        Assert.assertEquals(doc.getValue(), newDoc.getValue());

	}
	@Test
	public void PurifyPatternTest() throws UnsupportedEncodingException {
		
		String sentence = "the mixture was purified by column chromatography (hexane/AcOEt, 7/3) and added to the solution.";
		Document doc = new ParsedDocumentCreator().runChemicalTagger(sentence);
		Nodes solvents = doc.query(".//MOLECULE[@role='Solvent']");
//		LOG.debug(doc.toXML());
		Assert.assertEquals(2,solvents.size());
	}
	
	@Test
	public void RolePrepPhraseTest() throws UnsupportedEncodingException {
		String sentence = "the mixture was purified using hexane as an eluent";
		Document doc = new ParsedDocumentCreator().runChemicalTagger(sentence);
		Nodes roles = doc.query(".//MOLECULE[@role='Solvent']");
//		LOG.debug(doc.toXML());

		Assert.assertEquals(1,roles.size());
	}

}
