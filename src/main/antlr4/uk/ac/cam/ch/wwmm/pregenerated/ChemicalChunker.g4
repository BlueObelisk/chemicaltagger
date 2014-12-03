grammar ChemicalChunker;

options {
    language=Java;
}
tokens{
Sentence,
Unmatched,
NounPhrase,
MultipleApparatus,
DissolvePhrase,
VerbPhrase,
CYCLES,
RATIO,
CITATION,
MIXTURE,
PrepPhrase,
TimePhrase,
RolePrepPhrase,
AtmospherePhrase,
TempPhrase,
AMOUNT,
MASS,
PERCENT,
VOLUME,
MOLAR,
PH,
EQUIVALENT,
YIELD,
APPARATUS,
MULTIPLE,
OSCARCM,
MOLECULE,
UNNAMEDMOLECULE,
QUANTITY,
PROCEDURE,
REFERENCETOCOMPOUND,
CaptionLabel
}



@parser::members {
public boolean isAtTokenPositionZero(TokenStream stream){
	return stream.index()==0;
}

public boolean followedByVBDorVBZthenVBYIELDed(TokenStream stream){
	String nextTokenTypeStr = stream.LT(1).getText();
	if ("VBD".equals(nextTokenTypeStr) || "VBZ".equals(nextTokenTypeStr)){
		String twoAheadTypeStr = stream.LT(3).getText();
		if ("VB-YIELD".equals(twoAheadTypeStr)){
			String twoAheadTokenText = stream.LT(4).getText();
			if (twoAheadTokenText !=null && twoAheadTokenText.toLowerCase().endsWith("ed")){
				return true;
			}
		}
	}
	return false;
}

public boolean cdHasRoleOtherThanIdentifier(TokenStream stream){
	String nextTokenTypeStr = stream.LT(1).getText();
	if (isQuantityUnit(nextTokenTypeStr)){
		return true;//quantity
	}
	if ("NN-TIMES".equals(nextTokenTypeStr)){
		return true;//e.g. washed with the compound 3 times
	}
	if ("COLON".equals(nextTokenTypeStr)){
		String twoAheadTypeStr = stream.LT(3).getText();
		if ("CD".equals(twoAheadTypeStr)){
			String threeAheadTypeStr = stream.LT(5).getText();
			if (!isQuantityUnit(threeAheadTypeStr)){
				return true;//ratio
			}
		}
	}
	return false;
}

public boolean followedByQuantityUnits(TokenStream stream){
	String nextTokenTypeStr = stream.LT(1).getText();
	return isQuantityUnit(nextTokenTypeStr);
}

public boolean isQuantityUnit(String tokenType){
	return ("NN-MOLAR".equals(tokenType) || "NN-AMOUNT".equals(tokenType) ||
			"NN-MASS".equals(tokenType) || "NN-VOL".equals(tokenType) ||
			"NN-EQ".equals(tokenType) || "NN-PERCENT".equals(tokenType));
}

public boolean precededByProduct(TokenStream stream){
	Token previousToken = stream.LT(-1);
	if (previousToken !=null && previousToken.getText().equalsIgnoreCase("product")){
		return true;
	}
	return false;
}

public boolean suitableVbYieldOrSynthesizeForReference(TokenStream stream){
	Token nextTokenType = stream.LT(1);
	if ("VB-YIELD".equals(nextTokenType.getText()) || "VB-SYNTHESIZE".equals(nextTokenType.getText())){
		String nextTokenText = stream.LT(2).getText();
		if (nextTokenText !=null && nextTokenText.toLowerCase().endsWith("ed")){
			return true;
		}
	}
	return false;
}

public boolean nextIsSemiColon(TokenStream stream){
	Token nextTokenType = stream.LT(1);
	if ("STOP".equals(nextTokenType.getText())){
		String nextTokenText = stream.LT(2).getText();
		if (nextTokenText !=null && nextTokenText.equals(";")){
			return true;
		}
	}
	return false;
}

public boolean notFollowedByBracketedYear(TokenStream stream){
	Token nextTokenType = stream.LT(1);
	if ("-LRB-".equals(nextTokenType.getText())){
		Token nextNextTokenType = stream.LT(3);
		if ("CD".equals(nextNextTokenType.getText())){
			String nextNextTokenText = stream.LT(4).getText();
			if (nextNextTokenText !=null){
				try{
					int i = Integer.parseInt(nextNextTokenText);
					if (i >1000){
						return false;
					}
				}
				catch (NumberFormatException e) {
				}
			}
		}
	}
	return true;
}
}

