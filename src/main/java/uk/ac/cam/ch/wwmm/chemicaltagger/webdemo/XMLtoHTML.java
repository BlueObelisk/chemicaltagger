package uk.ac.cam.ch.wwmm.chemicaltagger.webdemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import nu.xom.Document;
import nu.xom.Element;

import org.apache.commons.lang.StringUtils;

public class XMLtoHTML {

	/*******************************
	 * @author lh359 Converts xml to spantag html
	 */
	public static String SPACE_DELIMITER = " ";
	public static String SPAN_BEGIN = "<span name=";
	public static String SPAN_END = "</span>";

	public Set<String> actionCheckSet;
	public Set<String> phraseCheckSet;
	public Set<String> conditionCheckSet;
	public Set<String> moleculeCheckSet;
	public String taggedText;
	public HashMap<String, Set<String>> checkBoxes;
	
	public void convert(Document doc) {
		actionCheckSet = new HashSet<String>();
		phraseCheckSet = new HashSet<String>();
		conditionCheckSet = new HashSet<String>();
		moleculeCheckSet = new HashSet<String>();
		
		taggedText = new String();
		
		taggedText = SPAN_BEGIN + "'Document'>" + getHTMLBody(doc.getRootElement(), SPAN_END
				+ SPACE_DELIMITER) + SPAN_END;
        checkBoxes = getCheckBoxContent();
		

	}


	/****************************************
	 * Parses an XML document and converts to an HTML string
	 * 
	 * @param sourceFile
	 *            (String)
	 * @return docContainer (DocumentContainer)
	 ****************************************/
	public String getHTMLBody(Element xmlTag, String Delimiter) {
		StringBuilder stringValue = new StringBuilder();
		for (int i = 0; i < xmlTag.getChildCount(); i++) {
			if (xmlTag.getChild(i) instanceof nu.xom.Text) {
				stringValue.append(xmlTag.getChild(i).getValue().trim());

			} else {
				if (!(xmlTag.getChild(i) instanceof nu.xom.ProcessingInstruction)) {
					Element sub = (Element) xmlTag.getChild(i);
					stringValue.append(makeSpanBegin(sub));

					if (sub.getChildCount() > 0) {
						stringValue.append(getHTMLBody(sub, Delimiter)+ Delimiter);
					} else if (hasMoreChildren(sub)) {
						stringValue.append(getHTMLBody(sub, Delimiter)+Delimiter);
					} else {
						stringValue.append(sub.getValue() + Delimiter);
					}
				}
			}
		}
		/***************
		 * Replace the non-breaking space with a normal space
		 */
		return stringValue.toString().replace(" ", " ").replace("=", "=")
				.replace("   ", " ");
	}

	private String makeSpanBegin(Element xmlTag) {
		StringBuilder spanStart = new StringBuilder();
		String name = xmlTag.getLocalName();
		if (name.contains("Action")) {
			name = xmlTag.getAttributeValue("type");
			actionCheckSet.add(name);
		}
		if (name.contains("MOLECULE")) {
			name = "Other";
			if (StringUtils.isNotEmpty(xmlTag.getAttributeValue("role"))) name =  xmlTag.getAttributeValue("role");
			moleculeCheckSet.add(name);
		}
		
		else if (name.startsWith("Temp") ||name.startsWith("Time") || name.startsWith("Atmosphere"))
			conditionCheckSet.add(name);
		else if (name.contains("Phrase")) phraseCheckSet.add(name);
		spanStart.append(SPAN_BEGIN + "'"+name + "'>");

		return spanStart.toString();
	}



	private HashMap<String, Set<String>> getCheckBoxContent() {

		HashMap<String,Set<String>> checkboxHashMap = new HashMap<String,Set<String>>();
		if (actionCheckSet.size()> 0) checkboxHashMap.put("Actions", actionCheckSet);
		
		if (conditionCheckSet.size()> 0) checkboxHashMap.put("Conditions", conditionCheckSet);
		
		
		if (moleculeCheckSet.size()> 0)checkboxHashMap.put("Molecules", moleculeCheckSet);
		
		
		if (phraseCheckSet.size()> 0) checkboxHashMap.put("Phrases", phraseCheckSet);
		
		return checkboxHashMap;
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

	public String getTaggedText() {
		return taggedText;
	}

	public HashMap<String, Set<String>> getCheckBoxes() {
		return checkBoxes;
	}
}
