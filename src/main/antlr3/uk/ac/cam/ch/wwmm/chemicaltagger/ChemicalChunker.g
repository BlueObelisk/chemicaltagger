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
    package uk.ac.cam.ch.wwmm.chemicaltagger;
 }
@lexer::header {package uk.ac.cam.ch.wwmm.chemicaltagger;}

WS	:	 (' '|'\t')+ {skip();};
NEWLINE	:	'\r'? '\n';


fragment ACHAR	:	('A'..'Z') | ('a'..'z');

// fragment ACHAR : ~('\\'|'"') ; 
fragment DIGIT	: ('0'..'9');
fragment UNICODE	:  '\u00B0'..'\ufffe';

//TOKEN	:	(ACHAR|DIGIT|UNICODE)+;
TOKEN : (ACHAR|'?'|';'| '_'|',' |'.'|')'|'('|'/'|'-'|'='|':'|'%'|'\''|'{'|'}'|'['|']'|'>'|'<'|'@'|'+'|'|'|DIGIT|UNICODE)+;



document: sentences+-> ^(NODE["Sentence"]  sentences )+ ;

sentences:  (sentence|unmatchedPhrase)+   (adv|colon)* (comma|cc|stop)* ;

sentence:  (nounphrase|verbphrase|prepphrase)+ ;


unmatchedPhrase
	:	 unmatchedTokens -> ^(NODE["Unmatched"] unmatchedTokens)+;
	
unmatchedTokens
	:	(fw|noun|verb|adj|adv|inAll|dt|oscarcd|oscarcm|oscarrn|oscaront|brackets|sym|colon|comma|md|neg|number);	


nounphrase
	:	nounphraseStructure ->  ^(NODE["NounPhrase"]  nounphraseStructure);	
nounphraseStructure : dt? (adj|adv)*  (noun|number|ratio)+    (conjunction* adj* adv*  noun|number|ratio  )*   (prepphraseOf| prepphraseIN)*  ;
conjunction 
	:	 cc|comma;


verbphrase
	:	verbphraseStructure ->  ^(NODE["VerbPhrase"]  verbphraseStructure);
verbphraseStructure :  to? inAll? inafter? (md* adv* adj? verb+ md* adv* adj? neg? )+ (cc? comma? prepphrase)* ;
verb : vb|vbp|vbg|vbd|vbz|vbn|vbuse|vbsubmerge|vbsubject|vbadd|vbcharge|vbcontain|vbdrop|vbfill|vbsuspend|vbtreat|vbapparatus|vbconcentrate|vbcool|vbdegass|vbdissolve|vbdry|vbextract|vbfilter |vbheat|vbincrease|vbpartition|vbprecipitate|vbpurify|vbquench|vbrecover|vbremove|vbstir|vbsynthesize|vbwait|vbwash|vbyield|vbchange;

number : cd|oscarcd;	
clause	:	wdt|wp_poss|wpo|wpo|wps|wql|wrb|ex|pdt;
noun :  prp|unnamedmolecule|molecule|nnstate|nn|nns|nnp|nnadd|preparationphrase|nnexample|oscarcpr|range|amount|mixture|nntime|apparatus|nnatmosphere|nneq|quantity|nnchementity|measurements|nntemp|nnflash|nngeneral|nnmethod|nnamount|nnpressure|nncolumn|nnchromatography|nnvacuum|nncycle|nntimes|nnconcentrate|nnvol|nnpurify|wdt|wp_poss|wpo|wps|nnsynthesize|nnmixture|oscaront|number|oscarCompound|nnextract|nnfilter|nnprecipitate|nnremove|fw|fwin|sym|clause;
range: cd dash cd;
ratio : (numberratio|nounratio) -> ^(NODE["RATIO"] numberratio? nounratio?)  ;
numberratio	:	 cd (colon cd)+ ;
nounratio 
	:	 noun  (colon noun)+  ;
	
mixture: (mixtureStructure2|mixtureStructure1) -> ^(NODE["MIXTURE"]  mixtureStructure2? mixtureStructure1?);
mixtureStructure2: comma lrb mixtureContent rrb comma;
mixtureStructure1:  lrb mixtureContent rrb;
mixtureContent:   (fw|verb|measurements|md|stop|oscarCompound|molecule|unnamedmolecule|dash|sym|cd|noun|inof|inAll|cd|comma|adj|colon|stop) (fw|verb|measurements|md|stop|oscarCompound|molecule|unnamedmolecule|dash|sym|cd|noun|inof|inAll|cd|comma|adj|colon|stop)+ ;
adj	:	jj|jjr|jjs|jjt|oscarcj|oscarrn;

adv	:	rb|rbr|rbt|rp|rbs|rbconj;
// Different PrepPhrases


prepphrase 
	: 	neg? (prepphraseAtmosphere|prepphraseTemp|prepphraseTime|prepphraseIN|prepphraseOther)  ;

prepphraseOther
	: (adv|adj)? inAll+  nounphrase ->  ^(NODE["PrepPhrase"]  adv? adj? inAll+  nounphrase);