WS :  (' ')+ {skip();};
TOKEN : (~' ')+;



document: sentence* EOF;

sentence: (procedureNounPhrase | (sentenceStructure|unmatchedPhrase)+) stop*;

sentenceStructure:  (nounphrase|verbphrase|prepphrase|prepphraseAfter)+ (advAdj|colon)* (conjunction|rbconj|comma)*;

unmatchedPhrase
	:	 unmatchedToken;

unmatchedToken //all base tokens other than stop
	:	(numeric|advAdj|tmunicode|cdunicode|jjcomp|inAll|
	nnexample|nnstate|nntime|nnmass|nnmolar|nnamount|nnatmosphere|nneq|nnvol|nnchementity|nntemp|nnph|nnflash|nngeneral|nnmethod|nnpressure|nncolumn|nnchromatography|nnvacuum|nncycle|nntimes|
	oscarcm|oscarase|verb|nnadd|nnmixture|nnapparatus|nnconcentrate|nndry|nnextract|nnfilter|nnprecipitate|nnpurify|nnremove|nnsynthesize|nnyield|colon|apost|neg|dash|percentsign|lsqb|rsqb|lrb|rrb|
	cc|dt|dtTHE|fw|md|nn|nns|nnp|prp|prp_poss|rbconj|sym|uh|clause|comma|ls|nnps|pos|nnidentifier);

procedureNounPhrase //only allowed at the start of the document
	: {isAtTokenPositionZero(_input)}? headingProcedure;

headingProcedure
	: headingProcedureRequiringTerminator headingProcedureTerminators | bracketedHeadingProcedure headingProcedureTerminators?;

headingProcedureRequiringTerminator
	: (nnidentifier|numeric);

bracketedHeadingProcedure
	: (bracketedIdentifier | bracketedNumeric | squareBracketedReference);
	
	

headingProcedureTerminators
	: rrb|stop|colon;

nounphrase
	:	nounphraseStructure;

nounphraseStructure
	:	nounphraseStructure1|nounphraseStructure2;
nounphraseStructure1
	:	 multiApparatus;
nounphraseStructure2
	:	dtTHE? dt? nounphraseContent  (conjunction* nounphraseContent {!followedByVBDorVBZthenVBYIELDed(_input)}?)* (prepphraseOf| prepphraseIN)? ;

nounphraseContent
	: advAdj*  (dissolvePhrase|ratioOrBracketedRatio|noun|numeric|bracketedContent)+;

dissolvePhrase
	:	(dissolveStructure|lrb dissolveStructure rrb);

dissolveStructure
	:	adj? (nnp nnchementity |nnp?(molecule|unnamedmolecule)) inMolecule (conjunction molecule)* ;

inMolecule
	: inin dtTHE? adj? nnp? (molecule|unnamedmolecule);

verbphrase
	:	verbphraseStructure;
//Would this be better written in terms of auxillary verbs and normal verbs? e.g. auxillary+ verb?
verbphraseStructure :  dt? to? inAll? inafter? md* rbconj? adv* adj? (actionVerb md* adv* adj? neg?  | otherVerb md* adv* adj? neg? otherVerbStructure* actionVerbStructure?) inoff? (cc? comma? prepphrase)* ;

actionVerbStructure: md* rbconj? adv* adj? actionVerb md* adv* adj? neg? ;
otherVerbStructure: md* rbconj? adv* adj? otherVerb md* adv* adj? neg? ;

verb: actionVerb | otherVerb;
actionVerb : vbadd|vbcharge|vbcontain|vbdilute|vbdrop|vbfill|vbtreat|vbapparatus|vbconcentrate|vbcool|vbdegass|degassMultiVerb|vbsubject|vbdissolve|vbdry|vbextract|vbfilter|vbheat|vbincrease|vbsubmerge|vbpartition|vbprecipitate|vbpurify|vbquench|vbrecover|vbremove|vbstir|vbsynthesize|vbwait|vbwash|vbyield;
otherVerb : vb|vbd|vbg|vbn|vbp|vbz|vbchange|vbimmerse|vbsuspend|vbuse;

