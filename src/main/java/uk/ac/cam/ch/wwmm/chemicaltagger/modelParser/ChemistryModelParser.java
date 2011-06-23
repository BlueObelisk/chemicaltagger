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
			parse.show();
			Document doc = parseToXML.convert(parse);
			Utils.writeXMLToFile(doc,"target/testParse.xml");
			
		}
	}
}
