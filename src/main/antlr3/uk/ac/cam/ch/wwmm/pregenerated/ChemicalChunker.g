grammar ChemicalChunker;

options {
    language=Java;
    output = AST;
   backtrack= true;

}
tokens{
Sentence;
Unmatched;
NounPhrase;
MultipleApparatus;
DissolvePhrase;
VerbPhrase;
CYCLES;
RATIO;
CITATION;
MIXTURE;
PrepPhrase;
TimePhrase;
RolePrepPhrase;
AtmospherePhrase;
TempPhrase;
AMOUNT;
MASS;
PERCENT;
VOLUME;
MOLAR;
APPARATUS;
MULTIPLE;
OSCARCM;
MOLECULE;
UNNAMEDMOLECULE;
QUANTITY;
}

	
@header {
    package uk.ac.cam.ch.wwmm.pregenerated;
 }
@lexer::header {package uk.ac.cam.ch.wwmm.pregenerated;}

WS	:	 (' '|'\t')+ {skip();};
NEWLINE	:	'\r'? '\n';

fragment ACHAR	:	('A'..'Z') | ('a'..'z');

// fragment ACHAR : ~('\\'|'"') ; 

fragment DIGIT	: ('0'..'9');
fragment UNICODE	:  '\u00A0'..'\ufffe';

//TOKEN	:	(ACHAR|DIGIT|UNICODE)+;
TOKEN : (ACHAR|'?'|';'| '_'|',' |'.'|')'|'('|'/'|'-'|'='|':'|'%'|'\''|'{'|'}'|'['|']'|'>'|'<'|'@'|'+'|'|'|DIGIT|UNICODE)+;



document: sentences+-> ^(Sentence  sentences )+ ;

sentences:  (sentenceStructure|unmatchedPhrase)+    (comma|stop)*;

sentenceStructure:  (nounphrase|verbphrase|prepphrase|prepphraseAfter)+ (advAdj|colon) * (conjunction|rbconj)*;


unmatchedPhrase
	:	 unmatchedTokens -> ^(Unmatched unmatchedTokens)+;
	
unmatchedTokens
	:	(fw|noun|tmunicode|verb|inAll|dt|dtTHE|oscarcd|oscarcm|oscarrn|oscaront|brackets|sym|colon|md|neg|number|comma|advAdj|rbconj|reference);	


nounphrase
	:	nounphraseStructure ->  ^(NounPhrase  nounphraseStructure);	
	

nounphraseStructure 
	:	nounphraseStructure1|nounphraseStructure2;
nounphraseStructure1
	:	 multiApparatus ->  ^(MultipleApparatus multiApparatus);		
nounphraseStructure2 
	:	dtTHE? dt? advAdj*  (dissolvePhrase|noun|number|ratio)+    (conjunction* advAdj* (dissolvePhrase|noun|number|ratio) )*   ((prepphraseOf| prepphraseIN) dissolvePhrase?)*  ;
dissolvePhrase 
	:	(dissolveStructure1|dissolveStructure2|dissolveStructure3) ->  ^(DissolvePhrase dissolveStructure1? dissolveStructure2? dissolveStructure3?);

dissolveStructure1
	:	lrb adj? nnp? (molecule|unnamedmolecule) (inin dtTHE? adj? nnp? (molecule|unnamedmolecule) (conjunction molecule)*)+ rrb ;
dissolveStructure2
	:	adj? nnp? (molecule|unnamedmolecule) (inin dtTHE? adj? nnp? (molecule|unnamedmolecule) (conjunction molecule)*)+ ;

dissolveStructure3
	:	adj? nnp (molecule|unnamedmolecule|nnchementity) (inin dtTHE? adj? nnp? (molecule|unnamedmolecule) (conjunction molecule)*)+ ;


conjunction 
	:	 cc|comma;




verbphrase
	:	verbphraseStructure ->  ^(VerbPhrase  verbphraseStructure);
verbphraseStructure :  dt? to? inAll? inafter? (md* rbconj? adv* adj? verb+ md* adv* adj? neg? )+ inoff? (cc? comma? prepphrase)*   ;
verb : vb|vbp|vbg|vbd|vbz|vbn|vbuse|vbsubmerge|vbimmerse|degassMultiVerb|vbsubject|vbadd|vbdilute|vbcharge|vbcontain|vbdrop|vbfill|vbsuspend|vbtreat|vbapparatus|vbconcentrate|vbcool|vbdegass|vbdissolve|vbdry|vbextract|vbfilter |vbheat|vbincrease|vbpartition|vbprecipitate|vbpurify|vbquench|vbrecover|vbremove|vbstir|vbsynthesize|vbwait|vbwash|vbyield|vbchange;

