package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import opennlp.tools.cmdline.postag.POSModelLoader;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTagger;
import opennlp.tools.postag.POSTaggerME;

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
	POSTagger posTagger;
	private static Logger LOG = Logger.getLogger(OpenNLPTagger.class);

	/**************************************
	 * Private Constructor Class.
	 ***************************************/
	private OpenNLPTagger() {

		
		try {
			setUpPosTagger();
		} catch (IOException e) {
			e.printStackTrace();
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
	public POSTagger getTagger() {
		return posTagger;
	}



    
    /**************************************
     * Loads the Penn Treebank tagset to POSTagger.
	 * @throws IOException
	 * ***************************************/
	private void setUpPosTagger() throws IOException {
        InputStream is = getClass().getClassLoader().getResourceAsStream(
        "uk/ac/cam/ch/wwmm/chemicaltagger/openNLPTagger/en-pos-maxent.bin");
        POSModel model = new POSModel(is);
		posTagger = new POSTaggerME(model);
	}

	/*****************************************************
	 * Runs the OpenNLP POS tagger against the text and stores the tags in
	 * POSContainer.
	 * @param posContainer (POSContainer)
	 * @return posContainer (POSContainer) 
	 *****************************************************/
	public POSContainer runTagger(POSContainer posContainer) {
		List<String> tokenList = posContainer.getWordTokenList();
		String[] tokens = tokenList.toArray(new String[tokenList.size()]);
		String[] tags = posTagger.tag(tokens);
		posContainer.createPosTagListFromStringArray(tags);
		return posContainer;
	}

}
