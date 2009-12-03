// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g 2009-12-03 18:40:28

    package uk.ac.cam.ch.wwmm.chemicaltagger;
 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class ChemicalChunkerParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NODE", "WS", "NEWLINE", "ACHAR", "DIGIT", "TOKEN", "'OSCAR-CD'", "'OSCAR-CJ'", "'OSCAR-ONT'", "'TM-UNICODE'", "'CD-UNICODE'", "'IN-AS'", "'IN-BEFORE'", "'IN-AFTER'", "'IN-IN'", "'IN-INTO'", "'IN-WITH'", "'IN-WITHOUT'", "'IN-BY'", "'IN-VIA'", "'IN-OF'", "'IN-ON'", "'IN-FOR'", "'IN-FROM'", "'IN-UNDER'", "'IN-OVER'", "'IN-OFF'", "'NN-STATE'", "'NN-TIME'", "'NN-GRAM'", "'NN-MOL'", "'NN-ATMOSPHERE'", "'NN-EQ'", "'NN-VOL'", "'NN-CHEMENTITY'", "'NN-TEMP'", "'NN-FLASH'", "'NN-GENERAL'", "'NN-METHOD'", "'NN-AMOUNT'", "'NN-PRESSURE'", "'NN-COLUMN'", "'NN-CHROMATOGRAPHY'", "'NN-VACUUM'", "'NN-CYCLE'", "'NN-TIMES'", "'OSCAR-CM'", "'VB-USE'", "'VB-CHANGE'", "'VB-SUBMERGE'", "'VB-SUBJECT'", "'NN-ADD'", "'NN-MIXTURE'", "'VB-ADD'", "'VB-CHARGE'", "'VB-CONTAIN'", "'VB-DROP'", "'VB-FILL'", "'VB-SUSPEND'", "'VB-TREAT'", "'VB-APPARATUS'", "'NN-APPARATUS'", "'VB-CONCENTRATE'", "'NN-CONCENTRATE'", "'VB-COOL'", "'VB-DEGASS'", "'VB-DISSOLVE'", "'VB-DRY'", "'NN-DRY'", "'VB-EXTRACT'", "'NN-EXTRACT'", "'VB-FILTER'", "'NN-FILTER'", "'VB-HEAT'", "'VB-INCREASE'", "'VB-PARTITION'", "'VB-PRECIPITATE'", "'NN-PRECIPITATE'", "'VB-PURIFY'", "'NN-PURIFY'", "'VB-QUENCH'", "'VB-RECOVER'", "'VB-REMOVE'", "'NN-REMOVE'", "'VB-STIR'", "'VB-SYNTHESIZE'", "'NN-SYNTHESIZE'", "'VB-WAIT'", "'VB-WASH'", "'VB-YIELD'", "'COLON'", "'COMMA'", "'APOST'", "'NEG'", "'DASH'", "'STOP'", "'NN-PERCENT'", "'LSQB'", "'RSQB'", "'-LRB-'", "'-RRB-'", "'ABL'", "'ABN'", "'ABX'", "'AP'", "'AT'", "'BE'", "'BED'", "'BEDZ'", "'BEG'", "'BEM'", "'BEN'", "'BER'", "'BEZ'", "'CC'", "'CD'", "'CS'", "'DO'", "'DOD'", "'DOZ'", "'DT'", "'DTI'", "'DTS'", "'DTX'", "'EX'", "'FW'", "'HV'", "'HVD'", "'HVG'", "'HVN'", "'IN'", "'JJ'", "'JJR'", "'JJS'", "'JJT'", "'MD'", "'NC'", "'NN'", "'NN$'", "'NNS'", "'NNS$'", "'NP'", "'NP$'", "'NPS'", "'NPS$'", "'NR'", "'OD'", "'PN'", "'PN$'", "'PP$'", "'PP$$'", "'PPL'", "'PPLS'", "'PPO'", "'PPS'", "'PPSS'", "'QL'", "'QLP'", "'RB'", "'RBR'", "'RBT'", "'RN'", "'RP'", "'TO'", "'UH'", "'VB'", "'VBD'", "'VBG'", "'VBN'", "'VBZ'", "'WDT'", "'WP$'", "'WPO'", "'WPS'", "'WQL'", "'WRB'"
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
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int TOKEN=9;
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
    public static final int T__179=179;
    public static final int T__33=33;
    public static final int ACHAR=7;
    public static final int T__178=178;
    public static final int T__34=34;
    public static final int NEWLINE=6;
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
        "invalidRule", "vbdrop", "lsqb", "rn", "cdunicode", "nnflash", "stop", 
        "nnamount", "nnprecipitate", "vbsubject", "nnfilter", "at", "nnadd", 
        "nntimes", "dash", "dotok", "vbg", "nngram", "jj", "nntime", "pn", 
        "nnpercent", "wp_poss", "vbheat", "wrb", "bem", "wdt", "wpo", "inwith", 
        "jjs", "nnconcentrate", "nnchromatography", "vbdissolve", "ql", 
        "oscarcj", "vbadd", "neg", "ap", "inin", "hv", "prepphraseTime", 
        "hvd", "rsqb", "nnextract", "ppl", "nps_poss", "ber", "vbconcentrate", 
        "vbpartition", "vbprecipitate", "nncolumn", "vbrecover", "document", 
        "jjt", "wql", "abn", "in", "bed", "pp_poss", "dt", "nnatmosphere", 
        "vbwash", "adj", "ppss", "rp", "vbsuspend", "vbdry", "vbuse", "nounphrase", 
        "nr", "rbt", "inas", "hvg", "nndry", "md", "beg", "molecule", "nnpurify", 
        "infrom", "percent", "nngeneral", "cd", "amount", "prepphraseOther", 
        "cc", "vbdegass", "inafter", "inby", "unnamedmolecule", "abl", "vbcontain", 
        "nn_poss", "nnmixture", "qlp", "inoff", "nnapparatus", "nc", "doz", 
        "inunder", "volume", "nnmethod", "jjr", "inbefore", "pp_poss_poss", 
        "vbsubmerge", "infor", "comma", "nnmol", "vbd", "wps", "oscaront", 
        "dti", "vbincrease", "vbcharge", "inover", "np", "nnsynthesize", 
        "vbfill", "vbremove", "mmol", "bedz", "dod", "inwithout", "nnpressure", 
        "inAll", "measurements", "dts", "rrb", "dtx", "prepphrase", "vbsynthesize", 
        "vbquench", "nnvacuum", "nns_poss", "nps", "ppls", "vbfilter", "vbchange", 
        "colon", "hvn", "vbwait", "cs", "nneq", "nnvol", "nncycle", "oscarcd", 
        "ben", "tmunicode", "nns", "vbpurify", "gram", "noun", "pps", "vbextract", 
        "vb", "number", "vbapparatus", "prepphraseIN", "sentence", "pn_poss", 
        "to", "inof", "vbstir", "lrb", "adv", "nnremove", "fw", "nntemp", 
        "verb", "od", "vbz", "nn", "vbyield", "prepphraseTemp", "be", "np_poss", 
        "prepphraseOf", "apost", "rbr", "bez", "inon", "ppo", "nnstate", 
        "oscarcm", "nnchementity", "vbn", "ex", "vbcool", "vbtreat", "verbphrase", 
        "uh", "method", "ininto", "invia", "abx", "rb"
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
    public String getGrammarFileName() { return "/home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g"; }


    public static class document_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "document"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:28:1: document : ( sentence )+ -> ( ^( NODE[\"Sentence\"] sentence ) )+ ;
    public final ChemicalChunkerParser.document_return document() throws RecognitionException {
        ChemicalChunkerParser.document_return retval = new ChemicalChunkerParser.document_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.sentence_return sentence1 = null;


        RewriteRuleSubtreeStream stream_sentence=new RewriteRuleSubtreeStream(adaptor,"rule sentence");
        try { dbg.enterRule(getGrammarFileName(), "document");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:28:9: ( ( sentence )+ -> ( ^( NODE[\"Sentence\"] sentence ) )+ )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:28:11: ( sentence )+
            {
            dbg.location(28,11);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:28:11: ( sentence )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=10 && LA1_0<=12)||(LA1_0>=15 && LA1_0<=32)||(LA1_0>=35 && LA1_0<=36)||(LA1_0>=38 && LA1_0<=50)||LA1_0==56||LA1_0==65||LA1_0==67||LA1_0==90||LA1_0==119||LA1_0==124||(LA1_0>=134 && LA1_0<=138)||(LA1_0>=174 && LA1_0<=177)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:28:11: sentence
            	    {
            	    dbg.location(28,11);
            	    pushFollow(FOLLOW_sentence_in_document149);
            	    sentence1=sentence();

            	    state._fsp--;

            	    stream_sentence.add(sentence1.getTree());

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



            // AST REWRITE
            // elements: sentence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 28:21: -> ( ^( NODE[\"Sentence\"] sentence ) )+
            {
                dbg.location(28,24);
                if ( !(stream_sentence.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_sentence.hasNext() ) {
                    dbg.location(28,24);
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:28:24: ^( NODE[\"Sentence\"] sentence )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(28,26);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "Sentence"), root_1);

                    dbg.location(28,44);
                    adaptor.addChild(root_1, stream_sentence.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_sentence.reset();

            }

            retval.tree = root_0;
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
        dbg.location(28, 55);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:31:1: sentence : ( prepphrase )? ( nounphrase )+ ( verbphrase )* ( stop )? -> ( ^( NODE[\"PrepPhrase\"] prepphrase ) )? ( ^( NODE[\"NounPhrase\"] nounphrase ) )+ ( ^( NODE[\"VerbPhrase\"] verbphrase ) )* ;
    public final ChemicalChunkerParser.sentence_return sentence() throws RecognitionException {
        ChemicalChunkerParser.sentence_return retval = new ChemicalChunkerParser.sentence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.prepphrase_return prepphrase2 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase3 = null;

        ChemicalChunkerParser.verbphrase_return verbphrase4 = null;

        ChemicalChunkerParser.stop_return stop5 = null;


        RewriteRuleSubtreeStream stream_verbphrase=new RewriteRuleSubtreeStream(adaptor,"rule verbphrase");
        RewriteRuleSubtreeStream stream_stop=new RewriteRuleSubtreeStream(adaptor,"rule stop");
        RewriteRuleSubtreeStream stream_nounphrase=new RewriteRuleSubtreeStream(adaptor,"rule nounphrase");
        RewriteRuleSubtreeStream stream_prepphrase=new RewriteRuleSubtreeStream(adaptor,"rule prepphrase");
        try { dbg.enterRule(getGrammarFileName(), "sentence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:2: ( ( prepphrase )? ( nounphrase )+ ( verbphrase )* ( stop )? -> ( ^( NODE[\"PrepPhrase\"] prepphrase ) )? ( ^( NODE[\"NounPhrase\"] nounphrase ) )+ ( ^( NODE[\"VerbPhrase\"] verbphrase ) )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:3: ( prepphrase )? ( nounphrase )+ ( verbphrase )* ( stop )?
            {
            dbg.location(32,3);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:3: ( prepphrase )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            switch ( input.LA(1) ) {
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
                case 30:
                case 119:
                case 134:
                    {
                    alt2=1;
                    }
                    break;
                case 124:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==TOKEN) ) {
                        int LA2_5 = input.LA(3);

                        if ( (LA2_5==135) ) {
                            int LA2_3 = input.LA(4);

                            if ( (LA2_3==TOKEN) ) {
                                int LA2_6 = input.LA(5);

                                if ( (LA2_6==119) ) {
                                    alt2=1;
                                }
                            }
                        }
                        else if ( (LA2_5==119) ) {
                            alt2=1;
                        }
                    }
                    }
                    break;
                case 135:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==TOKEN) ) {
                        int LA2_6 = input.LA(3);

                        if ( (LA2_6==119) ) {
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:3: prepphrase
                    {
                    dbg.location(32,3);
                    pushFollow(FOLLOW_prepphrase_in_sentence172);
                    prepphrase2=prepphrase();

                    state._fsp--;

                    stream_prepphrase.add(prepphrase2.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(32,15);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:15: ( nounphrase )+
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

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:15: nounphrase
            	    {
            	    dbg.location(32,15);
            	    pushFollow(FOLLOW_nounphrase_in_sentence175);
            	    nounphrase3=nounphrase();

            	    state._fsp--;

            	    stream_nounphrase.add(nounphrase3.getTree());

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

            dbg.location(32,27);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:27: ( verbphrase )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=51 && LA4_0<=54)||(LA4_0>=57 && LA4_0<=64)||LA4_0==66||(LA4_0>=68 && LA4_0<=71)||LA4_0==73||LA4_0==75||(LA4_0>=77 && LA4_0<=80)||LA4_0==82||(LA4_0>=84 && LA4_0<=86)||(LA4_0>=88 && LA4_0<=89)||(LA4_0>=91 && LA4_0<=93)||(LA4_0>=162 && LA4_0<=164)||LA4_0==170) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:27: verbphrase
            	    {
            	    dbg.location(32,27);
            	    pushFollow(FOLLOW_verbphrase_in_sentence178);
            	    verbphrase4=verbphrase();

            	    state._fsp--;

            	    stream_verbphrase.add(verbphrase4.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(32,39);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:39: ( stop )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==99) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:39: stop
                    {
                    dbg.location(32,39);
                    pushFollow(FOLLOW_stop_in_sentence181);
                    stop5=stop();

                    state._fsp--;

                    stream_stop.add(stop5.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}



            // AST REWRITE
            // elements: nounphrase, prepphrase, verbphrase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:45: -> ( ^( NODE[\"PrepPhrase\"] prepphrase ) )? ( ^( NODE[\"NounPhrase\"] nounphrase ) )+ ( ^( NODE[\"VerbPhrase\"] verbphrase ) )*
            {
                dbg.location(32,48);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:48: ( ^( NODE[\"PrepPhrase\"] prepphrase ) )?
                if ( stream_prepphrase.hasNext() ) {
                    dbg.location(32,48);
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:48: ^( NODE[\"PrepPhrase\"] prepphrase )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(32,50);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PrepPhrase"), root_1);

                    dbg.location(32,70);
                    adaptor.addChild(root_1, stream_prepphrase.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_prepphrase.reset();
                dbg.location(32,84);
                if ( !(stream_nounphrase.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_nounphrase.hasNext() ) {
                    dbg.location(32,84);
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:84: ^( NODE[\"NounPhrase\"] nounphrase )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(32,86);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "NounPhrase"), root_1);

                    dbg.location(32,106);
                    adaptor.addChild(root_1, stream_nounphrase.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_nounphrase.reset();
                dbg.location(32,120);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:120: ( ^( NODE[\"VerbPhrase\"] verbphrase ) )*
                while ( stream_verbphrase.hasNext() ) {
                    dbg.location(32,120);
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:120: ^( NODE[\"VerbPhrase\"] verbphrase )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(32,122);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "VerbPhrase"), root_1);

                    dbg.location(32,142);
                    adaptor.addChild(root_1, stream_verbphrase.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_verbphrase.reset();

            }

            retval.tree = root_0;
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
        dbg.location(32, 154);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:34:1: nounphrase : ( dt )? ( adj )* ( noun )+ ( comma noun )* ( cc noun )* ( prepphraseOf )* ( prepphraseIN )? ;
    public final ChemicalChunkerParser.nounphrase_return nounphrase() throws RecognitionException {
        ChemicalChunkerParser.nounphrase_return retval = new ChemicalChunkerParser.nounphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.dt_return dt6 = null;

        ChemicalChunkerParser.adj_return adj7 = null;

        ChemicalChunkerParser.noun_return noun8 = null;

        ChemicalChunkerParser.comma_return comma9 = null;

        ChemicalChunkerParser.noun_return noun10 = null;

        ChemicalChunkerParser.cc_return cc11 = null;

        ChemicalChunkerParser.noun_return noun12 = null;

        ChemicalChunkerParser.prepphraseOf_return prepphraseOf13 = null;

        ChemicalChunkerParser.prepphraseIN_return prepphraseIN14 = null;



        try { dbg.enterRule(getGrammarFileName(), "nounphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:2: ( ( dt )? ( adj )* ( noun )+ ( comma noun )* ( cc noun )* ( prepphraseOf )* ( prepphraseIN )? )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:3: ( dt )? ( adj )* ( noun )+ ( comma noun )* ( cc noun )* ( prepphraseOf )* ( prepphraseIN )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(35,3);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:3: ( dt )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==124) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:3: dt
                    {
                    dbg.location(35,3);
                    pushFollow(FOLLOW_dt_in_nounphrase222);
                    dt6=dt();

                    state._fsp--;

                    adaptor.addChild(root_0, dt6.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(35,7);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:7: ( adj )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==11||(LA7_0>=135 && LA7_0<=138)) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:7: adj
            	    {
            	    dbg.location(35,7);
            	    pushFollow(FOLLOW_adj_in_nounphrase225);
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

            dbg.location(35,12);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:12: ( noun )+
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

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:12: noun
            	    {
            	    dbg.location(35,12);
            	    pushFollow(FOLLOW_noun_in_nounphrase228);
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

            dbg.location(35,18);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:18: ( comma noun )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==95) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:19: comma noun
            	    {
            	    dbg.location(35,19);
            	    pushFollow(FOLLOW_comma_in_nounphrase232);
            	    comma9=comma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comma9.getTree());
            	    dbg.location(35,25);
            	    pushFollow(FOLLOW_noun_in_nounphrase234);
            	    noun10=noun();

            	    state._fsp--;

            	    adaptor.addChild(root_0, noun10.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}

            dbg.location(35,32);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:32: ( cc noun )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==118) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:33: cc noun
            	    {
            	    dbg.location(35,33);
            	    pushFollow(FOLLOW_cc_in_nounphrase239);
            	    cc11=cc();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cc11.getTree());
            	    dbg.location(35,36);
            	    pushFollow(FOLLOW_noun_in_nounphrase241);
            	    noun12=noun();

            	    state._fsp--;

            	    adaptor.addChild(root_0, noun12.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}

            dbg.location(35,43);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:43: ( prepphraseOf )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:43: prepphraseOf
            	    {
            	    dbg.location(35,43);
            	    pushFollow(FOLLOW_prepphraseOf_in_nounphrase245);
            	    prepphraseOf13=prepphraseOf();

            	    state._fsp--;

            	    adaptor.addChild(root_0, prepphraseOf13.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}

            dbg.location(35,57);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:57: ( prepphraseIN )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:35:57: prepphraseIN
                    {
                    dbg.location(35,57);
                    pushFollow(FOLLOW_prepphraseIN_in_nounphrase248);
                    prepphraseIN14=prepphraseIN();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseIN14.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}


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
        dbg.location(35, 70);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:1: verbphrase : ( adv )* ( vbd )* verb ( adv )* ( prepphrase )* ;
    public final ChemicalChunkerParser.verbphrase_return verbphrase() throws RecognitionException {
        ChemicalChunkerParser.verbphrase_return retval = new ChemicalChunkerParser.verbphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.adv_return adv15 = null;

        ChemicalChunkerParser.vbd_return vbd16 = null;

        ChemicalChunkerParser.verb_return verb17 = null;

        ChemicalChunkerParser.adv_return adv18 = null;

        ChemicalChunkerParser.prepphrase_return prepphrase19 = null;



        try { dbg.enterRule(getGrammarFileName(), "verbphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:2: ( ( adv )* ( vbd )* verb ( adv )* ( prepphrase )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:4: ( adv )* ( vbd )* verb ( adv )* ( prepphrase )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(38,4);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:4: ( adv )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=162 && LA13_0<=164)) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:4: adv
            	    {
            	    dbg.location(38,4);
            	    pushFollow(FOLLOW_adv_in_verbphrase262);
            	    adv15=adv();

            	    state._fsp--;

            	    adaptor.addChild(root_0, adv15.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(38,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:9: ( vbd )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==170) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:9: vbd
            	    {
            	    dbg.location(38,9);
            	    pushFollow(FOLLOW_vbd_in_verbphrase265);
            	    vbd16=vbd();

            	    state._fsp--;

            	    adaptor.addChild(root_0, vbd16.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}

            dbg.location(38,14);
            pushFollow(FOLLOW_verb_in_verbphrase268);
            verb17=verb();

            state._fsp--;

            adaptor.addChild(root_0, verb17.getTree());
            dbg.location(38,19);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:19: ( adv )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                switch ( input.LA(1) ) {
                case 162:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==TOKEN) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 163:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==TOKEN) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 164:
                    {
                    int LA15_4 = input.LA(2);

                    if ( (LA15_4==TOKEN) ) {
                        alt15=1;
                    }


                    }
                    break;

                }

                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:19: adv
            	    {
            	    dbg.location(38,19);
            	    pushFollow(FOLLOW_adv_in_verbphrase270);
            	    adv18=adv();

            	    state._fsp--;

            	    adaptor.addChild(root_0, adv18.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}

            dbg.location(38,24);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:24: ( prepphrase )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16);

                try {
                    isCyclicDecision = true;
                    alt16 = dfa16.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:38:24: prepphrase
            	    {
            	    dbg.location(38,24);
            	    pushFollow(FOLLOW_prepphrase_in_verbphrase273);
            	    prepphrase19=prepphrase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, prepphrase19.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


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
        dbg.location(38, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:1: verb : ( vbuse | vbchange | vbsubmerge | vbsubject | vbadd | vbcharge | vbcontain | vbdrop | vbfill | vbsuspend | vbtreat | vbapparatus | vbconcentrate | vbcool | vbdegass | vbdissolve | vbdry | vbextract | vbfilter | vbheat | vbincrease | vbpartition | vbprecipitate | vbpurify | vbquench | vbrecover | vbremove | vbstir | vbsynthesize | vbwait | vbwash | vbyield );
    public final ChemicalChunkerParser.verb_return verb() throws RecognitionException {
        ChemicalChunkerParser.verb_return retval = new ChemicalChunkerParser.verb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.vbuse_return vbuse20 = null;

        ChemicalChunkerParser.vbchange_return vbchange21 = null;

        ChemicalChunkerParser.vbsubmerge_return vbsubmerge22 = null;

        ChemicalChunkerParser.vbsubject_return vbsubject23 = null;

        ChemicalChunkerParser.vbadd_return vbadd24 = null;

        ChemicalChunkerParser.vbcharge_return vbcharge25 = null;

        ChemicalChunkerParser.vbcontain_return vbcontain26 = null;

        ChemicalChunkerParser.vbdrop_return vbdrop27 = null;

        ChemicalChunkerParser.vbfill_return vbfill28 = null;

        ChemicalChunkerParser.vbsuspend_return vbsuspend29 = null;

        ChemicalChunkerParser.vbtreat_return vbtreat30 = null;

        ChemicalChunkerParser.vbapparatus_return vbapparatus31 = null;

        ChemicalChunkerParser.vbconcentrate_return vbconcentrate32 = null;

        ChemicalChunkerParser.vbcool_return vbcool33 = null;

        ChemicalChunkerParser.vbdegass_return vbdegass34 = null;

        ChemicalChunkerParser.vbdissolve_return vbdissolve35 = null;

        ChemicalChunkerParser.vbdry_return vbdry36 = null;

        ChemicalChunkerParser.vbextract_return vbextract37 = null;

        ChemicalChunkerParser.vbfilter_return vbfilter38 = null;

        ChemicalChunkerParser.vbheat_return vbheat39 = null;

        ChemicalChunkerParser.vbincrease_return vbincrease40 = null;

        ChemicalChunkerParser.vbpartition_return vbpartition41 = null;

        ChemicalChunkerParser.vbprecipitate_return vbprecipitate42 = null;

        ChemicalChunkerParser.vbpurify_return vbpurify43 = null;

        ChemicalChunkerParser.vbquench_return vbquench44 = null;

        ChemicalChunkerParser.vbrecover_return vbrecover45 = null;

        ChemicalChunkerParser.vbremove_return vbremove46 = null;

        ChemicalChunkerParser.vbstir_return vbstir47 = null;

        ChemicalChunkerParser.vbsynthesize_return vbsynthesize48 = null;

        ChemicalChunkerParser.vbwait_return vbwait49 = null;

        ChemicalChunkerParser.vbwash_return vbwash50 = null;

        ChemicalChunkerParser.vbyield_return vbyield51 = null;



        try { dbg.enterRule(getGrammarFileName(), "verb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:41:2: ( vbuse | vbchange | vbsubmerge | vbsubject | vbadd | vbcharge | vbcontain | vbdrop | vbfill | vbsuspend | vbtreat | vbapparatus | vbconcentrate | vbcool | vbdegass | vbdissolve | vbdry | vbextract | vbfilter | vbheat | vbincrease | vbpartition | vbprecipitate | vbpurify | vbquench | vbrecover | vbremove | vbstir | vbsynthesize | vbwait | vbwash | vbyield )
            int alt17=32;
            try { dbg.enterDecision(17);

            switch ( input.LA(1) ) {
            case 51:
                {
                alt17=1;
                }
                break;
            case 52:
                {
                alt17=2;
                }
                break;
            case 53:
                {
                alt17=3;
                }
                break;
            case 54:
                {
                alt17=4;
                }
                break;
            case 57:
                {
                alt17=5;
                }
                break;
            case 58:
                {
                alt17=6;
                }
                break;
            case 59:
                {
                alt17=7;
                }
                break;
            case 60:
                {
                alt17=8;
                }
                break;
            case 61:
                {
                alt17=9;
                }
                break;
            case 62:
                {
                alt17=10;
                }
                break;
            case 63:
                {
                alt17=11;
                }
                break;
            case 64:
                {
                alt17=12;
                }
                break;
            case 66:
                {
                alt17=13;
                }
                break;
            case 68:
                {
                alt17=14;
                }
                break;
            case 69:
                {
                alt17=15;
                }
                break;
            case 70:
                {
                alt17=16;
                }
                break;
            case 71:
                {
                alt17=17;
                }
                break;
            case 73:
                {
                alt17=18;
                }
                break;
            case 75:
                {
                alt17=19;
                }
                break;
            case 77:
                {
                alt17=20;
                }
                break;
            case 78:
                {
                alt17=21;
                }
                break;
            case 79:
                {
                alt17=22;
                }
                break;
            case 80:
                {
                alt17=23;
                }
                break;
            case 82:
                {
                alt17=24;
                }
                break;
            case 84:
                {
                alt17=25;
                }
                break;
            case 85:
                {
                alt17=26;
                }
                break;
            case 86:
                {
                alt17=27;
                }
                break;
            case 88:
                {
                alt17=28;
                }
                break;
            case 89:
                {
                alt17=29;
                }
                break;
            case 91:
                {
                alt17=30;
                }
                break;
            case 92:
                {
                alt17=31;
                }
                break;
            case 93:
                {
                alt17=32;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:2: vbuse
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,2);
                    pushFollow(FOLLOW_vbuse_in_verb284);
                    vbuse20=vbuse();

                    state._fsp--;

                    adaptor.addChild(root_0, vbuse20.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:8: vbchange
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,8);
                    pushFollow(FOLLOW_vbchange_in_verb286);
                    vbchange21=vbchange();

                    state._fsp--;

                    adaptor.addChild(root_0, vbchange21.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:17: vbsubmerge
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,17);
                    pushFollow(FOLLOW_vbsubmerge_in_verb288);
                    vbsubmerge22=vbsubmerge();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsubmerge22.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:28: vbsubject
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,28);
                    pushFollow(FOLLOW_vbsubject_in_verb290);
                    vbsubject23=vbsubject();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsubject23.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:38: vbadd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,38);
                    pushFollow(FOLLOW_vbadd_in_verb292);
                    vbadd24=vbadd();

                    state._fsp--;

                    adaptor.addChild(root_0, vbadd24.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:44: vbcharge
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,44);
                    pushFollow(FOLLOW_vbcharge_in_verb294);
                    vbcharge25=vbcharge();

                    state._fsp--;

                    adaptor.addChild(root_0, vbcharge25.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:53: vbcontain
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,53);
                    pushFollow(FOLLOW_vbcontain_in_verb296);
                    vbcontain26=vbcontain();

                    state._fsp--;

                    adaptor.addChild(root_0, vbcontain26.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:63: vbdrop
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,63);
                    pushFollow(FOLLOW_vbdrop_in_verb298);
                    vbdrop27=vbdrop();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdrop27.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:70: vbfill
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,70);
                    pushFollow(FOLLOW_vbfill_in_verb300);
                    vbfill28=vbfill();

                    state._fsp--;

                    adaptor.addChild(root_0, vbfill28.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:77: vbsuspend
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,77);
                    pushFollow(FOLLOW_vbsuspend_in_verb302);
                    vbsuspend29=vbsuspend();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsuspend29.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:87: vbtreat
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,87);
                    pushFollow(FOLLOW_vbtreat_in_verb304);
                    vbtreat30=vbtreat();

                    state._fsp--;

                    adaptor.addChild(root_0, vbtreat30.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:95: vbapparatus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,95);
                    pushFollow(FOLLOW_vbapparatus_in_verb306);
                    vbapparatus31=vbapparatus();

                    state._fsp--;

                    adaptor.addChild(root_0, vbapparatus31.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:107: vbconcentrate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,107);
                    pushFollow(FOLLOW_vbconcentrate_in_verb308);
                    vbconcentrate32=vbconcentrate();

                    state._fsp--;

                    adaptor.addChild(root_0, vbconcentrate32.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:121: vbcool
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,121);
                    pushFollow(FOLLOW_vbcool_in_verb310);
                    vbcool33=vbcool();

                    state._fsp--;

                    adaptor.addChild(root_0, vbcool33.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:128: vbdegass
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,128);
                    pushFollow(FOLLOW_vbdegass_in_verb312);
                    vbdegass34=vbdegass();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdegass34.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:137: vbdissolve
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,137);
                    pushFollow(FOLLOW_vbdissolve_in_verb314);
                    vbdissolve35=vbdissolve();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdissolve35.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:148: vbdry
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,148);
                    pushFollow(FOLLOW_vbdry_in_verb316);
                    vbdry36=vbdry();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdry36.getTree());

                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:154: vbextract
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,154);
                    pushFollow(FOLLOW_vbextract_in_verb318);
                    vbextract37=vbextract();

                    state._fsp--;

                    adaptor.addChild(root_0, vbextract37.getTree());

                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:164: vbfilter
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(42,164);
                    pushFollow(FOLLOW_vbfilter_in_verb320);
                    vbfilter38=vbfilter();

                    state._fsp--;

                    adaptor.addChild(root_0, vbfilter38.getTree());

                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:3: vbheat
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,3);
                    pushFollow(FOLLOW_vbheat_in_verb324);
                    vbheat39=vbheat();

                    state._fsp--;

                    adaptor.addChild(root_0, vbheat39.getTree());

                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:10: vbincrease
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,10);
                    pushFollow(FOLLOW_vbincrease_in_verb326);
                    vbincrease40=vbincrease();

                    state._fsp--;

                    adaptor.addChild(root_0, vbincrease40.getTree());

                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:21: vbpartition
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,21);
                    pushFollow(FOLLOW_vbpartition_in_verb328);
                    vbpartition41=vbpartition();

                    state._fsp--;

                    adaptor.addChild(root_0, vbpartition41.getTree());

                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:33: vbprecipitate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,33);
                    pushFollow(FOLLOW_vbprecipitate_in_verb330);
                    vbprecipitate42=vbprecipitate();

                    state._fsp--;

                    adaptor.addChild(root_0, vbprecipitate42.getTree());

                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:47: vbpurify
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,47);
                    pushFollow(FOLLOW_vbpurify_in_verb332);
                    vbpurify43=vbpurify();

                    state._fsp--;

                    adaptor.addChild(root_0, vbpurify43.getTree());

                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:56: vbquench
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,56);
                    pushFollow(FOLLOW_vbquench_in_verb334);
                    vbquench44=vbquench();

                    state._fsp--;

                    adaptor.addChild(root_0, vbquench44.getTree());

                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:65: vbrecover
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,65);
                    pushFollow(FOLLOW_vbrecover_in_verb336);
                    vbrecover45=vbrecover();

                    state._fsp--;

                    adaptor.addChild(root_0, vbrecover45.getTree());

                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:75: vbremove
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,75);
                    pushFollow(FOLLOW_vbremove_in_verb338);
                    vbremove46=vbremove();

                    state._fsp--;

                    adaptor.addChild(root_0, vbremove46.getTree());

                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:84: vbstir
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,84);
                    pushFollow(FOLLOW_vbstir_in_verb340);
                    vbstir47=vbstir();

                    state._fsp--;

                    adaptor.addChild(root_0, vbstir47.getTree());

                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:91: vbsynthesize
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,91);
                    pushFollow(FOLLOW_vbsynthesize_in_verb342);
                    vbsynthesize48=vbsynthesize();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsynthesize48.getTree());

                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:104: vbwait
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,104);
                    pushFollow(FOLLOW_vbwait_in_verb344);
                    vbwait49=vbwait();

                    state._fsp--;

                    adaptor.addChild(root_0, vbwait49.getTree());

                    }
                    break;
                case 31 :
                    dbg.enterAlt(31);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:111: vbwash
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,111);
                    pushFollow(FOLLOW_vbwash_in_verb346);
                    vbwash50=vbwash();

                    state._fsp--;

                    adaptor.addChild(root_0, vbwash50.getTree());

                    }
                    break;
                case 32 :
                    dbg.enterAlt(32);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:118: vbyield
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(43,118);
                    pushFollow(FOLLOW_vbyield_in_verb348);
                    vbyield51=vbyield();

                    state._fsp--;

                    adaptor.addChild(root_0, vbyield51.getTree());

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
        dbg.location(43, 125);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:1: number : ( cd | oscarcd );
    public final ChemicalChunkerParser.number_return number() throws RecognitionException {
        ChemicalChunkerParser.number_return retval = new ChemicalChunkerParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd52 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd53 = null;



        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:2: ( cd | oscarcd )
            int alt18=2;
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==119) ) {
                alt18=1;
            }
            else if ( (LA18_0==10) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:4: cd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,4);
                    pushFollow(FOLLOW_cd_in_number367);
                    cd52=cd();

                    state._fsp--;

                    adaptor.addChild(root_0, cd52.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:7: oscarcd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,7);
                    pushFollow(FOLLOW_oscarcd_in_number369);
                    oscarcd53=oscarcd();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcd53.getTree());

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
        dbg.location(45, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:46:1: noun : ( unnamedmolecule | molecule | nnstate | nntime | nnatmosphere | nneq | nnchementity | nntemp | nnflash | nngeneral | nnmethod | nnamount | nnpressure | nncolumn | nnchromatography | nnvacuum | nncycle | nntimes | nnapparatus | nnconcentrate | wdt | wp_poss | wpo | wps | nnsynthesize | oscaront | nnmixture );
    public final ChemicalChunkerParser.noun_return noun() throws RecognitionException {
        ChemicalChunkerParser.noun_return retval = new ChemicalChunkerParser.noun_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.unnamedmolecule_return unnamedmolecule54 = null;

        ChemicalChunkerParser.molecule_return molecule55 = null;

        ChemicalChunkerParser.nnstate_return nnstate56 = null;

        ChemicalChunkerParser.nntime_return nntime57 = null;

        ChemicalChunkerParser.nnatmosphere_return nnatmosphere58 = null;

        ChemicalChunkerParser.nneq_return nneq59 = null;

        ChemicalChunkerParser.nnchementity_return nnchementity60 = null;

        ChemicalChunkerParser.nntemp_return nntemp61 = null;

        ChemicalChunkerParser.nnflash_return nnflash62 = null;

        ChemicalChunkerParser.nngeneral_return nngeneral63 = null;

        ChemicalChunkerParser.nnmethod_return nnmethod64 = null;

        ChemicalChunkerParser.nnamount_return nnamount65 = null;

        ChemicalChunkerParser.nnpressure_return nnpressure66 = null;

        ChemicalChunkerParser.nncolumn_return nncolumn67 = null;

        ChemicalChunkerParser.nnchromatography_return nnchromatography68 = null;

        ChemicalChunkerParser.nnvacuum_return nnvacuum69 = null;

        ChemicalChunkerParser.nncycle_return nncycle70 = null;

        ChemicalChunkerParser.nntimes_return nntimes71 = null;

        ChemicalChunkerParser.nnapparatus_return nnapparatus72 = null;

        ChemicalChunkerParser.nnconcentrate_return nnconcentrate73 = null;

        ChemicalChunkerParser.wdt_return wdt74 = null;

        ChemicalChunkerParser.wp_poss_return wp_poss75 = null;

        ChemicalChunkerParser.wpo_return wpo76 = null;

        ChemicalChunkerParser.wps_return wps77 = null;

        ChemicalChunkerParser.nnsynthesize_return nnsynthesize78 = null;

        ChemicalChunkerParser.oscaront_return oscaront79 = null;

        ChemicalChunkerParser.nnmixture_return nnmixture80 = null;



        try { dbg.enterRule(getGrammarFileName(), "noun");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:46:6: ( unnamedmolecule | molecule | nnstate | nntime | nnatmosphere | nneq | nnchementity | nntemp | nnflash | nngeneral | nnmethod | nnamount | nnpressure | nncolumn | nnchromatography | nnvacuum | nncycle | nntimes | nnapparatus | nnconcentrate | wdt | wp_poss | wpo | wps | nnsynthesize | oscaront | nnmixture )
            int alt19=27;
            try { dbg.enterDecision(19);

            switch ( input.LA(1) ) {
            case 10:
                {
                alt19=1;
                }
                break;
            case 50:
                {
                alt19=2;
                }
                break;
            case 31:
                {
                alt19=3;
                }
                break;
            case 32:
                {
                alt19=4;
                }
                break;
            case 35:
                {
                alt19=5;
                }
                break;
            case 36:
                {
                alt19=6;
                }
                break;
            case 38:
                {
                alt19=7;
                }
                break;
            case 39:
                {
                alt19=8;
                }
                break;
            case 40:
                {
                alt19=9;
                }
                break;
            case 41:
                {
                alt19=10;
                }
                break;
            case 42:
                {
                alt19=11;
                }
                break;
            case 43:
                {
                alt19=12;
                }
                break;
            case 44:
                {
                alt19=13;
                }
                break;
            case 45:
                {
                alt19=14;
                }
                break;
            case 46:
                {
                alt19=15;
                }
                break;
            case 47:
                {
                alt19=16;
                }
                break;
            case 48:
                {
                alt19=17;
                }
                break;
            case 49:
                {
                alt19=18;
                }
                break;
            case 65:
                {
                alt19=19;
                }
                break;
            case 67:
                {
                alt19=20;
                }
                break;
            case 174:
                {
                alt19=21;
                }
                break;
            case 175:
                {
                alt19=22;
                }
                break;
            case 176:
                {
                alt19=23;
                }
                break;
            case 177:
                {
                alt19=24;
                }
                break;
            case 90:
                {
                alt19=25;
                }
                break;
            case 12:
                {
                alt19=26;
                }
                break;
            case 56:
                {
                alt19=27;
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:1: unnamedmolecule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,1);
                    pushFollow(FOLLOW_unnamedmolecule_in_noun378);
                    unnamedmolecule54=unnamedmolecule();

                    state._fsp--;

                    adaptor.addChild(root_0, unnamedmolecule54.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:17: molecule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,17);
                    pushFollow(FOLLOW_molecule_in_noun380);
                    molecule55=molecule();

                    state._fsp--;

                    adaptor.addChild(root_0, molecule55.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:26: nnstate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,26);
                    pushFollow(FOLLOW_nnstate_in_noun382);
                    nnstate56=nnstate();

                    state._fsp--;

                    adaptor.addChild(root_0, nnstate56.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:34: nntime
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,34);
                    pushFollow(FOLLOW_nntime_in_noun384);
                    nntime57=nntime();

                    state._fsp--;

                    adaptor.addChild(root_0, nntime57.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:41: nnatmosphere
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,41);
                    pushFollow(FOLLOW_nnatmosphere_in_noun386);
                    nnatmosphere58=nnatmosphere();

                    state._fsp--;

                    adaptor.addChild(root_0, nnatmosphere58.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:54: nneq
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,54);
                    pushFollow(FOLLOW_nneq_in_noun388);
                    nneq59=nneq();

                    state._fsp--;

                    adaptor.addChild(root_0, nneq59.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:59: nnchementity
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,59);
                    pushFollow(FOLLOW_nnchementity_in_noun390);
                    nnchementity60=nnchementity();

                    state._fsp--;

                    adaptor.addChild(root_0, nnchementity60.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:72: nntemp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,72);
                    pushFollow(FOLLOW_nntemp_in_noun392);
                    nntemp61=nntemp();

                    state._fsp--;

                    adaptor.addChild(root_0, nntemp61.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:79: nnflash
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,79);
                    pushFollow(FOLLOW_nnflash_in_noun394);
                    nnflash62=nnflash();

                    state._fsp--;

                    adaptor.addChild(root_0, nnflash62.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:87: nngeneral
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,87);
                    pushFollow(FOLLOW_nngeneral_in_noun396);
                    nngeneral63=nngeneral();

                    state._fsp--;

                    adaptor.addChild(root_0, nngeneral63.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:97: nnmethod
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,97);
                    pushFollow(FOLLOW_nnmethod_in_noun398);
                    nnmethod64=nnmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, nnmethod64.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:106: nnamount
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,106);
                    pushFollow(FOLLOW_nnamount_in_noun400);
                    nnamount65=nnamount();

                    state._fsp--;

                    adaptor.addChild(root_0, nnamount65.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:115: nnpressure
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,115);
                    pushFollow(FOLLOW_nnpressure_in_noun402);
                    nnpressure66=nnpressure();

                    state._fsp--;

                    adaptor.addChild(root_0, nnpressure66.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:126: nncolumn
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,126);
                    pushFollow(FOLLOW_nncolumn_in_noun404);
                    nncolumn67=nncolumn();

                    state._fsp--;

                    adaptor.addChild(root_0, nncolumn67.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:135: nnchromatography
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,135);
                    pushFollow(FOLLOW_nnchromatography_in_noun406);
                    nnchromatography68=nnchromatography();

                    state._fsp--;

                    adaptor.addChild(root_0, nnchromatography68.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:152: nnvacuum
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,152);
                    pushFollow(FOLLOW_nnvacuum_in_noun408);
                    nnvacuum69=nnvacuum();

                    state._fsp--;

                    adaptor.addChild(root_0, nnvacuum69.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:161: nncycle
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,161);
                    pushFollow(FOLLOW_nncycle_in_noun410);
                    nncycle70=nncycle();

                    state._fsp--;

                    adaptor.addChild(root_0, nncycle70.getTree());

                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:169: nntimes
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,169);
                    pushFollow(FOLLOW_nntimes_in_noun412);
                    nntimes71=nntimes();

                    state._fsp--;

                    adaptor.addChild(root_0, nntimes71.getTree());

                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:177: nnapparatus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,177);
                    pushFollow(FOLLOW_nnapparatus_in_noun414);
                    nnapparatus72=nnapparatus();

                    state._fsp--;

                    adaptor.addChild(root_0, nnapparatus72.getTree());

                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:1: nnconcentrate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,1);
                    pushFollow(FOLLOW_nnconcentrate_in_noun417);
                    nnconcentrate73=nnconcentrate();

                    state._fsp--;

                    adaptor.addChild(root_0, nnconcentrate73.getTree());

                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:15: wdt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,15);
                    pushFollow(FOLLOW_wdt_in_noun419);
                    wdt74=wdt();

                    state._fsp--;

                    adaptor.addChild(root_0, wdt74.getTree());

                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:19: wp_poss
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,19);
                    pushFollow(FOLLOW_wp_poss_in_noun421);
                    wp_poss75=wp_poss();

                    state._fsp--;

                    adaptor.addChild(root_0, wp_poss75.getTree());

                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:27: wpo
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,27);
                    pushFollow(FOLLOW_wpo_in_noun423);
                    wpo76=wpo();

                    state._fsp--;

                    adaptor.addChild(root_0, wpo76.getTree());

                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:31: wps
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,31);
                    pushFollow(FOLLOW_wps_in_noun425);
                    wps77=wps();

                    state._fsp--;

                    adaptor.addChild(root_0, wps77.getTree());

                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:35: nnsynthesize
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,35);
                    pushFollow(FOLLOW_nnsynthesize_in_noun427);
                    nnsynthesize78=nnsynthesize();

                    state._fsp--;

                    adaptor.addChild(root_0, nnsynthesize78.getTree());

                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:48: oscaront
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,48);
                    pushFollow(FOLLOW_oscaront_in_noun429);
                    oscaront79=oscaront();

                    state._fsp--;

                    adaptor.addChild(root_0, oscaront79.getTree());

                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:57: nnmixture
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,57);
                    pushFollow(FOLLOW_nnmixture_in_noun431);
                    nnmixture80=nnmixture();

                    state._fsp--;

                    adaptor.addChild(root_0, nnmixture80.getTree());

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
        dbg.location(48, 66);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:1: adj : ( jj | jjr | jjs | jjt | oscarcj );
    public final ChemicalChunkerParser.adj_return adj() throws RecognitionException {
        ChemicalChunkerParser.adj_return retval = new ChemicalChunkerParser.adj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.jj_return jj81 = null;

        ChemicalChunkerParser.jjr_return jjr82 = null;

        ChemicalChunkerParser.jjs_return jjs83 = null;

        ChemicalChunkerParser.jjt_return jjt84 = null;

        ChemicalChunkerParser.oscarcj_return oscarcj85 = null;



        try { dbg.enterRule(getGrammarFileName(), "adj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:5: ( jj | jjr | jjs | jjt | oscarcj )
            int alt20=5;
            try { dbg.enterDecision(20);

            switch ( input.LA(1) ) {
            case 135:
                {
                alt20=1;
                }
                break;
            case 136:
                {
                alt20=2;
                }
                break;
            case 137:
                {
                alt20=3;
                }
                break;
            case 138:
                {
                alt20=4;
                }
                break;
            case 11:
                {
                alt20=5;
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:7: jj
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,7);
                    pushFollow(FOLLOW_jj_in_adj440);
                    jj81=jj();

                    state._fsp--;

                    adaptor.addChild(root_0, jj81.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:10: jjr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,10);
                    pushFollow(FOLLOW_jjr_in_adj442);
                    jjr82=jjr();

                    state._fsp--;

                    adaptor.addChild(root_0, jjr82.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:14: jjs
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,14);
                    pushFollow(FOLLOW_jjs_in_adj444);
                    jjs83=jjs();

                    state._fsp--;

                    adaptor.addChild(root_0, jjs83.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:18: jjt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,18);
                    pushFollow(FOLLOW_jjt_in_adj446);
                    jjt84=jjt();

                    state._fsp--;

                    adaptor.addChild(root_0, jjt84.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:22: oscarcj
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,22);
                    pushFollow(FOLLOW_oscarcj_in_adj448);
                    oscarcj85=oscarcj();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcj85.getTree());

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
        dbg.location(51, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:1: adv : ( rb | rbr | rbt );
    public final ChemicalChunkerParser.adv_return adv() throws RecognitionException {
        ChemicalChunkerParser.adv_return retval = new ChemicalChunkerParser.adv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.rb_return rb86 = null;

        ChemicalChunkerParser.rbr_return rbr87 = null;

        ChemicalChunkerParser.rbt_return rbt88 = null;



        try { dbg.enterRule(getGrammarFileName(), "adv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:5: ( rb | rbr | rbt )
            int alt21=3;
            try { dbg.enterDecision(21);

            switch ( input.LA(1) ) {
            case 162:
                {
                alt21=1;
                }
                break;
            case 163:
                {
                alt21=2;
                }
                break;
            case 164:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:7: rb
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(53,7);
                    pushFollow(FOLLOW_rb_in_adv456);
                    rb86=rb();

                    state._fsp--;

                    adaptor.addChild(root_0, rb86.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:10: rbr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(53,10);
                    pushFollow(FOLLOW_rbr_in_adv458);
                    rbr87=rbr();

                    state._fsp--;

                    adaptor.addChild(root_0, rbr87.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:14: rbt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(53,14);
                    pushFollow(FOLLOW_rbt_in_adv460);
                    rbt88=rbt();

                    state._fsp--;

                    adaptor.addChild(root_0, rbt88.getTree());

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
        dbg.location(53, 17);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:55:1: prepphrase : ( prepphraseOther | prepphraseTemp | prepphraseTime );
    public final ChemicalChunkerParser.prepphrase_return prepphrase() throws RecognitionException {
        ChemicalChunkerParser.prepphrase_return retval = new ChemicalChunkerParser.prepphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.prepphraseOther_return prepphraseOther89 = null;

        ChemicalChunkerParser.prepphraseTemp_return prepphraseTemp90 = null;

        ChemicalChunkerParser.prepphraseTime_return prepphraseTime91 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:2: ( prepphraseOther | prepphraseTemp | prepphraseTime )
            int alt22=3;
            try { dbg.enterDecision(22);

            try {
                isCyclicDecision = true;
                alt22 = dfa22.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:5: prepphraseOther
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(56,5);
                    pushFollow(FOLLOW_prepphraseOther_in_prepphrase471);
                    prepphraseOther89=prepphraseOther();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseOther89.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:21: prepphraseTemp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(56,21);
                    pushFollow(FOLLOW_prepphraseTemp_in_prepphrase473);
                    prepphraseTemp90=prepphraseTemp();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseTemp90.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:36: prepphraseTime
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(56,36);
                    pushFollow(FOLLOW_prepphraseTime_in_prepphrase475);
                    prepphraseTime91=prepphraseTime();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseTime91.getTree());

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
        dbg.location(56, 52);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:58:2: prepphraseOther : inAll nounphrase -> ^( NODE[\"PrepPhrase\"] inAll nounphrase ) ;
    public final ChemicalChunkerParser.prepphraseOther_return prepphraseOther() throws RecognitionException {
        ChemicalChunkerParser.prepphraseOther_return retval = new ChemicalChunkerParser.prepphraseOther_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll92 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase93 = null;


        RewriteRuleSubtreeStream stream_nounphrase=new RewriteRuleSubtreeStream(adaptor,"rule nounphrase");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseOther");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 2);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:59:2: ( inAll nounphrase -> ^( NODE[\"PrepPhrase\"] inAll nounphrase ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:59:4: inAll nounphrase
            {
            dbg.location(59,4);
            pushFollow(FOLLOW_inAll_in_prepphraseOther487);
            inAll92=inAll();

            state._fsp--;

            stream_inAll.add(inAll92.getTree());
            dbg.location(59,11);
            pushFollow(FOLLOW_nounphrase_in_prepphraseOther490);
            nounphrase93=nounphrase();

            state._fsp--;

            stream_nounphrase.add(nounphrase93.getTree());


            // AST REWRITE
            // elements: nounphrase, inAll
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:22: -> ^( NODE[\"PrepPhrase\"] inAll nounphrase )
            {
                dbg.location(59,26);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:59:26: ^( NODE[\"PrepPhrase\"] inAll nounphrase )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(59,28);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PrepPhrase"), root_1);

                dbg.location(59,48);
                adaptor.addChild(root_1, stream_inAll.nextTree());
                dbg.location(59,55);
                adaptor.addChild(root_1, stream_nounphrase.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(59, 66);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:60:1: prepphraseOf : inof nounphrase -> ^( NODE[\"PrepPhrase\"] inof nounphrase ) ;
    public final ChemicalChunkerParser.prepphraseOf_return prepphraseOf() throws RecognitionException {
        ChemicalChunkerParser.prepphraseOf_return retval = new ChemicalChunkerParser.prepphraseOf_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inof_return inof94 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase95 = null;


        RewriteRuleSubtreeStream stream_nounphrase=new RewriteRuleSubtreeStream(adaptor,"rule nounphrase");
        RewriteRuleSubtreeStream stream_inof=new RewriteRuleSubtreeStream(adaptor,"rule inof");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseOf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:61:2: ( inof nounphrase -> ^( NODE[\"PrepPhrase\"] inof nounphrase ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:61:4: inof nounphrase
            {
            dbg.location(61,4);
            pushFollow(FOLLOW_inof_in_prepphraseOf513);
            inof94=inof();

            state._fsp--;

            stream_inof.add(inof94.getTree());
            dbg.location(61,10);
            pushFollow(FOLLOW_nounphrase_in_prepphraseOf516);
            nounphrase95=nounphrase();

            state._fsp--;

            stream_nounphrase.add(nounphrase95.getTree());


            // AST REWRITE
            // elements: nounphrase, inof
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:20: -> ^( NODE[\"PrepPhrase\"] inof nounphrase )
            {
                dbg.location(61,24);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:61:24: ^( NODE[\"PrepPhrase\"] inof nounphrase )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(61,26);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PrepPhrase"), root_1);

                dbg.location(61,46);
                adaptor.addChild(root_1, stream_inof.nextTree());
                dbg.location(61,52);
                adaptor.addChild(root_1, stream_nounphrase.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(61, 63);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:63:1: prepphraseIN : inin molecule -> ^( NODE[\"INMolecule\"] inin molecule ) ;
    public final ChemicalChunkerParser.prepphraseIN_return prepphraseIN() throws RecognitionException {
        ChemicalChunkerParser.prepphraseIN_return retval = new ChemicalChunkerParser.prepphraseIN_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inin_return inin96 = null;

        ChemicalChunkerParser.molecule_return molecule97 = null;


        RewriteRuleSubtreeStream stream_inin=new RewriteRuleSubtreeStream(adaptor,"rule inin");
        RewriteRuleSubtreeStream stream_molecule=new RewriteRuleSubtreeStream(adaptor,"rule molecule");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseIN");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:64:2: ( inin molecule -> ^( NODE[\"INMolecule\"] inin molecule ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:64:5: inin molecule
            {
            dbg.location(64,5);
            pushFollow(FOLLOW_inin_in_prepphraseIN540);
            inin96=inin();

            state._fsp--;

            stream_inin.add(inin96.getTree());
            dbg.location(64,10);
            pushFollow(FOLLOW_molecule_in_prepphraseIN542);
            molecule97=molecule();

            state._fsp--;

            stream_molecule.add(molecule97.getTree());


            // AST REWRITE
            // elements: inin, molecule
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 64:19: -> ^( NODE[\"INMolecule\"] inin molecule )
            {
                dbg.location(64,23);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:64:23: ^( NODE[\"INMolecule\"] inin molecule )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(64,25);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "INMolecule"), root_1);

                dbg.location(64,45);
                adaptor.addChild(root_1, stream_inin.nextTree());
                dbg.location(64,51);
                adaptor.addChild(root_1, stream_molecule.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(64, 60);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:67:1: prepphraseTime : ( inAll )? ( dt )? ( jj )? cd nntime -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime ) ;
    public final ChemicalChunkerParser.prepphraseTime_return prepphraseTime() throws RecognitionException {
        ChemicalChunkerParser.prepphraseTime_return retval = new ChemicalChunkerParser.prepphraseTime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll98 = null;

        ChemicalChunkerParser.dt_return dt99 = null;

        ChemicalChunkerParser.jj_return jj100 = null;

        ChemicalChunkerParser.cd_return cd101 = null;

        ChemicalChunkerParser.nntime_return nntime102 = null;


        RewriteRuleSubtreeStream stream_dt=new RewriteRuleSubtreeStream(adaptor,"rule dt");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        RewriteRuleSubtreeStream stream_nntime=new RewriteRuleSubtreeStream(adaptor,"rule nntime");
        RewriteRuleSubtreeStream stream_jj=new RewriteRuleSubtreeStream(adaptor,"rule jj");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseTime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:67:15: ( ( inAll )? ( dt )? ( jj )? cd nntime -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:2: ( inAll )? ( dt )? ( jj )? cd nntime
            {
            dbg.location(68,2);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:2: ( inAll )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=15 && LA23_0<=30)||LA23_0==134) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:2: inAll
                    {
                    dbg.location(68,2);
                    pushFollow(FOLLOW_inAll_in_prepphraseTime566);
                    inAll98=inAll();

                    state._fsp--;

                    stream_inAll.add(inAll98.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

            dbg.location(68,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:9: ( dt )?
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==124) ) {
                alt24=1;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:9: dt
                    {
                    dbg.location(68,9);
                    pushFollow(FOLLOW_dt_in_prepphraseTime569);
                    dt99=dt();

                    state._fsp--;

                    stream_dt.add(dt99.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(68,13);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:13: ( jj )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==135) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:13: jj
                    {
                    dbg.location(68,13);
                    pushFollow(FOLLOW_jj_in_prepphraseTime572);
                    jj100=jj();

                    state._fsp--;

                    stream_jj.add(jj100.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(68,17);
            pushFollow(FOLLOW_cd_in_prepphraseTime575);
            cd101=cd();

            state._fsp--;

            stream_cd.add(cd101.getTree());
            dbg.location(68,20);
            pushFollow(FOLLOW_nntime_in_prepphraseTime577);
            nntime102=nntime();

            state._fsp--;

            stream_nntime.add(nntime102.getTree());


            // AST REWRITE
            // elements: cd, nntime, dt, jj, inAll
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:27: -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime )
            {
                dbg.location(68,31);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:31: ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(68,33);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "TimePhrase"), root_1);

                dbg.location(68,53);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:53: ( inAll )?
                if ( stream_inAll.hasNext() ) {
                    dbg.location(68,53);
                    adaptor.addChild(root_1, stream_inAll.nextTree());

                }
                stream_inAll.reset();
                dbg.location(68,60);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:60: ( dt )?
                if ( stream_dt.hasNext() ) {
                    dbg.location(68,60);
                    adaptor.addChild(root_1, stream_dt.nextTree());

                }
                stream_dt.reset();
                dbg.location(68,64);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:68:64: ( jj )?
                if ( stream_jj.hasNext() ) {
                    dbg.location(68,64);
                    adaptor.addChild(root_1, stream_jj.nextTree());

                }
                stream_jj.reset();
                dbg.location(68,68);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(68,71);
                adaptor.addChild(root_1, stream_nntime.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(68, 78);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:1: prepphraseTemp : ( inAll )? ( dt )? ( jj )? cd nntemp -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp ) ;
    public final ChemicalChunkerParser.prepphraseTemp_return prepphraseTemp() throws RecognitionException {
        ChemicalChunkerParser.prepphraseTemp_return retval = new ChemicalChunkerParser.prepphraseTemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll103 = null;

        ChemicalChunkerParser.dt_return dt104 = null;

        ChemicalChunkerParser.jj_return jj105 = null;

        ChemicalChunkerParser.cd_return cd106 = null;

        ChemicalChunkerParser.nntemp_return nntemp107 = null;


        RewriteRuleSubtreeStream stream_dt=new RewriteRuleSubtreeStream(adaptor,"rule dt");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        RewriteRuleSubtreeStream stream_nntemp=new RewriteRuleSubtreeStream(adaptor,"rule nntemp");
        RewriteRuleSubtreeStream stream_jj=new RewriteRuleSubtreeStream(adaptor,"rule jj");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseTemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:15: ( ( inAll )? ( dt )? ( jj )? cd nntemp -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:2: ( inAll )? ( dt )? ( jj )? cd nntemp
            {
            dbg.location(71,2);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:2: ( inAll )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=15 && LA26_0<=30)||LA26_0==134) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:2: inAll
                    {
                    dbg.location(71,2);
                    pushFollow(FOLLOW_inAll_in_prepphraseTemp607);
                    inAll103=inAll();

                    state._fsp--;

                    stream_inAll.add(inAll103.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(71,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:9: ( dt )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==124) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:9: dt
                    {
                    dbg.location(71,9);
                    pushFollow(FOLLOW_dt_in_prepphraseTemp610);
                    dt104=dt();

                    state._fsp--;

                    stream_dt.add(dt104.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(71,13);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:13: ( jj )?
            int alt28=2;
            try { dbg.enterSubRule(28);
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==135) ) {
                alt28=1;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:13: jj
                    {
                    dbg.location(71,13);
                    pushFollow(FOLLOW_jj_in_prepphraseTemp613);
                    jj105=jj();

                    state._fsp--;

                    stream_jj.add(jj105.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(28);}

            dbg.location(71,17);
            pushFollow(FOLLOW_cd_in_prepphraseTemp616);
            cd106=cd();

            state._fsp--;

            stream_cd.add(cd106.getTree());
            dbg.location(71,20);
            pushFollow(FOLLOW_nntemp_in_prepphraseTemp618);
            nntemp107=nntemp();

            state._fsp--;

            stream_nntemp.add(nntemp107.getTree());


            // AST REWRITE
            // elements: cd, inAll, nntemp, dt, jj
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:27: -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp )
            {
                dbg.location(71,31);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:31: ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(71,33);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "TempPhrase"), root_1);

                dbg.location(71,53);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:53: ( inAll )?
                if ( stream_inAll.hasNext() ) {
                    dbg.location(71,53);
                    adaptor.addChild(root_1, stream_inAll.nextTree());

                }
                stream_inAll.reset();
                dbg.location(71,60);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:60: ( dt )?
                if ( stream_dt.hasNext() ) {
                    dbg.location(71,60);
                    adaptor.addChild(root_1, stream_dt.nextTree());

                }
                stream_dt.reset();
                dbg.location(71,64);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:64: ( jj )?
                if ( stream_jj.hasNext() ) {
                    dbg.location(71,64);
                    adaptor.addChild(root_1, stream_jj.nextTree());

                }
                stream_jj.reset();
                dbg.location(71,68);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(71,71);
                adaptor.addChild(root_1, stream_nntemp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(71, 78);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:1: inAll : ( in | inafter | inas | inbefore | inby | infor | infrom | inin | ininto | inof | inoff | inon | inover | inunder | invia | inwith | inwithout );
    public final ChemicalChunkerParser.inAll_return inAll() throws RecognitionException {
        ChemicalChunkerParser.inAll_return retval = new ChemicalChunkerParser.inAll_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.in_return in108 = null;

        ChemicalChunkerParser.inafter_return inafter109 = null;

        ChemicalChunkerParser.inas_return inas110 = null;

        ChemicalChunkerParser.inbefore_return inbefore111 = null;

        ChemicalChunkerParser.inby_return inby112 = null;

        ChemicalChunkerParser.infor_return infor113 = null;

        ChemicalChunkerParser.infrom_return infrom114 = null;

        ChemicalChunkerParser.inin_return inin115 = null;

        ChemicalChunkerParser.ininto_return ininto116 = null;

        ChemicalChunkerParser.inof_return inof117 = null;

        ChemicalChunkerParser.inoff_return inoff118 = null;

        ChemicalChunkerParser.inon_return inon119 = null;

        ChemicalChunkerParser.inover_return inover120 = null;

        ChemicalChunkerParser.inunder_return inunder121 = null;

        ChemicalChunkerParser.invia_return invia122 = null;

        ChemicalChunkerParser.inwith_return inwith123 = null;

        ChemicalChunkerParser.inwithout_return inwithout124 = null;



        try { dbg.enterRule(getGrammarFileName(), "inAll");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:7: ( in | inafter | inas | inbefore | inby | infor | infrom | inin | ininto | inof | inoff | inon | inover | inunder | invia | inwith | inwithout )
            int alt29=17;
            try { dbg.enterDecision(29);

            switch ( input.LA(1) ) {
            case 134:
                {
                alt29=1;
                }
                break;
            case 17:
                {
                alt29=2;
                }
                break;
            case 15:
                {
                alt29=3;
                }
                break;
            case 16:
                {
                alt29=4;
                }
                break;
            case 22:
                {
                alt29=5;
                }
                break;
            case 26:
                {
                alt29=6;
                }
                break;
            case 27:
                {
                alt29=7;
                }
                break;
            case 18:
                {
                alt29=8;
                }
                break;
            case 19:
                {
                alt29=9;
                }
                break;
            case 24:
                {
                alt29=10;
                }
                break;
            case 30:
                {
                alt29=11;
                }
                break;
            case 25:
                {
                alt29=12;
                }
                break;
            case 29:
                {
                alt29=13;
                }
                break;
            case 28:
                {
                alt29=14;
                }
                break;
            case 23:
                {
                alt29=15;
                }
                break;
            case 20:
                {
                alt29=16;
                }
                break;
            case 21:
                {
                alt29=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:9: in
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,9);
                    pushFollow(FOLLOW_in_in_inAll651);
                    in108=in();

                    state._fsp--;

                    adaptor.addChild(root_0, in108.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:12: inafter
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,12);
                    pushFollow(FOLLOW_inafter_in_inAll653);
                    inafter109=inafter();

                    state._fsp--;

                    adaptor.addChild(root_0, inafter109.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:20: inas
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,20);
                    pushFollow(FOLLOW_inas_in_inAll655);
                    inas110=inas();

                    state._fsp--;

                    adaptor.addChild(root_0, inas110.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:25: inbefore
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,25);
                    pushFollow(FOLLOW_inbefore_in_inAll657);
                    inbefore111=inbefore();

                    state._fsp--;

                    adaptor.addChild(root_0, inbefore111.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:34: inby
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,34);
                    pushFollow(FOLLOW_inby_in_inAll659);
                    inby112=inby();

                    state._fsp--;

                    adaptor.addChild(root_0, inby112.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:39: infor
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,39);
                    pushFollow(FOLLOW_infor_in_inAll661);
                    infor113=infor();

                    state._fsp--;

                    adaptor.addChild(root_0, infor113.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:45: infrom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,45);
                    pushFollow(FOLLOW_infrom_in_inAll663);
                    infrom114=infrom();

                    state._fsp--;

                    adaptor.addChild(root_0, infrom114.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:52: inin
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,52);
                    pushFollow(FOLLOW_inin_in_inAll665);
                    inin115=inin();

                    state._fsp--;

                    adaptor.addChild(root_0, inin115.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:57: ininto
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,57);
                    pushFollow(FOLLOW_ininto_in_inAll667);
                    ininto116=ininto();

                    state._fsp--;

                    adaptor.addChild(root_0, ininto116.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:64: inof
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,64);
                    pushFollow(FOLLOW_inof_in_inAll669);
                    inof117=inof();

                    state._fsp--;

                    adaptor.addChild(root_0, inof117.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:69: inoff
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,69);
                    pushFollow(FOLLOW_inoff_in_inAll671);
                    inoff118=inoff();

                    state._fsp--;

                    adaptor.addChild(root_0, inoff118.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:75: inon
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,75);
                    pushFollow(FOLLOW_inon_in_inAll673);
                    inon119=inon();

                    state._fsp--;

                    adaptor.addChild(root_0, inon119.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:80: inover
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,80);
                    pushFollow(FOLLOW_inover_in_inAll675);
                    inover120=inover();

                    state._fsp--;

                    adaptor.addChild(root_0, inover120.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:87: inunder
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,87);
                    pushFollow(FOLLOW_inunder_in_inAll677);
                    inunder121=inunder();

                    state._fsp--;

                    adaptor.addChild(root_0, inunder121.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:95: invia
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,95);
                    pushFollow(FOLLOW_invia_in_inAll679);
                    invia122=invia();

                    state._fsp--;

                    adaptor.addChild(root_0, invia122.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:101: inwith
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,101);
                    pushFollow(FOLLOW_inwith_in_inAll681);
                    inwith123=inwith();

                    state._fsp--;

                    adaptor.addChild(root_0, inwith123.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:75:108: inwithout
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(75,108);
                    pushFollow(FOLLOW_inwithout_in_inAll683);
                    inwithout124=inwithout();

                    state._fsp--;

                    adaptor.addChild(root_0, inwithout124.getTree());

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
        dbg.location(75, 118);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:79:1: mmol : cd nnmol ;
    public final ChemicalChunkerParser.mmol_return mmol() throws RecognitionException {
        ChemicalChunkerParser.mmol_return retval = new ChemicalChunkerParser.mmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd125 = null;

        ChemicalChunkerParser.nnmol_return nnmol126 = null;



        try { dbg.enterRule(getGrammarFileName(), "mmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:79:6: ( cd nnmol )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:79:8: cd nnmol
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(79,8);
            pushFollow(FOLLOW_cd_in_mmol697);
            cd125=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd125.getTree());
            dbg.location(79,11);
            pushFollow(FOLLOW_nnmol_in_mmol699);
            nnmol126=nnmol();

            state._fsp--;

            adaptor.addChild(root_0, nnmol126.getTree());

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
        dbg.location(79, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:80:1: gram : cd nngram ;
    public final ChemicalChunkerParser.gram_return gram() throws RecognitionException {
        ChemicalChunkerParser.gram_return retval = new ChemicalChunkerParser.gram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd127 = null;

        ChemicalChunkerParser.nngram_return nngram128 = null;



        try { dbg.enterRule(getGrammarFileName(), "gram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:80:6: ( cd nngram )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:80:8: cd nngram
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(80,8);
            pushFollow(FOLLOW_cd_in_gram706);
            cd127=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd127.getTree());
            dbg.location(80,11);
            pushFollow(FOLLOW_nngram_in_gram708);
            nngram128=nngram();

            state._fsp--;

            adaptor.addChild(root_0, nngram128.getTree());

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
        dbg.location(80, 17);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:81:1: percent : cd nnpercent ;
    public final ChemicalChunkerParser.percent_return percent() throws RecognitionException {
        ChemicalChunkerParser.percent_return retval = new ChemicalChunkerParser.percent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd129 = null;

        ChemicalChunkerParser.nnpercent_return nnpercent130 = null;



        try { dbg.enterRule(getGrammarFileName(), "percent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:81:9: ( cd nnpercent )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:81:11: cd nnpercent
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(81,11);
            pushFollow(FOLLOW_cd_in_percent715);
            cd129=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd129.getTree());
            dbg.location(81,14);
            pushFollow(FOLLOW_nnpercent_in_percent717);
            nnpercent130=nnpercent();

            state._fsp--;

            adaptor.addChild(root_0, nnpercent130.getTree());

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
        dbg.location(81, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:1: volume : cd nnvol ;
    public final ChemicalChunkerParser.volume_return volume() throws RecognitionException {
        ChemicalChunkerParser.volume_return retval = new ChemicalChunkerParser.volume_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd131 = null;

        ChemicalChunkerParser.nnvol_return nnvol132 = null;



        try { dbg.enterRule(getGrammarFileName(), "volume");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:8: ( cd nnvol )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:10: cd nnvol
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(82,10);
            pushFollow(FOLLOW_cd_in_volume724);
            cd131=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd131.getTree());
            dbg.location(82,13);
            pushFollow(FOLLOW_nnvol_in_volume726);
            nnvol132=nnvol();

            state._fsp--;

            adaptor.addChild(root_0, nnvol132.getTree());

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
        dbg.location(82, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:1: measurements : ( mmol | gram | percent | volume );
    public final ChemicalChunkerParser.measurements_return measurements() throws RecognitionException {
        ChemicalChunkerParser.measurements_return retval = new ChemicalChunkerParser.measurements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.mmol_return mmol133 = null;

        ChemicalChunkerParser.gram_return gram134 = null;

        ChemicalChunkerParser.percent_return percent135 = null;

        ChemicalChunkerParser.volume_return volume136 = null;



        try { dbg.enterRule(getGrammarFileName(), "measurements");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:2: ( mmol | gram | percent | volume )
            int alt30=4;
            try { dbg.enterDecision(30);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==119) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==TOKEN) ) {
                    switch ( input.LA(3) ) {
                    case 100:
                        {
                        alt30=3;
                        }
                        break;
                    case 34:
                        {
                        alt30=1;
                        }
                        break;
                    case 33:
                        {
                        alt30=2;
                        }
                        break;
                    case 37:
                        {
                        alt30=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:3: mmol
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(85,3);
                    pushFollow(FOLLOW_mmol_in_measurements734);
                    mmol133=mmol();

                    state._fsp--;

                    adaptor.addChild(root_0, mmol133.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:8: gram
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(85,8);
                    pushFollow(FOLLOW_gram_in_measurements736);
                    gram134=gram();

                    state._fsp--;

                    adaptor.addChild(root_0, gram134.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:13: percent
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(85,13);
                    pushFollow(FOLLOW_percent_in_measurements738);
                    percent135=percent();

                    state._fsp--;

                    adaptor.addChild(root_0, percent135.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:21: volume
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(85,21);
                    pushFollow(FOLLOW_volume_in_measurements740);
                    volume136=volume();

                    state._fsp--;

                    adaptor.addChild(root_0, volume136.getTree());

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
        dbg.location(85, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:88:1: molecule : ( oscarcm )+ amount ;
    public final ChemicalChunkerParser.molecule_return molecule() throws RecognitionException {
        ChemicalChunkerParser.molecule_return retval = new ChemicalChunkerParser.molecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarcm_return oscarcm137 = null;

        ChemicalChunkerParser.amount_return amount138 = null;



        try { dbg.enterRule(getGrammarFileName(), "molecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:2: ( ( oscarcm )+ amount )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:6: ( oscarcm )+ amount
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(89,6);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:6: ( oscarcm )+
            int cnt31=0;
            try { dbg.enterSubRule(31);

            loop31:
            do {
                int alt31=2;
                try { dbg.enterDecision(31);

                int LA31_0 = input.LA(1);

                if ( (LA31_0==50) ) {
                    alt31=1;
                }


                } finally {dbg.exitDecision(31);}

                switch (alt31) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:6: oscarcm
            	    {
            	    dbg.location(89,6);
            	    pushFollow(FOLLOW_oscarcm_in_molecule764);
            	    oscarcm137=oscarcm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, oscarcm137.getTree());

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

            dbg.location(89,15);
            pushFollow(FOLLOW_amount_in_molecule767);
            amount138=amount();

            state._fsp--;

            adaptor.addChild(root_0, amount138.getTree());

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
        dbg.location(89, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:90:1: unnamedmolecule : ( oscarcd )+ ( amount )* ;
    public final ChemicalChunkerParser.unnamedmolecule_return unnamedmolecule() throws RecognitionException {
        ChemicalChunkerParser.unnamedmolecule_return retval = new ChemicalChunkerParser.unnamedmolecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd139 = null;

        ChemicalChunkerParser.amount_return amount140 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmolecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:91:2: ( ( oscarcd )+ ( amount )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:91:4: ( oscarcd )+ ( amount )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(91,4);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:91:4: ( oscarcd )+
            int cnt32=0;
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                int LA32_0 = input.LA(1);

                if ( (LA32_0==10) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:91:4: oscarcd
            	    {
            	    dbg.location(91,4);
            	    pushFollow(FOLLOW_oscarcd_in_unnamedmolecule777);
            	    oscarcd139=oscarcd();

            	    state._fsp--;

            	    adaptor.addChild(root_0, oscarcd139.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt32++;
            } while (true);
            } finally {dbg.exitSubRule(32);}

            dbg.location(91,13);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:91:13: ( amount )*
            try { dbg.enterSubRule(33);

            loop33:
            do {
                int alt33=2;
                try { dbg.enterDecision(33);

                int LA33_0 = input.LA(1);

                if ( (LA33_0==103) ) {
                    alt33=1;
                }


                } finally {dbg.exitDecision(33);}

                switch (alt33) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:91:13: amount
            	    {
            	    dbg.location(91,13);
            	    pushFollow(FOLLOW_amount_in_unnamedmolecule780);
            	    amount140=amount();

            	    state._fsp--;

            	    adaptor.addChild(root_0, amount140.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);
            } finally {dbg.exitSubRule(33);}


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
        dbg.location(91, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:1: amount : lrb measurements ( comma measurements )* rrb -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb ) ;
    public final ChemicalChunkerParser.amount_return amount() throws RecognitionException {
        ChemicalChunkerParser.amount_return retval = new ChemicalChunkerParser.amount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.lrb_return lrb141 = null;

        ChemicalChunkerParser.measurements_return measurements142 = null;

        ChemicalChunkerParser.comma_return comma143 = null;

        ChemicalChunkerParser.measurements_return measurements144 = null;

        ChemicalChunkerParser.rrb_return rrb145 = null;


        RewriteRuleSubtreeStream stream_measurements=new RewriteRuleSubtreeStream(adaptor,"rule measurements");
        RewriteRuleSubtreeStream stream_comma=new RewriteRuleSubtreeStream(adaptor,"rule comma");
        RewriteRuleSubtreeStream stream_lrb=new RewriteRuleSubtreeStream(adaptor,"rule lrb");
        RewriteRuleSubtreeStream stream_rrb=new RewriteRuleSubtreeStream(adaptor,"rule rrb");
        try { dbg.enterRule(getGrammarFileName(), "amount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:9: ( lrb measurements ( comma measurements )* rrb -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:11: lrb measurements ( comma measurements )* rrb
            {
            dbg.location(93,11);
            pushFollow(FOLLOW_lrb_in_amount793);
            lrb141=lrb();

            state._fsp--;

            stream_lrb.add(lrb141.getTree());
            dbg.location(93,15);
            pushFollow(FOLLOW_measurements_in_amount795);
            measurements142=measurements();

            state._fsp--;

            stream_measurements.add(measurements142.getTree());
            dbg.location(93,28);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:28: ( comma measurements )*
            try { dbg.enterSubRule(34);

            loop34:
            do {
                int alt34=2;
                try { dbg.enterDecision(34);

                int LA34_0 = input.LA(1);

                if ( (LA34_0==95) ) {
                    alt34=1;
                }


                } finally {dbg.exitDecision(34);}

                switch (alt34) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:29: comma measurements
            	    {
            	    dbg.location(93,29);
            	    pushFollow(FOLLOW_comma_in_amount798);
            	    comma143=comma();

            	    state._fsp--;

            	    stream_comma.add(comma143.getTree());
            	    dbg.location(93,36);
            	    pushFollow(FOLLOW_measurements_in_amount801);
            	    measurements144=measurements();

            	    state._fsp--;

            	    stream_measurements.add(measurements144.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);
            } finally {dbg.exitSubRule(34);}

            dbg.location(93,52);
            pushFollow(FOLLOW_rrb_in_amount806);
            rrb145=rrb();

            state._fsp--;

            stream_rrb.add(rrb145.getTree());


            // AST REWRITE
            // elements: comma, measurements, rrb, measurements, lrb
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 93:56: -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb )
            {
                dbg.location(93,61);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:61: ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(93,63);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "AMOUNT"), root_1);

                dbg.location(93,79);
                adaptor.addChild(root_1, stream_lrb.nextTree());
                dbg.location(93,83);
                adaptor.addChild(root_1, stream_measurements.nextTree());
                dbg.location(93,96);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:96: ( comma measurements )*
                while ( stream_comma.hasNext()||stream_measurements.hasNext() ) {
                    dbg.location(93,97);
                    adaptor.addChild(root_1, stream_comma.nextTree());
                    dbg.location(93,104);
                    adaptor.addChild(root_1, stream_measurements.nextTree());

                }
                stream_comma.reset();
                stream_measurements.reset();
                dbg.location(93,120);
                adaptor.addChild(root_1, stream_rrb.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(93, 124);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:95:1: method : ( nngeneral | nn )? nnmethod ( oscarcd | cd )? ;
    public final ChemicalChunkerParser.method_return method() throws RecognitionException {
        ChemicalChunkerParser.method_return retval = new ChemicalChunkerParser.method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.nngeneral_return nngeneral146 = null;

        ChemicalChunkerParser.nn_return nn147 = null;

        ChemicalChunkerParser.nnmethod_return nnmethod148 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd149 = null;

        ChemicalChunkerParser.cd_return cd150 = null;



        try { dbg.enterRule(getGrammarFileName(), "method");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:95:7: ( ( nngeneral | nn )? nnmethod ( oscarcd | cd )? )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:5: ( nngeneral | nn )? nnmethod ( oscarcd | cd )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(96,5);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:5: ( nngeneral | nn )?
            int alt35=3;
            try { dbg.enterSubRule(35);
            try { dbg.enterDecision(35);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            else if ( (LA35_0==141) ) {
                alt35=2;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:6: nngeneral
                    {
                    dbg.location(96,6);
                    pushFollow(FOLLOW_nngeneral_in_method843);
                    nngeneral146=nngeneral();

                    state._fsp--;

                    adaptor.addChild(root_0, nngeneral146.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:16: nn
                    {
                    dbg.location(96,16);
                    pushFollow(FOLLOW_nn_in_method845);
                    nn147=nn();

                    state._fsp--;

                    adaptor.addChild(root_0, nn147.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(35);}

            dbg.location(96,21);
            pushFollow(FOLLOW_nnmethod_in_method849);
            nnmethod148=nnmethod();

            state._fsp--;

            adaptor.addChild(root_0, nnmethod148.getTree());
            dbg.location(96,30);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:30: ( oscarcd | cd )?
            int alt36=3;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==10) ) {
                alt36=1;
            }
            else if ( (LA36_0==119) ) {
                alt36=2;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:31: oscarcd
                    {
                    dbg.location(96,31);
                    pushFollow(FOLLOW_oscarcd_in_method852);
                    oscarcd149=oscarcd();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcd149.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:39: cd
                    {
                    dbg.location(96,39);
                    pushFollow(FOLLOW_cd_in_method854);
                    cd150=cd();

                    state._fsp--;

                    adaptor.addChild(root_0, cd150.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}


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
        dbg.location(96, 45);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:99:1: oscarcd : 'OSCAR-CD' TOKEN ;
    public final ChemicalChunkerParser.oscarcd_return oscarcd() throws RecognitionException {
        ChemicalChunkerParser.oscarcd_return retval = new ChemicalChunkerParser.oscarcd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal151=null;
        Token TOKEN152=null;

        Object string_literal151_tree=null;
        Object TOKEN152_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:99:8: ( 'OSCAR-CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:99:9: 'OSCAR-CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(99,9);
            string_literal151=(Token)match(input,10,FOLLOW_10_in_oscarcd865); 
            string_literal151_tree = (Object)adaptor.create(string_literal151);
            adaptor.addChild(root_0, string_literal151_tree);

            dbg.location(99,20);
            TOKEN152=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcd867); 
            TOKEN152_tree = (Object)adaptor.create(TOKEN152);
            adaptor.addChild(root_0, TOKEN152_tree);


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
        dbg.location(99, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:100:1: oscarcj : 'OSCAR-CJ' TOKEN ;
    public final ChemicalChunkerParser.oscarcj_return oscarcj() throws RecognitionException {
        ChemicalChunkerParser.oscarcj_return retval = new ChemicalChunkerParser.oscarcj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal153=null;
        Token TOKEN154=null;

        Object string_literal153_tree=null;
        Object TOKEN154_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:100:8: ( 'OSCAR-CJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:100:9: 'OSCAR-CJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(100,9);
            string_literal153=(Token)match(input,11,FOLLOW_11_in_oscarcj872); 
            string_literal153_tree = (Object)adaptor.create(string_literal153);
            adaptor.addChild(root_0, string_literal153_tree);

            dbg.location(100,20);
            TOKEN154=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcj874); 
            TOKEN154_tree = (Object)adaptor.create(TOKEN154);
            adaptor.addChild(root_0, TOKEN154_tree);


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
        dbg.location(100, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:101:1: oscaront : 'OSCAR-ONT' TOKEN ;
    public final ChemicalChunkerParser.oscaront_return oscaront() throws RecognitionException {
        ChemicalChunkerParser.oscaront_return retval = new ChemicalChunkerParser.oscaront_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal155=null;
        Token TOKEN156=null;

        Object string_literal155_tree=null;
        Object TOKEN156_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscaront");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:101:9: ( 'OSCAR-ONT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:101:11: 'OSCAR-ONT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(101,11);
            string_literal155=(Token)match(input,12,FOLLOW_12_in_oscaront880); 
            string_literal155_tree = (Object)adaptor.create(string_literal155);
            adaptor.addChild(root_0, string_literal155_tree);

            dbg.location(101,23);
            TOKEN156=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscaront882); 
            TOKEN156_tree = (Object)adaptor.create(TOKEN156);
            adaptor.addChild(root_0, TOKEN156_tree);


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
        dbg.location(101, 28);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:102:1: tmunicode : 'TM-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.tmunicode_return tmunicode() throws RecognitionException {
        ChemicalChunkerParser.tmunicode_return retval = new ChemicalChunkerParser.tmunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal157=null;
        Token TOKEN158=null;

        Object string_literal157_tree=null;
        Object TOKEN158_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "tmunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:102:10: ( 'TM-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:102:11: 'TM-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(102,11);
            string_literal157=(Token)match(input,13,FOLLOW_13_in_tmunicode887); 
            string_literal157_tree = (Object)adaptor.create(string_literal157);
            adaptor.addChild(root_0, string_literal157_tree);

            dbg.location(102,24);
            TOKEN158=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_tmunicode889); 
            TOKEN158_tree = (Object)adaptor.create(TOKEN158);
            adaptor.addChild(root_0, TOKEN158_tree);


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
        dbg.location(102, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:103:1: cdunicode : 'CD-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.cdunicode_return cdunicode() throws RecognitionException {
        ChemicalChunkerParser.cdunicode_return retval = new ChemicalChunkerParser.cdunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal159=null;
        Token TOKEN160=null;

        Object string_literal159_tree=null;
        Object TOKEN160_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cdunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:103:10: ( 'CD-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:103:11: 'CD-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(103,11);
            string_literal159=(Token)match(input,14,FOLLOW_14_in_cdunicode894); 
            string_literal159_tree = (Object)adaptor.create(string_literal159);
            adaptor.addChild(root_0, string_literal159_tree);

            dbg.location(103,24);
            TOKEN160=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cdunicode896); 
            TOKEN160_tree = (Object)adaptor.create(TOKEN160);
            adaptor.addChild(root_0, TOKEN160_tree);


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
        dbg.location(103, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:106:1: inas : 'IN-AS' TOKEN ;
    public final ChemicalChunkerParser.inas_return inas() throws RecognitionException {
        ChemicalChunkerParser.inas_return retval = new ChemicalChunkerParser.inas_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal161=null;
        Token TOKEN162=null;

        Object string_literal161_tree=null;
        Object TOKEN162_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inas");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:106:5: ( 'IN-AS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:106:6: 'IN-AS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(106,6);
            string_literal161=(Token)match(input,15,FOLLOW_15_in_inas903); 
            string_literal161_tree = (Object)adaptor.create(string_literal161);
            adaptor.addChild(root_0, string_literal161_tree);

            dbg.location(106,14);
            TOKEN162=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inas905); 
            TOKEN162_tree = (Object)adaptor.create(TOKEN162);
            adaptor.addChild(root_0, TOKEN162_tree);


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
        dbg.location(106, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:107:1: inbefore : 'IN-BEFORE' TOKEN ;
    public final ChemicalChunkerParser.inbefore_return inbefore() throws RecognitionException {
        ChemicalChunkerParser.inbefore_return retval = new ChemicalChunkerParser.inbefore_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal163=null;
        Token TOKEN164=null;

        Object string_literal163_tree=null;
        Object TOKEN164_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inbefore");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:107:9: ( 'IN-BEFORE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:107:10: 'IN-BEFORE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(107,10);
            string_literal163=(Token)match(input,16,FOLLOW_16_in_inbefore910); 
            string_literal163_tree = (Object)adaptor.create(string_literal163);
            adaptor.addChild(root_0, string_literal163_tree);

            dbg.location(107,22);
            TOKEN164=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inbefore912); 
            TOKEN164_tree = (Object)adaptor.create(TOKEN164);
            adaptor.addChild(root_0, TOKEN164_tree);


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
        dbg.location(107, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:108:1: inafter : 'IN-AFTER' TOKEN ;
    public final ChemicalChunkerParser.inafter_return inafter() throws RecognitionException {
        ChemicalChunkerParser.inafter_return retval = new ChemicalChunkerParser.inafter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal165=null;
        Token TOKEN166=null;

        Object string_literal165_tree=null;
        Object TOKEN166_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inafter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:108:8: ( 'IN-AFTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:108:9: 'IN-AFTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(108,9);
            string_literal165=(Token)match(input,17,FOLLOW_17_in_inafter917); 
            string_literal165_tree = (Object)adaptor.create(string_literal165);
            adaptor.addChild(root_0, string_literal165_tree);

            dbg.location(108,20);
            TOKEN166=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inafter919); 
            TOKEN166_tree = (Object)adaptor.create(TOKEN166);
            adaptor.addChild(root_0, TOKEN166_tree);


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
        dbg.location(108, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:109:1: inin : 'IN-IN' TOKEN ;
    public final ChemicalChunkerParser.inin_return inin() throws RecognitionException {
        ChemicalChunkerParser.inin_return retval = new ChemicalChunkerParser.inin_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal167=null;
        Token TOKEN168=null;

        Object string_literal167_tree=null;
        Object TOKEN168_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inin");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:109:5: ( 'IN-IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:109:6: 'IN-IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(109,6);
            string_literal167=(Token)match(input,18,FOLLOW_18_in_inin924); 
            string_literal167_tree = (Object)adaptor.create(string_literal167);
            adaptor.addChild(root_0, string_literal167_tree);

            dbg.location(109,14);
            TOKEN168=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inin926); 
            TOKEN168_tree = (Object)adaptor.create(TOKEN168);
            adaptor.addChild(root_0, TOKEN168_tree);


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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:110:1: ininto : 'IN-INTO' TOKEN ;
    public final ChemicalChunkerParser.ininto_return ininto() throws RecognitionException {
        ChemicalChunkerParser.ininto_return retval = new ChemicalChunkerParser.ininto_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal169=null;
        Token TOKEN170=null;

        Object string_literal169_tree=null;
        Object TOKEN170_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ininto");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:110:7: ( 'IN-INTO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:110:8: 'IN-INTO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(110,8);
            string_literal169=(Token)match(input,19,FOLLOW_19_in_ininto931); 
            string_literal169_tree = (Object)adaptor.create(string_literal169);
            adaptor.addChild(root_0, string_literal169_tree);

            dbg.location(110,18);
            TOKEN170=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ininto933); 
            TOKEN170_tree = (Object)adaptor.create(TOKEN170);
            adaptor.addChild(root_0, TOKEN170_tree);


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
        dbg.location(110, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:111:1: inwith : 'IN-WITH' TOKEN ;
    public final ChemicalChunkerParser.inwith_return inwith() throws RecognitionException {
        ChemicalChunkerParser.inwith_return retval = new ChemicalChunkerParser.inwith_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal171=null;
        Token TOKEN172=null;

        Object string_literal171_tree=null;
        Object TOKEN172_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:111:7: ( 'IN-WITH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:111:8: 'IN-WITH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(111,8);
            string_literal171=(Token)match(input,20,FOLLOW_20_in_inwith938); 
            string_literal171_tree = (Object)adaptor.create(string_literal171);
            adaptor.addChild(root_0, string_literal171_tree);

            dbg.location(111,18);
            TOKEN172=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwith940); 
            TOKEN172_tree = (Object)adaptor.create(TOKEN172);
            adaptor.addChild(root_0, TOKEN172_tree);


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
        dbg.location(111, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:1: inwithout : 'IN-WITHOUT' TOKEN ;
    public final ChemicalChunkerParser.inwithout_return inwithout() throws RecognitionException {
        ChemicalChunkerParser.inwithout_return retval = new ChemicalChunkerParser.inwithout_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal173=null;
        Token TOKEN174=null;

        Object string_literal173_tree=null;
        Object TOKEN174_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwithout");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:10: ( 'IN-WITHOUT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:11: 'IN-WITHOUT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(112,11);
            string_literal173=(Token)match(input,21,FOLLOW_21_in_inwithout945); 
            string_literal173_tree = (Object)adaptor.create(string_literal173);
            adaptor.addChild(root_0, string_literal173_tree);

            dbg.location(112,24);
            TOKEN174=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwithout947); 
            TOKEN174_tree = (Object)adaptor.create(TOKEN174);
            adaptor.addChild(root_0, TOKEN174_tree);


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
        dbg.location(112, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:1: inby : 'IN-BY' TOKEN ;
    public final ChemicalChunkerParser.inby_return inby() throws RecognitionException {
        ChemicalChunkerParser.inby_return retval = new ChemicalChunkerParser.inby_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal175=null;
        Token TOKEN176=null;

        Object string_literal175_tree=null;
        Object TOKEN176_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inby");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:5: ( 'IN-BY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:6: 'IN-BY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(113,6);
            string_literal175=(Token)match(input,22,FOLLOW_22_in_inby952); 
            string_literal175_tree = (Object)adaptor.create(string_literal175);
            adaptor.addChild(root_0, string_literal175_tree);

            dbg.location(113,14);
            TOKEN176=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inby954); 
            TOKEN176_tree = (Object)adaptor.create(TOKEN176);
            adaptor.addChild(root_0, TOKEN176_tree);


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
        dbg.location(113, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:114:1: invia : 'IN-VIA' TOKEN ;
    public final ChemicalChunkerParser.invia_return invia() throws RecognitionException {
        ChemicalChunkerParser.invia_return retval = new ChemicalChunkerParser.invia_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal177=null;
        Token TOKEN178=null;

        Object string_literal177_tree=null;
        Object TOKEN178_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "invia");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:114:6: ( 'IN-VIA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:114:7: 'IN-VIA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(114,7);
            string_literal177=(Token)match(input,23,FOLLOW_23_in_invia959); 
            string_literal177_tree = (Object)adaptor.create(string_literal177);
            adaptor.addChild(root_0, string_literal177_tree);

            dbg.location(114,16);
            TOKEN178=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_invia961); 
            TOKEN178_tree = (Object)adaptor.create(TOKEN178);
            adaptor.addChild(root_0, TOKEN178_tree);


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
        dbg.location(114, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:1: inof : 'IN-OF' TOKEN ;
    public final ChemicalChunkerParser.inof_return inof() throws RecognitionException {
        ChemicalChunkerParser.inof_return retval = new ChemicalChunkerParser.inof_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal179=null;
        Token TOKEN180=null;

        Object string_literal179_tree=null;
        Object TOKEN180_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inof");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:5: ( 'IN-OF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:6: 'IN-OF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(115,6);
            string_literal179=(Token)match(input,24,FOLLOW_24_in_inof966); 
            string_literal179_tree = (Object)adaptor.create(string_literal179);
            adaptor.addChild(root_0, string_literal179_tree);

            dbg.location(115,14);
            TOKEN180=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inof968); 
            TOKEN180_tree = (Object)adaptor.create(TOKEN180);
            adaptor.addChild(root_0, TOKEN180_tree);


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
        dbg.location(115, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:1: inon : 'IN-ON' TOKEN ;
    public final ChemicalChunkerParser.inon_return inon() throws RecognitionException {
        ChemicalChunkerParser.inon_return retval = new ChemicalChunkerParser.inon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal181=null;
        Token TOKEN182=null;

        Object string_literal181_tree=null;
        Object TOKEN182_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:5: ( 'IN-ON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:6: 'IN-ON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(116,6);
            string_literal181=(Token)match(input,25,FOLLOW_25_in_inon973); 
            string_literal181_tree = (Object)adaptor.create(string_literal181);
            adaptor.addChild(root_0, string_literal181_tree);

            dbg.location(116,14);
            TOKEN182=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inon975); 
            TOKEN182_tree = (Object)adaptor.create(TOKEN182);
            adaptor.addChild(root_0, TOKEN182_tree);


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
        dbg.location(116, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:117:1: infor : 'IN-FOR' TOKEN ;
    public final ChemicalChunkerParser.infor_return infor() throws RecognitionException {
        ChemicalChunkerParser.infor_return retval = new ChemicalChunkerParser.infor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal183=null;
        Token TOKEN184=null;

        Object string_literal183_tree=null;
        Object TOKEN184_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:117:6: ( 'IN-FOR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:117:7: 'IN-FOR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(117,7);
            string_literal183=(Token)match(input,26,FOLLOW_26_in_infor980); 
            string_literal183_tree = (Object)adaptor.create(string_literal183);
            adaptor.addChild(root_0, string_literal183_tree);

            dbg.location(117,16);
            TOKEN184=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infor982); 
            TOKEN184_tree = (Object)adaptor.create(TOKEN184);
            adaptor.addChild(root_0, TOKEN184_tree);


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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:118:1: infrom : 'IN-FROM' TOKEN ;
    public final ChemicalChunkerParser.infrom_return infrom() throws RecognitionException {
        ChemicalChunkerParser.infrom_return retval = new ChemicalChunkerParser.infrom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal185=null;
        Token TOKEN186=null;

        Object string_literal185_tree=null;
        Object TOKEN186_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infrom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:118:7: ( 'IN-FROM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:118:8: 'IN-FROM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(118,8);
            string_literal185=(Token)match(input,27,FOLLOW_27_in_infrom987); 
            string_literal185_tree = (Object)adaptor.create(string_literal185);
            adaptor.addChild(root_0, string_literal185_tree);

            dbg.location(118,18);
            TOKEN186=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infrom989); 
            TOKEN186_tree = (Object)adaptor.create(TOKEN186);
            adaptor.addChild(root_0, TOKEN186_tree);


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
        dbg.location(118, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:1: inunder : 'IN-UNDER' TOKEN ;
    public final ChemicalChunkerParser.inunder_return inunder() throws RecognitionException {
        ChemicalChunkerParser.inunder_return retval = new ChemicalChunkerParser.inunder_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal187=null;
        Token TOKEN188=null;

        Object string_literal187_tree=null;
        Object TOKEN188_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inunder");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:8: ( 'IN-UNDER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:9: 'IN-UNDER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(119,9);
            string_literal187=(Token)match(input,28,FOLLOW_28_in_inunder994); 
            string_literal187_tree = (Object)adaptor.create(string_literal187);
            adaptor.addChild(root_0, string_literal187_tree);

            dbg.location(119,20);
            TOKEN188=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inunder996); 
            TOKEN188_tree = (Object)adaptor.create(TOKEN188);
            adaptor.addChild(root_0, TOKEN188_tree);


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
        dbg.location(119, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:1: inover : 'IN-OVER' TOKEN ;
    public final ChemicalChunkerParser.inover_return inover() throws RecognitionException {
        ChemicalChunkerParser.inover_return retval = new ChemicalChunkerParser.inover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal189=null;
        Token TOKEN190=null;

        Object string_literal189_tree=null;
        Object TOKEN190_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:7: ( 'IN-OVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:8: 'IN-OVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(120,8);
            string_literal189=(Token)match(input,29,FOLLOW_29_in_inover1001); 
            string_literal189_tree = (Object)adaptor.create(string_literal189);
            adaptor.addChild(root_0, string_literal189_tree);

            dbg.location(120,18);
            TOKEN190=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inover1003); 
            TOKEN190_tree = (Object)adaptor.create(TOKEN190);
            adaptor.addChild(root_0, TOKEN190_tree);


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
        dbg.location(120, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:1: inoff : 'IN-OFF' TOKEN ;
    public final ChemicalChunkerParser.inoff_return inoff() throws RecognitionException {
        ChemicalChunkerParser.inoff_return retval = new ChemicalChunkerParser.inoff_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal191=null;
        Token TOKEN192=null;

        Object string_literal191_tree=null;
        Object TOKEN192_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inoff");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:6: ( 'IN-OFF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:7: 'IN-OFF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(121,7);
            string_literal191=(Token)match(input,30,FOLLOW_30_in_inoff1008); 
            string_literal191_tree = (Object)adaptor.create(string_literal191);
            adaptor.addChild(root_0, string_literal191_tree);

            dbg.location(121,16);
            TOKEN192=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inoff1010); 
            TOKEN192_tree = (Object)adaptor.create(TOKEN192);
            adaptor.addChild(root_0, TOKEN192_tree);


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
        dbg.location(121, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:124:1: nnstate : 'NN-STATE' TOKEN ;
    public final ChemicalChunkerParser.nnstate_return nnstate() throws RecognitionException {
        ChemicalChunkerParser.nnstate_return retval = new ChemicalChunkerParser.nnstate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal193=null;
        Token TOKEN194=null;

        Object string_literal193_tree=null;
        Object TOKEN194_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnstate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:124:8: ( 'NN-STATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:124:9: 'NN-STATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(124,9);
            string_literal193=(Token)match(input,31,FOLLOW_31_in_nnstate1017); 
            string_literal193_tree = (Object)adaptor.create(string_literal193);
            adaptor.addChild(root_0, string_literal193_tree);

            dbg.location(124,20);
            TOKEN194=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnstate1019); 
            TOKEN194_tree = (Object)adaptor.create(TOKEN194);
            adaptor.addChild(root_0, TOKEN194_tree);


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
        dbg.location(124, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:125:1: nntime : 'NN-TIME' TOKEN ;
    public final ChemicalChunkerParser.nntime_return nntime() throws RecognitionException {
        ChemicalChunkerParser.nntime_return retval = new ChemicalChunkerParser.nntime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal195=null;
        Token TOKEN196=null;

        Object string_literal195_tree=null;
        Object TOKEN196_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:125:7: ( 'NN-TIME' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:125:8: 'NN-TIME' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(125,8);
            string_literal195=(Token)match(input,32,FOLLOW_32_in_nntime1024); 
            string_literal195_tree = (Object)adaptor.create(string_literal195);
            adaptor.addChild(root_0, string_literal195_tree);

            dbg.location(125,18);
            TOKEN196=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntime1026); 
            TOKEN196_tree = (Object)adaptor.create(TOKEN196);
            adaptor.addChild(root_0, TOKEN196_tree);


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
        dbg.location(125, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:1: nngram : 'NN-GRAM' TOKEN ;
    public final ChemicalChunkerParser.nngram_return nngram() throws RecognitionException {
        ChemicalChunkerParser.nngram_return retval = new ChemicalChunkerParser.nngram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal197=null;
        Token TOKEN198=null;

        Object string_literal197_tree=null;
        Object TOKEN198_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:7: ( 'NN-GRAM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:8: 'NN-GRAM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(126,8);
            string_literal197=(Token)match(input,33,FOLLOW_33_in_nngram1031); 
            string_literal197_tree = (Object)adaptor.create(string_literal197);
            adaptor.addChild(root_0, string_literal197_tree);

            dbg.location(126,18);
            TOKEN198=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngram1033); 
            TOKEN198_tree = (Object)adaptor.create(TOKEN198);
            adaptor.addChild(root_0, TOKEN198_tree);


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
        dbg.location(126, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:1: nnmol : 'NN-MOL' TOKEN ;
    public final ChemicalChunkerParser.nnmol_return nnmol() throws RecognitionException {
        ChemicalChunkerParser.nnmol_return retval = new ChemicalChunkerParser.nnmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal199=null;
        Token TOKEN200=null;

        Object string_literal199_tree=null;
        Object TOKEN200_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:6: ( 'NN-MOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:7: 'NN-MOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(127,7);
            string_literal199=(Token)match(input,34,FOLLOW_34_in_nnmol1038); 
            string_literal199_tree = (Object)adaptor.create(string_literal199);
            adaptor.addChild(root_0, string_literal199_tree);

            dbg.location(127,16);
            TOKEN200=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmol1040); 
            TOKEN200_tree = (Object)adaptor.create(TOKEN200);
            adaptor.addChild(root_0, TOKEN200_tree);


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
        dbg.location(127, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:1: nnatmosphere : 'NN-ATMOSPHERE' TOKEN ;
    public final ChemicalChunkerParser.nnatmosphere_return nnatmosphere() throws RecognitionException {
        ChemicalChunkerParser.nnatmosphere_return retval = new ChemicalChunkerParser.nnatmosphere_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal201=null;
        Token TOKEN202=null;

        Object string_literal201_tree=null;
        Object TOKEN202_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnatmosphere");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:13: ( 'NN-ATMOSPHERE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:14: 'NN-ATMOSPHERE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,14);
            string_literal201=(Token)match(input,35,FOLLOW_35_in_nnatmosphere1045); 
            string_literal201_tree = (Object)adaptor.create(string_literal201);
            adaptor.addChild(root_0, string_literal201_tree);

            dbg.location(128,30);
            TOKEN202=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnatmosphere1047); 
            TOKEN202_tree = (Object)adaptor.create(TOKEN202);
            adaptor.addChild(root_0, TOKEN202_tree);


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
        dbg.location(128, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:1: nneq : 'NN-EQ' TOKEN ;
    public final ChemicalChunkerParser.nneq_return nneq() throws RecognitionException {
        ChemicalChunkerParser.nneq_return retval = new ChemicalChunkerParser.nneq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal203=null;
        Token TOKEN204=null;

        Object string_literal203_tree=null;
        Object TOKEN204_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nneq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:5: ( 'NN-EQ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:6: 'NN-EQ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(129,6);
            string_literal203=(Token)match(input,36,FOLLOW_36_in_nneq1052); 
            string_literal203_tree = (Object)adaptor.create(string_literal203);
            adaptor.addChild(root_0, string_literal203_tree);

            dbg.location(129,14);
            TOKEN204=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nneq1054); 
            TOKEN204_tree = (Object)adaptor.create(TOKEN204);
            adaptor.addChild(root_0, TOKEN204_tree);


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
        dbg.location(129, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:1: nnvol : 'NN-VOL' TOKEN ;
    public final ChemicalChunkerParser.nnvol_return nnvol() throws RecognitionException {
        ChemicalChunkerParser.nnvol_return retval = new ChemicalChunkerParser.nnvol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal205=null;
        Token TOKEN206=null;

        Object string_literal205_tree=null;
        Object TOKEN206_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(130, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:6: ( 'NN-VOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:7: 'NN-VOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(130,7);
            string_literal205=(Token)match(input,37,FOLLOW_37_in_nnvol1059); 
            string_literal205_tree = (Object)adaptor.create(string_literal205);
            adaptor.addChild(root_0, string_literal205_tree);

            dbg.location(130,16);
            TOKEN206=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvol1061); 
            TOKEN206_tree = (Object)adaptor.create(TOKEN206);
            adaptor.addChild(root_0, TOKEN206_tree);


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
        dbg.location(130, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:1: nnchementity : 'NN-CHEMENTITY' TOKEN ;
    public final ChemicalChunkerParser.nnchementity_return nnchementity() throws RecognitionException {
        ChemicalChunkerParser.nnchementity_return retval = new ChemicalChunkerParser.nnchementity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal207=null;
        Token TOKEN208=null;

        Object string_literal207_tree=null;
        Object TOKEN208_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchementity");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:13: ( 'NN-CHEMENTITY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:14: 'NN-CHEMENTITY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(131,14);
            string_literal207=(Token)match(input,38,FOLLOW_38_in_nnchementity1066); 
            string_literal207_tree = (Object)adaptor.create(string_literal207);
            adaptor.addChild(root_0, string_literal207_tree);

            dbg.location(131,30);
            TOKEN208=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchementity1068); 
            TOKEN208_tree = (Object)adaptor.create(TOKEN208);
            adaptor.addChild(root_0, TOKEN208_tree);


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
        dbg.location(131, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:1: nntemp : 'NN-TEMP' TOKEN ;
    public final ChemicalChunkerParser.nntemp_return nntemp() throws RecognitionException {
        ChemicalChunkerParser.nntemp_return retval = new ChemicalChunkerParser.nntemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal209=null;
        Token TOKEN210=null;

        Object string_literal209_tree=null;
        Object TOKEN210_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:7: ( 'NN-TEMP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:8: 'NN-TEMP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(132,8);
            string_literal209=(Token)match(input,39,FOLLOW_39_in_nntemp1073); 
            string_literal209_tree = (Object)adaptor.create(string_literal209);
            adaptor.addChild(root_0, string_literal209_tree);

            dbg.location(132,18);
            TOKEN210=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntemp1075); 
            TOKEN210_tree = (Object)adaptor.create(TOKEN210);
            adaptor.addChild(root_0, TOKEN210_tree);


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
        dbg.location(132, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:1: nnflash : 'NN-FLASH' TOKEN ;
    public final ChemicalChunkerParser.nnflash_return nnflash() throws RecognitionException {
        ChemicalChunkerParser.nnflash_return retval = new ChemicalChunkerParser.nnflash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal211=null;
        Token TOKEN212=null;

        Object string_literal211_tree=null;
        Object TOKEN212_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnflash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:8: ( 'NN-FLASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:9: 'NN-FLASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(133,9);
            string_literal211=(Token)match(input,40,FOLLOW_40_in_nnflash1080); 
            string_literal211_tree = (Object)adaptor.create(string_literal211);
            adaptor.addChild(root_0, string_literal211_tree);

            dbg.location(133,20);
            TOKEN212=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnflash1082); 
            TOKEN212_tree = (Object)adaptor.create(TOKEN212);
            adaptor.addChild(root_0, TOKEN212_tree);


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
        dbg.location(133, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:1: nngeneral : 'NN-GENERAL' TOKEN ;
    public final ChemicalChunkerParser.nngeneral_return nngeneral() throws RecognitionException {
        ChemicalChunkerParser.nngeneral_return retval = new ChemicalChunkerParser.nngeneral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal213=null;
        Token TOKEN214=null;

        Object string_literal213_tree=null;
        Object TOKEN214_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngeneral");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:10: ( 'NN-GENERAL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:11: 'NN-GENERAL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(134,11);
            string_literal213=(Token)match(input,41,FOLLOW_41_in_nngeneral1087); 
            string_literal213_tree = (Object)adaptor.create(string_literal213);
            adaptor.addChild(root_0, string_literal213_tree);

            dbg.location(134,24);
            TOKEN214=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngeneral1089); 
            TOKEN214_tree = (Object)adaptor.create(TOKEN214);
            adaptor.addChild(root_0, TOKEN214_tree);


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
        dbg.location(134, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:1: nnmethod : 'NN-METHOD' TOKEN ;
    public final ChemicalChunkerParser.nnmethod_return nnmethod() throws RecognitionException {
        ChemicalChunkerParser.nnmethod_return retval = new ChemicalChunkerParser.nnmethod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal215=null;
        Token TOKEN216=null;

        Object string_literal215_tree=null;
        Object TOKEN216_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmethod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:9: ( 'NN-METHOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:10: 'NN-METHOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(135,10);
            string_literal215=(Token)match(input,42,FOLLOW_42_in_nnmethod1094); 
            string_literal215_tree = (Object)adaptor.create(string_literal215);
            adaptor.addChild(root_0, string_literal215_tree);

            dbg.location(135,22);
            TOKEN216=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmethod1096); 
            TOKEN216_tree = (Object)adaptor.create(TOKEN216);
            adaptor.addChild(root_0, TOKEN216_tree);


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
        dbg.location(135, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:1: nnamount : 'NN-AMOUNT' TOKEN ;
    public final ChemicalChunkerParser.nnamount_return nnamount() throws RecognitionException {
        ChemicalChunkerParser.nnamount_return retval = new ChemicalChunkerParser.nnamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal217=null;
        Token TOKEN218=null;

        Object string_literal217_tree=null;
        Object TOKEN218_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:9: ( 'NN-AMOUNT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:10: 'NN-AMOUNT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(136,10);
            string_literal217=(Token)match(input,43,FOLLOW_43_in_nnamount1101); 
            string_literal217_tree = (Object)adaptor.create(string_literal217);
            adaptor.addChild(root_0, string_literal217_tree);

            dbg.location(136,22);
            TOKEN218=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnamount1103); 
            TOKEN218_tree = (Object)adaptor.create(TOKEN218);
            adaptor.addChild(root_0, TOKEN218_tree);


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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:1: nnpressure : 'NN-PRESSURE' TOKEN ;
    public final ChemicalChunkerParser.nnpressure_return nnpressure() throws RecognitionException {
        ChemicalChunkerParser.nnpressure_return retval = new ChemicalChunkerParser.nnpressure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal219=null;
        Token TOKEN220=null;

        Object string_literal219_tree=null;
        Object TOKEN220_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpressure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:11: ( 'NN-PRESSURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:12: 'NN-PRESSURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(137,12);
            string_literal219=(Token)match(input,44,FOLLOW_44_in_nnpressure1108); 
            string_literal219_tree = (Object)adaptor.create(string_literal219);
            adaptor.addChild(root_0, string_literal219_tree);

            dbg.location(137,26);
            TOKEN220=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpressure1110); 
            TOKEN220_tree = (Object)adaptor.create(TOKEN220);
            adaptor.addChild(root_0, TOKEN220_tree);


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
        dbg.location(137, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:1: nncolumn : 'NN-COLUMN' TOKEN ;
    public final ChemicalChunkerParser.nncolumn_return nncolumn() throws RecognitionException {
        ChemicalChunkerParser.nncolumn_return retval = new ChemicalChunkerParser.nncolumn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal221=null;
        Token TOKEN222=null;

        Object string_literal221_tree=null;
        Object TOKEN222_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncolumn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:9: ( 'NN-COLUMN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:10: 'NN-COLUMN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(138,10);
            string_literal221=(Token)match(input,45,FOLLOW_45_in_nncolumn1115); 
            string_literal221_tree = (Object)adaptor.create(string_literal221);
            adaptor.addChild(root_0, string_literal221_tree);

            dbg.location(138,22);
            TOKEN222=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncolumn1117); 
            TOKEN222_tree = (Object)adaptor.create(TOKEN222);
            adaptor.addChild(root_0, TOKEN222_tree);


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
        dbg.location(138, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:1: nnchromatography : 'NN-CHROMATOGRAPHY' TOKEN ;
    public final ChemicalChunkerParser.nnchromatography_return nnchromatography() throws RecognitionException {
        ChemicalChunkerParser.nnchromatography_return retval = new ChemicalChunkerParser.nnchromatography_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal223=null;
        Token TOKEN224=null;

        Object string_literal223_tree=null;
        Object TOKEN224_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchromatography");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:17: ( 'NN-CHROMATOGRAPHY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:18: 'NN-CHROMATOGRAPHY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,18);
            string_literal223=(Token)match(input,46,FOLLOW_46_in_nnchromatography1122); 
            string_literal223_tree = (Object)adaptor.create(string_literal223);
            adaptor.addChild(root_0, string_literal223_tree);

            dbg.location(139,38);
            TOKEN224=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchromatography1124); 
            TOKEN224_tree = (Object)adaptor.create(TOKEN224);
            adaptor.addChild(root_0, TOKEN224_tree);


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
        dbg.location(139, 43);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:1: nnvacuum : 'NN-VACUUM' TOKEN ;
    public final ChemicalChunkerParser.nnvacuum_return nnvacuum() throws RecognitionException {
        ChemicalChunkerParser.nnvacuum_return retval = new ChemicalChunkerParser.nnvacuum_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal225=null;
        Token TOKEN226=null;

        Object string_literal225_tree=null;
        Object TOKEN226_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvacuum");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:9: ( 'NN-VACUUM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:10: 'NN-VACUUM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(140,10);
            string_literal225=(Token)match(input,47,FOLLOW_47_in_nnvacuum1129); 
            string_literal225_tree = (Object)adaptor.create(string_literal225);
            adaptor.addChild(root_0, string_literal225_tree);

            dbg.location(140,22);
            TOKEN226=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvacuum1131); 
            TOKEN226_tree = (Object)adaptor.create(TOKEN226);
            adaptor.addChild(root_0, TOKEN226_tree);


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
        dbg.location(140, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:141:1: nncycle : 'NN-CYCLE' TOKEN ;
    public final ChemicalChunkerParser.nncycle_return nncycle() throws RecognitionException {
        ChemicalChunkerParser.nncycle_return retval = new ChemicalChunkerParser.nncycle_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal227=null;
        Token TOKEN228=null;

        Object string_literal227_tree=null;
        Object TOKEN228_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncycle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:141:8: ( 'NN-CYCLE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:141:9: 'NN-CYCLE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(141,9);
            string_literal227=(Token)match(input,48,FOLLOW_48_in_nncycle1136); 
            string_literal227_tree = (Object)adaptor.create(string_literal227);
            adaptor.addChild(root_0, string_literal227_tree);

            dbg.location(141,20);
            TOKEN228=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncycle1138); 
            TOKEN228_tree = (Object)adaptor.create(TOKEN228);
            adaptor.addChild(root_0, TOKEN228_tree);


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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:142:1: nntimes : 'NN-TIMES' TOKEN ;
    public final ChemicalChunkerParser.nntimes_return nntimes() throws RecognitionException {
        ChemicalChunkerParser.nntimes_return retval = new ChemicalChunkerParser.nntimes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal229=null;
        Token TOKEN230=null;

        Object string_literal229_tree=null;
        Object TOKEN230_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntimes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:142:8: ( 'NN-TIMES' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:142:9: 'NN-TIMES' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(142,9);
            string_literal229=(Token)match(input,49,FOLLOW_49_in_nntimes1143); 
            string_literal229_tree = (Object)adaptor.create(string_literal229);
            adaptor.addChild(root_0, string_literal229_tree);

            dbg.location(142,20);
            TOKEN230=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntimes1145); 
            TOKEN230_tree = (Object)adaptor.create(TOKEN230);
            adaptor.addChild(root_0, TOKEN230_tree);


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
        dbg.location(142, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:1: oscarcm : 'OSCAR-CM' TOKEN ;
    public final ChemicalChunkerParser.oscarcm_return oscarcm() throws RecognitionException {
        ChemicalChunkerParser.oscarcm_return retval = new ChemicalChunkerParser.oscarcm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal231=null;
        Token TOKEN232=null;

        Object string_literal231_tree=null;
        Object TOKEN232_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:8: ( 'OSCAR-CM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:9: 'OSCAR-CM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(145,9);
            string_literal231=(Token)match(input,50,FOLLOW_50_in_oscarcm1152); 
            string_literal231_tree = (Object)adaptor.create(string_literal231);
            adaptor.addChild(root_0, string_literal231_tree);

            dbg.location(145,20);
            TOKEN232=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcm1154); 
            TOKEN232_tree = (Object)adaptor.create(TOKEN232);
            adaptor.addChild(root_0, TOKEN232_tree);


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
        dbg.location(145, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:1: vbuse : 'VB-USE' TOKEN ;
    public final ChemicalChunkerParser.vbuse_return vbuse() throws RecognitionException {
        ChemicalChunkerParser.vbuse_return retval = new ChemicalChunkerParser.vbuse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal233=null;
        Token TOKEN234=null;

        Object string_literal233_tree=null;
        Object TOKEN234_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbuse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:6: ( 'VB-USE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:7: 'VB-USE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(148,7);
            string_literal233=(Token)match(input,51,FOLLOW_51_in_vbuse1161); 
            string_literal233_tree = (Object)adaptor.create(string_literal233);
            adaptor.addChild(root_0, string_literal233_tree);

            dbg.location(148,16);
            TOKEN234=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbuse1163); 
            TOKEN234_tree = (Object)adaptor.create(TOKEN234);
            adaptor.addChild(root_0, TOKEN234_tree);


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
        dbg.location(148, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:1: vbchange : 'VB-CHANGE' TOKEN ;
    public final ChemicalChunkerParser.vbchange_return vbchange() throws RecognitionException {
        ChemicalChunkerParser.vbchange_return retval = new ChemicalChunkerParser.vbchange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal235=null;
        Token TOKEN236=null;

        Object string_literal235_tree=null;
        Object TOKEN236_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbchange");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:9: ( 'VB-CHANGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:10: 'VB-CHANGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(149,10);
            string_literal235=(Token)match(input,52,FOLLOW_52_in_vbchange1168); 
            string_literal235_tree = (Object)adaptor.create(string_literal235);
            adaptor.addChild(root_0, string_literal235_tree);

            dbg.location(149,22);
            TOKEN236=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbchange1170); 
            TOKEN236_tree = (Object)adaptor.create(TOKEN236);
            adaptor.addChild(root_0, TOKEN236_tree);


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
        dbg.location(149, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:1: vbsubmerge : 'VB-SUBMERGE' TOKEN ;
    public final ChemicalChunkerParser.vbsubmerge_return vbsubmerge() throws RecognitionException {
        ChemicalChunkerParser.vbsubmerge_return retval = new ChemicalChunkerParser.vbsubmerge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal237=null;
        Token TOKEN238=null;

        Object string_literal237_tree=null;
        Object TOKEN238_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubmerge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:11: ( 'VB-SUBMERGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:12: 'VB-SUBMERGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(150,12);
            string_literal237=(Token)match(input,53,FOLLOW_53_in_vbsubmerge1175); 
            string_literal237_tree = (Object)adaptor.create(string_literal237);
            adaptor.addChild(root_0, string_literal237_tree);

            dbg.location(150,26);
            TOKEN238=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubmerge1177); 
            TOKEN238_tree = (Object)adaptor.create(TOKEN238);
            adaptor.addChild(root_0, TOKEN238_tree);


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
        dbg.location(150, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:1: vbsubject : 'VB-SUBJECT' TOKEN ;
    public final ChemicalChunkerParser.vbsubject_return vbsubject() throws RecognitionException {
        ChemicalChunkerParser.vbsubject_return retval = new ChemicalChunkerParser.vbsubject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal239=null;
        Token TOKEN240=null;

        Object string_literal239_tree=null;
        Object TOKEN240_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubject");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:10: ( 'VB-SUBJECT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:11: 'VB-SUBJECT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(151,11);
            string_literal239=(Token)match(input,54,FOLLOW_54_in_vbsubject1182); 
            string_literal239_tree = (Object)adaptor.create(string_literal239);
            adaptor.addChild(root_0, string_literal239_tree);

            dbg.location(151,24);
            TOKEN240=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubject1184); 
            TOKEN240_tree = (Object)adaptor.create(TOKEN240);
            adaptor.addChild(root_0, TOKEN240_tree);


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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:1: nnadd : 'NN-ADD' TOKEN ;
    public final ChemicalChunkerParser.nnadd_return nnadd() throws RecognitionException {
        ChemicalChunkerParser.nnadd_return retval = new ChemicalChunkerParser.nnadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal241=null;
        Token TOKEN242=null;

        Object string_literal241_tree=null;
        Object TOKEN242_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:6: ( 'NN-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:7: 'NN-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(154,7);
            string_literal241=(Token)match(input,55,FOLLOW_55_in_nnadd1191); 
            string_literal241_tree = (Object)adaptor.create(string_literal241);
            adaptor.addChild(root_0, string_literal241_tree);

            dbg.location(154,16);
            TOKEN242=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnadd1193); 
            TOKEN242_tree = (Object)adaptor.create(TOKEN242);
            adaptor.addChild(root_0, TOKEN242_tree);


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
        dbg.location(154, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:1: nnmixture : 'NN-MIXTURE' TOKEN ;
    public final ChemicalChunkerParser.nnmixture_return nnmixture() throws RecognitionException {
        ChemicalChunkerParser.nnmixture_return retval = new ChemicalChunkerParser.nnmixture_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal243=null;
        Token TOKEN244=null;

        Object string_literal243_tree=null;
        Object TOKEN244_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:10: ( 'NN-MIXTURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:11: 'NN-MIXTURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(155,11);
            string_literal243=(Token)match(input,56,FOLLOW_56_in_nnmixture1198); 
            string_literal243_tree = (Object)adaptor.create(string_literal243);
            adaptor.addChild(root_0, string_literal243_tree);

            dbg.location(155,24);
            TOKEN244=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmixture1200); 
            TOKEN244_tree = (Object)adaptor.create(TOKEN244);
            adaptor.addChild(root_0, TOKEN244_tree);


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
        dbg.location(155, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:1: vbadd : 'VB-ADD' TOKEN ;
    public final ChemicalChunkerParser.vbadd_return vbadd() throws RecognitionException {
        ChemicalChunkerParser.vbadd_return retval = new ChemicalChunkerParser.vbadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal245=null;
        Token TOKEN246=null;

        Object string_literal245_tree=null;
        Object TOKEN246_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:6: ( 'VB-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:7: 'VB-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,7);
            string_literal245=(Token)match(input,57,FOLLOW_57_in_vbadd1205); 
            string_literal245_tree = (Object)adaptor.create(string_literal245);
            adaptor.addChild(root_0, string_literal245_tree);

            dbg.location(156,16);
            TOKEN246=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbadd1207); 
            TOKEN246_tree = (Object)adaptor.create(TOKEN246);
            adaptor.addChild(root_0, TOKEN246_tree);


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
        dbg.location(156, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:1: vbcharge : 'VB-CHARGE' TOKEN ;
    public final ChemicalChunkerParser.vbcharge_return vbcharge() throws RecognitionException {
        ChemicalChunkerParser.vbcharge_return retval = new ChemicalChunkerParser.vbcharge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal247=null;
        Token TOKEN248=null;

        Object string_literal247_tree=null;
        Object TOKEN248_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcharge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:9: ( 'VB-CHARGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:10: 'VB-CHARGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(157,10);
            string_literal247=(Token)match(input,58,FOLLOW_58_in_vbcharge1212); 
            string_literal247_tree = (Object)adaptor.create(string_literal247);
            adaptor.addChild(root_0, string_literal247_tree);

            dbg.location(157,22);
            TOKEN248=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcharge1214); 
            TOKEN248_tree = (Object)adaptor.create(TOKEN248);
            adaptor.addChild(root_0, TOKEN248_tree);


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
        dbg.location(157, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:1: vbcontain : 'VB-CONTAIN' TOKEN ;
    public final ChemicalChunkerParser.vbcontain_return vbcontain() throws RecognitionException {
        ChemicalChunkerParser.vbcontain_return retval = new ChemicalChunkerParser.vbcontain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal249=null;
        Token TOKEN250=null;

        Object string_literal249_tree=null;
        Object TOKEN250_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcontain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:10: ( 'VB-CONTAIN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:11: 'VB-CONTAIN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(158,11);
            string_literal249=(Token)match(input,59,FOLLOW_59_in_vbcontain1219); 
            string_literal249_tree = (Object)adaptor.create(string_literal249);
            adaptor.addChild(root_0, string_literal249_tree);

            dbg.location(158,24);
            TOKEN250=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcontain1221); 
            TOKEN250_tree = (Object)adaptor.create(TOKEN250);
            adaptor.addChild(root_0, TOKEN250_tree);


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
        dbg.location(158, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:1: vbdrop : 'VB-DROP' TOKEN ;
    public final ChemicalChunkerParser.vbdrop_return vbdrop() throws RecognitionException {
        ChemicalChunkerParser.vbdrop_return retval = new ChemicalChunkerParser.vbdrop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal251=null;
        Token TOKEN252=null;

        Object string_literal251_tree=null;
        Object TOKEN252_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdrop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:7: ( 'VB-DROP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:8: 'VB-DROP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(159,8);
            string_literal251=(Token)match(input,60,FOLLOW_60_in_vbdrop1226); 
            string_literal251_tree = (Object)adaptor.create(string_literal251);
            adaptor.addChild(root_0, string_literal251_tree);

            dbg.location(159,18);
            TOKEN252=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdrop1228); 
            TOKEN252_tree = (Object)adaptor.create(TOKEN252);
            adaptor.addChild(root_0, TOKEN252_tree);


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
        dbg.location(159, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:1: vbfill : 'VB-FILL' TOKEN ;
    public final ChemicalChunkerParser.vbfill_return vbfill() throws RecognitionException {
        ChemicalChunkerParser.vbfill_return retval = new ChemicalChunkerParser.vbfill_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal253=null;
        Token TOKEN254=null;

        Object string_literal253_tree=null;
        Object TOKEN254_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfill");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:7: ( 'VB-FILL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:8: 'VB-FILL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(160,8);
            string_literal253=(Token)match(input,61,FOLLOW_61_in_vbfill1233); 
            string_literal253_tree = (Object)adaptor.create(string_literal253);
            adaptor.addChild(root_0, string_literal253_tree);

            dbg.location(160,18);
            TOKEN254=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfill1235); 
            TOKEN254_tree = (Object)adaptor.create(TOKEN254);
            adaptor.addChild(root_0, TOKEN254_tree);


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
        dbg.location(160, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:1: vbsuspend : 'VB-SUSPEND' TOKEN ;
    public final ChemicalChunkerParser.vbsuspend_return vbsuspend() throws RecognitionException {
        ChemicalChunkerParser.vbsuspend_return retval = new ChemicalChunkerParser.vbsuspend_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal255=null;
        Token TOKEN256=null;

        Object string_literal255_tree=null;
        Object TOKEN256_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsuspend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:10: ( 'VB-SUSPEND' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:11: 'VB-SUSPEND' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(161,11);
            string_literal255=(Token)match(input,62,FOLLOW_62_in_vbsuspend1240); 
            string_literal255_tree = (Object)adaptor.create(string_literal255);
            adaptor.addChild(root_0, string_literal255_tree);

            dbg.location(161,24);
            TOKEN256=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsuspend1242); 
            TOKEN256_tree = (Object)adaptor.create(TOKEN256);
            adaptor.addChild(root_0, TOKEN256_tree);


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
        dbg.location(161, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:162:1: vbtreat : 'VB-TREAT' TOKEN ;
    public final ChemicalChunkerParser.vbtreat_return vbtreat() throws RecognitionException {
        ChemicalChunkerParser.vbtreat_return retval = new ChemicalChunkerParser.vbtreat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal257=null;
        Token TOKEN258=null;

        Object string_literal257_tree=null;
        Object TOKEN258_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtreat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(162, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:162:8: ( 'VB-TREAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:162:9: 'VB-TREAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(162,9);
            string_literal257=(Token)match(input,63,FOLLOW_63_in_vbtreat1247); 
            string_literal257_tree = (Object)adaptor.create(string_literal257);
            adaptor.addChild(root_0, string_literal257_tree);

            dbg.location(162,20);
            TOKEN258=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtreat1249); 
            TOKEN258_tree = (Object)adaptor.create(TOKEN258);
            adaptor.addChild(root_0, TOKEN258_tree);


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
        dbg.location(162, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:165:1: vbapparatus : 'VB-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.vbapparatus_return vbapparatus() throws RecognitionException {
        ChemicalChunkerParser.vbapparatus_return retval = new ChemicalChunkerParser.vbapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal259=null;
        Token TOKEN260=null;

        Object string_literal259_tree=null;
        Object TOKEN260_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(165, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:165:12: ( 'VB-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:165:13: 'VB-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(165,13);
            string_literal259=(Token)match(input,64,FOLLOW_64_in_vbapparatus1256); 
            string_literal259_tree = (Object)adaptor.create(string_literal259);
            adaptor.addChild(root_0, string_literal259_tree);

            dbg.location(165,28);
            TOKEN260=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbapparatus1258); 
            TOKEN260_tree = (Object)adaptor.create(TOKEN260);
            adaptor.addChild(root_0, TOKEN260_tree);


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
        dbg.location(165, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:166:1: nnapparatus : 'NN-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.nnapparatus_return nnapparatus() throws RecognitionException {
        ChemicalChunkerParser.nnapparatus_return retval = new ChemicalChunkerParser.nnapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal261=null;
        Token TOKEN262=null;

        Object string_literal261_tree=null;
        Object TOKEN262_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:166:12: ( 'NN-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:166:13: 'NN-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(166,13);
            string_literal261=(Token)match(input,65,FOLLOW_65_in_nnapparatus1263); 
            string_literal261_tree = (Object)adaptor.create(string_literal261);
            adaptor.addChild(root_0, string_literal261_tree);

            dbg.location(166,28);
            TOKEN262=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnapparatus1265); 
            TOKEN262_tree = (Object)adaptor.create(TOKEN262);
            adaptor.addChild(root_0, TOKEN262_tree);


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
        dbg.location(166, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:1: vbconcentrate : 'VB-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.vbconcentrate_return vbconcentrate() throws RecognitionException {
        ChemicalChunkerParser.vbconcentrate_return retval = new ChemicalChunkerParser.vbconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal263=null;
        Token TOKEN264=null;

        Object string_literal263_tree=null;
        Object TOKEN264_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:14: ( 'VB-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:15: 'VB-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(169,15);
            string_literal263=(Token)match(input,66,FOLLOW_66_in_vbconcentrate1272); 
            string_literal263_tree = (Object)adaptor.create(string_literal263);
            adaptor.addChild(root_0, string_literal263_tree);

            dbg.location(169,32);
            TOKEN264=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbconcentrate1274); 
            TOKEN264_tree = (Object)adaptor.create(TOKEN264);
            adaptor.addChild(root_0, TOKEN264_tree);


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
        dbg.location(169, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:1: nnconcentrate : 'NN-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.nnconcentrate_return nnconcentrate() throws RecognitionException {
        ChemicalChunkerParser.nnconcentrate_return retval = new ChemicalChunkerParser.nnconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal265=null;
        Token TOKEN266=null;

        Object string_literal265_tree=null;
        Object TOKEN266_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:14: ( 'NN-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:15: 'NN-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(170,15);
            string_literal265=(Token)match(input,67,FOLLOW_67_in_nnconcentrate1279); 
            string_literal265_tree = (Object)adaptor.create(string_literal265);
            adaptor.addChild(root_0, string_literal265_tree);

            dbg.location(170,32);
            TOKEN266=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnconcentrate1281); 
            TOKEN266_tree = (Object)adaptor.create(TOKEN266);
            adaptor.addChild(root_0, TOKEN266_tree);


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
        dbg.location(170, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:173:1: vbcool : 'VB-COOL' TOKEN ;
    public final ChemicalChunkerParser.vbcool_return vbcool() throws RecognitionException {
        ChemicalChunkerParser.vbcool_return retval = new ChemicalChunkerParser.vbcool_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal267=null;
        Token TOKEN268=null;

        Object string_literal267_tree=null;
        Object TOKEN268_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:173:7: ( 'VB-COOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:173:8: 'VB-COOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(173,8);
            string_literal267=(Token)match(input,68,FOLLOW_68_in_vbcool1288); 
            string_literal267_tree = (Object)adaptor.create(string_literal267);
            adaptor.addChild(root_0, string_literal267_tree);

            dbg.location(173,18);
            TOKEN268=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcool1290); 
            TOKEN268_tree = (Object)adaptor.create(TOKEN268);
            adaptor.addChild(root_0, TOKEN268_tree);


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
        dbg.location(173, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:1: vbdegass : 'VB-DEGASS' TOKEN ;
    public final ChemicalChunkerParser.vbdegass_return vbdegass() throws RecognitionException {
        ChemicalChunkerParser.vbdegass_return retval = new ChemicalChunkerParser.vbdegass_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal269=null;
        Token TOKEN270=null;

        Object string_literal269_tree=null;
        Object TOKEN270_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdegass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:9: ( 'VB-DEGASS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:10: 'VB-DEGASS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(176,10);
            string_literal269=(Token)match(input,69,FOLLOW_69_in_vbdegass1297); 
            string_literal269_tree = (Object)adaptor.create(string_literal269);
            adaptor.addChild(root_0, string_literal269_tree);

            dbg.location(176,22);
            TOKEN270=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdegass1299); 
            TOKEN270_tree = (Object)adaptor.create(TOKEN270);
            adaptor.addChild(root_0, TOKEN270_tree);


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
        dbg.location(176, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:1: vbdissolve : 'VB-DISSOLVE' TOKEN ;
    public final ChemicalChunkerParser.vbdissolve_return vbdissolve() throws RecognitionException {
        ChemicalChunkerParser.vbdissolve_return retval = new ChemicalChunkerParser.vbdissolve_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal271=null;
        Token TOKEN272=null;

        Object string_literal271_tree=null;
        Object TOKEN272_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdissolve");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:11: ( 'VB-DISSOLVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:12: 'VB-DISSOLVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(179,12);
            string_literal271=(Token)match(input,70,FOLLOW_70_in_vbdissolve1306); 
            string_literal271_tree = (Object)adaptor.create(string_literal271);
            adaptor.addChild(root_0, string_literal271_tree);

            dbg.location(179,26);
            TOKEN272=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdissolve1308); 
            TOKEN272_tree = (Object)adaptor.create(TOKEN272);
            adaptor.addChild(root_0, TOKEN272_tree);


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
        dbg.location(179, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:182:1: vbdry : 'VB-DRY' TOKEN ;
    public final ChemicalChunkerParser.vbdry_return vbdry() throws RecognitionException {
        ChemicalChunkerParser.vbdry_return retval = new ChemicalChunkerParser.vbdry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal273=null;
        Token TOKEN274=null;

        Object string_literal273_tree=null;
        Object TOKEN274_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:182:6: ( 'VB-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:182:7: 'VB-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(182,7);
            string_literal273=(Token)match(input,71,FOLLOW_71_in_vbdry1315); 
            string_literal273_tree = (Object)adaptor.create(string_literal273);
            adaptor.addChild(root_0, string_literal273_tree);

            dbg.location(182,16);
            TOKEN274=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdry1317); 
            TOKEN274_tree = (Object)adaptor.create(TOKEN274);
            adaptor.addChild(root_0, TOKEN274_tree);


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
        dbg.location(182, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:183:1: nndry : 'NN-DRY' TOKEN ;
    public final ChemicalChunkerParser.nndry_return nndry() throws RecognitionException {
        ChemicalChunkerParser.nndry_return retval = new ChemicalChunkerParser.nndry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal275=null;
        Token TOKEN276=null;

        Object string_literal275_tree=null;
        Object TOKEN276_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nndry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:183:6: ( 'NN-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:183:7: 'NN-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(183,7);
            string_literal275=(Token)match(input,72,FOLLOW_72_in_nndry1322); 
            string_literal275_tree = (Object)adaptor.create(string_literal275);
            adaptor.addChild(root_0, string_literal275_tree);

            dbg.location(183,16);
            TOKEN276=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nndry1324); 
            TOKEN276_tree = (Object)adaptor.create(TOKEN276);
            adaptor.addChild(root_0, TOKEN276_tree);


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
        dbg.location(183, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:186:1: vbextract : 'VB-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.vbextract_return vbextract() throws RecognitionException {
        ChemicalChunkerParser.vbextract_return retval = new ChemicalChunkerParser.vbextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal277=null;
        Token TOKEN278=null;

        Object string_literal277_tree=null;
        Object TOKEN278_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:186:10: ( 'VB-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:186:11: 'VB-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(186,11);
            string_literal277=(Token)match(input,73,FOLLOW_73_in_vbextract1331); 
            string_literal277_tree = (Object)adaptor.create(string_literal277);
            adaptor.addChild(root_0, string_literal277_tree);

            dbg.location(186,24);
            TOKEN278=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbextract1333); 
            TOKEN278_tree = (Object)adaptor.create(TOKEN278);
            adaptor.addChild(root_0, TOKEN278_tree);


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
        dbg.location(186, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:187:1: nnextract : 'NN-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.nnextract_return nnextract() throws RecognitionException {
        ChemicalChunkerParser.nnextract_return retval = new ChemicalChunkerParser.nnextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal279=null;
        Token TOKEN280=null;

        Object string_literal279_tree=null;
        Object TOKEN280_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:187:10: ( 'NN-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:187:11: 'NN-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(187,11);
            string_literal279=(Token)match(input,74,FOLLOW_74_in_nnextract1338); 
            string_literal279_tree = (Object)adaptor.create(string_literal279);
            adaptor.addChild(root_0, string_literal279_tree);

            dbg.location(187,24);
            TOKEN280=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnextract1340); 
            TOKEN280_tree = (Object)adaptor.create(TOKEN280);
            adaptor.addChild(root_0, TOKEN280_tree);


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
        dbg.location(187, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:190:1: vbfilter : 'VB-FILTER' TOKEN ;
    public final ChemicalChunkerParser.vbfilter_return vbfilter() throws RecognitionException {
        ChemicalChunkerParser.vbfilter_return retval = new ChemicalChunkerParser.vbfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal281=null;
        Token TOKEN282=null;

        Object string_literal281_tree=null;
        Object TOKEN282_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:190:9: ( 'VB-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:190:10: 'VB-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(190,10);
            string_literal281=(Token)match(input,75,FOLLOW_75_in_vbfilter1347); 
            string_literal281_tree = (Object)adaptor.create(string_literal281);
            adaptor.addChild(root_0, string_literal281_tree);

            dbg.location(190,22);
            TOKEN282=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfilter1349); 
            TOKEN282_tree = (Object)adaptor.create(TOKEN282);
            adaptor.addChild(root_0, TOKEN282_tree);


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
        dbg.location(190, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:191:1: nnfilter : 'NN-FILTER' TOKEN ;
    public final ChemicalChunkerParser.nnfilter_return nnfilter() throws RecognitionException {
        ChemicalChunkerParser.nnfilter_return retval = new ChemicalChunkerParser.nnfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal283=null;
        Token TOKEN284=null;

        Object string_literal283_tree=null;
        Object TOKEN284_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:191:9: ( 'NN-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:191:10: 'NN-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(191,10);
            string_literal283=(Token)match(input,76,FOLLOW_76_in_nnfilter1354); 
            string_literal283_tree = (Object)adaptor.create(string_literal283);
            adaptor.addChild(root_0, string_literal283_tree);

            dbg.location(191,22);
            TOKEN284=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnfilter1356); 
            TOKEN284_tree = (Object)adaptor.create(TOKEN284);
            adaptor.addChild(root_0, TOKEN284_tree);


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
        dbg.location(191, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:194:1: vbheat : 'VB-HEAT' TOKEN ;
    public final ChemicalChunkerParser.vbheat_return vbheat() throws RecognitionException {
        ChemicalChunkerParser.vbheat_return retval = new ChemicalChunkerParser.vbheat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal285=null;
        Token TOKEN286=null;

        Object string_literal285_tree=null;
        Object TOKEN286_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbheat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:194:7: ( 'VB-HEAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:194:8: 'VB-HEAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(194,8);
            string_literal285=(Token)match(input,77,FOLLOW_77_in_vbheat1363); 
            string_literal285_tree = (Object)adaptor.create(string_literal285);
            adaptor.addChild(root_0, string_literal285_tree);

            dbg.location(194,18);
            TOKEN286=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbheat1365); 
            TOKEN286_tree = (Object)adaptor.create(TOKEN286);
            adaptor.addChild(root_0, TOKEN286_tree);


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
        dbg.location(194, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:195:1: vbincrease : 'VB-INCREASE' TOKEN ;
    public final ChemicalChunkerParser.vbincrease_return vbincrease() throws RecognitionException {
        ChemicalChunkerParser.vbincrease_return retval = new ChemicalChunkerParser.vbincrease_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal287=null;
        Token TOKEN288=null;

        Object string_literal287_tree=null;
        Object TOKEN288_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbincrease");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(195, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:195:11: ( 'VB-INCREASE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:195:12: 'VB-INCREASE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(195,12);
            string_literal287=(Token)match(input,78,FOLLOW_78_in_vbincrease1370); 
            string_literal287_tree = (Object)adaptor.create(string_literal287);
            adaptor.addChild(root_0, string_literal287_tree);

            dbg.location(195,26);
            TOKEN288=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbincrease1372); 
            TOKEN288_tree = (Object)adaptor.create(TOKEN288);
            adaptor.addChild(root_0, TOKEN288_tree);


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
        dbg.location(195, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:198:1: vbpartition : 'VB-PARTITION' TOKEN ;
    public final ChemicalChunkerParser.vbpartition_return vbpartition() throws RecognitionException {
        ChemicalChunkerParser.vbpartition_return retval = new ChemicalChunkerParser.vbpartition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal289=null;
        Token TOKEN290=null;

        Object string_literal289_tree=null;
        Object TOKEN290_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpartition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(198, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:198:12: ( 'VB-PARTITION' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:198:13: 'VB-PARTITION' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(198,13);
            string_literal289=(Token)match(input,79,FOLLOW_79_in_vbpartition1379); 
            string_literal289_tree = (Object)adaptor.create(string_literal289);
            adaptor.addChild(root_0, string_literal289_tree);

            dbg.location(198,28);
            TOKEN290=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpartition1381); 
            TOKEN290_tree = (Object)adaptor.create(TOKEN290);
            adaptor.addChild(root_0, TOKEN290_tree);


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
        dbg.location(198, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:201:1: vbprecipitate : 'VB-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.vbprecipitate_return vbprecipitate() throws RecognitionException {
        ChemicalChunkerParser.vbprecipitate_return retval = new ChemicalChunkerParser.vbprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal291=null;
        Token TOKEN292=null;

        Object string_literal291_tree=null;
        Object TOKEN292_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:201:14: ( 'VB-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:201:15: 'VB-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(201,15);
            string_literal291=(Token)match(input,80,FOLLOW_80_in_vbprecipitate1388); 
            string_literal291_tree = (Object)adaptor.create(string_literal291);
            adaptor.addChild(root_0, string_literal291_tree);

            dbg.location(201,32);
            TOKEN292=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbprecipitate1390); 
            TOKEN292_tree = (Object)adaptor.create(TOKEN292);
            adaptor.addChild(root_0, TOKEN292_tree);


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
        dbg.location(201, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:202:1: nnprecipitate : 'NN-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.nnprecipitate_return nnprecipitate() throws RecognitionException {
        ChemicalChunkerParser.nnprecipitate_return retval = new ChemicalChunkerParser.nnprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal293=null;
        Token TOKEN294=null;

        Object string_literal293_tree=null;
        Object TOKEN294_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(202, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:202:14: ( 'NN-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:202:15: 'NN-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(202,15);
            string_literal293=(Token)match(input,81,FOLLOW_81_in_nnprecipitate1395); 
            string_literal293_tree = (Object)adaptor.create(string_literal293);
            adaptor.addChild(root_0, string_literal293_tree);

            dbg.location(202,32);
            TOKEN294=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnprecipitate1397); 
            TOKEN294_tree = (Object)adaptor.create(TOKEN294);
            adaptor.addChild(root_0, TOKEN294_tree);


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
        dbg.location(202, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:205:1: vbpurify : 'VB-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.vbpurify_return vbpurify() throws RecognitionException {
        ChemicalChunkerParser.vbpurify_return retval = new ChemicalChunkerParser.vbpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal295=null;
        Token TOKEN296=null;

        Object string_literal295_tree=null;
        Object TOKEN296_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(205, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:205:9: ( 'VB-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:205:10: 'VB-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(205,10);
            string_literal295=(Token)match(input,82,FOLLOW_82_in_vbpurify1404); 
            string_literal295_tree = (Object)adaptor.create(string_literal295);
            adaptor.addChild(root_0, string_literal295_tree);

            dbg.location(205,22);
            TOKEN296=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpurify1406); 
            TOKEN296_tree = (Object)adaptor.create(TOKEN296);
            adaptor.addChild(root_0, TOKEN296_tree);


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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:206:1: nnpurify : 'NN-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.nnpurify_return nnpurify() throws RecognitionException {
        ChemicalChunkerParser.nnpurify_return retval = new ChemicalChunkerParser.nnpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal297=null;
        Token TOKEN298=null;

        Object string_literal297_tree=null;
        Object TOKEN298_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(206, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:206:9: ( 'NN-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:206:10: 'NN-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(206,10);
            string_literal297=(Token)match(input,83,FOLLOW_83_in_nnpurify1411); 
            string_literal297_tree = (Object)adaptor.create(string_literal297);
            adaptor.addChild(root_0, string_literal297_tree);

            dbg.location(206,22);
            TOKEN298=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpurify1413); 
            TOKEN298_tree = (Object)adaptor.create(TOKEN298);
            adaptor.addChild(root_0, TOKEN298_tree);


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
        dbg.location(206, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:209:1: vbquench : 'VB-QUENCH' TOKEN ;
    public final ChemicalChunkerParser.vbquench_return vbquench() throws RecognitionException {
        ChemicalChunkerParser.vbquench_return retval = new ChemicalChunkerParser.vbquench_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal299=null;
        Token TOKEN300=null;

        Object string_literal299_tree=null;
        Object TOKEN300_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbquench");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(209, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:209:9: ( 'VB-QUENCH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:209:10: 'VB-QUENCH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(209,10);
            string_literal299=(Token)match(input,84,FOLLOW_84_in_vbquench1420); 
            string_literal299_tree = (Object)adaptor.create(string_literal299);
            adaptor.addChild(root_0, string_literal299_tree);

            dbg.location(209,22);
            TOKEN300=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbquench1422); 
            TOKEN300_tree = (Object)adaptor.create(TOKEN300);
            adaptor.addChild(root_0, TOKEN300_tree);


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
        dbg.location(209, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:212:1: vbrecover : 'VB-RECOVER' TOKEN ;
    public final ChemicalChunkerParser.vbrecover_return vbrecover() throws RecognitionException {
        ChemicalChunkerParser.vbrecover_return retval = new ChemicalChunkerParser.vbrecover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal301=null;
        Token TOKEN302=null;

        Object string_literal301_tree=null;
        Object TOKEN302_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbrecover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(212, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:212:10: ( 'VB-RECOVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:212:11: 'VB-RECOVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(212,11);
            string_literal301=(Token)match(input,85,FOLLOW_85_in_vbrecover1429); 
            string_literal301_tree = (Object)adaptor.create(string_literal301);
            adaptor.addChild(root_0, string_literal301_tree);

            dbg.location(212,24);
            TOKEN302=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbrecover1431); 
            TOKEN302_tree = (Object)adaptor.create(TOKEN302);
            adaptor.addChild(root_0, TOKEN302_tree);


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
        dbg.location(212, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:215:1: vbremove : 'VB-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.vbremove_return vbremove() throws RecognitionException {
        ChemicalChunkerParser.vbremove_return retval = new ChemicalChunkerParser.vbremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal303=null;
        Token TOKEN304=null;

        Object string_literal303_tree=null;
        Object TOKEN304_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:215:9: ( 'VB-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:215:10: 'VB-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(215,10);
            string_literal303=(Token)match(input,86,FOLLOW_86_in_vbremove1438); 
            string_literal303_tree = (Object)adaptor.create(string_literal303);
            adaptor.addChild(root_0, string_literal303_tree);

            dbg.location(215,22);
            TOKEN304=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbremove1440); 
            TOKEN304_tree = (Object)adaptor.create(TOKEN304);
            adaptor.addChild(root_0, TOKEN304_tree);


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
        dbg.location(215, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:216:1: nnremove : 'NN-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.nnremove_return nnremove() throws RecognitionException {
        ChemicalChunkerParser.nnremove_return retval = new ChemicalChunkerParser.nnremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal305=null;
        Token TOKEN306=null;

        Object string_literal305_tree=null;
        Object TOKEN306_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(216, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:216:9: ( 'NN-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:216:10: 'NN-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(216,10);
            string_literal305=(Token)match(input,87,FOLLOW_87_in_nnremove1445); 
            string_literal305_tree = (Object)adaptor.create(string_literal305);
            adaptor.addChild(root_0, string_literal305_tree);

            dbg.location(216,22);
            TOKEN306=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnremove1447); 
            TOKEN306_tree = (Object)adaptor.create(TOKEN306);
            adaptor.addChild(root_0, TOKEN306_tree);


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
        dbg.location(216, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:219:1: vbstir : 'VB-STIR' TOKEN ;
    public final ChemicalChunkerParser.vbstir_return vbstir() throws RecognitionException {
        ChemicalChunkerParser.vbstir_return retval = new ChemicalChunkerParser.vbstir_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal307=null;
        Token TOKEN308=null;

        Object string_literal307_tree=null;
        Object TOKEN308_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbstir");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(219, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:219:7: ( 'VB-STIR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:219:8: 'VB-STIR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(219,8);
            string_literal307=(Token)match(input,88,FOLLOW_88_in_vbstir1454); 
            string_literal307_tree = (Object)adaptor.create(string_literal307);
            adaptor.addChild(root_0, string_literal307_tree);

            dbg.location(219,18);
            TOKEN308=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbstir1456); 
            TOKEN308_tree = (Object)adaptor.create(TOKEN308);
            adaptor.addChild(root_0, TOKEN308_tree);


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
        dbg.location(219, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:222:1: vbsynthesize : 'VB-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.vbsynthesize_return vbsynthesize() throws RecognitionException {
        ChemicalChunkerParser.vbsynthesize_return retval = new ChemicalChunkerParser.vbsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal309=null;
        Token TOKEN310=null;

        Object string_literal309_tree=null;
        Object TOKEN310_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(222, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:222:13: ( 'VB-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:222:14: 'VB-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(222,14);
            string_literal309=(Token)match(input,89,FOLLOW_89_in_vbsynthesize1463); 
            string_literal309_tree = (Object)adaptor.create(string_literal309);
            adaptor.addChild(root_0, string_literal309_tree);

            dbg.location(222,30);
            TOKEN310=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsynthesize1465); 
            TOKEN310_tree = (Object)adaptor.create(TOKEN310);
            adaptor.addChild(root_0, TOKEN310_tree);


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
        dbg.location(222, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:223:1: nnsynthesize : 'NN-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.nnsynthesize_return nnsynthesize() throws RecognitionException {
        ChemicalChunkerParser.nnsynthesize_return retval = new ChemicalChunkerParser.nnsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal311=null;
        Token TOKEN312=null;

        Object string_literal311_tree=null;
        Object TOKEN312_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(223, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:223:13: ( 'NN-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:223:14: 'NN-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(223,14);
            string_literal311=(Token)match(input,90,FOLLOW_90_in_nnsynthesize1470); 
            string_literal311_tree = (Object)adaptor.create(string_literal311);
            adaptor.addChild(root_0, string_literal311_tree);

            dbg.location(223,30);
            TOKEN312=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnsynthesize1472); 
            TOKEN312_tree = (Object)adaptor.create(TOKEN312);
            adaptor.addChild(root_0, TOKEN312_tree);


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
        dbg.location(223, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:226:1: vbwait : 'VB-WAIT' TOKEN ;
    public final ChemicalChunkerParser.vbwait_return vbwait() throws RecognitionException {
        ChemicalChunkerParser.vbwait_return retval = new ChemicalChunkerParser.vbwait_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal313=null;
        Token TOKEN314=null;

        Object string_literal313_tree=null;
        Object TOKEN314_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwait");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(226, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:226:7: ( 'VB-WAIT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:226:8: 'VB-WAIT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(226,8);
            string_literal313=(Token)match(input,91,FOLLOW_91_in_vbwait1479); 
            string_literal313_tree = (Object)adaptor.create(string_literal313);
            adaptor.addChild(root_0, string_literal313_tree);

            dbg.location(226,18);
            TOKEN314=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwait1481); 
            TOKEN314_tree = (Object)adaptor.create(TOKEN314);
            adaptor.addChild(root_0, TOKEN314_tree);


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
        dbg.location(226, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:229:1: vbwash : 'VB-WASH' TOKEN ;
    public final ChemicalChunkerParser.vbwash_return vbwash() throws RecognitionException {
        ChemicalChunkerParser.vbwash_return retval = new ChemicalChunkerParser.vbwash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal315=null;
        Token TOKEN316=null;

        Object string_literal315_tree=null;
        Object TOKEN316_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(229, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:229:7: ( 'VB-WASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:229:8: 'VB-WASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(229,8);
            string_literal315=(Token)match(input,92,FOLLOW_92_in_vbwash1488); 
            string_literal315_tree = (Object)adaptor.create(string_literal315);
            adaptor.addChild(root_0, string_literal315_tree);

            dbg.location(229,18);
            TOKEN316=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwash1490); 
            TOKEN316_tree = (Object)adaptor.create(TOKEN316);
            adaptor.addChild(root_0, TOKEN316_tree);


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
        dbg.location(229, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:232:1: vbyield : 'VB-YIELD' TOKEN ;
    public final ChemicalChunkerParser.vbyield_return vbyield() throws RecognitionException {
        ChemicalChunkerParser.vbyield_return retval = new ChemicalChunkerParser.vbyield_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal317=null;
        Token TOKEN318=null;

        Object string_literal317_tree=null;
        Object TOKEN318_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbyield");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:232:8: ( 'VB-YIELD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:232:9: 'VB-YIELD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(232,9);
            string_literal317=(Token)match(input,93,FOLLOW_93_in_vbyield1497); 
            string_literal317_tree = (Object)adaptor.create(string_literal317);
            adaptor.addChild(root_0, string_literal317_tree);

            dbg.location(232,20);
            TOKEN318=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbyield1499); 
            TOKEN318_tree = (Object)adaptor.create(TOKEN318);
            adaptor.addChild(root_0, TOKEN318_tree);


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
        dbg.location(232, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:235:1: colon : 'COLON' TOKEN ;
    public final ChemicalChunkerParser.colon_return colon() throws RecognitionException {
        ChemicalChunkerParser.colon_return retval = new ChemicalChunkerParser.colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal319=null;
        Token TOKEN320=null;

        Object string_literal319_tree=null;
        Object TOKEN320_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(235, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:235:6: ( 'COLON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:235:7: 'COLON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(235,7);
            string_literal319=(Token)match(input,94,FOLLOW_94_in_colon1506); 
            string_literal319_tree = (Object)adaptor.create(string_literal319);
            adaptor.addChild(root_0, string_literal319_tree);

            dbg.location(235,15);
            TOKEN320=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_colon1508); 
            TOKEN320_tree = (Object)adaptor.create(TOKEN320);
            adaptor.addChild(root_0, TOKEN320_tree);


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
        dbg.location(235, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:236:1: comma : 'COMMA' TOKEN ;
    public final ChemicalChunkerParser.comma_return comma() throws RecognitionException {
        ChemicalChunkerParser.comma_return retval = new ChemicalChunkerParser.comma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal321=null;
        Token TOKEN322=null;

        Object string_literal321_tree=null;
        Object TOKEN322_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(236, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:236:6: ( 'COMMA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:236:7: 'COMMA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(236,7);
            string_literal321=(Token)match(input,95,FOLLOW_95_in_comma1513); 
            string_literal321_tree = (Object)adaptor.create(string_literal321);
            adaptor.addChild(root_0, string_literal321_tree);

            dbg.location(236,15);
            TOKEN322=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_comma1515); 
            TOKEN322_tree = (Object)adaptor.create(TOKEN322);
            adaptor.addChild(root_0, TOKEN322_tree);


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
        dbg.location(236, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:237:1: apost : 'APOST' TOKEN ;
    public final ChemicalChunkerParser.apost_return apost() throws RecognitionException {
        ChemicalChunkerParser.apost_return retval = new ChemicalChunkerParser.apost_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal323=null;
        Token TOKEN324=null;

        Object string_literal323_tree=null;
        Object TOKEN324_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "apost");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(237, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:237:6: ( 'APOST' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:237:7: 'APOST' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(237,7);
            string_literal323=(Token)match(input,96,FOLLOW_96_in_apost1520); 
            string_literal323_tree = (Object)adaptor.create(string_literal323);
            adaptor.addChild(root_0, string_literal323_tree);

            dbg.location(237,15);
            TOKEN324=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_apost1522); 
            TOKEN324_tree = (Object)adaptor.create(TOKEN324);
            adaptor.addChild(root_0, TOKEN324_tree);


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
        dbg.location(237, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:238:1: neg : 'NEG' TOKEN ;
    public final ChemicalChunkerParser.neg_return neg() throws RecognitionException {
        ChemicalChunkerParser.neg_return retval = new ChemicalChunkerParser.neg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal325=null;
        Token TOKEN326=null;

        Object string_literal325_tree=null;
        Object TOKEN326_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "neg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:238:4: ( 'NEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:238:5: 'NEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(238,5);
            string_literal325=(Token)match(input,97,FOLLOW_97_in_neg1527); 
            string_literal325_tree = (Object)adaptor.create(string_literal325);
            adaptor.addChild(root_0, string_literal325_tree);

            dbg.location(238,11);
            TOKEN326=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_neg1529); 
            TOKEN326_tree = (Object)adaptor.create(TOKEN326);
            adaptor.addChild(root_0, TOKEN326_tree);


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
        dbg.location(238, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:239:1: dash : 'DASH' TOKEN ;
    public final ChemicalChunkerParser.dash_return dash() throws RecognitionException {
        ChemicalChunkerParser.dash_return retval = new ChemicalChunkerParser.dash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal327=null;
        Token TOKEN328=null;

        Object string_literal327_tree=null;
        Object TOKEN328_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(239, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:239:5: ( 'DASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:239:6: 'DASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(239,6);
            string_literal327=(Token)match(input,98,FOLLOW_98_in_dash1534); 
            string_literal327_tree = (Object)adaptor.create(string_literal327);
            adaptor.addChild(root_0, string_literal327_tree);

            dbg.location(239,13);
            TOKEN328=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dash1536); 
            TOKEN328_tree = (Object)adaptor.create(TOKEN328);
            adaptor.addChild(root_0, TOKEN328_tree);


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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:240:1: stop : 'STOP' TOKEN ;
    public final ChemicalChunkerParser.stop_return stop() throws RecognitionException {
        ChemicalChunkerParser.stop_return retval = new ChemicalChunkerParser.stop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal329=null;
        Token TOKEN330=null;

        Object string_literal329_tree=null;
        Object TOKEN330_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:240:5: ( 'STOP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:240:6: 'STOP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(240,6);
            string_literal329=(Token)match(input,99,FOLLOW_99_in_stop1541); 
            string_literal329_tree = (Object)adaptor.create(string_literal329);
            adaptor.addChild(root_0, string_literal329_tree);

            dbg.location(240,13);
            TOKEN330=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_stop1543); 
            TOKEN330_tree = (Object)adaptor.create(TOKEN330);
            adaptor.addChild(root_0, TOKEN330_tree);


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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:241:1: nnpercent : 'NN-PERCENT' TOKEN ;
    public final ChemicalChunkerParser.nnpercent_return nnpercent() throws RecognitionException {
        ChemicalChunkerParser.nnpercent_return retval = new ChemicalChunkerParser.nnpercent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal331=null;
        Token TOKEN332=null;

        Object string_literal331_tree=null;
        Object TOKEN332_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpercent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(241, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:241:10: ( 'NN-PERCENT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:241:11: 'NN-PERCENT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(241,11);
            string_literal331=(Token)match(input,100,FOLLOW_100_in_nnpercent1548); 
            string_literal331_tree = (Object)adaptor.create(string_literal331);
            adaptor.addChild(root_0, string_literal331_tree);

            dbg.location(241,24);
            TOKEN332=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpercent1550); 
            TOKEN332_tree = (Object)adaptor.create(TOKEN332);
            adaptor.addChild(root_0, TOKEN332_tree);


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
        dbg.location(241, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:242:1: lsqb : 'LSQB' TOKEN ;
    public final ChemicalChunkerParser.lsqb_return lsqb() throws RecognitionException {
        ChemicalChunkerParser.lsqb_return retval = new ChemicalChunkerParser.lsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal333=null;
        Token TOKEN334=null;

        Object string_literal333_tree=null;
        Object TOKEN334_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(242, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:242:5: ( 'LSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:242:6: 'LSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(242,6);
            string_literal333=(Token)match(input,101,FOLLOW_101_in_lsqb1555); 
            string_literal333_tree = (Object)adaptor.create(string_literal333);
            adaptor.addChild(root_0, string_literal333_tree);

            dbg.location(242,13);
            TOKEN334=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lsqb1557); 
            TOKEN334_tree = (Object)adaptor.create(TOKEN334);
            adaptor.addChild(root_0, TOKEN334_tree);


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
        dbg.location(242, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:243:1: rsqb : 'RSQB' TOKEN ;
    public final ChemicalChunkerParser.rsqb_return rsqb() throws RecognitionException {
        ChemicalChunkerParser.rsqb_return retval = new ChemicalChunkerParser.rsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal335=null;
        Token TOKEN336=null;

        Object string_literal335_tree=null;
        Object TOKEN336_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(243, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:243:5: ( 'RSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:243:6: 'RSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(243,6);
            string_literal335=(Token)match(input,102,FOLLOW_102_in_rsqb1562); 
            string_literal335_tree = (Object)adaptor.create(string_literal335);
            adaptor.addChild(root_0, string_literal335_tree);

            dbg.location(243,13);
            TOKEN336=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rsqb1564); 
            TOKEN336_tree = (Object)adaptor.create(TOKEN336);
            adaptor.addChild(root_0, TOKEN336_tree);


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
        dbg.location(243, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:244:1: lrb : '-LRB-' TOKEN ;
    public final ChemicalChunkerParser.lrb_return lrb() throws RecognitionException {
        ChemicalChunkerParser.lrb_return retval = new ChemicalChunkerParser.lrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal337=null;
        Token TOKEN338=null;

        Object string_literal337_tree=null;
        Object TOKEN338_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(244, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:244:4: ( '-LRB-' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:244:5: '-LRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(244,5);
            string_literal337=(Token)match(input,103,FOLLOW_103_in_lrb1569); 
            string_literal337_tree = (Object)adaptor.create(string_literal337);
            adaptor.addChild(root_0, string_literal337_tree);

            dbg.location(244,13);
            TOKEN338=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lrb1571); 
            TOKEN338_tree = (Object)adaptor.create(TOKEN338);
            adaptor.addChild(root_0, TOKEN338_tree);


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
        dbg.location(244, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:245:1: rrb : '-RRB-' TOKEN ;
    public final ChemicalChunkerParser.rrb_return rrb() throws RecognitionException {
        ChemicalChunkerParser.rrb_return retval = new ChemicalChunkerParser.rrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal339=null;
        Token TOKEN340=null;

        Object string_literal339_tree=null;
        Object TOKEN340_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(245, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:245:4: ( '-RRB-' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:245:5: '-RRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(245,5);
            string_literal339=(Token)match(input,104,FOLLOW_104_in_rrb1576); 
            string_literal339_tree = (Object)adaptor.create(string_literal339);
            adaptor.addChild(root_0, string_literal339_tree);

            dbg.location(245,13);
            TOKEN340=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rrb1578); 
            TOKEN340_tree = (Object)adaptor.create(TOKEN340);
            adaptor.addChild(root_0, TOKEN340_tree);


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
        dbg.location(245, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:250:1: abl : 'ABL' TOKEN ;
    public final ChemicalChunkerParser.abl_return abl() throws RecognitionException {
        ChemicalChunkerParser.abl_return retval = new ChemicalChunkerParser.abl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal341=null;
        Token TOKEN342=null;

        Object string_literal341_tree=null;
        Object TOKEN342_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(250, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:250:4: ( 'ABL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:250:5: 'ABL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(250,5);
            string_literal341=(Token)match(input,105,FOLLOW_105_in_abl1587); 
            string_literal341_tree = (Object)adaptor.create(string_literal341);
            adaptor.addChild(root_0, string_literal341_tree);

            dbg.location(250,11);
            TOKEN342=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abl1589); 
            TOKEN342_tree = (Object)adaptor.create(TOKEN342);
            adaptor.addChild(root_0, TOKEN342_tree);


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
        dbg.location(250, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:253:1: abn : 'ABN' TOKEN ;
    public final ChemicalChunkerParser.abn_return abn() throws RecognitionException {
        ChemicalChunkerParser.abn_return retval = new ChemicalChunkerParser.abn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal343=null;
        Token TOKEN344=null;

        Object string_literal343_tree=null;
        Object TOKEN344_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(253, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:253:4: ( 'ABN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:253:5: 'ABN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(253,5);
            string_literal343=(Token)match(input,106,FOLLOW_106_in_abn1596); 
            string_literal343_tree = (Object)adaptor.create(string_literal343);
            adaptor.addChild(root_0, string_literal343_tree);

            dbg.location(253,11);
            TOKEN344=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abn1598); 
            TOKEN344_tree = (Object)adaptor.create(TOKEN344);
            adaptor.addChild(root_0, TOKEN344_tree);


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
        dbg.location(253, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:256:1: abx : 'ABX' TOKEN ;
    public final ChemicalChunkerParser.abx_return abx() throws RecognitionException {
        ChemicalChunkerParser.abx_return retval = new ChemicalChunkerParser.abx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal345=null;
        Token TOKEN346=null;

        Object string_literal345_tree=null;
        Object TOKEN346_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(256, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:256:4: ( 'ABX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:256:5: 'ABX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(256,5);
            string_literal345=(Token)match(input,107,FOLLOW_107_in_abx1605); 
            string_literal345_tree = (Object)adaptor.create(string_literal345);
            adaptor.addChild(root_0, string_literal345_tree);

            dbg.location(256,11);
            TOKEN346=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abx1607); 
            TOKEN346_tree = (Object)adaptor.create(TOKEN346);
            adaptor.addChild(root_0, TOKEN346_tree);


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
        dbg.location(256, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:259:1: ap : 'AP' TOKEN ;
    public final ChemicalChunkerParser.ap_return ap() throws RecognitionException {
        ChemicalChunkerParser.ap_return retval = new ChemicalChunkerParser.ap_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal347=null;
        Token TOKEN348=null;

        Object string_literal347_tree=null;
        Object TOKEN348_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ap");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(259, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:259:3: ( 'AP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:259:4: 'AP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(259,4);
            string_literal347=(Token)match(input,108,FOLLOW_108_in_ap1614); 
            string_literal347_tree = (Object)adaptor.create(string_literal347);
            adaptor.addChild(root_0, string_literal347_tree);

            dbg.location(259,9);
            TOKEN348=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ap1616); 
            TOKEN348_tree = (Object)adaptor.create(TOKEN348);
            adaptor.addChild(root_0, TOKEN348_tree);


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
        dbg.location(259, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:262:1: at : 'AT' TOKEN ;
    public final ChemicalChunkerParser.at_return at() throws RecognitionException {
        ChemicalChunkerParser.at_return retval = new ChemicalChunkerParser.at_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal349=null;
        Token TOKEN350=null;

        Object string_literal349_tree=null;
        Object TOKEN350_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "at");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(262, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:262:3: ( 'AT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:262:4: 'AT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(262,4);
            string_literal349=(Token)match(input,109,FOLLOW_109_in_at1623); 
            string_literal349_tree = (Object)adaptor.create(string_literal349);
            adaptor.addChild(root_0, string_literal349_tree);

            dbg.location(262,9);
            TOKEN350=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_at1625); 
            TOKEN350_tree = (Object)adaptor.create(TOKEN350);
            adaptor.addChild(root_0, TOKEN350_tree);


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
        dbg.location(262, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:265:1: be : 'BE' TOKEN ;
    public final ChemicalChunkerParser.be_return be() throws RecognitionException {
        ChemicalChunkerParser.be_return retval = new ChemicalChunkerParser.be_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal351=null;
        Token TOKEN352=null;

        Object string_literal351_tree=null;
        Object TOKEN352_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "be");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:265:3: ( 'BE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:265:4: 'BE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(265,4);
            string_literal351=(Token)match(input,110,FOLLOW_110_in_be1632); 
            string_literal351_tree = (Object)adaptor.create(string_literal351);
            adaptor.addChild(root_0, string_literal351_tree);

            dbg.location(265,9);
            TOKEN352=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_be1634); 
            TOKEN352_tree = (Object)adaptor.create(TOKEN352);
            adaptor.addChild(root_0, TOKEN352_tree);


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
        dbg.location(265, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:268:1: bed : 'BED' TOKEN ;
    public final ChemicalChunkerParser.bed_return bed() throws RecognitionException {
        ChemicalChunkerParser.bed_return retval = new ChemicalChunkerParser.bed_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal353=null;
        Token TOKEN354=null;

        Object string_literal353_tree=null;
        Object TOKEN354_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(268, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:268:4: ( 'BED' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:268:5: 'BED' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(268,5);
            string_literal353=(Token)match(input,111,FOLLOW_111_in_bed1641); 
            string_literal353_tree = (Object)adaptor.create(string_literal353);
            adaptor.addChild(root_0, string_literal353_tree);

            dbg.location(268,11);
            TOKEN354=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bed1643); 
            TOKEN354_tree = (Object)adaptor.create(TOKEN354);
            adaptor.addChild(root_0, TOKEN354_tree);


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
        dbg.location(268, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:271:1: bedz : 'BEDZ' TOKEN ;
    public final ChemicalChunkerParser.bedz_return bedz() throws RecognitionException {
        ChemicalChunkerParser.bedz_return retval = new ChemicalChunkerParser.bedz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal355=null;
        Token TOKEN356=null;

        Object string_literal355_tree=null;
        Object TOKEN356_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bedz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(271, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:271:5: ( 'BEDZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:271:6: 'BEDZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(271,6);
            string_literal355=(Token)match(input,112,FOLLOW_112_in_bedz1650); 
            string_literal355_tree = (Object)adaptor.create(string_literal355);
            adaptor.addChild(root_0, string_literal355_tree);

            dbg.location(271,13);
            TOKEN356=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bedz1652); 
            TOKEN356_tree = (Object)adaptor.create(TOKEN356);
            adaptor.addChild(root_0, TOKEN356_tree);


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
        dbg.location(271, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:274:1: beg : 'BEG' TOKEN ;
    public final ChemicalChunkerParser.beg_return beg() throws RecognitionException {
        ChemicalChunkerParser.beg_return retval = new ChemicalChunkerParser.beg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal357=null;
        Token TOKEN358=null;

        Object string_literal357_tree=null;
        Object TOKEN358_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "beg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(274, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:274:4: ( 'BEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:274:5: 'BEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(274,5);
            string_literal357=(Token)match(input,113,FOLLOW_113_in_beg1659); 
            string_literal357_tree = (Object)adaptor.create(string_literal357);
            adaptor.addChild(root_0, string_literal357_tree);

            dbg.location(274,11);
            TOKEN358=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_beg1661); 
            TOKEN358_tree = (Object)adaptor.create(TOKEN358);
            adaptor.addChild(root_0, TOKEN358_tree);


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
        dbg.location(274, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:277:1: bem : 'BEM' TOKEN ;
    public final ChemicalChunkerParser.bem_return bem() throws RecognitionException {
        ChemicalChunkerParser.bem_return retval = new ChemicalChunkerParser.bem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal359=null;
        Token TOKEN360=null;

        Object string_literal359_tree=null;
        Object TOKEN360_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bem");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(277, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:277:4: ( 'BEM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:277:5: 'BEM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(277,5);
            string_literal359=(Token)match(input,114,FOLLOW_114_in_bem1668); 
            string_literal359_tree = (Object)adaptor.create(string_literal359);
            adaptor.addChild(root_0, string_literal359_tree);

            dbg.location(277,11);
            TOKEN360=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bem1670); 
            TOKEN360_tree = (Object)adaptor.create(TOKEN360);
            adaptor.addChild(root_0, TOKEN360_tree);


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
        dbg.location(277, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:280:1: ben : 'BEN' TOKEN ;
    public final ChemicalChunkerParser.ben_return ben() throws RecognitionException {
        ChemicalChunkerParser.ben_return retval = new ChemicalChunkerParser.ben_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal361=null;
        Token TOKEN362=null;

        Object string_literal361_tree=null;
        Object TOKEN362_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ben");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(280, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:280:4: ( 'BEN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:280:5: 'BEN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(280,5);
            string_literal361=(Token)match(input,115,FOLLOW_115_in_ben1677); 
            string_literal361_tree = (Object)adaptor.create(string_literal361);
            adaptor.addChild(root_0, string_literal361_tree);

            dbg.location(280,11);
            TOKEN362=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ben1679); 
            TOKEN362_tree = (Object)adaptor.create(TOKEN362);
            adaptor.addChild(root_0, TOKEN362_tree);


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
        dbg.location(280, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:283:1: ber : 'BER' TOKEN ;
    public final ChemicalChunkerParser.ber_return ber() throws RecognitionException {
        ChemicalChunkerParser.ber_return retval = new ChemicalChunkerParser.ber_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal363=null;
        Token TOKEN364=null;

        Object string_literal363_tree=null;
        Object TOKEN364_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ber");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(283, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:283:4: ( 'BER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:283:5: 'BER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(283,5);
            string_literal363=(Token)match(input,116,FOLLOW_116_in_ber1686); 
            string_literal363_tree = (Object)adaptor.create(string_literal363);
            adaptor.addChild(root_0, string_literal363_tree);

            dbg.location(283,11);
            TOKEN364=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ber1688); 
            TOKEN364_tree = (Object)adaptor.create(TOKEN364);
            adaptor.addChild(root_0, TOKEN364_tree);


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
        dbg.location(283, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:286:1: bez : 'BEZ' TOKEN ;
    public final ChemicalChunkerParser.bez_return bez() throws RecognitionException {
        ChemicalChunkerParser.bez_return retval = new ChemicalChunkerParser.bez_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal365=null;
        Token TOKEN366=null;

        Object string_literal365_tree=null;
        Object TOKEN366_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bez");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:286:4: ( 'BEZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:286:5: 'BEZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(286,5);
            string_literal365=(Token)match(input,117,FOLLOW_117_in_bez1695); 
            string_literal365_tree = (Object)adaptor.create(string_literal365);
            adaptor.addChild(root_0, string_literal365_tree);

            dbg.location(286,11);
            TOKEN366=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bez1697); 
            TOKEN366_tree = (Object)adaptor.create(TOKEN366);
            adaptor.addChild(root_0, TOKEN366_tree);


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
        dbg.location(286, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:289:1: cc : 'CC' TOKEN ;
    public final ChemicalChunkerParser.cc_return cc() throws RecognitionException {
        ChemicalChunkerParser.cc_return retval = new ChemicalChunkerParser.cc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal367=null;
        Token TOKEN368=null;

        Object string_literal367_tree=null;
        Object TOKEN368_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(289, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:289:3: ( 'CC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:289:4: 'CC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(289,4);
            string_literal367=(Token)match(input,118,FOLLOW_118_in_cc1704); 
            string_literal367_tree = (Object)adaptor.create(string_literal367);
            adaptor.addChild(root_0, string_literal367_tree);

            dbg.location(289,9);
            TOKEN368=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cc1706); 
            TOKEN368_tree = (Object)adaptor.create(TOKEN368);
            adaptor.addChild(root_0, TOKEN368_tree);


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
        dbg.location(289, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:292:1: cd : 'CD' TOKEN ;
    public final ChemicalChunkerParser.cd_return cd() throws RecognitionException {
        ChemicalChunkerParser.cd_return retval = new ChemicalChunkerParser.cd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal369=null;
        Token TOKEN370=null;

        Object string_literal369_tree=null;
        Object TOKEN370_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:292:3: ( 'CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:292:4: 'CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(292,4);
            string_literal369=(Token)match(input,119,FOLLOW_119_in_cd1713); 
            string_literal369_tree = (Object)adaptor.create(string_literal369);
            adaptor.addChild(root_0, string_literal369_tree);

            dbg.location(292,9);
            TOKEN370=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cd1715); 
            TOKEN370_tree = (Object)adaptor.create(TOKEN370);
            adaptor.addChild(root_0, TOKEN370_tree);


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
        dbg.location(292, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:295:1: cs : 'CS' TOKEN ;
    public final ChemicalChunkerParser.cs_return cs() throws RecognitionException {
        ChemicalChunkerParser.cs_return retval = new ChemicalChunkerParser.cs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal371=null;
        Token TOKEN372=null;

        Object string_literal371_tree=null;
        Object TOKEN372_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(295, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:295:3: ( 'CS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:295:4: 'CS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(295,4);
            string_literal371=(Token)match(input,120,FOLLOW_120_in_cs1722); 
            string_literal371_tree = (Object)adaptor.create(string_literal371);
            adaptor.addChild(root_0, string_literal371_tree);

            dbg.location(295,9);
            TOKEN372=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cs1724); 
            TOKEN372_tree = (Object)adaptor.create(TOKEN372);
            adaptor.addChild(root_0, TOKEN372_tree);


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
        dbg.location(295, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:298:1: dotok : 'DO' TOKEN ;
    public final ChemicalChunkerParser.dotok_return dotok() throws RecognitionException {
        ChemicalChunkerParser.dotok_return retval = new ChemicalChunkerParser.dotok_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal373=null;
        Token TOKEN374=null;

        Object string_literal373_tree=null;
        Object TOKEN374_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dotok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(298, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:298:7: ( 'DO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:298:8: 'DO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(298,8);
            string_literal373=(Token)match(input,121,FOLLOW_121_in_dotok1732); 
            string_literal373_tree = (Object)adaptor.create(string_literal373);
            adaptor.addChild(root_0, string_literal373_tree);

            dbg.location(298,13);
            TOKEN374=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dotok1734); 
            TOKEN374_tree = (Object)adaptor.create(TOKEN374);
            adaptor.addChild(root_0, TOKEN374_tree);


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
        dbg.location(298, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:301:1: dod : 'DOD' TOKEN ;
    public final ChemicalChunkerParser.dod_return dod() throws RecognitionException {
        ChemicalChunkerParser.dod_return retval = new ChemicalChunkerParser.dod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal375=null;
        Token TOKEN376=null;

        Object string_literal375_tree=null;
        Object TOKEN376_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(301, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:301:4: ( 'DOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:301:5: 'DOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(301,5);
            string_literal375=(Token)match(input,122,FOLLOW_122_in_dod1741); 
            string_literal375_tree = (Object)adaptor.create(string_literal375);
            adaptor.addChild(root_0, string_literal375_tree);

            dbg.location(301,11);
            TOKEN376=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dod1743); 
            TOKEN376_tree = (Object)adaptor.create(TOKEN376);
            adaptor.addChild(root_0, TOKEN376_tree);


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
        dbg.location(301, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:304:1: doz : 'DOZ' TOKEN ;
    public final ChemicalChunkerParser.doz_return doz() throws RecognitionException {
        ChemicalChunkerParser.doz_return retval = new ChemicalChunkerParser.doz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal377=null;
        Token TOKEN378=null;

        Object string_literal377_tree=null;
        Object TOKEN378_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:304:4: ( 'DOZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:304:5: 'DOZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(304,5);
            string_literal377=(Token)match(input,123,FOLLOW_123_in_doz1750); 
            string_literal377_tree = (Object)adaptor.create(string_literal377);
            adaptor.addChild(root_0, string_literal377_tree);

            dbg.location(304,11);
            TOKEN378=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_doz1752); 
            TOKEN378_tree = (Object)adaptor.create(TOKEN378);
            adaptor.addChild(root_0, TOKEN378_tree);


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
        dbg.location(304, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:307:1: dt : 'DT' TOKEN ;
    public final ChemicalChunkerParser.dt_return dt() throws RecognitionException {
        ChemicalChunkerParser.dt_return retval = new ChemicalChunkerParser.dt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal379=null;
        Token TOKEN380=null;

        Object string_literal379_tree=null;
        Object TOKEN380_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(307, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:307:3: ( 'DT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:307:4: 'DT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(307,4);
            string_literal379=(Token)match(input,124,FOLLOW_124_in_dt1759); 
            string_literal379_tree = (Object)adaptor.create(string_literal379);
            adaptor.addChild(root_0, string_literal379_tree);

            dbg.location(307,9);
            TOKEN380=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dt1761); 
            TOKEN380_tree = (Object)adaptor.create(TOKEN380);
            adaptor.addChild(root_0, TOKEN380_tree);


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
        dbg.location(307, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:310:1: dti : 'DTI' TOKEN ;
    public final ChemicalChunkerParser.dti_return dti() throws RecognitionException {
        ChemicalChunkerParser.dti_return retval = new ChemicalChunkerParser.dti_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal381=null;
        Token TOKEN382=null;

        Object string_literal381_tree=null;
        Object TOKEN382_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dti");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(310, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:310:4: ( 'DTI' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:310:5: 'DTI' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(310,5);
            string_literal381=(Token)match(input,125,FOLLOW_125_in_dti1768); 
            string_literal381_tree = (Object)adaptor.create(string_literal381);
            adaptor.addChild(root_0, string_literal381_tree);

            dbg.location(310,11);
            TOKEN382=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dti1770); 
            TOKEN382_tree = (Object)adaptor.create(TOKEN382);
            adaptor.addChild(root_0, TOKEN382_tree);


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
        dbg.location(310, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:313:1: dts : 'DTS' TOKEN ;
    public final ChemicalChunkerParser.dts_return dts() throws RecognitionException {
        ChemicalChunkerParser.dts_return retval = new ChemicalChunkerParser.dts_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal383=null;
        Token TOKEN384=null;

        Object string_literal383_tree=null;
        Object TOKEN384_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dts");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(313, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:313:4: ( 'DTS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:313:5: 'DTS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(313,5);
            string_literal383=(Token)match(input,126,FOLLOW_126_in_dts1777); 
            string_literal383_tree = (Object)adaptor.create(string_literal383);
            adaptor.addChild(root_0, string_literal383_tree);

            dbg.location(313,11);
            TOKEN384=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dts1779); 
            TOKEN384_tree = (Object)adaptor.create(TOKEN384);
            adaptor.addChild(root_0, TOKEN384_tree);


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
        dbg.location(313, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:316:1: dtx : 'DTX' TOKEN ;
    public final ChemicalChunkerParser.dtx_return dtx() throws RecognitionException {
        ChemicalChunkerParser.dtx_return retval = new ChemicalChunkerParser.dtx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal385=null;
        Token TOKEN386=null;

        Object string_literal385_tree=null;
        Object TOKEN386_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dtx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:316:4: ( 'DTX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:316:5: 'DTX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(316,5);
            string_literal385=(Token)match(input,127,FOLLOW_127_in_dtx1786); 
            string_literal385_tree = (Object)adaptor.create(string_literal385);
            adaptor.addChild(root_0, string_literal385_tree);

            dbg.location(316,11);
            TOKEN386=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dtx1788); 
            TOKEN386_tree = (Object)adaptor.create(TOKEN386);
            adaptor.addChild(root_0, TOKEN386_tree);


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
        dbg.location(316, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:319:1: ex : 'EX' TOKEN ;
    public final ChemicalChunkerParser.ex_return ex() throws RecognitionException {
        ChemicalChunkerParser.ex_return retval = new ChemicalChunkerParser.ex_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal387=null;
        Token TOKEN388=null;

        Object string_literal387_tree=null;
        Object TOKEN388_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ex");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(319, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:319:3: ( 'EX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:319:4: 'EX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(319,4);
            string_literal387=(Token)match(input,128,FOLLOW_128_in_ex1795); 
            string_literal387_tree = (Object)adaptor.create(string_literal387);
            adaptor.addChild(root_0, string_literal387_tree);

            dbg.location(319,9);
            TOKEN388=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ex1797); 
            TOKEN388_tree = (Object)adaptor.create(TOKEN388);
            adaptor.addChild(root_0, TOKEN388_tree);


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
        dbg.location(319, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:322:1: fw : 'FW' TOKEN ;
    public final ChemicalChunkerParser.fw_return fw() throws RecognitionException {
        ChemicalChunkerParser.fw_return retval = new ChemicalChunkerParser.fw_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal389=null;
        Token TOKEN390=null;

        Object string_literal389_tree=null;
        Object TOKEN390_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(322, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:322:3: ( 'FW' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:322:4: 'FW' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(322,4);
            string_literal389=(Token)match(input,129,FOLLOW_129_in_fw1804); 
            string_literal389_tree = (Object)adaptor.create(string_literal389);
            adaptor.addChild(root_0, string_literal389_tree);

            dbg.location(322,9);
            TOKEN390=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_fw1806); 
            TOKEN390_tree = (Object)adaptor.create(TOKEN390);
            adaptor.addChild(root_0, TOKEN390_tree);


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
        dbg.location(322, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:325:1: hv : 'HV' TOKEN ;
    public final ChemicalChunkerParser.hv_return hv() throws RecognitionException {
        ChemicalChunkerParser.hv_return retval = new ChemicalChunkerParser.hv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal391=null;
        Token TOKEN392=null;

        Object string_literal391_tree=null;
        Object TOKEN392_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(325, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:325:3: ( 'HV' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:325:4: 'HV' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(325,4);
            string_literal391=(Token)match(input,130,FOLLOW_130_in_hv1813); 
            string_literal391_tree = (Object)adaptor.create(string_literal391);
            adaptor.addChild(root_0, string_literal391_tree);

            dbg.location(325,9);
            TOKEN392=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hv1815); 
            TOKEN392_tree = (Object)adaptor.create(TOKEN392);
            adaptor.addChild(root_0, TOKEN392_tree);


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
        dbg.location(325, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:328:1: hvd : 'HVD' TOKEN ;
    public final ChemicalChunkerParser.hvd_return hvd() throws RecognitionException {
        ChemicalChunkerParser.hvd_return retval = new ChemicalChunkerParser.hvd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal393=null;
        Token TOKEN394=null;

        Object string_literal393_tree=null;
        Object TOKEN394_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(328, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:328:4: ( 'HVD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:328:5: 'HVD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(328,5);
            string_literal393=(Token)match(input,131,FOLLOW_131_in_hvd1822); 
            string_literal393_tree = (Object)adaptor.create(string_literal393);
            adaptor.addChild(root_0, string_literal393_tree);

            dbg.location(328,11);
            TOKEN394=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvd1824); 
            TOKEN394_tree = (Object)adaptor.create(TOKEN394);
            adaptor.addChild(root_0, TOKEN394_tree);


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
        dbg.location(328, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:331:1: hvg : 'HVG' TOKEN ;
    public final ChemicalChunkerParser.hvg_return hvg() throws RecognitionException {
        ChemicalChunkerParser.hvg_return retval = new ChemicalChunkerParser.hvg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal395=null;
        Token TOKEN396=null;

        Object string_literal395_tree=null;
        Object TOKEN396_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(331, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:331:4: ( 'HVG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:331:5: 'HVG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(331,5);
            string_literal395=(Token)match(input,132,FOLLOW_132_in_hvg1831); 
            string_literal395_tree = (Object)adaptor.create(string_literal395);
            adaptor.addChild(root_0, string_literal395_tree);

            dbg.location(331,11);
            TOKEN396=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvg1833); 
            TOKEN396_tree = (Object)adaptor.create(TOKEN396);
            adaptor.addChild(root_0, TOKEN396_tree);


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
        dbg.location(331, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:334:1: hvn : 'HVN' TOKEN ;
    public final ChemicalChunkerParser.hvn_return hvn() throws RecognitionException {
        ChemicalChunkerParser.hvn_return retval = new ChemicalChunkerParser.hvn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal397=null;
        Token TOKEN398=null;

        Object string_literal397_tree=null;
        Object TOKEN398_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(334, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:334:4: ( 'HVN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:334:5: 'HVN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(334,5);
            string_literal397=(Token)match(input,133,FOLLOW_133_in_hvn1840); 
            string_literal397_tree = (Object)adaptor.create(string_literal397);
            adaptor.addChild(root_0, string_literal397_tree);

            dbg.location(334,11);
            TOKEN398=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvn1842); 
            TOKEN398_tree = (Object)adaptor.create(TOKEN398);
            adaptor.addChild(root_0, TOKEN398_tree);


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
        dbg.location(334, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:337:1: in : 'IN' TOKEN ;
    public final ChemicalChunkerParser.in_return in() throws RecognitionException {
        ChemicalChunkerParser.in_return retval = new ChemicalChunkerParser.in_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal399=null;
        Token TOKEN400=null;

        Object string_literal399_tree=null;
        Object TOKEN400_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "in");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(337, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:337:3: ( 'IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:337:4: 'IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(337,4);
            string_literal399=(Token)match(input,134,FOLLOW_134_in_in1849); 
            string_literal399_tree = (Object)adaptor.create(string_literal399);
            adaptor.addChild(root_0, string_literal399_tree);

            dbg.location(337,9);
            TOKEN400=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_in1851); 
            TOKEN400_tree = (Object)adaptor.create(TOKEN400);
            adaptor.addChild(root_0, TOKEN400_tree);


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
        dbg.location(337, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:340:1: jj : 'JJ' TOKEN ;
    public final ChemicalChunkerParser.jj_return jj() throws RecognitionException {
        ChemicalChunkerParser.jj_return retval = new ChemicalChunkerParser.jj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal401=null;
        Token TOKEN402=null;

        Object string_literal401_tree=null;
        Object TOKEN402_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(340, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:340:3: ( 'JJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:340:4: 'JJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(340,4);
            string_literal401=(Token)match(input,135,FOLLOW_135_in_jj1858); 
            string_literal401_tree = (Object)adaptor.create(string_literal401);
            adaptor.addChild(root_0, string_literal401_tree);

            dbg.location(340,9);
            TOKEN402=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jj1860); 
            TOKEN402_tree = (Object)adaptor.create(TOKEN402);
            adaptor.addChild(root_0, TOKEN402_tree);


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
        dbg.location(340, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:343:1: jjr : 'JJR' TOKEN ;
    public final ChemicalChunkerParser.jjr_return jjr() throws RecognitionException {
        ChemicalChunkerParser.jjr_return retval = new ChemicalChunkerParser.jjr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal403=null;
        Token TOKEN404=null;

        Object string_literal403_tree=null;
        Object TOKEN404_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(343, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:343:4: ( 'JJR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:343:5: 'JJR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(343,5);
            string_literal403=(Token)match(input,136,FOLLOW_136_in_jjr1867); 
            string_literal403_tree = (Object)adaptor.create(string_literal403);
            adaptor.addChild(root_0, string_literal403_tree);

            dbg.location(343,11);
            TOKEN404=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjr1869); 
            TOKEN404_tree = (Object)adaptor.create(TOKEN404);
            adaptor.addChild(root_0, TOKEN404_tree);


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
        dbg.location(343, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:346:1: jjs : 'JJS' TOKEN ;
    public final ChemicalChunkerParser.jjs_return jjs() throws RecognitionException {
        ChemicalChunkerParser.jjs_return retval = new ChemicalChunkerParser.jjs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal405=null;
        Token TOKEN406=null;

        Object string_literal405_tree=null;
        Object TOKEN406_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(346, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:346:4: ( 'JJS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:346:5: 'JJS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(346,5);
            string_literal405=(Token)match(input,137,FOLLOW_137_in_jjs1876); 
            string_literal405_tree = (Object)adaptor.create(string_literal405);
            adaptor.addChild(root_0, string_literal405_tree);

            dbg.location(346,11);
            TOKEN406=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjs1878); 
            TOKEN406_tree = (Object)adaptor.create(TOKEN406);
            adaptor.addChild(root_0, TOKEN406_tree);


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
        dbg.location(346, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:349:1: jjt : 'JJT' TOKEN ;
    public final ChemicalChunkerParser.jjt_return jjt() throws RecognitionException {
        ChemicalChunkerParser.jjt_return retval = new ChemicalChunkerParser.jjt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal407=null;
        Token TOKEN408=null;

        Object string_literal407_tree=null;
        Object TOKEN408_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(349, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:349:4: ( 'JJT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:349:5: 'JJT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(349,5);
            string_literal407=(Token)match(input,138,FOLLOW_138_in_jjt1885); 
            string_literal407_tree = (Object)adaptor.create(string_literal407);
            adaptor.addChild(root_0, string_literal407_tree);

            dbg.location(349,11);
            TOKEN408=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjt1887); 
            TOKEN408_tree = (Object)adaptor.create(TOKEN408);
            adaptor.addChild(root_0, TOKEN408_tree);


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
        dbg.location(349, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:352:1: md : 'MD' TOKEN ;
    public final ChemicalChunkerParser.md_return md() throws RecognitionException {
        ChemicalChunkerParser.md_return retval = new ChemicalChunkerParser.md_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal409=null;
        Token TOKEN410=null;

        Object string_literal409_tree=null;
        Object TOKEN410_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "md");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(352, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:352:3: ( 'MD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:352:4: 'MD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(352,4);
            string_literal409=(Token)match(input,139,FOLLOW_139_in_md1894); 
            string_literal409_tree = (Object)adaptor.create(string_literal409);
            adaptor.addChild(root_0, string_literal409_tree);

            dbg.location(352,9);
            TOKEN410=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_md1896); 
            TOKEN410_tree = (Object)adaptor.create(TOKEN410);
            adaptor.addChild(root_0, TOKEN410_tree);


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
        dbg.location(352, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:355:1: nc : 'NC' TOKEN ;
    public final ChemicalChunkerParser.nc_return nc() throws RecognitionException {
        ChemicalChunkerParser.nc_return retval = new ChemicalChunkerParser.nc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal411=null;
        Token TOKEN412=null;

        Object string_literal411_tree=null;
        Object TOKEN412_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(355, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:355:3: ( 'NC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:355:4: 'NC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(355,4);
            string_literal411=(Token)match(input,140,FOLLOW_140_in_nc1903); 
            string_literal411_tree = (Object)adaptor.create(string_literal411);
            adaptor.addChild(root_0, string_literal411_tree);

            dbg.location(355,9);
            TOKEN412=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nc1905); 
            TOKEN412_tree = (Object)adaptor.create(TOKEN412);
            adaptor.addChild(root_0, TOKEN412_tree);


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
        dbg.location(355, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:358:1: nn : 'NN' TOKEN ;
    public final ChemicalChunkerParser.nn_return nn() throws RecognitionException {
        ChemicalChunkerParser.nn_return retval = new ChemicalChunkerParser.nn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal413=null;
        Token TOKEN414=null;

        Object string_literal413_tree=null;
        Object TOKEN414_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:358:3: ( 'NN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:358:4: 'NN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(358,4);
            string_literal413=(Token)match(input,141,FOLLOW_141_in_nn1912); 
            string_literal413_tree = (Object)adaptor.create(string_literal413);
            adaptor.addChild(root_0, string_literal413_tree);

            dbg.location(358,9);
            TOKEN414=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn1914); 
            TOKEN414_tree = (Object)adaptor.create(TOKEN414);
            adaptor.addChild(root_0, TOKEN414_tree);


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
        dbg.location(358, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:361:1: nn_poss : 'NN$' TOKEN ;
    public final ChemicalChunkerParser.nn_poss_return nn_poss() throws RecognitionException {
        ChemicalChunkerParser.nn_poss_return retval = new ChemicalChunkerParser.nn_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal415=null;
        Token TOKEN416=null;

        Object string_literal415_tree=null;
        Object TOKEN416_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(361, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:361:8: ( 'NN$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:361:9: 'NN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(361,9);
            string_literal415=(Token)match(input,142,FOLLOW_142_in_nn_poss1921); 
            string_literal415_tree = (Object)adaptor.create(string_literal415);
            adaptor.addChild(root_0, string_literal415_tree);

            dbg.location(361,15);
            TOKEN416=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn_poss1923); 
            TOKEN416_tree = (Object)adaptor.create(TOKEN416);
            adaptor.addChild(root_0, TOKEN416_tree);


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
        dbg.location(361, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:364:1: nns : 'NNS' TOKEN ;
    public final ChemicalChunkerParser.nns_return nns() throws RecognitionException {
        ChemicalChunkerParser.nns_return retval = new ChemicalChunkerParser.nns_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal417=null;
        Token TOKEN418=null;

        Object string_literal417_tree=null;
        Object TOKEN418_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(364, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:364:4: ( 'NNS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:364:5: 'NNS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(364,5);
            string_literal417=(Token)match(input,143,FOLLOW_143_in_nns1930); 
            string_literal417_tree = (Object)adaptor.create(string_literal417);
            adaptor.addChild(root_0, string_literal417_tree);

            dbg.location(364,11);
            TOKEN418=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns1932); 
            TOKEN418_tree = (Object)adaptor.create(TOKEN418);
            adaptor.addChild(root_0, TOKEN418_tree);


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
        dbg.location(364, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:367:1: nns_poss : 'NNS$' TOKEN ;
    public final ChemicalChunkerParser.nns_poss_return nns_poss() throws RecognitionException {
        ChemicalChunkerParser.nns_poss_return retval = new ChemicalChunkerParser.nns_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal419=null;
        Token TOKEN420=null;

        Object string_literal419_tree=null;
        Object TOKEN420_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(367, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:367:9: ( 'NNS$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:367:10: 'NNS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(367,10);
            string_literal419=(Token)match(input,144,FOLLOW_144_in_nns_poss1939); 
            string_literal419_tree = (Object)adaptor.create(string_literal419);
            adaptor.addChild(root_0, string_literal419_tree);

            dbg.location(367,17);
            TOKEN420=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns_poss1941); 
            TOKEN420_tree = (Object)adaptor.create(TOKEN420);
            adaptor.addChild(root_0, TOKEN420_tree);


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
        dbg.location(367, 22);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:370:1: np : 'NP' TOKEN ;
    public final ChemicalChunkerParser.np_return np() throws RecognitionException {
        ChemicalChunkerParser.np_return retval = new ChemicalChunkerParser.np_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal421=null;
        Token TOKEN422=null;

        Object string_literal421_tree=null;
        Object TOKEN422_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(370, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:370:3: ( 'NP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:370:4: 'NP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(370,4);
            string_literal421=(Token)match(input,145,FOLLOW_145_in_np1948); 
            string_literal421_tree = (Object)adaptor.create(string_literal421);
            adaptor.addChild(root_0, string_literal421_tree);

            dbg.location(370,9);
            TOKEN422=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np1950); 
            TOKEN422_tree = (Object)adaptor.create(TOKEN422);
            adaptor.addChild(root_0, TOKEN422_tree);


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
        dbg.location(370, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:373:1: np_poss : 'NP$' TOKEN ;
    public final ChemicalChunkerParser.np_poss_return np_poss() throws RecognitionException {
        ChemicalChunkerParser.np_poss_return retval = new ChemicalChunkerParser.np_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal423=null;
        Token TOKEN424=null;

        Object string_literal423_tree=null;
        Object TOKEN424_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(373, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:373:8: ( 'NP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:373:9: 'NP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(373,9);
            string_literal423=(Token)match(input,146,FOLLOW_146_in_np_poss1957); 
            string_literal423_tree = (Object)adaptor.create(string_literal423);
            adaptor.addChild(root_0, string_literal423_tree);

            dbg.location(373,15);
            TOKEN424=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np_poss1959); 
            TOKEN424_tree = (Object)adaptor.create(TOKEN424);
            adaptor.addChild(root_0, TOKEN424_tree);


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
        dbg.location(373, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:376:1: nps : 'NPS' TOKEN ;
    public final ChemicalChunkerParser.nps_return nps() throws RecognitionException {
        ChemicalChunkerParser.nps_return retval = new ChemicalChunkerParser.nps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal425=null;
        Token TOKEN426=null;

        Object string_literal425_tree=null;
        Object TOKEN426_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(376, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:376:4: ( 'NPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:376:5: 'NPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(376,5);
            string_literal425=(Token)match(input,147,FOLLOW_147_in_nps1966); 
            string_literal425_tree = (Object)adaptor.create(string_literal425);
            adaptor.addChild(root_0, string_literal425_tree);

            dbg.location(376,11);
            TOKEN426=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps1968); 
            TOKEN426_tree = (Object)adaptor.create(TOKEN426);
            adaptor.addChild(root_0, TOKEN426_tree);


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
        dbg.location(376, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:379:1: nps_poss : 'NPS$' TOKEN ;
    public final ChemicalChunkerParser.nps_poss_return nps_poss() throws RecognitionException {
        ChemicalChunkerParser.nps_poss_return retval = new ChemicalChunkerParser.nps_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal427=null;
        Token TOKEN428=null;

        Object string_literal427_tree=null;
        Object TOKEN428_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(379, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:379:9: ( 'NPS$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:379:10: 'NPS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(379,10);
            string_literal427=(Token)match(input,148,FOLLOW_148_in_nps_poss1975); 
            string_literal427_tree = (Object)adaptor.create(string_literal427);
            adaptor.addChild(root_0, string_literal427_tree);

            dbg.location(379,17);
            TOKEN428=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps_poss1977); 
            TOKEN428_tree = (Object)adaptor.create(TOKEN428);
            adaptor.addChild(root_0, TOKEN428_tree);


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
        dbg.location(379, 22);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:382:1: nr : 'NR' TOKEN ;
    public final ChemicalChunkerParser.nr_return nr() throws RecognitionException {
        ChemicalChunkerParser.nr_return retval = new ChemicalChunkerParser.nr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal429=null;
        Token TOKEN430=null;

        Object string_literal429_tree=null;
        Object TOKEN430_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(382, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:382:3: ( 'NR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:382:4: 'NR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(382,4);
            string_literal429=(Token)match(input,149,FOLLOW_149_in_nr1984); 
            string_literal429_tree = (Object)adaptor.create(string_literal429);
            adaptor.addChild(root_0, string_literal429_tree);

            dbg.location(382,9);
            TOKEN430=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nr1986); 
            TOKEN430_tree = (Object)adaptor.create(TOKEN430);
            adaptor.addChild(root_0, TOKEN430_tree);


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
        dbg.location(382, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:385:1: od : 'OD' TOKEN ;
    public final ChemicalChunkerParser.od_return od() throws RecognitionException {
        ChemicalChunkerParser.od_return retval = new ChemicalChunkerParser.od_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal431=null;
        Token TOKEN432=null;

        Object string_literal431_tree=null;
        Object TOKEN432_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "od");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(385, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:385:3: ( 'OD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:385:4: 'OD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(385,4);
            string_literal431=(Token)match(input,150,FOLLOW_150_in_od1993); 
            string_literal431_tree = (Object)adaptor.create(string_literal431);
            adaptor.addChild(root_0, string_literal431_tree);

            dbg.location(385,9);
            TOKEN432=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_od1995); 
            TOKEN432_tree = (Object)adaptor.create(TOKEN432);
            adaptor.addChild(root_0, TOKEN432_tree);


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
        dbg.location(385, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:388:1: pn : 'PN' TOKEN ;
    public final ChemicalChunkerParser.pn_return pn() throws RecognitionException {
        ChemicalChunkerParser.pn_return retval = new ChemicalChunkerParser.pn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal433=null;
        Token TOKEN434=null;

        Object string_literal433_tree=null;
        Object TOKEN434_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(388, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:388:3: ( 'PN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:388:4: 'PN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(388,4);
            string_literal433=(Token)match(input,151,FOLLOW_151_in_pn2002); 
            string_literal433_tree = (Object)adaptor.create(string_literal433);
            adaptor.addChild(root_0, string_literal433_tree);

            dbg.location(388,9);
            TOKEN434=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn2004); 
            TOKEN434_tree = (Object)adaptor.create(TOKEN434);
            adaptor.addChild(root_0, TOKEN434_tree);


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
        dbg.location(388, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:391:1: pn_poss : 'PN$' TOKEN ;
    public final ChemicalChunkerParser.pn_poss_return pn_poss() throws RecognitionException {
        ChemicalChunkerParser.pn_poss_return retval = new ChemicalChunkerParser.pn_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal435=null;
        Token TOKEN436=null;

        Object string_literal435_tree=null;
        Object TOKEN436_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(391, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:391:8: ( 'PN$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:391:9: 'PN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(391,9);
            string_literal435=(Token)match(input,152,FOLLOW_152_in_pn_poss2011); 
            string_literal435_tree = (Object)adaptor.create(string_literal435);
            adaptor.addChild(root_0, string_literal435_tree);

            dbg.location(391,15);
            TOKEN436=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn_poss2013); 
            TOKEN436_tree = (Object)adaptor.create(TOKEN436);
            adaptor.addChild(root_0, TOKEN436_tree);


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
        dbg.location(391, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:394:1: pp_poss : 'PP$' TOKEN ;
    public final ChemicalChunkerParser.pp_poss_return pp_poss() throws RecognitionException {
        ChemicalChunkerParser.pp_poss_return retval = new ChemicalChunkerParser.pp_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal437=null;
        Token TOKEN438=null;

        Object string_literal437_tree=null;
        Object TOKEN438_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pp_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(394, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:394:8: ( 'PP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:394:9: 'PP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(394,9);
            string_literal437=(Token)match(input,153,FOLLOW_153_in_pp_poss2020); 
            string_literal437_tree = (Object)adaptor.create(string_literal437);
            adaptor.addChild(root_0, string_literal437_tree);

            dbg.location(394,15);
            TOKEN438=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pp_poss2022); 
            TOKEN438_tree = (Object)adaptor.create(TOKEN438);
            adaptor.addChild(root_0, TOKEN438_tree);


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
        dbg.location(394, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:397:1: pp_poss_poss : 'PP$$' TOKEN ;
    public final ChemicalChunkerParser.pp_poss_poss_return pp_poss_poss() throws RecognitionException {
        ChemicalChunkerParser.pp_poss_poss_return retval = new ChemicalChunkerParser.pp_poss_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal439=null;
        Token TOKEN440=null;

        Object string_literal439_tree=null;
        Object TOKEN440_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pp_poss_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(397, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:397:13: ( 'PP$$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:397:14: 'PP$$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(397,14);
            string_literal439=(Token)match(input,154,FOLLOW_154_in_pp_poss_poss2029); 
            string_literal439_tree = (Object)adaptor.create(string_literal439);
            adaptor.addChild(root_0, string_literal439_tree);

            dbg.location(397,21);
            TOKEN440=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pp_poss_poss2031); 
            TOKEN440_tree = (Object)adaptor.create(TOKEN440);
            adaptor.addChild(root_0, TOKEN440_tree);


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
        dbg.location(397, 26);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:400:1: ppl : 'PPL' TOKEN ;
    public final ChemicalChunkerParser.ppl_return ppl() throws RecognitionException {
        ChemicalChunkerParser.ppl_return retval = new ChemicalChunkerParser.ppl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal441=null;
        Token TOKEN442=null;

        Object string_literal441_tree=null;
        Object TOKEN442_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(400, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:400:4: ( 'PPL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:400:5: 'PPL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(400,5);
            string_literal441=(Token)match(input,155,FOLLOW_155_in_ppl2038); 
            string_literal441_tree = (Object)adaptor.create(string_literal441);
            adaptor.addChild(root_0, string_literal441_tree);

            dbg.location(400,11);
            TOKEN442=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppl2040); 
            TOKEN442_tree = (Object)adaptor.create(TOKEN442);
            adaptor.addChild(root_0, TOKEN442_tree);


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
        dbg.location(400, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:403:1: ppls : 'PPLS' TOKEN ;
    public final ChemicalChunkerParser.ppls_return ppls() throws RecognitionException {
        ChemicalChunkerParser.ppls_return retval = new ChemicalChunkerParser.ppls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal443=null;
        Token TOKEN444=null;

        Object string_literal443_tree=null;
        Object TOKEN444_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(403, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:403:5: ( 'PPLS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:403:6: 'PPLS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(403,6);
            string_literal443=(Token)match(input,156,FOLLOW_156_in_ppls2047); 
            string_literal443_tree = (Object)adaptor.create(string_literal443);
            adaptor.addChild(root_0, string_literal443_tree);

            dbg.location(403,13);
            TOKEN444=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppls2049); 
            TOKEN444_tree = (Object)adaptor.create(TOKEN444);
            adaptor.addChild(root_0, TOKEN444_tree);


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
        dbg.location(403, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:406:1: ppo : 'PPO' TOKEN ;
    public final ChemicalChunkerParser.ppo_return ppo() throws RecognitionException {
        ChemicalChunkerParser.ppo_return retval = new ChemicalChunkerParser.ppo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal445=null;
        Token TOKEN446=null;

        Object string_literal445_tree=null;
        Object TOKEN446_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(406, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:406:4: ( 'PPO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:406:5: 'PPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(406,5);
            string_literal445=(Token)match(input,157,FOLLOW_157_in_ppo2056); 
            string_literal445_tree = (Object)adaptor.create(string_literal445);
            adaptor.addChild(root_0, string_literal445_tree);

            dbg.location(406,11);
            TOKEN446=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppo2058); 
            TOKEN446_tree = (Object)adaptor.create(TOKEN446);
            adaptor.addChild(root_0, TOKEN446_tree);


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
        dbg.location(406, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:409:1: pps : 'PPS' TOKEN ;
    public final ChemicalChunkerParser.pps_return pps() throws RecognitionException {
        ChemicalChunkerParser.pps_return retval = new ChemicalChunkerParser.pps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal447=null;
        Token TOKEN448=null;

        Object string_literal447_tree=null;
        Object TOKEN448_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(409, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:409:4: ( 'PPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:409:5: 'PPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(409,5);
            string_literal447=(Token)match(input,158,FOLLOW_158_in_pps2065); 
            string_literal447_tree = (Object)adaptor.create(string_literal447);
            adaptor.addChild(root_0, string_literal447_tree);

            dbg.location(409,11);
            TOKEN448=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pps2067); 
            TOKEN448_tree = (Object)adaptor.create(TOKEN448);
            adaptor.addChild(root_0, TOKEN448_tree);


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
        dbg.location(409, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:412:1: ppss : 'PPSS' TOKEN ;
    public final ChemicalChunkerParser.ppss_return ppss() throws RecognitionException {
        ChemicalChunkerParser.ppss_return retval = new ChemicalChunkerParser.ppss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal449=null;
        Token TOKEN450=null;

        Object string_literal449_tree=null;
        Object TOKEN450_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(412, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:412:5: ( 'PPSS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:412:6: 'PPSS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(412,6);
            string_literal449=(Token)match(input,159,FOLLOW_159_in_ppss2074); 
            string_literal449_tree = (Object)adaptor.create(string_literal449);
            adaptor.addChild(root_0, string_literal449_tree);

            dbg.location(412,13);
            TOKEN450=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppss2076); 
            TOKEN450_tree = (Object)adaptor.create(TOKEN450);
            adaptor.addChild(root_0, TOKEN450_tree);


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
        dbg.location(412, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:415:1: ql : 'QL' TOKEN ;
    public final ChemicalChunkerParser.ql_return ql() throws RecognitionException {
        ChemicalChunkerParser.ql_return retval = new ChemicalChunkerParser.ql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal451=null;
        Token TOKEN452=null;

        Object string_literal451_tree=null;
        Object TOKEN452_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(415, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:415:3: ( 'QL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:415:4: 'QL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(415,4);
            string_literal451=(Token)match(input,160,FOLLOW_160_in_ql2083); 
            string_literal451_tree = (Object)adaptor.create(string_literal451);
            adaptor.addChild(root_0, string_literal451_tree);

            dbg.location(415,9);
            TOKEN452=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ql2085); 
            TOKEN452_tree = (Object)adaptor.create(TOKEN452);
            adaptor.addChild(root_0, TOKEN452_tree);


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
        dbg.location(415, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:418:1: qlp : 'QLP' TOKEN ;
    public final ChemicalChunkerParser.qlp_return qlp() throws RecognitionException {
        ChemicalChunkerParser.qlp_return retval = new ChemicalChunkerParser.qlp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal453=null;
        Token TOKEN454=null;

        Object string_literal453_tree=null;
        Object TOKEN454_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "qlp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(418, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:418:4: ( 'QLP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:418:5: 'QLP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(418,5);
            string_literal453=(Token)match(input,161,FOLLOW_161_in_qlp2092); 
            string_literal453_tree = (Object)adaptor.create(string_literal453);
            adaptor.addChild(root_0, string_literal453_tree);

            dbg.location(418,11);
            TOKEN454=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_qlp2094); 
            TOKEN454_tree = (Object)adaptor.create(TOKEN454);
            adaptor.addChild(root_0, TOKEN454_tree);


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
        dbg.location(418, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:421:1: rb : 'RB' TOKEN ;
    public final ChemicalChunkerParser.rb_return rb() throws RecognitionException {
        ChemicalChunkerParser.rb_return retval = new ChemicalChunkerParser.rb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal455=null;
        Token TOKEN456=null;

        Object string_literal455_tree=null;
        Object TOKEN456_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(421, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:421:3: ( 'RB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:421:4: 'RB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(421,4);
            string_literal455=(Token)match(input,162,FOLLOW_162_in_rb2101); 
            string_literal455_tree = (Object)adaptor.create(string_literal455);
            adaptor.addChild(root_0, string_literal455_tree);

            dbg.location(421,9);
            TOKEN456=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rb2103); 
            TOKEN456_tree = (Object)adaptor.create(TOKEN456);
            adaptor.addChild(root_0, TOKEN456_tree);


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
        dbg.location(421, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:424:1: rbr : 'RBR' TOKEN ;
    public final ChemicalChunkerParser.rbr_return rbr() throws RecognitionException {
        ChemicalChunkerParser.rbr_return retval = new ChemicalChunkerParser.rbr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal457=null;
        Token TOKEN458=null;

        Object string_literal457_tree=null;
        Object TOKEN458_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(424, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:424:4: ( 'RBR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:424:5: 'RBR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(424,5);
            string_literal457=(Token)match(input,163,FOLLOW_163_in_rbr2110); 
            string_literal457_tree = (Object)adaptor.create(string_literal457);
            adaptor.addChild(root_0, string_literal457_tree);

            dbg.location(424,11);
            TOKEN458=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbr2112); 
            TOKEN458_tree = (Object)adaptor.create(TOKEN458);
            adaptor.addChild(root_0, TOKEN458_tree);


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
        dbg.location(424, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:427:1: rbt : 'RBT' TOKEN ;
    public final ChemicalChunkerParser.rbt_return rbt() throws RecognitionException {
        ChemicalChunkerParser.rbt_return retval = new ChemicalChunkerParser.rbt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal459=null;
        Token TOKEN460=null;

        Object string_literal459_tree=null;
        Object TOKEN460_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(427, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:427:4: ( 'RBT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:427:5: 'RBT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(427,5);
            string_literal459=(Token)match(input,164,FOLLOW_164_in_rbt2119); 
            string_literal459_tree = (Object)adaptor.create(string_literal459);
            adaptor.addChild(root_0, string_literal459_tree);

            dbg.location(427,11);
            TOKEN460=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbt2121); 
            TOKEN460_tree = (Object)adaptor.create(TOKEN460);
            adaptor.addChild(root_0, TOKEN460_tree);


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
        dbg.location(427, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:430:1: rn : 'RN' TOKEN ;
    public final ChemicalChunkerParser.rn_return rn() throws RecognitionException {
        ChemicalChunkerParser.rn_return retval = new ChemicalChunkerParser.rn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal461=null;
        Token TOKEN462=null;

        Object string_literal461_tree=null;
        Object TOKEN462_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(430, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:430:3: ( 'RN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:430:4: 'RN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(430,4);
            string_literal461=(Token)match(input,165,FOLLOW_165_in_rn2128); 
            string_literal461_tree = (Object)adaptor.create(string_literal461);
            adaptor.addChild(root_0, string_literal461_tree);

            dbg.location(430,9);
            TOKEN462=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rn2130); 
            TOKEN462_tree = (Object)adaptor.create(TOKEN462);
            adaptor.addChild(root_0, TOKEN462_tree);


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
        dbg.location(430, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:433:1: rp : 'RP' TOKEN ;
    public final ChemicalChunkerParser.rp_return rp() throws RecognitionException {
        ChemicalChunkerParser.rp_return retval = new ChemicalChunkerParser.rp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal463=null;
        Token TOKEN464=null;

        Object string_literal463_tree=null;
        Object TOKEN464_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(433, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:433:3: ( 'RP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:433:4: 'RP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(433,4);
            string_literal463=(Token)match(input,166,FOLLOW_166_in_rp2137); 
            string_literal463_tree = (Object)adaptor.create(string_literal463);
            adaptor.addChild(root_0, string_literal463_tree);

            dbg.location(433,9);
            TOKEN464=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rp2139); 
            TOKEN464_tree = (Object)adaptor.create(TOKEN464);
            adaptor.addChild(root_0, TOKEN464_tree);


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
        dbg.location(433, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:436:1: to : 'TO' TOKEN ;
    public final ChemicalChunkerParser.to_return to() throws RecognitionException {
        ChemicalChunkerParser.to_return retval = new ChemicalChunkerParser.to_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal465=null;
        Token TOKEN466=null;

        Object string_literal465_tree=null;
        Object TOKEN466_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "to");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(436, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:436:3: ( 'TO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:436:4: 'TO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(436,4);
            string_literal465=(Token)match(input,167,FOLLOW_167_in_to2146); 
            string_literal465_tree = (Object)adaptor.create(string_literal465);
            adaptor.addChild(root_0, string_literal465_tree);

            dbg.location(436,9);
            TOKEN466=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_to2148); 
            TOKEN466_tree = (Object)adaptor.create(TOKEN466);
            adaptor.addChild(root_0, TOKEN466_tree);


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
        dbg.location(436, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:439:1: uh : 'UH' TOKEN ;
    public final ChemicalChunkerParser.uh_return uh() throws RecognitionException {
        ChemicalChunkerParser.uh_return retval = new ChemicalChunkerParser.uh_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal467=null;
        Token TOKEN468=null;

        Object string_literal467_tree=null;
        Object TOKEN468_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "uh");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(439, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:439:3: ( 'UH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:439:4: 'UH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(439,4);
            string_literal467=(Token)match(input,168,FOLLOW_168_in_uh2155); 
            string_literal467_tree = (Object)adaptor.create(string_literal467);
            adaptor.addChild(root_0, string_literal467_tree);

            dbg.location(439,9);
            TOKEN468=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_uh2157); 
            TOKEN468_tree = (Object)adaptor.create(TOKEN468);
            adaptor.addChild(root_0, TOKEN468_tree);


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
        dbg.location(439, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:442:1: vb : 'VB' TOKEN ;
    public final ChemicalChunkerParser.vb_return vb() throws RecognitionException {
        ChemicalChunkerParser.vb_return retval = new ChemicalChunkerParser.vb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal469=null;
        Token TOKEN470=null;

        Object string_literal469_tree=null;
        Object TOKEN470_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(442, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:442:3: ( 'VB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:442:4: 'VB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(442,4);
            string_literal469=(Token)match(input,169,FOLLOW_169_in_vb2164); 
            string_literal469_tree = (Object)adaptor.create(string_literal469);
            adaptor.addChild(root_0, string_literal469_tree);

            dbg.location(442,9);
            TOKEN470=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vb2166); 
            TOKEN470_tree = (Object)adaptor.create(TOKEN470);
            adaptor.addChild(root_0, TOKEN470_tree);


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
        dbg.location(442, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:445:1: vbd : 'VBD' TOKEN ;
    public final ChemicalChunkerParser.vbd_return vbd() throws RecognitionException {
        ChemicalChunkerParser.vbd_return retval = new ChemicalChunkerParser.vbd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal471=null;
        Token TOKEN472=null;

        Object string_literal471_tree=null;
        Object TOKEN472_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(445, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:445:4: ( 'VBD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:445:5: 'VBD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(445,5);
            string_literal471=(Token)match(input,170,FOLLOW_170_in_vbd2173); 
            string_literal471_tree = (Object)adaptor.create(string_literal471);
            adaptor.addChild(root_0, string_literal471_tree);

            dbg.location(445,11);
            TOKEN472=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbd2175); 
            TOKEN472_tree = (Object)adaptor.create(TOKEN472);
            adaptor.addChild(root_0, TOKEN472_tree);


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
        dbg.location(445, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:448:1: vbg : 'VBG' TOKEN ;
    public final ChemicalChunkerParser.vbg_return vbg() throws RecognitionException {
        ChemicalChunkerParser.vbg_return retval = new ChemicalChunkerParser.vbg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal473=null;
        Token TOKEN474=null;

        Object string_literal473_tree=null;
        Object TOKEN474_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(448, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:448:4: ( 'VBG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:448:5: 'VBG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(448,5);
            string_literal473=(Token)match(input,171,FOLLOW_171_in_vbg2182); 
            string_literal473_tree = (Object)adaptor.create(string_literal473);
            adaptor.addChild(root_0, string_literal473_tree);

            dbg.location(448,11);
            TOKEN474=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbg2184); 
            TOKEN474_tree = (Object)adaptor.create(TOKEN474);
            adaptor.addChild(root_0, TOKEN474_tree);


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
        dbg.location(448, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:451:1: vbn : 'VBN' TOKEN ;
    public final ChemicalChunkerParser.vbn_return vbn() throws RecognitionException {
        ChemicalChunkerParser.vbn_return retval = new ChemicalChunkerParser.vbn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal475=null;
        Token TOKEN476=null;

        Object string_literal475_tree=null;
        Object TOKEN476_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(451, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:451:4: ( 'VBN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:451:5: 'VBN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(451,5);
            string_literal475=(Token)match(input,172,FOLLOW_172_in_vbn2191); 
            string_literal475_tree = (Object)adaptor.create(string_literal475);
            adaptor.addChild(root_0, string_literal475_tree);

            dbg.location(451,11);
            TOKEN476=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbn2193); 
            TOKEN476_tree = (Object)adaptor.create(TOKEN476);
            adaptor.addChild(root_0, TOKEN476_tree);


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
        dbg.location(451, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:454:1: vbz : 'VBZ' TOKEN ;
    public final ChemicalChunkerParser.vbz_return vbz() throws RecognitionException {
        ChemicalChunkerParser.vbz_return retval = new ChemicalChunkerParser.vbz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal477=null;
        Token TOKEN478=null;

        Object string_literal477_tree=null;
        Object TOKEN478_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(454, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:454:4: ( 'VBZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:454:5: 'VBZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(454,5);
            string_literal477=(Token)match(input,173,FOLLOW_173_in_vbz2200); 
            string_literal477_tree = (Object)adaptor.create(string_literal477);
            adaptor.addChild(root_0, string_literal477_tree);

            dbg.location(454,11);
            TOKEN478=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbz2202); 
            TOKEN478_tree = (Object)adaptor.create(TOKEN478);
            adaptor.addChild(root_0, TOKEN478_tree);


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
        dbg.location(454, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:457:1: wdt : 'WDT' TOKEN ;
    public final ChemicalChunkerParser.wdt_return wdt() throws RecognitionException {
        ChemicalChunkerParser.wdt_return retval = new ChemicalChunkerParser.wdt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal479=null;
        Token TOKEN480=null;

        Object string_literal479_tree=null;
        Object TOKEN480_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wdt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(457, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:457:4: ( 'WDT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:457:5: 'WDT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(457,5);
            string_literal479=(Token)match(input,174,FOLLOW_174_in_wdt2209); 
            string_literal479_tree = (Object)adaptor.create(string_literal479);
            adaptor.addChild(root_0, string_literal479_tree);

            dbg.location(457,11);
            TOKEN480=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wdt2211); 
            TOKEN480_tree = (Object)adaptor.create(TOKEN480);
            adaptor.addChild(root_0, TOKEN480_tree);


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
        dbg.location(457, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:460:1: wp_poss : 'WP$' TOKEN ;
    public final ChemicalChunkerParser.wp_poss_return wp_poss() throws RecognitionException {
        ChemicalChunkerParser.wp_poss_return retval = new ChemicalChunkerParser.wp_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal481=null;
        Token TOKEN482=null;

        Object string_literal481_tree=null;
        Object TOKEN482_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wp_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(460, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:460:8: ( 'WP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:460:9: 'WP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(460,9);
            string_literal481=(Token)match(input,175,FOLLOW_175_in_wp_poss2218); 
            string_literal481_tree = (Object)adaptor.create(string_literal481);
            adaptor.addChild(root_0, string_literal481_tree);

            dbg.location(460,15);
            TOKEN482=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wp_poss2220); 
            TOKEN482_tree = (Object)adaptor.create(TOKEN482);
            adaptor.addChild(root_0, TOKEN482_tree);


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
        dbg.location(460, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:463:1: wpo : 'WPO' TOKEN ;
    public final ChemicalChunkerParser.wpo_return wpo() throws RecognitionException {
        ChemicalChunkerParser.wpo_return retval = new ChemicalChunkerParser.wpo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal483=null;
        Token TOKEN484=null;

        Object string_literal483_tree=null;
        Object TOKEN484_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wpo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(463, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:463:4: ( 'WPO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:463:5: 'WPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(463,5);
            string_literal483=(Token)match(input,176,FOLLOW_176_in_wpo2227); 
            string_literal483_tree = (Object)adaptor.create(string_literal483);
            adaptor.addChild(root_0, string_literal483_tree);

            dbg.location(463,11);
            TOKEN484=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wpo2229); 
            TOKEN484_tree = (Object)adaptor.create(TOKEN484);
            adaptor.addChild(root_0, TOKEN484_tree);


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
        dbg.location(463, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:466:1: wps : 'WPS' TOKEN ;
    public final ChemicalChunkerParser.wps_return wps() throws RecognitionException {
        ChemicalChunkerParser.wps_return retval = new ChemicalChunkerParser.wps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal485=null;
        Token TOKEN486=null;

        Object string_literal485_tree=null;
        Object TOKEN486_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(466, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:466:4: ( 'WPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:466:5: 'WPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(466,5);
            string_literal485=(Token)match(input,177,FOLLOW_177_in_wps2236); 
            string_literal485_tree = (Object)adaptor.create(string_literal485);
            adaptor.addChild(root_0, string_literal485_tree);

            dbg.location(466,11);
            TOKEN486=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wps2238); 
            TOKEN486_tree = (Object)adaptor.create(TOKEN486);
            adaptor.addChild(root_0, TOKEN486_tree);


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
        dbg.location(466, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:469:1: wql : 'WQL' TOKEN ;
    public final ChemicalChunkerParser.wql_return wql() throws RecognitionException {
        ChemicalChunkerParser.wql_return retval = new ChemicalChunkerParser.wql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal487=null;
        Token TOKEN488=null;

        Object string_literal487_tree=null;
        Object TOKEN488_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(469, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:469:4: ( 'WQL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:469:5: 'WQL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(469,5);
            string_literal487=(Token)match(input,178,FOLLOW_178_in_wql2245); 
            string_literal487_tree = (Object)adaptor.create(string_literal487);
            adaptor.addChild(root_0, string_literal487_tree);

            dbg.location(469,11);
            TOKEN488=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wql2247); 
            TOKEN488_tree = (Object)adaptor.create(TOKEN488);
            adaptor.addChild(root_0, TOKEN488_tree);


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
        dbg.location(469, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:472:1: wrb : 'WRB' TOKEN ;
    public final ChemicalChunkerParser.wrb_return wrb() throws RecognitionException {
        ChemicalChunkerParser.wrb_return retval = new ChemicalChunkerParser.wrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal489=null;
        Token TOKEN490=null;

        Object string_literal489_tree=null;
        Object TOKEN490_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(472, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:472:4: ( 'WRB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:472:5: 'WRB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(472,5);
            string_literal489=(Token)match(input,179,FOLLOW_179_in_wrb2254); 
            string_literal489_tree = (Object)adaptor.create(string_literal489);
            adaptor.addChild(root_0, string_literal489_tree);

            dbg.location(472,11);
            TOKEN490=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wrb2256); 
            TOKEN490_tree = (Object)adaptor.create(TOKEN490);
            adaptor.addChild(root_0, TOKEN490_tree);


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
        dbg.location(472, 16);

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
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA3_eotS =
        "\43\uffff";
    static final String DFA3_eofS =
        "\1\1\42\uffff";
    static final String DFA3_minS =
        "\1\12\42\uffff";
    static final String DFA3_maxS =
        "\1\u00b1\42\uffff";
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
            return "()+ loopback of 32:15: ( nounphrase )+";
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
        "\1\12\34\uffff";
    static final String DFA8_maxS =
        "\1\u00b1\34\uffff";
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
            return "()+ loopback of 35:12: ( noun )+";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA16_eotS =
        "\u008c\uffff";
    static final String DFA16_eofS =
        "\1\1\u008b\uffff";
    static final String DFA16_minS =
        "\1\12\1\uffff\24\11\23\12\1\40\43\11\6\12\1\uffff\1\62\33\uffff"+
        "\2\11\1\12\1\167\1\11\1\41\4\11\4\137\2\11\1\167\1\uffff\1\11\1"+
        "\41\4\11\4\137";
    static final String DFA16_maxS =
        "\1\u00b1\1\uffff\24\11\23\u00b1\1\47\43\11\6\u00b1\1\uffff\1\147"+
        "\33\uffff\2\11\1\u00b1\1\167\1\11\1\144\4\11\4\150\2\11\1\167\1"+
        "\uffff\1\11\1\144\4\11\4\150";
    static final String DFA16_acceptS =
        "\1\uffff\1\2\121\uffff\1\1\1\uffff\33\1\21\uffff\1\1\12\uffff";
    static final String DFA16_specialS =
        "\u008c\uffff}>";
    static final String[] DFA16_transitionS = {
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
            "\1\114\6\uffff\1\113",
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
            "\1\170\1\166\2\uffff\1\171\76\uffff\1\167",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176\10\uffff\1\177",
            "\1\176\10\uffff\1\177",
            "\1\176\10\uffff\1\177",
            "\1\176\10\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084\1\u0086\2\uffff\1\u0085\76\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\176\10\uffff\1\177",
            "\1\176\10\uffff\1\177",
            "\1\176\10\uffff\1\177",
            "\1\176\10\uffff\1\177"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 38:24: ( prepphrase )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA22_eotS =
        "\60\uffff";
    static final String DFA22_eofS =
        "\60\uffff";
    static final String DFA22_minS =
        "\1\17\24\11\21\12\2\167\1\40\2\11\3\uffff\2\12";
    static final String DFA22_maxS =
        "\1\u0087\24\11\21\u00b1\1\u0087\1\167\1\47\2\11\3\uffff\2\u00b1";
    static final String DFA22_acceptS =
        "\53\uffff\1\1\1\2\1\3\2\uffff";
    static final String DFA22_specialS =
        "\60\uffff}>";
    static final String[] DFA22_transitionS = {
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "55:1: prepphrase : ( prepphraseOther | prepphraseTemp | prepphraseTime );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_sentence_in_document149 = new BitSet(new long[]{0x0107FFD9FFFF9C02L,0x108000000400000AL,0x0003C000000007C0L});
    public static final BitSet FOLLOW_prepphrase_in_sentence172 = new BitSet(new long[]{0xFF7FFFD9FFFF9C00L,0x108000083F75EAFFL,0x0003C41C000007C0L});
    public static final BitSet FOLLOW_nounphrase_in_sentence175 = new BitSet(new long[]{0xFF7FFFD9FFFF9C02L,0x108000083F75EAFFL,0x0003C41C000007C0L});
    public static final BitSet FOLLOW_verbphrase_in_sentence178 = new BitSet(new long[]{0xFE78000000000002L,0x000000083B75EAF5L,0x0000041C00000000L});
    public static final BitSet FOLLOW_stop_in_sentence181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dt_in_nounphrase222 = new BitSet(new long[]{0x0107FFD9FFFF9C00L,0x10C000008400000AL,0x0003C000000007C0L});
    public static final BitSet FOLLOW_adj_in_nounphrase225 = new BitSet(new long[]{0x0107FFD9FFFF9C00L,0x10C000008400000AL,0x0003C000000007C0L});
    public static final BitSet FOLLOW_noun_in_nounphrase228 = new BitSet(new long[]{0x0107FFD9FFFF9C02L,0x10C000008400000AL,0x0003C000000007C0L});
    public static final BitSet FOLLOW_comma_in_nounphrase232 = new BitSet(new long[]{0x0107FFD9FFFF9C00L,0x10C000008400000AL,0x0003C000000007C0L});
    public static final BitSet FOLLOW_noun_in_nounphrase234 = new BitSet(new long[]{0x0000000001040002L,0x0040000080000000L});
    public static final BitSet FOLLOW_cc_in_nounphrase239 = new BitSet(new long[]{0x0107FFD9FFFF9C00L,0x10C000000400000AL,0x0003C000000007C0L});
    public static final BitSet FOLLOW_noun_in_nounphrase241 = new BitSet(new long[]{0x0000000001040002L,0x0040000000000000L});
    public static final BitSet FOLLOW_prepphraseOf_in_nounphrase245 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_prepphraseIN_in_nounphrase248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adv_in_verbphrase262 = new BitSet(new long[]{0xFE78000000000000L,0x000000003B75EAF5L,0x0000041C00000000L});
    public static final BitSet FOLLOW_vbd_in_verbphrase265 = new BitSet(new long[]{0xFE78000000000000L,0x000000003B75EAF5L,0x0000041C00000000L});
    public static final BitSet FOLLOW_verb_in_verbphrase268 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x0000001C000000C0L});
    public static final BitSet FOLLOW_adv_in_verbphrase270 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x0000001C000000C0L});
    public static final BitSet FOLLOW_prepphrase_in_verbphrase273 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_vbuse_in_verb284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbchange_in_verb286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsubmerge_in_verb288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsubject_in_verb290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbadd_in_verb292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcharge_in_verb294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcontain_in_verb296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdrop_in_verb298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbfill_in_verb300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsuspend_in_verb302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbtreat_in_verb304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbapparatus_in_verb306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbconcentrate_in_verb308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcool_in_verb310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdegass_in_verb312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdissolve_in_verb314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdry_in_verb316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbextract_in_verb318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbfilter_in_verb320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbheat_in_verb324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbincrease_in_verb326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbpartition_in_verb328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbprecipitate_in_verb330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbpurify_in_verb332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbquench_in_verb334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbrecover_in_verb336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbremove_in_verb338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbstir_in_verb340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsynthesize_in_verb342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbwait_in_verb344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbwash_in_verb346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbyield_in_verb348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_number367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcd_in_number369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmolecule_in_noun378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecule_in_noun380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnstate_in_noun382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntime_in_noun384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnatmosphere_in_noun386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nneq_in_noun388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnchementity_in_noun390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntemp_in_noun392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnflash_in_noun394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nngeneral_in_noun396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnmethod_in_noun398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnamount_in_noun400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnpressure_in_noun402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nncolumn_in_noun404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnchromatography_in_noun406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnvacuum_in_noun408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nncycle_in_noun410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntimes_in_noun412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnapparatus_in_noun414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnconcentrate_in_noun417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wdt_in_noun419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wp_poss_in_noun421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wpo_in_noun423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wps_in_noun425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnsynthesize_in_noun427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscaront_in_noun429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnmixture_in_noun431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jj_in_adj440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjr_in_adj442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjs_in_adj444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjt_in_adj446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcj_in_adj448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rb_in_adv456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rbr_in_adv458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rbt_in_adv460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseOther_in_prepphrase471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTemp_in_prepphrase473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTime_in_prepphrase475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseOther487 = new BitSet(new long[]{0x0107FFD9FFFF9C00L,0x108000000400000AL,0x0003C000000007C0L});
    public static final BitSet FOLLOW_nounphrase_in_prepphraseOther490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inof_in_prepphraseOf513 = new BitSet(new long[]{0x0107FFD9FFFF9C00L,0x108000000400000AL,0x0003C000000007C0L});
    public static final BitSet FOLLOW_nounphrase_in_prepphraseOf516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inin_in_prepphraseIN540 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_molecule_in_prepphraseIN542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseTime566 = new BitSet(new long[]{0x000000007FFF8000L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_dt_in_prepphraseTime569 = new BitSet(new long[]{0x000000007FFF8000L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_jj_in_prepphraseTime572 = new BitSet(new long[]{0x000000007FFF8000L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_cd_in_prepphraseTime575 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_nntime_in_prepphraseTime577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseTemp607 = new BitSet(new long[]{0x000000007FFF8000L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_dt_in_prepphraseTemp610 = new BitSet(new long[]{0x000000007FFF8000L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_jj_in_prepphraseTemp613 = new BitSet(new long[]{0x000000007FFF8000L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_cd_in_prepphraseTemp616 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_nntemp_in_prepphraseTemp618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_in_inAll651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inafter_in_inAll653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inas_in_inAll655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inbefore_in_inAll657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inby_in_inAll659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infor_in_inAll661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infrom_in_inAll663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inin_in_inAll665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ininto_in_inAll667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inof_in_inAll669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inoff_in_inAll671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inon_in_inAll673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inover_in_inAll675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inunder_in_inAll677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invia_in_inAll679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inwith_in_inAll681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inwithout_in_inAll683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_mmol697 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_nnmol_in_mmol699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_gram706 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_nngram_in_gram708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_percent715 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_nnpercent_in_percent717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_volume724 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_nnvol_in_volume726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mmol_in_measurements734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gram_in_measurements736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percent_in_measurements738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_measurements740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcm_in_molecule764 = new BitSet(new long[]{0x0004000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_amount_in_molecule767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcd_in_unnamedmolecule777 = new BitSet(new long[]{0x0000000000000402L,0x0000008000000000L});
    public static final BitSet FOLLOW_amount_in_unnamedmolecule780 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_lrb_in_amount793 = new BitSet(new long[]{0x000000007FFF8000L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_measurements_in_amount795 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
    public static final BitSet FOLLOW_comma_in_amount798 = new BitSet(new long[]{0x000000007FFF8000L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_measurements_in_amount801 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
    public static final BitSet FOLLOW_rrb_in_amount806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nngeneral_in_method843 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_nn_in_method845 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_nnmethod_in_method849 = new BitSet(new long[]{0x000000007FFF8402L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_oscarcd_in_method852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_method854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_oscarcd865 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcd867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_oscarcj872 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcj874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_oscaront880 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscaront882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_tmunicode887 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_tmunicode889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_cdunicode894 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cdunicode896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_inas903 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inas905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_inbefore910 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inbefore912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_inafter917 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inafter919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_inin924 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inin926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ininto931 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ininto933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_inwith938 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inwith940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_inwithout945 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inwithout947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_inby952 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inby954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_invia959 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_invia961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_inof966 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inof968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_inon973 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inon975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_infor980 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_infor982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_infrom987 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_infrom989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_inunder994 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inunder996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_inover1001 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inover1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_inoff1008 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inoff1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_nnstate1017 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnstate1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_nntime1024 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntime1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_nngram1031 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nngram1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_nnmol1038 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmol1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_nnatmosphere1045 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnatmosphere1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_nneq1052 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nneq1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nnvol1059 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnvol1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_nnchementity1066 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnchementity1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nntemp1073 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntemp1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_nnflash1080 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnflash1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_nngeneral1087 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nngeneral1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_nnmethod1094 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmethod1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_nnamount1101 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnamount1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_nnpressure1108 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpressure1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_nncolumn1115 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nncolumn1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_nnchromatography1122 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnchromatography1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_nnvacuum1129 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnvacuum1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_nncycle1136 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nncycle1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_nntimes1143 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntimes1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_oscarcm1152 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcm1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_vbuse1161 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbuse1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_vbchange1168 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbchange1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_vbsubmerge1175 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubmerge1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_vbsubject1182 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubject1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_nnadd1191 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnadd1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_nnmixture1198 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmixture1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_vbadd1205 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbadd1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_vbcharge1212 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcharge1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_vbcontain1219 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcontain1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_vbdrop1226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdrop1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_vbfill1233 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbfill1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_vbsuspend1240 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsuspend1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_vbtreat1247 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbtreat1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_vbapparatus1256 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbapparatus1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_nnapparatus1263 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnapparatus1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_vbconcentrate1272 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbconcentrate1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_nnconcentrate1279 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnconcentrate1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_vbcool1288 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcool1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_vbdegass1297 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdegass1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_vbdissolve1306 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdissolve1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_vbdry1315 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdry1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_nndry1322 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nndry1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_vbextract1331 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbextract1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_nnextract1338 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnextract1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_vbfilter1347 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbfilter1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_nnfilter1354 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnfilter1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_vbheat1363 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbheat1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_vbincrease1370 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbincrease1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_vbpartition1379 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbpartition1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_vbprecipitate1388 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbprecipitate1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_nnprecipitate1395 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnprecipitate1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_vbpurify1404 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbpurify1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_nnpurify1411 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpurify1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_vbquench1420 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbquench1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_vbrecover1429 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbrecover1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_vbremove1438 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbremove1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_nnremove1445 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnremove1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_vbstir1454 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbstir1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_vbsynthesize1463 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsynthesize1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_nnsynthesize1470 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnsynthesize1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_vbwait1479 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbwait1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_vbwash1488 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbwash1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_vbyield1497 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbyield1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_colon1506 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_colon1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_comma1513 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_comma1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_apost1520 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_apost1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_neg1527 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_neg1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_dash1534 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dash1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_stop1541 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_stop1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_nnpercent1548 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpercent1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_lsqb1555 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_lsqb1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rsqb1562 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rsqb1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_lrb1569 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_lrb1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rrb1576 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rrb1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_abl1587 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abl1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_abn1596 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abn1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_abx1605 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abx1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ap1614 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ap1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_at1623 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_at1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_be1632 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_be1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_bed1641 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bed1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_bedz1650 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bedz1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_beg1659 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_beg1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_bem1668 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bem1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ben1677 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ben1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ber1686 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ber1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_bez1695 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bez1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_cc1704 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cc1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_cd1713 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cd1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_cs1722 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cs1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_dotok1732 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dotok1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_dod1741 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dod1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_doz1750 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_doz1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_dt1759 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dt1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_dti1768 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dti1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_dts1777 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dts1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_dtx1786 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dtx1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ex1795 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ex1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fw1804 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_fw1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_hv1813 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hv1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_hvd1822 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvd1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_hvg1831 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvg1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_hvn1840 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvn1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_in1849 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_in1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_jj1858 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jj1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_jjr1867 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjr1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_jjs1876 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjs1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_jjt1885 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjt1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_md1894 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_md1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_nc1903 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nc1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_nn1912 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nn1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_nn_poss1921 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nn_poss1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_nns1930 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nns1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_nns_poss1939 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nns_poss1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_np1948 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_np1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_np_poss1957 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_np_poss1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_nps1966 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nps1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_nps_poss1975 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nps_poss1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_nr1984 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nr1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_od1993 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_od1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_pn2002 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pn2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_pn_poss2011 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pn_poss2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_pp_poss2020 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pp_poss2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_pp_poss_poss2029 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pp_poss_poss2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ppl2038 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppl2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ppls2047 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppls2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ppo2056 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppo2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_pps2065 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pps2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ppss2074 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppss2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ql2083 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ql2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_qlp2092 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_qlp2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_rb2101 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rb2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_rbr2110 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rbr2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_rbt2119 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rbt2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_rn2128 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rn2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_rp2137 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rp2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_to2146 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_to2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_uh2155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_uh2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_vb2164 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vb2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_vbd2173 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbd2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_vbg2182 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbg2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_vbn2191 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbn2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_vbz2200 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbz2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_wdt2209 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wdt2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_wp_poss2218 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wp_poss2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_wpo2227 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wpo2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_wps2236 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wps2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_wql2245 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wql2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_wrb2254 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wrb2256 = new BitSet(new long[]{0x0000000000000002L});

}