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

package uk.ac.cam.ch.wwmm.chemicaltagger.modelParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import uk.ac.cam.ch.wwmm.chemicaltagger.Utils;

/****************************************************
 * First steps at creating a corpus for the ChemicalTagger model parser.
 * @author lezan
 *
 ***************************************************/
public class AnalysePatents {
	private static final Logger LOG = Logger.getLogger(AnalysePatents.class);

	public List<Document> getExperimentalParagraphs(String sourceFile)
			throws ValidityException, ParsingException, IOException,
			SAXException {
		Document doc = null;
		List<Document> docList = new ArrayList<Document>();
		LOG.info("Extracting paragraphs from " + sourceFile);
		boolean experimentalStart = false;
		XMLReader xmlReader;
		xmlReader = XMLReaderFactory.createXMLReader();
		xmlReader
				.setFeature(
						"http://apache.org/xml/features/nonvalidating/load-external-dtd",
						false);
		doc = new Builder(xmlReader).build(sourceFile);
		Element rootElement = (Element) doc.query("//description").get(0);
		for (int i = 0; i < rootElement.getChildCount(); i++) {
			if (!(rootElement.getChild(i) instanceof nu.xom.Text) && !(rootElement.getChild(i) instanceof nu.xom.ProcessingInstruction)) {
				
				Element childElement = (Element) rootElement.getChild(i);
				if (experimentalStart
						&& childElement.getLocalName().equalsIgnoreCase(
								"heading")
						&& !childElement.getValue().startsWith("EXAMPLE")) {
					experimentalStart = false;
				} else if (experimentalStart && childElement.getLocalName().equals("p")) {
					System.out.println(childElement.toXML());
					docList.add(new Document((Element)childElement.copy()));
				}
				
				else if (childElement.getLocalName().equalsIgnoreCase("heading")
						&& childElement.getValue().startsWith("EXAMPLE")) {
					experimentalStart = true;
				}
				
			}
		}

		return docList;
	}

	/************************************
	 * Main class.
	 * @param args
	 * @throws IOException
	 * @throws ValidityException
	 * @throws ParsingException
	 * @throws SAXException
	 */
	public static void main(String[] args) throws IOException,
			ValidityException, ParsingException, SAXException {

		String path = args[0];
		File patentDirectory = new File(path);
		String[] patentDir = patentDirectory.list();

		for (String file : patentDir) {
			String resourcePath = path + file;
			AnalysePatents extract = new AnalysePatents();
			List<Document> docList = extract.getExperimentalParagraphs(resourcePath);
			int index = 0;
			for (Document document : docList) {
				Utils.writeXMLToFile(document,
						"target/" + file.replace(".xml", "") + index + ".xml");
				index += 1;
			}

		}
	}
}
