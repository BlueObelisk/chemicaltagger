// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g 2010-01-11 15:41:23
package uk.ac.cam.ch.wwmm.chemicaltagger;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ChemicalChunkerLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int TOKEN=9;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__19=19;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__148=148;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__147=147;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__149=149;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int NODE=4;
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
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=5;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__133=133;
    public static final int UNMATCHED=10;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__77=77;
    public static final int T__135=135;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int DIGIT=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__175=175;
    public static final int T__30=30;
    public static final int T__174=174;
    public static final int T__31=31;
    public static final int T__173=173;
    public static final int T__32=32;
    public static final int T__172=172;
    public static final int T__33=33;
    public static final int T__179=179;
    public static final int T__34=34;
    public static final int T__178=178;
    public static final int ACHAR=7;
    public static final int T__35=35;
    public static final int T__177=177;
    public static final int NEWLINE=6;
    public static final int T__36=36;
    public static final int T__176=176;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;

    // delegates
    // delegators

    public ChemicalChunkerLexer() {;} 
    public ChemicalChunkerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ChemicalChunkerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:9:7: ( 'OSCAR-CD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:9:9: 'OSCAR-CD'
            {
            match("OSCAR-CD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:10:7: ( 'OSCAR-CJ' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:10:9: 'OSCAR-CJ'
            {
            match("OSCAR-CJ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:11:7: ( 'OSCAR-RN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:11:9: 'OSCAR-RN'
            {
            match("OSCAR-RN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:12:7: ( 'OSCAR-ONT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:12:9: 'OSCAR-ONT'
            {
            match("OSCAR-ONT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:13:7: ( 'TM-UNICODE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:13:9: 'TM-UNICODE'
            {
            match("TM-UNICODE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:14:7: ( 'CD-UNICODE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:14:9: 'CD-UNICODE'
            {
            match("CD-UNICODE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:15:7: ( 'IN-AS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:15:9: 'IN-AS'
            {
            match("IN-AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:16:7: ( 'IN-BEFORE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:16:9: 'IN-BEFORE'
            {
            match("IN-BEFORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:17:7: ( 'IN-AFTER' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:17:9: 'IN-AFTER'
            {
            match("IN-AFTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:18:7: ( 'IN-IN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:18:9: 'IN-IN'
            {
            match("IN-IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:19:7: ( 'IN-INTO' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:19:9: 'IN-INTO'
            {
            match("IN-INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:20:7: ( 'IN-WITH' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:20:9: 'IN-WITH'
            {
            match("IN-WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:21:7: ( 'IN-WITHOUT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:21:9: 'IN-WITHOUT'
            {
            match("IN-WITHOUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:22:7: ( 'IN-BY' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:22:9: 'IN-BY'
            {
            match("IN-BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:23:7: ( 'IN-VIA' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:23:9: 'IN-VIA'
            {
            match("IN-VIA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:24:7: ( 'IN-OF' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:24:9: 'IN-OF'
            {
            match("IN-OF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:25:7: ( 'IN-ON' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:25:9: 'IN-ON'
            {
            match("IN-ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:26:7: ( 'IN-FOR' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:26:9: 'IN-FOR'
            {
            match("IN-FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:7: ( 'IN-FROM' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:9: 'IN-FROM'
            {
            match("IN-FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:28:7: ( 'IN-UNDER' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:28:9: 'IN-UNDER'
            {
            match("IN-UNDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:29:7: ( 'IN-OVER' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:29:9: 'IN-OVER'
            {
            match("IN-OVER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:30:7: ( 'IN-OFF' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:30:9: 'IN-OFF'
            {
            match("IN-OFF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:31:7: ( 'NN-STATE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:31:9: 'NN-STATE'
            {
            match("NN-STATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:7: ( 'NN-TIME' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:9: 'NN-TIME'
            {
            match("NN-TIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:33:7: ( 'NN-GRAM' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:33:9: 'NN-GRAM'
            {
            match("NN-GRAM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:34:7: ( 'NN-MOL' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:34:9: 'NN-MOL'
            {
            match("NN-MOL"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:7: ( 'NN-ATMOSPHERE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:9: 'NN-ATMOSPHERE'
            {
            match("NN-ATMOSPHERE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:36:7: ( 'NN-EQ' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:36:9: 'NN-EQ'
            {
            match("NN-EQ"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:7: ( 'NN-VOL' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:9: 'NN-VOL'
            {
            match("NN-VOL"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:7: ( 'NN-CHEMENTITY' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:9: 'NN-CHEMENTITY'
            {
            match("NN-CHEMENTITY"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:39:7: ( 'NN-TEMP' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:39:9: 'NN-TEMP'
            {
            match("NN-TEMP"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:7: ( 'NN-FLASH' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:9: 'NN-FLASH'
            {
            match("NN-FLASH"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:41:7: ( 'NN-GENERAL' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:41:9: 'NN-GENERAL'
            {
            match("NN-GENERAL"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:7: ( 'NN-METHOD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:9: 'NN-METHOD'
            {
            match("NN-METHOD"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:7: ( 'NN-AMOUNT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:9: 'NN-AMOUNT'
            {
            match("NN-AMOUNT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:7: ( 'NN-PRESSURE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:9: 'NN-PRESSURE'
            {
            match("NN-PRESSURE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:7: ( 'NN-COLUMN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:9: 'NN-COLUMN'
            {
            match("NN-COLUMN"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:46:7: ( 'NN-CHROMATOGRAPHY' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:46:9: 'NN-CHROMATOGRAPHY'
            {
            match("NN-CHROMATOGRAPHY"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:7: ( 'NN-VACUUM' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:9: 'NN-VACUUM'
            {
            match("NN-VACUUM"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:7: ( 'NN-CYCLE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:9: 'NN-CYCLE'
            {
            match("NN-CYCLE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:7: ( 'NN-TIMES' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:9: 'NN-TIMES'
            {
            match("NN-TIMES"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:50:7: ( 'OSCAR-CM' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:50:9: 'OSCAR-CM'
            {
            match("OSCAR-CM"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:7: ( 'VB-USE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:9: 'VB-USE'
            {
            match("VB-USE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:52:7: ( 'VB-CHANGE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:52:9: 'VB-CHANGE'
            {
            match("VB-CHANGE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:7: ( 'VB-SUBMERGE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:9: 'VB-SUBMERGE'
            {
            match("VB-SUBMERGE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:54:7: ( 'VB-SUBJECT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:54:9: 'VB-SUBJECT'
            {
            match("VB-SUBJECT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:55:7: ( 'NN-ADD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:55:9: 'NN-ADD'
            {
            match("NN-ADD"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:7: ( 'NN-MIXTURE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:9: 'NN-MIXTURE'
            {
            match("NN-MIXTURE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:57:7: ( 'VB-ADD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:57:9: 'VB-ADD'
            {
            match("VB-ADD"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:58:7: ( 'VB-CHARGE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:58:9: 'VB-CHARGE'
            {
            match("VB-CHARGE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:59:7: ( 'VB-CONTAIN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:59:9: 'VB-CONTAIN'
            {
            match("VB-CONTAIN"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:60:7: ( 'VB-DROP' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:60:9: 'VB-DROP'
            {
            match("VB-DROP"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:61:7: ( 'VB-FILL' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:61:9: 'VB-FILL'
            {
            match("VB-FILL"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:62:7: ( 'VB-SUSPEND' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:62:9: 'VB-SUSPEND'
            {
            match("VB-SUSPEND"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:63:7: ( 'VB-TREAT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:63:9: 'VB-TREAT'
            {
            match("VB-TREAT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:64:7: ( 'VB-APPARATUS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:64:9: 'VB-APPARATUS'
            {
            match("VB-APPARATUS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:65:7: ( 'NN-APPARATUS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:65:9: 'NN-APPARATUS'
            {
            match("NN-APPARATUS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:66:7: ( 'VB-CONCENTRATE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:66:9: 'VB-CONCENTRATE'
            {
            match("VB-CONCENTRATE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:67:7: ( 'NN-CONCENTRATE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:67:9: 'NN-CONCENTRATE'
            {
            match("NN-CONCENTRATE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:7: ( 'VB-COOL' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:9: 'VB-COOL'
            {
            match("VB-COOL"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:69:7: ( 'VB-DEGASS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:69:9: 'VB-DEGASS'
            {
            match("VB-DEGASS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:7: ( 'VB-DISSOLVE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:9: 'VB-DISSOLVE'
            {
            match("VB-DISSOLVE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:7: ( 'VB-DRY' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:9: 'VB-DRY'
            {
            match("VB-DRY"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:72:7: ( 'NN-DRY' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:72:9: 'NN-DRY'
            {
            match("NN-DRY"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:7: ( 'VB-EXTRACT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:9: 'VB-EXTRACT'
            {
            match("VB-EXTRACT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:7: ( 'NN-EXTRACT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:9: 'NN-EXTRACT'
            {
            match("NN-EXTRACT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:7: ( 'VB-FILTER' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:9: 'VB-FILTER'
            {
            match("VB-FILTER"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:76:7: ( 'NN-FILTER' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:76:9: 'NN-FILTER'
            {
            match("NN-FILTER"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:7: ( 'VB-HEAT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:9: 'VB-HEAT'
            {
            match("VB-HEAT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:7: ( 'VB-INCREASE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:9: 'VB-INCREASE'
            {
            match("VB-INCREASE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:79:7: ( 'VB-PARTITION' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:79:9: 'VB-PARTITION'
            {
            match("VB-PARTITION"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:80:7: ( 'VB-PRECIPITATE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:80:9: 'VB-PRECIPITATE'
            {
            match("VB-PRECIPITATE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:81:7: ( 'NN-PRECIPITATE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:81:9: 'NN-PRECIPITATE'
            {
            match("NN-PRECIPITATE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:7: ( 'VB-PURIFY' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:9: 'VB-PURIFY'
            {
            match("VB-PURIFY"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:83:7: ( 'NN-PURIFY' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:83:9: 'NN-PURIFY'
            {
            match("NN-PURIFY"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:7: ( 'VB-QUENCH' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:9: 'VB-QUENCH'
            {
            match("VB-QUENCH"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:7: ( 'VB-RECOVER' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:9: 'VB-RECOVER'
            {
            match("VB-RECOVER"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:86:7: ( 'VB-REMOVE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:86:9: 'VB-REMOVE'
            {
            match("VB-REMOVE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:87:7: ( 'NN-REMOVE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:87:9: 'NN-REMOVE'
            {
            match("NN-REMOVE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:88:7: ( 'VB-STIR' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:88:9: 'VB-STIR'
            {
            match("VB-STIR"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:7: ( 'VB-SYNTHESIZE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:9: 'VB-SYNTHESIZE'
            {
            match("VB-SYNTHESIZE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:90:7: ( 'NN-SYNTHESIZE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:90:9: 'NN-SYNTHESIZE'
            {
            match("NN-SYNTHESIZE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:91:7: ( 'VB-WAIT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:91:9: 'VB-WAIT'
            {
            match("VB-WAIT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:92:7: ( 'VB-WASH' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:92:9: 'VB-WASH'
            {
            match("VB-WASH"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:7: ( 'VB-YIELD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:9: 'VB-YIELD'
            {
            match("VB-YIELD"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:94:7: ( 'COLON' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:94:9: 'COLON'
            {
            match("COLON"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:95:7: ( 'COMMA' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:95:9: 'COMMA'
            {
            match("COMMA"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:7: ( 'APOST' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:9: 'APOST'
            {
            match("APOST"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:97:7: ( 'NEG' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:97:9: 'NEG'
            {
            match("NEG"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:98:8: ( 'DASH' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:98:10: 'DASH'
            {
            match("DASH"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:99:8: ( 'STOP' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:99:10: 'STOP'
            {
            match("STOP"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:100:8: ( 'NN-PERCENT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:100:10: 'NN-PERCENT'
            {
            match("NN-PERCENT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:101:8: ( 'LSQB' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:101:10: 'LSQB'
            {
            match("LSQB"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:102:8: ( 'RSQB' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:102:10: 'RSQB'
            {
            match("RSQB"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:103:8: ( '-LRB-' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:103:10: '-LRB-'
            {
            match("-LRB-"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:104:8: ( '-RRB-' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:104:10: '-RRB-'
            {
            match("-RRB-"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:105:8: ( 'ABL' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:105:10: 'ABL'
            {
            match("ABL"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:106:8: ( 'ABN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:106:10: 'ABN'
            {
            match("ABN"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:107:8: ( 'ABX' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:107:10: 'ABX'
            {
            match("ABX"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:108:8: ( 'AP' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:108:10: 'AP'
            {
            match("AP"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:109:8: ( 'AT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:109:10: 'AT'
            {
            match("AT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:110:8: ( 'BE' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:110:10: 'BE'
            {
            match("BE"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:111:8: ( 'BED' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:111:10: 'BED'
            {
            match("BED"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:8: ( 'BEDZ' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:10: 'BEDZ'
            {
            match("BEDZ"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:8: ( 'BEG' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:10: 'BEG'
            {
            match("BEG"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:114:8: ( 'BEM' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:114:10: 'BEM'
            {
            match("BEM"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:8: ( 'BEN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:10: 'BEN'
            {
            match("BEN"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:8: ( 'BER' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:10: 'BER'
            {
            match("BER"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:117:8: ( 'BEZ' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:117:10: 'BEZ'
            {
            match("BEZ"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:118:8: ( 'CC' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:118:10: 'CC'
            {
            match("CC"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:8: ( 'CD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:10: 'CD'
            {
            match("CD"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:8: ( 'CS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:10: 'CS'
            {
            match("CS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:8: ( 'DO' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:10: 'DO'
            {
            match("DO"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:122:8: ( 'DOD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:122:10: 'DOD'
            {
            match("DOD"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:123:8: ( 'DOZ' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:123:10: 'DOZ'
            {
            match("DOZ"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:124:8: ( 'DT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:124:10: 'DT'
            {
            match("DT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:125:8: ( 'DTI' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:125:10: 'DTI'
            {
            match("DTI"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:8: ( 'DTS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:10: 'DTS'
            {
            match("DTS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:8: ( 'DTX' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:10: 'DTX'
            {
            match("DTX"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:8: ( 'EX' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:10: 'EX'
            {
            match("EX"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:8: ( 'FW' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:10: 'FW'
            {
            match("FW"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:8: ( 'HV' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:10: 'HV'
            {
            match("HV"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:8: ( 'HVD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:10: 'HVD'
            {
            match("HVD"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:8: ( 'HVG' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:10: 'HVG'
            {
            match("HVG"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:8: ( 'HVN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:10: 'HVN'
            {
            match("HVN"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:8: ( 'IN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:10: 'IN'
            {
            match("IN"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:8: ( 'JJ' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:10: 'JJ'
            {
            match("JJ"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:8: ( 'JJR' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:10: 'JJR'
            {
            match("JJR"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:8: ( 'JJS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:10: 'JJS'
            {
            match("JJS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:8: ( 'JJT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:10: 'JJT'
            {
            match("JJT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:8: ( 'MD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:10: 'MD'
            {
            match("MD"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:8: ( 'NC' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:10: 'NC'
            {
            match("NC"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:141:8: ( 'NN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:141:10: 'NN'
            {
            match("NN"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:142:8: ( 'NN$' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:142:10: 'NN$'
            {
            match("NN$"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:143:8: ( 'NNS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:143:10: 'NNS'
            {
            match("NNS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:144:8: ( 'NNS$' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:144:10: 'NNS$'
            {
            match("NNS$"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:8: ( 'NP' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:10: 'NP'
            {
            match("NP"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:146:8: ( 'NNP' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:146:10: 'NNP'
            {
            match("NNP"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:147:8: ( 'NP$' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:147:10: 'NP$'
            {
            match("NP$"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:8: ( 'NPS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:10: 'NPS'
            {
            match("NPS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:8: ( 'NPS$' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:10: 'NPS$'
            {
            match("NPS$"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:8: ( 'NR' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:10: 'NR'
            {
            match("NR"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:8: ( 'OD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:10: 'OD'
            {
            match("OD"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:152:8: ( 'PN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:152:10: 'PN'
            {
            match("PN"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:153:8: ( 'PN$' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:153:10: 'PN$'
            {
            match("PN$"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:8: ( 'PP$' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:10: 'PP$'
            {
            match("PP$"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:8: ( 'PP$$' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:10: 'PP$$'
            {
            match("PP$$"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:8: ( 'PPL' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:10: 'PPL'
            {
            match("PPL"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:8: ( 'PPLS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:10: 'PPLS'
            {
            match("PPLS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:8: ( 'PPO' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:10: 'PPO'
            {
            match("PPO"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:8: ( 'PPS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:10: 'PPS'
            {
            match("PPS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:8: ( 'PPSS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:10: 'PPSS'
            {
            match("PPSS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:8: ( 'QL' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:10: 'QL'
            {
            match("QL"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:162:8: ( 'QLP' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:162:10: 'QLP'
            {
            match("QLP"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:163:8: ( 'RB' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:163:10: 'RB'
            {
            match("RB"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:164:8: ( 'RBR' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:164:10: 'RBR'
            {
            match("RBR"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:165:8: ( 'RBT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:165:10: 'RBT'
            {
            match("RBT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:166:8: ( 'RN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:166:10: 'RN'
            {
            match("RN"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:167:8: ( 'RP' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:167:10: 'RP'
            {
            match("RP"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:168:8: ( 'SYM' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:168:10: 'SYM'
            {
            match("SYM"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:8: ( 'TO' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:10: 'TO'
            {
            match("TO"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:8: ( 'UH' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:10: 'UH'
            {
            match("UH"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:171:8: ( 'VB' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:171:10: 'VB'
            {
            match("VB"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:172:8: ( 'VBD' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:172:10: 'VBD'
            {
            match("VBD"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:173:8: ( 'VBG' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:173:10: 'VBG'
            {
            match("VBG"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:174:8: ( 'VBN' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:174:10: 'VBN'
            {
            match("VBN"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:175:8: ( 'VBZ' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:175:10: 'VBZ'
            {
            match("VBZ"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:8: ( 'WDT' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:10: 'WDT'
            {
            match("WDT"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:177:8: ( 'WP$' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:177:10: 'WP$'
            {
            match("WP$"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:178:8: ( 'WPO' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:178:10: 'WPO'
            {
            match("WPO"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:8: ( 'WPS' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:10: 'WPS'
            {
            match("WPS"); 


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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:180:8: ( 'WRB' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:180:10: 'WRB'
            {
            match("WRB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:17:4: ( ( ' ' | '\\t' )+ )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:17:7: ( ' ' | '\\t' )+
            {
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:17:7: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:
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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:18:9: ( ( '\\r' )? '\\n' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:18:11: ( '\\r' )? '\\n'
            {
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:18:11: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:18:11: '\\r'
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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:21:16: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='A' && LA3_0<='Z')) ) {
                alt3=1;
            }
            else if ( ((LA3_0>='a' && LA3_0<='z')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:21:18: ( 'A' .. 'Z' )
                    {
                    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:21:18: ( 'A' .. 'Z' )
                    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:21:19: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:21:31: ( 'a' .. 'z' )
                    {
                    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:21:31: ( 'a' .. 'z' )
                    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:21:32: 'a' .. 'z'
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
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:24:16: ( ( '0' .. '9' ) )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:24:18: ( '0' .. '9' )
            {
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:24:18: ( '0' .. '9' )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:24:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "TOKEN"
    public final void mTOKEN() throws RecognitionException {
        try {
            int _type = TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:7: ( ( ACHAR | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | '°' | ':' | '%' | DIGIT )+ )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:9: ( ACHAR | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | '°' | ':' | '%' | DIGIT )+
            {
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:9: ( ACHAR | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | '°' | ':' | '%' | DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=14;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:10: ACHAR
            	    {
            	    mACHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:17: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:21: ','
            	    {
            	    match(','); 

            	    }
            	    break;
            	case 4 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:26: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 5 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:30: ')'
            	    {
            	    match(')'); 

            	    }
            	    break;
            	case 6 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:34: '('
            	    {
            	    match('('); 

            	    }
            	    break;
            	case 7 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:38: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 8 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:42: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 9 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:46: '='
            	    {
            	    match('='); 

            	    }
            	    break;
            	case 10 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:50: '°'
            	    {
            	    match('\u00B0'); 

            	    }
            	    break;
            	case 11 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:54: ':'
            	    {
            	    match(':'); 

            	    }
            	    break;
            	case 12 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:58: '%'
            	    {
            	    match('%'); 

            	    }
            	    break;
            	case 13 :
            	    // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:27:62: DIGIT
            	    {
            	    mDIGIT(); 

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

    // $ANTLR start "UNMATCHED"
    public final void mUNMATCHED() throws RecognitionException {
        try {
            int _type = UNMATCHED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:2: ( . )
            // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:5: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNMATCHED"

    public void mTokens() throws RecognitionException {
        // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | WS | NEWLINE | TOKEN | UNMATCHED )
        int alt5=176;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:508: T__94
                {
                mT__94(); 

                }
                break;
            case 85 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:514: T__95
                {
                mT__95(); 

                }
                break;
            case 86 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:520: T__96
                {
                mT__96(); 

                }
                break;
            case 87 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:526: T__97
                {
                mT__97(); 

                }
                break;
            case 88 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:532: T__98
                {
                mT__98(); 

                }
                break;
            case 89 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:538: T__99
                {
                mT__99(); 

                }
                break;
            case 90 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:544: T__100
                {
                mT__100(); 

                }
                break;
            case 91 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:551: T__101
                {
                mT__101(); 

                }
                break;
            case 92 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:558: T__102
                {
                mT__102(); 

                }
                break;
            case 93 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:565: T__103
                {
                mT__103(); 

                }
                break;
            case 94 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:572: T__104
                {
                mT__104(); 

                }
                break;
            case 95 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:579: T__105
                {
                mT__105(); 

                }
                break;
            case 96 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:586: T__106
                {
                mT__106(); 

                }
                break;
            case 97 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:593: T__107
                {
                mT__107(); 

                }
                break;
            case 98 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:600: T__108
                {
                mT__108(); 

                }
                break;
            case 99 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:607: T__109
                {
                mT__109(); 

                }
                break;
            case 100 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:614: T__110
                {
                mT__110(); 

                }
                break;
            case 101 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:621: T__111
                {
                mT__111(); 

                }
                break;
            case 102 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:628: T__112
                {
                mT__112(); 

                }
                break;
            case 103 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:635: T__113
                {
                mT__113(); 

                }
                break;
            case 104 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:642: T__114
                {
                mT__114(); 

                }
                break;
            case 105 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:649: T__115
                {
                mT__115(); 

                }
                break;
            case 106 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:656: T__116
                {
                mT__116(); 

                }
                break;
            case 107 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:663: T__117
                {
                mT__117(); 

                }
                break;
            case 108 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:670: T__118
                {
                mT__118(); 

                }
                break;
            case 109 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:677: T__119
                {
                mT__119(); 

                }
                break;
            case 110 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:684: T__120
                {
                mT__120(); 

                }
                break;
            case 111 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:691: T__121
                {
                mT__121(); 

                }
                break;
            case 112 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:698: T__122
                {
                mT__122(); 

                }
                break;
            case 113 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:705: T__123
                {
                mT__123(); 

                }
                break;
            case 114 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:712: T__124
                {
                mT__124(); 

                }
                break;
            case 115 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:719: T__125
                {
                mT__125(); 

                }
                break;
            case 116 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:726: T__126
                {
                mT__126(); 

                }
                break;
            case 117 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:733: T__127
                {
                mT__127(); 

                }
                break;
            case 118 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:740: T__128
                {
                mT__128(); 

                }
                break;
            case 119 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:747: T__129
                {
                mT__129(); 

                }
                break;
            case 120 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:754: T__130
                {
                mT__130(); 

                }
                break;
            case 121 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:761: T__131
                {
                mT__131(); 

                }
                break;
            case 122 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:768: T__132
                {
                mT__132(); 

                }
                break;
            case 123 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:775: T__133
                {
                mT__133(); 

                }
                break;
            case 124 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:782: T__134
                {
                mT__134(); 

                }
                break;
            case 125 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:789: T__135
                {
                mT__135(); 

                }
                break;
            case 126 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:796: T__136
                {
                mT__136(); 

                }
                break;
            case 127 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:803: T__137
                {
                mT__137(); 

                }
                break;
            case 128 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:810: T__138
                {
                mT__138(); 

                }
                break;
            case 129 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:817: T__139
                {
                mT__139(); 

                }
                break;
            case 130 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:824: T__140
                {
                mT__140(); 

                }
                break;
            case 131 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:831: T__141
                {
                mT__141(); 

                }
                break;
            case 132 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:838: T__142
                {
                mT__142(); 

                }
                break;
            case 133 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:845: T__143
                {
                mT__143(); 

                }
                break;
            case 134 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:852: T__144
                {
                mT__144(); 

                }
                break;
            case 135 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:859: T__145
                {
                mT__145(); 

                }
                break;
            case 136 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:866: T__146
                {
                mT__146(); 

                }
                break;
            case 137 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:873: T__147
                {
                mT__147(); 

                }
                break;
            case 138 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:880: T__148
                {
                mT__148(); 

                }
                break;
            case 139 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:887: T__149
                {
                mT__149(); 

                }
                break;
            case 140 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:894: T__150
                {
                mT__150(); 

                }
                break;
            case 141 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:901: T__151
                {
                mT__151(); 

                }
                break;
            case 142 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:908: T__152
                {
                mT__152(); 

                }
                break;
            case 143 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:915: T__153
                {
                mT__153(); 

                }
                break;
            case 144 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:922: T__154
                {
                mT__154(); 

                }
                break;
            case 145 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:929: T__155
                {
                mT__155(); 

                }
                break;
            case 146 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:936: T__156
                {
                mT__156(); 

                }
                break;
            case 147 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:943: T__157
                {
                mT__157(); 

                }
                break;
            case 148 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:950: T__158
                {
                mT__158(); 

                }
                break;
            case 149 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:957: T__159
                {
                mT__159(); 

                }
                break;
            case 150 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:964: T__160
                {
                mT__160(); 

                }
                break;
            case 151 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:971: T__161
                {
                mT__161(); 

                }
                break;
            case 152 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:978: T__162
                {
                mT__162(); 

                }
                break;
            case 153 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:985: T__163
                {
                mT__163(); 

                }
                break;
            case 154 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:992: T__164
                {
                mT__164(); 

                }
                break;
            case 155 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:999: T__165
                {
                mT__165(); 

                }
                break;
            case 156 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1006: T__166
                {
                mT__166(); 

                }
                break;
            case 157 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1013: T__167
                {
                mT__167(); 

                }
                break;
            case 158 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1020: T__168
                {
                mT__168(); 

                }
                break;
            case 159 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1027: T__169
                {
                mT__169(); 

                }
                break;
            case 160 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1034: T__170
                {
                mT__170(); 

                }
                break;
            case 161 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1041: T__171
                {
                mT__171(); 

                }
                break;
            case 162 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1048: T__172
                {
                mT__172(); 

                }
                break;
            case 163 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1055: T__173
                {
                mT__173(); 

                }
                break;
            case 164 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1062: T__174
                {
                mT__174(); 

                }
                break;
            case 165 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1069: T__175
                {
                mT__175(); 

                }
                break;
            case 166 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1076: T__176
                {
                mT__176(); 

                }
                break;
            case 167 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1083: T__177
                {
                mT__177(); 

                }
                break;
            case 168 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1090: T__178
                {
                mT__178(); 

                }
                break;
            case 169 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1097: T__179
                {
                mT__179(); 

                }
                break;
            case 170 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1104: T__180
                {
                mT__180(); 

                }
                break;
            case 171 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1111: T__181
                {
                mT__181(); 

                }
                break;
            case 172 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1118: T__182
                {
                mT__182(); 

                }
                break;
            case 173 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1125: WS
                {
                mWS(); 

                }
                break;
            case 174 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1128: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 175 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1136: TOKEN
                {
                mTOKEN(); 

                }
                break;
            case 176 :
                // /home/lezan/galWorkspace/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:1:1142: UNMATCHED
                {
                mUNMATCHED(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA4_eotS =
        "\1\1\16\uffff";
    static final String DFA4_eofS =
        "\17\uffff";
    static final String DFA4_minS =
        "\1\45\16\uffff";
    static final String DFA4_maxS =
        "\1\u00b0\16\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15";
    static final String DFA4_specialS =
        "\17\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\15\2\uffff\1\7\1\6\2\uffff\1\4\1\11\1\5\1\10\12\16\1\14\2"+
            "\uffff\1\12\3\uffff\32\2\4\uffff\1\3\1\uffff\32\2\65\uffff\1"+
            "\13",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
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
            return "()+ loopback of 27:9: ( ACHAR | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | '°' | ':' | '%' | DIGIT )+";
        }
    }
    static final String DFA5_eotS =
        "\1\uffff\26\52\1\uffff\1\47\17\uffff\1\52\1\127\1\uffff\1\52\1\131"+
        "\1\133\1\52\1\136\1\137\1\141\1\146\1\52\1\150\1\153\1\154\1\162"+
        "\1\164\1\52\1\170\1\52\1\174\1\u0080\4\52\1\u0087\1\u0088\1\u0089"+
        "\2\52\1\u0092\1\u0093\1\u0094\1\u0098\1\u009c\1\u009d\1\u009f\1"+
        "\52\1\u00a5\1\u00a6\3\52\2\uffff\1\52\1\uffff\1\52\1\uffff\1\52"+
        "\1\uffff\2\52\2\uffff\1\52\1\uffff\1\52\1\uffff\1\u00c6\1\u00c7"+
        "\1\uffff\1\u00c8\2\uffff\1\u00ca\2\uffff\1\52\1\u00da\1\u00db\1"+
        "\u00dc\1\u00dd\1\uffff\1\52\1\uffff\1\u00df\1\u00e0\1\u00e1\1\uffff"+
        "\1\52\1\u00e3\1\u00e4\1\uffff\1\u00e5\1\u00e6\1\u00e7\1\uffff\1"+
        "\52\1\u00e9\2\52\1\u00ec\1\u00ed\3\uffff\2\52\1\u00f1\1\u00f2\1"+
        "\u00f3\1\u00f4\1\u00f5\1\u00f6\3\uffff\1\u00f7\1\u00f8\1\u00f9\1"+
        "\uffff\1\u00fa\1\u00fb\1\u00fc\4\uffff\1\u00fe\1\u0100\1\u0101\1"+
        "\u0103\1\u0104\2\uffff\1\u0105\1\uffff\1\u0106\1\u0107\1\u0108\31"+
        "\52\6\uffff\17\52\4\uffff\1\52\3\uffff\1\u014e\5\uffff\1\u014f\1"+
        "\uffff\1\u0150\1\u0151\2\uffff\2\52\1\u0154\16\uffff\1\u0155\2\uffff"+
        "\1\u0156\6\uffff\3\52\1\u015a\1\u015b\1\u015c\2\52\1\u015f\1\u0161"+
        "\2\52\1\u0165\1\u0166\21\52\1\u0178\44\52\1\u01a4\4\uffff\1\u01a5"+
        "\1\u01a6\3\uffff\3\52\3\uffff\2\52\1\uffff\1\52\1\uffff\1\52\1\u01b0"+
        "\1\u01b1\2\uffff\1\52\1\u01b3\10\52\1\u01bc\4\52\1\u01c1\1\52\1"+
        "\uffff\1\52\1\u01c4\13\52\1\u01d1\1\52\1\u01d3\7\52\1\u01de\2\52"+
        "\1\u01e1\20\52\3\uffff\7\52\1\u01fc\1\u01fe\2\uffff\1\u01ff\1\uffff"+
        "\1\u0200\3\52\1\u0205\1\u0206\1\u0207\1\52\1\uffff\4\52\1\uffff"+
        "\2\52\1\uffff\14\52\1\uffff\1\52\1\uffff\4\52\1\u0220\3\52\1\u0224"+
        "\1\52\1\uffff\1\52\1\u0227\1\uffff\2\52\1\u022a\3\52\1\u022e\7\52"+
        "\1\u0236\1\u0237\1\52\1\u0239\1\u023a\1\u023b\1\u023c\3\52\1\u0240"+
        "\1\52\1\uffff\1\52\3\uffff\1\u0243\1\u0244\1\52\1\u0246\3\uffff"+
        "\14\52\1\u0253\1\u0254\12\52\1\uffff\3\52\1\uffff\2\52\1\uffff\2"+
        "\52\1\uffff\1\52\1\u0267\1\52\1\uffff\7\52\2\uffff\1\u0270\4\uffff"+
        "\1\u0271\2\52\1\uffff\1\u0274\1\52\2\uffff\1\52\1\uffff\1\52\1\u0278"+
        "\2\52\1\u027b\2\52\1\u027e\2\52\1\u0281\1\52\2\uffff\1\u0283\2\52"+
        "\1\u0286\1\52\1\u0288\1\u0289\1\u028a\7\52\1\u0292\1\52\1\u0294"+
        "\1\uffff\4\52\1\u0299\1\u029a\1\52\1\u029c\2\uffff\1\u029d\1\u029e"+
        "\1\uffff\1\u029f\1\52\1\u02a1\1\uffff\1\u02a2\1\52\1\uffff\1\52"+
        "\1\u02a5\1\uffff\2\52\1\uffff\1\52\1\uffff\2\52\1\uffff\1\u02ab"+
        "\3\uffff\1\u02ac\2\52\1\u02af\1\u02b0\2\52\1\uffff\1\52\1\uffff"+
        "\1\u02b4\3\52\2\uffff\1\u02b8\4\uffff\1\52\2\uffff\2\52\1\uffff"+
        "\3\52\1\u02bf\1\52\2\uffff\1\52\1\u02c2\2\uffff\2\52\1\u02c5\1\uffff"+
        "\1\u02c6\2\52\1\uffff\2\52\1\u02cb\3\52\1\uffff\2\52\1\uffff\1\52"+
        "\1\u02d2\2\uffff\1\u02d3\1\52\1\u02d5\1\u02d6\1\uffff\1\u02d7\4"+
        "\52\1\u02dc\2\uffff\1\52\3\uffff\1\52\1\u02df\1\u02e0\1\u02e1\1"+
        "\uffff\1\u02e2\1\52\4\uffff\1\52\1\u02e5\1\uffff";
    static final String DFA5_eofS =
        "\u02e6\uffff";
    static final String DFA5_minS =
        "\1\0\1\104\1\115\1\103\1\116\1\103\2\102\1\101\1\124\1\123\1\102"+
        "\1\114\1\105\1\130\1\127\1\126\1\112\1\104\1\116\1\114\1\110\1\104"+
        "\1\uffff\1\12\17\uffff\1\103\1\45\1\uffff\1\55\2\45\1\114\3\45\1"+
        "\44\1\107\1\45\1\44\3\45\1\114\1\45\1\123\2\45\1\117\1\115\2\121"+
        "\3\45\2\122\6\45\2\44\2\45\1\124\1\44\1\102\2\uffff\1\101\1\uffff"+
        "\1\125\1\uffff\1\125\1\uffff\1\117\1\115\2\uffff\1\101\1\uffff\1"+
        "\101\1\uffff\1\44\1\45\1\uffff\1\45\2\uffff\1\44\2\uffff\1\101\4"+
        "\45\1\uffff\1\123\1\uffff\3\45\1\uffff\1\110\2\45\1\uffff\3\45\1"+
        "\uffff\1\120\1\45\2\102\2\45\3\uffff\2\102\6\45\3\uffff\3\45\1\uffff"+
        "\3\45\4\uffff\1\44\4\45\2\uffff\1\45\1\uffff\3\45\1\122\3\116\1"+
        "\101\1\106\1\105\1\116\2\111\1\106\1\117\1\116\1\124\3\105\1\104"+
        "\1\121\1\101\1\110\1\111\1\105\1\122\1\105\6\uffff\1\123\1\110\1"+
        "\124\1\104\1\105\1\111\1\122\1\130\1\105\1\116\1\101\1\125\1\105"+
        "\1\101\1\111\4\uffff\1\124\3\uffff\1\45\5\uffff\1\45\1\uffff\2\45"+
        "\2\uffff\2\55\1\45\16\uffff\1\45\2\uffff\1\45\6\uffff\1\55\2\111"+
        "\3\45\1\124\1\106\2\45\1\124\1\101\2\45\1\105\1\122\1\117\1\104"+
        "\1\101\1\116\2\115\1\101\1\116\1\114\1\124\1\130\1\115\1\117\1\104"+
        "\1\120\1\45\1\124\1\114\1\103\1\105\1\114\1\103\1\101\1\114\1\105"+
        "\2\122\1\131\1\115\1\105\1\101\1\116\1\102\1\111\1\116\1\104\1\120"+
        "\1\117\1\107\1\123\1\114\1\105\1\124\1\101\1\103\1\122\1\105\1\122"+
        "\1\105\1\103\1\111\1\105\1\45\4\uffff\2\45\3\uffff\3\103\3\uffff"+
        "\1\105\1\117\1\uffff\1\117\1\uffff\1\110\2\45\2\uffff\1\122\1\45"+
        "\1\115\1\105\2\124\1\105\1\120\1\115\1\105\1\45\1\110\1\124\1\117"+
        "\1\125\1\45\1\101\1\uffff\1\122\1\45\1\125\1\115\1\117\1\125\1\103"+
        "\1\114\1\123\1\124\1\103\1\111\1\103\1\45\1\117\1\45\1\116\1\103"+
        "\1\114\1\112\1\120\1\122\1\124\1\45\1\101\1\120\1\45\1\101\1\123"+
        "\1\114\1\101\1\122\1\124\1\122\1\124\1\103\1\111\1\116\2\117\1\124"+
        "\1\110\1\114\3\uffff\1\104\2\116\2\117\2\122\2\45\2\uffff\1\45\1"+
        "\uffff\1\45\1\122\1\105\1\110\3\45\1\122\1\uffff\1\117\1\125\1\123"+
        "\1\116\1\uffff\1\122\1\101\1\uffff\1\125\1\105\2\115\2\105\1\110"+
        "\1\105\1\123\1\111\1\106\1\105\1\uffff\1\126\1\uffff\2\107\1\101"+
        "\1\105\1\45\3\105\1\45\1\110\1\uffff\1\122\1\45\1\uffff\1\123\1"+
        "\117\1\45\1\105\1\124\1\101\1\45\1\105\2\111\1\106\1\103\2\126\2"+
        "\45\1\104\4\45\1\124\2\104\1\45\1\105\1\uffff\1\125\3\uffff\2\45"+
        "\1\105\1\45\3\uffff\1\101\1\104\1\122\1\120\1\124\1\101\1\103\1"+
        "\115\1\116\1\101\2\116\2\45\1\122\1\125\1\120\1\131\1\116\3\105"+
        "\1\111\1\116\1\uffff\1\122\1\103\1\116\1\uffff\1\105\1\101\1\uffff"+
        "\1\123\1\114\1\uffff\1\122\1\45\1\103\1\uffff\1\101\1\124\1\120"+
        "\1\131\1\110\2\105\2\uffff\1\45\4\uffff\1\45\2\105\1\uffff\1\45"+
        "\1\124\2\uffff\1\123\1\uffff\1\114\1\45\1\105\1\110\1\45\2\124\1"+
        "\45\2\124\1\45\1\124\2\uffff\1\45\1\122\1\111\1\45\1\124\3\45\1"+
        "\116\1\124\1\107\1\124\1\104\1\123\1\124\1\45\1\126\1\45\1\uffff"+
        "\1\124\1\123\2\111\2\45\1\122\1\45\2\uffff\2\45\1\uffff\1\45\1\111"+
        "\1\45\1\uffff\1\45\1\105\1\uffff\1\125\1\45\1\uffff\1\111\1\117"+
        "\1\uffff\1\122\1\uffff\1\105\1\124\1\uffff\1\45\3\uffff\1\45\1\122"+
        "\1\105\2\45\1\111\1\125\1\uffff\1\105\1\uffff\1\45\1\105\1\117\1"+
        "\124\2\uffff\1\45\4\uffff\1\132\2\uffff\1\122\1\123\1\uffff\1\124"+
        "\1\107\1\101\1\45\1\101\2\uffff\1\101\1\45\2\uffff\1\132\1\123\1"+
        "\45\1\uffff\1\45\1\116\1\101\1\uffff\2\105\1\45\1\131\1\122\1\124"+
        "\1\uffff\2\124\1\uffff\1\105\1\45\2\uffff\1\45\1\124\2\45\1\uffff"+
        "\1\45\1\101\3\105\1\45\2\uffff\1\105\3\uffff\1\120\3\45\1\uffff"+
        "\1\45\1\110\4\uffff\1\131\1\45\1\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\123\1\117\1\123\1\116\1\122\1\102\2\124\1\131\2\123\1"+
        "\122\1\105\1\130\1\127\1\126\1\112\1\104\1\120\1\114\1\110\1\122"+
        "\1\uffff\1\12\17\uffff\1\103\1\u00b0\1\uffff\1\55\2\u00b0\1\115"+
        "\4\u00b0\1\107\5\u00b0\1\130\1\u00b0\1\123\2\u00b0\1\117\1\115\2"+
        "\121\3\u00b0\2\122\7\u00b0\1\123\2\u00b0\1\124\1\123\1\102\2\uffff"+
        "\1\101\1\uffff\1\125\1\uffff\1\125\1\uffff\1\117\1\115\2\uffff\1"+
        "\127\1\uffff\1\126\1\uffff\2\u00b0\1\uffff\1\u00b0\2\uffff\1\u00b0"+
        "\2\uffff\1\131\4\u00b0\1\uffff\1\123\1\uffff\3\u00b0\1\uffff\1\110"+
        "\2\u00b0\1\uffff\3\u00b0\1\uffff\1\120\1\u00b0\2\102\2\u00b0\3\uffff"+
        "\2\102\6\u00b0\3\uffff\3\u00b0\1\uffff\3\u00b0\4\uffff\1\44\4\u00b0"+
        "\2\uffff\1\u00b0\1\uffff\3\u00b0\1\122\3\116\1\101\1\123\1\131\1"+
        "\116\2\111\1\126\1\122\1\116\1\131\1\111\1\122\1\117\1\124\1\130"+
        "\1\117\1\131\1\114\1\125\1\122\1\105\6\uffff\1\123\1\117\1\131\1"+
        "\120\1\122\1\111\1\122\1\130\1\105\1\116\2\125\1\105\1\101\1\111"+
        "\4\uffff\1\124\3\uffff\1\u00b0\5\uffff\1\u00b0\1\uffff\2\u00b0\2"+
        "\uffff\2\55\1\u00b0\16\uffff\1\u00b0\2\uffff\1\u00b0\6\uffff\1\55"+
        "\2\111\3\u00b0\1\124\1\106\2\u00b0\1\124\1\101\2\u00b0\1\105\1\122"+
        "\1\117\1\104\1\101\1\116\2\115\1\101\1\116\1\114\1\124\1\130\1\115"+
        "\1\117\1\104\1\120\1\u00b0\1\124\1\114\1\103\1\122\1\116\1\103\1"+
        "\101\1\114\1\105\2\122\1\131\1\115\1\105\1\101\1\117\1\123\1\111"+
        "\1\116\1\104\1\120\1\131\1\107\1\123\1\114\1\105\1\124\1\101\1\103"+
        "\1\122\1\105\1\122\1\105\1\115\1\123\1\105\1\u00b0\4\uffff\2\u00b0"+
        "\3\uffff\1\122\2\103\3\uffff\1\105\1\117\1\uffff\1\117\1\uffff\1"+
        "\110\2\u00b0\2\uffff\1\122\1\u00b0\1\115\1\105\2\124\1\105\1\120"+
        "\1\115\1\105\1\u00b0\1\110\1\124\1\117\1\125\1\u00b0\1\101\1\uffff"+
        "\1\122\1\u00b0\1\125\1\115\1\117\1\125\1\103\1\114\1\123\1\124\1"+
        "\123\1\111\1\103\1\u00b0\1\117\1\u00b0\1\122\1\124\1\114\1\115\1"+
        "\120\1\122\1\124\1\u00b0\1\101\1\120\1\u00b0\1\101\1\123\1\124\1"+
        "\101\1\122\1\124\1\122\1\124\1\103\1\111\1\116\2\117\1\124\1\110"+
        "\1\114\3\uffff\1\115\2\116\2\117\2\122\2\u00b0\2\uffff\1\u00b0\1"+
        "\uffff\1\u00b0\1\122\1\105\1\110\3\u00b0\1\122\1\uffff\1\117\1\125"+
        "\1\123\1\116\1\uffff\1\122\1\101\1\uffff\1\125\1\105\2\115\2\105"+
        "\1\110\1\105\1\123\1\111\1\106\1\105\1\uffff\1\126\1\uffff\2\107"+
        "\1\101\1\105\1\u00b0\3\105\1\u00b0\1\110\1\uffff\1\122\1\u00b0\1"+
        "\uffff\1\123\1\117\1\u00b0\1\105\1\124\1\101\1\u00b0\1\105\2\111"+
        "\1\106\1\103\2\126\2\u00b0\1\104\4\u00b0\1\124\2\104\1\u00b0\1\105"+
        "\1\uffff\1\125\3\uffff\2\u00b0\1\105\1\u00b0\3\uffff\1\101\1\104"+
        "\1\122\1\120\1\124\1\101\1\103\1\115\1\116\1\101\2\116\2\u00b0\1"+
        "\122\1\125\1\120\1\131\1\116\3\105\1\111\1\116\1\uffff\1\122\1\103"+
        "\1\116\1\uffff\1\105\1\101\1\uffff\1\123\1\114\1\uffff\1\122\1\u00b0"+
        "\1\103\1\uffff\1\101\1\124\1\120\1\131\1\110\2\105\2\uffff\1\u00b0"+
        "\4\uffff\1\u00b0\2\105\1\uffff\1\u00b0\1\124\2\uffff\1\123\1\uffff"+
        "\1\114\1\u00b0\1\105\1\110\1\u00b0\2\124\1\u00b0\2\124\1\u00b0\1"+
        "\124\2\uffff\1\u00b0\1\122\1\111\1\u00b0\1\124\3\u00b0\1\116\1\124"+
        "\1\107\1\124\1\104\1\123\1\124\1\u00b0\1\126\1\u00b0\1\uffff\1\124"+
        "\1\123\2\111\2\u00b0\1\122\1\u00b0\2\uffff\2\u00b0\1\uffff\1\u00b0"+
        "\1\111\1\u00b0\1\uffff\1\u00b0\1\105\1\uffff\1\125\1\u00b0\1\uffff"+
        "\1\111\1\117\1\uffff\1\122\1\uffff\1\105\1\124\1\uffff\1\u00b0\3"+
        "\uffff\1\u00b0\1\122\1\105\2\u00b0\1\111\1\125\1\uffff\1\105\1\uffff"+
        "\1\u00b0\1\105\1\117\1\124\2\uffff\1\u00b0\4\uffff\1\132\2\uffff"+
        "\1\122\1\123\1\uffff\1\124\1\107\1\101\1\u00b0\1\101\2\uffff\1\101"+
        "\1\u00b0\2\uffff\1\132\1\123\1\u00b0\1\uffff\1\u00b0\1\116\1\101"+
        "\1\uffff\2\105\1\u00b0\1\131\1\122\1\124\1\uffff\2\124\1\uffff\1"+
        "\105\1\u00b0\2\uffff\1\u00b0\1\124\2\u00b0\1\uffff\1\u00b0\1\101"+
        "\3\105\1\u00b0\2\uffff\1\105\3\uffff\1\120\3\u00b0\1\uffff\1\u00b0"+
        "\1\110\4\uffff\1\131\1\u00b0\1\uffff";
    static final String DFA5_acceptS =
        "\27\uffff\1\u00ad\1\uffff\1\u00ae\15\u00af\1\u00b0\2\uffff\1\u00af"+
        "\51\uffff\1\u00ad\1\u00ae\1\uffff\1\u008f\1\uffff\1\u00a1\1\uffff"+
        "\1\157\2\uffff\1\156\1\160\1\uffff\1\176\1\uffff\1\u0086\2\uffff"+
        "\1\u0085\1\uffff\1\u0084\1\u008b\1\uffff\1\u0089\1\u008e\5\uffff"+
        "\1\u00a3\1\uffff\1\144\3\uffff\1\145\3\uffff\1\161\3\uffff\1\164"+
        "\6\uffff\1\u009b\1\u009e\1\u009f\10\uffff\1\146\1\170\1\171\3\uffff"+
        "\1\172\3\uffff\1\177\1\u0083\1\u0091\1\u0090\5\uffff\1\u0099\1\u00a2"+
        "\1\uffff\1\u00a9\34\uffff\1\u0088\1\u0087\1\u008a\1\131\1\u008d"+
        "\1\u008c\17\uffff\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\uffff\1\141"+
        "\1\142\1\143\1\uffff\1\162\1\163\1\165\1\166\1\167\1\uffff\1\u00a0"+
        "\2\uffff\1\u009c\1\u009d\3\uffff\1\147\1\151\1\152\1\153\1\154\1"+
        "\155\1\173\1\174\1\175\1\u0080\1\u0081\1\u0082\1\u0093\1\u0092\1"+
        "\uffff\1\u0094\1\u0096\1\uffff\1\u0097\1\u009a\1\u00a8\1\u00aa\1"+
        "\u00ab\1\u00ac\105\uffff\1\132\1\133\1\135\1\136\2\uffff\1\150\1"+
        "\u0095\1\u0098\3\uffff\1\126\1\127\1\7\2\uffff\1\16\1\uffff\1\12"+
        "\3\uffff\1\20\1\21\21\uffff\1\34\53\uffff\1\130\1\137\1\140\11\uffff"+
        "\1\17\1\26\1\uffff\1\22\10\uffff\1\32\4\uffff\1\57\2\uffff\1\35"+
        "\14\uffff\1\100\1\uffff\1\53\12\uffff\1\61\2\uffff\1\77\32\uffff"+
        "\1\13\1\uffff\1\14\1\25\1\23\4\uffff\1\30\1\37\1\31\30\uffff\1\74"+
        "\3\uffff\1\120\2\uffff\1\64\2\uffff\1\65\3\uffff\1\105\7\uffff\1"+
        "\123\1\124\1\uffff\1\1\1\2\1\52\1\3\3\uffff\1\11\2\uffff\1\24\1"+
        "\27\1\uffff\1\51\14\uffff\1\50\1\40\22\uffff\1\67\10\uffff\1\125"+
        "\1\4\2\uffff\1\10\3\uffff\1\42\2\uffff\1\43\2\uffff\1\47\2\uffff"+
        "\1\45\1\uffff\1\104\2\uffff\1\113\1\uffff\1\117\1\54\1\62\7\uffff"+
        "\1\75\1\uffff\1\103\4\uffff\1\112\1\114\1\uffff\1\116\1\5\1\6\1"+
        "\15\1\uffff\1\41\1\60\2\uffff\1\102\5\uffff\1\134\1\63\2\uffff\1"+
        "\56\1\66\3\uffff\1\101\3\uffff\1\115\6\uffff\1\44\2\uffff\1\55\2"+
        "\uffff\1\76\1\106\4\uffff\1\71\6\uffff\1\70\1\107\1\uffff\1\122"+
        "\1\33\1\36\4\uffff\1\121\2\uffff\1\73\1\111\1\72\1\110\2\uffff\1"+
        "\46";
    static final String DFA5_specialS =
        "\1\0\u02e5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\47\1\27\1\31\2\47\1\30\22\47\1\27\4\47\1\45\2\47\1\40\1"+
            "\37\2\47\1\35\1\14\1\36\1\41\12\46\1\44\2\47\1\42\3\47\1\7\1"+
            "\15\1\3\1\10\1\16\1\17\1\32\1\20\1\4\1\21\1\32\1\12\1\22\1\5"+
            "\1\1\1\23\1\24\1\13\1\11\1\2\1\25\1\6\1\26\3\32\4\47\1\34\1"+
            "\47\32\33\65\47\1\43\uff4f\47",
            "\1\51\16\uffff\1\50",
            "\1\53\1\uffff\1\54",
            "\1\57\1\55\12\uffff\1\56\3\uffff\1\60",
            "\1\61",
            "\1\64\1\uffff\1\63\10\uffff\1\62\1\uffff\1\65\1\uffff\1\66",
            "\1\67",
            "\1\71\15\uffff\1\70\3\uffff\1\72",
            "\1\73\15\uffff\1\74\4\uffff\1\75",
            "\1\76\4\uffff\1\77",
            "\1\100",
            "\1\102\13\uffff\1\103\1\uffff\1\104\2\uffff\1\101",
            "\1\105\5\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115\1\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121\13\uffff\1\122\1\uffff\1\123",
            "",
            "\1\125",
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
            "\1\126",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\130",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\1\52\1\132\15\52\2\uffff\1\52\3"+
            "\uffff\32\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\134\1\135",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\1\52\1\140\15\52\2\uffff\1\52\3"+
            "\uffff\32\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\143\1\52\2\uffff\2\52\2\uffff\1\52\1\142\15\52\2\uffff\1"+
            "\52\3\uffff\17\52\1\145\2\52\1\144\7\52\4\uffff\1\52\1\uffff"+
            "\32\52\65\uffff\1\52",
            "\1\147",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\151\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff"+
            "\22\52\1\152\7\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\1\52\1\155\15\52\2\uffff\1\52\3"+
            "\uffff\3\52\1\156\2\52\1\157\6\52\1\160\13\52\1\161\4\uffff"+
            "\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\16\52"+
            "\1\163\13\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\165\1\uffff\1\166\11\uffff\1\167",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\171",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\3\52"+
            "\1\172\25\52\1\173\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\10\52"+
            "\1\175\11\52\1\176\4\52\1\177\2\52\4\uffff\1\52\1\uffff\32\52"+
            "\65\uffff\1\52",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\21\52"+
            "\1\u0085\1\52\1\u0086\6\52\4\uffff\1\52\1\uffff\32\52\65\uffff"+
            "\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u008a",
            "\1\u008b",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\3\52"+
            "\1\u008c\2\52\1\u008d\5\52\1\u008e\1\u008f\3\52\1\u0090\7\52"+
            "\1\u0091\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\3\52"+
            "\1\u0095\2\52\1\u0096\6\52\1\u0097\14\52\4\uffff\1\52\1\uffff"+
            "\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\21\52"+
            "\1\u0099\1\u009a\1\u009b\6\52\4\uffff\1\52\1\uffff\32\52\65"+
            "\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u009e\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff"+
            "\32\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u00a0\47\uffff\1\u00a1\2\uffff\1\u00a2\3\uffff\1\u00a3",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\17\52"+
            "\1\u00a4\12\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u00a7",
            "\1\u00a8\52\uffff\1\u00a9\3\uffff\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "",
            "",
            "\1\u00b1\1\u00b2\3\uffff\1\u00b7\2\uffff\1\u00b3\5\uffff\1"+
            "\u00b6\5\uffff\1\u00b8\1\u00b5\1\u00b4",
            "",
            "\1\u00bd\1\uffff\1\u00c0\1\u00c3\1\u00be\1\u00c1\1\u00bb\5"+
            "\uffff\1\u00bc\2\uffff\1\u00c2\1\uffff\1\u00c4\1\u00b9\1\u00ba"+
            "\1\uffff\1\u00bf",
            "",
            "\1\u00c5\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff"+
            "\32\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\u00c9\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff"+
            "\32\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\u00ce\1\uffff\1\u00cc\1\u00cf\1\u00d2\1\u00d0\1\uffff\1"+
            "\u00d3\1\u00d4\6\uffff\1\u00d5\1\u00d6\1\u00d7\1\u00cd\1\u00d1"+
            "\1\u00cb\1\uffff\1\u00d8\1\uffff\1\u00d9",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\u00de",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\u00e2",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\u00e8",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u00ea",
            "\1\u00eb",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\31\52"+
            "\1\u00f0\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "",
            "\1\u00fd",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\22\52"+
            "\1\u00ff\7\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\22\52"+
            "\1\u0102\7\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010f\14\uffff\1\u010e",
            "\1\u0110\23\uffff\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115\7\uffff\1\u0116\7\uffff\1\u0117",
            "\1\u0118\2\uffff\1\u0119",
            "\1\u011a",
            "\1\u011b\4\uffff\1\u011c",
            "\1\u011e\3\uffff\1\u011d",
            "\1\u0120\14\uffff\1\u011f",
            "\1\u0122\3\uffff\1\u0123\5\uffff\1\u0121",
            "\1\u0126\10\uffff\1\u0125\2\uffff\1\u0127\3\uffff\1\u0124",
            "\1\u0128\6\uffff\1\u0129",
            "\1\u012b\15\uffff\1\u012a",
            "\1\u012c\6\uffff\1\u012d\11\uffff\1\u012e",
            "\1\u0130\2\uffff\1\u012f",
            "\1\u0133\14\uffff\1\u0131\2\uffff\1\u0132",
            "\1\u0134",
            "\1\u0135",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0136",
            "\1\u0137\6\uffff\1\u0138",
            "\1\u013a\1\u0139\3\uffff\1\u013b",
            "\1\u013c\13\uffff\1\u013d",
            "\1\u013f\3\uffff\1\u0140\10\uffff\1\u013e",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146\20\uffff\1\u0147\2\uffff\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "",
            "",
            "\1\u014d",
            "",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
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
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u015d",
            "\1\u015e",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\23\52"+
            "\1\u0160\6\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0162",
            "\1\u0163",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\5\52"+
            "\1\u0164\24\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c\14\uffff\1\u017d",
            "\1\u017e\1\uffff\1\u017f",
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
            "\1\u018a\1\u018b",
            "\1\u018c\20\uffff\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192\11\uffff\1\u0193",
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
            "\1\u019e",
            "\1\u019f\11\uffff\1\u01a0",
            "\1\u01a1\11\uffff\1\u01a2",
            "\1\u01a3",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "\1\u01a7\13\uffff\1\u01a9\2\uffff\1\u01a8",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "",
            "\1\u01af",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\u01b2",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01ce\17\uffff\1\u01cd",
            "\1\u01cf",
            "\1\u01d0",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u01d2",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u01d4\3\uffff\1\u01d5",
            "\1\u01d7\20\uffff\1\u01d6",
            "\1\u01d8",
            "\1\u01da\2\uffff\1\u01d9",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u01df",
            "\1\u01e0",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4\7\uffff\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "",
            "",
            "",
            "\1\u01f3\5\uffff\1\u01f4\2\uffff\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\16\52"+
            "\1\u01fd\13\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\22\52"+
            "\1\u0204\7\52\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0208",
            "",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "",
            "\1\u020d",
            "\1\u020e",
            "",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "",
            "\1\u021b",
            "",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0225",
            "",
            "\1\u0226",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\u0228",
            "\1\u0229",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0238",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0241",
            "",
            "\1\u0242",
            "",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0245",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "",
            "\1\u0262",
            "\1\u0263",
            "",
            "\1\u0264",
            "\1\u0265",
            "",
            "\1\u0266",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0268",
            "",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0272",
            "\1\u0273",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0275",
            "",
            "",
            "\1\u0276",
            "",
            "\1\u0277",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0279",
            "\1\u027a",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u027c",
            "\1\u027d",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u027f",
            "\1\u0280",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0282",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0284",
            "\1\u0285",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0287",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u0293",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u029b",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02a0",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02a3",
            "",
            "\1\u02a4",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\u02a6",
            "\1\u02a7",
            "",
            "\1\u02a8",
            "",
            "\1\u02a9",
            "\1\u02aa",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02ad",
            "\1\u02ae",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02b1",
            "\1\u02b2",
            "",
            "\1\u02b3",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "",
            "",
            "\1\u02b9",
            "",
            "",
            "\1\u02ba",
            "\1\u02bb",
            "",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02c0",
            "",
            "",
            "\1\u02c1",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\u02c3",
            "\1\u02c4",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02c7",
            "\1\u02c8",
            "",
            "\1\u02c9",
            "\1\u02ca",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "",
            "\1\u02cf",
            "\1\u02d0",
            "",
            "\1\u02d1",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02d4",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "",
            "\1\u02dd",
            "",
            "",
            "",
            "\1\u02de",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            "\1\u02e3",
            "",
            "",
            "",
            "",
            "\1\u02e4",
            "\1\52\2\uffff\2\52\2\uffff\17\52\2\uffff\1\52\3\uffff\32\52"+
            "\4\uffff\1\52\1\uffff\32\52\65\uffff\1\52",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | WS | NEWLINE | TOKEN | UNMATCHED );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='O') ) {s = 1;}

                        else if ( (LA5_0=='T') ) {s = 2;}

                        else if ( (LA5_0=='C') ) {s = 3;}

                        else if ( (LA5_0=='I') ) {s = 4;}

                        else if ( (LA5_0=='N') ) {s = 5;}

                        else if ( (LA5_0=='V') ) {s = 6;}

                        else if ( (LA5_0=='A') ) {s = 7;}

                        else if ( (LA5_0=='D') ) {s = 8;}

                        else if ( (LA5_0=='S') ) {s = 9;}

                        else if ( (LA5_0=='L') ) {s = 10;}

                        else if ( (LA5_0=='R') ) {s = 11;}

                        else if ( (LA5_0=='-') ) {s = 12;}

                        else if ( (LA5_0=='B') ) {s = 13;}

                        else if ( (LA5_0=='E') ) {s = 14;}

                        else if ( (LA5_0=='F') ) {s = 15;}

                        else if ( (LA5_0=='H') ) {s = 16;}

                        else if ( (LA5_0=='J') ) {s = 17;}

                        else if ( (LA5_0=='M') ) {s = 18;}

                        else if ( (LA5_0=='P') ) {s = 19;}

                        else if ( (LA5_0=='Q') ) {s = 20;}

                        else if ( (LA5_0=='U') ) {s = 21;}

                        else if ( (LA5_0=='W') ) {s = 22;}

                        else if ( (LA5_0=='\t'||LA5_0==' ') ) {s = 23;}

                        else if ( (LA5_0=='\r') ) {s = 24;}

                        else if ( (LA5_0=='\n') ) {s = 25;}

                        else if ( (LA5_0=='G'||LA5_0=='K'||(LA5_0>='X' && LA5_0<='Z')) ) {s = 26;}

                        else if ( ((LA5_0>='a' && LA5_0<='z')) ) {s = 27;}

                        else if ( (LA5_0=='_') ) {s = 28;}

                        else if ( (LA5_0==',') ) {s = 29;}

                        else if ( (LA5_0=='.') ) {s = 30;}

                        else if ( (LA5_0==')') ) {s = 31;}

                        else if ( (LA5_0=='(') ) {s = 32;}

                        else if ( (LA5_0=='/') ) {s = 33;}

                        else if ( (LA5_0=='=') ) {s = 34;}

                        else if ( (LA5_0=='\u00B0') ) {s = 35;}

                        else if ( (LA5_0==':') ) {s = 36;}

                        else if ( (LA5_0=='%') ) {s = 37;}

                        else if ( ((LA5_0>='0' && LA5_0<='9')) ) {s = 38;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||(LA5_0>='!' && LA5_0<='$')||(LA5_0>='&' && LA5_0<='\'')||(LA5_0>='*' && LA5_0<='+')||(LA5_0>=';' && LA5_0<='<')||(LA5_0>='>' && LA5_0<='@')||(LA5_0>='[' && LA5_0<='^')||LA5_0=='`'||(LA5_0>='{' && LA5_0<='\u00AF')||(LA5_0>='\u00B1' && LA5_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}