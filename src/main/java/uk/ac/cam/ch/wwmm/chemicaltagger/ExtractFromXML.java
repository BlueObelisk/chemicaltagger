package uk.ac.cam.ch.wwmm.chemicaltagger;

import nu.xom.Element;

/********************************************
 * Extracts text from XML Patents
 * 
 * @author lh359
 ********************************************/
public class ExtractFromXML {

	/****************************************
	 * Parses an XML files and saves the output into DocumentContainer
	 * 
	 * @param xmlTag (Element)
	 * @return stringValue (String)
	 ****************************************/
	public String getStringValue(Element xmlTag, String Delimiter) {
		StringBuilder stringValue = new StringBuilder();
		for (int i = 0; i < xmlTag.getChildCount(); i++) {
			if (xmlTag.getChild(i) instanceof nu.xom.Text) {
				stringValue.append(xmlTag.getChild(i).getValue().trim()+Delimiter);
			} else {
				if (!(xmlTag.getChild(i) instanceof nu.xom.ProcessingInstruction)) {
					Element sub = (Element) xmlTag.getChild(i);

					if (sub.getChildCount() > 0) {
						stringValue.append(getStringValue(sub, Delimiter));
					} else if (hasMoreChildren(sub)) {
						stringValue.append(getStringValue(sub, Delimiter));
					} else {
						stringValue.append(sub.getValue() + Delimiter);
					}
				}
			}
		}

		/***************
		 * Replace the non-breaking space with a normal space
		 */
		return stringValue.toString().replace(" "," ").replace("=", "=").replace("   ", " ");
	}

	private boolean hasMoreChildren(Element sub) {
		

		if (sub.getChildCount() == 0) {
			return false;
		}
		if (sub.getChild(0).getChildCount() > 0) {
			return true;
		}
		return false;
	}


}
