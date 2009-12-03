// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g 2009-12-03 11:53:16

    package uk.ac.cam.ch.wwmm.extractPhrases;
 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class ChemicalChunkerParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WS", "NEWLINE", "ACHAR", "DIGIT", "TOKEN", "'OSCAR-CD'", "'OSCAR-CJ'", "'OSCAR-ONT'", "'TM-UNICODE'", "'CD-UNICODE'", "'IN-AS'", "'IN-BEFORE'", "'IN-AFTER'", "'IN-IN'", "'IN-INTO'", "'IN-WITH'", "'IN-WITHOUT'", "'IN-BY'", "'IN-VIA'", "'IN-OF'", "'IN-ON'", "'IN-FOR'", "'IN-FROM'", "'IN-UNDER'", "'IN-OVER'", "'IN-OFF'", "'NN-STATE'", "'NN-TIME'", "'NN-GRAM'", "'NN-MOL'", "'NN-ATMOSPHERE'", "'NN-EQ'", "'NN-VOL'", "'NN-CHEMENTITY'", "'NN-TEMP'", "'NN-FLASH'", "'NN-GENERAL'", "'NN-METHOD'", "'NN-AMOUNT'", "'NN-PRESSURE'", "'NN-COLUMN'", "'NN-CHROMATOGRAPHY'", "'NN-VACUUM'", "'NN-CYCLE'", "'NN-TIMES'", "'OSCAR-CM'", "'VB-USE'", "'VB-CHANGE'", "'VB-SUBMERGE'", "'VB-SUBJECT'", "'NN-ADD'", "'NN-MIXTURE'", "'VB-ADD'", "'VB-CHARGE'", "'VB-CONTAIN'", "'VB-DROP'", "'VB-FILL'", "'VB-SUSPEND'", "'VB-TREAT'", "'VB-APPARATUS'", "'NN-APPARATUS'", "'VB-CONCENTRATE'", "'NN-CONCENTRATE'", "'VB-COOL'", "'VB-DEGASS'", "'VB-DISSOLVE'", "'VB-DRY'", "'NN-DRY'", "'VB-EXTRACT'", "'NN-EXTRACT'", "'VB-FILTER'", "'NN-FILTER'", "'VB-HEAT'", "'VB-INCREASE'", "'VB-PARTITION'", "'VB-PRECIPITATE'", "'NN-PRECIPITATE'", "'VB-PURIFY'", "'NN-PURIFY'", "'VB-QUENCH'", "'VB-RECOVER'", "'VB-REMOVE'", "'NN-REMOVE'", "'VB-STIR'", "'VB-SYNTHESIZE'", "'NN-SYNTHESIZE'", "'VB-WAIT'", "'VB-WASH'", "'VB-YIELD'", "'COLON'", "'COMMA'", "'APOST'", "'NEG'", "'DASH'", "'STOP'", "'NN-PERCENT'", "'LSQB'", "'RSQB'", "'-LRB-'", "'-RRB-'", "'ABL'", "'ABN'", "'ABX'", "'AP'", "'AT'", "'BE'", "'BED'", "'BEDZ'", "'BEG'", "'BEM'", "'BEN'", "'BER'", "'BEZ'", "'CC'", "'CD'", "'CS'", "'DO'", "'DOD'", "'DOZ'", "'DT'", "'DTI'", "'DTS'", "'DTX'", "'EX'", "'FW'", "'HV'", "'HVD'", "'HVG'", "'HVN'", "'IN'", "'JJ'", "'JJR'", "'JJS'", "'JJT'", "'MD'", "'NC'", "'NN'", "'NN$'", "'NNS'", "'NNS$'", "'NP'", "'NP$'", "'NPS'", "'NPS$'", "'NR'", "'OD'", "'PN'", "'PN$'", "'PP$'", "'PP$$'", "'PPL'", "'PPLS'", "'PPO'", "'PPS'", "'PPSS'", "'QL'", "'QLP'", "'RB'", "'RBR'", "'RBT'", "'RN'", "'RP'", "'TO'", "'UH'", "'VB'", "'VBD'", "'VBG'", "'VBN'", "'VBZ'", "'WDT'", "'WP$'", "'WPO'", "'WPS'", "'WQL'", "'WRB'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__159=159;
    public static final int T__27=27;
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
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__9=9;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int TOKEN=8;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__16=16;
    public static final int T__147=147;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__149=149;
    public static final int T__17=17;
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
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
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
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__30=30;
    public static final int T__173=173;
    public static final int T__31=31;
    public static final int T__172=172;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int ACHAR=6;
    public static final int T__178=178;
    public static final int T__34=34;
    public static final int NEWLINE=5;
    public static final int T__177=177;
    public static final int T__35=35;
    public static final int T__176=176;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "nncolumn", "rbt", "measurements", "dts", "vbcool", 
        "nnamount", "vbz", "inon", "doz", "beg", "nnsynthesize", "vbrecover", 
        "wdt", "vbapparatus", "vbpurify", "pn_poss", "dti", "infrom", "molecule", 
        "bed", "verbphrase", "fw", "hvg", "oscarcj", "od", "nns_poss", "vbcharge", 
        "ber", "jjs", "vbyield", "nc", "vbsuspend", "bedz", "pp_poss_poss", 
        "dod", "pps", "vbsubmerge", "at", "vb", "ppl", "vbfilter", "vbstir", 
        "abx", "ppss", "inas", "nnmethod", "vbdry", "stop", "jj", "rp", 
        "nns", "nngram", "nr", "number", "oscarcd", "invia", "nneq", "cdunicode", 
        "rrb", "rsqb", "in", "dt", "adv", "tmunicode", "nnpressure", "unnamedmolecule", 
        "vbdrop", "inover", "hv", "nnapparatus", "vbg", "percent", "ex", 
        "rn", "sentence", "cs", "amount", "inAll", "nnconcentrate", "cd", 
        "inof", "md", "method", "vbheat", "oscarcm", "nnvacuum", "inafter", 
        "comma", "hvn", "nntemp", "nnatmosphere", "vbn", "qlp", "vbwait", 
        "ininto", "wpo", "nndry", "nnremove", "dash", "vbsubject", "mmol", 
        "nntime", "nngeneral", "nn", "to", "abl", "prepphraseOf", "np", 
        "nnchromatography", "vbtreat", "jjr", "cc", "nps_poss", "vbuse", 
        "pp_poss", "wrb", "vbremove", "neg", "ben", "vbextract", "bez", 
        "nnadd", "be", "oscaront", "vbwash", "vbquench", "np_poss", "inwithout", 
        "nnmol", "lsqb", "pn", "inin", "prepphraseIN", "vbd", "noun", "inwith", 
        "vbcontain", "nnvol", "dotok", "adj", "nncycle", "nnprecipitate", 
        "ppo", "vbpartition", "inbefore", "prepphraseTemp", "vbdegass", 
        "verb", "wp_poss", "vbincrease", "rbr", "vbchange", "nn_poss", "abn", 
        "ppls", "uh", "nntimes", "volume", "wps", "document", "gram", "ap", 
        "inby", "nnfilter", "vbfill", "inoff", "vbconcentrate", "nnflash", 
        "prepphrase", "vbdissolve", "nnextract", "nps", "inunder", "hvd", 
        "nnpercent", "wql", "prepphraseTime", "nnchementity", "prepphraseOther", 
        "nounphrase", "vbadd", "jjt", "bem", "ql", "vbsynthesize", "lrb", 
        "apost", "vbprecipitate", "colon", "nnmixture", "rb", "nnpurify", 
        "dtx", "infor", "nnstate"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public ChemicalChunkerParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public ChemicalChunkerParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public ChemicalChunkerParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return ChemicalChunkerParser.tokenNames; }
    public String getGrammarFileName() { return "/home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g"; }


    public static class document_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "document"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:24:1: document : ( sentence )+ ;
    public final ChemicalChunkerParser.document_return document() throws RecognitionException {
        ChemicalChunkerParser.document_return retval = new ChemicalChunkerParser.document_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.sentence_return sentence1 = null;



        try { dbg.enterRule(getGrammarFileName(), "document");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:24:9: ( ( sentence )+ )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:24:11: ( sentence )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(24,11);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:24:11: ( sentence )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=9 && LA1_0<=11)||(LA1_0>=14 && LA1_0<=31)||(LA1_0>=34 && LA1_0<=35)||(LA1_0>=37 && LA1_0<=49)||LA1_0==55||LA1_0==64||LA1_0==66||LA1_0==89||LA1_0==118||LA1_0==123||(LA1_0>=133 && LA1_0<=137)||(LA1_0>=173 && LA1_0<=176)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:24:11: sentence
            	    {
            	    dbg.location(24,11);
            	    pushFollow(FOLLOW_sentence_in_document135);
            	    sentence1=sentence();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sentence1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(24, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "document");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "document"

    public static class sentence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sentence"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:27:1: sentence : ( prepphrase )? ( nounphrase )+ ( verbphrase )* ( stop )? ;
    public final ChemicalChunkerParser.sentence_return sentence() throws RecognitionException {
        ChemicalChunkerParser.sentence_return retval = new ChemicalChunkerParser.sentence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.prepphrase_return prepphrase2 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase3 = null;

        ChemicalChunkerParser.verbphrase_return verbphrase4 = null;

        ChemicalChunkerParser.stop_return stop5 = null;



        try { dbg.enterRule(getGrammarFileName(), "sentence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:28:2: ( ( prepphrase )? ( nounphrase )+ ( verbphrase )* ( stop )? )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:28:3: ( prepphrase )? ( nounphrase )+ ( verbphrase )* ( stop )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(28,3);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:28:3: ( prepphrase )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            switch ( input.LA(1) ) {
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 118:
                case 133:
                    {
                    alt2=1;
                    }
                    break;
                case 123:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==TOKEN) ) {
                        int LA2_5 = input.LA(3);

                        if ( (LA2_5==134) ) {
                            int LA2_3 = input.LA(4);

                            if ( (LA2_3==TOKEN) ) {
                                int LA2_6 = input.LA(5);

                                if ( (LA2_6==118) ) {
                                    alt2=1;
                                }
                            }
                        }
                        else if ( (LA2_5==118) ) {
                            alt2=1;
                        }
                    }
                    }
                    break;
                case 134:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==TOKEN) ) {
                        int LA2_6 = input.LA(3);

                        if ( (LA2_6==118) ) {
                            alt2=1;
                        }
                    }
                    }
                    break;
            }

            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:28:3: prepphrase
                    {
                    dbg.location(28,3);
                    pushFollow(FOLLOW_prepphrase_in_sentence146);
                    prepphrase2=prepphrase();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphrase2.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(28,15);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:28:15: ( nounphrase )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                try {
                    isCyclicDecision = true;
                    alt3 = dfa3.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:28:15: nounphrase
            	    {
            	    dbg.location(28,15);
            	    pushFollow(FOLLOW_nounphrase_in_sentence149);
            	    nounphrase3=nounphrase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nounphrase3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt3++;
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(28,27);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:28:27: ( verbphrase )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=50 && LA4_0<=53)||(LA4_0>=56 && LA4_0<=63)||LA4_0==65||(LA4_0>=67 && LA4_0<=70)||LA4_0==72||LA4_0==74||(LA4_0>=76 && LA4_0<=79)||LA4_0==81||(LA4_0>=83 && LA4_0<=85)||(LA4_0>=87 && LA4_0<=88)||(LA4_0>=90 && LA4_0<=92)||(LA4_0>=161 && LA4_0<=163)||LA4_0==169) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:28:27: verbphrase
            	    {
            	    dbg.location(28,27);
            	    pushFollow(FOLLOW_verbphrase_in_sentence152);
            	    verbphrase4=verbphrase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, verbphrase4.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(28,39);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:28:39: ( stop )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==98) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:28:39: stop
                    {
                    dbg.location(28,39);
                    pushFollow(FOLLOW_stop_in_sentence155);
                    stop5=stop();

                    state._fsp--;

                    adaptor.addChild(root_0, stop5.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(28, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sentence");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "sentence"

    public static class nounphrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nounphrase"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:30:1: nounphrase : ( dt )? ( adj )* ( noun )+ ( cc | comma noun )* ( prepphraseOf )* ( prepphraseIN )? ;
    public final ChemicalChunkerParser.nounphrase_return nounphrase() throws RecognitionException {
        ChemicalChunkerParser.nounphrase_return retval = new ChemicalChunkerParser.nounphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.dt_return dt6 = null;

        ChemicalChunkerParser.adj_return adj7 = null;

        ChemicalChunkerParser.noun_return noun8 = null;

        ChemicalChunkerParser.cc_return cc9 = null;

        ChemicalChunkerParser.comma_return comma10 = null;

        ChemicalChunkerParser.noun_return noun11 = null;

        ChemicalChunkerParser.prepphraseOf_return prepphraseOf12 = null;

        ChemicalChunkerParser.prepphraseIN_return prepphraseIN13 = null;



        try { dbg.enterRule(getGrammarFileName(), "nounphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:2: ( ( dt )? ( adj )* ( noun )+ ( cc | comma noun )* ( prepphraseOf )* ( prepphraseIN )? )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:3: ( dt )? ( adj )* ( noun )+ ( cc | comma noun )* ( prepphraseOf )* ( prepphraseIN )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(31,3);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:3: ( dt )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==123) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:3: dt
                    {
                    dbg.location(31,3);
                    pushFollow(FOLLOW_dt_in_nounphrase165);
                    dt6=dt();

                    state._fsp--;

                    adaptor.addChild(root_0, dt6.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(31,7);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:7: ( adj )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==10||(LA7_0>=134 && LA7_0<=137)) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:7: adj
            	    {
            	    dbg.location(31,7);
            	    pushFollow(FOLLOW_adj_in_nounphrase168);
            	    adj7=adj();

            	    state._fsp--;

            	    adaptor.addChild(root_0, adj7.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(31,12);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:12: ( noun )+
            int cnt8=0;
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8);

                try {
                    isCyclicDecision = true;
                    alt8 = dfa8.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:12: noun
            	    {
            	    dbg.location(31,12);
            	    pushFollow(FOLLOW_noun_in_nounphrase171);
            	    noun8=noun();

            	    state._fsp--;

            	    adaptor.addChild(root_0, noun8.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt8++;
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(31,18);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:18: ( cc | comma noun )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=3;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==117) ) {
                    alt9=1;
                }
                else if ( (LA9_0==94) ) {
                    alt9=2;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:19: cc
            	    {
            	    dbg.location(31,19);
            	    pushFollow(FOLLOW_cc_in_nounphrase175);
            	    cc9=cc();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cc9.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:22: comma noun
            	    {
            	    dbg.location(31,22);
            	    pushFollow(FOLLOW_comma_in_nounphrase177);
            	    comma10=comma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comma10.getTree());
            	    dbg.location(31,28);
            	    pushFollow(FOLLOW_noun_in_nounphrase179);
            	    noun11=noun();

            	    state._fsp--;

            	    adaptor.addChild(root_0, noun11.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}

            dbg.location(31,35);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:35: ( prepphraseOf )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:35: prepphraseOf
            	    {
            	    dbg.location(31,35);
            	    pushFollow(FOLLOW_prepphraseOf_in_nounphrase183);
            	    prepphraseOf12=prepphraseOf();

            	    state._fsp--;

            	    adaptor.addChild(root_0, prepphraseOf12.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}

            dbg.location(31,49);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:49: ( prepphraseIN )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:31:49: prepphraseIN
                    {
                    dbg.location(31,49);
                    pushFollow(FOLLOW_prepphraseIN_in_nounphrase186);
                    prepphraseIN13=prepphraseIN();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseIN13.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(31, 62);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nounphrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nounphrase"

    public static class verbphrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verbphrase"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:33:1: verbphrase : ( adv )* ( vbd )* verb ( adv )* ( prepphrase )* ;
    public final ChemicalChunkerParser.verbphrase_return verbphrase() throws RecognitionException {
        ChemicalChunkerParser.verbphrase_return retval = new ChemicalChunkerParser.verbphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.adv_return adv14 = null;

        ChemicalChunkerParser.vbd_return vbd15 = null;

        ChemicalChunkerParser.verb_return verb16 = null;

        ChemicalChunkerParser.adv_return adv17 = null;

        ChemicalChunkerParser.prepphrase_return prepphrase18 = null;



        try { dbg.enterRule(getGrammarFileName(), "verbphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:34:2: ( ( adv )* ( vbd )* verb ( adv )* ( prepphrase )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:34:4: ( adv )* ( vbd )* verb ( adv )* ( prepphrase )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(34,4);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:34:4: ( adv )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=161 && LA12_0<=163)) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:34:4: adv
            	    {
            	    dbg.location(34,4);
            	    pushFollow(FOLLOW_adv_in_verbphrase200);
            	    adv14=adv();

            	    state._fsp--;

            	    adaptor.addChild(root_0, adv14.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(34,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:34:9: ( vbd )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==169) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:34:9: vbd
            	    {
            	    dbg.location(34,9);
            	    pushFollow(FOLLOW_vbd_in_verbphrase203);
            	    vbd15=vbd();

            	    state._fsp--;

            	    adaptor.addChild(root_0, vbd15.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(34,14);
            pushFollow(FOLLOW_verb_in_verbphrase206);
            verb16=verb();

            state._fsp--;

            adaptor.addChild(root_0, verb16.getTree());
            dbg.location(34,19);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:34:19: ( adv )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                switch ( input.LA(1) ) {
                case 161:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==TOKEN) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 162:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (LA14_3==TOKEN) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 163:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (LA14_4==TOKEN) ) {
                        alt14=1;
                    }


                    }
                    break;

                }

                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:34:19: adv
            	    {
            	    dbg.location(34,19);
            	    pushFollow(FOLLOW_adv_in_verbphrase208);
            	    adv17=adv();

            	    state._fsp--;

            	    adaptor.addChild(root_0, adv17.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}

            dbg.location(34,24);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:34:24: ( prepphrase )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                try {
                    isCyclicDecision = true;
                    alt15 = dfa15.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:34:24: prepphrase
            	    {
            	    dbg.location(34,24);
            	    pushFollow(FOLLOW_prepphrase_in_verbphrase211);
            	    prepphrase18=prepphrase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, prepphrase18.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(34, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "verbphrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "verbphrase"

    public static class verb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verb"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:36:1: verb : ( vbuse | vbchange | vbsubmerge | vbsubject | vbadd | vbcharge | vbcontain | vbdrop | vbfill | vbsuspend | vbtreat | vbapparatus | vbconcentrate | vbcool | vbdegass | vbdissolve | vbdry | vbextract | vbfilter | vbheat | vbincrease | vbpartition | vbprecipitate | vbpurify | vbquench | vbrecover | vbremove | vbstir | vbsynthesize | vbwait | vbwash | vbyield );
    public final ChemicalChunkerParser.verb_return verb() throws RecognitionException {
        ChemicalChunkerParser.verb_return retval = new ChemicalChunkerParser.verb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.vbuse_return vbuse19 = null;

        ChemicalChunkerParser.vbchange_return vbchange20 = null;

        ChemicalChunkerParser.vbsubmerge_return vbsubmerge21 = null;

        ChemicalChunkerParser.vbsubject_return vbsubject22 = null;

        ChemicalChunkerParser.vbadd_return vbadd23 = null;

        ChemicalChunkerParser.vbcharge_return vbcharge24 = null;

        ChemicalChunkerParser.vbcontain_return vbcontain25 = null;

        ChemicalChunkerParser.vbdrop_return vbdrop26 = null;

        ChemicalChunkerParser.vbfill_return vbfill27 = null;

        ChemicalChunkerParser.vbsuspend_return vbsuspend28 = null;

        ChemicalChunkerParser.vbtreat_return vbtreat29 = null;

        ChemicalChunkerParser.vbapparatus_return vbapparatus30 = null;

        ChemicalChunkerParser.vbconcentrate_return vbconcentrate31 = null;

        ChemicalChunkerParser.vbcool_return vbcool32 = null;

        ChemicalChunkerParser.vbdegass_return vbdegass33 = null;

        ChemicalChunkerParser.vbdissolve_return vbdissolve34 = null;

        ChemicalChunkerParser.vbdry_return vbdry35 = null;

        ChemicalChunkerParser.vbextract_return vbextract36 = null;

        ChemicalChunkerParser.vbfilter_return vbfilter37 = null;

        ChemicalChunkerParser.vbheat_return vbheat38 = null;

        ChemicalChunkerParser.vbincrease_return vbincrease39 = null;

        ChemicalChunkerParser.vbpartition_return vbpartition40 = null;

        ChemicalChunkerParser.vbprecipitate_return vbprecipitate41 = null;

        ChemicalChunkerParser.vbpurify_return vbpurify42 = null;

        ChemicalChunkerParser.vbquench_return vbquench43 = null;

        ChemicalChunkerParser.vbrecover_return vbrecover44 = null;

        ChemicalChunkerParser.vbremove_return vbremove45 = null;

        ChemicalChunkerParser.vbstir_return vbstir46 = null;

        ChemicalChunkerParser.vbsynthesize_return vbsynthesize47 = null;

        ChemicalChunkerParser.vbwait_return vbwait48 = null;

        ChemicalChunkerParser.vbwash_return vbwash49 = null;

        ChemicalChunkerParser.vbyield_return vbyield50 = null;



        try { dbg.enterRule(getGrammarFileName(), "verb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:37:2: ( vbuse | vbchange | vbsubmerge | vbsubject | vbadd | vbcharge | vbcontain | vbdrop | vbfill | vbsuspend | vbtreat | vbapparatus | vbconcentrate | vbcool | vbdegass | vbdissolve | vbdry | vbextract | vbfilter | vbheat | vbincrease | vbpartition | vbprecipitate | vbpurify | vbquench | vbrecover | vbremove | vbstir | vbsynthesize | vbwait | vbwash | vbyield )
            int alt16=32;
            try { dbg.enterDecision(16);

            switch ( input.LA(1) ) {
            case 50:
                {
                alt16=1;
                }
                break;
            case 51:
                {
                alt16=2;
                }
                break;
            case 52:
                {
                alt16=3;
                }
                break;
            case 53:
                {
                alt16=4;
                }
                break;
            case 56:
                {
                alt16=5;
                }
                break;
            case 57:
                {
                alt16=6;
                }
                break;
            case 58:
                {
                alt16=7;
                }
                break;
            case 59:
                {
                alt16=8;
                }
                break;
            case 60:
                {
                alt16=9;
                }
                break;
            case 61:
                {
                alt16=10;
                }
                break;
            case 62:
                {
                alt16=11;
                }
                break;
            case 63:
                {
                alt16=12;
                }
                break;
            case 65:
                {
                alt16=13;
                }
                break;
            case 67:
                {
                alt16=14;
                }
                break;
            case 68:
                {
                alt16=15;
                }
                break;
            case 69:
                {
                alt16=16;
                }
                break;
            case 70:
                {
                alt16=17;
                }
                break;
            case 72:
                {
                alt16=18;
                }
                break;
            case 74:
                {
                alt16=19;
                }
                break;
            case 76:
                {
                alt16=20;
                }
                break;
            case 77:
                {
                alt16=21;
                }
                break;
            case 78:
                {
                alt16=22;
                }
                break;
            case 79:
                {
                alt16=23;
                }
                break;
            case 81:
                {
                alt16=24;
                }
                break;
            case 83:
                {
                alt16=25;
                }
                break;
            case 84:
                {
                alt16=26;
                }
                break;
            case 85:
                {
                alt16=27;
                }
                break;
            case 87:
                {
                alt16=28;
                }
                break;
            case 88:
                {
                alt16=29;
                }
                break;
            case 90:
                {
                alt16=30;
                }
                break;
            case 91:
                {
                alt16=31;
                }
                break;
            case 92:
                {
                alt16=32;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:2: vbuse
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,2);
                    pushFollow(FOLLOW_vbuse_in_verb222);
                    vbuse19=vbuse();

                    state._fsp--;

                    adaptor.addChild(root_0, vbuse19.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:8: vbchange
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,8);
                    pushFollow(FOLLOW_vbchange_in_verb224);
                    vbchange20=vbchange();

                    state._fsp--;

                    adaptor.addChild(root_0, vbchange20.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:17: vbsubmerge
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,17);
                    pushFollow(FOLLOW_vbsubmerge_in_verb226);
                    vbsubmerge21=vbsubmerge();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsubmerge21.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:28: vbsubject
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,28);
                    pushFollow(FOLLOW_vbsubject_in_verb228);
                    vbsubject22=vbsubject();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsubject22.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:38: vbadd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,38);
                    pushFollow(FOLLOW_vbadd_in_verb230);
                    vbadd23=vbadd();

                    state._fsp--;

                    adaptor.addChild(root_0, vbadd23.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:44: vbcharge
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,44);
                    pushFollow(FOLLOW_vbcharge_in_verb232);
                    vbcharge24=vbcharge();

                    state._fsp--;

                    adaptor.addChild(root_0, vbcharge24.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:53: vbcontain
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,53);
                    pushFollow(FOLLOW_vbcontain_in_verb234);
                    vbcontain25=vbcontain();

                    state._fsp--;

                    adaptor.addChild(root_0, vbcontain25.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:63: vbdrop
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,63);
                    pushFollow(FOLLOW_vbdrop_in_verb236);
                    vbdrop26=vbdrop();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdrop26.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:70: vbfill
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,70);
                    pushFollow(FOLLOW_vbfill_in_verb238);
                    vbfill27=vbfill();

                    state._fsp--;

                    adaptor.addChild(root_0, vbfill27.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:77: vbsuspend
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,77);
                    pushFollow(FOLLOW_vbsuspend_in_verb240);
                    vbsuspend28=vbsuspend();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsuspend28.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:87: vbtreat
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,87);
                    pushFollow(FOLLOW_vbtreat_in_verb242);
                    vbtreat29=vbtreat();

                    state._fsp--;

                    adaptor.addChild(root_0, vbtreat29.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:95: vbapparatus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,95);
                    pushFollow(FOLLOW_vbapparatus_in_verb244);
                    vbapparatus30=vbapparatus();

                    state._fsp--;

                    adaptor.addChild(root_0, vbapparatus30.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:107: vbconcentrate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,107);
                    pushFollow(FOLLOW_vbconcentrate_in_verb246);
                    vbconcentrate31=vbconcentrate();

                    state._fsp--;

                    adaptor.addChild(root_0, vbconcentrate31.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:121: vbcool
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,121);
                    pushFollow(FOLLOW_vbcool_in_verb248);
                    vbcool32=vbcool();

                    state._fsp--;

                    adaptor.addChild(root_0, vbcool32.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:128: vbdegass
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,128);
                    pushFollow(FOLLOW_vbdegass_in_verb250);
                    vbdegass33=vbdegass();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdegass33.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:137: vbdissolve
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,137);
                    pushFollow(FOLLOW_vbdissolve_in_verb252);
                    vbdissolve34=vbdissolve();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdissolve34.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:148: vbdry
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,148);
                    pushFollow(FOLLOW_vbdry_in_verb254);
                    vbdry35=vbdry();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdry35.getTree());

                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:154: vbextract
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,154);
                    pushFollow(FOLLOW_vbextract_in_verb256);
                    vbextract36=vbextract();

                    state._fsp--;

                    adaptor.addChild(root_0, vbextract36.getTree());

                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:38:164: vbfilter
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(38,164);
                    pushFollow(FOLLOW_vbfilter_in_verb258);
                    vbfilter37=vbfilter();

                    state._fsp--;

                    adaptor.addChild(root_0, vbfilter37.getTree());

                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:3: vbheat
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,3);
                    pushFollow(FOLLOW_vbheat_in_verb262);
                    vbheat38=vbheat();

                    state._fsp--;

                    adaptor.addChild(root_0, vbheat38.getTree());

                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:10: vbincrease
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,10);
                    pushFollow(FOLLOW_vbincrease_in_verb264);
                    vbincrease39=vbincrease();

                    state._fsp--;

                    adaptor.addChild(root_0, vbincrease39.getTree());

                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:21: vbpartition
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,21);
                    pushFollow(FOLLOW_vbpartition_in_verb266);
                    vbpartition40=vbpartition();

                    state._fsp--;

                    adaptor.addChild(root_0, vbpartition40.getTree());

                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:33: vbprecipitate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,33);
                    pushFollow(FOLLOW_vbprecipitate_in_verb268);
                    vbprecipitate41=vbprecipitate();

                    state._fsp--;

                    adaptor.addChild(root_0, vbprecipitate41.getTree());

                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:47: vbpurify
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,47);
                    pushFollow(FOLLOW_vbpurify_in_verb270);
                    vbpurify42=vbpurify();

                    state._fsp--;

                    adaptor.addChild(root_0, vbpurify42.getTree());

                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:56: vbquench
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,56);
                    pushFollow(FOLLOW_vbquench_in_verb272);
                    vbquench43=vbquench();

                    state._fsp--;

                    adaptor.addChild(root_0, vbquench43.getTree());

                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:65: vbrecover
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,65);
                    pushFollow(FOLLOW_vbrecover_in_verb274);
                    vbrecover44=vbrecover();

                    state._fsp--;

                    adaptor.addChild(root_0, vbrecover44.getTree());

                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:75: vbremove
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,75);
                    pushFollow(FOLLOW_vbremove_in_verb276);
                    vbremove45=vbremove();

                    state._fsp--;

                    adaptor.addChild(root_0, vbremove45.getTree());

                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:84: vbstir
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,84);
                    pushFollow(FOLLOW_vbstir_in_verb278);
                    vbstir46=vbstir();

                    state._fsp--;

                    adaptor.addChild(root_0, vbstir46.getTree());

                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:91: vbsynthesize
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,91);
                    pushFollow(FOLLOW_vbsynthesize_in_verb280);
                    vbsynthesize47=vbsynthesize();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsynthesize47.getTree());

                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:104: vbwait
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,104);
                    pushFollow(FOLLOW_vbwait_in_verb282);
                    vbwait48=vbwait();

                    state._fsp--;

                    adaptor.addChild(root_0, vbwait48.getTree());

                    }
                    break;
                case 31 :
                    dbg.enterAlt(31);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:111: vbwash
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,111);
                    pushFollow(FOLLOW_vbwash_in_verb284);
                    vbwash49=vbwash();

                    state._fsp--;

                    adaptor.addChild(root_0, vbwash49.getTree());

                    }
                    break;
                case 32 :
                    dbg.enterAlt(32);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:39:118: vbyield
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,118);
                    pushFollow(FOLLOW_vbyield_in_verb286);
                    vbyield50=vbyield();

                    state._fsp--;

                    adaptor.addChild(root_0, vbyield50.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(39, 125);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "verb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "verb"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:40:1: number : ( cd | oscarcd );
    public final ChemicalChunkerParser.number_return number() throws RecognitionException {
        ChemicalChunkerParser.number_return retval = new ChemicalChunkerParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd51 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd52 = null;



        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:41:2: ( cd | oscarcd )
            int alt17=2;
            try { dbg.enterDecision(17);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==118) ) {
                alt17=1;
            }
            else if ( (LA17_0==9) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:41:4: cd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(41,4);
                    pushFollow(FOLLOW_cd_in_number305);
                    cd51=cd();

                    state._fsp--;

                    adaptor.addChild(root_0, cd51.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:41:7: oscarcd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(41,7);
                    pushFollow(FOLLOW_oscarcd_in_number307);
                    oscarcd52=oscarcd();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcd52.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(41, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "number"

    public static class noun_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "noun"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:42:1: noun : ( unnamedmolecule | molecule | nnstate | nntime | nnatmosphere | nneq | nnchementity | nntemp | nnflash | nngeneral | nnmethod | nnamount | nnpressure | nncolumn | nnchromatography | nnvacuum | nncycle | nntimes | nnapparatus | nnconcentrate | wdt | wp_poss | wpo | wps | nnsynthesize | oscaront | nnmixture );
    public final ChemicalChunkerParser.noun_return noun() throws RecognitionException {
        ChemicalChunkerParser.noun_return retval = new ChemicalChunkerParser.noun_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.unnamedmolecule_return unnamedmolecule53 = null;

        ChemicalChunkerParser.molecule_return molecule54 = null;

        ChemicalChunkerParser.nnstate_return nnstate55 = null;

        ChemicalChunkerParser.nntime_return nntime56 = null;

        ChemicalChunkerParser.nnatmosphere_return nnatmosphere57 = null;

        ChemicalChunkerParser.nneq_return nneq58 = null;

        ChemicalChunkerParser.nnchementity_return nnchementity59 = null;

        ChemicalChunkerParser.nntemp_return nntemp60 = null;

        ChemicalChunkerParser.nnflash_return nnflash61 = null;

        ChemicalChunkerParser.nngeneral_return nngeneral62 = null;

        ChemicalChunkerParser.nnmethod_return nnmethod63 = null;

        ChemicalChunkerParser.nnamount_return nnamount64 = null;

        ChemicalChunkerParser.nnpressure_return nnpressure65 = null;

        ChemicalChunkerParser.nncolumn_return nncolumn66 = null;

        ChemicalChunkerParser.nnchromatography_return nnchromatography67 = null;

        ChemicalChunkerParser.nnvacuum_return nnvacuum68 = null;

        ChemicalChunkerParser.nncycle_return nncycle69 = null;

        ChemicalChunkerParser.nntimes_return nntimes70 = null;

        ChemicalChunkerParser.nnapparatus_return nnapparatus71 = null;

        ChemicalChunkerParser.nnconcentrate_return nnconcentrate72 = null;

        ChemicalChunkerParser.wdt_return wdt73 = null;

        ChemicalChunkerParser.wp_poss_return wp_poss74 = null;

        ChemicalChunkerParser.wpo_return wpo75 = null;

        ChemicalChunkerParser.wps_return wps76 = null;

        ChemicalChunkerParser.nnsynthesize_return nnsynthesize77 = null;

        ChemicalChunkerParser.oscaront_return oscaront78 = null;

        ChemicalChunkerParser.nnmixture_return nnmixture79 = null;



        try { dbg.enterRule(getGrammarFileName(), "noun");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:42:6: ( unnamedmolecule | molecule | nnstate | nntime | nnatmosphere | nneq | nnchementity | nntemp | nnflash | nngeneral | nnmethod | nnamount | nnpressure | nncolumn | nnchromatography | nnvacuum | nncycle | nntimes | nnapparatus | nnconcentrate | wdt | wp_poss | wpo | wps | nnsynthesize | oscaront | nnmixture )
            int alt18=27;
            try { dbg.enterDecision(18);

            switch ( input.LA(1) ) {
            case 9:
                {
                alt18=1;
                }
                break;
            case 49:
                {
                alt18=2;
                }
                break;
            case 30:
                {
                alt18=3;
                }
                break;
            case 31:
                {
                alt18=4;
                }
                break;
            case 34:
                {
                alt18=5;
                }
                break;
            case 35:
                {
                alt18=6;
                }
                break;
            case 37:
                {
                alt18=7;
                }
                break;
            case 38:
                {
                alt18=8;
                }
                break;
            case 39:
                {
                alt18=9;
                }
                break;
            case 40:
                {
                alt18=10;
                }
                break;
            case 41:
                {
                alt18=11;
                }
                break;
            case 42:
                {
                alt18=12;
                }
                break;
            case 43:
                {
                alt18=13;
                }
                break;
            case 44:
                {
                alt18=14;
                }
                break;
            case 45:
                {
                alt18=15;
                }
                break;
            case 46:
                {
                alt18=16;
                }
                break;
            case 47:
                {
                alt18=17;
                }
                break;
            case 48:
                {
                alt18=18;
                }
                break;
            case 64:
                {
                alt18=19;
                }
                break;
            case 66:
                {
                alt18=20;
                }
                break;
            case 173:
                {
                alt18=21;
                }
                break;
            case 174:
                {
                alt18=22;
                }
                break;
            case 175:
                {
                alt18=23;
                }
                break;
            case 176:
                {
                alt18=24;
                }
                break;
            case 89:
                {
                alt18=25;
                }
                break;
            case 11:
                {
                alt18=26;
                }
                break;
            case 55:
                {
                alt18=27;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:1: unnamedmolecule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,1);
                    pushFollow(FOLLOW_unnamedmolecule_in_noun316);
                    unnamedmolecule53=unnamedmolecule();

                    state._fsp--;

                    adaptor.addChild(root_0, unnamedmolecule53.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:17: molecule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,17);
                    pushFollow(FOLLOW_molecule_in_noun318);
                    molecule54=molecule();

                    state._fsp--;

                    adaptor.addChild(root_0, molecule54.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:26: nnstate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,26);
                    pushFollow(FOLLOW_nnstate_in_noun320);
                    nnstate55=nnstate();

                    state._fsp--;

                    adaptor.addChild(root_0, nnstate55.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:34: nntime
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,34);
                    pushFollow(FOLLOW_nntime_in_noun322);
                    nntime56=nntime();

                    state._fsp--;

                    adaptor.addChild(root_0, nntime56.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:41: nnatmosphere
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,41);
                    pushFollow(FOLLOW_nnatmosphere_in_noun324);
                    nnatmosphere57=nnatmosphere();

                    state._fsp--;

                    adaptor.addChild(root_0, nnatmosphere57.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:54: nneq
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,54);
                    pushFollow(FOLLOW_nneq_in_noun326);
                    nneq58=nneq();

                    state._fsp--;

                    adaptor.addChild(root_0, nneq58.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:59: nnchementity
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,59);
                    pushFollow(FOLLOW_nnchementity_in_noun328);
                    nnchementity59=nnchementity();

                    state._fsp--;

                    adaptor.addChild(root_0, nnchementity59.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:72: nntemp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,72);
                    pushFollow(FOLLOW_nntemp_in_noun330);
                    nntemp60=nntemp();

                    state._fsp--;

                    adaptor.addChild(root_0, nntemp60.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:79: nnflash
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,79);
                    pushFollow(FOLLOW_nnflash_in_noun332);
                    nnflash61=nnflash();

                    state._fsp--;

                    adaptor.addChild(root_0, nnflash61.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:87: nngeneral
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,87);
                    pushFollow(FOLLOW_nngeneral_in_noun334);
                    nngeneral62=nngeneral();

                    state._fsp--;

                    adaptor.addChild(root_0, nngeneral62.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:97: nnmethod
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,97);
                    pushFollow(FOLLOW_nnmethod_in_noun336);
                    nnmethod63=nnmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, nnmethod63.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:106: nnamount
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,106);
                    pushFollow(FOLLOW_nnamount_in_noun338);
                    nnamount64=nnamount();

                    state._fsp--;

                    adaptor.addChild(root_0, nnamount64.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:115: nnpressure
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,115);
                    pushFollow(FOLLOW_nnpressure_in_noun340);
                    nnpressure65=nnpressure();

                    state._fsp--;

                    adaptor.addChild(root_0, nnpressure65.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:126: nncolumn
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,126);
                    pushFollow(FOLLOW_nncolumn_in_noun342);
                    nncolumn66=nncolumn();

                    state._fsp--;

                    adaptor.addChild(root_0, nncolumn66.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:135: nnchromatography
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,135);
                    pushFollow(FOLLOW_nnchromatography_in_noun344);
                    nnchromatography67=nnchromatography();

                    state._fsp--;

                    adaptor.addChild(root_0, nnchromatography67.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:152: nnvacuum
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,152);
                    pushFollow(FOLLOW_nnvacuum_in_noun346);
                    nnvacuum68=nnvacuum();

                    state._fsp--;

                    adaptor.addChild(root_0, nnvacuum68.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:161: nncycle
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,161);
                    pushFollow(FOLLOW_nncycle_in_noun348);
                    nncycle69=nncycle();

                    state._fsp--;

                    adaptor.addChild(root_0, nncycle69.getTree());

                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:169: nntimes
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,169);
                    pushFollow(FOLLOW_nntimes_in_noun350);
                    nntimes70=nntimes();

                    state._fsp--;

                    adaptor.addChild(root_0, nntimes70.getTree());

                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:43:177: nnapparatus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,177);
                    pushFollow(FOLLOW_nnapparatus_in_noun352);
                    nnapparatus71=nnapparatus();

                    state._fsp--;

                    adaptor.addChild(root_0, nnapparatus71.getTree());

                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:44:1: nnconcentrate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,1);
                    pushFollow(FOLLOW_nnconcentrate_in_noun355);
                    nnconcentrate72=nnconcentrate();

                    state._fsp--;

                    adaptor.addChild(root_0, nnconcentrate72.getTree());

                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:44:15: wdt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,15);
                    pushFollow(FOLLOW_wdt_in_noun357);
                    wdt73=wdt();

                    state._fsp--;

                    adaptor.addChild(root_0, wdt73.getTree());

                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:44:19: wp_poss
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,19);
                    pushFollow(FOLLOW_wp_poss_in_noun359);
                    wp_poss74=wp_poss();

                    state._fsp--;

                    adaptor.addChild(root_0, wp_poss74.getTree());

                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:44:27: wpo
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,27);
                    pushFollow(FOLLOW_wpo_in_noun361);
                    wpo75=wpo();

                    state._fsp--;

                    adaptor.addChild(root_0, wpo75.getTree());

                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:44:31: wps
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,31);
                    pushFollow(FOLLOW_wps_in_noun363);
                    wps76=wps();

                    state._fsp--;

                    adaptor.addChild(root_0, wps76.getTree());

                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:44:35: nnsynthesize
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,35);
                    pushFollow(FOLLOW_nnsynthesize_in_noun365);
                    nnsynthesize77=nnsynthesize();

                    state._fsp--;

                    adaptor.addChild(root_0, nnsynthesize77.getTree());

                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:44:48: oscaront
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,48);
                    pushFollow(FOLLOW_oscaront_in_noun367);
                    oscaront78=oscaront();

                    state._fsp--;

                    adaptor.addChild(root_0, oscaront78.getTree());

                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:44:57: nnmixture
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,57);
                    pushFollow(FOLLOW_nnmixture_in_noun369);
                    nnmixture79=nnmixture();

                    state._fsp--;

                    adaptor.addChild(root_0, nnmixture79.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(44, 66);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "noun");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "noun"

    public static class adj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "adj"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:47:1: adj : ( jj | jjr | jjs | jjt | oscarcj );
    public final ChemicalChunkerParser.adj_return adj() throws RecognitionException {
        ChemicalChunkerParser.adj_return retval = new ChemicalChunkerParser.adj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.jj_return jj80 = null;

        ChemicalChunkerParser.jjr_return jjr81 = null;

        ChemicalChunkerParser.jjs_return jjs82 = null;

        ChemicalChunkerParser.jjt_return jjt83 = null;

        ChemicalChunkerParser.oscarcj_return oscarcj84 = null;



        try { dbg.enterRule(getGrammarFileName(), "adj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:47:5: ( jj | jjr | jjs | jjt | oscarcj )
            int alt19=5;
            try { dbg.enterDecision(19);

            switch ( input.LA(1) ) {
            case 134:
                {
                alt19=1;
                }
                break;
            case 135:
                {
                alt19=2;
                }
                break;
            case 136:
                {
                alt19=3;
                }
                break;
            case 137:
                {
                alt19=4;
                }
                break;
            case 10:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:47:7: jj
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,7);
                    pushFollow(FOLLOW_jj_in_adj378);
                    jj80=jj();

                    state._fsp--;

                    adaptor.addChild(root_0, jj80.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:47:10: jjr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,10);
                    pushFollow(FOLLOW_jjr_in_adj380);
                    jjr81=jjr();

                    state._fsp--;

                    adaptor.addChild(root_0, jjr81.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:47:14: jjs
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,14);
                    pushFollow(FOLLOW_jjs_in_adj382);
                    jjs82=jjs();

                    state._fsp--;

                    adaptor.addChild(root_0, jjs82.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:47:18: jjt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,18);
                    pushFollow(FOLLOW_jjt_in_adj384);
                    jjt83=jjt();

                    state._fsp--;

                    adaptor.addChild(root_0, jjt83.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:47:22: oscarcj
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,22);
                    pushFollow(FOLLOW_oscarcj_in_adj386);
                    oscarcj84=oscarcj();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcj84.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(47, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "adj");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "adj"

    public static class adv_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "adv"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:49:1: adv : ( rb | rbr | rbt );
    public final ChemicalChunkerParser.adv_return adv() throws RecognitionException {
        ChemicalChunkerParser.adv_return retval = new ChemicalChunkerParser.adv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.rb_return rb85 = null;

        ChemicalChunkerParser.rbr_return rbr86 = null;

        ChemicalChunkerParser.rbt_return rbt87 = null;



        try { dbg.enterRule(getGrammarFileName(), "adv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:49:5: ( rb | rbr | rbt )
            int alt20=3;
            try { dbg.enterDecision(20);

            switch ( input.LA(1) ) {
            case 161:
                {
                alt20=1;
                }
                break;
            case 162:
                {
                alt20=2;
                }
                break;
            case 163:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:49:7: rb
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,7);
                    pushFollow(FOLLOW_rb_in_adv394);
                    rb85=rb();

                    state._fsp--;

                    adaptor.addChild(root_0, rb85.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:49:10: rbr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,10);
                    pushFollow(FOLLOW_rbr_in_adv396);
                    rbr86=rbr();

                    state._fsp--;

                    adaptor.addChild(root_0, rbr86.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:49:14: rbt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,14);
                    pushFollow(FOLLOW_rbt_in_adv398);
                    rbt87=rbt();

                    state._fsp--;

                    adaptor.addChild(root_0, rbt87.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(49, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "adv");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "adv"

    public static class prepphrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prepphrase"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:51:1: prepphrase : ( prepphraseOther | prepphraseTemp | prepphraseTime );
    public final ChemicalChunkerParser.prepphrase_return prepphrase() throws RecognitionException {
        ChemicalChunkerParser.prepphrase_return retval = new ChemicalChunkerParser.prepphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.prepphraseOther_return prepphraseOther88 = null;

        ChemicalChunkerParser.prepphraseTemp_return prepphraseTemp89 = null;

        ChemicalChunkerParser.prepphraseTime_return prepphraseTime90 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:52:2: ( prepphraseOther | prepphraseTemp | prepphraseTime )
            int alt21=3;
            try { dbg.enterDecision(21);

            try {
                isCyclicDecision = true;
                alt21 = dfa21.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:52:4: prepphraseOther
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(52,4);
                    pushFollow(FOLLOW_prepphraseOther_in_prepphrase408);
                    prepphraseOther88=prepphraseOther();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseOther88.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:52:20: prepphraseTemp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(52,20);
                    pushFollow(FOLLOW_prepphraseTemp_in_prepphrase410);
                    prepphraseTemp89=prepphraseTemp();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseTemp89.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:52:35: prepphraseTime
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(52,35);
                    pushFollow(FOLLOW_prepphraseTime_in_prepphrase412);
                    prepphraseTime90=prepphraseTime();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseTime90.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(52, 49);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prepphrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prepphrase"

    public static class prepphraseOther_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prepphraseOther"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:54:2: prepphraseOther : inAll nounphrase ;
    public final ChemicalChunkerParser.prepphraseOther_return prepphraseOther() throws RecognitionException {
        ChemicalChunkerParser.prepphraseOther_return retval = new ChemicalChunkerParser.prepphraseOther_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll91 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase92 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphraseOther");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 2);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:55:2: ( inAll nounphrase )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:55:4: inAll nounphrase
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(55,4);
            pushFollow(FOLLOW_inAll_in_prepphraseOther422);
            inAll91=inAll();

            state._fsp--;

            adaptor.addChild(root_0, inAll91.getTree());
            dbg.location(55,11);
            pushFollow(FOLLOW_nounphrase_in_prepphraseOther425);
            nounphrase92=nounphrase();

            state._fsp--;

            adaptor.addChild(root_0, nounphrase92.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(55, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prepphraseOther");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prepphraseOther"

    public static class prepphraseOf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prepphraseOf"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:56:1: prepphraseOf : inof nounphrase ;
    public final ChemicalChunkerParser.prepphraseOf_return prepphraseOf() throws RecognitionException {
        ChemicalChunkerParser.prepphraseOf_return retval = new ChemicalChunkerParser.prepphraseOf_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inof_return inof93 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase94 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphraseOf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:57:2: ( inof nounphrase )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:57:4: inof nounphrase
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(57,4);
            pushFollow(FOLLOW_inof_in_prepphraseOf434);
            inof93=inof();

            state._fsp--;

            adaptor.addChild(root_0, inof93.getTree());
            dbg.location(57,10);
            pushFollow(FOLLOW_nounphrase_in_prepphraseOf437);
            nounphrase94=nounphrase();

            state._fsp--;

            adaptor.addChild(root_0, nounphrase94.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(57, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prepphraseOf");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prepphraseOf"

    public static class prepphraseIN_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prepphraseIN"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:59:1: prepphraseIN : inin molecule ;
    public final ChemicalChunkerParser.prepphraseIN_return prepphraseIN() throws RecognitionException {
        ChemicalChunkerParser.prepphraseIN_return retval = new ChemicalChunkerParser.prepphraseIN_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inin_return inin95 = null;

        ChemicalChunkerParser.molecule_return molecule96 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphraseIN");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:60:2: ( inin molecule )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:60:5: inin molecule
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(60,5);
            pushFollow(FOLLOW_inin_in_prepphraseIN448);
            inin95=inin();

            state._fsp--;

            adaptor.addChild(root_0, inin95.getTree());
            dbg.location(60,10);
            pushFollow(FOLLOW_molecule_in_prepphraseIN450);
            molecule96=molecule();

            state._fsp--;

            adaptor.addChild(root_0, molecule96.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(60, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prepphraseIN");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prepphraseIN"

    public static class prepphraseTime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prepphraseTime"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:63:1: prepphraseTime : ( inAll )? ( dt )? ( jj )? cd nntime ;
    public final ChemicalChunkerParser.prepphraseTime_return prepphraseTime() throws RecognitionException {
        ChemicalChunkerParser.prepphraseTime_return retval = new ChemicalChunkerParser.prepphraseTime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll97 = null;

        ChemicalChunkerParser.dt_return dt98 = null;

        ChemicalChunkerParser.jj_return jj99 = null;

        ChemicalChunkerParser.cd_return cd100 = null;

        ChemicalChunkerParser.nntime_return nntime101 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphraseTime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:63:15: ( ( inAll )? ( dt )? ( jj )? cd nntime )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:64:2: ( inAll )? ( dt )? ( jj )? cd nntime
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(64,2);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:64:2: ( inAll )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=14 && LA22_0<=29)||LA22_0==133) ) {
                alt22=1;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:64:2: inAll
                    {
                    dbg.location(64,2);
                    pushFollow(FOLLOW_inAll_in_prepphraseTime460);
                    inAll97=inAll();

                    state._fsp--;

                    adaptor.addChild(root_0, inAll97.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}

            dbg.location(64,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:64:9: ( dt )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==123) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:64:9: dt
                    {
                    dbg.location(64,9);
                    pushFollow(FOLLOW_dt_in_prepphraseTime463);
                    dt98=dt();

                    state._fsp--;

                    adaptor.addChild(root_0, dt98.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

            dbg.location(64,13);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:64:13: ( jj )?
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==134) ) {
                alt24=1;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:64:13: jj
                    {
                    dbg.location(64,13);
                    pushFollow(FOLLOW_jj_in_prepphraseTime466);
                    jj99=jj();

                    state._fsp--;

                    adaptor.addChild(root_0, jj99.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(64,17);
            pushFollow(FOLLOW_cd_in_prepphraseTime469);
            cd100=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd100.getTree());
            dbg.location(64,20);
            pushFollow(FOLLOW_nntime_in_prepphraseTime471);
            nntime101=nntime();

            state._fsp--;

            adaptor.addChild(root_0, nntime101.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(64, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prepphraseTime");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prepphraseTime"

    public static class prepphraseTemp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prepphraseTemp"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:66:1: prepphraseTemp : ( inAll )? ( dt )? ( jj )? cd nntemp ;
    public final ChemicalChunkerParser.prepphraseTemp_return prepphraseTemp() throws RecognitionException {
        ChemicalChunkerParser.prepphraseTemp_return retval = new ChemicalChunkerParser.prepphraseTemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll102 = null;

        ChemicalChunkerParser.dt_return dt103 = null;

        ChemicalChunkerParser.jj_return jj104 = null;

        ChemicalChunkerParser.cd_return cd105 = null;

        ChemicalChunkerParser.nntemp_return nntemp106 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphraseTemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:66:15: ( ( inAll )? ( dt )? ( jj )? cd nntemp )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:67:2: ( inAll )? ( dt )? ( jj )? cd nntemp
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(67,2);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:67:2: ( inAll )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=14 && LA25_0<=29)||LA25_0==133) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:67:2: inAll
                    {
                    dbg.location(67,2);
                    pushFollow(FOLLOW_inAll_in_prepphraseTemp479);
                    inAll102=inAll();

                    state._fsp--;

                    adaptor.addChild(root_0, inAll102.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(67,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:67:9: ( dt )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==123) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:67:9: dt
                    {
                    dbg.location(67,9);
                    pushFollow(FOLLOW_dt_in_prepphraseTemp482);
                    dt103=dt();

                    state._fsp--;

                    adaptor.addChild(root_0, dt103.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(67,13);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:67:13: ( jj )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==134) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:67:13: jj
                    {
                    dbg.location(67,13);
                    pushFollow(FOLLOW_jj_in_prepphraseTemp485);
                    jj104=jj();

                    state._fsp--;

                    adaptor.addChild(root_0, jj104.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(67,17);
            pushFollow(FOLLOW_cd_in_prepphraseTemp488);
            cd105=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd105.getTree());
            dbg.location(67,20);
            pushFollow(FOLLOW_nntemp_in_prepphraseTemp490);
            nntemp106=nntemp();

            state._fsp--;

            adaptor.addChild(root_0, nntemp106.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(67, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prepphraseTemp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prepphraseTemp"

    public static class inAll_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inAll"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:1: inAll : ( in | inafter | inas | inbefore | inby | infor | infrom | inin | ininto | inof | inoff | inon | inover | inunder | invia | inwith | inwithout );
    public final ChemicalChunkerParser.inAll_return inAll() throws RecognitionException {
        ChemicalChunkerParser.inAll_return retval = new ChemicalChunkerParser.inAll_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.in_return in107 = null;

        ChemicalChunkerParser.inafter_return inafter108 = null;

        ChemicalChunkerParser.inas_return inas109 = null;

        ChemicalChunkerParser.inbefore_return inbefore110 = null;

        ChemicalChunkerParser.inby_return inby111 = null;

        ChemicalChunkerParser.infor_return infor112 = null;

        ChemicalChunkerParser.infrom_return infrom113 = null;

        ChemicalChunkerParser.inin_return inin114 = null;

        ChemicalChunkerParser.ininto_return ininto115 = null;

        ChemicalChunkerParser.inof_return inof116 = null;

        ChemicalChunkerParser.inoff_return inoff117 = null;

        ChemicalChunkerParser.inon_return inon118 = null;

        ChemicalChunkerParser.inover_return inover119 = null;

        ChemicalChunkerParser.inunder_return inunder120 = null;

        ChemicalChunkerParser.invia_return invia121 = null;

        ChemicalChunkerParser.inwith_return inwith122 = null;

        ChemicalChunkerParser.inwithout_return inwithout123 = null;



        try { dbg.enterRule(getGrammarFileName(), "inAll");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:7: ( in | inafter | inas | inbefore | inby | infor | infrom | inin | ininto | inof | inoff | inon | inover | inunder | invia | inwith | inwithout )
            int alt28=17;
            try { dbg.enterDecision(28);

            switch ( input.LA(1) ) {
            case 133:
                {
                alt28=1;
                }
                break;
            case 16:
                {
                alt28=2;
                }
                break;
            case 14:
                {
                alt28=3;
                }
                break;
            case 15:
                {
                alt28=4;
                }
                break;
            case 21:
                {
                alt28=5;
                }
                break;
            case 25:
                {
                alt28=6;
                }
                break;
            case 26:
                {
                alt28=7;
                }
                break;
            case 17:
                {
                alt28=8;
                }
                break;
            case 18:
                {
                alt28=9;
                }
                break;
            case 23:
                {
                alt28=10;
                }
                break;
            case 29:
                {
                alt28=11;
                }
                break;
            case 24:
                {
                alt28=12;
                }
                break;
            case 28:
                {
                alt28=13;
                }
                break;
            case 27:
                {
                alt28=14;
                }
                break;
            case 22:
                {
                alt28=15;
                }
                break;
            case 19:
                {
                alt28=16;
                }
                break;
            case 20:
                {
                alt28=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:9: in
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,9);
                    pushFollow(FOLLOW_in_in_inAll501);
                    in107=in();

                    state._fsp--;

                    adaptor.addChild(root_0, in107.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:12: inafter
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,12);
                    pushFollow(FOLLOW_inafter_in_inAll503);
                    inafter108=inafter();

                    state._fsp--;

                    adaptor.addChild(root_0, inafter108.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:20: inas
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,20);
                    pushFollow(FOLLOW_inas_in_inAll505);
                    inas109=inas();

                    state._fsp--;

                    adaptor.addChild(root_0, inas109.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:25: inbefore
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,25);
                    pushFollow(FOLLOW_inbefore_in_inAll507);
                    inbefore110=inbefore();

                    state._fsp--;

                    adaptor.addChild(root_0, inbefore110.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:34: inby
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,34);
                    pushFollow(FOLLOW_inby_in_inAll509);
                    inby111=inby();

                    state._fsp--;

                    adaptor.addChild(root_0, inby111.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:39: infor
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,39);
                    pushFollow(FOLLOW_infor_in_inAll511);
                    infor112=infor();

                    state._fsp--;

                    adaptor.addChild(root_0, infor112.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:45: infrom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,45);
                    pushFollow(FOLLOW_infrom_in_inAll513);
                    infrom113=infrom();

                    state._fsp--;

                    adaptor.addChild(root_0, infrom113.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:52: inin
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,52);
                    pushFollow(FOLLOW_inin_in_inAll515);
                    inin114=inin();

                    state._fsp--;

                    adaptor.addChild(root_0, inin114.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:57: ininto
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,57);
                    pushFollow(FOLLOW_ininto_in_inAll517);
                    ininto115=ininto();

                    state._fsp--;

                    adaptor.addChild(root_0, ininto115.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:64: inof
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,64);
                    pushFollow(FOLLOW_inof_in_inAll519);
                    inof116=inof();

                    state._fsp--;

                    adaptor.addChild(root_0, inof116.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:69: inoff
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,69);
                    pushFollow(FOLLOW_inoff_in_inAll521);
                    inoff117=inoff();

                    state._fsp--;

                    adaptor.addChild(root_0, inoff117.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:75: inon
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,75);
                    pushFollow(FOLLOW_inon_in_inAll523);
                    inon118=inon();

                    state._fsp--;

                    adaptor.addChild(root_0, inon118.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:80: inover
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,80);
                    pushFollow(FOLLOW_inover_in_inAll525);
                    inover119=inover();

                    state._fsp--;

                    adaptor.addChild(root_0, inover119.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:87: inunder
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,87);
                    pushFollow(FOLLOW_inunder_in_inAll527);
                    inunder120=inunder();

                    state._fsp--;

                    adaptor.addChild(root_0, inunder120.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:95: invia
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,95);
                    pushFollow(FOLLOW_invia_in_inAll529);
                    invia121=invia();

                    state._fsp--;

                    adaptor.addChild(root_0, invia121.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:101: inwith
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,101);
                    pushFollow(FOLLOW_inwith_in_inAll531);
                    inwith122=inwith();

                    state._fsp--;

                    adaptor.addChild(root_0, inwith122.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:71:108: inwithout
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,108);
                    pushFollow(FOLLOW_inwithout_in_inAll533);
                    inwithout123=inwithout();

                    state._fsp--;

                    adaptor.addChild(root_0, inwithout123.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(71, 118);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inAll");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inAll"

    public static class mmol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mmol"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:75:1: mmol : cd nnmol ;
    public final ChemicalChunkerParser.mmol_return mmol() throws RecognitionException {
        ChemicalChunkerParser.mmol_return retval = new ChemicalChunkerParser.mmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd124 = null;

        ChemicalChunkerParser.nnmol_return nnmol125 = null;



        try { dbg.enterRule(getGrammarFileName(), "mmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:75:6: ( cd nnmol )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:75:8: cd nnmol
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(75,8);
            pushFollow(FOLLOW_cd_in_mmol547);
            cd124=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd124.getTree());
            dbg.location(75,11);
            pushFollow(FOLLOW_nnmol_in_mmol549);
            nnmol125=nnmol();

            state._fsp--;

            adaptor.addChild(root_0, nnmol125.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(75, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mmol");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mmol"

    public static class gram_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "gram"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:76:1: gram : cd nngram ;
    public final ChemicalChunkerParser.gram_return gram() throws RecognitionException {
        ChemicalChunkerParser.gram_return retval = new ChemicalChunkerParser.gram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd126 = null;

        ChemicalChunkerParser.nngram_return nngram127 = null;



        try { dbg.enterRule(getGrammarFileName(), "gram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:76:6: ( cd nngram )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:76:8: cd nngram
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(76,8);
            pushFollow(FOLLOW_cd_in_gram556);
            cd126=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd126.getTree());
            dbg.location(76,11);
            pushFollow(FOLLOW_nngram_in_gram558);
            nngram127=nngram();

            state._fsp--;

            adaptor.addChild(root_0, nngram127.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(76, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "gram");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "gram"

    public static class percent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "percent"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:77:1: percent : cd nnpercent ;
    public final ChemicalChunkerParser.percent_return percent() throws RecognitionException {
        ChemicalChunkerParser.percent_return retval = new ChemicalChunkerParser.percent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd128 = null;

        ChemicalChunkerParser.nnpercent_return nnpercent129 = null;



        try { dbg.enterRule(getGrammarFileName(), "percent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:77:9: ( cd nnpercent )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:77:11: cd nnpercent
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(77,11);
            pushFollow(FOLLOW_cd_in_percent565);
            cd128=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd128.getTree());
            dbg.location(77,14);
            pushFollow(FOLLOW_nnpercent_in_percent567);
            nnpercent129=nnpercent();

            state._fsp--;

            adaptor.addChild(root_0, nnpercent129.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(77, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "percent");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "percent"

    public static class volume_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "volume"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:78:1: volume : cd nnvol ;
    public final ChemicalChunkerParser.volume_return volume() throws RecognitionException {
        ChemicalChunkerParser.volume_return retval = new ChemicalChunkerParser.volume_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd130 = null;

        ChemicalChunkerParser.nnvol_return nnvol131 = null;



        try { dbg.enterRule(getGrammarFileName(), "volume");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:78:8: ( cd nnvol )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:78:10: cd nnvol
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(78,10);
            pushFollow(FOLLOW_cd_in_volume574);
            cd130=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd130.getTree());
            dbg.location(78,13);
            pushFollow(FOLLOW_nnvol_in_volume576);
            nnvol131=nnvol();

            state._fsp--;

            adaptor.addChild(root_0, nnvol131.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(78, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "volume");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "volume"

    public static class measurements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "measurements"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:80:1: measurements : ( mmol | gram | percent | volume );
    public final ChemicalChunkerParser.measurements_return measurements() throws RecognitionException {
        ChemicalChunkerParser.measurements_return retval = new ChemicalChunkerParser.measurements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.mmol_return mmol132 = null;

        ChemicalChunkerParser.gram_return gram133 = null;

        ChemicalChunkerParser.percent_return percent134 = null;

        ChemicalChunkerParser.volume_return volume135 = null;



        try { dbg.enterRule(getGrammarFileName(), "measurements");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:81:2: ( mmol | gram | percent | volume )
            int alt29=4;
            try { dbg.enterDecision(29);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==118) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==TOKEN) ) {
                    switch ( input.LA(3) ) {
                    case 99:
                        {
                        alt29=3;
                        }
                        break;
                    case 33:
                        {
                        alt29=1;
                        }
                        break;
                    case 36:
                        {
                        alt29=4;
                        }
                        break;
                    case 32:
                        {
                        alt29=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:81:3: mmol
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(81,3);
                    pushFollow(FOLLOW_mmol_in_measurements584);
                    mmol132=mmol();

                    state._fsp--;

                    adaptor.addChild(root_0, mmol132.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:81:8: gram
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(81,8);
                    pushFollow(FOLLOW_gram_in_measurements586);
                    gram133=gram();

                    state._fsp--;

                    adaptor.addChild(root_0, gram133.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:81:13: percent
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(81,13);
                    pushFollow(FOLLOW_percent_in_measurements588);
                    percent134=percent();

                    state._fsp--;

                    adaptor.addChild(root_0, percent134.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:81:21: volume
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(81,21);
                    pushFollow(FOLLOW_volume_in_measurements590);
                    volume135=volume();

                    state._fsp--;

                    adaptor.addChild(root_0, volume135.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(81, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "measurements");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "measurements"

    public static class molecule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "molecule"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:84:1: molecule : ( oscarcm )+ amount ;
    public final ChemicalChunkerParser.molecule_return molecule() throws RecognitionException {
        ChemicalChunkerParser.molecule_return retval = new ChemicalChunkerParser.molecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarcm_return oscarcm136 = null;

        ChemicalChunkerParser.amount_return amount137 = null;



        try { dbg.enterRule(getGrammarFileName(), "molecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:85:2: ( ( oscarcm )+ amount )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:85:6: ( oscarcm )+ amount
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(85,6);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:85:6: ( oscarcm )+
            int cnt30=0;
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==49) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:85:6: oscarcm
            	    {
            	    dbg.location(85,6);
            	    pushFollow(FOLLOW_oscarcm_in_molecule614);
            	    oscarcm136=oscarcm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, oscarcm136.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt30++;
            } while (true);
            } finally {dbg.exitSubRule(30);}

            dbg.location(85,15);
            pushFollow(FOLLOW_amount_in_molecule617);
            amount137=amount();

            state._fsp--;

            adaptor.addChild(root_0, amount137.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(85, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "molecule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "molecule"

    public static class unnamedmolecule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unnamedmolecule"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:86:1: unnamedmolecule : ( oscarcd )+ ( amount )* ;
    public final ChemicalChunkerParser.unnamedmolecule_return unnamedmolecule() throws RecognitionException {
        ChemicalChunkerParser.unnamedmolecule_return retval = new ChemicalChunkerParser.unnamedmolecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd138 = null;

        ChemicalChunkerParser.amount_return amount139 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmolecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:87:2: ( ( oscarcd )+ ( amount )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:87:4: ( oscarcd )+ ( amount )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(87,4);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:87:4: ( oscarcd )+
            int cnt31=0;
            try { dbg.enterSubRule(31);

            loop31:
            do {
                int alt31=2;
                try { dbg.enterDecision(31);

                int LA31_0 = input.LA(1);

                if ( (LA31_0==9) ) {
                    alt31=1;
                }


                } finally {dbg.exitDecision(31);}

                switch (alt31) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:87:4: oscarcd
            	    {
            	    dbg.location(87,4);
            	    pushFollow(FOLLOW_oscarcd_in_unnamedmolecule627);
            	    oscarcd138=oscarcd();

            	    state._fsp--;

            	    adaptor.addChild(root_0, oscarcd138.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt31++;
            } while (true);
            } finally {dbg.exitSubRule(31);}

            dbg.location(87,13);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:87:13: ( amount )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                int LA32_0 = input.LA(1);

                if ( (LA32_0==102) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:87:13: amount
            	    {
            	    dbg.location(87,13);
            	    pushFollow(FOLLOW_amount_in_unnamedmolecule630);
            	    amount139=amount();

            	    state._fsp--;

            	    adaptor.addChild(root_0, amount139.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(87, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unnamedmolecule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unnamedmolecule"

    public static class amount_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "amount"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:89:1: amount : lrb measurements comma measurements rrb ;
    public final ChemicalChunkerParser.amount_return amount() throws RecognitionException {
        ChemicalChunkerParser.amount_return retval = new ChemicalChunkerParser.amount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.lrb_return lrb140 = null;

        ChemicalChunkerParser.measurements_return measurements141 = null;

        ChemicalChunkerParser.comma_return comma142 = null;

        ChemicalChunkerParser.measurements_return measurements143 = null;

        ChemicalChunkerParser.rrb_return rrb144 = null;



        try { dbg.enterRule(getGrammarFileName(), "amount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:89:9: ( lrb measurements comma measurements rrb )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:89:11: lrb measurements comma measurements rrb
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(89,11);
            pushFollow(FOLLOW_lrb_in_amount643);
            lrb140=lrb();

            state._fsp--;

            adaptor.addChild(root_0, lrb140.getTree());
            dbg.location(89,15);
            pushFollow(FOLLOW_measurements_in_amount645);
            measurements141=measurements();

            state._fsp--;

            adaptor.addChild(root_0, measurements141.getTree());
            dbg.location(89,28);
            pushFollow(FOLLOW_comma_in_amount647);
            comma142=comma();

            state._fsp--;

            adaptor.addChild(root_0, comma142.getTree());
            dbg.location(89,35);
            pushFollow(FOLLOW_measurements_in_amount650);
            measurements143=measurements();

            state._fsp--;

            adaptor.addChild(root_0, measurements143.getTree());
            dbg.location(89,49);
            pushFollow(FOLLOW_rrb_in_amount653);
            rrb144=rrb();

            state._fsp--;

            adaptor.addChild(root_0, rrb144.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(89, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "amount");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "amount"

    public static class method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:91:1: method : ( nngeneral | nn )? nnmethod ( oscarcd | cd )? ;
    public final ChemicalChunkerParser.method_return method() throws RecognitionException {
        ChemicalChunkerParser.method_return retval = new ChemicalChunkerParser.method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.nngeneral_return nngeneral145 = null;

        ChemicalChunkerParser.nn_return nn146 = null;

        ChemicalChunkerParser.nnmethod_return nnmethod147 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd148 = null;

        ChemicalChunkerParser.cd_return cd149 = null;



        try { dbg.enterRule(getGrammarFileName(), "method");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:91:7: ( ( nngeneral | nn )? nnmethod ( oscarcd | cd )? )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:92:5: ( nngeneral | nn )? nnmethod ( oscarcd | cd )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(92,5);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:92:5: ( nngeneral | nn )?
            int alt33=3;
            try { dbg.enterSubRule(33);
            try { dbg.enterDecision(33);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            else if ( (LA33_0==140) ) {
                alt33=2;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:92:6: nngeneral
                    {
                    dbg.location(92,6);
                    pushFollow(FOLLOW_nngeneral_in_method665);
                    nngeneral145=nngeneral();

                    state._fsp--;

                    adaptor.addChild(root_0, nngeneral145.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:92:16: nn
                    {
                    dbg.location(92,16);
                    pushFollow(FOLLOW_nn_in_method667);
                    nn146=nn();

                    state._fsp--;

                    adaptor.addChild(root_0, nn146.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(33);}

            dbg.location(92,21);
            pushFollow(FOLLOW_nnmethod_in_method671);
            nnmethod147=nnmethod();

            state._fsp--;

            adaptor.addChild(root_0, nnmethod147.getTree());
            dbg.location(92,30);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:92:30: ( oscarcd | cd )?
            int alt34=3;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==9) ) {
                alt34=1;
            }
            else if ( (LA34_0==118) ) {
                alt34=2;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:92:31: oscarcd
                    {
                    dbg.location(92,31);
                    pushFollow(FOLLOW_oscarcd_in_method674);
                    oscarcd148=oscarcd();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcd148.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:92:39: cd
                    {
                    dbg.location(92,39);
                    pushFollow(FOLLOW_cd_in_method676);
                    cd149=cd();

                    state._fsp--;

                    adaptor.addChild(root_0, cd149.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(34);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(92, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "method");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "method"

    public static class oscarcd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oscarcd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:95:1: oscarcd : 'OSCAR-CD' TOKEN ;
    public final ChemicalChunkerParser.oscarcd_return oscarcd() throws RecognitionException {
        ChemicalChunkerParser.oscarcd_return retval = new ChemicalChunkerParser.oscarcd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal150=null;
        Token TOKEN151=null;

        Object string_literal150_tree=null;
        Object TOKEN151_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:95:8: ( 'OSCAR-CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:95:9: 'OSCAR-CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(95,9);
            string_literal150=(Token)match(input,9,FOLLOW_9_in_oscarcd686); 
            string_literal150_tree = (Object)adaptor.create(string_literal150);
            adaptor.addChild(root_0, string_literal150_tree);

            dbg.location(95,20);
            TOKEN151=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcd688); 
            TOKEN151_tree = (Object)adaptor.create(TOKEN151);
            adaptor.addChild(root_0, TOKEN151_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(95, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oscarcd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oscarcd"

    public static class oscarcj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oscarcj"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:96:1: oscarcj : 'OSCAR-CJ' TOKEN ;
    public final ChemicalChunkerParser.oscarcj_return oscarcj() throws RecognitionException {
        ChemicalChunkerParser.oscarcj_return retval = new ChemicalChunkerParser.oscarcj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal152=null;
        Token TOKEN153=null;

        Object string_literal152_tree=null;
        Object TOKEN153_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(96, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:96:8: ( 'OSCAR-CJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:96:9: 'OSCAR-CJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(96,9);
            string_literal152=(Token)match(input,10,FOLLOW_10_in_oscarcj693); 
            string_literal152_tree = (Object)adaptor.create(string_literal152);
            adaptor.addChild(root_0, string_literal152_tree);

            dbg.location(96,20);
            TOKEN153=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcj695); 
            TOKEN153_tree = (Object)adaptor.create(TOKEN153);
            adaptor.addChild(root_0, TOKEN153_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(96, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oscarcj");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oscarcj"

    public static class oscaront_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oscaront"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:97:1: oscaront : 'OSCAR-ONT' TOKEN ;
    public final ChemicalChunkerParser.oscaront_return oscaront() throws RecognitionException {
        ChemicalChunkerParser.oscaront_return retval = new ChemicalChunkerParser.oscaront_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal154=null;
        Token TOKEN155=null;

        Object string_literal154_tree=null;
        Object TOKEN155_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscaront");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:97:9: ( 'OSCAR-ONT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:97:11: 'OSCAR-ONT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(97,11);
            string_literal154=(Token)match(input,11,FOLLOW_11_in_oscaront701); 
            string_literal154_tree = (Object)adaptor.create(string_literal154);
            adaptor.addChild(root_0, string_literal154_tree);

            dbg.location(97,23);
            TOKEN155=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscaront703); 
            TOKEN155_tree = (Object)adaptor.create(TOKEN155);
            adaptor.addChild(root_0, TOKEN155_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(97, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oscaront");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oscaront"

    public static class tmunicode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tmunicode"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:98:1: tmunicode : 'TM-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.tmunicode_return tmunicode() throws RecognitionException {
        ChemicalChunkerParser.tmunicode_return retval = new ChemicalChunkerParser.tmunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal156=null;
        Token TOKEN157=null;

        Object string_literal156_tree=null;
        Object TOKEN157_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "tmunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:98:10: ( 'TM-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:98:11: 'TM-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(98,11);
            string_literal156=(Token)match(input,12,FOLLOW_12_in_tmunicode708); 
            string_literal156_tree = (Object)adaptor.create(string_literal156);
            adaptor.addChild(root_0, string_literal156_tree);

            dbg.location(98,24);
            TOKEN157=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_tmunicode710); 
            TOKEN157_tree = (Object)adaptor.create(TOKEN157);
            adaptor.addChild(root_0, TOKEN157_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(98, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "tmunicode");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "tmunicode"

    public static class cdunicode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cdunicode"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:99:1: cdunicode : 'CD-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.cdunicode_return cdunicode() throws RecognitionException {
        ChemicalChunkerParser.cdunicode_return retval = new ChemicalChunkerParser.cdunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal158=null;
        Token TOKEN159=null;

        Object string_literal158_tree=null;
        Object TOKEN159_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cdunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:99:10: ( 'CD-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:99:11: 'CD-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(99,11);
            string_literal158=(Token)match(input,13,FOLLOW_13_in_cdunicode715); 
            string_literal158_tree = (Object)adaptor.create(string_literal158);
            adaptor.addChild(root_0, string_literal158_tree);

            dbg.location(99,24);
            TOKEN159=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cdunicode717); 
            TOKEN159_tree = (Object)adaptor.create(TOKEN159);
            adaptor.addChild(root_0, TOKEN159_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(99, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cdunicode");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cdunicode"

    public static class inas_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inas"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:102:1: inas : 'IN-AS' TOKEN ;
    public final ChemicalChunkerParser.inas_return inas() throws RecognitionException {
        ChemicalChunkerParser.inas_return retval = new ChemicalChunkerParser.inas_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal160=null;
        Token TOKEN161=null;

        Object string_literal160_tree=null;
        Object TOKEN161_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inas");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:102:5: ( 'IN-AS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:102:6: 'IN-AS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(102,6);
            string_literal160=(Token)match(input,14,FOLLOW_14_in_inas724); 
            string_literal160_tree = (Object)adaptor.create(string_literal160);
            adaptor.addChild(root_0, string_literal160_tree);

            dbg.location(102,14);
            TOKEN161=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inas726); 
            TOKEN161_tree = (Object)adaptor.create(TOKEN161);
            adaptor.addChild(root_0, TOKEN161_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(102, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inas");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inas"

    public static class inbefore_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inbefore"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:103:1: inbefore : 'IN-BEFORE' TOKEN ;
    public final ChemicalChunkerParser.inbefore_return inbefore() throws RecognitionException {
        ChemicalChunkerParser.inbefore_return retval = new ChemicalChunkerParser.inbefore_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal162=null;
        Token TOKEN163=null;

        Object string_literal162_tree=null;
        Object TOKEN163_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inbefore");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:103:9: ( 'IN-BEFORE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:103:10: 'IN-BEFORE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(103,10);
            string_literal162=(Token)match(input,15,FOLLOW_15_in_inbefore731); 
            string_literal162_tree = (Object)adaptor.create(string_literal162);
            adaptor.addChild(root_0, string_literal162_tree);

            dbg.location(103,22);
            TOKEN163=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inbefore733); 
            TOKEN163_tree = (Object)adaptor.create(TOKEN163);
            adaptor.addChild(root_0, TOKEN163_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(103, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inbefore");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inbefore"

    public static class inafter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inafter"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:104:1: inafter : 'IN-AFTER' TOKEN ;
    public final ChemicalChunkerParser.inafter_return inafter() throws RecognitionException {
        ChemicalChunkerParser.inafter_return retval = new ChemicalChunkerParser.inafter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal164=null;
        Token TOKEN165=null;

        Object string_literal164_tree=null;
        Object TOKEN165_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inafter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:104:8: ( 'IN-AFTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:104:9: 'IN-AFTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(104,9);
            string_literal164=(Token)match(input,16,FOLLOW_16_in_inafter738); 
            string_literal164_tree = (Object)adaptor.create(string_literal164);
            adaptor.addChild(root_0, string_literal164_tree);

            dbg.location(104,20);
            TOKEN165=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inafter740); 
            TOKEN165_tree = (Object)adaptor.create(TOKEN165);
            adaptor.addChild(root_0, TOKEN165_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(104, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inafter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inafter"

    public static class inin_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inin"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:105:1: inin : 'IN-IN' TOKEN ;
    public final ChemicalChunkerParser.inin_return inin() throws RecognitionException {
        ChemicalChunkerParser.inin_return retval = new ChemicalChunkerParser.inin_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal166=null;
        Token TOKEN167=null;

        Object string_literal166_tree=null;
        Object TOKEN167_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inin");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:105:5: ( 'IN-IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:105:6: 'IN-IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(105,6);
            string_literal166=(Token)match(input,17,FOLLOW_17_in_inin745); 
            string_literal166_tree = (Object)adaptor.create(string_literal166);
            adaptor.addChild(root_0, string_literal166_tree);

            dbg.location(105,14);
            TOKEN167=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inin747); 
            TOKEN167_tree = (Object)adaptor.create(TOKEN167);
            adaptor.addChild(root_0, TOKEN167_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(105, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inin");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inin"

    public static class ininto_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ininto"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:106:1: ininto : 'IN-INTO' TOKEN ;
    public final ChemicalChunkerParser.ininto_return ininto() throws RecognitionException {
        ChemicalChunkerParser.ininto_return retval = new ChemicalChunkerParser.ininto_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal168=null;
        Token TOKEN169=null;

        Object string_literal168_tree=null;
        Object TOKEN169_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ininto");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:106:7: ( 'IN-INTO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:106:8: 'IN-INTO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(106,8);
            string_literal168=(Token)match(input,18,FOLLOW_18_in_ininto752); 
            string_literal168_tree = (Object)adaptor.create(string_literal168);
            adaptor.addChild(root_0, string_literal168_tree);

            dbg.location(106,18);
            TOKEN169=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ininto754); 
            TOKEN169_tree = (Object)adaptor.create(TOKEN169);
            adaptor.addChild(root_0, TOKEN169_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(106, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ininto");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ininto"

    public static class inwith_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inwith"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:107:1: inwith : 'IN-WITH' TOKEN ;
    public final ChemicalChunkerParser.inwith_return inwith() throws RecognitionException {
        ChemicalChunkerParser.inwith_return retval = new ChemicalChunkerParser.inwith_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal170=null;
        Token TOKEN171=null;

        Object string_literal170_tree=null;
        Object TOKEN171_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:107:7: ( 'IN-WITH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:107:8: 'IN-WITH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(107,8);
            string_literal170=(Token)match(input,19,FOLLOW_19_in_inwith759); 
            string_literal170_tree = (Object)adaptor.create(string_literal170);
            adaptor.addChild(root_0, string_literal170_tree);

            dbg.location(107,18);
            TOKEN171=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwith761); 
            TOKEN171_tree = (Object)adaptor.create(TOKEN171);
            adaptor.addChild(root_0, TOKEN171_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(107, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inwith");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inwith"

    public static class inwithout_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inwithout"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:108:1: inwithout : 'IN-WITHOUT' TOKEN ;
    public final ChemicalChunkerParser.inwithout_return inwithout() throws RecognitionException {
        ChemicalChunkerParser.inwithout_return retval = new ChemicalChunkerParser.inwithout_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal172=null;
        Token TOKEN173=null;

        Object string_literal172_tree=null;
        Object TOKEN173_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwithout");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:108:10: ( 'IN-WITHOUT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:108:11: 'IN-WITHOUT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(108,11);
            string_literal172=(Token)match(input,20,FOLLOW_20_in_inwithout766); 
            string_literal172_tree = (Object)adaptor.create(string_literal172);
            adaptor.addChild(root_0, string_literal172_tree);

            dbg.location(108,24);
            TOKEN173=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwithout768); 
            TOKEN173_tree = (Object)adaptor.create(TOKEN173);
            adaptor.addChild(root_0, TOKEN173_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(108, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inwithout");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inwithout"

    public static class inby_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inby"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:109:1: inby : 'IN-BY' TOKEN ;
    public final ChemicalChunkerParser.inby_return inby() throws RecognitionException {
        ChemicalChunkerParser.inby_return retval = new ChemicalChunkerParser.inby_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal174=null;
        Token TOKEN175=null;

        Object string_literal174_tree=null;
        Object TOKEN175_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inby");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:109:5: ( 'IN-BY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:109:6: 'IN-BY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(109,6);
            string_literal174=(Token)match(input,21,FOLLOW_21_in_inby773); 
            string_literal174_tree = (Object)adaptor.create(string_literal174);
            adaptor.addChild(root_0, string_literal174_tree);

            dbg.location(109,14);
            TOKEN175=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inby775); 
            TOKEN175_tree = (Object)adaptor.create(TOKEN175);
            adaptor.addChild(root_0, TOKEN175_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(109, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inby");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inby"

    public static class invia_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "invia"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:110:1: invia : 'IN-VIA' TOKEN ;
    public final ChemicalChunkerParser.invia_return invia() throws RecognitionException {
        ChemicalChunkerParser.invia_return retval = new ChemicalChunkerParser.invia_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal176=null;
        Token TOKEN177=null;

        Object string_literal176_tree=null;
        Object TOKEN177_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "invia");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:110:6: ( 'IN-VIA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:110:7: 'IN-VIA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(110,7);
            string_literal176=(Token)match(input,22,FOLLOW_22_in_invia780); 
            string_literal176_tree = (Object)adaptor.create(string_literal176);
            adaptor.addChild(root_0, string_literal176_tree);

            dbg.location(110,16);
            TOKEN177=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_invia782); 
            TOKEN177_tree = (Object)adaptor.create(TOKEN177);
            adaptor.addChild(root_0, TOKEN177_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(110, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "invia");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "invia"

    public static class inof_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inof"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:111:1: inof : 'IN-OF' TOKEN ;
    public final ChemicalChunkerParser.inof_return inof() throws RecognitionException {
        ChemicalChunkerParser.inof_return retval = new ChemicalChunkerParser.inof_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal178=null;
        Token TOKEN179=null;

        Object string_literal178_tree=null;
        Object TOKEN179_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inof");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:111:5: ( 'IN-OF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:111:6: 'IN-OF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(111,6);
            string_literal178=(Token)match(input,23,FOLLOW_23_in_inof787); 
            string_literal178_tree = (Object)adaptor.create(string_literal178);
            adaptor.addChild(root_0, string_literal178_tree);

            dbg.location(111,14);
            TOKEN179=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inof789); 
            TOKEN179_tree = (Object)adaptor.create(TOKEN179);
            adaptor.addChild(root_0, TOKEN179_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(111, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inof");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inof"

    public static class inon_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inon"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:112:1: inon : 'IN-ON' TOKEN ;
    public final ChemicalChunkerParser.inon_return inon() throws RecognitionException {
        ChemicalChunkerParser.inon_return retval = new ChemicalChunkerParser.inon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal180=null;
        Token TOKEN181=null;

        Object string_literal180_tree=null;
        Object TOKEN181_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:112:5: ( 'IN-ON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:112:6: 'IN-ON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(112,6);
            string_literal180=(Token)match(input,24,FOLLOW_24_in_inon794); 
            string_literal180_tree = (Object)adaptor.create(string_literal180);
            adaptor.addChild(root_0, string_literal180_tree);

            dbg.location(112,14);
            TOKEN181=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inon796); 
            TOKEN181_tree = (Object)adaptor.create(TOKEN181);
            adaptor.addChild(root_0, TOKEN181_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(112, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inon");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inon"

    public static class infor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "infor"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:113:1: infor : 'IN-FOR' TOKEN ;
    public final ChemicalChunkerParser.infor_return infor() throws RecognitionException {
        ChemicalChunkerParser.infor_return retval = new ChemicalChunkerParser.infor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal182=null;
        Token TOKEN183=null;

        Object string_literal182_tree=null;
        Object TOKEN183_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:113:6: ( 'IN-FOR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:113:7: 'IN-FOR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(113,7);
            string_literal182=(Token)match(input,25,FOLLOW_25_in_infor801); 
            string_literal182_tree = (Object)adaptor.create(string_literal182);
            adaptor.addChild(root_0, string_literal182_tree);

            dbg.location(113,16);
            TOKEN183=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infor803); 
            TOKEN183_tree = (Object)adaptor.create(TOKEN183);
            adaptor.addChild(root_0, TOKEN183_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(113, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "infor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "infor"

    public static class infrom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "infrom"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:114:1: infrom : 'IN-FROM' TOKEN ;
    public final ChemicalChunkerParser.infrom_return infrom() throws RecognitionException {
        ChemicalChunkerParser.infrom_return retval = new ChemicalChunkerParser.infrom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal184=null;
        Token TOKEN185=null;

        Object string_literal184_tree=null;
        Object TOKEN185_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infrom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:114:7: ( 'IN-FROM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:114:8: 'IN-FROM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(114,8);
            string_literal184=(Token)match(input,26,FOLLOW_26_in_infrom808); 
            string_literal184_tree = (Object)adaptor.create(string_literal184);
            adaptor.addChild(root_0, string_literal184_tree);

            dbg.location(114,18);
            TOKEN185=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infrom810); 
            TOKEN185_tree = (Object)adaptor.create(TOKEN185);
            adaptor.addChild(root_0, TOKEN185_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(114, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "infrom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "infrom"

    public static class inunder_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inunder"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:115:1: inunder : 'IN-UNDER' TOKEN ;
    public final ChemicalChunkerParser.inunder_return inunder() throws RecognitionException {
        ChemicalChunkerParser.inunder_return retval = new ChemicalChunkerParser.inunder_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal186=null;
        Token TOKEN187=null;

        Object string_literal186_tree=null;
        Object TOKEN187_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inunder");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:115:8: ( 'IN-UNDER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:115:9: 'IN-UNDER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(115,9);
            string_literal186=(Token)match(input,27,FOLLOW_27_in_inunder815); 
            string_literal186_tree = (Object)adaptor.create(string_literal186);
            adaptor.addChild(root_0, string_literal186_tree);

            dbg.location(115,20);
            TOKEN187=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inunder817); 
            TOKEN187_tree = (Object)adaptor.create(TOKEN187);
            adaptor.addChild(root_0, TOKEN187_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(115, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inunder");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inunder"

    public static class inover_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inover"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:116:1: inover : 'IN-OVER' TOKEN ;
    public final ChemicalChunkerParser.inover_return inover() throws RecognitionException {
        ChemicalChunkerParser.inover_return retval = new ChemicalChunkerParser.inover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal188=null;
        Token TOKEN189=null;

        Object string_literal188_tree=null;
        Object TOKEN189_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:116:7: ( 'IN-OVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:116:8: 'IN-OVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(116,8);
            string_literal188=(Token)match(input,28,FOLLOW_28_in_inover822); 
            string_literal188_tree = (Object)adaptor.create(string_literal188);
            adaptor.addChild(root_0, string_literal188_tree);

            dbg.location(116,18);
            TOKEN189=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inover824); 
            TOKEN189_tree = (Object)adaptor.create(TOKEN189);
            adaptor.addChild(root_0, TOKEN189_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(116, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inover");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inover"

    public static class inoff_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inoff"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:117:1: inoff : 'IN-OFF' TOKEN ;
    public final ChemicalChunkerParser.inoff_return inoff() throws RecognitionException {
        ChemicalChunkerParser.inoff_return retval = new ChemicalChunkerParser.inoff_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal190=null;
        Token TOKEN191=null;

        Object string_literal190_tree=null;
        Object TOKEN191_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inoff");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:117:6: ( 'IN-OFF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:117:7: 'IN-OFF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(117,7);
            string_literal190=(Token)match(input,29,FOLLOW_29_in_inoff829); 
            string_literal190_tree = (Object)adaptor.create(string_literal190);
            adaptor.addChild(root_0, string_literal190_tree);

            dbg.location(117,16);
            TOKEN191=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inoff831); 
            TOKEN191_tree = (Object)adaptor.create(TOKEN191);
            adaptor.addChild(root_0, TOKEN191_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(117, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inoff");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inoff"

    public static class nnstate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnstate"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:120:1: nnstate : 'NN-STATE' TOKEN ;
    public final ChemicalChunkerParser.nnstate_return nnstate() throws RecognitionException {
        ChemicalChunkerParser.nnstate_return retval = new ChemicalChunkerParser.nnstate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal192=null;
        Token TOKEN193=null;

        Object string_literal192_tree=null;
        Object TOKEN193_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnstate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:120:8: ( 'NN-STATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:120:9: 'NN-STATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(120,9);
            string_literal192=(Token)match(input,30,FOLLOW_30_in_nnstate838); 
            string_literal192_tree = (Object)adaptor.create(string_literal192);
            adaptor.addChild(root_0, string_literal192_tree);

            dbg.location(120,20);
            TOKEN193=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnstate840); 
            TOKEN193_tree = (Object)adaptor.create(TOKEN193);
            adaptor.addChild(root_0, TOKEN193_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(120, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnstate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnstate"

    public static class nntime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nntime"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:121:1: nntime : 'NN-TIME' TOKEN ;
    public final ChemicalChunkerParser.nntime_return nntime() throws RecognitionException {
        ChemicalChunkerParser.nntime_return retval = new ChemicalChunkerParser.nntime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal194=null;
        Token TOKEN195=null;

        Object string_literal194_tree=null;
        Object TOKEN195_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:121:7: ( 'NN-TIME' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:121:8: 'NN-TIME' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(121,8);
            string_literal194=(Token)match(input,31,FOLLOW_31_in_nntime845); 
            string_literal194_tree = (Object)adaptor.create(string_literal194);
            adaptor.addChild(root_0, string_literal194_tree);

            dbg.location(121,18);
            TOKEN195=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntime847); 
            TOKEN195_tree = (Object)adaptor.create(TOKEN195);
            adaptor.addChild(root_0, TOKEN195_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(121, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nntime");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nntime"

    public static class nngram_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nngram"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:122:1: nngram : 'NN-GRAM' TOKEN ;
    public final ChemicalChunkerParser.nngram_return nngram() throws RecognitionException {
        ChemicalChunkerParser.nngram_return retval = new ChemicalChunkerParser.nngram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal196=null;
        Token TOKEN197=null;

        Object string_literal196_tree=null;
        Object TOKEN197_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:122:7: ( 'NN-GRAM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:122:8: 'NN-GRAM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(122,8);
            string_literal196=(Token)match(input,32,FOLLOW_32_in_nngram852); 
            string_literal196_tree = (Object)adaptor.create(string_literal196);
            adaptor.addChild(root_0, string_literal196_tree);

            dbg.location(122,18);
            TOKEN197=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngram854); 
            TOKEN197_tree = (Object)adaptor.create(TOKEN197);
            adaptor.addChild(root_0, TOKEN197_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(122, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nngram");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nngram"

    public static class nnmol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnmol"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:123:1: nnmol : 'NN-MOL' TOKEN ;
    public final ChemicalChunkerParser.nnmol_return nnmol() throws RecognitionException {
        ChemicalChunkerParser.nnmol_return retval = new ChemicalChunkerParser.nnmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal198=null;
        Token TOKEN199=null;

        Object string_literal198_tree=null;
        Object TOKEN199_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:123:6: ( 'NN-MOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:123:7: 'NN-MOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(123,7);
            string_literal198=(Token)match(input,33,FOLLOW_33_in_nnmol859); 
            string_literal198_tree = (Object)adaptor.create(string_literal198);
            adaptor.addChild(root_0, string_literal198_tree);

            dbg.location(123,16);
            TOKEN199=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmol861); 
            TOKEN199_tree = (Object)adaptor.create(TOKEN199);
            adaptor.addChild(root_0, TOKEN199_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(123, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnmol");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnmol"

    public static class nnatmosphere_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnatmosphere"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:124:1: nnatmosphere : 'NN-ATMOSPHERE' TOKEN ;
    public final ChemicalChunkerParser.nnatmosphere_return nnatmosphere() throws RecognitionException {
        ChemicalChunkerParser.nnatmosphere_return retval = new ChemicalChunkerParser.nnatmosphere_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal200=null;
        Token TOKEN201=null;

        Object string_literal200_tree=null;
        Object TOKEN201_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnatmosphere");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:124:13: ( 'NN-ATMOSPHERE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:124:14: 'NN-ATMOSPHERE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(124,14);
            string_literal200=(Token)match(input,34,FOLLOW_34_in_nnatmosphere866); 
            string_literal200_tree = (Object)adaptor.create(string_literal200);
            adaptor.addChild(root_0, string_literal200_tree);

            dbg.location(124,30);
            TOKEN201=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnatmosphere868); 
            TOKEN201_tree = (Object)adaptor.create(TOKEN201);
            adaptor.addChild(root_0, TOKEN201_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(124, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnatmosphere");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnatmosphere"

    public static class nneq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nneq"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:125:1: nneq : 'NN-EQ' TOKEN ;
    public final ChemicalChunkerParser.nneq_return nneq() throws RecognitionException {
        ChemicalChunkerParser.nneq_return retval = new ChemicalChunkerParser.nneq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal202=null;
        Token TOKEN203=null;

        Object string_literal202_tree=null;
        Object TOKEN203_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nneq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:125:5: ( 'NN-EQ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:125:6: 'NN-EQ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(125,6);
            string_literal202=(Token)match(input,35,FOLLOW_35_in_nneq873); 
            string_literal202_tree = (Object)adaptor.create(string_literal202);
            adaptor.addChild(root_0, string_literal202_tree);

            dbg.location(125,14);
            TOKEN203=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nneq875); 
            TOKEN203_tree = (Object)adaptor.create(TOKEN203);
            adaptor.addChild(root_0, TOKEN203_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(125, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nneq");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nneq"

    public static class nnvol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnvol"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:126:1: nnvol : 'NN-VOL' TOKEN ;
    public final ChemicalChunkerParser.nnvol_return nnvol() throws RecognitionException {
        ChemicalChunkerParser.nnvol_return retval = new ChemicalChunkerParser.nnvol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal204=null;
        Token TOKEN205=null;

        Object string_literal204_tree=null;
        Object TOKEN205_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:126:6: ( 'NN-VOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:126:7: 'NN-VOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(126,7);
            string_literal204=(Token)match(input,36,FOLLOW_36_in_nnvol880); 
            string_literal204_tree = (Object)adaptor.create(string_literal204);
            adaptor.addChild(root_0, string_literal204_tree);

            dbg.location(126,16);
            TOKEN205=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvol882); 
            TOKEN205_tree = (Object)adaptor.create(TOKEN205);
            adaptor.addChild(root_0, TOKEN205_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(126, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnvol");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnvol"

    public static class nnchementity_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnchementity"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:127:1: nnchementity : 'NN-CHEMENTITY' TOKEN ;
    public final ChemicalChunkerParser.nnchementity_return nnchementity() throws RecognitionException {
        ChemicalChunkerParser.nnchementity_return retval = new ChemicalChunkerParser.nnchementity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal206=null;
        Token TOKEN207=null;

        Object string_literal206_tree=null;
        Object TOKEN207_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchementity");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:127:13: ( 'NN-CHEMENTITY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:127:14: 'NN-CHEMENTITY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(127,14);
            string_literal206=(Token)match(input,37,FOLLOW_37_in_nnchementity887); 
            string_literal206_tree = (Object)adaptor.create(string_literal206);
            adaptor.addChild(root_0, string_literal206_tree);

            dbg.location(127,30);
            TOKEN207=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchementity889); 
            TOKEN207_tree = (Object)adaptor.create(TOKEN207);
            adaptor.addChild(root_0, TOKEN207_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(127, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnchementity");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnchementity"

    public static class nntemp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nntemp"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:128:1: nntemp : 'NN-TEMP' TOKEN ;
    public final ChemicalChunkerParser.nntemp_return nntemp() throws RecognitionException {
        ChemicalChunkerParser.nntemp_return retval = new ChemicalChunkerParser.nntemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal208=null;
        Token TOKEN209=null;

        Object string_literal208_tree=null;
        Object TOKEN209_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:128:7: ( 'NN-TEMP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:128:8: 'NN-TEMP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,8);
            string_literal208=(Token)match(input,38,FOLLOW_38_in_nntemp894); 
            string_literal208_tree = (Object)adaptor.create(string_literal208);
            adaptor.addChild(root_0, string_literal208_tree);

            dbg.location(128,18);
            TOKEN209=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntemp896); 
            TOKEN209_tree = (Object)adaptor.create(TOKEN209);
            adaptor.addChild(root_0, TOKEN209_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(128, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nntemp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nntemp"

    public static class nnflash_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnflash"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:129:1: nnflash : 'NN-FLASH' TOKEN ;
    public final ChemicalChunkerParser.nnflash_return nnflash() throws RecognitionException {
        ChemicalChunkerParser.nnflash_return retval = new ChemicalChunkerParser.nnflash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal210=null;
        Token TOKEN211=null;

        Object string_literal210_tree=null;
        Object TOKEN211_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnflash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:129:8: ( 'NN-FLASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:129:9: 'NN-FLASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(129,9);
            string_literal210=(Token)match(input,39,FOLLOW_39_in_nnflash901); 
            string_literal210_tree = (Object)adaptor.create(string_literal210);
            adaptor.addChild(root_0, string_literal210_tree);

            dbg.location(129,20);
            TOKEN211=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnflash903); 
            TOKEN211_tree = (Object)adaptor.create(TOKEN211);
            adaptor.addChild(root_0, TOKEN211_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(129, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnflash");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnflash"

    public static class nngeneral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nngeneral"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:130:1: nngeneral : 'NN-GENERAL' TOKEN ;
    public final ChemicalChunkerParser.nngeneral_return nngeneral() throws RecognitionException {
        ChemicalChunkerParser.nngeneral_return retval = new ChemicalChunkerParser.nngeneral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal212=null;
        Token TOKEN213=null;

        Object string_literal212_tree=null;
        Object TOKEN213_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngeneral");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(130, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:130:10: ( 'NN-GENERAL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:130:11: 'NN-GENERAL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(130,11);
            string_literal212=(Token)match(input,40,FOLLOW_40_in_nngeneral908); 
            string_literal212_tree = (Object)adaptor.create(string_literal212);
            adaptor.addChild(root_0, string_literal212_tree);

            dbg.location(130,24);
            TOKEN213=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngeneral910); 
            TOKEN213_tree = (Object)adaptor.create(TOKEN213);
            adaptor.addChild(root_0, TOKEN213_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(130, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nngeneral");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nngeneral"

    public static class nnmethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnmethod"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:131:1: nnmethod : 'NN-METHOD' TOKEN ;
    public final ChemicalChunkerParser.nnmethod_return nnmethod() throws RecognitionException {
        ChemicalChunkerParser.nnmethod_return retval = new ChemicalChunkerParser.nnmethod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal214=null;
        Token TOKEN215=null;

        Object string_literal214_tree=null;
        Object TOKEN215_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmethod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:131:9: ( 'NN-METHOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:131:10: 'NN-METHOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(131,10);
            string_literal214=(Token)match(input,41,FOLLOW_41_in_nnmethod915); 
            string_literal214_tree = (Object)adaptor.create(string_literal214);
            adaptor.addChild(root_0, string_literal214_tree);

            dbg.location(131,22);
            TOKEN215=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmethod917); 
            TOKEN215_tree = (Object)adaptor.create(TOKEN215);
            adaptor.addChild(root_0, TOKEN215_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(131, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnmethod");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnmethod"

    public static class nnamount_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnamount"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:132:1: nnamount : 'NN-AMOUNT' TOKEN ;
    public final ChemicalChunkerParser.nnamount_return nnamount() throws RecognitionException {
        ChemicalChunkerParser.nnamount_return retval = new ChemicalChunkerParser.nnamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal216=null;
        Token TOKEN217=null;

        Object string_literal216_tree=null;
        Object TOKEN217_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:132:9: ( 'NN-AMOUNT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:132:10: 'NN-AMOUNT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(132,10);
            string_literal216=(Token)match(input,42,FOLLOW_42_in_nnamount922); 
            string_literal216_tree = (Object)adaptor.create(string_literal216);
            adaptor.addChild(root_0, string_literal216_tree);

            dbg.location(132,22);
            TOKEN217=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnamount924); 
            TOKEN217_tree = (Object)adaptor.create(TOKEN217);
            adaptor.addChild(root_0, TOKEN217_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(132, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnamount");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnamount"

    public static class nnpressure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnpressure"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:133:1: nnpressure : 'NN-PRESSURE' TOKEN ;
    public final ChemicalChunkerParser.nnpressure_return nnpressure() throws RecognitionException {
        ChemicalChunkerParser.nnpressure_return retval = new ChemicalChunkerParser.nnpressure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal218=null;
        Token TOKEN219=null;

        Object string_literal218_tree=null;
        Object TOKEN219_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpressure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:133:11: ( 'NN-PRESSURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:133:12: 'NN-PRESSURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(133,12);
            string_literal218=(Token)match(input,43,FOLLOW_43_in_nnpressure929); 
            string_literal218_tree = (Object)adaptor.create(string_literal218);
            adaptor.addChild(root_0, string_literal218_tree);

            dbg.location(133,26);
            TOKEN219=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpressure931); 
            TOKEN219_tree = (Object)adaptor.create(TOKEN219);
            adaptor.addChild(root_0, TOKEN219_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(133, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnpressure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnpressure"

    public static class nncolumn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nncolumn"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:134:1: nncolumn : 'NN-COLUMN' TOKEN ;
    public final ChemicalChunkerParser.nncolumn_return nncolumn() throws RecognitionException {
        ChemicalChunkerParser.nncolumn_return retval = new ChemicalChunkerParser.nncolumn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal220=null;
        Token TOKEN221=null;

        Object string_literal220_tree=null;
        Object TOKEN221_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncolumn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:134:9: ( 'NN-COLUMN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:134:10: 'NN-COLUMN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(134,10);
            string_literal220=(Token)match(input,44,FOLLOW_44_in_nncolumn936); 
            string_literal220_tree = (Object)adaptor.create(string_literal220);
            adaptor.addChild(root_0, string_literal220_tree);

            dbg.location(134,22);
            TOKEN221=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncolumn938); 
            TOKEN221_tree = (Object)adaptor.create(TOKEN221);
            adaptor.addChild(root_0, TOKEN221_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(134, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nncolumn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nncolumn"

    public static class nnchromatography_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnchromatography"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:135:1: nnchromatography : 'NN-CHROMATOGRAPHY' TOKEN ;
    public final ChemicalChunkerParser.nnchromatography_return nnchromatography() throws RecognitionException {
        ChemicalChunkerParser.nnchromatography_return retval = new ChemicalChunkerParser.nnchromatography_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal222=null;
        Token TOKEN223=null;

        Object string_literal222_tree=null;
        Object TOKEN223_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchromatography");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:135:17: ( 'NN-CHROMATOGRAPHY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:135:18: 'NN-CHROMATOGRAPHY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(135,18);
            string_literal222=(Token)match(input,45,FOLLOW_45_in_nnchromatography943); 
            string_literal222_tree = (Object)adaptor.create(string_literal222);
            adaptor.addChild(root_0, string_literal222_tree);

            dbg.location(135,38);
            TOKEN223=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchromatography945); 
            TOKEN223_tree = (Object)adaptor.create(TOKEN223);
            adaptor.addChild(root_0, TOKEN223_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(135, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnchromatography");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnchromatography"

    public static class nnvacuum_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnvacuum"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:136:1: nnvacuum : 'NN-VACUUM' TOKEN ;
    public final ChemicalChunkerParser.nnvacuum_return nnvacuum() throws RecognitionException {
        ChemicalChunkerParser.nnvacuum_return retval = new ChemicalChunkerParser.nnvacuum_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal224=null;
        Token TOKEN225=null;

        Object string_literal224_tree=null;
        Object TOKEN225_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvacuum");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:136:9: ( 'NN-VACUUM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:136:10: 'NN-VACUUM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(136,10);
            string_literal224=(Token)match(input,46,FOLLOW_46_in_nnvacuum950); 
            string_literal224_tree = (Object)adaptor.create(string_literal224);
            adaptor.addChild(root_0, string_literal224_tree);

            dbg.location(136,22);
            TOKEN225=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvacuum952); 
            TOKEN225_tree = (Object)adaptor.create(TOKEN225);
            adaptor.addChild(root_0, TOKEN225_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(136, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnvacuum");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnvacuum"

    public static class nncycle_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nncycle"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:137:1: nncycle : 'NN-CYCLE' TOKEN ;
    public final ChemicalChunkerParser.nncycle_return nncycle() throws RecognitionException {
        ChemicalChunkerParser.nncycle_return retval = new ChemicalChunkerParser.nncycle_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal226=null;
        Token TOKEN227=null;

        Object string_literal226_tree=null;
        Object TOKEN227_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncycle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:137:8: ( 'NN-CYCLE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:137:9: 'NN-CYCLE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(137,9);
            string_literal226=(Token)match(input,47,FOLLOW_47_in_nncycle957); 
            string_literal226_tree = (Object)adaptor.create(string_literal226);
            adaptor.addChild(root_0, string_literal226_tree);

            dbg.location(137,20);
            TOKEN227=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncycle959); 
            TOKEN227_tree = (Object)adaptor.create(TOKEN227);
            adaptor.addChild(root_0, TOKEN227_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(137, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nncycle");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nncycle"

    public static class nntimes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nntimes"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:138:1: nntimes : 'NN-TIMES' TOKEN ;
    public final ChemicalChunkerParser.nntimes_return nntimes() throws RecognitionException {
        ChemicalChunkerParser.nntimes_return retval = new ChemicalChunkerParser.nntimes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal228=null;
        Token TOKEN229=null;

        Object string_literal228_tree=null;
        Object TOKEN229_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntimes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:138:8: ( 'NN-TIMES' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:138:9: 'NN-TIMES' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(138,9);
            string_literal228=(Token)match(input,48,FOLLOW_48_in_nntimes964); 
            string_literal228_tree = (Object)adaptor.create(string_literal228);
            adaptor.addChild(root_0, string_literal228_tree);

            dbg.location(138,20);
            TOKEN229=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntimes966); 
            TOKEN229_tree = (Object)adaptor.create(TOKEN229);
            adaptor.addChild(root_0, TOKEN229_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(138, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nntimes");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nntimes"

    public static class oscarcm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oscarcm"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:141:1: oscarcm : 'OSCAR-CM' TOKEN ;
    public final ChemicalChunkerParser.oscarcm_return oscarcm() throws RecognitionException {
        ChemicalChunkerParser.oscarcm_return retval = new ChemicalChunkerParser.oscarcm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal230=null;
        Token TOKEN231=null;

        Object string_literal230_tree=null;
        Object TOKEN231_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:141:8: ( 'OSCAR-CM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:141:9: 'OSCAR-CM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(141,9);
            string_literal230=(Token)match(input,49,FOLLOW_49_in_oscarcm973); 
            string_literal230_tree = (Object)adaptor.create(string_literal230);
            adaptor.addChild(root_0, string_literal230_tree);

            dbg.location(141,20);
            TOKEN231=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcm975); 
            TOKEN231_tree = (Object)adaptor.create(TOKEN231);
            adaptor.addChild(root_0, TOKEN231_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(141, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oscarcm");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oscarcm"

    public static class vbuse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbuse"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:144:1: vbuse : 'VB-USE' TOKEN ;
    public final ChemicalChunkerParser.vbuse_return vbuse() throws RecognitionException {
        ChemicalChunkerParser.vbuse_return retval = new ChemicalChunkerParser.vbuse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal232=null;
        Token TOKEN233=null;

        Object string_literal232_tree=null;
        Object TOKEN233_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbuse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:144:6: ( 'VB-USE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:144:7: 'VB-USE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(144,7);
            string_literal232=(Token)match(input,50,FOLLOW_50_in_vbuse982); 
            string_literal232_tree = (Object)adaptor.create(string_literal232);
            adaptor.addChild(root_0, string_literal232_tree);

            dbg.location(144,16);
            TOKEN233=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbuse984); 
            TOKEN233_tree = (Object)adaptor.create(TOKEN233);
            adaptor.addChild(root_0, TOKEN233_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(144, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbuse");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbuse"

    public static class vbchange_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbchange"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:145:1: vbchange : 'VB-CHANGE' TOKEN ;
    public final ChemicalChunkerParser.vbchange_return vbchange() throws RecognitionException {
        ChemicalChunkerParser.vbchange_return retval = new ChemicalChunkerParser.vbchange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal234=null;
        Token TOKEN235=null;

        Object string_literal234_tree=null;
        Object TOKEN235_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbchange");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:145:9: ( 'VB-CHANGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:145:10: 'VB-CHANGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(145,10);
            string_literal234=(Token)match(input,51,FOLLOW_51_in_vbchange989); 
            string_literal234_tree = (Object)adaptor.create(string_literal234);
            adaptor.addChild(root_0, string_literal234_tree);

            dbg.location(145,22);
            TOKEN235=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbchange991); 
            TOKEN235_tree = (Object)adaptor.create(TOKEN235);
            adaptor.addChild(root_0, TOKEN235_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(145, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbchange");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbchange"

    public static class vbsubmerge_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbsubmerge"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:146:1: vbsubmerge : 'VB-SUBMERGE' TOKEN ;
    public final ChemicalChunkerParser.vbsubmerge_return vbsubmerge() throws RecognitionException {
        ChemicalChunkerParser.vbsubmerge_return retval = new ChemicalChunkerParser.vbsubmerge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal236=null;
        Token TOKEN237=null;

        Object string_literal236_tree=null;
        Object TOKEN237_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubmerge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:146:11: ( 'VB-SUBMERGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:146:12: 'VB-SUBMERGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(146,12);
            string_literal236=(Token)match(input,52,FOLLOW_52_in_vbsubmerge996); 
            string_literal236_tree = (Object)adaptor.create(string_literal236);
            adaptor.addChild(root_0, string_literal236_tree);

            dbg.location(146,26);
            TOKEN237=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubmerge998); 
            TOKEN237_tree = (Object)adaptor.create(TOKEN237);
            adaptor.addChild(root_0, TOKEN237_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(146, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbsubmerge");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbsubmerge"

    public static class vbsubject_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbsubject"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:147:1: vbsubject : 'VB-SUBJECT' TOKEN ;
    public final ChemicalChunkerParser.vbsubject_return vbsubject() throws RecognitionException {
        ChemicalChunkerParser.vbsubject_return retval = new ChemicalChunkerParser.vbsubject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal238=null;
        Token TOKEN239=null;

        Object string_literal238_tree=null;
        Object TOKEN239_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubject");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:147:10: ( 'VB-SUBJECT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:147:11: 'VB-SUBJECT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(147,11);
            string_literal238=(Token)match(input,53,FOLLOW_53_in_vbsubject1003); 
            string_literal238_tree = (Object)adaptor.create(string_literal238);
            adaptor.addChild(root_0, string_literal238_tree);

            dbg.location(147,24);
            TOKEN239=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubject1005); 
            TOKEN239_tree = (Object)adaptor.create(TOKEN239);
            adaptor.addChild(root_0, TOKEN239_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(147, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbsubject");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbsubject"

    public static class nnadd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnadd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:150:1: nnadd : 'NN-ADD' TOKEN ;
    public final ChemicalChunkerParser.nnadd_return nnadd() throws RecognitionException {
        ChemicalChunkerParser.nnadd_return retval = new ChemicalChunkerParser.nnadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal240=null;
        Token TOKEN241=null;

        Object string_literal240_tree=null;
        Object TOKEN241_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:150:6: ( 'NN-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:150:7: 'NN-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(150,7);
            string_literal240=(Token)match(input,54,FOLLOW_54_in_nnadd1012); 
            string_literal240_tree = (Object)adaptor.create(string_literal240);
            adaptor.addChild(root_0, string_literal240_tree);

            dbg.location(150,16);
            TOKEN241=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnadd1014); 
            TOKEN241_tree = (Object)adaptor.create(TOKEN241);
            adaptor.addChild(root_0, TOKEN241_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(150, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnadd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnadd"

    public static class nnmixture_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnmixture"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:151:1: nnmixture : 'NN-MIXTURE' TOKEN ;
    public final ChemicalChunkerParser.nnmixture_return nnmixture() throws RecognitionException {
        ChemicalChunkerParser.nnmixture_return retval = new ChemicalChunkerParser.nnmixture_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal242=null;
        Token TOKEN243=null;

        Object string_literal242_tree=null;
        Object TOKEN243_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:151:10: ( 'NN-MIXTURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:151:11: 'NN-MIXTURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(151,11);
            string_literal242=(Token)match(input,55,FOLLOW_55_in_nnmixture1019); 
            string_literal242_tree = (Object)adaptor.create(string_literal242);
            adaptor.addChild(root_0, string_literal242_tree);

            dbg.location(151,24);
            TOKEN243=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmixture1021); 
            TOKEN243_tree = (Object)adaptor.create(TOKEN243);
            adaptor.addChild(root_0, TOKEN243_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(151, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnmixture");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnmixture"

    public static class vbadd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbadd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:152:1: vbadd : 'VB-ADD' TOKEN ;
    public final ChemicalChunkerParser.vbadd_return vbadd() throws RecognitionException {
        ChemicalChunkerParser.vbadd_return retval = new ChemicalChunkerParser.vbadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal244=null;
        Token TOKEN245=null;

        Object string_literal244_tree=null;
        Object TOKEN245_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:152:6: ( 'VB-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:152:7: 'VB-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(152,7);
            string_literal244=(Token)match(input,56,FOLLOW_56_in_vbadd1026); 
            string_literal244_tree = (Object)adaptor.create(string_literal244);
            adaptor.addChild(root_0, string_literal244_tree);

            dbg.location(152,16);
            TOKEN245=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbadd1028); 
            TOKEN245_tree = (Object)adaptor.create(TOKEN245);
            adaptor.addChild(root_0, TOKEN245_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(152, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbadd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbadd"

    public static class vbcharge_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbcharge"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:153:1: vbcharge : 'VB-CHARGE' TOKEN ;
    public final ChemicalChunkerParser.vbcharge_return vbcharge() throws RecognitionException {
        ChemicalChunkerParser.vbcharge_return retval = new ChemicalChunkerParser.vbcharge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal246=null;
        Token TOKEN247=null;

        Object string_literal246_tree=null;
        Object TOKEN247_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcharge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:153:9: ( 'VB-CHARGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:153:10: 'VB-CHARGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(153,10);
            string_literal246=(Token)match(input,57,FOLLOW_57_in_vbcharge1033); 
            string_literal246_tree = (Object)adaptor.create(string_literal246);
            adaptor.addChild(root_0, string_literal246_tree);

            dbg.location(153,22);
            TOKEN247=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcharge1035); 
            TOKEN247_tree = (Object)adaptor.create(TOKEN247);
            adaptor.addChild(root_0, TOKEN247_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(153, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbcharge");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbcharge"

    public static class vbcontain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbcontain"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:154:1: vbcontain : 'VB-CONTAIN' TOKEN ;
    public final ChemicalChunkerParser.vbcontain_return vbcontain() throws RecognitionException {
        ChemicalChunkerParser.vbcontain_return retval = new ChemicalChunkerParser.vbcontain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal248=null;
        Token TOKEN249=null;

        Object string_literal248_tree=null;
        Object TOKEN249_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcontain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:154:10: ( 'VB-CONTAIN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:154:11: 'VB-CONTAIN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(154,11);
            string_literal248=(Token)match(input,58,FOLLOW_58_in_vbcontain1040); 
            string_literal248_tree = (Object)adaptor.create(string_literal248);
            adaptor.addChild(root_0, string_literal248_tree);

            dbg.location(154,24);
            TOKEN249=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcontain1042); 
            TOKEN249_tree = (Object)adaptor.create(TOKEN249);
            adaptor.addChild(root_0, TOKEN249_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(154, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbcontain");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbcontain"

    public static class vbdrop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbdrop"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:155:1: vbdrop : 'VB-DROP' TOKEN ;
    public final ChemicalChunkerParser.vbdrop_return vbdrop() throws RecognitionException {
        ChemicalChunkerParser.vbdrop_return retval = new ChemicalChunkerParser.vbdrop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal250=null;
        Token TOKEN251=null;

        Object string_literal250_tree=null;
        Object TOKEN251_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdrop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:155:7: ( 'VB-DROP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:155:8: 'VB-DROP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(155,8);
            string_literal250=(Token)match(input,59,FOLLOW_59_in_vbdrop1047); 
            string_literal250_tree = (Object)adaptor.create(string_literal250);
            adaptor.addChild(root_0, string_literal250_tree);

            dbg.location(155,18);
            TOKEN251=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdrop1049); 
            TOKEN251_tree = (Object)adaptor.create(TOKEN251);
            adaptor.addChild(root_0, TOKEN251_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(155, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbdrop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbdrop"

    public static class vbfill_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbfill"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:156:1: vbfill : 'VB-FILL' TOKEN ;
    public final ChemicalChunkerParser.vbfill_return vbfill() throws RecognitionException {
        ChemicalChunkerParser.vbfill_return retval = new ChemicalChunkerParser.vbfill_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal252=null;
        Token TOKEN253=null;

        Object string_literal252_tree=null;
        Object TOKEN253_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfill");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:156:7: ( 'VB-FILL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:156:8: 'VB-FILL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,8);
            string_literal252=(Token)match(input,60,FOLLOW_60_in_vbfill1054); 
            string_literal252_tree = (Object)adaptor.create(string_literal252);
            adaptor.addChild(root_0, string_literal252_tree);

            dbg.location(156,18);
            TOKEN253=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfill1056); 
            TOKEN253_tree = (Object)adaptor.create(TOKEN253);
            adaptor.addChild(root_0, TOKEN253_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(156, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbfill");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbfill"

    public static class vbsuspend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbsuspend"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:157:1: vbsuspend : 'VB-SUSPEND' TOKEN ;
    public final ChemicalChunkerParser.vbsuspend_return vbsuspend() throws RecognitionException {
        ChemicalChunkerParser.vbsuspend_return retval = new ChemicalChunkerParser.vbsuspend_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal254=null;
        Token TOKEN255=null;

        Object string_literal254_tree=null;
        Object TOKEN255_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsuspend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:157:10: ( 'VB-SUSPEND' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:157:11: 'VB-SUSPEND' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(157,11);
            string_literal254=(Token)match(input,61,FOLLOW_61_in_vbsuspend1061); 
            string_literal254_tree = (Object)adaptor.create(string_literal254);
            adaptor.addChild(root_0, string_literal254_tree);

            dbg.location(157,24);
            TOKEN255=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsuspend1063); 
            TOKEN255_tree = (Object)adaptor.create(TOKEN255);
            adaptor.addChild(root_0, TOKEN255_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(157, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbsuspend");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbsuspend"

    public static class vbtreat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbtreat"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:158:1: vbtreat : 'VB-TREAT' TOKEN ;
    public final ChemicalChunkerParser.vbtreat_return vbtreat() throws RecognitionException {
        ChemicalChunkerParser.vbtreat_return retval = new ChemicalChunkerParser.vbtreat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal256=null;
        Token TOKEN257=null;

        Object string_literal256_tree=null;
        Object TOKEN257_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtreat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:158:8: ( 'VB-TREAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:158:9: 'VB-TREAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(158,9);
            string_literal256=(Token)match(input,62,FOLLOW_62_in_vbtreat1068); 
            string_literal256_tree = (Object)adaptor.create(string_literal256);
            adaptor.addChild(root_0, string_literal256_tree);

            dbg.location(158,20);
            TOKEN257=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtreat1070); 
            TOKEN257_tree = (Object)adaptor.create(TOKEN257);
            adaptor.addChild(root_0, TOKEN257_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(158, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbtreat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbtreat"

    public static class vbapparatus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbapparatus"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:161:1: vbapparatus : 'VB-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.vbapparatus_return vbapparatus() throws RecognitionException {
        ChemicalChunkerParser.vbapparatus_return retval = new ChemicalChunkerParser.vbapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal258=null;
        Token TOKEN259=null;

        Object string_literal258_tree=null;
        Object TOKEN259_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:161:12: ( 'VB-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:161:13: 'VB-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(161,13);
            string_literal258=(Token)match(input,63,FOLLOW_63_in_vbapparatus1077); 
            string_literal258_tree = (Object)adaptor.create(string_literal258);
            adaptor.addChild(root_0, string_literal258_tree);

            dbg.location(161,28);
            TOKEN259=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbapparatus1079); 
            TOKEN259_tree = (Object)adaptor.create(TOKEN259);
            adaptor.addChild(root_0, TOKEN259_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(161, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbapparatus");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbapparatus"

    public static class nnapparatus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnapparatus"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:162:1: nnapparatus : 'NN-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.nnapparatus_return nnapparatus() throws RecognitionException {
        ChemicalChunkerParser.nnapparatus_return retval = new ChemicalChunkerParser.nnapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal260=null;
        Token TOKEN261=null;

        Object string_literal260_tree=null;
        Object TOKEN261_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(162, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:162:12: ( 'NN-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:162:13: 'NN-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(162,13);
            string_literal260=(Token)match(input,64,FOLLOW_64_in_nnapparatus1084); 
            string_literal260_tree = (Object)adaptor.create(string_literal260);
            adaptor.addChild(root_0, string_literal260_tree);

            dbg.location(162,28);
            TOKEN261=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnapparatus1086); 
            TOKEN261_tree = (Object)adaptor.create(TOKEN261);
            adaptor.addChild(root_0, TOKEN261_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(162, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnapparatus");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnapparatus"

    public static class vbconcentrate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbconcentrate"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:165:1: vbconcentrate : 'VB-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.vbconcentrate_return vbconcentrate() throws RecognitionException {
        ChemicalChunkerParser.vbconcentrate_return retval = new ChemicalChunkerParser.vbconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal262=null;
        Token TOKEN263=null;

        Object string_literal262_tree=null;
        Object TOKEN263_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(165, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:165:14: ( 'VB-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:165:15: 'VB-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(165,15);
            string_literal262=(Token)match(input,65,FOLLOW_65_in_vbconcentrate1093); 
            string_literal262_tree = (Object)adaptor.create(string_literal262);
            adaptor.addChild(root_0, string_literal262_tree);

            dbg.location(165,32);
            TOKEN263=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbconcentrate1095); 
            TOKEN263_tree = (Object)adaptor.create(TOKEN263);
            adaptor.addChild(root_0, TOKEN263_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(165, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbconcentrate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbconcentrate"

    public static class nnconcentrate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnconcentrate"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:166:1: nnconcentrate : 'NN-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.nnconcentrate_return nnconcentrate() throws RecognitionException {
        ChemicalChunkerParser.nnconcentrate_return retval = new ChemicalChunkerParser.nnconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal264=null;
        Token TOKEN265=null;

        Object string_literal264_tree=null;
        Object TOKEN265_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:166:14: ( 'NN-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:166:15: 'NN-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(166,15);
            string_literal264=(Token)match(input,66,FOLLOW_66_in_nnconcentrate1100); 
            string_literal264_tree = (Object)adaptor.create(string_literal264);
            adaptor.addChild(root_0, string_literal264_tree);

            dbg.location(166,32);
            TOKEN265=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnconcentrate1102); 
            TOKEN265_tree = (Object)adaptor.create(TOKEN265);
            adaptor.addChild(root_0, TOKEN265_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(166, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnconcentrate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnconcentrate"

    public static class vbcool_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbcool"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:169:1: vbcool : 'VB-COOL' TOKEN ;
    public final ChemicalChunkerParser.vbcool_return vbcool() throws RecognitionException {
        ChemicalChunkerParser.vbcool_return retval = new ChemicalChunkerParser.vbcool_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal266=null;
        Token TOKEN267=null;

        Object string_literal266_tree=null;
        Object TOKEN267_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:169:7: ( 'VB-COOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:169:8: 'VB-COOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(169,8);
            string_literal266=(Token)match(input,67,FOLLOW_67_in_vbcool1109); 
            string_literal266_tree = (Object)adaptor.create(string_literal266);
            adaptor.addChild(root_0, string_literal266_tree);

            dbg.location(169,18);
            TOKEN267=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcool1111); 
            TOKEN267_tree = (Object)adaptor.create(TOKEN267);
            adaptor.addChild(root_0, TOKEN267_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(169, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbcool");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbcool"

    public static class vbdegass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbdegass"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:172:1: vbdegass : 'VB-DEGASS' TOKEN ;
    public final ChemicalChunkerParser.vbdegass_return vbdegass() throws RecognitionException {
        ChemicalChunkerParser.vbdegass_return retval = new ChemicalChunkerParser.vbdegass_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal268=null;
        Token TOKEN269=null;

        Object string_literal268_tree=null;
        Object TOKEN269_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdegass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:172:9: ( 'VB-DEGASS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:172:10: 'VB-DEGASS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(172,10);
            string_literal268=(Token)match(input,68,FOLLOW_68_in_vbdegass1118); 
            string_literal268_tree = (Object)adaptor.create(string_literal268);
            adaptor.addChild(root_0, string_literal268_tree);

            dbg.location(172,22);
            TOKEN269=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdegass1120); 
            TOKEN269_tree = (Object)adaptor.create(TOKEN269);
            adaptor.addChild(root_0, TOKEN269_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(172, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbdegass");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbdegass"

    public static class vbdissolve_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbdissolve"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:175:1: vbdissolve : 'VB-DISSOLVE' TOKEN ;
    public final ChemicalChunkerParser.vbdissolve_return vbdissolve() throws RecognitionException {
        ChemicalChunkerParser.vbdissolve_return retval = new ChemicalChunkerParser.vbdissolve_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal270=null;
        Token TOKEN271=null;

        Object string_literal270_tree=null;
        Object TOKEN271_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdissolve");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:175:11: ( 'VB-DISSOLVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:175:12: 'VB-DISSOLVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(175,12);
            string_literal270=(Token)match(input,69,FOLLOW_69_in_vbdissolve1127); 
            string_literal270_tree = (Object)adaptor.create(string_literal270);
            adaptor.addChild(root_0, string_literal270_tree);

            dbg.location(175,26);
            TOKEN271=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdissolve1129); 
            TOKEN271_tree = (Object)adaptor.create(TOKEN271);
            adaptor.addChild(root_0, TOKEN271_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(175, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbdissolve");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbdissolve"

    public static class vbdry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbdry"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:178:1: vbdry : 'VB-DRY' TOKEN ;
    public final ChemicalChunkerParser.vbdry_return vbdry() throws RecognitionException {
        ChemicalChunkerParser.vbdry_return retval = new ChemicalChunkerParser.vbdry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal272=null;
        Token TOKEN273=null;

        Object string_literal272_tree=null;
        Object TOKEN273_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:178:6: ( 'VB-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:178:7: 'VB-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(178,7);
            string_literal272=(Token)match(input,70,FOLLOW_70_in_vbdry1136); 
            string_literal272_tree = (Object)adaptor.create(string_literal272);
            adaptor.addChild(root_0, string_literal272_tree);

            dbg.location(178,16);
            TOKEN273=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdry1138); 
            TOKEN273_tree = (Object)adaptor.create(TOKEN273);
            adaptor.addChild(root_0, TOKEN273_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(178, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbdry");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbdry"

    public static class nndry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nndry"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:179:1: nndry : 'NN-DRY' TOKEN ;
    public final ChemicalChunkerParser.nndry_return nndry() throws RecognitionException {
        ChemicalChunkerParser.nndry_return retval = new ChemicalChunkerParser.nndry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal274=null;
        Token TOKEN275=null;

        Object string_literal274_tree=null;
        Object TOKEN275_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nndry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:179:6: ( 'NN-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:179:7: 'NN-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(179,7);
            string_literal274=(Token)match(input,71,FOLLOW_71_in_nndry1143); 
            string_literal274_tree = (Object)adaptor.create(string_literal274);
            adaptor.addChild(root_0, string_literal274_tree);

            dbg.location(179,16);
            TOKEN275=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nndry1145); 
            TOKEN275_tree = (Object)adaptor.create(TOKEN275);
            adaptor.addChild(root_0, TOKEN275_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(179, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nndry");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nndry"

    public static class vbextract_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbextract"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:182:1: vbextract : 'VB-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.vbextract_return vbextract() throws RecognitionException {
        ChemicalChunkerParser.vbextract_return retval = new ChemicalChunkerParser.vbextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal276=null;
        Token TOKEN277=null;

        Object string_literal276_tree=null;
        Object TOKEN277_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:182:10: ( 'VB-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:182:11: 'VB-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(182,11);
            string_literal276=(Token)match(input,72,FOLLOW_72_in_vbextract1152); 
            string_literal276_tree = (Object)adaptor.create(string_literal276);
            adaptor.addChild(root_0, string_literal276_tree);

            dbg.location(182,24);
            TOKEN277=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbextract1154); 
            TOKEN277_tree = (Object)adaptor.create(TOKEN277);
            adaptor.addChild(root_0, TOKEN277_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(182, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbextract");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbextract"

    public static class nnextract_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnextract"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:183:1: nnextract : 'NN-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.nnextract_return nnextract() throws RecognitionException {
        ChemicalChunkerParser.nnextract_return retval = new ChemicalChunkerParser.nnextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal278=null;
        Token TOKEN279=null;

        Object string_literal278_tree=null;
        Object TOKEN279_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:183:10: ( 'NN-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:183:11: 'NN-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(183,11);
            string_literal278=(Token)match(input,73,FOLLOW_73_in_nnextract1159); 
            string_literal278_tree = (Object)adaptor.create(string_literal278);
            adaptor.addChild(root_0, string_literal278_tree);

            dbg.location(183,24);
            TOKEN279=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnextract1161); 
            TOKEN279_tree = (Object)adaptor.create(TOKEN279);
            adaptor.addChild(root_0, TOKEN279_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(183, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnextract");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnextract"

    public static class vbfilter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbfilter"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:186:1: vbfilter : 'VB-FILTER' TOKEN ;
    public final ChemicalChunkerParser.vbfilter_return vbfilter() throws RecognitionException {
        ChemicalChunkerParser.vbfilter_return retval = new ChemicalChunkerParser.vbfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal280=null;
        Token TOKEN281=null;

        Object string_literal280_tree=null;
        Object TOKEN281_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:186:9: ( 'VB-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:186:10: 'VB-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(186,10);
            string_literal280=(Token)match(input,74,FOLLOW_74_in_vbfilter1168); 
            string_literal280_tree = (Object)adaptor.create(string_literal280);
            adaptor.addChild(root_0, string_literal280_tree);

            dbg.location(186,22);
            TOKEN281=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfilter1170); 
            TOKEN281_tree = (Object)adaptor.create(TOKEN281);
            adaptor.addChild(root_0, TOKEN281_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(186, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbfilter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbfilter"

    public static class nnfilter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnfilter"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:187:1: nnfilter : 'NN-FILTER' TOKEN ;
    public final ChemicalChunkerParser.nnfilter_return nnfilter() throws RecognitionException {
        ChemicalChunkerParser.nnfilter_return retval = new ChemicalChunkerParser.nnfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal282=null;
        Token TOKEN283=null;

        Object string_literal282_tree=null;
        Object TOKEN283_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:187:9: ( 'NN-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:187:10: 'NN-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(187,10);
            string_literal282=(Token)match(input,75,FOLLOW_75_in_nnfilter1175); 
            string_literal282_tree = (Object)adaptor.create(string_literal282);
            adaptor.addChild(root_0, string_literal282_tree);

            dbg.location(187,22);
            TOKEN283=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnfilter1177); 
            TOKEN283_tree = (Object)adaptor.create(TOKEN283);
            adaptor.addChild(root_0, TOKEN283_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(187, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnfilter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnfilter"

    public static class vbheat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbheat"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:190:1: vbheat : 'VB-HEAT' TOKEN ;
    public final ChemicalChunkerParser.vbheat_return vbheat() throws RecognitionException {
        ChemicalChunkerParser.vbheat_return retval = new ChemicalChunkerParser.vbheat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal284=null;
        Token TOKEN285=null;

        Object string_literal284_tree=null;
        Object TOKEN285_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbheat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:190:7: ( 'VB-HEAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:190:8: 'VB-HEAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(190,8);
            string_literal284=(Token)match(input,76,FOLLOW_76_in_vbheat1184); 
            string_literal284_tree = (Object)adaptor.create(string_literal284);
            adaptor.addChild(root_0, string_literal284_tree);

            dbg.location(190,18);
            TOKEN285=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbheat1186); 
            TOKEN285_tree = (Object)adaptor.create(TOKEN285);
            adaptor.addChild(root_0, TOKEN285_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(190, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbheat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbheat"

    public static class vbincrease_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbincrease"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:191:1: vbincrease : 'VB-INCREASE' TOKEN ;
    public final ChemicalChunkerParser.vbincrease_return vbincrease() throws RecognitionException {
        ChemicalChunkerParser.vbincrease_return retval = new ChemicalChunkerParser.vbincrease_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal286=null;
        Token TOKEN287=null;

        Object string_literal286_tree=null;
        Object TOKEN287_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbincrease");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:191:11: ( 'VB-INCREASE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:191:12: 'VB-INCREASE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(191,12);
            string_literal286=(Token)match(input,77,FOLLOW_77_in_vbincrease1191); 
            string_literal286_tree = (Object)adaptor.create(string_literal286);
            adaptor.addChild(root_0, string_literal286_tree);

            dbg.location(191,26);
            TOKEN287=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbincrease1193); 
            TOKEN287_tree = (Object)adaptor.create(TOKEN287);
            adaptor.addChild(root_0, TOKEN287_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(191, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbincrease");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbincrease"

    public static class vbpartition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbpartition"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:194:1: vbpartition : 'VB-PARTITION' TOKEN ;
    public final ChemicalChunkerParser.vbpartition_return vbpartition() throws RecognitionException {
        ChemicalChunkerParser.vbpartition_return retval = new ChemicalChunkerParser.vbpartition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal288=null;
        Token TOKEN289=null;

        Object string_literal288_tree=null;
        Object TOKEN289_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpartition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:194:12: ( 'VB-PARTITION' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:194:13: 'VB-PARTITION' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(194,13);
            string_literal288=(Token)match(input,78,FOLLOW_78_in_vbpartition1200); 
            string_literal288_tree = (Object)adaptor.create(string_literal288);
            adaptor.addChild(root_0, string_literal288_tree);

            dbg.location(194,28);
            TOKEN289=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpartition1202); 
            TOKEN289_tree = (Object)adaptor.create(TOKEN289);
            adaptor.addChild(root_0, TOKEN289_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(194, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbpartition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbpartition"

    public static class vbprecipitate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbprecipitate"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:197:1: vbprecipitate : 'VB-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.vbprecipitate_return vbprecipitate() throws RecognitionException {
        ChemicalChunkerParser.vbprecipitate_return retval = new ChemicalChunkerParser.vbprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal290=null;
        Token TOKEN291=null;

        Object string_literal290_tree=null;
        Object TOKEN291_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(197, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:197:14: ( 'VB-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:197:15: 'VB-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(197,15);
            string_literal290=(Token)match(input,79,FOLLOW_79_in_vbprecipitate1209); 
            string_literal290_tree = (Object)adaptor.create(string_literal290);
            adaptor.addChild(root_0, string_literal290_tree);

            dbg.location(197,32);
            TOKEN291=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbprecipitate1211); 
            TOKEN291_tree = (Object)adaptor.create(TOKEN291);
            adaptor.addChild(root_0, TOKEN291_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(197, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbprecipitate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbprecipitate"

    public static class nnprecipitate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnprecipitate"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:198:1: nnprecipitate : 'NN-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.nnprecipitate_return nnprecipitate() throws RecognitionException {
        ChemicalChunkerParser.nnprecipitate_return retval = new ChemicalChunkerParser.nnprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal292=null;
        Token TOKEN293=null;

        Object string_literal292_tree=null;
        Object TOKEN293_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(198, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:198:14: ( 'NN-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:198:15: 'NN-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(198,15);
            string_literal292=(Token)match(input,80,FOLLOW_80_in_nnprecipitate1216); 
            string_literal292_tree = (Object)adaptor.create(string_literal292);
            adaptor.addChild(root_0, string_literal292_tree);

            dbg.location(198,32);
            TOKEN293=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnprecipitate1218); 
            TOKEN293_tree = (Object)adaptor.create(TOKEN293);
            adaptor.addChild(root_0, TOKEN293_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(198, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnprecipitate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnprecipitate"

    public static class vbpurify_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbpurify"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:201:1: vbpurify : 'VB-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.vbpurify_return vbpurify() throws RecognitionException {
        ChemicalChunkerParser.vbpurify_return retval = new ChemicalChunkerParser.vbpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal294=null;
        Token TOKEN295=null;

        Object string_literal294_tree=null;
        Object TOKEN295_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:201:9: ( 'VB-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:201:10: 'VB-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(201,10);
            string_literal294=(Token)match(input,81,FOLLOW_81_in_vbpurify1225); 
            string_literal294_tree = (Object)adaptor.create(string_literal294);
            adaptor.addChild(root_0, string_literal294_tree);

            dbg.location(201,22);
            TOKEN295=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpurify1227); 
            TOKEN295_tree = (Object)adaptor.create(TOKEN295);
            adaptor.addChild(root_0, TOKEN295_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(201, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbpurify");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbpurify"

    public static class nnpurify_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnpurify"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:202:1: nnpurify : 'NN-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.nnpurify_return nnpurify() throws RecognitionException {
        ChemicalChunkerParser.nnpurify_return retval = new ChemicalChunkerParser.nnpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal296=null;
        Token TOKEN297=null;

        Object string_literal296_tree=null;
        Object TOKEN297_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(202, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:202:9: ( 'NN-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:202:10: 'NN-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(202,10);
            string_literal296=(Token)match(input,82,FOLLOW_82_in_nnpurify1232); 
            string_literal296_tree = (Object)adaptor.create(string_literal296);
            adaptor.addChild(root_0, string_literal296_tree);

            dbg.location(202,22);
            TOKEN297=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpurify1234); 
            TOKEN297_tree = (Object)adaptor.create(TOKEN297);
            adaptor.addChild(root_0, TOKEN297_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(202, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnpurify");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnpurify"

    public static class vbquench_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbquench"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:205:1: vbquench : 'VB-QUENCH' TOKEN ;
    public final ChemicalChunkerParser.vbquench_return vbquench() throws RecognitionException {
        ChemicalChunkerParser.vbquench_return retval = new ChemicalChunkerParser.vbquench_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal298=null;
        Token TOKEN299=null;

        Object string_literal298_tree=null;
        Object TOKEN299_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbquench");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(205, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:205:9: ( 'VB-QUENCH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:205:10: 'VB-QUENCH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(205,10);
            string_literal298=(Token)match(input,83,FOLLOW_83_in_vbquench1241); 
            string_literal298_tree = (Object)adaptor.create(string_literal298);
            adaptor.addChild(root_0, string_literal298_tree);

            dbg.location(205,22);
            TOKEN299=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbquench1243); 
            TOKEN299_tree = (Object)adaptor.create(TOKEN299);
            adaptor.addChild(root_0, TOKEN299_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(205, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbquench");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbquench"

    public static class vbrecover_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbrecover"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:208:1: vbrecover : 'VB-RECOVER' TOKEN ;
    public final ChemicalChunkerParser.vbrecover_return vbrecover() throws RecognitionException {
        ChemicalChunkerParser.vbrecover_return retval = new ChemicalChunkerParser.vbrecover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal300=null;
        Token TOKEN301=null;

        Object string_literal300_tree=null;
        Object TOKEN301_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbrecover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:208:10: ( 'VB-RECOVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:208:11: 'VB-RECOVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(208,11);
            string_literal300=(Token)match(input,84,FOLLOW_84_in_vbrecover1250); 
            string_literal300_tree = (Object)adaptor.create(string_literal300);
            adaptor.addChild(root_0, string_literal300_tree);

            dbg.location(208,24);
            TOKEN301=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbrecover1252); 
            TOKEN301_tree = (Object)adaptor.create(TOKEN301);
            adaptor.addChild(root_0, TOKEN301_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(208, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbrecover");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbrecover"

    public static class vbremove_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbremove"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:211:1: vbremove : 'VB-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.vbremove_return vbremove() throws RecognitionException {
        ChemicalChunkerParser.vbremove_return retval = new ChemicalChunkerParser.vbremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal302=null;
        Token TOKEN303=null;

        Object string_literal302_tree=null;
        Object TOKEN303_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:211:9: ( 'VB-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:211:10: 'VB-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(211,10);
            string_literal302=(Token)match(input,85,FOLLOW_85_in_vbremove1259); 
            string_literal302_tree = (Object)adaptor.create(string_literal302);
            adaptor.addChild(root_0, string_literal302_tree);

            dbg.location(211,22);
            TOKEN303=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbremove1261); 
            TOKEN303_tree = (Object)adaptor.create(TOKEN303);
            adaptor.addChild(root_0, TOKEN303_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(211, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbremove");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbremove"

    public static class nnremove_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnremove"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:212:1: nnremove : 'NN-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.nnremove_return nnremove() throws RecognitionException {
        ChemicalChunkerParser.nnremove_return retval = new ChemicalChunkerParser.nnremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal304=null;
        Token TOKEN305=null;

        Object string_literal304_tree=null;
        Object TOKEN305_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(212, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:212:9: ( 'NN-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:212:10: 'NN-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(212,10);
            string_literal304=(Token)match(input,86,FOLLOW_86_in_nnremove1266); 
            string_literal304_tree = (Object)adaptor.create(string_literal304);
            adaptor.addChild(root_0, string_literal304_tree);

            dbg.location(212,22);
            TOKEN305=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnremove1268); 
            TOKEN305_tree = (Object)adaptor.create(TOKEN305);
            adaptor.addChild(root_0, TOKEN305_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(212, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnremove");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnremove"

    public static class vbstir_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbstir"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:215:1: vbstir : 'VB-STIR' TOKEN ;
    public final ChemicalChunkerParser.vbstir_return vbstir() throws RecognitionException {
        ChemicalChunkerParser.vbstir_return retval = new ChemicalChunkerParser.vbstir_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal306=null;
        Token TOKEN307=null;

        Object string_literal306_tree=null;
        Object TOKEN307_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbstir");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:215:7: ( 'VB-STIR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:215:8: 'VB-STIR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(215,8);
            string_literal306=(Token)match(input,87,FOLLOW_87_in_vbstir1275); 
            string_literal306_tree = (Object)adaptor.create(string_literal306);
            adaptor.addChild(root_0, string_literal306_tree);

            dbg.location(215,18);
            TOKEN307=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbstir1277); 
            TOKEN307_tree = (Object)adaptor.create(TOKEN307);
            adaptor.addChild(root_0, TOKEN307_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(215, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbstir");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbstir"

    public static class vbsynthesize_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbsynthesize"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:218:1: vbsynthesize : 'VB-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.vbsynthesize_return vbsynthesize() throws RecognitionException {
        ChemicalChunkerParser.vbsynthesize_return retval = new ChemicalChunkerParser.vbsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal308=null;
        Token TOKEN309=null;

        Object string_literal308_tree=null;
        Object TOKEN309_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(218, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:218:13: ( 'VB-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:218:14: 'VB-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(218,14);
            string_literal308=(Token)match(input,88,FOLLOW_88_in_vbsynthesize1284); 
            string_literal308_tree = (Object)adaptor.create(string_literal308);
            adaptor.addChild(root_0, string_literal308_tree);

            dbg.location(218,30);
            TOKEN309=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsynthesize1286); 
            TOKEN309_tree = (Object)adaptor.create(TOKEN309);
            adaptor.addChild(root_0, TOKEN309_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(218, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbsynthesize");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbsynthesize"

    public static class nnsynthesize_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnsynthesize"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:219:1: nnsynthesize : 'NN-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.nnsynthesize_return nnsynthesize() throws RecognitionException {
        ChemicalChunkerParser.nnsynthesize_return retval = new ChemicalChunkerParser.nnsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal310=null;
        Token TOKEN311=null;

        Object string_literal310_tree=null;
        Object TOKEN311_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(219, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:219:13: ( 'NN-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:219:14: 'NN-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(219,14);
            string_literal310=(Token)match(input,89,FOLLOW_89_in_nnsynthesize1291); 
            string_literal310_tree = (Object)adaptor.create(string_literal310);
            adaptor.addChild(root_0, string_literal310_tree);

            dbg.location(219,30);
            TOKEN311=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnsynthesize1293); 
            TOKEN311_tree = (Object)adaptor.create(TOKEN311);
            adaptor.addChild(root_0, TOKEN311_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(219, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnsynthesize");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnsynthesize"

    public static class vbwait_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbwait"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:222:1: vbwait : 'VB-WAIT' TOKEN ;
    public final ChemicalChunkerParser.vbwait_return vbwait() throws RecognitionException {
        ChemicalChunkerParser.vbwait_return retval = new ChemicalChunkerParser.vbwait_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal312=null;
        Token TOKEN313=null;

        Object string_literal312_tree=null;
        Object TOKEN313_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwait");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(222, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:222:7: ( 'VB-WAIT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:222:8: 'VB-WAIT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(222,8);
            string_literal312=(Token)match(input,90,FOLLOW_90_in_vbwait1300); 
            string_literal312_tree = (Object)adaptor.create(string_literal312);
            adaptor.addChild(root_0, string_literal312_tree);

            dbg.location(222,18);
            TOKEN313=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwait1302); 
            TOKEN313_tree = (Object)adaptor.create(TOKEN313);
            adaptor.addChild(root_0, TOKEN313_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(222, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbwait");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbwait"

    public static class vbwash_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbwash"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:225:1: vbwash : 'VB-WASH' TOKEN ;
    public final ChemicalChunkerParser.vbwash_return vbwash() throws RecognitionException {
        ChemicalChunkerParser.vbwash_return retval = new ChemicalChunkerParser.vbwash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal314=null;
        Token TOKEN315=null;

        Object string_literal314_tree=null;
        Object TOKEN315_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:225:7: ( 'VB-WASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:225:8: 'VB-WASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(225,8);
            string_literal314=(Token)match(input,91,FOLLOW_91_in_vbwash1309); 
            string_literal314_tree = (Object)adaptor.create(string_literal314);
            adaptor.addChild(root_0, string_literal314_tree);

            dbg.location(225,18);
            TOKEN315=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwash1311); 
            TOKEN315_tree = (Object)adaptor.create(TOKEN315);
            adaptor.addChild(root_0, TOKEN315_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(225, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbwash");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbwash"

    public static class vbyield_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbyield"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:228:1: vbyield : 'VB-YIELD' TOKEN ;
    public final ChemicalChunkerParser.vbyield_return vbyield() throws RecognitionException {
        ChemicalChunkerParser.vbyield_return retval = new ChemicalChunkerParser.vbyield_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal316=null;
        Token TOKEN317=null;

        Object string_literal316_tree=null;
        Object TOKEN317_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbyield");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:228:8: ( 'VB-YIELD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:228:9: 'VB-YIELD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(228,9);
            string_literal316=(Token)match(input,92,FOLLOW_92_in_vbyield1318); 
            string_literal316_tree = (Object)adaptor.create(string_literal316);
            adaptor.addChild(root_0, string_literal316_tree);

            dbg.location(228,20);
            TOKEN317=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbyield1320); 
            TOKEN317_tree = (Object)adaptor.create(TOKEN317);
            adaptor.addChild(root_0, TOKEN317_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(228, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbyield");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbyield"

    public static class colon_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "colon"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:231:1: colon : 'COLON' TOKEN ;
    public final ChemicalChunkerParser.colon_return colon() throws RecognitionException {
        ChemicalChunkerParser.colon_return retval = new ChemicalChunkerParser.colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal318=null;
        Token TOKEN319=null;

        Object string_literal318_tree=null;
        Object TOKEN319_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(231, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:231:6: ( 'COLON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:231:7: 'COLON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(231,7);
            string_literal318=(Token)match(input,93,FOLLOW_93_in_colon1327); 
            string_literal318_tree = (Object)adaptor.create(string_literal318);
            adaptor.addChild(root_0, string_literal318_tree);

            dbg.location(231,15);
            TOKEN319=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_colon1329); 
            TOKEN319_tree = (Object)adaptor.create(TOKEN319);
            adaptor.addChild(root_0, TOKEN319_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(231, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "colon");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "colon"

    public static class comma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comma"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:232:1: comma : 'COMMA' TOKEN ;
    public final ChemicalChunkerParser.comma_return comma() throws RecognitionException {
        ChemicalChunkerParser.comma_return retval = new ChemicalChunkerParser.comma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal320=null;
        Token TOKEN321=null;

        Object string_literal320_tree=null;
        Object TOKEN321_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:232:6: ( 'COMMA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:232:7: 'COMMA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(232,7);
            string_literal320=(Token)match(input,94,FOLLOW_94_in_comma1334); 
            string_literal320_tree = (Object)adaptor.create(string_literal320);
            adaptor.addChild(root_0, string_literal320_tree);

            dbg.location(232,15);
            TOKEN321=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_comma1336); 
            TOKEN321_tree = (Object)adaptor.create(TOKEN321);
            adaptor.addChild(root_0, TOKEN321_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(232, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comma"

    public static class apost_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "apost"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:233:1: apost : 'APOST' TOKEN ;
    public final ChemicalChunkerParser.apost_return apost() throws RecognitionException {
        ChemicalChunkerParser.apost_return retval = new ChemicalChunkerParser.apost_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal322=null;
        Token TOKEN323=null;

        Object string_literal322_tree=null;
        Object TOKEN323_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "apost");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(233, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:233:6: ( 'APOST' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:233:7: 'APOST' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(233,7);
            string_literal322=(Token)match(input,95,FOLLOW_95_in_apost1341); 
            string_literal322_tree = (Object)adaptor.create(string_literal322);
            adaptor.addChild(root_0, string_literal322_tree);

            dbg.location(233,15);
            TOKEN323=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_apost1343); 
            TOKEN323_tree = (Object)adaptor.create(TOKEN323);
            adaptor.addChild(root_0, TOKEN323_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(233, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "apost");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "apost"

    public static class neg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "neg"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:234:1: neg : 'NEG' TOKEN ;
    public final ChemicalChunkerParser.neg_return neg() throws RecognitionException {
        ChemicalChunkerParser.neg_return retval = new ChemicalChunkerParser.neg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal324=null;
        Token TOKEN325=null;

        Object string_literal324_tree=null;
        Object TOKEN325_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "neg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(234, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:234:4: ( 'NEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:234:5: 'NEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(234,5);
            string_literal324=(Token)match(input,96,FOLLOW_96_in_neg1348); 
            string_literal324_tree = (Object)adaptor.create(string_literal324);
            adaptor.addChild(root_0, string_literal324_tree);

            dbg.location(234,11);
            TOKEN325=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_neg1350); 
            TOKEN325_tree = (Object)adaptor.create(TOKEN325);
            adaptor.addChild(root_0, TOKEN325_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(234, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "neg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "neg"

    public static class dash_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dash"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:235:1: dash : 'DASH' TOKEN ;
    public final ChemicalChunkerParser.dash_return dash() throws RecognitionException {
        ChemicalChunkerParser.dash_return retval = new ChemicalChunkerParser.dash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal326=null;
        Token TOKEN327=null;

        Object string_literal326_tree=null;
        Object TOKEN327_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(235, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:235:5: ( 'DASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:235:6: 'DASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(235,6);
            string_literal326=(Token)match(input,97,FOLLOW_97_in_dash1355); 
            string_literal326_tree = (Object)adaptor.create(string_literal326);
            adaptor.addChild(root_0, string_literal326_tree);

            dbg.location(235,13);
            TOKEN327=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dash1357); 
            TOKEN327_tree = (Object)adaptor.create(TOKEN327);
            adaptor.addChild(root_0, TOKEN327_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(235, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dash");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dash"

    public static class stop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stop"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:236:1: stop : 'STOP' TOKEN ;
    public final ChemicalChunkerParser.stop_return stop() throws RecognitionException {
        ChemicalChunkerParser.stop_return retval = new ChemicalChunkerParser.stop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal328=null;
        Token TOKEN329=null;

        Object string_literal328_tree=null;
        Object TOKEN329_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(236, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:236:5: ( 'STOP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:236:6: 'STOP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(236,6);
            string_literal328=(Token)match(input,98,FOLLOW_98_in_stop1362); 
            string_literal328_tree = (Object)adaptor.create(string_literal328);
            adaptor.addChild(root_0, string_literal328_tree);

            dbg.location(236,13);
            TOKEN329=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_stop1364); 
            TOKEN329_tree = (Object)adaptor.create(TOKEN329);
            adaptor.addChild(root_0, TOKEN329_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(236, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stop"

    public static class nnpercent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnpercent"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:237:1: nnpercent : 'NN-PERCENT' TOKEN ;
    public final ChemicalChunkerParser.nnpercent_return nnpercent() throws RecognitionException {
        ChemicalChunkerParser.nnpercent_return retval = new ChemicalChunkerParser.nnpercent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal330=null;
        Token TOKEN331=null;

        Object string_literal330_tree=null;
        Object TOKEN331_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpercent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(237, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:237:10: ( 'NN-PERCENT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:237:11: 'NN-PERCENT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(237,11);
            string_literal330=(Token)match(input,99,FOLLOW_99_in_nnpercent1369); 
            string_literal330_tree = (Object)adaptor.create(string_literal330);
            adaptor.addChild(root_0, string_literal330_tree);

            dbg.location(237,24);
            TOKEN331=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpercent1371); 
            TOKEN331_tree = (Object)adaptor.create(TOKEN331);
            adaptor.addChild(root_0, TOKEN331_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(237, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnpercent");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnpercent"

    public static class lsqb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lsqb"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:238:1: lsqb : 'LSQB' TOKEN ;
    public final ChemicalChunkerParser.lsqb_return lsqb() throws RecognitionException {
        ChemicalChunkerParser.lsqb_return retval = new ChemicalChunkerParser.lsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal332=null;
        Token TOKEN333=null;

        Object string_literal332_tree=null;
        Object TOKEN333_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:238:5: ( 'LSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:238:6: 'LSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(238,6);
            string_literal332=(Token)match(input,100,FOLLOW_100_in_lsqb1376); 
            string_literal332_tree = (Object)adaptor.create(string_literal332);
            adaptor.addChild(root_0, string_literal332_tree);

            dbg.location(238,13);
            TOKEN333=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lsqb1378); 
            TOKEN333_tree = (Object)adaptor.create(TOKEN333);
            adaptor.addChild(root_0, TOKEN333_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(238, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lsqb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "lsqb"

    public static class rsqb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rsqb"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:239:1: rsqb : 'RSQB' TOKEN ;
    public final ChemicalChunkerParser.rsqb_return rsqb() throws RecognitionException {
        ChemicalChunkerParser.rsqb_return retval = new ChemicalChunkerParser.rsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal334=null;
        Token TOKEN335=null;

        Object string_literal334_tree=null;
        Object TOKEN335_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(239, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:239:5: ( 'RSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:239:6: 'RSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(239,6);
            string_literal334=(Token)match(input,101,FOLLOW_101_in_rsqb1383); 
            string_literal334_tree = (Object)adaptor.create(string_literal334);
            adaptor.addChild(root_0, string_literal334_tree);

            dbg.location(239,13);
            TOKEN335=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rsqb1385); 
            TOKEN335_tree = (Object)adaptor.create(TOKEN335);
            adaptor.addChild(root_0, TOKEN335_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(239, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rsqb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rsqb"

    public static class lrb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lrb"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:240:1: lrb : '-LRB-' TOKEN ;
    public final ChemicalChunkerParser.lrb_return lrb() throws RecognitionException {
        ChemicalChunkerParser.lrb_return retval = new ChemicalChunkerParser.lrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal336=null;
        Token TOKEN337=null;

        Object string_literal336_tree=null;
        Object TOKEN337_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:240:4: ( '-LRB-' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:240:5: '-LRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(240,5);
            string_literal336=(Token)match(input,102,FOLLOW_102_in_lrb1390); 
            string_literal336_tree = (Object)adaptor.create(string_literal336);
            adaptor.addChild(root_0, string_literal336_tree);

            dbg.location(240,13);
            TOKEN337=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lrb1392); 
            TOKEN337_tree = (Object)adaptor.create(TOKEN337);
            adaptor.addChild(root_0, TOKEN337_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(240, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lrb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "lrb"

    public static class rrb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rrb"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:241:1: rrb : '-RRB-' TOKEN ;
    public final ChemicalChunkerParser.rrb_return rrb() throws RecognitionException {
        ChemicalChunkerParser.rrb_return retval = new ChemicalChunkerParser.rrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal338=null;
        Token TOKEN339=null;

        Object string_literal338_tree=null;
        Object TOKEN339_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(241, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:241:4: ( '-RRB-' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:241:5: '-RRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(241,5);
            string_literal338=(Token)match(input,103,FOLLOW_103_in_rrb1397); 
            string_literal338_tree = (Object)adaptor.create(string_literal338);
            adaptor.addChild(root_0, string_literal338_tree);

            dbg.location(241,13);
            TOKEN339=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rrb1399); 
            TOKEN339_tree = (Object)adaptor.create(TOKEN339);
            adaptor.addChild(root_0, TOKEN339_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(241, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rrb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rrb"

    public static class abl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "abl"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:246:1: abl : 'ABL' TOKEN ;
    public final ChemicalChunkerParser.abl_return abl() throws RecognitionException {
        ChemicalChunkerParser.abl_return retval = new ChemicalChunkerParser.abl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal340=null;
        Token TOKEN341=null;

        Object string_literal340_tree=null;
        Object TOKEN341_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:246:4: ( 'ABL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:246:5: 'ABL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(246,5);
            string_literal340=(Token)match(input,104,FOLLOW_104_in_abl1408); 
            string_literal340_tree = (Object)adaptor.create(string_literal340);
            adaptor.addChild(root_0, string_literal340_tree);

            dbg.location(246,11);
            TOKEN341=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abl1410); 
            TOKEN341_tree = (Object)adaptor.create(TOKEN341);
            adaptor.addChild(root_0, TOKEN341_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(246, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "abl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "abl"

    public static class abn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "abn"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:249:1: abn : 'ABN' TOKEN ;
    public final ChemicalChunkerParser.abn_return abn() throws RecognitionException {
        ChemicalChunkerParser.abn_return retval = new ChemicalChunkerParser.abn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal342=null;
        Token TOKEN343=null;

        Object string_literal342_tree=null;
        Object TOKEN343_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(249, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:249:4: ( 'ABN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:249:5: 'ABN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(249,5);
            string_literal342=(Token)match(input,105,FOLLOW_105_in_abn1417); 
            string_literal342_tree = (Object)adaptor.create(string_literal342);
            adaptor.addChild(root_0, string_literal342_tree);

            dbg.location(249,11);
            TOKEN343=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abn1419); 
            TOKEN343_tree = (Object)adaptor.create(TOKEN343);
            adaptor.addChild(root_0, TOKEN343_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(249, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "abn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "abn"

    public static class abx_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "abx"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:252:1: abx : 'ABX' TOKEN ;
    public final ChemicalChunkerParser.abx_return abx() throws RecognitionException {
        ChemicalChunkerParser.abx_return retval = new ChemicalChunkerParser.abx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal344=null;
        Token TOKEN345=null;

        Object string_literal344_tree=null;
        Object TOKEN345_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(252, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:252:4: ( 'ABX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:252:5: 'ABX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(252,5);
            string_literal344=(Token)match(input,106,FOLLOW_106_in_abx1426); 
            string_literal344_tree = (Object)adaptor.create(string_literal344);
            adaptor.addChild(root_0, string_literal344_tree);

            dbg.location(252,11);
            TOKEN345=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abx1428); 
            TOKEN345_tree = (Object)adaptor.create(TOKEN345);
            adaptor.addChild(root_0, TOKEN345_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(252, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "abx");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "abx"

    public static class ap_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ap"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:255:1: ap : 'AP' TOKEN ;
    public final ChemicalChunkerParser.ap_return ap() throws RecognitionException {
        ChemicalChunkerParser.ap_return retval = new ChemicalChunkerParser.ap_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal346=null;
        Token TOKEN347=null;

        Object string_literal346_tree=null;
        Object TOKEN347_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ap");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(255, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:255:3: ( 'AP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:255:4: 'AP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(255,4);
            string_literal346=(Token)match(input,107,FOLLOW_107_in_ap1435); 
            string_literal346_tree = (Object)adaptor.create(string_literal346);
            adaptor.addChild(root_0, string_literal346_tree);

            dbg.location(255,9);
            TOKEN347=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ap1437); 
            TOKEN347_tree = (Object)adaptor.create(TOKEN347);
            adaptor.addChild(root_0, TOKEN347_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(255, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ap");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ap"

    public static class at_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "at"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:258:1: at : 'AT' TOKEN ;
    public final ChemicalChunkerParser.at_return at() throws RecognitionException {
        ChemicalChunkerParser.at_return retval = new ChemicalChunkerParser.at_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal348=null;
        Token TOKEN349=null;

        Object string_literal348_tree=null;
        Object TOKEN349_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "at");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(258, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:258:3: ( 'AT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:258:4: 'AT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(258,4);
            string_literal348=(Token)match(input,108,FOLLOW_108_in_at1444); 
            string_literal348_tree = (Object)adaptor.create(string_literal348);
            adaptor.addChild(root_0, string_literal348_tree);

            dbg.location(258,9);
            TOKEN349=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_at1446); 
            TOKEN349_tree = (Object)adaptor.create(TOKEN349);
            adaptor.addChild(root_0, TOKEN349_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(258, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "at");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "at"

    public static class be_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "be"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:261:1: be : 'BE' TOKEN ;
    public final ChemicalChunkerParser.be_return be() throws RecognitionException {
        ChemicalChunkerParser.be_return retval = new ChemicalChunkerParser.be_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal350=null;
        Token TOKEN351=null;

        Object string_literal350_tree=null;
        Object TOKEN351_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "be");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:261:3: ( 'BE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:261:4: 'BE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(261,4);
            string_literal350=(Token)match(input,109,FOLLOW_109_in_be1453); 
            string_literal350_tree = (Object)adaptor.create(string_literal350);
            adaptor.addChild(root_0, string_literal350_tree);

            dbg.location(261,9);
            TOKEN351=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_be1455); 
            TOKEN351_tree = (Object)adaptor.create(TOKEN351);
            adaptor.addChild(root_0, TOKEN351_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(261, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "be");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "be"

    public static class bed_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bed"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:264:1: bed : 'BED' TOKEN ;
    public final ChemicalChunkerParser.bed_return bed() throws RecognitionException {
        ChemicalChunkerParser.bed_return retval = new ChemicalChunkerParser.bed_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal352=null;
        Token TOKEN353=null;

        Object string_literal352_tree=null;
        Object TOKEN353_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(264, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:264:4: ( 'BED' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:264:5: 'BED' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(264,5);
            string_literal352=(Token)match(input,110,FOLLOW_110_in_bed1462); 
            string_literal352_tree = (Object)adaptor.create(string_literal352);
            adaptor.addChild(root_0, string_literal352_tree);

            dbg.location(264,11);
            TOKEN353=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bed1464); 
            TOKEN353_tree = (Object)adaptor.create(TOKEN353);
            adaptor.addChild(root_0, TOKEN353_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(264, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bed");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bed"

    public static class bedz_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bedz"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:267:1: bedz : 'BEDZ' TOKEN ;
    public final ChemicalChunkerParser.bedz_return bedz() throws RecognitionException {
        ChemicalChunkerParser.bedz_return retval = new ChemicalChunkerParser.bedz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal354=null;
        Token TOKEN355=null;

        Object string_literal354_tree=null;
        Object TOKEN355_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bedz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(267, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:267:5: ( 'BEDZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:267:6: 'BEDZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(267,6);
            string_literal354=(Token)match(input,111,FOLLOW_111_in_bedz1471); 
            string_literal354_tree = (Object)adaptor.create(string_literal354);
            adaptor.addChild(root_0, string_literal354_tree);

            dbg.location(267,13);
            TOKEN355=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bedz1473); 
            TOKEN355_tree = (Object)adaptor.create(TOKEN355);
            adaptor.addChild(root_0, TOKEN355_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(267, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bedz");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bedz"

    public static class beg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "beg"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:270:1: beg : 'BEG' TOKEN ;
    public final ChemicalChunkerParser.beg_return beg() throws RecognitionException {
        ChemicalChunkerParser.beg_return retval = new ChemicalChunkerParser.beg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal356=null;
        Token TOKEN357=null;

        Object string_literal356_tree=null;
        Object TOKEN357_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "beg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(270, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:270:4: ( 'BEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:270:5: 'BEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(270,5);
            string_literal356=(Token)match(input,112,FOLLOW_112_in_beg1480); 
            string_literal356_tree = (Object)adaptor.create(string_literal356);
            adaptor.addChild(root_0, string_literal356_tree);

            dbg.location(270,11);
            TOKEN357=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_beg1482); 
            TOKEN357_tree = (Object)adaptor.create(TOKEN357);
            adaptor.addChild(root_0, TOKEN357_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(270, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "beg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "beg"

    public static class bem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bem"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:273:1: bem : 'BEM' TOKEN ;
    public final ChemicalChunkerParser.bem_return bem() throws RecognitionException {
        ChemicalChunkerParser.bem_return retval = new ChemicalChunkerParser.bem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal358=null;
        Token TOKEN359=null;

        Object string_literal358_tree=null;
        Object TOKEN359_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bem");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(273, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:273:4: ( 'BEM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:273:5: 'BEM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(273,5);
            string_literal358=(Token)match(input,113,FOLLOW_113_in_bem1489); 
            string_literal358_tree = (Object)adaptor.create(string_literal358);
            adaptor.addChild(root_0, string_literal358_tree);

            dbg.location(273,11);
            TOKEN359=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bem1491); 
            TOKEN359_tree = (Object)adaptor.create(TOKEN359);
            adaptor.addChild(root_0, TOKEN359_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(273, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bem");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bem"

    public static class ben_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ben"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:276:1: ben : 'BEN' TOKEN ;
    public final ChemicalChunkerParser.ben_return ben() throws RecognitionException {
        ChemicalChunkerParser.ben_return retval = new ChemicalChunkerParser.ben_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal360=null;
        Token TOKEN361=null;

        Object string_literal360_tree=null;
        Object TOKEN361_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ben");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(276, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:276:4: ( 'BEN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:276:5: 'BEN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(276,5);
            string_literal360=(Token)match(input,114,FOLLOW_114_in_ben1498); 
            string_literal360_tree = (Object)adaptor.create(string_literal360);
            adaptor.addChild(root_0, string_literal360_tree);

            dbg.location(276,11);
            TOKEN361=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ben1500); 
            TOKEN361_tree = (Object)adaptor.create(TOKEN361);
            adaptor.addChild(root_0, TOKEN361_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(276, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ben");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ben"

    public static class ber_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ber"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:279:1: ber : 'BER' TOKEN ;
    public final ChemicalChunkerParser.ber_return ber() throws RecognitionException {
        ChemicalChunkerParser.ber_return retval = new ChemicalChunkerParser.ber_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal362=null;
        Token TOKEN363=null;

        Object string_literal362_tree=null;
        Object TOKEN363_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ber");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:279:4: ( 'BER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:279:5: 'BER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(279,5);
            string_literal362=(Token)match(input,115,FOLLOW_115_in_ber1507); 
            string_literal362_tree = (Object)adaptor.create(string_literal362);
            adaptor.addChild(root_0, string_literal362_tree);

            dbg.location(279,11);
            TOKEN363=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ber1509); 
            TOKEN363_tree = (Object)adaptor.create(TOKEN363);
            adaptor.addChild(root_0, TOKEN363_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(279, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ber");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ber"

    public static class bez_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bez"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:282:1: bez : 'BEZ' TOKEN ;
    public final ChemicalChunkerParser.bez_return bez() throws RecognitionException {
        ChemicalChunkerParser.bez_return retval = new ChemicalChunkerParser.bez_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal364=null;
        Token TOKEN365=null;

        Object string_literal364_tree=null;
        Object TOKEN365_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bez");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(282, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:282:4: ( 'BEZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:282:5: 'BEZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(282,5);
            string_literal364=(Token)match(input,116,FOLLOW_116_in_bez1516); 
            string_literal364_tree = (Object)adaptor.create(string_literal364);
            adaptor.addChild(root_0, string_literal364_tree);

            dbg.location(282,11);
            TOKEN365=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bez1518); 
            TOKEN365_tree = (Object)adaptor.create(TOKEN365);
            adaptor.addChild(root_0, TOKEN365_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(282, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bez");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bez"

    public static class cc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cc"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:285:1: cc : 'CC' TOKEN ;
    public final ChemicalChunkerParser.cc_return cc() throws RecognitionException {
        ChemicalChunkerParser.cc_return retval = new ChemicalChunkerParser.cc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal366=null;
        Token TOKEN367=null;

        Object string_literal366_tree=null;
        Object TOKEN367_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(285, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:285:3: ( 'CC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:285:4: 'CC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(285,4);
            string_literal366=(Token)match(input,117,FOLLOW_117_in_cc1525); 
            string_literal366_tree = (Object)adaptor.create(string_literal366);
            adaptor.addChild(root_0, string_literal366_tree);

            dbg.location(285,9);
            TOKEN367=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cc1527); 
            TOKEN367_tree = (Object)adaptor.create(TOKEN367);
            adaptor.addChild(root_0, TOKEN367_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(285, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cc"

    public static class cd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:288:1: cd : 'CD' TOKEN ;
    public final ChemicalChunkerParser.cd_return cd() throws RecognitionException {
        ChemicalChunkerParser.cd_return retval = new ChemicalChunkerParser.cd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal368=null;
        Token TOKEN369=null;

        Object string_literal368_tree=null;
        Object TOKEN369_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(288, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:288:3: ( 'CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:288:4: 'CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(288,4);
            string_literal368=(Token)match(input,118,FOLLOW_118_in_cd1534); 
            string_literal368_tree = (Object)adaptor.create(string_literal368);
            adaptor.addChild(root_0, string_literal368_tree);

            dbg.location(288,9);
            TOKEN369=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cd1536); 
            TOKEN369_tree = (Object)adaptor.create(TOKEN369);
            adaptor.addChild(root_0, TOKEN369_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(288, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cd"

    public static class cs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cs"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:291:1: cs : 'CS' TOKEN ;
    public final ChemicalChunkerParser.cs_return cs() throws RecognitionException {
        ChemicalChunkerParser.cs_return retval = new ChemicalChunkerParser.cs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal370=null;
        Token TOKEN371=null;

        Object string_literal370_tree=null;
        Object TOKEN371_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(291, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:291:3: ( 'CS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:291:4: 'CS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(291,4);
            string_literal370=(Token)match(input,119,FOLLOW_119_in_cs1543); 
            string_literal370_tree = (Object)adaptor.create(string_literal370);
            adaptor.addChild(root_0, string_literal370_tree);

            dbg.location(291,9);
            TOKEN371=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cs1545); 
            TOKEN371_tree = (Object)adaptor.create(TOKEN371);
            adaptor.addChild(root_0, TOKEN371_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(291, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cs"

    public static class dotok_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotok"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:294:1: dotok : 'DO' TOKEN ;
    public final ChemicalChunkerParser.dotok_return dotok() throws RecognitionException {
        ChemicalChunkerParser.dotok_return retval = new ChemicalChunkerParser.dotok_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal372=null;
        Token TOKEN373=null;

        Object string_literal372_tree=null;
        Object TOKEN373_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dotok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(294, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:294:7: ( 'DO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:294:8: 'DO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(294,8);
            string_literal372=(Token)match(input,120,FOLLOW_120_in_dotok1553); 
            string_literal372_tree = (Object)adaptor.create(string_literal372);
            adaptor.addChild(root_0, string_literal372_tree);

            dbg.location(294,13);
            TOKEN373=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dotok1555); 
            TOKEN373_tree = (Object)adaptor.create(TOKEN373);
            adaptor.addChild(root_0, TOKEN373_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(294, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dotok");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dotok"

    public static class dod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dod"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:297:1: dod : 'DOD' TOKEN ;
    public final ChemicalChunkerParser.dod_return dod() throws RecognitionException {
        ChemicalChunkerParser.dod_return retval = new ChemicalChunkerParser.dod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal374=null;
        Token TOKEN375=null;

        Object string_literal374_tree=null;
        Object TOKEN375_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(297, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:297:4: ( 'DOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:297:5: 'DOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(297,5);
            string_literal374=(Token)match(input,121,FOLLOW_121_in_dod1562); 
            string_literal374_tree = (Object)adaptor.create(string_literal374);
            adaptor.addChild(root_0, string_literal374_tree);

            dbg.location(297,11);
            TOKEN375=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dod1564); 
            TOKEN375_tree = (Object)adaptor.create(TOKEN375);
            adaptor.addChild(root_0, TOKEN375_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(297, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dod");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dod"

    public static class doz_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doz"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:300:1: doz : 'DOZ' TOKEN ;
    public final ChemicalChunkerParser.doz_return doz() throws RecognitionException {
        ChemicalChunkerParser.doz_return retval = new ChemicalChunkerParser.doz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal376=null;
        Token TOKEN377=null;

        Object string_literal376_tree=null;
        Object TOKEN377_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(300, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:300:4: ( 'DOZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:300:5: 'DOZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(300,5);
            string_literal376=(Token)match(input,122,FOLLOW_122_in_doz1571); 
            string_literal376_tree = (Object)adaptor.create(string_literal376);
            adaptor.addChild(root_0, string_literal376_tree);

            dbg.location(300,11);
            TOKEN377=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_doz1573); 
            TOKEN377_tree = (Object)adaptor.create(TOKEN377);
            adaptor.addChild(root_0, TOKEN377_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(300, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "doz");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "doz"

    public static class dt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dt"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:303:1: dt : 'DT' TOKEN ;
    public final ChemicalChunkerParser.dt_return dt() throws RecognitionException {
        ChemicalChunkerParser.dt_return retval = new ChemicalChunkerParser.dt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal378=null;
        Token TOKEN379=null;

        Object string_literal378_tree=null;
        Object TOKEN379_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(303, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:303:3: ( 'DT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:303:4: 'DT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(303,4);
            string_literal378=(Token)match(input,123,FOLLOW_123_in_dt1580); 
            string_literal378_tree = (Object)adaptor.create(string_literal378);
            adaptor.addChild(root_0, string_literal378_tree);

            dbg.location(303,9);
            TOKEN379=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dt1582); 
            TOKEN379_tree = (Object)adaptor.create(TOKEN379);
            adaptor.addChild(root_0, TOKEN379_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(303, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dt"

    public static class dti_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dti"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:306:1: dti : 'DTI' TOKEN ;
    public final ChemicalChunkerParser.dti_return dti() throws RecognitionException {
        ChemicalChunkerParser.dti_return retval = new ChemicalChunkerParser.dti_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal380=null;
        Token TOKEN381=null;

        Object string_literal380_tree=null;
        Object TOKEN381_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dti");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(306, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:306:4: ( 'DTI' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:306:5: 'DTI' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(306,5);
            string_literal380=(Token)match(input,124,FOLLOW_124_in_dti1589); 
            string_literal380_tree = (Object)adaptor.create(string_literal380);
            adaptor.addChild(root_0, string_literal380_tree);

            dbg.location(306,11);
            TOKEN381=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dti1591); 
            TOKEN381_tree = (Object)adaptor.create(TOKEN381);
            adaptor.addChild(root_0, TOKEN381_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(306, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dti");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dti"

    public static class dts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dts"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:309:1: dts : 'DTS' TOKEN ;
    public final ChemicalChunkerParser.dts_return dts() throws RecognitionException {
        ChemicalChunkerParser.dts_return retval = new ChemicalChunkerParser.dts_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal382=null;
        Token TOKEN383=null;

        Object string_literal382_tree=null;
        Object TOKEN383_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dts");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(309, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:309:4: ( 'DTS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:309:5: 'DTS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(309,5);
            string_literal382=(Token)match(input,125,FOLLOW_125_in_dts1598); 
            string_literal382_tree = (Object)adaptor.create(string_literal382);
            adaptor.addChild(root_0, string_literal382_tree);

            dbg.location(309,11);
            TOKEN383=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dts1600); 
            TOKEN383_tree = (Object)adaptor.create(TOKEN383);
            adaptor.addChild(root_0, TOKEN383_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(309, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dts");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dts"

    public static class dtx_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dtx"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:312:1: dtx : 'DTX' TOKEN ;
    public final ChemicalChunkerParser.dtx_return dtx() throws RecognitionException {
        ChemicalChunkerParser.dtx_return retval = new ChemicalChunkerParser.dtx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal384=null;
        Token TOKEN385=null;

        Object string_literal384_tree=null;
        Object TOKEN385_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dtx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(312, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:312:4: ( 'DTX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:312:5: 'DTX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(312,5);
            string_literal384=(Token)match(input,126,FOLLOW_126_in_dtx1607); 
            string_literal384_tree = (Object)adaptor.create(string_literal384);
            adaptor.addChild(root_0, string_literal384_tree);

            dbg.location(312,11);
            TOKEN385=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dtx1609); 
            TOKEN385_tree = (Object)adaptor.create(TOKEN385);
            adaptor.addChild(root_0, TOKEN385_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(312, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dtx");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dtx"

    public static class ex_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ex"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:315:1: ex : 'EX' TOKEN ;
    public final ChemicalChunkerParser.ex_return ex() throws RecognitionException {
        ChemicalChunkerParser.ex_return retval = new ChemicalChunkerParser.ex_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal386=null;
        Token TOKEN387=null;

        Object string_literal386_tree=null;
        Object TOKEN387_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ex");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(315, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:315:3: ( 'EX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:315:4: 'EX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(315,4);
            string_literal386=(Token)match(input,127,FOLLOW_127_in_ex1616); 
            string_literal386_tree = (Object)adaptor.create(string_literal386);
            adaptor.addChild(root_0, string_literal386_tree);

            dbg.location(315,9);
            TOKEN387=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ex1618); 
            TOKEN387_tree = (Object)adaptor.create(TOKEN387);
            adaptor.addChild(root_0, TOKEN387_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(315, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ex");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ex"

    public static class fw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fw"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:318:1: fw : 'FW' TOKEN ;
    public final ChemicalChunkerParser.fw_return fw() throws RecognitionException {
        ChemicalChunkerParser.fw_return retval = new ChemicalChunkerParser.fw_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal388=null;
        Token TOKEN389=null;

        Object string_literal388_tree=null;
        Object TOKEN389_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(318, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:318:3: ( 'FW' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:318:4: 'FW' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(318,4);
            string_literal388=(Token)match(input,128,FOLLOW_128_in_fw1625); 
            string_literal388_tree = (Object)adaptor.create(string_literal388);
            adaptor.addChild(root_0, string_literal388_tree);

            dbg.location(318,9);
            TOKEN389=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_fw1627); 
            TOKEN389_tree = (Object)adaptor.create(TOKEN389);
            adaptor.addChild(root_0, TOKEN389_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(318, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fw");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fw"

    public static class hv_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hv"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:321:1: hv : 'HV' TOKEN ;
    public final ChemicalChunkerParser.hv_return hv() throws RecognitionException {
        ChemicalChunkerParser.hv_return retval = new ChemicalChunkerParser.hv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal390=null;
        Token TOKEN391=null;

        Object string_literal390_tree=null;
        Object TOKEN391_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(321, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:321:3: ( 'HV' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:321:4: 'HV' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(321,4);
            string_literal390=(Token)match(input,129,FOLLOW_129_in_hv1634); 
            string_literal390_tree = (Object)adaptor.create(string_literal390);
            adaptor.addChild(root_0, string_literal390_tree);

            dbg.location(321,9);
            TOKEN391=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hv1636); 
            TOKEN391_tree = (Object)adaptor.create(TOKEN391);
            adaptor.addChild(root_0, TOKEN391_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(321, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hv");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hv"

    public static class hvd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:324:1: hvd : 'HVD' TOKEN ;
    public final ChemicalChunkerParser.hvd_return hvd() throws RecognitionException {
        ChemicalChunkerParser.hvd_return retval = new ChemicalChunkerParser.hvd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal392=null;
        Token TOKEN393=null;

        Object string_literal392_tree=null;
        Object TOKEN393_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:324:4: ( 'HVD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:324:5: 'HVD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(324,5);
            string_literal392=(Token)match(input,130,FOLLOW_130_in_hvd1643); 
            string_literal392_tree = (Object)adaptor.create(string_literal392);
            adaptor.addChild(root_0, string_literal392_tree);

            dbg.location(324,11);
            TOKEN393=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvd1645); 
            TOKEN393_tree = (Object)adaptor.create(TOKEN393);
            adaptor.addChild(root_0, TOKEN393_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(324, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hvd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hvd"

    public static class hvg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvg"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:327:1: hvg : 'HVG' TOKEN ;
    public final ChemicalChunkerParser.hvg_return hvg() throws RecognitionException {
        ChemicalChunkerParser.hvg_return retval = new ChemicalChunkerParser.hvg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal394=null;
        Token TOKEN395=null;

        Object string_literal394_tree=null;
        Object TOKEN395_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(327, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:327:4: ( 'HVG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:327:5: 'HVG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(327,5);
            string_literal394=(Token)match(input,131,FOLLOW_131_in_hvg1652); 
            string_literal394_tree = (Object)adaptor.create(string_literal394);
            adaptor.addChild(root_0, string_literal394_tree);

            dbg.location(327,11);
            TOKEN395=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvg1654); 
            TOKEN395_tree = (Object)adaptor.create(TOKEN395);
            adaptor.addChild(root_0, TOKEN395_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(327, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hvg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hvg"

    public static class hvn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hvn"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:330:1: hvn : 'HVN' TOKEN ;
    public final ChemicalChunkerParser.hvn_return hvn() throws RecognitionException {
        ChemicalChunkerParser.hvn_return retval = new ChemicalChunkerParser.hvn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal396=null;
        Token TOKEN397=null;

        Object string_literal396_tree=null;
        Object TOKEN397_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(330, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:330:4: ( 'HVN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:330:5: 'HVN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(330,5);
            string_literal396=(Token)match(input,132,FOLLOW_132_in_hvn1661); 
            string_literal396_tree = (Object)adaptor.create(string_literal396);
            adaptor.addChild(root_0, string_literal396_tree);

            dbg.location(330,11);
            TOKEN397=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvn1663); 
            TOKEN397_tree = (Object)adaptor.create(TOKEN397);
            adaptor.addChild(root_0, TOKEN397_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(330, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hvn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hvn"

    public static class in_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:333:1: in : 'IN' TOKEN ;
    public final ChemicalChunkerParser.in_return in() throws RecognitionException {
        ChemicalChunkerParser.in_return retval = new ChemicalChunkerParser.in_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal398=null;
        Token TOKEN399=null;

        Object string_literal398_tree=null;
        Object TOKEN399_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "in");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(333, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:333:3: ( 'IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:333:4: 'IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(333,4);
            string_literal398=(Token)match(input,133,FOLLOW_133_in_in1670); 
            string_literal398_tree = (Object)adaptor.create(string_literal398);
            adaptor.addChild(root_0, string_literal398_tree);

            dbg.location(333,9);
            TOKEN399=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_in1672); 
            TOKEN399_tree = (Object)adaptor.create(TOKEN399);
            adaptor.addChild(root_0, TOKEN399_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(333, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "in");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "in"

    public static class jj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jj"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:336:1: jj : 'JJ' TOKEN ;
    public final ChemicalChunkerParser.jj_return jj() throws RecognitionException {
        ChemicalChunkerParser.jj_return retval = new ChemicalChunkerParser.jj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal400=null;
        Token TOKEN401=null;

        Object string_literal400_tree=null;
        Object TOKEN401_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(336, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:336:3: ( 'JJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:336:4: 'JJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(336,4);
            string_literal400=(Token)match(input,134,FOLLOW_134_in_jj1679); 
            string_literal400_tree = (Object)adaptor.create(string_literal400);
            adaptor.addChild(root_0, string_literal400_tree);

            dbg.location(336,9);
            TOKEN401=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jj1681); 
            TOKEN401_tree = (Object)adaptor.create(TOKEN401);
            adaptor.addChild(root_0, TOKEN401_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(336, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "jj");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "jj"

    public static class jjr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jjr"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:339:1: jjr : 'JJR' TOKEN ;
    public final ChemicalChunkerParser.jjr_return jjr() throws RecognitionException {
        ChemicalChunkerParser.jjr_return retval = new ChemicalChunkerParser.jjr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal402=null;
        Token TOKEN403=null;

        Object string_literal402_tree=null;
        Object TOKEN403_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(339, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:339:4: ( 'JJR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:339:5: 'JJR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(339,5);
            string_literal402=(Token)match(input,135,FOLLOW_135_in_jjr1688); 
            string_literal402_tree = (Object)adaptor.create(string_literal402);
            adaptor.addChild(root_0, string_literal402_tree);

            dbg.location(339,11);
            TOKEN403=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjr1690); 
            TOKEN403_tree = (Object)adaptor.create(TOKEN403);
            adaptor.addChild(root_0, TOKEN403_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(339, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "jjr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "jjr"

    public static class jjs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jjs"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:342:1: jjs : 'JJS' TOKEN ;
    public final ChemicalChunkerParser.jjs_return jjs() throws RecognitionException {
        ChemicalChunkerParser.jjs_return retval = new ChemicalChunkerParser.jjs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal404=null;
        Token TOKEN405=null;

        Object string_literal404_tree=null;
        Object TOKEN405_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(342, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:342:4: ( 'JJS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:342:5: 'JJS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(342,5);
            string_literal404=(Token)match(input,136,FOLLOW_136_in_jjs1697); 
            string_literal404_tree = (Object)adaptor.create(string_literal404);
            adaptor.addChild(root_0, string_literal404_tree);

            dbg.location(342,11);
            TOKEN405=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjs1699); 
            TOKEN405_tree = (Object)adaptor.create(TOKEN405);
            adaptor.addChild(root_0, TOKEN405_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(342, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "jjs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "jjs"

    public static class jjt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jjt"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:345:1: jjt : 'JJT' TOKEN ;
    public final ChemicalChunkerParser.jjt_return jjt() throws RecognitionException {
        ChemicalChunkerParser.jjt_return retval = new ChemicalChunkerParser.jjt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal406=null;
        Token TOKEN407=null;

        Object string_literal406_tree=null;
        Object TOKEN407_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(345, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:345:4: ( 'JJT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:345:5: 'JJT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(345,5);
            string_literal406=(Token)match(input,137,FOLLOW_137_in_jjt1706); 
            string_literal406_tree = (Object)adaptor.create(string_literal406);
            adaptor.addChild(root_0, string_literal406_tree);

            dbg.location(345,11);
            TOKEN407=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjt1708); 
            TOKEN407_tree = (Object)adaptor.create(TOKEN407);
            adaptor.addChild(root_0, TOKEN407_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(345, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "jjt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "jjt"

    public static class md_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "md"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:348:1: md : 'MD' TOKEN ;
    public final ChemicalChunkerParser.md_return md() throws RecognitionException {
        ChemicalChunkerParser.md_return retval = new ChemicalChunkerParser.md_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal408=null;
        Token TOKEN409=null;

        Object string_literal408_tree=null;
        Object TOKEN409_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "md");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(348, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:348:3: ( 'MD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:348:4: 'MD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(348,4);
            string_literal408=(Token)match(input,138,FOLLOW_138_in_md1715); 
            string_literal408_tree = (Object)adaptor.create(string_literal408);
            adaptor.addChild(root_0, string_literal408_tree);

            dbg.location(348,9);
            TOKEN409=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_md1717); 
            TOKEN409_tree = (Object)adaptor.create(TOKEN409);
            adaptor.addChild(root_0, TOKEN409_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(348, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "md");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "md"

    public static class nc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nc"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:351:1: nc : 'NC' TOKEN ;
    public final ChemicalChunkerParser.nc_return nc() throws RecognitionException {
        ChemicalChunkerParser.nc_return retval = new ChemicalChunkerParser.nc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal410=null;
        Token TOKEN411=null;

        Object string_literal410_tree=null;
        Object TOKEN411_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(351, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:351:3: ( 'NC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:351:4: 'NC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(351,4);
            string_literal410=(Token)match(input,139,FOLLOW_139_in_nc1724); 
            string_literal410_tree = (Object)adaptor.create(string_literal410);
            adaptor.addChild(root_0, string_literal410_tree);

            dbg.location(351,9);
            TOKEN411=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nc1726); 
            TOKEN411_tree = (Object)adaptor.create(TOKEN411);
            adaptor.addChild(root_0, TOKEN411_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(351, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nc"

    public static class nn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nn"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:354:1: nn : 'NN' TOKEN ;
    public final ChemicalChunkerParser.nn_return nn() throws RecognitionException {
        ChemicalChunkerParser.nn_return retval = new ChemicalChunkerParser.nn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal412=null;
        Token TOKEN413=null;

        Object string_literal412_tree=null;
        Object TOKEN413_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(354, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:354:3: ( 'NN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:354:4: 'NN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(354,4);
            string_literal412=(Token)match(input,140,FOLLOW_140_in_nn1733); 
            string_literal412_tree = (Object)adaptor.create(string_literal412);
            adaptor.addChild(root_0, string_literal412_tree);

            dbg.location(354,9);
            TOKEN413=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn1735); 
            TOKEN413_tree = (Object)adaptor.create(TOKEN413);
            adaptor.addChild(root_0, TOKEN413_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(354, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nn"

    public static class nn_poss_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nn_poss"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:357:1: nn_poss : 'NN$' TOKEN ;
    public final ChemicalChunkerParser.nn_poss_return nn_poss() throws RecognitionException {
        ChemicalChunkerParser.nn_poss_return retval = new ChemicalChunkerParser.nn_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal414=null;
        Token TOKEN415=null;

        Object string_literal414_tree=null;
        Object TOKEN415_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(357, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:357:8: ( 'NN$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:357:9: 'NN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(357,9);
            string_literal414=(Token)match(input,141,FOLLOW_141_in_nn_poss1742); 
            string_literal414_tree = (Object)adaptor.create(string_literal414);
            adaptor.addChild(root_0, string_literal414_tree);

            dbg.location(357,15);
            TOKEN415=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn_poss1744); 
            TOKEN415_tree = (Object)adaptor.create(TOKEN415);
            adaptor.addChild(root_0, TOKEN415_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(357, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nn_poss");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nn_poss"

    public static class nns_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nns"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:360:1: nns : 'NNS' TOKEN ;
    public final ChemicalChunkerParser.nns_return nns() throws RecognitionException {
        ChemicalChunkerParser.nns_return retval = new ChemicalChunkerParser.nns_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal416=null;
        Token TOKEN417=null;

        Object string_literal416_tree=null;
        Object TOKEN417_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(360, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:360:4: ( 'NNS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:360:5: 'NNS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(360,5);
            string_literal416=(Token)match(input,142,FOLLOW_142_in_nns1751); 
            string_literal416_tree = (Object)adaptor.create(string_literal416);
            adaptor.addChild(root_0, string_literal416_tree);

            dbg.location(360,11);
            TOKEN417=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns1753); 
            TOKEN417_tree = (Object)adaptor.create(TOKEN417);
            adaptor.addChild(root_0, TOKEN417_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(360, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nns");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nns"

    public static class nns_poss_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nns_poss"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:363:1: nns_poss : 'NNS$' TOKEN ;
    public final ChemicalChunkerParser.nns_poss_return nns_poss() throws RecognitionException {
        ChemicalChunkerParser.nns_poss_return retval = new ChemicalChunkerParser.nns_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal418=null;
        Token TOKEN419=null;

        Object string_literal418_tree=null;
        Object TOKEN419_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(363, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:363:9: ( 'NNS$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:363:10: 'NNS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(363,10);
            string_literal418=(Token)match(input,143,FOLLOW_143_in_nns_poss1760); 
            string_literal418_tree = (Object)adaptor.create(string_literal418);
            adaptor.addChild(root_0, string_literal418_tree);

            dbg.location(363,17);
            TOKEN419=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns_poss1762); 
            TOKEN419_tree = (Object)adaptor.create(TOKEN419);
            adaptor.addChild(root_0, TOKEN419_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(363, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nns_poss");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nns_poss"

    public static class np_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "np"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:366:1: np : 'NP' TOKEN ;
    public final ChemicalChunkerParser.np_return np() throws RecognitionException {
        ChemicalChunkerParser.np_return retval = new ChemicalChunkerParser.np_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal420=null;
        Token TOKEN421=null;

        Object string_literal420_tree=null;
        Object TOKEN421_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(366, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:366:3: ( 'NP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:366:4: 'NP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(366,4);
            string_literal420=(Token)match(input,144,FOLLOW_144_in_np1769); 
            string_literal420_tree = (Object)adaptor.create(string_literal420);
            adaptor.addChild(root_0, string_literal420_tree);

            dbg.location(366,9);
            TOKEN421=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np1771); 
            TOKEN421_tree = (Object)adaptor.create(TOKEN421);
            adaptor.addChild(root_0, TOKEN421_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(366, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "np");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "np"

    public static class np_poss_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "np_poss"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:369:1: np_poss : 'NP$' TOKEN ;
    public final ChemicalChunkerParser.np_poss_return np_poss() throws RecognitionException {
        ChemicalChunkerParser.np_poss_return retval = new ChemicalChunkerParser.np_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal422=null;
        Token TOKEN423=null;

        Object string_literal422_tree=null;
        Object TOKEN423_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(369, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:369:8: ( 'NP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:369:9: 'NP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(369,9);
            string_literal422=(Token)match(input,145,FOLLOW_145_in_np_poss1778); 
            string_literal422_tree = (Object)adaptor.create(string_literal422);
            adaptor.addChild(root_0, string_literal422_tree);

            dbg.location(369,15);
            TOKEN423=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np_poss1780); 
            TOKEN423_tree = (Object)adaptor.create(TOKEN423);
            adaptor.addChild(root_0, TOKEN423_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(369, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "np_poss");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "np_poss"

    public static class nps_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nps"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:372:1: nps : 'NPS' TOKEN ;
    public final ChemicalChunkerParser.nps_return nps() throws RecognitionException {
        ChemicalChunkerParser.nps_return retval = new ChemicalChunkerParser.nps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal424=null;
        Token TOKEN425=null;

        Object string_literal424_tree=null;
        Object TOKEN425_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(372, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:372:4: ( 'NPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:372:5: 'NPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(372,5);
            string_literal424=(Token)match(input,146,FOLLOW_146_in_nps1787); 
            string_literal424_tree = (Object)adaptor.create(string_literal424);
            adaptor.addChild(root_0, string_literal424_tree);

            dbg.location(372,11);
            TOKEN425=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps1789); 
            TOKEN425_tree = (Object)adaptor.create(TOKEN425);
            adaptor.addChild(root_0, TOKEN425_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(372, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nps");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nps"

    public static class nps_poss_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nps_poss"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:375:1: nps_poss : 'NPS$' TOKEN ;
    public final ChemicalChunkerParser.nps_poss_return nps_poss() throws RecognitionException {
        ChemicalChunkerParser.nps_poss_return retval = new ChemicalChunkerParser.nps_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal426=null;
        Token TOKEN427=null;

        Object string_literal426_tree=null;
        Object TOKEN427_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(375, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:375:9: ( 'NPS$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:375:10: 'NPS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(375,10);
            string_literal426=(Token)match(input,147,FOLLOW_147_in_nps_poss1796); 
            string_literal426_tree = (Object)adaptor.create(string_literal426);
            adaptor.addChild(root_0, string_literal426_tree);

            dbg.location(375,17);
            TOKEN427=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps_poss1798); 
            TOKEN427_tree = (Object)adaptor.create(TOKEN427);
            adaptor.addChild(root_0, TOKEN427_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(375, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nps_poss");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nps_poss"

    public static class nr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nr"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:378:1: nr : 'NR' TOKEN ;
    public final ChemicalChunkerParser.nr_return nr() throws RecognitionException {
        ChemicalChunkerParser.nr_return retval = new ChemicalChunkerParser.nr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal428=null;
        Token TOKEN429=null;

        Object string_literal428_tree=null;
        Object TOKEN429_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(378, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:378:3: ( 'NR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:378:4: 'NR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(378,4);
            string_literal428=(Token)match(input,148,FOLLOW_148_in_nr1805); 
            string_literal428_tree = (Object)adaptor.create(string_literal428);
            adaptor.addChild(root_0, string_literal428_tree);

            dbg.location(378,9);
            TOKEN429=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nr1807); 
            TOKEN429_tree = (Object)adaptor.create(TOKEN429);
            adaptor.addChild(root_0, TOKEN429_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(378, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nr"

    public static class od_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "od"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:381:1: od : 'OD' TOKEN ;
    public final ChemicalChunkerParser.od_return od() throws RecognitionException {
        ChemicalChunkerParser.od_return retval = new ChemicalChunkerParser.od_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal430=null;
        Token TOKEN431=null;

        Object string_literal430_tree=null;
        Object TOKEN431_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "od");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:381:3: ( 'OD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:381:4: 'OD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(381,4);
            string_literal430=(Token)match(input,149,FOLLOW_149_in_od1814); 
            string_literal430_tree = (Object)adaptor.create(string_literal430);
            adaptor.addChild(root_0, string_literal430_tree);

            dbg.location(381,9);
            TOKEN431=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_od1816); 
            TOKEN431_tree = (Object)adaptor.create(TOKEN431);
            adaptor.addChild(root_0, TOKEN431_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(381, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "od");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "od"

    public static class pn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pn"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:384:1: pn : 'PN' TOKEN ;
    public final ChemicalChunkerParser.pn_return pn() throws RecognitionException {
        ChemicalChunkerParser.pn_return retval = new ChemicalChunkerParser.pn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal432=null;
        Token TOKEN433=null;

        Object string_literal432_tree=null;
        Object TOKEN433_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(384, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:384:3: ( 'PN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:384:4: 'PN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(384,4);
            string_literal432=(Token)match(input,150,FOLLOW_150_in_pn1823); 
            string_literal432_tree = (Object)adaptor.create(string_literal432);
            adaptor.addChild(root_0, string_literal432_tree);

            dbg.location(384,9);
            TOKEN433=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn1825); 
            TOKEN433_tree = (Object)adaptor.create(TOKEN433);
            adaptor.addChild(root_0, TOKEN433_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(384, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pn"

    public static class pn_poss_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pn_poss"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:387:1: pn_poss : 'PN$' TOKEN ;
    public final ChemicalChunkerParser.pn_poss_return pn_poss() throws RecognitionException {
        ChemicalChunkerParser.pn_poss_return retval = new ChemicalChunkerParser.pn_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal434=null;
        Token TOKEN435=null;

        Object string_literal434_tree=null;
        Object TOKEN435_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(387, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:387:8: ( 'PN$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:387:9: 'PN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(387,9);
            string_literal434=(Token)match(input,151,FOLLOW_151_in_pn_poss1832); 
            string_literal434_tree = (Object)adaptor.create(string_literal434);
            adaptor.addChild(root_0, string_literal434_tree);

            dbg.location(387,15);
            TOKEN435=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn_poss1834); 
            TOKEN435_tree = (Object)adaptor.create(TOKEN435);
            adaptor.addChild(root_0, TOKEN435_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(387, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pn_poss");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pn_poss"

    public static class pp_poss_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pp_poss"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:390:1: pp_poss : 'PP$' TOKEN ;
    public final ChemicalChunkerParser.pp_poss_return pp_poss() throws RecognitionException {
        ChemicalChunkerParser.pp_poss_return retval = new ChemicalChunkerParser.pp_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal436=null;
        Token TOKEN437=null;

        Object string_literal436_tree=null;
        Object TOKEN437_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pp_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(390, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:390:8: ( 'PP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:390:9: 'PP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(390,9);
            string_literal436=(Token)match(input,152,FOLLOW_152_in_pp_poss1841); 
            string_literal436_tree = (Object)adaptor.create(string_literal436);
            adaptor.addChild(root_0, string_literal436_tree);

            dbg.location(390,15);
            TOKEN437=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pp_poss1843); 
            TOKEN437_tree = (Object)adaptor.create(TOKEN437);
            adaptor.addChild(root_0, TOKEN437_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(390, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pp_poss");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pp_poss"

    public static class pp_poss_poss_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pp_poss_poss"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:393:1: pp_poss_poss : 'PP$$' TOKEN ;
    public final ChemicalChunkerParser.pp_poss_poss_return pp_poss_poss() throws RecognitionException {
        ChemicalChunkerParser.pp_poss_poss_return retval = new ChemicalChunkerParser.pp_poss_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal438=null;
        Token TOKEN439=null;

        Object string_literal438_tree=null;
        Object TOKEN439_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pp_poss_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(393, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:393:13: ( 'PP$$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:393:14: 'PP$$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(393,14);
            string_literal438=(Token)match(input,153,FOLLOW_153_in_pp_poss_poss1850); 
            string_literal438_tree = (Object)adaptor.create(string_literal438);
            adaptor.addChild(root_0, string_literal438_tree);

            dbg.location(393,21);
            TOKEN439=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pp_poss_poss1852); 
            TOKEN439_tree = (Object)adaptor.create(TOKEN439);
            adaptor.addChild(root_0, TOKEN439_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(393, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pp_poss_poss");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pp_poss_poss"

    public static class ppl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppl"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:396:1: ppl : 'PPL' TOKEN ;
    public final ChemicalChunkerParser.ppl_return ppl() throws RecognitionException {
        ChemicalChunkerParser.ppl_return retval = new ChemicalChunkerParser.ppl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal440=null;
        Token TOKEN441=null;

        Object string_literal440_tree=null;
        Object TOKEN441_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(396, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:396:4: ( 'PPL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:396:5: 'PPL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(396,5);
            string_literal440=(Token)match(input,154,FOLLOW_154_in_ppl1859); 
            string_literal440_tree = (Object)adaptor.create(string_literal440);
            adaptor.addChild(root_0, string_literal440_tree);

            dbg.location(396,11);
            TOKEN441=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppl1861); 
            TOKEN441_tree = (Object)adaptor.create(TOKEN441);
            adaptor.addChild(root_0, TOKEN441_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(396, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppl"

    public static class ppls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppls"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:399:1: ppls : 'PPLS' TOKEN ;
    public final ChemicalChunkerParser.ppls_return ppls() throws RecognitionException {
        ChemicalChunkerParser.ppls_return retval = new ChemicalChunkerParser.ppls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal442=null;
        Token TOKEN443=null;

        Object string_literal442_tree=null;
        Object TOKEN443_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(399, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:399:5: ( 'PPLS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:399:6: 'PPLS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(399,6);
            string_literal442=(Token)match(input,155,FOLLOW_155_in_ppls1868); 
            string_literal442_tree = (Object)adaptor.create(string_literal442);
            adaptor.addChild(root_0, string_literal442_tree);

            dbg.location(399,13);
            TOKEN443=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppls1870); 
            TOKEN443_tree = (Object)adaptor.create(TOKEN443);
            adaptor.addChild(root_0, TOKEN443_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(399, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppls");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppls"

    public static class ppo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppo"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:402:1: ppo : 'PPO' TOKEN ;
    public final ChemicalChunkerParser.ppo_return ppo() throws RecognitionException {
        ChemicalChunkerParser.ppo_return retval = new ChemicalChunkerParser.ppo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal444=null;
        Token TOKEN445=null;

        Object string_literal444_tree=null;
        Object TOKEN445_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(402, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:402:4: ( 'PPO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:402:5: 'PPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(402,5);
            string_literal444=(Token)match(input,156,FOLLOW_156_in_ppo1877); 
            string_literal444_tree = (Object)adaptor.create(string_literal444);
            adaptor.addChild(root_0, string_literal444_tree);

            dbg.location(402,11);
            TOKEN445=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppo1879); 
            TOKEN445_tree = (Object)adaptor.create(TOKEN445);
            adaptor.addChild(root_0, TOKEN445_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(402, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppo");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppo"

    public static class pps_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pps"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:405:1: pps : 'PPS' TOKEN ;
    public final ChemicalChunkerParser.pps_return pps() throws RecognitionException {
        ChemicalChunkerParser.pps_return retval = new ChemicalChunkerParser.pps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal446=null;
        Token TOKEN447=null;

        Object string_literal446_tree=null;
        Object TOKEN447_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(405, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:405:4: ( 'PPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:405:5: 'PPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(405,5);
            string_literal446=(Token)match(input,157,FOLLOW_157_in_pps1886); 
            string_literal446_tree = (Object)adaptor.create(string_literal446);
            adaptor.addChild(root_0, string_literal446_tree);

            dbg.location(405,11);
            TOKEN447=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pps1888); 
            TOKEN447_tree = (Object)adaptor.create(TOKEN447);
            adaptor.addChild(root_0, TOKEN447_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(405, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pps");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pps"

    public static class ppss_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppss"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:408:1: ppss : 'PPSS' TOKEN ;
    public final ChemicalChunkerParser.ppss_return ppss() throws RecognitionException {
        ChemicalChunkerParser.ppss_return retval = new ChemicalChunkerParser.ppss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal448=null;
        Token TOKEN449=null;

        Object string_literal448_tree=null;
        Object TOKEN449_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(408, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:408:5: ( 'PPSS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:408:6: 'PPSS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(408,6);
            string_literal448=(Token)match(input,158,FOLLOW_158_in_ppss1895); 
            string_literal448_tree = (Object)adaptor.create(string_literal448);
            adaptor.addChild(root_0, string_literal448_tree);

            dbg.location(408,13);
            TOKEN449=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppss1897); 
            TOKEN449_tree = (Object)adaptor.create(TOKEN449);
            adaptor.addChild(root_0, TOKEN449_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(408, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppss");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppss"

    public static class ql_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ql"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:411:1: ql : 'QL' TOKEN ;
    public final ChemicalChunkerParser.ql_return ql() throws RecognitionException {
        ChemicalChunkerParser.ql_return retval = new ChemicalChunkerParser.ql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal450=null;
        Token TOKEN451=null;

        Object string_literal450_tree=null;
        Object TOKEN451_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(411, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:411:3: ( 'QL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:411:4: 'QL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(411,4);
            string_literal450=(Token)match(input,159,FOLLOW_159_in_ql1904); 
            string_literal450_tree = (Object)adaptor.create(string_literal450);
            adaptor.addChild(root_0, string_literal450_tree);

            dbg.location(411,9);
            TOKEN451=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ql1906); 
            TOKEN451_tree = (Object)adaptor.create(TOKEN451);
            adaptor.addChild(root_0, TOKEN451_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(411, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ql");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ql"

    public static class qlp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qlp"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:414:1: qlp : 'QLP' TOKEN ;
    public final ChemicalChunkerParser.qlp_return qlp() throws RecognitionException {
        ChemicalChunkerParser.qlp_return retval = new ChemicalChunkerParser.qlp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal452=null;
        Token TOKEN453=null;

        Object string_literal452_tree=null;
        Object TOKEN453_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "qlp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(414, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:414:4: ( 'QLP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:414:5: 'QLP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(414,5);
            string_literal452=(Token)match(input,160,FOLLOW_160_in_qlp1913); 
            string_literal452_tree = (Object)adaptor.create(string_literal452);
            adaptor.addChild(root_0, string_literal452_tree);

            dbg.location(414,11);
            TOKEN453=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_qlp1915); 
            TOKEN453_tree = (Object)adaptor.create(TOKEN453);
            adaptor.addChild(root_0, TOKEN453_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(414, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "qlp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "qlp"

    public static class rb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rb"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:417:1: rb : 'RB' TOKEN ;
    public final ChemicalChunkerParser.rb_return rb() throws RecognitionException {
        ChemicalChunkerParser.rb_return retval = new ChemicalChunkerParser.rb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal454=null;
        Token TOKEN455=null;

        Object string_literal454_tree=null;
        Object TOKEN455_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(417, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:417:3: ( 'RB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:417:4: 'RB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(417,4);
            string_literal454=(Token)match(input,161,FOLLOW_161_in_rb1922); 
            string_literal454_tree = (Object)adaptor.create(string_literal454);
            adaptor.addChild(root_0, string_literal454_tree);

            dbg.location(417,9);
            TOKEN455=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rb1924); 
            TOKEN455_tree = (Object)adaptor.create(TOKEN455);
            adaptor.addChild(root_0, TOKEN455_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(417, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rb"

    public static class rbr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rbr"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:420:1: rbr : 'RBR' TOKEN ;
    public final ChemicalChunkerParser.rbr_return rbr() throws RecognitionException {
        ChemicalChunkerParser.rbr_return retval = new ChemicalChunkerParser.rbr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal456=null;
        Token TOKEN457=null;

        Object string_literal456_tree=null;
        Object TOKEN457_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(420, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:420:4: ( 'RBR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:420:5: 'RBR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(420,5);
            string_literal456=(Token)match(input,162,FOLLOW_162_in_rbr1931); 
            string_literal456_tree = (Object)adaptor.create(string_literal456);
            adaptor.addChild(root_0, string_literal456_tree);

            dbg.location(420,11);
            TOKEN457=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbr1933); 
            TOKEN457_tree = (Object)adaptor.create(TOKEN457);
            adaptor.addChild(root_0, TOKEN457_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(420, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rbr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rbr"

    public static class rbt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rbt"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:423:1: rbt : 'RBT' TOKEN ;
    public final ChemicalChunkerParser.rbt_return rbt() throws RecognitionException {
        ChemicalChunkerParser.rbt_return retval = new ChemicalChunkerParser.rbt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal458=null;
        Token TOKEN459=null;

        Object string_literal458_tree=null;
        Object TOKEN459_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(423, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:423:4: ( 'RBT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:423:5: 'RBT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(423,5);
            string_literal458=(Token)match(input,163,FOLLOW_163_in_rbt1940); 
            string_literal458_tree = (Object)adaptor.create(string_literal458);
            adaptor.addChild(root_0, string_literal458_tree);

            dbg.location(423,11);
            TOKEN459=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbt1942); 
            TOKEN459_tree = (Object)adaptor.create(TOKEN459);
            adaptor.addChild(root_0, TOKEN459_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(423, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rbt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rbt"

    public static class rn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rn"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:426:1: rn : 'RN' TOKEN ;
    public final ChemicalChunkerParser.rn_return rn() throws RecognitionException {
        ChemicalChunkerParser.rn_return retval = new ChemicalChunkerParser.rn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal460=null;
        Token TOKEN461=null;

        Object string_literal460_tree=null;
        Object TOKEN461_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(426, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:426:3: ( 'RN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:426:4: 'RN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(426,4);
            string_literal460=(Token)match(input,164,FOLLOW_164_in_rn1949); 
            string_literal460_tree = (Object)adaptor.create(string_literal460);
            adaptor.addChild(root_0, string_literal460_tree);

            dbg.location(426,9);
            TOKEN461=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rn1951); 
            TOKEN461_tree = (Object)adaptor.create(TOKEN461);
            adaptor.addChild(root_0, TOKEN461_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(426, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rn"

    public static class rp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rp"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:429:1: rp : 'RP' TOKEN ;
    public final ChemicalChunkerParser.rp_return rp() throws RecognitionException {
        ChemicalChunkerParser.rp_return retval = new ChemicalChunkerParser.rp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal462=null;
        Token TOKEN463=null;

        Object string_literal462_tree=null;
        Object TOKEN463_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(429, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:429:3: ( 'RP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:429:4: 'RP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(429,4);
            string_literal462=(Token)match(input,165,FOLLOW_165_in_rp1958); 
            string_literal462_tree = (Object)adaptor.create(string_literal462);
            adaptor.addChild(root_0, string_literal462_tree);

            dbg.location(429,9);
            TOKEN463=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rp1960); 
            TOKEN463_tree = (Object)adaptor.create(TOKEN463);
            adaptor.addChild(root_0, TOKEN463_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(429, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rp"

    public static class to_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "to"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:432:1: to : 'TO' TOKEN ;
    public final ChemicalChunkerParser.to_return to() throws RecognitionException {
        ChemicalChunkerParser.to_return retval = new ChemicalChunkerParser.to_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal464=null;
        Token TOKEN465=null;

        Object string_literal464_tree=null;
        Object TOKEN465_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "to");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(432, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:432:3: ( 'TO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:432:4: 'TO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(432,4);
            string_literal464=(Token)match(input,166,FOLLOW_166_in_to1967); 
            string_literal464_tree = (Object)adaptor.create(string_literal464);
            adaptor.addChild(root_0, string_literal464_tree);

            dbg.location(432,9);
            TOKEN465=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_to1969); 
            TOKEN465_tree = (Object)adaptor.create(TOKEN465);
            adaptor.addChild(root_0, TOKEN465_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(432, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "to");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "to"

    public static class uh_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "uh"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:435:1: uh : 'UH' TOKEN ;
    public final ChemicalChunkerParser.uh_return uh() throws RecognitionException {
        ChemicalChunkerParser.uh_return retval = new ChemicalChunkerParser.uh_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal466=null;
        Token TOKEN467=null;

        Object string_literal466_tree=null;
        Object TOKEN467_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "uh");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(435, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:435:3: ( 'UH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:435:4: 'UH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(435,4);
            string_literal466=(Token)match(input,167,FOLLOW_167_in_uh1976); 
            string_literal466_tree = (Object)adaptor.create(string_literal466);
            adaptor.addChild(root_0, string_literal466_tree);

            dbg.location(435,9);
            TOKEN467=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_uh1978); 
            TOKEN467_tree = (Object)adaptor.create(TOKEN467);
            adaptor.addChild(root_0, TOKEN467_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(435, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "uh");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "uh"

    public static class vb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vb"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:438:1: vb : 'VB' TOKEN ;
    public final ChemicalChunkerParser.vb_return vb() throws RecognitionException {
        ChemicalChunkerParser.vb_return retval = new ChemicalChunkerParser.vb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal468=null;
        Token TOKEN469=null;

        Object string_literal468_tree=null;
        Object TOKEN469_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(438, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:438:3: ( 'VB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:438:4: 'VB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(438,4);
            string_literal468=(Token)match(input,168,FOLLOW_168_in_vb1985); 
            string_literal468_tree = (Object)adaptor.create(string_literal468);
            adaptor.addChild(root_0, string_literal468_tree);

            dbg.location(438,9);
            TOKEN469=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vb1987); 
            TOKEN469_tree = (Object)adaptor.create(TOKEN469);
            adaptor.addChild(root_0, TOKEN469_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(438, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vb"

    public static class vbd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:441:1: vbd : 'VBD' TOKEN ;
    public final ChemicalChunkerParser.vbd_return vbd() throws RecognitionException {
        ChemicalChunkerParser.vbd_return retval = new ChemicalChunkerParser.vbd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal470=null;
        Token TOKEN471=null;

        Object string_literal470_tree=null;
        Object TOKEN471_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(441, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:441:4: ( 'VBD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:441:5: 'VBD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(441,5);
            string_literal470=(Token)match(input,169,FOLLOW_169_in_vbd1994); 
            string_literal470_tree = (Object)adaptor.create(string_literal470);
            adaptor.addChild(root_0, string_literal470_tree);

            dbg.location(441,11);
            TOKEN471=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbd1996); 
            TOKEN471_tree = (Object)adaptor.create(TOKEN471);
            adaptor.addChild(root_0, TOKEN471_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(441, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbd"

    public static class vbg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbg"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:444:1: vbg : 'VBG' TOKEN ;
    public final ChemicalChunkerParser.vbg_return vbg() throws RecognitionException {
        ChemicalChunkerParser.vbg_return retval = new ChemicalChunkerParser.vbg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal472=null;
        Token TOKEN473=null;

        Object string_literal472_tree=null;
        Object TOKEN473_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(444, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:444:4: ( 'VBG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:444:5: 'VBG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(444,5);
            string_literal472=(Token)match(input,170,FOLLOW_170_in_vbg2003); 
            string_literal472_tree = (Object)adaptor.create(string_literal472);
            adaptor.addChild(root_0, string_literal472_tree);

            dbg.location(444,11);
            TOKEN473=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbg2005); 
            TOKEN473_tree = (Object)adaptor.create(TOKEN473);
            adaptor.addChild(root_0, TOKEN473_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(444, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbg"

    public static class vbn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbn"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:447:1: vbn : 'VBN' TOKEN ;
    public final ChemicalChunkerParser.vbn_return vbn() throws RecognitionException {
        ChemicalChunkerParser.vbn_return retval = new ChemicalChunkerParser.vbn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal474=null;
        Token TOKEN475=null;

        Object string_literal474_tree=null;
        Object TOKEN475_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(447, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:447:4: ( 'VBN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:447:5: 'VBN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(447,5);
            string_literal474=(Token)match(input,171,FOLLOW_171_in_vbn2012); 
            string_literal474_tree = (Object)adaptor.create(string_literal474);
            adaptor.addChild(root_0, string_literal474_tree);

            dbg.location(447,11);
            TOKEN475=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbn2014); 
            TOKEN475_tree = (Object)adaptor.create(TOKEN475);
            adaptor.addChild(root_0, TOKEN475_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(447, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbn"

    public static class vbz_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbz"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:450:1: vbz : 'VBZ' TOKEN ;
    public final ChemicalChunkerParser.vbz_return vbz() throws RecognitionException {
        ChemicalChunkerParser.vbz_return retval = new ChemicalChunkerParser.vbz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal476=null;
        Token TOKEN477=null;

        Object string_literal476_tree=null;
        Object TOKEN477_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(450, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:450:4: ( 'VBZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:450:5: 'VBZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(450,5);
            string_literal476=(Token)match(input,172,FOLLOW_172_in_vbz2021); 
            string_literal476_tree = (Object)adaptor.create(string_literal476);
            adaptor.addChild(root_0, string_literal476_tree);

            dbg.location(450,11);
            TOKEN477=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbz2023); 
            TOKEN477_tree = (Object)adaptor.create(TOKEN477);
            adaptor.addChild(root_0, TOKEN477_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(450, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbz");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbz"

    public static class wdt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wdt"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:453:1: wdt : 'WDT' TOKEN ;
    public final ChemicalChunkerParser.wdt_return wdt() throws RecognitionException {
        ChemicalChunkerParser.wdt_return retval = new ChemicalChunkerParser.wdt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal478=null;
        Token TOKEN479=null;

        Object string_literal478_tree=null;
        Object TOKEN479_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wdt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(453, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:453:4: ( 'WDT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:453:5: 'WDT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(453,5);
            string_literal478=(Token)match(input,173,FOLLOW_173_in_wdt2030); 
            string_literal478_tree = (Object)adaptor.create(string_literal478);
            adaptor.addChild(root_0, string_literal478_tree);

            dbg.location(453,11);
            TOKEN479=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wdt2032); 
            TOKEN479_tree = (Object)adaptor.create(TOKEN479);
            adaptor.addChild(root_0, TOKEN479_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(453, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wdt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wdt"

    public static class wp_poss_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wp_poss"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:456:1: wp_poss : 'WP$' TOKEN ;
    public final ChemicalChunkerParser.wp_poss_return wp_poss() throws RecognitionException {
        ChemicalChunkerParser.wp_poss_return retval = new ChemicalChunkerParser.wp_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal480=null;
        Token TOKEN481=null;

        Object string_literal480_tree=null;
        Object TOKEN481_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wp_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(456, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:456:8: ( 'WP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:456:9: 'WP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(456,9);
            string_literal480=(Token)match(input,174,FOLLOW_174_in_wp_poss2039); 
            string_literal480_tree = (Object)adaptor.create(string_literal480);
            adaptor.addChild(root_0, string_literal480_tree);

            dbg.location(456,15);
            TOKEN481=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wp_poss2041); 
            TOKEN481_tree = (Object)adaptor.create(TOKEN481);
            adaptor.addChild(root_0, TOKEN481_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(456, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wp_poss");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wp_poss"

    public static class wpo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wpo"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:459:1: wpo : 'WPO' TOKEN ;
    public final ChemicalChunkerParser.wpo_return wpo() throws RecognitionException {
        ChemicalChunkerParser.wpo_return retval = new ChemicalChunkerParser.wpo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal482=null;
        Token TOKEN483=null;

        Object string_literal482_tree=null;
        Object TOKEN483_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wpo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(459, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:459:4: ( 'WPO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:459:5: 'WPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(459,5);
            string_literal482=(Token)match(input,175,FOLLOW_175_in_wpo2048); 
            string_literal482_tree = (Object)adaptor.create(string_literal482);
            adaptor.addChild(root_0, string_literal482_tree);

            dbg.location(459,11);
            TOKEN483=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wpo2050); 
            TOKEN483_tree = (Object)adaptor.create(TOKEN483);
            adaptor.addChild(root_0, TOKEN483_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(459, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wpo");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wpo"

    public static class wps_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wps"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:462:1: wps : 'WPS' TOKEN ;
    public final ChemicalChunkerParser.wps_return wps() throws RecognitionException {
        ChemicalChunkerParser.wps_return retval = new ChemicalChunkerParser.wps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal484=null;
        Token TOKEN485=null;

        Object string_literal484_tree=null;
        Object TOKEN485_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(462, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:462:4: ( 'WPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:462:5: 'WPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(462,5);
            string_literal484=(Token)match(input,176,FOLLOW_176_in_wps2057); 
            string_literal484_tree = (Object)adaptor.create(string_literal484);
            adaptor.addChild(root_0, string_literal484_tree);

            dbg.location(462,11);
            TOKEN485=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wps2059); 
            TOKEN485_tree = (Object)adaptor.create(TOKEN485);
            adaptor.addChild(root_0, TOKEN485_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(462, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wps");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wps"

    public static class wql_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wql"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:465:1: wql : 'WQL' TOKEN ;
    public final ChemicalChunkerParser.wql_return wql() throws RecognitionException {
        ChemicalChunkerParser.wql_return retval = new ChemicalChunkerParser.wql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal486=null;
        Token TOKEN487=null;

        Object string_literal486_tree=null;
        Object TOKEN487_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(465, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:465:4: ( 'WQL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:465:5: 'WQL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(465,5);
            string_literal486=(Token)match(input,177,FOLLOW_177_in_wql2066); 
            string_literal486_tree = (Object)adaptor.create(string_literal486);
            adaptor.addChild(root_0, string_literal486_tree);

            dbg.location(465,11);
            TOKEN487=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wql2068); 
            TOKEN487_tree = (Object)adaptor.create(TOKEN487);
            adaptor.addChild(root_0, TOKEN487_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(465, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wql");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wql"

    public static class wrb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wrb"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:468:1: wrb : 'WRB' TOKEN ;
    public final ChemicalChunkerParser.wrb_return wrb() throws RecognitionException {
        ChemicalChunkerParser.wrb_return retval = new ChemicalChunkerParser.wrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal488=null;
        Token TOKEN489=null;

        Object string_literal488_tree=null;
        Object TOKEN489_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(468, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:468:4: ( 'WRB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/extractPhrases/ChemicalChunker.g:468:5: 'WRB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(468,5);
            string_literal488=(Token)match(input,178,FOLLOW_178_in_wrb2075); 
            string_literal488_tree = (Object)adaptor.create(string_literal488);
            adaptor.addChild(root_0, string_literal488_tree);

            dbg.location(468,11);
            TOKEN489=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wrb2077); 
            TOKEN489_tree = (Object)adaptor.create(TOKEN489);
            adaptor.addChild(root_0, TOKEN489_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(468, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wrb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wrb"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA3_eotS =
        "\43\uffff";
    static final String DFA3_eofS =
        "\1\1\42\uffff";
    static final String DFA3_minS =
        "\1\11\42\uffff";
    static final String DFA3_maxS =
        "\1\u00b0\42\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\2\41\1";
    static final String DFA3_specialS =
        "\43\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\10\1\7\1\41\2\uffff\20\1\1\12\1\13\2\uffff\1\14\1\15\1\uffff"+
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
            "\1\11\4\1\1\uffff\1\42\10\1\1\32\1\1\1\33\4\1\1\uffff\1\1\1"+
            "\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1"+
            "\40\3\1\5\uffff\1\1\23\uffff\1\1\4\uffff\1\2\11\uffff\1\1\1"+
            "\3\1\4\1\5\1\6\27\uffff\3\1\5\uffff\1\1\3\uffff\1\34\1\35\1"+
            "\36\1\37",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()+ loopback of 28:15: ( nounphrase )+";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA8_eotS =
        "\35\uffff";
    static final String DFA8_eofS =
        "\1\1\34\uffff";
    static final String DFA8_minS =
        "\1\11\34\uffff";
    static final String DFA8_maxS =
        "\1\u00b0\34\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\33\1";
    static final String DFA8_specialS =
        "\35\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\1\1\33\2\uffff\20\1\1\4\1\5\2\uffff\1\6\1\7\1\uffff\1"+
            "\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1"+
            "\3\4\1\1\uffff\1\34\10\1\1\24\1\1\1\25\4\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\32\3"+
            "\1\1\uffff\1\1\3\uffff\1\1\22\uffff\2\1\4\uffff\1\1\11\uffff"+
            "\5\1\27\uffff\3\1\5\uffff\1\1\3\uffff\1\26\1\27\1\30\1\31",
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
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()+ loopback of 31:12: ( noun )+";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA15_eotS =
        "\u008c\uffff";
    static final String DFA15_eofS =
        "\1\1\u008b\uffff";
    static final String DFA15_minS =
        "\1\11\1\uffff\24\10\23\11\1\37\43\10\6\11\1\uffff\1\61\33\uffff"+
        "\2\10\1\11\1\166\1\10\1\40\4\10\4\136\1\10\1\166\1\10\1\40\4\10"+
        "\4\147\1\10\1\uffff";
    static final String DFA15_maxS =
        "\1\u00b0\1\uffff\24\10\23\u00b0\1\46\43\10\6\u00b0\1\uffff\1\146"+
        "\33\uffff\2\10\1\u00b0\1\166\1\10\1\143\4\10\4\136\1\10\1\166\1"+
        "\10\1\143\4\10\4\147\1\10\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\121\uffff\1\1\1\uffff\33\1\33\uffff\1\1";
    static final String DFA15_specialS =
        "\u008c\uffff}>";
    static final String[] DFA15_transitionS = {
            "\3\1\2\uffff\1\4\1\5\1\3\1\11\1\12\1\21\1\22\1\6\1\20\1\13\1"+
            "\15\1\7\1\10\1\17\1\16\1\14\2\1\2\uffff\2\1\1\uffff\21\1\1\uffff"+
            "\20\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\6\1\5\uffff\1\1\23\uffff\1\25\4\uffff\1\23\11\uffff"+
            "\1\2\1\24\3\1\27\uffff\3\1\5\uffff\1\1\3\uffff\4\1",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\4\uffff\1\52\12\uffff\1\53\1\54\1\55\1\56"+
            "\43\uffff\1\104\1\105\1\106\1\107",
            "\3\1\22\uffff\2\1\2\uffff\2\1\1\uffff\15\1\5\uffff\1\1\10\uffff"+
            "\1\1\1\uffff\1\1\26\uffff\1\1\34\uffff\1\25\17\uffff\1\24\3"+
            "\1\43\uffff\4\1",
            "\3\1\22\uffff\2\1\2\uffff\2\1\1\uffff\15\1\5\uffff\1\1\10\uffff"+
            "\1\1\1\uffff\1\1\26\uffff\1\1\34\uffff\1\25\17\uffff\4\1\43"+
            "\uffff\4\1",
            "\1\113\6\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\17\uffff\1\53\1\54\1\55\1\56\43\uffff\1\104"+
            "\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\34\uffff\1\25\17\uffff\1\160\1\54\1\55\1\56\43\uffff\1"+
            "\104\1\105\1\106\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\54\uffff\1\160\1\54\1\55\1\56\43\uffff\1\104\1\105\1\106"+
            "\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\54\uffff\1\160\1\54\1\55\1\56\43\uffff\1\104\1\105\1\106"+
            "\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\54\uffff\1\160\1\54\1\55\1\56\43\uffff\1\104\1\105\1\106"+
            "\1\107",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\54\uffff\1\160\1\54\1\55\1\56\43\uffff\1\104\1\105\1\106"+
            "\1\107",
            "",
            "\1\61\64\uffff\1\161",
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
            "",
            "\1\162",
            "\1\163",
            "\1\60\1\57\1\111\22\uffff\1\62\1\63\2\uffff\1\64\1\65\1\uffff"+
            "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\61\5\uffff\1\112\10\uffff\1\102\1\uffff\1\103\26\uffff\1"+
            "\110\54\uffff\1\160\1\54\1\55\1\56\43\uffff\1\104\1\105\1\106"+
            "\1\107",
            "\1\164",
            "\1\165",
            "\1\171\1\167\2\uffff\1\170\76\uffff\1\166",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\176",
            "\1\176",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0084\1\u0083\2\uffff\1\u0085\76\uffff\1\u0082",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008a",
            "\1\u008a",
            "\1\u008a",
            "\1\u008b",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 34:24: ( prepphrase )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA21_eotS =
        "\60\uffff";
    static final String DFA21_eofS =
        "\60\uffff";
    static final String DFA21_minS =
        "\1\16\24\10\21\11\2\166\1\37\2\10\3\uffff\2\11";
    static final String DFA21_maxS =
        "\1\u0086\24\10\21\u00b0\1\u0086\1\166\1\46\2\10\3\uffff\2\u00b0";
    static final String DFA21_acceptS =
        "\53\uffff\1\1\1\2\1\3\2\uffff";
    static final String DFA21_specialS =
        "\60\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\3\1\4\1\2\1\10\1\11\1\20\1\21\1\5\1\17\1\12\1\14\1\6\1\7"+
            "\1\16\1\15\1\13\130\uffff\1\24\4\uffff\1\22\11\uffff\1\1\1\23",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\1\24\17\uffff\1\23",
            "\1\24",
            "\1\55\6\uffff\1\54",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\17\uffff"+
            "\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\24\17\uffff"+
            "\4\53\43\uffff\4\53"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "51:1: prepphrase : ( prepphraseOther | prepphraseTemp | prepphraseTime );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_sentence_in_document135 = new BitSet(new long[]{0x0083FFECFFFFCE02L,0x0840000002000005L,0x0001E000000003E0L});
    public static final BitSet FOLLOW_prepphrase_in_sentence146 = new BitSet(new long[]{0xFFBFFFECFFFFCE00L,0x084000041FBAF57FL,0x0001E20E000003E0L});
    public static final BitSet FOLLOW_nounphrase_in_sentence149 = new BitSet(new long[]{0xFFBFFFECFFFFCE02L,0x084000041FBAF57FL,0x0001E20E000003E0L});
    public static final BitSet FOLLOW_verbphrase_in_sentence152 = new BitSet(new long[]{0xFF3C000000000002L,0x000000041DBAF57AL,0x0000020E00000000L});
    public static final BitSet FOLLOW_stop_in_sentence155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dt_in_nounphrase165 = new BitSet(new long[]{0x0083FFECFFFFCE00L,0x0860000042000005L,0x0001E000000003E0L});
    public static final BitSet FOLLOW_adj_in_nounphrase168 = new BitSet(new long[]{0x0083FFECFFFFCE00L,0x0860000042000005L,0x0001E000000003E0L});
    public static final BitSet FOLLOW_noun_in_nounphrase171 = new BitSet(new long[]{0x0083FFECFFFFCE02L,0x0860000042000005L,0x0001E000000003E0L});
    public static final BitSet FOLLOW_cc_in_nounphrase175 = new BitSet(new long[]{0x0000000000820002L,0x0020000040000000L});
    public static final BitSet FOLLOW_comma_in_nounphrase177 = new BitSet(new long[]{0x0083FFECFFFFCE00L,0x0860000042000005L,0x0001E000000003E0L});
    public static final BitSet FOLLOW_noun_in_nounphrase179 = new BitSet(new long[]{0x0000000000820002L,0x0020000040000000L});
    public static final BitSet FOLLOW_prepphraseOf_in_nounphrase183 = new BitSet(new long[]{0x0000000000820002L});
    public static final BitSet FOLLOW_prepphraseIN_in_nounphrase186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adv_in_verbphrase200 = new BitSet(new long[]{0xFF3C000000000000L,0x000000001DBAF57AL,0x0000020E00000000L});
    public static final BitSet FOLLOW_vbd_in_verbphrase203 = new BitSet(new long[]{0xFF3C000000000000L,0x000000001DBAF57AL,0x0000020E00000000L});
    public static final BitSet FOLLOW_verb_in_verbphrase206 = new BitSet(new long[]{0x000000003FFFC002L,0x0840000000000000L,0x0000000E00000060L});
    public static final BitSet FOLLOW_adv_in_verbphrase208 = new BitSet(new long[]{0x000000003FFFC002L,0x0840000000000000L,0x0000000E00000060L});
    public static final BitSet FOLLOW_prepphrase_in_verbphrase211 = new BitSet(new long[]{0x000000003FFFC002L,0x0840000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_vbuse_in_verb222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbchange_in_verb224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsubmerge_in_verb226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsubject_in_verb228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbadd_in_verb230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcharge_in_verb232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcontain_in_verb234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdrop_in_verb236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbfill_in_verb238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsuspend_in_verb240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbtreat_in_verb242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbapparatus_in_verb244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbconcentrate_in_verb246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcool_in_verb248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdegass_in_verb250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdissolve_in_verb252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdry_in_verb254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbextract_in_verb256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbfilter_in_verb258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbheat_in_verb262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbincrease_in_verb264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbpartition_in_verb266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbprecipitate_in_verb268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbpurify_in_verb270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbquench_in_verb272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbrecover_in_verb274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbremove_in_verb276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbstir_in_verb278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsynthesize_in_verb280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbwait_in_verb282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbwash_in_verb284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbyield_in_verb286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_number305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcd_in_number307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmolecule_in_noun316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecule_in_noun318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnstate_in_noun320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntime_in_noun322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnatmosphere_in_noun324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nneq_in_noun326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnchementity_in_noun328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntemp_in_noun330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnflash_in_noun332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nngeneral_in_noun334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnmethod_in_noun336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnamount_in_noun338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnpressure_in_noun340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nncolumn_in_noun342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnchromatography_in_noun344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnvacuum_in_noun346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nncycle_in_noun348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntimes_in_noun350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnapparatus_in_noun352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnconcentrate_in_noun355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wdt_in_noun357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wp_poss_in_noun359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wpo_in_noun361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wps_in_noun363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnsynthesize_in_noun365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscaront_in_noun367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnmixture_in_noun369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jj_in_adj378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjr_in_adj380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjs_in_adj382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjt_in_adj384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcj_in_adj386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rb_in_adv394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rbr_in_adv396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rbt_in_adv398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseOther_in_prepphrase408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTemp_in_prepphrase410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTime_in_prepphrase412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseOther422 = new BitSet(new long[]{0x0083FFECFFFFCE00L,0x0840000002000005L,0x0001E000000003E0L});
    public static final BitSet FOLLOW_nounphrase_in_prepphraseOther425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inof_in_prepphraseOf434 = new BitSet(new long[]{0x0083FFECFFFFCE00L,0x0840000002000005L,0x0001E000000003E0L});
    public static final BitSet FOLLOW_nounphrase_in_prepphraseOf437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inin_in_prepphraseIN448 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_molecule_in_prepphraseIN450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseTime460 = new BitSet(new long[]{0x000000003FFFC000L,0x0840000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_dt_in_prepphraseTime463 = new BitSet(new long[]{0x000000003FFFC000L,0x0840000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_jj_in_prepphraseTime466 = new BitSet(new long[]{0x000000003FFFC000L,0x0840000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_cd_in_prepphraseTime469 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_nntime_in_prepphraseTime471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseTemp479 = new BitSet(new long[]{0x000000003FFFC000L,0x0840000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_dt_in_prepphraseTemp482 = new BitSet(new long[]{0x000000003FFFC000L,0x0840000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_jj_in_prepphraseTemp485 = new BitSet(new long[]{0x000000003FFFC000L,0x0840000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_cd_in_prepphraseTemp488 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_nntemp_in_prepphraseTemp490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_in_inAll501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inafter_in_inAll503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inas_in_inAll505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inbefore_in_inAll507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inby_in_inAll509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infor_in_inAll511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infrom_in_inAll513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inin_in_inAll515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ininto_in_inAll517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inof_in_inAll519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inoff_in_inAll521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inon_in_inAll523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inover_in_inAll525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inunder_in_inAll527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invia_in_inAll529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inwith_in_inAll531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inwithout_in_inAll533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_mmol547 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_nnmol_in_mmol549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_gram556 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_nngram_in_gram558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_percent565 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_nnpercent_in_percent567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_volume574 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_nnvol_in_volume576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mmol_in_measurements584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gram_in_measurements586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percent_in_measurements588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_measurements590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcm_in_molecule614 = new BitSet(new long[]{0x0002000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_amount_in_molecule617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcd_in_unnamedmolecule627 = new BitSet(new long[]{0x0000000000000202L,0x0000004000000000L});
    public static final BitSet FOLLOW_amount_in_unnamedmolecule630 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_lrb_in_amount643 = new BitSet(new long[]{0x000000003FFFC000L,0x0840000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_measurements_in_amount645 = new BitSet(new long[]{0x0000000000000000L,0x0020000040000000L});
    public static final BitSet FOLLOW_comma_in_amount647 = new BitSet(new long[]{0x000000003FFFC000L,0x0840000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_measurements_in_amount650 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_rrb_in_amount653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nngeneral_in_method665 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_nn_in_method667 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_nnmethod_in_method671 = new BitSet(new long[]{0x000000003FFFC202L,0x0840000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_oscarcd_in_method674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_method676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_oscarcd686 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcd688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_oscarcj693 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcj695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_oscaront701 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscaront703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_tmunicode708 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_tmunicode710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_cdunicode715 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cdunicode717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_inas724 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inas726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_inbefore731 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inbefore733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_inafter738 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inafter740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_inin745 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inin747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ininto752 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ininto754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_inwith759 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inwith761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_inwithout766 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inwithout768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_inby773 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inby775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_invia780 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_invia782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_inof787 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inof789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_inon794 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inon796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_infor801 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_infor803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_infrom808 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_infrom810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_inunder815 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inunder817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_inover822 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inover824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_inoff829 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inoff831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_nnstate838 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnstate840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_nntime845 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntime847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_nngram852 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nngram854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_nnmol859 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmol861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_nnatmosphere866 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnatmosphere868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_nneq873 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nneq875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_nnvol880 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnvol882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nnchementity887 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnchementity889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_nntemp894 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntemp896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nnflash901 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnflash903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_nngeneral908 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nngeneral910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_nnmethod915 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmethod917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_nnamount922 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnamount924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_nnpressure929 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpressure931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_nncolumn936 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nncolumn938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_nnchromatography943 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnchromatography945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_nnvacuum950 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnvacuum952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_nncycle957 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nncycle959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_nntimes964 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntimes966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_oscarcm973 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcm975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_vbuse982 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbuse984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_vbchange989 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbchange991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_vbsubmerge996 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubmerge998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_vbsubject1003 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubject1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_nnadd1012 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnadd1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_nnmixture1019 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmixture1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_vbadd1026 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbadd1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_vbcharge1033 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcharge1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_vbcontain1040 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcontain1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_vbdrop1047 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdrop1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_vbfill1054 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbfill1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_vbsuspend1061 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsuspend1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_vbtreat1068 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbtreat1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_vbapparatus1077 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbapparatus1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_nnapparatus1084 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnapparatus1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_vbconcentrate1093 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbconcentrate1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_nnconcentrate1100 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnconcentrate1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_vbcool1109 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcool1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_vbdegass1118 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdegass1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_vbdissolve1127 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdissolve1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_vbdry1136 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdry1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_nndry1143 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nndry1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_vbextract1152 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbextract1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_nnextract1159 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnextract1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_vbfilter1168 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbfilter1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_nnfilter1175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnfilter1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_vbheat1184 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbheat1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_vbincrease1191 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbincrease1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_vbpartition1200 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbpartition1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_vbprecipitate1209 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbprecipitate1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_nnprecipitate1216 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnprecipitate1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_vbpurify1225 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbpurify1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_nnpurify1232 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpurify1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_vbquench1241 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbquench1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_vbrecover1250 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbrecover1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_vbremove1259 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbremove1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_nnremove1266 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnremove1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_vbstir1275 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbstir1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_vbsynthesize1284 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsynthesize1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_nnsynthesize1291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnsynthesize1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_vbwait1300 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbwait1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_vbwash1309 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbwash1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_vbyield1318 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbyield1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_colon1327 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_colon1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_comma1334 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_comma1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_apost1341 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_apost1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_neg1348 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_neg1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_dash1355 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dash1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_stop1362 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_stop1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_nnpercent1369 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpercent1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_lsqb1376 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_lsqb1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rsqb1383 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rsqb1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_lrb1390 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_lrb1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rrb1397 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rrb1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_abl1408 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_abl1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_abn1417 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_abn1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_abx1426 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_abx1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ap1435 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ap1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_at1444 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_at1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_be1453 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_be1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_bed1462 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_bed1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_bedz1471 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_bedz1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_beg1480 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_beg1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_bem1489 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_bem1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ben1498 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ben1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ber1507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ber1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_bez1516 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_bez1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_cc1525 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cc1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_cd1534 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cd1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_cs1543 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cs1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_dotok1553 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dotok1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_dod1562 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dod1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_doz1571 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_doz1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_dt1580 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dt1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_dti1589 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dti1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_dts1598 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dts1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_dtx1607 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dtx1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ex1616 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ex1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_fw1625 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_fw1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_hv1634 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_hv1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_hvd1643 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_hvd1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_hvg1652 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_hvg1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_hvn1661 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_hvn1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_in1670 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_in1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_jj1679 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jj1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_jjr1688 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jjr1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_jjs1697 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jjs1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_jjt1706 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jjt1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_md1715 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_md1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_nc1724 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nc1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_nn1733 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nn1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_nn_poss1742 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nn_poss1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_nns1751 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nns1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_nns_poss1760 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nns_poss1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_np1769 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_np1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_np_poss1778 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_np_poss1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_nps1787 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nps1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_nps_poss1796 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nps_poss1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_nr1805 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nr1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_od1814 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_od1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_pn1823 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_pn1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_pn_poss1832 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_pn_poss1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_pp_poss1841 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_pp_poss1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_pp_poss_poss1850 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_pp_poss_poss1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ppl1859 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppl1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ppls1868 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppls1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ppo1877 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppo1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_pps1886 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_pps1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_ppss1895 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppss1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ql1904 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ql1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_qlp1913 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_qlp1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_rb1922 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rb1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_rbr1931 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rbr1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_rbt1940 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rbt1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_rn1949 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rn1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_rp1958 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rp1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_to1967 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_to1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_uh1976 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_uh1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_vb1985 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vb1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_vbd1994 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbd1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_vbg2003 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbg2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_vbn2012 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbn2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_vbz2021 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbz2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_wdt2030 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wdt2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_wp_poss2039 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wp_poss2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_wpo2048 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wpo2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_wps2057 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wps2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_wql2066 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wql2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_wrb2075 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wrb2077 = new BitSet(new long[]{0x0000000000000002L});

}