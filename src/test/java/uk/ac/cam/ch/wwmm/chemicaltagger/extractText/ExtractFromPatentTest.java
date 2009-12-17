package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class ExtractFromPatentTest {
	public static String expectedPatentOutput = "To a methanol (3 mL) solution of the compound (550 mg) synthesized in Example 3, an aqueous 2N-sodium hydroxide solution (1.5 mL) was added and the reaction solution was stirred at room temperature for one hour. To the reaction solution, 2N-hydrochloric acid (1.5 mL) was added. The reaction solution was conentrated under reduced pressure. The residue was dissolved in ethanol and an insoluble substance was removed by filtration. The filtrate was conentrated under reduced pressure to obtain the title compound having the following physical properties (522 mg)."
			.replace(" ", "");
	public static String expectedPatentNMR = "NMR(CD 3OD): δ 2.36(s, 3H), 291(s, 6H), 4.04(s, 2H), 4.05(s, 2H), 4.86(s, 2H), 7.08(d, J = 2.1 Hz, 1H), 7.38(d, J = 2.1 Hz, 1H), 7.42(d, J = 1.5 Hz, 1H), 7.47(d, J = 1.5 Hz, 1H)"
			.replace(" ", "");
	public static String expectedPatentTLC = "TLC: Rf 0.01 (dichloromethane : methanol : 28% ammonia water = 90 : 10 : 1);"
			.replace(" ", "");
	public static String resourcePath = "src/test/resources/patents/paragraph0018.xml";
	public ExtractFromPatent extract;
	public DocumentContainer docContainer;

	@Before
	public void setUp() throws Exception {
		extract = new ExtractFromPatent();
		docContainer = extract.getContent(resourcePath);

	}

	@Test
	public void testGetPatentContent() {

		String actualPatentContent = docContainer.getContent().replace(" ", "")
				.trim();
		Assert.assertEquals(expectedPatentOutput, actualPatentContent);

	}

	@Test
	public void testGetPatentTLC() {

		String actualPatentTLC = docContainer.getTLC().replace(" ", "").trim();
		Assert.assertEquals(expectedPatentTLC, actualPatentTLC);

	}

	@Test
	public void testGetPatentNMR() {

		String actualPatentNMR = docContainer.getNMR().replace(" ", "").trim();
		Assert.assertEquals(expectedPatentNMR, actualPatentNMR);
	}
}
