package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.apache.commons.lang.StringUtils;
import org.xmlcml.euclid.Util;

public class PostProcessTags {
	// private final Logger LOG = Logger.getLogger(PostProcessTags.class);

	/**************************************************
	 * Corrects MisNamed Tags
	 * 
	 * Needs to be refactored and/or separated into different modules.
	 **************************************************/
	public POSContainer correctCombinedTagsList(POSContainer posContainer) {

		List<String> tokenList = posContainer.getTokenList();
		List<WWMMTag> combinedTags = posContainer.getCombinedTagsList();

		List<String> newTokenList = new ArrayList<String>();
		List<WWMMTag> newCombinedTagsList = new ArrayList<WWMMTag>();

		boolean ignoreNextBracket = false;

		for (int i = 0; i < combinedTags.size(); i++) {
			String currentTag = combinedTags.get(i).getPOS();
			String currentToken = tokenList.get(i);
			String newTag = combinedTags.get(i).getPOS();

			newTag = correctMisTaggedChemistry(currentTag, currentToken, newTag);

			newTag = correctMisTaggedVerbs(tokenList, combinedTags, i,
					currentTag, currentToken, newTag);

			newTag = correctMisTaggedMisc(combinedTags, i, currentTag,
					currentToken, newTag);

			newTag = correctMisTaggedDigits(combinedTags, i, currentTag,
					currentToken, newTag);

			/****************************************************
			 * Function added to avoid the trailing close bracket Should ideally
			 * be done in Oscar
			 ***************************************************/
			if (currentTag.toLowerCase().equals("oscar-cm")) {

				List<String> afterList = Utils.addToList("-rrb-");

				if (stringafter(afterList, i, combinedTags)) {

					int bracketIndex = Util.indexOfBalancedBracket(')',
							currentToken);
					if (currentToken.contains("(") && bracketIndex < 0) {
						currentToken = currentToken + ")";
						ignoreNextBracket = true;
					}

				}
			}

			if (ignoreNextBracket & currentToken.equals(")")) {
				ignoreNextBracket = false;
			} else {
				newCombinedTagsList.add(new WWMMTag(newTag));

				newTokenList.add(currentToken);
			}

		}

		posContainer.setTokenList(newTokenList);
		posContainer.setCombinedTagsList(newCombinedTagsList);
		return posContainer;
	}

