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
	private static Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
	private static Pattern ABBREVIATION_PATTERN = Pattern.compile("-?[A-Z]+[a-z]*\\.");
	//Note \d[gl] are intentionally excluded to avoid ambiguity with compound references
	private static Pattern CONCAT_AMOUNT_PATTERN = Pattern.compile("(\\d(\\d+|\\.\\d+|\\d*[mk\u00b5])[gl][s]?|(\\d+[mnk\u00b5]?([LMN]|[eE][qQ][\\.]?|[cCdD][mM]3|[gG][rR][aA][mM][mM]?[eE]?|[mM][oO][lL][eE]?)[sS]?))$");
	private static Pattern CONCAT_PH_PATTERN = Pattern.compile("^pH-?\\d+");
	private static Pattern CONCAT_TEMP_PATTERN = Pattern.compile("\\d+(o|\u00b0|\u00ba)[cCfF][\\.]?");
	private static Pattern CONCAT_HYPHENED_DIRECTION_PATTERN = Pattern.compile("^[A-Z]\\-\\d+");
	private static Pattern CONCAT_SLASH_DIRECTION_PATTERN = Pattern.compile("^[A-Z]\\/\\d*$");
	private static Pattern TIME_EXPRESSION = Pattern.compile("^([01]?[1-9]|2[123]):[0-5]\\d([ap]m)?$", Pattern.CASE_INSENSITIVE);
	private static Pattern TEMPERATURE_UNITS = Pattern.compile("[cCfF]([.,;:()\\[\\]{}]|$)");
	private static Pattern MATCH_SULPH = Pattern.compile("sulph", Pattern.CASE_INSENSITIVE);

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
  	    sentence = sentence.replace("\u2010", "-").replace("\u2011", "-").replace("\u2012", "-").replace("\u2013", "-").replace("\u2014", "-").replace("\u2015", "-");//normalise hyphens
		String[] words = WHITESPACE_PATTERN.split(sentence);

		int index = 0;
		for (String string : words) {
			String prefix = " ";
			String suffix = " ";
	
			if (string.endsWith("\u00b0") || string.endsWith("\u00ba)")){//ends with degrees symbol
				if (index+1 < words.length && TEMPERATURE_UNITS.matcher(words[index+1]).lookingAt()){//next word is something like "C"
					char lastChar = string.charAt(string.length()-1);
					string = string.substring(0, string.length()-1);
					words[index+1] = lastChar + words[index+1];
				}
			}
			
			Matcher abbreviationMatcher = ABBREVIATION_PATTERN.matcher(string);
			if ((string.endsWith(".")) && !abbreviationMatcher.find()
					&& !ABV_LIST.contains(string.toLowerCase())) {
					string = string.substring(0, string.length() - 1);
					suffix = " ." + suffix;

			}
			
			if (string.endsWith(".") && (string.contains("\u00b0") || string.contains("\u00ba"))) {//splits period after degrees e.g. 50oC. This period may be reattached in RecombineTokens
				string = string.substring(0, string.length() - 1);
				suffix = " ." + suffix;
			}
			if (string.equals("K.") && index > 0) {///splits period after temperature in Kelvin 
				if (StringUtils.isNumeric(words[index - 1].replace(".", ""))) {
					string = "K .";
				}
			}



			if (string.endsWith(",")) {//splits commas off
				string = string.substring(0, string.length() - 1);
				suffix = " ," + suffix;
			}

			if (string.startsWith("(")) {//split bracket off word with unbalanced starting or terminal bracket
				int i = Util.indexOfBalancedBracket('(', string);

				if (i < 0) {
					string = string.substring(1, string.length());
					prefix = prefix + "( ";
				}
			} else if (string.trim().endsWith(")")) {
				String subString = string.substring(0, string.length()-1);

				if (subString.indexOf('(') < 0) {
					string = subString;
					suffix = " )" + suffix;
				}
			}

			if (string.startsWith("(") && string.endsWith(")")) {// splits brackets off a word enclosed by brackets
				String subString = string.substring(1, string.length() - 1);

				string = subString;
				prefix = prefix + "( ";
				suffix = " )" + suffix;
			}

			Matcher concatAmountMatcher = CONCAT_AMOUNT_PATTERN.matcher(string);//split values from units e.g. 4.5g --> 4.5 g
			if (concatAmountMatcher.find()) {
				string = splitAmounts(string);
			}
			
			Matcher concatPhMatcher = CONCAT_PH_PATTERN.matcher(string);//e.g. pH7 --> pH 7
			if (concatPhMatcher.find()) {
				string = string.substring(0, 2) + " " + string.substring(2) ;
			}

			Matcher concatTempMatcher = CONCAT_TEMP_PATTERN.matcher(string);//e.g. 50oC --> 50 oC
			if (concatTempMatcher.find()) {
				string = splitTemperature(string);
			}
			Matcher concatHyphenDirectionMatcher = CONCAT_HYPHENED_DIRECTION_PATTERN.matcher(string);//splits mistokenised direction coordinates  like  60° N- 60°
			if (concatHyphenDirectionMatcher.find()) {
				string = string.replace("-"," - ");
			}

			Matcher concatTimeColonMatcher = TIME_EXPRESSION.matcher(string);//split on colons except in times
			if (!concatTimeColonMatcher.find()) {
				string = string.replace(":"," : ");
			}
			Matcher concatSlashDirectionMatcher = CONCAT_SLASH_DIRECTION_PATTERN.matcher(string);//splits mistokenised direction ranges like 78°55'19" N/  11°56'33" E
			if (concatSlashDirectionMatcher.find()) {
				string = string.replace("/"," / ");
			}
			string = MATCH_SULPH.matcher(string).replaceAll("sulf");//correct British spelling to the IUPAC spelling to assist OSCAR
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
	


	

}
