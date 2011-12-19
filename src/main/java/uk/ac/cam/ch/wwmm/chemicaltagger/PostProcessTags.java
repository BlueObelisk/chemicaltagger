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
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import uk.ac.cam.ch.wwmm.oscar.document.Token;

/**************************************************
 * Corrects Mistagged tokens.
 * 
 * @author lh359, dl387
 **************************************************/
public class PostProcessTags {

	private static HashSet<String> tagSet = Utils.loadsTagsFromFile(PostProcessTags.class);
	
	private final POSContainer posContainer;
	private final List<Token> tokenList;
	private final List<String> combinedTags;
	
	/**
	 * Corrects Mistagged tokens within the given POSContainer
	 * @param posContainer
	 */
	public PostProcessTags(POSContainer posContainer) {
		this.posContainer = posContainer;
		tokenList = posContainer.getWordTokenList();
		combinedTags = posContainer.getCombinedTagsList();
	}
	
	/********************************************
	 * Corrects known tagging problems in the tags in combinedtagsList.
	 *******************************************/
    public void correctCombinedTagsList() {
    	correctCombinedTagsList( new ArrayList<String>());
    }
    
	/***********************************************
	 * Corrects known tagging problems in the tags in combinedtagsList.
	 * Tags in the ignoredTags list will never be created
	 * (used when called form other applications)
	 * @param ignoredTags (List)
	 **********************************************/
	public void correctCombinedTagsList(List<String> ignoredTags) {
		List<String> newTokenList = new ArrayList<String>();
		List<String> newCombinedTagsList = new ArrayList<String>();
		for (int i = 0; i < combinedTags.size(); i++) {
			String currentTag = combinedTags.get(i);
			Token currentToken = tokenList.get(i);
			String newTag = combinedTags.get(i);
			String currentTokenStr = currentToken.getSurface();
			newTag = correctMisTaggedNouns(i, currentTag, currentTokenStr);
			if (newTag.equals(currentTag)){
				newTag = correctMisTaggedVerbs(i, currentTag, currentTokenStr);
			}
			if (newTag.equals(currentTag)){
				newTag = correctMisTaggedDigits(i, currentTag, currentTokenStr);
			}
			if (newTag.equals(currentTag)){
				newTag = correctMisTaggedUnits(i, currentTag, currentTokenStr);
			}
			if (newTag.equals(currentTag)){
				newTag = correctMisTaggedMisc(i, currentTag, currentTokenStr);
			}
			if (tagSet.contains(currentTokenStr)) {
				currentToken.setSurface(currentTokenStr.toLowerCase());
			}
			
			if (!ignoredTags.contains(newTag)) {
				newCombinedTagsList.add(newTag);
			}
			else {
				newCombinedTagsList.add(currentTag);
			}
			newTokenList.add(currentTokenStr);
		}
		posContainer.setCombinedTagsList(newCombinedTagsList);
	}
	
	/******************************************
	 * Corrects the mistagged nouns.
	 * @param i
	 * @param currentTag
	 * @param currentTokenStr
	 * @return
	 */
	private String correctMisTaggedNouns(int i, String currentTag, String currentTokenStr) {
		String currentTagLC = currentTag.toLowerCase();
		if (currentTagLC.startsWith("nn-mixture")) {
			
			List<String> afterList = Arrays.asList("in-of");
	
			if (!stringAfter(afterList, i, combinedTags)) {
				return "NN-CHEMENTITY";
			}
		}
		if (currentTokenStr.equalsIgnoreCase("acid") || currentTokenStr.equalsIgnoreCase("base")){
			if (currentTag.startsWith("NN")){
				return "NN-CHEMENTITY";
			}
		}
		
		if (currentTokenStr.equalsIgnoreCase("formula")){
			List<String> afterList = Arrays.asList("cd", "cd-alphanum", "nn-identifier");
			if (stringAfter(afterList, i, combinedTags)){
				return "NN-CHEMENTITY";
			}
		}
		
		List<String> colours = Arrays.asList("amber", "bronze", "cream", "fawn", "gold", "ivory", "lavender", "tan");
		if (colours.contains(currentTokenStr.toLowerCase())){
			if (stringAfter(Arrays.asList("nn-state"), i, combinedTags)){
				return "JJ";
			}
		}

		return currentTag;
	}

