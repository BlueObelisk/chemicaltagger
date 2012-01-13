/**
 * Copyright 2012 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

/********************************************
 * Extracts text from XML Patents.
 * 
 * @author lh359
 ********************************************/
public class ExtractFromXML {

	/**************************
	 * Hides Utility Class Constructor.
	 */
    private ExtractFromXML(){};
	/****************************************
	 * Parses an XML files and saves the output into DocumentContainer.
	 * 
	 * @param xmlTag (Element)
	 * @param delimiter (String)
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

	/************************************
	 *  Checks for child Nodes.
	 * @param sub (Element)
	 * @return boolean
	 */
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
	 * Returns the content of a searchTag from an XML File.
	 * 
	 * @param in (InputStream)
	 * @param searchTag
	 *            (String)
	 * @return content (String)
	 * @throws ParsingException 
	 * @throws IOException 
	 **********************************/
	public static String getContent(InputStream in, String searchTag) throws ParsingException, IOException{

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
				} else {
					content = cleanNode;
				}	
			}

		}

		return content;
	}

}
