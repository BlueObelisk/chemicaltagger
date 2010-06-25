package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Nodes;
import nu.xom.ParsingException;

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
	private String getStringValue(Element action, String Delimiter) {
		StringBuilder stringValue = new StringBuilder();
		for (int i = 0; i < action.getChildCount(); i++) {
			if (action.getChild(i) instanceof nu.xom.Text) {
				stringValue.append(action.getChild(i).getValue());
			} else {
				Element sub = (Element) action.getChild(i);

				if (sub.getChildCount() > 1) {
					stringValue.append(getStringValue(sub, Delimiter));
				} else if (hasMoreChildren(sub)) {
					stringValue.append(getStringValue(sub, Delimiter));
				} else {
					stringValue.append(sub.getValue() + Delimiter);
				}
			}
		}

		return stringValue.toString();
	}

	private boolean hasMoreChildren(Element sub) {
		// TODO Auto-generated method stub

		if (sub.getChild(0).getChildCount() > 0) {
			return true;
		}
		return false;
	}

	public DocumentContainer getContent(String sourceFile) {
		Builder builder = new Builder();
		Document doc = null;

		DocumentContainer docContainer = new DocumentContainer();
		LOG.info("Extracting data from " + sourceFile);
		try {
			doc = builder.build(sourceFile);
			docContainer.setId(doc.getRootElement().getAttributeValue("id"));
			Nodes sections = doc.query("//p");
			String content = "";
			String tlc = "";
			for (int i = 0; i < sections.size(); i++) {

			    Element elementNode = (Element )sections.get(i);

				String cleanNode = getStringValue(elementNode,
						"").trim().replace("\n", " ").replace("\r", "");
				;

				if (cleanNode.toLowerCase().startsWith("tlc")) {
					tlc = cleanNode;
					break;
				} else {
					content = content + " " + cleanNode;
				}

			}

			String spectra = "";
			Nodes spectrum = doc.query("//spectrum");
			for (int i = 0; i < spectrum.size(); i++) {
				String cleanSpectrum = spectrum.get(i).getValue().trim()
						.replace("\n", "");
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
