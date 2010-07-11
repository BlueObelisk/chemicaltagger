package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.lang.StringUtils;

import uk.ac.cam.ch.wwmm.chemicaltagger.extractText.DocumentContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.extractText.ExtractFromXML;

public class makeClassifierInput {

	public makeClassifierInput() {

	}

	public static void main(String[] args) {

		makeClassifierInput input = new makeClassifierInput();
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

			File[] nextDir = parentDir[i].listFiles();
			for (int j = 0; j < nextDir.length; j++) {
				File file = nextDir[j];

				ExtractFromXML extract = new ExtractFromXML();
				DocumentContainer docContainer = extract.getContent(file
						.getAbsolutePath()
						+ "/experimental.xml");
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
					Utils.writeXMLToFile(ast2XML.convert(t,true), "target/ACTA-" + parentDir[i].getName()
							+ "-" + nextDir[j].getName() + ".xml");
				}
			}
		}
		// TODO Auto-generated method stub

	}

	private static void printusage() {
		// TODO Auto-generated method stub
		System.err.println("Please provide path to the data");
	}

}