degassMultiVerb
	:	vbdegass cc vbfill;
number : cd|oscarcd|oscarcpr;	
clause	:	wdt|wp_poss|wpo|wpo|wps|wql|wrb|ex|pdt;
noun 	:	nounStructure (dash nounStructure)*;

nounStructure :  prp|prp_poss|citation|cycles|molecule|apparatus|mixture|unnamedmolecule|nnyield|nnstate|nn|nns|nnp|nnadd|preparationphrase|nnexample|oscarcpr|range|amount|nntime|nnatmosphere|tmunicode|nneq|quantity|nnchementity|measurements|nntemp|nnflash|nngeneral|nnmethod|nnamount|nnpressure|nncolumn|nnchromatography|nnvacuum|nncycle|nntimes|nnconcentrate|nnvol|nnpurify|wdt|wp_poss|wpo|wps|nnsynthesize|nnmixture|reference|oscaront|nndry|number|oscarCompound|nnextract|nnfilter|nnprecipitate|nnremove|fw|fwin|sym|clause;
range: number dash number;
cycles	:	cycleStructure -> ^(CYCLES cycleStructure)  ;
cycleStructure	:	cd dashNN? nncycle;  
dashNN	:	(adj|nn|cd) (dash (adj|nn|cd))*;  
ratio : (numberratio|nounratio) -> ^(RATIO numberratio? nounratio?)  ;
numberratio	:	 cd (colon oscarcd|cd)+ ;
nounratio 
	:	 noun  (colon noun)+  ;

reference 
	:	lsqb cd rsqb;
citation: (citationStructure1|citationStructure2) -> ^(CITATION  citationStructure1? citationStructure2?);

citationStructure1:  lrb citationContent rrb;
citationStructure2: comma lrb citationContent rrb comma;
citationContent:   (nnp|fw|cd|conjunction) (nnp|fw|cd|conjunction)+ ;

mixture: mixtureRatio?  (mixtureStructure3|mixtureStructure2|mixtureStructure1) -> ^(MIXTURE   mixtureRatio? mixtureStructure3? mixtureStructure2? mixtureStructure1?);
mixtureStructure2: comma lrb mixtureContent rrb comma;
mixtureStructure1: lrb mixtureContent rrb;
mixtureStructure3
	:	lrb  nnpercent rrb;
	
mixtureRatio 
	:	cd colon (cd|oscarcd);
mixtureContent:   (fw|verb|nn|measurements|md|nnpercent|stop|oscarCompound|molecule|unnamedmolecule|dash|sym|cd|noun|inof|inAll|cd|comma|adj|colon|stop) (minimixture|fw|verb|measurements|nnyield|md|nnpercent|stop|oscarCompound|molecule|unnamedmolecule|dash|sym|cd|noun|inof|inAll|cd|comma|adj|colon|stop)+ ;

minimixture: (mixtureStructure2|mixtureStructure1) -> ^(MIXTURE  mixtureStructure2? mixtureStructure1?);
minimixtureStructure2: comma lrb mixtureContent rrb comma;
minimixtureStructure1:  lrb mixtureContent rrb;
minimixtureContent:   (fw|nn|verb|measurements|nnpercent|md|stop|oscarCompound|molecule|unnamedmolecule|dash|sym|cd|noun|inof|inAll|cd|comma|adj|colon|stop) (fw|verb|measurements|nnyield|nnpercent|md|stop|oscarCompound|molecule|unnamedmolecule|dash|sym|cd|noun|inof|inAll|cd|comma|adj|colon|stop)+ ;

adj	:	jj|jjr|jjs|jjt|oscarcj|jjchem|oscarrn;
adv	:	rb|rbr|rbt|rp|rbs;
// Different PrepPhrases


prepphrase 
	: 	neg? (prepphraseAtmosphere|prepphraseTime|prepphraseTemp|prepphraseIN|prepphraseRole|prepphraseOther)  ;

advAdj   
	:adv|adj;	
