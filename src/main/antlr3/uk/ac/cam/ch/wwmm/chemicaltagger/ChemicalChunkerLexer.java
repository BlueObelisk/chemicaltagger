// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g 2009-12-09 19:06:25
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
    public static final int T__10=10;
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
    public String getGrammarFileName() { return "C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:9:7: ( 'OSCAR-CD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:9:9: 'OSCAR-CD'
            {
            match("OSCAR-CD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:10:7: ( 'OSCAR-CJ' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:10:9: 'OSCAR-CJ'
            {
            match("OSCAR-CJ"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:11:7: ( 'OSCAR-ONT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:11:9: 'OSCAR-ONT'
            {
            match("OSCAR-ONT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:12:7: ( 'TM-UNICODE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:12:9: 'TM-UNICODE'
            {
            match("TM-UNICODE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:13:7: ( 'CD-UNICODE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:13:9: 'CD-UNICODE'
            {
            match("CD-UNICODE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:14:7: ( 'IN-AS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:14:9: 'IN-AS'
            {
            match("IN-AS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:15:7: ( 'IN-BEFORE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:15:9: 'IN-BEFORE'
            {
            match("IN-BEFORE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:16:7: ( 'IN-AFTER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:16:9: 'IN-AFTER'
            {
            match("IN-AFTER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:17:7: ( 'IN-IN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:17:9: 'IN-IN'
            {
            match("IN-IN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:18:7: ( 'IN-INTO' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:18:9: 'IN-INTO'
            {
            match("IN-INTO"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:19:7: ( 'IN-WITH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:19:9: 'IN-WITH'
            {
            match("IN-WITH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:20:7: ( 'IN-WITHOUT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:20:9: 'IN-WITHOUT'
            {
            match("IN-WITHOUT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:21:7: ( 'IN-BY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:21:9: 'IN-BY'
            {
            match("IN-BY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:22:7: ( 'IN-VIA' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:22:9: 'IN-VIA'
            {
            match("IN-VIA"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:23:7: ( 'IN-OF' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:23:9: 'IN-OF'
            {
            match("IN-OF"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:24:7: ( 'IN-ON' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:24:9: 'IN-ON'
            {
            match("IN-ON"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:25:7: ( 'IN-FOR' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:25:9: 'IN-FOR'
            {
            match("IN-FOR"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:7: ( 'IN-FROM' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:9: 'IN-FROM'
            {
            match("IN-FROM"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:27:7: ( 'IN-UNDER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:27:9: 'IN-UNDER'
            {
            match("IN-UNDER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:28:7: ( 'IN-OVER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:28:9: 'IN-OVER'
            {
            match("IN-OVER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:29:7: ( 'IN-OFF' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:29:9: 'IN-OFF'
            {
            match("IN-OFF"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:30:7: ( 'NN-STATE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:30:9: 'NN-STATE'
            {
            match("NN-STATE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:31:7: ( 'NN-TIME' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:31:9: 'NN-TIME'
            {
            match("NN-TIME"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:32:7: ( 'NN-GRAM' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:32:9: 'NN-GRAM'
            {
            match("NN-GRAM"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:7: ( 'NN-MOL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:9: 'NN-MOL'
            {
            match("NN-MOL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:34:7: ( 'NN-ATMOSPHERE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:34:9: 'NN-ATMOSPHERE'
            {
            match("NN-ATMOSPHERE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:35:7: ( 'NN-EQ' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:35:9: 'NN-EQ'
            {
            match("NN-EQ"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:36:7: ( 'NN-VOL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:36:9: 'NN-VOL'
            {
            match("NN-VOL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:37:7: ( 'NN-CHEMENTITY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:37:9: 'NN-CHEMENTITY'
            {
            match("NN-CHEMENTITY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:7: ( 'NN-TEMP' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:9: 'NN-TEMP'
            {
            match("NN-TEMP"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:39:7: ( 'NN-FLASH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:39:9: 'NN-FLASH'
            {
            match("NN-FLASH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:40:7: ( 'NN-GENERAL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:40:9: 'NN-GENERAL'
            {
            match("NN-GENERAL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:7: ( 'NN-METHOD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:9: 'NN-METHOD'
            {
            match("NN-METHOD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:42:7: ( 'NN-AMOUNT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:42:9: 'NN-AMOUNT'
            {
            match("NN-AMOUNT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:43:7: ( 'NN-PRESSURE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:43:9: 'NN-PRESSURE'
            {
            match("NN-PRESSURE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:44:7: ( 'NN-COLUMN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:44:9: 'NN-COLUMN'
            {
            match("NN-COLUMN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:7: ( 'NN-CHROMATOGRAPHY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:9: 'NN-CHROMATOGRAPHY'
            {
            match("NN-CHROMATOGRAPHY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:7: ( 'NN-VACUUM' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:9: 'NN-VACUUM'
            {
            match("NN-VACUUM"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:47:7: ( 'NN-CYCLE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:47:9: 'NN-CYCLE'
            {
            match("NN-CYCLE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:48:7: ( 'NN-TIMES' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:48:9: 'NN-TIMES'
            {
            match("NN-TIMES"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:49:7: ( 'OSCAR-CM' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:49:9: 'OSCAR-CM'
            {
            match("OSCAR-CM"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:7: ( 'VB-USE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:9: 'VB-USE'
            {
            match("VB-USE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:7: ( 'VB-CHANGE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:9: 'VB-CHANGE'
            {
            match("VB-CHANGE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:52:7: ( 'VB-SUBMERGE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:52:9: 'VB-SUBMERGE'
            {
            match("VB-SUBMERGE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:53:7: ( 'VB-SUBJECT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:53:9: 'VB-SUBJECT'
            {
            match("VB-SUBJECT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:54:7: ( 'NN-ADD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:54:9: 'NN-ADD'
            {
            match("NN-ADD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:55:7: ( 'NN-MIXTURE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:55:9: 'NN-MIXTURE'
            {
            match("NN-MIXTURE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:56:7: ( 'VB-ADD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:56:9: 'VB-ADD'
            {
            match("VB-ADD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:57:7: ( 'VB-CHARGE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:57:9: 'VB-CHARGE'
            {
            match("VB-CHARGE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:58:7: ( 'VB-CONTAIN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:58:9: 'VB-CONTAIN'
            {
            match("VB-CONTAIN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:59:7: ( 'VB-DROP' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:59:9: 'VB-DROP'
            {
            match("VB-DROP"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:60:7: ( 'VB-FILL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:60:9: 'VB-FILL'
            {
            match("VB-FILL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:61:7: ( 'VB-SUSPEND' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:61:9: 'VB-SUSPEND'
            {
            match("VB-SUSPEND"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:62:7: ( 'VB-TREAT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:62:9: 'VB-TREAT'
            {
            match("VB-TREAT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:63:7: ( 'VB-APPARATUS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:63:9: 'VB-APPARATUS'
            {
            match("VB-APPARATUS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:64:7: ( 'NN-APPARATUS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:64:9: 'NN-APPARATUS'
            {
            match("NN-APPARATUS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:65:7: ( 'VB-CONCENTRATE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:65:9: 'VB-CONCENTRATE'
            {
            match("VB-CONCENTRATE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:66:7: ( 'NN-CONCENTRATE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:66:9: 'NN-CONCENTRATE'
            {
            match("NN-CONCENTRATE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:67:7: ( 'VB-COOL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:67:9: 'VB-COOL'
            {
            match("VB-COOL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:68:7: ( 'VB-DEGASS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:68:9: 'VB-DEGASS'
            {
            match("VB-DEGASS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:69:7: ( 'VB-DISSOLVE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:69:9: 'VB-DISSOLVE'
            {
            match("VB-DISSOLVE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:70:7: ( 'VB-DRY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:70:9: 'VB-DRY'
            {
            match("VB-DRY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:71:7: ( 'NN-DRY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:71:9: 'NN-DRY'
            {
            match("NN-DRY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:72:7: ( 'VB-EXTRACT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:72:9: 'VB-EXTRACT'
            {
            match("VB-EXTRACT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:73:7: ( 'NN-EXTRACT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:73:9: 'NN-EXTRACT'
            {
            match("NN-EXTRACT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:74:7: ( 'VB-FILTER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:74:9: 'VB-FILTER'
            {
            match("VB-FILTER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:75:7: ( 'NN-FILTER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:75:9: 'NN-FILTER'
            {
            match("NN-FILTER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:76:7: ( 'VB-HEAT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:76:9: 'VB-HEAT'
            {
            match("VB-HEAT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:77:7: ( 'VB-INCREASE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:77:9: 'VB-INCREASE'
            {
            match("VB-INCREASE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:78:7: ( 'VB-PARTITION' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:78:9: 'VB-PARTITION'
            {
            match("VB-PARTITION"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:7: ( 'VB-PRECIPITATE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:9: 'VB-PRECIPITATE'
            {
            match("VB-PRECIPITATE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:80:7: ( 'NN-PRECIPITATE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:80:9: 'NN-PRECIPITATE'
            {
            match("NN-PRECIPITATE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:81:7: ( 'VB-PURIFY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:81:9: 'VB-PURIFY'
            {
            match("VB-PURIFY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:82:7: ( 'NN-PURIFY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:82:9: 'NN-PURIFY'
            {
            match("NN-PURIFY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:83:7: ( 'VB-QUENCH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:83:9: 'VB-QUENCH'
            {
            match("VB-QUENCH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:84:7: ( 'VB-RECOVER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:84:9: 'VB-RECOVER'
            {
            match("VB-RECOVER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:85:7: ( 'VB-REMOVE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:85:9: 'VB-REMOVE'
            {
            match("VB-REMOVE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:86:7: ( 'NN-REMOVE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:86:9: 'NN-REMOVE'
            {
            match("NN-REMOVE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:87:7: ( 'VB-STIR' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:87:9: 'VB-STIR'
            {
            match("VB-STIR"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:88:7: ( 'VB-SYNTHESIZE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:88:9: 'VB-SYNTHESIZE'
            {
            match("VB-SYNTHESIZE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:89:7: ( 'NN-SYNTHESIZE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:89:9: 'NN-SYNTHESIZE'
            {
            match("NN-SYNTHESIZE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:90:7: ( 'VB-WAIT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:90:9: 'VB-WAIT'
            {
            match("VB-WAIT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:91:7: ( 'VB-WASH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:91:9: 'VB-WASH'
            {
            match("VB-WASH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:92:7: ( 'VB-YIELD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:92:9: 'VB-YIELD'
            {
            match("VB-YIELD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:93:7: ( 'COLON' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:93:9: 'COLON'
            {
            match("COLON"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:94:7: ( 'COMMA' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:94:9: 'COMMA'
            {
            match("COMMA"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:95:7: ( 'APOST' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:95:9: 'APOST'
            {
            match("APOST"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:96:7: ( 'NEG' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:96:9: 'NEG'
            {
            match("NEG"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:97:7: ( 'DASH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:97:9: 'DASH'
            {
            match("DASH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:98:7: ( 'STOP' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:98:9: 'STOP'
            {
            match("STOP"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:99:8: ( 'NN-PERCENT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:99:10: 'NN-PERCENT'
            {
            match("NN-PERCENT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:100:8: ( 'LSQB' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:100:10: 'LSQB'
            {
            match("LSQB"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:101:8: ( 'RSQB' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:101:10: 'RSQB'
            {
            match("RSQB"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:102:8: ( '-LRB-' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:102:10: '-LRB-'
            {
            match("-LRB-"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:103:8: ( '-RRB-' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:103:10: '-RRB-'
            {
            match("-RRB-"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:104:8: ( 'ABL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:104:10: 'ABL'
            {
            match("ABL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:105:8: ( 'ABN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:105:10: 'ABN'
            {
            match("ABN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:106:8: ( 'ABX' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:106:10: 'ABX'
            {
            match("ABX"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:107:8: ( 'AP' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:107:10: 'AP'
            {
            match("AP"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:108:8: ( 'AT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:108:10: 'AT'
            {
            match("AT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:109:8: ( 'BE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:109:10: 'BE'
            {
            match("BE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:110:8: ( 'BED' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:110:10: 'BED'
            {
            match("BED"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:111:8: ( 'BEDZ' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:111:10: 'BEDZ'
            {
            match("BEDZ"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:112:8: ( 'BEG' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:112:10: 'BEG'
            {
            match("BEG"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:113:8: ( 'BEM' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:113:10: 'BEM'
            {
            match("BEM"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:114:8: ( 'BEN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:114:10: 'BEN'
            {
            match("BEN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:115:8: ( 'BER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:115:10: 'BER'
            {
            match("BER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:116:8: ( 'BEZ' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:116:10: 'BEZ'
            {
            match("BEZ"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:117:8: ( 'CC' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:117:10: 'CC'
            {
            match("CC"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:118:8: ( 'CD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:118:10: 'CD'
            {
            match("CD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:119:8: ( 'CS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:119:10: 'CS'
            {
            match("CS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:120:8: ( 'DO' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:120:10: 'DO'
            {
            match("DO"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:121:8: ( 'DOD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:121:10: 'DOD'
            {
            match("DOD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:122:8: ( 'DOZ' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:122:10: 'DOZ'
            {
            match("DOZ"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:123:8: ( 'DT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:123:10: 'DT'
            {
            match("DT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:124:8: ( 'DTI' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:124:10: 'DTI'
            {
            match("DTI"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:125:8: ( 'DTS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:125:10: 'DTS'
            {
            match("DTS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:126:8: ( 'DTX' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:126:10: 'DTX'
            {
            match("DTX"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:127:8: ( 'EX' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:127:10: 'EX'
            {
            match("EX"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:128:8: ( 'FW' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:128:10: 'FW'
            {
            match("FW"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:129:8: ( 'HV' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:129:10: 'HV'
            {
            match("HV"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:130:8: ( 'HVD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:130:10: 'HVD'
            {
            match("HVD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:131:8: ( 'HVG' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:131:10: 'HVG'
            {
            match("HVG"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:132:8: ( 'HVN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:132:10: 'HVN'
            {
            match("HVN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:133:8: ( 'IN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:133:10: 'IN'
            {
            match("IN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:134:8: ( 'JJ' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:134:10: 'JJ'
            {
            match("JJ"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:135:8: ( 'JJR' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:135:10: 'JJR'
            {
            match("JJR"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:136:8: ( 'JJS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:136:10: 'JJS'
            {
            match("JJS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:137:8: ( 'JJT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:137:10: 'JJT'
            {
            match("JJT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:138:8: ( 'MD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:138:10: 'MD'
            {
            match("MD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:139:8: ( 'NC' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:139:10: 'NC'
            {
            match("NC"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:140:8: ( 'NN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:140:10: 'NN'
            {
            match("NN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:141:8: ( 'NN$' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:141:10: 'NN$'
            {
            match("NN$"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:142:8: ( 'NNS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:142:10: 'NNS'
            {
            match("NNS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:143:8: ( 'NNS$' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:143:10: 'NNS$'
            {
            match("NNS$"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:144:8: ( 'NP' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:144:10: 'NP'
            {
            match("NP"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:145:8: ( 'NP$' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:145:10: 'NP$'
            {
            match("NP$"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:146:8: ( 'NPS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:146:10: 'NPS'
            {
            match("NPS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:147:8: ( 'NPS$' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:147:10: 'NPS$'
            {
            match("NPS$"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:148:8: ( 'NR' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:148:10: 'NR'
            {
            match("NR"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:149:8: ( 'OD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:149:10: 'OD'
            {
            match("OD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:150:8: ( 'PN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:150:10: 'PN'
            {
            match("PN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:151:8: ( 'PN$' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:151:10: 'PN$'
            {
            match("PN$"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:152:8: ( 'PP$' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:152:10: 'PP$'
            {
            match("PP$"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:153:8: ( 'PP$$' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:153:10: 'PP$$'
            {
            match("PP$$"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:154:8: ( 'PPL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:154:10: 'PPL'
            {
            match("PPL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:155:8: ( 'PPLS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:155:10: 'PPLS'
            {
            match("PPLS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:156:8: ( 'PPO' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:156:10: 'PPO'
            {
            match("PPO"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:157:8: ( 'PPS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:157:10: 'PPS'
            {
            match("PPS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:158:8: ( 'PPSS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:158:10: 'PPSS'
            {
            match("PPSS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:159:8: ( 'QL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:159:10: 'QL'
            {
            match("QL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:160:8: ( 'QLP' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:160:10: 'QLP'
            {
            match("QLP"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:161:8: ( 'RB' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:161:10: 'RB'
            {
            match("RB"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:162:8: ( 'RBR' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:162:10: 'RBR'
            {
            match("RBR"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:163:8: ( 'RBT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:163:10: 'RBT'
            {
            match("RBT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:164:8: ( 'RN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:164:10: 'RN'
            {
            match("RN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:165:8: ( 'RP' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:165:10: 'RP'
            {
            match("RP"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:166:8: ( 'SYM' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:166:10: 'SYM'
            {
            match("SYM"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:167:8: ( 'TO' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:167:10: 'TO'
            {
            match("TO"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:168:8: ( 'UH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:168:10: 'UH'
            {
            match("UH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:169:8: ( 'VB' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:169:10: 'VB'
            {
            match("VB"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:170:8: ( 'VBD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:170:10: 'VBD'
            {
            match("VBD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:171:8: ( 'VBG' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:171:10: 'VBG'
            {
            match("VBG"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:172:8: ( 'VBN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:172:10: 'VBN'
            {
            match("VBN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:173:8: ( 'VBZ' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:173:10: 'VBZ'
            {
            match("VBZ"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:174:8: ( 'WDT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:174:10: 'WDT'
            {
            match("WDT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:175:8: ( 'WP$' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:175:10: 'WP$'
            {
            match("WP$"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:176:8: ( 'WPO' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:176:10: 'WPO'
            {
            match("WPO"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:177:8: ( 'WPS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:177:10: 'WPS'
            {
            match("WPS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:178:8: ( 'WQL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:178:10: 'WQL'
            {
            match("WQL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:179:8: ( 'WRB' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:179:10: 'WRB'
            {
            match("WRB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:17:4: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:17:7: ( ' ' | '\\t' )+
            {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:17:7: ( ' ' | '\\t' )+
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
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:
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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:18:9: ( ( '\\r' )? '\\n' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:18:11: ( '\\r' )? '\\n'
            {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:18:11: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:18:11: '\\r'
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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:21:16: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) )
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
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:21:18: ( 'A' .. 'Z' )
                    {
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:21:18: ( 'A' .. 'Z' )
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:21:19: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:21:31: ( 'a' .. 'z' )
                    {
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:21:31: ( 'a' .. 'z' )
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:21:32: 'a' .. 'z'
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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:24:16: ( ( '0' .. '9' ) )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:24:18: ( '0' .. '9' )
            {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:24:18: ( '0' .. '9' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:24:19: '0' .. '9'
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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:7: ( ( ACHAR | '%' | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | DIGIT )+ )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:9: ( ACHAR | '%' | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | DIGIT )+
            {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:9: ( ACHAR | '%' | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=12;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:10: ACHAR
            	    {
            	    mACHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:17: '%'
            	    {
            	    match('%'); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:21: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:25: ','
            	    {
            	    match(','); 

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:30: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:34: ')'
            	    {
            	    match(')'); 

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:38: '('
            	    {
            	    match('('); 

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:42: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 9 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:46: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 10 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:50: '='
            	    {
            	    match('='); 

            	    }
            	    break;
            	case 11 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:26:54: DIGIT
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

    public void mTokens() throws RecognitionException {
        // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | WS | NEWLINE | TOKEN )
        int alt5=174;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:214: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:220: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:226: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:232: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:238: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:244: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:250: T__50
                {
                mT__50(); 

                }
                break;
            case 42 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:256: T__51
                {
                mT__51(); 

                }
                break;
            case 43 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:262: T__52
                {
                mT__52(); 

                }
                break;
            case 44 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:268: T__53
                {
                mT__53(); 

                }
                break;
            case 45 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:274: T__54
                {
                mT__54(); 

                }
                break;
            case 46 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:280: T__55
                {
                mT__55(); 

                }
                break;
            case 47 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:286: T__56
                {
                mT__56(); 

                }
                break;
            case 48 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:292: T__57
                {
                mT__57(); 

                }
                break;
            case 49 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:298: T__58
                {
                mT__58(); 

                }
                break;
            case 50 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:304: T__59
                {
                mT__59(); 

                }
                break;
            case 51 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:310: T__60
                {
                mT__60(); 

                }
                break;
            case 52 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:316: T__61
                {
                mT__61(); 

                }
                break;
            case 53 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:322: T__62
                {
                mT__62(); 

                }
                break;
            case 54 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:328: T__63
                {
                mT__63(); 

                }
                break;
            case 55 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:334: T__64
                {
                mT__64(); 

                }
                break;
            case 56 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:340: T__65
                {
                mT__65(); 

                }
                break;
            case 57 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:346: T__66
                {
                mT__66(); 

                }
                break;
            case 58 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:352: T__67
                {
                mT__67(); 

                }
                break;
            case 59 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:358: T__68
                {
                mT__68(); 

                }
                break;
            case 60 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:364: T__69
                {
                mT__69(); 

                }
                break;
            case 61 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:370: T__70
                {
                mT__70(); 

                }
                break;
            case 62 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:376: T__71
                {
                mT__71(); 

                }
                break;
            case 63 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:382: T__72
                {
                mT__72(); 

                }
                break;
            case 64 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:388: T__73
                {
                mT__73(); 

                }
                break;
            case 65 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:394: T__74
                {
                mT__74(); 

                }
                break;
            case 66 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:400: T__75
                {
                mT__75(); 

                }
                break;
            case 67 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:406: T__76
                {
                mT__76(); 

                }
                break;
            case 68 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:412: T__77
                {
                mT__77(); 

                }
                break;
            case 69 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:418: T__78
                {
                mT__78(); 

                }
                break;
            case 70 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:424: T__79
                {
                mT__79(); 

                }
                break;
            case 71 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:430: T__80
                {
                mT__80(); 

                }
                break;
            case 72 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:436: T__81
                {
                mT__81(); 

                }
                break;
            case 73 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:442: T__82
                {
                mT__82(); 

                }
                break;
            case 74 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:448: T__83
                {
                mT__83(); 

                }
                break;
            case 75 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:454: T__84
                {
                mT__84(); 

                }
                break;
            case 76 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:460: T__85
                {
                mT__85(); 

                }
                break;
            case 77 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:466: T__86
                {
                mT__86(); 

                }
                break;
            case 78 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:472: T__87
                {
                mT__87(); 

                }
                break;
            case 79 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:478: T__88
                {
                mT__88(); 

                }
                break;
            case 80 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:484: T__89
                {
                mT__89(); 

                }
                break;
            case 81 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:490: T__90
                {
                mT__90(); 

                }
                break;
            case 82 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:496: T__91
                {
                mT__91(); 

                }
                break;
            case 83 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:502: T__92
                {
                mT__92(); 

                }
                break;
            case 84 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:508: T__93
                {
                mT__93(); 

                }
                break;
            case 85 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:514: T__94
                {
                mT__94(); 

                }
                break;
            case 86 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:520: T__95
                {
                mT__95(); 

                }
                break;
            case 87 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:526: T__96
                {
                mT__96(); 

                }
                break;
            case 88 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:532: T__97
                {
                mT__97(); 

                }
                break;
            case 89 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:538: T__98
                {
                mT__98(); 

                }
                break;
            case 90 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:544: T__99
                {
                mT__99(); 

                }
                break;
            case 91 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:550: T__100
                {
                mT__100(); 

                }
                break;
            case 92 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:557: T__101
                {
                mT__101(); 

                }
                break;
            case 93 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:564: T__102
                {
                mT__102(); 

                }
                break;
            case 94 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:571: T__103
                {
                mT__103(); 

                }
                break;
            case 95 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:578: T__104
                {
                mT__104(); 

                }
                break;
            case 96 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:585: T__105
                {
                mT__105(); 

                }
                break;
            case 97 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:592: T__106
                {
                mT__106(); 

                }
                break;
            case 98 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:599: T__107
                {
                mT__107(); 

                }
                break;
            case 99 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:606: T__108
                {
                mT__108(); 

                }
                break;
            case 100 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:613: T__109
                {
                mT__109(); 

                }
                break;
            case 101 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:620: T__110
                {
                mT__110(); 

                }
                break;
            case 102 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:627: T__111
                {
                mT__111(); 

                }
                break;
            case 103 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:634: T__112
                {
                mT__112(); 

                }
                break;
            case 104 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:641: T__113
                {
                mT__113(); 

                }
                break;
            case 105 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:648: T__114
                {
                mT__114(); 

                }
                break;
            case 106 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:655: T__115
                {
                mT__115(); 

                }
                break;
            case 107 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:662: T__116
                {
                mT__116(); 

                }
                break;
            case 108 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:669: T__117
                {
                mT__117(); 

                }
                break;
            case 109 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:676: T__118
                {
                mT__118(); 

                }
                break;
            case 110 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:683: T__119
                {
                mT__119(); 

                }
                break;
            case 111 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:690: T__120
                {
                mT__120(); 

                }
                break;
            case 112 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:697: T__121
                {
                mT__121(); 

                }
                break;
            case 113 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:704: T__122
                {
                mT__122(); 

                }
                break;
            case 114 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:711: T__123
                {
                mT__123(); 

                }
                break;
            case 115 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:718: T__124
                {
                mT__124(); 

                }
                break;
            case 116 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:725: T__125
                {
                mT__125(); 

                }
                break;
            case 117 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:732: T__126
                {
                mT__126(); 

                }
                break;
            case 118 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:739: T__127
                {
                mT__127(); 

                }
                break;
            case 119 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:746: T__128
                {
                mT__128(); 

                }
                break;
            case 120 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:753: T__129
                {
                mT__129(); 

                }
                break;
            case 121 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:760: T__130
                {
                mT__130(); 

                }
                break;
            case 122 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:767: T__131
                {
                mT__131(); 

                }
                break;
            case 123 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:774: T__132
                {
                mT__132(); 

                }
                break;
            case 124 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:781: T__133
                {
                mT__133(); 

                }
                break;
            case 125 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:788: T__134
                {
                mT__134(); 

                }
                break;
            case 126 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:795: T__135
                {
                mT__135(); 

                }
                break;
            case 127 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:802: T__136
                {
                mT__136(); 

                }
                break;
            case 128 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:809: T__137
                {
                mT__137(); 

                }
                break;
            case 129 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:816: T__138
                {
                mT__138(); 

                }
                break;
            case 130 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:823: T__139
                {
                mT__139(); 

                }
                break;
            case 131 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:830: T__140
                {
                mT__140(); 

                }
                break;
            case 132 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:837: T__141
                {
                mT__141(); 

                }
                break;
            case 133 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:844: T__142
                {
                mT__142(); 

                }
                break;
            case 134 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:851: T__143
                {
                mT__143(); 

                }
                break;
            case 135 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:858: T__144
                {
                mT__144(); 

                }
                break;
            case 136 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:865: T__145
                {
                mT__145(); 

                }
                break;
            case 137 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:872: T__146
                {
                mT__146(); 

                }
                break;
            case 138 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:879: T__147
                {
                mT__147(); 

                }
                break;
            case 139 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:886: T__148
                {
                mT__148(); 

                }
                break;
            case 140 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:893: T__149
                {
                mT__149(); 

                }
                break;
            case 141 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:900: T__150
                {
                mT__150(); 

                }
                break;
            case 142 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:907: T__151
                {
                mT__151(); 

                }
                break;
            case 143 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:914: T__152
                {
                mT__152(); 

                }
                break;
            case 144 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:921: T__153
                {
                mT__153(); 

                }
                break;
            case 145 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:928: T__154
                {
                mT__154(); 

                }
                break;
            case 146 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:935: T__155
                {
                mT__155(); 

                }
                break;
            case 147 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:942: T__156
                {
                mT__156(); 

                }
                break;
            case 148 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:949: T__157
                {
                mT__157(); 

                }
                break;
            case 149 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:956: T__158
                {
                mT__158(); 

                }
                break;
            case 150 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:963: T__159
                {
                mT__159(); 

                }
                break;
            case 151 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:970: T__160
                {
                mT__160(); 

                }
                break;
            case 152 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:977: T__161
                {
                mT__161(); 

                }
                break;
            case 153 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:984: T__162
                {
                mT__162(); 

                }
                break;
            case 154 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:991: T__163
                {
                mT__163(); 

                }
                break;
            case 155 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:998: T__164
                {
                mT__164(); 

                }
                break;
            case 156 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1005: T__165
                {
                mT__165(); 

                }
                break;
            case 157 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1012: T__166
                {
                mT__166(); 

                }
                break;
            case 158 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1019: T__167
                {
                mT__167(); 

                }
                break;
            case 159 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1026: T__168
                {
                mT__168(); 

                }
                break;
            case 160 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1033: T__169
                {
                mT__169(); 

                }
                break;
            case 161 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1040: T__170
                {
                mT__170(); 

                }
                break;
            case 162 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1047: T__171
                {
                mT__171(); 

                }
                break;
            case 163 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1054: T__172
                {
                mT__172(); 

                }
                break;
            case 164 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1061: T__173
                {
                mT__173(); 

                }
                break;
            case 165 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1068: T__174
                {
                mT__174(); 

                }
                break;
            case 166 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1075: T__175
                {
                mT__175(); 

                }
                break;
            case 167 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1082: T__176
                {
                mT__176(); 

                }
                break;
            case 168 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1089: T__177
                {
                mT__177(); 

                }
                break;
            case 169 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1096: T__178
                {
                mT__178(); 

                }
                break;
            case 170 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1103: T__179
                {
                mT__179(); 

                }
                break;
            case 171 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1110: T__180
                {
                mT__180(); 

                }
                break;
            case 172 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1117: WS
                {
                mWS(); 

                }
                break;
            case 173 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1120: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 174 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:1:1128: TOKEN
                {
                mTOKEN(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA4_eotS =
        "\1\1\14\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\1\45\14\uffff";
    static final String DFA4_maxS =
        "\1\172\14\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\2\uffff\1\10\1\7\2\uffff\1\5\1\12\1\6\1\11\12\14\3\uffff"+
            "\1\13\3\uffff\32\2\4\uffff\1\4\1\uffff\32\2",
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
            return "()+ loopback of 26:9: ( ACHAR | '%' | '_' | ',' | '.' | ')' | '(' | '/' | '-' | '=' | DIGIT )+";
        }
    }
    static final String DFA5_eotS =
        "\1\uffff\26\31\3\uffff\1\31\1\107\1\31\1\111\1\113\1\31\1\116\1"+
        "\117\1\121\1\125\1\31\1\127\1\132\1\133\1\141\1\143\1\31\1\147\1"+
        "\31\1\153\1\157\4\31\1\166\1\167\1\170\2\31\1\u0081\1\u0082\1\u0083"+
        "\1\u0087\1\u008b\1\u008c\1\u008e\1\31\1\u0094\1\u0095\5\31\1\uffff"+
        "\1\31\1\uffff\1\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\1\uffff"+
        "\1\u00b6\1\uffff\1\u00b7\2\uffff\1\u00b9\2\uffff\1\31\1\u00c9\1"+
        "\u00ca\1\u00cb\1\u00cc\1\uffff\1\31\1\uffff\1\u00ce\1\u00cf\1\u00d0"+
        "\1\uffff\1\31\1\u00d2\1\u00d3\1\uffff\1\u00d4\1\u00d5\1\u00d6\1"+
        "\uffff\1\31\1\u00d8\2\31\1\u00db\1\u00dc\3\uffff\2\31\1\u00e0\1"+
        "\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\3\uffff\1\u00e6\1\u00e7\1"+
        "\u00e8\1\uffff\1\u00e9\1\u00ea\1\u00eb\4\uffff\1\u00ed\1\u00ef\1"+
        "\u00f0\1\u00f2\1\u00f3\2\uffff\1\u00f4\1\uffff\1\u00f5\1\u00f6\1"+
        "\u00f7\1\u00f8\31\31\5\uffff\17\31\4\uffff\1\31\3\uffff\1\u013e"+
        "\5\uffff\1\u013f\1\uffff\1\u0140\1\u0141\2\uffff\2\31\1\u0144\16"+
        "\uffff\1\u0145\2\uffff\1\u0146\7\uffff\3\31\1\u014a\1\u014b\1\u014c"+
        "\2\31\1\u014f\1\u0151\2\31\1\u0155\1\u0156\21\31\1\u0168\44\31\1"+
        "\u0194\4\uffff\1\u0195\1\u0196\3\uffff\3\31\3\uffff\2\31\1\uffff"+
        "\1\31\1\uffff\1\31\1\u019f\1\u01a0\2\uffff\1\31\1\u01a2\10\31\1"+
        "\u01ab\4\31\1\u01b0\1\31\1\uffff\1\31\1\u01b3\13\31\1\u01c0\1\31"+
        "\1\u01c2\7\31\1\u01cd\2\31\1\u01d0\20\31\3\uffff\6\31\1\u01ea\1"+
        "\u01ec\2\uffff\1\u01ed\1\uffff\1\u01ee\3\31\1\u01f3\1\u01f4\1\u01f5"+
        "\1\31\1\uffff\4\31\1\uffff\2\31\1\uffff\14\31\1\uffff\1\31\1\uffff"+
        "\4\31\1\u020e\3\31\1\u0212\1\31\1\uffff\1\31\1\u0215\1\uffff\2\31"+
        "\1\u0218\3\31\1\u021c\7\31\1\u0224\1\u0225\1\31\1\u0227\1\u0228"+
        "\1\u0229\3\31\1\u022d\1\31\1\uffff\1\31\3\uffff\1\u0230\1\u0231"+
        "\1\31\1\u0233\3\uffff\14\31\1\u0240\1\u0241\12\31\1\uffff\3\31\1"+
        "\uffff\2\31\1\uffff\2\31\1\uffff\1\31\1\u0254\1\31\1\uffff\7\31"+
        "\2\uffff\1\u025d\3\uffff\1\u025e\2\31\1\uffff\1\u0261\1\31\2\uffff"+
        "\1\31\1\uffff\1\31\1\u0265\2\31\1\u0268\2\31\1\u026b\2\31\1\u026e"+
        "\1\31\2\uffff\1\u0270\2\31\1\u0273\1\31\1\u0275\1\u0276\1\u0277"+
        "\7\31\1\u027f\1\31\1\u0281\1\uffff\4\31\1\u0286\1\u0287\1\31\1\u0289"+
        "\2\uffff\1\u028a\1\u028b\1\uffff\1\u028c\1\31\1\u028e\1\uffff\1"+
        "\u028f\1\31\1\uffff\1\31\1\u0292\1\uffff\2\31\1\uffff\1\31\1\uffff"+
        "\2\31\1\uffff\1\u0298\3\uffff\1\u0299\2\31\1\u029c\1\u029d\2\31"+
        "\1\uffff\1\31\1\uffff\1\u02a1\3\31\2\uffff\1\u02a5\4\uffff\1\31"+
        "\2\uffff\2\31\1\uffff\3\31\1\u02ac\1\31\2\uffff\1\31\1\u02af\2\uffff"+
        "\2\31\1\u02b2\1\uffff\1\u02b3\2\31\1\uffff\2\31\1\u02b8\3\31\1\uffff"+
        "\2\31\1\uffff\1\31\1\u02bf\2\uffff\1\u02c0\1\31\1\u02c2\1\u02c3"+
        "\1\uffff\1\u02c4\4\31\1\u02c9\2\uffff\1\31\3\uffff\1\31\1\u02cc"+
        "\1\u02cd\1\u02ce\1\uffff\1\u02cf\1\31\4\uffff\1\31\1\u02d2\1\uffff";
    static final String DFA5_eofS =
        "\u02d3\uffff";
    static final String DFA5_minS =
        "\1\11\1\104\1\115\1\103\1\116\1\103\2\102\1\101\1\124\1\123\1\102"+
        "\1\114\1\105\1\130\1\127\1\126\1\112\1\104\1\116\1\114\1\110\1\104"+
        "\3\uffff\1\103\1\45\1\55\2\45\1\114\3\45\1\44\1\107\1\45\1\44\3"+
        "\45\1\114\1\45\1\123\2\45\1\117\1\115\2\121\3\45\2\122\6\45\2\44"+
        "\2\45\1\124\1\44\1\114\1\102\1\101\1\uffff\1\125\1\uffff\1\125\1"+
        "\uffff\1\117\1\115\2\uffff\1\101\1\uffff\1\101\1\uffff\1\44\1\uffff"+
        "\1\45\2\uffff\1\44\2\uffff\1\101\4\45\1\uffff\1\123\1\uffff\3\45"+
        "\1\uffff\1\110\2\45\1\uffff\3\45\1\uffff\1\120\1\45\2\102\2\45\3"+
        "\uffff\2\102\6\45\3\uffff\3\45\1\uffff\3\45\4\uffff\1\44\4\45\2"+
        "\uffff\1\45\1\uffff\4\45\1\122\3\116\1\101\1\106\1\105\1\116\2\111"+
        "\1\106\1\117\1\116\1\124\3\105\1\104\1\121\1\101\1\110\1\111\1\105"+
        "\1\122\1\105\5\uffff\1\123\1\110\1\124\1\104\1\105\1\111\1\122\1"+
        "\130\1\105\1\116\1\101\1\125\1\105\1\101\1\111\4\uffff\1\124\3\uffff"+
        "\1\45\5\uffff\1\45\1\uffff\2\45\2\uffff\2\55\1\45\16\uffff\1\45"+
        "\2\uffff\1\45\7\uffff\1\55\2\111\3\45\1\124\1\106\2\45\1\124\1\101"+
        "\2\45\1\105\1\122\1\117\1\104\1\101\1\116\2\115\1\101\1\116\1\114"+
        "\1\124\1\130\1\115\1\117\1\104\1\120\1\45\1\124\1\114\1\103\1\105"+
        "\1\114\1\103\1\101\1\114\1\105\2\122\1\131\1\115\1\105\1\101\1\116"+
        "\1\102\1\111\1\116\1\104\1\120\1\117\1\107\1\123\1\114\1\105\1\124"+
        "\1\101\1\103\1\122\1\105\1\122\1\105\1\103\1\111\1\105\1\45\4\uffff"+
        "\2\45\3\uffff\3\103\3\uffff\1\105\1\117\1\uffff\1\117\1\uffff\1"+
        "\110\2\45\2\uffff\1\122\1\45\1\115\1\105\2\124\1\105\1\120\1\115"+
        "\1\105\1\45\1\110\1\124\1\117\1\125\1\45\1\101\1\uffff\1\122\1\45"+
        "\1\125\1\115\1\117\1\125\1\103\1\114\1\123\1\124\1\103\1\111\1\103"+
        "\1\45\1\117\1\45\1\116\1\103\1\114\1\112\1\120\1\122\1\124\1\45"+
        "\1\101\1\120\1\45\1\101\1\123\1\114\1\101\1\122\1\124\1\122\1\124"+
        "\1\103\1\111\1\116\2\117\1\124\1\110\1\114\3\uffff\1\104\1\116\2"+
        "\117\2\122\2\45\2\uffff\1\45\1\uffff\1\45\1\122\1\105\1\110\3\45"+
        "\1\122\1\uffff\1\117\1\125\1\123\1\116\1\uffff\1\122\1\101\1\uffff"+
        "\1\125\1\105\2\115\2\105\1\110\1\105\1\123\1\111\1\106\1\105\1\uffff"+
        "\1\126\1\uffff\2\107\1\101\1\105\1\45\3\105\1\45\1\110\1\uffff\1"+
        "\122\1\45\1\uffff\1\123\1\117\1\45\1\105\1\124\1\101\1\45\1\105"+
        "\2\111\1\106\1\103\2\126\2\45\1\104\3\45\1\124\2\104\1\45\1\105"+
        "\1\uffff\1\125\3\uffff\2\45\1\105\1\45\3\uffff\1\101\1\104\1\122"+
        "\1\120\1\124\1\101\1\103\1\115\1\116\1\101\2\116\2\45\1\122\1\125"+
        "\1\120\1\131\1\116\3\105\1\111\1\116\1\uffff\1\122\1\103\1\116\1"+
        "\uffff\1\105\1\101\1\uffff\1\123\1\114\1\uffff\1\122\1\45\1\103"+
        "\1\uffff\1\101\1\124\1\120\1\131\1\110\2\105\2\uffff\1\45\3\uffff"+
        "\1\45\2\105\1\uffff\1\45\1\124\2\uffff\1\123\1\uffff\1\114\1\45"+
        "\1\105\1\110\1\45\2\124\1\45\2\124\1\45\1\124\2\uffff\1\45\1\122"+
        "\1\111\1\45\1\124\3\45\1\116\1\124\1\107\1\124\1\104\1\123\1\124"+
        "\1\45\1\126\1\45\1\uffff\1\124\1\123\2\111\2\45\1\122\1\45\2\uffff"+
        "\2\45\1\uffff\1\45\1\111\1\45\1\uffff\1\45\1\105\1\uffff\1\125\1"+
        "\45\1\uffff\1\111\1\117\1\uffff\1\122\1\uffff\1\105\1\124\1\uffff"+
        "\1\45\3\uffff\1\45\1\122\1\105\2\45\1\111\1\125\1\uffff\1\105\1"+
        "\uffff\1\45\1\105\1\117\1\124\2\uffff\1\45\4\uffff\1\132\2\uffff"+
        "\1\122\1\123\1\uffff\1\124\1\107\1\101\1\45\1\101\2\uffff\1\101"+
        "\1\45\2\uffff\1\132\1\123\1\45\1\uffff\1\45\1\116\1\101\1\uffff"+
        "\2\105\1\45\1\131\1\122\1\124\1\uffff\2\124\1\uffff\1\105\1\45\2"+
        "\uffff\1\45\1\124\2\45\1\uffff\1\45\1\101\3\105\1\45\2\uffff\1\105"+
        "\3\uffff\1\120\3\45\1\uffff\1\45\1\110\4\uffff\1\131\1\45\1\uffff";
    static final String DFA5_maxS =
        "\1\172\1\123\1\117\1\123\1\116\1\122\1\102\2\124\1\131\2\123\1"+
        "\122\1\105\1\130\1\127\1\126\1\112\1\104\1\120\1\114\1\110\1\122"+
        "\3\uffff\1\103\1\172\1\55\2\172\1\115\4\172\1\107\5\172\1\130\1"+
        "\172\1\123\2\172\1\117\1\115\2\121\3\172\2\122\7\172\1\123\2\172"+
        "\1\124\1\123\1\114\1\102\1\101\1\uffff\1\125\1\uffff\1\125\1\uffff"+
        "\1\117\1\115\2\uffff\1\127\1\uffff\1\126\1\uffff\1\172\1\uffff\1"+
        "\172\2\uffff\1\172\2\uffff\1\131\4\172\1\uffff\1\123\1\uffff\3\172"+
        "\1\uffff\1\110\2\172\1\uffff\3\172\1\uffff\1\120\1\172\2\102\2\172"+
        "\3\uffff\2\102\6\172\3\uffff\3\172\1\uffff\3\172\4\uffff\1\44\4"+
        "\172\2\uffff\1\172\1\uffff\4\172\1\122\3\116\1\101\1\123\1\131\1"+
        "\116\2\111\1\126\1\122\1\116\1\131\1\111\1\122\1\117\1\124\1\130"+
        "\1\117\1\131\1\114\1\125\1\122\1\105\5\uffff\1\123\1\117\1\131\1"+
        "\120\1\122\1\111\1\122\1\130\1\105\1\116\2\125\1\105\1\101\1\111"+
        "\4\uffff\1\124\3\uffff\1\172\5\uffff\1\172\1\uffff\2\172\2\uffff"+
        "\2\55\1\172\16\uffff\1\172\2\uffff\1\172\7\uffff\1\55\2\111\3\172"+
        "\1\124\1\106\2\172\1\124\1\101\2\172\1\105\1\122\1\117\1\104\1\101"+
        "\1\116\2\115\1\101\1\116\1\114\1\124\1\130\1\115\1\117\1\104\1\120"+
        "\1\172\1\124\1\114\1\103\1\122\1\116\1\103\1\101\1\114\1\105\2\122"+
        "\1\131\1\115\1\105\1\101\1\117\1\123\1\111\1\116\1\104\1\120\1\131"+
        "\1\107\1\123\1\114\1\105\1\124\1\101\1\103\1\122\1\105\1\122\1\105"+
        "\1\115\1\123\1\105\1\172\4\uffff\2\172\3\uffff\1\117\2\103\3\uffff"+
        "\1\105\1\117\1\uffff\1\117\1\uffff\1\110\2\172\2\uffff\1\122\1\172"+
        "\1\115\1\105\2\124\1\105\1\120\1\115\1\105\1\172\1\110\1\124\1\117"+
        "\1\125\1\172\1\101\1\uffff\1\122\1\172\1\125\1\115\1\117\1\125\1"+
        "\103\1\114\1\123\1\124\1\123\1\111\1\103\1\172\1\117\1\172\1\122"+
        "\1\124\1\114\1\115\1\120\1\122\1\124\1\172\1\101\1\120\1\172\1\101"+
        "\1\123\1\124\1\101\1\122\1\124\1\122\1\124\1\103\1\111\1\116\2\117"+
        "\1\124\1\110\1\114\3\uffff\1\115\1\116\2\117\2\122\2\172\2\uffff"+
        "\1\172\1\uffff\1\172\1\122\1\105\1\110\3\172\1\122\1\uffff\1\117"+
        "\1\125\1\123\1\116\1\uffff\1\122\1\101\1\uffff\1\125\1\105\2\115"+
        "\2\105\1\110\1\105\1\123\1\111\1\106\1\105\1\uffff\1\126\1\uffff"+
        "\2\107\1\101\1\105\1\172\3\105\1\172\1\110\1\uffff\1\122\1\172\1"+
        "\uffff\1\123\1\117\1\172\1\105\1\124\1\101\1\172\1\105\2\111\1\106"+
        "\1\103\2\126\2\172\1\104\3\172\1\124\2\104\1\172\1\105\1\uffff\1"+
        "\125\3\uffff\2\172\1\105\1\172\3\uffff\1\101\1\104\1\122\1\120\1"+
        "\124\1\101\1\103\1\115\1\116\1\101\2\116\2\172\1\122\1\125\1\120"+
        "\1\131\1\116\3\105\1\111\1\116\1\uffff\1\122\1\103\1\116\1\uffff"+
        "\1\105\1\101\1\uffff\1\123\1\114\1\uffff\1\122\1\172\1\103\1\uffff"+
        "\1\101\1\124\1\120\1\131\1\110\2\105\2\uffff\1\172\3\uffff\1\172"+
        "\2\105\1\uffff\1\172\1\124\2\uffff\1\123\1\uffff\1\114\1\172\1\105"+
        "\1\110\1\172\2\124\1\172\2\124\1\172\1\124\2\uffff\1\172\1\122\1"+
        "\111\1\172\1\124\3\172\1\116\1\124\1\107\1\124\1\104\1\123\1\124"+
        "\1\172\1\126\1\172\1\uffff\1\124\1\123\2\111\2\172\1\122\1\172\2"+
        "\uffff\2\172\1\uffff\1\172\1\111\1\172\1\uffff\1\172\1\105\1\uffff"+
        "\1\125\1\172\1\uffff\1\111\1\117\1\uffff\1\122\1\uffff\1\105\1\124"+
        "\1\uffff\1\172\3\uffff\1\172\1\122\1\105\2\172\1\111\1\125\1\uffff"+
        "\1\105\1\uffff\1\172\1\105\1\117\1\124\2\uffff\1\172\4\uffff\1\132"+
        "\2\uffff\1\122\1\123\1\uffff\1\124\1\107\1\101\1\172\1\101\2\uffff"+
        "\1\101\1\172\2\uffff\1\132\1\123\1\172\1\uffff\1\172\1\116\1\101"+
        "\1\uffff\2\105\1\172\1\131\1\122\1\124\1\uffff\2\124\1\uffff\1\105"+
        "\1\172\2\uffff\1\172\1\124\2\172\1\uffff\1\172\1\101\3\105\1\172"+
        "\2\uffff\1\105\3\uffff\1\120\3\172\1\uffff\1\172\1\110\4\uffff\1"+
        "\131\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\27\uffff\1\u00ac\1\u00ad\1\u00ae\55\uffff\1\u008d\1\uffff\1\u009f"+
        "\1\uffff\1\156\2\uffff\1\155\1\157\1\uffff\1\175\1\uffff\1\u0085"+
        "\1\uffff\1\u0084\1\uffff\1\u0083\1\u0089\1\uffff\1\u0088\1\u008c"+
        "\5\uffff\1\u00a1\1\uffff\1\143\3\uffff\1\144\3\uffff\1\160\3\uffff"+
        "\1\163\6\uffff\1\u0099\1\u009c\1\u009d\10\uffff\1\145\1\167\1\170"+
        "\3\uffff\1\171\3\uffff\1\176\1\u0082\1\u008f\1\u008e\5\uffff\1\u0097"+
        "\1\u00a0\1\uffff\1\u00a7\35\uffff\1\u0087\1\u0086\1\130\1\u008b"+
        "\1\u008a\17\uffff\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\uffff\1\140"+
        "\1\141\1\142\1\uffff\1\161\1\162\1\164\1\165\1\166\1\uffff\1\u009e"+
        "\2\uffff\1\u009a\1\u009b\3\uffff\1\146\1\150\1\151\1\152\1\153\1"+
        "\154\1\172\1\173\1\174\1\177\1\u0080\1\u0081\1\u0091\1\u0090\1\uffff"+
        "\1\u0092\1\u0094\1\uffff\1\u0095\1\u0098\1\u00a6\1\u00a8\1\u00a9"+
        "\1\u00aa\1\u00ab\105\uffff\1\131\1\132\1\134\1\135\2\uffff\1\147"+
        "\1\u0093\1\u0096\3\uffff\1\125\1\126\1\6\2\uffff\1\15\1\uffff\1"+
        "\11\3\uffff\1\17\1\20\21\uffff\1\33\53\uffff\1\127\1\136\1\137\10"+
        "\uffff\1\16\1\25\1\uffff\1\21\10\uffff\1\31\4\uffff\1\56\2\uffff"+
        "\1\34\14\uffff\1\77\1\uffff\1\52\12\uffff\1\60\2\uffff\1\76\31\uffff"+
        "\1\12\1\uffff\1\13\1\24\1\22\4\uffff\1\27\1\36\1\30\30\uffff\1\73"+
        "\3\uffff\1\117\2\uffff\1\63\2\uffff\1\64\3\uffff\1\104\7\uffff\1"+
        "\122\1\123\1\uffff\1\1\1\2\1\51\3\uffff\1\10\2\uffff\1\23\1\26\1"+
        "\uffff\1\50\14\uffff\1\47\1\37\22\uffff\1\66\10\uffff\1\124\1\3"+
        "\2\uffff\1\7\3\uffff\1\41\2\uffff\1\42\2\uffff\1\46\2\uffff\1\44"+
        "\1\uffff\1\103\2\uffff\1\112\1\uffff\1\116\1\53\1\61\7\uffff\1\74"+
        "\1\uffff\1\102\4\uffff\1\111\1\113\1\uffff\1\115\1\4\1\5\1\14\1"+
        "\uffff\1\40\1\57\2\uffff\1\101\5\uffff\1\133\1\62\2\uffff\1\55\1"+
        "\65\3\uffff\1\100\3\uffff\1\114\6\uffff\1\43\2\uffff\1\54\2\uffff"+
        "\1\75\1\105\4\uffff\1\70\6\uffff\1\67\1\106\1\uffff\1\121\1\32\1"+
        "\35\4\uffff\1\120\2\uffff\1\72\1\110\1\71\1\107\2\uffff\1\45";
    static final String DFA5_specialS =
        "\u02d3\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\27\1\30\2\uffff\1\30\22\uffff\1\27\4\uffff\1\31\2\uffff"+
            "\2\31\2\uffff\1\31\1\14\14\31\3\uffff\1\31\3\uffff\1\7\1\15"+
            "\1\3\1\10\1\16\1\17\1\31\1\20\1\4\1\21\1\31\1\12\1\22\1\5\1"+
            "\1\1\23\1\24\1\13\1\11\1\2\1\25\1\6\1\26\3\31\4\uffff\1\31\1"+
            "\uffff\32\31",
            "\1\33\16\uffff\1\32",
            "\1\34\1\uffff\1\35",
            "\1\40\1\36\12\uffff\1\37\3\uffff\1\41",
            "\1\42",
            "\1\45\1\uffff\1\44\10\uffff\1\43\1\uffff\1\46\1\uffff\1\47",
            "\1\50",
            "\1\52\15\uffff\1\51\3\uffff\1\53",
            "\1\54\15\uffff\1\55\4\uffff\1\56",
            "\1\57\4\uffff\1\60",
            "\1\61",
            "\1\63\13\uffff\1\64\1\uffff\1\65\2\uffff\1\62",
            "\1\66\5\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\1\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102\13\uffff\1\103\1\104\1\105",
            "",
            "",
            "",
            "\1\106",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\110",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\1\31\1\112\14\31\3\uffff\1\31\3"+
            "\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\114\1\115",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\1\31\1\120\14\31\3\uffff\1\31\3"+
            "\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\123\1\31\2\uffff\2\31\2\uffff\1\31\1\122\14\31\3\uffff"+
            "\1\31\3\uffff\22\31\1\124\7\31\4\uffff\1\31\1\uffff\32\31",
            "\1\126",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\130\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff"+
            "\22\31\1\131\7\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\1\31\1\134\14\31\3\uffff\1\31\3"+
            "\uffff\3\31\1\135\2\31\1\136\6\31\1\137\13\31\1\140\4\uffff"+
            "\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\16\31"+
            "\1\142\13\31\4\uffff\1\31\1\uffff\32\31",
            "\1\144\1\uffff\1\145\11\uffff\1\146",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\150",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\3\31"+
            "\1\151\25\31\1\152\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\10\31"+
            "\1\154\11\31\1\155\4\31\1\156\2\31\4\uffff\1\31\1\uffff\32\31",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\21\31"+
            "\1\164\1\31\1\165\6\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\171",
            "\1\172",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\3\31"+
            "\1\173\2\31\1\174\5\31\1\175\1\176\3\31\1\177\7\31\1\u0080\4"+
            "\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\3\31"+
            "\1\u0084\2\31\1\u0085\6\31\1\u0086\14\31\4\uffff\1\31\1\uffff"+
            "\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\21\31"+
            "\1\u0088\1\u0089\1\u008a\6\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u008d\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff"+
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u008f\47\uffff\1\u0090\2\uffff\1\u0091\3\uffff\1\u0092",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\17\31"+
            "\1\u0093\12\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0096",
            "\1\u0097\52\uffff\1\u0098\3\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "",
            "",
            "\1\u00a1\1\u00a2\3\uffff\1\u00a7\2\uffff\1\u00a3\5\uffff\1"+
            "\u00a6\5\uffff\1\u00a8\1\u00a5\1\u00a4",
            "",
            "\1\u00ad\1\uffff\1\u00b0\1\u00b3\1\u00ae\1\u00b1\1\u00ab\5"+
            "\uffff\1\u00ac\2\uffff\1\u00b2\1\uffff\1\u00b4\1\u00a9\1\u00aa"+
            "\1\uffff\1\u00af",
            "",
            "\1\u00b5\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff"+
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\u00b8\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff"+
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\u00bd\1\uffff\1\u00bb\1\u00be\1\u00c1\1\u00bf\1\uffff\1"+
            "\u00c2\1\u00c3\6\uffff\1\u00c4\1\u00c5\1\u00c6\1\u00bc\1\u00c0"+
            "\1\u00ba\1\uffff\1\u00c7\1\uffff\1\u00c8",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u00cd",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u00d1",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u00d7",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u00d9",
            "\1\u00da",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\31\31"+
            "\1\u00df\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "\1\u00ec",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\22\31"+
            "\1\u00ee\7\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\22\31"+
            "\1\u00f1\7\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00ff\14\uffff\1\u00fe",
            "\1\u0100\23\uffff\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105\7\uffff\1\u0106\7\uffff\1\u0107",
            "\1\u0108\2\uffff\1\u0109",
            "\1\u010a",
            "\1\u010b\4\uffff\1\u010c",
            "\1\u010e\3\uffff\1\u010d",
            "\1\u0110\14\uffff\1\u010f",
            "\1\u0112\3\uffff\1\u0113\5\uffff\1\u0111",
            "\1\u0116\10\uffff\1\u0115\2\uffff\1\u0117\3\uffff\1\u0114",
            "\1\u0118\6\uffff\1\u0119",
            "\1\u011b\15\uffff\1\u011a",
            "\1\u011c\6\uffff\1\u011d\11\uffff\1\u011e",
            "\1\u0120\2\uffff\1\u011f",
            "\1\u0123\14\uffff\1\u0121\2\uffff\1\u0122",
            "\1\u0124",
            "\1\u0125",
            "",
            "",
            "",
            "",
            "",
            "\1\u0126",
            "\1\u0127\6\uffff\1\u0128",
            "\1\u012a\1\u0129\3\uffff\1\u012b",
            "\1\u012c\13\uffff\1\u012d",
            "\1\u012f\3\uffff\1\u0130\10\uffff\1\u012e",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136\20\uffff\1\u0137\2\uffff\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "",
            "",
            "",
            "",
            "\1\u013d",
            "",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\u0142",
            "\1\u0143",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
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
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u014d",
            "\1\u014e",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\23\31"+
            "\1\u0150\6\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0152",
            "\1\u0153",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\5\31"+
            "\1\u0154\24\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c\14\uffff\1\u016d",
            "\1\u016e\1\uffff\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a\1\u017b",
            "\1\u017c\20\uffff\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182\11\uffff\1\u0183",
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
            "\1\u018e",
            "\1\u018f\11\uffff\1\u0190",
            "\1\u0191\11\uffff\1\u0192",
            "\1\u0193",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\u0197\13\uffff\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "",
            "",
            "",
            "\1\u019b",
            "\1\u019c",
            "",
            "\1\u019d",
            "",
            "\1\u019e",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\u01a1",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u01b1",
            "",
            "\1\u01b2",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bd\17\uffff\1\u01bc",
            "\1\u01be",
            "\1\u01bf",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u01c1",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u01c3\3\uffff\1\u01c4",
            "\1\u01c6\20\uffff\1\u01c5",
            "\1\u01c7",
            "\1\u01c9\2\uffff\1\u01c8",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u01ce",
            "\1\u01cf",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3\7\uffff\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "",
            "",
            "",
            "\1\u01e2\5\uffff\1\u01e3\2\uffff\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\16\31"+
            "\1\u01eb\13\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\22\31"+
            "\1\u01f2\7\31\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u01f6",
            "",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "",
            "\1\u01fb",
            "\1\u01fc",
            "",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "",
            "\1\u0209",
            "",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0213",
            "",
            "\1\u0214",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u0216",
            "\1\u0217",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0226",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u022e",
            "",
            "\1\u022f",
            "",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0232",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\u0234",
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
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "",
            "\1\u024f",
            "\1\u0250",
            "",
            "\1\u0251",
            "\1\u0252",
            "",
            "\1\u0253",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0255",
            "",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u025f",
            "\1\u0260",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0262",
            "",
            "",
            "\1\u0263",
            "",
            "\1\u0264",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0266",
            "\1\u0267",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0269",
            "\1\u026a",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u026c",
            "\1\u026d",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u026f",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0271",
            "\1\u0272",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0274",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0280",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0288",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u028d",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u0290",
            "",
            "\1\u0291",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u0293",
            "\1\u0294",
            "",
            "\1\u0295",
            "",
            "\1\u0296",
            "\1\u0297",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u029a",
            "\1\u029b",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u029e",
            "\1\u029f",
            "",
            "\1\u02a0",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "\1\u02a6",
            "",
            "",
            "\1\u02a7",
            "\1\u02a8",
            "",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u02ad",
            "",
            "",
            "\1\u02ae",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\u02b0",
            "\1\u02b1",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u02b4",
            "\1\u02b5",
            "",
            "\1\u02b6",
            "\1\u02b7",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "",
            "\1\u02bc",
            "\1\u02bd",
            "",
            "\1\u02be",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u02c1",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\u02ca",
            "",
            "",
            "",
            "\1\u02cb",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "\1\u02d0",
            "",
            "",
            "",
            "",
            "\1\u02d1",
            "\1\31\2\uffff\2\31\2\uffff\16\31\3\uffff\1\31\3\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
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
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | WS | NEWLINE | TOKEN );";
        }
    }
 

}