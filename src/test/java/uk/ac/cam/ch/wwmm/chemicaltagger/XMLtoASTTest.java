package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.junit.Test;


public class XMLtoASTTest {
	
	@Test
	public void convertTest() throws IOException, ValidityException, ParsingException {
		XMLtoAST xmlAst = new XMLtoAST();
		String pathName = "/uk/ac/cam/ch/wwmm/chemicaltagger/xmlToASTFiles/testXMLFile.xml";
	    InputStream in = Utils.getInputStream(this.getClass(),pathName);	
	    Document doc = new Builder().build(in);
	    xmlAst.convert(doc);
	}
}
