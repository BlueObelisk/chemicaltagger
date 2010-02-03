package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.Tree;
import org.junit.Ignore;
import org.junit.Test;

import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistrySentenceParser;
import uk.ac.cam.ch.wwmm.chemicaltagger.POSContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.Utils;

public class ExtractFromEPOTest {

	@Ignore
	@Test
	public void testGetPatentContent() {

		ExtractFromEPO epoExtract = new ExtractFromEPO();
		String pathName = "uk/ac/cam/ch/wwmm/chemicaltagger/extractTest/epoPatents/EPO1191614B1.xml";
		InputStream inputSource = new Utils().getInputStream(pathName);
		DocumentContainer epoContent = epoExtract.getInfo(inputSource);
		System.out.println("ID::" + epoContent.getId());
		System.out.println("Publication Date::" + epoContent.getPubDate());
		System.out.println("Content::" + epoContent.getContent());
        System.out.println("NMR::" + epoContent.getNMR());
        System.out.println("TLC::" + epoContent.getTLC());
		System.out.println("Inventor List:");
		for (PersonContainer inventor : epoContent.getInventorContainerList()) {
			System.out.println("\t Name:: " + inventor.getName());
			System.out.println("\t Street Address:: "
					+ inventor.getAddress_street());
			System.out.println("\t City:: " + inventor.getAddress_city());
			System.out.println("\t Country:: " + inventor.getAddress_country());

		}
		System.out.println("\n Grantee List:");
		for (PersonContainer grantee : epoContent.getGranteeContainerList()) {
			System.out.println("\t Name:: " + grantee.getName());
			System.out.println("\t IID:: " + grantee.getIid());
			System.out.println("\t IRF:: " + grantee.getIrf());
			System.out.println("\t Street Address:: "
					+ grantee.getAddress_street());
			System.out.println("\t City:: " + grantee.getAddress_city());
			System.out.println("\t Country:: " + grantee.getAddress_country());

		}

		System.out.println("\n Attorney List:");
		for (PersonContainer attorney : epoContent.getAttorneyContainerList()) {
			System.out.println("\t Name:: " + attorney.getName());
			System.out.println("\t IID:: " + attorney.getIid());
			System.out.println("\t IRF:: " + attorney.getIrf());
			System.out.println("\t Street Address:: "
					+ attorney.getAddress_street());
			System.out.println("\t City:: " + attorney.getAddress_city());
			System.out.println("\t Country:: " + attorney.getAddress_country());

		}

		System.out.println("\n Other patents Referenced by this Patent:");
		for (String patent : epoContent.getPatentRefList()) {
			System.out.println("\t Patent ID:: " + patent);
		}
		System.out.println("\n Papers Referenced by this Patent:");
		for (NonPatentReferenceContainer paper : epoContent
				.getNonPatentRefContainerList()) {

			System.out.println("\t Article Title:: " + paper.getArticleTitle());
			System.out.println("\t Authors' Names:: " );
			for (String author : paper.getAuthorNames()) {
				System.out.println("\t\t Name:: "+author);
			}
			System.out.println("\t Serial Title:: " + paper.getSerTitle());
			System.out.println("\t Book Title:: " + paper.getBookTitle());
			System.out.println("\t VID:: " + paper.getVid());
			System.out.println("\t SDate:: " + paper.getSdate());
			System.out.println("\t EDate:: " + paper.getEdate());

		}
	}
	@Ignore
	@Test
	public void main() throws IOException {
		List<DocumentContainer> docs = new ArrayList<DocumentContainer>();
		String path = "src/test/resources/uk/ac/cam/ch/wwmm/chemicaltagger/extractTest/epoPatents/";
		String filePath = "uk/ac/cam/ch/wwmm/chemicaltagger/extractTest/epoPatents/";
		File patentDirectory = new File(path);
		String[] patentDir = patentDirectory.list();
		ExtractFromEPO extractEPO = new ExtractFromEPO();

		for (String file : patentDir) {
			extractEPO = new ExtractFromEPO();

			String resourcePath = filePath + file;
			System.err.println(resourcePath);
			Utils utils = new Utils();
			InputStream inStream = utils.getInputStream(resourcePath);
			DocumentContainer docContainer = extractEPO.getInfo(inStream);
			docs.add(docContainer);

		}
		writeErrorsToCSV(docs);
        new Doc2CSV().writeDocsToCSV(docs);
	}

	private void writeErrorsToCSV(List<DocumentContainer> docs)
			throws IOException, UnsupportedEncodingException {
		StringBuilder errorStream = new StringBuilder();
		ChemistryPOSTagger chemPosTag = new ChemistryPOSTagger();
		String DELIM = "\t";
		String ENDLINE = "\n";
		
		FileWriter antlrErrorWriter = new FileWriter("antlrErrors.csv");
		antlrErrorWriter.append("PatentID"+DELIM+"ERROR_WORD"+DELIM+"TAG"+DELIM+"TREE"+ENDLINE);
		antlrErrorWriter.flush();
		
		for (DocumentContainer doc : docs) {
			POSContainer posContainer = chemPosTag.runTaggers(doc.getContent());
			String tagged = posContainer.getTokenTagTupleAsString();

			InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
			ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
					in);

			Tree t = chemistrySentenceParser.parseTags();
			String errors = checkNodes(t, doc.getId(), errorStream);
			antlrErrorWriter.append(errors);
			antlrErrorWriter.flush();
			
		}
		antlrErrorWriter.close();
	}

	private static String checkNodes(Tree astTree, String patentId,
			StringBuilder errorStream) {
		int nodeCount = astTree.getChildCount();
		String DELIM = "\t";
		String ENDLINE = "\n";
		for (int i = 0; i < nodeCount; i++) {
			String text = astTree.getChild(i).getText();
			int type = astTree.getChild(i).getType();
			//Log.info("****Text=" + text + " type==" + type);
			if (type == 0) {
				errorStream.append(patentId + DELIM + text + DELIM + type
						+ DELIM + astTree.toStringTree() + ENDLINE);
			}
			checkNodes(astTree.getChild(i), patentId, errorStream);

		}
		return errorStream.toString();
	}

}
