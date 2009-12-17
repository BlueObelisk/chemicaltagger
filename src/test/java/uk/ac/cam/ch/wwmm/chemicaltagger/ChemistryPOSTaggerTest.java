package uk.ac.cam.ch.wwmm.chemicaltagger;





import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;


/***********************
 *
 * @author lh359
 *
 * Test case for POSTagger,
 * will fill in later.
 */
public class ChemistryPOSTaggerTest {

   private ChemistryPOSTagger posTagger;

   @Before
   public void setUp(){
	   if (posTagger == null) {
		   posTagger = new ChemistryPOSTagger();
	   }
   }

   @Test
   @Ignore
   public void sentence1() {

        String sentence = "Synthesis of the brown dropwise Hyperbranched Macroligands via Michael Addition of Butyl or Ethyl Acrylate with HPEI. The synthetic procedure for partially EA- or BA-modified HPEI is exemplified for HPEI25K-EA0.79: 1.00 g of HPEI25K (Mn = 2.50 x 104, 23.3 mmol of amine groups) was dissolved in 5.00 mL of THF, and then 2.52 mL (23.3 mmol) of EA was added. The mixture was stirred at room temperature for 24 h and subsequently at 50 C for another 24 h.";
        POSContainer posContainer = posTagger.runTaggers(sentence);
        Assert.assertEquals("NN-SYNTHESIZE Synthesis IN-OF of DT the JJ brown " +
        		"RB dropwise OSCAR-CJ Hyperbranched NNP Macroligands IN-VIA via " +
        		"NNP Michael NN-ADD Addition IN-OF of OSCAR-CM Butyl CC or " +
        		"OSCAR-CM Ethyl OSCAR-CM Acrylate IN-WITH with OSCAR-CM HPEI STOP . " +
        		"DT The JJ synthetic NN-METHOD procedure IN-FOR for RB partially " +
        		"NNP EA- CC or OSCAR-CM BA JJ -modified OSCAR-CM HPEI VBZ is " +
        		"VBN exemplified IN-FOR for JJ HPEI25K-EA0.79: CD 1.00 NN-GRAM g " +
        		"IN-OF of OSCAR-CM HPEI25K -LRB- ( OSCAR-CM Mn SYM = CD 2.50 NN x " +
        		"OSCAR-CD 104 COMMA , CD 23.3 NN-MOL mmol IN-OF of JJ amine NNS groups -RRB- ) " +
        		"VBD was VB-DISSOLVE dissolved IN-IN in CD 5.00 NN-VOL mL IN-OF of " +
        		"OSCAR-CM THF COMMA , CC and RB then CD 2.52 NN-VOL mL -LRB- ( " +
        		"CD 23.3 NN-MOL mmol -RRB- ) IN-OF of NN EA VBD was VB-ADD added STOP . " +
        		"DT The NN-CHEMENTITY mixture VBD was VB-STIR stirred IN at NN-TEMP room " +
        		"NN-TEMP temperature IN-FOR for CD 24 NN-TIME h CC and RB subsequently " +
        		"IN at CD 50 NN C IN-FOR for DT another CD 24 NN-TIME h STOP .",
            posContainer.getTokenTagTupleAsString().trim());
   }

   @Test
   
   public void sentence2() {
        String sentence = "The resulting viscous mixture was slowly added to vigorously stirred MeOH ( ca . 30 mL ) to give a white precipitate of diblock copolymer PNBE- -PSt ";
        posTagger.runTaggers(sentence);
        POSContainer posContainer = posTagger.runTaggers(sentence);
        Assert.assertEquals("DT The NN-CHEMENTITY resulting JJ viscous NN-CHEMENTITY mixture VBD was RB slowly " +
        		"VB-ADD added TO to RB vigorously VB-STIR stirred OSCAR-CM MeOH -LRB- ( MD ca STOP . CD 30 NN-VOL mL " +
        		"-RRB- ) TO to VB-YIELD give DT a JJ white NN-CHEMENTITY precipitate IN-OF of OSCAR-CJ diblock " +
        		"NN-CHEMENTITY copolymer OSCAR-CM PNBE DASH - OSCAR-CM -PSt",
        		posContainer.getTokenTagTupleAsString().trim());
   }

   @Test
   @Ignore
   public void sentence3() {
        String sentence = "Potassium carbonate ( 0.63 g , 4.56 mmol ) and thiophenol ( 0.19 g , 1.69 mmol) were added to the 2-nitrobenzene sulfonamide ( 0.50 g , 1.302)";
        posTagger.runTaggers(sentence);
        POSContainer posContainer = posTagger.runTaggers(sentence);
        Assert.assertEquals("OSCAR-CM Potassium OSCAR-CM carbonate -LRB- ( CD 0.63 NN-GRAM g COMMA , CD 4.56 NN-MOL mmol " +
        		"-RRB- ) CC and OSCAR-CM thiophenol -LRB- ( CD 0.19 NN-GRAM g COMMA , CD 1.69 NN-MOL mmol -RRB- ) " +
        		"VBD were VB-ADD added TO to DT the OSCAR-CM 2-nitrobenzene OSCAR-CM sulfonamide -LRB- ( CD 0.50 " +
        		"NN-GRAM g COMMA , CD 1.302 -RRB- )",
        		posContainer.getTokenTagTupleAsString().trim());
   }