degassMultiVerb
	:	vbdegass cc vbfill;

noun 	:	nounStructure (dash nounStructure)*;

nounStructure :  prp|prp_poss|captionLabel|nnplabel|citation|cycles|molecule|apparatus|unnamedmolecule|nnstate|procedureNode|nn|nns|nnp|nnadd|preparationphrase|nnexample|range|nntime|nnatmosphere|tmunicode|quantity|nnchementity|nntemp|nnph|nnflash|nngeneral|nnamount|nneq|nnpressure|nncolumn|nnchromatography|nnvacuum|nncycle|nntimes|nnconcentrate|nnvol|nnpurify|nnsynthesize|nnmixture|squareBracketedReference|nndry|nnextract|nnfilter|nnprecipitate|nnremove|nnyield|fw|sym|clause|ls|nnps|pos|oscarase;

// Different PrepPhrases

prepphrase
	: 	neg? (prepphraseAtmosphere|prepphraseTime|prepphraseTemp|prepphraseIN|prepphraseRole|prepphraseOther)  ;

prepphraseAtmosphere
	: prepphraseAtmosphereContent;

prepphraseAtmosphereContent
	:inunder  dt? advAdj* molecule nnatmosphere?	;

prepphraseTime
	:prepPhraseTimeStructure;

prepPhraseTimeStructure
	:advAdj* inAll?  dt? advAdj* cd? nntime+	;

prepphraseTemp:  prepphraseTempContent;

prepphraseTempContent
	:  advAdj? inAll? dt? advAdj? cd? nntemp+;

prepphraseIN
	:inin molecule;

prepphraseRole
	:inas dt? nnchementity;

prepphraseOther
	: advAdj* inMost+  nounphrase;

prepphraseOf
	: inof  nounphrase;

prepphraseAfter
	:  advAdj? inafter  nounphrase ;

preparationphrase
	: vbsynthesize inas (nnexample cd| prepphrase)	;

multiApparatus
	:	apparatus (conjunction* apparatus )*;
apparatus
	:	dt? preapparatus* nnApp+;

nnApp
	:	nnapparatus+ (dash nnapparatus)*;
preapparatus
	:    (quantity|adj|nnpressure|nnadd|molecule|nnchementity|nnstate|nn)+ ;

oscarCompound :  (jjcomp|adj)* oscarCompoundStructure adj? nnstate? (numericReferenceOrQuantity | nnchementity )? quantity* fromProcedure?;

oscarCompoundStructure: (oscarcm+ afterOscarCompoundStructure? | bracketedOscarCompoundStructure); 
afterOscarCompoundStructure: (dash oscarcm+)+ dash?|(colon oscarcm+)+ (colon oscarcm+)+|(dash|apost)+;
bracketedOscarCompoundStructure :	lrb  oscarcm+ rrb;

molecule
	:  moleculeamount;

moleculeamount : (moleculeamount3| moleculeamount1 | moleculeamount2) asAstate? ;

moleculeamount3
	:(quantity|bracketedContentInMol)+ inof (dtTHE | dt)? ratioOrBracketedRatio bracketedContentInMol? oscarCompound ;

moleculeamount1
	:(nnchementity | nnstate)? (quantity|bracketedContentInMol)+ inof (quantity inof?)? (dtTHE | dt)? oscarCompound+ afterCompoundCitationOrQuantity;

moleculeamount2
	:(quantity|bracketedContentInMol)* oscarCompound+ afterCompoundCitationOrQuantity;

afterCompoundCitationOrQuantity: (citation|quantity|comma (quantity1Node|citationStructure)|bracketedContentInMol)*;

unnamedmolecule
	: unnamedmoleculeDescription ;

unnamedmoleculeDescription
	:	unnamedmoleculeDescriptionStart afterCompoundCitationOrQuantity asAstate?;

