package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Node;
import nu.xom.Nodes;
import nu.xom.ParsingException;
import nu.xom.Text;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/********************************************
 * Extracts text from XML Patents
 * 
 * @author lh359
 ********************************************/
public class ExtractFromXML {

	private final Logger LOG = Logger.getLogger(ExtractFromXML.class);

	
	/****************************************
	 * Parses an XML files and saves the output
	 * into DocumentContainer
	 * 
	 * @param sourceFile (String)
	 * @return docContainer (DocumentContainer)
	 ****************************************/
	public DocumentContainer getContent(String sourceFile) {
		Builder builder = new Builder();
		Document doc = null;
		
		DocumentContainer docContainer = new DocumentContainer();
//        LOG.debug("Extracting data from "+sourceFile);
		try {
			doc = builder.build(sourceFile);
			docContainer.setId(doc.getRootElement().getAttributeValue("id"));
			Nodes sections = doc.query("//p");
			String content = "";
			String tlc = "";
			for (int i = 0; i < sections.size(); i++) {

				Node node = sections.get(i);
				for (int j = 0; j < node.getChildCount(); j++) {
					if (node.getChild(j) instanceof Text) {
						String cleanNode = node.getChild(j).getValue().trim().replace("\n", " ").replace("\r", "");
						if (cleanNode.toLowerCase().startsWith("tlc")) {
							tlc = cleanNode;
							break;
						} else {
							content = content + " " + cleanNode;
						}
						
					}

				}
			}

			String spectra = "";
			Nodes spectrum = doc.query("//spectrum");
			for (int i = 0; i < spectrum.size(); i++) {
				String cleanSpectrum = spectrum.get(i).getValue().trim().replace("\n", "");
				if (StringUtils.isNotEmpty(cleanSpectrum)) {
					spectra = spectra + " " + cleanSpectrum;
				}

			}

			docContainer.setContent(content.trim());
			docContainer.setNMR(spectra.trim());
			docContainer.setTLC(tlc.trim());
		} catch (ParsingException ex) {
			LOG.fatal("ParsingException " + ex.getMessage(),
					new RuntimeException());
		} catch (IOException ex) {

			LOG.fatal(ex.getMessage(), new RuntimeException());
		}
		return docContainer;
	}

	public static void main(String[] args) {
		List docs = new ArrayList<DocumentContainer>();
		String path = "src/main/resources/xmlFiles/";
		File patentDirectory = new File(path);
		String[] patentDir = patentDirectory.list();
		for (String file : patentDir) {

			String resourcePath = path + file;
			ExtractFromXML extract = new ExtractFromXML();
			DocumentContainer docContainer = extract.getContent(resourcePath);
			
			docs.add(docContainer);

		}

	}
}
