package uk.ac.cam.ch.wwmm.chemicaltagger;

/**************************************
 * An interface for tokenisers.
 * @author lh359
 *
 */
public interface ChemicalTaggerTokeniser {
    /****************************
     * Tokeniser method.
     * @param posContainer (POSContainer)
     * @return posContainer  (POSContainer)
     */
	POSContainer tokenise(POSContainer posContainer) ;
	
}
