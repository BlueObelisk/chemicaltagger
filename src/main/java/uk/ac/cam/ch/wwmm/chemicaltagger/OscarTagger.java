package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import uk.ac.cam.ch.wwmm.oscar.Oscar;
import uk.ac.cam.ch.wwmm.oscar.document.IToken;
import uk.ac.cam.ch.wwmm.oscar.document.NamedEntity;

/*****************************************************
 * Runs the OSCAR tagger .
 * 
 * @author lh359, dmj30
 *****************************************************/

public class OscarTagger {

	private Oscar oscar;

	/*****************************
	 * Default constructor method.
	 ***************************/
	public OscarTagger(Oscar oscar) {
		this.oscar = oscar;

	}

	/***********************************************
	 * Runs OSCAR over a list of tokens.
	 * 
	 * @param posContainer
	 *            (POSContainer)
	 * @return posContainer (POSContainer)
	 ***********************************************/
	public POSContainer runTagger(POSContainer posContainer) {

		List<NamedEntity> neList = oscar.recogniseNamedEntities(posContainer.getTokenSequenceList());
        List<String> ignoreOscarList = Arrays.asList(new String[]{"cpr", "ont"});
		List<String> tokenList = posContainer.getWordTokenList();
		List<String> oscarList = new ArrayList<String>();
		String tag = "nil";
		for (int i = 0; i < tokenList.size(); i++) {
			oscarList.add(tag);
		}
		for (NamedEntity ne : neList) {
			if (!ignoreOscarList.contains(ne.getType().getName().toLowerCase())) {
				List<IToken> tokens = ne.getTokens();
                 
				for (IToken iToken : tokens) {
						if (tokenList.get(iToken.getId()).contains(iToken.getSurface())) {
							oscarList.set(iToken.getId(), "OSCAR-"+ne.getType().getName());
						}
					}
				
			}
		}
		posContainer.setOscarTagList(oscarList);
		return posContainer;

	}
}