prepphraseOther
	: advAdj* inMost+  nounphrase ->  ^(PrepPhrase  advAdj* inMost+  nounphrase);
prepphraseOf 
	: inof  nounphrase->  ^(PrepPhrase  inof  nounphrase);

prepphraseTime 
	:prepPhraseTimeStructure ->  ^(TimePhrase  prepPhraseTimeStructure);
prepPhraseTimeStructure
	:advAdj* inAll?  dt? advAdj* cd? nntime+	;
	
prepphraseIN 
	:inin molecule ->  ^(PrepPhrase  inin  molecule);

prepphraseRole
	:inas dt? nnchementity ->	^(RolePrepPhrase  inas dt? nnchementity);
prepphraseAtmosphere 
	: prepphraseAtmosphereContent ->  ^(AtmospherePhrase  prepphraseAtmosphereContent ) ;
prepphraseAtmosphereContent
	:inunder  dt? advAdj* molecule nnatmosphere?	;
	
inMost	: in|inas|inbefore|inby|infor|infrom|inin|ininto|inof|inoff|inon|inover|inunder|invia|inwith|inwithout|to;

inAll	: in|inafter|inas|inbefore|inby|infor|infrom|inin|ininto|inof|inoff|inon|inover|inunder|invia|inwith|inwithout|to;
prepphraseTemp:  prepphraseTempContent ->  ^(TempPhrase   prepphraseTempContent);

prepphraseTempContent
	:  advAdj? inAll? dt? advAdj? cd? nntemp+;	
	
prepphraseAfter
	:  advAdj? inafter  nounphrase ->  ^(PrepPhrase  advAdj* inafter  nounphrase);	
	
			
amount	: cd+ nnamount -> ^(AMOUNT   cd+ nnamount );
mass	: cd+ nnmass-> ^(MASS   cd+ nnmass ); 
percent	: number nn? nnpercent -> ^(PERCENT   number nn? nnpercent );
volume	: cd+ nnvol -> ^(VOLUME   cd+ nnvol );
molar	: cd* nnmolar -> ^(MOLAR   cd* nnmolar );

preparationphrase
	: vbsynthesize inas (nnexample cd| prepphrase)	;
	
multiApparatus 
	:	apparatus (conjunction* apparatus )*;	
apparatus
	:	dt? preapparatus* nnApp+-> ^(APPARATUS   dt? preapparatus* nnApp+ );

nnApp 
	:	nnapparatus+ (dash nnapparatus)*;
preapparatus
	:    (quantity|adj|nnpressure|nnadd|molecule|nnchementity|nnstate|nn)+ ;
measurements
	:(cd nn)? (multiple|measurementtypes)    dt?;
multiple	: cd cdunicode measurementtypes? -> ^(MULTIPLE   cd cdunicode measurementtypes? );		
measurementtypes
	: molar|amount|mass|percent|volume ;	

// The RRB at the end is for leftover brackets from chemicals that didn't parse properly
oscarCompound :  adj* (oscarCompound1|oscarCompound2|oscarCompound3|oscarCompound4|oscarcm) adj? reference?;

oscarCompound4 :	lrb  oscarcm rrb -> ^(OSCARCM  lrb  oscarcm  rrb );
oscarCompound3 :	oscarCompound3Structure -> ^(OSCARCM   oscarCompound3Structure );
oscarCompound2 :	oscarCompound2Structure -> ^(OSCARCM   oscarCompound2Structure );
oscarCompound1 :	oscarcm oscarcm+ -> ^(OSCARCM  oscarcm oscarcm+);


oscarCompound3Structure 
	:  oscarcm (dash|apost)+;	 
oscarCompound2Structure 
	:  oscarcm (dash oscarcm)+  dash?;	 
//oscarCompound1 :	oscarcm oscarcm -> ^(OSCARCM  oscarcm oscarcm);
//moleculeamount1
//	:measurements (quantity|mixture)? inof oscarCompound;	
moleculeamount1
	:(quantity|mixture)+ inof oscarCompound mixture?;	

moleculeamount2
	:(quantity|mixture)* oscarCompound+  (citation|quantity|mixture)* ;	


moleculeamount3
	:(quantity|mixture) inof mixtureRatio mixture? oscarCompound ;		
moleculeamount : moleculeamount3|moleculeamount1 | moleculeamount2 ;	
molecule          
	:  moleculeamount-> ^(MOLECULE  moleculeamount );	

