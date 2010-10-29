package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Node;
import nu.xom.Nodes;
import nu.xom.ParsingException;
import nu.xom.Text;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;


import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger;
import uk.ac.cam.ch.wwmm.chemicaltagger.ChemistrySentenceParser;
import uk.ac.cam.ch.wwmm.chemicaltagger.OscarTagger;
import uk.ac.cam.ch.wwmm.chemicaltagger.POSContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.Utils;

/********************************************
 * Extracts text from XML Patents
 * 
 * @author lh359
 ********************************************/
public class ExtractFromEPO {

	private final static Logger LOG = Logger.getLogger(ExtractFromEPO.class);
	private final static String PATENT_NODE = "ep-patent-document";
	private final static String DESCRIPTION_NODE = "//description";
	private final static String ID_ATTRIBUTE = "id";
	private final static String DATEPUB_ATTRIBUTE = "date-publ";

	private final static String INVENTOR_NODE = "//B721";
	private final static String NAME_NODE = "snm";
	private final static String ADDRESS_NODE = "*//adr";
	private final static String ADDRESS_STREET_NODE = "*//str";
	private final static String ADDRESS_CITY_NODE = "*//cty";
	private final static String ADDRESS_COUNTRY_NODE = "*//ctry";
	private final static String GRANTEE_NODE = "//B731";
	private final static String IID_NODE = "*//iid";
	private final static String IRF_NODE = "*//irf";
	private final static String ATTORNEY_NODE = "*//B741";

	private final static String REFERENCES_NODE = "//ep-reference-list";
	private final static String PATENT_REFERENCE_NODE = "//patcit";
	private final static String PATENT_REFERENCE_ID_ATTRIBUTE = "dnum";

	private final static String NONPATENT_REFERENCE_NODE = "//nplcit";

	private final static String NONPATENT_AUTHORS_NODE = "*//name";
	private final static String NONPATENT_ARTICLE_NODE = "*/atl";
	private final static String NONPATENT_SERTITLE_NODE = "*/*/sertitle";
	private final static String NONPATENT_BOOKTITLE_NODE = "*/*/book-title";
	private final static String NONPATENT_VID_NODE = "*//vid";
	private final static String NONPATENT_SDATE = "*//sdate";
	private final static String NONPATENT_EDATE = "*//edate";

	public ExtractFromEPO() {

		
	}


	/****************************************
	 * Parses an XML files and saves the output into DocumentContainer
	 * 
	 * @param inputPath
	 *            (InputStream)
	 * @return docContainer (DocumentContainer)
	 ****************************************/
	public DocumentContainer getInfo(String inputPath) {
		
		Document doc = null;
		DocumentContainer docContainer = new DocumentContainer();
		try {
			System.out.println("Path="+inputPath);
			
			Reader read = new FileReader(new File(inputPath));
			System.out.println(read.read());
			doc = new Builder().build(read);
            
		
		} catch (ParsingException ex) {
			LOG.fatal("ParsingException " + ex.getMessage(),
					new RuntimeException());
		} catch (IOException ex) {

			LOG.fatal(ex.getMessage(), new RuntimeException());
		}
		System.out.println(doc.toXML());
		docContainer
				.setId(doc.getRootElement().getAttributeValue(ID_ATTRIBUTE));
		docContainer.setPubDate(doc.getRootElement().getAttributeValue(
				DATEPUB_ATTRIBUTE));

		Nodes description = doc.query(DESCRIPTION_NODE);
		docContainer = getContent(description, docContainer);
		Nodes references = doc.query(REFERENCES_NODE);
		docContainer = getMetadata(doc, docContainer);
		docContainer = getReferences(references, docContainer);

		return docContainer;
	}

	private DocumentContainer getMetadata(Document doc,
			DocumentContainer docContainer) {
		List<PersonContainer> inventorContainerList = getPersonContent(doc,
				INVENTOR_NODE);
		List<PersonContainer> granteeContainerList = getPersonContent(doc,
				GRANTEE_NODE);
		List<PersonContainer> attorneyContainerList = getPersonContent(doc,
				ATTORNEY_NODE);

		docContainer.setInventorContainerList(inventorContainerList);
		docContainer.setAttorneyContainerList(attorneyContainerList);
		docContainer.setGranteeContainerList(granteeContainerList);
		return docContainer;
	}

