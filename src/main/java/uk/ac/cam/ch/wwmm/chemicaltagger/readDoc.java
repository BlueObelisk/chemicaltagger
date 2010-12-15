package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;


/********************************************
 * A class that reads in word documents and
 * creates a tagger corpora.
 * 
 * Not needed at the moment.
 * 
 * @author lh359
 ********************************************/
public class readDoc {

	public String docFilename;
	public String collectionName;
	public String fileInput;
	public static String outputDir;
	public static String DELIMITER = "NEEEEXT";

	public readDoc(String filename) {
		docFilename = filename;
		String[] splitName = docFilename.split("/");
		collectionName = splitName[splitName.length - 1].replace(".doc", "");
	}

	public void setOutputDir(String outputDir) {
		outputDir = outputDir + "/" + collectionName + "/";
		Utils.checkOutputDir(outputDir);
	}

	public void readDocFile(String filesname) {
		POIFSFileSystem fs = null;
		try

		{
			fs = new POIFSFileSystem(new FileInputStream(filesname));
			// Couldn't close the braces at the end as my site did not allow it
			// to close

			HWPFDocument doc = new HWPFDocument(fs);

			WordExtractor we = new WordExtractor(doc);

			String[] paragraphs = we.getParagraphText();

			//  
			System.out.println("Word Document has " + paragraphs.length
					+ " paragraphs");
			List<String> sections = getSections_Harter(paragraphs);
			writeOut(sections);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void writeOut(List<String> sections) {
		int sectionIndex = 0;
		while (sectionIndex < sections.size()) {
			fileInput = "";
			String filename = "preparation-" + sectionIndex;
			String section = sections.get(sectionIndex);

			String[] parts = section.split(DELIMITER);

			if (parts.length > 2) {
				fileInput = fileInput + "REACTIONTITLE=" + parts[0] + "\n";
				fileInput = fileInput + "REACTIONCONTENT=" + parts[1] + "\n";
				fileInput = fileInput + "EXPERIMENTALDATA=" + parts[2] + "\n";
			} else if (parts.length > 1) {
				fileInput = fileInput + "REACTIONTITLE=" + parts[0] + "\n";
				if (isExperimental(parts[1])) {
					fileInput = fileInput + "EXPERIMENTALDATA=" + parts[1]
							+ "\n";
				} else {
					fileInput = fileInput + "REACTIONCONTENT=" + parts[1]
							+ "\n";
				}
				sectionIndex = checkAppendNextItem(sectionIndex, sections);
			}
			try {

				if (!StringUtils.isEmpty(fileInput)) {
					FileOutputStream fileout = new FileOutputStream(outputDir
							+ filename);
					fileout.write(fileInput.getBytes());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sectionIndex++;
		}

	}

	private int checkAppendNextItem(int sectionIndex, List<String> sections) {
		int newSectionIndex = sectionIndex;
		while (newSectionIndex + 1 < sections.size()) {
			if (sections.get(newSectionIndex + 1).startsWith("Compound")) {
				fileInput = fileInput
						+ "EXPERIMENTALDATA="
						+ sections.get(newSectionIndex + 1).replace(DELIMITER,
								" ") + "\n";
			} else {
				break;
			}
			newSectionIndex++;
		}
		return newSectionIndex;
	}

	private boolean isExperimental(String content) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if (content.contains("max")) {
			flag = true;
		}
		return flag;
	}

	private List<String> getSections_Harter(String[] paragraphs) {
		String sectionString = "";
		List<String> sections = new ArrayList<String>();
		for (int i = 0; i < paragraphs.length; i++) {
			paragraphs[i] = paragraphs[i].replaceAll("\\cM?\r?\n", "");

			if (paragraphs[i].length() > 20
					&& !paragraphs[i].startsWith("Experimental")
					&& !paragraphs[i].startsWith("General experimental")) {

				int index = paragraphs[i].indexOf("max");
				if (index > 1) {
					sectionString = sectionString
							+ paragraphs[i].substring(0, index)
							+ DELIMITER
							+ paragraphs[i].substring(index, paragraphs[i]
									.length());
				} else {
					sectionString = sectionString + paragraphs[i] + DELIMITER;
				}

				if (paragraphs[i].length() < 100
						|| paragraphs[i].startsWith("Preparation")
						|| paragraphs[i].startsWith("General")) {

				} else {
					sections.add(sectionString);
					sectionString = "";
				}
			}
		}
		return sections;
	}

	public static void main(String[] args) {
		String filesname = "/home/lh359/Desktop/Harter_ExperimentalSection.doc";
		String outputFolder = "/home/lh359/ThesesCorpora";

		readDoc wordDoc = new readDoc(filesname);
		wordDoc.setOutputDir(outputFolder);

		wordDoc.readDocFile(filesname);
	}
}