   @Test
   @Ignore
   public void sentence4() {
        String sentence = "Preparation of Sulfonated Poly(phthalazinone ether ether ketone) 7a. To a 25 mL three-necked round-bottomed flask fitted with a Dean-stark trap, a condenser, a nitrogen inlet/outlet, and magnetic stirrer was added bisphthalazinone monomer 4 (0.6267 g, 1 mmol), sulfonated difluoride ketone 5 (0.4223 g, 1 mmol), anhydrous potassium carbonate (0.1935 g, 1.4 mmol), 5 mL of DMSO, and 6 mL of toluene. Nitrogen was purged through the reaction mixture with stirring for 10 min, and then the mixture was slowly heated to 140 °C and kept stirring for 2 h. After water generated was azoetroped off with toluene. The temperature was slowly increased to 175 °C. The temperature was maintained for 20 h, and the viscous solution was cooled to 100 °C followed by diluting with 2 mL of DMSO and, thereafter, precipitated into 100 mL of 1:  1 (v/v) methanol/water. The precipitates were filtered and washed with water for three times. The fibrous residues were collected and dried at 110 °C under vacuum for 24 h. A total of 0.9423 g of polymer 7a was obtained in high yield of 93%.";
        posTagger.runTaggers(sentence);
        POSContainer posContainer = posTagger.runTaggers(sentence);
        Assert.assertEquals("NN-SYNTHESIZE Preparation IN-OF of OSCAR-RN Sulfonated NN-CHEMENTITY Poly(phthalazinone " +
        		"NN ether JJ ether OSCAR-CM ketone -RRB- ) OSCAR-CD 7a STOP . TO To DT a CD 25 NN-VOL mL JJ three-necked " +
        		"JJ round-bottomed NN-APPARATUS flask VB-APPARATUS fitted IN-WITH with DT a NN-CHEMENTITY Dean-stark " +
        		"NN trap COMMA , DT a NN-APPARATUS condenser COMMA , DT a OSCAR-CM nitrogen NN inlet/outlet COMMA , " +
        		"CC and JJ magnetic NN-APPARATUS stirrer VBD was oscar-cj added OSCAR-CM bisphthalazinone " +
        		"NN-CHEMENTITY monomer OSCAR-CD 4 -LRB- ( CD 0.6267 NN-GRAM g COMMA , CD 1 NN-MOL mmol -RRB- ) COMMA , " +
        		"OSCAR-CM sulfonated OSCAR-CM difluoride OSCAR-CM ketone OSCAR-CD 5 -LRB- ( CD 0.4223 NN-GRAM g COMMA , " +
        		"CD 1 NN-MOL mmol -RRB- ) COMMA , OSCAR-CJ anhydrous OSCAR-CM potassium OSCAR-CM carbonate -LRB- ( " +
        		"CD 0.1935 NN-GRAM g COMMA , CD 1.4 NN-MOL mmol -RRB- ) COMMA , CD 5 NN-VOL mL IN-OF of OSCAR-CM DMSO " +
        		"COMMA , CC and CD 6 NN-VOL mL IN-OF of OSCAR-CM toluene STOP . OSCAR-CM Nitrogen VBD was VB-DEGASS purged " +
        		"IN through DT the NN-CHEMENTITY reaction NN-MIXTURE mixture IN-WITH with VB-STIR stirring IN-FOR for " +
        		"CD 10 NN-TIME min COMMA , CC and RB then DT the NN-CHEMENTITY mixture VBD was RB slowly VB-HEAT heated " +
        		"TO to CD 140 CD-UNICODE °C CC and VBD kept VB-STIR stirring IN-FOR for CD 2 NN-TIME h STOP . " +
        		"IN-AFTER After OSCAR-CM water VBD generated VBD was VBN azoetroped IN-OFF off IN-WITH with " +
        		"OSCAR-CM toluene STOP . DT The NN-TEMP temperature VBD was RB slowly VB-INCREASE increased TO to CD 175 " +
        		"NN-TEMP °C STOP . DT The NN-TEMP temperature VBD was VB-HEAT maintained IN-FOR for CD 20 NN-TIME h " +
        		"COMMA , CC and DT the JJ viscous NN-CHEMENTITY solution VBD was VB-COOL cooled TO to CD 100 " +
        		"CD-UNICODE °C VBN followed IN-BY by VB-ADD diluting IN-WITH with CD 2 NN-VOL mL IN-OF of OSCAR-CM DMSO " +
        		"CC and COMMA , RB thereafter COMMA , VB-PRECIPITATE precipitated IN-INTO into CD 100 NN-VOL mL IN-OF of " +
        		"CD 1: OSCAR-CD 1 -LRB- ( NN v/v) OSCAR-CM methanol DASH / OSCAR-CM water STOP . DT The " +
        		"NN-CHEMENTITY precipitates VBD were VB-FILTER filtered CC and VB-WASH washed IN-WITH with OSCAR-CM water " +
        		"IN-FOR for CD three NN-TIMES times STOP . DT The JJ fibrous NN-CHEMENTITY residues VBD were " +
        		"VB-RECOVER collected CC and VB-DRY dried IN at CD 110 NN-TEMP °C IN-UNDER under NN-VACUUM vacuum " +
        		"IN-FOR for CD 24 NN-TIME h STOP . DT A NN-AMOUNT total IN-OF of CD 0.9423 NN-GRAM g IN-OF of " +
        		"NN-CHEMENTITY polymer CD 7a VBD was VB-YIELD obtained IN-IN in JJ high VB-YIELD yield IN-OF of CD 93 " +
        		"NN-PERCENT % STOP .",
        		posContainer.getTokenTagTupleAsString().trim());
   }

