package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Nodes;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.apache.log4j.Logger;

public class ExtractSentences {

	List<PhraseContainer> PhraseContainerList = new ArrayList<PhraseContainer>();
	private final Logger LOG = Logger.getLogger(ExtractSentences.class);
	private String filename = "";

	public ExtractSentences() {
		PhraseContainerList = new ArrayList<PhraseContainer>();
	}

	public List<PhraseContainer> getsSubPhrase(String subPhrase, Document doc) {

		List<PhraseContainer> subPhraseList = new ArrayList<PhraseContainer>();
		Nodes subPhrases = doc.query("//" + subPhrase);

		for (int i = 0; i < subPhrases.size(); i++) {
			PhraseContainer phraseContainer = new PhraseContainer();
			Element subPhraseNode = (Element) subPhrases.get(i);
			String tagToken = getTagToken(subPhraseNode);
			phraseContainer.setFilename(filename);
			phraseContainer.setPhraseName(subPhrase);
			phraseContainer.setPhrase(tagToken);
			subPhraseList.add(phraseContainer);
		}
		return subPhraseList;
	}

	private String getTagToken(Element subPhraseNode) {

		StringBuilder tagToken = new StringBuilder();
		for (int i = 0; i < subPhraseNode.getChildElements().size(); i++) {
			Element sub = (Element) subPhraseNode.getChild(i);
			if (sub.getChildCount() > 1) {
				tagToken.append(getTagToken(sub));
			}
			if (hasMoreChildren(sub)) {
				tagToken.append(getTagToken(sub));
			} else {

				tagToken.append(sub.getLocalName() + " ");
				tagToken.append(sub.getValue() + " ");
			}
		}

		return tagToken.toString();
	}

	private boolean hasMoreChildren(Element sub) {
		// TODO Auto-generated method stub

		if (sub.getChild(0).getChildCount() > 0) {
			return true;
		}
		return false;
	}

	public List<PhraseContainer> getPhrases(Document doc) {

		Nodes sentenceNodes = doc.query("//ActionPhrase");

		List<PhraseContainer> PhraseList = new ArrayList<PhraseContainer>();

		for (int i = 0; i < sentenceNodes.size(); i++) {
			PhraseContainer phraseContainer = new PhraseContainer();
			Element sentenceNode = (Element) sentenceNodes.get(i);
			String tagToken = getTagToken(sentenceNode);
			phraseContainer.setFilename(filename);

			phraseContainer.setPhraseName(sentenceNode.getAttribute("type")
					.getValue());
			phraseContainer.setPhrase(tagToken);
			PhraseList.add(phraseContainer);
		}

		return PhraseList;
	}

	public void extract(String sourceFile) throws ValidityException,
			ParsingException, IOException {
		Builder builder = new Builder();
		Document doc = null;
		LOG.info("Extracting data from " + sourceFile);
		filename = sourceFile;
		doc = builder.build(sourceFile);

		PhraseContainerList.addAll(getPhrases(doc));
	}

	public void extracts(String sourceFile) throws ValidityException,
			ParsingException, IOException {

		Builder builder = new Builder();
		Document doc = null;
		LOG.info("Extracting data from " + sourceFile);
		filename = sourceFile;
		doc = builder.build(sourceFile);
		PhraseContainerList.addAll(getsSubPhrase("MASS", doc));
		PhraseContainerList.addAll(getsSubPhrase("PERCENT", doc));
		PhraseContainerList.addAll(getsSubPhrase("VOLUME", doc));
		PhraseContainerList.addAll(getsSubPhrase("MOLAR", doc));
		PhraseContainerList.addAll(getsSubPhrase("QUANTITY", doc));
		PhraseContainerList.addAll(getsSubPhrase("MOLECULE", doc));
		PhraseContainerList.addAll(getsSubPhrase("APPARATUS", doc));
		PhraseContainerList.addAll(getsSubPhrase("UNNAMEDMOLECULE", doc));
		PhraseContainerList.addAll(getsSubPhrase("MIXTURE", doc));

		PhraseContainerList.addAll(getsSubPhrase("TempPhrase", doc));
		PhraseContainerList.addAll(getsSubPhrase("AtmospherePhrase", doc));
		PhraseContainerList.addAll(getsSubPhrase("TimePhrase", doc));

	}

	public void writeToCSV(String file) throws Exception {
		String DELIM = "\t";
		String ENDLINE = "\n";

		FileWriter phrasesCSV = new FileWriter(file + ".csv");
		phrasesCSV.append("PhraseName" + DELIM + "Phrase" + DELIM + "Filename"
				+ ENDLINE);
		phrasesCSV.flush();

		for (PhraseContainer phraseContainer : PhraseContainerList) {
			phrasesCSV.write(phraseContainer.getPhraseName() + DELIM
					+ phraseContainer.getPhrase() + DELIM
					+ phraseContainer.getFilename() + ENDLINE);
			phrasesCSV.flush();
		}
	}

	public static void main(String[] args) throws Exception {

		// String path =
		// "target/ACTA-f-00fc0883-2a3c-449a-ba6d-097161582823.xml";
		String path = "target/";
		File patentDirectory = new File(path);
		String[] patentDir = patentDirectory.list();
		ExtractSentences extractSentence = new ExtractSentences();
		for (String file : patentDir) {
			if (file.startsWith("ACTA")) {

				extractSentence.extracts(path + file);

			}

		}
		extractSentence.writeToCSV("SubPhrases");
	}
}
