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

	private static final class INSTANCE_HOLDER {
		private static OpenNLPTagger myInstance = new OpenNLPTagger();
	}
	
	private File tempFile;
	private PosTagger posTagger;
	
	private final Logger LOG = Logger.getLogger(OscarTagger.class);

	private OpenNLPTagger() {
		setUpTagDict();
		try {
			setUpPosTagger();
		} catch (IOException e) {
			LOG.error("Exception " + e.getMessage());
			throw new RuntimeException("failed to initialise PosTagger", e);
		}
	}

	
	private void setUpTagDict() {
		try {
			//the constructor for PosTagger only takes a file path, so we copy it to temp in case
			//the code is running from a jar
			//openNlp throws a weird NumberFormatException if the temp file name doesn't end in .bin (!)			
			tempFile = File.createTempFile("tag", ".bin");
			tempFile.deleteOnExit();
			//TODO ensure temp files are properly deleted
			InputStream is = getClass().getClassLoader().getResourceAsStream("openNlpResources/tag.bin");
			OutputStream os = new FileOutputStream(tempFile);
			IOUtils.copy(is, os);
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			 LOG.error("Exception " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void setUpPosTagger() throws IOException {
		InputStreamReader tagDictReader = null;
		try {
			new Utils();
			tagDictReader = new InputStreamReader(Utils.getInputStream(getClass(), "/openNlpResources/tagdict"));
//			       Util.getResourceUsingContextClassLoader(
//			    		   "openNlpResources/tagdict", this.getClass()), "UTF-8");
		} catch (Exception e) {
				throw new RuntimeException("openNlpResources/tagdict" , e);
		}
		POSDictionary tagDict = new POSDictionary(new BufferedReader(tagDictReader), true);
		posTagger = new PosTagger(tempFile.getCanonicalPath(), tagDict);
	}
	
	

	/*****************************************************
	 * Runs the OpenNLP brown tagger against the text and stores the tags in
	 * POSContainer
	 *****************************************************/
	public POSContainer runTagger(POSContainer posContainer) {
		List<String> tokenList = posContainer.getTokenList();
		String[] tokens = new String[tokenList.size()];
		for (int i = 0; i < tokenList.size(); i++) {
			tokens[i] = tokenList.get(i);
		}
		
		String[] tags = posTagger.tag(tokens);
		posContainer.addToBrownListFromStringArray(tags);

		return posContainer;
	}



	public static OpenNLPTagger getInstance() {
		return INSTANCE_HOLDER.myInstance;
	}



	public PosTagger getTagger() {
		return posTagger;
	}


}
