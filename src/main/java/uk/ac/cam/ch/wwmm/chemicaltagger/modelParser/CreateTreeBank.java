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
package uk.ac.cam.ch.wwmm.chemicaltagger.modelParser;

import java.io.File;
import java.io.IOException;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Node;
import nu.xom.Nodes;
import nu.xom.ParsingException;
import nu.xom.Text;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import uk.ac.cam.ch.wwmm.chemicaltagger.Utils;
import uk.ac.cam.ch.wwmm.chemicaltagger.XMLtoAST;

/********************************************************************
 * Creates a Treebank from the rule-based ChemicalTagger output 
 * @author lh359
 ********************************************************************/
public class CreateTreeBank {
	private static final Logger LOG = Logger.getLogger(CreateTreeBank.class);
	
	/************************************************
	 * Extracts the content from the patent files.
	 * @param sourceFile
	 * @return
	 */
	public String getContent(String sourceFile) {
		Builder builder = new Builder();
		Document doc = null;
        LOG.info("Extracting data from "+sourceFile);
		String content = "";

		try {
			doc = builder.build(sourceFile);
			Nodes sections = doc.query("//p");
			for (int i = 0; i < sections.size(); i++) {

				Node node = sections.get(i);
				for (int j = 0; j < node.getChildCount(); j++) {
					if (node.getChild(j) instanceof Text) {
						String cleanNode = node.getChild(j).getValue().trim();
						if (cleanNode.toLowerCase().startsWith("tlc") ||cleanNode.toLowerCase().startsWith("mass sp")) {
							break;
						} else {
							content = content + " " + cleanNode;
						}
						
					}

				}
			}

			String spectra = "";
			Nodes spectrum = doc.query("//spectrum");
			for (int i = 0; i < spectrum.size(); i++) {
				String cleanSpectrum = spectrum.get(i).getValue().trim().replace("\n", "");
				if (StringUtils.isNotEmpty(cleanSpectrum)) {
					spectra = spectra + " " + cleanSpectrum;
				}

			}

		} catch (ParsingException ex) {
			LOG.fatal("ParsingException " + ex.getMessage(),
					new RuntimeException());
		} catch (IOException ex) {

			LOG.fatal(ex.getMessage(), new RuntimeException());
		}
		return content;
	}
	/******************************************************
	 * Main class.
	 * @param args
	 * @throws IOException
	 ****************************************************/
	public static void main (String[] args) throws IOException {
		
		String path = args[0];
		File patentDirectory = new File(path);
		String[] patentDir = patentDirectory.list();
		XMLtoAST xmlAst = new XMLtoAST();
		
		for (String file : patentDir) {
			String resourcePath = path + file;
			CreateTreeBank extract = new CreateTreeBank();
			String content = extract.getContent(resourcePath);
			Document doc = Utils.runChemicalTagger(content); 
			xmlAst.convert(doc);
			Utils.writeListToFile(xmlAst.getSentenceList(),"target/"+file.replace("xml", "txt"));
		}
	}
}
