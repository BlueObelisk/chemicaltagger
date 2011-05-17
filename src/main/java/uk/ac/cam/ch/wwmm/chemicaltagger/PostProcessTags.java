package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/**************************************************
 * Corrects Mistagged tokens.
 * 
 * @author lh359, dl387
 **************************************************/
public class PostProcessTags {

	private static HashSet<String> tagSet = Utils.loadsTagsFromFile(PostProcessTags.class);
	/***********************************************
	 * Corrects the combinedtagsList.
	 * 
	 * @param posContainer
	 *            (POSContainer)
	 * @return posContainer (POSContainer)
	 **********************************************/
	
	public POSContainer correctCombinedTagsList(POSContainer posContainer) {

		List<String> tokenList = posContainer.getWordTokenList();
		List<String> combinedTags = posContainer.getCombinedTagsList();
		List<String> newTokenList = new ArrayList<String>();
		List<String> newCombinedTagsList = new ArrayList<String>();
		for (int i = 0; i < combinedTags.size(); i++) {
			String currentTag = combinedTags.get(i);
			String currentToken = tokenList.get(i);
			String newTag = combinedTags.get(i);
			newTag = correctMisTaggedVerbs(tokenList, combinedTags, i,
					currentTag, currentToken, newTag);
			newTag = correctMisTaggedMisc(combinedTags, i, currentTag,
					currentToken, newTag);
			newTag = correctMisTaggedDigits(combinedTags, i, currentTag,
					currentToken, newTag);

			if (tagSet.contains(currentToken)) {
				currentToken = currentToken.toLowerCase();
			}
			
			newCombinedTagsList.add(newTag);
			newTokenList.add(currentToken);
		}
		
		posContainer.setWordTokenList(newTokenList);
		
		posContainer.setCombinedTagsList(newCombinedTagsList);
		return posContainer;
	}

