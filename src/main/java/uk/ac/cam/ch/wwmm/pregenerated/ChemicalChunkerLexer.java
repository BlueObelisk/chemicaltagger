// $ANTLR 3.2 Sep 23, 2009 14:05:07 uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g 2011-03-31 17:14:39
package uk.ac.cam.ch.wwmm.pregenerated;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ChemicalChunkerLexer extends Lexer {
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int TOKEN=35;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int CYCLES=10;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__90=90;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int AMOUNT=19;
    public static final int T__154=154;
    public static final int CITATION=12;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int T__95=95;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int TimePhrase=15;
    public static final int MOLAR=23;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int PrepPhrase=14;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int WS=30;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RATIO=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int NounPhrase=6;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int T__219=219;
    public static final int TempPhrase=18;
    public static final int T__217=217;
    public static final int T__218=218;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int VerbPhrase=9;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int UNNAMEDMOLECULE=28;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__202=202;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int MOLECULE=27;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int Unmatched=5;
    public static final int RolePrepPhrase=16;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int UNICODE=34;
    public static final int MIXTURE=13;
    public static final int ACHAR=32;
    public static final int VOLUME=22;
    public static final int Sentence=4;
    public static final int MASS=20;
    public static final int DissolvePhrase=8;
    public static final int QUANTITY=29;
    public static final int MultipleApparatus=7;
    public static final int APPARATUS=24;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int AtmospherePhrase=17;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int MULTIPLE=25;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__199=199;
    public static final int T__58=58;
    public static final int T__198=198;
    public static final int T__51=51;
    public static final int T__197=197;
    public static final int T__52=52;
    public static final int T__196=196;
    public static final int T__53=53;
    public static final int T__195=195;
    public static final int T__54=54;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__59=59;
    public static final int DIGIT=33;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__43=43;
    public static final int T__186=186;
    public static final int T__40=40;
    public static final int T__185=185;
    public static final int T__41=41;
    public static final int T__188=188;
    public static final int T__46=46;
    public static final int T__187=187;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int PERCENT=21;
    public static final int T__189=189;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int NEWLINE=31;
    public static final int T__176=176;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int OSCARCM=26;

    // delegates
    // delegators

    public ChemicalChunkerLexer() {;} 
    public ChemicalChunkerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ChemicalChunkerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:9:7: ( 'CD-ALPHANUM' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:9:9: 'CD-ALPHANUM'
            {
            match("CD-ALPHANUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:10:7: ( 'OSCAR-CJ' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:10:9: 'OSCAR-CJ'
            {
            match("OSCAR-CJ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:11:7: ( 'OSCAR-RN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:11:9: 'OSCAR-RN'
            {
            match("OSCAR-RN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:12:7: ( 'OSCAR-CPR' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:12:9: 'OSCAR-CPR'
            {
            match("OSCAR-CPR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:13:7: ( 'OSCAR-ONT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:13:9: 'OSCAR-ONT'
            {
            match("OSCAR-ONT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:14:7: ( 'TM-UNICODE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:14:9: 'TM-UNICODE'
            {
            match("TM-UNICODE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:15:7: ( 'CD-UNICODE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:15:9: 'CD-UNICODE'
            {
            match("CD-UNICODE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:16:7: ( 'JJ-CHEM' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:16:9: 'JJ-CHEM'
            {
            match("JJ-CHEM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:17:7: ( 'JJ-COMPOUND' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:17:9: 'JJ-COMPOUND'
            {
            match("JJ-COMPOUND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:18:7: ( 'IN-AS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:18:9: 'IN-AS'
            {
            match("IN-AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:19:7: ( 'IN-BEFORE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:19:9: 'IN-BEFORE'
            {
            match("IN-BEFORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:20:7: ( 'IN-AFTER' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:20:9: 'IN-AFTER'
            {
            match("IN-AFTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:21:7: ( 'IN-IN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:21:9: 'IN-IN'
            {
            match("IN-IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:22:7: ( 'IN-INTO' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:22:9: 'IN-INTO'
            {
            match("IN-INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:23:7: ( 'IN-WITH' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:23:9: 'IN-WITH'
            {
            match("IN-WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:24:7: ( 'IN-WITHOUT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:24:9: 'IN-WITHOUT'
            {
            match("IN-WITHOUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:25:7: ( 'IN-BY' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:25:9: 'IN-BY'
            {
            match("IN-BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:26:7: ( 'IN-VIA' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:26:9: 'IN-VIA'
            {
            match("IN-VIA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:27:7: ( 'IN-OF' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:27:9: 'IN-OF'
            {
            match("IN-OF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:28:7: ( 'IN-ON' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:28:9: 'IN-ON'
            {
            match("IN-ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:29:7: ( 'IN-FOR' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:29:9: 'IN-FOR'
            {
            match("IN-FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:30:7: ( 'IN-FROM' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:30:9: 'IN-FROM'
            {
            match("IN-FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:31:7: ( 'IN-UNDER' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:31:9: 'IN-UNDER'
            {
            match("IN-UNDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:32:7: ( 'IN-OVER' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:32:9: 'IN-OVER'
            {
            match("IN-OVER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:33:7: ( 'IN-OFF' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:33:9: 'IN-OFF'
            {
            match("IN-OFF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:34:7: ( 'NN-EXAMPLE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:34:9: 'NN-EXAMPLE'
            {
            match("NN-EXAMPLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:35:7: ( 'NN-STATE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:35:9: 'NN-STATE'
            {
            match("NN-STATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:36:7: ( 'NN-TIME' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:36:9: 'NN-TIME'
            {
            match("NN-TIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:37:7: ( 'NN-MASS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:37:9: 'NN-MASS'
            {
            match("NN-MASS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:38:7: ( 'NN-MOLAR' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:38:9: 'NN-MOLAR'
            {
            match("NN-MOLAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:39:7: ( 'NN-AMOUNT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:39:9: 'NN-AMOUNT'
            {
            match("NN-AMOUNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:40:7: ( 'NN-ATMOSPHERE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:40:9: 'NN-ATMOSPHERE'
            {
            match("NN-ATMOSPHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:41:7: ( 'NN-EQ' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:41:9: 'NN-EQ'
            {
            match("NN-EQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:42:7: ( 'NN-VOL' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:42:9: 'NN-VOL'
            {
            match("NN-VOL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:43:7: ( 'NN-CHEMENTITY' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:43:9: 'NN-CHEMENTITY'
            {
            match("NN-CHEMENTITY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:44:7: ( 'NN-TEMP' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:44:9: 'NN-TEMP'
            {
            match("NN-TEMP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:45:7: ( 'NN-FLASH' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:45:9: 'NN-FLASH'
            {
            match("NN-FLASH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:46:7: ( 'NN-GENERAL' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:46:9: 'NN-GENERAL'
            {
            match("NN-GENERAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:47:7: ( 'NN-METHOD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:47:9: 'NN-METHOD'
            {
            match("NN-METHOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:48:7: ( 'NN-PRESSURE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:48:9: 'NN-PRESSURE'
            {
            match("NN-PRESSURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:49:7: ( 'NN-COLUMN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:49:9: 'NN-COLUMN'
            {
            match("NN-COLUMN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:50:7: ( 'NN-CHROMATOGRAPHY' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:50:9: 'NN-CHROMATOGRAPHY'
            {
            match("NN-CHROMATOGRAPHY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:51:7: ( 'NN-VACUUM' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:51:9: 'NN-VACUUM'
            {
            match("NN-VACUUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:52:7: ( 'NN-CYCLE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:52:9: 'NN-CYCLE'
            {
            match("NN-CYCLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:53:7: ( 'NN-TIMES' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:53:9: 'NN-TIMES'
            {
            match("NN-TIMES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:54:7: ( 'OSCAR-CM' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:54:9: 'OSCAR-CM'
            {
            match("OSCAR-CM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:55:7: ( 'VB-USE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:55:9: 'VB-USE'
            {
            match("VB-USE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:7: ( 'VB-CHANGE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:9: 'VB-CHANGE'
            {
            match("VB-CHANGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:57:7: ( 'VB-SUBMERGE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:57:9: 'VB-SUBMERGE'
            {
            match("VB-SUBMERGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:58:7: ( 'VB-SUBJECT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:58:9: 'VB-SUBJECT'
            {
            match("VB-SUBJECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:59:7: ( 'NN-ADD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:59:9: 'NN-ADD'
            {
            match("NN-ADD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:60:7: ( 'NN-MIXTURE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:60:9: 'NN-MIXTURE'
            {
            match("NN-MIXTURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:61:7: ( 'VB-DILUTE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:61:9: 'VB-DILUTE'
            {
            match("VB-DILUTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:62:7: ( 'VB-ADD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:62:9: 'VB-ADD'
            {
            match("VB-ADD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:63:7: ( 'VB-CHARGE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:63:9: 'VB-CHARGE'
            {
            match("VB-CHARGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:64:7: ( 'VB-CONTAIN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:64:9: 'VB-CONTAIN'
            {
            match("VB-CONTAIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:65:7: ( 'VB-DROP' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:65:9: 'VB-DROP'
            {
            match("VB-DROP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:66:7: ( 'VB-FILL' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:66:9: 'VB-FILL'
            {
            match("VB-FILL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:67:7: ( 'VB-SUSPEND' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:67:9: 'VB-SUSPEND'
            {
            match("VB-SUSPEND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:68:7: ( 'VB-TREAT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:68:9: 'VB-TREAT'
            {
            match("VB-TREAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:69:7: ( 'VB-APPARATUS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:69:9: 'VB-APPARATUS'
            {
            match("VB-APPARATUS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:70:7: ( 'NN-APPARATUS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:70:9: 'NN-APPARATUS'
            {
            match("NN-APPARATUS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:71:7: ( 'VB-CONCENTRATE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:71:9: 'VB-CONCENTRATE'
            {
            match("VB-CONCENTRATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:72:7: ( 'NN-CONCENTRATE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:72:9: 'NN-CONCENTRATE'
            {
            match("NN-CONCENTRATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:73:8: ( 'VB-COOL' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:73:10: 'VB-COOL'
            {
            match("VB-COOL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:74:8: ( 'VB-DEGASS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:74:10: 'VB-DEGASS'
            {
            match("VB-DEGASS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:75:8: ( 'VB-DISSOLVE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:75:10: 'VB-DISSOLVE'
            {
            match("VB-DISSOLVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:76:8: ( 'VB-DRY' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:76:10: 'VB-DRY'
            {
            match("VB-DRY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:77:8: ( 'NN-DRY' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:77:10: 'NN-DRY'
            {
            match("NN-DRY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:78:8: ( 'VB-EXTRACT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:78:10: 'VB-EXTRACT'
            {
            match("VB-EXTRACT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:79:8: ( 'NN-EXTRACT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:79:10: 'NN-EXTRACT'
            {
            match("NN-EXTRACT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:80:8: ( 'VB-FILTER' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:80:10: 'VB-FILTER'
            {
            match("VB-FILTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:81:8: ( 'NN-FILTER' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:81:10: 'NN-FILTER'
            {
            match("NN-FILTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:82:8: ( 'VB-HEAT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:82:10: 'VB-HEAT'
            {
            match("VB-HEAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:83:8: ( 'VB-INCREASE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:83:10: 'VB-INCREASE'
            {
            match("VB-INCREASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:84:8: ( 'VB-IMMERSE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:84:10: 'VB-IMMERSE'
            {
            match("VB-IMMERSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:85:8: ( 'VB-PARTITION' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:85:10: 'VB-PARTITION'
            {
            match("VB-PARTITION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:86:8: ( 'VB-PRECIPITATE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:86:10: 'VB-PRECIPITATE'
            {
            match("VB-PRECIPITATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:87:8: ( 'NN-PRECIPITATE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:87:10: 'NN-PRECIPITATE'
            {
            match("NN-PRECIPITATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:88:8: ( 'VB-PURIFY' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:88:10: 'VB-PURIFY'
            {
            match("VB-PURIFY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:89:8: ( 'NN-PURIFY' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:89:10: 'NN-PURIFY'
            {
            match("NN-PURIFY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:90:8: ( 'VB-QUENCH' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:90:10: 'VB-QUENCH'
            {
            match("VB-QUENCH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:91:8: ( 'VB-RECOVER' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:91:10: 'VB-RECOVER'
            {
            match("VB-RECOVER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:92:8: ( 'VB-REMOVE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:92:10: 'VB-REMOVE'
            {
            match("VB-REMOVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:93:8: ( 'NN-REMOVE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:93:10: 'NN-REMOVE'
            {
            match("NN-REMOVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:94:8: ( 'VB-STIR' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:94:10: 'VB-STIR'
            {
            match("VB-STIR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:95:8: ( 'VB-SYNTHESIZE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:95:10: 'VB-SYNTHESIZE'
            {
            match("VB-SYNTHESIZE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:96:8: ( 'NN-SYNTHESIZE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:96:10: 'NN-SYNTHESIZE'
            {
            match("NN-SYNTHESIZE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:97:8: ( 'VB-WAIT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:97:10: 'VB-WAIT'
            {
            match("VB-WAIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:98:8: ( 'VB-WASH' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:98:10: 'VB-WASH'
            {
            match("VB-WASH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:99:8: ( 'VB-YIELD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:99:10: 'VB-YIELD'
            {
            match("VB-YIELD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:100:8: ( 'NN-YIELD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:100:10: 'NN-YIELD'
            {
            match("NN-YIELD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:101:8: ( 'COLON' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:101:10: 'COLON'
            {
            match("COLON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:102:8: ( 'COMMA' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:102:10: 'COMMA'
            {
            match("COMMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:103:8: ( 'APOST' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:103:10: 'APOST'
            {
            match("APOST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:104:8: ( 'NEG' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:104:10: 'NEG'
            {
            match("NEG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:105:8: ( 'DASH' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:105:10: 'DASH'
            {
            match("DASH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:106:8: ( 'STOP' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:106:10: 'STOP'
            {
            match("STOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:107:8: ( 'NN-PERCENT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:107:10: 'NN-PERCENT'
            {
            match("NN-PERCENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:108:8: ( 'LSQB' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:108:10: 'LSQB'
            {
            match("LSQB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:109:8: ( 'RSQB' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:109:10: 'RSQB'
            {
            match("RSQB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:110:8: ( '-LRB-' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:110:10: '-LRB-'
            {
            match("-LRB-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:111:8: ( '-RRB-' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:111:10: '-RRB-'
            {
            match("-RRB-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:112:8: ( 'ABL' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:112:10: 'ABL'
            {
            match("ABL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:113:8: ( 'ABN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:113:10: 'ABN'
            {
            match("ABN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:114:8: ( 'ABX' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:114:10: 'ABX'
            {
            match("ABX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:115:8: ( 'AP' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:115:10: 'AP'
            {
            match("AP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:116:8: ( 'AT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:116:10: 'AT'
            {
            match("AT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:117:8: ( 'BE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:117:10: 'BE'
            {
            match("BE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:118:8: ( 'BED' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:118:10: 'BED'
            {
            match("BED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:119:8: ( 'BEDZ' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:119:10: 'BEDZ'
            {
            match("BEDZ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:120:8: ( 'BEG' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:120:10: 'BEG'
            {
            match("BEG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:121:8: ( 'BEM' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:121:10: 'BEM'
            {
            match("BEM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:122:8: ( 'BEN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:122:10: 'BEN'
            {
            match("BEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:123:8: ( 'BER' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:123:10: 'BER'
            {
            match("BER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:124:8: ( 'BEZ' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:124:10: 'BEZ'
            {
            match("BEZ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:125:8: ( 'CC' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:125:10: 'CC'
            {
            match("CC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:126:8: ( 'CD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:126:10: 'CD'
            {
            match("CD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:127:8: ( 'CS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:127:10: 'CS'
            {
            match("CS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:128:8: ( 'DO' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:128:10: 'DO'
            {
            match("DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:129:8: ( 'DOD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:129:10: 'DOD'
            {
            match("DOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:130:8: ( 'DOZ' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:130:10: 'DOZ'
            {
            match("DOZ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:131:8: ( 'DT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:131:10: 'DT'
            {
            match("DT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:132:8: ( 'DT-THE' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:132:10: 'DT-THE'
            {
            match("DT-THE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:133:8: ( 'DTI' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:133:10: 'DTI'
            {
            match("DTI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:134:8: ( 'DTS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:134:10: 'DTS'
            {
            match("DTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:135:8: ( 'DTX' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:135:10: 'DTX'
            {
            match("DTX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:136:8: ( 'EX' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:136:10: 'EX'
            {
            match("EX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:137:8: ( 'FW' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:137:10: 'FW'
            {
            match("FW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:138:8: ( 'FW-IN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:138:10: 'FW-IN'
            {
            match("FW-IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:139:8: ( 'HV' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:139:10: 'HV'
            {
            match("HV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:140:8: ( 'HVD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:140:10: 'HVD'
            {
            match("HVD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:141:8: ( 'HVG' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:141:10: 'HVG'
            {
            match("HVG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:142:8: ( 'HVN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:142:10: 'HVN'
            {
            match("HVN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:143:8: ( 'IN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:143:10: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:144:8: ( 'JJ' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:144:10: 'JJ'
            {
            match("JJ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:145:8: ( 'JJR' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:145:10: 'JJR'
            {
            match("JJR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:146:8: ( 'JJS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:146:10: 'JJS'
            {
            match("JJS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:147:8: ( 'JJT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:147:10: 'JJT'
            {
            match("JJT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:148:8: ( 'MD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:148:10: 'MD'
            {
            match("MD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:149:8: ( 'NC' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:149:10: 'NC'
            {
            match("NC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:150:8: ( 'NN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:150:10: 'NN'
            {
            match("NN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:151:8: ( 'NN$' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:151:10: 'NN$'
            {
            match("NN$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:152:8: ( 'NNS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:152:10: 'NNS'
            {
            match("NNS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:153:8: ( 'NNS$' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:153:10: 'NNS$'
            {
            match("NNS$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:154:8: ( 'NP' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:154:10: 'NP'
            {
            match("NP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:155:8: ( 'NNP' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:155:10: 'NNP'
            {
            match("NNP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:156:8: ( 'NP$' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:156:10: 'NP$'
            {
            match("NP$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:157:8: ( 'NPS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:157:10: 'NPS'
            {
            match("NPS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:158:8: ( 'NPS$' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:158:10: 'NPS$'
            {
            match("NPS$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "T__186"
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:159:8: ( 'NR' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:159:10: 'NR'
            {
            match("NR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__186"

    // $ANTLR start "T__187"
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:160:8: ( 'OD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:160:10: 'OD'
            {
            match("OD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__187"

    // $ANTLR start "T__188"
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:161:8: ( 'PN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:161:10: 'PN'
            {
            match("PN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__188"

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:162:8: ( 'PN$' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:162:10: 'PN$'
            {
            match("PN$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:163:8: ( 'PP$' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:163:10: 'PP$'
            {
            match("PP$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:164:8: ( 'PP$$' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:164:10: 'PP$$'
            {
            match("PP$$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "T__192"
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:165:8: ( 'PPL' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:165:10: 'PPL'
            {
            match("PPL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__192"

    // $ANTLR start "T__193"
    public final void mT__193() throws RecognitionException {
        try {
            int _type = T__193;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:166:8: ( 'PPLS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:166:10: 'PPLS'
            {
            match("PPLS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__193"

    // $ANTLR start "T__194"
    public final void mT__194() throws RecognitionException {
        try {
            int _type = T__194;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:167:8: ( 'PRP' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:167:10: 'PRP'
            {
            match("PRP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__194"

    // $ANTLR start "T__195"
    public final void mT__195() throws RecognitionException {
        try {
            int _type = T__195;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:168:8: ( 'PRP$' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:168:10: 'PRP$'
            {
            match("PRP$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__195"

    // $ANTLR start "T__196"
    public final void mT__196() throws RecognitionException {
        try {
            int _type = T__196;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:169:8: ( 'PPO' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:169:10: 'PPO'
            {
            match("PPO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__196"

    // $ANTLR start "T__197"
    public final void mT__197() throws RecognitionException {
        try {
            int _type = T__197;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:170:8: ( 'PPS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:170:10: 'PPS'
            {
            match("PPS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__197"

    // $ANTLR start "T__198"
    public final void mT__198() throws RecognitionException {
        try {
            int _type = T__198;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:171:8: ( 'PPSS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:171:10: 'PPSS'
            {
            match("PPSS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__198"

    // $ANTLR start "T__199"
    public final void mT__199() throws RecognitionException {
        try {
            int _type = T__199;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:172:8: ( 'QL' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:172:10: 'QL'
            {
            match("QL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__199"

    // $ANTLR start "T__200"
    public final void mT__200() throws RecognitionException {
        try {
            int _type = T__200;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:173:8: ( 'QLP' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:173:10: 'QLP'
            {
            match("QLP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__200"

    // $ANTLR start "T__201"
    public final void mT__201() throws RecognitionException {
        try {
            int _type = T__201;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:174:8: ( 'RB' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:174:10: 'RB'
            {
            match("RB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__201"

    // $ANTLR start "T__202"
    public final void mT__202() throws RecognitionException {
        try {
            int _type = T__202;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:175:8: ( 'RBR' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:175:10: 'RBR'
            {
            match("RBR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__202"

    // $ANTLR start "T__203"
    public final void mT__203() throws RecognitionException {
        try {
            int _type = T__203;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:176:8: ( 'RB-CONJ' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:176:10: 'RB-CONJ'
            {
            match("RB-CONJ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__203"

    // $ANTLR start "T__204"
    public final void mT__204() throws RecognitionException {
        try {
            int _type = T__204;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:177:8: ( 'RBT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:177:10: 'RBT'
            {
            match("RBT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__204"

    // $ANTLR start "T__205"
    public final void mT__205() throws RecognitionException {
        try {
            int _type = T__205;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:178:8: ( 'RBS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:178:10: 'RBS'
            {
            match("RBS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__205"

    // $ANTLR start "T__206"
    public final void mT__206() throws RecognitionException {
        try {
            int _type = T__206;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:179:8: ( 'RN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:179:10: 'RN'
            {
            match("RN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__206"

    // $ANTLR start "T__207"
    public final void mT__207() throws RecognitionException {
        try {
            int _type = T__207;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:180:8: ( 'RP' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:180:10: 'RP'
            {
            match("RP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__207"

    // $ANTLR start "T__208"
    public final void mT__208() throws RecognitionException {
        try {
            int _type = T__208;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:181:8: ( 'SYM' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:181:10: 'SYM'
            {
            match("SYM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__208"

    // $ANTLR start "T__209"
    public final void mT__209() throws RecognitionException {
        try {
            int _type = T__209;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:182:8: ( 'TO' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:182:10: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__209"

    // $ANTLR start "T__210"
    public final void mT__210() throws RecognitionException {
        try {
            int _type = T__210;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:183:8: ( 'UH' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:183:10: 'UH'
            {
            match("UH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__210"

    // $ANTLR start "T__211"
    public final void mT__211() throws RecognitionException {
        try {
            int _type = T__211;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:184:8: ( 'VB' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:184:10: 'VB'
            {
            match("VB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__211"

    // $ANTLR start "T__212"
    public final void mT__212() throws RecognitionException {
        try {
            int _type = T__212;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:185:8: ( 'VBP' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:185:10: 'VBP'
            {
            match("VBP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__212"

    // $ANTLR start "T__213"
    public final void mT__213() throws RecognitionException {
        try {
            int _type = T__213;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:186:8: ( 'VBD' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:186:10: 'VBD'
            {
            match("VBD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__213"

    // $ANTLR start "T__214"
    public final void mT__214() throws RecognitionException {
        try {
            int _type = T__214;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:187:8: ( 'VBG' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:187:10: 'VBG'
            {
            match("VBG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__214"

    // $ANTLR start "T__215"
    public final void mT__215() throws RecognitionException {
        try {
            int _type = T__215;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:188:8: ( 'VBN' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:188:10: 'VBN'
            {
            match("VBN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__215"

    // $ANTLR start "T__216"
    public final void mT__216() throws RecognitionException {
        try {
            int _type = T__216;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:189:8: ( 'VBZ' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:189:10: 'VBZ'
            {
            match("VBZ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__216"

    // $ANTLR start "T__217"
    public final void mT__217() throws RecognitionException {
        try {
            int _type = T__217;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:190:8: ( 'WDT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:190:10: 'WDT'
            {
            match("WDT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__217"

    // $ANTLR start "T__218"
    public final void mT__218() throws RecognitionException {
        try {
            int _type = T__218;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:191:8: ( 'WP$' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:191:10: 'WP$'
            {
            match("WP$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__218"

    // $ANTLR start "T__219"
    public final void mT__219() throws RecognitionException {
        try {
            int _type = T__219;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:192:8: ( 'WPO' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:192:10: 'WPO'
            {
            match("WPO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__219"

    // $ANTLR start "T__220"
    public final void mT__220() throws RecognitionException {
        try {
            int _type = T__220;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:193:8: ( 'WPS' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:193:10: 'WPS'
            {
            match("WPS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__220"

    // $ANTLR start "T__221"
    public final void mT__221() throws RecognitionException {
        try {
            int _type = T__221;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:194:8: ( 'WQL' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:194:10: 'WQL'
            {
            match("WQL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__221"

    // $ANTLR start "T__222"
    public final void mT__222() throws RecognitionException {
        try {
            int _type = T__222;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:195:8: ( 'WRB' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:195:10: 'WRB'
            {
            match("WRB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__222"

    // $ANTLR start "T__223"
    public final void mT__223() throws RecognitionException {
        try {
            int _type = T__223;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:196:8: ( 'PDT' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:196:10: 'PDT'
            {
            match("PDT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__223"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:45:4: ( ( ' ' | '\\t' )+ )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:45:7: ( ' ' | '\\t' )+
            {
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:45:7: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case '\t':
                case ' ':
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:46:9: ( ( '\\r' )? '\\n' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:46:11: ( '\\r' )? '\\n'
            {
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:46:11: ( '\\r' )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case '\r':
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:46:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "ACHAR"
    public final void mACHAR() throws RecognitionException {
        try {
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:48:16: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt3=1;
                }
                break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:48:18: ( 'A' .. 'Z' )
                    {
                    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:48:18: ( 'A' .. 'Z' )
                    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:48:19: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 2 :
                    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:48:31: ( 'a' .. 'z' )
                    {
                    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:48:31: ( 'a' .. 'z' )
                    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:48:32: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ACHAR"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:52:16: ( ( '0' .. '9' ) )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:52:18: ( '0' .. '9' )
            {
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:52:18: ( '0' .. '9' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:52:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "UNICODE"
    public final void mUNICODE() throws RecognitionException {
        try {
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:53:18: ( '\\u00A0' .. '\\ufffe' )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:53:21: '\\u00A0' .. '\\ufffe'
            {
            matchRange('\u00A0','\uFFFE'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE"

    // $ANTLR start "TOKEN"
    public final void mTOKEN() throws RecognitionException {
        try {
            int _type = TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:7: ( ( ACHAR | '?' | '&' | ';' | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | ':' | '%' | '\\'' | '{' | '}' | '[' | ']' | '>' | '<' | '@' | '+' | '|' | DIGIT | UNICODE )+ )
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:9: ( ACHAR | '?' | '&' | ';' | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | ':' | '%' | '\\'' | '{' | '}' | '[' | ']' | '>' | '<' | '@' | '+' | '|' | DIGIT | UNICODE )+
            {
            // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:9: ( ACHAR | '?' | '&' | ';' | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | ':' | '%' | '\\'' | '{' | '}' | '[' | ']' | '>' | '<' | '@' | '+' | '|' | DIGIT | UNICODE )+
            int cnt4=0;
            loop4:
            do {
                int alt4=27;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:10: ACHAR
            	    {
            	    mACHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:16: '?'
            	    {
            	    match('?'); 

            	    }
            	    break;
            	case 3 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:20: '&'
            	    {
            	    match('&'); 

            	    }
            	    break;
            	case 4 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:24: ';'
            	    {
            	    match(';'); 

            	    }
            	    break;
            	case 5 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:29: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 6 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:33: ','
            	    {
            	    match(','); 

            	    }
            	    break;
            	case 7 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:38: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 8 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:42: ')'
            	    {
            	    match(')'); 

            	    }
            	    break;
            	case 9 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:46: '('
            	    {
            	    match('('); 

            	    }
            	    break;
            	case 10 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:50: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 11 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:54: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 12 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:58: '='
            	    {
            	    match('='); 

            	    }
            	    break;
            	case 13 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:62: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;
            	case 14 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:66: '%'
            	    {
            	    match('%'); 

            	    }
            	    break;
            	case 15 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:70: '\\''
            	    {
            	    match('\''); 

            	    }
            	    break;
            	case 16 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:75: '{'
            	    {
            	    match('{'); 

            	    }
            	    break;
            	case 17 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:79: '}'
            	    {
            	    match('}'); 

            	    }
            	    break;
            	case 18 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:83: '['
            	    {
            	    match('['); 

            	    }
            	    break;
            	case 19 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:87: ']'
            	    {
            	    match(']'); 

            	    }
            	    break;
            	case 20 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:91: '>'
            	    {
            	    match('>'); 

            	    }
            	    break;
            	case 21 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:95: '<'
            	    {
            	    match('<'); 

            	    }
            	    break;
            	case 22 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:99: '@'
            	    {
            	    match('@'); 

            	    }
            	    break;
            	case 23 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:103: '+'
            	    {
            	    match('+'); 

            	    }
            	    break;
            	case 24 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:107: '|'
            	    {
            	    match('|'); 

            	    }
            	    break;
            	case 25 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:111: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;
            	case 26 :
            	    // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:56:117: UNICODE
            	    {
            	    mUNICODE(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TOKEN"

    public void mTokens() throws RecognitionException {
        // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | WS | NEWLINE | TOKEN )
        int alt5=191;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:10: T__36
                {
                mT__36(); 

                }
                break;
            case 2 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:16: T__37
                {
                mT__37(); 

                }
                break;
            case 3 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:22: T__38
                {
                mT__38(); 

                }
                break;
            case 4 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:28: T__39
                {
                mT__39(); 

                }
                break;
            case 5 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:34: T__40
                {
                mT__40(); 

                }
                break;
            case 6 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:40: T__41
                {
                mT__41(); 

                }
                break;
            case 7 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:46: T__42
                {
                mT__42(); 

                }
                break;
            case 8 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:52: T__43
                {
                mT__43(); 

                }
                break;
            case 9 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:58: T__44
                {
                mT__44(); 

                }
                break;
            case 10 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:64: T__45
                {
                mT__45(); 

                }
                break;
            case 11 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:70: T__46
                {
                mT__46(); 

                }
                break;
            case 12 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:76: T__47
                {
                mT__47(); 

                }
                break;
            case 13 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:82: T__48
                {
                mT__48(); 

                }
                break;
            case 14 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:88: T__49
                {
                mT__49(); 

                }
                break;
            case 15 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:94: T__50
                {
                mT__50(); 

                }
                break;
            case 16 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:100: T__51
                {
                mT__51(); 

                }
                break;
            case 17 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:106: T__52
                {
                mT__52(); 

                }
                break;
            case 18 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:112: T__53
                {
                mT__53(); 

                }
                break;
            case 19 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:118: T__54
                {
                mT__54(); 

                }
                break;
            case 20 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:124: T__55
                {
                mT__55(); 

                }
                break;
            case 21 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:130: T__56
                {
                mT__56(); 

                }
                break;
            case 22 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:136: T__57
                {
                mT__57(); 

                }
                break;
            case 23 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:142: T__58
                {
                mT__58(); 

                }
                break;
            case 24 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:148: T__59
                {
                mT__59(); 

                }
                break;
            case 25 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:154: T__60
                {
                mT__60(); 

                }
                break;
            case 26 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:160: T__61
                {
                mT__61(); 

                }
                break;
            case 27 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:166: T__62
                {
                mT__62(); 

                }
                break;
            case 28 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:172: T__63
                {
                mT__63(); 

                }
                break;
            case 29 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:178: T__64
                {
                mT__64(); 

                }
                break;
            case 30 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:184: T__65
                {
                mT__65(); 

                }
                break;
            case 31 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:190: T__66
                {
                mT__66(); 

                }
                break;
            case 32 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:196: T__67
                {
                mT__67(); 

                }
                break;
            case 33 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:202: T__68
                {
                mT__68(); 

                }
                break;
            case 34 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:208: T__69
                {
                mT__69(); 

                }
                break;
            case 35 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:214: T__70
                {
                mT__70(); 

                }
                break;
            case 36 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:220: T__71
                {
                mT__71(); 

                }
                break;
            case 37 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:226: T__72
                {
                mT__72(); 

                }
                break;
            case 38 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:232: T__73
                {
                mT__73(); 

                }
                break;
            case 39 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:238: T__74
                {
                mT__74(); 

                }
                break;
            case 40 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:244: T__75
                {
                mT__75(); 

                }
                break;
            case 41 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:250: T__76
                {
                mT__76(); 

                }
                break;
            case 42 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:256: T__77
                {
                mT__77(); 

                }
                break;
            case 43 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:262: T__78
                {
                mT__78(); 

                }
                break;
            case 44 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:268: T__79
                {
                mT__79(); 

                }
                break;
            case 45 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:274: T__80
                {
                mT__80(); 

                }
                break;
            case 46 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:280: T__81
                {
                mT__81(); 

                }
                break;
            case 47 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:286: T__82
                {
                mT__82(); 

                }
                break;
            case 48 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:292: T__83
                {
                mT__83(); 

                }
                break;
            case 49 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:298: T__84
                {
                mT__84(); 

                }
                break;
            case 50 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:304: T__85
                {
                mT__85(); 

                }
                break;
            case 51 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:310: T__86
                {
                mT__86(); 

                }
                break;
            case 52 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:316: T__87
                {
                mT__87(); 

                }
                break;
            case 53 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:322: T__88
                {
                mT__88(); 

                }
                break;
            case 54 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:328: T__89
                {
                mT__89(); 

                }
                break;
            case 55 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:334: T__90
                {
                mT__90(); 

                }
                break;
            case 56 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:340: T__91
                {
                mT__91(); 

                }
                break;
            case 57 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:346: T__92
                {
                mT__92(); 

                }
                break;
            case 58 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:352: T__93
                {
                mT__93(); 

                }
                break;
            case 59 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:358: T__94
                {
                mT__94(); 

                }
                break;
            case 60 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:364: T__95
                {
                mT__95(); 

                }
                break;
            case 61 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:370: T__96
                {
                mT__96(); 

                }
                break;
            case 62 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:376: T__97
                {
                mT__97(); 

                }
                break;
            case 63 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:382: T__98
                {
                mT__98(); 

                }
                break;
            case 64 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:388: T__99
                {
                mT__99(); 

                }
                break;
            case 65 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:394: T__100
                {
                mT__100(); 

                }
                break;
            case 66 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:401: T__101
                {
                mT__101(); 

                }
                break;
            case 67 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:408: T__102
                {
                mT__102(); 

                }
                break;
            case 68 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:415: T__103
                {
                mT__103(); 

                }
                break;
            case 69 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:422: T__104
                {
                mT__104(); 

                }
                break;
            case 70 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:429: T__105
                {
                mT__105(); 

                }
                break;
            case 71 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:436: T__106
                {
                mT__106(); 

                }
                break;
            case 72 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:443: T__107
                {
                mT__107(); 

                }
                break;
            case 73 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:450: T__108
                {
                mT__108(); 

                }
                break;
            case 74 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:457: T__109
                {
                mT__109(); 

                }
                break;
            case 75 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:464: T__110
                {
                mT__110(); 

                }
                break;
            case 76 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:471: T__111
                {
                mT__111(); 

                }
                break;
            case 77 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:478: T__112
                {
                mT__112(); 

                }
                break;
            case 78 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:485: T__113
                {
                mT__113(); 

                }
                break;
            case 79 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:492: T__114
                {
                mT__114(); 

                }
                break;
            case 80 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:499: T__115
                {
                mT__115(); 

                }
                break;
            case 81 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:506: T__116
                {
                mT__116(); 

                }
                break;
            case 82 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:513: T__117
                {
                mT__117(); 

                }
                break;
            case 83 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:520: T__118
                {
                mT__118(); 

                }
                break;
            case 84 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:527: T__119
                {
                mT__119(); 

                }
                break;
            case 85 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:534: T__120
                {
                mT__120(); 

                }
                break;
            case 86 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:541: T__121
                {
                mT__121(); 

                }
                break;
            case 87 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:548: T__122
                {
                mT__122(); 

                }
                break;
            case 88 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:555: T__123
                {
                mT__123(); 

                }
                break;
            case 89 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:562: T__124
                {
                mT__124(); 

                }
                break;
            case 90 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:569: T__125
                {
                mT__125(); 

                }
                break;
            case 91 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:576: T__126
                {
                mT__126(); 

                }
                break;
            case 92 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:583: T__127
                {
                mT__127(); 

                }
                break;
            case 93 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:590: T__128
                {
                mT__128(); 

                }
                break;
            case 94 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:597: T__129
                {
                mT__129(); 

                }
                break;
            case 95 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:604: T__130
                {
                mT__130(); 

                }
                break;
            case 96 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:611: T__131
                {
                mT__131(); 

                }
                break;
            case 97 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:618: T__132
                {
                mT__132(); 

                }
                break;
            case 98 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:625: T__133
                {
                mT__133(); 

                }
                break;
            case 99 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:632: T__134
                {
                mT__134(); 

                }
                break;
            case 100 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:639: T__135
                {
                mT__135(); 

                }
                break;
            case 101 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:646: T__136
                {
                mT__136(); 

                }
                break;
            case 102 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:653: T__137
                {
                mT__137(); 

                }
                break;
            case 103 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:660: T__138
                {
                mT__138(); 

                }
                break;
            case 104 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:667: T__139
                {
                mT__139(); 

                }
                break;
            case 105 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:674: T__140
                {
                mT__140(); 

                }
                break;
            case 106 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:681: T__141
                {
                mT__141(); 

                }
                break;
            case 107 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:688: T__142
                {
                mT__142(); 

                }
                break;
            case 108 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:695: T__143
                {
                mT__143(); 

                }
                break;
            case 109 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:702: T__144
                {
                mT__144(); 

                }
                break;
            case 110 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:709: T__145
                {
                mT__145(); 

                }
                break;
            case 111 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:716: T__146
                {
                mT__146(); 

                }
                break;
            case 112 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:723: T__147
                {
                mT__147(); 

                }
                break;
            case 113 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:730: T__148
                {
                mT__148(); 

                }
                break;
            case 114 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:737: T__149
                {
                mT__149(); 

                }
                break;
            case 115 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:744: T__150
                {
                mT__150(); 

                }
                break;
            case 116 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:751: T__151
                {
                mT__151(); 

                }
                break;
            case 117 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:758: T__152
                {
                mT__152(); 

                }
                break;
            case 118 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:765: T__153
                {
                mT__153(); 

                }
                break;
            case 119 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:772: T__154
                {
                mT__154(); 

                }
                break;
            case 120 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:779: T__155
                {
                mT__155(); 

                }
                break;
            case 121 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:786: T__156
                {
                mT__156(); 

                }
                break;
            case 122 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:793: T__157
                {
                mT__157(); 

                }
                break;
            case 123 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:800: T__158
                {
                mT__158(); 

                }
                break;
            case 124 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:807: T__159
                {
                mT__159(); 

                }
                break;
            case 125 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:814: T__160
                {
                mT__160(); 

                }
                break;
            case 126 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:821: T__161
                {
                mT__161(); 

                }
                break;
            case 127 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:828: T__162
                {
                mT__162(); 

                }
                break;
            case 128 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:835: T__163
                {
                mT__163(); 

                }
                break;
            case 129 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:842: T__164
                {
                mT__164(); 

                }
                break;
            case 130 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:849: T__165
                {
                mT__165(); 

                }
                break;
            case 131 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:856: T__166
                {
                mT__166(); 

                }
                break;
            case 132 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:863: T__167
                {
                mT__167(); 

                }
                break;
            case 133 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:870: T__168
                {
                mT__168(); 

                }
                break;
            case 134 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:877: T__169
                {
                mT__169(); 

                }
                break;
            case 135 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:884: T__170
                {
                mT__170(); 

                }
                break;
            case 136 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:891: T__171
                {
                mT__171(); 

                }
                break;
            case 137 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:898: T__172
                {
                mT__172(); 

                }
                break;
            case 138 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:905: T__173
                {
                mT__173(); 

                }
                break;
            case 139 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:912: T__174
                {
                mT__174(); 

                }
                break;
            case 140 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:919: T__175
                {
                mT__175(); 

                }
                break;
            case 141 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:926: T__176
                {
                mT__176(); 

                }
                break;
            case 142 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:933: T__177
                {
                mT__177(); 

                }
                break;
            case 143 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:940: T__178
                {
                mT__178(); 

                }
                break;
            case 144 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:947: T__179
                {
                mT__179(); 

                }
                break;
            case 145 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:954: T__180
                {
                mT__180(); 

                }
                break;
            case 146 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:961: T__181
                {
                mT__181(); 

                }
                break;
            case 147 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:968: T__182
                {
                mT__182(); 

                }
                break;
            case 148 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:975: T__183
                {
                mT__183(); 

                }
                break;
            case 149 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:982: T__184
                {
                mT__184(); 

                }
                break;
            case 150 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:989: T__185
                {
                mT__185(); 

                }
                break;
            case 151 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:996: T__186
                {
                mT__186(); 

                }
                break;
            case 152 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1003: T__187
                {
                mT__187(); 

                }
                break;
            case 153 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1010: T__188
                {
                mT__188(); 

                }
                break;
            case 154 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1017: T__189
                {
                mT__189(); 

                }
                break;
            case 155 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1024: T__190
                {
                mT__190(); 

                }
                break;
            case 156 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1031: T__191
                {
                mT__191(); 

                }
                break;
            case 157 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1038: T__192
                {
                mT__192(); 

                }
                break;
            case 158 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1045: T__193
                {
                mT__193(); 

                }
                break;
            case 159 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1052: T__194
                {
                mT__194(); 

                }
                break;
            case 160 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1059: T__195
                {
                mT__195(); 

                }
                break;
            case 161 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1066: T__196
                {
                mT__196(); 

                }
                break;
            case 162 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1073: T__197
                {
                mT__197(); 

                }
                break;
            case 163 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1080: T__198
                {
                mT__198(); 

                }
                break;
            case 164 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1087: T__199
                {
                mT__199(); 

                }
                break;
            case 165 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1094: T__200
                {
                mT__200(); 

                }
                break;
            case 166 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1101: T__201
                {
                mT__201(); 

                }
                break;
            case 167 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1108: T__202
                {
                mT__202(); 

                }
                break;
            case 168 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1115: T__203
                {
                mT__203(); 

                }
                break;
            case 169 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1122: T__204
                {
                mT__204(); 

                }
                break;
            case 170 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1129: T__205
                {
                mT__205(); 

                }
                break;
            case 171 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1136: T__206
                {
                mT__206(); 

                }
                break;
            case 172 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1143: T__207
                {
                mT__207(); 

                }
                break;
            case 173 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1150: T__208
                {
                mT__208(); 

                }
                break;
            case 174 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1157: T__209
                {
                mT__209(); 

                }
                break;
            case 175 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1164: T__210
                {
                mT__210(); 

                }
                break;
            case 176 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1171: T__211
                {
                mT__211(); 

                }
                break;
            case 177 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1178: T__212
                {
                mT__212(); 

                }
                break;
            case 178 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1185: T__213
                {
                mT__213(); 

                }
                break;
            case 179 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1192: T__214
                {
                mT__214(); 

                }
                break;
            case 180 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1199: T__215
                {
                mT__215(); 

                }
                break;
            case 181 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1206: T__216
                {
                mT__216(); 

                }
                break;
            case 182 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1213: T__217
                {
                mT__217(); 

                }
                break;
            case 183 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1220: T__218
                {
                mT__218(); 

                }
                break;
            case 184 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1227: T__219
                {
                mT__219(); 

                }
                break;
            case 185 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1234: T__220
                {
                mT__220(); 

                }
                break;
            case 186 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1241: T__221
                {
                mT__221(); 

                }
                break;
            case 187 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1248: T__222
                {
                mT__222(); 

                }
                break;
            case 188 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1255: T__223
                {
                mT__223(); 

                }
                break;
            case 189 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1262: WS
                {
                mWS(); 

                }
                break;
            case 190 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1265: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 191 :
                // uk/ac/cam/ch/wwmm/pregenerated/ChemicalChunker.g:1:1273: TOKEN
                {
                mTOKEN(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static class DFA4_static {
    static final String DFA4_eotS =
        "\1\1\33\uffff";
    static final String DFA4_eofS =
        "\34\uffff";
    static final String DFA4_minS =
        "\1\45\33\uffff";
    static final String DFA4_maxS =
        "\1\ufffe\33\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\33\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32";
    static final String DFA4_specialS =
        "\34\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\17\1\4\1\20\1\12\1\11\1\uffff\1\30\1\7\1\14\1\10\1\13\12"+
            "\32\1\16\1\5\1\26\1\15\1\25\1\3\1\27\32\2\1\23\1\uffff\1\24"+
            "\1\uffff\1\6\1\uffff\32\2\1\21\1\31\1\22\42\uffff\uff5f\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    }

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_static.DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_static.DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_static.DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_static.DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_static.DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_static.DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_static.DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_static.DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()+ loopback of 56:9: ( ACHAR | '?' | '&' | ';' | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | ':' | '%' | '\\'' | '{' | '}' | '[' | ']' | '>' | '<' | '@' | '+' | '|' | DIGIT | UNICODE )+";
        }
    }
    static class DFA5_static {
    static final String DFA5_eotS =
        "\1\uffff\26\31\3\uffff\1\111\1\31\1\114\1\115\1\31\1\117\1\31\1"+
        "\121\1\126\1\130\1\135\1\31\1\137\1\142\1\143\1\152\1\154\1\31\1"+
        "\160\1\31\1\164\1\171\4\31\1\u0082\1\u0083\1\u0084\2\31\1\u008d"+
        "\1\u008e\1\u0090\1\u0094\1\u0095\1\u0097\3\31\1\u009f\1\u00a0\5"+
        "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\u00ae"+
        "\1\u00af\1\u00b0\1\uffff\1\31\1\uffff\1\31\1\uffff\1\u00c7\1\u00c8"+
        "\1\uffff\1\u00c9\2\uffff\1\u00cb\2\uffff\1\31\1\u00db\1\u00dc\1"+
        "\u00dd\1\u00de\1\u00df\1\uffff\1\31\1\uffff\1\u00e1\1\u00e2\1\u00e3"+
        "\1\uffff\1\31\1\u00e5\1\u00e6\1\uffff\1\31\1\u00e8\1\u00e9\1\u00ea"+
        "\1\uffff\1\31\1\u00ec\2\31\1\u00ef\1\31\1\u00f1\1\u00f2\3\uffff"+
        "\2\31\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa\1\u00fb\2\uffff\1"+
        "\31\1\uffff\1\u00fd\1\u00fe\1\u00ff\4\uffff\1\u0101\1\u0103\1\u0104"+
        "\1\u0106\1\u0108\1\u0109\1\u010a\2\uffff\1\u010b\1\uffff\1\u010c"+
        "\1\u010d\1\u010e\1\u010f\7\31\3\uffff\25\31\6\uffff\17\31\5\uffff"+
        "\1\31\3\uffff\1\u015a\2\uffff\1\31\3\uffff\1\u015c\1\uffff\1\u015d"+
        "\1\u015e\1\uffff\1\31\2\uffff\2\31\1\u0162\6\uffff\1\31\5\uffff"+
        "\1\u0164\2\uffff\1\u0165\12\uffff\2\31\1\u0168\1\u0169\4\31\1\u016e"+
        "\2\31\1\u0171\1\u0173\2\31\1\u0177\1\u0178\5\31\1\u017f\62\31\1"+
        "\u01ba\1\uffff\1\31\3\uffff\1\31\1\u01bd\1\u01be\1\uffff\1\u01bf"+
        "\2\uffff\2\31\2\uffff\4\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1\31"+
        "\1\u01cc\1\u01cd\2\uffff\1\31\1\u01cf\4\31\1\uffff\12\31\1\u01de"+
        "\1\31\1\u01e0\14\31\1\u01ee\2\31\1\u01f1\12\31\1\u01ff\1\31\1\u0201"+
        "\20\31\1\uffff\1\u0213\1\31\3\uffff\6\31\1\u021d\3\31\1\u0221\1"+
        "\u0223\2\uffff\1\u0224\1\uffff\1\u0225\5\31\1\u022c\1\u022d\1\u022e"+
        "\5\31\1\uffff\1\31\1\uffff\15\31\1\uffff\2\31\1\uffff\4\31\1\u0248"+
        "\3\31\1\u024c\3\31\1\u0250\1\uffff\1\31\1\uffff\1\31\1\u0253\3\31"+
        "\1\u0257\10\31\1\u0260\1\u0261\1\31\1\uffff\1\u0263\2\31\1\u0266"+
        "\1\31\1\u0268\1\u0269\2\31\1\uffff\1\31\1\u026d\1\31\1\uffff\1\31"+
        "\3\uffff\1\u0270\2\31\1\u0273\1\31\1\u0275\3\uffff\1\u0276\12\31"+
        "\1\u0281\1\u0282\7\31\1\u028a\4\31\1\uffff\3\31\1\uffff\3\31\1\uffff"+
        "\2\31\1\uffff\1\31\1\u0298\1\31\1\uffff\10\31\2\uffff\1\u02a2\1"+
        "\uffff\2\31\1\uffff\1\u02a5\2\uffff\1\u02a6\2\31\1\uffff\1\u02a9"+
        "\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\1\u02ae\1\31\1\u02b0\2\31"+
        "\1\u02b3\2\31\1\u02b6\1\31\2\uffff\1\u02b8\3\31\1\u02bc\1\31\1\u02be"+
        "\1\uffff\1\u02bf\1\u02c0\6\31\1\u02c7\1\31\1\u02c9\1\31\1\u02cb"+
        "\1\uffff\5\31\1\u02d1\1\u02d2\1\31\1\u02d4\1\uffff\1\31\1\u02d6"+
        "\2\uffff\1\u02d7\1\31\1\uffff\1\u02d9\1\u02da\1\u02db\1\31\1\uffff"+
        "\1\u02dd\1\uffff\2\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1\u02e3"+
        "\2\31\1\uffff\1\u02e6\3\uffff\1\u02e7\2\31\1\u02ea\1\u02eb\1\31"+
        "\1\uffff\1\31\1\uffff\1\31\1\uffff\1\u02ef\1\31\1\u02f1\2\31\2\uffff"+
        "\1\u02f4\1\uffff\1\u02f5\2\uffff\1\u02f6\3\uffff\1\31\1\uffff\5"+
        "\31\1\uffff\1\u02fd\1\31\2\uffff\1\31\1\u0300\2\uffff\1\31\1\u0302"+
        "\1\31\1\uffff\1\u0304\1\uffff\2\31\3\uffff\2\31\1\u0309\3\31\1\uffff"+
        "\2\31\1\uffff\1\31\1\uffff\1\u0310\1\uffff\1\u0311\1\31\1\u0313"+
        "\1\u0314\1\uffff\1\u0315\4\31\1\u031a\2\uffff\1\31\3\uffff\1\31"+
        "\1\u031d\1\u031e\1\u031f\1\uffff\1\u0320\1\31\4\uffff\1\31\1\u0323"+
        "\1\uffff";
    static final String DFA5_eofS =
        "\u0324\uffff";
    static final String DFA5_minS =
        "\1\11\1\103\1\104\1\115\1\112\1\116\1\103\2\102\1\101\1\124\1\123"+
        "\1\102\1\114\1\105\1\130\1\127\1\126\2\104\1\114\1\110\1\104\3\uffff"+
        "\1\45\1\114\2\45\1\103\1\45\1\55\3\45\1\44\1\107\1\45\1\44\3\45"+
        "\1\114\1\45\1\123\2\45\1\117\1\115\2\121\3\45\2\122\5\45\2\44\1"+
        "\120\1\124\2\45\1\124\1\44\1\114\1\102\1\101\1\uffff\1\117\1\115"+
        "\2\uffff\1\101\1\uffff\1\125\1\uffff\1\103\3\45\1\uffff\1\101\1"+
        "\uffff\1\101\1\uffff\1\44\1\45\1\uffff\1\45\2\uffff\1\44\2\uffff"+
        "\1\101\5\45\1\uffff\1\123\1\uffff\3\45\1\uffff\1\110\2\45\1\uffff"+
        "\1\124\3\45\1\uffff\1\120\1\45\2\102\1\45\1\103\2\45\3\uffff\2\102"+
        "\6\45\2\uffff\1\111\1\uffff\3\45\4\uffff\1\44\3\45\1\44\2\45\2\uffff"+
        "\1\45\1\uffff\4\45\1\114\2\116\1\101\1\122\1\116\1\110\3\uffff\1"+
        "\106\1\105\1\116\2\111\1\106\1\117\1\116\1\121\1\124\1\105\1\101"+
        "\1\104\1\101\1\110\1\111\2\105\1\122\1\105\1\111\6\uffff\1\123\1"+
        "\110\1\124\1\105\1\104\1\111\1\122\1\130\1\105\1\115\1\101\1\125"+
        "\1\105\1\101\1\111\5\uffff\1\124\3\uffff\1\45\2\uffff\1\110\3\uffff"+
        "\1\45\1\uffff\2\45\1\uffff\1\117\2\uffff\2\55\1\45\6\uffff\1\116"+
        "\5\uffff\1\45\2\uffff\1\45\12\uffff\1\120\1\111\2\45\1\55\1\111"+
        "\1\105\1\115\1\45\1\124\1\106\2\45\1\124\1\101\2\45\1\105\1\122"+
        "\1\117\1\104\1\101\1\45\1\101\1\116\2\115\1\123\1\114\1\124\1\130"+
        "\1\117\1\115\1\104\1\120\1\114\1\103\1\105\1\114\1\103\1\101\1\114"+
        "\1\116\1\105\2\122\1\131\1\115\2\105\1\101\1\116\1\102\1\111\1\116"+
        "\1\114\1\117\1\107\1\104\1\120\1\114\1\105\1\124\1\101\1\103\1\115"+
        "\1\122\1\105\1\122\1\105\1\103\1\111\1\105\1\45\1\uffff\1\105\3"+
        "\uffff\1\116\2\45\1\uffff\1\45\2\uffff\1\110\1\103\2\uffff\2\103"+
        "\1\115\1\120\1\uffff\1\105\1\117\1\uffff\1\117\1\uffff\1\110\2\45"+
        "\2\uffff\1\122\1\45\1\115\1\105\1\115\1\122\1\uffff\2\124\1\105"+
        "\1\120\1\123\1\101\1\110\1\124\1\125\1\117\1\45\1\101\1\45\1\125"+
        "\1\115\1\117\1\125\1\103\1\114\1\123\1\124\1\105\1\103\1\111\1\103"+
        "\1\45\1\117\1\114\1\45\1\116\1\103\1\114\1\112\1\120\1\122\1\124"+
        "\1\125\1\123\1\120\1\45\1\101\1\45\1\101\1\114\1\101\1\122\1\124"+
        "\1\122\1\105\1\124\1\103\1\111\1\116\2\117\1\124\1\110\1\114\1\uffff"+
        "\1\45\1\112\3\uffff\1\101\1\117\1\112\2\116\1\117\1\45\1\117\2\122"+
        "\2\45\2\uffff\1\45\1\uffff\1\45\1\122\1\120\1\101\1\105\1\110\3"+
        "\45\1\122\1\117\1\125\1\116\1\123\1\uffff\1\122\1\uffff\1\125\1"+
        "\105\2\115\2\105\1\110\1\105\1\122\1\123\1\111\1\106\1\105\1\uffff"+
        "\1\126\1\104\1\uffff\2\107\1\101\1\105\1\45\3\105\1\45\1\110\1\124"+
        "\1\117\1\45\1\uffff\1\123\1\uffff\1\122\1\45\1\105\1\124\1\101\1"+
        "\45\1\105\1\122\2\111\1\106\1\103\2\126\2\45\1\104\1\uffff\1\45"+
        "\1\116\1\104\1\45\1\122\2\45\1\124\1\104\1\uffff\1\125\1\45\1\105"+
        "\1\uffff\1\125\3\uffff\1\45\1\114\1\103\1\45\1\105\1\45\3\uffff"+
        "\1\45\1\104\1\122\1\124\1\120\1\101\1\115\1\116\1\101\2\116\2\45"+
        "\1\122\1\101\1\125\1\120\1\131\1\116\1\105\1\45\2\105\1\111\1\116"+
        "\1\uffff\1\122\1\103\1\116\1\uffff\2\105\1\114\1\uffff\1\123\1\101"+
        "\1\uffff\1\122\1\45\1\103\1\uffff\1\101\1\123\1\124\1\120\1\131"+
        "\1\110\2\105\2\uffff\1\45\1\uffff\1\125\1\105\1\uffff\1\45\2\uffff"+
        "\1\45\1\105\1\116\1\uffff\1\45\1\124\1\uffff\1\105\1\124\1\uffff"+
        "\1\123\2\uffff\1\45\1\105\1\45\1\110\1\124\1\45\2\124\1\45\1\124"+
        "\2\uffff\1\45\1\114\1\122\1\111\1\45\1\124\1\45\1\uffff\2\45\1\116"+
        "\1\124\1\107\1\124\1\104\1\123\1\45\1\126\1\45\1\124\1\45\1\uffff"+
        "\1\124\1\123\1\105\2\111\2\45\1\122\1\45\1\uffff\1\115\1\45\2\uffff"+
        "\1\45\1\104\1\uffff\3\45\1\111\1\uffff\1\45\1\uffff\1\105\1\125"+
        "\1\uffff\1\111\1\117\1\uffff\1\122\1\uffff\1\45\1\105\1\124\1\uffff"+
        "\1\45\3\uffff\1\45\1\122\1\105\2\45\1\111\1\uffff\1\105\1\uffff"+
        "\1\125\1\uffff\1\45\1\105\1\45\1\117\1\124\2\uffff\1\45\1\uffff"+
        "\1\45\2\uffff\1\45\3\uffff\1\132\1\uffff\1\122\1\123\1\124\1\107"+
        "\1\101\1\uffff\1\45\1\101\2\uffff\1\101\1\45\2\uffff\1\132\1\45"+
        "\1\123\1\uffff\1\45\1\uffff\1\116\1\101\3\uffff\2\105\1\45\1\131"+
        "\1\122\1\124\1\uffff\2\124\1\uffff\1\105\1\uffff\1\45\1\uffff\1"+
        "\45\1\124\2\45\1\uffff\1\45\1\101\3\105\1\45\2\uffff\1\105\3\uffff"+
        "\1\120\3\45\1\uffff\1\45\1\110\4\uffff\1\131\1\45\1\uffff";
    static final String DFA5_maxS =
        "\1\ufffe\2\123\1\117\1\112\1\116\1\122\1\102\2\124\1\131\2\123\1"+
        "\122\1\105\1\130\1\127\1\126\1\104\1\122\1\114\1\110\1\122\3\uffff"+
        "\1\ufffe\1\115\2\ufffe\1\103\1\ufffe\1\55\4\ufffe\1\107\5\ufffe"+
        "\1\130\1\ufffe\1\123\2\ufffe\1\117\1\115\2\121\3\ufffe\2\122\6\ufffe"+
        "\1\123\1\120\1\124\2\ufffe\1\124\1\123\1\114\1\102\1\125\1\uffff"+
        "\1\117\1\115\2\uffff\1\101\1\uffff\1\125\1\uffff\1\103\3\ufffe\1"+
        "\uffff\1\127\1\uffff\1\131\1\uffff\2\ufffe\1\uffff\1\ufffe\2\uffff"+
        "\1\ufffe\2\uffff\1\131\5\ufffe\1\uffff\1\123\1\uffff\3\ufffe\1\uffff"+
        "\1\110\2\ufffe\1\uffff\1\124\3\ufffe\1\uffff\1\120\1\ufffe\2\102"+
        "\1\ufffe\1\103\2\ufffe\3\uffff\2\102\6\ufffe\2\uffff\1\111\1\uffff"+
        "\3\ufffe\4\uffff\1\44\6\ufffe\2\uffff\1\ufffe\1\uffff\4\ufffe\1"+
        "\114\2\116\1\101\1\122\1\116\1\117\3\uffff\1\123\1\131\1\116\2\111"+
        "\1\126\1\122\1\116\1\130\1\131\1\111\1\117\1\124\1\117\1\131\1\114"+
        "\1\105\1\125\1\122\1\105\1\111\6\uffff\1\123\1\117\1\131\1\122\1"+
        "\120\1\111\1\122\1\130\1\105\1\116\2\125\1\105\1\101\1\111\5\uffff"+
        "\1\124\3\uffff\1\ufffe\2\uffff\1\110\3\uffff\1\ufffe\1\uffff\2\ufffe"+
        "\1\uffff\1\117\2\uffff\2\55\1\ufffe\6\uffff\1\116\5\uffff\1\ufffe"+
        "\2\uffff\1\ufffe\12\uffff\1\120\1\111\2\ufffe\1\55\1\111\1\105\1"+
        "\115\1\ufffe\1\124\1\106\2\ufffe\1\124\1\101\2\ufffe\1\105\1\122"+
        "\1\117\1\104\1\124\1\ufffe\1\101\1\116\2\115\1\123\1\114\1\124\1"+
        "\130\1\117\1\115\1\104\1\120\1\114\1\103\1\122\1\116\1\103\1\101"+
        "\1\114\1\116\1\105\2\122\1\131\1\115\2\105\1\101\1\117\1\123\1\111"+
        "\1\116\1\123\1\131\1\107\1\104\1\120\1\114\1\105\1\124\1\101\1\103"+
        "\1\115\1\122\1\105\1\122\1\105\1\115\1\123\1\105\1\ufffe\1\uffff"+
        "\1\105\3\uffff\1\116\2\ufffe\1\uffff\1\ufffe\2\uffff\1\110\1\103"+
        "\2\uffff\1\122\1\103\1\115\1\120\1\uffff\1\105\1\117\1\uffff\1\117"+
        "\1\uffff\1\110\2\ufffe\2\uffff\1\122\1\ufffe\1\115\1\105\1\115\1"+
        "\122\1\uffff\2\124\1\105\1\120\1\123\1\101\1\110\1\124\1\125\1\117"+
        "\1\ufffe\1\101\1\ufffe\1\125\1\115\1\117\1\125\1\103\1\114\1\123"+
        "\1\124\1\105\1\123\1\111\1\103\1\ufffe\1\117\1\114\1\ufffe\1\122"+
        "\1\124\1\114\1\115\1\120\1\122\1\124\1\125\1\123\1\120\1\ufffe\1"+
        "\101\1\ufffe\1\101\1\124\1\101\1\122\1\124\1\122\1\105\1\124\1\103"+
        "\1\111\1\116\2\117\1\124\1\110\1\114\1\uffff\1\ufffe\1\112\3\uffff"+
        "\1\101\1\117\1\120\2\116\1\117\1\ufffe\1\117\2\122\2\ufffe\2\uffff"+
        "\1\ufffe\1\uffff\1\ufffe\1\122\1\120\1\101\1\105\1\110\3\ufffe\1"+
        "\122\1\117\1\125\1\116\1\123\1\uffff\1\122\1\uffff\1\125\1\105\2"+
        "\115\2\105\1\110\1\105\1\122\1\123\1\111\1\106\1\105\1\uffff\1\126"+
        "\1\104\1\uffff\2\107\1\101\1\105\1\ufffe\3\105\1\ufffe\1\110\1\124"+
        "\1\117\1\ufffe\1\uffff\1\123\1\uffff\1\122\1\ufffe\1\105\1\124\1"+
        "\101\1\ufffe\1\105\1\122\2\111\1\106\1\103\2\126\2\ufffe\1\104\1"+
        "\uffff\1\ufffe\1\116\1\104\1\ufffe\1\122\2\ufffe\1\124\1\104\1\uffff"+
        "\1\125\1\ufffe\1\105\1\uffff\1\125\3\uffff\1\ufffe\1\114\1\103\1"+
        "\ufffe\1\105\1\ufffe\3\uffff\1\ufffe\1\104\1\122\1\124\1\120\1\101"+
        "\1\115\1\116\1\101\2\116\2\ufffe\1\122\1\101\1\125\1\120\1\131\1"+
        "\116\1\105\1\ufffe\2\105\1\111\1\116\1\uffff\1\122\1\103\1\116\1"+
        "\uffff\2\105\1\114\1\uffff\1\123\1\101\1\uffff\1\122\1\ufffe\1\103"+
        "\1\uffff\1\101\1\123\1\124\1\120\1\131\1\110\2\105\2\uffff\1\ufffe"+
        "\1\uffff\1\125\1\105\1\uffff\1\ufffe\2\uffff\1\ufffe\1\105\1\116"+
        "\1\uffff\1\ufffe\1\124\1\uffff\1\105\1\124\1\uffff\1\123\2\uffff"+
        "\1\ufffe\1\105\1\ufffe\1\110\1\124\1\ufffe\2\124\1\ufffe\1\124\2"+
        "\uffff\1\ufffe\1\114\1\122\1\111\1\ufffe\1\124\1\ufffe\1\uffff\2"+
        "\ufffe\1\116\1\124\1\107\1\124\1\104\1\123\1\ufffe\1\126\1\ufffe"+
        "\1\124\1\ufffe\1\uffff\1\124\1\123\1\105\2\111\2\ufffe\1\122\1\ufffe"+
        "\1\uffff\1\115\1\ufffe\2\uffff\1\ufffe\1\104\1\uffff\3\ufffe\1\111"+
        "\1\uffff\1\ufffe\1\uffff\1\105\1\125\1\uffff\1\111\1\117\1\uffff"+
        "\1\122\1\uffff\1\ufffe\1\105\1\124\1\uffff\1\ufffe\3\uffff\1\ufffe"+
        "\1\122\1\105\2\ufffe\1\111\1\uffff\1\105\1\uffff\1\125\1\uffff\1"+
        "\ufffe\1\105\1\ufffe\1\117\1\124\2\uffff\1\ufffe\1\uffff\1\ufffe"+
        "\2\uffff\1\ufffe\3\uffff\1\132\1\uffff\1\122\1\123\1\124\1\107\1"+
        "\101\1\uffff\1\ufffe\1\101\2\uffff\1\101\1\ufffe\2\uffff\1\132\1"+
        "\ufffe\1\123\1\uffff\1\ufffe\1\uffff\1\116\1\101\3\uffff\2\105\1"+
        "\ufffe\1\131\1\122\1\124\1\uffff\2\124\1\uffff\1\105\1\uffff\1\ufffe"+
        "\1\uffff\1\ufffe\1\124\2\ufffe\1\uffff\1\ufffe\1\101\3\105\1\ufffe"+
        "\2\uffff\1\105\3\uffff\1\120\3\ufffe\1\uffff\1\ufffe\1\110\4\uffff"+
        "\1\131\1\ufffe\1\uffff";
    static final String DFA5_acceptS =
        "\27\uffff\1\u00bd\1\u00be\1\u00bf\57\uffff\1\166\2\uffff\1\165\1"+
        "\167\1\uffff\1\u0098\1\uffff\1\u00ae\4\uffff\1\u0088\1\uffff\1\u0087"+
        "\1\uffff\1\u008f\2\uffff\1\u008e\1\uffff\1\u008d\1\u0094\1\uffff"+
        "\1\u0092\1\u0097\6\uffff\1\u00b0\1\uffff\1\153\3\uffff\1\154\3\uffff"+
        "\1\170\4\uffff\1\173\10\uffff\1\u00a6\1\u00ab\1\u00ac\10\uffff\1"+
        "\155\1\u0080\1\uffff\1\u0081\3\uffff\1\u0083\1\u008c\1\u009a\1\u0099"+
        "\7\uffff\1\u00a4\1\u00af\1\uffff\1\u00b7\13\uffff\1\u0089\1\u008a"+
        "\1\u008b\25\uffff\1\u0091\1\u0090\1\u0093\1\140\1\u0096\1\u0095"+
        "\17\uffff\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\uffff\1\150"+
        "\1\151\1\152\1\uffff\1\171\1\172\1\uffff\1\175\1\176\1\177\1\uffff"+
        "\1\u00ad\2\uffff\1\u00a7\1\uffff\1\u00a9\1\u00aa\3\uffff\1\156\1"+
        "\160\1\161\1\162\1\163\1\164\1\uffff\1\u0084\1\u0085\1\u0086\1\u009c"+
        "\1\u009b\1\uffff\1\u009d\1\u00a1\1\uffff\1\u00a2\1\u00a0\1\u009f"+
        "\1\u00bc\1\u00a5\1\u00b6\1\u00b8\1\u00b9\1\u00ba\1\u00bb\112\uffff"+
        "\1\141\1\uffff\1\142\1\144\1\145\3\uffff\1\157\1\uffff\1\u009e\1"+
        "\u00a3\2\uffff\1\135\1\136\4\uffff\1\12\2\uffff\1\21\1\uffff\1\15"+
        "\3\uffff\1\23\1\24\6\uffff\1\41\72\uffff\1\137\2\uffff\1\146\1\147"+
        "\1\u0082\14\uffff\1\22\1\31\1\uffff\1\25\16\uffff\1\63\1\uffff\1"+
        "\42\15\uffff\1\105\2\uffff\1\57\15\uffff\1\104\1\uffff\1\66\21\uffff"+
        "\1\174\11\uffff\1\10\3\uffff\1\16\1\uffff\1\17\1\30\1\26\6\uffff"+
        "\1\34\1\44\1\35\31\uffff\1\101\3\uffff\1\126\3\uffff\1\71\2\uffff"+
        "\1\72\3\uffff\1\112\10\uffff\1\131\1\132\1\uffff\1\u00a8\2\uffff"+
        "\1\2\1\uffff\1\56\1\3\3\uffff\1\14\2\uffff\1\27\2\uffff\1\33\1\uffff"+
        "\1\55\1\36\12\uffff\1\54\1\45\7\uffff\1\134\15\uffff\1\74\11\uffff"+
        "\1\133\2\uffff\1\4\1\5\2\uffff\1\13\4\uffff\1\47\1\uffff\1\37\2"+
        "\uffff\1\53\2\uffff\1\51\1\uffff\1\111\3\uffff\1\121\1\uffff\1\125"+
        "\1\60\1\67\6\uffff\1\65\1\uffff\1\102\1\uffff\1\110\5\uffff\1\120"+
        "\1\122\1\uffff\1\124\1\uffff\1\7\1\6\1\uffff\1\20\1\32\1\107\1\uffff"+
        "\1\64\5\uffff\1\46\2\uffff\1\143\1\70\2\uffff\1\62\1\73\3\uffff"+
        "\1\106\1\uffff\1\114\2\uffff\1\123\1\1\1\11\6\uffff\1\50\2\uffff"+
        "\1\61\1\uffff\1\103\1\uffff\1\113\4\uffff\1\76\6\uffff\1\75\1\115"+
        "\1\uffff\1\130\1\40\1\43\4\uffff\1\127\2\uffff\1\100\1\117\1\77"+
        "\1\116\2\uffff\1\52";
    static final String DFA5_specialS =
        "\u0324\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\27\1\30\2\uffff\1\30\22\uffff\1\27\4\uffff\5\31\1\uffff\2"+
            "\31\1\15\23\31\1\10\1\16\1\1\1\11\1\17\1\20\1\31\1\21\1\5\1"+
            "\4\1\31\1\13\1\22\1\6\1\2\1\23\1\24\1\14\1\12\1\3\1\25\1\7\1"+
            "\26\4\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31\42\uffff\uff5f"+
            "\31",
            "\1\34\1\32\12\uffff\1\33\3\uffff\1\35",
            "\1\37\16\uffff\1\36",
            "\1\40\1\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\46\1\uffff\1\45\10\uffff\1\44\1\uffff\1\47\1\uffff\1\50",
            "\1\51",
            "\1\53\15\uffff\1\52\3\uffff\1\54",
            "\1\55\15\uffff\1\56\4\uffff\1\57",
            "\1\60\4\uffff\1\61",
            "\1\62",
            "\1\64\13\uffff\1\65\1\uffff\1\66\2\uffff\1\63",
            "\1\67\5\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\101\11\uffff\1\76\1\uffff\1\77\1\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\104\13\uffff\1\105\1\106\1\107",
            "",
            "",
            "",
            "\5\31\1\uffff\2\31\1\110\56\31\1\uffff\1\31\1\uffff\1\31\1"+
            "\uffff\35\31\42\uffff\uff5f\31",
            "\1\112\1\113",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\116",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\120",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\2\31\1\122\44\31\1\123\1\124\1\125\7\31\1\uffff"+
            "\1\31\1\uffff\1\31\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\2\31\1\127\56\31\1\uffff\1\31\1\uffff\1\31\1"+
            "\uffff\35\31\42\uffff\uff5f\31",
            "\1\132\5\31\1\uffff\2\31\1\131\42\31\1\134\2\31\1\133\10\31"+
            "\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31\42\uffff\uff5f\31",
            "\1\136",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\140\5\31\1\uffff\50\31\1\141\10\31\1\uffff\1\31\1\uffff"+
            "\1\31\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\2\31\1\144\26\31\1\146\2\31\1\147\6\31\1\150"+
            "\1\31\1\145\11\31\1\151\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\44\31\1\153\14\31\1\uffff\1\31\1\uffff\1\31\1"+
            "\uffff\35\31\42\uffff\uff5f\31",
            "\1\155\1\uffff\1\156\11\uffff\1\157",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\161",
            "\5\31\1\uffff\31\31\1\162\25\31\1\163\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\2\31\1\165\33\31\1\166\11\31\1\167\4\31\1\170"+
            "\3\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31\42\uffff\uff5f"+
            "\31",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\5\31\1\uffff\2\31\1\177\44\31\1\176\1\u0081\1\u0080\7\31\1"+
            "\uffff\1\31\1\uffff\1\31\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0085",
            "\1\u0086",
            "\5\31\1\uffff\31\31\1\u0087\2\31\1\u0088\5\31\1\u0089\1\u008a"+
            "\3\31\1\u008b\7\31\1\u008c\1\31\1\uffff\1\31\1\uffff\1\31\1"+
            "\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\2\31\1\u008f\56\31\1\uffff\1\31\1\uffff\1\31"+
            "\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\31\31\1\u0091\2\31\1\u0092\6\31\1\u0093\15\31"+
            "\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0096\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\35\31\42\uffff\uff5f\31",
            "\1\u0098\47\uffff\1\u0099\2\uffff\1\u009a\3\uffff\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\5\31\1\uffff\45\31\1\u009e\13\31\1\uffff\1\31\1\uffff\1\31"+
            "\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u00a1",
            "\1\u00a2\52\uffff\1\u00a3\3\uffff\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\23\uffff\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u00b1\1\u00b2\3\uffff\1\u00b7\2\uffff\1\u00b3\5\uffff\1"+
            "\u00b6\5\uffff\1\u00b8\1\u00b5\1\u00b4",
            "",
            "\1\u00bd\1\uffff\1\u00bf\1\u00c3\1\u00b9\1\u00c0\1\u00c1\5"+
            "\uffff\1\u00bc\2\uffff\1\u00c2\1\uffff\1\u00c4\1\u00ba\1\u00bb"+
            "\1\uffff\1\u00be\2\uffff\1\u00c5",
            "",
            "\1\u00c6\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\1\u00ca\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\35\31\42\uffff\uff5f\31",
            "",
            "",
            "\1\u00d0\1\uffff\1\u00cd\1\u00cf\1\u00d3\1\u00d1\1\uffff\1"+
            "\u00d4\1\u00d5\6\uffff\1\u00d6\1\u00d7\1\u00d8\1\u00ce\1\u00d2"+
            "\1\u00cc\1\uffff\1\u00d9\1\uffff\1\u00da",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u00e0",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u00e4",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u00e7",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u00eb",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u00ed",
            "\1\u00ee",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u00f0",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\5\31\1\uffff\57\31\1\u00f5\1\31\1\uffff\1\31\1\uffff\1\31"+
            "\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\1\u00fc",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "",
            "",
            "\1\u0100",
            "\5\31\1\uffff\50\31\1\u0102\10\31\1\uffff\1\31\1\uffff\1\31"+
            "\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\50\31\1\u0105\10\31\1\uffff\1\31\1\uffff\1\31"+
            "\1\uffff\35\31\42\uffff\uff5f\31",
            "\1\u0107\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116\6\uffff\1\u0117",
            "",
            "",
            "",
            "\1\u0119\14\uffff\1\u0118",
            "\1\u011a\23\uffff\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f\7\uffff\1\u0120\7\uffff\1\u0121",
            "\1\u0122\2\uffff\1\u0123",
            "\1\u0124",
            "\1\u0126\6\uffff\1\u0125",
            "\1\u0127\4\uffff\1\u0128",
            "\1\u012a\3\uffff\1\u0129",
            "\1\u012b\3\uffff\1\u012d\3\uffff\1\u012e\5\uffff\1\u012c",
            "\1\u0131\10\uffff\1\u012f\2\uffff\1\u0132\3\uffff\1\u0130",
            "\1\u0134\15\uffff\1\u0133",
            "\1\u0135\6\uffff\1\u0136\11\uffff\1\u0137",
            "\1\u0139\2\uffff\1\u0138",
            "\1\u013a",
            "\1\u013d\14\uffff\1\u013b\2\uffff\1\u013c",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0141",
            "\1\u0142\6\uffff\1\u0143",
            "\1\u0145\1\u0144\3\uffff\1\u0146",
            "\1\u0149\3\uffff\1\u0147\10\uffff\1\u0148",
            "\1\u014a\13\uffff\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0151\1\u0150",
            "\1\u0152\20\uffff\1\u0153\2\uffff\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "",
            "",
            "",
            "",
            "",
            "\1\u0159",
            "",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\1\u015b",
            "",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u015f",
            "",
            "",
            "\1\u0160",
            "\1\u0161",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0163",
            "",
            "",
            "",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0166",
            "\1\u0167",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u016f",
            "\1\u0170",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\51\31\1\u0172\7\31\1\uffff\1\31\1\uffff\1\31"+
            "\1\uffff\35\31\42\uffff\uff5f\31",
            "\1\u0174",
            "\1\u0175",
            "\5\31\1\uffff\33\31\1\u0176\25\31\1\uffff\1\31\1\uffff\1\31"+
            "\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d\22\uffff\1\u017e",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e\14\uffff\1\u018f",
            "\1\u0190\1\uffff\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e\1\u019f",
            "\1\u01a0\20\uffff\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4\6\uffff\1\u01a5",
            "\1\u01a6\11\uffff\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5\11\uffff\1\u01b6",
            "\1\u01b7\11\uffff\1\u01b8",
            "\1\u01b9",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u01bb",
            "",
            "",
            "",
            "\1\u01bc",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "",
            "",
            "\1\u01c2\13\uffff\1\u01c4\2\uffff\1\u01c3",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "",
            "\1\u01c8",
            "\1\u01c9",
            "",
            "\1\u01ca",
            "",
            "\1\u01cb",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\1\u01ce",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u01df",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01eb\17\uffff\1\u01ea",
            "\1\u01ec",
            "\1\u01ed",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u01ef",
            "\1\u01f0",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u01f2\3\uffff\1\u01f3",
            "\1\u01f5\20\uffff\1\u01f4",
            "\1\u01f6",
            "\1\u01f8\2\uffff\1\u01f7",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0200",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0202",
            "\1\u0203\7\uffff\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0214",
            "",
            "",
            "",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217\2\uffff\1\u0219\2\uffff\1\u0218",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\44\31\1\u0222\14\31\1\uffff\1\31\1\uffff\1\31"+
            "\1\uffff\35\31\42\uffff\uff5f\31",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\5\31\1\uffff\50\31\1\u022b\10\31\1\uffff\1\31\1\uffff\1\31"+
            "\1\uffff\35\31\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "",
            "\1\u0234",
            "",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "",
            "\1\u0242",
            "\1\u0243",
            "",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u0251",
            "",
            "\1\u0252",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0262",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0264",
            "\1\u0265",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0267",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u026a",
            "\1\u026b",
            "",
            "\1\u026c",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u026e",
            "",
            "\1\u026f",
            "",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0271",
            "\1\u0272",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0274",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "",
            "\1\u0295",
            "\1\u0296",
            "",
            "\1\u0297",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0299",
            "",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u02a3",
            "\1\u02a4",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02a7",
            "\1\u02a8",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02aa",
            "",
            "\1\u02ab",
            "\1\u02ac",
            "",
            "\1\u02ad",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02af",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02b1",
            "\1\u02b2",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02b4",
            "\1\u02b5",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02b7",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02bd",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02c8",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02ca",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02d3",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u02d5",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02d8",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02dc",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u02de",
            "\1\u02df",
            "",
            "\1\u02e0",
            "\1\u02e1",
            "",
            "\1\u02e2",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02e4",
            "\1\u02e5",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02e8",
            "\1\u02e9",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02ec",
            "",
            "\1\u02ed",
            "",
            "\1\u02ee",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02f0",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02f2",
            "\1\u02f3",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "",
            "\1\u02f7",
            "",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u02fe",
            "",
            "",
            "\1\u02ff",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\1\u0301",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0303",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\1\u0305",
            "\1\u0306",
            "",
            "",
            "",
            "\1\u0307",
            "\1\u0308",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "",
            "\1\u030d",
            "\1\u030e",
            "",
            "\1\u030f",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0312",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "",
            "\1\u031b",
            "",
            "",
            "",
            "\1\u031c",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            "\1\u0321",
            "",
            "",
            "",
            "",
            "\1\u0322",
            "\5\31\1\uffff\61\31\1\uffff\1\31\1\uffff\1\31\1\uffff\35\31"+
            "\42\uffff\uff5f\31",
            ""
    };
    }

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_static.DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_static.DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_static.DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_static.DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_static.DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_static.DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_static.DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_static.DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | WS | NEWLINE | TOKEN );";
        }
    }
 

}