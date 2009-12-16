package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExtractFromPatentTest {

	/*@Before
	public void setUp() throws Exception {
	}*/

	@Test
	public void testGetContent() {
            String resourcePath = "src/test/resources/patents/paragraph0018.xml";

            ExtractFromPatent extract = new ExtractFromPatent();
            DocumentContainer docContainer = extract.getContent(resourcePath);
            String patentContent = docContainer.getContent();
            System.out.println(patentContent);

        }

}
