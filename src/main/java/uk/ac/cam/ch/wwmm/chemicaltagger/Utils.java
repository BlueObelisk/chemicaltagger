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

package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.Node;
import nu.xom.ParentNode;
import nu.xom.Serializer;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;
import org.xmlcml.cml.base.CMLConstants;

/********************************************
 * A Utils class.
 * 
 * @author lh359, pm286
 ********************************************/
public class Utils {
	
	private static Pattern exponentXMLPattern = Pattern.compile("(-?\\d+)<sup>(-?\\d+)</sup>");

	/**************************
	 * Hides Utility Class Constructor.
	 */
	private Utils(){
		
	}
	/******************************************
	 * Replaces all non-XML characters with _ .
	 * 
	 * @param text (String)
	 * @return ncName (String)
	 *******************************************/
	public static String makeNCName(String text) {
		String ncName = text;
		if (text == null) {
			ncName = "emptyName";
		} else if (ncName.trim().length() == 0) {
			ncName = "emptyName";
		} else {
			ncName = ncName.trim();
			char c = ncName.charAt(0);
			if (!Character.isLetter(c) && c != '_') {
				ncName = '_' + ncName;
			}
			ncName = ncName.replaceAll("[^A-Za-z0-9_.-]", CMLConstants.S_UNDER);
		}
		return ncName;
	}

