grammar ChemicalChunker;
options {
    language=Java;
    output = AST;
}
@header {
    package uk.ac.cam.ch.wwmm.extractPhrases.antlr;
 }
@lexer::header {package uk.ac.cam.ch.wwmm.extractPhrases.antlr;}


WS	:	 (' '|'\t')+ {skip();};
NEWLINE	:	'\r'? '\n';


ACHAR	:	('A'..'Z') | ('a'..'z');

//ACHAR : ~('\\'|'"') ; 
DIGIT	:	('0'..'9');

TOKEN	:	(ACHAR| '_'|',' |'.'|')'|'('|'-'|DIGIT)+;


document:	sentence+;

mol	: cd nnmol;
sentence 
	:	 nounphrase verbphraseADD prepphrase;

nounphrase 
	:molecules ;

verbphraseADD    
	: vbd* vbadd;


prepphrase 
	: to molecule;			

gram	: cd nngram;

molecules  
	: molecule cc molecule ;	
molecule          
	:  dt* oscarcm+ amount;	
amount 	: lrb gram comma  mol rrb;

//Tags---Pattern---Description
oscarcd:'CD' TOKEN;
oscarcj:'CJ' TOKEN;
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

//Not really cm.. but need to be fixed
oscarcm:'CM' TOKEN;

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
lrb:'LRB' TOKEN;
rrb:'RRB' TOKEN;

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



// Singular determiner/quantifier (this, that)
dt:'DT' TOKEN;


// Preposition
in:'IN' TOKEN;

// Adjective
jj:'JJ' TOKEN;



// Singular or mass noun
nn:'NN' TOKEN;

// Plural noun
nns:'NNS' TOKEN;

// Adverb
rb:'RB' TOKEN;


// Infinitive marker to
to:'TO' TOKEN;


// Verb, past tense
vbd:'VBD' TOKEN;