//unnamedmoleculeamount1
//	:measurements quantity? inof (oscarcd|cd);	

oscarcdType	:  lrb (oscarcd|cd) rrb;	
unnamedmoleculeamount1
	: quantity inof (oscarcd|cd);
unnamedmoleculeamount2
	:(oscarcd|oscarcdType) (citation|quantity|mixture)*;	
		
//unnamedmoleculeamount3
//	:measurements quantity? inof (jj? noun)+;	

unnamedmoleculeamount3
	:quantity inof (jj? noun)+;	


unnamedmoleculeamount4
	:(quantity|mixture) nnchementity;	

unnamedmoleculeamount5	:
          jjcomp nnchementity oscarcd? (quantity|mixture)* ;	
	
unnamedmoleculeamount
	:(unnamedmoleculeamount5|unnamedmoleculeamount1 | unnamedmoleculeamount2 | unnamedmoleculeamount3|unnamedmoleculeamount4) ;
unnamedmolecule 
	: unnamedmoleculeamount -> ^(UNNAMEDMOLECULE unnamedmoleculeamount);	
		
quantity 	:  (quantity1|quantity2) ->   ^(QUANTITY  quantity1? quantity2?);

quantity1
	: lrb measurements (comma  measurements)* (comma preparationphrase)* (stop preparationphrase)*  rrb;	 

quantity2
	:  measurements (comma  measurements)*  ;
method:
    (nngeneral|nn)? nnmethod (oscarcd|cd)?  ;
    brackets 
    	:	(lrb|rrb|lsqb|rsqb)+;





//Tags---Pattern---Description
oscarcd:'OSCAR-CD' TOKEN -> ^('OSCAR-CD' TOKEN);
oscarcj:'OSCAR-CJ' TOKEN -> ^('OSCAR-CJ' TOKEN);
oscarrn:'OSCAR-RN' TOKEN -> ^('OSCAR-RN' TOKEN);
oscarcpr:'OSCAR-CPR' TOKEN -> ^('OSCAR-CPR' TOKEN);
oscaront:'OSCAR-ONT' TOKEN -> ^('OSCAR-ONT' TOKEN);
tmunicode:'TM-UNICODE' TOKEN -> ^('TM-UNICODE' TOKEN);
cdunicode:'CD-UNICODE' TOKEN -> ^('CD-UNICODE' TOKEN);
jjchem:'JJ-CHEM' TOKEN -> ^('JJ-CHEM' TOKEN);
jjcomp:'JJ-COMPOUND' TOKEN -> ^('JJ-COMPOUND' TOKEN);
// Prepositions
inas:'IN-AS' TOKEN -> ^('IN-AS' TOKEN);
inbefore:'IN-BEFORE' TOKEN -> ^('IN-BEFORE' TOKEN);
inafter:'IN-AFTER' TOKEN -> ^('IN-AFTER' TOKEN);
inin:'IN-IN' TOKEN -> ^('IN-IN' TOKEN);
ininto:'IN-INTO' TOKEN -> ^('IN-INTO' TOKEN);
inwith:'IN-WITH' TOKEN -> ^('IN-WITH' TOKEN);
inwithout:'IN-WITHOUT' TOKEN -> ^('IN-WITHOUT' TOKEN);
inby:'IN-BY' TOKEN -> ^('IN-BY' TOKEN);
invia:'IN-VIA' TOKEN -> ^('IN-VIA' TOKEN);
inof:'IN-OF' TOKEN -> ^('IN-OF' TOKEN);
inon:'IN-ON' TOKEN -> ^('IN-ON' TOKEN);
infor:'IN-FOR' TOKEN -> ^('IN-FOR' TOKEN);
infrom:'IN-FROM' TOKEN -> ^('IN-FROM' TOKEN);
inunder:'IN-UNDER' TOKEN -> ^('IN-UNDER' TOKEN);
inover:'IN-OVER' TOKEN -> ^('IN-OVER' TOKEN);
inoff:'IN-OFF' TOKEN -> ^('IN-OFF' TOKEN);

