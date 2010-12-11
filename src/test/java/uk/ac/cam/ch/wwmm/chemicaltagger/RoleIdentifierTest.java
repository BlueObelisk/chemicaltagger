package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.junit.Test;


public class RoleIdentifierTest {

	@Test
	public void RoleIdentifierTest1() throws UnsupportedEncodingException {

                String sentence = "Thus, we showed that intramolecular cyclization of the functionalized 1,4-diketones 3 could be conducted in the presence of anhydrous potassium carbonate (K2CO3) in the refluxing methanol to afford the pure cyclopentenones 4 with satisfactory yields (Table 2, Scheme Scheme22).";
		RoleIdentifier roleIdent = new RoleIdentifier(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);		
	}

	@Test
	public void RoleIdentifierTest2() throws UnsupportedEncodingException {
                String sentence = "Accordingly (Scheme ​(Scheme1),1), treatment of the fully O-protected L-ido-cyclooctene 1 with a 5 mol% aqueous solution of osmium(IV) tetroxide [34] in acetone in the presence of N-methylmorpholine oxide and tert-butanol cleanly led to the expected cis-diol 3 in 97% yield.";
		RoleIdentifier roleIdent = new RoleIdentifier(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);		
	}
	@Test
	public void RoleIdentifierTest3() throws UnsupportedEncodingException {
                String sentence = "At the solution of sodium (7.5 mmol) in 15 mL of methanol, was added at room temperature the nitro intermediate 2 (5 mmol). After one hour, a solution of H2SO4 (3 mL) in 15 mL of methanol at -50°C was added. The mixture was treated with H2O, the methanol was evaporated, and the residue was extracted with dichloromethane. The organic layer was washed by a solution of NaOH 1% and a solution of NaCl and dried (MgSO4). The solvent was removed to leave oil, which was purified by column chromatography on silica gel. 3-Acetyl-5-oxohexanoic acid methyl ester (3a) Purified by column chromatography (hexane/AcOEt, 7/3).";
		RoleIdentifier roleIdent = new RoleIdentifier(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);		
	}

        
       @Test
       public void RoleIdentifierTest4() throws UnsupportedEncodingException {
                String sentence = "To a solution of 1,4-diketone 3 (5 mmol) in MeOH (10 mL) was added 1 equivalent of K2CO3, the mixture was bring to reflux during one hour. After workup, the product 4 was purified by column chromatography on silica gel (EtOAc/hexane). 4-Benzyl-3-methylcyclopent-2-enone (4d) Purified by column chromatography (hexane/AcOEt, 8/2)." ;
		RoleIdentifier roleIdent = new RoleIdentifier(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);		
	}

	@Test
	public void RoleIdentifierTest5() throws UnsupportedEncodingException {
                String sentence = "Accordingly (Scheme ​(Scheme1),1), treatment of the fully O-protected L-ido-cyclooctene 1 with a 5 mol% aqueous solution of osmium(IV) tetroxide [34] in acetone in the presence of N-methylmorpholine oxide and tert-butanol cleanly led to the expected cis-diol 3 in 97% yield." ;
		RoleIdentifier roleIdent = new RoleIdentifier(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);		
	}

	@Test
	public void RoleIdentifierTest6() throws UnsupportedEncodingException {
                String sentence = "Thus, reduction of the azido group of 11 by dihydrogen in the presence of palladium black in ethyl acetate afforded the amino-alcohol 13 which could be submitted to acidic hydrolysis of the O-protective groups to give, after purification by ion-exchange chromatography, the targeted aminocyclitol 15 [20] (95% overall yield from 11).";
		RoleIdentifier roleIdent = new RoleIdentifier(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);		
	}

	@Test
	public void RoleIdentifierTest7() throws UnsupportedEncodingException {
                String sentence = "In our previous exploratory experiments we have demonstrated that niobium pentachloride promotes Diels-Alder reaction in ethyl acetate solution, between 2-cyclohexenone (2) and cyclopentadiene with high stereoselectivity at -78°C (only the endo adduct was obtained). Motivated by this result we decided to investigate the reactions of various 2-cycloenones 1 – 6 (dienophiles) with cyclopentadiene, in the presence of NbCl5, at different temperatures. Rather surprisingly, however, we found that ethyl acetate as solvent, efficient for 2, did not work with cycloenone 3. By using ethyl ether we obtained good results in both cases, so this work was all performed using ethyl ether as solvent.";


		RoleIdentifier roleIdent = new RoleIdentifier(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);		
	}

	@Test
	public void RoleIdentifierTest8() throws UnsupportedEncodingException {
                String sentence = "To a solution of 2-methyl-cyclohexanone (3.4 g, 30.3 mmol) in 40.0 mL of CCl4 was added 5.3 g of (NBS) N-bromo-succicinimide (30.0 mmol). The mixture was stirred and refluxed for 4 h heating with a 200 W tungsten lamp. The reaction was cooled, filtered and the solvent was removed under vacuum. The resulting oil was dissolved in 10.0 mL of anhydrous pyridine and refluxed for 12 h. The mixture was cooled, diluted with water and extracted with ethyl ether (3 × 5.0 mL).";
		RoleIdentifier roleIdent = new RoleIdentifier(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);		
	}
	@Test
	public void RoleIdentifierTest9() throws UnsupportedEncodingException {
                String sentence = "To a solution of niobium pentachloride (0.135 g, 0.5 mmol) in 1.0 mL of anhydrous ethyl ether, maintained at room temperature, reflux or -78°C under nitrogen atmosphere, was added a solution of the cycloenone (1.0 mmol) and cyclopentadiene (5 mmols) in 1.0 mL of anhydrous ethyl ether. The reaction mixture was quenched with a 10% aqueous citric acid solution (2.0 mL, when working at room temperature or reflux) or with a 1:1 solution of water/THF (2.0 mL, when working at -78°C). The mixture was diluted with water (5.0 mL) and solvent (10.0 mL), the organic layer was separated and washed with 5% aqueous sodium bicarbonate (3 × 10.0 mL), saturated brine (2 × 10.0 mL), and dried over anhydrous magnesium sulfate. The solvent was removed under vacuum and the products were purified by column chromatography through silica gel using mainly a mixture of hexane and ethyl acetate (9.5:0.5) as eluent.";


		RoleIdentifier roleIdent = new RoleIdentifier(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);		
	}
	@Test
	public void RoleIdentifierTest10() throws UnsupportedEncodingException {
                String sentence = "Cocrystals of 5-nitrouracil with solvent molecules, dioxane, pyridine, DMSO, formamide and ethanol as well as with piperazine, N,N'-dimethylpiperazine, 3-aminopyridine and diazabicyclo [2.2.2]octane obtained by deliberate inclusion, have been examined by X-ray crystallography. The tape structure found in the parent centric form of nitrouracil is retained with some modifications in the cocrystals with dioxane, piperazine, diazabicyclo [2.2.2]octane, N,N'-dimethylpiperazine, pyridine and DMSO, with the guest molecules forming alternate tapes. In cocrystals involving formamide, ethanol and 3-aminopyridine, the molecular tapes exhibit mixed compositions. The observed bonding patterns have been classified into six schemes. Interestingly, quadruple type hydrogen bonding patterns are seen in cocrystals containing 3-aminopyridine or ethanol and water, while a network of acyclic tetrahedral pentamers of water is found in the cocrystal containing diazabicyclo [2.2.2]octane and water.";

		RoleIdentifier roleIdent = new RoleIdentifier(sentence);
		HashMap<String, String> identifiedRoles = roleIdent.getRoles();
		System.out.println(identifiedRoles);		
	}

}
