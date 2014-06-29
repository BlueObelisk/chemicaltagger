/**
 * Copyright 2012 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
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
