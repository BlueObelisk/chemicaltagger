/**
 * Copyright 2011 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
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
