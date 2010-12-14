package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;
import nu.xom.Document;
import nu.xom.Nodes;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import uk.ac.cam.ch.wwmm.chemicaltagger.roles.ParsedDocumentCreator;

public class HypernymTest {

	private static Logger LOG = Logger.getLogger(HypernymTest.class);

	@Ignore
	@Test
	/**************
	 * To test later,
	 * If hearst patterns
	 *  in chemicaltagger is implemented
	 ****************/
	public void HearstPatternTests() throws UnsupportedEncodingException {
		
		
		String sentence = "such acids as ferric chloride";
		Document doc = new ParsedDocumentCreator().runChemicalTagger(sentence);
		LOG.debug(doc.toXML());
	
		
		sentence = "alternative nonpolar solvents including toluene, heptane, hexane, and xylene";
		doc = new ParsedDocumentCreator().runChemicalTagger(sentence);
		LOG.debug(doc.toXML());
	
		
		
		sentence = "acetone or other ketones";
		doc = new ParsedDocumentCreator().runChemicalTagger(sentence);
		LOG.debug(doc.toXML());
	}

	
}
