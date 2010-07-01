/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import nu.xom.Document;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;

import uk.ac.cam.ch.wwmm.pregenerated.ChemicalChunkerLexer;
import uk.ac.cam.ch.wwmm.pregenerated.ChemicalChunkerParser;

/*****************************************
 * Passes Tagged Sentences to the
 * antlr chunker. And can convert the
 * output to XML Documents.
 * 
 * @author pm286, lh359
 *****************************************/
public class ChemistrySentenceParser extends Thread {

	private InputStream taggedTokenInStream = null;
	private final Logger LOG = Logger.getLogger(ChemistrySentenceParser.class);
	private Document doc = null;
    private Tree parseTree = null;
	/*********************************
	 * Constructor Class.
	 * @param  taggedTokenInputFilename (String)
	 *********************************/
	public ChemistrySentenceParser(String taggedTokenInputFilename) {

		File file = new File(taggedTokenInputFilename);
		try {
			this.taggedTokenInStream = new FileInputStream(file);
		} catch (FileNotFoundException ex) {

			LOG.debug("File not found exception : " + ex.getMessage());
		}

	}
    /*******************************************
     * Constructor Class.
     * @param taggedTokenInStream (InputStream)
     *******************************************/
	public ChemistrySentenceParser(InputStream taggedTokenInStream) {
		this.taggedTokenInStream = taggedTokenInStream;
	}

	
	public void run(){
		parseTags();
	}
	
	public Tree getTree(){
		return parseTree;
	}
	/********************************************
	 * Main Function
	 * Pass inputStream to Antlr and produces an
	 * astTree as output.
	 * @return astTree (Tree)
	 *******************************************/
	public Tree parseTags() {
		ChemicalChunkerLexer lexer = null;

		ANTLRInputStream input;
		try {
			input = new ANTLRInputStream(taggedTokenInStream, "UTF-8");
		} catch (IOException ioexception) {
			throw new RuntimeException("Antlr input Stream Error: "
					+ ioexception.getMessage());
		}

		lexer = new ChemicalChunkerLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ChemicalChunkerParser parser = new ChemicalChunkerParser(tokens);
		ChemicalChunkerParser.document_return result = null;
		try {
			result = parser.document();
		} catch (RecognitionException e) {
			throw new RuntimeException("Antlr input Stream Error: "
					+ e.getMessage());

		}
		parseTree = (Tree) result.getTree();
		return parseTree;

	}

	/************************************
	 * Produces the output of the AntlrParse
	 * as an XML Document.
	 * @return doc (Document)
	 ************************************/
	public Document parseTagsToDocument() {
		Tree t = parseTags();
		doc = new ASTtoXML().convert(t);

		return doc;
	}

	/************************************
	 * Saves the output of the AntlrParse
	 * as an XML file.
	 ************************************/
	public void parseTagsToXMLFile(String outputFilename) {
		Document doc = parseTagsToDocument();
		Utils.writeXMLToFile(doc, outputFilename);

	}

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