	/*************************************
	 * Corrects the mistagged verbs.
	 * 
	 * @param tokenList  (List<String>)
	 * @param combinedTags  (List <String>)
	 * @param i (Integer)
	 * @param currentTag (String)
	 * @param currentToken (String)
	 * @param newTag (String)
	 * @return newTag (String)
	 *************************************/
	private String correctMisTaggedVerbs(List<String> tokenList,
			List<String> combinedTags, int i, String currentTag,
			String currentToken, String newTag) {
		if (currentTag.toLowerCase().startsWith("vb-")
				|| currentTag.toLowerCase().startsWith("nn")) {
			if (!currentTag.toLowerCase().startsWith("nn-state")
					&& !currentTag.toLowerCase().startsWith("nn-apparatus")
					&& !currentTag.toLowerCase().startsWith("nn-cycle")
					&& !currentTag.toLowerCase().startsWith("nn-temp")
					&& !currentTag.toLowerCase().startsWith("nn-pressure")
					&& !currentTag.toLowerCase().startsWith("nn-time")
					&& !currentTag.toLowerCase().startsWith("nn-molar")
					&& !currentTag.toLowerCase().startsWith("nn-vacuum")
				    && !currentTag.toLowerCase().startsWith("nnp"))  {
				List<String> beforeList = Arrays.asList("dt jj jj-chem dt-the"
						.split(" "));
				List<String> afterListJJ = Arrays
						.asList("jj nn-chementity nn-mixture nn-apparatus nn jj-chem"
								.split(" "));

				List<String> afterListNN = Arrays.asList("stop comma"
						.split(" "));

				if (stringBefore(beforeList, i, combinedTags)
						&& (i == combinedTags.size() || stringAfter(
								afterListNN, i, combinedTags))
						&& !currentTag.toLowerCase().startsWith("nn-")) {
					newTag = "NN";
				}
					

				else if (stringBefore(beforeList, i, combinedTags)
						&& (stringAfter(afterListJJ, i, combinedTags) && !currentTag
								.toLowerCase().startsWith("nn-chementity")) && adjObjectExists(combinedTags,i)) {
					newTag = "JJ-CHEM";
				}
			}
		}

		if (currentTag.toLowerCase().startsWith("vb-precipitate")) {
			List<String> beforeList = Arrays.asList("jj oscar-cj jj-chem"
					.split(" "));
			List<String> afterList = Arrays.asList("in-of");
			List<String> notafterList = Arrays.asList("nn-time");

			if (stringBefore(beforeList, i, combinedTags)
					&& (stringAfter(afterList, i, combinedTags) || i == combinedTags
							.size())) {
				if (!stringAfter(notafterList, i, combinedTags)){
					newTag = "NN-CHEMENTITY";
				}	
			}
			if (i != 0) {
				int beforeIndex = i - 1;
				if (tokenList.get(beforeIndex).endsWith("ing")) {
					newTag = "NN-CHEMENTITY";
				}

			}
		}

		if (currentTag.toLowerCase().startsWith("vb-")
				|| currentTag.toLowerCase().startsWith("nn-synthesize")) {
			List<String> beforeList = Arrays.asList("dt-the dt".split(" "));
			List<String> afterList = Arrays.asList("vb".split(" "));

			if (stringBefore(beforeList, i, combinedTags)
					&& (stringAfterStartsWith(afterList, i, combinedTags))) {
				newTag = "NN-CHEMENTITY";
			}
		}

		if (currentTag.toLowerCase().startsWith("vb")
				&& Utils.containsNumber(currentToken)) {
			newTag = "NN";
		}

		if (currentTag.toLowerCase().startsWith("vbn")
				|| currentTag.toLowerCase().startsWith("vbg")
				|| currentTag.toLowerCase().startsWith("vb-")
				|| currentToken.endsWith("ed")) {

			List<String> afterList = Arrays
					.asList("oscar-cm nns nn-chementity oscar-cj jj-chem nnp"
						.split(" "));
			List<String> beforeList = Arrays
					.asList("dt rb rb-conj dt-the stop in-with in-of in-under"
							.split(" "));
			if (stringAfter(afterList, i, combinedTags)
					&& stringBefore(beforeList, i, combinedTags)) {
				newTag = "JJ-CHEM";
			}

		}

		if (currentTag.toLowerCase().startsWith("vb-yield")) {

			List<String> beforeList = Arrays.asList("nn-percent");
			if (stringBefore(beforeList, i, combinedTags)) {
				newTag = "NN-YIELD";
			}
			List<String> afterList = Arrays.asList("nn-chementity");
			if (stringAfter(afterList, i, combinedTags)){
				newTag = "JJ-COMPOUND";
			}
		}

		if (currentTag.toLowerCase().startsWith("vb-filter")) {

			List<String> beforeList = Arrays.asList("oscar-cj jj-chem"
					.split(" "));
			if (stringBefore(beforeList, i, combinedTags)) {
				newTag = "NN";
			}

		}

		if (currentTag.toLowerCase().startsWith("vb")) {

			List<String> beforeList = Arrays.asList("to");
			List<String> beforebeforeList = Arrays.asList("vb-heat");
			List<String> afterList = Arrays.asList("stop");
			if (stringBefore(beforeList, i, combinedTags)
					&& stringBefore(beforebeforeList, i - 1, combinedTags)
					&& stringAfter(afterList, i, combinedTags)) {
				newTag = "NN";
			}

		}

		if (currentTag.toLowerCase().startsWith("nn-mixture")) {

			List<String> afterList = Arrays.asList("in-of");

			if (!stringAfter(afterList, i, combinedTags)) {
				newTag = "NN-CHEMENTITY";
			}

		}
		
		if (currentTag.toLowerCase().startsWith("vb-dilute")) {//correct cases where dilute and the like are actually adjectives e.g. dilute sulfuric acid

			List<String> afterList = Arrays.asList("oscar-cm");

			if (stringAfter(afterList, i, combinedTags)) {
				newTag = "JJ-CHEM";
			}

		}

		/********
		 * Gerunds
		 */
		if (currentTag.toLowerCase().startsWith("vb")
				&& (currentToken.toLowerCase().endsWith("ing") || currentToken
						.toLowerCase().endsWith("ed"))) {

			List<String> afterList = Arrays.asList("nn oscar-cm nns nn-chementity oscar-cj jj-chem jj nnp nn-state nn-apparatus".split(" "));
			List<String> beforeList = Arrays.asList("dt dt-the cd oscar-cm".split(" "));

			List<String> notList = Arrays.asList("in-of");
			if (stringAfter(afterList, i, combinedTags) 	&& stringBefore(beforeList, i, combinedTags)) {
				newTag = "JJ";
			}

			else if (currentToken.toLowerCase().endsWith("ing") && stringBefore(beforeList, i, combinedTags) && !stringAfter(notList, i, combinedTags)) {
				newTag = "JJ-CHEM";
			}

		}

		if (currentTag.toLowerCase().startsWith("vb") && !currentToken.toLowerCase().endsWith("ing")) {

			List<String> beforeList = Arrays.asList("dt dt-the in-in in-of rb".split(" "));
			List<String> afterList = Arrays.asList("nn oscar-cm nns nn-chementity oscar-cj jj-chem jj nnp nn-state nn-apparatus".split(" "));
			List<String> chemafterList = Arrays.asList("oscar-cm nn-chementity oscar-cj jj-chem".split(" "));

			if (i != 0) {
				if (!tokenList.get(i - 1).equals("that")) {
					if (stringAfter(chemafterList, i, combinedTags)
							&& stringBefore(beforeList, i, combinedTags)) {
						newTag = "JJ-CHEM";
					}

					else if (stringBefore(beforeList, i, combinedTags)
							&& stringAfter(afterList, i, combinedTags)) {
						newTag = "JJ";
					} else if (stringBefore(beforeList, i, combinedTags)
							&& combinedTags.get(i + 1).toLowerCase()
									.startsWith("nn")) {
						newTag = "JJ";
					}

				}
			}
		}

		return newTag;
	}