	/*************************************
	 * Corrects the mistagged verbs.
	 * 
	 * @param i (Integer)
	 * @param currentTag (String)
	 * @param currentTokenStr (String)
	 * @return
	 *************************************/
	private String correctMisTaggedVerbs(int i, String currentTag, String currentTokenStr) {
		String currentTagLC = currentTag.toLowerCase();
		
		if (currentTokenStr.equalsIgnoreCase("yield") ) {
			//Disambiguates between yield as a verb and the yield of a product compound
			List<String> beforeList = Arrays.asList("nn-percent");//e.g. 30% yield
			List<String> afterList = Arrays.asList("in-of", "colon");//e.g. yield of 30% /yield :30%
			if (stringBefore(beforeList, i, combinedTags) || ( stringAfter(afterList, i, combinedTags))) {
				return "NN-YIELD";
			}

			afterList = Arrays.asList("nn-chementity");
			beforeList = Arrays.asList("dt", "dt-the");
			if (stringAfter(afterList, i, combinedTags) && stringBefore(beforeList, i, combinedTags)){
				return "JJ-COMPOUND";
			}
		}
		
		if (currentTagLC.startsWith("vb") && currentTokenStr.equalsIgnoreCase("form")) {//"form" is only a VB-YIELD if it is a verb
			return "VB-YIELD";
		}
		
		if (currentTagLC.startsWith("vb-filter")) {
			
			List<String> beforeList = Arrays.asList("oscar-cj", "jj-chem");
			if (stringBefore(beforeList, i, combinedTags)) {
				return "NN";
			}
		}
		
		if (endsWithCaseInsensitive(currentTokenStr, "dilute")//correct cases where dilute and the like are actually adjectives e.g. dilute sulfuric acid
				|| endsWithCaseInsensitive(currentTokenStr, "diluted")
				|| endsWithCaseInsensitive(currentTokenStr, "concentrated")
				|| endsWithCaseInsensitive(currentTokenStr, "dry")
				|| endsWithCaseInsensitive(currentTokenStr, "dried")){
			List<String> afterList = Arrays.asList("oscar-cm", "nn-chementity", "oscar-cj", "jj-chem");
	
			if (stringAfter(afterList, i, combinedTags)) {
				return "JJ-CHEM";
			}
		}
		
		if (currentTagLC.startsWith("vb-") || //TODO what does this actually do other than correcting reaction mixture?
				(currentTagLC.startsWith("nn") && !currentTagLC.startsWith("nn-state")
					&& !currentTagLC.startsWith("nn-apparatus")
					&& !currentTagLC.startsWith("nn-cycle")
					&& !currentTagLC.startsWith("nn-temp")
					&& !currentTagLC.startsWith("nn-pressure")
					&& !currentTagLC.startsWith("nn-time")
					&& !currentTagLC.startsWith("nn-molar")
					&& !currentTagLC.startsWith("nn-vacuum")
				    && !currentTagLC.startsWith("nnp")))  {
			List<String> beforeList = Arrays.asList("dt", "jj", "jj-chem", "dt-the");
			List<String> afterListJJ = Arrays.asList("jj", "nn-chementity", "nn-mixture", "nn-apparatus", "nn", "jj-chem");
	
			List<String> afterListNN = Arrays.asList("stop", "comma");
	
			if (stringBefore(beforeList, i, combinedTags)
					&& (i == combinedTags.size() || stringAfter(
							afterListNN, i, combinedTags))
					&& !currentTagLC.startsWith("nn-")) {
				return "NN";
			}
			else if (stringBefore(beforeList, i, combinedTags)
					&& (stringAfter(afterListJJ, i, combinedTags) && 
							!currentTagLC.startsWith("nn-chementity")) && adjObjectExists(i)) {
				return "JJ-CHEM";
			}
		}
	
	
		if (currentTagLC.startsWith("vb-")
				|| currentTagLC.startsWith("nn-synthesize")) {
			List<String> beforeList = Arrays.asList("dt-the", "dt");
			List<String> afterList = Arrays.asList("vb");
	
			if (stringBefore(beforeList, i, combinedTags)
					&& (stringAfterStartsWith(afterList, i, combinedTags))) {
				return "NN-CHEMENTITY";
			}
		}
	
		if (currentTagLC.startsWith("vb")
				&& Utils.containsNumber(currentTokenStr)) {//verbs are highly unlikely to contain numbers
			return "NN";
		}
		
		if (currentTagLC.startsWith("vbn")
				|| currentTagLC.startsWith("vbg")
				|| currentTagLC.startsWith("vb-")){
	
			List<String> afterList = Arrays.asList("oscar-cm", "nns", "nn-chementity", "oscar-cj", "jj-chem", "nnp");
			List<String> beforeList = Arrays.asList("dt", "rb", "rb-conj", "dt-the", "stop", "in-with", "in-of", "in-under");
			if (stringAfter(afterList, i, combinedTags)
					&& stringBefore(beforeList, i, combinedTags)) {
				return "JJ-CHEM";
			}
		}
	
		if (currentTagLC.startsWith("vb")) {
	
			List<String> beforeList = Arrays.asList("to");
			List<String> beforebeforeList = Arrays.asList("vb-heat");
			List<String> afterList = Arrays.asList("stop");
			if (stringBefore(beforeList, i, combinedTags)
					&& stringBefore(beforebeforeList, i - 1, combinedTags)
					&& stringAfter(afterList, i, combinedTags)) {
				return "NN";
			}
	
		}
	
		/********
		 * Gerunds
		 */
		if (currentTagLC.startsWith("vb")
				&& (currentTokenStr.toLowerCase().endsWith("ing") || currentTokenStr
						.toLowerCase().endsWith("ed"))) {
	
			List<String> afterList = Arrays.asList("nn", "oscar-cm", "nns", "nn-chementity", "oscar-cj", "jj-chem", "jj", "nnp", "nn-state", "nn-apparatus");
			List<String> beforeList = Arrays.asList("dt", "dt-the", "cd", "oscar-cm");
	
			List<String> notList = Arrays.asList("in-of");
			if(stringAfter(Arrays.asList("oscar-cm"), i, combinedTags) 
					&& stringBefore(Arrays.asList("oscar-cm", "nn-chementity"), i, combinedTags)){
				//special case to avoid a few known mistags. This function should probably be reduced in scope
			}
			else if (stringAfter(afterList, i, combinedTags) && stringBefore(beforeList, i, combinedTags)) {
				return "JJ";
			}
			else if (currentTokenStr.toLowerCase().endsWith("ing") && stringBefore(beforeList, i, combinedTags) && !stringAfter(notList, i, combinedTags)) {
				return "JJ-CHEM";
			}
	
		}
	
		if (currentTagLC.startsWith("vb") && !currentTokenStr.toLowerCase().endsWith("ing")) {
	
			List<String> beforeList = Arrays.asList("dt", "dt-the", "in-in", "in-of", "rb");
			List<String> afterList = Arrays.asList("nn", "oscar-cm", "nns", "nn-chementity", "oscar-cj", "jj-chem", "jj", "nnp", "nn-state", "nn-apparatus");
			List<String> chemafterList = Arrays.asList("oscar-cm", "nn-chementity", "oscar-cj", "jj-chem");
	
			if (i != 0) {
				if (!tokenList.get(i - 1).getSurface().equals("that")) {
					if (stringAfter(chemafterList, i, combinedTags)
							&& stringBefore(beforeList, i, combinedTags)) {
						return "JJ-CHEM";
					}
	
					else if (stringBefore(beforeList, i, combinedTags)
							&& stringAfter(afterList, i, combinedTags)) {
						return "JJ";
					} else if (stringBefore(beforeList, i, combinedTags)
							&& (i +1) < combinedTags.size() && combinedTags.get(i + 1).toLowerCase()
									.startsWith("nn")) {
						return "JJ";
					}
	
				}
			}
		}
	
		return currentTag;
	}

