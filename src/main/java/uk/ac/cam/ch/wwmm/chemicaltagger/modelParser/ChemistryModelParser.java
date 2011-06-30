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

import java.io.IOException;
import java.io.InputStream;

import nu.xom.Document;
import opennlp.tools.cmdline.parser.ParserTool;
import opennlp.tools.parser.Parse;
import opennlp.tools.parser.Parser;
import opennlp.tools.parser.ParserFactory;
import opennlp.tools.parser.ParserModel;
import uk.ac.cam.ch.wwmm.chemicaltagger.Utils;

/************************************************
 *
 * Runs the ChemicalParser model against text.
 * 
 * @author lh359
 ************************************************/
public class ChemistryModelParser {

	private Parser parser;

	public ChemistryModelParser() {
		InputStream modelIn = null;
		ParserModel model = null;
		try {
			modelIn = Utils
					.getInputStream(getClass(),
							"/uk/ac/cam/ch/wwmm/chemicaltagger/modelParser/chem-parser-chunking.bin");
			model = new ParserModel(modelIn);

		} catch (IOException e) {
			e.printStackTrace();
		} 
		if (model != null)
			parser = ParserFactory.create(model);
		else
			throw new NullPointerException();
	}

	public void parseSentence(String sentence) {
		Parse[] topParses = ParserTool.parseLine(sentence, parser, 1);
		ParseTreetoXML parseToXML = new ParseTreetoXML();
		
		for (Parse parse : topParses) {
			Document doc = parseToXML.convert(parse);
			Utils.writeXMLToFile(doc,"target/testParse.xml");
			
		}
	}
}
