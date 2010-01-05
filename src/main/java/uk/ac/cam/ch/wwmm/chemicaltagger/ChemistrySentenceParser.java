/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import nu.xom.Document;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.lang.time.StopWatch;
import org.apache.log4j.Logger;

/**
 * 
 * @author pm286
 */
public class ChemistrySentenceParser {

	private InputStream taggedTokenInStream = null;
	private final Logger LOG = Logger.getLogger(ChemistrySentenceParser.class);
	private Document doc = null;

	public ChemistrySentenceParser(String taggedTokenInputFilename) {

		File file = new File(taggedTokenInputFilename);
		try {
			this.taggedTokenInStream = new FileInputStream(file);
		} catch (FileNotFoundException ex) {

			LOG.debug("Exception : " + ex.getMessage());
		}

	}

	public ChemistrySentenceParser(InputStream taggedTokenInStream) {
		this.taggedTokenInStream = taggedTokenInStream;
	}

	/*********************
	 * 
	 * @param outputFilename
	 *********************/
	public void parseTagsToXMLFile(String outputFilename) {
		Document doc = parseTagsToDocument();
		Utils.writeXMLToFile(doc, outputFilename);

	}

	public Tree parseTags() {

		try {
			/**************************
			 * Pass File to Antlr
			 *************************/

			ANTLRInputStream input = new ANTLRInputStream(taggedTokenInStream);
			ChemicalChunkerLexer lexer = new ChemicalChunkerLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ChemicalChunkerParser parser = new ChemicalChunkerParser(tokens);
			ChemicalChunkerParser.document_return result = parser.document();
			Tree t = (Tree) result.getTree();
			return t;
		} catch (Exception e) {
			throw new RuntimeException("read parse fail", e);

		}

	}

	/*****************************************
	 * Pass parser to Tree and Convert to XML
	 *****************************************/
	public Document parseTagsToDocument() {
		Tree t = parseTags();
		doc = new ASTtoXML().convert(t);

		return doc;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) throws Exception {
		String taggedTokenInputFilename = null;
		String outputXMLFilename = null;

		if (args.length > 1) {
			taggedTokenInputFilename = args[0];
			outputXMLFilename = args[1];

		} else {
			taggedTokenInputFilename = "src/main/resources/antlr/chemicalInput.txt";
			outputXMLFilename = "target/astTree.xml";

		}
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				taggedTokenInputFilename);
		chemistrySentenceParser.parseTagsToXMLFile(outputXMLFilename);

	}
}
