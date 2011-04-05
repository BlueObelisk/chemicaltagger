package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.xmlcml.euclid.Util;

public class Formatter {
	
	private static final List<String> abvList = Arrays.asList("et. al. etc. e.g. i.e. vol. ca. wt. aq. mt. e.g.:".split(" "));
	private static final List<String> htmlList = Arrays.asList("gt; lt;".split(" "));
	private static final List<String> nextTokenList = Arrays.asList("gram vol %".split(" "));
	
	private static final Pattern whitespacePattern = Pattern.compile("\\s+");
	
	private static final Pattern abbreviationPattern = Pattern.compile("−?[A-Z]+[a-z]*\\.");
	private static final Pattern concatAmountPattern = Pattern.compile("(\\d\\d+(m|k|µ)?(l|L|g|gram|mol|cm3)(s)?$)|(\\d(L|ml|mL|gram|mol|cm3)(s)?$)");
	private static final Pattern concatTempPattern = Pattern.compile("\\d+(o|\u00b0|\u00ba)(C|c)");
	private static final Pattern concatHyphenDirectionPattern = Pattern.compile("^[A-Z]\\-\\d+");
	private static final Pattern concatSlashDirectionPattern = Pattern.compile("^[A-Z]\\/\\d*$");
	
	/************************************
	 * Normalises sentences.
	 * Adds spaces between characters where required.
	 * @param sentence (String)
	 * @return newSentence (String)
	 *************************************/
	public static String normaliseText(String sentence){
		StringBuilder newSentence = new StringBuilder();
		sentence = sentence.replace("%", " %").replace(";", " ;")
				.replace(":", " : ");

		sentence = sentence.replace("–", "-");
		String[] words = whitespacePattern.split(sentence);

		int index = 0;
		for (String string : words) {
			String prefix = " ";
			String suffix = " ";
			
			Matcher abbreviationMatcher = abbreviationPattern.matcher(string);
			if ((string.endsWith(".")) && (!abbreviationMatcher.find())
					&& (!abvList.contains(string.toLowerCase()))) {
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

			Matcher concatAmountMatcher = concatAmountPattern.matcher(string);
			if (concatAmountMatcher.find()) {
				string = splitAmounts(string);
			}

			Matcher concatTempMatcher = concatTempPattern.matcher(string);
			if (concatTempMatcher.find()) {
				string = splitTemperature(string);
			}
			Matcher concatHyphenDirectionMatcher = concatHyphenDirectionPattern.matcher(string);
			if (concatHyphenDirectionMatcher.find()) {
				string = string.replace("-"," - ");
			}
			Matcher concatSlashDirectionMatcher = concatSlashDirectionPattern.matcher(string);
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

		return newSentence.toString().replace("  ", " ").trim();
	}



	/************************************
	 * Adds spaces between amounts.
	 * @param amountString (String)
	 * @return newAmountString (String)
	 *************************************/
	private static String splitAmounts(String amountString) {
		String newAmountString = amountString;
		String numbers = "";
		String letters = "";

		for (char ch : amountString.toCharArray()) {
			if (Character.isLetter(ch)) {
				letters = letters + ch;
			}
			else {
				numbers = numbers + ch;
			}

		}
		newAmountString = numbers + " " + letters;
		return newAmountString;
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
	 * Checks if it is followed
	 * @param temperatureString (String)
	 * @return newTemperatureString (String)
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
