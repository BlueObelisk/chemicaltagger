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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import uk.ac.cam.ch.wwmm.opsin.StringTools;
import uk.ac.cam.ch.wwmm.oscar.document.Token;

/*********************************************
 * Preprocesses text before it gets passed to tokenisation and tagging classes.
 * @author lh359, dmj30, dl387.
 *
 */
public class Formatter {

	private static Pattern MATCH_SULPH = Pattern.compile("sulph", Pattern.CASE_INSENSITIVE);
	private static Pattern MATCH_DEGREES_WHITESPACE = Pattern.compile("([\u00b0\u00ba])(\\s+)([cCfF]([.,;:()\\[\\]{}\\s]|$))");
	private static Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
	private final static Pattern matchSpaceChargeOrOxidationSpecifier = Pattern.compile(" \\((\\d[+\\-]|[+\\-]\\d|0|I{1,3}|IV|VI{1,3}|IX)\\)", Pattern.CASE_INSENSITIVE);
	private final static List<String> elements = Arrays.asList("hydrogen", "lithium", "sodium", "natrium", "potassium", "kalium", "rubidium", "caesium", "cesium", "francium", "beryllium", "magnesium", "calcium", "strontium", "barium", "radium", "aluminium", "aluminum", "gallium", "indium", "thallium", "tin", "stannum", "lead", "plumbum", "bismuth", "polonium", "scandium", "titanium", "vanadium", "chromium", "manganese", "iron", "cobalt", "nickel", "copper", "zinc", "yttrium", "zirconium", "niobium", "molybdenum", "technetium", "ruthenium", "rhodium", "palladium", "silver", "cadmium", "lanthanum", "cerium", "praseodymium", "neodymium", "promethium", "samarium", "europium", "gadolinium", "terbium", "dysprosium", "holmium", "erbium", "thulium", "ytterbium", "lutetium", "hafnium", "tantalum", "tungsten", "wolfram", "rhenium", "osmium", "iridium", "platinum", "gold", "mercury", "hydrargyrum", "actinium", "thorium", "protactinium", "uranium", "neptunium", "plutonium", "americium", "curium", "berkelium", "californium", "einsteinium", "fermium", "mendelevium", "nobelium", "lawrencium", "rutherfordium", "boron", "carbon", "silicon", "germanium", "nitrogen", "phosphorus", "arsenic", "antimony", "stibium", "oxygen", "sulfur", "selenium", "tellurium", "polonium", "fluorine", "chlorine", "bromine", "iodine", "astatine", "helium", "neon", "argon", "krypton", "xenon", "radon");
	
	private static Pattern CONCAT_AMOUNT_PATTERN = Pattern.compile("[~]?\\d*\\.?(\\d(\\d+|\\.\\d+|\\d*[mk\u00b5u])(g|l|hPa)[s]?|(\\d+[mnk\u00b5u]?([LMN]|[eE][qQ][\\.]?|[cCdD][mM]3|[gG][rR][aA][mM][mM]?[eE]?|[mM][oO][lL][eE]?|[mM][oO][lL][aA][rR])[sS]?))$");
	private static Pattern CONCAT_PH_PATTERN = Pattern.compile("^pH-?\\d+");
	private static Pattern CONCAT_TEMP_PATTERN = Pattern.compile("\\d+(o|\u00b0|\u00ba)[cCfF][\\.]?");
	private static Pattern CONCAT_PERCENTAGE_PATTERN = Pattern.compile("([^%]*)(%)([^%]*)");

	/**************************
	 * Hides Utility Class Constructor.
	 */
	private Formatter(){
		
	}

	/************************************
	 * Normalises sentences e.g. replaces characters with equivalent characters
	 * also does some minor rearrangements
	 * @param sentence (String)
	 * @return newSentence (String)
	 *************************************/
	public static String normaliseText(String sentence){
		sentence = sentence.replace("\u2010", "-").replace("\u2011", "-").replace("\u2012", "-").replace("\u2013", "-").replace("\u2014", "-").replace("\u2015", "-").replace("\u002d", "-").replace("\u2212", "-");//normalise hyphens
  	    sentence = sentence.replace("\u03BC", "\u00B5");//normalise mu to micro
  	    sentence = MATCH_SULPH.matcher(sentence).replaceAll("sulf");//correct British spelling to the IUPAC spelling to assist OSCAR
  	    sentence = MATCH_DEGREES_WHITESPACE.matcher(sentence).replaceAll("$2$1$3");//correct [degree symbol, space, temperature unit] to [space, degree symbol, temperature unit]
  	    sentence = WHITESPACE_PATTERN.matcher(sentence).replaceAll(" ");
  	    sentence = removeSpaceBetweenElementsAndChargeOrOxidationStateSpecifier(sentence);
		return sentence;
	}
	