unnamedmoleculeDescriptionStart
	:	quantityOf (potentialUnnamedMoleculeAmount1 | potentialUnnamedMoleculeAmount2 | definiteUnnamedMolecule ) | potentialUnnamedMoleculeAmount2 | definiteUnnamedMolecule;

quantityOf
	:	quantity+ inof? (dtTHE | dt)?;

potentialUnnamedMoleculeAmount1
	: potentialUnnamedMolecule quantity* asAstate? fromProcedure?;

potentialUnnamedMoleculeAmount2
	: (numberCompoundReference (quantity | asAstate ) | potentialUnnamedMoleculeStructureNN (numericReferenceOrQuantity | asAstate | fromProcedure) ) quantity* asAstate? fromProcedure?;

definiteUnnamedMolecule
	:	definiteUnnamedMoleculeStructure quantity* asAstate? fromProcedure?;

definiteUnnamedMoleculeStructure
	: adj* (nnchementity numericOrIdentifierCompoundReference | jjcomp nnchementity numericReferenceOrQuantity?) | alphanumericOrIdentifierCompoundReference;

potentialUnnamedMolecule
	: numberCompoundReference | potentialUnnamedMoleculeStructureNN numericReferenceOrQuantity?  ;

potentialUnnamedMoleculeStructureNN
	:	(jj|jjchem|oscarcj|jjcomp)* (nnstate|referenceToExampleCompound|nnatmosphere|nnmixture|oscarase) | (jj|jjchem|oscarcj)* nnchementity;

//This rule is neccesary as otherwise the parser will greedily split up a quantity into a reference and unmatched unit
numericReferenceOrQuantity
	:	quantity | numericOrIdentifierCompoundReference;

asAstate
	: inas dt? (jj|jjchem|oscarcj)* nnstate quantity*;

alphanumericOrIdentifierCompoundReference
  : allIdentifierTypesOtherThanCD; 

numberCompoundReference
  : (cd {!cdHasRoleOtherThanIdentifier(_input)}?) ;

numericOrIdentifierCompoundReference
  : allIdentifierTypes ;

captionLabel
   : captionLabelContent+ ;
captionLabelContent
   : (nnplabel allIdentifierTypes (conjunction allIdentifierTypes)*);

quantity 	:  (quantity1Node|quantity2Node);

quantity1Node : quantity1 ;

quantity1
	: lrb measurements (comma  measurements)* (comma preparationphrase)* (stop preparationphrase)*  rrb;

quantity2Node : quantity2 ;

quantity2
	:  measurements (comma  measurements)*  ;

measurements
	:(cd nn)? (multiple|measurementtypes) dt?;
multiple	: cd cdunicode measurementtypes? ;
measurementtypes
	: molar|amount|mass|volume|logHydrogenActivity|equivalent|yield|percent;

molar	: cd nnmolar ;
amount	: cd nnamount; 
mass	: cd nnmass;
volume	: cd nnvol ;
logHydrogenActivity	: nnph sym? cd ;
equivalent: cd nneq ;
yield: yield1 ;
yield1: nnyield (inof|colon) percent;
yield2: percent nnyield ;
percent	: cd nn? percentsign ( dash cd percentsign)? ;

//Different expressions are needed in and outside molecules as within a molecule other "molecules" are likely to be synoymns rather than entities in their own right
bracketedContent: ratio?  (bracketedContent1|bracketedContent2|bracketedContent3) ;
bracketedContent1: comma lrb bracketedContentContents rrb comma;
bracketedContent2: lrb bracketedContentContents rrb;
bracketedContent3: lsqb bracketedContentContents rsqb;
bracketedContentContents: (verb|noun|bracketedContent|md|percentsign|dash|inAll|ratio|conjunction|adj|colon|stop|numeric)+;