   @Test
   @Ignore
   public void sentence5() {
        String sentence = "Synthesis of 3 . A mixture of 2 (1.1 g, 3.6 mmol), zinc oxide (0.160 g, 0.196 mmol) and acetic anhydride (0.37 g, 3.6 mmol) in acetic acid (4.3 g, 72 mmol) was stirred at 30°C for 2 d. The reaction was quenched with saturated NaHCO3, and the mixture was extracted with Et2O. The combined organic layer was washed with H2O and dried over anhydrous Na2SO4. The solvent was removed in vacuo, and the residue was purified by flash column chromatography on silica gel (hexane/Et2OÂ =Â 2/1) to give 0.97 g of 3 as a pale yellow viscous liquid (95%).";
        posTagger.runTaggers(sentence);
        POSContainer posContainer = posTagger.runTaggers(sentence);
        Assert.assertEquals("NN-SYNTHESIZE Synthesis IN-OF of OSCAR-CD 3 STOP . DT A NN-MIXTURE mixture IN-OF of " +
    		"OSCAR-CD 2 -LRB- ( CD 1.1 NN-GRAM g COMMA , CD 3.6 NN-MOL mmol -RRB- ) COMMA , OSCAR-CM zinc " +
    		"OSCAR-CM oxide -LRB- ( CD 0.160 NN-GRAM g COMMA , CD 0.196 NN-MOL mmol -RRB- ) CC and OSCAR-CM acetic " +
    		"OSCAR-CM anhydride -LRB- ( CD 0.37 NN-GRAM g COMMA , CD 3.6 NN-MOL mmol -RRB- ) IN-IN in OSCAR-CM acetic " +
    		"OSCAR-CM acid -LRB- ( CD 4.3 NN-GRAM g COMMA , CD 72 NN-MOL mmol -RRB- ) VBD was VB-STIR stirred IN at " +
    		"NN-TEMP 30°C IN-FOR for CD 2 NN-TIME d STOP . DT The NN-CHEMENTITY reaction VBD was VB-QUENCH quenched " +
    		"IN-WITH with OSCAR-CJ saturated OSCAR-CM NaHCO3 COMMA , CC and DT the NN-CHEMENTITY mixture VBD was " +
    		"VB-EXTRACT extracted IN-WITH with OSCAR-CM Et2O STOP . DT The VBN combined OSCAR-CJ organic " +
    		"NN-CHEMENTITY layer VBD was VB-WASH washed IN-WITH with OSCAR-CM H2O CC and VB-DRY dried IN-OVER over " +
    		"OSCAR-CJ anhydrous OSCAR-CM Na2SO4 STOP . DT The NN-CHEMENTITY solvent VBD was VB-REMOVE removed IN-IN in " +
    		"NN-VACUUM vacuo COMMA , CC and DT the NN-CHEMENTITY residue VBD was VB-PURIFY purified IN-BY by " +
    		"NN-FLASH flash NN-COLUMN column NN-CHROMATOGRAPHY chromatography IN-ON on OSCAR-CM silica " +
    		"NN-CHEMENTITY gel -LRB- ( OSCAR-CM hexane DASH / OSCAR-CM Et2O� NNP � JJ =Â CD 2/1 -RRB- ) TO to " +
    		"VB-YIELD give CD 0.97 NN-GRAM g IN-OF of CD 3 IN-AS as DT a JJ pale JJ yellow JJ viscous NN-STATE liquid " +
    		"-LRB- ( CD 95 NN-PERCENT % -RRB- ) STOP .",
        		posContainer.getTokenTagTupleAsString().trim());
    }

}