	private List<PersonContainer> getPersonContent(Document doc, String NodeName) {
		List<PersonContainer> personContainerList = new ArrayList<PersonContainer>();

		Nodes personNodes = doc.query(NodeName);
		for (int i = 0; i < personNodes.size(); i++) {
			PersonContainer personContainer = new PersonContainer();

			Element personNode = (Element) personNodes.get(i);
			Nodes personNameNodes = personNode.query(NAME_NODE);
			personContainer.setName(getNodeContentAsString(personNameNodes));

			Nodes personAddrStreetNodes = personNode.query(ADDRESS_STREET_NODE);
			personContainer
					.setAddress_street(getNodeContentAsString(personAddrStreetNodes));

			Nodes personAddrCityNodes = personNode.query(ADDRESS_CITY_NODE);
			personContainer
					.setAddress_city(getNodeContentAsString(personAddrCityNodes));

			Nodes personAddrCountryNodes = personNode
					.query(ADDRESS_COUNTRY_NODE);
			personContainer
					.setAddress_country(getNodeContentAsString(personAddrCountryNodes));

			Nodes personIIDNodes = personNode.query(IID_NODE);
			personContainer.setIid(getNodeContentAsString(personIIDNodes));

			Nodes personIRFNodes = personNode.query(IRF_NODE);
			personContainer.setIrf(getNodeContentAsString(personIRFNodes));

			personContainerList.add(personContainer);
		}

		return personContainerList;
	}

	private DocumentContainer getReferences(Nodes references,
			DocumentContainer docContainer) {

		Nodes patentReferenceNodes = references.get(0).query(
				PATENT_REFERENCE_NODE);

		for (int i = 0; i < patentReferenceNodes.size(); i++) {
			Element patentRef = (Element) patentReferenceNodes.get(i);
			docContainer.addToPatentRefList(patentRef
					.getAttributeValue(PATENT_REFERENCE_ID_ATTRIBUTE));
		}

		Nodes nonPatentReferenceNodes = references.get(0).query(
				NONPATENT_REFERENCE_NODE);
		for (int i = 0; i < nonPatentReferenceNodes.size(); i++) {
			Element nonPatentNode = (Element) nonPatentReferenceNodes.get(i);
			NonPatentReferenceContainer nonPatentReference = new NonPatentReferenceContainer();
			Nodes articleNameNodes = nonPatentNode
					.query(NONPATENT_ARTICLE_NODE);
			nonPatentReference
					.setArticleTitle(getNodeContentAsString(articleNameNodes));

			Nodes authorsNameNodes = nonPatentNode
					.query(NONPATENT_AUTHORS_NODE);
			nonPatentReference
					.setAuthorNames(getNodeContentAsList(authorsNameNodes));

			Nodes bookTitleNodes = nonPatentNode
					.query(NONPATENT_BOOKTITLE_NODE);
			nonPatentReference
					.setBookTitle(getNodeContentAsString(bookTitleNodes));

			Nodes serialTitleNodes = nonPatentNode
					.query(NONPATENT_SERTITLE_NODE);
			nonPatentReference
					.setSerTitle(getNodeContentAsString(serialTitleNodes));

			Nodes vidNodes = nonPatentNode.query(NONPATENT_VID_NODE);
			nonPatentReference.setVid(getNodeContentAsString(vidNodes));
			Nodes eDate = nonPatentNode.query(NONPATENT_EDATE);
			nonPatentReference.setEdate(getNodeContentAsString(eDate));

			Nodes sDate = nonPatentNode.query(NONPATENT_SDATE);
			nonPatentReference.setSdate(getNodeContentAsString(sDate));

			if (!nonPatentReference.isEmpty()) {
				docContainer.addToNonPatentContainerRefList(nonPatentReference);
			}
		}

		return docContainer;
	}

	private String getNodeContentAsString(Nodes nodes) {
		String nodeContent = "";

		for (int i = 0; i < nodes.size(); i++) {

			Node node = nodes.get(i);
			for (int j = 0; j < node.getChildCount(); j++) {

				if (node.getChild(j) instanceof Text) {
					String cleanNode = node.getChild(j).getValue().trim();
					nodeContent = nodeContent + " " + cleanNode;
				}
			}
		}
		return nodeContent;
	}

	private List<String> getNodeContentAsList(Nodes nodes) {
		List<String> contentList = new ArrayList<String>();

		for (int i = 0; i < nodes.size(); i++) {

			Node node = nodes.get(i);
			for (int j = 0; j < node.getChildCount(); j++) {

				if (node.getChild(j) instanceof Text) {
					String cleanNode = node.getChild(j).getValue().trim();
					if (StringUtils.isNotEmpty(cleanNode)) {
						contentList.add(cleanNode);
					}
				}
			}
		}
		return contentList;
	}