//Modified Nouns
nnexample:'NN-EXAMPLE' TOKEN -> ^('NN-EXAMPLE' TOKEN);
nnstate:'NN-STATE' TOKEN -> ^('NN-STATE' TOKEN);
nntime:'NN-TIME' TOKEN -> ^('NN-TIME' TOKEN);
nnmass:'NN-MASS' TOKEN -> ^('NN-MASS' TOKEN);
nnmolar:'NN-MOLAR' TOKEN -> ^('NN-MOLAR' TOKEN);
nnamount:'NN-AMOUNT' TOKEN -> ^('NN-AMOUNT' TOKEN);
nnatmosphere:'NN-ATMOSPHERE' TOKEN -> ^('NN-ATMOSPHERE' TOKEN);
nneq:'NN-EQ' TOKEN -> ^('NN-EQ' TOKEN);
nnvol:'NN-VOL' TOKEN -> ^('NN-VOL' TOKEN);
nnchementity:'NN-CHEMENTITY' TOKEN -> ^('NN-CHEMENTITY' TOKEN);
nntemp:'NN-TEMP' TOKEN -> ^('NN-TEMP' TOKEN);
nnflash:'NN-FLASH' TOKEN -> ^('NN-FLASH' TOKEN);
nngeneral:'NN-GENERAL' TOKEN -> ^('NN-GENERAL' TOKEN);
nnmethod:'NN-METHOD' TOKEN -> ^('NN-METHOD' TOKEN);
nnpressure:'NN-PRESSURE' TOKEN -> ^('NN-PRESSURE' TOKEN);
nncolumn:'NN-COLUMN' TOKEN -> ^('NN-COLUMN' TOKEN);
nnchromatography:'NN-CHROMATOGRAPHY' TOKEN -> ^('NN-CHROMATOGRAPHY' TOKEN);
nnvacuum:'NN-VACUUM' TOKEN -> ^('NN-VACUUM' TOKEN);
nncycle:'NN-CYCLE' TOKEN -> ^('NN-CYCLE' TOKEN);
nntimes:'NN-TIMES' TOKEN -> ^('NN-TIMES' TOKEN);

//Not really Oscar-cm.. but need to be fixed
oscarcm:'OSCAR-CM' TOKEN -> ^('OSCAR-CM' TOKEN);

//Verbs
vbuse:'VB-USE' TOKEN -> ^('VB-USE' TOKEN);
vbchange:'VB-CHANGE' TOKEN -> ^('VB-CHANGE' TOKEN);
vbsubmerge:'VB-SUBMERGE' TOKEN -> ^('VB-SUBMERGE' TOKEN);
vbsubject:'VB-SUBJECT' TOKEN -> ^('VB-SUBJECT' TOKEN);

//Add Tokens
nnadd:'NN-ADD' TOKEN -> ^('NN-ADD' TOKEN);
nnmixture:'NN-MIXTURE' TOKEN -> ^('NN-MIXTURE' TOKEN);
vbdilute:'VB-DILUTE' TOKEN -> ^('VB-DILUTE' TOKEN);	
vbadd:'VB-ADD' TOKEN -> ^('VB-ADD' TOKEN);
vbcharge:'VB-CHARGE' TOKEN -> ^('VB-CHARGE' TOKEN);
vbcontain:'VB-CONTAIN' TOKEN -> ^('VB-CONTAIN' TOKEN);
vbdrop:'VB-DROP' TOKEN -> ^('VB-DROP' TOKEN);
vbfill:'VB-FILL' TOKEN -> ^('VB-FILL' TOKEN);
vbsuspend:'VB-SUSPEND' TOKEN -> ^('VB-SUSPEND' TOKEN);
vbtreat:'VB-TREAT' TOKEN -> ^('VB-TREAT' TOKEN);

//Apparatus Tokens
vbapparatus:'VB-APPARATUS' TOKEN -> ^('VB-APPARATUS' TOKEN);
nnapparatus:'NN-APPARATUS' TOKEN -> ^('NN-APPARATUS' TOKEN);

//Concentrate Tokens
vbconcentrate:'VB-CONCENTRATE' TOKEN -> ^('VB-CONCENTRATE' TOKEN);
nnconcentrate:'NN-CONCENTRATE' TOKEN -> ^('NN-CONCENTRATE' TOKEN);

//Cool Tokens
vbcool:'VB-COOL' TOKEN -> ^('VB-COOL' TOKEN);

//Degass Tokens
vbdegass:'VB-DEGASS' TOKEN -> ^('VB-DEGASS' TOKEN);