	/******************************************
	 * Correct one character letters that are intended to be units
	 * @param i
	 * @param currentTag
	 * @param currentTokenStr
	 * @return
	 */
	private String correctMisTaggedUnits(int i, String currentTag, String currentTokenStr) {
		List<String> afterList = Arrays.asList("sym");

		if ((currentTokenStr.length() == 1) && Character.isLowerCase(currentTokenStr.charAt(0)) && stringAfter(afterList, i, combinedTags)){
			return "NN";
		}
		return currentTag;
	}

	/*************************************
	 * Corrects tagging of words intended to be CDs or CD-ALPHANUMs
	 * 
	 * @param i (Integer)
	 * @param currentTag (String)
	 * @param currentTokenStr (String)
	 * @return
	 *************************************/
	private String correctMisTaggedDigits(int i, String currentTag, String currentTokenStr) {
		String currentTagLC = currentTag.toLowerCase();
		if ((currentTagLC.startsWith("nn-") && Utils
						.containsNumber(currentTokenStr))) {
			List<String> beforeList = Arrays.asList("in-of", "jj", "nn-chementity", "comma");
			List<String> afterList = Arrays.asList("-lrb-", "stop", "comma");
			if (stringBefore(beforeList, i, combinedTags)
					&& (stringAfter(afterList, i, combinedTags) || i == combinedTags
							.size())) {
				return "CD-ALPHANUM";
			}
		}
	
		if (currentTagLC.equals("cd-alphanum")) {
	
			List<String> afterList = Arrays.asList("nn-vol", "nn-mass");
	
			if (stringAfter(afterList, i, combinedTags)
					|| currentTokenStr.contains(".") || currentTokenStr.length() > 4) {
				return "CD";
			}
		}
		return currentTag;
	}

