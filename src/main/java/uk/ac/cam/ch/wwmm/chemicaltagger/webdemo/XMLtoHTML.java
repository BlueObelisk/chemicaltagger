package uk.ac.cam.ch.wwmm.chemicaltagger.webdemo;

import java.util.HashSet;
import java.util.Set;

import nu.xom.Document;
import nu.xom.Element;

import org.apache.commons.lang.StringUtils;

public class XMLtoHTML {

	/*******************************
	 * @author lh359 Converts xml to spantag html Dirty hack at the moment will
	 *         be replaced as soon as I learn how to use freemarker+restlet
	 */
	public static String SPACE_DELIMITER = " ";
	public static String SPAN_BEGIN = "<span name=";
	public static String SPAN_END = "</span>";

	public Set<String> actionCheckList;
	public Set<String> phraseCheckList;
	public Set<String> conditionCheckList;
	public Set<String> moleculeCheckList;
	
	public String convert(Document doc) {
		actionCheckList = new HashSet<String>();
		phraseCheckList = new HashSet<String>();
		conditionCheckList = new HashSet<String>();
		moleculeCheckList = new HashSet<String>();
		StringBuilder htmlDoc = new StringBuilder();
		htmlDoc.append(getHTMLHeader());
		htmlDoc.append(getHTMLBody(doc.getRootElement(), SPAN_END
				+ SPACE_DELIMITER));
		htmlDoc.append(SPAN_END);
		htmlDoc.append("</div>");
        htmlDoc.append(getCheckBoxes());
		htmlDoc.append(getHTMLFooter());
		return htmlDoc.toString();

	}

	private String getHTMLHeader() {
		StringBuilder htmlHeader = new StringBuilder();
		htmlHeader
				.append("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.0 Transitional//EN' 'http://www.w3.org/TR/1998/REC-html40-19980424/loose.dtd'> ");
		htmlHeader.append("<html> ");
		htmlHeader.append("<head>");
		htmlHeader.append("<meta http-equiv='Content-type' content='text/html;charset=UTF-8'/> ");
		htmlHeader.append("<title>ChemicalTagger</title>");
		htmlHeader.append("<link rel='stylesheet' type='text/css' href='res/style-extract.css'/> ");
		htmlHeader.append("<script type='text/javascript' src='res/jquery-latest.js'></script>");
		htmlHeader.append("<script type='text/javascript' src='res/functions.js'></script>");
		htmlHeader.append("</head>");
		htmlHeader.append("<body> <div id='taggedReaction'>");
		htmlHeader.append(SPAN_BEGIN + "'Document'>");

		return htmlHeader.toString();
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
			actionCheckList.add(name);
		}
		if (name.contains("MOLECULE")) {
			name = "Other";
			if (StringUtils.isNotEmpty(xmlTag.getAttributeValue("role"))) name =  xmlTag.getAttributeValue("role");
			moleculeCheckList.add(name);
		}
		
		else if (name.startsWith("Temp") ||name.startsWith("Time") || name.startsWith("Atmosphere"))
			conditionCheckList.add(name);
		else if (name.contains("Phrase")) phraseCheckList.add(name);
		spanStart.append(SPAN_BEGIN + "'"+name + "'>");

		return spanStart.toString();
	}

	private String getHTMLFooter() {
		String htmlFooter = "</body> </html> ";
		return htmlFooter;
	}

	private String getCheckBoxes() {
		StringBuilder phraseCheckboxSB = new StringBuilder();
		phraseCheckboxSB.append(makeMultipleSelectBox("Actions"));
		for (String action : actionCheckList) {
			phraseCheckboxSB.append(makeCheckBox(action));
		}
		phraseCheckboxSB.append("</form>");
		
		phraseCheckboxSB.append(makeMultipleSelectBox("Conditions"));
		for (String condition : conditionCheckList) {
			phraseCheckboxSB.append(makeCheckBox(condition));
		}
		phraseCheckboxSB.append("</form>");
		
		phraseCheckboxSB.append(makeMultipleSelectBox("Molecules"));
		for (String molecule : moleculeCheckList) {
			phraseCheckboxSB.append(makeCheckBox(molecule));
		}
		phraseCheckboxSB.append("</form>");
		phraseCheckboxSB.append(makeMultipleSelectBox("Phrases"));
		for (String phrases : phraseCheckList) {
			phraseCheckboxSB.append(makeCheckBox(phrases));
		}
		phraseCheckboxSB.append("</form>");
		
		return phraseCheckboxSB.toString();
	}
	private String makeCheckBox(String checkboxName) {
		StringBuilder checkBoxes = new StringBuilder();
		checkBoxes.append(SPAN_BEGIN+checkboxName+">");
        checkBoxes.append("<input type='checkbox' ");
        checkBoxes.append("name='"+checkboxName+"' ");
        checkBoxes.append("onClick='highlight(\""+checkboxName+"\",checked)'>"+checkboxName);
        checkBoxes.append(SPAN_END);
		return checkBoxes.toString();
	}

	private String makeMultipleSelectBox(String name) {
		StringBuilder multiSelect = new StringBuilder();
        
		multiSelect.append("<input type='checkbox' ");
		multiSelect.append("name="+name+" onclick='checkedAll("+name+"Form,checked);' ><b>"+name+"</b>:");
        multiSelect.append("<form id ='"+name+"Form'>");

		return multiSelect.toString();
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
