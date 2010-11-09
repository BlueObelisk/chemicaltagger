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
T__83 : 'VB-IMMERSE' ;
T__84 : 'VB-PARTITION' ;
T__85 : 'VB-PRECIPITATE' ;
T__86 : 'NN-PRECIPITATE' ;
T__87 : 'VB-PURIFY' ;
T__88 : 'NN-PURIFY' ;
T__89 : 'VB-QUENCH' ;
T__90 : 'VB-RECOVER' ;
T__91 : 'VB-REMOVE' ;
T__92 : 'NN-REMOVE' ;
T__93 : 'VB-STIR' ;
T__94 : 'VB-SYNTHESIZE' ;
T__95 : 'NN-SYNTHESIZE' ;
T__96 : 'VB-WAIT' ;
T__97 : 'VB-WASH' ;
T__98 : 'VB-YIELD' ;
T__99 : 'NN-YIELD' ;
T__100 : 'COLON' ;
T__101 : 'COMMA' ;
T__102 : 'APOST' ;
T__103 : 'NEG' ;
T__104 : 'DASH' ;
T__105 : 'STOP' ;
T__106 : 'NN-PERCENT' ;
T__107 : 'LSQB' ;
T__108 : 'RSQB' ;
T__109 : '-LRB-' ;
T__110 : '-RRB-' ;
T__111 : 'ABL' ;
T__112 : 'ABN' ;
T__113 : 'ABX' ;
T__114 : 'AP' ;
T__115 : 'AT' ;
T__116 : 'BE' ;
T__117 : 'BED' ;
T__118 : 'BEDZ' ;
T__119 : 'BEG' ;
T__120 : 'BEM' ;
T__121 : 'BEN' ;
T__122 : 'BER' ;
T__123 : 'BEZ' ;
T__124 : 'CC' ;
T__125 : 'CD' ;
T__126 : 'CS' ;
T__127 : 'DO' ;
T__128 : 'DOD' ;
T__129 : 'DOZ' ;
T__130 : 'DT' ;
T__131 : 'DT-THE' ;
T__132 : 'DTI' ;
T__133 : 'DTS' ;
T__134 : 'DTX' ;
T__135 : 'EX' ;
T__136 : 'FW' ;
T__137 : 'FW-IN' ;
T__138 : 'HV' ;
T__139 : 'HVD' ;
T__140 : 'HVG' ;
T__141 : 'HVN' ;
T__142 : 'IN' ;
T__143 : 'JJ' ;
T__144 : 'JJR' ;
T__145 : 'JJS' ;
T__146 : 'JJT' ;
T__147 : 'MD' ;
T__148 : 'NC' ;
T__149 : 'NN' ;
T__150 : 'NN$' ;
T__151 : 'NNS' ;
T__152 : 'NNS$' ;
T__153 : 'NP' ;
T__154 : 'NNP' ;
T__155 : 'NP$' ;
T__156 : 'NPS' ;
T__157 : 'NPS$' ;
T__158 : 'NR' ;
T__159 : 'OD' ;
T__160 : 'PN' ;
T__161 : 'PN$' ;
T__162 : 'PP$' ;
T__163 : 'PP$$' ;
T__164 : 'PPL' ;
T__165 : 'PPLS' ;
T__166 : 'PRP' ;
T__167 : 'PPO' ;
T__168 : 'PPS' ;
T__169 : 'PPSS' ;
T__170 : 'QL' ;
T__171 : 'QLP' ;
T__172 : 'RB' ;
T__173 : 'RBR' ;
T__174 : 'RB-CONJ' ;
T__175 : 'RBT' ;
T__176 : 'RBS' ;
T__177 : 'RN' ;
T__178 : 'RP' ;
T__179 : 'SYM' ;
T__180 : 'TO' ;
T__181 : 'UH' ;
T__182 : 'VB' ;
T__183 : 'VBP' ;
T__184 : 'VBD' ;
T__185 : 'VBG' ;
T__186 : 'VBN' ;
T__187 : 'VBZ' ;
T__188 : 'WDT' ;
T__189 : 'WP$' ;
T__190 : 'WPO' ;
T__191 : 'WPS' ;
T__192 : 'WQL' ;
T__193 : 'WRB' ;
T__194 : 'PDT' ;

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



