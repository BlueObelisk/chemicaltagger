package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.lang.StringUtils;

import uk.ac.cam.ch.wwmm.chemicaltagger.extractText.DocumentContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.extractText.ExtractFromXML;

public class makePatentClassifierInput {

	public makePatentClassifierInput() {

	}

	public static void main(String[] args) {

		makePatentClassifierInput input = new makePatentClassifierInput();
		if (args.length < 1) {
			printusage();
		} else {
			try {
				input.produceParsedXML(args[0]);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void produceParsedXML(String dirPath)
			throws UnsupportedEncodingException {

		File[] parentDir = new File(dirPath).listFiles();
		for (int i = 0; i < parentDir.length; i++) {

				File file = parentDir[i];
//				File newFile = new File(file.getAbsolutePath().replace("ÿ", ""));
//                file.renameTo(newFile);
				ExtractFromXML extract = new ExtractFromXML();
				DocumentContainer docContainer = extract.getContent(file
						.getAbsolutePath());
				String content = docContainer.getContent();
				if (StringUtils.isNotEmpty(content)) {

					POSContainer posContainer = ChemistryPOSTagger
							.getInstance()
							.runTaggers(content);
					InputStream in = new ByteArrayInputStream(posContainer
							.getTokenTagTupleAsString().getBytes("UTF-8"));
					ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
							in);

					Tree t = chemistrySentenceParser.parseTags();
					ASTtoXML ast2XML = new ASTtoXML();
					Utils.writeXMLToFile(ast2XML.convert(t,true), "target/"+ file.getName());
				}
			}
		}
		// TODO Auto-generated method stub

	

	private static void printusage() {
		// TODO Auto-generated method stub
		System.err.println("Please provide path to the data");
	}

}