bracketedContentInMol: ratio?  (bracketedContentInMolStructure1|bracketedContentInMolStructure2); 
bracketedContentInMolStructure1: comma bracketedContentInMolStructure2 comma;
bracketedContentInMolStructure2: lrb bracketedContentInMolContents1 bracketedContentInMolContents2* rrb|lsqb bracketedContentInMolContents1 bracketedContentInMolContents2* rsqb;
bracketedContentInMolContents1: numberCompoundReference (comma | colon | {nextIsSemiColon(_input)}? stop)|bracketedContentInMolContentsAlwaysAllowed;
bracketedContentInMolContents2: cc | bracketedContentInMolContentsAlwaysAllowed ;
bracketedContentInMolContentsAlwaysAllowed: verb|quantity2Node|oscarCompound|alphanumericOrIdentifierCompoundReference|ratio|cd|md|percentsign|dash|inAll|comma|adj|colon|stop|noun|bracketedContentInMol;

fromProcedure: (infrom | {precededByProduct(_input)}? inof | {suitableVbYieldOrSynthesizeForReference(_input)}? (vbyield|vbsynthesize) (inin|inby|infrom)) procedureNode;

procedureNode: method ;

method:
    ((nngeneral|nn)? nnmethod allIdentifierTypes? | nnexample allIdentifierTypes) ( (comma |colon |inof | infrom)? submethod | lrb submethod rrb)*;

submethod : (nnmethod|nnexample) allIdentifierTypes;

referenceToExampleCompound :
	nnexample allIdentifierTypes ;

advAdj
	:adv|adj;

range: numeric dash numeric;
cycles	:	cycleStructure ;
cycleStructure	:	cd dashNN? nncycle;
dashNN	:	(adj|nn|cd) (dash (adj|nn|cd))*;

ratioOrBracketedRatio : lrb ratio rrb | ratio;
ratio : cdRatio ;
cdRatio : cd (colon cd {!followedByQuantityUnits(_input)}?)+;

citation:  citationStructure|comma citationContent comma;

citationStructure:  citationContent ;
citationContent:   lrb (nnp|fw|cd|conjunction) (nnp|fw|cd|conjunction)+ rrb ;


allIdentifierTypes : allIdentifierTypesOtherThanCD | cd {!cdHasRoleOtherThanIdentifier(_input)}?;
allIdentifierTypesOtherThanCD : squareBracketedReference|identifierOrBracketedIdentifier|cdAlphanum|{notFollowedByBracketedYear(_input)}?bracketedNumeric;
numericOrBracketedNumeric	:  numeric | bracketedNumeric;
bracketedNumeric	:  lrb numeric rrb;
squareBracketedReference :	lsqb numeric rsqb;
identifierOrBracketedIdentifier : cd? nnidentifier | bracketedIdentifier;
bracketedIdentifier	:  lrb cd? nnidentifier rrb;

adj	:	jj|jjr|jjs|jjchem|oscarcj|oscarrn;
adv	:	rb|rbr|rp|rbs;
clause	:	wdt|wp_poss|wrb|ex|pdt|wp;
conjunction :	cc|comma;
inAll	: in|inafter|inas|inbefore|inby|infor|infrom|inin|ininto|inof|inoff|inon|inover|inunder|invia|inwith|inwithout|to;
inMost	: in|inas|inbefore|inby|infor|infrom|inin|ininto|inof|inoff|inon|inover|inunder|invia|inwith|inwithout|to;
numeric : cd|cdAlphanum;


//Tags---Pattern---Description

nnplabel:'NNP-LABEL' TOKEN ;

cdAlphanum:'CD-ALPHANUM' TOKEN ;
oscarcj:'OSCAR-CJ' TOKEN ;
oscarrn:'OSCAR-RN' TOKEN ;
oscarase:'OSCAR-ASE' TOKEN ;
tmunicode:'TM-UNICODE' TOKEN ;
cdunicode:'CD-UNICODE' TOKEN ;
jjchem:'JJ-CHEM' TOKEN ;
jjcomp:'JJ-COMPOUND' TOKEN ;
// Prepositions
inas:'IN-AS' TOKEN; 
inbefore:'IN-BEFORE' TOKEN ;
inafter:'IN-AFTER' TOKEN ; 
inin:'IN-IN' TOKEN ;
ininto:'IN-INTO' TOKEN ;
inwith:'IN-WITH' TOKEN ;
inwithout:'IN-WITHOUT' TOKEN ;
inby:'IN-BY' TOKEN ;
invia:'IN-VIA' TOKEN ;
inof:'IN-OF' TOKEN ;
inon:'IN-ON' TOKEN ;
infor:'IN-FOR' TOKEN ;
infrom:'IN-FROM' TOKEN ;
inunder:'IN-UNDER' TOKEN ; 
inover:'IN-OVER' TOKEN ;
inoff:'IN-OFF' TOKEN ;

