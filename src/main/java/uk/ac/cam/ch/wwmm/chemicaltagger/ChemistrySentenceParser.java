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

/***********************************************
 * Passes tagged sentences to the ANTLR grammar. 
 * And converts the output to an XML document.
 * 
 * @author pm286, lh359
 **********************************************/
public class ChemistrySentenceParser extends Thread {

	private InputStream taggedTokenInStream = null;
	private Tree parseTree = null;

	/**********************************************
	 * Constructor method for inputStream objects.
	 * 
	 * @param taggedTokenInputStream (InputStream)
	 *********************************************/
	public ChemistrySentenceParser(final InputStream taggedTokenInputStream) {
            this.taggedTokenInStream = taggedTokenInputStream;
		

	}

	/*******************************************
	 * Constructor method for String objects.
	 * 
	 * @param taggedTokenString (String)
	 *******************************************/
	public ChemistrySentenceParser(final String taggedTokenString) {
		try {
			this.taggedTokenInStream = IOUtils.toInputStream(taggedTokenString,"UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/************************************************
	 * Constructor method for POSContainer objects.
	 * 
	 * @param posContainer  (POSContainer)
	 *******************************************/
	public ChemistrySentenceParser(final POSContainer posContainer) {
		try {
			this.taggedTokenInStream = IOUtils.toInputStream(
					posContainer.getTokenTagTupleAsString(), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/********************************************
	 * Getter method for taggedTokenInputStream.
	 ******************************************/
	public InputStream getTaggedTokenInStream() {
		return taggedTokenInStream;
	}

	/*******************************************
	 * Setter method for taggedTokenInputStream.
	 *****************************************/
	public void setTaggedTokenInStream(final InputStream taggedTokenInStream) {
		this.taggedTokenInStream = taggedTokenInStream;
	}

	/**************************************
	 * Getter method for parseTree.
	 **************************************/
	public Tree getParseTree() {
		return parseTree;
	}

	/**************************************
	 * Setter method for parseTree.
	 **************************************/
	public void setParseTree(final Tree parseTree) {
		this.parseTree = parseTree;
	}

	public void run() {
		parseTags();
	}

	/********************************************
	 * Passes an inputstream to ANTLR and produces
	 * a parse tree.
	 * 
	 * @return parseTree (Tree)
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
				throw new RuntimeException("Antlr parser Error: "
						+ e.getMessage());

			}
			parseTree = (Tree) result.getTree();
		}
	}

	/*********************************************
	 * Creates an XML document from the parseTree.
	 * @return document (Document)
	 *******************************************/
	public Document makeXMLDocument() {
		return new ASTtoXML().convert(parseTree);
	}

}