	/*************************************
	 * Corrects the mistagged verbs.
	 * 
	 * @param i (Integer)
	 * @param currentTag (String)
	 * @param currentTokenStr (String)
	 * @return
	 *************************************/
	private String correctMisTaggedMisc(int i, String currentTag, String currentTokenStr) {
		String currentTagLC = currentTag.toLowerCase();
		if (currentTagLC.equals("nnp")
				&& StringUtils.equalsIgnoreCase(currentTokenStr, "M")) {
			return "NN-MOLAR";
		}
		if (i != 0 && currentTagLC.equals("nns")) {

			List<String> beforeList = Arrays.asList("stop");
			if (currentTokenStr.endsWith("s")
					&& Character.isUpperCase(currentTokenStr.charAt(0))) {
				if (!stringBefore(beforeList, i, combinedTags)){
					return "NNPS";
				}
			}
		}

		if (currentTagLC.equals("rb")	&& currentTokenStr.length() < 2) {

			if (Character.isUpperCase(currentTokenStr.charAt(0)) ){
				return "NNP";
			}
			else {
				return "NN";
			}

		}

		if (currentTokenStr.equals("M")) {

			List<String> beforeList = Arrays.asList("cd");

			if (stringBefore(beforeList, i, combinedTags)) {
				return "NN-MOLAR";
			}
		}

		if (currentTokenStr.equals("K")) {

			List<String> beforeList = Arrays.asList("cd");

			if (stringBefore(beforeList, i, combinedTags)) {
				return "NN-TEMP";
			}
		}
		if (currentTagLC.equals("''")) {
			return "FW";
		}

		if (currentTagLC.equals("nn-mixture")) {

			List<String> afterList = Arrays.asList("vbd");

			if (stringAfter(afterList, i, combinedTags)) {
				return "NN-CHEMENTITY";
			}
		}

		if (currentTagLC.startsWith("nn-concentrate")) {
			List<String> beforeList = Arrays.asList("jj", "oscar-cj", "jj-chem");
			List<String> afterList = Arrays.asList("in-of");

			if (!stringBefore(beforeList, i, combinedTags)
					&& (stringAfter(afterList, i, combinedTags))) {
				return "NN";
			}
		}

		if (i != 0 && currentTagLC.startsWith("nn-add")) {
			List<String> beforeList = Arrays.asList("stop", "comma", "colon");
			if (!stringBefore(beforeList, i, combinedTags)&& Character.isUpperCase(currentTokenStr.charAt(0))) {
				return "NNP";
			}

		}

		if (currentTagLC.startsWith("jj")
				|| currentTagLC.startsWith("nnp")) {
			List<String> afterList = Arrays.asList("nn-campaign");
			if ((stringAfter(afterList, i, combinedTags) || string2After(
					afterList, i, combinedTags))
					&& Character.isUpperCase(currentTokenStr.charAt(0))) {
				return "NNP";
			}
		}
		if (currentTokenStr.toLowerCase().equals("addition")) {
			List<String> beforeList = Arrays.asList("in-in");
			List<String> afterList = Arrays.asList("comma", "stop");

			if (stringBefore(beforeList, i, combinedTags)
					&& (stringAfter(afterList, i, combinedTags))) {
				return "NN";
			}
		}

		if (currentTokenStr.toLowerCase().startsWith("obtain")) {

			List<String> afterList = Arrays.asList("in-from");

			List<String> after2List = Arrays.asList("nnp");
			if (stringAfter(afterList, i, combinedTags)
					&& (string2After(after2List, i, combinedTags))) {
				return "VB";
			}
		}
		if (currentTagLC.startsWith("nn-synthesize")) {

			List<String> afterList = Arrays.asList("nn-apparatus");
			List<String> beforeList = Arrays.asList("dt", "nn-apparatus", "rb-conj", "dt-the");
			if (stringAfter(afterList, i, combinedTags)
					&& stringBefore(beforeList, i, combinedTags)) {
				return "JJ-CHEM";
			}
		}

		if (currentTokenStr.equals("D")
				&& currentTagLC.equals("nn-time")) {

			List<String> beforeList = Arrays.asList("in-in");
			if (stringBefore(beforeList, i, combinedTags)) {
				return "NN";
			}
		}
		
		//Identifies a capital letter or single character roman number that is likely to be an identifier
		if (currentTokenStr.length()==1 && Character.isLetter(currentTokenStr.charAt(0))){
			char charac = currentTokenStr.charAt(0);
			List<String> beforeBracket = Arrays.asList("-lrb-");
			List<String> afterBracket = Arrays.asList("-rrb-");
			if ((stringBefore(beforeBracket, i, combinedTags) || i==0) && stringAfter(afterBracket, i, combinedTags)
					|| (i==0 && tokenAfter(Arrays.asList(".", ":"), i))){
				//could be an abbreviation
				if ((charac =='d' || charac =='D' || charac =='h' || charac =='s') && string2Before(Arrays.asList("nn-time"), i, combinedTags)){
					return "NN-TIME";
				}
				else if (charac =='g' && string2Before(Arrays.asList("nn-mass"), i, combinedTags)){
					return "NN-MASS";
				}
				else if (charac =='K' && string2Before(Arrays.asList("nn-temp"), i, combinedTags)){
					return "NN-TEMP";
				}
				else if ((charac =='l' || charac =='L') && string2Before(Arrays.asList("nn-vol"), i, combinedTags)){
					return "NN-VOL";
				}
				else if ((charac =='g' || charac =='l' || charac =='s') && string2Before(Arrays.asList("oscar-cm"), i, combinedTags)){
					return "NN-STATE";//state symbol i.e. gas/liquid/solid
				}
				else{
					return "NN-IDENTIFIER";
				}
			}
			List<String> beforeList = Arrays.asList("nn-example", "nn-method", "nn-chementity", "in-of" );
			if (stringBefore(beforeList, i, combinedTags) && !isEnglishUseOfAorI(charac, i) ){
				return "NN-IDENTIFIER";
			}
		}
		
		if (currentTokenStr.equalsIgnoreCase("precipitate")){
			if (currentTagLC.startsWith("nn")){
				return "NN-CHEMENTITY";
			}
			else if (currentTagLC.startsWith("vb")){
				return "VB-PRECIPITATE";
			}
			//Precipitate can also, rarely, be an adjective
		}
		
		if (i != 0 && currentTagLC.equals("nn")) {
			List<String> beforeList = Arrays.asList("stop");
			if ((Character.isUpperCase(currentTokenStr.charAt(0)) && !stringBefore(beforeList, i, combinedTags)) ||  (!currentTokenStr.toLowerCase().equals(currentTokenStr))){
				return "NNP";
			}
		}
		
		return currentTag;

	}

