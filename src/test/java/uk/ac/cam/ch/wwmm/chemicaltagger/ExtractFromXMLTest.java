package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.Assert;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.junit.Test;

/*****************************
 * Tests the getContent method in ExtractFromXML.
 *  
 * @author lh359
 *****************************/
public class ExtractFromXMLTest {

	@Test
	public void testGetXMLContent() throws IOException, ValidityException,ParsingException {

		String path = "uk/ac/cam/ch/wwmm/chemicaltagger/xmlFiles/experiment.xml";
		InputStream in = ClassLoader.getSystemResourceAsStream(path);
		
		String actual = ExtractFromXML.getContent(in, "//p");
	    String expected = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/xmlFiles/experimentContent");
	    Assert.assertEquals("Extracted Content",expected, actual);
	}

}