//Dissolve Tokens
vbdissolve:'VB-DISSOLVE' TOKEN -> ^('VB-DISSOLVE' TOKEN);

//Dry Tokens
vbdry:'VB-DRY' TOKEN -> ^('VB-DRY' TOKEN);
nndry:'NN-DRY' TOKEN -> ^('NN-DRY' TOKEN);

//Extract Tokens
vbextract:'VB-EXTRACT' TOKEN -> ^('VB-EXTRACT' TOKEN);
nnextract:'NN-EXTRACT' TOKEN -> ^('NN-EXTRACT' TOKEN);

//Filter Tokens
vbfilter:'VB-FILTER' TOKEN -> ^('VB-FILTER' TOKEN);
nnfilter:'NN-FILTER' TOKEN -> ^('NN-FILTER' TOKEN);

//Heat Tokens
vbheat:'VB-HEAT' TOKEN -> ^('VB-HEAT' TOKEN);
vbincrease:'VB-INCREASE' TOKEN -> ^('VB-INCREASE' TOKEN);

//Immerse tokens
vbimmerse:'VB-IMMERSE' TOKEN -> ^('VB-IMMERSE' TOKEN);
//Partition Tokens
vbpartition:'VB-PARTITION' TOKEN -> ^('VB-PARTITION' TOKEN);

//Precipitate Tokens
vbprecipitate:'VB-PRECIPITATE' TOKEN -> ^('VB-PRECIPITATE' TOKEN);
nnprecipitate:'NN-PRECIPITATE' TOKEN -> ^('NN-PRECIPITATE' TOKEN);

//Purify Tokens
vbpurify:'VB-PURIFY' TOKEN -> ^('VB-PURIFY' TOKEN);
nnpurify:'NN-PURIFY' TOKEN -> ^('NN-PURIFY' TOKEN);

//Quench Tokens
vbquench:'VB-QUENCH' TOKEN -> ^('VB-QUENCH' TOKEN);

//Recover Tokens
vbrecover:'VB-RECOVER' TOKEN -> ^('VB-RECOVER' TOKEN);

//Remove Tokens
vbremove:'VB-REMOVE' TOKEN -> ^('VB-REMOVE' TOKEN);
nnremove:'NN-REMOVE' TOKEN -> ^('NN-REMOVE' TOKEN);

//Stir Tokens
vbstir:'VB-STIR' TOKEN -> ^('VB-STIR' TOKEN);

//Synthesize Tokens
vbsynthesize:'VB-SYNTHESIZE' TOKEN -> ^('VB-SYNTHESIZE' TOKEN);
nnsynthesize:'NN-SYNTHESIZE' TOKEN -> ^('NN-SYNTHESIZE' TOKEN);

//Wait Tokens
vbwait:'VB-WAIT' TOKEN -> ^('VB-WAIT' TOKEN);

//Wash Tokens
vbwash:'VB-WASH' TOKEN -> ^('VB-WASH' TOKEN);

//Yield Tokens
vbyield:'VB-YIELD' TOKEN -> ^('VB-YIELD' TOKEN);

//Yield Tokens
nnyield:'NN-YIELD' TOKEN -> ^('NN-YIELD' TOKEN);
//Misc Tokens mainly to replace characters that are not markup friendly
colon:'COLON' TOKEN -> ^('COLON' TOKEN);
comma:'COMMA' TOKEN -> ^('COMMA' TOKEN);
apost:'APOST' TOKEN -> ^('APOST' TOKEN);
neg:'NEG' TOKEN -> ^('NEG' TOKEN);
dash:'DASH' TOKEN -> ^('DASH' TOKEN);
stop:'STOP' TOKEN -> ^('STOP' TOKEN);
nnpercent:'NN-PERCENT' TOKEN -> ^('NN-PERCENT' TOKEN);
lsqb:'LSQB' TOKEN -> ^('LSQB' TOKEN);
rsqb:'RSQB' TOKEN -> ^('RSQB' TOKEN);

lrb:'-LRB-' TOKEN -> ^('-LRB-' TOKEN);
rrb:'-RRB-' TOKEN -> ^('-RRB-' TOKEN);

//Brown Corpus Tokens

// Pre-qualifier (quite, rather)
abl:'ABL' TOKEN -> ^('ABL' TOKEN);

// Pre-quantifier (half, all)
abn:'ABN' TOKEN -> ^('ABN' TOKEN);

