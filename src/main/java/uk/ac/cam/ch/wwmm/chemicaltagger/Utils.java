package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nu.xom.Document;
import nu.xom.Serializer;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringEscapeUtils;
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

		String cleanedParagraph = StringEscapeUtils.unescapeHtml(paragraph);
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
}
