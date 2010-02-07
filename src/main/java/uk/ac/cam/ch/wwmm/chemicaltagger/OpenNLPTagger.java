package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.List;

import opennlp.tools.lang.english.PosTagger;
import opennlp.tools.postag.POSDictionary;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

public class OpenNLPTagger {

	private static File tempFile;
	
	static {
		 try {
			//the constructor only takes a file path, so we copy it to temp in case
			//the code is running from a jar
			//openNlp throws a weird NumberFormatException if the temp file name doesn't end in .bin (!)			
			tempFile = File.createTempFile("tag", ".bin");
			tempFile.deleteOnExit();
			//TODO ensure temp files are properly deleted
			InputStream is = ClassLoader.getSystemResourceAsStream("openNlpResources/tag.bin");
			OutputStream os = new FileOutputStream(tempFile);
			IOUtils.copy(is, os);
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
			InputStreamReader tagDictReader = new InputStreamReader(
					ClassLoader.getSystemResourceAsStream("openNlpResources/tagdict"), "UTF-8");
			tagDict = new POSDictionary(new BufferedReader(tagDictReader), true);
			PosTagger posTagger = new PosTagger(tempFile.getCanonicalPath(), tagDict);
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
