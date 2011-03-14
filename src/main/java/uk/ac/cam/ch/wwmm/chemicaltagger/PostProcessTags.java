package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.List;

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

		// System.out.println("Before correcting tags:"+posContainer.getTokenTagTupleAsString());
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
					&& !currentTag.toLowerCase().startsWith("nn-cycle")
					&& !currentTag.toLowerCase().startsWith("nn-temp")
					&& !currentTag.toLowerCase().startsWith("nn-pressure")
					&& !currentTag.toLowerCase().startsWith("nn-time")
					&& !currentTag.toLowerCase().startsWith("nn-vacuum")) {
				List<String> beforeList = Utils
						.addToList("dt jj jj-chem dt-the");
				List<String> afterListJJ = Utils
						.addToList("jj nn-chementity nn-mixture nn-apparatus nn jj-chem");
				List<String> afterListChem = Utils.addToList("vbd stop comma");

				List<String> afterListNN = Utils.addToList("stop comma");

				if (stringbefore(beforeList, i, combinedTags)
						&& (i == combinedTags.size() || stringafter(
								afterListNN, i, combinedTags))
						&& !currentTag.toLowerCase().startsWith("nn-"))
					newTag = "NN";

				else if (stringbefore(beforeList, i, combinedTags)
						&& (stringafter(afterListChem, i, combinedTags))) {
					newTag = "NN-CHEMENTITY";
				} else if (stringbefore(beforeList, i, combinedTags)
						&& (stringafter(afterListJJ, i, combinedTags) && !currentTag
								.toLowerCase().startsWith("nn-chementity"))) {
					newTag = "JJ";
				}
			}
		}

		if (currentTag.toLowerCase().startsWith("vb-precipitate")) {
			List<String> beforeList = Utils.addToList("jj oscar-cj jj-chem");
			List<String> afterList = Utils.addToList("in-of");
			List<String> notafterList = Utils.addToList("nn-time");
			if (stringbefore(beforeList, i, combinedTags)
					&& (stringafter(afterList, i, combinedTags) || i == combinedTags
							.size())) {
				if (!stringafter(notafterList, i, combinedTags))
					newTag = "NN-CHEMENTITY";
			}
		}

		if (currentToken.startsWith("Contain")) {
			newTag = "JJ";

		}

		if (currentToken.equals("w")) {
			newTag = "NN-CHEMENTITY";

		}
		if (currentTag.toLowerCase().startsWith("vbn")
				|| currentTag.toLowerCase().startsWith("vbg")
				|| currentTag.toLowerCase().startsWith("vb-")
				|| currentToken.endsWith("ed")) {

			List<String> afterList = Utils
					.addToList("oscar-cm nns nn-chementity oscar-cj jj-chem nnp");
			List<String> beforeList = Utils
					.addToList("dt rb rb-conj dt-the stop in-with in-of in-under");
			if (stringafter(afterList, i, combinedTags)
					&& stringbefore(beforeList, i, combinedTags)) {
				newTag = "JJ-CHEM";
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
			List<String> afterList = Utils.addToList("nn-chementity");
			if (stringafter(afterList, i, combinedTags))
				newTag = "JJ-COMPOUND";
		}

		if (currentTag.toLowerCase().startsWith("vbd")) {

			List<String> beforeList = Utils.addToList("oscar-cm");
			List<String> afterList = Utils.addToList("oscar-cj jj-chem nn");

			if (stringbefore(beforeList, i, combinedTags)
					&& stringafter(afterList, i, combinedTags)&& !currentTag.toLowerCase().startsWith("nn-")) {
				newTag = "JJ";
			}

		}

		if (currentTag.toLowerCase().startsWith("vb-filter")) {

			List<String> beforeList = Utils.addToList("oscar-cj jj-chem");
			if (stringbefore(beforeList, i, combinedTags)) {
				newTag = "NN";
			}

		}

		if (currentTag.toLowerCase().startsWith("vb")) {

			List<String> beforeList = Utils.addToList("to");
			List<String> beforebeforeList = Utils.addToList("vb-heat");
			List<String> afterList = Utils.addToList("stop");
			if (stringbefore(beforeList, i, combinedTags)
					&& stringbefore(beforebeforeList, i - 1, combinedTags)
					&& stringafter(afterList, i, combinedTags)) {
				newTag = "NN";
			}

		}
		if (currentTag.toLowerCase().startsWith("vb-precipitate")) {

			if (i != 0) {
				int beforeIndex = i - 1;
				if (tokenList.get(beforeIndex).endsWith("ing")) {
					newTag = "NN-CHEMENTITY";
				}

			}

		}

		if (currentTag.toLowerCase().startsWith("nn-mixture")) {

			List<String> afterList = Utils.addToList("in-of");
			
			if (!stringafter(afterList, i, combinedTags)) newTag = "NN-CHEMENTITY";

		}
		/********
		 * Gerunds
		 */
		if (currentTag.toLowerCase().startsWith("vb")
				&& (currentToken.toLowerCase().endsWith("ing") || currentToken
						.toLowerCase().endsWith("ed"))) {

			List<String> afterList = Utils
					.addToList("nn oscar-cm nns nn-chementity oscar-cj jj-chem jj nnp nn-state nn-apparatus");
			List<String> beforeList = Utils.addToList("dt dt-the");

			List<String> notList = Utils.addToList("in-of");
			if (stringafter(afterList, i, combinedTags)
					&& stringbefore(beforeList, i, combinedTags)) {
				newTag = "JJ";
			}

			else if (currentToken.toLowerCase().endsWith("ing")
					&& stringbefore(beforeList, i, combinedTags)
					&& !stringafter(notList, i, combinedTags)) {
				newTag = "JJ-CHEM";
			}

		}

		if (currentTag.toLowerCase().startsWith("vb")
				&& !currentToken.toLowerCase().endsWith("ing")) {

			List<String> beforeList = Utils
					.addToList("dt dt-the in-in in-of rb");
			List<String> afterList = Utils
					.addToList("nn oscar-cm nns nn-chementity oscar-cj jj-chem jj nnp nn-state nn-apparatus");

			List<String> chemafterList = Utils
					.addToList("oscar-cm nn-chementity oscar-cj jj-chem");

			if (i != 0) {
				if (!tokenList.get(i - 1).equals("that")) {
					if (stringafter(chemafterList, i, combinedTags)
							& stringbefore(beforeList, i, combinedTags)) {
						newTag = "JJ-CHEM";
					}

					else if (stringbefore(beforeList, i, combinedTags)
							&& stringafter(afterList, i, combinedTags)) {
						newTag = "JJ";
					} else if (stringbefore(beforeList, i, combinedTags)
							&& combinedTags.get(i + 1).getPOS().toLowerCase()
									.startsWith("nn")) {
						newTag = "JJ";
					} else if (combinedTags.get(i - 1).getPOS().toLowerCase()
							.startsWith("dt")) {
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
		if (i !=0 && StringUtils.equalsIgnoreCase(currentTag, "nns")) {
			
			List<String> beforeList = Utils.addToList("stop");
			if (currentToken.endsWith("s") && Character.isUpperCase(currentToken.charAt(0))){
			if (!stringbefore(beforeList, i, combinedTags))newTag = "NPS";
			}
		}
		
		if (i !=0 && StringUtils.equalsIgnoreCase(currentTag, "nn")) {
			
			List<String> beforeList = Utils.addToList("stop");
			if  (Character.isUpperCase(currentToken.charAt(0)) && !stringbefore(beforeList, i, combinedTags)) newTag = "NNP";
			
		}
		
		if (i !=0 && currentTag.toLowerCase().startsWith("vb")) {
			
			List<String> beforeList = Utils.addToList("stop rrb comma");
			List<String> afterList = Utils.addToList("nnp nns nn nnp-acronym");
			if  (Character.isUpperCase(currentToken.charAt(0)) && !stringbefore(beforeList, i, combinedTags) && stringafter(afterList, i, combinedTags)) newTag = "JJ-CHEM";
			
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
			List<String> beforeList = Utils.addToList("jj oscar-cj jj-chem");
			List<String> afterList = Utils.addToList("in-of");

			if (!stringbefore(beforeList, i, combinedTags)
					&& (stringafter(afterList, i, combinedTags))) {
				newTag = "NN";
			}
		}

		if (currentTag.toLowerCase().startsWith("nn-synthesize")) {
			List<String> afterList = Utils.addToList("in-of nn-method");
			if  (!stringafter(afterList, i, combinedTags)) {
				
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

			List<String> afterList = Utils.addToList("nn-apparatus");
			List<String> beforeList = Utils
					.addToList("dt nn-apparatus rb-conj dt-the");
			if (stringafter(afterList, i, combinedTags)
					&& stringbefore(beforeList, i, combinedTags)) {
				newTag = "JJ-CHEM";
			}

		}

		if (currentToken.equals("D") & currentTag.toLowerCase().equals("nn-time")) {

			List<String> beforeList = Utils
					.addToList("in-in");
			if (stringbefore(beforeList, i, combinedTags)) {
				newTag = "NN";
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