// Pre-quantifier (both)
abx:'ABX' TOKEN -> ^('ABX' TOKEN);

// Post-determiner (many, several, next)
ap:'AP' TOKEN -> ^('AP' TOKEN);

// Article (a, the, no)
at:'AT' TOKEN -> ^('AT' TOKEN);

// Be
be:'BE' TOKEN -> ^('BE' TOKEN);

// Were
bed:'BED' TOKEN -> ^('BED' TOKEN);

// Was
bedz:'BEDZ' TOKEN -> ^('BEDZ' TOKEN);

// Being
beg:'BEG' TOKEN -> ^('BEG' TOKEN);

// Am
bem:'BEM' TOKEN -> ^('BEM' TOKEN);

// Been
ben:'BEN' TOKEN -> ^('BEN' TOKEN);

// Are, art
ber:'BER' TOKEN -> ^('BER' TOKEN);

// Is
bez:'BEZ' TOKEN -> ^('BEZ' TOKEN);

// Coordinating conjunction (and, or)
cc:'CC' TOKEN -> ^('CC' TOKEN);

// Cardinal numeral (one, two, 2, etc.)
cd:'CD' TOKEN -> ^('CD' TOKEN);

// Subordinating conjunction (if, although)
cs:'CS' TOKEN -> ^('CS' TOKEN);

// Do
dotok:'DO' TOKEN -> ^('DO' TOKEN);

// Did
dod:'DOD' TOKEN -> ^('DOD' TOKEN);

// Does
doz:'DOZ' TOKEN -> ^('DOZ' TOKEN);

// Singular determiner/quantifier (this, that)
dt:'DT' TOKEN -> ^('DT' TOKEN);


// Singular determiner/quantifier (this, that)
dtTHE:'DT-THE' TOKEN -> ^('DT-THE' TOKEN);
// Singular or plural determiner/quantifier (some, any)
dti:'DTI' TOKEN -> ^('DTI' TOKEN);

// Plural determiner (these, those)
dts:'DTS' TOKEN -> ^('DTS' TOKEN);

// Determiner/double conjunction (either)
dtx:'DTX' TOKEN -> ^('DTX' TOKEN);

// Existential there
ex:'EX' TOKEN -> ^('EX' TOKEN);

// Foreign word (hyphenated before regular tag)
fw:'FW' TOKEN -> ^('FW' TOKEN);

// Foreign word (hyphenated before regular tag)
fwin:'FW-IN' TOKEN -> ^('FW-IN' TOKEN);

// Have
hv:'HV' TOKEN -> ^('HV' TOKEN);

// Had (past tense)
hvd:'HVD' TOKEN -> ^('HVD' TOKEN);

// Having
hvg:'HVG' TOKEN -> ^('HVG' TOKEN);

// Had (past participle)
hvn:'HVN' TOKEN -> ^('HVN' TOKEN);

// Preposition
in:'IN' TOKEN -> ^('IN' TOKEN);

// Adjective
jj:'JJ' TOKEN -> ^('JJ' TOKEN);

// Comparative adjective
jjr:'JJR' TOKEN -> ^('JJR' TOKEN);

// Semantically superlative adjective (chief, top)
jjs:'JJS' TOKEN -> ^('JJS' TOKEN);

// Morphologically superlative adjective (biggest)
jjt:'JJT' TOKEN -> ^('JJT' TOKEN);

// Modal auxiliary (can, should, will)
md:'MD' TOKEN -> ^('MD' TOKEN);

// Cited word (hyphenated after regular tag)
nc:'NC' TOKEN -> ^('NC' TOKEN);

// Singular or mass noun
nn:'NN' TOKEN -> ^('NN' TOKEN);

// Possessive singular noun
nn_poss:'NN$' TOKEN -> ^('NN$' TOKEN);

// Plural noun
nns:'NNS' TOKEN -> ^('NNS' TOKEN);

// Possessive plural noun
nns_poss:'NNS$' TOKEN -> ^('NNS$' TOKEN);

// Proper noun or part of name phrase
np:'NP' TOKEN -> ^('NP' TOKEN);


// Proper noun or part of name phrase
nnp:'NNP' TOKEN -> ^('NNP' TOKEN);


// Possessive proper noun
np_poss:'NP$' TOKEN -> ^('NP$' TOKEN);

