package uk.ac.cam.ch.wwmm.chemicaltagger;

import nu.xom.Document;
import nu.xom.Nodes;

public class ParsedDocumentStatistics {

	public static int getSentenceCount(Document parsedDoc) {
		return getCount(parsedDoc, "Sentence");
	}

	public static int getPrepPhraseCount(Document parsedDoc) {
		return getCount(parsedDoc, "PrepPhrase");
	}

	public static int getDissolvePhraseCount(Document parsedDoc) {
		return getCount(parsedDoc, "DissolvePhrase");
	}

	private static int getCount(Document parsedDoc, String element) {
		Nodes nodes = parsedDoc.query("//" + element);
		return nodes.size();
	}
	
}