//Modified Nouns
nnstate:'NN-STATE' TOKEN ;
nntime:'NN-TIME' TOKEN ;
nnmass:'NN-MASS' TOKEN ;
nnamount:'NN-AMOUNT' TOKEN ;
nnmolar:'NN-MOLAR' TOKEN ;
nnatmosphere:'NN-ATMOSPHERE' TOKEN ;
nneq:'NN-EQ' TOKEN ;
nnvol:'NN-VOL' TOKEN ;
nnchementity:'NN-CHEMENTITY' TOKEN ;
nntemp:'NN-TEMP' TOKEN ;
nnph:'NN-PH' TOKEN ;
nnflash:'NN-FLASH' TOKEN ; 
nngeneral:'NN-GENERAL' TOKEN ;
nnmethod:'NN-METHOD' TOKEN ;
nnpressure:'NN-PRESSURE' TOKEN ;
nncolumn:'NN-COLUMN' TOKEN ;
nnchromatography:'NN-CHROMATOGRAPHY' TOKEN ;
nnvacuum:'NN-VACUUM' TOKEN ;
nncycle:'NN-CYCLE' TOKEN ;
nntimes:'NN-TIMES' TOKEN ;
nnexample:'NN-EXAMPLE' TOKEN ; 

//A word of a chemical identified by OSCAR
oscarcm:'OSCAR-CM' TOKEN ;

//Verbs
vbuse:'VB-USE' TOKEN ;
vbchange:'VB-CHANGE' TOKEN ;
vbsubmerge:'VB-SUBMERGE' TOKEN ;
vbsubject:'VB-SUBJECT' TOKEN ;

//Add Tokens
nnadd:'NN-ADD' TOKEN ;
nnmixture:'NN-MIXTURE' TOKEN ;
vbdilute:'VB-DILUTE' TOKEN ;
vbadd:'VB-ADD' TOKEN ;
vbcharge:'VB-CHARGE' TOKEN ;
vbcontain:'VB-CONTAIN' TOKEN ;
vbdrop:'VB-DROP' TOKEN ;
vbfill:'VB-FILL' TOKEN ;
vbsuspend:'VB-SUSPEND' TOKEN ;
vbtreat:'VB-TREAT' TOKEN ;

//Apparatus Tokens
vbapparatus:'VB-APPARATUS' TOKEN ;
nnapparatus:'NN-APPARATUS' TOKEN ;

//Concentrate Tokens
vbconcentrate:'VB-CONCENTRATE' TOKEN ;
nnconcentrate:'NN-CONCENTRATE' TOKEN ;

//Cool Tokens
vbcool:'VB-COOL' TOKEN ;

//Degass Tokens
vbdegass:'VB-DEGASS' TOKEN ;

//Dissolve Tokens
vbdissolve:'VB-DISSOLVE' TOKEN ;

//Dry Tokens
vbdry:'VB-DRY' TOKEN ;
nndry:'NN-DRY' TOKEN ;

//Extract Tokens
vbextract:'VB-EXTRACT' TOKEN ;
nnextract:'NN-EXTRACT' TOKEN ;

//Filter Tokens
vbfilter:'VB-FILTER' TOKEN ; 
nnfilter:'NN-FILTER' TOKEN ;

//Heat Tokens
vbheat:'VB-HEAT' TOKEN ;
vbincrease:'VB-INCREASE' TOKEN ;

//Immerse tokens
vbimmerse:'VB-IMMERSE' TOKEN ;

//Partition Tokens
vbpartition:'VB-PARTITION' TOKEN ;

//Precipitate Tokens
vbprecipitate:'VB-PRECIPITATE' TOKEN ;
nnprecipitate:'NN-PRECIPITATE' TOKEN ;

//Purify Tokens
vbpurify:'VB-PURIFY' TOKEN ;
nnpurify:'NN-PURIFY' TOKEN ;

//Quench Tokens
vbquench:'VB-QUENCH' TOKEN ;

