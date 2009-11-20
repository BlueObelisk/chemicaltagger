// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g 2009-11-20 17:14:07
package uk.ac.cam.ch.wwmm.extractPhrases.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ChemicalChunkerLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int TOKEN=8;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int WS=4;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
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
    public static final int T__103=103;
    public static final int T__59=59;
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int ACHAR=6;
    public static final int T__35=35;
    public static final int NEWLINE=5;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;

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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:119:8: ( 'JJ' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:119:10: 'JJ'
            {
            match("JJ"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:120:8: ( 'NN' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:120:10: 'NN'
            {
            match("NN"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:121:8: ( 'NNS' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:121:10: 'NNS'
            {
            match("NNS"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:122:8: ( 'RB' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:122:10: 'RB'
            {
            match("RB"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:123:8: ( 'TO' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:123:10: 'TO'
            {
            match("TO"); 


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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:124:8: ( 'VBD' )
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:124:10: 'VBD'
            {
            match("VBD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

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
        // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | WS | NEWLINE | ACHAR | DIGIT | TOKEN )
        int alt5=121;
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
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:730: WS
                {
                mWS(); 

                }
                break;
            case 118 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:733: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 119 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:741: ACHAR
                {
                mACHAR(); 

                }
                break;
            case 120 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:747: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 121 :
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:1:753: TOKEN
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
        "\1\uffff\14\30\2\uffff\2\30\1\54\1\uffff\1\56\1\57\1\60\1\22\1\63"+
        "\1\uffff\1\22\1\65\1\67\1\72\2\22\1\77\1\22\1\103\1\22\1\105\5\22"+
        "\1\113\1\122\1\123\1\uffff\1\22\3\uffff\2\22\1\uffff\1\22\1\uffff"+
        "\1\22\1\uffff\1\22\1\154\1\uffff\1\155\1\22\1\175\1\22\1\uffff\1"+
        "\177\1\u0080\1\u0081\1\uffff\1\22\1\uffff\2\22\1\u0085\1\22\1\u0087"+
        "\1\uffff\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\2\uffff"+
        "\30\22\2\uffff\17\22\1\uffff\1\22\3\uffff\1\u00d3\1\u00d4\1\u00d5"+
        "\1\uffff\1\u00d6\1\uffff\1\u00d7\6\uffff\1\22\1\u00d9\1\u00da\1"+
        "\22\1\u00dc\2\22\1\u00df\1\u00e1\2\22\1\u00e5\1\u00e6\21\22\1\u00f8"+
        "\44\22\1\u0124\5\uffff\1\22\2\uffff\1\22\1\uffff\2\22\1\uffff\1"+
        "\22\1\uffff\1\22\1\u012b\1\u012c\2\uffff\1\22\1\u012e\10\22\1\u0137"+
        "\4\22\1\u013c\1\22\1\uffff\1\22\1\u013f\13\22\1\u014c\1\22\1\u014e"+
        "\7\22\1\u0159\2\22\1\u015c\20\22\1\uffff\4\22\1\u0172\1\u0174\2"+
        "\uffff\1\u0175\1\uffff\1\u0176\3\22\1\u017b\1\u017c\1\u017d\1\22"+
        "\1\uffff\4\22\1\uffff\2\22\1\uffff\14\22\1\uffff\1\22\1\uffff\4"+
        "\22\1\u0196\3\22\1\u019a\1\22\1\uffff\1\22\1\u019d\1\uffff\2\22"+
        "\1\u01a0\3\22\1\u01a4\7\22\1\u01ac\1\u01ad\3\22\1\u01b1\1\22\1\uffff"+
        "\1\22\3\uffff\1\u01b4\1\u01b5\1\22\1\u01b7\3\uffff\14\22\1\u01c4"+
        "\1\u01c5\12\22\1\uffff\3\22\1\uffff\2\22\1\uffff\2\22\1\uffff\1"+
        "\22\1\u01d8\1\22\1\uffff\7\22\2\uffff\1\u01e1\2\22\1\uffff\1\u01e4"+
        "\1\22\2\uffff\1\22\1\uffff\1\22\1\u01e8\2\22\1\u01eb\2\22\1\u01ee"+
        "\2\22\1\u01f1\1\22\2\uffff\1\u01f3\2\22\1\u01f6\1\22\1\u01f8\1\u01f9"+
        "\1\u01fa\7\22\1\u0202\1\22\1\u0204\1\uffff\4\22\1\u0209\1\u020a"+
        "\1\22\1\u020c\1\uffff\1\u020d\1\u020e\1\uffff\1\u020f\1\22\1\u0211"+
        "\1\uffff\1\u0212\1\22\1\uffff\1\22\1\u0215\1\uffff\2\22\1\uffff"+
        "\1\22\1\uffff\2\22\1\uffff\1\u021b\3\uffff\1\u021c\2\22\1\u021f"+
        "\1\u0220\2\22\1\uffff\1\22\1\uffff\1\u0224\3\22\2\uffff\1\u0228"+
        "\4\uffff\1\22\2\uffff\2\22\1\uffff\3\22\1\u022f\1\22\2\uffff\1\22"+
        "\1\u0232\2\uffff\2\22\1\u0235\1\uffff\1\u0236\2\22\1\uffff\2\22"+
        "\1\u023b\3\22\1\uffff\2\22\1\uffff\1\22\1\u0242\2\uffff\1\u0243"+
        "\1\22\1\u0245\1\u0246\1\uffff\1\u0247\4\22\1\u024c\2\uffff\1\22"+
        "\3\uffff\1\22\1\u024f\1\u0250\1\u0251\1\uffff\1\u0252\1\22\4\uffff"+
        "\1\22\1\u0255\1\uffff";
    static final String DFA5_eofS =
        "\u0256\uffff";
    static final String DFA5_minS =
        "\1\11\14\50\2\uffff\3\50\1\uffff\3\50\1\114\1\50\1\uffff\1\55\3"+
        "\50\1\107\1\55\1\50\1\114\1\50\1\123\1\50\1\117\1\121\1\102\1\121"+
        "\1\102\3\50\1\uffff\1\125\3\uffff\1\117\1\115\1\uffff\1\125\1\uffff"+
        "\1\101\1\uffff\1\101\1\50\1\uffff\1\50\1\101\1\50\1\123\1\uffff"+
        "\3\50\1\uffff\1\110\1\uffff\1\120\1\102\1\50\1\102\1\50\1\uffff"+
        "\6\50\2\uffff\2\116\1\101\1\116\1\106\1\105\1\116\2\111\1\106\1"+
        "\117\1\116\1\124\3\105\1\104\1\121\1\101\1\110\1\111\1\105\1\122"+
        "\1\105\2\uffff\1\123\1\110\1\124\1\104\1\105\1\111\1\122\1\130\1"+
        "\105\1\116\1\101\1\125\1\105\1\101\1\111\1\uffff\1\124\3\uffff\3"+
        "\50\1\uffff\1\50\1\uffff\1\50\6\uffff\1\111\2\50\1\111\1\50\1\124"+
        "\1\106\2\50\1\124\1\101\2\50\1\105\1\122\1\117\1\104\1\101\1\116"+
        "\2\115\1\101\1\116\1\114\1\124\1\130\1\115\1\117\1\104\1\120\1\50"+
        "\1\124\1\114\1\103\1\105\1\114\1\103\1\101\1\114\1\105\2\122\1\131"+
        "\1\115\1\105\1\101\1\116\1\102\1\111\1\116\1\104\1\120\1\117\1\107"+
        "\1\123\1\114\1\105\1\124\1\101\1\103\1\122\1\105\1\122\1\105\1\103"+
        "\1\111\1\105\1\50\5\uffff\1\103\2\uffff\1\103\1\uffff\1\105\1\117"+
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
        "\15\172\2\uffff\3\172\1\uffff\3\172\1\115\1\172\1\uffff\1\55\3\172"+
        "\1\107\1\104\1\172\1\130\1\172\1\123\1\172\1\117\1\121\1\102\1\121"+
        "\1\102\3\172\1\uffff\1\125\3\uffff\1\117\1\115\1\uffff\1\125\1\uffff"+
        "\1\127\1\uffff\1\126\1\172\1\uffff\1\172\1\131\1\172\1\123\1\uffff"+
        "\3\172\1\uffff\1\110\1\uffff\1\120\1\102\1\172\1\102\1\172\1\uffff"+
        "\6\172\2\uffff\2\116\1\101\1\116\1\123\1\131\1\116\2\111\1\126\1"+
        "\122\1\116\1\131\1\111\1\122\1\117\1\124\1\130\1\117\1\131\1\114"+
        "\1\125\1\122\1\105\2\uffff\1\123\1\117\1\131\1\120\1\122\1\111\1"+
        "\122\1\130\1\105\1\116\2\125\1\105\1\101\1\111\1\uffff\1\124\3\uffff"+
        "\3\172\1\uffff\1\172\1\uffff\1\172\6\uffff\1\111\2\172\1\111\1\172"+
        "\1\124\1\106\2\172\1\124\1\101\2\172\1\105\1\122\1\117\1\104\1\101"+
        "\1\116\2\115\1\101\1\116\1\114\1\124\1\130\1\115\1\117\1\104\1\120"+
        "\1\172\1\124\1\114\1\103\1\122\1\116\1\103\1\101\1\114\1\105\2\122"+
        "\1\131\1\115\1\105\1\101\1\117\1\123\1\111\1\116\1\104\1\120\1\131"+
        "\1\107\1\123\1\114\1\105\1\124\1\101\1\103\1\122\1\105\1\122\1\105"+
        "\1\115\1\123\1\105\1\172\5\uffff\1\103\2\uffff\1\103\1\uffff\1\105"+
        "\1\117\1\uffff\1\117\1\uffff\1\110\2\172\2\uffff\1\122\1\172\1\115"+
        "\1\105\2\124\1\105\1\120\1\115\1\105\1\172\1\110\1\124\1\117\1\125"+
        "\1\172\1\101\1\uffff\1\122\1\172\1\125\1\115\1\117\1\125\1\103\1"+
        "\114\1\123\1\124\1\123\1\111\1\103\1\172\1\117\1\172\1\122\1\124"+
        "\1\114\1\115\1\120\1\122\1\124\1\172\1\101\1\120\1\172\1\101\1\123"+
        "\1\124\1\101\1\122\1\124\1\122\1\124\1\103\1\111\1\116\2\117\1\124"+
        "\1\110\1\114\1\uffff\2\117\2\122\2\172\2\uffff\1\172\1\uffff\1\172"+
        "\1\122\1\105\1\110\3\172\1\122\1\uffff\1\117\1\125\1\123\1\116\1"+
        "\uffff\1\122\1\101\1\uffff\1\125\1\105\2\115\2\105\1\110\1\105\1"+
        "\123\1\111\1\106\1\105\1\uffff\1\126\1\uffff\2\107\1\101\1\105\1"+
        "\172\3\105\1\172\1\110\1\uffff\1\122\1\172\1\uffff\1\123\1\117\1"+
        "\172\1\105\1\124\1\101\1\172\1\105\2\111\1\106\1\103\2\126\2\172"+
        "\3\104\1\172\1\105\1\uffff\1\125\3\uffff\2\172\1\105\1\172\3\uffff"+
        "\1\101\1\104\1\122\1\120\1\124\1\101\1\103\1\115\1\116\1\101\2\116"+
        "\2\172\1\122\1\125\1\120\1\131\1\116\3\105\1\111\1\116\1\uffff\1"+
        "\122\1\103\1\116\1\uffff\1\105\1\101\1\uffff\1\123\1\114\1\uffff"+
        "\1\122\1\172\1\103\1\uffff\1\101\1\124\1\120\1\131\1\110\2\105\2"+
        "\uffff\1\172\2\105\1\uffff\1\172\1\124\2\uffff\1\123\1\uffff\1\114"+
        "\1\172\1\105\1\110\1\172\2\124\1\172\2\124\1\172\1\124\2\uffff\1"+
        "\172\1\122\1\111\1\172\1\124\3\172\1\116\1\124\1\107\1\124\1\104"+
        "\1\123\1\124\1\172\1\126\1\172\1\uffff\1\124\1\123\2\111\2\172\1"+
        "\122\1\172\1\uffff\2\172\1\uffff\1\172\1\111\1\172\1\uffff\1\172"+
        "\1\105\1\uffff\1\125\1\172\1\uffff\1\111\1\117\1\uffff\1\122\1\uffff"+
        "\1\105\1\124\1\uffff\1\172\3\uffff\1\172\1\122\1\105\2\172\1\111"+
        "\1\125\1\uffff\1\105\1\uffff\1\172\1\105\1\117\1\124\2\uffff\1\172"+
        "\4\uffff\1\132\2\uffff\1\122\1\123\1\uffff\1\124\1\107\1\101\1\172"+
        "\1\101\2\uffff\1\101\1\172\2\uffff\1\132\1\123\1\172\1\uffff\1\172"+
        "\1\116\1\101\1\uffff\2\105\1\172\1\131\1\122\1\124\1\uffff\2\124"+
        "\1\uffff\1\105\1\172\2\uffff\1\172\1\124\2\172\1\uffff\1\172\1\101"+
        "\3\105\1\172\2\uffff\1\105\3\uffff\1\120\3\172\1\uffff\1\172\1\110"+
        "\4\uffff\1\131\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\15\uffff\1\165\1\166\3\uffff\1\171\5\uffff\1\167\23\uffff\1\170"+
        "\1\uffff\1\1\1\2\1\50\2\uffff\1\154\1\uffff\1\163\1\uffff\1\156"+
        "\2\uffff\1\160\4\uffff\1\142\3\uffff\1\143\1\uffff\1\155\5\uffff"+
        "\1\162\6\uffff\1\144\1\157\30\uffff\1\161\1\127\17\uffff\1\164\1"+
        "\uffff\1\137\1\140\1\141\3\uffff\1\135\1\uffff\1\136\1\uffff\1\145"+
        "\1\147\1\150\1\151\1\152\1\153\104\uffff\1\130\1\131\1\133\1\134"+
        "\1\146\1\uffff\1\124\1\125\1\uffff\1\5\2\uffff\1\14\1\uffff\1\10"+
        "\3\uffff\1\16\1\17\21\uffff\1\32\53\uffff\1\126\6\uffff\1\15\1\24"+
        "\1\uffff\1\20\10\uffff\1\30\4\uffff\1\55\2\uffff\1\33\14\uffff\1"+
        "\76\1\uffff\1\51\12\uffff\1\57\2\uffff\1\75\25\uffff\1\11\1\uffff"+
        "\1\12\1\23\1\21\4\uffff\1\26\1\35\1\27\30\uffff\1\72\3\uffff\1\116"+
        "\2\uffff\1\62\2\uffff\1\63\3\uffff\1\103\7\uffff\1\121\1\122\3\uffff"+
        "\1\7\2\uffff\1\22\1\25\1\uffff\1\47\14\uffff\1\46\1\36\22\uffff"+
        "\1\65\10\uffff\1\123\2\uffff\1\6\3\uffff\1\40\2\uffff\1\41\2\uffff"+
        "\1\45\2\uffff\1\43\1\uffff\1\102\2\uffff\1\111\1\uffff\1\115\1\52"+
        "\1\60\7\uffff\1\73\1\uffff\1\101\4\uffff\1\110\1\112\1\uffff\1\114"+
        "\1\4\1\3\1\13\1\uffff\1\37\1\56\2\uffff\1\100\5\uffff\1\132\1\61"+
        "\2\uffff\1\54\1\64\3\uffff\1\77\3\uffff\1\113\6\uffff\1\42\2\uffff"+
        "\1\53\2\uffff\1\74\1\104\4\uffff\1\67\6\uffff\1\66\1\105\1\uffff"+
        "\1\120\1\31\1\34\4\uffff\1\117\2\uffff\1\71\1\107\1\70\1\106\2\uffff"+
        "\1\44";
    static final String DFA5_specialS =
        "\u0256\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\15\1\16\2\uffff\1\16\22\uffff\1\15\7\uffff\2\22\2\uffff\3"+
            "\22\1\uffff\12\21\7\uffff\1\6\1\13\1\1\1\7\4\17\1\3\1\14\1\17"+
            "\1\11\1\17\1\4\3\17\1\12\1\10\1\2\1\17\1\5\4\17\4\uffff\1\22"+
            "\1\uffff\32\20",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\2\22\1\27\1\23\5\22"+
            "\1\24\2\22\1\25\1\22\1\26\13\22\4\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\14\22\1\31\1\22\1"+
            "\32\13\22\4\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\15\22\1\33\14\22\4"+
            "\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\4\22\1\35\10\22\1"+
            "\34\14\22\4\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\1\22\1\36\30\22\4"+
            "\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\1\22\1\40\15\22\1"+
            "\37\3\22\1\41\6\22\4\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\1\42\22\22\1\43\6"+
            "\22\4\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\23\22\1\44\6\22\4"+
            "\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\21\22\1\46\1\45\7"+
            "\22\4\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\1\22\1\51\17\22\1"+
            "\50\1\47\7\22\4\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\4\22\1\52\25\22\4"+
            "\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\11\22\1\53\20\22\4"+
            "\uffff\1\22\1\uffff\32\22",
            "",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\1\22\1\55\1\22\1\uffff\12\22\7\uffff\32\22\4"+
            "\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\61\1\62",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\1\64",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\1\22\1\66\1\22\1\uffff\12\22\7\uffff\32\22\4"+
            "\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\1\22\1\70\1\22\1\uffff\12\22\7\uffff\22\22\1"+
            "\71\7\22\4\uffff\1\22\1\uffff\32\22",
            "\1\73",
            "\1\74\26\uffff\1\75",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\16\22\1\76\13\22\4"+
            "\uffff\1\22\1\uffff\32\22",
            "\1\100\1\uffff\1\101\11\uffff\1\102",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\104",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\3\22\1\114\2\22\1"+
            "\115\5\22\1\116\1\117\3\22\1\120\7\22\1\121\4\uffff\1\22\1\uffff"+
            "\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\1\124",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "",
            "\1\130\1\131\3\uffff\1\136\2\uffff\1\132\5\uffff\1\135\5\uffff"+
            "\1\137\1\134\1\133",
            "",
            "\1\144\1\uffff\1\147\1\152\1\145\1\150\1\142\5\uffff\1\143"+
            "\2\uffff\1\151\1\uffff\1\153\1\140\1\141\1\uffff\1\146",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\161\1\uffff\1\157\1\162\1\165\1\163\1\uffff\1\166\1\167"+
            "\6\uffff\1\170\1\171\1\172\1\160\1\164\1\156\1\uffff\1\173\1"+
            "\uffff\1\174",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\176",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0086",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\31\22\1\u0088\4\uffff"+
            "\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0094\14\uffff\1\u0093",
            "\1\u0095\23\uffff\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a\7\uffff\1\u009b\7\uffff\1\u009c",
            "\1\u009d\2\uffff\1\u009e",
            "\1\u009f",
            "\1\u00a0\4\uffff\1\u00a1",
            "\1\u00a3\3\uffff\1\u00a2",
            "\1\u00a5\14\uffff\1\u00a4",
            "\1\u00a7\3\uffff\1\u00a8\5\uffff\1\u00a6",
            "\1\u00ab\10\uffff\1\u00aa\2\uffff\1\u00ac\3\uffff\1\u00a9",
            "\1\u00ad\6\uffff\1\u00ae",
            "\1\u00b0\15\uffff\1\u00af",
            "\1\u00b1\6\uffff\1\u00b2\11\uffff\1\u00b3",
            "\1\u00b5\2\uffff\1\u00b4",
            "\1\u00b8\14\uffff\1\u00b6\2\uffff\1\u00b7",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "\1\u00bb",
            "\1\u00bc\6\uffff\1\u00bd",
            "\1\u00bf\1\u00be\3\uffff\1\u00c0",
            "\1\u00c1\13\uffff\1\u00c2",
            "\1\u00c4\3\uffff\1\u00c5\10\uffff\1\u00c3",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb\20\uffff\1\u00cc\2\uffff\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "",
            "",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d8",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u00db",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u00dd",
            "\1\u00de",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\23\22\1\u00e0\6\22"+
            "\4\uffff\1\22\1\uffff\32\22",
            "\1\u00e2",
            "\1\u00e3",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\5\22\1\u00e4\24\22"+
            "\4\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc\14\uffff\1\u00fd",
            "\1\u00fe\1\uffff\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a\1\u010b",
            "\1\u010c\20\uffff\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112\11\uffff\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f\11\uffff\1\u0120",
            "\1\u0121\11\uffff\1\u0122",
            "\1\u0123",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "",
            "",
            "",
            "",
            "\1\u0125",
            "",
            "",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "",
            "\1\u012a",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "",
            "\1\u012d",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u013d",
            "",
            "\1\u013e",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0149\17\uffff\1\u0148",
            "\1\u014a",
            "\1\u014b",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u014d",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u014f\3\uffff\1\u0150",
            "\1\u0152\20\uffff\1\u0151",
            "\1\u0153",
            "\1\u0155\2\uffff\1\u0154",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u015a",
            "\1\u015b",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f\7\uffff\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\16\22\1\u0173\13\22"+
            "\4\uffff\1\22\1\uffff\32\22",
            "",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\22\22\1\u017a\7\22"+
            "\4\uffff\1\22\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u017e",
            "",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "\1\u0183",
            "\1\u0184",
            "",
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
            "\1\u018f",
            "\1\u0190",
            "",
            "\1\u0191",
            "",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u019b",
            "",
            "\1\u019c",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\1\u019e",
            "\1\u019f",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01b2",
            "",
            "\1\u01b3",
            "",
            "",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01b6",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "",
            "",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "",
            "\1\u01d3",
            "\1\u01d4",
            "",
            "\1\u01d5",
            "\1\u01d6",
            "",
            "\1\u01d7",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01d9",
            "",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01e2",
            "\1\u01e3",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01e5",
            "",
            "",
            "\1\u01e6",
            "",
            "\1\u01e7",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01e9",
            "\1\u01ea",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01ec",
            "\1\u01ed",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01ef",
            "\1\u01f0",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01f2",
            "",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01f4",
            "\1\u01f5",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01f7",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0203",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u020b",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0210",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0213",
            "",
            "\1\u0214",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\1\u0216",
            "\1\u0217",
            "",
            "\1\u0218",
            "",
            "\1\u0219",
            "\1\u021a",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u021d",
            "\1\u021e",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0221",
            "\1\u0222",
            "",
            "\1\u0223",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "",
            "",
            "",
            "\1\u0229",
            "",
            "",
            "\1\u022a",
            "\1\u022b",
            "",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0230",
            "",
            "",
            "\1\u0231",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "",
            "\1\u0233",
            "\1\u0234",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0237",
            "\1\u0238",
            "",
            "\1\u0239",
            "\1\u023a",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "",
            "\1\u023f",
            "\1\u0240",
            "",
            "\1\u0241",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0244",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "",
            "\1\u024d",
            "",
            "",
            "",
            "\1\u024e",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
            "\1\u0253",
            "",
            "",
            "",
            "",
            "\1\u0254",
            "\2\22\2\uffff\3\22\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | WS | NEWLINE | ACHAR | DIGIT | TOKEN );";
        }
    }
 

}