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
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import uk.ac.cam.ch.wwmm.pregenerated.ChemicalChunkerLexer;
import uk.ac.cam.ch.wwmm.pregenerated.ChemicalChunkerParser;

/*****************************************
 * Passes Tagged Sentences to the antlr chunker. And can convert the output to
 * XML Documents.
 * 
 * @author pm286, lh359
 *****************************************/
public class ChemistrySentenceParser extends Thread {

	private InputStream taggedTokenInStream = null;
	private final Logger LOG = Logger.getLogger(ChemistrySentenceParser.class);
	private Document doc = null;
	private Tree parseTree = null;
	private POSContainer posContainer = null;

	/*********************************
	 * Constructor Class.
	 * 
	 * @param taggedTokenInputFilename
	 *            (String)
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
	 * 
	 * @param taggedTokenInStream
	 *            (InputStream)
	 *******************************************/
	public ChemistrySentenceParser(InputStream taggedTokenInStream) {
		this.taggedTokenInStream = taggedTokenInStream;
	}

	public ChemistrySentenceParser(POSContainer posContainer) {
		this.posContainer = posContainer;
		try {
			this.taggedTokenInStream = IOUtils.toInputStream(
					posContainer.getTokenTagTupleAsString(), "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		parseTags();
	}

	public Tree getParseTree() {
		return parseTree;
	}

	/********************************************
	 * Main Function Pass inputStream to Antlr and produces an astTree as
	 * output.
	 * 
	 * @return astTree (Tree)
	 *******************************************/
	public void parseTags() {
		ChemicalChunkerLexer lexer = null;

		if (taggedTokenInStream == null)
			parseTree = null;
		else {
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
		}
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

	}

	public Document getDocument() {
		// TODO Auto-generated method stub
		return new ASTtoXML().convert(parseTree, true);
	}

}
