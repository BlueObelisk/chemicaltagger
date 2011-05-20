package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.xmlcml.euclid.Util;

/*********************************************
 * Preprocesses text before it gets passed to tokenisation and tagging classes.
 * @author lh359, dmj30, dl387.
 *
 */
public class Formatter {
	
	private static List<String> ABV_LIST = Arrays.asList("et.", "al.", "etc.", "e.g.", "i.e.", "vol.", "ca.", "wt.", "aq.", "mt.", "e.g.:");
	private static List<String> HTML_LIST = Arrays.asList("gt;", "lt;");
	private static List<String> NEXTTOKEN_LIST = Arrays.asList("gram", "vol", "%");
	private static Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
	private static Pattern ABBREVIATION_PATTERN = Pattern.compile("(\u2012|\u2013|\u2014|-)?[A-Z]+[a-z]*\\.");
	//Note \d[gl] are intentionally excluded to avoid ambiguity with compound references
	private static Pattern CONCAT_AMOUNT_PATTERN = Pattern.compile("(\\d(\\d+|\\.\\d+|\\d*[mk\u00b5])[gl][s]?|(\\d+[mnk\u00b5]?([LMN]|[eE][qQ][\\.]?|[cCdD][mM]3|[gG][rR][aA][mM][mM]?[eE]?|[mM][oO][lL][eE]?)[sS]?))$");
	private static Pattern CONCAT_PH_PATTERN = Pattern.compile("^pH-?\\d+");
	private static Pattern CONCAT_TEMP_PATTERN = Pattern.compile("\\d+(o|\u00b0|\u00ba)[cCfF][\\.]?");
	private static Pattern CONCAT_HYPHENED_DIRECTION_PATTERN = Pattern.compile("^[A-Z]\\-\\d+");
	private static Pattern CONCAT_SLASH_DIRECTION_PATTERN = Pattern.compile("^[A-Z]\\/\\d*$");
	private static Pattern CONCAT_TIME_COLON = Pattern.compile("^\\d+:\\d\\d");
	private static Pattern TEMPERATURE_UNITS = Pattern.compile("[cCfF][\\.]?");
	/**************************
	 * Hides Utility Class Constructor.
	 */
	private Formatter(){
		
	}
	/************************************
	 * Normalises sentences.
	 * Adds spaces between characters where required.
	 * @param sentence (String)
	 * @return newSentence (String)
	 *************************************/
	public static String normaliseText(String sentence){
		StringBuilder newSentence = new StringBuilder();
		sentence = sentence.replace("%", " %").replace(";", " ;");

		sentence = sentence.replace("\u2012", "-").replace("\u2013", "-").replace("\u2014", "-");
		String[] words = WHITESPACE_PATTERN.split(sentence);

		int index = 0;
		for (String string : words) {
			String prefix = " ";
			String suffix = " ";
			
			if (string.endsWith("\u00b0") || string.endsWith("\u00ba)")){//ends with degrees symbol
				if (index+1 < words.length && TEMPERATURE_UNITS.matcher(words[index+1]).matches()){//next word is something like "C"
					char lastChar = string.charAt(string.length()-1);
					string = string.substring(0, string.length()-1);
					words[index+1] = lastChar + words[index+1];
				}
			}
			
			Matcher abbreviationMatcher = ABBREVIATION_PATTERN.matcher(string);
			if ((string.endsWith(".")) && (!abbreviationMatcher.find())
					&& (!ABV_LIST.contains(string.toLowerCase()))) {
				if (!stopWordAfter(words, index, NEXTTOKEN_LIST)) {
					string = string.substring(0, string.length() - 1);
					suffix = " ." + suffix;
				}
			}

			if ((string.endsWith(";") && !HTML_LIST.contains(string
					.toLowerCase()))) {
				string = string.substring(0, string.length() - 1);
				suffix = " ;" + suffix;
			}

			if (string.endsWith(".") && (string.contains("\u00b0") || string.contains("\u00ba"))) {
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

			Matcher concatAmountMatcher = CONCAT_AMOUNT_PATTERN.matcher(string);
			if (concatAmountMatcher.find()) {
				string = splitAmounts(string);
			}
			
			Matcher concatPhMatcher = CONCAT_PH_PATTERN.matcher(string);
			if (concatPhMatcher.find()) {
				string = string.substring(0, 2) + " " + string.substring(2) ;
			}


			Matcher concatTempMatcher = CONCAT_TEMP_PATTERN.matcher(string);
			if (concatTempMatcher.find()) {
				string = splitTemperature(string);
			}
			Matcher concatHyphenDirectionMatcher = CONCAT_HYPHENED_DIRECTION_PATTERN.matcher(string);
			if (concatHyphenDirectionMatcher.find()) {
				string = string.replace("-"," - ");
			}

			Matcher concatTimeColonMatcher = CONCAT_TIME_COLON.matcher(string);
			if (!concatTimeColonMatcher.find()) {
				string = string.replace(":"," : ");
			}
			Matcher concatSlashDirectionMatcher = CONCAT_SLASH_DIRECTION_PATTERN.matcher(string);
			if (concatSlashDirectionMatcher.find()) {
				string = string.replace("/"," / ");
			}
			if (string.equals("K.") && index > 0) {
				if (StringUtils.isNumeric(words[index - 1])) {
					string = "K .";
				}
			}
			
			index++;

			newSentence.append(prefix + string + suffix);
		}
		
		return WHITESPACE_PATTERN.matcher(newSentence.toString()).replaceAll(" ").trim();
	}



	/************************************
	 * Adds spaces between amounts.
	 * @param amountString (String)
	 * @return newAmountString (String)
	 *************************************/
	private static String splitAmounts(String amountString) {
		int splitIndex = amountString.length();
		for (int i = 0; i < amountString.length(); i++) {
			if (Character.isLetter(amountString.charAt(i))) {
				splitIndex = i;
				break;
			}
		}
		return amountString.substring(0, splitIndex) + " " + amountString.substring(splitIndex);
	}

	/**********************************************
	 * Adds spaces between temperatures.
	 * @param temperatureString (String)
	 * @return newTemperatureString (String)
	 **********************************************/
	private static String splitTemperature(String temperatureString) {
		String newTemperatureString = temperatureString;
		String numbers = "";

		for (char ch : temperatureString.toCharArray()) {

			if (Character.isDigit(ch)) {
				numbers = numbers + ch;
			}

		}
		newTemperatureString = temperatureString.replace(numbers, numbers + " ");
		return newTemperatureString;
	}
	


	/**********************************************
	 * Checks if it is followed by a stopword.
	 * @param words (String[])
	 * @param index (int)
	 * @param nextTokenList (List<String>)
	 * @return isStopWordAfter (boolean)
	 **********************************************/
	private static boolean stopWordAfter(String[] words, int index,
			List<String> nextTokenList) {
		boolean isStopWordAfter = false;
		if (index + 1 < words.length) {
			if (nextTokenList.contains(words[index + 1])) {
				isStopWordAfter = true;
			}
		}
		return isStopWordAfter;
	}
	

}
