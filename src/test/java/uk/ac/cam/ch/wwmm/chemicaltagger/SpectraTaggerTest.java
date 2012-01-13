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

import junit.framework.Assert;
import nu.xom.Document;

import org.antlr.runtime.tree.Tree;
import org.junit.Test;

/***********************************************
 * Tests the SpectraTagger Class
 * @author lh359, dl387
 ***********************************************/
public class SpectraTaggerTest {

	@Test
	public void sentence1() {
		String text = "The title compound was synthesized from ethyl 3-cyclopropyl-4H-furo[3,2-b]pyrrole-5-carboxylate (110 mg, 0.50 mmol) according to General Procedure 2 and was purified by flash chromatography (Isco CombiFlash, 0-60% EtOAc/heptane) to afford 3-cyclopropyl-4H-furo[3,2-b]pyrrole-5-carboxylic acid 31 (34 mg, 35%). 1H NMR (400 MHz, CD3OD) \u03B4 ppm 0.67-0.72 (m, 2H), 0.86-0.92 (m, 2H), 1.75-1.84 (m, 1H), 6.64 (s, 1H), 7.34 (d, J=0.83 Hz, 1H); LCMS-MS (ESI\u2212) 189.8 (M\u2212H); HPLC (UV=95.9%), (ELSD=100%). ";
		ChemistryPOSTagger posTagger = ChemistryPOSTagger.getDefaultInstance();
		POSContainer posContainer = posTagger.runTaggers(text, true);
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);
        chemistrySentenceParser.parseTags();
		Tree t = chemistrySentenceParser.getParseTree();
		Document doc = new ASTtoXML().convert(t);
        doc.getRootElement().appendChild(posContainer.getSpectrumElementList());
        Assert.assertEquals("SpectrumList size:", 1, doc.query("//SpectrumList").size());
		Assert.assertEquals("Spectrum size:", 3, doc.query("//spectrum").size());
		Assert.assertEquals("Modified input text length", text.length() - posContainer.getSpectrumElementList().getValue().length(), posContainer.getInputText().length());

	}
}