prepphraseOf 
	: inof  nounphrase->  ^(NODE["PrepPhrase"]  inof  nounphrase);

prepphraseTime 
	:(adv|adj)? inAll?  dt? (adv|adj)? cd? nntime+ ->  ^(NODE["TimePhrase"]  adv? adj? inAll? dt? adv? adj? cd? nntime+);

prepphraseIN 
	:inin molecule ->  ^(NODE["PrepPhrase"]  inin  molecule);

prepphraseAtmosphere 
	: inunder  dt? (adv|adj)? molecule nnatmosphere? ->  ^(NODE["AtmospherePhrase"]  inunder  dt? adv? adj? molecule nnatmosphere?  ) ;


inAll	: in|inafter|inas|inbefore|inby|infor|infrom|inin|ininto|inof|inoff|inon|inover|inunder|invia|inwith|inwithout|to;
prepphraseTemp:  (adv|adj)? inAll? dt? (adv|adj)? cd? nntemp+ ->  ^(NODE["TempPhrase"]  adv? adj?  inAll?  dt? adv? adj? cd? nntemp+);

			
amount	: cd nnamount -> ^(NODE["AMOUNT"]   cd nnamount );
mass	: cd nnmass-> ^(NODE["MASS"]   cd nnmass ); 
percent	: cd nn? nnpercent -> ^(NODE["PERCENT"]   cd nn? nnpercent );
volume	: cd nnvol -> ^(NODE["VOLUME"]   cd nnvol );

preparationphrase
	: vbsynthesize inas (nnexample cd| prepphrase)	;
apparatus
	:	preapparatus* nnapparatus+-> ^(NODE["APPARATUS"]   preapparatus* nnapparatus+ );

preapparatus
	:   quantity|nn|nnpressure|adj|nnadd|nnchementity|nnstate ;
measurements
	:(cd nn)? amount|mass|percent|volume    dt?;	

// The RRB at the end is for leftover brackets from chemicals that didn't parse properly
oscarCompound :  (oscarCompound1|oscarCompound2|oscarCompound3|oscarCompound4|oscarCompound5|oscarcm) ;

oscarCompound5 :	lrb oscarcm rrb -> ^(NODE["OSCARCM"]  lrb oscarcm  rrb );
oscarCompound4 :	oscarcm (dash|apost)+ -> ^(NODE["OSCARCM"]  oscarcm  dash* apost* );
oscarCompound3 :	oscarcm (dash oscarcm)+ dash?-> ^(NODE["OSCARCM"]  oscarcm (dash oscarcm)+ dash? );
oscarCompound2 :	oscarcm oscarcm+ -> ^(NODE["OSCARCM"]  oscarcm oscarcm+);
oscarCompound1 :	oscarcm jj oscarcm -> ^(NODE["OSCARCM"]  oscarcm jj oscarcm);
//moleculeamount1
//	:measurements (quantity|mixture)? inof oscarCompound;	
moleculeamount1
	:(quantity|mixture)+ inof oscarCompound;	

moleculeamount2
	:(quantity|mixture)* oscarCompound+  (quantity|mixture)* ;	
moleculeamount : moleculeamount1 | moleculeamount2 ;	
molecule          
	:  moleculeamount-> ^(NODE["MOLECULE"]  moleculeamount );	

//unnamedmoleculeamount1
//	:measurements quantity? inof (oscarcd|cd);	
unnamedmoleculeamount1
	: quantity inof (oscarcd|cd);
unnamedmoleculeamount2
	:oscarcd quantity*;		
//unnamedmoleculeamount3
//	:measurements quantity? inof (jj? noun)+;	

unnamedmoleculeamount3
	:quantity inof (jj? noun)+;	

unnamedmoleculeamount
	:unnamedmoleculeamount1 | unnamedmoleculeamount2 | unnamedmoleculeamount3 ;	


unnamedmolecule 
	: unnamedmoleculeamount -> ^(NODE["UNNAMEDMOLECULE"] unnamedmoleculeamount);	
		
quantity 	:  (quantity1|quantity2) ->   ^(NODE["QUANTITY"]  quantity1? quantity2?);
quantity1
	: lrb measurements (comma  measurements)* (comma preparationphrase)* (stop preparationphrase)*  rrb;	 
quantity2
	:  measurements (comma  measurements)*  ;
//amount 	: lrb gram comma  mmol  rrb;     
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
nnamount:'NN-AMOUNT' TOKEN;
nnatmosphere:'NN-ATMOSPHERE' TOKEN;
nneq:'NN-EQ' TOKEN;
nnvol:'NN-VOL' TOKEN;
nnchementity:'NN-CHEMENTITY' TOKEN;
nntemp:'NN-TEMP' TOKEN;
nnflash:'NN-FLASH' TOKEN;
nngeneral:'NN-GENERAL' TOKEN;
nnmethod:'NN-METHOD' TOKEN;
//nnamount:'NN-AMOUNT' TOKEN;
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

vbp	: 'VBP' TOKEN
	;

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