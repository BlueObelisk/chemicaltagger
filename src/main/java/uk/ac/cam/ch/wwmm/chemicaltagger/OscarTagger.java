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
 * @author lh359, dmj30,jat45
 *****************************************************/

public class OscarTagger {

	private Oscar oscar ;
	private List<ITokenSequence> tokens;

	/****************************
	 * Public Constructor
	 ***************************/
	public OscarTagger() {
		initialiseOSCAR();

	}

	/*****************************************************
	 * Creates the OSCAR workspace Taken from the Spectra-T textmining modules
	 * 
	 * @author jat45
	 *****************************************************/
	private void initialiseOSCAR() {

		try {
			oscar = new Oscar();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			oscar.getDictionaryRegistry().register(new PolymerDictionary());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public POSContainer runTokeniser(POSContainer posContainer) {
		tokens = new ArrayList<ITokenSequence>();
		String sentence = posContainer.getInputText();
		sentence = oscar.normalize(sentence);
		tokens = oscar.tokenise(sentence);
		for (ITokenSequence tokenSequence : tokens) {
			for (IToken tok : tokenSequence.getTokens()) {

				for (String subWord : tok.getSurface().trim().split(" ")) {
					if (StringUtils.isNotEmpty(subWord))
						posContainer.addToTokenList(subWord);
				}
			}
		}
		return posContainer;
	}

	

	/*****************************************************
	 * Main Function. Runs OSCAR over a string and process the XML output Stores
	 * the tokens and tags to the POSContainer class which is returned
	 * 
	 * @author dmj30, lh359
	 *****************************************************/
	public POSContainer runTagger(POSContainer posContainer) {

		List<NamedEntity> neList = new ArrayList<NamedEntity>();

		neList = oscar.recogniseNamedEntities(tokens);

		neList = removePartialMatches(neList);

		List<String> tokenList = posContainer.getTokenList();
		List<WWMMTag> oscarList = new ArrayList<WWMMTag>();

		String tag = "nil";
		for (int i = 0; i < tokenList.size(); i++) {
			oscarList.add(new WWMMTag(tag));
		}
		for (NamedEntity ne : neList) {
			if (!ne.getType().getName().toLowerCase().contains("cpr") && !ne.getType().getName().toLowerCase().contains("ont")) {
				List<IToken> tokens = ne.getTokens();

				for (IToken iToken : tokens) {
					if (tokenList.contains(iToken.getSurface())) {

						if (tokenList.get(iToken.getId()).contains(
								iToken.getSurface())) {
							oscarList.set(iToken.getId(), new WWMMTag("OSCAR-"
									+ ne.getType().getName()));
						}
					}
				}

			}
		}
		posContainer.setOscarTagList(oscarList);
		return posContainer;

	}

	private List<NamedEntity> removePartialMatches(List<NamedEntity> neList) {
		List<NamedEntity> newNeList = new ArrayList<NamedEntity>();

		for (NamedEntity namedEntity : neList) {
			boolean isPartial = false;
			boolean isCM = false;
			int start = namedEntity.getStart();
			int end = namedEntity.getEnd();
			for (NamedEntity otherNamedEntity : neList) {
				if (otherNamedEntity.getStart() == start) {
					if (otherNamedEntity.getEnd() > end) {
						isPartial = true;
					}
					if (otherNamedEntity.getType().getName().contains("CM")
							& !namedEntity.getType().getName().contains("CM"))
						isCM = true;

				}
				if (otherNamedEntity.getEnd() == end) {

					if (otherNamedEntity.getStart() < start) {
						isPartial = true;
					}

				}
			}
			if (!isPartial & !isCM) {
				newNeList.add(namedEntity);
			}
		}

		return newNeList;
	}

}
