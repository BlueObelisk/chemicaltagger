// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g 2009-11-19 11:20:23
package uk.ac.cam.ch.wwmm.extractPhrases;

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
    public String getGrammarFileName() { return "C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:5:6: ( 'DT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:5:8: 'DT'
            {
            match("DT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:6:7: ( 'VBD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:6:9: 'VBD'
            {
            match("VBD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:7:7: ( 'CC' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:7:9: 'CC'
            {
            match("CC"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:8:7: ( 'TO' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:8:9: 'TO'
            {
            match("TO"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:9:7: ( 'NN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:9:9: 'NN'
            {
            match("NN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:10:7: ( 'PPN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:10:9: 'PPN'
            {
            match("PPN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:11:7: ( 'VB' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:11:9: 'VB'
            {
            match("VB"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:12:7: ( 'OSCAR-CD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:12:9: 'OSCAR-CD'
            {
            match("OSCAR-CD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:13:7: ( 'OSCAR-CJ' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:13:9: 'OSCAR-CJ'
            {
            match("OSCAR-CJ"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:14:7: ( 'TM-UNICODE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:14:9: 'TM-UNICODE'
            {
            match("TM-UNICODE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:15:7: ( 'CD-UNICODE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:15:9: 'CD-UNICODE'
            {
            match("CD-UNICODE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:16:7: ( 'IN-AS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:16:9: 'IN-AS'
            {
            match("IN-AS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:17:7: ( 'IN-BEFORE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:17:9: 'IN-BEFORE'
            {
            match("IN-BEFORE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:18:7: ( 'IN-AFTER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:18:9: 'IN-AFTER'
            {
            match("IN-AFTER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:19:7: ( 'IN-IN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:19:9: 'IN-IN'
            {
            match("IN-IN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:20:7: ( 'IN-INTO' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:20:9: 'IN-INTO'
            {
            match("IN-INTO"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:21:7: ( 'IN-WITH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:21:9: 'IN-WITH'
            {
            match("IN-WITH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:22:7: ( 'IN-WITHOUT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:22:9: 'IN-WITHOUT'
            {
            match("IN-WITHOUT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:23:7: ( 'IN-BY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:23:9: 'IN-BY'
            {
            match("IN-BY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:24:7: ( 'IN-VIA' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:24:9: 'IN-VIA'
            {
            match("IN-VIA"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:25:7: ( 'IN-OF' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:25:9: 'IN-OF'
            {
            match("IN-OF"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:26:7: ( 'IN-ON' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:26:9: 'IN-ON'
            {
            match("IN-ON"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:27:7: ( 'IN-FOR' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:27:9: 'IN-FOR'
            {
            match("IN-FOR"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:28:7: ( 'IN-FROM' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:28:9: 'IN-FROM'
            {
            match("IN-FROM"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:29:7: ( 'IN-UNDER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:29:9: 'IN-UNDER'
            {
            match("IN-UNDER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:30:7: ( 'IN-OVER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:30:9: 'IN-OVER'
            {
            match("IN-OVER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:31:7: ( 'IN-OFF' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:31:9: 'IN-OFF'
            {
            match("IN-OFF"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:32:7: ( 'NN-STATE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:32:9: 'NN-STATE'
            {
            match("NN-STATE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:33:7: ( 'NN-TIME' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:33:9: 'NN-TIME'
            {
            match("NN-TIME"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:34:7: ( 'CD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:34:9: 'CD'
            {
            match("CD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:35:7: ( 'NN-GRAM' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:35:9: 'NN-GRAM'
            {
            match("NN-GRAM"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:36:7: ( 'NN-MOL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:36:9: 'NN-MOL'
            {
            match("NN-MOL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:37:7: ( 'NN-ATMOSPHERE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:37:9: 'NN-ATMOSPHERE'
            {
            match("NN-ATMOSPHERE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:38:7: ( 'NN-EQ' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:38:9: 'NN-EQ'
            {
            match("NN-EQ"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:39:7: ( 'NN-VOL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:39:9: 'NN-VOL'
            {
            match("NN-VOL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:40:7: ( 'NN-TEMP' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:40:9: 'NN-TEMP'
            {
            match("NN-TEMP"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:41:7: ( 'NN-FLASH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:41:9: 'NN-FLASH'
            {
            match("NN-FLASH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:42:7: ( 'NN-GENERAL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:42:9: 'NN-GENERAL'
            {
            match("NN-GENERAL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:43:7: ( 'NN-METHOD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:43:9: 'NN-METHOD'
            {
            match("NN-METHOD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:44:7: ( 'NN-AMOUNT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:44:9: 'NN-AMOUNT'
            {
            match("NN-AMOUNT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:45:7: ( 'NN-PRESSURE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:45:9: 'NN-PRESSURE'
            {
            match("NN-PRESSURE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:46:7: ( 'NN-COLUMN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:46:9: 'NN-COLUMN'
            {
            match("NN-COLUMN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:47:7: ( 'NN-CHROMATOGRAPHY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:47:9: 'NN-CHROMATOGRAPHY'
            {
            match("NN-CHROMATOGRAPHY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:48:7: ( 'NN-VACUUM' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:48:9: 'NN-VACUUM'
            {
            match("NN-VACUUM"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:49:7: ( 'NN-CYCLE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:49:9: 'NN-CYCLE'
            {
            match("NN-CYCLE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:50:7: ( 'NN-TIMES' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:50:9: 'NN-TIMES'
            {
            match("NN-TIMES"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:51:7: ( 'NN-CHEMENTITY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:51:9: 'NN-CHEMENTITY'
            {
            match("NN-CHEMENTITY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:52:7: ( 'CM' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:52:9: 'CM'
            {
            match("CM"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:7: ( 'VB-USE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:9: 'VB-USE'
            {
            match("VB-USE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:54:7: ( 'VB-CHANGE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:54:9: 'VB-CHANGE'
            {
            match("VB-CHANGE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:55:7: ( 'VB-SUBMERGE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:55:9: 'VB-SUBMERGE'
            {
            match("VB-SUBMERGE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:56:7: ( 'VB-SUBJECT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:56:9: 'VB-SUBJECT'
            {
            match("VB-SUBJECT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:57:7: ( 'JJ' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:57:9: 'JJ'
            {
            match("JJ"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:58:7: ( 'NN-ADD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:58:9: 'NN-ADD'
            {
            match("NN-ADD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:59:7: ( 'NN-MIXTURE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:59:9: 'NN-MIXTURE'
            {
            match("NN-MIXTURE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:60:7: ( 'VB-ADD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:60:9: 'VB-ADD'
            {
            match("VB-ADD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:61:7: ( 'VB-CHARGE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:61:9: 'VB-CHARGE'
            {
            match("VB-CHARGE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:62:7: ( 'VB-CONTAIN' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:62:9: 'VB-CONTAIN'
            {
            match("VB-CONTAIN"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:63:7: ( 'VB-DROP' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:63:9: 'VB-DROP'
            {
            match("VB-DROP"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:64:7: ( 'VB-FILL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:64:9: 'VB-FILL'
            {
            match("VB-FILL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:65:7: ( 'VB-SUSPEND' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:65:9: 'VB-SUSPEND'
            {
            match("VB-SUSPEND"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:66:7: ( 'VB-TREAT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:66:9: 'VB-TREAT'
            {
            match("VB-TREAT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:67:7: ( 'VB-APPARATUS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:67:9: 'VB-APPARATUS'
            {
            match("VB-APPARATUS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:68:7: ( 'NN-APPARATUS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:68:9: 'NN-APPARATUS'
            {
            match("NN-APPARATUS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:69:7: ( 'VB-CONCENTRATE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:69:9: 'VB-CONCENTRATE'
            {
            match("VB-CONCENTRATE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:70:7: ( 'NN-CONCENTRATE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:70:9: 'NN-CONCENTRATE'
            {
            match("NN-CONCENTRATE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:71:7: ( 'VB-COOL' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:71:9: 'VB-COOL'
            {
            match("VB-COOL"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:72:7: ( 'VB-DEGASS' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:72:9: 'VB-DEGASS'
            {
            match("VB-DEGASS"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:73:7: ( 'VB-DISSOLVE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:73:9: 'VB-DISSOLVE'
            {
            match("VB-DISSOLVE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:74:7: ( 'VB-DRY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:74:9: 'VB-DRY'
            {
            match("VB-DRY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:75:7: ( 'NN-DRY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:75:9: 'NN-DRY'
            {
            match("NN-DRY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:76:7: ( 'VB-EXTRACT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:76:9: 'VB-EXTRACT'
            {
            match("VB-EXTRACT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:77:7: ( 'NN-EXTRACT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:77:9: 'NN-EXTRACT'
            {
            match("NN-EXTRACT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:78:7: ( 'VB-FILTER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:78:9: 'VB-FILTER'
            {
            match("VB-FILTER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:79:7: ( 'NN-FILTER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:79:9: 'NN-FILTER'
            {
            match("NN-FILTER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:80:7: ( 'VB-HEAT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:80:9: 'VB-HEAT'
            {
            match("VB-HEAT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:81:7: ( 'VB-INCREASE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:81:9: 'VB-INCREASE'
            {
            match("VB-INCREASE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:82:7: ( 'VB-PARTITION' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:82:9: 'VB-PARTITION'
            {
            match("VB-PARTITION"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:83:7: ( 'VB-PRECIPITATE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:83:9: 'VB-PRECIPITATE'
            {
            match("VB-PRECIPITATE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:84:7: ( 'NN-PRECIPITATE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:84:9: 'NN-PRECIPITATE'
            {
            match("NN-PRECIPITATE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:85:7: ( 'VB-PURIFY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:85:9: 'VB-PURIFY'
            {
            match("VB-PURIFY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:86:7: ( 'NN-PURIFY' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:86:9: 'NN-PURIFY'
            {
            match("NN-PURIFY"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:87:7: ( 'VB-QUENCH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:87:9: 'VB-QUENCH'
            {
            match("VB-QUENCH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:88:7: ( 'VB-RECOVER' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:88:9: 'VB-RECOVER'
            {
            match("VB-RECOVER"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:89:7: ( 'VB-REMOVE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:89:9: 'VB-REMOVE'
            {
            match("VB-REMOVE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:90:7: ( 'NN-REMOVE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:90:9: 'NN-REMOVE'
            {
            match("NN-REMOVE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:91:7: ( 'VB-STIR' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:91:9: 'VB-STIR'
            {
            match("VB-STIR"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:92:7: ( 'VB-SYNTHESIZE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:92:9: 'VB-SYNTHESIZE'
            {
            match("VB-SYNTHESIZE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:93:7: ( 'NN-SYNTHESIZE' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:93:9: 'NN-SYNTHESIZE'
            {
            match("NN-SYNTHESIZE"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:94:7: ( 'VB-WAIT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:94:9: 'VB-WAIT'
            {
            match("VB-WAIT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:95:7: ( 'VB-WASH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:95:9: 'VB-WASH'
            {
            match("VB-WASH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:96:8: ( 'VB-YIELD' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:96:10: 'VB-YIELD'
            {
            match("VB-YIELD"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:97:8: ( 'RB' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:97:10: 'RB'
            {
            match("RB"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:98:8: ( 'COLON' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:98:10: 'COLON'
            {
            match("COLON"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:99:8: ( 'COMMA' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:99:10: 'COMMA'
            {
            match("COMMA"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:100:8: ( 'APOST' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:100:10: 'APOST'
            {
            match("APOST"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:101:8: ( 'NEG' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:101:10: 'NEG'
            {
            match("NEG"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:102:8: ( 'DASH' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:102:10: 'DASH'
            {
            match("DASH"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:103:8: ( 'STOP' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:103:10: 'STOP'
            {
            match("STOP"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:104:8: ( 'NN-PERCENT' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:104:10: 'NN-PERCENT'
            {
            match("NN-PERCENT"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:105:8: ( 'LSQB' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:105:10: 'LSQB'
            {
            match("LSQB"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:106:8: ( 'RSQB' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:106:10: 'RSQB'
            {
            match("RSQB"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:107:8: ( '-LRB-' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:107:10: '-LRB-'
            {
            match("-LRB-"); 


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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:108:8: ( '-RRB-' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:108:10: '-RRB-'
            {
            match("-RRB-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:44:4: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:44:7: ( ' ' | '\\t' )+
            {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:44:7: ( ' ' | '\\t' )+
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
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:
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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:45:9: ( ( '\\r' )? '\\n' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:45:11: ( '\\r' )? '\\n'
            {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:45:11: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:45:11: '\\r'
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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:48:7: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) )
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
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:48:9: ( 'A' .. 'Z' )
                    {
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:48:9: ( 'A' .. 'Z' )
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:48:10: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:48:22: ( 'a' .. 'z' )
                    {
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:48:22: ( 'a' .. 'z' )
                    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:48:23: 'a' .. 'z'
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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:51:7: ( ( '0' .. '9' ) )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:51:9: ( '0' .. '9' )
            {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:51:9: ( '0' .. '9' )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:51:10: '0' .. '9'
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
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:7: ( ( ACHAR | '_' | ',' | '.' | ')' | '(' | '-' | DIGIT )+ )
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:9: ( ACHAR | '_' | ',' | '.' | ')' | '(' | '-' | DIGIT )+
            {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:9: ( ACHAR | '_' | ',' | '.' | ')' | '(' | '-' | DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=9;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:10: ACHAR
            	    {
            	    mACHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:17: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:21: ','
            	    {
            	    match(','); 

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:26: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:30: ')'
            	    {
            	    match(')'); 

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:34: '('
            	    {
            	    match('('); 

            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:38: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:53:42: DIGIT
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
        // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | WS | NEWLINE | ACHAR | DIGIT | TOKEN )
        int alt5=109;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:117: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:123: T__28
                {
                mT__28(); 

                }
                break;
            case 21 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:129: T__29
                {
                mT__29(); 

                }
                break;
            case 22 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:135: T__30
                {
                mT__30(); 

                }
                break;
            case 23 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:141: T__31
                {
                mT__31(); 

                }
                break;
            case 24 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:147: T__32
                {
                mT__32(); 

                }
                break;
            case 25 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:153: T__33
                {
                mT__33(); 

                }
                break;
            case 26 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:159: T__34
                {
                mT__34(); 

                }
                break;
            case 27 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:165: T__35
                {
                mT__35(); 

                }
                break;
            case 28 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:171: T__36
                {
                mT__36(); 

                }
                break;
            case 29 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:177: T__37
                {
                mT__37(); 

                }
                break;
            case 30 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:183: T__38
                {
                mT__38(); 

                }
                break;
            case 31 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:189: T__39
                {
                mT__39(); 

                }
                break;
            case 32 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:195: T__40
                {
                mT__40(); 

                }
                break;
            case 33 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:201: T__41
                {
                mT__41(); 

                }
                break;
            case 34 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:207: T__42
                {
                mT__42(); 

                }
                break;
            case 35 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:213: T__43
                {
                mT__43(); 

                }
                break;
            case 36 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:219: T__44
                {
                mT__44(); 

                }
                break;
            case 37 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:225: T__45
                {
                mT__45(); 

                }
                break;
            case 38 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:231: T__46
                {
                mT__46(); 

                }
                break;
            case 39 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:237: T__47
                {
                mT__47(); 

                }
                break;
            case 40 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:243: T__48
                {
                mT__48(); 

                }
                break;
            case 41 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:249: T__49
                {
                mT__49(); 

                }
                break;
            case 42 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:255: T__50
                {
                mT__50(); 

                }
                break;
            case 43 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:261: T__51
                {
                mT__51(); 

                }
                break;
            case 44 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:267: T__52
                {
                mT__52(); 

                }
                break;
            case 45 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:273: T__53
                {
                mT__53(); 

                }
                break;
            case 46 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:279: T__54
                {
                mT__54(); 

                }
                break;
            case 47 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:285: T__55
                {
                mT__55(); 

                }
                break;
            case 48 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:291: T__56
                {
                mT__56(); 

                }
                break;
            case 49 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:297: T__57
                {
                mT__57(); 

                }
                break;
            case 50 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:303: T__58
                {
                mT__58(); 

                }
                break;
            case 51 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:309: T__59
                {
                mT__59(); 

                }
                break;
            case 52 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:315: T__60
                {
                mT__60(); 

                }
                break;
            case 53 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:321: T__61
                {
                mT__61(); 

                }
                break;
            case 54 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:327: T__62
                {
                mT__62(); 

                }
                break;
            case 55 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:333: T__63
                {
                mT__63(); 

                }
                break;
            case 56 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:339: T__64
                {
                mT__64(); 

                }
                break;
            case 57 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:345: T__65
                {
                mT__65(); 

                }
                break;
            case 58 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:351: T__66
                {
                mT__66(); 

                }
                break;
            case 59 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:357: T__67
                {
                mT__67(); 

                }
                break;
            case 60 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:363: T__68
                {
                mT__68(); 

                }
                break;
            case 61 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:369: T__69
                {
                mT__69(); 

                }
                break;
            case 62 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:375: T__70
                {
                mT__70(); 

                }
                break;
            case 63 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:381: T__71
                {
                mT__71(); 

                }
                break;
            case 64 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:387: T__72
                {
                mT__72(); 

                }
                break;
            case 65 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:393: T__73
                {
                mT__73(); 

                }
                break;
            case 66 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:399: T__74
                {
                mT__74(); 

                }
                break;
            case 67 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:405: T__75
                {
                mT__75(); 

                }
                break;
            case 68 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:411: T__76
                {
                mT__76(); 

                }
                break;
            case 69 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:417: T__77
                {
                mT__77(); 

                }
                break;
            case 70 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:423: T__78
                {
                mT__78(); 

                }
                break;
            case 71 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:429: T__79
                {
                mT__79(); 

                }
                break;
            case 72 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:435: T__80
                {
                mT__80(); 

                }
                break;
            case 73 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:441: T__81
                {
                mT__81(); 

                }
                break;
            case 74 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:447: T__82
                {
                mT__82(); 

                }
                break;
            case 75 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:453: T__83
                {
                mT__83(); 

                }
                break;
            case 76 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:459: T__84
                {
                mT__84(); 

                }
                break;
            case 77 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:465: T__85
                {
                mT__85(); 

                }
                break;
            case 78 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:471: T__86
                {
                mT__86(); 

                }
                break;
            case 79 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:477: T__87
                {
                mT__87(); 

                }
                break;
            case 80 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:483: T__88
                {
                mT__88(); 

                }
                break;
            case 81 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:489: T__89
                {
                mT__89(); 

                }
                break;
            case 82 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:495: T__90
                {
                mT__90(); 

                }
                break;
            case 83 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:501: T__91
                {
                mT__91(); 

                }
                break;
            case 84 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:507: T__92
                {
                mT__92(); 

                }
                break;
            case 85 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:513: T__93
                {
                mT__93(); 

                }
                break;
            case 86 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:519: T__94
                {
                mT__94(); 

                }
                break;
            case 87 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:525: T__95
                {
                mT__95(); 

                }
                break;
            case 88 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:531: T__96
                {
                mT__96(); 

                }
                break;
            case 89 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:537: T__97
                {
                mT__97(); 

                }
                break;
            case 90 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:543: T__98
                {
                mT__98(); 

                }
                break;
            case 91 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:549: T__99
                {
                mT__99(); 

                }
                break;
            case 92 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:555: T__100
                {
                mT__100(); 

                }
                break;
            case 93 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:562: T__101
                {
                mT__101(); 

                }
                break;
            case 94 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:569: T__102
                {
                mT__102(); 

                }
                break;
            case 95 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:576: T__103
                {
                mT__103(); 

                }
                break;
            case 96 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:583: T__104
                {
                mT__104(); 

                }
                break;
            case 97 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:590: T__105
                {
                mT__105(); 

                }
                break;
            case 98 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:597: T__106
                {
                mT__106(); 

                }
                break;
            case 99 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:604: T__107
                {
                mT__107(); 

                }
                break;
            case 100 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:611: T__108
                {
                mT__108(); 

                }
                break;
            case 101 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:618: T__109
                {
                mT__109(); 

                }
                break;
            case 102 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:625: T__110
                {
                mT__110(); 

                }
                break;
            case 103 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:632: T__111
                {
                mT__111(); 

                }
                break;
            case 104 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:639: T__112
                {
                mT__112(); 

                }
                break;
            case 105 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:646: WS
                {
                mWS(); 

                }
                break;
            case 106 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:649: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 107 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:657: ACHAR
                {
                mACHAR(); 

                }
                break;
            case 108 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:663: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 109 :
                // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:1:669: TOKEN
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
            "\1\7\1\6\2\uffff\1\4\1\10\1\5\1\uffff\12\11\7\uffff\32\2\4"+
            "\uffff\1\3\1\uffff\32\2",
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
            return "()+ loopback of 53:9: ( ACHAR | '_' | ',' | '.' | ')' | '(' | '-' | DIGIT )+";
        }
    }
    static final String DFA5_eotS =
        "\1\uffff\15\27\1\24\2\uffff\2\27\1\54\1\uffff\1\55\1\24\1\uffff"+
        "\1\61\1\62\1\64\1\65\1\24\1\70\1\24\1\73\4\24\1\100\1\101\6\24\2"+
        "\uffff\1\24\1\111\1\24\2\uffff\1\24\2\uffff\2\24\1\uffff\2\24\1"+
        "\uffff\1\151\1\152\2\24\2\uffff\6\24\1\172\1\uffff\37\24\2\uffff"+
        "\11\24\1\u00bf\1\24\1\u00c1\1\u00c2\2\24\1\uffff\30\24\1\u00e2\1"+
        "\u00e3\16\24\1\u00f2\16\24\1\u0103\2\24\1\u0106\1\u0108\2\24\1\u010c"+
        "\1\u010d\4\24\1\uffff\1\u0112\2\uffff\1\u0113\1\u0114\1\u0115\7"+
        "\24\1\u0120\2\24\1\u0123\21\24\2\uffff\7\24\1\u013d\4\24\1\u0142"+
        "\1\24\1\uffff\1\24\1\u0145\13\24\1\u0152\2\24\1\uffff\2\24\1\uffff"+
        "\1\24\1\uffff\1\24\1\u0159\1\u015a\2\uffff\1\24\1\u015c\2\24\4\uffff"+
        "\4\24\1\u0163\3\24\1\u0167\1\24\1\uffff\1\24\1\u016a\1\uffff\2\24"+
        "\1\u016d\3\24\1\u0171\7\24\1\u0179\1\u017a\5\24\1\u0181\1\u0182"+
        "\1\u0183\1\24\1\uffff\4\24\1\uffff\2\24\1\uffff\14\24\1\uffff\4"+
        "\24\1\u019c\1\u019e\2\uffff\1\u019f\1\uffff\1\u01a0\5\24\1\uffff"+
        "\3\24\1\uffff\2\24\1\uffff\2\24\1\uffff\1\24\1\u01ae\1\24\1\uffff"+
        "\7\24\2\uffff\1\u01b7\2\24\1\u01ba\1\24\1\u01bc\3\uffff\10\24\1"+
        "\u01c5\11\24\1\u01cf\1\24\1\u01d1\1\u01d2\1\u01d3\1\24\1\uffff\1"+
        "\24\3\uffff\1\u01d6\1\u01d7\1\u01d8\7\24\1\u01e0\1\24\1\u01e2\1"+
        "\uffff\4\24\1\u01e7\1\u01e8\1\24\1\u01ea\1\uffff\2\24\1\uffff\1"+
        "\24\1\uffff\1\24\1\u01ef\2\24\1\u01f2\2\24\1\u01f5\1\uffff\1\u01f6"+
        "\2\24\1\u01f9\1\24\1\u01fb\3\24\1\uffff\1\u01ff\3\uffff\1\u0200"+
        "\1\24\3\uffff\1\u0202\2\24\1\u0205\1\u0206\2\24\1\uffff\1\24\1\uffff"+
        "\1\u020a\3\24\2\uffff\1\u020e\1\uffff\1\u020f\1\u0210\1\24\1\u0212"+
        "\1\uffff\1\u0213\1\24\1\uffff\1\24\1\u0216\2\uffff\2\24\1\uffff"+
        "\1\u0219\1\uffff\3\24\2\uffff\1\u021d\1\uffff\1\24\1\u021f\2\uffff"+
        "\2\24\1\u0222\1\uffff\1\u0223\2\24\3\uffff\1\24\2\uffff\2\24\1\uffff"+
        "\1\u0229\1\24\1\uffff\3\24\1\uffff\1\24\1\uffff\1\24\1\u0230\2\uffff"+
        "\1\u0231\3\24\1\u0235\1\uffff\5\24\1\u023b\2\uffff\1\24\1\u023d"+
        "\1\u023e\1\uffff\3\24\1\u0242\1\u0243\1\uffff\1\u0244\2\uffff\1"+
        "\u0245\1\u0246\1\24\5\uffff\2\24\1\u024a\1\uffff";
    static final String DFA5_eofS =
        "\u024b\uffff";
    static final String DFA5_minS =
        "\1\11\15\50\1\114\2\uffff\3\50\1\uffff\1\50\1\123\1\uffff\4\50"+
        "\1\114\1\50\1\55\1\50\1\107\1\116\1\103\1\55\2\50\1\121\2\117\1"+
        "\121\2\122\2\uffff\1\110\1\50\1\101\2\uffff\1\125\2\uffff\1\117"+
        "\1\115\1\uffff\1\125\1\101\1\uffff\2\50\2\101\2\uffff\1\102\1\123"+
        "\1\120\3\102\1\50\1\uffff\1\123\1\110\1\124\1\104\1\105\1\111\1"+
        "\122\1\130\1\105\1\116\1\101\1\125\1\105\1\101\1\111\2\116\1\101"+
        "\1\116\1\124\3\105\1\104\1\121\1\101\1\111\1\105\1\110\1\122\1\105"+
        "\2\uffff\1\122\1\106\1\105\1\116\2\111\1\106\1\117\1\116\1\50\1"+
        "\124\2\50\2\55\1\uffff\1\105\1\101\1\116\1\102\1\111\1\116\1\104"+
        "\1\120\1\117\1\107\1\123\1\114\1\105\1\124\1\101\1\103\1\122\1\105"+
        "\1\122\1\105\1\103\1\111\1\105\1\111\2\50\1\111\1\101\1\116\2\115"+
        "\1\101\1\116\1\114\1\124\1\130\1\115\1\117\1\104\1\120\1\50\1\124"+
        "\1\114\1\103\1\101\1\114\1\105\2\122\1\114\1\105\1\103\1\131\1\115"+
        "\1\55\1\50\1\124\1\106\2\50\1\124\1\101\2\50\1\105\1\122\1\117\1"+
        "\104\1\uffff\1\50\2\uffff\3\50\1\116\1\103\1\114\1\112\1\120\1\122"+
        "\1\124\1\50\1\101\1\120\1\50\1\101\1\123\1\114\1\101\1\122\1\124"+
        "\1\122\1\124\1\103\1\111\1\116\2\117\1\124\1\110\1\114\1\103\2\uffff"+
        "\1\103\2\124\1\105\1\120\1\115\1\105\1\50\1\110\1\124\1\117\1\125"+
        "\1\50\1\101\1\uffff\1\122\1\50\1\125\1\123\1\124\1\103\1\111\1\103"+
        "\1\125\1\103\1\117\1\115\1\114\1\50\1\117\1\103\1\uffff\1\105\1"+
        "\117\1\uffff\1\117\1\uffff\1\110\2\50\2\uffff\1\122\1\50\1\115\1"+
        "\105\4\uffff\2\107\1\101\1\105\1\50\3\105\1\50\1\110\1\uffff\1\122"+
        "\1\50\1\uffff\1\123\1\117\1\50\1\105\1\124\1\101\1\50\1\105\2\111"+
        "\1\106\1\103\2\126\2\50\1\104\2\117\1\105\1\110\3\50\1\122\1\uffff"+
        "\1\117\1\125\1\123\1\116\1\uffff\1\122\1\101\1\uffff\1\125\1\110"+
        "\1\105\1\123\1\111\1\106\1\105\1\115\1\105\1\115\2\105\1\uffff\1"+
        "\126\1\104\2\122\2\50\2\uffff\1\50\1\uffff\1\50\1\122\2\105\1\111"+
        "\1\116\1\uffff\1\122\1\103\1\116\1\uffff\1\105\1\101\1\uffff\1\123"+
        "\1\114\1\uffff\1\122\1\50\1\103\1\uffff\1\101\1\124\1\120\1\131"+
        "\1\110\2\105\2\uffff\1\50\2\104\1\50\1\105\1\50\3\uffff\1\101\1"+
        "\104\1\122\1\120\1\124\1\101\1\103\1\115\1\50\1\122\1\125\1\120"+
        "\1\131\3\116\1\101\1\116\1\50\1\105\3\50\1\105\1\uffff\1\125\3\uffff"+
        "\3\50\1\116\1\124\1\107\1\124\1\104\1\123\1\124\1\50\1\126\1\50"+
        "\1\uffff\1\124\1\123\2\111\2\50\1\122\1\50\1\uffff\2\105\1\uffff"+
        "\1\123\1\uffff\1\114\1\50\1\105\1\110\1\50\2\124\1\50\1\uffff\1"+
        "\50\1\122\1\111\1\50\1\124\1\50\3\124\1\uffff\1\50\3\uffff\1\50"+
        "\1\124\3\uffff\1\50\1\122\1\105\2\50\1\111\1\125\1\uffff\1\105\1"+
        "\uffff\1\50\1\105\1\117\1\124\2\uffff\1\50\1\uffff\2\50\1\111\1"+
        "\50\1\uffff\1\50\1\105\1\uffff\1\125\1\50\2\uffff\1\105\1\124\1"+
        "\uffff\1\50\1\uffff\1\122\1\117\1\111\2\uffff\1\50\1\uffff\1\101"+
        "\1\50\2\uffff\1\132\1\123\1\50\1\uffff\1\50\1\116\1\101\3\uffff"+
        "\1\132\2\uffff\1\122\1\123\1\uffff\1\50\1\101\1\uffff\1\101\1\107"+
        "\1\124\1\uffff\1\124\1\uffff\1\105\1\50\2\uffff\1\50\1\124\2\105"+
        "\1\50\1\uffff\2\124\1\122\1\131\1\105\1\50\2\uffff\1\105\2\50\1"+
        "\uffff\2\105\1\101\2\50\1\uffff\1\50\2\uffff\2\50\1\120\5\uffff"+
        "\1\110\1\131\1\50\1\uffff";
    static final String DFA5_maxS =
        "\16\172\1\122\2\uffff\3\172\1\uffff\1\172\1\123\1\uffff\4\172\1"+
        "\115\1\172\1\55\1\172\1\107\1\116\1\103\1\55\2\172\1\121\2\117\1"+
        "\121\2\122\2\uffff\1\110\1\172\1\131\2\uffff\1\125\2\uffff\1\117"+
        "\1\115\1\uffff\1\125\1\126\1\uffff\2\172\1\101\1\127\2\uffff\1\102"+
        "\1\123\1\120\3\102\1\172\1\uffff\1\123\1\117\1\131\1\120\1\122\1"+
        "\111\1\122\1\130\1\105\1\116\2\125\1\105\1\101\1\111\2\116\1\101"+
        "\1\116\1\131\1\111\1\122\1\117\1\124\1\130\1\117\1\114\1\125\1\131"+
        "\1\122\1\105\2\uffff\1\122\1\123\1\131\1\116\2\111\1\126\1\122\1"+
        "\116\1\172\1\124\2\172\2\55\1\uffff\1\105\1\101\1\117\1\123\1\111"+
        "\1\116\1\104\1\120\1\131\1\107\1\123\1\114\1\105\1\124\1\101\1\103"+
        "\1\122\1\105\1\122\1\105\1\115\1\123\1\105\1\111\2\172\1\111\1\101"+
        "\1\116\2\115\1\101\1\116\1\114\1\124\1\130\1\115\1\117\1\104\1\120"+
        "\1\172\1\124\1\114\1\103\1\101\1\114\1\105\2\122\1\116\1\122\1\103"+
        "\1\131\1\115\1\55\1\172\1\124\1\106\2\172\1\124\1\101\2\172\1\105"+
        "\1\122\1\117\1\104\1\uffff\1\172\2\uffff\3\172\1\122\1\124\1\114"+
        "\1\115\1\120\1\122\1\124\1\172\1\101\1\120\1\172\1\101\1\123\1\124"+
        "\1\101\1\122\1\124\1\122\1\124\1\103\1\111\1\116\2\117\1\124\1\110"+
        "\1\114\1\103\2\uffff\1\103\2\124\1\105\1\120\1\115\1\105\1\172\1"+
        "\110\1\124\1\117\1\125\1\172\1\101\1\uffff\1\122\1\172\1\125\1\123"+
        "\1\124\1\123\1\111\1\103\1\125\1\103\1\117\1\115\1\114\1\172\1\117"+
        "\1\103\1\uffff\1\105\1\117\1\uffff\1\117\1\uffff\1\110\2\172\2\uffff"+
        "\1\122\1\172\1\115\1\105\4\uffff\2\107\1\101\1\105\1\172\3\105\1"+
        "\172\1\110\1\uffff\1\122\1\172\1\uffff\1\123\1\117\1\172\1\105\1"+
        "\124\1\101\1\172\1\105\2\111\1\106\1\103\2\126\2\172\1\104\2\117"+
        "\1\105\1\110\3\172\1\122\1\uffff\1\117\1\125\1\123\1\116\1\uffff"+
        "\1\122\1\101\1\uffff\1\125\1\110\1\105\1\123\1\111\1\106\1\105\1"+
        "\115\1\105\1\115\2\105\1\uffff\1\126\1\112\2\122\2\172\2\uffff\1"+
        "\172\1\uffff\1\172\1\122\2\105\1\111\1\116\1\uffff\1\122\1\103\1"+
        "\116\1\uffff\1\105\1\101\1\uffff\1\123\1\114\1\uffff\1\122\1\172"+
        "\1\103\1\uffff\1\101\1\124\1\120\1\131\1\110\2\105\2\uffff\1\172"+
        "\2\104\1\172\1\105\1\172\3\uffff\1\101\1\104\1\122\1\120\1\124\1"+
        "\101\1\103\1\115\1\172\1\122\1\125\1\120\1\131\3\116\1\101\1\116"+
        "\1\172\1\105\3\172\1\105\1\uffff\1\125\3\uffff\3\172\1\116\1\124"+
        "\1\107\1\124\1\104\1\123\1\124\1\172\1\126\1\172\1\uffff\1\124\1"+
        "\123\2\111\2\172\1\122\1\172\1\uffff\2\105\1\uffff\1\123\1\uffff"+
        "\1\114\1\172\1\105\1\110\1\172\2\124\1\172\1\uffff\1\172\1\122\1"+
        "\111\1\172\1\124\1\172\3\124\1\uffff\1\172\3\uffff\1\172\1\124\3"+
        "\uffff\1\172\1\122\1\105\2\172\1\111\1\125\1\uffff\1\105\1\uffff"+
        "\1\172\1\105\1\117\1\124\2\uffff\1\172\1\uffff\2\172\1\111\1\172"+
        "\1\uffff\1\172\1\105\1\uffff\1\125\1\172\2\uffff\1\105\1\124\1\uffff"+
        "\1\172\1\uffff\1\122\1\117\1\111\2\uffff\1\172\1\uffff\1\101\1\172"+
        "\2\uffff\1\132\1\123\1\172\1\uffff\1\172\1\116\1\101\3\uffff\1\132"+
        "\2\uffff\1\122\1\123\1\uffff\1\172\1\101\1\uffff\1\101\1\107\1\124"+
        "\1\uffff\1\124\1\uffff\1\105\1\172\2\uffff\1\172\1\124\2\105\1\172"+
        "\1\uffff\2\124\1\122\1\131\1\105\1\172\2\uffff\1\105\2\172\1\uffff"+
        "\2\105\1\101\2\172\1\uffff\1\172\2\uffff\2\172\1\120\5\uffff\1\110"+
        "\1\131\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\17\uffff\1\151\1\152\3\uffff\1\155\2\uffff\1\153\24\uffff\1\154"+
        "\1\1\3\uffff\1\7\1\3\1\uffff\1\36\1\60\2\uffff\1\4\2\uffff\1\5\4"+
        "\uffff\1\65\1\135\7\uffff\1\2\37\uffff\1\141\1\6\17\uffff\1\142"+
        "\104\uffff\1\146\1\uffff\1\143\1\145\37\uffff\1\136\1\137\16\uffff"+
        "\1\42\20\uffff\1\14\2\uffff\1\23\1\uffff\1\17\3\uffff\1\25\1\26"+
        "\4\uffff\1\140\1\147\1\150\1\61\12\uffff\1\70\2\uffff\1\106\31\uffff"+
        "\1\40\4\uffff\1\66\2\uffff\1\43\14\uffff\1\107\6\uffff\1\24\1\33"+
        "\1\uffff\1\27\6\uffff\1\103\3\uffff\1\127\2\uffff\1\73\2\uffff\1"+
        "\74\3\uffff\1\114\7\uffff\1\132\1\133\6\uffff\1\35\1\44\1\37\30"+
        "\uffff\1\20\1\uffff\1\21\1\32\1\30\15\uffff\1\76\10\uffff\1\134"+
        "\2\uffff\1\34\1\uffff\1\56\10\uffff\1\45\11\uffff\1\55\1\uffff\1"+
        "\10\1\11\1\16\2\uffff\1\31\1\62\1\71\7\uffff\1\104\1\uffff\1\112"+
        "\4\uffff\1\121\1\123\1\uffff\1\125\4\uffff\1\47\2\uffff\1\50\2\uffff"+
        "\1\54\1\113\2\uffff\1\122\1\uffff\1\52\3\uffff\1\126\1\15\1\uffff"+
        "\1\72\2\uffff\1\64\1\75\3\uffff\1\110\3\uffff\1\124\1\13\1\12\1"+
        "\uffff\1\46\1\67\2\uffff\1\111\2\uffff\1\144\3\uffff\1\22\1\uffff"+
        "\1\63\2\uffff\1\105\1\115\5\uffff\1\51\6\uffff\1\77\1\116\3\uffff"+
        "\1\100\5\uffff\1\130\1\uffff\1\131\1\41\3\uffff\1\57\1\101\1\117"+
        "\1\120\1\102\3\uffff\1\53";
    static final String DFA5_specialS =
        "\u024b\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\17\1\20\2\uffff\1\20\22\uffff\1\17\7\uffff\2\24\2\uffff"+
            "\1\24\1\16\1\24\1\uffff\12\23\7\uffff\1\13\1\21\1\3\1\1\4\21"+
            "\1\10\1\11\1\21\1\15\1\21\1\5\1\7\1\6\1\21\1\12\1\14\1\4\1\21"+
            "\1\2\4\21\4\uffff\1\24\1\uffff\32\22",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\1\26\22\24\1\25\6"+
            "\24\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\1\24\1\30\30\24\4"+
            "\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\2\24\1\31\1\32\10"+
            "\24\1\33\1\24\1\34\13\24\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\14\24\1\36\1\24\1"+
            "\35\13\24\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\4\24\1\40\10\24\1"+
            "\37\14\24\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\17\24\1\41\12\24"+
            "\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\22\24\1\42\7\24\4"+
            "\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\15\24\1\43\14\24"+
            "\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\11\24\1\44\20\24"+
            "\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\1\24\1\45\20\24\1"+
            "\46\7\24\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\17\24\1\47\12\24"+
            "\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\23\24\1\50\6\24\4"+
            "\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\22\24\1\51\7\24\4"+
            "\uffff\1\24\1\uffff\32\24",
            "\1\52\5\uffff\1\53",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\56",
            "",
            "\2\24\2\uffff\1\24\1\60\1\24\1\uffff\12\24\7\uffff\3\24\1"+
            "\57\26\24\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\1\24\1\63\1\24\1\uffff\12\24\7\uffff\32\24\4"+
            "\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\66\1\67",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\71",
            "\2\24\2\uffff\1\24\1\72\1\24\1\uffff\12\24\7\uffff\32\24\4"+
            "\uffff\1\24\1\uffff\32\24",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "\1\110",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\115\1\uffff\1\113\1\116\1\121\1\117\1\uffff\1\122\1\123"+
            "\6\uffff\1\124\1\125\1\126\1\114\1\120\1\112\1\uffff\1\127\1"+
            "\uffff\1\130",
            "",
            "",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\141\1\uffff\1\146\1\147\1\142\1\144\1\137\5\uffff\1\140"+
            "\2\uffff\1\145\1\uffff\1\150\1\135\1\136\1\uffff\1\143",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\153",
            "\1\154\1\155\3\uffff\1\162\2\uffff\1\156\5\uffff\1\161\5\uffff"+
            "\1\163\1\160\1\157",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\1\173",
            "\1\174\6\uffff\1\175",
            "\1\177\1\176\3\uffff\1\u0080",
            "\1\u0081\13\uffff\1\u0082",
            "\1\u0084\3\uffff\1\u0085\10\uffff\1\u0083",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\20\uffff\1\u008c\2\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\4\uffff\1\u0097",
            "\1\u0099\3\uffff\1\u0098",
            "\1\u009b\14\uffff\1\u009a",
            "\1\u009d\3\uffff\1\u009e\5\uffff\1\u009c",
            "\1\u00a1\10\uffff\1\u00a0\2\uffff\1\u00a2\3\uffff\1\u009f",
            "\1\u00a3\6\uffff\1\u00a4",
            "\1\u00a6\15\uffff\1\u00a5",
            "\1\u00a8\2\uffff\1\u00a7",
            "\1\u00ab\14\uffff\1\u00a9\2\uffff\1\u00aa",
            "\1\u00ad\6\uffff\1\u00ac\11\uffff\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "",
            "\1\u00b1",
            "\1\u00b3\14\uffff\1\u00b2",
            "\1\u00b4\23\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\7\uffff\1\u00ba\7\uffff\1\u00bb",
            "\1\u00bc\2\uffff\1\u00bd",
            "\1\u00be",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u00c0",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7\1\u00c8",
            "\1\u00c9\20\uffff\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf\11\uffff\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc\11\uffff\1\u00dd",
            "\1\u00de\11\uffff\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
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
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb\1\uffff\1\u00fc",
            "\1\u00fe\14\uffff\1\u00fd",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0104",
            "\1\u0105",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\23\24\1\u0107\6\24"+
            "\4\uffff\1\24\1\uffff\32\24",
            "\1\u0109",
            "\1\u010a",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\5\24\1\u010b\24\24"+
            "\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0116\3\uffff\1\u0117",
            "\1\u0119\20\uffff\1\u0118",
            "\1\u011a",
            "\1\u011c\2\uffff\1\u011b",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0121",
            "\1\u0122",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126\7\uffff\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0143",
            "",
            "\1\u0144",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u014a\17\uffff\1\u0149",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "\1\u0156",
            "",
            "\1\u0157",
            "",
            "\1\u0158",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "",
            "\1\u015b",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u015d",
            "\1\u015e",
            "",
            "",
            "",
            "",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0168",
            "",
            "\1\u0169",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\1\u016b",
            "\1\u016c",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\22\24\1\u0180\7\24"+
            "\4\uffff\1\24\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0184",
            "",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "\1\u018a",
            "",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "",
            "\1\u0197",
            "\1\u0198\5\uffff\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\16\24\1\u019d\13"+
            "\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "",
            "\1\u01ab",
            "\1\u01ac",
            "",
            "\1\u01ad",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01af",
            "",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01b8",
            "\1\u01b9",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01bb",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "",
            "",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01d0",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01d4",
            "",
            "\1\u01d5",
            "",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01e1",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01e9",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\1\u01eb",
            "\1\u01ec",
            "",
            "\1\u01ed",
            "",
            "\1\u01ee",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01f0",
            "\1\u01f1",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01f3",
            "\1\u01f4",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01f7",
            "\1\u01f8",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01fa",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0201",
            "",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0203",
            "\1\u0204",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0207",
            "\1\u0208",
            "",
            "\1\u0209",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0211",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0214",
            "",
            "\1\u0215",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "",
            "\1\u0217",
            "\1\u0218",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\1\u021e",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "",
            "\1\u0220",
            "\1\u0221",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0224",
            "\1\u0225",
            "",
            "",
            "",
            "\1\u0226",
            "",
            "",
            "\1\u0227",
            "\1\u0228",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u022a",
            "",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "",
            "\1\u022e",
            "",
            "\1\u022f",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "",
            "\1\u023c",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "",
            "",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
            "\1\u0247",
            "",
            "",
            "",
            "",
            "",
            "\1\u0248",
            "\1\u0249",
            "\2\24\2\uffff\3\24\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24"+
            "\1\uffff\32\24",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | WS | NEWLINE | ACHAR | DIGIT | TOKEN );";
        }
    }
 

}