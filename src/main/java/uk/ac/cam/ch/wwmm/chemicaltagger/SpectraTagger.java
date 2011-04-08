package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nu.xom.Element;
import uk.ac.cam.ch.wwmm.oscar.document.ProcessingDocument;
import uk.ac.cam.ch.wwmm.oscar.document.ProcessingDocumentFactory;
import uk.ac.cam.ch.wwmm.oscardata.DataAnnotation;
import uk.ac.cam.ch.wwmm.oscardata.DataParser;
import uk.ac.cam.ch.wwmm.oscartokeniser.Tokeniser;

/*****************************************************
 * Runs the oscar SpectraTagger to pull out the NMR Spectra.
 * 
 * @author lh359, dl387
 *****************************************************/
public class SpectraTagger {

	/**************************
	 * Hides Utility Class Constructor.
	 */
	private SpectraTagger(){
		
	}
	/*******************************************************
	 * Tags the NMR Spectra in a chemistry text.
	 * @param  posContainer (POSContainer)
	 * @return posContainer (POSContainer)
	 *******************************************************/
	public static POSContainer runTagger(POSContainer posContainer) {
		Tokeniser tokeniser = Tokeniser.getDefaultInstance();
		ProcessingDocument procDoc = ProcessingDocumentFactory.getInstance().makeTokenisedDocument(tokeniser, posContainer.getInputText());

		List<DataAnnotation> annotations = DataParser.findData(procDoc);

		StringBuilder newInputText = new StringBuilder();
		String sentence = posContainer.getInputText();
		int offset = 0;
        List<String> spectraKeywords = Arrays.asList("spectrum hrms rf".split(" "));
		List<Element> spectraList = new ArrayList<Element>();
		for (DataAnnotation dataAnnotation : annotations) {
			if (spectraKeywords.contains(dataAnnotation.getAnnotatedElement().getLocalName()) || (dataAnnotation.getAnnotatedElement().getLocalName().equals("property") && spectraKeywords.contains(dataAnnotation.getAnnotatedElement().getAttribute("type"))))  {
				spectraList.add(dataAnnotation.getAnnotatedElement());
				newInputText.append(sentence.substring(offset, dataAnnotation
						.getStart()));
				offset = dataAnnotation.getEnd();
			}

		}
		newInputText.append(sentence.substring(offset, sentence.length()));
		posContainer.setInputText(newInputText.toString());
		posContainer.setSpectrumList(spectraList);
		return posContainer;
	}

}
