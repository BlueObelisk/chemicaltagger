grammar ChemicalChunker;
options {
    output = AST;
}
@header {
    package uk.ac.cam.ch.wwmm.extractPhrases.antlr;
    import java.util.HashMap;
    import nu.xom.Attribute;
    import nu.xom.Element;
}
@lexer::header {package uk.ac.cam.ch.wwmm.extractPhrases.antlr;}
@members {
  HashMap<String, Object> objectMap = new HashMap<String, Object>();
    Element rootElement = new Element("root");
    Element tableElement;
    Element cellElement;
    Element arrayElement;
    Element nounElement;
    Element currentElement;
    Element phraseElement;
    Element dtElement;
    Element nnElement;
    String tag;

    private Element addToken(String token) {
        return addElement(tag, token);
    }	
    private Element addElement(String name, String content) {
        ensureCurrentElement();
	System.out.println("add "+name+"/"+content);
        Element newElement = addElement(name);
        newElement.appendChild(content);
        return newElement;
    }
    private Element addElement(String name) {
	Element newElement = new Element(name);
        currentElement.appendChild(newElement);
        return newElement;
    }
    private void ensureCurrentElement() {
        rootElement = new Element("root");
        currentElement = rootElement;
    }
}

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
	: totok molecule;			

gram	: cd nngram;

molecules  
	: molecule cc molecule ;	
molecule          
	:  dttok* oscarcm+ amount;	
amount 	: lrb gram comma  mol rrb;

dttok	:'DT'  TOKEN
{
    addElement("DT", $TOKEN.text);
    };
  /*
nndashtok	:	'N''N''-'(('A'..'Z') | ('a'..'z'))+   TOKEN
{
    addElement("NN", $TOKEN.text);
};
*/

//All the Added Noun Tokens

vbd	: 'VBD' TOKEN
{
    addElement("VBD", $TOKEN.text);
};
	

cc:'CC'  TOKEN
{
    addElement("CC", $TOKEN.text);
};

totok	:	 'TO' TOKEN
 {
    addElement("TO", $TOKEN.text);
};
nntok:'NN'  TOKEN
{
    addElement("NN", $TOKEN.text);
};
ppntok	:'PPN'  TOKEN
{

    addElement("PPN", $TOKEN.text);
};
vbtok	:'VB'  TOKEN
{
    addElement("VB", $TOKEN.text);
};

// Regex Verb Tokens
oscarcd:'OSCAR-CD'  TOKEN
{
	 addElement("OSCAR-CD",$TOKEN.text);
};
oscarcj:'OSCAR-CJ'  TOKEN
{
	 addElement("OSCAR-CJ",$TOKEN.text);
};
tmunicode:'TM-UNICODE'  TOKEN
{
	 addElement("TM-UNICODE",$TOKEN.text);
};
cdunicode:'CD-UNICODE'  TOKEN
{
	 addElement("CD-UNICODE",$TOKEN.text);
};

// Prepositions
inas:'IN-AS'  TOKEN
{
	 addElement("IN-AS",$TOKEN.text);
};
inbefore:'IN-BEFORE'  TOKEN
{
	 addElement("IN-BEFORE",$TOKEN.text);
};
inafter:'IN-AFTER'  TOKEN
{
	 addElement("IN-AFTER",$TOKEN.text);
};
inin:'IN-IN'  TOKEN
{
	 addElement("IN-IN",$TOKEN.text);
};
ininto:'IN-INTO'  TOKEN
{
	 addElement("IN-INTO",$TOKEN.text);
};
inwith:'IN-WITH'  TOKEN
{
	 addElement("IN-WITH",$TOKEN.text);
};
inwithout:'IN-WITHOUT'  TOKEN
{
	 addElement("IN-WITHOUT",$TOKEN.text);
};
inby:'IN-BY'  TOKEN
{
	 addElement("IN-BY",$TOKEN.text);
};
invia:'IN-VIA'  TOKEN
{
	 addElement("IN-VIA",$TOKEN.text);
};
inof:'IN-OF'  TOKEN
{
	 addElement("IN-OF",$TOKEN.text);
};
inon:'IN-ON'  TOKEN
{
	 addElement("IN-ON",$TOKEN.text);
};
infor:'IN-FOR'  TOKEN
{
	 addElement("IN-FOR",$TOKEN.text);
};
infrom:'IN-FROM'  TOKEN
{
	 addElement("IN-FROM",$TOKEN.text);
};
inunder:'IN-UNDER'  TOKEN
{
	 addElement("IN-UNDER",$TOKEN.text);
};
inover:'IN-OVER'  TOKEN
{
	 addElement("IN-OVER",$TOKEN.text);
};
inoff:'IN-OFF'  TOKEN
{
	 addElement("IN-OFF",$TOKEN.text);
};
to:'TO'  TOKEN
{
	 addElement("TO",$TOKEN.text);
};
//Nouns
nnstate:'NN-STATE'  TOKEN
{
	 addElement("NN-STATE",$TOKEN.text);
};

