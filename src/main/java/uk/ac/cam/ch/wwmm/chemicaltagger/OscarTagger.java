package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nu.xom.Element;
import uk.ac.cam.ch.wwmm.oscar.Oscar;
import uk.ac.cam.ch.wwmm.oscar.chemnamedict.core.PolymerDictionary;
import uk.ac.cam.ch.wwmm.oscar.document.IToken;
import uk.ac.cam.ch.wwmm.oscar.document.ITokenSequence;
import uk.ac.cam.ch.wwmm.oscar.document.NamedEntity;
import uk.ac.cam.ch.wwmm.oscar.opsin.OpsinDictionary;
import uk.ac.cam.ch.wwmm.oscardata.DataAnnotation;
import uk.ac.cam.ch.wwmm.oscardata.DataParser;

/*****************************************************
 * Runs the OSCAR tagger .
 * 
 * @author lh359, dmj30,jat45
 *****************************************************/

public class OscarTagger {

	private Oscar oscar;

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
			oscar.getDictionaryRegistry().register(new OpsinDictionary());
			oscar.getDictionaryRegistry().register(new PolymerDictionary());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*****************************************************
	 * Main Function. Runs OSCAR over a string and process the XML output Stores
	 * the tokens and tags to the POSContainer class which is returned
	 * 
	 * @author dmj30, lh359
	 *****************************************************/
	public POSContainer runTagger(POSContainer posContainer) {

		List<NamedEntity> neList = new ArrayList<NamedEntity>();
		List<ITokenSequence> tokens = new ArrayList<ITokenSequence>();
		try {

			String sentence = posContainer.getInputText();
			sentence = oscar.normalize(sentence);
			
			tokens = oscar.tokenize(sentence);
			
			neList = oscar.recognizeNamedEntities(tokens);
		} catch (Exception e) {
			e.printStackTrace();
		}

		neList = removePartialMatches(neList);

		String word = "";
		String tag = "nil";
		int endIndex = -1;
		for (ITokenSequence tokenSequence : tokens) {
			for (IToken tok : tokenSequence.getTokens()) {

				if (tok.getStart() >= endIndex) {
					word = tok.getSurface();
					endIndex = tok.getEnd();
					tag = "nil";

					boolean foundNE = false;
					for (NamedEntity ne : neList) {
						if (ne.getStart() == tok.getStart()) {
							if (ne.getEnd() >= tok.getEnd()) {
								word = ne.getSurface();
								tag = ne.getType().getName();
								foundNE = true;
								endIndex = ne.getEnd();
								for (String subWord : word.split(" ")) {
									posContainer.addToTokenList(subWord);
									posContainer.addToOSCARList(tag);
								}

							}
						}
					}
					if (!foundNE) {

						posContainer.addToTokenList(word);
						posContainer.addToOSCARList(tag);
					}
				}
			}
		}
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
