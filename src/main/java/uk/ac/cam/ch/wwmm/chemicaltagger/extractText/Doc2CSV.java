package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Doc2CSV {

	private final static String referencesFilePath = "references.csv";
	private final static String patentInfoFilePath = "patentInfo.csv";
	private final static String abbreviationFilePath = "abbreviations.csv";
	private final static String csvDelimiter = "\t";
	private final static String csvEOFDelimiter = "\n";
	private FileWriter abbreviationWriter;
	private FileWriter patentInfoWriter;
	private FileWriter referencesWriter;

	public void writeDocsToCSV(List<DocumentContainer> docContainerList) {
		initialiseReferencesWriter();
		initialisePatentInfoWriter();
		initialiseAbbreviationWriter();

		for (DocumentContainer docContainer : docContainerList){
			fillReferenceWriter(docContainer);
		fillPatentInfoWriter(docContainer);
		try {
			fillAbbreviationWriter(docContainer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	private void fillPatentInfoWriter(DocumentContainer docContainer) {

		
	}

	private void fillAbbreviationWriter(DocumentContainer docContainer)
			throws IOException {
		String regexString = "[A-Z]+[a-z]*\\.";
		String content = docContainer.getContent();
        Pattern pattern = Pattern.compile(regexString);
		List<NonPatentReferenceContainer> nonPatentList = docContainer
				.getNonPatentRefContainerList();
		
		
		for (NonPatentReferenceContainer nonPatentReferenceContainer : nonPatentList) {
			String journalName = nonPatentReferenceContainer.getSerTitle();
			Matcher myMatcher = pattern.matcher(journalName);

			while (myMatcher.find()) {
				System.err.println(myMatcher.group(0));
				abbreviationWriter.append(myMatcher.group(0) + csvEOFDelimiter);
				abbreviationWriter.flush();
			}

		}
		Matcher myMatcher = pattern.matcher(content);

		while (myMatcher.find()) {
			System.err.println(myMatcher.group(0));
			abbreviationWriter.append(myMatcher.group(0) + csvEOFDelimiter);
			abbreviationWriter.flush();
		}
		
		
	}

	private void fillReferenceWriter(DocumentContainer docContainer) {
		// TODO Auto-generated method stub

	}

	private void initialiseAbbreviationWriter() {
		abbreviationWriter = null;
		StringBuilder abbreviationColumnHeadings = new StringBuilder();
		abbreviationColumnHeadings.append("Abbreviation\n");

		try {
			abbreviationWriter = new FileWriter(abbreviationFilePath);
			abbreviationWriter.append(abbreviationColumnHeadings);
			abbreviationWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void initialisePatentInfoWriter() {
		patentInfoWriter = null;
		StringBuilder patentInfoColumnHeadings = new StringBuilder();
		String Inventor = "Inventor";
		String InventorCountry = "InventorCountry";
		String Grantee = "Grantee";
		String GranteeCountry = "InventorCountry";
		String Attorney = "Grantee";
		String AttorneyCountry = "InventorCountry";

		patentInfoColumnHeadings.append("Patent_ID\tRef_PatentNumber\tDate\t");

		for (int i = 1; i < 3; i++) {
			patentInfoColumnHeadings.append(Inventor + i + csvDelimiter
					+ InventorCountry + i + csvDelimiter);
		}

		for (int i = 1; i < 3; i++) {
			patentInfoColumnHeadings.append(Grantee + i + csvDelimiter
					+ GranteeCountry + i + csvDelimiter);
		}

		patentInfoColumnHeadings.append(Attorney + csvDelimiter
				+ AttorneyCountry + csvDelimiter);
		patentInfoColumnHeadings.append(csvEOFDelimiter);
		try {

			patentInfoWriter = new FileWriter(patentInfoFilePath);
			patentInfoWriter.append(patentInfoColumnHeadings);
			patentInfoWriter.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void initialiseReferencesWriter() {
		referencesWriter = null;
		String referencesColumnHeadings = "Patent_ID\tRef_PatentNumber\tJournal_Name\tArticle_Name\tDate\t";
		String Author = "Author";
		for (int i = 1; i < 10; i++) {
			referencesColumnHeadings = referencesColumnHeadings + Author + i
					+ csvDelimiter;
		}
		referencesColumnHeadings = referencesColumnHeadings + csvEOFDelimiter;
		try {

			referencesWriter = new FileWriter(referencesFilePath);
			referencesWriter.append(referencesColumnHeadings);
			referencesWriter.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
