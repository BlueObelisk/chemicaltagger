/**
 * Copyright 2012 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTagger;
import opennlp.tools.postag.POSTaggerME;
import uk.ac.cam.ch.wwmm.oscar.document.Token;

/*****************************************************
 * Runs the OpenNLP tagger .
 * 
 * @author lh359, dmj30,jat45
 *****************************************************/
public class OpenNLPTagger implements Tagger{
	/**************************************
	 * Private Singleton holder.
	 ***************************************/
	private static class INSTANCE_HOLDER {
		private static OpenNLPTagger myInstance = new OpenNLPTagger();
	}
	POSTagger posTagger;

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
	 * Runs the OpenNLP POS tagger against a list of tokens and returns a list of tags
	 * @param tokenList (List<Token>)
	 * @param inputSentence (String)
	 * @return tagList (List<String>) 
	 *****************************************************/
	public List<String> runTagger(List<Token> tokenList, String inputSentence) {
		String[] tokens = new String[tokenList.size()];
		for (int i = 0; i < tokens.length; i++) {
			tokens[i] = tokenList.get(i).getSurface();
		}
		String[] tags = posTagger.tag(tokens);
		List<String> tagList = createPosTagListFromStringArray(tags);
		return tagList;
	}


	/**************************************
	 * Creates the posTagList from the openNLP string Array format.
	 * 
	 * @param posTags (String[])
	 ***************************************/
	public List<String> createPosTagListFromStringArray(String[] posTags) {
		List<String> posTagList = new ArrayList<String>();
		for (String posTag : posTags) {
			if (StringUtils.isEmpty(posTag)) {
				posTagList.add("NN");
			} else if (posTag.equals(".")) {
				posTagList.add("STOP");
			} else if (posTag.equals(",")) {
				posTagList.add("COMMA");
			} else if (posTag.equals(":")) {
				posTagList.add("COLON");
			} else if (posTag.equals("#")) {
				posTagList.add("NN");
			} else if (posTag.equals("``")) {
				posTagList.add("FW");
			} else if (posTag.equals("$")) {//used for currency symbols
				posTagList.add("FW");
			} else {
				posTagList.add(posTag);
			}
		}
		return posTagList;
	}

	public List<String> getIgnoredTags() {
		return null;
	}
}
