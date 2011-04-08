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

/*****************************************************
 * Runs the OpenNLP tagger .
 * 
 * @author lh359, dmj30,jat45
 *****************************************************/
public class OpenNLPTagger {
	/**************************************
	 * Private Singleton holder.
	 ***************************************/
	private static class INSTANCE_HOLDER {
		private static OpenNLPTagger myInstance = new OpenNLPTagger();
	}

	private File tempFile;
	private PosTagger posTagger;
	private static Logger LOG = Logger.getLogger(OscarTagger.class);

	/**************************************
	 * Private Constructor Class.
	 ***************************************/
	private OpenNLPTagger() {
		try {
			setUpTagDict();
			setUpPosTagger();
		} catch (IOException e) {
			LOG.error("Exception " + e.getMessage());
			throw new RuntimeException("Failed to initialise PosTagger", e);
		}
	}

	/**************************************
	 * Returns an OpenNLPTagger singleton.
	 * @return OpenNLPTaggerInstance.
	 ***************************************/
	public static OpenNLPTagger getInstance() {
		return INSTANCE_HOLDER.myInstance;
	}

	/**************************************
	 * Getter method for posTagger.
	 * 
	 * @return posTagger(PosTagger).
	 ***************************************/
	public PosTagger getTagger() {
		return posTagger;
	}


    /**************************************
     * Copies the tagDict to a temporary location.
     * Workaround method because the POSTagger 
     * constructor only takes a filepath.
     ***************************************/
    private void setUpTagDict() {
            try {
                    
                    // openNlp throws a weird NumberFormatException if the temp file
                    // name doesn't end in .bin (!)
                    tempFile = File.createTempFile("tag", ".bin");
                    tempFile.deleteOnExit();
                    InputStream is = getClass().getClassLoader().getResourceAsStream(
                                    "uk/ac/cam/ch/wwmm/chemicaltagger/openNLPTagger/tag.bin");
                    OutputStream os = new FileOutputStream(tempFile);
                    IOUtils.copy(is, os);
            } catch (IOException e) {
                    LOG.error("Exception " + e.getMessage());
                    e.printStackTrace();
            }
    }
    
    /**************************************
     * Loads the Penn Treebank tagset to POSTagger.
	 * @throws IOException
	 * ***************************************/
	private void setUpPosTagger() throws IOException {
		InputStreamReader tagDictReader = null;
		InputStream in = Utils.getInputStream(getClass(),"/uk/ac/cam/ch/wwmm/chemicaltagger/openNLPTagger/tagdict");
		tagDictReader = new InputStreamReader(in);
		POSDictionary tagDict = new POSDictionary(new BufferedReader(tagDictReader), true);
		posTagger = new PosTagger(tempFile.getCanonicalPath(), tagDict);
	}

	/*****************************************************
	 * Runs the OpenNLP POS tagger against the text and stores the tags in
	 * POSContainer.
	 * @param posContainer (POSContainer)
	 * @return posContainer (POSContainer) 
	 *****************************************************/
	public POSContainer runTagger(POSContainer posContainer) {
		List<String> tokenList = posContainer.getWordTokenList();
		String[] tokens = new String[tokenList.size()];
		for (int i = 0; i < tokenList.size(); i++) {
			tokens[i] = tokenList.get(i);
		}
		String[] tags = posTagger.tag(tokens);
		posContainer.createPosTagListFromStringArray(tags);
		return posContainer;
	}

}
