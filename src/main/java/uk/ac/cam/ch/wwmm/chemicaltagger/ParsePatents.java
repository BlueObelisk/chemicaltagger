package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import uk.ac.cam.ch.wwmm.chemicaltagger.extractText.DocumentContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.extractText.ExtractFromPatent;

public class ParsePatents {

	public ParsePatents() {
	}

	public static void main(String[] args) {
		List<DocumentContainer> docs = new ArrayList<DocumentContainer>();
		String path = "src/test/resources/patents/";
		 
		File patentDirectory = new File(path);
		String[] patentDir = patentDirectory.list();
		String outputDir = "target/patentsXML/";
		InputStream taggedInputStream = null;
		if (!new File(outputDir).exists()) {
			new File(outputDir).mkdir();
		}
		for (String file : patentDir) {

			String resourcePath = path + file;
			/************************
			 * Get text from Patent
			 ************************/
			ExtractFromPatent extract = new ExtractFromPatent();
			DocumentContainer docContainer = extract.getContent(resourcePath);
			String patentContent = docContainer.getContent();
			/************************
			 * Get Parts of Speech
			 ************************/
			POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(patentContent);
			docContainer.setTaggedContent(posContainer
					.getTokenTagTupleAsString());
			docs.add(docContainer);

			/*********************************
			 * Create output file from ID Create inputstream from content
			 *********************************/
			String outputXMLFilename = outputDir + docContainer.getId().trim()
					+ ".xml";

			try {
				taggedInputStream = new ByteArrayInputStream(docContainer
						.getTaggedContent().getBytes());

			} catch (Exception e) {
				System.err.println("exception " + e.getMessage());
			}

			ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
					taggedInputStream);
			chemistrySentenceParser.parseTagsToXMLFile(outputXMLFilename);

		}
	}
}