nntime:'NN-TIME'  TOKEN
{
	 addElement("NN-TIME",$TOKEN.text);
};
cd:'CD'  TOKEN
{
	 addElement("CD",$TOKEN.text);
};
nngram:'NN-GRAM'  TOKEN
{
	 addElement("NN-GRAM",$TOKEN.text);
};
nnmol:'NN-MOL'  TOKEN
{
	 addElement("NN-MOL",$TOKEN.text);
};
nnatmosphere:'NN-ATMOSPHERE'  TOKEN
{
	 addElement("NN-ATMOSPHERE",$TOKEN.text);
};
nneq:'NN-EQ'  TOKEN
{
	 addElement("NN-EQ",$TOKEN.text);
};
nnvol:'NN-VOL'  TOKEN
{
	 addElement("NN-VOL",$TOKEN.text);
};

nntemp:'NN-TEMP'  TOKEN
{
	 addElement("NN-TEMP",$TOKEN.text);
};
nnflash:'NN-FLASH'  TOKEN
{
	 addElement("NN-FLASH",$TOKEN.text);
};
nngeneral:'NN-GENERAL'  TOKEN
{
	 addElement("NN-GENERAL",$TOKEN.text);
};
nnmethod:'NN-METHOD'  TOKEN
{
	 addElement("NN-METHOD",$TOKEN.text);
};
nnamount:'NN-AMOUNT'  TOKEN
{
	 addElement("NN-AMOUNT",$TOKEN.text);
};
nnpressure:'NN-PRESSURE'  TOKEN
{
	 addElement("NN-PRESSURE",$TOKEN.text);
};
nncolumn:'NN-COLUMN'  TOKEN
{
	 addElement("NN-COLUMN",$TOKEN.text);
};
nnchromatography:'NN-CHROMATOGRAPHY'  TOKEN
{
	 addElement("NN-CHROMATOGRAPHY",$TOKEN.text);
};
nnvacuum:'NN-VACUUM'  TOKEN
{
	 addElement("NN-VACUUM",$TOKEN.text);
};
nncycle:'NN-CYCLE'  TOKEN
{
	 addElement("NN-CYCLE",$TOKEN.text);
};
nntimes:'NN-TIMES'  TOKEN
{
	 addElement("NN-TIMES",$TOKEN.text);
};
//Not really chementities or Oscar-cm.. but need to be fixed
nnchementity:'NN-CHEMENTITY'  TOKEN
{
	 addElement("NN-CHEMENTITY",$TOKEN.text);
};
oscarcm:'CM'  TOKEN
{
	 addElement("OSCAR-CM",$TOKEN.text);
};
//Verbs
vbuse:'VB-USE'  TOKEN
{
	 addElement("VB-USE",$TOKEN.text);
};
vbchange:'VB-CHANGE'  TOKEN
{
	 addElement("VB-CHANGE",$TOKEN.text);
};
vbsubmerge:'VB-SUBMERGE'  TOKEN
{
	 addElement("VB-SUBMERGE",$TOKEN.text);
};
vbsubject:'VB-SUBJECT'  TOKEN
{
	 addElement("VB-SUBJECT",$TOKEN.text);
};
//Adjective
jj:'JJ'  TOKEN
{
	 addElement("JJ",$TOKEN.text);
};
//Add Tokens
nnadd:'NN-ADD'  TOKEN
{
	 addElement("NN-ADD",$TOKEN.text);
};
nnmixture:'NN-MIXTURE'  TOKEN
{
	 addElement("NN-MIXTURE",$TOKEN.text);
};
vbadd:'VB-ADD'  TOKEN
{
	 addElement("VB-ADD",$TOKEN.text);
};
vbcharge:'VB-CHARGE'  TOKEN
{
	 addElement("VB-CHARGE",$TOKEN.text);
};
vbcontain:'VB-CONTAIN'  TOKEN
{
	 addElement("VB-CONTAIN",$TOKEN.text);
};
vbdrop:'VB-DROP'  TOKEN
{
	 addElement("VB-DROP",$TOKEN.text);
};
vbfill:'VB-FILL'  TOKEN
{
	 addElement("VB-FILL",$TOKEN.text);
};
vbsuspend:'VB-SUSPEND'  TOKEN
{
	 addElement("VB-SUSPEND",$TOKEN.text);
};
vbtreat:'VB-TREAT'  TOKEN
{
	 addElement("VB-TREAT",$TOKEN.text);
};
//Apparatus Tokens
vbapparatus:'VB-APPARATUS'  TOKEN
{
	 addElement("VB-APPARATUS",$TOKEN.text);
};
nnapparatus:'NN-APPARATUS'  TOKEN
{
	 addElement("NN-APPARATUS",$TOKEN.text);
};
//Concentrate Tokens
vbconcentrate:'VB-CONCENTRATE'  TOKEN
{
	 addElement("VB-CONCENTRATE",$TOKEN.text);
};
nnconcentrate:'NN-CONCENTRATE'  TOKEN
{
	 addElement("NN-CONCENTRATE",$TOKEN.text);
};
//Cool Tokens
vbcool:'VB-COOL'  TOKEN
{
	 addElement("VB-COOL",$TOKEN.text);
};
//Degass Tokens
vbdegass:'VB-DEGASS'  TOKEN
{
	 addElement("VB-DEGASS",$TOKEN.text);
};
//Dissolve Tokens
vbdissolve:'VB-DISSOLVE'  TOKEN
{
	 addElement("VB-DISSOLVE",$TOKEN.text);
};
//Dry Tokens
vbdry:'VB-DRY'  TOKEN
{
	 addElement("VB-DRY",$TOKEN.text);
};
nndry:'NN-DRY'  TOKEN
{
	 addElement("NN-DRY",$TOKEN.text);
};
//Extract Tokens
vbextract:'VB-EXTRACT'  TOKEN
{
	 addElement("VB-EXTRACT",$TOKEN.text);
};
nnextract:'NN-EXTRACT'  TOKEN
{
	 addElement("NN-EXTRACT",$TOKEN.text);
};
//Filter Tokens
vbfilter:'VB-FILTER'  TOKEN
{
	 addElement("VB-FILTER",$TOKEN.text);
};
nnfilter:'NN-FILTER'  TOKEN
{
	 addElement("NN-FILTER",$TOKEN.text);
};
//Heat Tokens
vbheat:'VB-HEAT'  TOKEN
{
	 addElement("VB-HEAT",$TOKEN.text);
};
vbincrease:'VB-INCREASE'  TOKEN
{
	 addElement("VB-INCREASE",$TOKEN.text);
};
//Partition Tokens
vbpartition:'VB-PARTITION'  TOKEN
{
	 addElement("VB-PARTITION",$TOKEN.text);
};
//Precipitate Tokens
vbprecipitate:'VB-PRECIPITATE'  TOKEN
{
	 addElement("VB-PRECIPITATE",$TOKEN.text);
};
nnprecipitate:'NN-PRECIPITATE'  TOKEN
{
	 addElement("NN-PRECIPITATE",$TOKEN.text);
};
//Purify Tokens
vbpurify:'VB-PURIFY'  TOKEN
{
	 addElement("VB-PURIFY",$TOKEN.text);
};
nnpurify:'NN-PURIFY'  TOKEN
{
	 addElement("NN-PURIFY",$TOKEN.text);
};
//Quench Tokens
vbquench:'VB-QUENCH'  TOKEN
{
	 addElement("VB-QUENCH",$TOKEN.text);
};
//Recover Tokens
vbrecover:'VB-RECOVER'  TOKEN
{
	 addElement("VB-RECOVER",$TOKEN.text);
};
//Remove Tokens
vbremove:'VB-REMOVE'  TOKEN
{
	 addElement("VB-REMOVE",$TOKEN.text);
};
nnremove:'NN-REMOVE'  TOKEN
{
	 addElement("NN-REMOVE",$TOKEN.text);
};
//Stir Tokens
vbstir:'VB-STIR'  TOKEN
{
	 addElement("VB-STIR",$TOKEN.text);
};
//Synthesize Tokens
vbsynthesize:'VB-SYNTHESIZE'  TOKEN
{
	 addElement("VB-SYNTHESIZE",$TOKEN.text);
};
nnsynthesize:'NN-SYNTHESIZE'  TOKEN
{
	 addElement("NN-SYNTHESIZE",$TOKEN.text);
};
//Wait Tokens
vbwait:'VB-WAIT'  TOKEN
{
	 addElement("VB-WAIT",$TOKEN.text);
};
//Wash Tokens
vbwash:'VB-WASH'  TOKEN
{
	 addElement("VB-WASH",$TOKEN.text);
};
//Yield Tokens
vbyield:'VB-YIELD'  TOKEN
{
	 addElement("VB-YIELD",$TOKEN.text);
};
//Misc Tokens mainly to replace characters that are not markup friendly
rb:'RB'  TOKEN
{
	 addElement("RB",$TOKEN.text);
};

colon:'COLON'  TOKEN
{
	 addElement("COLON",$TOKEN.text);
};
comma:'COMMA'  TOKEN
{
	 addElement("COMMA",$TOKEN.text);
};
apost:'APOST'  TOKEN
{
	 addElement("APOST",$TOKEN.text);
};
neg:'NEG'  TOKEN
{
	 addElement("NEG",$TOKEN.text);
};
dash:'DASH'  TOKEN
{
	 addElement("DASH",$TOKEN.text);
};
stop:'STOP'  TOKEN
{
	 addElement("STOP",$TOKEN.text);
};
nnpercent:'NN-PERCENT'  TOKEN
{
	 addElement("NN-PERCENT",$TOKEN.text);
};
lsqb:'LSQB'  TOKEN
{
	 addElement("LSQB",$TOKEN.text);
};
rsqb:'RSQB'  TOKEN
{
	 addElement("RSQB",$TOKEN.text);
};

lrb :'-LRB-'  TOKEN
{
	 addElement("LRB",$TOKEN.text);
};

rrb :'-RRB-'  TOKEN
{
	 addElement("RRB",$TOKEN.text);
};

//Macros
