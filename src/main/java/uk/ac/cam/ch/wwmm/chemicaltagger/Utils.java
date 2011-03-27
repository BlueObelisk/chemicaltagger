package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nu.xom.Document;
import nu.xom.Serializer;

import org.apache.commons.io.IOUtils;
import org.xmlcml.cml.base.CMLConstants;
import org.xmlcml.euclid.Util;

/********************************************
 * A Utils class.
 * 
 * @author lh359, pm286
 ********************************************/
public class Utils {

	/******************************************
	 * Replaces all non-XML characters with _ 
	 * @param text (String)
	 * @return text (String)
	 *******************************************/
	public static String makeNCName(String text) {
		if (text == null) {
			text = "emptyName";
		} else if (text.trim().length() == 0) {
			text = "emptyName";
		} else {
			text = text.trim();
			char c = text.charAt(0);
			if (!Character.isLetter(c) && c != '_') {
				text = '_' + text;
			}
			text = text.replaceAll("[^A-Za-z0-9_.-]", CMLConstants.S_UNDER);
		}
		return text;
	}

	/******************************************
	 * Writes out an XML document to a file. 
	 * @param doc (Document)
	 * @return xmlFilename (String)
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


	
	/***********************************************************
	 * Loads a "sentence" file consisting of a single line of text.
	 * Has to be qualified file name e.g. uk/ac/cam/ch/wwmm/foo.txt.
	 * @param resourceName (String)
	 * @return sentence (String)
	 **************************************************************/
	public static String readSentence(String resourceName) {
		// requires sentence with no newlines except possibly at end
		String sentence = null;
		try {
			InputStream refStream = ClassLoader
					.getSystemResourceAsStream(resourceName);

			sentence = IOUtils.toString(refStream,"UTF-8");
		} catch (IOException e) {
			throw new RuntimeException("Cannot read sentence: " + resourceName);
		}
		return sentence.trim();
	}

	/**************************************************************
	 * Returns the content of the resource as an inputstream
	 * 
	 * @param pathName  (String)
	 * @return sentence (String)
	 * @throws IOException 
	 **************************************************************/
	public static String getPathAsInputStream(String pathName)
			throws IOException {

		String sentence = null;
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(new File(pathName)), "UTF-8"));
			sentence = br.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Cannot read sentence: " + pathName);
		}
		return sentence.trim();
	}

	/**************************************************************
	 * Returns the content of the resource as an inputstream
	 * 
	 * @param pathName  (String)
	 * @return sentence (String)
	 * @throws IOException 
	 **************************************************************/
	public static InputStream getInputStream(Class<?> context, String pathName) throws IOException {
		
		InputStream inStream = context.getResourceAsStream(pathName);
		if (inStream == null) {
			throw new IOException("File not found: "+pathName+" (using context "+context.getName()+")");
		}

		return inStream;
	}

	/***********************************
	 * Checks if a string contains a number
	 * @param currentString (String)
	 * @return boolean
	***********************************/
	public static boolean containsNumber(String currentString) {
		for (char c : currentString.toCharArray()) {
			if (Character.isDigit(c)){
				return true;
			}
		}
		return false;
	}
}