	/**
	 * e.g. palladium (II) --> palladium(II)
	 * @param sentence
	 * @return
	 */
	private static String removeSpaceBetweenElementsAndChargeOrOxidationStateSpecifier(String sentence) {
		StringBuffer sb = new StringBuffer();
		Matcher m = matchSpaceChargeOrOxidationSpecifier.matcher(sentence);
		while (m.find()){
			String beforeSpecifier = sentence.substring(0, m.start());
			for (String chemicalElement : elements) {
				if (StringTools.endsWithCaseInsensitive(beforeSpecifier, chemicalElement)){
					m.appendReplacement(sb, m.group().substring(1));
					break;
				}
			}
		}
		m.appendTail(sb);
		return sb.toString();
	}

	/************************************
	 * Returns the list of tokens with tokens divided into further tokens in cases where this improves tagging
	 * e.g. ['4.5kg'] --> ['4.5', 'kg']
	 * 
	 * @param tokens (List<Token>)
	 * @return tokens (List<Token>)
	 *************************************/
	public static List<Token> subTokeniseTokens(List<Token> tokens){
		int i = 0;
		while (i < tokens.size()) {
			Token token = tokens.get(i);
			String[] subTokens = subTokenize(token.getSurface());
			if (subTokens!=null){
				int start = token.getStart();
				List<Token> newTokens = new ArrayList<Token>();
				for (String newTokenSurface : subTokens) {
					int end = start + newTokenSurface.length();
					newTokens.add(new Token(newTokenSurface, start, end, token.getDoc(), token.getBioType(), token.getNeElem()));
					start = end;
				}
				tokens.remove(i);
				tokens.addAll(i, newTokens);
			}
			else{
				i++;
			}
		}
		int id =0;
		for (Token token : tokens) {
			token.setIndex(id++);
		}
		return tokens;
	}

	private static String[] subTokenize(String tokenSurface) {
		if (tokenSurface.length() >1 ){
			Matcher concatAmountMatcher = CONCAT_AMOUNT_PATTERN.matcher(tokenSurface);//split values from units e.g. 4.5g --> 4.5 g
			if (concatAmountMatcher.matches()) {
				return splitAmounts(tokenSurface);
			}
			Matcher concatPhMatcher = CONCAT_PH_PATTERN.matcher(tokenSurface);//e.g. pH7 --> pH 7
			if (concatPhMatcher.find()) {
				return new String[]{tokenSurface.substring(0, 2), tokenSurface.substring(2)};
			}
			Matcher concatTempMatcher = CONCAT_TEMP_PATTERN.matcher(tokenSurface);//e.g. 50oC --> 50 oC
			if (concatTempMatcher.find()) {
				int startOfDegreesSign = concatTempMatcher.start(1);
				return new String[]{tokenSurface.substring(0, startOfDegreesSign), tokenSurface.substring(startOfDegreesSign)};
			}
			if (tokenSurface.contains("%")){
				return splitPercentageSign(tokenSurface);
			}
			if (tokenSurface.startsWith("(") && tokenSurface.endsWith(")")) {// splits brackets off a word enclosed by brackets. Needed to fix OSCAR not tokenising oxidation states
				return new String[]{tokenSurface.substring(0,1), tokenSurface.substring(1, tokenSurface.length()-1), tokenSurface.substring(tokenSurface.length()-1)};
			}
		}
		return null;
	}

	/************************************
	 * Returns the string split into value and unit
	 * @param amountString (String)
	 * @return valueUnitArray (String[])
	 *************************************/
	private static String[] splitAmounts(String amountString) {
		int splitIndex = amountString.length();
		for (int i = 0; i < amountString.length(); i++) {
			if (Character.isLetter(amountString.charAt(i))) {
				splitIndex = i;
				break;
			}
		}
		return new String[]{amountString.substring(0, splitIndex), amountString.substring(splitIndex)};
	}

	/************************************
	 * Returns the string with percentage sign and percentage sign followed by hyphen split up
	 * @param amountString (String)
	 * @return valueUnitArray (String[])
	 *************************************/
	private static String[] splitPercentageSign(String tokenSuface) {
		List<String> subTokens  = new ArrayList<String>();
		Matcher concatPercentageMatcher = CONCAT_PERCENTAGE_PATTERN.matcher(tokenSuface);
		while (concatPercentageMatcher.find()){
			if (concatPercentageMatcher.group(1).length() > 0){
				subTokens.add(concatPercentageMatcher.group(1));
			}
			subTokens.add(concatPercentageMatcher.group(2));
			String afterPercentageSign = concatPercentageMatcher.group(3);
			if (afterPercentageSign.length() > 0){
				if (afterPercentageSign.startsWith("-") && afterPercentageSign.length() >1){
					subTokens.add("-");
					subTokens.add(afterPercentageSign.substring(1));
				}
				else {
					subTokens.add(afterPercentageSign);
				}
			}
		}
		return subTokens.toArray(new String[subTokens.size()]);
	}
}
