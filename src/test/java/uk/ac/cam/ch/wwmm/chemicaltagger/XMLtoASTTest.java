/**
 * Copyright 2011 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
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

import junit.framework.Assert;

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
	    Assert.assertEquals("SentenceList size", 4, xmlAst.getSentenceList().size());
	}
}
