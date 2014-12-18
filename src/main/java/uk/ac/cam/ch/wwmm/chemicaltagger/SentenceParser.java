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

import nu.xom.Document;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.apache.commons.io.IOUtils;

/***********************************************
 * Passes tagged sentences to the ANTLR grammar. 
 * And converts the output to an XML document.
 * 
 * @author pm286, dl387, lh359
 **********************************************/
public abstract class SentenceParser extends Thread {

	private InputStream taggedTokenInStream = null;
	private Tree parseTree = null;

	/**********************************************
	 * Constructor method for inputStream objects.
	 * 
	 * @param taggedTokenInputStream (InputStream)
	 *********************************************/
	public SentenceParser(InputStream taggedTokenInputStream) {
            this.taggedTokenInStream = taggedTokenInputStream;
		

	}

	/*******************************************
	 * Constructor method for String objects.
	 * 
	 * @param taggedTokenString (String)
	 *******************************************/
	public SentenceParser(String taggedTokenString) {
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
	public SentenceParser(POSContainer posContainer) {
		try {
			this.taggedTokenInStream = IOUtils.toInputStream(
					posContainer.getTokenTagTupleAsString(), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/********************************************
	 * Getter method for taggedTokenInputStream.
	 * @return taggedTokenInStream (InputStream)
	 ******************************************/
	public InputStream getTaggedTokenInStream() {
		return taggedTokenInStream;
	}

	/*******************************************
	 * Setter method for taggedTokenInputStream.
	 * 
	 * @param taggedTokenInStream (InputStream)
	 ***********************************/
	public void setTaggedTokenInStream(InputStream taggedTokenInStream) {
		this.taggedTokenInStream = taggedTokenInStream;
	}

	/**************************************
	 * Getter method for parseTree.
	 * @return parseTree (Tree)
	 **************************************/
	public Tree getParseTree() {
		return parseTree;
	}

	/**************************************
	 * Setter method for parseTree.
	 * @param parseTree (Tree)
	 **************************************/
	public void setParseTree(ParseTree parseTree) {
		this.parseTree = parseTree;
	}

	/******************
	 * Runs the thread.
	 */
	public void run() {
		parseTags();
	}

	/********************************************
	 * Passes an inputstream to ANTLR and produces
	 * a parse tree.
	 * 
	 *******************************************/
	public abstract void parseTags();

	/*********************************************
	 * Creates an XML document from the parseTree.
	 * @return document (Document)
	 *******************************************/
	public abstract Document makeXMLDocument();

}