	/****************************
	 * Corrects the mistagged oscar tokens
	 * 
	 * @param currentTag
	 * @param currentToken
	 * @param newTag
	 * @return
	 */
	private String correctMisTaggedChemistry(String currentTag,
			String currentToken, String newTag) {
		if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm")
				|| StringUtils.equalsIgnoreCase(currentTag, "oscar-ont")) {
			List<String> synthList = Utils.addToList("atrp romp");
			List<String> tempList = Utils.addToList("°c k ºc");
			List<String> volList = Utils.addToList("ml");

			if (synthList.contains(currentToken.toLowerCase())) {
				newTag = "NN-SYNTHESIZE";
			}
			if (tempList.contains(currentToken.toLowerCase())) {
				newTag = "NN-TEMP";
			}
			if (volList.contains(currentToken.toLowerCase())) {
				newTag = "NN-VOL";
			}
			if (StringUtils.equalsIgnoreCase(currentToken, "a")) {
				newTag = "DT";
			}

		}
		return newTag;
	}

	/****************************
	 * Corrects the mistagged verbs
	 * 
	 * @param tokenList
	 * 
	 * @param List
	 *            <WWMMTag> combinedTags
	 * @param int i
	 * @param currentTag
	 * @param currentToken
	 * @param newTag
	 * @return
	 */

	private String correctMisTaggedVerbs(List<String> tokenList,
			List<WWMMTag> combinedTags, int i, String currentTag,
			String currentToken, String newTag) {
		// polymerization should not be chementity
		if (currentTag.toLowerCase().startsWith("vb-")
				|| currentTag.toLowerCase().startsWith("nn")) {
			if (!currentTag.toLowerCase().startsWith("nn-state")
					&& !currentTag.toLowerCase().startsWith("nn-apparatus")
					&& !currentTag.toLowerCase().startsWith("nn-temp")
					&& !currentTag.toLowerCase().startsWith("nn-pressure")
					&& !currentTag.toLowerCase().startsWith("nn-time")) {
				List<String> beforeList = Utils.addToList("dt jj dt-the");
				List<String> afterList = Utils
						.addToList("vbd jj nn-chementity nn-mixture nn-apparatus nn comma");

				if (stringbefore(beforeList, i, combinedTags)
						&& (stringafter(afterList, i, combinedTags) || i == combinedTags
								.size())) {
					newTag = "NN-CHEMENTITY";
				}
			}
		}

		if (currentTag.toLowerCase().startsWith("vb-precipitate")) {
			List<String> beforeList = Utils.addToList("jj oscar-cj");
			List<String> afterList = Utils.addToList("in-of");
			List<String> notafterList = Utils.addToList("nn-time");
			if (stringbefore(beforeList, i, combinedTags)
					&& (stringafter(afterList, i, combinedTags) || i == combinedTags
							.size())) {
				if (!stringafter(notafterList, i, combinedTags))	newTag = "NN-CHEMENTITY";
			}
		}

		if (currentToken.startsWith("Contain")) {
			 newTag = "JJ";
			
		}

		if (currentTag.toLowerCase().startsWith("vbn")
				|| currentTag.toLowerCase().startsWith("vbg") || currentToken.endsWith("ed")) {

			List<String> afterList = Utils
					.addToList("oscar-cm nns nn-chementity oscar-cj nnp");
			List<String> beforeList = Utils.addToList("dt rb rb-conj dt-the stop");
			if (stringafter(afterList, i, combinedTags)
					&& stringbefore(beforeList, i, combinedTags)) {
				newTag = "OSCAR-CJ";
			}

		}

		if (currentToken.toLowerCase().startsWith("form")) {

			List<String> beforeList = Utils.addToList("vbd");
			if (stringbefore(beforeList, i, combinedTags)) {
				newTag = "VB-YIELD";
			}

		}
		
		if (currentTag.toLowerCase().startsWith("vb-yield")) {

			List<String> beforeList = Utils.addToList("nn-percent");
			if (stringbefore(beforeList, i, combinedTags)) {
				newTag = "NN-YIELD";
			}

		}
		/********
		 * Gerunds
		 */
		if (currentTag.toLowerCase().startsWith("vb")
				&& (currentToken.toLowerCase().endsWith("ing") || currentToken
						.toLowerCase().endsWith("ed"))) {

			List<String> afterList = Utils
					.addToList("nn oscar-cm nns nn-chementity oscar-cj jj nnp nn-state nn-apparatus");
			List<String> beforeList = Utils.addToList("dt dt-the");

			if (stringafter(afterList, i, combinedTags)
					&& stringbefore(beforeList, i, combinedTags)) {
				newTag = "JJ";
			}

		}

		if (currentTag.toLowerCase().startsWith("vb")
				&& !currentToken.toLowerCase().endsWith("ing")) {

			List<String> beforeList = Utils.addToList("dt dt-the");
			List<String> afterList = Utils
					.addToList("nn oscar-cm nns nn-chementity oscar-cj jj nnp nn-state nn-apparatus");

			List<String> chemafterList = Utils
					.addToList("oscar-cm nn-chementity oscar-cj");

			if (i != 0) {
				if (!tokenList.get(i - 1).equals("that")) {
					if (stringafter(chemafterList, i, combinedTags)
							& stringbefore(beforeList, i, combinedTags)) {
						newTag = "OSCAR-CJ";
					}

					else if (stringbefore(beforeList, i, combinedTags)
							&& stringafter(afterList, i, combinedTags)) {
						newTag = "JJ";
					} else if (stringbefore(beforeList, i, combinedTags)) {
						newTag = "NN";
					}
				}
			}
		}

		return newTag;
	}

	/****************************
	 * Corrects the mistagged digits
	 * 
	 * @param List
	 *            <WWMMTag> combinedTags
	 * @param int i
	 * @param currentToken
	 * @param currentTag
	 * @param newTag
	 * @return
	 */
	private String correctMisTaggedDigits(List<WWMMTag> combinedTags, int i,
			String currentTag, String currentToken, String newTag) {
		if (StringUtils.equalsIgnoreCase(currentTag, "cd")) {
			List<String> beforeList = Utils
					.addToList("in-of jj nn-chementity comma");
			List<String> afterList = Utils.addToList("-lrb- stop comma");
			if (stringbefore(beforeList, i, combinedTags)
					&& (stringafter(afterList, i, combinedTags) || i == combinedTags
							.size())) {
				newTag = "OSCAR-CD";
			}
		}

		if (StringUtils.equalsIgnoreCase(currentTag, "prp")
				|| currentToken.toLowerCase().startsWith("ii")) {
			List<String> beforeList = Utils.addToList("-lrb-");
			List<String> afterList = Utils.addToList("-rrb-");
			if (stringbefore(beforeList, i, combinedTags)
					&& (stringafter(afterList, i, combinedTags))) {
				newTag = "OSCAR-CD";
			}
		}
		if (currentTag.toLowerCase().equals("cd")) {

			List<String> afterList = Utils.addToList("stop comma -lrb-");

			if (stringafter(afterList, i, combinedTags)
					&& !currentToken.contains(".") && currentToken.length() < 4) {
				newTag = "OSCAR-CD";
			}
		}

		if (currentTag.toLowerCase().equals("oscar-cd")) {

			List<String> afterList = Utils.addToList("nn-vol nn-mass");

			if (stringafter(afterList, i, combinedTags)
					|| currentToken.contains(".") || currentToken.length() > 3) {
				newTag = "CD";
			}
		}
		return newTag;
	}

	/*************************
	 * 
	 * Corrections of other non-verb non-chemistry tags
	 * 
	 * @param combinedTags
	 * @param i
	 * @param currentTag
	 * @param currentToken
	 * @param newTag
	 * @return
	 */
	private String correctMisTaggedMisc(List<WWMMTag> combinedTags, int i,
			String currentTag, String currentToken, String newTag) {
		if (StringUtils.equalsIgnoreCase(currentTag, "nnp")
				&& StringUtils.equalsIgnoreCase(currentToken, "M")) {
			newTag = "NN-MOLAR";
		}
		if (currentToken.equals("M")) {

			List<String> beforeList = Utils.addToList("cd");

			if (stringbefore(beforeList, i, combinedTags)) {
				newTag = "NN-MOLAR";
			}
		}

		if (currentToken.equals("K")) {

			List<String> beforeList = Utils.addToList("cd");

			if (stringbefore(beforeList, i, combinedTags)) {
				newTag = "NN-TEMP";
			}
		}
		if (StringUtils.equalsIgnoreCase(currentTag, "''")) {
			newTag = "FW";
		}
		if (currentTag.toLowerCase().equals("nn-mixture")) {

			List<String> afterList = Utils.addToList("vbd");

			if (stringafter(afterList, i, combinedTags)) {
				newTag = "NN-CHEMENTITY";
			}
		}

		if (currentTag.toLowerCase().startsWith("nn-concentrate")) {
			List<String> beforeList = Utils.addToList("jj oscar-cj");
			List<String> afterList = Utils.addToList("in-of");

			if (!stringbefore(beforeList, i, combinedTags)
					&& (stringafter(afterList, i, combinedTags))) {
				newTag = "NN";
			}
		}

		if (currentTag.toLowerCase().startsWith("nn-synthesize")) {
			List<String> beforeList = Utils.addToList("dt dt-the");
			List<String> afterList = Utils.addToList("in-of");

			if (stringbefore(beforeList, i, combinedTags)
					&& (!stringafter(afterList, i, combinedTags))) {
				newTag = "NN-CHEMENTITY";
			}
		}

		if (currentToken.toLowerCase().equals("addition")) {
			List<String> beforeList = Utils.addToList("in-in");
			List<String> afterList = Utils.addToList("comma stop");

			if (stringbefore(beforeList, i, combinedTags)
					&& (stringafter(afterList, i, combinedTags))) {
				newTag = "NN";
			}
		}

		if (currentToken.toLowerCase().startsWith("obtain")) {

			List<String> afterList = Utils.addToList("in-from");

			List<String> after2List = Utils.addToList("nnp");
			if (stringafter(afterList, i, combinedTags)
					&& (string2after(after2List, i, combinedTags))) {
				newTag = "VB";
			}
		}
		if (currentTag.toLowerCase().startsWith("nn-synthesize")) {

			List<String> afterList = Utils
					.addToList("nn-apparatus");
			List<String> beforeList = Utils.addToList("dt nn-apparatus rb-conj dt-the");
			if (stringafter(afterList, i, combinedTags)
					&& stringbefore(beforeList, i, combinedTags)) {
				newTag = "OSCAR-CJ";
			}

		}

		return newTag;

	}

	/***********************************
	 * A boolean function that checks for the tokens before the current token
	 * 
	 * @param beforeList
	 * @param index
	 * @param combinedTags
	 * @return before(boolean)
	 ***********************************/
	private boolean stringbefore(List<String> beforeList, int index,
			List<WWMMTag> combinedTags) {
		boolean before = false;
		if (index != 0) {
			int beforeIndex = index - 1;
			if (beforeList.contains(combinedTags.get(beforeIndex).getPOS()
					.toLowerCase())) {
				before = true;
			}

		}
		return before;
	}

	/**********************************
	 * A boolean function that checks for the tokens after the current token
	 * 
	 * @param afterList
	 * @param index
	 * @param combinedTags
	 * @return
	 **********************************/
	private boolean stringafter(List<String> afterList, int index,
			List<WWMMTag> combinedTags) {
		boolean after = false;
		int afterIndex = index + 1;

		if (afterIndex < combinedTags.size()) {
			if (afterList.contains(combinedTags.get(afterIndex).getPOS()
					.toLowerCase())) {
				after = true;
			}

		}
		return after;
	}

	/**********************************
	 * A boolean function that checks for the tokens after the current token
	 * 
	 * @param afterList
	 * @param index
	 * @param combinedTags
	 * @return
	 **********************************/
	private boolean string2after(List<String> afterList, int index,
			List<WWMMTag> combinedTags) {
		boolean after = false;
		int after2Index = index + 2;

		if (after2Index < combinedTags.size()) {
			if (afterList.contains(combinedTags.get(after2Index).getPOS()
					.toLowerCase())) {
				after = true;
			}

		}
		return after;
	}

}