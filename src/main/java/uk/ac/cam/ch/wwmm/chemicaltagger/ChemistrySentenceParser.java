/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;

import nu.xom.Document;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.IOUtils;

import uk.ac.cam.ch.wwmm.pregenerated.ChemicalChunkerLexer;
import uk.ac.cam.ch.wwmm.pregenerated.ChemicalChunkerParser;

/*****************************************
 * Passes tagged sentences to the ANTLR grammar. And converts the output to XML
 * Documents.
 * 
 * @author pm286, lh359
 *****************************************/
public class ChemistrySentenceParser extends Thread {

	private InputStream taggedTokenInStream = null;
	private Tree parseTree = null;

	/*********************************
	 * Constructor Class.
	 * 
	 * @param taggedTokenInputStream
	 *            (File)
	 *********************************/
	public ChemistrySentenceParser(InputStream taggedTokenInputStream) {
            this.taggedTokenInStream = taggedTokenInputStream;
		

	}

	/*******************************************
	 * Constructor Class.
	 * 
	 * @param taggedTokenString
	 *            (InputStream)
	 *******************************************/
	public ChemistrySentenceParser(String taggedTokenString) {
		try {
			this.taggedTokenInStream = IOUtils.toInputStream(taggedTokenString,
					"UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*******************************************
	 * Constructor Class.
	 * 
	 * @param posContainer
	 *            (POSContainer)
	 *******************************************/
	public ChemistrySentenceParser(POSContainer posContainer) {
		try {
			this.taggedTokenInStream = IOUtils.toInputStream(
					posContainer.getTokenTagTupleAsString(), "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public InputStream getTaggedTokenInStream() {
		return taggedTokenInStream;
	}

	public void setTaggedTokenInStream(InputStream taggedTokenInStream) {
		this.taggedTokenInStream = taggedTokenInStream;
	}

	public void setParseTree(Tree parseTree) {
		this.parseTree = parseTree;
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

	public Document makeXMLDocument() {
		return new ASTtoXML().convert(parseTree);
	}

}
