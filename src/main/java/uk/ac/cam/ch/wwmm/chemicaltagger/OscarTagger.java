package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import uk.ac.cam.ch.wwmm.oscar.Oscar;
import uk.ac.cam.ch.wwmm.oscar.chemnamedict.core.PolymerDictionary;
import uk.ac.cam.ch.wwmm.oscar.document.IToken;
import uk.ac.cam.ch.wwmm.oscar.document.ITokenSequence;
import uk.ac.cam.ch.wwmm.oscar.document.NamedEntity;

/*****************************************************
 * Runs the OSCAR tagger .
 * 
 * @author lh359, dmj30
 *****************************************************/

public class OscarTagger {

	private Oscar oscar;
	private List<ITokenSequence> tokens;

	/*****************************
	 * Default constructor method.
	 ***************************/
	public OscarTagger() {
		initialiseOSCAR();

	}

	/*****************************************************
	 * Initialises OSCAR.
	 *****************************************************/
	private void initialiseOSCAR() {
		oscar = new Oscar();
		oscar.getDictionaryRegistry().register(new PolymerDictionary());

	}

	/*****************************************************
	 * Tokenises an inputText using OSCAR tokeniser. 
	 * TODO pull the tokeniser
	 * into a separate class
	 * @param  posContainer (POSContainer)
	 * @return posContainer (POSContainer)
	 *****************************************************/
	public POSContainer runTokeniser(POSContainer posContainer) {
		tokens = new ArrayList<ITokenSequence>();
		String sentence = posContainer.getInputText();
		//TODO oscar.normalise isn't implemented yet!
//		sentence = oscar.normalise(sentence);
		tokens = oscar.tokenise(sentence);
		for (ITokenSequence tokenSequence : tokens) {
			for (IToken tok : tokenSequence.getTokens()) {
				// add back apostrophes' if cut-off from the previous word
				if (tok.getSurface().equals("\"")) {
					int lastIndex = posContainer.getWordTokenList().size() - 1;
					String previousWord = posContainer.getWordTokenList().get(
							lastIndex);
					posContainer.getWordTokenList().set(lastIndex,
							previousWord + "\"");
				} else {
					for (String subWord : tok.getSurface().trim().split(" ")) {
						if (StringUtils.isNotEmpty(subWord))
							posContainer.addToTokenList(subWord);
					}
				}
			}
		}
		return posContainer;
	}

	/***********************************************
	 * Runs OSCAR over a list of tokens.
	 * 
	 * @param  posContainer (POSContainer)
	 * @return posContainer (POSContainer)
	 ***********************************************/
	public POSContainer runTagger(POSContainer posContainer) {

		List<NamedEntity> neList = new ArrayList<NamedEntity>();

		neList = oscar.recogniseNamedEntities(tokens);

		List<String> tokenList = posContainer.getWordTokenList();
		List<String> oscarList = new ArrayList<String>();

		String tag = "nil";
		for (int i = 0; i < tokenList.size(); i++) {
			oscarList.add(tag);
		}
		for (NamedEntity ne : neList) {
			if (!ne.getType().getName().toLowerCase().contains("cpr")
					&& !ne.getType().getName().toLowerCase().contains("ont")) {
				List<IToken> tokens = ne.getTokens();

				for (IToken iToken : tokens) {
					if (tokenList.contains(iToken.getSurface()) & !iToken.getSurface().contains("\u00B0")) {

						if (tokenList.get(iToken.getId()).contains(
								iToken.getSurface())) {
							oscarList.set(iToken.getId(), "OSCAR-"+ne.getType().getName());
						}
					}
				}

			}
		}
		posContainer.setOscarTagList(oscarList);
		return posContainer;

	}

}
