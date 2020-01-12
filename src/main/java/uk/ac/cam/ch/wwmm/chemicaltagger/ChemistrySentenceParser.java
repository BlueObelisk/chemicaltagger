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
package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import nu.xom.Document;
import nu.xom.Serializer;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;

import uk.ac.cam.ch.wwmm.chemicaltagger.pregenerated.ChemicalChunkerLexer;
import uk.ac.cam.ch.wwmm.chemicaltagger.pregenerated.ChemicalChunkerParser;

/***********************************************
 * Passes tagged sentences to the ANTLR grammar. 
 * And converts the output to an XML document.
 * 
 * @author pm286, dl387, lh359
 **********************************************/
public class ChemistrySentenceParser extends SentenceParser {
		
	Document doc = null;

	/**********************************************
	 * Constructor method for inputStream objects.
	 * 
	 * @param taggedTokenInputStream (InputStream)
	 *********************************************/
	public ChemistrySentenceParser(InputStream taggedTokenInputStream) {
		super(taggedTokenInputStream);
	}


	/*******************************************
	 * Constructor method for String objects.
	 * 
	 * @param taggedTokenString (String)
	 *******************************************/
	public ChemistrySentenceParser(String taggedTokenString) {
		super(taggedTokenString);
	}
	
	/************************************************
	 * Constructor method for POSContainer objects.
	 * 
	 * @param posContainer  (POSContainer)
	 *******************************************/
	public ChemistrySentenceParser(POSContainer posContainer) {
		super(posContainer);
	}

	@Override
	/********************************************
	 * Passes an inputstream to ANTLR and produces
	 * a parse tree.
	 * 
	 *******************************************/
	public void parseTags() {
		ChemicalChunkerLexer lexer = null;

		if (getTaggedTokenInStream() == null) {
			setParseTree(null);
		} else {
			ANTLRInputStream input;
			try {
				input = new ANTLRInputStream(new InputStreamReader(
						getTaggedTokenInStream(), "UTF-8"));
			} catch (IOException ioexception) {
				throw new RuntimeException("Antlr input Stream Error: "
						+ ioexception.getMessage());
			}

			lexer = new ChemicalChunkerLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			ChemicalChunkerParser parser = new ChemicalChunkerParser(tokens);
			parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
						
			ParseTree documentContext = null;

			try {
				documentContext = parser.document(); // STAGE 1
			} catch (Exception ex) {
				tokens.reset(); // rewind input stream
				parser.reset();
				parser.getInterpreter().setPredictionMode(PredictionMode.LL);
				documentContext = parser.document(); // STAGE 2
			}
			
			doc = new ASTtoXML().convert(documentContext, false);

			setParseTree(documentContext);

		}

	}
	
	
	
	@Override
	/*********************************************
	 * Creates an XML document from the parseTree.
	 * @return document (Document)
	 *******************************************/
	public Document makeXMLDocument() {

		return makeXMLDocument(true);

	}

	public Document makeXMLDocument(boolean annotateActionPhrases) {

		if (annotateActionPhrases) {
			PostProcessTrees procTree = new PostProcessTrees();
			doc = procTree.process(doc);
		}

		return doc;

	}
	
	public void printPrettyXML(Document doc) {

		try {

			Serializer serializer = new Serializer(System.out, "UTF-8");
			serializer.setIndent(4);
			serializer.setMaxLength(64);
			serializer.write(doc);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	


}
