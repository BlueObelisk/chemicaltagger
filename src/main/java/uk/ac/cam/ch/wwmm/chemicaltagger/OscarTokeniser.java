package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import uk.ac.cam.ch.wwmm.oscar.Oscar;
import uk.ac.cam.ch.wwmm.oscar.document.Token;
import uk.ac.cam.ch.wwmm.oscar.document.TokenSequence;

public class OscarTokeniser {

	Oscar oscar;

	public OscarTokeniser(Oscar oscar) {
		this.oscar = oscar;
	}

	/*****************************************************
	 * Tokenises an inputText using OSCAR tokeniser. 
	 * Sets the tokens to POSContainer's wordTokenList and
	 * tokenSequenceList.
	 * @param posContainer
	 *            (POSContainer)
	 * @return posContainer (POSContainer)
	 *****************************************************/
	public POSContainer tokenise(POSContainer posContainer) {
		List<TokenSequence> tokSequenceList = new ArrayList<TokenSequence>();
		List<String> wordTokenList = new ArrayList<String>();
		String sentence = posContainer.getInputText();
		// Oscar doesn't do normalisation just yet
		// sentence = oscar.normalise(sentence);

		tokSequenceList = oscar.tokenise(sentence);
		for (TokenSequence tokenSequence : tokSequenceList) {
			for (Token token : tokenSequence.getTokens()) {

				for (String subWord : token.getSurface().trim().split(" ")) {
					if (StringUtils.isNotEmpty(subWord))
						wordTokenList.add(subWord);
				}

			}
		}
		posContainer.setTokenSequenceList(tokSequenceList);
		posContainer.setWordTokenList(wordTokenList);
		return posContainer;
	}

}
