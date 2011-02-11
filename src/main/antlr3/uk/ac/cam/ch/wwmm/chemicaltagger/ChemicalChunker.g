grammar ChemicalChunker;

options {
    language=Java;
    output = AST;
   backtrack= true;

}
tokens{
 NODE;
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
fragment UNICODE	:  '\u00B0'..'\ufffe';

//TOKEN	:	(ACHAR|DIGIT|UNICODE)+;
TOKEN : (ACHAR|'?'|';'| '_'|',' |'.'|')'|'('|'/'|'-'|'='|':'|'%'|'\''|'{'|'}'|'['|']'|'>'|'<'|'@'|'+'|'|'|DIGIT|UNICODE)+;



document: sentences+-> ^(NODE["Sentence"]  sentences )+ ;

sentences:  (sentence|unmatchedPhrase)+    (comma|stop)*;

sentence:  (nounphrase|verbphrase|prepphrase)+ (advAdj|colon) * (conjunction|rbconj)*;


unmatchedPhrase
	:	 unmatchedTokens -> ^(NODE["Unmatched"] unmatchedTokens)+;
	
unmatchedTokens
	:	(fw|noun|verb|inAll|dt|dtTHE|oscarcd|oscarcm|oscarrn|oscaront|brackets|sym|colon|md|neg|number|comma|advAdj|rbconj|reference);	


nounphrase
	:	nounphraseStructure ->  ^(NODE["NounPhrase"]  nounphraseStructure);	
	
nounphraseStructure 
	:	nounphraseStructure1|nounphraseStructure2;
nounphraseStructure1
	:	 multiApparatus ->  ^(NODE["MultipleApparatus"] multiApparatus);		
nounphraseStructure2 
	:	dtTHE? dt? advAdj*  (dissolvePhrase|noun|number|ratio)+    (conjunction* advAdj* (dissolvePhrase|noun|number|ratio) )*   ((prepphraseOf| prepphraseIN) dissolvePhrase?)*  ;
dissolvePhrase 
	:	(dissolveStructure1|dissolveStructure2|dissolveStructure3) ->  ^(NODE["DissolvePhrase"] dissolveStructure1? dissolveStructure2? dissolveStructure3?);

dissolveStructure1
	:	lrb adj? nnp? (molecule|unnamedmolecule) (inin dtTHE? adj? nnp? (molecule|unnamedmolecule) (conjunction molecule)*)+ rrb ;
dissolveStructure2
	:	adj? nnp? (molecule|unnamedmolecule) (inin dtTHE? adj? nnp? (molecule|unnamedmolecule) (conjunction molecule)*)+ ;

dissolveStructure3
	:	adj? nnp (molecule|unnamedmolecule|nnchementity) (inin dtTHE? adj? nnp? (molecule|unnamedmolecule) (conjunction molecule)*)+ ;


conjunction 
	:	 cc|comma;




verbphrase
	:	verbphraseStructure ->  ^(NODE["VerbPhrase"]  verbphraseStructure);
verbphraseStructure :  dt? to? inAll? inafter? (md* rbconj? adv* adj? verb+ md* adv* adj? neg? )+ inoff? (cc? comma? prepphrase)*   ;
verb : vb|vbp|vbg|vbd|vbz|vbn|vbuse|vbsubmerge|vbimmerse|degassMultiVerb|vbsubject|vbadd|vbdilute|vbcharge|vbcontain|vbdrop|vbfill|vbsuspend|vbtreat|vbapparatus|vbconcentrate|vbcool|vbdegass|vbdissolve|vbdry|vbextract|vbfilter |vbheat|vbincrease|vbpartition|vbprecipitate|vbpurify|vbquench|vbrecover|vbremove|vbstir|vbsynthesize|vbwait|vbwash|vbyield|vbchange;

degassMultiVerb
	:	vbdegass cc vbfill;
number : cd|oscarcd;	
clause	:	wdt|wp_poss|wpo|wpo|wps|wql|wrb|ex|pdt;
noun 	:	nounStructure (dash nounStructure)*;

nounStructure :  prp|citation|cycles|molecule|apparatus|mixture|unnamedmolecule|nnyield|nnstate|nn|nns|nnp|nnadd|preparationphrase|nnexample|oscarcpr|range|amount|nntime|nnatmosphere|nneq|quantity|nnchementity|measurements|nntemp|nnflash|nngeneral|nnmethod|nnamount|nnpressure|nncolumn|nnchromatography|nnvacuum|nncycle|nntimes|nnconcentrate|nnvol|nnpurify|wdt|wp_poss|wpo|wps|nnsynthesize|nnmixture|reference|oscaront|nndry|number|oscarCompound|nnextract|nnfilter|nnprecipitate|nnremove|fw|fwin|sym|clause;
range: cd dash cd;
cycles	:	cycleStructure -> ^(NODE["CYCLES"] cycleStructure)  ;
cycleStructure	:	cd dashNN? nncycle;  
dashNN	:	(adj|nn|cd) (dash (adj|nn|cd))*;  
ratio : (numberratio|nounratio) -> ^(NODE["RATIO"] numberratio? nounratio?)  ;
numberratio	:	 cd (colon oscarcd|cd)+ ;
nounratio 
	:	 noun  (colon noun)+  ;

reference 
	:	lsqb cd rsqb;
citation: (citationStructure1|citationStructure2) -> ^(NODE["CITATION"]  citationStructure1? citationStructure2?);

citationStructure1:  lrb citationContent rrb;
citationStructure2: comma lrb citationContent rrb comma;
citationContent:   (nnp|fw|cd|conjunction) (nnp|fw|cd|conjunction)+ ;
	
	
mixture: mixtureRatio?  (mixtureStructure2|mixtureStructure1) -> ^(NODE["MIXTURE"]   mixtureRatio? mixtureStructure2? mixtureStructure1?);
mixtureStructure2: comma lrb mixtureContent rrb comma;
mixtureStructure1: lrb mixtureContent rrb;
mixtureRatio 
	:	cd colon (cd|oscarcd);
mixtureContent:   (fw|verb|nn|measurements|md|stop|oscarcpr|oscarCompound|molecule|unnamedmolecule|dash|sym|cd|noun|inof|inAll|cd|comma|adj|colon|stop) (minimixture|fw|verb|measurements|nnyield|md|stop|oscarCompound|molecule|unnamedmolecule|dash|sym|cd|noun|inof|inAll|cd|comma|adj|colon|stop)+ ;

minimixture: (mixtureStructure2|mixtureStructure1) -> ^(NODE["MIXTURE"]  mixtureStructure2? mixtureStructure1?);
minimixtureStructure2: comma lrb mixtureContent rrb comma;
minimixtureStructure1:  lrb mixtureContent rrb;
minimixtureContent:   (fw|nn|verb|measurements|md|stop|oscarcpr|oscarCompound|molecule|unnamedmolecule|dash|sym|cd|noun|inof|inAll|cd|comma|adj|colon|stop) (fw|verb|measurements|nnyield|md|stop|oscarCompound|molecule|unnamedmolecule|dash|sym|cd|noun|inof|inAll|cd|comma|adj|colon|stop)+ ;

adj	:	jj|jjr|jjs|jjt|oscarcj|jjchem|oscarrn;
adv	:	rb|rbr|rbt|rp|rbs;
// Different PrepPhrases


prepphrase 
	: 	neg? (prepphraseAtmosphere|prepphraseTime|prepphraseTemp|prepphraseIN|prepphraseRole|prepphraseOther)  ;

advAdj   
	:adv|adj;	
prepphraseOther
	: advAdj* inAll+  nounphrase ->  ^(NODE["PrepPhrase"]  advAdj* inAll+  nounphrase);
prepphraseOf 
	: inof  nounphrase->  ^(NODE["PrepPhrase"]  inof  nounphrase);

prepphraseTime 
	:prepPhraseTimeStructure ->  ^(NODE["TimePhrase"]  prepPhraseTimeStructure);
prepPhraseTimeStructure
	:advAdj* inAll?  dt? advAdj* cd? nntime+	;
	
prepphraseIN 
	:inin molecule ->  ^(NODE["PrepPhrase"]  inin  molecule);

prepphraseRole
	:inas dt? nnchementity ->	^(NODE["RolePrepPhrase"]  inas dt? nnchementity);
prepphraseAtmosphere 
	: prepphraseAtmosphereContent ->  ^(NODE["AtmospherePhrase"]  prepphraseAtmosphereContent ) ;
prepphraseAtmosphereContent
	:inunder  dt? advAdj* molecule nnatmosphere?	;
	

inAll	: in|inafter|inas|inbefore|inby|infor|infrom|inin|ininto|inof|inoff|inon|inover|inunder|invia|inwith|inwithout|to;
prepphraseTemp:  prepphraseTempContent ->  ^(NODE["TempPhrase"]   prepphraseTempContent);

prepphraseTempContent
	:  advAdj? inAll? dt? advAdj? cd? nntemp+;	
	
			
amount	: cd+ nnamount -> ^(NODE["AMOUNT"]   cd+ nnamount );
mass	: cd+ nnmass-> ^(NODE["MASS"]   cd+ nnmass ); 
percent	: cd nn? nnpercent -> ^(NODE["PERCENT"]   cd nn? nnpercent );
volume	: cd+ nnvol -> ^(NODE["VOLUME"]   cd+ nnvol );
molar	: cd* nnmolar -> ^(NODE["MOLAR"]   cd* nnmolar );

preparationphrase
	: vbsynthesize inas (nnexample cd| prepphrase)	;
	
multiApparatus 
	:	apparatus (conjunction* apparatus )*;	
apparatus
	:	dt? preapparatus* nnApp+-> ^(NODE["APPARATUS"]   dt? preapparatus* nnApp+ );

nnApp 
	:	nnapparatus+ (dash nnapparatus)*;
preapparatus
	:    (quantity|adj|nnpressure|nnadd|molecule|nnchementity|nnstate|nn)+ ;
measurements
	:(cd nn)? (multiple|measurementtypes)    dt?;
multiple	: cd cdunicode measurementtypes? -> ^(NODE["MULTIPLE"]   cd cdunicode measurementtypes? );		
measurementtypes
	: molar|amount|mass|percent|volume ;	

// The RRB at the end is for leftover brackets from chemicals that didn't parse properly
oscarCompound :  adj* (oscarCompound1|oscarCompound2|oscarCompound3|oscarCompound4|oscarcm) adj? reference?;

oscarCompound4 :	lrb  oscarcm rrb -> ^(NODE["OSCARCM"]  lrb  oscarcm  rrb );
oscarCompound3 :	oscarCompound3Structure -> ^(NODE["OSCARCM"]   oscarCompound3Structure );
oscarCompound2 :	oscarCompound2Structure -> ^(NODE["OSCARCM"]   oscarCompound2Structure );
oscarCompound1 :	oscarcm oscarcm+ -> ^(NODE["OSCARCM"]  oscarcm oscarcm+);


oscarCompound3Structure 
	:  oscarcm (dash|apost)+;	 
oscarCompound2Structure 
	:  oscarcm (dash oscarcm)+  dash?;	 
//oscarCompound1 :	oscarcm oscarcm -> ^(NODE["OSCARCM"]  oscarcm oscarcm);
//moleculeamount1
//	:measurements (quantity|mixture)? inof oscarCompound;	
moleculeamount1
	:(quantity|mixture)+ inof oscarCompound;	

moleculeamount2
	:(quantity|mixture)* oscarCompound+  (citation|quantity|mixture)* ;	


moleculeamount3
	:(quantity|mixture) inof mixtureRatio mixture? oscarCompound ;		
moleculeamount : moleculeamount3|moleculeamount1 | moleculeamount2 ;	
molecule          
	:  moleculeamount-> ^(NODE["MOLECULE"]  moleculeamount );	

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
unnamedmoleculeamount
	:(unnamedmoleculeamount1 | unnamedmoleculeamount2 | unnamedmoleculeamount3|unnamedmoleculeamount4) ;	


unnamedmolecule 
	: unnamedmoleculeamount -> ^(NODE["UNNAMEDMOLECULE"] unnamedmoleculeamount);	
		
quantity 	:  (quantity1|quantity2) ->   ^(NODE["QUANTITY"]  quantity1? quantity2?);

quantity1
	: lrb measurements (comma  measurements)* (comma preparationphrase)* (stop preparationphrase)*  rrb;	 

quantity2
	:  measurements (comma  measurements)*  ;
method:
    (nngeneral|nn)? nnmethod (oscarcd|cd)?  ;
    brackets 
    	:	(lrb|rrb|lsqb|rsqb)+;





//Tags---Pattern---Description
oscarcd:'OSCAR-CD' TOKEN;
oscarcj:'OSCAR-CJ' TOKEN;
oscarrn:'OSCAR-RN' TOKEN;
oscarcpr:'OSCAR-CPR' TOKEN;
oscaront:	'OSCAR-ONT' TOKEN;
tmunicode:'TM-UNICODE' TOKEN;
cdunicode:'CD-UNICODE' TOKEN;
jjchem: 'JJ-CHEM'  TOKEN;

// Prepositions
inas:'IN-AS' TOKEN;
inbefore:'IN-BEFORE' TOKEN;
inafter:'IN-AFTER' TOKEN;
inin:'IN-IN' TOKEN;
ininto:'IN-INTO' TOKEN;
inwith:'IN-WITH' TOKEN;
inwithout:'IN-WITHOUT' TOKEN;
inby:'IN-BY' TOKEN;
invia:'IN-VIA' TOKEN;
inof:'IN-OF' TOKEN;
inon:'IN-ON' TOKEN;
infor:'IN-FOR' TOKEN;
infrom:'IN-FROM' TOKEN;
inunder:'IN-UNDER' TOKEN;
inover:'IN-OVER' TOKEN;
inoff:'IN-OFF' TOKEN;

//Modified Nouns
nnexample:'NN-EXAMPLE' TOKEN;
nnstate:'NN-STATE' TOKEN;
nntime:'NN-TIME' TOKEN;
nnmass:'NN-MASS' TOKEN;
nnmolar: 'NN-MOLAR'  TOKEN;
nnamount:'NN-AMOUNT' TOKEN;
nnatmosphere:'NN-ATMOSPHERE' TOKEN;
nneq:'NN-EQ' TOKEN;
nnvol:'NN-VOL' TOKEN;
nnchementity:'NN-CHEMENTITY' TOKEN;
nntemp:'NN-TEMP' TOKEN;
nnflash:'NN-FLASH' TOKEN;
nngeneral:'NN-GENERAL' TOKEN;
nnmethod:'NN-METHOD' TOKEN;
nnpressure:'NN-PRESSURE' TOKEN;
nncolumn:'NN-COLUMN' TOKEN;
nnchromatography:'NN-CHROMATOGRAPHY' TOKEN;
nnvacuum:'NN-VACUUM' TOKEN;
nncycle:'NN-CYCLE' TOKEN;
nntimes:'NN-TIMES' TOKEN;

//Not really Oscar-cm.. but need to be fixed
oscarcm:'OSCAR-CM' TOKEN;

//Verbs
vbuse:'VB-USE' TOKEN;
vbchange:'VB-CHANGE' TOKEN;
vbsubmerge:'VB-SUBMERGE' TOKEN;
vbsubject:'VB-SUBJECT' TOKEN;

//Add Tokens
nnadd:'NN-ADD' TOKEN;
nnmixture:'NN-MIXTURE' TOKEN;
vbdilute:'VB-DILUTE' TOKEN;	
vbadd:'VB-ADD' TOKEN;
vbcharge:'VB-CHARGE' TOKEN;
vbcontain:'VB-CONTAIN' TOKEN;
vbdrop:'VB-DROP' TOKEN;
vbfill:'VB-FILL' TOKEN;
vbsuspend:'VB-SUSPEND' TOKEN;
vbtreat:'VB-TREAT' TOKEN;

//Apparatus Tokens
vbapparatus:'VB-APPARATUS' TOKEN;
nnapparatus:'NN-APPARATUS' TOKEN;

//Concentrate Tokens
vbconcentrate:'VB-CONCENTRATE' TOKEN;
nnconcentrate:'NN-CONCENTRATE' TOKEN;

//Cool Tokens
vbcool:'VB-COOL' TOKEN;

//Degass Tokens
vbdegass:'VB-DEGASS' TOKEN;

//Dissolve Tokens
vbdissolve:'VB-DISSOLVE' TOKEN;

//Dry Tokens
vbdry:'VB-DRY' TOKEN;
nndry:'NN-DRY' TOKEN;

//Extract Tokens
vbextract:'VB-EXTRACT' TOKEN;
nnextract:'NN-EXTRACT' TOKEN;

//Filter Tokens
vbfilter:'VB-FILTER' TOKEN;
nnfilter:'NN-FILTER' TOKEN;

//Heat Tokens
vbheat:'VB-HEAT' TOKEN;
vbincrease:'VB-INCREASE' TOKEN;

//Immerse tokens
vbimmerse:'VB-IMMERSE' TOKEN;
//Partition Tokens
vbpartition:'VB-PARTITION' TOKEN;

//Precipitate Tokens
vbprecipitate:'VB-PRECIPITATE' TOKEN;
nnprecipitate:'NN-PRECIPITATE' TOKEN;

//Purify Tokens
vbpurify:'VB-PURIFY' TOKEN;
nnpurify:'NN-PURIFY' TOKEN;

//Quench Tokens
vbquench:'VB-QUENCH' TOKEN;

//Recover Tokens
vbrecover:'VB-RECOVER' TOKEN;

//Remove Tokens
vbremove:'VB-REMOVE' TOKEN;
nnremove:'NN-REMOVE' TOKEN;

//Stir Tokens
vbstir:'VB-STIR' TOKEN;

//Synthesize Tokens
vbsynthesize:'VB-SYNTHESIZE' TOKEN;
nnsynthesize:'NN-SYNTHESIZE' TOKEN;

//Wait Tokens
vbwait:'VB-WAIT' TOKEN;

//Wash Tokens
vbwash:'VB-WASH' TOKEN;

//Yield Tokens
vbyield:'VB-YIELD' TOKEN;

//Yield Tokens
nnyield:'NN-YIELD' TOKEN;
//Misc Tokens mainly to replace characters that are not markup friendly
colon:'COLON' TOKEN;
comma:'COMMA' TOKEN;
apost:'APOST' TOKEN;
neg:'NEG' TOKEN;
dash:'DASH' TOKEN;
stop:'STOP' TOKEN;
nnpercent:'NN-PERCENT' TOKEN;
lsqb:'LSQB' TOKEN;
rsqb:'RSQB' TOKEN;

lrb:'-LRB-' TOKEN;
rrb:'-RRB-' TOKEN;

//Brown Corpus Tokens

// Pre-qualifier (quite, rather)
abl:'ABL' TOKEN;

// Pre-quantifier (half, all)
abn:'ABN' TOKEN;

// Pre-quantifier (both)
abx:'ABX' TOKEN;

// Post-determiner (many, several, next)
ap:'AP' TOKEN;

// Article (a, the, no)
at:'AT' TOKEN;

// Be
be:'BE' TOKEN;

// Were
bed:'BED' TOKEN;

// Was
bedz:'BEDZ' TOKEN;

// Being
beg:'BEG' TOKEN;

// Am
bem:'BEM' TOKEN;

// Been
ben:'BEN' TOKEN;

// Are, art
ber:'BER' TOKEN;

// Is
bez:'BEZ' TOKEN;

// Coordinating conjunction (and, or)
cc:'CC' TOKEN;

// Cardinal numeral (one, two, 2, etc.)
cd:'CD' TOKEN;

// Subordinating conjunction (if, although)
cs:'CS' TOKEN;

// Do
dotok :'DO' TOKEN;

// Did
dod:'DOD' TOKEN;

// Does
doz:'DOZ' TOKEN;

// Singular determiner/quantifier (this, that)
dt:'DT' TOKEN;


// Singular determiner/quantifier (this, that)
dtTHE:'DT-THE' TOKEN;
// Singular or plural determiner/quantifier (some, any)
dti:'DTI' TOKEN;

// Plural determiner (these, those)
dts:'DTS' TOKEN;

// Determiner/double conjunction (either)
dtx:'DTX' TOKEN;

// Existential there
ex:'EX' TOKEN;

// Foreign word (hyphenated before regular tag)
fw:'FW' TOKEN;

// Foreign word (hyphenated before regular tag)
fwin:'FW-IN' TOKEN;

// Have
hv:'HV' TOKEN;

// Had (past tense)
hvd:'HVD' TOKEN;

// Having
hvg:'HVG' TOKEN;

// Had (past participle)
hvn:'HVN' TOKEN;

// Preposition
in:'IN' TOKEN;

// Adjective
jj:'JJ' TOKEN;

// Comparative adjective
jjr:'JJR' TOKEN;

// Semantically superlative adjective (chief, top)
jjs:'JJS' TOKEN;

// Morphologically superlative adjective (biggest)
jjt:'JJT' TOKEN;

// Modal auxiliary (can, should, will)
md:'MD' TOKEN;

// Cited word (hyphenated after regular tag)
nc:'NC' TOKEN;

// Singular or mass noun
nn:'NN' TOKEN;

// Possessive singular noun
nn_poss:'NN$' TOKEN;

// Plural noun
nns:'NNS' TOKEN;

// Possessive plural noun
nns_poss:'NNS$' TOKEN;

// Proper noun or part of name phrase
np:'NP' TOKEN;


// Proper noun or part of name phrase
nnp:'NNP' TOKEN;


// Possessive proper noun
np_poss:'NP$' TOKEN;

// Plural proper noun
nps:'NPS' TOKEN;

// Possessive plural proper noun
nps_poss:'NPS$' TOKEN;

// Adverbial noun (home, today, west)
nr:'NR' TOKEN;

// Ordinal numeral (first, 2nd)
od:'OD' TOKEN;

// Nominal pronoun (everybody, nothing)
pn:'PN' TOKEN;

// Possessive nominal pronoun
pn_poss:'PN$' TOKEN;

// Possessive personal pronoun (my, our)
pp_poss:'PP$' TOKEN;

// Second (nominal) possessive pronoun (mine, ours)
pp_poss_poss:'PP$$' TOKEN;

// Singular reflexive/intensive personal pronoun (myself)
ppl:'PPL' TOKEN;

// Plural reflexive/intensive personal pronoun (ourselves)
ppls:'PPLS' TOKEN;

prp	:	'PRP'  TOKEN;

// Objective personal pronoun (me, him, it, them)
ppo:'PPO' TOKEN;

// 3rd. singular nominative pronoun (he, she, it, one)
pps:'PPS' TOKEN;

// Other nominative personal pronoun (i, we, they, you)
ppss:'PPSS' TOKEN;

// Qualifier (very, fairly)
ql:'QL' TOKEN;

// Post-qualifier (enough, indeed)
qlp:'QLP' TOKEN;

// Adverb
rb:'RB' TOKEN;

// Comparative adverb
rbr:'RBR' TOKEN;

// Conjunctive Adverbs
rbconj	: 'RB-CONJ'  TOKEN
	;
// Superlative adverb
rbt:'RBT' TOKEN;

// Superlative adverb
rbs:'RBS' TOKEN;


// Nominal adverb (here, then, indoors)
rn:'RN' TOKEN;

// Adverb/particle (about, off, up)
rp:'RP' TOKEN;


sym	:	'SYM' TOKEN;

// Infinitive marker to
to:'TO' TOKEN;

// Interjection, exclamation
uh:'UH' TOKEN;

// Verb, base form
vb:'VB' TOKEN;

vbp	: 'VBP' TOKEN;

// Verb, past tense
vbd:'VBD' TOKEN;

// Verb, present participle/gerund
vbg:'VBG' TOKEN;

// Verb, past participle
vbn:'VBN' TOKEN;

// Verb, 3rd. singular present
vbz:'VBZ' TOKEN;

// Wh- determiner (what, which)
wdt:'WDT' TOKEN;

// Possessive wh- pronoun (whose)
wp_poss:'WP$' TOKEN;


// Objective wh- pronoun (whom, which, that)
wpo:'WPO' TOKEN;

// Nominative wh- pronoun (who, which, that)
wps:'WPS' TOKEN;


// Wh- qualifier (how)
wql:'WQL' TOKEN;

// Wh- adverb (how, where, when)
wrb:'WRB' TOKEN;

pdt 	:	'PDT' TOKEN;