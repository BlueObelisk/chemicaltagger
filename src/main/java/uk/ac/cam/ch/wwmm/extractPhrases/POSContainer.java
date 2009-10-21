package uk.ac.cam.ch.wwmm.extractPhrases;

/********************************************
 * A container class that stores the grammatical
 * structure of the text
 * 
 * @author lh359
 ********************************************/

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import uk.ac.cam.ch.wwmm.extractPhrases.WWMMTag.TagType;


public class POSContainer {
	public List<String> wordTokenList = new ArrayList<String>();
	public List<WWMMTag> oscarTagList = new ArrayList<WWMMTag>();
	public List<WWMMTag> regexTagList = new ArrayList<WWMMTag>();
	public List<WWMMTag> brownTagList = new ArrayList<WWMMTag>();
	private List<WWMMTag> combinedTagsList = new ArrayList<WWMMTag>();
	private final Logger LOG = Logger.getLogger(POSContainer.class);

	public POSContainer() {
		
	}

	public void addToTokenList(String token) {
		wordTokenList.add(token);
	}

	public List<String> getTokenList() {
		return wordTokenList;
	}

	public void addToOSCARList(String oscarTag) {
		oscarTagList.add(new WWMMTag(oscarTag));
	}

	public void addToOSCARList(String oscarTag, Enum type) {
		oscarTagList.add(new WWMMTag(oscarTag, (TagType) type));
	}

	public void addToRegexList(String regexTag) {
		regexTagList.add(new WWMMTag(regexTag));

	}

	public void addToBrownListFromStringArray(String[] brownTags) {
		for (String string : brownTags) {
			brownTagList.add(new WWMMTag(string));
		}
	}

	public List<WWMMTag> getCombinedTagsList() {
		return combinedTagsList;
	}


	public void combineTaggers() {
		for (int i = 0; i < oscarTagList.size(); i++) {
			if (!oscarTagList.get(i).getPOS().equals("nil")) {
				combinedTagsList.add(oscarTagList.get(i));
			} else if (!regexTagList.get(i).getPOS().equals("nil")) {
				combinedTagsList.add(regexTagList.get(i));
			} else {
				combinedTagsList.add(brownTagList.get(i));
			}
		}

	}
	
	public void printOutTags() {

		LOG.debug("Token List is " + this.wordTokenList);
		for (int i = 0; i < wordTokenList.size(); i++) {
			LOG.info("WORD:" + wordTokenList.get(i));
			LOG.info("\t>>OSCAR TAG: " + oscarTagList.get(i).POS);
			LOG.info("\t>>REGEX TAG: " + regexTagList.get(i).POS);
			LOG.info("\t>>OPENNLP TAG: " + brownTagList.get(i).POS);
			LOG.info("\t>>COMBINED TAG: " + combinedTagsList.get(i).POS);

		}

	}

	




}