// Plural proper noun
nps:'NPS' TOKEN -> ^('NPS' TOKEN);

// Possessive plural proper noun
nps_poss:'NPS$' TOKEN -> ^('NPS$' TOKEN);

// Adverbial noun (home, today, west)
nr:'NR' TOKEN -> ^('NR' TOKEN);

// Ordinal numeral (first, 2nd)
od:'OD' TOKEN -> ^('OD' TOKEN);

// Nominal pronoun (everybody, nothing)
pn:'PN' TOKEN -> ^('PN' TOKEN);

// Possessive nominal pronoun
pn_poss:'PN$' TOKEN -> ^('PN$' TOKEN);

// Possessive personal pronoun (my, our)
pp_poss:'PP$' TOKEN -> ^('PP$' TOKEN);

// Second (nominal) possessive pronoun (mine, ours)
pp_poss_poss:'PP$$' TOKEN -> ^('PP$$' TOKEN);

// Singular reflexive/intensive personal pronoun (myself)
ppl:'PPL' TOKEN -> ^('PPL' TOKEN);

// Plural reflexive/intensive personal pronoun (ourselves)
ppls:'PPLS' TOKEN -> ^('PPLS' TOKEN);

prp:'PRP' TOKEN -> ^('PRP' TOKEN);


prp_poss:'PRP$' TOKEN -> ^('PRP$' TOKEN);
// Objective personal pronoun (me, him, it, them)
ppo:'PPO' TOKEN -> ^('PPO' TOKEN);

// 3rd. singular nominative pronoun (he, she, it, one)
pps:'PPS' TOKEN -> ^('PPS' TOKEN);

// Other nominative personal pronoun (i, we, they, you)
ppss:'PPSS' TOKEN -> ^('PPSS' TOKEN);

// Qualifier (very, fairly)
ql:'QL' TOKEN -> ^('QL' TOKEN);

// Post-qualifier (enough, indeed)
qlp:'QLP' TOKEN -> ^('QLP' TOKEN);

// Adverb
rb:'RB' TOKEN -> ^('RB' TOKEN);

// Comparative adverb
rbr:'RBR' TOKEN -> ^('RBR' TOKEN);

// Conjunctive Adverbs
rbconj:'RB-CONJ' TOKEN -> ^('RB-CONJ' TOKEN);

// Superlative adverb
rbt:'RBT' TOKEN -> ^('RBT' TOKEN);

// Superlative adverb
rbs:'RBS' TOKEN -> ^('RBS' TOKEN);


// Nominal adverb (here, then, indoors)
rn:'RN' TOKEN -> ^('RN' TOKEN);

// Adverb/particle (about, off, up)
rp:'RP' TOKEN -> ^('RP' TOKEN);


sym:'SYM' TOKEN -> ^('SYM' TOKEN);

// Infinitive marker to
to:'TO' TOKEN -> ^('TO' TOKEN);

// Interjection, exclamation
uh:'UH' TOKEN -> ^('UH' TOKEN);

// Verb, base form
vb:'VB' TOKEN -> ^('VB' TOKEN);

vbp:'VBP' TOKEN -> ^('VBP' TOKEN);

// Verb, past tense
vbd:'VBD' TOKEN -> ^('VBD' TOKEN);

// Verb, present participle/gerund
vbg:'VBG' TOKEN -> ^('VBG' TOKEN);

// Verb, past participle
vbn:'VBN' TOKEN -> ^('VBN' TOKEN);

// Verb, 3rd. singular present
vbz:'VBZ' TOKEN -> ^('VBZ' TOKEN);

// Wh- determiner (what, which)
wdt:'WDT' TOKEN -> ^('WDT' TOKEN);

// Possessive wh- pronoun (whose)
wp_poss:'WP$' TOKEN -> ^('WP$' TOKEN);


// Objective wh- pronoun (whom, which, that)
wpo:'WPO' TOKEN -> ^('WPO' TOKEN);

// Nominative wh- pronoun (who, which, that)
wps:'WPS' TOKEN -> ^('WPS' TOKEN);

// Wh- qualifier (how)
wql:'WQL' TOKEN -> ^('WQL' TOKEN);

// Wh- adverb (how, where, when)
wrb:'WRB' TOKEN -> ^('WRB' TOKEN);

pdt:'PDT' TOKEN -> ^('PDT' TOKEN);