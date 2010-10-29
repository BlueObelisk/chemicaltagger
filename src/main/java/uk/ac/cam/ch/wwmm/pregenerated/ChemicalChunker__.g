lexer grammar ChemicalChunker;
options {
  language=Java;

}

@header {package uk.ac.cam.ch.wwmm.pregenerated;}

T__11 : 'OSCAR-CD' ;
T__12 : 'OSCAR-CJ' ;
T__13 : 'OSCAR-RN' ;
T__14 : 'OSCAR-CPR' ;
T__15 : 'OSCAR-ONT' ;
T__16 : 'TM-UNICODE' ;
T__17 : 'CD-UNICODE' ;
T__18 : 'IN-AS' ;
T__19 : 'IN-BEFORE' ;
T__20 : 'IN-AFTER' ;
T__21 : 'IN-IN' ;
T__22 : 'IN-INTO' ;
T__23 : 'IN-WITH' ;
T__24 : 'IN-WITHOUT' ;
T__25 : 'IN-BY' ;
T__26 : 'IN-VIA' ;
T__27 : 'IN-OF' ;
T__28 : 'IN-ON' ;
T__29 : 'IN-FOR' ;
T__30 : 'IN-FROM' ;
T__31 : 'IN-UNDER' ;
T__32 : 'IN-OVER' ;
T__33 : 'IN-OFF' ;
T__34 : 'NN-EXAMPLE' ;
T__35 : 'NN-STATE' ;
T__36 : 'NN-TIME' ;
T__37 : 'NN-MASS' ;
T__38 : 'NN-MOLAR' ;
T__39 : 'NN-AMOUNT' ;
T__40 : 'NN-ATMOSPHERE' ;
T__41 : 'NN-EQ' ;
T__42 : 'NN-VOL' ;
T__43 : 'NN-CHEMENTITY' ;
T__44 : 'NN-TEMP' ;
T__45 : 'NN-FLASH' ;
T__46 : 'NN-GENERAL' ;
T__47 : 'NN-METHOD' ;
T__48 : 'NN-PRESSURE' ;
T__49 : 'NN-COLUMN' ;
T__50 : 'NN-CHROMATOGRAPHY' ;
T__51 : 'NN-VACUUM' ;
T__52 : 'NN-CYCLE' ;
T__53 : 'NN-TIMES' ;
T__54 : 'OSCAR-CM' ;
T__55 : 'VB-USE' ;
T__56 : 'VB-CHANGE' ;
T__57 : 'VB-SUBMERGE' ;
T__58 : 'VB-SUBJECT' ;
T__59 : 'NN-ADD' ;
T__60 : 'NN-MIXTURE' ;
T__61 : 'VB-ADD' ;
T__62 : 'VB-CHARGE' ;
T__63 : 'VB-CONTAIN' ;
T__64 : 'VB-DROP' ;
T__65 : 'VB-FILL' ;
T__66 : 'VB-SUSPEND' ;
T__67 : 'VB-TREAT' ;
T__68 : 'VB-APPARATUS' ;
T__69 : 'NN-APPARATUS' ;
T__70 : 'VB-CONCENTRATE' ;
T__71 : 'NN-CONCENTRATE' ;
T__72 : 'VB-COOL' ;
T__73 : 'VB-DEGASS' ;
T__74 : 'VB-DISSOLVE' ;
T__75 : 'VB-DRY' ;
T__76 : 'NN-DRY' ;
T__77 : 'VB-EXTRACT' ;
T__78 : 'NN-EXTRACT' ;
T__79 : 'VB-FILTER' ;
T__80 : 'NN-FILTER' ;
T__81 : 'VB-HEAT' ;
T__82 : 'VB-INCREASE' ;
T__83 : 'VB-PARTITION' ;
T__84 : 'VB-PRECIPITATE' ;
T__85 : 'NN-PRECIPITATE' ;
T__86 : 'VB-PURIFY' ;
T__87 : 'NN-PURIFY' ;
T__88 : 'VB-QUENCH' ;
T__89 : 'VB-RECOVER' ;
T__90 : 'VB-REMOVE' ;
T__91 : 'NN-REMOVE' ;
T__92 : 'VB-STIR' ;
T__93 : 'VB-SYNTHESIZE' ;
T__94 : 'NN-SYNTHESIZE' ;
T__95 : 'VB-WAIT' ;
T__96 : 'VB-WASH' ;
T__97 : 'VB-YIELD' ;
T__98 : 'NN-YIELD' ;
T__99 : 'COLON' ;
T__100 : 'COMMA' ;
T__101 : 'APOST' ;
T__102 : 'NEG' ;
T__103 : 'DASH' ;
T__104 : 'STOP' ;
T__105 : 'NN-PERCENT' ;
T__106 : 'LSQB' ;
T__107 : 'RSQB' ;
T__108 : '-LRB-' ;
T__109 : '-RRB-' ;
T__110 : 'ABL' ;
T__111 : 'ABN' ;
T__112 : 'ABX' ;
T__113 : 'AP' ;
T__114 : 'AT' ;
T__115 : 'BE' ;
T__116 : 'BED' ;
T__117 : 'BEDZ' ;
T__118 : 'BEG' ;
T__119 : 'BEM' ;
T__120 : 'BEN' ;
T__121 : 'BER' ;
T__122 : 'BEZ' ;
T__123 : 'CC' ;
T__124 : 'CD' ;
T__125 : 'CS' ;
T__126 : 'DO' ;
T__127 : 'DOD' ;
T__128 : 'DOZ' ;
T__129 : 'DT' ;
T__130 : 'DT-THE' ;
T__131 : 'DTI' ;
T__132 : 'DTS' ;
T__133 : 'DTX' ;
T__134 : 'EX' ;
T__135 : 'FW' ;
T__136 : 'FW-IN' ;
T__137 : 'HV' ;
T__138 : 'HVD' ;
T__139 : 'HVG' ;
T__140 : 'HVN' ;
T__141 : 'IN' ;
T__142 : 'JJ' ;
T__143 : 'JJR' ;
T__144 : 'JJS' ;
T__145 : 'JJT' ;
T__146 : 'MD' ;
T__147 : 'NC' ;
T__148 : 'NN' ;
T__149 : 'NN$' ;
T__150 : 'NNS' ;
T__151 : 'NNS$' ;
T__152 : 'NP' ;
T__153 : 'NNP' ;
T__154 : 'NP$' ;
T__155 : 'NPS' ;
T__156 : 'NPS$' ;
T__157 : 'NR' ;
T__158 : 'OD' ;
T__159 : 'PN' ;
T__160 : 'PN$' ;
T__161 : 'PP$' ;
T__162 : 'PP$$' ;
T__163 : 'PPL' ;
T__164 : 'PPLS' ;
T__165 : 'PRP' ;
T__166 : 'PPO' ;
T__167 : 'PPS' ;
T__168 : 'PPSS' ;
T__169 : 'QL' ;
T__170 : 'QLP' ;
T__171 : 'RB' ;
T__172 : 'RBR' ;
T__173 : 'RB-CONJ' ;
T__174 : 'RBT' ;
T__175 : 'RBS' ;
T__176 : 'RN' ;
T__177 : 'RP' ;
T__178 : 'SYM' ;
T__179 : 'TO' ;
T__180 : 'UH' ;
T__181 : 'VB' ;
T__182 : 'VBP' ;
T__183 : 'VBD' ;
T__184 : 'VBG' ;
T__185 : 'VBN' ;
T__186 : 'VBZ' ;
T__187 : 'WDT' ;
T__188 : 'WP$' ;
T__189 : 'WPO' ;
T__190 : 'WPS' ;
T__191 : 'WQL' ;
T__192 : 'WRB' ;
T__193 : 'PDT' ;

// $ANTLR src "uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g" 18
WS	:	 (' '|'\t')+ {skip();};
// $ANTLR src "uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g" 19
NEWLINE	:	'\r'? '\n';


// $ANTLR src "uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g" 22
fragment ACHAR	:	('A'..'Z') | ('a'..'z');

// fragment ACHAR : ~('\\'|'"') ; 

// $ANTLR src "uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g" 26
fragment DIGIT	: ('0'..'9');
// $ANTLR src "uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g" 27
fragment UNICODE	:  '\u00B0'..'\ufffe';

//TOKEN	:	(ACHAR|DIGIT|UNICODE)+;
// $ANTLR src "uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g" 30
TOKEN : (ACHAR|'?'|';'| '_'|',' |'.'|')'|'('|'/'|'-'|'='|':'|'%'|'\''|'{'|'}'|'['|']'|'>'|'<'|'@'|'+'|'|'|DIGIT|UNICODE)+;



