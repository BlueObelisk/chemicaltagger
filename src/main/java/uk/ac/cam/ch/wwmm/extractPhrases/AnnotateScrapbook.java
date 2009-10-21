package uk.ac.cam.ch.wwmm.extractPhrases;

import java.io.File;
import java.io.FileOutputStream;
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

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class AnnotateScrapbook {

	private final Logger LOG = Logger.getLogger(AnnotateScrapbook.class);
	private ChemistryPOSTagger posTag;

	public AnnotateScrapbook() {
		posTag = new ChemistryPOSTagger();

	}

	public String getContent(String sourceFile) throws ValidityException,
			ParsingException, IOException {
		Builder builder = new Builder();
		Document doc = builder.build(sourceFile);
		Nodes sections = doc.query("//HEADER");

		String phrase = "";
		String word = "";
		for (int i = 0; i < sections.size(); i++) {

			Element e = (Element) sections.get(i);
			String[] values = e.getValue().split("\t");
			for (String wordValue : values) {
				if (!StringUtils.isEmpty(wordValue)) {
					word = word + " " + wordValue.trim();
				}

			}
			if (!StringUtils.isEmpty(phrase.trim())) {
				phrase = phrase.trim() + " ; " + word.trim();
			} else {
				phrase = word.trim();
			}

			word = "";
		}

		return phrase.trim();
	}

	public List getContentFromScrapbook(String scrapbookFile)
			throws ValidityException, ParsingException, IOException {
		Builder builder = new Builder();
		Document doc = builder.build(scrapbookFile);
		Nodes neSections = doc.query("//ne");
		List treeList = new ArrayList<String>();
		String phrase = "";
		String word = "";
		for (int i = 0; i < neSections.size(); i++) {
			word = "";
			phrase = "";
			Element e = (Element) neSections.get(i);
			String treeName = e.getAttributeValue("type").toString();
			String[] values = e.getValue().split("\\s");
			for (String wordValue : values) {
				if (!StringUtils.isEmpty(wordValue) && wordValue.trim() != ";") {

					word = word + " " + wordValue.trim();
				}

			}
			phrase = word.trim();
			treeList.add(treeName + ";" + phrase);
			word = "";
			phrase = "";
		}

		return treeList;
	}

	public String getContentFromPatent(String sourceFile)
			throws ValidityException, ParsingException, IOException {
		Builder builder = new Builder();
		Document doc = builder.build(sourceFile);
		Nodes sections = doc.query("//heading | //p");

		String phrase = "";
		String word = "";
		for (int i = 0; i < sections.size(); i++) {
			Element e = (Element) sections.get(i);
			String[] values = e.getValue().split("\t");
			for (String wordValue : values) {
				if (!StringUtils.isEmpty(wordValue)) {
					word = word + " " + wordValue.trim();
				}

			}
			if (!StringUtils.isEmpty(phrase.trim())) {
				phrase = phrase.trim() + " ; " + word.trim();
			} else {
				phrase = word.trim();
			}

			word = "";
		}

		return phrase.trim();
	}

	public String run(String path) {
		StringBuilder contents = new StringBuilder();
		File annotationDirectory = new File(path);
		String[] manualAnnotationDir = annotationDirectory.list();
		String outputDir = "/home/lh359/EnglishDict/machineAnnotations/";

		try {
			for (String fileToAnnotate : manualAnnotationDir) {
				contents = new StringBuilder();
				System.err.println(path + fileToAnnotate);
				String sourceFilePath = path + fileToAnnotate + "/source.xml";
				String paragraph = getContent(sourceFilePath);
		          
				List<WWMMTag> tagList = posTag.runTaggers(paragraph).getCombinedTagsList();
				List<String> tokenList = posTag.runTaggers(paragraph).getTokenList();
				for (int i = 0; i < tokenList.size(); i++) {
					contents.append(tokenList.get(i) + "_" + tagList.get(i).getPOS() + "$$$");

				}
				FileOutputStream fileout = new FileOutputStream(outputDir
						+ fileToAnnotate);
				fileout.write(contents.toString().getBytes());

			}

			return contents.toString();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public String runScrapbook(String path) {
		StringBuilder contents = new StringBuilder();
		File annotationDirectory = new File(path);
		String[] manualAnnotationDir = annotationDirectory.list();
		String outputDir = "/home/lh359/uccWorkspace/evaluateMarkup/";
		FileWriter filewriter;
		try {
			filewriter = new FileWriter(outputDir+ "human.csv");
			for (String fileToAnnotate : manualAnnotationDir) {
				contents = new StringBuilder();
				System.err.println(path + fileToAnnotate);
				String scrapbookFilePath = path + fileToAnnotate
						+ "/scrapbook.xml";
				List<String> phraseList = getContentFromScrapbook(scrapbookFilePath);
				for (String phraseAndTreeName : phraseList) {
					contents = new StringBuilder();

					int sepIndex = phraseAndTreeName.indexOf(";");
					String phrase = phraseAndTreeName.substring(sepIndex+1,phraseAndTreeName.length());
					String treeName = phraseAndTreeName.substring(0,sepIndex);
					filewriter.append(fileToAnnotate+";"+treeName+";");
					
					
					List<WWMMTag> tagList = posTag.runTaggers(phrase).getCombinedTagsList();
					List<String> tokenList = posTag.runTaggers(phrase).getTokenList();
					for (int i = 0; i < tokenList.size(); i++) {
						String stringToken = tokenList.get(i).trim().replace(" ", "+");
						contents.append(stringToken + "_" + tagList.get(i).getPOS() + " ");
					}
					

					filewriter.append(contents.toString()+"\n");
				}

			}
            filewriter.close(); 
			return contents.toString();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public String runOnPatents(String path) {
		StringBuilder contents = new StringBuilder();
		File annotationDirectory = new File(path);
		String[] manualAnnotationDir = annotationDirectory.list();
		String outputDir = "/home/lh359/polymerPatents/machineAnnotations/";

		try {
			for (String fileToAnnotate : manualAnnotationDir) {
				contents = new StringBuilder();
				String sourceFilePath = path + fileToAnnotate;
				String paragraph = getContentFromPatent(sourceFilePath);
				List<WWMMTag> tagList = posTag.runTaggers(paragraph).getCombinedTagsList();
				List<String> tokenList = posTag.runTaggers(paragraph).getTokenList();
				for (int i = 0; i < tokenList.size(); i++) {
					contents.append(tokenList.get(i) + "_" + tagList.get(i).getPOS() + "$$$");

				}
				FileOutputStream fileout = new FileOutputStream(outputDir
						+ fileToAnnotate.replace(".xml", ""));
				fileout.write(contents.toString().getBytes());

			}

			return contents.toString();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		String folderName = "/home/lh359/manualAnnotations/Nico/scrapbook/";
		String patentFolder = "/home/lh359/polymerPatents/lezan/";
		String outputDir = folderName;// +"/taggedCorpus/" ;
		AnnotateScrapbook corpus = new AnnotateScrapbook();
		Utils.checkOutputDir(outputDir);
		String[] dirFiles = new File(folderName).list();
		String taggedString = "";
		
		//corpus.runScrapbook(folderName);
		//corpus.run(folderName);
		 corpus.runOnPatents(patentFolder);
		taggedString = taggedString + corpus.run(folderName);

		// for (String filename : dirFiles) {
		// String inputFile = folderName+"/"+filename;
		// taggedString = taggedString+corpus.run(inputFile);
		// }
		try {
			// FileOutputStream fileout = new
			// FileOutputStream(outputDir+"taggedHarter");
			// fileout.write(taggedString.getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