	private DocumentContainer getContent(Nodes description,
			DocumentContainer docContainer) {

		Nodes sections = description.get(0).query("//p");
		String content = "";
		String tlc = "";
		List<String> acceptedNodeList = createListfromString("sub i b sup");

		for (int i = 0; i < sections.size(); i++) {

			Node node = sections.get(i);
			for (int j = 0; j < node.getChildCount(); j++) {
				if (node.getChild(j) instanceof Text) {
					String cleanNode = node.getChild(j).getValue().trim();
					if (cleanNode.toLowerCase().startsWith("tlc")) {
						tlc = cleanNode;
						break;
					} else {
						content = content + " " + cleanNode;
					}

				} else if (node.getChild(j) instanceof Element) {
					Element elementNode = (Element) node.getChild(j);
					if (acceptedNodeList.contains(elementNode.getLocalName())) {
						content = content + elementNode.getValue().trim();
					}
				}

			}
		}

		String spectra = "";
		Nodes spectrum = description.get(0).query("//spectrum");
		for (int i = 0; i < spectrum.size(); i++) {
			String cleanSpectrum = spectrum.get(i).getValue().trim().replace(
					"\n", "");
			if (StringUtils.isNotEmpty(cleanSpectrum)) {
				spectra = spectra + " " + cleanSpectrum;
			}

		}

		docContainer.setContent(content.trim());
		docContainer.setNMR(spectra.trim());
		docContainer.setTLC(tlc.trim());
		return docContainer;
	}

	private List<String> createListfromString(String sentence) {
		List<String> stringList = new ArrayList<String>();

		for (String string : sentence.split(" ")) {
			stringList.add(string);
		}
		return stringList;
	}

	public static void main(String[] args) throws IOException {
		List<DocumentContainer> docs = new ArrayList<DocumentContainer>();
		String path = "src/test/resources/uk/ac/cam/ch/wwmm/chemicaltagger/epoPatents/";

		String filePath = "uk/ac/cam/ch/wwmm/chemicaltagger/epoPatents/";
		File patentDirectory = new File(path);
		String[] patentDir = patentDirectory.list();
		System.err.println(patentDir.length);
		ExtractFromEPO extractEPO = new ExtractFromEPO();
		for (String file : patentDir) {
			extractEPO = new ExtractFromEPO();

			String resourcePath = path + file;
			System.err.println(resourcePath);
			Utils utils = new Utils();
			
//			InputStream inStream = new Utils().getInputStream(resourcePath);
			DocumentContainer docContainer = extractEPO.getInfo(resourcePath);
			docs.add(docContainer);

		}

		// extractEPO.writeErrorsToCSV(docs);
	}

	public void writeErrorsToCSV(List<DocumentContainer> docs)
			throws IOException, UnsupportedEncodingException {
		StringBuilder errorStream = new StringBuilder();
		String DELIM = "\t";
		String ENDLINE = "\n";

		FileWriter antlrErrorWriter = new FileWriter("antlrErrors.csv");
		antlrErrorWriter.append("PatentID" + DELIM + "ERROR_WORD" + DELIM
				+ "TAG" + DELIM + "TREE" + ENDLINE);
		antlrErrorWriter.flush();

		for (DocumentContainer doc : docs) {
			POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(doc.getContent());
			String tagged = posContainer.getTokenTagTupleAsString();

			InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
			ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
					in);

			Tree t = chemistrySentenceParser.parseTags();
			String errors = checkNodes(t, doc.getId(), errorStream);
			antlrErrorWriter.append(errors);
			antlrErrorWriter.flush();

		}
		antlrErrorWriter.close();
	}

	private static String checkNodes(Tree astTree, String patentId,
			StringBuilder errorStream) {
		int nodeCount = astTree.getChildCount();
		String DELIM = "\t";
		String ENDLINE = "\n";
		for (int i = 0; i < nodeCount; i++) {
			String text = astTree.getChild(i).getText();
			int type = astTree.getChild(i).getType();
			LOG.info("****Text=" + text + " type==" + type);
			if (type == 0) {
				errorStream.append(patentId + DELIM + text + DELIM + type
						+ DELIM + astTree.toStringTree() + ENDLINE);
			}
			checkNodes(astTree.getChild(i), patentId, errorStream);

		}
		return errorStream.toString();
	}
}
