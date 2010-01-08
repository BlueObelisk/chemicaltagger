package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.List;

import org.apache.log4j.Logger;

import opennlp.tools.lang.english.PosTagger;
import opennlp.tools.postag.POSDictionary;

public class OpenNLPTagger {
	private final Logger LOG = Logger.getLogger(OscarTagger.class);

	/****************************
	 * Public Constructor
	 ***************************/
	public OpenNLPTagger() {
	}

	

	/*****************************************************
	 * Runs the OpenNLP brown tagger against the text and stores the tags in
	 * POSContainer
	 *****************************************************/
	public POSContainer runTagger(POSContainer posContainer) {
		POSDictionary tagDict;
		String[] tags = null;
		List<String> tokenList = posContainer.getTokenList();

		String[] token = new String[tokenList.size()];
		for (int i = 0; i < tokenList.size(); i++) {
			token[i] = tokenList.get(i);
		}
		try {

			// TODO this needs jar-ifying
			tagDict = new POSDictionary(
					"src/main/resources/openNlpResources/tagdict");
			PosTagger posTagger = new PosTagger(
					"src/main/resources/openNlpResources/tag.bin", tagDict);

			tags = posTagger.tag(token);
			posContainer.addToBrownListFromStringArray(tags);

		} catch (Exception e) {
			LOG.error("Exception " + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return posContainer;

	}



}
