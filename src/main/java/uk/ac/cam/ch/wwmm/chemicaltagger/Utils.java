package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nu.xom.Document;
import nu.xom.Serializer;

import org.xmlcml.cml.base.CMLConstants;
import org.xmlcml.euclid.Util;

/********************************************
 * A Utils class.
 * 
 * @author lh359, pm286
 ********************************************/
public class Utils {

	public static void checkOutputDir(String outputDir) {
		if (!new File(outputDir).exists()) {
			new File(outputDir).mkdir();
		}
	}

	public static List<String> addToList(String string) {
		List<String> arrayList = new ArrayList<String>();

		for (String item : string.split(" ")) {
			arrayList.add(item);
		}
		return arrayList;
	}

	/******************************************
	 * replaces all non-XML characters with _
	 * 
	 * @param text
	 * @return
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

	public static void writeXMLToFile(Document doc, String xmlFilename) {

		try {
			Serializer serializer = new Serializer(new FileOutputStream(
					xmlFilename));
			serializer.write(doc);
			serializer.flush();
		} catch (IOException ex) {
			System.err.println("error" + ex);
		}
	}

	private boolean isNumeric(String input) {
		boolean flag = false;

		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	/************************************
	 * First attempt at tidying up sentences. Separates words conjealed together
	 * 
	 * @param sentence
	 * @return newSentence
	 *************************************/
	public static String formatSentence(String sentence) {
		StringBuilder newSentence = new StringBuilder();
		sentence = sentence.replace("%", " %").replace(";", " ;");
		String[] words = sentence.split(" ");
		String regexString = "−?[A-Z]+[a-z]*\\.";
		List<String> abvList = addToList("et. al. etc. e.g. i.e."); 
		
        Pattern pattern = Pattern.compile(regexString);
		for (String string : words) {
			String prefix = " ";
			String suffix = " ";
			string = string.replace(" ","");
			Matcher myMatcher = pattern.matcher(string);
			if ((string.endsWith(".")) && (!myMatcher.find()) && (!abvList.contains(string)) ) {
				string = string.substring(0, string.length() - 1);
				suffix = " ." + suffix;
			}
			
			if ( (string.endsWith(".") && string.startsWith("°C")) ) {
				string = string.substring(0, string.length() - 1);
				suffix = " ." + suffix;
			}

			if (string.endsWith(",")) {
				string = string.substring(0, string.length() - 1);
				suffix = " ," + suffix;
			}

			if (string.startsWith("(")) {
				String subString = string.substring(1, string.length());
				int i = Util.indexOfBalancedBracket('(', string);

				if (i < 0) {
					string = subString;
					prefix = prefix + "( ";
				}

			} else if (string.trim().endsWith(")")) {
				String subString = string.substring(0, string.length() - 1);
				int i = Util.indexOfBalancedBracket('(', string);
				if (i < 0) {

					string = subString;
					suffix = " )" + suffix;
				}

			}

			newSentence.append(prefix + string + suffix);
		}
		System.err.println("***Sentence "+newSentence.toString().replace("  ", " ").trim());

		return newSentence.toString().replace("  ", " ").trim();
	}

	/**
	 * 
	 * loads a "sentence" file consisting of a single line of text
	 * 
	 * @param resourceName
	 *            qualified file name e.g. uk/ac/cam/ch/wwmm/foo.txt
	 * @return
	 */
	public static String readSentence(String resourceName) {
		// requires sentence with no newlines except possibly at end
		String sentence = null;
		try {
			InputStream refStream = ClassLoader
					.getSystemResourceAsStream(resourceName);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					refStream, Charset.forName("UTF-8")));
			sentence = br.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Cannot read sentence: " + resourceName);
		}
		return sentence.trim();
	}

	/**
	 * 
	 * Returns the content of the resource as an inputstream
	 * 
	 * @param pathName
	 *            qualified file name e.g. uk/ac/cam/ch/wwmm/foo.txt
	 * @return
	 */
	public static InputStream getInputStream(String pathName) {
		// requires sentence with no newlines except possibly at end
		InputStream inStream;
		inStream = ClassLoader.getSystemResourceAsStream(pathName);

		return inStream;
	}
}
