package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
					xmlFilename), "UTF-8");
			serializer.write(doc);
			serializer.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
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
		sentence = sentence.replace("  ", " ");
		sentence = sentence.replace("%", " %").replace(";", " ;")
				.replace(":", " : ");

		String[] words = sentence.split(" ");
		String abbreviationRegex = "−?[A-Z]+[a-z]*\\.";
		String concatAmountRegex = "(\\d\\d+(m|k|µ)?(l|L|g|gram|mol|cm3)(s)?$)|(\\d(L|ml|mL|gram|mol|cm3)(s)?$)";
		String concatTempRegex = "\\d+(\\xb0|&#0176|\\xc3\\x97|o|°|º)(C|c)";
		List<String> abvList = addToList("et. al. etc. e.g. i.e. vol. ca. wt. aq.");
		List<String> htmlList = addToList("gt; lt;");
		List<String> nextTokenList = addToList("gram vol %");
		Pattern abbreviationPattern = Pattern.compile(abbreviationRegex);
		Pattern concatAmountPattern = Pattern.compile(concatAmountRegex);
		Pattern concatTempPattern = Pattern.compile(concatTempRegex);

		int index = 0;
		for (String string : words) {
			String prefix = " ";
			String suffix = " ";
			string = string.replace(" ", "");
			Matcher abbreviationMatcher = abbreviationPattern.matcher(string);
			if ((string.endsWith(".")) && (!abbreviationMatcher.find())
					&& (!abvList.contains(string))) {
				if (!stopWordAfter(words, index, nextTokenList)) {
					string = string.substring(0, string.length() - 1);
					suffix = " ." + suffix;
				}
			}

			if ((string.endsWith(";") && !htmlList.contains(string
					.toLowerCase()))) {
				string = string.substring(0, string.length() - 1);
				suffix = " ;" + suffix;
			}

			if ((string.endsWith(".") && string.contains("°C"))) {
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
				String subString = string.substring(0, string.length()-1);

				if (subString.indexOf('(') < 0) {
					string = subString;
					suffix = " )" + suffix;
				}

			}

			if (string.startsWith("(") && string.endsWith(")")) {
				String subString = string.substring(1, string.length() - 1);

				string = subString;
				prefix = prefix + "( ";
				suffix = " )" + suffix;
			}

			Matcher concatAmountMatcher = concatAmountPattern.matcher(string);
			if (concatAmountMatcher.find()) {
				string = splitAmounts(string);
			}

			Matcher concatTempMatcher = concatTempPattern.matcher(string);
			if (concatTempMatcher.find()) {
				string = splitTemparature(string);
			}
			if (string.equals("K.") && index > 0) {
				if (isNumber(words[index - 1])) {
					string = "K .";
				}
			}
			index++;

			newSentence.append(prefix + string + suffix);
		}
		// System.err.println("***Sentence "
		// + newSentence.toString().replace("  ", " ").trim());

		return newSentence.toString().replace("  ", " ").trim();
	}

	private static String splitAmounts(String string) {
		String newString = string;
		String numbers = "";
		String letters = "";

		for (char ch : string.toCharArray()) {
			if (Character.isLetter(ch)) {
				letters = letters + ch;
			}
			if (Character.isDigit(ch)) {
				numbers = numbers + ch;
			}

		}
		newString = numbers + " " + letters;
		return newString;
	}

	private static String splitTemparature(String string) {
		String newString = string;
		String numbers = "";

		for (char ch : string.toCharArray()) {

			if (Character.isDigit(ch)) {
				numbers = numbers + ch;
			}

		}
		newString = string.replace(numbers, numbers + " ");
		return newString;
	}

	private static boolean isNumber(String word) {

		for (char ch : word.toCharArray()) {

			if (Character.isDigit(ch)) {

			} else {
				return false;
			}

		}

		return true;
	}

	private static boolean stopWordAfter(String[] words, int index,
			List<String> nextTokenList) {
		boolean wordAfter = false;
		if (index + 1 < words.length) {
			if (nextTokenList.contains(words[index + 1])) {
				wordAfter = true;
			}
		}
		return wordAfter;
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

			sentence = IOUtils.toString(refStream,"UTF-8");
		} catch (IOException e) {
			throw new RuntimeException("Cannot read sentence: " + resourceName);
		}
		return sentence.trim();
	}

	public static String readSentence1(String resourceName) {
		// requires sentence with no newlines except possibly at end
		String sentence = "";
		try {
			InputStream refStream = ClassLoader
					.getSystemResourceAsStream(resourceName);

			InputStreamReader br = new InputStreamReader(refStream, "UTF-8");
			System.out.println(br.getEncoding());

			sentence += br.read();

		} catch (IOException e) {
			throw new RuntimeException("Cannot read sentence: " + resourceName);
		}
		return sentence.trim();
	}

	public static String getPathasInputStream(String pathName)
			throws IOException {
		// requires sentence with no newlines except possibly at end

		// requires sentence with no newlines except possibly at end
		String sentence = null;
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(new File(pathName)), "UTF8"));
			sentence = br.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Cannot read sentence: " + pathName);
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
