package uk.ac.cam.ch.wwmm.chemicaltagger;

import org.xmlcml.cml.base.CMLConstants;

public class Util {

	/** replaces all non-XML characters with _
	 * 
	 * @param text
	 * @return
	 */
	public static String makeNCName(String text) {
		if (text == null) {
			text = "emptyName";
		} else if(text.trim().length() == 0) {
			text = "emptyName";
		} else {
			text = text.trim();
			char c = text.charAt(0);
			if (!Character.isLetter(c) && c != '_') {
				text = '_'+text;
			}
			text = text.replaceAll("[^A-Za-z0-9_.-]", CMLConstants.S_UNDER);
		}
		return text;
	}

}
