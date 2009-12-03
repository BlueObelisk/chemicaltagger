grammar ChemicalChunker;
options {
    language=Java;
    output = AST;
}
@header {
    package uk.ac.cam.ch.wwmm.extractPhrases;
 }
@lexer::header {package uk.ac.cam.ch.wwmm.extractPhrases;}


WS	:	 (' '|'\t')+ {skip();};
NEWLINE	:	'\r'? '\n';


ACHAR	:	('A'..'Z') | ('a'..'z');

//ACHAR : ~('\\'|'"') ; 
DIGIT	:	('0'..'9');

TOKEN	:	(ACHAR| '_'|',' |'.'|')'|'('|'-'|DIGIT)+;


document:	sentence+;


sentence 
	:nounphrase+ verbphrase* stop?;

nounphrase 
	:dt? adj* noun+ (cc|comma noun)* prepphraseOf* prepphraseIN?;

verbphrase    
	: adv* vbd* verb adv* prepphrase;

verb
 :
 vbuse|vbchange|vbsubmerge|vbsubject|vbadd|vbcharge|vbcontain|vbdrop|vbfill|vbsuspend|vbtreat|vbapparatus|vbconcentrate|vbcool|vbdegass|vbdissolve|vbdry|vbextract|vbfilter
 |vbheat|vbincrease|vbpartition|vbprecipitate|vbpurify|vbquench|vbrecover|vbremove|vbstir|vbsynthesize|vbwait|vbwash|vbyield;
number           
	: cd|oscarcd;	
noun	:	
unnamedmolecule|molecule|nnstate|nntime|nnatmosphere|nneq|nnchementity|nntemp|nnflash|nngeneral|nnmethod|nnamount|nnpressure|nncolumn|nnchromatography|nnvacuum|nncycle|nntimes|nnapparatus|
nnconcentrate|wdt|wp_poss|wpo|wps|nnsynthesize|oscaront|nnmixture;

//noun	:	 molecule;
adj	:	jj|jjr|jjs|jjt|oscarcj;

adv	:	rb|rbr|rbt;
// Different PrepPhrases
prepphrase 
	:	prepphraseOther|prepphraseTemp|prepphraseTime;

 prepphraseOther
	: inAll  nounphrase;
prepphraseOf 
	: inof  nounphrase;

prepphraseIN 
	:	 inin molecule;

	
prepphraseTime:
	inAll? dt? jj? cd nntime;

prepphraseTemp:
	inAll? dt? jj? cd nntemp;

	

inAll	: in|inafter|inas|inbefore|inby|infor|infrom|inin|ininto|inof|inoff|inon|inover|inunder|invia|inwith|inwithout	;


			
mmol	: cd nnmol;
gram	: cd nngram;
percent	: cd nnpercent;
volume	: cd nnvol;

measurements
	:mmol|gram|percent|volume;	

	
molecule          
	:   oscarcm+ amount;	
unnamedmolecule 
	: oscarcd+ amount*;	
		
amount 	: lrb measurements comma  measurements  rrb;
//amount 	: lrb gram comma  mmol  rrb;     
method:
    (nngeneral|nn)? nnmethod (oscarcd|cd)? ;

//Tags---Pattern---Description
oscarcd:'OSCAR-CD' TOKEN;
oscarcj:'OSCAR-CJ' TOKEN;
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
nnstate:'NN-STATE' TOKEN;
nntime:'NN-TIME' TOKEN;
nngram:'NN-GRAM' TOKEN;
nnmol:'NN-MOL' TOKEN;
nnatmosphere:'NN-ATMOSPHERE' TOKEN;
nneq:'NN-EQ' TOKEN;
nnvol:'NN-VOL' TOKEN;
nnchementity:'NN-CHEMENTITY' TOKEN;
nntemp:'NN-TEMP' TOKEN;
nnflash:'NN-FLASH' TOKEN;
nngeneral:'NN-GENERAL' TOKEN;
nnmethod:'NN-METHOD' TOKEN;
nnamount:'NN-AMOUNT' TOKEN;
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

// Superlative adverb
rbt:'RBT' TOKEN;

// Nominal adverb (here, then, indoors)
rn:'RN' TOKEN;

// Adverb/particle (about, off, up)
rp:'RP' TOKEN;

// Infinitive marker to
to:'TO' TOKEN;

// Interjection, exclamation
uh:'UH' TOKEN;

// Verb, base form
vb:'VB' TOKEN;

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