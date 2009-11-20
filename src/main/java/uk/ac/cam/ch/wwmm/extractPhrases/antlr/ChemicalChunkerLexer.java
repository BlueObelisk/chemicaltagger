// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g 2009-11-20 17:40:54
package uk.ac.cam.ch.wwmm.extractPhrases.antlr;

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
    public static final int T__9=9;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int TOKEN=8;
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
    public static final int WS=4;
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
    public static final int DIGIT=7;
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
    public static final int T__34=34;
    public static final int ACHAR=6;
    public static final int T__35=35;
    public static final int NEWLINE=5;
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
    public String getGrammarFileName() { return "/home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:9:6: ( 'CD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:9:8: 'CD'
            {
            match("CD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:10:7: ( 'CJ' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:10:9: 'CJ'
            {
            match("CJ"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:11:7: ( 'TM-UNICODE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:11:9: 'TM-UNICODE'
            {
            match("TM-UNICODE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:12:7: ( 'CD-UNICODE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:12:9: 'CD-UNICODE'
            {
            match("CD-UNICODE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:13:7: ( 'IN-AS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:13:9: 'IN-AS'
            {
            match("IN-AS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:14:7: ( 'IN-BEFORE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:14:9: 'IN-BEFORE'
            {
            match("IN-BEFORE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:15:7: ( 'IN-AFTER' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:15:9: 'IN-AFTER'
            {
            match("IN-AFTER"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:16:7: ( 'IN-IN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:16:9: 'IN-IN'
            {
            match("IN-IN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:17:7: ( 'IN-INTO' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:17:9: 'IN-INTO'
            {
            match("IN-INTO"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:18:7: ( 'IN-WITH' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:18:9: 'IN-WITH'
            {
            match("IN-WITH"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:19:7: ( 'IN-WITHOUT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:19:9: 'IN-WITHOUT'
            {
            match("IN-WITHOUT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:20:7: ( 'IN-BY' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:20:9: 'IN-BY'
            {
            match("IN-BY"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:7: ( 'IN-VIA' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:9: 'IN-VIA'
            {
            match("IN-VIA"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:22:7: ( 'IN-OF' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:22:9: 'IN-OF'
            {
            match("IN-OF"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:23:7: ( 'IN-ON' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:23:9: 'IN-ON'
            {
            match("IN-ON"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:24:7: ( 'IN-FOR' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:24:9: 'IN-FOR'
            {
            match("IN-FOR"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:25:7: ( 'IN-FROM' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:25:9: 'IN-FROM'
            {
            match("IN-FROM"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:26:7: ( 'IN-UNDER' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:26:9: 'IN-UNDER'
            {
            match("IN-UNDER"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:27:7: ( 'IN-OVER' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:27:9: 'IN-OVER'
            {
            match("IN-OVER"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:28:7: ( 'IN-OFF' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:28:9: 'IN-OFF'
            {
            match("IN-OFF"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:29:7: ( 'NN-STATE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:29:9: 'NN-STATE'
            {
            match("NN-STATE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:30:7: ( 'NN-TIME' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:30:9: 'NN-TIME'
            {
            match("NN-TIME"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:31:7: ( 'NN-GRAM' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:31:9: 'NN-GRAM'
            {
            match("NN-GRAM"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:32:7: ( 'NN-MOL' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:32:9: 'NN-MOL'
            {
            match("NN-MOL"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:33:7: ( 'NN-ATMOSPHERE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:33:9: 'NN-ATMOSPHERE'
            {
            match("NN-ATMOSPHERE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:34:7: ( 'NN-EQ' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:34:9: 'NN-EQ'
            {
            match("NN-EQ"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:35:7: ( 'NN-VOL' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:35:9: 'NN-VOL'
            {
            match("NN-VOL"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:36:7: ( 'NN-CHEMENTITY' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:36:9: 'NN-CHEMENTITY'
            {
            match("NN-CHEMENTITY"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:37:7: ( 'NN-TEMP' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:37:9: 'NN-TEMP'
            {
            match("NN-TEMP"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:38:7: ( 'NN-FLASH' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:38:9: 'NN-FLASH'
            {
            match("NN-FLASH"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:39:7: ( 'NN-GENERAL' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:39:9: 'NN-GENERAL'
            {
            match("NN-GENERAL"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:40:7: ( 'NN-METHOD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:40:9: 'NN-METHOD'
            {
            match("NN-METHOD"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:41:7: ( 'NN-AMOUNT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:41:9: 'NN-AMOUNT'
            {
            match("NN-AMOUNT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:42:7: ( 'NN-PRESSURE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:42:9: 'NN-PRESSURE'
            {
            match("NN-PRESSURE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:43:7: ( 'NN-COLUMN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:43:9: 'NN-COLUMN'
            {
            match("NN-COLUMN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:44:7: ( 'NN-CHROMATOGRAPHY' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:44:9: 'NN-CHROMATOGRAPHY'
            {
            match("NN-CHROMATOGRAPHY"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:45:7: ( 'NN-VACUUM' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:45:9: 'NN-VACUUM'
            {
            match("NN-VACUUM"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:46:7: ( 'NN-CYCLE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:46:9: 'NN-CYCLE'
            {
            match("NN-CYCLE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:47:7: ( 'NN-TIMES' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:47:9: 'NN-TIMES'
            {
            match("NN-TIMES"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:48:7: ( 'CM' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:48:9: 'CM'
            {
            match("CM"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:49:7: ( 'VB-USE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:49:9: 'VB-USE'
            {
            match("VB-USE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:50:7: ( 'VB-CHANGE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:50:9: 'VB-CHANGE'
            {
            match("VB-CHANGE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:51:7: ( 'VB-SUBMERGE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:51:9: 'VB-SUBMERGE'
            {
            match("VB-SUBMERGE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:52:7: ( 'VB-SUBJECT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:52:9: 'VB-SUBJECT'
            {
            match("VB-SUBJECT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:53:7: ( 'NN-ADD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:53:9: 'NN-ADD'
            {
            match("NN-ADD"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:54:7: ( 'NN-MIXTURE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:54:9: 'NN-MIXTURE'
            {
            match("NN-MIXTURE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:55:7: ( 'VB-ADD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:55:9: 'VB-ADD'
            {
            match("VB-ADD"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:56:7: ( 'VB-CHARGE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:56:9: 'VB-CHARGE'
            {
            match("VB-CHARGE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:57:7: ( 'VB-CONTAIN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:57:9: 'VB-CONTAIN'
            {
            match("VB-CONTAIN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:58:7: ( 'VB-DROP' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:58:9: 'VB-DROP'
            {
            match("VB-DROP"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:59:7: ( 'VB-FILL' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:59:9: 'VB-FILL'
            {
            match("VB-FILL"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:60:7: ( 'VB-SUSPEND' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:60:9: 'VB-SUSPEND'
            {
            match("VB-SUSPEND"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:61:7: ( 'VB-TREAT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:61:9: 'VB-TREAT'
            {
            match("VB-TREAT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:62:7: ( 'VB-APPARATUS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:62:9: 'VB-APPARATUS'
            {
            match("VB-APPARATUS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:63:7: ( 'NN-APPARATUS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:63:9: 'NN-APPARATUS'
            {
            match("NN-APPARATUS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:64:7: ( 'VB-CONCENTRATE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:64:9: 'VB-CONCENTRATE'
            {
            match("VB-CONCENTRATE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:65:7: ( 'NN-CONCENTRATE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:65:9: 'NN-CONCENTRATE'
            {
            match("NN-CONCENTRATE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:66:7: ( 'VB-COOL' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:66:9: 'VB-COOL'
            {
            match("VB-COOL"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:67:7: ( 'VB-DEGASS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:67:9: 'VB-DEGASS'
            {
            match("VB-DEGASS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:68:7: ( 'VB-DISSOLVE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:68:9: 'VB-DISSOLVE'
            {
            match("VB-DISSOLVE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:69:7: ( 'VB-DRY' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:69:9: 'VB-DRY'
            {
            match("VB-DRY"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:70:7: ( 'NN-DRY' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:70:9: 'NN-DRY'
            {
            match("NN-DRY"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:71:7: ( 'VB-EXTRACT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:71:9: 'VB-EXTRACT'
            {
            match("VB-EXTRACT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:72:7: ( 'NN-EXTRACT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:72:9: 'NN-EXTRACT'
            {
            match("NN-EXTRACT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:73:7: ( 'VB-FILTER' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:73:9: 'VB-FILTER'
            {
            match("VB-FILTER"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:74:7: ( 'NN-FILTER' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:74:9: 'NN-FILTER'
            {
            match("NN-FILTER"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:75:7: ( 'VB-HEAT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:75:9: 'VB-HEAT'
            {
            match("VB-HEAT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:76:7: ( 'VB-INCREASE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:76:9: 'VB-INCREASE'
            {
            match("VB-INCREASE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:77:7: ( 'VB-PARTITION' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:77:9: 'VB-PARTITION'
            {
            match("VB-PARTITION"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:78:7: ( 'VB-PRECIPITATE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:78:9: 'VB-PRECIPITATE'
            {
            match("VB-PRECIPITATE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:79:7: ( 'NN-PRECIPITATE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:79:9: 'NN-PRECIPITATE'
            {
            match("NN-PRECIPITATE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:80:7: ( 'VB-PURIFY' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:80:9: 'VB-PURIFY'
            {
            match("VB-PURIFY"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:81:7: ( 'NN-PURIFY' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:81:9: 'NN-PURIFY'
            {
            match("NN-PURIFY"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:82:7: ( 'VB-QUENCH' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:82:9: 'VB-QUENCH'
            {
            match("VB-QUENCH"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:83:7: ( 'VB-RECOVER' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:83:9: 'VB-RECOVER'
            {
            match("VB-RECOVER"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:84:7: ( 'VB-REMOVE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:84:9: 'VB-REMOVE'
            {
            match("VB-REMOVE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:85:7: ( 'NN-REMOVE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:85:9: 'NN-REMOVE'
            {
            match("NN-REMOVE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:86:7: ( 'VB-STIR' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:86:9: 'VB-STIR'
            {
            match("VB-STIR"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:87:7: ( 'VB-SYNTHESIZE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:87:9: 'VB-SYNTHESIZE'
            {
            match("VB-SYNTHESIZE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:88:7: ( 'NN-SYNTHESIZE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:88:9: 'NN-SYNTHESIZE'
            {
            match("NN-SYNTHESIZE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:89:7: ( 'VB-WAIT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:89:9: 'VB-WAIT'
            {
            match("VB-WAIT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:90:7: ( 'VB-WASH' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:90:9: 'VB-WASH'
            {
            match("VB-WASH"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:91:7: ( 'VB-YIELD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:91:9: 'VB-YIELD'
            {
            match("VB-YIELD"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:92:7: ( 'COLON' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:92:9: 'COLON'
            {
            match("COLON"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:93:7: ( 'COMMA' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:93:9: 'COMMA'
            {
            match("COMMA"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:94:7: ( 'APOST' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:94:9: 'APOST'
            {
            match("APOST"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:95:7: ( 'NEG' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:95:9: 'NEG'
            {
            match("NEG"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:96:7: ( 'DASH' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:96:9: 'DASH'
            {
            match("DASH"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:97:7: ( 'STOP' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:97:9: 'STOP'
            {
            match("STOP"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:98:7: ( 'NN-PERCENT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:98:9: 'NN-PERCENT'
            {
            match("NN-PERCENT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:99:7: ( 'LSQB' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:99:9: 'LSQB'
            {
            match("LSQB"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:100:8: ( 'RSQB' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:100:10: 'RSQB'
            {
            match("RSQB"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:101:8: ( 'LRB' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:101:10: 'LRB'
            {
            match("LRB"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:102:8: ( 'RRB' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:102:10: 'RRB'
            {
            match("RRB"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:103:8: ( 'ABL' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:103:10: 'ABL'
            {
            match("ABL"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:104:8: ( 'ABN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:104:10: 'ABN'
            {
            match("ABN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:105:8: ( 'ABX' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:105:10: 'ABX'
            {
            match("ABX"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:106:8: ( 'AP' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:106:10: 'AP'
            {
            match("AP"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:107:8: ( 'AT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:107:10: 'AT'
            {
            match("AT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:108:8: ( 'BE' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:108:10: 'BE'
            {
            match("BE"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:109:8: ( 'BED' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:109:10: 'BED'
            {
            match("BED"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:110:8: ( 'BEDZ' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:110:10: 'BEDZ'
            {
            match("BEDZ"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:111:8: ( 'BEG' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:111:10: 'BEG'
            {
            match("BEG"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:112:8: ( 'BEM' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:112:10: 'BEM'
            {
            match("BEM"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:113:8: ( 'BEN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:113:10: 'BEN'
            {
            match("BEN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:114:8: ( 'BER' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:114:10: 'BER'
            {
            match("BER"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:115:8: ( 'BEZ' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:115:10: 'BEZ'
            {
            match("BEZ"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:116:8: ( 'CC' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:116:10: 'CC'
            {
            match("CC"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:117:8: ( 'DT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:117:10: 'DT'
            {
            match("DT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:118:8: ( 'IN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:118:10: 'IN'
            {
            match("IN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:119:8: ( 'DTI' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:119:10: 'DTI'
            {
            match("DTI"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:120:8: ( 'DTS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:120:10: 'DTS'
            {
            match("DTS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:121:8: ( 'DTX' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:121:10: 'DTX'
            {
            match("DTX"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:122:8: ( 'EX' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:122:10: 'EX'
            {
            match("EX"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:123:8: ( 'FW' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:123:10: 'FW'
            {
            match("FW"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:124:8: ( 'HV' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:124:10: 'HV'
            {
            match("HV"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:125:8: ( 'HVD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:125:10: 'HVD'
            {
            match("HVD"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:126:8: ( 'HVG' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:126:10: 'HVG'
            {
            match("HVG"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:127:8: ( 'HVN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:127:10: 'HVN'
            {
            match("HVN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:128:8: ( 'JJR' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:128:10: 'JJR'
            {
            match("JJR"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:129:8: ( 'JJS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:129:10: 'JJS'
            {
            match("JJS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:130:8: ( 'JJT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:130:10: 'JJT'
            {
            match("JJT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:131:8: ( 'MD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:131:10: 'MD'
            {
            match("MD"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:132:8: ( 'NC' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:132:10: 'NC'
            {
            match("NC"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:133:8: ( 'WP$' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:133:10: 'WP$'
            {
            match("WP$"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:134:8: ( 'WPO' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:134:10: 'WPO'
            {
            match("WPO"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:135:8: ( 'WPS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:135:10: 'WPS'
            {
            match("WPS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:136:8: ( 'WQL' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:136:10: 'WQL'
            {
            match("WQL"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:137:8: ( 'WRB' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:137:10: 'WRB'
            {
            match("WRB"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:138:8: ( 'UH' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:138:10: 'UH'
            {
            match("UH"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:139:8: ( 'VB' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:139:10: 'VB'
            {
            match("VB"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:140:8: ( 'VBG' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:140:10: 'VBG'
            {
            match("VBG"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:141:8: ( 'VBN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:141:10: 'VBN'
            {
            match("VBN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:142:8: ( 'VBZ' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:142:10: 'VBZ'
            {
            match("VBZ"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:143:8: ( 'WDT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:143:10: 'WDT'
            {
            match("WDT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:144:8: ( 'RBR' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:144:10: 'RBR'
            {
            match("RBR"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:145:8: ( 'RBT' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:145:10: 'RBT'
            {
            match("RBT"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:146:8: ( 'RN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:146:10: 'RN'
            {
            match("RN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:147:8: ( 'RP' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:147:10: 'RP'
            {
            match("RP"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:148:8: ( 'PN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:148:10: 'PN'
            {
            match("PN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:149:8: ( 'PN$' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:149:10: 'PN$'
            {
            match("PN$"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:150:8: ( 'PP$' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:150:10: 'PP$'
            {
            match("PP$"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:151:8: ( 'PP$$' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:151:10: 'PP$$'
            {
            match("PP$$"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:152:8: ( 'PPL' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:152:10: 'PPL'
            {
            match("PPL"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:153:8: ( 'PPLS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:153:10: 'PPLS'
            {
            match("PPLS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:154:8: ( 'PPO' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:154:10: 'PPO'
            {
            match("PPO"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:155:8: ( 'PPS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:155:10: 'PPS'
            {
            match("PPS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:156:8: ( 'PPSS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:156:10: 'PPSS'
            {
            match("PPSS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:157:8: ( 'QL' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:157:10: 'QL'
            {
            match("QL"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:158:8: ( 'QLP' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:158:10: 'QLP'
            {
            match("QLP"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:159:8: ( 'NN$' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:159:10: 'NN$'
            {
            match("NN$"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:160:8: ( 'NNS$' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:160:10: 'NNS$'
            {
            match("NNS$"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:161:8: ( 'NP' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:161:10: 'NP'
            {
            match("NP"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:162:8: ( 'NP$' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:162:10: 'NP$'
            {
            match("NP$"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:163:8: ( 'NPS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:163:10: 'NPS'
            {
            match("NPS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:164:8: ( 'NPS$' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:164:10: 'NPS$'
            {
            match("NPS$"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:165:8: ( 'NR' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:165:10: 'NR'
            {
            match("NR"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:166:8: ( 'OD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:166:10: 'OD'
            {
            match("OD"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:167:8: ( 'CS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:167:10: 'CS'
            {
            match("CS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:168:8: ( 'DO' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:168:10: 'DO'
            {
            match("DO"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:169:8: ( 'DOD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:169:10: 'DOD'
            {
            match("DOD"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:170:8: ( 'DOZ' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:170:10: 'DOZ'
            {
            match("DOZ"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:171:8: ( 'JJ' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:171:10: 'JJ'
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:172:8: ( 'NN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:172:10: 'NN'
            {
            match("NN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:173:8: ( 'NNS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:173:10: 'NNS'
            {
            match("NNS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:174:8: ( 'RB' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:174:10: 'RB'
            {
            match("RB"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:175:8: ( 'TO' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:175:10: 'TO'
            {
            match("TO"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:176:8: ( 'VBD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:176:10: 'VBD'
            {
            match("VBD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:12:4: ( ( ' ' | '\\t' )+ )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:12:7: ( ' ' | '\\t' )+
            {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:12:7: ( ' ' | '\\t' )+
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
            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:13:9: ( ( '\\r' )? '\\n' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:13:11: ( '\\r' )? '\\n'
            {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:13:11: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:13:11: '\\r'
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
            int _type = ACHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:16:7: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) )
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
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:16:9: ( 'A' .. 'Z' )
                    {
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:16:9: ( 'A' .. 'Z' )
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:16:10: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:16:22: ( 'a' .. 'z' )
                    {
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:16:22: ( 'a' .. 'z' )
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:16:23: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACHAR"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:19:7: ( ( '0' .. '9' ) )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:19:9: ( '0' .. '9' )
            {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:19:9: ( '0' .. '9' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:19:10: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:7: ( ( ACHAR | '_' | ',' | '.' | ')' | '(' | '-' | DIGIT )+ )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:9: ( ACHAR | '_' | ',' | '.' | ')' | '(' | '-' | DIGIT )+
            {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:9: ( ACHAR | '_' | ',' | '.' | ')' | '(' | '-' | DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=9;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:10: ACHAR
            	    {
            	    mACHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:17: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:21: ','
            	    {
            	    match(','); 

            	    }
            	    break;
            	case 4 :
            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:26: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 5 :
            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:30: ')'
            	    {
            	    match(')'); 

            	    }
            	    break;
            	case 6 :
            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:34: '('
            	    {
            	    match('('); 

            	    }
            	    break;
            	case 7 :
            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:38: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 8 :
            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:21:42: DIGIT
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
        // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | WS | NEWLINE | ACHAR | DIGIT | TOKEN )
        int alt5=173;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:117: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:123: T__28
                {
                mT__28(); 

                }
                break;
            case 21 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:129: T__29
                {
                mT__29(); 

                }
                break;
            case 22 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:135: T__30
                {
                mT__30(); 

                }
                break;
            case 23 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:141: T__31
                {
                mT__31(); 

                }
                break;
            case 24 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:147: T__32
                {
                mT__32(); 

                }
                break;
            case 25 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:153: T__33
                {
                mT__33(); 

                }
                break;
            case 26 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:159: T__34
                {
                mT__34(); 

                }
                break;
            case 27 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:165: T__35
                {
                mT__35(); 

                }
                break;
            case 28 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:171: T__36
                {
                mT__36(); 

                }
                break;
            case 29 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:177: T__37
                {
                mT__37(); 

                }
                break;
            case 30 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:183: T__38
                {
                mT__38(); 

                }
                break;
            case 31 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:189: T__39
                {
                mT__39(); 

                }
                break;
            case 32 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:195: T__40
                {
                mT__40(); 

                }
                break;
            case 33 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:201: T__41
                {
                mT__41(); 

                }
                break;
            case 34 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:207: T__42
                {
                mT__42(); 

                }
                break;
            case 35 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:213: T__43
                {
                mT__43(); 

                }
                break;
            case 36 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:219: T__44
                {
                mT__44(); 

                }
                break;
            case 37 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:225: T__45
                {
                mT__45(); 

                }
                break;
            case 38 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:231: T__46
                {
                mT__46(); 

                }
                break;
            case 39 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:237: T__47
                {
                mT__47(); 

                }
                break;
            case 40 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:243: T__48
                {
                mT__48(); 

                }
                break;
            case 41 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:249: T__49
                {
                mT__49(); 

                }
                break;
            case 42 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:255: T__50
                {
                mT__50(); 

                }
                break;
            case 43 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:261: T__51
                {
                mT__51(); 

                }
                break;
            case 44 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:267: T__52
                {
                mT__52(); 

                }
                break;
            case 45 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:273: T__53
                {
                mT__53(); 

                }
                break;
            case 46 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:279: T__54
                {
                mT__54(); 

                }
                break;
            case 47 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:285: T__55
                {
                mT__55(); 

                }
                break;
            case 48 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:291: T__56
                {
                mT__56(); 

                }
                break;
            case 49 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:297: T__57
                {
                mT__57(); 

                }
                break;
            case 50 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:303: T__58
                {
                mT__58(); 

                }
                break;
            case 51 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:309: T__59
                {
                mT__59(); 

                }
                break;
            case 52 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:315: T__60
                {
                mT__60(); 

                }
                break;
            case 53 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:321: T__61
                {
                mT__61(); 

                }
                break;
            case 54 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:327: T__62
                {
                mT__62(); 

                }
                break;
            case 55 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:333: T__63
                {
                mT__63(); 

                }
                break;
            case 56 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:339: T__64
                {
                mT__64(); 

                }
                break;
            case 57 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:345: T__65
                {
                mT__65(); 

                }
                break;
            case 58 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:351: T__66
                {
                mT__66(); 

                }
                break;
            case 59 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:357: T__67
                {
                mT__67(); 

                }
                break;
            case 60 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:363: T__68
                {
                mT__68(); 

                }
                break;
            case 61 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:369: T__69
                {
                mT__69(); 

                }
                break;
            case 62 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:375: T__70
                {
                mT__70(); 

                }
                break;
            case 63 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:381: T__71
                {
                mT__71(); 

                }
                break;
            case 64 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:387: T__72
                {
                mT__72(); 

                }
                break;
            case 65 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:393: T__73
                {
                mT__73(); 

                }
                break;
            case 66 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:399: T__74
                {
                mT__74(); 

                }
                break;
            case 67 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:405: T__75
                {
                mT__75(); 

                }
                break;
            case 68 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:411: T__76
                {
                mT__76(); 

                }
                break;
            case 69 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:417: T__77
                {
                mT__77(); 

                }
                break;
            case 70 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:423: T__78
                {
                mT__78(); 

                }
                break;
            case 71 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:429: T__79
                {
                mT__79(); 

                }
                break;
            case 72 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:435: T__80
                {
                mT__80(); 

                }
                break;
            case 73 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:441: T__81
                {
                mT__81(); 

                }
                break;
            case 74 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:447: T__82
                {
                mT__82(); 

                }
                break;
            case 75 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:453: T__83
                {
                mT__83(); 

                }
                break;
            case 76 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:459: T__84
                {
                mT__84(); 

                }
                break;
            case 77 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:465: T__85
                {
                mT__85(); 

                }
                break;
            case 78 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:471: T__86
                {
                mT__86(); 

                }
                break;
            case 79 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:477: T__87
                {
                mT__87(); 

                }
                break;
            case 80 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:483: T__88
                {
                mT__88(); 

                }
                break;
            case 81 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:489: T__89
                {
                mT__89(); 

                }
                break;
            case 82 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:495: T__90
                {
                mT__90(); 

                }
                break;
            case 83 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:501: T__91
                {
                mT__91(); 

                }
                break;
            case 84 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:507: T__92
                {
                mT__92(); 

                }
                break;
            case 85 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:513: T__93
                {
                mT__93(); 

                }
                break;
            case 86 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:519: T__94
                {
                mT__94(); 

                }
                break;
            case 87 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:525: T__95
                {
                mT__95(); 

                }
                break;
            case 88 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:531: T__96
                {
                mT__96(); 

                }
                break;
            case 89 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:537: T__97
                {
                mT__97(); 

                }
                break;
            case 90 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:543: T__98
                {
                mT__98(); 

                }
                break;
            case 91 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:549: T__99
                {
                mT__99(); 

                }
                break;
            case 92 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:555: T__100
                {
                mT__100(); 

                }
                break;
            case 93 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:562: T__101
                {
                mT__101(); 

                }
                break;
            case 94 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:569: T__102
                {
                mT__102(); 

                }
                break;
            case 95 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:576: T__103
                {
                mT__103(); 

                }
                break;
            case 96 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:583: T__104
                {
                mT__104(); 

                }
                break;
            case 97 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:590: T__105
                {
                mT__105(); 

                }
                break;
            case 98 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:597: T__106
                {
                mT__106(); 

                }
                break;
            case 99 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:604: T__107
                {
                mT__107(); 

                }
                break;
            case 100 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:611: T__108
                {
                mT__108(); 

                }
                break;
            case 101 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:618: T__109
                {
                mT__109(); 

                }
                break;
            case 102 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:625: T__110
                {
                mT__110(); 

                }
                break;
            case 103 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:632: T__111
                {
                mT__111(); 

                }
                break;
            case 104 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:639: T__112
                {
                mT__112(); 

                }
                break;
            case 105 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:646: T__113
                {
                mT__113(); 

                }
                break;
            case 106 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:653: T__114
                {
                mT__114(); 

                }
                break;
            case 107 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:660: T__115
                {
                mT__115(); 

                }
                break;
            case 108 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:667: T__116
                {
                mT__116(); 

                }
                break;
            case 109 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:674: T__117
                {
                mT__117(); 

                }
                break;
            case 110 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:681: T__118
                {
                mT__118(); 

                }
                break;
            case 111 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:688: T__119
                {
                mT__119(); 

                }
                break;
            case 112 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:695: T__120
                {
                mT__120(); 

                }
                break;
            case 113 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:702: T__121
                {
                mT__121(); 

                }
                break;
            case 114 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:709: T__122
                {
                mT__122(); 

                }
                break;
            case 115 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:716: T__123
                {
                mT__123(); 

                }
                break;
            case 116 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:723: T__124
                {
                mT__124(); 

                }
                break;
            case 117 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:730: T__125
                {
                mT__125(); 

                }
                break;
            case 118 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:737: T__126
                {
                mT__126(); 

                }
                break;
            case 119 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:744: T__127
                {
                mT__127(); 

                }
                break;
            case 120 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:751: T__128
                {
                mT__128(); 

                }
                break;
            case 121 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:758: T__129
                {
                mT__129(); 

                }
                break;
            case 122 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:765: T__130
                {
                mT__130(); 

                }
                break;
            case 123 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:772: T__131
                {
                mT__131(); 

                }
                break;
            case 124 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:779: T__132
                {
                mT__132(); 

                }
                break;
            case 125 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:786: T__133
                {
                mT__133(); 

                }
                break;
            case 126 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:793: T__134
                {
                mT__134(); 

                }
                break;
            case 127 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:800: T__135
                {
                mT__135(); 

                }
                break;
            case 128 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:807: T__136
                {
                mT__136(); 

                }
                break;
            case 129 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:814: T__137
                {
                mT__137(); 

                }
                break;
            case 130 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:821: T__138
                {
                mT__138(); 

                }
                break;
            case 131 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:828: T__139
                {
                mT__139(); 

                }
                break;
            case 132 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:835: T__140
                {
                mT__140(); 

                }
                break;
            case 133 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:842: T__141
                {
                mT__141(); 

                }
                break;
            case 134 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:849: T__142
                {
                mT__142(); 

                }
                break;
            case 135 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:856: T__143
                {
                mT__143(); 

                }
                break;
            case 136 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:863: T__144
                {
                mT__144(); 

                }
                break;
            case 137 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:870: T__145
                {
                mT__145(); 

                }
                break;
            case 138 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:877: T__146
                {
                mT__146(); 

                }
                break;
            case 139 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:884: T__147
                {
                mT__147(); 

                }
                break;
            case 140 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:891: T__148
                {
                mT__148(); 

                }
                break;
            case 141 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:898: T__149
                {
                mT__149(); 

                }
                break;
            case 142 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:905: T__150
                {
                mT__150(); 

                }
                break;
            case 143 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:912: T__151
                {
                mT__151(); 

                }
                break;
            case 144 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:919: T__152
                {
                mT__152(); 

                }
                break;
            case 145 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:926: T__153
                {
                mT__153(); 

                }
                break;
            case 146 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:933: T__154
                {
                mT__154(); 

                }
                break;
            case 147 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:940: T__155
                {
                mT__155(); 

                }
                break;
            case 148 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:947: T__156
                {
                mT__156(); 

                }
                break;
            case 149 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:954: T__157
                {
                mT__157(); 

                }
                break;
            case 150 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:961: T__158
                {
                mT__158(); 

                }
                break;
            case 151 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:968: T__159
                {
                mT__159(); 

                }
                break;
            case 152 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:975: T__160
                {
                mT__160(); 

                }
                break;
            case 153 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:982: T__161
                {
                mT__161(); 

                }
                break;
            case 154 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:989: T__162
                {
                mT__162(); 

                }
                break;
            case 155 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:996: T__163
                {
                mT__163(); 

                }
                break;
            case 156 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1003: T__164
                {
                mT__164(); 

                }
                break;
            case 157 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1010: T__165
                {
                mT__165(); 

                }
                break;
            case 158 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1017: T__166
                {
                mT__166(); 

                }
                break;
            case 159 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1024: T__167
                {
                mT__167(); 

                }
                break;
            case 160 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1031: T__168
                {
                mT__168(); 

                }
                break;
            case 161 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1038: T__169
                {
                mT__169(); 

                }
                break;
            case 162 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1045: T__170
                {
                mT__170(); 

                }
                break;
            case 163 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1052: T__171
                {
                mT__171(); 

                }
                break;
            case 164 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1059: T__172
                {
                mT__172(); 

                }
                break;
            case 165 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1066: T__173
                {
                mT__173(); 

                }
                break;
            case 166 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1073: T__174
                {
                mT__174(); 

                }
                break;
            case 167 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1080: T__175
                {
                mT__175(); 

                }
                break;
            case 168 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1087: T__176
                {
                mT__176(); 

                }
                break;
            case 169 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1094: WS
                {
                mWS(); 

                }
                break;
            case 170 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1097: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 171 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1105: ACHAR
                {
                mACHAR(); 

                }
                break;
            case 172 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1111: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 173 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:1117: TOKEN
                {
                mTOKEN(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA4_eotS =
        "\1\1\11\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\50\11\uffff";
    static final String DFA4_maxS =
        "\1\172\11\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\7\1\6\2\uffff\1\4\1\10\1\5\1\uffff\12\11\7\uffff\32\2\4\uffff"+
            "\1\3\1\uffff\32\2",
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
            return "()+ loopback of 21:9: ( ACHAR | '_' | ',' | '.' | ')' | '(' | '-' | DIGIT )+";
        }
    }
    static final String DFA5_eotS =
        "\1\uffff\25\42\2\uffff\2\42\1\111\1\uffff\1\113\1\114\1\115\1\33"+
        "\1\120\1\121\1\uffff\1\33\1\123\1\125\1\131\1\33\1\133\1\136\1\137"+
        "\1\145\1\147\1\33\1\153\1\33\1\160\1\163\5\33\1\173\1\174\1\175"+
        "\1\u0084\1\u0085\1\u0086\1\u008a\1\u008e\1\u008f\4\33\1\u0096\1"+
        "\u0098\1\33\1\u009e\1\u009f\1\uffff\1\33\3\uffff\2\33\2\uffff\1"+
        "\33\1\uffff\1\33\1\uffff\1\33\1\uffff\1\u00b9\1\uffff\1\u00ba\2"+
        "\uffff\1\u00bc\2\uffff\1\33\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\uffff"+
        "\1\33\1\uffff\1\u00d1\1\u00d2\1\u00d3\1\uffff\1\33\1\u00d5\1\u00d6"+
        "\1\u00d7\1\uffff\1\u00d8\1\u00d9\1\uffff\2\33\1\u00dc\1\33\1\u00de"+
        "\1\u00df\1\u00e0\3\uffff\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6"+
        "\1\u00e7\3\uffff\1\u00e8\1\u00e9\1\u00ea\1\uffff\1\u00eb\1\u00ec"+
        "\1\u00ed\3\uffff\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\3\uffff"+
        "\1\u00f4\1\u00f6\1\u00f7\1\u00f9\1\u00fa\2\uffff\30\33\5\uffff\17"+
        "\33\4\uffff\1\33\3\uffff\1\u013f\5\uffff\1\u0140\1\u0141\1\uffff"+
        "\1\u0142\3\uffff\1\u0143\23\uffff\1\u0144\2\uffff\1\u0145\2\uffff"+
        "\1\33\1\u0147\1\u0148\1\33\1\u014a\2\33\1\u014d\1\u014f\2\33\1\u0153"+
        "\1\u0154\21\33\1\u0166\44\33\1\u0192\7\uffff\1\33\2\uffff\1\33\1"+
        "\uffff\2\33\1\uffff\1\33\1\uffff\1\33\1\u0199\1\u019a\2\uffff\1"+
        "\33\1\u019c\10\33\1\u01a5\4\33\1\u01aa\1\33\1\uffff\1\33\1\u01ad"+
        "\13\33\1\u01ba\1\33\1\u01bc\7\33\1\u01c7\2\33\1\u01ca\20\33\1\uffff"+
        "\4\33\1\u01e0\1\u01e2\2\uffff\1\u01e3\1\uffff\1\u01e4\3\33\1\u01e9"+
        "\1\u01ea\1\u01eb\1\33\1\uffff\4\33\1\uffff\2\33\1\uffff\14\33\1"+
        "\uffff\1\33\1\uffff\4\33\1\u0204\3\33\1\u0208\1\33\1\uffff\1\33"+
        "\1\u020b\1\uffff\2\33\1\u020e\3\33\1\u0212\7\33\1\u021a\1\u021b"+
        "\3\33\1\u021f\1\33\1\uffff\1\33\3\uffff\1\u0222\1\u0223\1\33\1\u0225"+
        "\3\uffff\14\33\1\u0232\1\u0233\12\33\1\uffff\3\33\1\uffff\2\33\1"+
        "\uffff\2\33\1\uffff\1\33\1\u0246\1\33\1\uffff\7\33\2\uffff\1\u024f"+
        "\2\33\1\uffff\1\u0252\1\33\2\uffff\1\33\1\uffff\1\33\1\u0256\2\33"+
        "\1\u0259\2\33\1\u025c\2\33\1\u025f\1\33\2\uffff\1\u0261\2\33\1\u0264"+
        "\1\33\1\u0266\1\u0267\1\u0268\7\33\1\u0270\1\33\1\u0272\1\uffff"+
        "\4\33\1\u0277\1\u0278\1\33\1\u027a\1\uffff\1\u027b\1\u027c\1\uffff"+
        "\1\u027d\1\33\1\u027f\1\uffff\1\u0280\1\33\1\uffff\1\33\1\u0283"+
        "\1\uffff\2\33\1\uffff\1\33\1\uffff\2\33\1\uffff\1\u0289\3\uffff"+
        "\1\u028a\2\33\1\u028d\1\u028e\2\33\1\uffff\1\33\1\uffff\1\u0292"+
        "\3\33\2\uffff\1\u0296\4\uffff\1\33\2\uffff\2\33\1\uffff\3\33\1\u029d"+
        "\1\33\2\uffff\1\33\1\u02a0\2\uffff\2\33\1\u02a3\1\uffff\1\u02a4"+
        "\2\33\1\uffff\2\33\1\u02a9\3\33\1\uffff\2\33\1\uffff\1\33\1\u02b0"+
        "\2\uffff\1\u02b1\1\33\1\u02b3\1\u02b4\1\uffff\1\u02b5\4\33\1\u02ba"+
        "\2\uffff\1\33\3\uffff\1\33\1\u02bd\1\u02be\1\u02bf\1\uffff\1\u02c0"+
        "\1\33\4\uffff\1\33\1\u02c3\1\uffff";
    static final String DFA5_eofS =
        "\u02c4\uffff";
    static final String DFA5_minS =
        "\1\11\25\50\2\uffff\3\50\1\uffff\3\50\1\114\2\50\1\uffff\1\55\2"+
        "\50\1\44\1\107\1\50\1\44\3\50\1\114\1\50\1\123\2\50\1\117\1\121"+
        "\1\102\1\121\1\102\11\50\1\44\1\114\1\102\1\124\1\50\2\44\2\50\1"+
        "\uffff\1\125\3\uffff\1\117\1\115\2\uffff\1\125\1\uffff\1\101\1\uffff"+
        "\1\101\1\uffff\1\44\1\uffff\1\50\2\uffff\1\44\2\uffff\1\101\4\50"+
        "\1\uffff\1\123\1\uffff\3\50\1\uffff\1\110\3\50\1\uffff\2\50\1\uffff"+
        "\1\120\1\102\1\50\1\102\3\50\3\uffff\6\50\3\uffff\3\50\1\uffff\3"+
        "\50\3\uffff\5\50\3\uffff\1\44\4\50\2\uffff\2\116\1\101\1\116\1\106"+
        "\1\105\1\116\2\111\1\106\1\117\1\116\1\124\3\105\1\104\1\121\1\101"+
        "\1\110\1\111\1\105\1\122\1\105\5\uffff\1\123\1\110\1\124\1\104\1"+
        "\105\1\111\1\122\1\130\1\105\1\116\1\101\1\125\1\105\1\101\1\111"+
        "\4\uffff\1\124\3\uffff\1\50\5\uffff\2\50\1\uffff\1\50\3\uffff\1"+
        "\50\23\uffff\1\50\2\uffff\1\50\2\uffff\1\111\2\50\1\111\1\50\1\124"+
        "\1\106\2\50\1\124\1\101\2\50\1\105\1\122\1\117\1\104\1\101\1\116"+
        "\2\115\1\101\1\116\1\114\1\124\1\130\1\115\1\117\1\104\1\120\1\50"+
        "\1\124\1\114\1\103\1\105\1\114\1\103\1\101\1\114\1\105\2\122\1\131"+
        "\1\115\1\105\1\101\1\116\1\102\1\111\1\116\1\104\1\120\1\117\1\107"+
        "\1\123\1\114\1\105\1\124\1\101\1\103\1\122\1\105\1\122\1\105\1\103"+
        "\1\111\1\105\1\50\7\uffff\1\103\2\uffff\1\103\1\uffff\1\105\1\117"+
        "\1\uffff\1\117\1\uffff\1\110\2\50\2\uffff\1\122\1\50\1\115\1\105"+
        "\2\124\1\105\1\120\1\115\1\105\1\50\1\110\1\124\1\117\1\125\1\50"+
        "\1\101\1\uffff\1\122\1\50\1\125\1\115\1\117\1\125\1\103\1\114\1"+
        "\123\1\124\1\103\1\111\1\103\1\50\1\117\1\50\1\116\1\103\1\114\1"+
        "\112\1\120\1\122\1\124\1\50\1\101\1\120\1\50\1\101\1\123\1\114\1"+
        "\101\1\122\1\124\1\122\1\124\1\103\1\111\1\116\2\117\1\124\1\110"+
        "\1\114\1\uffff\2\117\2\122\2\50\2\uffff\1\50\1\uffff\1\50\1\122"+
        "\1\105\1\110\3\50\1\122\1\uffff\1\117\1\125\1\123\1\116\1\uffff"+
        "\1\122\1\101\1\uffff\1\125\1\105\2\115\2\105\1\110\1\105\1\123\1"+
        "\111\1\106\1\105\1\uffff\1\126\1\uffff\2\107\1\101\1\105\1\50\3"+
        "\105\1\50\1\110\1\uffff\1\122\1\50\1\uffff\1\123\1\117\1\50\1\105"+
        "\1\124\1\101\1\50\1\105\2\111\1\106\1\103\2\126\2\50\3\104\1\50"+
        "\1\105\1\uffff\1\125\3\uffff\2\50\1\105\1\50\3\uffff\1\101\1\104"+
        "\1\122\1\120\1\124\1\101\1\103\1\115\1\116\1\101\2\116\2\50\1\122"+
        "\1\125\1\120\1\131\1\116\3\105\1\111\1\116\1\uffff\1\122\1\103\1"+
        "\116\1\uffff\1\105\1\101\1\uffff\1\123\1\114\1\uffff\1\122\1\50"+
        "\1\103\1\uffff\1\101\1\124\1\120\1\131\1\110\2\105\2\uffff\1\50"+
        "\2\105\1\uffff\1\50\1\124\2\uffff\1\123\1\uffff\1\114\1\50\1\105"+
        "\1\110\1\50\2\124\1\50\2\124\1\50\1\124\2\uffff\1\50\1\122\1\111"+
        "\1\50\1\124\3\50\1\116\1\124\1\107\1\124\1\104\1\123\1\124\1\50"+
        "\1\126\1\50\1\uffff\1\124\1\123\2\111\2\50\1\122\1\50\1\uffff\2"+
        "\50\1\uffff\1\50\1\111\1\50\1\uffff\1\50\1\105\1\uffff\1\125\1\50"+
        "\1\uffff\1\111\1\117\1\uffff\1\122\1\uffff\1\105\1\124\1\uffff\1"+
        "\50\3\uffff\1\50\1\122\1\105\2\50\1\111\1\125\1\uffff\1\105\1\uffff"+
        "\1\50\1\105\1\117\1\124\2\uffff\1\50\4\uffff\1\132\2\uffff\1\122"+
        "\1\123\1\uffff\1\124\1\107\1\101\1\50\1\101\2\uffff\1\101\1\50\2"+
        "\uffff\1\132\1\123\1\50\1\uffff\1\50\1\116\1\101\1\uffff\2\105\1"+
        "\50\1\131\1\122\1\124\1\uffff\2\124\1\uffff\1\105\1\50\2\uffff\1"+
        "\50\1\124\2\50\1\uffff\1\50\1\101\3\105\1\50\2\uffff\1\105\3\uffff"+
        "\1\120\3\50\1\uffff\1\50\1\110\4\uffff\1\131\1\50\1\uffff";
    static final String DFA5_maxS =
        "\26\172\2\uffff\3\172\1\uffff\3\172\1\115\2\172\1\uffff\1\55\3\172"+
        "\1\107\5\172\1\130\1\172\1\123\2\172\1\117\1\121\1\102\1\121\1\102"+
        "\11\172\1\123\1\114\1\102\1\124\2\172\1\123\2\172\1\uffff\1\125"+
        "\3\uffff\1\117\1\115\2\uffff\1\125\1\uffff\1\127\1\uffff\1\126\1"+
        "\uffff\1\172\1\uffff\1\172\2\uffff\1\172\2\uffff\1\131\4\172\1\uffff"+
        "\1\123\1\uffff\3\172\1\uffff\1\110\3\172\1\uffff\2\172\1\uffff\1"+
        "\120\1\102\1\172\1\102\3\172\3\uffff\6\172\3\uffff\3\172\1\uffff"+
        "\3\172\3\uffff\5\172\3\uffff\1\44\4\172\2\uffff\2\116\1\101\1\116"+
        "\1\123\1\131\1\116\2\111\1\126\1\122\1\116\1\131\1\111\1\122\1\117"+
        "\1\124\1\130\1\117\1\131\1\114\1\125\1\122\1\105\5\uffff\1\123\1"+
        "\117\1\131\1\120\1\122\1\111\1\122\1\130\1\105\1\116\2\125\1\105"+
        "\1\101\1\111\4\uffff\1\124\3\uffff\1\172\5\uffff\2\172\1\uffff\1"+
        "\172\3\uffff\1\172\23\uffff\1\172\2\uffff\1\172\2\uffff\1\111\2"+
        "\172\1\111\1\172\1\124\1\106\2\172\1\124\1\101\2\172\1\105\1\122"+
        "\1\117\1\104\1\101\1\116\2\115\1\101\1\116\1\114\1\124\1\130\1\115"+
        "\1\117\1\104\1\120\1\172\1\124\1\114\1\103\1\122\1\116\1\103\1\101"+
        "\1\114\1\105\2\122\1\131\1\115\1\105\1\101\1\117\1\123\1\111\1\116"+
        "\1\104\1\120\1\131\1\107\1\123\1\114\1\105\1\124\1\101\1\103\1\122"+
        "\1\105\1\122\1\105\1\115\1\123\1\105\1\172\7\uffff\1\103\2\uffff"+
        "\1\103\1\uffff\1\105\1\117\1\uffff\1\117\1\uffff\1\110\2\172\2\uffff"+
        "\1\122\1\172\1\115\1\105\2\124\1\105\1\120\1\115\1\105\1\172\1\110"+
        "\1\124\1\117\1\125\1\172\1\101\1\uffff\1\122\1\172\1\125\1\115\1"+
        "\117\1\125\1\103\1\114\1\123\1\124\1\123\1\111\1\103\1\172\1\117"+
        "\1\172\1\122\1\124\1\114\1\115\1\120\1\122\1\124\1\172\1\101\1\120"+
        "\1\172\1\101\1\123\1\124\1\101\1\122\1\124\1\122\1\124\1\103\1\111"+
        "\1\116\2\117\1\124\1\110\1\114\1\uffff\2\117\2\122\2\172\2\uffff"+
        "\1\172\1\uffff\1\172\1\122\1\105\1\110\3\172\1\122\1\uffff\1\117"+
        "\1\125\1\123\1\116\1\uffff\1\122\1\101\1\uffff\1\125\1\105\2\115"+
        "\2\105\1\110\1\105\1\123\1\111\1\106\1\105\1\uffff\1\126\1\uffff"+
        "\2\107\1\101\1\105\1\172\3\105\1\172\1\110\1\uffff\1\122\1\172\1"+
        "\uffff\1\123\1\117\1\172\1\105\1\124\1\101\1\172\1\105\2\111\1\106"+
        "\1\103\2\126\2\172\3\104\1\172\1\105\1\uffff\1\125\3\uffff\2\172"+
        "\1\105\1\172\3\uffff\1\101\1\104\1\122\1\120\1\124\1\101\1\103\1"+
        "\115\1\116\1\101\2\116\2\172\1\122\1\125\1\120\1\131\1\116\3\105"+
        "\1\111\1\116\1\uffff\1\122\1\103\1\116\1\uffff\1\105\1\101\1\uffff"+
        "\1\123\1\114\1\uffff\1\122\1\172\1\103\1\uffff\1\101\1\124\1\120"+
        "\1\131\1\110\2\105\2\uffff\1\172\2\105\1\uffff\1\172\1\124\2\uffff"+
        "\1\123\1\uffff\1\114\1\172\1\105\1\110\1\172\2\124\1\172\2\124\1"+
        "\172\1\124\2\uffff\1\172\1\122\1\111\1\172\1\124\3\172\1\116\1\124"+
        "\1\107\1\124\1\104\1\123\1\124\1\172\1\126\1\172\1\uffff\1\124\1"+
        "\123\2\111\2\172\1\122\1\172\1\uffff\2\172\1\uffff\1\172\1\111\1"+
        "\172\1\uffff\1\172\1\105\1\uffff\1\125\1\172\1\uffff\1\111\1\117"+
        "\1\uffff\1\122\1\uffff\1\105\1\124\1\uffff\1\172\3\uffff\1\172\1"+
        "\122\1\105\2\172\1\111\1\125\1\uffff\1\105\1\uffff\1\172\1\105\1"+
        "\117\1\124\2\uffff\1\172\4\uffff\1\132\2\uffff\1\122\1\123\1\uffff"+
        "\1\124\1\107\1\101\1\172\1\101\2\uffff\1\101\1\172\2\uffff\1\132"+
        "\1\123\1\172\1\uffff\1\172\1\116\1\101\1\uffff\2\105\1\172\1\131"+
        "\1\122\1\124\1\uffff\2\124\1\uffff\1\105\1\172\2\uffff\1\172\1\124"+
        "\2\172\1\uffff\1\172\1\101\3\105\1\172\2\uffff\1\105\3\uffff\1\120"+
        "\3\172\1\uffff\1\172\1\110\4\uffff\1\131\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\26\uffff\1\u00a9\1\u00aa\3\uffff\1\u00ad\6\uffff\1\u00ab\46\uffff"+
        "\1\u00ac\1\uffff\1\1\1\2\1\50\2\uffff\1\154\1\u009f\1\uffff\1\u00a7"+
        "\1\uffff\1\156\1\uffff\1\u0097\1\uffff\1\u00a4\1\uffff\1\174\1\u009a"+
        "\1\uffff\1\u0099\1\u009d\5\uffff\1\u0083\1\uffff\1\142\3\uffff\1"+
        "\143\4\uffff\1\155\2\uffff\1\u00a0\7\uffff\1\u00a6\1\u008a\1\u008b"+
        "\6\uffff\1\144\1\162\1\163\3\uffff\1\164\3\uffff\1\u00a3\1\173\1"+
        "\175\5\uffff\1\u0082\1\u008d\1\u008c\5\uffff\1\u0095\1\u009e\30"+
        "\uffff\1\u0098\1\u00a5\1\127\1\u009c\1\u009b\17\uffff\1\u0084\1"+
        "\u0085\1\u0086\1\u00a8\1\uffff\1\137\1\140\1\141\1\uffff\1\157\1"+
        "\160\1\161\1\u00a1\1\u00a2\2\uffff\1\135\1\uffff\1\136\1\u0088\1"+
        "\u0089\1\uffff\1\145\1\147\1\150\1\151\1\152\1\153\1\165\1\166\1"+
        "\167\1\170\1\171\1\172\1\176\1\177\1\u0080\1\u0081\1\u0087\1\u008f"+
        "\1\u008e\1\uffff\1\u0090\1\u0092\1\uffff\1\u0093\1\u0096\104\uffff"+
        "\1\130\1\131\1\133\1\134\1\146\1\u0091\1\u0094\1\uffff\1\124\1\125"+
        "\1\uffff\1\5\2\uffff\1\14\1\uffff\1\10\3\uffff\1\16\1\17\21\uffff"+
        "\1\32\53\uffff\1\126\6\uffff\1\15\1\24\1\uffff\1\20\10\uffff\1\30"+
        "\4\uffff\1\55\2\uffff\1\33\14\uffff\1\76\1\uffff\1\51\12\uffff\1"+
        "\57\2\uffff\1\75\25\uffff\1\11\1\uffff\1\12\1\23\1\21\4\uffff\1"+
        "\26\1\35\1\27\30\uffff\1\72\3\uffff\1\116\2\uffff\1\62\2\uffff\1"+
        "\63\3\uffff\1\103\7\uffff\1\121\1\122\3\uffff\1\7\2\uffff\1\22\1"+
        "\25\1\uffff\1\47\14\uffff\1\46\1\36\22\uffff\1\65\10\uffff\1\123"+
        "\2\uffff\1\6\3\uffff\1\40\2\uffff\1\41\2\uffff\1\45\2\uffff\1\43"+
        "\1\uffff\1\102\2\uffff\1\111\1\uffff\1\115\1\52\1\60\7\uffff\1\73"+
        "\1\uffff\1\101\4\uffff\1\110\1\112\1\uffff\1\114\1\4\1\3\1\13\1"+
        "\uffff\1\37\1\56\2\uffff\1\100\5\uffff\1\132\1\61\2\uffff\1\54\1"+
        "\64\3\uffff\1\77\3\uffff\1\113\6\uffff\1\42\2\uffff\1\53\2\uffff"+
        "\1\74\1\104\4\uffff\1\67\6\uffff\1\66\1\105\1\uffff\1\120\1\31\1"+
        "\34\4\uffff\1\117\2\uffff\1\71\1\107\1\70\1\106\2\uffff\1\44";
    static final String DFA5_specialS =
        "\u02c4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\26\1\27\2\uffff\1\27\22\uffff\1\26\7\uffff\2\33\2\uffff\3"+
            "\33\1\uffff\12\32\7\uffff\1\6\1\13\1\1\1\7\1\14\1\15\1\30\1"+
            "\16\1\3\1\17\1\30\1\11\1\20\1\4\1\25\1\23\1\24\1\12\1\10\1\2"+
            "\1\22\1\5\1\21\3\30\4\uffff\1\33\1\uffff\32\31",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\2\33\1\40\1\34\5\33"+
            "\1\35\2\33\1\36\1\33\1\37\3\33\1\41\7\33\4\uffff\1\33\1\uffff"+
            "\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\14\33\1\43\1\33\1"+
            "\44\13\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\15\33\1\45\14\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\2\33\1\50\1\33\1\47"+
            "\10\33\1\46\1\33\1\51\1\33\1\52\10\33\4\uffff\1\33\1\uffff\32"+
            "\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\1\33\1\53\30\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\1\33\1\55\15\33\1"+
            "\54\3\33\1\56\6\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\1\57\15\33\1\61\4"+
            "\33\1\60\6\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\23\33\1\62\6\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\21\33\1\64\1\63\7"+
            "\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\1\33\1\67\13\33\1"+
            "\70\1\33\1\71\1\33\1\66\1\65\7\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\4\33\1\72\25\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\27\33\1\73\2\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\26\33\1\74\3\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\25\33\1\75\4\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\11\33\1\76\20\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\3\33\1\77\26\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\3\33\1\103\13\33\1"+
            "\100\1\101\1\102\10\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\7\33\1\104\22\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\15\33\1\105\1\33\1"+
            "\106\12\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\13\33\1\107\16\33"+
            "\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\3\33\1\110\26\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\1\33\1\112\1\33\1\uffff\12\33\7\uffff\32\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\116\1\117",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\122",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\1\33\1\124\1\33\1\uffff\12\33\7\uffff\32\33\4"+
            "\uffff\1\33\1\uffff\32\33",
            "\1\127\3\uffff\2\33\2\uffff\1\33\1\126\1\33\1\uffff\12\33\7"+
            "\uffff\22\33\1\130\7\33\4\uffff\1\33\1\uffff\32\33",
            "\1\132",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\134\3\uffff\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\22\33"+
            "\1\135\7\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\1\33\1\140\1\33\1\uffff\12\33\7\uffff\3\33\1"+
            "\144\2\33\1\141\6\33\1\142\13\33\1\143\4\uffff\1\33\1\uffff"+
            "\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\16\33\1\146\13\33"+
            "\4\uffff\1\33\1\uffff\32\33",
            "\1\150\1\uffff\1\151\11\uffff\1\152",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\154",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\10\33\1\155\11\33"+
            "\1\156\4\33\1\157\2\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\3\33\1\161\25\33\1"+
            "\162\4\uffff\1\33\1\uffff\32\33",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\21\33\1\171\1\33\1"+
            "\172\6\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\3\33\1\176\2\33\1"+
            "\177\5\33\1\u0080\1\u0081\3\33\1\u0082\7\33\1\u0083\4\uffff"+
            "\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\3\33\1\u0087\2\33"+
            "\1\u0088\6\33\1\u0089\14\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\21\33\1\u008b\1\u008c"+
            "\1\u008d\6\33\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0090\52\uffff\1\u0091\3\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0097\3\uffff\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32"+
            "\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0099\47\uffff\1\u009a\2\uffff\1\u009b\3\uffff\1\u009c",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\17\33\1\u009d\12\33"+
            "\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\u00a0",
            "",
            "",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "\1\u00a3",
            "",
            "\1\u00a4\1\u00a5\3\uffff\1\u00aa\2\uffff\1\u00a6\5\uffff\1"+
            "\u00a9\5\uffff\1\u00ab\1\u00a8\1\u00a7",
            "",
            "\1\u00b0\1\uffff\1\u00b3\1\u00b6\1\u00b1\1\u00b4\1\u00ae\5"+
            "\uffff\1\u00af\2\uffff\1\u00b5\1\uffff\1\u00b7\1\u00ac\1\u00ad"+
            "\1\uffff\1\u00b2",
            "",
            "\1\u00b8\3\uffff\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32"+
            "\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "\1\u00bb\3\uffff\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32"+
            "\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\u00c0\1\uffff\1\u00be\1\u00c1\1\u00c4\1\u00c2\1\uffff\1"+
            "\u00c5\1\u00c6\6\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00bf\1\u00c3"+
            "\1\u00bd\1\uffff\1\u00ca\1\uffff\1\u00cb",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\u00d0",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\u00d4",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\u00da",
            "\1\u00db",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u00dd",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\31\33\1\u00e1\4\uffff"+
            "\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "\1\u00f3",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\22\33\1\u00f5\7\33"+
            "\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\22\33\1\u00f8\7\33"+
            "\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u0100\14\uffff\1\u00ff",
            "\1\u0101\23\uffff\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106\7\uffff\1\u0107\7\uffff\1\u0108",
            "\1\u0109\2\uffff\1\u010a",
            "\1\u010b",
            "\1\u010c\4\uffff\1\u010d",
            "\1\u010f\3\uffff\1\u010e",
            "\1\u0111\14\uffff\1\u0110",
            "\1\u0113\3\uffff\1\u0114\5\uffff\1\u0112",
            "\1\u0117\10\uffff\1\u0116\2\uffff\1\u0118\3\uffff\1\u0115",
            "\1\u0119\6\uffff\1\u011a",
            "\1\u011c\15\uffff\1\u011b",
            "\1\u011d\6\uffff\1\u011e\11\uffff\1\u011f",
            "\1\u0121\2\uffff\1\u0120",
            "\1\u0124\14\uffff\1\u0122\2\uffff\1\u0123",
            "\1\u0125",
            "\1\u0126",
            "",
            "",
            "",
            "",
            "",
            "\1\u0127",
            "\1\u0128\6\uffff\1\u0129",
            "\1\u012b\1\u012a\3\uffff\1\u012c",
            "\1\u012d\13\uffff\1\u012e",
            "\1\u0130\3\uffff\1\u0131\10\uffff\1\u012f",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137\20\uffff\1\u0138\2\uffff\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "",
            "",
            "",
            "\1\u013e",
            "",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
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
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "\1\u0146",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0149",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u014b",
            "\1\u014c",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\23\33\1\u014e\6\33"+
            "\4\uffff\1\33\1\uffff\32\33",
            "\1\u0150",
            "\1\u0151",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\5\33\1\u0152\24\33"+
            "\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0155",
            "\1\u0156",
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
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a\14\uffff\1\u016b",
            "\1\u016c\1\uffff\1\u016d",
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
            "\1\u0178\1\u0179",
            "\1\u017a\20\uffff\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180\11\uffff\1\u0181",
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
            "\1\u018d\11\uffff\1\u018e",
            "\1\u018f\11\uffff\1\u0190",
            "\1\u0191",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0193",
            "",
            "",
            "\1\u0194",
            "",
            "\1\u0195",
            "\1\u0196",
            "",
            "\1\u0197",
            "",
            "\1\u0198",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "\1\u019b",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b7\17\uffff\1\u01b6",
            "\1\u01b8",
            "\1\u01b9",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u01bb",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u01bd\3\uffff\1\u01be",
            "\1\u01c0\20\uffff\1\u01bf",
            "\1\u01c1",
            "\1\u01c3\2\uffff\1\u01c2",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u01c8",
            "\1\u01c9",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd\7\uffff\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\16\33\1\u01e1\13\33"+
            "\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\22\33\1\u01e8\7\33"+
            "\4\uffff\1\33\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u01ec",
            "",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "",
            "\1\u01f1",
            "\1\u01f2",
            "",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "",
            "\1\u01ff",
            "",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0209",
            "",
            "\1\u020a",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\u020c",
            "\1\u020d",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0220",
            "",
            "\1\u0221",
            "",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0224",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
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
            "",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "",
            "\1\u0241",
            "\1\u0242",
            "",
            "\1\u0243",
            "\1\u0244",
            "",
            "\1\u0245",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0247",
            "",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0250",
            "\1\u0251",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0253",
            "",
            "",
            "\1\u0254",
            "",
            "\1\u0255",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0257",
            "\1\u0258",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u025a",
            "\1\u025b",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u025d",
            "\1\u025e",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0260",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0262",
            "\1\u0263",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0265",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0271",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0279",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u027e",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0281",
            "",
            "\1\u0282",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\u0284",
            "\1\u0285",
            "",
            "\1\u0286",
            "",
            "\1\u0287",
            "\1\u0288",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u028b",
            "\1\u028c",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u028f",
            "\1\u0290",
            "",
            "\1\u0291",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "\1\u0297",
            "",
            "",
            "\1\u0298",
            "\1\u0299",
            "",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u029e",
            "",
            "",
            "\1\u029f",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "\1\u02a1",
            "\1\u02a2",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u02a5",
            "\1\u02a6",
            "",
            "\1\u02a7",
            "\1\u02a8",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "",
            "\1\u02ad",
            "\1\u02ae",
            "",
            "\1\u02af",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u02b2",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "\1\u02bb",
            "",
            "",
            "",
            "\1\u02bc",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\u02c1",
            "",
            "",
            "",
            "",
            "\1\u02c2",
            "\2\33\2\uffff\3\33\1\uffff\12\33\7\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | WS | NEWLINE | ACHAR | DIGIT | TOKEN );";
        }
    }
 

}