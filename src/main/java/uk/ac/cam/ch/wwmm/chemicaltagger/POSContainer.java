package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import uk.ac.cam.ch.wwmm.chemicaltagger.WWMMTag.TagType;

/********************************************
 * A container class that stores the grammatical structure of the text .
 * 
 * @author lh359
 ********************************************/
public class POSContainer {

	public List<String> wordTokenList = new ArrayList<String>();
	public List<WWMMTag> oscarTagList = new ArrayList<WWMMTag>();
	public List<WWMMTag> regexTagList = new ArrayList<WWMMTag>();
	public List<WWMMTag> brownTagList = new ArrayList<WWMMTag>();
	private List<WWMMTag> combinedTagsList = new ArrayList<WWMMTag>();
	private final Logger LOG = Logger.getLogger(POSContainer.class);
	private static String SPACE = " ";

	public POSContainer() {
	}

	public void addToTokenList(String token) {
		wordTokenList.add(token);
	}

	public void addToTokenListFromSentenceString(String sentence) {
		for (String token : sentence.split(" ")) {
			wordTokenList.add(token);
		}

	}

	public List<String> getTokenList() {
		return wordTokenList;
	}

	public void addToOSCARList(String oscarTag) {
		oscarTagList.add(new WWMMTag("OSCAR-" + oscarTag));

	}

	public void addToOSCARList(String oscarTag, Enum type) {
		oscarTagList.add(new WWMMTag("OSCAR-" + oscarTag, (TagType) type));
	}

	public void addToRegexList(String regexTag) {
		regexTagList.add(new WWMMTag(regexTag));

	}

	public void addToBrownListFromStringArray(String[] brownTags) {
		for (String string : brownTags) {
			if (StringUtils.isEmpty(string)) {
				brownTagList.add(new WWMMTag("NN-UNKNOWN"));
			} else {
				brownTagList.add(new WWMMTag(string));
			}
		}
	}

	public List<WWMMTag> getCombinedTagsList() {
		return combinedTagsList;
	}

	/***************************************
	 * Combines the output of all 3 taggers.
	 ***************************************/
	public void combineTaggers() {
		for (int i = 0; i < oscarTagList.size(); i++) {
			if (!oscarTagList.get(i).getPOS().toLowerCase().equals("oscar-nil")
					&& !oscarTagList.get(i).getPOS().toLowerCase().equals(
							"oscar-ont")) {
				combinedTagsList.add(oscarTagList.get(i));
			} else if (!regexTagList.get(i).getPOS().equals("nil")) {
				combinedTagsList.add(regexTagList.get(i));
			} else {
				combinedTagsList.add(brownTagList.get(i));
			}
		}

	}

	/*********************************************
	 * Gets the output of the string and tag as: "TAG TOKEN"
	 * 
	 * @return tokenTagTupleString (String).
	 *********************************************/
	public String getTokenTagTupleAsString() {
		StringBuilder tokenTagTupleString = new StringBuilder();

		for (int i = 0; i < wordTokenList.size(); i++) {
			if (StringUtils.isNotEmpty(combinedTagsList.get(i).POS)
					&& StringUtils.isNotEmpty(wordTokenList.get(i))) {
				tokenTagTupleString.append(combinedTagsList.get(i).POS);
				tokenTagTupleString.append(SPACE);
				tokenTagTupleString.append(wordTokenList.get(i));
				tokenTagTupleString.append(SPACE);
			}
		}

		return tokenTagTupleString.toString().trim();

	}

	public void printOutTags() {

		System.out.println("Token List is " + this.wordTokenList);
		for (int i = 0; i < wordTokenList.size(); i++) {
			System.out.println("WORD:" + wordTokenList.get(i));
			System.out.println("\t>>OSCAR TAG: " + oscarTagList.get(i).POS);
			System.out.println("\t>>REGEX TAG: " + regexTagList.get(i).POS);
			System.out.println("\t>>OPENNLP TAG: " + brownTagList.get(i).POS);
			System.out.println("\t>>COMBINED TAG: "
					+ combinedTagsList.get(i).POS);

		}

	}
}