	/******************************************
	 * Writes out an XML document to a file.
	 * @param doc (Document)
	 * @param xmlFilename (String)
	 *******************************************/
	public static void writeXMLToFile(Document doc, String xmlFilename) {

		try {
			Serializer serializer = new Serializer(new FileOutputStream(
					xmlFilename), "UTF-8");
			serializer.write(doc);
			serializer.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/******************************************
	 * Cleans up text from html characters.
	 * @param paragraph (String)
	 * @return cleanedParagraph (String)
	 *******************************************/
	public static String cleanHTMLText(String paragraph) {
		String cleanedParagraph = paragraph;	
		cleanedParagraph = convertExponentials(cleanedParagraph);
		cleanedParagraph = Jsoup.clean(cleanedParagraph,new Whitelist());
		cleanedParagraph =Jsoup.parse(cleanedParagraph).text();
		return cleanedParagraph;
	}

	/**********************************
	 * Converts exponents in the format of 10<sup>16</sup> to 10 exp=16.
	 * This is mainly to avoid loss when cleaning xml tags.
	 * @param xmlExponential (String)
	 * @return nonXMLExponential (String).
	 */
	private static String convertExponentials(String xmlExponential) {
		String nonXMLExponential = xmlExponential;
		Matcher exponentialMatcher = exponentXMLPattern.matcher(xmlExponential);
		if (exponentialMatcher.find()){
		  nonXMLExponential = exponentialMatcher.replaceAll(exponentialMatcher.group(1)+"^"+exponentialMatcher.group(2));
		  
		}
		return nonXMLExponential;
	}

	/***********************************************************
	 * Loads a "sentence" file consisting of a single line of text. Has to be
	 * qualified file name e.g. uk/ac/cam/ch/wwmm/foo.txt.
	 * 
	 * @param resourceName (String)
	 * @return sentence (String)
	 **************************************************************/
	public static String readSentence(String resourceName) {
		// requires sentence with no newlines except possibly at end
		String sentence = null;
		try {
			InputStream refStream = ClassLoader
					.getSystemResourceAsStream(resourceName);

			sentence = IOUtils.toString(refStream, "UTF-8");
		} catch (IOException e) {
			throw new RuntimeException("Cannot read sentence: " + resourceName);
		}
		return sentence.trim();
	}

	/**************************************************************
	 * Returns the content of the resource as an inputstream.
	 * 
	 * @param pathName (String)
	 * @return sentence (String)
	 * @throws IOException
	 **************************************************************/
	public static String getPathAsInputStream(String pathName)
			throws IOException {

		String sentence = null;
		BufferedReader br = null;
		try {

			br = new BufferedReader(new InputStreamReader(
					new FileInputStream(new File(pathName)), "UTF-8"));
			sentence = br.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Cannot read sentence: " + pathName);
		}
		finally{
			IOUtils.closeQuietly(br);
		}
		return sentence.trim();
	}

	/**************************************************************
	 * Returns the content of the resource as an inputstream.
	 * 
	 * @param context (Class)
	 * @param pathName (String)
	 * @return sentence (String)
	 * @throws IOException
	 **************************************************************/
	public static InputStream getInputStream(Class<?> context, String pathName)
			throws IOException {

		InputStream inStream = context.getResourceAsStream(pathName);
		if (inStream == null) {
			throw new IOException("File not found: " + pathName
					+ " (using context " + context.getName() + ")");
		}

		return inStream;
	}

	/***********************************
	 * Checks if a string contains a number.
	 * 
	 * @param currentString (String)
	 * @return boolean
	 ***********************************/
	public static boolean containsNumber(String currentString) {
		for (char c : currentString.toCharArray()) {
			if (Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}

	/*******************************************
	 * Overloading method for running chemicalTagger
	 * Sets runSpectraTagger to false by default.
	 * @param text (String)
	 * @return doc (Document)
	 *****************************************/
	public static Document runChemicalTagger(String text) {
		return runChemicalTagger(text, false);

	}

	/*******************************************
	 * Convenience method for running chemicalTagger
	 * Includes a flag for setting spectraTagger.
	 * @param text (String)
	 * @param runSpectraTagger (boolean)
	 * @return doc (Document)
	 *****************************************/
	public static Document runChemicalTagger(String text,
			boolean runSpectraTagger) {
		ChemistryPOSTagger chemPos = ChemistryPOSTagger.getDefaultInstance();
        //ChemistryPOSTagger chemPos = new ChemistryPOSTagger(ctTokeniser, oscarTagger, regexTagger, openNLPTagger)
		POSContainer posContainer = chemPos.runTaggers(text);
		
		//POSContainer posContainer = chemPos.runTaggers(inputSentence, prioritiseOscar, useSpectraTagger)
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				posContainer);

		chemistrySentenceParser.parseTags();
		Document doc = chemistrySentenceParser.makeXMLDocument();
		return doc;
	}
	/**************************************
	 * Loads the tags from the .tokens file generated by Antlr.
	 * @param contextClass 
	 * @return HashSet
	 */
	@SuppressWarnings("unchecked")
	public static HashSet<String> loadsTagsFromFile(Class<?> contextClass) {
		HashSet<String> tagSet = new HashSet<String>();
		String pathName = "ChemicalChunker.tokens";
		InputStream inStream = contextClass.getClassLoader().getResourceAsStream(pathName);
		List<String> readlines = null;
		try {
			readlines = IOUtils.readLines(inStream);
		} catch (IOException e) {
			throw new RuntimeException("Could not load tokens file",e);
		}
		for (String line : readlines) {
			if (line.startsWith("'")){
			 String tag = line.split("'")[1];
			 tagSet.add(tag);	
			}
		}

		IOUtils.closeQuietly(inStream);
		return tagSet;
	}
	
	/**
	 * Gets the next terminal element. This element need not be a sibling
	 * @param startingEl
	 * @return
	 */
	public static Element getNextTerminalElement(Element startingEl) {
		ParentNode parent = startingEl.getParent();
		if (parent == null || !(parent instanceof Element)){
			return null;
		}
		int index = parent.indexOf(startingEl);
		if (index +1 >=parent.getChildCount()){
			return getNextTerminalElement((Element) parent);//reached end of element
		}
		Node nextNode = parent.getChild(index+1);
		if (!(nextNode instanceof Element)){
			return null;
		}
		Element next =(Element) nextNode;
		Elements children =next.getChildElements();
		while (children.size()!=0){
			next =children.get(0);
			children =next.getChildElements();
		}
		return next;
	}

	/**
	 * Gets the previous terminal element. This element need not be a sibling
	 * @param startingEl
	 * @return
	 */
	public static Element getPreviousTerminalElement(Element startingEl) {
		ParentNode parent = startingEl.getParent();
		if (parent == null || !(parent instanceof Element)){
			return null;
		}
		int index = parent.indexOf(startingEl);
		if (index ==0) {
			return getPreviousTerminalElement((Element) parent);//reached beginning of element
		}
		Node previousNode = parent.getChild(index-1);
		if (!(previousNode instanceof Element)){
			return null;
		}
		Element previous =(Element) previousNode;
		Elements children =previous.getChildElements();
		while (children.size()!=0){
			previous =children.get(children.size()-1);
			children =previous.getChildElements();
		}
		return previous;
	}
	
	/**
	 * Gets the previous sibling if one exists or the previous sibling of the first parent element with previous siblings
	 * @param startingEl
	 * @return
	 */
	public static Element getPreviousSiblingOrParentsSibling(Element startingEl) {
		ParentNode parent = startingEl.getParent();
		if (parent == null || !(parent instanceof Element)){
			return null;
		}
		int index = parent.indexOf(startingEl);
		if (index ==0) {
			return getPreviousSiblingOrParentsSibling((Element) parent);//reached beginning of element
		}
		Node previousNode = parent.getChild(index-1);
		if (!(previousNode instanceof Element)){
			return null;
		}
		return (Element) previousNode;
	}
	
	/********************************************
	 * Writes items of a list to a file.
	 * @param sentenceList
	 * @param filename
	 * @throws IOException 
	 ********************************************/
	public static void writeListToFile(List<String> sentenceList, String filename) throws IOException {
		OutputStream os = new FileOutputStream(new File(filename));
		IOUtils.writeLines(sentenceList, null, os, "UTF-8");
		IOUtils.closeQuietly(os);
	}
	
}