//Recover Tokens
vbrecover:'VB-RECOVER' TOKEN ;

//Remove Tokens
vbremove:'VB-REMOVE' TOKEN ;
nnremove:'NN-REMOVE' TOKEN ;

//Stir Tokens
vbstir:'VB-STIR' TOKEN ;

//Synthesize Tokens
vbsynthesize:'VB-SYNTHESIZE' TOKEN ; 
nnsynthesize:'NN-SYNTHESIZE' TOKEN ;

//Wait Tokens
vbwait:'VB-WAIT' TOKEN ;

//Wash Tokens
vbwash:'VB-WASH' TOKEN ;

//Yield Tokens
vbyield:'VB-YIELD' TOKEN ;

//Yield Tokens
nnyield:'NN-YIELD' TOKEN ;

//Misc Tokens mainly to replace characters that are not markup friendly
// Conjunctive Adverbs
rbconj:'RB-CONJ' TOKEN  ;
colon:'COLON' TOKEN ;
comma:'COMMA' TOKEN ;
apost:'APOST' TOKEN ;
neg:'NEG' TOKEN ;
dash:'DASH' TOKEN ;
stop:'STOP' TOKEN ;
percentsign:'NN-PERCENT' TOKEN ;
lsqb:'LSQB' TOKEN ;
rsqb:'RSQB' TOKEN ;

nnidentifier:'NN-IDENTIFIER' TOKEN ;

//The determiner 'the';
dtTHE:'DT-THE' TOKEN ;

lrb:'-LRB-' TOKEN ;
rrb:'-RRB-' TOKEN ;

//Penn Treebank Tokens

// Coordinating conjunction (and, or)
cc:'CC' TOKEN ;

// Cardinal numeral (one, two, 2, etc.)
cd:'CD' TOKEN ;

// Singular determiner/quantifier (this, that)
dt:'DT' TOKEN ;

// Existential there
ex:'EX' TOKEN ;

// Foreign word (hyphenated before regular tag)
fw:'FW' TOKEN ;

// Preposition
in:'IN' TOKEN ;

// Adjective
jj:'JJ' TOKEN ;

// Comparative adjective
jjr:'JJR' TOKEN ;

// Semantically superlative adjective (chief, top)
jjs:'JJS' TOKEN ;

// List item marker
ls:'LS' TOKEN ;

// Modal auxiliary (can, should, will)
md:'MD' TOKEN ;

// Singular or mass noun
nn:'NN' TOKEN ;

// Plural noun
nns:'NNS' TOKEN ;

// Proper noun or part of name phrase
nnp:'NNP' TOKEN ;

// Proper noun, plural
nnps:'NNPS' TOKEN ;

//Predeterminer
pdt:'PDT' TOKEN ;

// Possessive ending
pos:'POS' TOKEN  ;

//Personal pronoun
prp:'PRP' TOKEN  ;

//Possessive pronoun
prp_poss:'PRP$' TOKEN ;

// Adverb
rb:'RB' TOKEN ;

// Comparative adverb
rbr:'RBR' TOKEN ;

// Superlative adverb
rbs:'RBS' TOKEN ;

// Adverb/particle (about, off, up)
rp:'RP' TOKEN ;

// Symbol
sym:'SYM' TOKEN ;

// Infinitive marker to
to:'TO' TOKEN  ;

// Interjection, exclamation
uh:'UH' TOKEN ;

// Verb, base form
vb:'VB' TOKEN ;

// Verb, past tense
vbd:'VBD' TOKEN ;

// Verb, present participle/gerund
vbg:'VBG' TOKEN ;

// Verb, past participle
vbn:'VBN' TOKEN ;

// Verb, non-3rd person singular present
vbp:'VBP' TOKEN ;

// Verb, 3rd. singular present
vbz:'VBZ' TOKEN ;

// Wh- determiner (which, that)
wdt:'WDT' TOKEN ;

// wh- pronoun (what, who, whom)
wp:'WP' TOKEN ;

// Possessive wh- pronoun (whose)
wp_poss:'WP$' TOKEN ;

// Wh- adverb (how, where, when)
wrb:'WRB' TOKEN ;