	/**
	 * Does this appear to be a valid use of a/A/I
	 * @param charac
	 * @param i
	 * @return
	 */
	private boolean isEnglishUseOfAorI(char charac, int i) {
		List<String> stopOrColon = Arrays.asList("stop", "colon");
		if (charac =='A' || charac =='I'){
			if (i==0 || stringBefore(stopOrColon, i, combinedTags)){
				return true;
			}
		}
		else if (charac =='a'){
			if (i!=0 && !stringBefore(stopOrColon, i, combinedTags) && !stringAfter(stopOrColon, i, combinedTags)){
				return true;
			}
		}
		return false;
	}

	/******************************************
	 * Checks for if the adjective is describing an object.
	 * Checks if a noun tag exists before a preposition. If not then the current word is a noun and not an adjective
	 * @param index
	 * @return boolean
	 */
	private boolean adjObjectExists(int index) {
	
		for (int i = index+1; i < combinedTags.size(); i++) {
			if (combinedTags.get(i).toLowerCase().startsWith("to") || combinedTags.get(i).toLowerCase().startsWith("in")){
				return false;
			}
			else if (combinedTags.get(i).toLowerCase().startsWith("nn")){
				return true;
			}
		}
		
		return false;
	}
	
	/**********************************
	 * A boolean function that checks for the token after the current token.
	 * 
	 * @param afterList (List<String>)
	 * @param index (Integer)
	 * @return boolean
	 **********************************/
	private boolean tokenAfter(List<String> afterList, int index) {
		int afterIndex = index + 1;
		if (afterIndex < tokenList.size()) {
			if (afterList.contains(tokenList.get(afterIndex).getSurface().toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	/***********************************
	 * A boolean function that checks for the token before the current token.
	 * 
	 * @param beforeList (List<String>)
	 * @param index (Integer)
	 * @param combinedTags (List<String>)
	 * @return boolean
	 ***********************************/
	private boolean stringBefore(List<String> beforeList, int index,
			List<String> combinedTags) {
		
		if (index != 0) {
			int beforeIndex = index - 1;
			if (beforeList.contains(combinedTags.get(beforeIndex).toLowerCase())) {
				return true;
			}
		}
		return false;
	}
	
	/***********************************
	 * A boolean function that checks for the token two before the current token.
	 * 
	 * @param beforeList (List<String>)
	 * @param index (Integer)
	 * @param combinedTags (List<String>)
	 * @return boolean
	 ***********************************/
	private boolean string2Before(List<String> beforeList, int index,
			List<String> combinedTags) {
		
		if (index > 1) {
			int before2Index = index - 2;
			if (beforeList.contains(combinedTags.get(before2Index).toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	/**********************************
	 * A boolean function that checks for the token after the current token.
	 * 
	 * @param afterList (List<String>)
	 * @param index (Integer)
	 * @param combinedTags (List<String>)
	 * @return boolean
	 **********************************/
	private boolean stringAfter(List<String> afterList, int index,
			List<String> combinedTags) {

		int afterIndex = index + 1;
		if (afterIndex < combinedTags.size()) {
			if (afterList.contains(combinedTags.get(afterIndex).toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	/**********************************
	 * A boolean function that checks for what the token after the current
	 * token starts with.
	 * 
	 * @param afterList (List<String>)
	 * @param index (Integer)
	 * @param combinedTags (List<String>)
	 * @return boolean
	 **********************************/
	private boolean stringAfterStartsWith(List<String> afterList, int index,
			List<String> combinedTags) {
		
		int afterIndex = index + 1;
		if (afterIndex < combinedTags.size()) {
			for (String nextWord : afterList) {
				if (combinedTags.get(afterIndex).toLowerCase().startsWith(nextWord)) {
					return true;
				}
			}
		}
		return false;
	}

	/**********************************
	 * A boolean function that checks for the token two after the current token.
	 * 
	 * @param afterList (List<String>)
	 * @param index (Integer)
	 * @param combinedTags (List<String>)
	 * @return boolean
	 **********************************/
	private boolean string2After(List<String> afterList, int index,
			List<String> combinedTags) {

		int after2Index = index + 2;
		if (after2Index < combinedTags.size()) {
			if (afterList.contains(combinedTags.get(after2Index).toLowerCase())) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Tests if this string ends with the specified suffix ignoring case.
	 * @param str
	 * @param suffix
	 * @return
	 */
	private boolean endsWithCaseInsensitive(String str, String suffix) {
		if (suffix.length() > str.length()) {
			return false;
		}
		int strOffset = str.length() - suffix.length();
		return str.regionMatches(true, strOffset, suffix, 0, suffix.length());
	}

}