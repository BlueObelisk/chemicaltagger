package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.xmlcml.euclid.Util;

public class PostProcessTags {
//	private final Logger LOG = Logger.getLogger(PostProcessTags.class);

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
			
			newTag = correctMisTaggedVerbs(combinedTags, i, currentTag,
					currentToken, newTag);

			newTag = correctMisTaggedMisc(combinedTags, i, currentTag,
					currentToken, newTag);

			newTag = correctMisTaggedDigits(combinedTags, i, currentTag, currentToken, newTag);

			/****************************************************
			 * Function added to avoid the trailing close bracket
			 * Should ideally be done in Oscar
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
	 * Corrects the mistagged oscar
	 *    tokens
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
	 * @param List<WWMMTag> combinedTags
	 * @param int i
	 * @param currentTag
	 * @param currentToken
	 * @param newTag
	 * @return
	 */
	
	private String correctMisTaggedVerbs(List<WWMMTag> combinedTags, int i,
			String currentTag, String currentToken, String newTag) {
		// polymerization should not be chementity
		if (currentTag.toLowerCase().startsWith("vb-")
				|| currentTag.toLowerCase().startsWith("nn")) {
			if (!currentTag.toLowerCase().startsWith("nn-state")
					&& !currentTag.toLowerCase().startsWith("nn-apparatus")
					&& !currentTag.toLowerCase().startsWith("nn-temp")
					&& !currentTag.toLowerCase().startsWith("nn-pressure")
					&& !currentTag.toLowerCase().startsWith("nn-time")) {
				List<String> beforeList = Utils.addToList("dt jj");
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

			if (stringbefore(beforeList, i, combinedTags)
					&& (stringafter(afterList, i, combinedTags) || i == combinedTags
							.size())) {
				newTag = "NN-CHEMENTITY";
			}
		}

		if (currentTag.toLowerCase().startsWith("vbn")
				|| currentTag.toLowerCase().startsWith("vbg")) {

			List<String> afterList = Utils
					.addToList("oscar-cm nns nn-chementity oscar-cj");
			List<String> beforeList = Utils.addToList("dt rb");
			if (stringafter(afterList, i, combinedTags)
					&& stringbefore(beforeList, i, combinedTags)) {
				newTag = "OSCAR-CJ";
			}

		}
		/********
		 * Gerunds
		 */
		if (currentTag.toLowerCase().startsWith("vb")
				&& currentToken.toLowerCase().endsWith("ing")) {

			List<String> afterList = Utils
					.addToList("nn oscar-cm nns nn-chementity oscar-cj jj nnp");
			List<String> beforeList = Utils.addToList("dt rbr rb");
			if (stringafter(afterList, i, combinedTags)
					&& stringbefore(beforeList, i, combinedTags)) {
				newTag = "JJ";
			}

		}

		if (currentTag.toLowerCase().startsWith("vb-")
				&& !currentToken.toLowerCase().endsWith("ing")) {

			List<String> afterList = Utils
					.addToList("nn oscar-cm nns nn-chementity oscar-cj jj nnp nn-state");
			List<String> beforeList = Utils.addToList("dt in-in in-by in-of in stop ");
			if (stringafter(afterList, i, combinedTags)
					&& stringbefore(beforeList, i, combinedTags)) {
				newTag = "JJ";
			}

		}
		return newTag;
	}

	/****************************
	 * Corrects the mistagged digits
	 *    
	 * @param List<WWMMTag> combinedTags
	 * @param int i
	 * @param currentToken
	 * @param currentTag
	 * @param newTag
	 * @return
	 */
	private String correctMisTaggedDigits(List<WWMMTag> combinedTags, int i,
			String currentTag,String currentToken, String newTag) {
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

		if (currentTag.toLowerCase().equals("cd")) {

			List<String> afterList = Utils.addToList("stop comma -lrb-");

			if (stringafter(afterList, i, combinedTags) && !currentToken.contains(".") && currentToken.length() < 4) {
				newTag = "OSCAR-CD";
			}
		}


		
		if (currentTag.toLowerCase().equals("oscar-cd")) {

			List<String> afterList = Utils.addToList("nn-vol nn-mass");

			if (stringafter(afterList, i, combinedTags) || currentToken.contains(".") || currentToken.length() > 3) {
				newTag = "CD";
			}
		}
		return newTag;
	}

	/*************************
	 * 
	 * Corrections of other non-verb 
	 *    non-chemistry tags
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

		if (StringUtils.equalsIgnoreCase(currentTag, "''")) {
			newTag = "FW";
		}
		if (currentTag.toLowerCase().equals("nn-mixture")) {

			List<String> afterList = Utils.addToList("vbd");

			if (stringafter(afterList, i, combinedTags) ) {
				newTag = "NN-CHEMENTITY";
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


}