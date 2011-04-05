package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Nodes;
import nu.xom.ParsingException;
import nu.xom.ProcessingInstruction;
import nu.xom.Text;
import nu.xom.ValidityException;

/********************************************
 * Extracts text from XML Patents
 * 
 * @author lh359
 ********************************************/
public class ExtractFromXML {


	/****************************************
	 * Parses an XML files and saves the output into DocumentContainer
	 * 
	 * @param xmlTag
	 *            (Element)
	 * @return stringValue (String)
	 ****************************************/
	public static String getStringValue(Element xmlTag, String delimiter) {
		StringBuilder stringValue = new StringBuilder();
		for (int i = 0; i < xmlTag.getChildCount(); i++) {
			if (xmlTag.getChild(i) instanceof Text) {
				stringValue.append(xmlTag.getChild(i).getValue().trim()
						+ delimiter);
			} else {
				if (!(xmlTag.getChild(i) instanceof ProcessingInstruction)) {
					Element sub = (Element) xmlTag.getChild(i);

					if (sub.getChildCount() > 0) {
						stringValue.append(getStringValue(sub, delimiter));
					} else if (hasMoreChildren(sub)) {
						stringValue.append(getStringValue(sub, delimiter));
					} else {
						stringValue.append(sub.getValue() + delimiter);
					}
				}
			}
		}

//		 Replace the non-breaking space with a normal space
		return stringValue.toString().replace("\u00a0", " ").replace("   ", " ");
	}

	private static boolean hasMoreChildren(Element sub) {

		if (sub.getChildCount() == 0) {
			return false;
		}
		if (sub.getChild(0).getChildCount() > 0) {
			return true;
		}
		return false;
	}



	/*********************************
	 * Returns the content of a searchTag from an XML File
	 * 
	 * @param in (InputStream)
	 * @param searchTag
	 *            (String)
	 * @return content (String)
	 * @throws IOException 
	 * @throws ParsingException 
	 * @throws ValidityException 
	 **********************************/
	public static String getContent(InputStream in, String searchTag) throws ValidityException, ParsingException, IOException {

		Document doc = new Builder().build(in);
		Nodes sections = doc.query(searchTag);
		String content = "";
		for (int i = 0; i < sections.size(); i++) {

			Element elementNode = (Element) sections.get(i);

			String cleanNode = getStringValue(elementNode, "").trim().replace(
					"\n", " ").replace("\r", "");
			

			if (cleanNode.toLowerCase().startsWith("tlc")) {
				break;
			} else {
				if (content.length() > 0) {
					if (content.trim().endsWith(".")) {
						content += " " + cleanNode;
					} else {
						content += " . " + cleanNode;
					}
				} else
					content = cleanNode;
			}

		}

		return content;
	}

}