	/******************************************
	 * Checks for if the adjective is describing an object.
	 * Checks if a noun tag exists before a preposition. If not then the current word is a noun and not an adjective
	 * @param combinedTags
	 * @param index
	 * @return boolean
	 */
	private boolean adjObjectExists(List<String> combinedTags, int index) {

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

	/*************************************
	 * Corrects the mistagged verbs.
	 * 
	 * @param combinedTags  (List <String>)
	 * @param i (Integer)
	 * @param currentTag (String)
	 * @param currentToken (String)
	 * @param newTag (String)
	 * @return newTag (String)
	 *************************************/
	private String correctMisTaggedDigits(List<String> combinedTags, int i,
			String currentTag, String currentToken, String newTag) {
		if (StringUtils.equalsIgnoreCase(currentTag, "cd")
				|| (currentTag.toLowerCase().startsWith("nn-") && Utils
						.containsNumber(currentToken))) {
			List<String> beforeList = Arrays
					.asList("in-of jj nn-chementity comma".split(" "));
			List<String> afterList = Arrays.asList("-lrb- stop comma"
					.split(" "));
			if (stringBefore(beforeList, i, combinedTags)
					&& (stringAfter(afterList, i, combinedTags) || i == combinedTags
							.size())) {
				newTag = "CD-ALPHANUM";
			}
		}

		if (StringUtils.equalsIgnoreCase(currentTag, "prp")
				|| currentToken.toLowerCase().startsWith("ii")) {
			List<String> beforeList = Arrays.asList("-lrb-");
			List<String> afterList = Arrays.asList("-rrb-");
			if (stringBefore(beforeList, i, combinedTags)
					&& (stringAfter(afterList, i, combinedTags))) {
				newTag = "CD-ALPHANUM";
			}
		}
		if (currentTag.toLowerCase().equals("cd")) {

			List<String> afterList = Arrays.asList("stop comma -lrb-"
					.split(" "));

			if (stringAfter(afterList, i, combinedTags)
					&& !currentToken.contains(".") && currentToken.length() < 4) {
				newTag = "CD-ALPHANUM";
			}
		}

		if (currentTag.toLowerCase().equals("cd-alphanum")) {

			List<String> afterList = Arrays.asList("nn-vol nn-mass".split(" "));

			if (stringAfter(afterList, i, combinedTags)
					|| currentToken.contains(".") || currentToken.length() > 4) {
				newTag = "CD";
			}
		}
		return newTag;
	}

	/*************************************
	 * Corrects the mistagged verbs.
	 * 
	 * @param combinedTags  (List <String>)
	 * @param i (Integer)
	 * @param currentTag (String)
	 * @param currentToken (String)
	 * @param newTag (String)
	 * @return newTag (String)
	 *************************************/
	private String correctMisTaggedMisc(List<String> combinedTags, int i,
			String currentTag, String currentToken, String newTag) {
		if (StringUtils.equalsIgnoreCase(currentTag, "nnp")
				&& StringUtils.equalsIgnoreCase(currentToken, "M")) {
			newTag = "NN-MOLAR";
		}
		if (i != 0 && StringUtils.equalsIgnoreCase(currentTag, "nns")) {

			List<String> beforeList = Arrays.asList("stop");
			if (currentToken.endsWith("s")
					&& Character.isUpperCase(currentToken.charAt(0))) {
				if (!stringBefore(beforeList, i, combinedTags)){
					newTag = "NNPS";
				}
			}
		}

		if (StringUtils.equalsIgnoreCase(currentTag, "rb")	&& currentToken.length() < 2) {

			if (Character.isUpperCase(currentToken.charAt(0))){
				newTag = "NNP";
			}
			else {
				newTag = "NN";
			}

		}
		if (i != 0 && StringUtils.equalsIgnoreCase(currentTag, "nn")) {

			List<String> beforeList = Arrays.asList("stop");
			if (Character.isUpperCase(currentToken.charAt(0)) && !stringBefore(beforeList, i, combinedTags)){
				newTag = "NNP";
			}

		}

		if (i != 0	&& (currentTag.toLowerCase().startsWith("vb") || currentTag
						.toLowerCase().startsWith("nn-"))) {

			List<String> beforeList = Arrays
					.asList("stop rrb comma".split(" "));
			List<String> afterList = Arrays.asList("nnp nns nn nnp-acronym"
					.split(" "));
			if (Character.isUpperCase(currentToken.charAt(0))
					&& !stringBefore(beforeList, i, combinedTags)
					&& stringAfter(afterList, i, combinedTags)){
				newTag = "JJ-CHEM";
			}

		}
		if (currentToken.equals("M")) {

			List<String> beforeList = Arrays.asList("cd");

			if (stringBefore(beforeList, i, combinedTags)) {
				newTag = "NN-MOLAR";
			}
		}

		if (currentToken.equals("K")) {

			List<String> beforeList = Arrays.asList("cd");

			if (stringBefore(beforeList, i, combinedTags)) {
				newTag = "NN-TEMP";
			}
		}
		if (StringUtils.equalsIgnoreCase(currentTag, "''")) {
			newTag = "FW";
		}
		if (currentTag.toLowerCase().equals("nn-mixture")) {

			List<String> afterList = Arrays.asList("vbd");

			if (stringAfter(afterList, i, combinedTags)) {
				newTag = "NN-CHEMENTITY";
			}
		}

		if (currentTag.toLowerCase().startsWith("nn-concentrate")) {
			List<String> beforeList = Arrays.asList("jj oscar-cj jj-chem"
					.split(" "));
			List<String> afterList = Arrays.asList("in-of");

			if (!stringBefore(beforeList, i, combinedTags)
					&& (stringAfter(afterList, i, combinedTags))) {
				newTag = "NN";
			}
		}

		if (i != 0 && currentTag.toLowerCase().startsWith("nn-add")) {
			List<String> beforeList = Arrays.asList("stop comma colon"
					.split(" "));
			if (!stringBefore(beforeList, i, combinedTags)&& Character.isUpperCase(currentToken.charAt(0))) {
				newTag = "NNP";
			}

		}

		if (currentTag.toLowerCase().startsWith("jj")
				|| currentTag.toLowerCase().startsWith("nnp")) {
			List<String> afterList = Arrays.asList("nn-campaign");
			if ((stringAfter(afterList, i, combinedTags) || string2after(
					afterList, i, combinedTags))
					&& Character.isUpperCase(currentToken.charAt(0))) {
				newTag = "NNP";
			}
		}
		if (currentToken.toLowerCase().equals("addition")) {
			List<String> beforeList = Arrays.asList("in-in");
			List<String> afterList = Arrays.asList("comma stop".split(" "));

			if (stringBefore(beforeList, i, combinedTags)
					&& (stringAfter(afterList, i, combinedTags))) {
				newTag = "NN";
			}
		}

		if (currentToken.toLowerCase().startsWith("obtain")) {

			List<String> afterList = Arrays.asList("in-from");

			List<String> after2List = Arrays.asList("nnp");
			if (stringAfter(afterList, i, combinedTags)
					&& (string2after(after2List, i, combinedTags))) {
				newTag = "VB";
			}
		}
		if (currentTag.toLowerCase().startsWith("nn-synthesize")) {

			List<String> afterList = Arrays.asList("nn-apparatus");
			List<String> beforeList = Arrays
					.asList("dt nn-apparatus rb-conj dt-the".split(" "));
			if (stringAfter(afterList, i, combinedTags)
					&& stringBefore(beforeList, i, combinedTags)) {
				newTag = "JJ-CHEM";
			}

		}

		if (currentToken.equals("D")
				&& currentTag.toLowerCase().equals("nn-time")) {

			List<String> beforeList = Arrays.asList("in-in");
			if (stringBefore(beforeList, i, combinedTags)) {
				newTag = "NN";
			}

		}
		return newTag;

	}

	/***********************************
	 * A boolean function that checks for the tokens before the current token.
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

	/**********************************
	 * A boolean function that checks for the tokens after the current token.
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
	 * A boolean function that checks for what the tokens after the current
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
	 * A boolean function that checks for the tokens after the current token.
	 * 
	 * @param afterList (List<String>)
	 * @param index (Integer)
	 * @param combinedTags (List<String>)
	 * @return boolean
	 **********************************/
	private boolean string2after(List<String> afterList, int index,
			List<String> combinedTags) {

		int after2Index = index + 2;
		if (after2Index < combinedTags.size()) {
			if (afterList.contains(combinedTags.get(after2Index).toLowerCase())) {
				return true;
			}
		}
		return false;
	}

}