package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.UnsupportedEncodingException;

import nu.xom.Document;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;


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
		Document doc = Utils.runChemicalTagger(sentence);
		LOG.debug(doc.toXML());
	
		
		sentence = "alternative nonpolar solvents including toluene, heptane, hexane, and xylene";
		doc = Utils.runChemicalTagger(sentence);
		LOG.debug(doc.toXML());
	
		
		
		sentence = "acetone or other ketones";
		doc = Utils.runChemicalTagger(sentence);
		LOG.debug(doc.toXML());
	}

	
}
