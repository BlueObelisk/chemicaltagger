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
package uk.ac.cam.ch.wwmm.chemicaltagger.modelParser;

import org.junit.Test;


public class ChemistryModelParserTest {

	
	@Test
	public void testModelParsing() {
		String sentence = "Potassium carbonate ( 0.63 g , 4.56 mmol ) and thiophenol ( 0.19 g , 1.69 mmol) were dissolved in 2-nitrobenzene sulfonamide ( 0.50 g , 1.302 mmol )";
		ChemistryModelParser chemistryModel = new ChemistryModelParser();
		chemistryModel.parseSentence(sentence);
	}
}
