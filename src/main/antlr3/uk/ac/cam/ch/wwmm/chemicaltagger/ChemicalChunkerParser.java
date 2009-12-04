// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g 2009-12-04 11:22:34

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NODE", "WS", "NEWLINE", "ACHAR", "DIGIT", "TOKEN", "'OSCAR-CD'", "'OSCAR-CJ'", "'OSCAR-ONT'", "'TM-UNICODE'", "'CD-UNICODE'", "'IN-AS'", "'IN-BEFORE'", "'IN-AFTER'", "'IN-IN'", "'IN-INTO'", "'IN-WITH'", "'IN-WITHOUT'", "'IN-BY'", "'IN-VIA'", "'IN-OF'", "'IN-ON'", "'IN-FOR'", "'IN-FROM'", "'IN-UNDER'", "'IN-OVER'", "'IN-OFF'", "'NN-STATE'", "'NN-TIME'", "'NN-GRAM'", "'NN-MOL'", "'NN-ATMOSPHERE'", "'NN-EQ'", "'NN-VOL'", "'NN-CHEMENTITY'", "'NN-TEMP'", "'NN-FLASH'", "'NN-GENERAL'", "'NN-METHOD'", "'NN-AMOUNT'", "'NN-PRESSURE'", "'NN-COLUMN'", "'NN-CHROMATOGRAPHY'", "'NN-VACUUM'", "'NN-CYCLE'", "'NN-TIMES'", "'OSCAR-CM'", "'VB-USE'", "'VB-CHANGE'", "'VB-SUBMERGE'", "'VB-SUBJECT'", "'NN-ADD'", "'NN-MIXTURE'", "'VB-ADD'", "'VB-CHARGE'", "'VB-CONTAIN'", "'VB-DROP'", "'VB-FILL'", "'VB-SUSPEND'", "'VB-TREAT'", "'VB-APPARATUS'", "'NN-APPARATUS'", "'VB-CONCENTRATE'", "'NN-CONCENTRATE'", "'VB-COOL'", "'VB-DEGASS'", "'VB-DISSOLVE'", "'VB-DRY'", "'NN-DRY'", "'VB-EXTRACT'", "'NN-EXTRACT'", "'VB-FILTER'", "'NN-FILTER'", "'VB-HEAT'", "'VB-INCREASE'", "'VB-PARTITION'", "'VB-PRECIPITATE'", "'NN-PRECIPITATE'", "'VB-PURIFY'", "'NN-PURIFY'", "'VB-QUENCH'", "'VB-RECOVER'", "'VB-REMOVE'", "'NN-REMOVE'", "'VB-STIR'", "'VB-SYNTHESIZE'", "'NN-SYNTHESIZE'", "'VB-WAIT'", "'VB-WASH'", "'VB-YIELD'", "'COLON'", "'COMMA'", "'APOST'", "'NEG'", "'DASH'", "'STOP'", "'NN-PERCENT'", "'LSQB'", "'RSQB'", "'-LRB-'", "'-RRB-'", "'ABL'", "'ABN'", "'ABX'", "'AP'", "'AT'", "'BE'", "'BED'", "'BEDZ'", "'BEG'", "'BEM'", "'BEN'", "'BER'", "'BEZ'", "'CC'", "'CD'", "'CS'", "'DO'", "'DOD'", "'DOZ'", "'DT'", "'DTI'", "'DTS'", "'DTX'", "'EX'", "'FW'", "'HV'", "'HVD'", "'HVG'", "'HVN'", "'IN'", "'JJ'", "'JJR'", "'JJS'", "'JJT'", "'MD'", "'NC'", "'NN'", "'NN$'", "'NNS'", "'NNS$'", "'NP'", "'NP$'", "'NPS'", "'NPS$'", "'NR'", "'OD'", "'PN'", "'PN$'", "'PP$'", "'PP$$'", "'PPL'", "'PPLS'", "'PPO'", "'PPS'", "'PPSS'", "'QL'", "'QLP'", "'RB'", "'RBR'", "'RBT'", "'RN'", "'RP'", "'SYM'", "'TO'", "'UH'", "'VB'", "'VBD'", "'VBG'", "'VBN'", "'VBZ'", "'WDT'", "'WP$'", "'WPO'", "'WPS'", "'WQL'", "'WRB'"
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
    public static final int T__180=180;
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
        "invalidRule", "verb", "noun", "rp", "pp_poss_poss", "abx", "hvg", 
        "nns_poss", "inunder", "inby", "unnamedmoleculeamount", "ber", "nnvol", 
        "bem", "oscarcm", "nn_poss", "infrom", "method", "prepphraseOther", 
        "nps_poss", "nps", "ppo", "number", "nntime", "adj", "vbcharge", 
        "ex", "vbstir", "nnremove", "unnamedmoleculeamount2", "nnatmosphere", 
        "mixture", "inafter", "hvn", "nntemp", "dts", "cdunicode", "vbn", 
        "vbheat", "at", "dtx", "inin", "ppls", "sentence", "wrb", "nns", 
        "hv", "cs", "wps", "hvd", "abn", "nnpurify", "np_poss", "apost", 
        "nncolumn", "dash", "comma", "beg", "prepphraseIN", "nnstate", "unnamedmoleculeamount1", 
        "inwith", "wdt", "vbapparatus", "inover", "vbcontain", "vbcool", 
        "be", "mmol", "jj", "adv", "document", "dt", "nnextract", "prepphrase", 
        "fw", "vbremove", "ppl", "vbchange", "md", "nr", "inof", "vbtreat", 
        "dotok", "vb", "jjr", "oscarcd", "sym", "vbsubject", "rbt", "gram", 
        "inas", "nn", "doz", "measurements", "rn", "rsqb", "pp_poss", "unnamedmolecule", 
        "nnmixture", "nnapparatus", "vbfilter", "inoff", "vbwait", "oscarcj", 
        "wp_poss", "dti", "in", "vbdry", "nnsynthesize", "inon", "vbincrease", 
        "ininto", "vbextract", "nnamount", "amount", "vbdissolve", "vbdrop", 
        "ap", "vbsuspend", "prepphraseOf", "vbz", "vbsubmerge", "nnpressure", 
        "bez", "nnfilter", "rb", "nnconcentrate", "vbprecipitate", "np", 
        "vbdegass", "vbfill", "vbconcentrate", "nncycle", "nngram", "od", 
        "nneq", "vbadd", "vbwash", "ben", "nnadd", "pn_poss", "wql", "wpo", 
        "vbrecover", "nc", "nndry", "verbphrase", "cc", "ql", "inbefore", 
        "invia", "inwithout", "to", "vbyield", "qlp", "stop", "inAll", "uh", 
        "colon", "nnflash", "nngeneral", "nnpercent", "rbr", "vbg", "vbd", 
        "moleculeamount", "lrb", "dod", "nnvacuum", "lsqb", "vbpartition", 
        "infor", "oscarCompound", "vbpurify", "prepphraseTemp", "ppss", 
        "nnmol", "nnchementity", "prepphraseTime", "nntimes", "cd", "moleculeamount2", 
        "molecule", "vbquench", "bedz", "jjs", "abl", "vbsynthesize", "oscaront", 
        "tmunicode", "percent", "moleculeamount1", "nnchromatography", "bed", 
        "jjt", "pps", "volume", "rrb", "nnmethod", "nnprecipitate", "neg", 
        "vbuse", "pn", "nounphrase"
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

                if ( ((LA1_0>=10 && LA1_0<=12)||(LA1_0>=31 && LA1_0<=32)||(LA1_0>=35 && LA1_0<=36)||(LA1_0>=38 && LA1_0<=54)||(LA1_0>=56 && LA1_0<=71)||LA1_0==73||LA1_0==75||(LA1_0>=77 && LA1_0<=80)||LA1_0==82||(LA1_0>=84 && LA1_0<=86)||(LA1_0>=88 && LA1_0<=93)||LA1_0==119||LA1_0==124||(LA1_0>=135 && LA1_0<=138)||(LA1_0>=162 && LA1_0<=164)||LA1_0==171||(LA1_0>=175 && LA1_0<=178)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:28:11: sentence
            	    {
            	    dbg.location(28,11);
            	    pushFollow(FOLLOW_sentence_in_document151);
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:31:1: sentence : ( nounphrase | verbphrase )+ ( comma | cc | stop )* -> ( ^( NODE[\"NounPhrase\"] nounphrase ) )* ( ^( NODE[\"VerbPhrase\"] verbphrase ) )* ;
    public final ChemicalChunkerParser.sentence_return sentence() throws RecognitionException {
        ChemicalChunkerParser.sentence_return retval = new ChemicalChunkerParser.sentence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase2 = null;

        ChemicalChunkerParser.verbphrase_return verbphrase3 = null;

        ChemicalChunkerParser.comma_return comma4 = null;

        ChemicalChunkerParser.cc_return cc5 = null;

        ChemicalChunkerParser.stop_return stop6 = null;


        RewriteRuleSubtreeStream stream_verbphrase=new RewriteRuleSubtreeStream(adaptor,"rule verbphrase");
        RewriteRuleSubtreeStream stream_stop=new RewriteRuleSubtreeStream(adaptor,"rule stop");
        RewriteRuleSubtreeStream stream_comma=new RewriteRuleSubtreeStream(adaptor,"rule comma");
        RewriteRuleSubtreeStream stream_nounphrase=new RewriteRuleSubtreeStream(adaptor,"rule nounphrase");
        RewriteRuleSubtreeStream stream_cc=new RewriteRuleSubtreeStream(adaptor,"rule cc");
        try { dbg.enterRule(getGrammarFileName(), "sentence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:1: ( ( nounphrase | verbphrase )+ ( comma | cc | stop )* -> ( ^( NODE[\"NounPhrase\"] nounphrase ) )* ( ^( NODE[\"VerbPhrase\"] verbphrase ) )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:4: ( nounphrase | verbphrase )+ ( comma | cc | stop )*
            {
            dbg.location(32,4);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:4: ( nounphrase | verbphrase )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=3;
                try { dbg.enterDecision(2);

                try {
                    isCyclicDecision = true;
                    alt2 = dfa2.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:5: nounphrase
            	    {
            	    dbg.location(32,5);
            	    pushFollow(FOLLOW_nounphrase_in_sentence176);
            	    nounphrase2=nounphrase();

            	    state._fsp--;

            	    stream_nounphrase.add(nounphrase2.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:16: verbphrase
            	    {
            	    dbg.location(32,16);
            	    pushFollow(FOLLOW_verbphrase_in_sentence178);
            	    verbphrase3=verbphrase();

            	    state._fsp--;

            	    stream_verbphrase.add(verbphrase3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(32,29);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:29: ( comma | cc | stop )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=4;
                try { dbg.enterDecision(3);

                switch ( input.LA(1) ) {
                case 95:
                    {
                    alt3=1;
                    }
                    break;
                case 118:
                    {
                    alt3=2;
                    }
                    break;
                case 99:
                    {
                    alt3=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:30: comma
            	    {
            	    dbg.location(32,30);
            	    pushFollow(FOLLOW_comma_in_sentence183);
            	    comma4=comma();

            	    state._fsp--;

            	    stream_comma.add(comma4.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:36: cc
            	    {
            	    dbg.location(32,36);
            	    pushFollow(FOLLOW_cc_in_sentence185);
            	    cc5=cc();

            	    state._fsp--;

            	    stream_cc.add(cc5.getTree());

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:39: stop
            	    {
            	    dbg.location(32,39);
            	    pushFollow(FOLLOW_stop_in_sentence187);
            	    stop6=stop();

            	    state._fsp--;

            	    stream_stop.add(stop6.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}



            // AST REWRITE
            // elements: verbphrase, nounphrase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:46: -> ( ^( NODE[\"NounPhrase\"] nounphrase ) )* ( ^( NODE[\"VerbPhrase\"] verbphrase ) )*
            {
                dbg.location(32,49);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:49: ( ^( NODE[\"NounPhrase\"] nounphrase ) )*
                while ( stream_nounphrase.hasNext() ) {
                    dbg.location(32,49);
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:49: ^( NODE[\"NounPhrase\"] nounphrase )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(32,51);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "NounPhrase"), root_1);

                    dbg.location(32,71);
                    adaptor.addChild(root_1, stream_nounphrase.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_nounphrase.reset();
                dbg.location(32,85);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:85: ( ^( NODE[\"VerbPhrase\"] verbphrase ) )*
                while ( stream_verbphrase.hasNext() ) {
                    dbg.location(32,85);
                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:32:85: ^( NODE[\"VerbPhrase\"] verbphrase )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(32,87);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "VerbPhrase"), root_1);

                    dbg.location(32,107);
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
        dbg.location(32, 119);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:36:1: nounphrase : ( dt )? ( adj )* ( noun )+ ( comma noun )* ( cc noun )* ( prepphraseOf )* ( prepphraseIN )? ;
    public final ChemicalChunkerParser.nounphrase_return nounphrase() throws RecognitionException {
        ChemicalChunkerParser.nounphrase_return retval = new ChemicalChunkerParser.nounphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.dt_return dt7 = null;

        ChemicalChunkerParser.adj_return adj8 = null;

        ChemicalChunkerParser.noun_return noun9 = null;

        ChemicalChunkerParser.comma_return comma10 = null;

        ChemicalChunkerParser.noun_return noun11 = null;

        ChemicalChunkerParser.cc_return cc12 = null;

        ChemicalChunkerParser.noun_return noun13 = null;

        ChemicalChunkerParser.prepphraseOf_return prepphraseOf14 = null;

        ChemicalChunkerParser.prepphraseIN_return prepphraseIN15 = null;



        try { dbg.enterRule(getGrammarFileName(), "nounphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:2: ( ( dt )? ( adj )* ( noun )+ ( comma noun )* ( cc noun )* ( prepphraseOf )* ( prepphraseIN )? )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:3: ( dt )? ( adj )* ( noun )+ ( comma noun )* ( cc noun )* ( prepphraseOf )* ( prepphraseIN )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(37,3);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:3: ( dt )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==124) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:3: dt
                    {
                    dbg.location(37,3);
                    pushFollow(FOLLOW_dt_in_nounphrase223);
                    dt7=dt();

                    state._fsp--;

                    adaptor.addChild(root_0, dt7.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(37,7);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:7: ( adj )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==11||(LA5_0>=135 && LA5_0<=138)) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:7: adj
            	    {
            	    dbg.location(37,7);
            	    pushFollow(FOLLOW_adj_in_nounphrase226);
            	    adj8=adj();

            	    state._fsp--;

            	    adaptor.addChild(root_0, adj8.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(37,12);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:12: ( noun )+
            int cnt6=0;
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                try {
                    isCyclicDecision = true;
                    alt6 = dfa6.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:12: noun
            	    {
            	    dbg.location(37,12);
            	    pushFollow(FOLLOW_noun_in_nounphrase229);
            	    noun9=noun();

            	    state._fsp--;

            	    adaptor.addChild(root_0, noun9.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt6++;
            } while (true);
            } finally {dbg.exitSubRule(6);}

            dbg.location(37,18);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:18: ( comma noun )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                try {
                    isCyclicDecision = true;
                    alt7 = dfa7.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:19: comma noun
            	    {
            	    dbg.location(37,19);
            	    pushFollow(FOLLOW_comma_in_nounphrase233);
            	    comma10=comma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comma10.getTree());
            	    dbg.location(37,25);
            	    pushFollow(FOLLOW_noun_in_nounphrase235);
            	    noun11=noun();

            	    state._fsp--;

            	    adaptor.addChild(root_0, noun11.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(37,32);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:32: ( cc noun )*
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

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:33: cc noun
            	    {
            	    dbg.location(37,33);
            	    pushFollow(FOLLOW_cc_in_nounphrase240);
            	    cc12=cc();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cc12.getTree());
            	    dbg.location(37,36);
            	    pushFollow(FOLLOW_noun_in_nounphrase242);
            	    noun13=noun();

            	    state._fsp--;

            	    adaptor.addChild(root_0, noun13.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(37,43);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:43: ( prepphraseOf )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:43: prepphraseOf
            	    {
            	    dbg.location(37,43);
            	    pushFollow(FOLLOW_prepphraseOf_in_nounphrase246);
            	    prepphraseOf14=prepphraseOf();

            	    state._fsp--;

            	    adaptor.addChild(root_0, prepphraseOf14.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}

            dbg.location(37,57);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:57: ( prepphraseIN )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:37:57: prepphraseIN
                    {
                    dbg.location(37,57);
                    pushFollow(FOLLOW_prepphraseIN_in_nounphrase249);
                    prepphraseIN15=prepphraseIN();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseIN15.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(37, 70);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:39:1: verbphrase : ( adv )* ( vbd )* verb ( adv )* ( prepphrase )* ;
    public final ChemicalChunkerParser.verbphrase_return verbphrase() throws RecognitionException {
        ChemicalChunkerParser.verbphrase_return retval = new ChemicalChunkerParser.verbphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.adv_return adv16 = null;

        ChemicalChunkerParser.vbd_return vbd17 = null;

        ChemicalChunkerParser.verb_return verb18 = null;

        ChemicalChunkerParser.adv_return adv19 = null;

        ChemicalChunkerParser.prepphrase_return prepphrase20 = null;



        try { dbg.enterRule(getGrammarFileName(), "verbphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:2: ( ( adv )* ( vbd )* verb ( adv )* ( prepphrase )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:4: ( adv )* ( vbd )* verb ( adv )* ( prepphrase )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(40,4);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:4: ( adv )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11);

                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=162 && LA11_0<=164)) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:4: adv
            	    {
            	    dbg.location(40,4);
            	    pushFollow(FOLLOW_adv_in_verbphrase263);
            	    adv16=adv();

            	    state._fsp--;

            	    adaptor.addChild(root_0, adv16.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}

            dbg.location(40,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:9: ( vbd )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==171) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:9: vbd
            	    {
            	    dbg.location(40,9);
            	    pushFollow(FOLLOW_vbd_in_verbphrase266);
            	    vbd17=vbd();

            	    state._fsp--;

            	    adaptor.addChild(root_0, vbd17.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(40,14);
            pushFollow(FOLLOW_verb_in_verbphrase269);
            verb18=verb();

            state._fsp--;

            adaptor.addChild(root_0, verb18.getTree());
            dbg.location(40,19);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:19: ( adv )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                switch ( input.LA(1) ) {
                case 162:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==TOKEN) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 163:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (LA13_3==TOKEN) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 164:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (LA13_4==TOKEN) ) {
                        alt13=1;
                    }


                    }
                    break;

                }

                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:19: adv
            	    {
            	    dbg.location(40,19);
            	    pushFollow(FOLLOW_adv_in_verbphrase271);
            	    adv19=adv();

            	    state._fsp--;

            	    adaptor.addChild(root_0, adv19.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(40,24);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:24: ( prepphrase )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                switch ( input.LA(1) ) {
                case 124:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==TOKEN) ) {
                        int LA14_6 = input.LA(3);

                        if ( (LA14_6==135) ) {
                            int LA14_3 = input.LA(4);

                            if ( (LA14_3==TOKEN) ) {
                                int LA14_7 = input.LA(5);

                                if ( (LA14_7==119) ) {
                                    int LA14_4 = input.LA(6);

                                    if ( (LA14_4==TOKEN) ) {
                                        int LA14_8 = input.LA(7);

                                        if ( (LA14_8==32||LA14_8==39) ) {
                                            alt14=1;
                                        }


                                    }


                                }


                            }


                        }
                        else if ( (LA14_6==119) ) {
                            int LA14_4 = input.LA(4);

                            if ( (LA14_4==TOKEN) ) {
                                int LA14_8 = input.LA(5);

                                if ( (LA14_8==32||LA14_8==39) ) {
                                    alt14=1;
                                }


                            }


                        }


                    }


                    }
                    break;
                case 135:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (LA14_3==TOKEN) ) {
                        int LA14_7 = input.LA(3);

                        if ( (LA14_7==119) ) {
                            int LA14_4 = input.LA(4);

                            if ( (LA14_4==TOKEN) ) {
                                int LA14_8 = input.LA(5);

                                if ( (LA14_8==32||LA14_8==39) ) {
                                    alt14=1;
                                }


                            }


                        }


                    }


                    }
                    break;
                case 119:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (LA14_4==TOKEN) ) {
                        int LA14_8 = input.LA(3);

                        if ( (LA14_8==32||LA14_8==39) ) {
                            alt14=1;
                        }


                    }


                    }
                    break;
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
                case 134:
                    {
                    alt14=1;
                    }
                    break;

                }

                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:24: prepphrase
            	    {
            	    dbg.location(40,24);
            	    pushFollow(FOLLOW_prepphrase_in_verbphrase274);
            	    prepphrase20=prepphrase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, prepphrase20.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(40, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:42:1: verb : ( vbuse | vbchange | vbsubmerge | vbsubject | vbadd | vbcharge | vbcontain | vbdrop | vbfill | vbsuspend | vbtreat | vbapparatus | vbconcentrate | vbcool | vbdegass | vbdissolve | vbdry | vbextract | vbfilter | vbheat | vbincrease | vbpartition | vbprecipitate | vbpurify | vbquench | vbrecover | vbremove | vbstir | vbsynthesize | vbwait | vbwash | vbyield );
    public final ChemicalChunkerParser.verb_return verb() throws RecognitionException {
        ChemicalChunkerParser.verb_return retval = new ChemicalChunkerParser.verb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.vbuse_return vbuse21 = null;

        ChemicalChunkerParser.vbchange_return vbchange22 = null;

        ChemicalChunkerParser.vbsubmerge_return vbsubmerge23 = null;

        ChemicalChunkerParser.vbsubject_return vbsubject24 = null;

        ChemicalChunkerParser.vbadd_return vbadd25 = null;

        ChemicalChunkerParser.vbcharge_return vbcharge26 = null;

        ChemicalChunkerParser.vbcontain_return vbcontain27 = null;

        ChemicalChunkerParser.vbdrop_return vbdrop28 = null;

        ChemicalChunkerParser.vbfill_return vbfill29 = null;

        ChemicalChunkerParser.vbsuspend_return vbsuspend30 = null;

        ChemicalChunkerParser.vbtreat_return vbtreat31 = null;

        ChemicalChunkerParser.vbapparatus_return vbapparatus32 = null;

        ChemicalChunkerParser.vbconcentrate_return vbconcentrate33 = null;

        ChemicalChunkerParser.vbcool_return vbcool34 = null;

        ChemicalChunkerParser.vbdegass_return vbdegass35 = null;

        ChemicalChunkerParser.vbdissolve_return vbdissolve36 = null;

        ChemicalChunkerParser.vbdry_return vbdry37 = null;

        ChemicalChunkerParser.vbextract_return vbextract38 = null;

        ChemicalChunkerParser.vbfilter_return vbfilter39 = null;

        ChemicalChunkerParser.vbheat_return vbheat40 = null;

        ChemicalChunkerParser.vbincrease_return vbincrease41 = null;

        ChemicalChunkerParser.vbpartition_return vbpartition42 = null;

        ChemicalChunkerParser.vbprecipitate_return vbprecipitate43 = null;

        ChemicalChunkerParser.vbpurify_return vbpurify44 = null;

        ChemicalChunkerParser.vbquench_return vbquench45 = null;

        ChemicalChunkerParser.vbrecover_return vbrecover46 = null;

        ChemicalChunkerParser.vbremove_return vbremove47 = null;

        ChemicalChunkerParser.vbstir_return vbstir48 = null;

        ChemicalChunkerParser.vbsynthesize_return vbsynthesize49 = null;

        ChemicalChunkerParser.vbwait_return vbwait50 = null;

        ChemicalChunkerParser.vbwash_return vbwash51 = null;

        ChemicalChunkerParser.vbyield_return vbyield52 = null;



        try { dbg.enterRule(getGrammarFileName(), "verb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:43:2: ( vbuse | vbchange | vbsubmerge | vbsubject | vbadd | vbcharge | vbcontain | vbdrop | vbfill | vbsuspend | vbtreat | vbapparatus | vbconcentrate | vbcool | vbdegass | vbdissolve | vbdry | vbextract | vbfilter | vbheat | vbincrease | vbpartition | vbprecipitate | vbpurify | vbquench | vbrecover | vbremove | vbstir | vbsynthesize | vbwait | vbwash | vbyield )
            int alt15=32;
            try { dbg.enterDecision(15);

            switch ( input.LA(1) ) {
            case 51:
                {
                alt15=1;
                }
                break;
            case 52:
                {
                alt15=2;
                }
                break;
            case 53:
                {
                alt15=3;
                }
                break;
            case 54:
                {
                alt15=4;
                }
                break;
            case 57:
                {
                alt15=5;
                }
                break;
            case 58:
                {
                alt15=6;
                }
                break;
            case 59:
                {
                alt15=7;
                }
                break;
            case 60:
                {
                alt15=8;
                }
                break;
            case 61:
                {
                alt15=9;
                }
                break;
            case 62:
                {
                alt15=10;
                }
                break;
            case 63:
                {
                alt15=11;
                }
                break;
            case 64:
                {
                alt15=12;
                }
                break;
            case 66:
                {
                alt15=13;
                }
                break;
            case 68:
                {
                alt15=14;
                }
                break;
            case 69:
                {
                alt15=15;
                }
                break;
            case 70:
                {
                alt15=16;
                }
                break;
            case 71:
                {
                alt15=17;
                }
                break;
            case 73:
                {
                alt15=18;
                }
                break;
            case 75:
                {
                alt15=19;
                }
                break;
            case 77:
                {
                alt15=20;
                }
                break;
            case 78:
                {
                alt15=21;
                }
                break;
            case 79:
                {
                alt15=22;
                }
                break;
            case 80:
                {
                alt15=23;
                }
                break;
            case 82:
                {
                alt15=24;
                }
                break;
            case 84:
                {
                alt15=25;
                }
                break;
            case 85:
                {
                alt15=26;
                }
                break;
            case 86:
                {
                alt15=27;
                }
                break;
            case 88:
                {
                alt15=28;
                }
                break;
            case 89:
                {
                alt15=29;
                }
                break;
            case 91:
                {
                alt15=30;
                }
                break;
            case 92:
                {
                alt15=31;
                }
                break;
            case 93:
                {
                alt15=32;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:2: vbuse
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,2);
                    pushFollow(FOLLOW_vbuse_in_verb285);
                    vbuse21=vbuse();

                    state._fsp--;

                    adaptor.addChild(root_0, vbuse21.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:8: vbchange
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,8);
                    pushFollow(FOLLOW_vbchange_in_verb287);
                    vbchange22=vbchange();

                    state._fsp--;

                    adaptor.addChild(root_0, vbchange22.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:17: vbsubmerge
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,17);
                    pushFollow(FOLLOW_vbsubmerge_in_verb289);
                    vbsubmerge23=vbsubmerge();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsubmerge23.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:28: vbsubject
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,28);
                    pushFollow(FOLLOW_vbsubject_in_verb291);
                    vbsubject24=vbsubject();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsubject24.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:38: vbadd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,38);
                    pushFollow(FOLLOW_vbadd_in_verb293);
                    vbadd25=vbadd();

                    state._fsp--;

                    adaptor.addChild(root_0, vbadd25.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:44: vbcharge
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,44);
                    pushFollow(FOLLOW_vbcharge_in_verb295);
                    vbcharge26=vbcharge();

                    state._fsp--;

                    adaptor.addChild(root_0, vbcharge26.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:53: vbcontain
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,53);
                    pushFollow(FOLLOW_vbcontain_in_verb297);
                    vbcontain27=vbcontain();

                    state._fsp--;

                    adaptor.addChild(root_0, vbcontain27.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:63: vbdrop
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,63);
                    pushFollow(FOLLOW_vbdrop_in_verb299);
                    vbdrop28=vbdrop();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdrop28.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:70: vbfill
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,70);
                    pushFollow(FOLLOW_vbfill_in_verb301);
                    vbfill29=vbfill();

                    state._fsp--;

                    adaptor.addChild(root_0, vbfill29.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:77: vbsuspend
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,77);
                    pushFollow(FOLLOW_vbsuspend_in_verb303);
                    vbsuspend30=vbsuspend();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsuspend30.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:87: vbtreat
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,87);
                    pushFollow(FOLLOW_vbtreat_in_verb305);
                    vbtreat31=vbtreat();

                    state._fsp--;

                    adaptor.addChild(root_0, vbtreat31.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:95: vbapparatus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,95);
                    pushFollow(FOLLOW_vbapparatus_in_verb307);
                    vbapparatus32=vbapparatus();

                    state._fsp--;

                    adaptor.addChild(root_0, vbapparatus32.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:107: vbconcentrate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,107);
                    pushFollow(FOLLOW_vbconcentrate_in_verb309);
                    vbconcentrate33=vbconcentrate();

                    state._fsp--;

                    adaptor.addChild(root_0, vbconcentrate33.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:121: vbcool
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,121);
                    pushFollow(FOLLOW_vbcool_in_verb311);
                    vbcool34=vbcool();

                    state._fsp--;

                    adaptor.addChild(root_0, vbcool34.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:128: vbdegass
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,128);
                    pushFollow(FOLLOW_vbdegass_in_verb313);
                    vbdegass35=vbdegass();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdegass35.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:137: vbdissolve
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,137);
                    pushFollow(FOLLOW_vbdissolve_in_verb315);
                    vbdissolve36=vbdissolve();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdissolve36.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:148: vbdry
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,148);
                    pushFollow(FOLLOW_vbdry_in_verb317);
                    vbdry37=vbdry();

                    state._fsp--;

                    adaptor.addChild(root_0, vbdry37.getTree());

                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:154: vbextract
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,154);
                    pushFollow(FOLLOW_vbextract_in_verb319);
                    vbextract38=vbextract();

                    state._fsp--;

                    adaptor.addChild(root_0, vbextract38.getTree());

                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:44:164: vbfilter
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(44,164);
                    pushFollow(FOLLOW_vbfilter_in_verb321);
                    vbfilter39=vbfilter();

                    state._fsp--;

                    adaptor.addChild(root_0, vbfilter39.getTree());

                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:3: vbheat
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,3);
                    pushFollow(FOLLOW_vbheat_in_verb325);
                    vbheat40=vbheat();

                    state._fsp--;

                    adaptor.addChild(root_0, vbheat40.getTree());

                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:10: vbincrease
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,10);
                    pushFollow(FOLLOW_vbincrease_in_verb327);
                    vbincrease41=vbincrease();

                    state._fsp--;

                    adaptor.addChild(root_0, vbincrease41.getTree());

                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:21: vbpartition
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,21);
                    pushFollow(FOLLOW_vbpartition_in_verb329);
                    vbpartition42=vbpartition();

                    state._fsp--;

                    adaptor.addChild(root_0, vbpartition42.getTree());

                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:33: vbprecipitate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,33);
                    pushFollow(FOLLOW_vbprecipitate_in_verb331);
                    vbprecipitate43=vbprecipitate();

                    state._fsp--;

                    adaptor.addChild(root_0, vbprecipitate43.getTree());

                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:47: vbpurify
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,47);
                    pushFollow(FOLLOW_vbpurify_in_verb333);
                    vbpurify44=vbpurify();

                    state._fsp--;

                    adaptor.addChild(root_0, vbpurify44.getTree());

                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:56: vbquench
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,56);
                    pushFollow(FOLLOW_vbquench_in_verb335);
                    vbquench45=vbquench();

                    state._fsp--;

                    adaptor.addChild(root_0, vbquench45.getTree());

                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:65: vbrecover
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,65);
                    pushFollow(FOLLOW_vbrecover_in_verb337);
                    vbrecover46=vbrecover();

                    state._fsp--;

                    adaptor.addChild(root_0, vbrecover46.getTree());

                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:75: vbremove
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,75);
                    pushFollow(FOLLOW_vbremove_in_verb339);
                    vbremove47=vbremove();

                    state._fsp--;

                    adaptor.addChild(root_0, vbremove47.getTree());

                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:84: vbstir
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,84);
                    pushFollow(FOLLOW_vbstir_in_verb341);
                    vbstir48=vbstir();

                    state._fsp--;

                    adaptor.addChild(root_0, vbstir48.getTree());

                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:91: vbsynthesize
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,91);
                    pushFollow(FOLLOW_vbsynthesize_in_verb343);
                    vbsynthesize49=vbsynthesize();

                    state._fsp--;

                    adaptor.addChild(root_0, vbsynthesize49.getTree());

                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:104: vbwait
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,104);
                    pushFollow(FOLLOW_vbwait_in_verb345);
                    vbwait50=vbwait();

                    state._fsp--;

                    adaptor.addChild(root_0, vbwait50.getTree());

                    }
                    break;
                case 31 :
                    dbg.enterAlt(31);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:111: vbwash
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,111);
                    pushFollow(FOLLOW_vbwash_in_verb347);
                    vbwash51=vbwash();

                    state._fsp--;

                    adaptor.addChild(root_0, vbwash51.getTree());

                    }
                    break;
                case 32 :
                    dbg.enterAlt(32);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:45:118: vbyield
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,118);
                    pushFollow(FOLLOW_vbyield_in_verb349);
                    vbyield52=vbyield();

                    state._fsp--;

                    adaptor.addChild(root_0, vbyield52.getTree());

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
        dbg.location(45, 125);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:46:1: number : ( cd | oscarcd );
    public final ChemicalChunkerParser.number_return number() throws RecognitionException {
        ChemicalChunkerParser.number_return retval = new ChemicalChunkerParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd53 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd54 = null;



        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:2: ( cd | oscarcd )
            int alt16=2;
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==119) ) {
                alt16=1;
            }
            else if ( (LA16_0==10) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:4: cd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,4);
                    pushFollow(FOLLOW_cd_in_number368);
                    cd53=cd();

                    state._fsp--;

                    adaptor.addChild(root_0, cd53.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:47:7: oscarcd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(47,7);
                    pushFollow(FOLLOW_oscarcd_in_number370);
                    oscarcd54=oscarcd();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcd54.getTree());

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
        dbg.location(47, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:1: noun : ( unnamedmolecule | molecule | nnstate | nntime | nnatmosphere | nneq | nnchementity | nntemp | nnflash | nngeneral | nnmethod | nnamount | nnpressure | nncolumn | nnchromatography | nnvacuum | nncycle | nntimes | nnapparatus | nnconcentrate | wdt | wp_poss | wpo | wps | nnsynthesize | oscaront | nnmixture );
    public final ChemicalChunkerParser.noun_return noun() throws RecognitionException {
        ChemicalChunkerParser.noun_return retval = new ChemicalChunkerParser.noun_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.unnamedmolecule_return unnamedmolecule55 = null;

        ChemicalChunkerParser.molecule_return molecule56 = null;

        ChemicalChunkerParser.nnstate_return nnstate57 = null;

        ChemicalChunkerParser.nntime_return nntime58 = null;

        ChemicalChunkerParser.nnatmosphere_return nnatmosphere59 = null;

        ChemicalChunkerParser.nneq_return nneq60 = null;

        ChemicalChunkerParser.nnchementity_return nnchementity61 = null;

        ChemicalChunkerParser.nntemp_return nntemp62 = null;

        ChemicalChunkerParser.nnflash_return nnflash63 = null;

        ChemicalChunkerParser.nngeneral_return nngeneral64 = null;

        ChemicalChunkerParser.nnmethod_return nnmethod65 = null;

        ChemicalChunkerParser.nnamount_return nnamount66 = null;

        ChemicalChunkerParser.nnpressure_return nnpressure67 = null;

        ChemicalChunkerParser.nncolumn_return nncolumn68 = null;

        ChemicalChunkerParser.nnchromatography_return nnchromatography69 = null;

        ChemicalChunkerParser.nnvacuum_return nnvacuum70 = null;

        ChemicalChunkerParser.nncycle_return nncycle71 = null;

        ChemicalChunkerParser.nntimes_return nntimes72 = null;

        ChemicalChunkerParser.nnapparatus_return nnapparatus73 = null;

        ChemicalChunkerParser.nnconcentrate_return nnconcentrate74 = null;

        ChemicalChunkerParser.wdt_return wdt75 = null;

        ChemicalChunkerParser.wp_poss_return wp_poss76 = null;

        ChemicalChunkerParser.wpo_return wpo77 = null;

        ChemicalChunkerParser.wps_return wps78 = null;

        ChemicalChunkerParser.nnsynthesize_return nnsynthesize79 = null;

        ChemicalChunkerParser.oscaront_return oscaront80 = null;

        ChemicalChunkerParser.nnmixture_return nnmixture81 = null;



        try { dbg.enterRule(getGrammarFileName(), "noun");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:48:6: ( unnamedmolecule | molecule | nnstate | nntime | nnatmosphere | nneq | nnchementity | nntemp | nnflash | nngeneral | nnmethod | nnamount | nnpressure | nncolumn | nnchromatography | nnvacuum | nncycle | nntimes | nnapparatus | nnconcentrate | wdt | wp_poss | wpo | wps | nnsynthesize | oscaront | nnmixture )
            int alt17=27;
            try { dbg.enterDecision(17);

            try {
                isCyclicDecision = true;
                alt17 = dfa17.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:1: unnamedmolecule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,1);
                    pushFollow(FOLLOW_unnamedmolecule_in_noun379);
                    unnamedmolecule55=unnamedmolecule();

                    state._fsp--;

                    adaptor.addChild(root_0, unnamedmolecule55.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:17: molecule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,17);
                    pushFollow(FOLLOW_molecule_in_noun381);
                    molecule56=molecule();

                    state._fsp--;

                    adaptor.addChild(root_0, molecule56.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:26: nnstate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,26);
                    pushFollow(FOLLOW_nnstate_in_noun383);
                    nnstate57=nnstate();

                    state._fsp--;

                    adaptor.addChild(root_0, nnstate57.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:34: nntime
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,34);
                    pushFollow(FOLLOW_nntime_in_noun385);
                    nntime58=nntime();

                    state._fsp--;

                    adaptor.addChild(root_0, nntime58.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:41: nnatmosphere
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,41);
                    pushFollow(FOLLOW_nnatmosphere_in_noun387);
                    nnatmosphere59=nnatmosphere();

                    state._fsp--;

                    adaptor.addChild(root_0, nnatmosphere59.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:54: nneq
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,54);
                    pushFollow(FOLLOW_nneq_in_noun389);
                    nneq60=nneq();

                    state._fsp--;

                    adaptor.addChild(root_0, nneq60.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:59: nnchementity
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,59);
                    pushFollow(FOLLOW_nnchementity_in_noun391);
                    nnchementity61=nnchementity();

                    state._fsp--;

                    adaptor.addChild(root_0, nnchementity61.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:72: nntemp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,72);
                    pushFollow(FOLLOW_nntemp_in_noun393);
                    nntemp62=nntemp();

                    state._fsp--;

                    adaptor.addChild(root_0, nntemp62.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:79: nnflash
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,79);
                    pushFollow(FOLLOW_nnflash_in_noun395);
                    nnflash63=nnflash();

                    state._fsp--;

                    adaptor.addChild(root_0, nnflash63.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:87: nngeneral
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,87);
                    pushFollow(FOLLOW_nngeneral_in_noun397);
                    nngeneral64=nngeneral();

                    state._fsp--;

                    adaptor.addChild(root_0, nngeneral64.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:97: nnmethod
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,97);
                    pushFollow(FOLLOW_nnmethod_in_noun399);
                    nnmethod65=nnmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, nnmethod65.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:106: nnamount
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,106);
                    pushFollow(FOLLOW_nnamount_in_noun401);
                    nnamount66=nnamount();

                    state._fsp--;

                    adaptor.addChild(root_0, nnamount66.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:115: nnpressure
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,115);
                    pushFollow(FOLLOW_nnpressure_in_noun403);
                    nnpressure67=nnpressure();

                    state._fsp--;

                    adaptor.addChild(root_0, nnpressure67.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:126: nncolumn
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,126);
                    pushFollow(FOLLOW_nncolumn_in_noun405);
                    nncolumn68=nncolumn();

                    state._fsp--;

                    adaptor.addChild(root_0, nncolumn68.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:135: nnchromatography
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,135);
                    pushFollow(FOLLOW_nnchromatography_in_noun407);
                    nnchromatography69=nnchromatography();

                    state._fsp--;

                    adaptor.addChild(root_0, nnchromatography69.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:152: nnvacuum
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,152);
                    pushFollow(FOLLOW_nnvacuum_in_noun409);
                    nnvacuum70=nnvacuum();

                    state._fsp--;

                    adaptor.addChild(root_0, nnvacuum70.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:161: nncycle
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,161);
                    pushFollow(FOLLOW_nncycle_in_noun411);
                    nncycle71=nncycle();

                    state._fsp--;

                    adaptor.addChild(root_0, nncycle71.getTree());

                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:169: nntimes
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,169);
                    pushFollow(FOLLOW_nntimes_in_noun413);
                    nntimes72=nntimes();

                    state._fsp--;

                    adaptor.addChild(root_0, nntimes72.getTree());

                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:49:177: nnapparatus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(49,177);
                    pushFollow(FOLLOW_nnapparatus_in_noun415);
                    nnapparatus73=nnapparatus();

                    state._fsp--;

                    adaptor.addChild(root_0, nnapparatus73.getTree());

                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:50:1: nnconcentrate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,1);
                    pushFollow(FOLLOW_nnconcentrate_in_noun418);
                    nnconcentrate74=nnconcentrate();

                    state._fsp--;

                    adaptor.addChild(root_0, nnconcentrate74.getTree());

                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:50:15: wdt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,15);
                    pushFollow(FOLLOW_wdt_in_noun420);
                    wdt75=wdt();

                    state._fsp--;

                    adaptor.addChild(root_0, wdt75.getTree());

                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:50:19: wp_poss
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,19);
                    pushFollow(FOLLOW_wp_poss_in_noun422);
                    wp_poss76=wp_poss();

                    state._fsp--;

                    adaptor.addChild(root_0, wp_poss76.getTree());

                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:50:27: wpo
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,27);
                    pushFollow(FOLLOW_wpo_in_noun424);
                    wpo77=wpo();

                    state._fsp--;

                    adaptor.addChild(root_0, wpo77.getTree());

                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:50:31: wps
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,31);
                    pushFollow(FOLLOW_wps_in_noun426);
                    wps78=wps();

                    state._fsp--;

                    adaptor.addChild(root_0, wps78.getTree());

                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:50:35: nnsynthesize
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,35);
                    pushFollow(FOLLOW_nnsynthesize_in_noun428);
                    nnsynthesize79=nnsynthesize();

                    state._fsp--;

                    adaptor.addChild(root_0, nnsynthesize79.getTree());

                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:50:48: oscaront
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,48);
                    pushFollow(FOLLOW_oscaront_in_noun430);
                    oscaront80=oscaront();

                    state._fsp--;

                    adaptor.addChild(root_0, oscaront80.getTree());

                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:50:57: nnmixture
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,57);
                    pushFollow(FOLLOW_nnmixture_in_noun432);
                    nnmixture81=nnmixture();

                    state._fsp--;

                    adaptor.addChild(root_0, nnmixture81.getTree());

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
        dbg.location(50, 66);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "noun");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "noun"

    public static class mixture_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixture"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:1: mixture : lrb oscarCompound dash oscarCompound sym cd rrb ;
    public final ChemicalChunkerParser.mixture_return mixture() throws RecognitionException {
        ChemicalChunkerParser.mixture_return retval = new ChemicalChunkerParser.mixture_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.lrb_return lrb82 = null;

        ChemicalChunkerParser.oscarCompound_return oscarCompound83 = null;

        ChemicalChunkerParser.dash_return dash84 = null;

        ChemicalChunkerParser.oscarCompound_return oscarCompound85 = null;

        ChemicalChunkerParser.sym_return sym86 = null;

        ChemicalChunkerParser.cd_return cd87 = null;

        ChemicalChunkerParser.rrb_return rrb88 = null;



        try { dbg.enterRule(getGrammarFileName(), "mixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:9: ( lrb oscarCompound dash oscarCompound sym cd rrb )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:51:12: lrb oscarCompound dash oscarCompound sym cd rrb
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(51,12);
            pushFollow(FOLLOW_lrb_in_mixture440);
            lrb82=lrb();

            state._fsp--;

            adaptor.addChild(root_0, lrb82.getTree());
            dbg.location(51,16);
            pushFollow(FOLLOW_oscarCompound_in_mixture442);
            oscarCompound83=oscarCompound();

            state._fsp--;

            adaptor.addChild(root_0, oscarCompound83.getTree());
            dbg.location(51,30);
            pushFollow(FOLLOW_dash_in_mixture444);
            dash84=dash();

            state._fsp--;

            adaptor.addChild(root_0, dash84.getTree());
            dbg.location(51,35);
            pushFollow(FOLLOW_oscarCompound_in_mixture446);
            oscarCompound85=oscarCompound();

            state._fsp--;

            adaptor.addChild(root_0, oscarCompound85.getTree());
            dbg.location(51,49);
            pushFollow(FOLLOW_sym_in_mixture448);
            sym86=sym();

            state._fsp--;

            adaptor.addChild(root_0, sym86.getTree());
            dbg.location(51,53);
            pushFollow(FOLLOW_cd_in_mixture450);
            cd87=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd87.getTree());
            dbg.location(51,56);
            pushFollow(FOLLOW_rrb_in_mixture452);
            rrb88=rrb();

            state._fsp--;

            adaptor.addChild(root_0, rrb88.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(51, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mixture");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mixture"

    public static class adj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "adj"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:54:1: adj : ( jj | jjr | jjs | jjt | oscarcj );
    public final ChemicalChunkerParser.adj_return adj() throws RecognitionException {
        ChemicalChunkerParser.adj_return retval = new ChemicalChunkerParser.adj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.jj_return jj89 = null;

        ChemicalChunkerParser.jjr_return jjr90 = null;

        ChemicalChunkerParser.jjs_return jjs91 = null;

        ChemicalChunkerParser.jjt_return jjt92 = null;

        ChemicalChunkerParser.oscarcj_return oscarcj93 = null;



        try { dbg.enterRule(getGrammarFileName(), "adj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:54:5: ( jj | jjr | jjs | jjt | oscarcj )
            int alt18=5;
            try { dbg.enterDecision(18);

            switch ( input.LA(1) ) {
            case 135:
                {
                alt18=1;
                }
                break;
            case 136:
                {
                alt18=2;
                }
                break;
            case 137:
                {
                alt18=3;
                }
                break;
            case 138:
                {
                alt18=4;
                }
                break;
            case 11:
                {
                alt18=5;
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:54:7: jj
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(54,7);
                    pushFollow(FOLLOW_jj_in_adj462);
                    jj89=jj();

                    state._fsp--;

                    adaptor.addChild(root_0, jj89.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:54:10: jjr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(54,10);
                    pushFollow(FOLLOW_jjr_in_adj464);
                    jjr90=jjr();

                    state._fsp--;

                    adaptor.addChild(root_0, jjr90.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:54:14: jjs
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(54,14);
                    pushFollow(FOLLOW_jjs_in_adj466);
                    jjs91=jjs();

                    state._fsp--;

                    adaptor.addChild(root_0, jjs91.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:54:18: jjt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(54,18);
                    pushFollow(FOLLOW_jjt_in_adj468);
                    jjt92=jjt();

                    state._fsp--;

                    adaptor.addChild(root_0, jjt92.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:54:22: oscarcj
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(54,22);
                    pushFollow(FOLLOW_oscarcj_in_adj470);
                    oscarcj93=oscarcj();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcj93.getTree());

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
        dbg.location(54, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:1: adv : ( rb | rbr | rbt );
    public final ChemicalChunkerParser.adv_return adv() throws RecognitionException {
        ChemicalChunkerParser.adv_return retval = new ChemicalChunkerParser.adv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.rb_return rb94 = null;

        ChemicalChunkerParser.rbr_return rbr95 = null;

        ChemicalChunkerParser.rbt_return rbt96 = null;



        try { dbg.enterRule(getGrammarFileName(), "adv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:5: ( rb | rbr | rbt )
            int alt19=3;
            try { dbg.enterDecision(19);

            switch ( input.LA(1) ) {
            case 162:
                {
                alt19=1;
                }
                break;
            case 163:
                {
                alt19=2;
                }
                break;
            case 164:
                {
                alt19=3;
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:7: rb
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(56,7);
                    pushFollow(FOLLOW_rb_in_adv478);
                    rb94=rb();

                    state._fsp--;

                    adaptor.addChild(root_0, rb94.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:10: rbr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(56,10);
                    pushFollow(FOLLOW_rbr_in_adv480);
                    rbr95=rbr();

                    state._fsp--;

                    adaptor.addChild(root_0, rbr95.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:56:14: rbt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(56,14);
                    pushFollow(FOLLOW_rbt_in_adv482);
                    rbt96=rbt();

                    state._fsp--;

                    adaptor.addChild(root_0, rbt96.getTree());

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
        dbg.location(56, 17);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:58:1: prepphrase : ( prepphraseOther | prepphraseTemp | prepphraseTime );
    public final ChemicalChunkerParser.prepphrase_return prepphrase() throws RecognitionException {
        ChemicalChunkerParser.prepphrase_return retval = new ChemicalChunkerParser.prepphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.prepphraseOther_return prepphraseOther97 = null;

        ChemicalChunkerParser.prepphraseTemp_return prepphraseTemp98 = null;

        ChemicalChunkerParser.prepphraseTime_return prepphraseTime99 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:59:2: ( prepphraseOther | prepphraseTemp | prepphraseTime )
            int alt20=3;
            try { dbg.enterDecision(20);

            try {
                isCyclicDecision = true;
                alt20 = dfa20.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:59:5: prepphraseOther
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(59,5);
                    pushFollow(FOLLOW_prepphraseOther_in_prepphrase493);
                    prepphraseOther97=prepphraseOther();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseOther97.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:59:21: prepphraseTemp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(59,21);
                    pushFollow(FOLLOW_prepphraseTemp_in_prepphrase495);
                    prepphraseTemp98=prepphraseTemp();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseTemp98.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:59:36: prepphraseTime
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(59,36);
                    pushFollow(FOLLOW_prepphraseTime_in_prepphrase497);
                    prepphraseTime99=prepphraseTime();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseTime99.getTree());

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
        dbg.location(59, 52);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:61:2: prepphraseOther : inAll nounphrase -> ^( NODE[\"PrepPhrase\"] inAll nounphrase ) ;
    public final ChemicalChunkerParser.prepphraseOther_return prepphraseOther() throws RecognitionException {
        ChemicalChunkerParser.prepphraseOther_return retval = new ChemicalChunkerParser.prepphraseOther_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll100 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase101 = null;


        RewriteRuleSubtreeStream stream_nounphrase=new RewriteRuleSubtreeStream(adaptor,"rule nounphrase");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseOther");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 2);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:62:2: ( inAll nounphrase -> ^( NODE[\"PrepPhrase\"] inAll nounphrase ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:62:4: inAll nounphrase
            {
            dbg.location(62,4);
            pushFollow(FOLLOW_inAll_in_prepphraseOther509);
            inAll100=inAll();

            state._fsp--;

            stream_inAll.add(inAll100.getTree());
            dbg.location(62,11);
            pushFollow(FOLLOW_nounphrase_in_prepphraseOther512);
            nounphrase101=nounphrase();

            state._fsp--;

            stream_nounphrase.add(nounphrase101.getTree());


            // AST REWRITE
            // elements: inAll, nounphrase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:22: -> ^( NODE[\"PrepPhrase\"] inAll nounphrase )
            {
                dbg.location(62,26);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:62:26: ^( NODE[\"PrepPhrase\"] inAll nounphrase )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(62,28);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PrepPhrase"), root_1);

                dbg.location(62,48);
                adaptor.addChild(root_1, stream_inAll.nextTree());
                dbg.location(62,55);
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
        dbg.location(62, 66);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:63:1: prepphraseOf : inof nounphrase -> ^( NODE[\"PrepPhrase\"] inof nounphrase ) ;
    public final ChemicalChunkerParser.prepphraseOf_return prepphraseOf() throws RecognitionException {
        ChemicalChunkerParser.prepphraseOf_return retval = new ChemicalChunkerParser.prepphraseOf_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inof_return inof102 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase103 = null;


        RewriteRuleSubtreeStream stream_nounphrase=new RewriteRuleSubtreeStream(adaptor,"rule nounphrase");
        RewriteRuleSubtreeStream stream_inof=new RewriteRuleSubtreeStream(adaptor,"rule inof");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseOf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:64:2: ( inof nounphrase -> ^( NODE[\"PrepPhrase\"] inof nounphrase ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:64:4: inof nounphrase
            {
            dbg.location(64,4);
            pushFollow(FOLLOW_inof_in_prepphraseOf535);
            inof102=inof();

            state._fsp--;

            stream_inof.add(inof102.getTree());
            dbg.location(64,10);
            pushFollow(FOLLOW_nounphrase_in_prepphraseOf538);
            nounphrase103=nounphrase();

            state._fsp--;

            stream_nounphrase.add(nounphrase103.getTree());


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
            // 64:20: -> ^( NODE[\"PrepPhrase\"] inof nounphrase )
            {
                dbg.location(64,24);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:64:24: ^( NODE[\"PrepPhrase\"] inof nounphrase )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(64,26);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PrepPhrase"), root_1);

                dbg.location(64,46);
                adaptor.addChild(root_1, stream_inof.nextTree());
                dbg.location(64,52);
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
        dbg.location(64, 63);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:66:1: prepphraseIN : inin molecule -> ^( NODE[\"INMolecule\"] inin molecule ) ;
    public final ChemicalChunkerParser.prepphraseIN_return prepphraseIN() throws RecognitionException {
        ChemicalChunkerParser.prepphraseIN_return retval = new ChemicalChunkerParser.prepphraseIN_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inin_return inin104 = null;

        ChemicalChunkerParser.molecule_return molecule105 = null;


        RewriteRuleSubtreeStream stream_inin=new RewriteRuleSubtreeStream(adaptor,"rule inin");
        RewriteRuleSubtreeStream stream_molecule=new RewriteRuleSubtreeStream(adaptor,"rule molecule");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseIN");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:67:2: ( inin molecule -> ^( NODE[\"INMolecule\"] inin molecule ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:67:5: inin molecule
            {
            dbg.location(67,5);
            pushFollow(FOLLOW_inin_in_prepphraseIN562);
            inin104=inin();

            state._fsp--;

            stream_inin.add(inin104.getTree());
            dbg.location(67,10);
            pushFollow(FOLLOW_molecule_in_prepphraseIN564);
            molecule105=molecule();

            state._fsp--;

            stream_molecule.add(molecule105.getTree());


            // AST REWRITE
            // elements: molecule, inin
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:19: -> ^( NODE[\"INMolecule\"] inin molecule )
            {
                dbg.location(67,23);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:67:23: ^( NODE[\"INMolecule\"] inin molecule )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(67,25);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "INMolecule"), root_1);

                dbg.location(67,45);
                adaptor.addChild(root_1, stream_inin.nextTree());
                dbg.location(67,51);
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
        dbg.location(67, 60);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:1: prepphraseTime : ( inAll )? ( dt )? ( jj )? cd nntime -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime ) ;
    public final ChemicalChunkerParser.prepphraseTime_return prepphraseTime() throws RecognitionException {
        ChemicalChunkerParser.prepphraseTime_return retval = new ChemicalChunkerParser.prepphraseTime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll106 = null;

        ChemicalChunkerParser.dt_return dt107 = null;

        ChemicalChunkerParser.jj_return jj108 = null;

        ChemicalChunkerParser.cd_return cd109 = null;

        ChemicalChunkerParser.nntime_return nntime110 = null;


        RewriteRuleSubtreeStream stream_dt=new RewriteRuleSubtreeStream(adaptor,"rule dt");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        RewriteRuleSubtreeStream stream_nntime=new RewriteRuleSubtreeStream(adaptor,"rule nntime");
        RewriteRuleSubtreeStream stream_jj=new RewriteRuleSubtreeStream(adaptor,"rule jj");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseTime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:15: ( ( inAll )? ( dt )? ( jj )? cd nntime -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:2: ( inAll )? ( dt )? ( jj )? cd nntime
            {
            dbg.location(71,2);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:2: ( inAll )?
            int alt21=2;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21);

            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=15 && LA21_0<=30)||LA21_0==134) ) {
                alt21=1;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:2: inAll
                    {
                    dbg.location(71,2);
                    pushFollow(FOLLOW_inAll_in_prepphraseTime588);
                    inAll106=inAll();

                    state._fsp--;

                    stream_inAll.add(inAll106.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(71,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:9: ( dt )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==124) ) {
                alt22=1;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:9: dt
                    {
                    dbg.location(71,9);
                    pushFollow(FOLLOW_dt_in_prepphraseTime591);
                    dt107=dt();

                    state._fsp--;

                    stream_dt.add(dt107.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}

            dbg.location(71,13);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:13: ( jj )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==135) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:13: jj
                    {
                    dbg.location(71,13);
                    pushFollow(FOLLOW_jj_in_prepphraseTime594);
                    jj108=jj();

                    state._fsp--;

                    stream_jj.add(jj108.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

            dbg.location(71,17);
            pushFollow(FOLLOW_cd_in_prepphraseTime597);
            cd109=cd();

            state._fsp--;

            stream_cd.add(cd109.getTree());
            dbg.location(71,20);
            pushFollow(FOLLOW_nntime_in_prepphraseTime599);
            nntime110=nntime();

            state._fsp--;

            stream_nntime.add(nntime110.getTree());


            // AST REWRITE
            // elements: nntime, cd, jj, dt, inAll
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:27: -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime )
            {
                dbg.location(71,31);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:71:31: ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(71,33);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "TimePhrase"), root_1);

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
        dbg.location(71, 78);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:1: prepphraseTemp : ( inAll )? ( dt )? ( jj )? cd nntemp -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp ) ;
    public final ChemicalChunkerParser.prepphraseTemp_return prepphraseTemp() throws RecognitionException {
        ChemicalChunkerParser.prepphraseTemp_return retval = new ChemicalChunkerParser.prepphraseTemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll111 = null;

        ChemicalChunkerParser.dt_return dt112 = null;

        ChemicalChunkerParser.jj_return jj113 = null;

        ChemicalChunkerParser.cd_return cd114 = null;

        ChemicalChunkerParser.nntemp_return nntemp115 = null;


        RewriteRuleSubtreeStream stream_dt=new RewriteRuleSubtreeStream(adaptor,"rule dt");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        RewriteRuleSubtreeStream stream_nntemp=new RewriteRuleSubtreeStream(adaptor,"rule nntemp");
        RewriteRuleSubtreeStream stream_jj=new RewriteRuleSubtreeStream(adaptor,"rule jj");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseTemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:15: ( ( inAll )? ( dt )? ( jj )? cd nntemp -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:2: ( inAll )? ( dt )? ( jj )? cd nntemp
            {
            dbg.location(74,2);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:2: ( inAll )?
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=15 && LA24_0<=30)||LA24_0==134) ) {
                alt24=1;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:2: inAll
                    {
                    dbg.location(74,2);
                    pushFollow(FOLLOW_inAll_in_prepphraseTemp629);
                    inAll111=inAll();

                    state._fsp--;

                    stream_inAll.add(inAll111.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(74,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:9: ( dt )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==124) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:9: dt
                    {
                    dbg.location(74,9);
                    pushFollow(FOLLOW_dt_in_prepphraseTemp632);
                    dt112=dt();

                    state._fsp--;

                    stream_dt.add(dt112.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(74,13);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:13: ( jj )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==135) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:13: jj
                    {
                    dbg.location(74,13);
                    pushFollow(FOLLOW_jj_in_prepphraseTemp635);
                    jj113=jj();

                    state._fsp--;

                    stream_jj.add(jj113.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(74,17);
            pushFollow(FOLLOW_cd_in_prepphraseTemp638);
            cd114=cd();

            state._fsp--;

            stream_cd.add(cd114.getTree());
            dbg.location(74,20);
            pushFollow(FOLLOW_nntemp_in_prepphraseTemp640);
            nntemp115=nntemp();

            state._fsp--;

            stream_nntemp.add(nntemp115.getTree());


            // AST REWRITE
            // elements: cd, nntemp, dt, inAll, jj
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:27: -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp )
            {
                dbg.location(74,31);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:31: ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(74,33);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "TempPhrase"), root_1);

                dbg.location(74,53);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:53: ( inAll )?
                if ( stream_inAll.hasNext() ) {
                    dbg.location(74,53);
                    adaptor.addChild(root_1, stream_inAll.nextTree());

                }
                stream_inAll.reset();
                dbg.location(74,60);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:60: ( dt )?
                if ( stream_dt.hasNext() ) {
                    dbg.location(74,60);
                    adaptor.addChild(root_1, stream_dt.nextTree());

                }
                stream_dt.reset();
                dbg.location(74,64);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:74:64: ( jj )?
                if ( stream_jj.hasNext() ) {
                    dbg.location(74,64);
                    adaptor.addChild(root_1, stream_jj.nextTree());

                }
                stream_jj.reset();
                dbg.location(74,68);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(74,71);
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
        dbg.location(74, 78);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:1: inAll : ( in | inafter | inas | inbefore | inby | infor | infrom | inin | ininto | inof | inoff | inon | inover | inunder | invia | inwith | inwithout );
    public final ChemicalChunkerParser.inAll_return inAll() throws RecognitionException {
        ChemicalChunkerParser.inAll_return retval = new ChemicalChunkerParser.inAll_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.in_return in116 = null;

        ChemicalChunkerParser.inafter_return inafter117 = null;

        ChemicalChunkerParser.inas_return inas118 = null;

        ChemicalChunkerParser.inbefore_return inbefore119 = null;

        ChemicalChunkerParser.inby_return inby120 = null;

        ChemicalChunkerParser.infor_return infor121 = null;

        ChemicalChunkerParser.infrom_return infrom122 = null;

        ChemicalChunkerParser.inin_return inin123 = null;

        ChemicalChunkerParser.ininto_return ininto124 = null;

        ChemicalChunkerParser.inof_return inof125 = null;

        ChemicalChunkerParser.inoff_return inoff126 = null;

        ChemicalChunkerParser.inon_return inon127 = null;

        ChemicalChunkerParser.inover_return inover128 = null;

        ChemicalChunkerParser.inunder_return inunder129 = null;

        ChemicalChunkerParser.invia_return invia130 = null;

        ChemicalChunkerParser.inwith_return inwith131 = null;

        ChemicalChunkerParser.inwithout_return inwithout132 = null;



        try { dbg.enterRule(getGrammarFileName(), "inAll");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:7: ( in | inafter | inas | inbefore | inby | infor | infrom | inin | ininto | inof | inoff | inon | inover | inunder | invia | inwith | inwithout )
            int alt27=17;
            try { dbg.enterDecision(27);

            switch ( input.LA(1) ) {
            case 134:
                {
                alt27=1;
                }
                break;
            case 17:
                {
                alt27=2;
                }
                break;
            case 15:
                {
                alt27=3;
                }
                break;
            case 16:
                {
                alt27=4;
                }
                break;
            case 22:
                {
                alt27=5;
                }
                break;
            case 26:
                {
                alt27=6;
                }
                break;
            case 27:
                {
                alt27=7;
                }
                break;
            case 18:
                {
                alt27=8;
                }
                break;
            case 19:
                {
                alt27=9;
                }
                break;
            case 24:
                {
                alt27=10;
                }
                break;
            case 30:
                {
                alt27=11;
                }
                break;
            case 25:
                {
                alt27=12;
                }
                break;
            case 29:
                {
                alt27=13;
                }
                break;
            case 28:
                {
                alt27=14;
                }
                break;
            case 23:
                {
                alt27=15;
                }
                break;
            case 20:
                {
                alt27=16;
                }
                break;
            case 21:
                {
                alt27=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:9: in
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,9);
                    pushFollow(FOLLOW_in_in_inAll673);
                    in116=in();

                    state._fsp--;

                    adaptor.addChild(root_0, in116.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:12: inafter
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,12);
                    pushFollow(FOLLOW_inafter_in_inAll675);
                    inafter117=inafter();

                    state._fsp--;

                    adaptor.addChild(root_0, inafter117.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:20: inas
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,20);
                    pushFollow(FOLLOW_inas_in_inAll677);
                    inas118=inas();

                    state._fsp--;

                    adaptor.addChild(root_0, inas118.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:25: inbefore
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,25);
                    pushFollow(FOLLOW_inbefore_in_inAll679);
                    inbefore119=inbefore();

                    state._fsp--;

                    adaptor.addChild(root_0, inbefore119.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:34: inby
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,34);
                    pushFollow(FOLLOW_inby_in_inAll681);
                    inby120=inby();

                    state._fsp--;

                    adaptor.addChild(root_0, inby120.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:39: infor
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,39);
                    pushFollow(FOLLOW_infor_in_inAll683);
                    infor121=infor();

                    state._fsp--;

                    adaptor.addChild(root_0, infor121.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:45: infrom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,45);
                    pushFollow(FOLLOW_infrom_in_inAll685);
                    infrom122=infrom();

                    state._fsp--;

                    adaptor.addChild(root_0, infrom122.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:52: inin
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,52);
                    pushFollow(FOLLOW_inin_in_inAll687);
                    inin123=inin();

                    state._fsp--;

                    adaptor.addChild(root_0, inin123.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:57: ininto
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,57);
                    pushFollow(FOLLOW_ininto_in_inAll689);
                    ininto124=ininto();

                    state._fsp--;

                    adaptor.addChild(root_0, ininto124.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:64: inof
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,64);
                    pushFollow(FOLLOW_inof_in_inAll691);
                    inof125=inof();

                    state._fsp--;

                    adaptor.addChild(root_0, inof125.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:69: inoff
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,69);
                    pushFollow(FOLLOW_inoff_in_inAll693);
                    inoff126=inoff();

                    state._fsp--;

                    adaptor.addChild(root_0, inoff126.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:75: inon
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,75);
                    pushFollow(FOLLOW_inon_in_inAll695);
                    inon127=inon();

                    state._fsp--;

                    adaptor.addChild(root_0, inon127.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:80: inover
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,80);
                    pushFollow(FOLLOW_inover_in_inAll697);
                    inover128=inover();

                    state._fsp--;

                    adaptor.addChild(root_0, inover128.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:87: inunder
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,87);
                    pushFollow(FOLLOW_inunder_in_inAll699);
                    inunder129=inunder();

                    state._fsp--;

                    adaptor.addChild(root_0, inunder129.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:95: invia
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,95);
                    pushFollow(FOLLOW_invia_in_inAll701);
                    invia130=invia();

                    state._fsp--;

                    adaptor.addChild(root_0, invia130.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:101: inwith
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,101);
                    pushFollow(FOLLOW_inwith_in_inAll703);
                    inwith131=inwith();

                    state._fsp--;

                    adaptor.addChild(root_0, inwith131.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:78:108: inwithout
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,108);
                    pushFollow(FOLLOW_inwithout_in_inAll705);
                    inwithout132=inwithout();

                    state._fsp--;

                    adaptor.addChild(root_0, inwithout132.getTree());

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
        dbg.location(78, 118);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:1: mmol : cd nnmol -> ^( NODE[\"MMOL\"] cd nnmol ) ;
    public final ChemicalChunkerParser.mmol_return mmol() throws RecognitionException {
        ChemicalChunkerParser.mmol_return retval = new ChemicalChunkerParser.mmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd133 = null;

        ChemicalChunkerParser.nnmol_return nnmol134 = null;


        RewriteRuleSubtreeStream stream_nnmol=new RewriteRuleSubtreeStream(adaptor,"rule nnmol");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "mmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:6: ( cd nnmol -> ^( NODE[\"MMOL\"] cd nnmol ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:8: cd nnmol
            {
            dbg.location(82,8);
            pushFollow(FOLLOW_cd_in_mmol719);
            cd133=cd();

            state._fsp--;

            stream_cd.add(cd133.getTree());
            dbg.location(82,11);
            pushFollow(FOLLOW_nnmol_in_mmol721);
            nnmol134=nnmol();

            state._fsp--;

            stream_nnmol.add(nnmol134.getTree());


            // AST REWRITE
            // elements: nnmol, cd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:17: -> ^( NODE[\"MMOL\"] cd nnmol )
            {
                dbg.location(82,20);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:20: ^( NODE[\"MMOL\"] cd nnmol )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(82,22);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "MMOL"), root_1);

                dbg.location(82,37);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(82,40);
                adaptor.addChild(root_1, stream_nnmol.nextTree());

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
        dbg.location(82, 47);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:83:1: gram : cd nngram -> ^( NODE[\"GRAM\"] cd nngram ) ;
    public final ChemicalChunkerParser.gram_return gram() throws RecognitionException {
        ChemicalChunkerParser.gram_return retval = new ChemicalChunkerParser.gram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd135 = null;

        ChemicalChunkerParser.nngram_return nngram136 = null;


        RewriteRuleSubtreeStream stream_nngram=new RewriteRuleSubtreeStream(adaptor,"rule nngram");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "gram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:83:6: ( cd nngram -> ^( NODE[\"GRAM\"] cd nngram ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:83:8: cd nngram
            {
            dbg.location(83,8);
            pushFollow(FOLLOW_cd_in_gram742);
            cd135=cd();

            state._fsp--;

            stream_cd.add(cd135.getTree());
            dbg.location(83,11);
            pushFollow(FOLLOW_nngram_in_gram744);
            nngram136=nngram();

            state._fsp--;

            stream_nngram.add(nngram136.getTree());


            // AST REWRITE
            // elements: cd, nngram
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:17: -> ^( NODE[\"GRAM\"] cd nngram )
            {
                dbg.location(83,20);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:83:20: ^( NODE[\"GRAM\"] cd nngram )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(83,22);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "GRAM"), root_1);

                dbg.location(83,37);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(83,40);
                adaptor.addChild(root_1, stream_nngram.nextTree());

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
        dbg.location(83, 48);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:1: percent : cd nnpercent -> ^( NODE[\"PERCENT\"] cd nnpercent ) ;
    public final ChemicalChunkerParser.percent_return percent() throws RecognitionException {
        ChemicalChunkerParser.percent_return retval = new ChemicalChunkerParser.percent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd137 = null;

        ChemicalChunkerParser.nnpercent_return nnpercent138 = null;


        RewriteRuleSubtreeStream stream_nnpercent=new RewriteRuleSubtreeStream(adaptor,"rule nnpercent");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "percent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:9: ( cd nnpercent -> ^( NODE[\"PERCENT\"] cd nnpercent ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:11: cd nnpercent
            {
            dbg.location(84,11);
            pushFollow(FOLLOW_cd_in_percent765);
            cd137=cd();

            state._fsp--;

            stream_cd.add(cd137.getTree());
            dbg.location(84,14);
            pushFollow(FOLLOW_nnpercent_in_percent767);
            nnpercent138=nnpercent();

            state._fsp--;

            stream_nnpercent.add(nnpercent138.getTree());


            // AST REWRITE
            // elements: nnpercent, cd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 84:24: -> ^( NODE[\"PERCENT\"] cd nnpercent )
            {
                dbg.location(84,27);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:27: ^( NODE[\"PERCENT\"] cd nnpercent )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(84,29);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PERCENT"), root_1);

                dbg.location(84,47);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(84,50);
                adaptor.addChild(root_1, stream_nnpercent.nextTree());

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
        dbg.location(84, 61);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:1: volume : cd nnvol -> ^( NODE[\"VOLUME\"] cd nnvol ) ;
    public final ChemicalChunkerParser.volume_return volume() throws RecognitionException {
        ChemicalChunkerParser.volume_return retval = new ChemicalChunkerParser.volume_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd139 = null;

        ChemicalChunkerParser.nnvol_return nnvol140 = null;


        RewriteRuleSubtreeStream stream_nnvol=new RewriteRuleSubtreeStream(adaptor,"rule nnvol");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "volume");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:8: ( cd nnvol -> ^( NODE[\"VOLUME\"] cd nnvol ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:10: cd nnvol
            {
            dbg.location(85,10);
            pushFollow(FOLLOW_cd_in_volume788);
            cd139=cd();

            state._fsp--;

            stream_cd.add(cd139.getTree());
            dbg.location(85,13);
            pushFollow(FOLLOW_nnvol_in_volume790);
            nnvol140=nnvol();

            state._fsp--;

            stream_nnvol.add(nnvol140.getTree());


            // AST REWRITE
            // elements: cd, nnvol
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:19: -> ^( NODE[\"VOLUME\"] cd nnvol )
            {
                dbg.location(85,22);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:85:22: ^( NODE[\"VOLUME\"] cd nnvol )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(85,24);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "VOLUME"), root_1);

                dbg.location(85,41);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(85,44);
                adaptor.addChild(root_1, stream_nnvol.nextTree());

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
        dbg.location(85, 51);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:87:1: measurements : ( mmol | gram | percent | volume );
    public final ChemicalChunkerParser.measurements_return measurements() throws RecognitionException {
        ChemicalChunkerParser.measurements_return retval = new ChemicalChunkerParser.measurements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.mmol_return mmol141 = null;

        ChemicalChunkerParser.gram_return gram142 = null;

        ChemicalChunkerParser.percent_return percent143 = null;

        ChemicalChunkerParser.volume_return volume144 = null;



        try { dbg.enterRule(getGrammarFileName(), "measurements");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:88:2: ( mmol | gram | percent | volume )
            int alt28=4;
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==119) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==TOKEN) ) {
                    switch ( input.LA(3) ) {
                    case 37:
                        {
                        alt28=4;
                        }
                        break;
                    case 100:
                        {
                        alt28=3;
                        }
                        break;
                    case 34:
                        {
                        alt28=1;
                        }
                        break;
                    case 33:
                        {
                        alt28=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:88:3: mmol
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(88,3);
                    pushFollow(FOLLOW_mmol_in_measurements812);
                    mmol141=mmol();

                    state._fsp--;

                    adaptor.addChild(root_0, mmol141.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:88:8: gram
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(88,8);
                    pushFollow(FOLLOW_gram_in_measurements814);
                    gram142=gram();

                    state._fsp--;

                    adaptor.addChild(root_0, gram142.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:88:13: percent
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(88,13);
                    pushFollow(FOLLOW_percent_in_measurements816);
                    percent143=percent();

                    state._fsp--;

                    adaptor.addChild(root_0, percent143.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:88:21: volume
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(88,21);
                    pushFollow(FOLLOW_volume_in_measurements818);
                    volume144=volume();

                    state._fsp--;

                    adaptor.addChild(root_0, volume144.getTree());

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
        dbg.location(88, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "measurements");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "measurements"

    public static class oscarCompound_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oscarCompound"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:90:1: oscarCompound : ( oscarcm )+ -> ^( NODE[\"OSCARCM\"] ( oscarcm )+ ) ;
    public final ChemicalChunkerParser.oscarCompound_return oscarCompound() throws RecognitionException {
        ChemicalChunkerParser.oscarCompound_return retval = new ChemicalChunkerParser.oscarCompound_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarcm_return oscarcm145 = null;


        RewriteRuleSubtreeStream stream_oscarcm=new RewriteRuleSubtreeStream(adaptor,"rule oscarcm");
        try { dbg.enterRule(getGrammarFileName(), "oscarCompound");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:90:15: ( ( oscarcm )+ -> ^( NODE[\"OSCARCM\"] ( oscarcm )+ ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:90:17: ( oscarcm )+
            {
            dbg.location(90,17);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:90:17: ( oscarcm )+
            int cnt29=0;
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29);

                int LA29_0 = input.LA(1);

                if ( (LA29_0==50) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:90:17: oscarcm
            	    {
            	    dbg.location(90,17);
            	    pushFollow(FOLLOW_oscarcm_in_oscarCompound827);
            	    oscarcm145=oscarcm();

            	    state._fsp--;

            	    stream_oscarcm.add(oscarcm145.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt29++;
            } while (true);
            } finally {dbg.exitSubRule(29);}



            // AST REWRITE
            // elements: oscarcm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:26: -> ^( NODE[\"OSCARCM\"] ( oscarcm )+ )
            {
                dbg.location(90,29);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:90:29: ^( NODE[\"OSCARCM\"] ( oscarcm )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(90,31);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "OSCARCM"), root_1);

                dbg.location(90,48);
                if ( !(stream_oscarcm.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_oscarcm.hasNext() ) {
                    dbg.location(90,48);
                    adaptor.addChild(root_1, stream_oscarcm.nextTree());

                }
                stream_oscarcm.reset();

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
        dbg.location(90, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oscarCompound");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oscarCompound"

    public static class moleculeamount1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moleculeamount1"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:1: moleculeamount1 : measurements inof oscarCompound ;
    public final ChemicalChunkerParser.moleculeamount1_return moleculeamount1() throws RecognitionException {
        ChemicalChunkerParser.moleculeamount1_return retval = new ChemicalChunkerParser.moleculeamount1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.measurements_return measurements146 = null;

        ChemicalChunkerParser.inof_return inof147 = null;

        ChemicalChunkerParser.oscarCompound_return oscarCompound148 = null;



        try { dbg.enterRule(getGrammarFileName(), "moleculeamount1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:94:2: ( measurements inof oscarCompound )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:94:3: measurements inof oscarCompound
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(94,3);
            pushFollow(FOLLOW_measurements_in_moleculeamount1848);
            measurements146=measurements();

            state._fsp--;

            adaptor.addChild(root_0, measurements146.getTree());
            dbg.location(94,16);
            pushFollow(FOLLOW_inof_in_moleculeamount1850);
            inof147=inof();

            state._fsp--;

            adaptor.addChild(root_0, inof147.getTree());
            dbg.location(94,21);
            pushFollow(FOLLOW_oscarCompound_in_moleculeamount1852);
            oscarCompound148=oscarCompound();

            state._fsp--;

            adaptor.addChild(root_0, oscarCompound148.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(94, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "moleculeamount1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "moleculeamount1"

    public static class moleculeamount2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moleculeamount2"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:95:1: moleculeamount2 : oscarCompound ( amount )* ;
    public final ChemicalChunkerParser.moleculeamount2_return moleculeamount2() throws RecognitionException {
        ChemicalChunkerParser.moleculeamount2_return retval = new ChemicalChunkerParser.moleculeamount2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarCompound_return oscarCompound149 = null;

        ChemicalChunkerParser.amount_return amount150 = null;



        try { dbg.enterRule(getGrammarFileName(), "moleculeamount2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:2: ( oscarCompound ( amount )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:3: oscarCompound ( amount )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(96,3);
            pushFollow(FOLLOW_oscarCompound_in_moleculeamount2860);
            oscarCompound149=oscarCompound();

            state._fsp--;

            adaptor.addChild(root_0, oscarCompound149.getTree());
            dbg.location(96,17);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:17: ( amount )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==103) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:17: amount
            	    {
            	    dbg.location(96,17);
            	    pushFollow(FOLLOW_amount_in_moleculeamount2862);
            	    amount150=amount();

            	    state._fsp--;

            	    adaptor.addChild(root_0, amount150.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(96, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "moleculeamount2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "moleculeamount2"

    public static class moleculeamount_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moleculeamount"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:97:1: moleculeamount : ( moleculeamount1 | moleculeamount2 );
    public final ChemicalChunkerParser.moleculeamount_return moleculeamount() throws RecognitionException {
        ChemicalChunkerParser.moleculeamount_return retval = new ChemicalChunkerParser.moleculeamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.moleculeamount1_return moleculeamount1151 = null;

        ChemicalChunkerParser.moleculeamount2_return moleculeamount2152 = null;



        try { dbg.enterRule(getGrammarFileName(), "moleculeamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:98:2: ( moleculeamount1 | moleculeamount2 )
            int alt31=2;
            try { dbg.enterDecision(31);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==119) ) {
                alt31=1;
            }
            else if ( (LA31_0==50) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:98:3: moleculeamount1
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(98,3);
                    pushFollow(FOLLOW_moleculeamount1_in_moleculeamount872);
                    moleculeamount1151=moleculeamount1();

                    state._fsp--;

                    adaptor.addChild(root_0, moleculeamount1151.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:98:21: moleculeamount2
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(98,21);
                    pushFollow(FOLLOW_moleculeamount2_in_moleculeamount876);
                    moleculeamount2152=moleculeamount2();

                    state._fsp--;

                    adaptor.addChild(root_0, moleculeamount2152.getTree());

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
        dbg.location(98, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "moleculeamount");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "moleculeamount"

    public static class molecule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "molecule"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:99:1: molecule : moleculeamount -> ^( NODE[\"MOLECULE\"] moleculeamount ) ;
    public final ChemicalChunkerParser.molecule_return molecule() throws RecognitionException {
        ChemicalChunkerParser.molecule_return retval = new ChemicalChunkerParser.molecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.moleculeamount_return moleculeamount153 = null;


        RewriteRuleSubtreeStream stream_moleculeamount=new RewriteRuleSubtreeStream(adaptor,"rule moleculeamount");
        try { dbg.enterRule(getGrammarFileName(), "molecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:100:2: ( moleculeamount -> ^( NODE[\"MOLECULE\"] moleculeamount ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:100:5: moleculeamount
            {
            dbg.location(100,5);
            pushFollow(FOLLOW_moleculeamount_in_molecule897);
            moleculeamount153=moleculeamount();

            state._fsp--;

            stream_moleculeamount.add(moleculeamount153.getTree());


            // AST REWRITE
            // elements: moleculeamount
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 100:19: -> ^( NODE[\"MOLECULE\"] moleculeamount )
            {
                dbg.location(100,22);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:100:22: ^( NODE[\"MOLECULE\"] moleculeamount )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(100,24);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "MOLECULE"), root_1);

                dbg.location(100,42);
                adaptor.addChild(root_1, stream_moleculeamount.nextTree());

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
        dbg.location(100, 58);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "molecule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "molecule"

    public static class unnamedmoleculeamount1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unnamedmoleculeamount1"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:102:1: unnamedmoleculeamount1 : measurements inof oscarcd ;
    public final ChemicalChunkerParser.unnamedmoleculeamount1_return unnamedmoleculeamount1() throws RecognitionException {
        ChemicalChunkerParser.unnamedmoleculeamount1_return retval = new ChemicalChunkerParser.unnamedmoleculeamount1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.measurements_return measurements154 = null;

        ChemicalChunkerParser.inof_return inof155 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd156 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmoleculeamount1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:103:2: ( measurements inof oscarcd )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:103:3: measurements inof oscarcd
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(103,3);
            pushFollow(FOLLOW_measurements_in_unnamedmoleculeamount1916);
            measurements154=measurements();

            state._fsp--;

            adaptor.addChild(root_0, measurements154.getTree());
            dbg.location(103,16);
            pushFollow(FOLLOW_inof_in_unnamedmoleculeamount1918);
            inof155=inof();

            state._fsp--;

            adaptor.addChild(root_0, inof155.getTree());
            dbg.location(103,21);
            pushFollow(FOLLOW_oscarcd_in_unnamedmoleculeamount1920);
            oscarcd156=oscarcd();

            state._fsp--;

            adaptor.addChild(root_0, oscarcd156.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(103, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unnamedmoleculeamount1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unnamedmoleculeamount1"

    public static class unnamedmoleculeamount2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unnamedmoleculeamount2"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:104:1: unnamedmoleculeamount2 : oscarcd ( amount )* ;
    public final ChemicalChunkerParser.unnamedmoleculeamount2_return unnamedmoleculeamount2() throws RecognitionException {
        ChemicalChunkerParser.unnamedmoleculeamount2_return retval = new ChemicalChunkerParser.unnamedmoleculeamount2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd157 = null;

        ChemicalChunkerParser.amount_return amount158 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmoleculeamount2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:105:2: ( oscarcd ( amount )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:105:3: oscarcd ( amount )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(105,3);
            pushFollow(FOLLOW_oscarcd_in_unnamedmoleculeamount2928);
            oscarcd157=oscarcd();

            state._fsp--;

            adaptor.addChild(root_0, oscarcd157.getTree());
            dbg.location(105,11);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:105:11: ( amount )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                int LA32_0 = input.LA(1);

                if ( (LA32_0==103) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:105:11: amount
            	    {
            	    dbg.location(105,11);
            	    pushFollow(FOLLOW_amount_in_unnamedmoleculeamount2930);
            	    amount158=amount();

            	    state._fsp--;

            	    adaptor.addChild(root_0, amount158.getTree());

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
        dbg.location(105, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unnamedmoleculeamount2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unnamedmoleculeamount2"

    public static class unnamedmoleculeamount_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unnamedmoleculeamount"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:106:1: unnamedmoleculeamount : ( unnamedmoleculeamount1 | unnamedmoleculeamount2 );
    public final ChemicalChunkerParser.unnamedmoleculeamount_return unnamedmoleculeamount() throws RecognitionException {
        ChemicalChunkerParser.unnamedmoleculeamount_return retval = new ChemicalChunkerParser.unnamedmoleculeamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.unnamedmoleculeamount1_return unnamedmoleculeamount1159 = null;

        ChemicalChunkerParser.unnamedmoleculeamount2_return unnamedmoleculeamount2160 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmoleculeamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:107:2: ( unnamedmoleculeamount1 | unnamedmoleculeamount2 )
            int alt33=2;
            try { dbg.enterDecision(33);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==119) ) {
                alt33=1;
            }
            else if ( (LA33_0==10) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:107:3: unnamedmoleculeamount1
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(107,3);
                    pushFollow(FOLLOW_unnamedmoleculeamount1_in_unnamedmoleculeamount940);
                    unnamedmoleculeamount1159=unnamedmoleculeamount1();

                    state._fsp--;

                    adaptor.addChild(root_0, unnamedmoleculeamount1159.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:107:28: unnamedmoleculeamount2
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(107,28);
                    pushFollow(FOLLOW_unnamedmoleculeamount2_in_unnamedmoleculeamount944);
                    unnamedmoleculeamount2160=unnamedmoleculeamount2();

                    state._fsp--;

                    adaptor.addChild(root_0, unnamedmoleculeamount2160.getTree());

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
        dbg.location(107, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unnamedmoleculeamount");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unnamedmoleculeamount"

    public static class unnamedmolecule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unnamedmolecule"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:110:1: unnamedmolecule : unnamedmoleculeamount -> ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount ) ;
    public final ChemicalChunkerParser.unnamedmolecule_return unnamedmolecule() throws RecognitionException {
        ChemicalChunkerParser.unnamedmolecule_return retval = new ChemicalChunkerParser.unnamedmolecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.unnamedmoleculeamount_return unnamedmoleculeamount161 = null;


        RewriteRuleSubtreeStream stream_unnamedmoleculeamount=new RewriteRuleSubtreeStream(adaptor,"rule unnamedmoleculeamount");
        try { dbg.enterRule(getGrammarFileName(), "unnamedmolecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:111:2: ( unnamedmoleculeamount -> ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:111:4: unnamedmoleculeamount
            {
            dbg.location(111,4);
            pushFollow(FOLLOW_unnamedmoleculeamount_in_unnamedmolecule957);
            unnamedmoleculeamount161=unnamedmoleculeamount();

            state._fsp--;

            stream_unnamedmoleculeamount.add(unnamedmoleculeamount161.getTree());


            // AST REWRITE
            // elements: unnamedmoleculeamount
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 111:26: -> ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount )
            {
                dbg.location(111,29);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:111:29: ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(111,31);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "UNNAMEDMOLECULE"), root_1);

                dbg.location(111,55);
                adaptor.addChild(root_1, stream_unnamedmoleculeamount.nextTree());

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
        dbg.location(111, 77);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:1: amount : lrb measurements ( comma measurements )* rrb -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb ) ;
    public final ChemicalChunkerParser.amount_return amount() throws RecognitionException {
        ChemicalChunkerParser.amount_return retval = new ChemicalChunkerParser.amount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.lrb_return lrb162 = null;

        ChemicalChunkerParser.measurements_return measurements163 = null;

        ChemicalChunkerParser.comma_return comma164 = null;

        ChemicalChunkerParser.measurements_return measurements165 = null;

        ChemicalChunkerParser.rrb_return rrb166 = null;


        RewriteRuleSubtreeStream stream_measurements=new RewriteRuleSubtreeStream(adaptor,"rule measurements");
        RewriteRuleSubtreeStream stream_comma=new RewriteRuleSubtreeStream(adaptor,"rule comma");
        RewriteRuleSubtreeStream stream_lrb=new RewriteRuleSubtreeStream(adaptor,"rule lrb");
        RewriteRuleSubtreeStream stream_rrb=new RewriteRuleSubtreeStream(adaptor,"rule rrb");
        try { dbg.enterRule(getGrammarFileName(), "amount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:9: ( lrb measurements ( comma measurements )* rrb -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:11: lrb measurements ( comma measurements )* rrb
            {
            dbg.location(113,11);
            pushFollow(FOLLOW_lrb_in_amount978);
            lrb162=lrb();

            state._fsp--;

            stream_lrb.add(lrb162.getTree());
            dbg.location(113,15);
            pushFollow(FOLLOW_measurements_in_amount980);
            measurements163=measurements();

            state._fsp--;

            stream_measurements.add(measurements163.getTree());
            dbg.location(113,28);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:28: ( comma measurements )*
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

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:29: comma measurements
            	    {
            	    dbg.location(113,29);
            	    pushFollow(FOLLOW_comma_in_amount983);
            	    comma164=comma();

            	    state._fsp--;

            	    stream_comma.add(comma164.getTree());
            	    dbg.location(113,36);
            	    pushFollow(FOLLOW_measurements_in_amount986);
            	    measurements165=measurements();

            	    state._fsp--;

            	    stream_measurements.add(measurements165.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);
            } finally {dbg.exitSubRule(34);}

            dbg.location(113,52);
            pushFollow(FOLLOW_rrb_in_amount991);
            rrb166=rrb();

            state._fsp--;

            stream_rrb.add(rrb166.getTree());


            // AST REWRITE
            // elements: rrb, measurements, lrb, comma, measurements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:56: -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb )
            {
                dbg.location(113,61);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:61: ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(113,63);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "AMOUNT"), root_1);

                dbg.location(113,79);
                adaptor.addChild(root_1, stream_lrb.nextTree());
                dbg.location(113,83);
                adaptor.addChild(root_1, stream_measurements.nextTree());
                dbg.location(113,96);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:113:96: ( comma measurements )*
                while ( stream_measurements.hasNext()||stream_comma.hasNext() ) {
                    dbg.location(113,97);
                    adaptor.addChild(root_1, stream_comma.nextTree());
                    dbg.location(113,104);
                    adaptor.addChild(root_1, stream_measurements.nextTree());

                }
                stream_measurements.reset();
                stream_comma.reset();
                dbg.location(113,120);
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
        dbg.location(113, 124);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:1: method : ( nngeneral | nn )? nnmethod ( oscarcd | cd )? ;
    public final ChemicalChunkerParser.method_return method() throws RecognitionException {
        ChemicalChunkerParser.method_return retval = new ChemicalChunkerParser.method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.nngeneral_return nngeneral167 = null;

        ChemicalChunkerParser.nn_return nn168 = null;

        ChemicalChunkerParser.nnmethod_return nnmethod169 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd170 = null;

        ChemicalChunkerParser.cd_return cd171 = null;



        try { dbg.enterRule(getGrammarFileName(), "method");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:7: ( ( nngeneral | nn )? nnmethod ( oscarcd | cd )? )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:5: ( nngeneral | nn )? nnmethod ( oscarcd | cd )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(116,5);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:5: ( nngeneral | nn )?
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:6: nngeneral
                    {
                    dbg.location(116,6);
                    pushFollow(FOLLOW_nngeneral_in_method1028);
                    nngeneral167=nngeneral();

                    state._fsp--;

                    adaptor.addChild(root_0, nngeneral167.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:16: nn
                    {
                    dbg.location(116,16);
                    pushFollow(FOLLOW_nn_in_method1030);
                    nn168=nn();

                    state._fsp--;

                    adaptor.addChild(root_0, nn168.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(35);}

            dbg.location(116,21);
            pushFollow(FOLLOW_nnmethod_in_method1034);
            nnmethod169=nnmethod();

            state._fsp--;

            adaptor.addChild(root_0, nnmethod169.getTree());
            dbg.location(116,30);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:30: ( oscarcd | cd )?
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:31: oscarcd
                    {
                    dbg.location(116,31);
                    pushFollow(FOLLOW_oscarcd_in_method1037);
                    oscarcd170=oscarcd();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcd170.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:116:39: cd
                    {
                    dbg.location(116,39);
                    pushFollow(FOLLOW_cd_in_method1039);
                    cd171=cd();

                    state._fsp--;

                    adaptor.addChild(root_0, cd171.getTree());

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
        dbg.location(116, 45);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:1: oscarcd : 'OSCAR-CD' TOKEN ;
    public final ChemicalChunkerParser.oscarcd_return oscarcd() throws RecognitionException {
        ChemicalChunkerParser.oscarcd_return retval = new ChemicalChunkerParser.oscarcd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal172=null;
        Token TOKEN173=null;

        Object string_literal172_tree=null;
        Object TOKEN173_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:8: ( 'OSCAR-CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:9: 'OSCAR-CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(119,9);
            string_literal172=(Token)match(input,10,FOLLOW_10_in_oscarcd1050); 
            string_literal172_tree = (Object)adaptor.create(string_literal172);
            adaptor.addChild(root_0, string_literal172_tree);

            dbg.location(119,20);
            TOKEN173=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcd1052); 
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
        dbg.location(119, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:1: oscarcj : 'OSCAR-CJ' TOKEN ;
    public final ChemicalChunkerParser.oscarcj_return oscarcj() throws RecognitionException {
        ChemicalChunkerParser.oscarcj_return retval = new ChemicalChunkerParser.oscarcj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal174=null;
        Token TOKEN175=null;

        Object string_literal174_tree=null;
        Object TOKEN175_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:8: ( 'OSCAR-CJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:9: 'OSCAR-CJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(120,9);
            string_literal174=(Token)match(input,11,FOLLOW_11_in_oscarcj1057); 
            string_literal174_tree = (Object)adaptor.create(string_literal174);
            adaptor.addChild(root_0, string_literal174_tree);

            dbg.location(120,20);
            TOKEN175=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcj1059); 
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
        dbg.location(120, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:1: oscaront : 'OSCAR-ONT' TOKEN ;
    public final ChemicalChunkerParser.oscaront_return oscaront() throws RecognitionException {
        ChemicalChunkerParser.oscaront_return retval = new ChemicalChunkerParser.oscaront_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal176=null;
        Token TOKEN177=null;

        Object string_literal176_tree=null;
        Object TOKEN177_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscaront");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:9: ( 'OSCAR-ONT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:11: 'OSCAR-ONT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(121,11);
            string_literal176=(Token)match(input,12,FOLLOW_12_in_oscaront1065); 
            string_literal176_tree = (Object)adaptor.create(string_literal176);
            adaptor.addChild(root_0, string_literal176_tree);

            dbg.location(121,23);
            TOKEN177=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscaront1067); 
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
        dbg.location(121, 28);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:122:1: tmunicode : 'TM-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.tmunicode_return tmunicode() throws RecognitionException {
        ChemicalChunkerParser.tmunicode_return retval = new ChemicalChunkerParser.tmunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal178=null;
        Token TOKEN179=null;

        Object string_literal178_tree=null;
        Object TOKEN179_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "tmunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:122:10: ( 'TM-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:122:11: 'TM-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(122,11);
            string_literal178=(Token)match(input,13,FOLLOW_13_in_tmunicode1072); 
            string_literal178_tree = (Object)adaptor.create(string_literal178);
            adaptor.addChild(root_0, string_literal178_tree);

            dbg.location(122,24);
            TOKEN179=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_tmunicode1074); 
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
        dbg.location(122, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:123:1: cdunicode : 'CD-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.cdunicode_return cdunicode() throws RecognitionException {
        ChemicalChunkerParser.cdunicode_return retval = new ChemicalChunkerParser.cdunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal180=null;
        Token TOKEN181=null;

        Object string_literal180_tree=null;
        Object TOKEN181_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cdunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:123:10: ( 'CD-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:123:11: 'CD-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(123,11);
            string_literal180=(Token)match(input,14,FOLLOW_14_in_cdunicode1079); 
            string_literal180_tree = (Object)adaptor.create(string_literal180);
            adaptor.addChild(root_0, string_literal180_tree);

            dbg.location(123,24);
            TOKEN181=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cdunicode1081); 
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
        dbg.location(123, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:1: inas : 'IN-AS' TOKEN ;
    public final ChemicalChunkerParser.inas_return inas() throws RecognitionException {
        ChemicalChunkerParser.inas_return retval = new ChemicalChunkerParser.inas_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal182=null;
        Token TOKEN183=null;

        Object string_literal182_tree=null;
        Object TOKEN183_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inas");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:5: ( 'IN-AS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:6: 'IN-AS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(126,6);
            string_literal182=(Token)match(input,15,FOLLOW_15_in_inas1088); 
            string_literal182_tree = (Object)adaptor.create(string_literal182);
            adaptor.addChild(root_0, string_literal182_tree);

            dbg.location(126,14);
            TOKEN183=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inas1090); 
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
        dbg.location(126, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:1: inbefore : 'IN-BEFORE' TOKEN ;
    public final ChemicalChunkerParser.inbefore_return inbefore() throws RecognitionException {
        ChemicalChunkerParser.inbefore_return retval = new ChemicalChunkerParser.inbefore_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal184=null;
        Token TOKEN185=null;

        Object string_literal184_tree=null;
        Object TOKEN185_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inbefore");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:9: ( 'IN-BEFORE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:10: 'IN-BEFORE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(127,10);
            string_literal184=(Token)match(input,16,FOLLOW_16_in_inbefore1095); 
            string_literal184_tree = (Object)adaptor.create(string_literal184);
            adaptor.addChild(root_0, string_literal184_tree);

            dbg.location(127,22);
            TOKEN185=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inbefore1097); 
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
        dbg.location(127, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:1: inafter : 'IN-AFTER' TOKEN ;
    public final ChemicalChunkerParser.inafter_return inafter() throws RecognitionException {
        ChemicalChunkerParser.inafter_return retval = new ChemicalChunkerParser.inafter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal186=null;
        Token TOKEN187=null;

        Object string_literal186_tree=null;
        Object TOKEN187_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inafter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:8: ( 'IN-AFTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:9: 'IN-AFTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,9);
            string_literal186=(Token)match(input,17,FOLLOW_17_in_inafter1102); 
            string_literal186_tree = (Object)adaptor.create(string_literal186);
            adaptor.addChild(root_0, string_literal186_tree);

            dbg.location(128,20);
            TOKEN187=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inafter1104); 
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
        dbg.location(128, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:1: inin : 'IN-IN' TOKEN ;
    public final ChemicalChunkerParser.inin_return inin() throws RecognitionException {
        ChemicalChunkerParser.inin_return retval = new ChemicalChunkerParser.inin_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal188=null;
        Token TOKEN189=null;

        Object string_literal188_tree=null;
        Object TOKEN189_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inin");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:5: ( 'IN-IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:6: 'IN-IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(129,6);
            string_literal188=(Token)match(input,18,FOLLOW_18_in_inin1109); 
            string_literal188_tree = (Object)adaptor.create(string_literal188);
            adaptor.addChild(root_0, string_literal188_tree);

            dbg.location(129,14);
            TOKEN189=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inin1111); 
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
        dbg.location(129, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:1: ininto : 'IN-INTO' TOKEN ;
    public final ChemicalChunkerParser.ininto_return ininto() throws RecognitionException {
        ChemicalChunkerParser.ininto_return retval = new ChemicalChunkerParser.ininto_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal190=null;
        Token TOKEN191=null;

        Object string_literal190_tree=null;
        Object TOKEN191_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ininto");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(130, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:7: ( 'IN-INTO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:8: 'IN-INTO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(130,8);
            string_literal190=(Token)match(input,19,FOLLOW_19_in_ininto1116); 
            string_literal190_tree = (Object)adaptor.create(string_literal190);
            adaptor.addChild(root_0, string_literal190_tree);

            dbg.location(130,18);
            TOKEN191=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ininto1118); 
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
        dbg.location(130, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:1: inwith : 'IN-WITH' TOKEN ;
    public final ChemicalChunkerParser.inwith_return inwith() throws RecognitionException {
        ChemicalChunkerParser.inwith_return retval = new ChemicalChunkerParser.inwith_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal192=null;
        Token TOKEN193=null;

        Object string_literal192_tree=null;
        Object TOKEN193_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:7: ( 'IN-WITH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:8: 'IN-WITH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(131,8);
            string_literal192=(Token)match(input,20,FOLLOW_20_in_inwith1123); 
            string_literal192_tree = (Object)adaptor.create(string_literal192);
            adaptor.addChild(root_0, string_literal192_tree);

            dbg.location(131,18);
            TOKEN193=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwith1125); 
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
        dbg.location(131, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:1: inwithout : 'IN-WITHOUT' TOKEN ;
    public final ChemicalChunkerParser.inwithout_return inwithout() throws RecognitionException {
        ChemicalChunkerParser.inwithout_return retval = new ChemicalChunkerParser.inwithout_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal194=null;
        Token TOKEN195=null;

        Object string_literal194_tree=null;
        Object TOKEN195_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwithout");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:10: ( 'IN-WITHOUT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:11: 'IN-WITHOUT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(132,11);
            string_literal194=(Token)match(input,21,FOLLOW_21_in_inwithout1130); 
            string_literal194_tree = (Object)adaptor.create(string_literal194);
            adaptor.addChild(root_0, string_literal194_tree);

            dbg.location(132,24);
            TOKEN195=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwithout1132); 
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
        dbg.location(132, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:1: inby : 'IN-BY' TOKEN ;
    public final ChemicalChunkerParser.inby_return inby() throws RecognitionException {
        ChemicalChunkerParser.inby_return retval = new ChemicalChunkerParser.inby_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal196=null;
        Token TOKEN197=null;

        Object string_literal196_tree=null;
        Object TOKEN197_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inby");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:5: ( 'IN-BY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:6: 'IN-BY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(133,6);
            string_literal196=(Token)match(input,22,FOLLOW_22_in_inby1137); 
            string_literal196_tree = (Object)adaptor.create(string_literal196);
            adaptor.addChild(root_0, string_literal196_tree);

            dbg.location(133,14);
            TOKEN197=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inby1139); 
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
        dbg.location(133, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:1: invia : 'IN-VIA' TOKEN ;
    public final ChemicalChunkerParser.invia_return invia() throws RecognitionException {
        ChemicalChunkerParser.invia_return retval = new ChemicalChunkerParser.invia_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal198=null;
        Token TOKEN199=null;

        Object string_literal198_tree=null;
        Object TOKEN199_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "invia");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:6: ( 'IN-VIA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:7: 'IN-VIA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(134,7);
            string_literal198=(Token)match(input,23,FOLLOW_23_in_invia1144); 
            string_literal198_tree = (Object)adaptor.create(string_literal198);
            adaptor.addChild(root_0, string_literal198_tree);

            dbg.location(134,16);
            TOKEN199=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_invia1146); 
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
        dbg.location(134, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:1: inof : 'IN-OF' TOKEN ;
    public final ChemicalChunkerParser.inof_return inof() throws RecognitionException {
        ChemicalChunkerParser.inof_return retval = new ChemicalChunkerParser.inof_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal200=null;
        Token TOKEN201=null;

        Object string_literal200_tree=null;
        Object TOKEN201_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inof");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:5: ( 'IN-OF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:6: 'IN-OF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(135,6);
            string_literal200=(Token)match(input,24,FOLLOW_24_in_inof1151); 
            string_literal200_tree = (Object)adaptor.create(string_literal200);
            adaptor.addChild(root_0, string_literal200_tree);

            dbg.location(135,14);
            TOKEN201=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inof1153); 
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
        dbg.location(135, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:1: inon : 'IN-ON' TOKEN ;
    public final ChemicalChunkerParser.inon_return inon() throws RecognitionException {
        ChemicalChunkerParser.inon_return retval = new ChemicalChunkerParser.inon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal202=null;
        Token TOKEN203=null;

        Object string_literal202_tree=null;
        Object TOKEN203_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:5: ( 'IN-ON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:6: 'IN-ON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(136,6);
            string_literal202=(Token)match(input,25,FOLLOW_25_in_inon1158); 
            string_literal202_tree = (Object)adaptor.create(string_literal202);
            adaptor.addChild(root_0, string_literal202_tree);

            dbg.location(136,14);
            TOKEN203=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inon1160); 
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
        dbg.location(136, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:1: infor : 'IN-FOR' TOKEN ;
    public final ChemicalChunkerParser.infor_return infor() throws RecognitionException {
        ChemicalChunkerParser.infor_return retval = new ChemicalChunkerParser.infor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal204=null;
        Token TOKEN205=null;

        Object string_literal204_tree=null;
        Object TOKEN205_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:6: ( 'IN-FOR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:7: 'IN-FOR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(137,7);
            string_literal204=(Token)match(input,26,FOLLOW_26_in_infor1165); 
            string_literal204_tree = (Object)adaptor.create(string_literal204);
            adaptor.addChild(root_0, string_literal204_tree);

            dbg.location(137,16);
            TOKEN205=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infor1167); 
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
        dbg.location(137, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:1: infrom : 'IN-FROM' TOKEN ;
    public final ChemicalChunkerParser.infrom_return infrom() throws RecognitionException {
        ChemicalChunkerParser.infrom_return retval = new ChemicalChunkerParser.infrom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal206=null;
        Token TOKEN207=null;

        Object string_literal206_tree=null;
        Object TOKEN207_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infrom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:7: ( 'IN-FROM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:8: 'IN-FROM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(138,8);
            string_literal206=(Token)match(input,27,FOLLOW_27_in_infrom1172); 
            string_literal206_tree = (Object)adaptor.create(string_literal206);
            adaptor.addChild(root_0, string_literal206_tree);

            dbg.location(138,18);
            TOKEN207=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infrom1174); 
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
        dbg.location(138, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:1: inunder : 'IN-UNDER' TOKEN ;
    public final ChemicalChunkerParser.inunder_return inunder() throws RecognitionException {
        ChemicalChunkerParser.inunder_return retval = new ChemicalChunkerParser.inunder_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal208=null;
        Token TOKEN209=null;

        Object string_literal208_tree=null;
        Object TOKEN209_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inunder");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:8: ( 'IN-UNDER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:9: 'IN-UNDER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,9);
            string_literal208=(Token)match(input,28,FOLLOW_28_in_inunder1179); 
            string_literal208_tree = (Object)adaptor.create(string_literal208);
            adaptor.addChild(root_0, string_literal208_tree);

            dbg.location(139,20);
            TOKEN209=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inunder1181); 
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
        dbg.location(139, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:1: inover : 'IN-OVER' TOKEN ;
    public final ChemicalChunkerParser.inover_return inover() throws RecognitionException {
        ChemicalChunkerParser.inover_return retval = new ChemicalChunkerParser.inover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal210=null;
        Token TOKEN211=null;

        Object string_literal210_tree=null;
        Object TOKEN211_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:7: ( 'IN-OVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:8: 'IN-OVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(140,8);
            string_literal210=(Token)match(input,29,FOLLOW_29_in_inover1186); 
            string_literal210_tree = (Object)adaptor.create(string_literal210);
            adaptor.addChild(root_0, string_literal210_tree);

            dbg.location(140,18);
            TOKEN211=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inover1188); 
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
        dbg.location(140, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:141:1: inoff : 'IN-OFF' TOKEN ;
    public final ChemicalChunkerParser.inoff_return inoff() throws RecognitionException {
        ChemicalChunkerParser.inoff_return retval = new ChemicalChunkerParser.inoff_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal212=null;
        Token TOKEN213=null;

        Object string_literal212_tree=null;
        Object TOKEN213_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inoff");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:141:6: ( 'IN-OFF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:141:7: 'IN-OFF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(141,7);
            string_literal212=(Token)match(input,30,FOLLOW_30_in_inoff1193); 
            string_literal212_tree = (Object)adaptor.create(string_literal212);
            adaptor.addChild(root_0, string_literal212_tree);

            dbg.location(141,16);
            TOKEN213=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inoff1195); 
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
        dbg.location(141, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:144:1: nnstate : 'NN-STATE' TOKEN ;
    public final ChemicalChunkerParser.nnstate_return nnstate() throws RecognitionException {
        ChemicalChunkerParser.nnstate_return retval = new ChemicalChunkerParser.nnstate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal214=null;
        Token TOKEN215=null;

        Object string_literal214_tree=null;
        Object TOKEN215_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnstate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:144:8: ( 'NN-STATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:144:9: 'NN-STATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(144,9);
            string_literal214=(Token)match(input,31,FOLLOW_31_in_nnstate1202); 
            string_literal214_tree = (Object)adaptor.create(string_literal214);
            adaptor.addChild(root_0, string_literal214_tree);

            dbg.location(144,20);
            TOKEN215=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnstate1204); 
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
        dbg.location(144, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:1: nntime : 'NN-TIME' TOKEN ;
    public final ChemicalChunkerParser.nntime_return nntime() throws RecognitionException {
        ChemicalChunkerParser.nntime_return retval = new ChemicalChunkerParser.nntime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal216=null;
        Token TOKEN217=null;

        Object string_literal216_tree=null;
        Object TOKEN217_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:7: ( 'NN-TIME' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:8: 'NN-TIME' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(145,8);
            string_literal216=(Token)match(input,32,FOLLOW_32_in_nntime1209); 
            string_literal216_tree = (Object)adaptor.create(string_literal216);
            adaptor.addChild(root_0, string_literal216_tree);

            dbg.location(145,18);
            TOKEN217=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntime1211); 
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
        dbg.location(145, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:146:1: nngram : 'NN-GRAM' TOKEN ;
    public final ChemicalChunkerParser.nngram_return nngram() throws RecognitionException {
        ChemicalChunkerParser.nngram_return retval = new ChemicalChunkerParser.nngram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal218=null;
        Token TOKEN219=null;

        Object string_literal218_tree=null;
        Object TOKEN219_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:146:7: ( 'NN-GRAM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:146:8: 'NN-GRAM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(146,8);
            string_literal218=(Token)match(input,33,FOLLOW_33_in_nngram1216); 
            string_literal218_tree = (Object)adaptor.create(string_literal218);
            adaptor.addChild(root_0, string_literal218_tree);

            dbg.location(146,18);
            TOKEN219=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngram1218); 
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
        dbg.location(146, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:147:1: nnmol : 'NN-MOL' TOKEN ;
    public final ChemicalChunkerParser.nnmol_return nnmol() throws RecognitionException {
        ChemicalChunkerParser.nnmol_return retval = new ChemicalChunkerParser.nnmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal220=null;
        Token TOKEN221=null;

        Object string_literal220_tree=null;
        Object TOKEN221_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:147:6: ( 'NN-MOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:147:7: 'NN-MOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(147,7);
            string_literal220=(Token)match(input,34,FOLLOW_34_in_nnmol1223); 
            string_literal220_tree = (Object)adaptor.create(string_literal220);
            adaptor.addChild(root_0, string_literal220_tree);

            dbg.location(147,16);
            TOKEN221=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmol1225); 
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
        dbg.location(147, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:1: nnatmosphere : 'NN-ATMOSPHERE' TOKEN ;
    public final ChemicalChunkerParser.nnatmosphere_return nnatmosphere() throws RecognitionException {
        ChemicalChunkerParser.nnatmosphere_return retval = new ChemicalChunkerParser.nnatmosphere_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal222=null;
        Token TOKEN223=null;

        Object string_literal222_tree=null;
        Object TOKEN223_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnatmosphere");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:13: ( 'NN-ATMOSPHERE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:14: 'NN-ATMOSPHERE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(148,14);
            string_literal222=(Token)match(input,35,FOLLOW_35_in_nnatmosphere1230); 
            string_literal222_tree = (Object)adaptor.create(string_literal222);
            adaptor.addChild(root_0, string_literal222_tree);

            dbg.location(148,30);
            TOKEN223=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnatmosphere1232); 
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
        dbg.location(148, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:1: nneq : 'NN-EQ' TOKEN ;
    public final ChemicalChunkerParser.nneq_return nneq() throws RecognitionException {
        ChemicalChunkerParser.nneq_return retval = new ChemicalChunkerParser.nneq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal224=null;
        Token TOKEN225=null;

        Object string_literal224_tree=null;
        Object TOKEN225_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nneq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:5: ( 'NN-EQ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:6: 'NN-EQ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(149,6);
            string_literal224=(Token)match(input,36,FOLLOW_36_in_nneq1237); 
            string_literal224_tree = (Object)adaptor.create(string_literal224);
            adaptor.addChild(root_0, string_literal224_tree);

            dbg.location(149,14);
            TOKEN225=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nneq1239); 
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
        dbg.location(149, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:1: nnvol : 'NN-VOL' TOKEN ;
    public final ChemicalChunkerParser.nnvol_return nnvol() throws RecognitionException {
        ChemicalChunkerParser.nnvol_return retval = new ChemicalChunkerParser.nnvol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal226=null;
        Token TOKEN227=null;

        Object string_literal226_tree=null;
        Object TOKEN227_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:6: ( 'NN-VOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:7: 'NN-VOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(150,7);
            string_literal226=(Token)match(input,37,FOLLOW_37_in_nnvol1244); 
            string_literal226_tree = (Object)adaptor.create(string_literal226);
            adaptor.addChild(root_0, string_literal226_tree);

            dbg.location(150,16);
            TOKEN227=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvol1246); 
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
        dbg.location(150, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:1: nnchementity : 'NN-CHEMENTITY' TOKEN ;
    public final ChemicalChunkerParser.nnchementity_return nnchementity() throws RecognitionException {
        ChemicalChunkerParser.nnchementity_return retval = new ChemicalChunkerParser.nnchementity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal228=null;
        Token TOKEN229=null;

        Object string_literal228_tree=null;
        Object TOKEN229_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchementity");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:13: ( 'NN-CHEMENTITY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:14: 'NN-CHEMENTITY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(151,14);
            string_literal228=(Token)match(input,38,FOLLOW_38_in_nnchementity1251); 
            string_literal228_tree = (Object)adaptor.create(string_literal228);
            adaptor.addChild(root_0, string_literal228_tree);

            dbg.location(151,30);
            TOKEN229=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchementity1253); 
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
        dbg.location(151, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:152:1: nntemp : 'NN-TEMP' TOKEN ;
    public final ChemicalChunkerParser.nntemp_return nntemp() throws RecognitionException {
        ChemicalChunkerParser.nntemp_return retval = new ChemicalChunkerParser.nntemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal230=null;
        Token TOKEN231=null;

        Object string_literal230_tree=null;
        Object TOKEN231_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:152:7: ( 'NN-TEMP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:152:8: 'NN-TEMP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(152,8);
            string_literal230=(Token)match(input,39,FOLLOW_39_in_nntemp1258); 
            string_literal230_tree = (Object)adaptor.create(string_literal230);
            adaptor.addChild(root_0, string_literal230_tree);

            dbg.location(152,18);
            TOKEN231=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntemp1260); 
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
        dbg.location(152, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:153:1: nnflash : 'NN-FLASH' TOKEN ;
    public final ChemicalChunkerParser.nnflash_return nnflash() throws RecognitionException {
        ChemicalChunkerParser.nnflash_return retval = new ChemicalChunkerParser.nnflash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal232=null;
        Token TOKEN233=null;

        Object string_literal232_tree=null;
        Object TOKEN233_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnflash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:153:8: ( 'NN-FLASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:153:9: 'NN-FLASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(153,9);
            string_literal232=(Token)match(input,40,FOLLOW_40_in_nnflash1265); 
            string_literal232_tree = (Object)adaptor.create(string_literal232);
            adaptor.addChild(root_0, string_literal232_tree);

            dbg.location(153,20);
            TOKEN233=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnflash1267); 
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
        dbg.location(153, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:1: nngeneral : 'NN-GENERAL' TOKEN ;
    public final ChemicalChunkerParser.nngeneral_return nngeneral() throws RecognitionException {
        ChemicalChunkerParser.nngeneral_return retval = new ChemicalChunkerParser.nngeneral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal234=null;
        Token TOKEN235=null;

        Object string_literal234_tree=null;
        Object TOKEN235_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngeneral");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:10: ( 'NN-GENERAL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:11: 'NN-GENERAL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(154,11);
            string_literal234=(Token)match(input,41,FOLLOW_41_in_nngeneral1272); 
            string_literal234_tree = (Object)adaptor.create(string_literal234);
            adaptor.addChild(root_0, string_literal234_tree);

            dbg.location(154,24);
            TOKEN235=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngeneral1274); 
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
        dbg.location(154, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:1: nnmethod : 'NN-METHOD' TOKEN ;
    public final ChemicalChunkerParser.nnmethod_return nnmethod() throws RecognitionException {
        ChemicalChunkerParser.nnmethod_return retval = new ChemicalChunkerParser.nnmethod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal236=null;
        Token TOKEN237=null;

        Object string_literal236_tree=null;
        Object TOKEN237_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmethod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:9: ( 'NN-METHOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:10: 'NN-METHOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(155,10);
            string_literal236=(Token)match(input,42,FOLLOW_42_in_nnmethod1279); 
            string_literal236_tree = (Object)adaptor.create(string_literal236);
            adaptor.addChild(root_0, string_literal236_tree);

            dbg.location(155,22);
            TOKEN237=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmethod1281); 
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
        dbg.location(155, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:1: nnamount : 'NN-AMOUNT' TOKEN ;
    public final ChemicalChunkerParser.nnamount_return nnamount() throws RecognitionException {
        ChemicalChunkerParser.nnamount_return retval = new ChemicalChunkerParser.nnamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal238=null;
        Token TOKEN239=null;

        Object string_literal238_tree=null;
        Object TOKEN239_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:9: ( 'NN-AMOUNT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:10: 'NN-AMOUNT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,10);
            string_literal238=(Token)match(input,43,FOLLOW_43_in_nnamount1286); 
            string_literal238_tree = (Object)adaptor.create(string_literal238);
            adaptor.addChild(root_0, string_literal238_tree);

            dbg.location(156,22);
            TOKEN239=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnamount1288); 
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
        dbg.location(156, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:1: nnpressure : 'NN-PRESSURE' TOKEN ;
    public final ChemicalChunkerParser.nnpressure_return nnpressure() throws RecognitionException {
        ChemicalChunkerParser.nnpressure_return retval = new ChemicalChunkerParser.nnpressure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal240=null;
        Token TOKEN241=null;

        Object string_literal240_tree=null;
        Object TOKEN241_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpressure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:11: ( 'NN-PRESSURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:12: 'NN-PRESSURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(157,12);
            string_literal240=(Token)match(input,44,FOLLOW_44_in_nnpressure1293); 
            string_literal240_tree = (Object)adaptor.create(string_literal240);
            adaptor.addChild(root_0, string_literal240_tree);

            dbg.location(157,26);
            TOKEN241=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpressure1295); 
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
        dbg.location(157, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:1: nncolumn : 'NN-COLUMN' TOKEN ;
    public final ChemicalChunkerParser.nncolumn_return nncolumn() throws RecognitionException {
        ChemicalChunkerParser.nncolumn_return retval = new ChemicalChunkerParser.nncolumn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal242=null;
        Token TOKEN243=null;

        Object string_literal242_tree=null;
        Object TOKEN243_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncolumn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:9: ( 'NN-COLUMN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:10: 'NN-COLUMN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(158,10);
            string_literal242=(Token)match(input,45,FOLLOW_45_in_nncolumn1300); 
            string_literal242_tree = (Object)adaptor.create(string_literal242);
            adaptor.addChild(root_0, string_literal242_tree);

            dbg.location(158,22);
            TOKEN243=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncolumn1302); 
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
        dbg.location(158, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:1: nnchromatography : 'NN-CHROMATOGRAPHY' TOKEN ;
    public final ChemicalChunkerParser.nnchromatography_return nnchromatography() throws RecognitionException {
        ChemicalChunkerParser.nnchromatography_return retval = new ChemicalChunkerParser.nnchromatography_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal244=null;
        Token TOKEN245=null;

        Object string_literal244_tree=null;
        Object TOKEN245_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchromatography");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:17: ( 'NN-CHROMATOGRAPHY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:18: 'NN-CHROMATOGRAPHY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(159,18);
            string_literal244=(Token)match(input,46,FOLLOW_46_in_nnchromatography1307); 
            string_literal244_tree = (Object)adaptor.create(string_literal244);
            adaptor.addChild(root_0, string_literal244_tree);

            dbg.location(159,38);
            TOKEN245=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchromatography1309); 
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
        dbg.location(159, 43);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:1: nnvacuum : 'NN-VACUUM' TOKEN ;
    public final ChemicalChunkerParser.nnvacuum_return nnvacuum() throws RecognitionException {
        ChemicalChunkerParser.nnvacuum_return retval = new ChemicalChunkerParser.nnvacuum_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal246=null;
        Token TOKEN247=null;

        Object string_literal246_tree=null;
        Object TOKEN247_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvacuum");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:9: ( 'NN-VACUUM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:10: 'NN-VACUUM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(160,10);
            string_literal246=(Token)match(input,47,FOLLOW_47_in_nnvacuum1314); 
            string_literal246_tree = (Object)adaptor.create(string_literal246);
            adaptor.addChild(root_0, string_literal246_tree);

            dbg.location(160,22);
            TOKEN247=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvacuum1316); 
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
        dbg.location(160, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:1: nncycle : 'NN-CYCLE' TOKEN ;
    public final ChemicalChunkerParser.nncycle_return nncycle() throws RecognitionException {
        ChemicalChunkerParser.nncycle_return retval = new ChemicalChunkerParser.nncycle_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal248=null;
        Token TOKEN249=null;

        Object string_literal248_tree=null;
        Object TOKEN249_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncycle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:8: ( 'NN-CYCLE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:9: 'NN-CYCLE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(161,9);
            string_literal248=(Token)match(input,48,FOLLOW_48_in_nncycle1321); 
            string_literal248_tree = (Object)adaptor.create(string_literal248);
            adaptor.addChild(root_0, string_literal248_tree);

            dbg.location(161,20);
            TOKEN249=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncycle1323); 
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
        dbg.location(161, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:162:1: nntimes : 'NN-TIMES' TOKEN ;
    public final ChemicalChunkerParser.nntimes_return nntimes() throws RecognitionException {
        ChemicalChunkerParser.nntimes_return retval = new ChemicalChunkerParser.nntimes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal250=null;
        Token TOKEN251=null;

        Object string_literal250_tree=null;
        Object TOKEN251_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntimes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(162, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:162:8: ( 'NN-TIMES' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:162:9: 'NN-TIMES' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(162,9);
            string_literal250=(Token)match(input,49,FOLLOW_49_in_nntimes1328); 
            string_literal250_tree = (Object)adaptor.create(string_literal250);
            adaptor.addChild(root_0, string_literal250_tree);

            dbg.location(162,20);
            TOKEN251=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntimes1330); 
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
        dbg.location(162, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:165:1: oscarcm : 'OSCAR-CM' TOKEN ;
    public final ChemicalChunkerParser.oscarcm_return oscarcm() throws RecognitionException {
        ChemicalChunkerParser.oscarcm_return retval = new ChemicalChunkerParser.oscarcm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal252=null;
        Token TOKEN253=null;

        Object string_literal252_tree=null;
        Object TOKEN253_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(165, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:165:8: ( 'OSCAR-CM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:165:9: 'OSCAR-CM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(165,9);
            string_literal252=(Token)match(input,50,FOLLOW_50_in_oscarcm1337); 
            string_literal252_tree = (Object)adaptor.create(string_literal252);
            adaptor.addChild(root_0, string_literal252_tree);

            dbg.location(165,20);
            TOKEN253=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcm1339); 
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
        dbg.location(165, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:168:1: vbuse : 'VB-USE' TOKEN ;
    public final ChemicalChunkerParser.vbuse_return vbuse() throws RecognitionException {
        ChemicalChunkerParser.vbuse_return retval = new ChemicalChunkerParser.vbuse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal254=null;
        Token TOKEN255=null;

        Object string_literal254_tree=null;
        Object TOKEN255_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbuse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:168:6: ( 'VB-USE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:168:7: 'VB-USE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(168,7);
            string_literal254=(Token)match(input,51,FOLLOW_51_in_vbuse1346); 
            string_literal254_tree = (Object)adaptor.create(string_literal254);
            adaptor.addChild(root_0, string_literal254_tree);

            dbg.location(168,16);
            TOKEN255=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbuse1348); 
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
        dbg.location(168, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:1: vbchange : 'VB-CHANGE' TOKEN ;
    public final ChemicalChunkerParser.vbchange_return vbchange() throws RecognitionException {
        ChemicalChunkerParser.vbchange_return retval = new ChemicalChunkerParser.vbchange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal256=null;
        Token TOKEN257=null;

        Object string_literal256_tree=null;
        Object TOKEN257_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbchange");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:9: ( 'VB-CHANGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:10: 'VB-CHANGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(169,10);
            string_literal256=(Token)match(input,52,FOLLOW_52_in_vbchange1353); 
            string_literal256_tree = (Object)adaptor.create(string_literal256);
            adaptor.addChild(root_0, string_literal256_tree);

            dbg.location(169,22);
            TOKEN257=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbchange1355); 
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
        dbg.location(169, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:1: vbsubmerge : 'VB-SUBMERGE' TOKEN ;
    public final ChemicalChunkerParser.vbsubmerge_return vbsubmerge() throws RecognitionException {
        ChemicalChunkerParser.vbsubmerge_return retval = new ChemicalChunkerParser.vbsubmerge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal258=null;
        Token TOKEN259=null;

        Object string_literal258_tree=null;
        Object TOKEN259_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubmerge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:11: ( 'VB-SUBMERGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:12: 'VB-SUBMERGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(170,12);
            string_literal258=(Token)match(input,53,FOLLOW_53_in_vbsubmerge1360); 
            string_literal258_tree = (Object)adaptor.create(string_literal258);
            adaptor.addChild(root_0, string_literal258_tree);

            dbg.location(170,26);
            TOKEN259=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubmerge1362); 
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
        dbg.location(170, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:171:1: vbsubject : 'VB-SUBJECT' TOKEN ;
    public final ChemicalChunkerParser.vbsubject_return vbsubject() throws RecognitionException {
        ChemicalChunkerParser.vbsubject_return retval = new ChemicalChunkerParser.vbsubject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal260=null;
        Token TOKEN261=null;

        Object string_literal260_tree=null;
        Object TOKEN261_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubject");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:171:10: ( 'VB-SUBJECT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:171:11: 'VB-SUBJECT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(171,11);
            string_literal260=(Token)match(input,54,FOLLOW_54_in_vbsubject1367); 
            string_literal260_tree = (Object)adaptor.create(string_literal260);
            adaptor.addChild(root_0, string_literal260_tree);

            dbg.location(171,24);
            TOKEN261=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubject1369); 
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
        dbg.location(171, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:174:1: nnadd : 'NN-ADD' TOKEN ;
    public final ChemicalChunkerParser.nnadd_return nnadd() throws RecognitionException {
        ChemicalChunkerParser.nnadd_return retval = new ChemicalChunkerParser.nnadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal262=null;
        Token TOKEN263=null;

        Object string_literal262_tree=null;
        Object TOKEN263_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(174, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:174:6: ( 'NN-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:174:7: 'NN-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(174,7);
            string_literal262=(Token)match(input,55,FOLLOW_55_in_nnadd1376); 
            string_literal262_tree = (Object)adaptor.create(string_literal262);
            adaptor.addChild(root_0, string_literal262_tree);

            dbg.location(174,16);
            TOKEN263=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnadd1378); 
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
        dbg.location(174, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:175:1: nnmixture : 'NN-MIXTURE' TOKEN ;
    public final ChemicalChunkerParser.nnmixture_return nnmixture() throws RecognitionException {
        ChemicalChunkerParser.nnmixture_return retval = new ChemicalChunkerParser.nnmixture_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal264=null;
        Token TOKEN265=null;

        Object string_literal264_tree=null;
        Object TOKEN265_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:175:10: ( 'NN-MIXTURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:175:11: 'NN-MIXTURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(175,11);
            string_literal264=(Token)match(input,56,FOLLOW_56_in_nnmixture1383); 
            string_literal264_tree = (Object)adaptor.create(string_literal264);
            adaptor.addChild(root_0, string_literal264_tree);

            dbg.location(175,24);
            TOKEN265=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmixture1385); 
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
        dbg.location(175, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:1: vbadd : 'VB-ADD' TOKEN ;
    public final ChemicalChunkerParser.vbadd_return vbadd() throws RecognitionException {
        ChemicalChunkerParser.vbadd_return retval = new ChemicalChunkerParser.vbadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal266=null;
        Token TOKEN267=null;

        Object string_literal266_tree=null;
        Object TOKEN267_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:6: ( 'VB-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:7: 'VB-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(176,7);
            string_literal266=(Token)match(input,57,FOLLOW_57_in_vbadd1390); 
            string_literal266_tree = (Object)adaptor.create(string_literal266);
            adaptor.addChild(root_0, string_literal266_tree);

            dbg.location(176,16);
            TOKEN267=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbadd1392); 
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
        dbg.location(176, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:177:1: vbcharge : 'VB-CHARGE' TOKEN ;
    public final ChemicalChunkerParser.vbcharge_return vbcharge() throws RecognitionException {
        ChemicalChunkerParser.vbcharge_return retval = new ChemicalChunkerParser.vbcharge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal268=null;
        Token TOKEN269=null;

        Object string_literal268_tree=null;
        Object TOKEN269_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcharge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:177:9: ( 'VB-CHARGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:177:10: 'VB-CHARGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(177,10);
            string_literal268=(Token)match(input,58,FOLLOW_58_in_vbcharge1397); 
            string_literal268_tree = (Object)adaptor.create(string_literal268);
            adaptor.addChild(root_0, string_literal268_tree);

            dbg.location(177,22);
            TOKEN269=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcharge1399); 
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
        dbg.location(177, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:178:1: vbcontain : 'VB-CONTAIN' TOKEN ;
    public final ChemicalChunkerParser.vbcontain_return vbcontain() throws RecognitionException {
        ChemicalChunkerParser.vbcontain_return retval = new ChemicalChunkerParser.vbcontain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal270=null;
        Token TOKEN271=null;

        Object string_literal270_tree=null;
        Object TOKEN271_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcontain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:178:10: ( 'VB-CONTAIN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:178:11: 'VB-CONTAIN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(178,11);
            string_literal270=(Token)match(input,59,FOLLOW_59_in_vbcontain1404); 
            string_literal270_tree = (Object)adaptor.create(string_literal270);
            adaptor.addChild(root_0, string_literal270_tree);

            dbg.location(178,24);
            TOKEN271=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcontain1406); 
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
        dbg.location(178, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:1: vbdrop : 'VB-DROP' TOKEN ;
    public final ChemicalChunkerParser.vbdrop_return vbdrop() throws RecognitionException {
        ChemicalChunkerParser.vbdrop_return retval = new ChemicalChunkerParser.vbdrop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal272=null;
        Token TOKEN273=null;

        Object string_literal272_tree=null;
        Object TOKEN273_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdrop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:7: ( 'VB-DROP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:8: 'VB-DROP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(179,8);
            string_literal272=(Token)match(input,60,FOLLOW_60_in_vbdrop1411); 
            string_literal272_tree = (Object)adaptor.create(string_literal272);
            adaptor.addChild(root_0, string_literal272_tree);

            dbg.location(179,18);
            TOKEN273=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdrop1413); 
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
        dbg.location(179, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:180:1: vbfill : 'VB-FILL' TOKEN ;
    public final ChemicalChunkerParser.vbfill_return vbfill() throws RecognitionException {
        ChemicalChunkerParser.vbfill_return retval = new ChemicalChunkerParser.vbfill_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal274=null;
        Token TOKEN275=null;

        Object string_literal274_tree=null;
        Object TOKEN275_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfill");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:180:7: ( 'VB-FILL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:180:8: 'VB-FILL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(180,8);
            string_literal274=(Token)match(input,61,FOLLOW_61_in_vbfill1418); 
            string_literal274_tree = (Object)adaptor.create(string_literal274);
            adaptor.addChild(root_0, string_literal274_tree);

            dbg.location(180,18);
            TOKEN275=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfill1420); 
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
        dbg.location(180, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:181:1: vbsuspend : 'VB-SUSPEND' TOKEN ;
    public final ChemicalChunkerParser.vbsuspend_return vbsuspend() throws RecognitionException {
        ChemicalChunkerParser.vbsuspend_return retval = new ChemicalChunkerParser.vbsuspend_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal276=null;
        Token TOKEN277=null;

        Object string_literal276_tree=null;
        Object TOKEN277_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsuspend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(181, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:181:10: ( 'VB-SUSPEND' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:181:11: 'VB-SUSPEND' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(181,11);
            string_literal276=(Token)match(input,62,FOLLOW_62_in_vbsuspend1425); 
            string_literal276_tree = (Object)adaptor.create(string_literal276);
            adaptor.addChild(root_0, string_literal276_tree);

            dbg.location(181,24);
            TOKEN277=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsuspend1427); 
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
        dbg.location(181, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:182:1: vbtreat : 'VB-TREAT' TOKEN ;
    public final ChemicalChunkerParser.vbtreat_return vbtreat() throws RecognitionException {
        ChemicalChunkerParser.vbtreat_return retval = new ChemicalChunkerParser.vbtreat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal278=null;
        Token TOKEN279=null;

        Object string_literal278_tree=null;
        Object TOKEN279_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtreat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:182:8: ( 'VB-TREAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:182:9: 'VB-TREAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(182,9);
            string_literal278=(Token)match(input,63,FOLLOW_63_in_vbtreat1432); 
            string_literal278_tree = (Object)adaptor.create(string_literal278);
            adaptor.addChild(root_0, string_literal278_tree);

            dbg.location(182,20);
            TOKEN279=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtreat1434); 
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
        dbg.location(182, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:185:1: vbapparatus : 'VB-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.vbapparatus_return vbapparatus() throws RecognitionException {
        ChemicalChunkerParser.vbapparatus_return retval = new ChemicalChunkerParser.vbapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal280=null;
        Token TOKEN281=null;

        Object string_literal280_tree=null;
        Object TOKEN281_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:185:12: ( 'VB-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:185:13: 'VB-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(185,13);
            string_literal280=(Token)match(input,64,FOLLOW_64_in_vbapparatus1441); 
            string_literal280_tree = (Object)adaptor.create(string_literal280);
            adaptor.addChild(root_0, string_literal280_tree);

            dbg.location(185,28);
            TOKEN281=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbapparatus1443); 
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
        dbg.location(185, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:186:1: nnapparatus : 'NN-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.nnapparatus_return nnapparatus() throws RecognitionException {
        ChemicalChunkerParser.nnapparatus_return retval = new ChemicalChunkerParser.nnapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal282=null;
        Token TOKEN283=null;

        Object string_literal282_tree=null;
        Object TOKEN283_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:186:12: ( 'NN-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:186:13: 'NN-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(186,13);
            string_literal282=(Token)match(input,65,FOLLOW_65_in_nnapparatus1448); 
            string_literal282_tree = (Object)adaptor.create(string_literal282);
            adaptor.addChild(root_0, string_literal282_tree);

            dbg.location(186,28);
            TOKEN283=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnapparatus1450); 
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
        dbg.location(186, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:189:1: vbconcentrate : 'VB-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.vbconcentrate_return vbconcentrate() throws RecognitionException {
        ChemicalChunkerParser.vbconcentrate_return retval = new ChemicalChunkerParser.vbconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal284=null;
        Token TOKEN285=null;

        Object string_literal284_tree=null;
        Object TOKEN285_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:189:14: ( 'VB-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:189:15: 'VB-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(189,15);
            string_literal284=(Token)match(input,66,FOLLOW_66_in_vbconcentrate1457); 
            string_literal284_tree = (Object)adaptor.create(string_literal284);
            adaptor.addChild(root_0, string_literal284_tree);

            dbg.location(189,32);
            TOKEN285=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbconcentrate1459); 
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
        dbg.location(189, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:190:1: nnconcentrate : 'NN-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.nnconcentrate_return nnconcentrate() throws RecognitionException {
        ChemicalChunkerParser.nnconcentrate_return retval = new ChemicalChunkerParser.nnconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal286=null;
        Token TOKEN287=null;

        Object string_literal286_tree=null;
        Object TOKEN287_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:190:14: ( 'NN-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:190:15: 'NN-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(190,15);
            string_literal286=(Token)match(input,67,FOLLOW_67_in_nnconcentrate1464); 
            string_literal286_tree = (Object)adaptor.create(string_literal286);
            adaptor.addChild(root_0, string_literal286_tree);

            dbg.location(190,32);
            TOKEN287=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnconcentrate1466); 
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
        dbg.location(190, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:193:1: vbcool : 'VB-COOL' TOKEN ;
    public final ChemicalChunkerParser.vbcool_return vbcool() throws RecognitionException {
        ChemicalChunkerParser.vbcool_return retval = new ChemicalChunkerParser.vbcool_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal288=null;
        Token TOKEN289=null;

        Object string_literal288_tree=null;
        Object TOKEN289_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(193, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:193:7: ( 'VB-COOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:193:8: 'VB-COOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(193,8);
            string_literal288=(Token)match(input,68,FOLLOW_68_in_vbcool1473); 
            string_literal288_tree = (Object)adaptor.create(string_literal288);
            adaptor.addChild(root_0, string_literal288_tree);

            dbg.location(193,18);
            TOKEN289=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcool1475); 
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
        dbg.location(193, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:196:1: vbdegass : 'VB-DEGASS' TOKEN ;
    public final ChemicalChunkerParser.vbdegass_return vbdegass() throws RecognitionException {
        ChemicalChunkerParser.vbdegass_return retval = new ChemicalChunkerParser.vbdegass_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal290=null;
        Token TOKEN291=null;

        Object string_literal290_tree=null;
        Object TOKEN291_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdegass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(196, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:196:9: ( 'VB-DEGASS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:196:10: 'VB-DEGASS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(196,10);
            string_literal290=(Token)match(input,69,FOLLOW_69_in_vbdegass1482); 
            string_literal290_tree = (Object)adaptor.create(string_literal290);
            adaptor.addChild(root_0, string_literal290_tree);

            dbg.location(196,22);
            TOKEN291=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdegass1484); 
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
        dbg.location(196, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:199:1: vbdissolve : 'VB-DISSOLVE' TOKEN ;
    public final ChemicalChunkerParser.vbdissolve_return vbdissolve() throws RecognitionException {
        ChemicalChunkerParser.vbdissolve_return retval = new ChemicalChunkerParser.vbdissolve_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal292=null;
        Token TOKEN293=null;

        Object string_literal292_tree=null;
        Object TOKEN293_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdissolve");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:199:11: ( 'VB-DISSOLVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:199:12: 'VB-DISSOLVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(199,12);
            string_literal292=(Token)match(input,70,FOLLOW_70_in_vbdissolve1491); 
            string_literal292_tree = (Object)adaptor.create(string_literal292);
            adaptor.addChild(root_0, string_literal292_tree);

            dbg.location(199,26);
            TOKEN293=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdissolve1493); 
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
        dbg.location(199, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:202:1: vbdry : 'VB-DRY' TOKEN ;
    public final ChemicalChunkerParser.vbdry_return vbdry() throws RecognitionException {
        ChemicalChunkerParser.vbdry_return retval = new ChemicalChunkerParser.vbdry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal294=null;
        Token TOKEN295=null;

        Object string_literal294_tree=null;
        Object TOKEN295_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(202, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:202:6: ( 'VB-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:202:7: 'VB-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(202,7);
            string_literal294=(Token)match(input,71,FOLLOW_71_in_vbdry1500); 
            string_literal294_tree = (Object)adaptor.create(string_literal294);
            adaptor.addChild(root_0, string_literal294_tree);

            dbg.location(202,16);
            TOKEN295=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdry1502); 
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
        dbg.location(202, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:203:1: nndry : 'NN-DRY' TOKEN ;
    public final ChemicalChunkerParser.nndry_return nndry() throws RecognitionException {
        ChemicalChunkerParser.nndry_return retval = new ChemicalChunkerParser.nndry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal296=null;
        Token TOKEN297=null;

        Object string_literal296_tree=null;
        Object TOKEN297_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nndry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(203, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:203:6: ( 'NN-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:203:7: 'NN-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(203,7);
            string_literal296=(Token)match(input,72,FOLLOW_72_in_nndry1507); 
            string_literal296_tree = (Object)adaptor.create(string_literal296);
            adaptor.addChild(root_0, string_literal296_tree);

            dbg.location(203,16);
            TOKEN297=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nndry1509); 
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
        dbg.location(203, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:206:1: vbextract : 'VB-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.vbextract_return vbextract() throws RecognitionException {
        ChemicalChunkerParser.vbextract_return retval = new ChemicalChunkerParser.vbextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal298=null;
        Token TOKEN299=null;

        Object string_literal298_tree=null;
        Object TOKEN299_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(206, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:206:10: ( 'VB-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:206:11: 'VB-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(206,11);
            string_literal298=(Token)match(input,73,FOLLOW_73_in_vbextract1516); 
            string_literal298_tree = (Object)adaptor.create(string_literal298);
            adaptor.addChild(root_0, string_literal298_tree);

            dbg.location(206,24);
            TOKEN299=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbextract1518); 
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
        dbg.location(206, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:207:1: nnextract : 'NN-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.nnextract_return nnextract() throws RecognitionException {
        ChemicalChunkerParser.nnextract_return retval = new ChemicalChunkerParser.nnextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal300=null;
        Token TOKEN301=null;

        Object string_literal300_tree=null;
        Object TOKEN301_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(207, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:207:10: ( 'NN-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:207:11: 'NN-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(207,11);
            string_literal300=(Token)match(input,74,FOLLOW_74_in_nnextract1523); 
            string_literal300_tree = (Object)adaptor.create(string_literal300);
            adaptor.addChild(root_0, string_literal300_tree);

            dbg.location(207,24);
            TOKEN301=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnextract1525); 
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
        dbg.location(207, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:210:1: vbfilter : 'VB-FILTER' TOKEN ;
    public final ChemicalChunkerParser.vbfilter_return vbfilter() throws RecognitionException {
        ChemicalChunkerParser.vbfilter_return retval = new ChemicalChunkerParser.vbfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal302=null;
        Token TOKEN303=null;

        Object string_literal302_tree=null;
        Object TOKEN303_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(210, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:210:9: ( 'VB-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:210:10: 'VB-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(210,10);
            string_literal302=(Token)match(input,75,FOLLOW_75_in_vbfilter1532); 
            string_literal302_tree = (Object)adaptor.create(string_literal302);
            adaptor.addChild(root_0, string_literal302_tree);

            dbg.location(210,22);
            TOKEN303=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfilter1534); 
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
        dbg.location(210, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:211:1: nnfilter : 'NN-FILTER' TOKEN ;
    public final ChemicalChunkerParser.nnfilter_return nnfilter() throws RecognitionException {
        ChemicalChunkerParser.nnfilter_return retval = new ChemicalChunkerParser.nnfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal304=null;
        Token TOKEN305=null;

        Object string_literal304_tree=null;
        Object TOKEN305_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:211:9: ( 'NN-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:211:10: 'NN-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(211,10);
            string_literal304=(Token)match(input,76,FOLLOW_76_in_nnfilter1539); 
            string_literal304_tree = (Object)adaptor.create(string_literal304);
            adaptor.addChild(root_0, string_literal304_tree);

            dbg.location(211,22);
            TOKEN305=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnfilter1541); 
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
        dbg.location(211, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:214:1: vbheat : 'VB-HEAT' TOKEN ;
    public final ChemicalChunkerParser.vbheat_return vbheat() throws RecognitionException {
        ChemicalChunkerParser.vbheat_return retval = new ChemicalChunkerParser.vbheat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal306=null;
        Token TOKEN307=null;

        Object string_literal306_tree=null;
        Object TOKEN307_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbheat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(214, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:214:7: ( 'VB-HEAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:214:8: 'VB-HEAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(214,8);
            string_literal306=(Token)match(input,77,FOLLOW_77_in_vbheat1548); 
            string_literal306_tree = (Object)adaptor.create(string_literal306);
            adaptor.addChild(root_0, string_literal306_tree);

            dbg.location(214,18);
            TOKEN307=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbheat1550); 
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
        dbg.location(214, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:215:1: vbincrease : 'VB-INCREASE' TOKEN ;
    public final ChemicalChunkerParser.vbincrease_return vbincrease() throws RecognitionException {
        ChemicalChunkerParser.vbincrease_return retval = new ChemicalChunkerParser.vbincrease_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal308=null;
        Token TOKEN309=null;

        Object string_literal308_tree=null;
        Object TOKEN309_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbincrease");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:215:11: ( 'VB-INCREASE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:215:12: 'VB-INCREASE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(215,12);
            string_literal308=(Token)match(input,78,FOLLOW_78_in_vbincrease1555); 
            string_literal308_tree = (Object)adaptor.create(string_literal308);
            adaptor.addChild(root_0, string_literal308_tree);

            dbg.location(215,26);
            TOKEN309=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbincrease1557); 
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
        dbg.location(215, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:218:1: vbpartition : 'VB-PARTITION' TOKEN ;
    public final ChemicalChunkerParser.vbpartition_return vbpartition() throws RecognitionException {
        ChemicalChunkerParser.vbpartition_return retval = new ChemicalChunkerParser.vbpartition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal310=null;
        Token TOKEN311=null;

        Object string_literal310_tree=null;
        Object TOKEN311_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpartition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(218, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:218:12: ( 'VB-PARTITION' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:218:13: 'VB-PARTITION' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(218,13);
            string_literal310=(Token)match(input,79,FOLLOW_79_in_vbpartition1564); 
            string_literal310_tree = (Object)adaptor.create(string_literal310);
            adaptor.addChild(root_0, string_literal310_tree);

            dbg.location(218,28);
            TOKEN311=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpartition1566); 
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
        dbg.location(218, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:221:1: vbprecipitate : 'VB-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.vbprecipitate_return vbprecipitate() throws RecognitionException {
        ChemicalChunkerParser.vbprecipitate_return retval = new ChemicalChunkerParser.vbprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal312=null;
        Token TOKEN313=null;

        Object string_literal312_tree=null;
        Object TOKEN313_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:221:14: ( 'VB-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:221:15: 'VB-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(221,15);
            string_literal312=(Token)match(input,80,FOLLOW_80_in_vbprecipitate1573); 
            string_literal312_tree = (Object)adaptor.create(string_literal312);
            adaptor.addChild(root_0, string_literal312_tree);

            dbg.location(221,32);
            TOKEN313=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbprecipitate1575); 
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
        dbg.location(221, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:222:1: nnprecipitate : 'NN-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.nnprecipitate_return nnprecipitate() throws RecognitionException {
        ChemicalChunkerParser.nnprecipitate_return retval = new ChemicalChunkerParser.nnprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal314=null;
        Token TOKEN315=null;

        Object string_literal314_tree=null;
        Object TOKEN315_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(222, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:222:14: ( 'NN-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:222:15: 'NN-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(222,15);
            string_literal314=(Token)match(input,81,FOLLOW_81_in_nnprecipitate1580); 
            string_literal314_tree = (Object)adaptor.create(string_literal314);
            adaptor.addChild(root_0, string_literal314_tree);

            dbg.location(222,32);
            TOKEN315=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnprecipitate1582); 
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
        dbg.location(222, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:225:1: vbpurify : 'VB-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.vbpurify_return vbpurify() throws RecognitionException {
        ChemicalChunkerParser.vbpurify_return retval = new ChemicalChunkerParser.vbpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal316=null;
        Token TOKEN317=null;

        Object string_literal316_tree=null;
        Object TOKEN317_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:225:9: ( 'VB-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:225:10: 'VB-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(225,10);
            string_literal316=(Token)match(input,82,FOLLOW_82_in_vbpurify1589); 
            string_literal316_tree = (Object)adaptor.create(string_literal316);
            adaptor.addChild(root_0, string_literal316_tree);

            dbg.location(225,22);
            TOKEN317=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpurify1591); 
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
        dbg.location(225, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:226:1: nnpurify : 'NN-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.nnpurify_return nnpurify() throws RecognitionException {
        ChemicalChunkerParser.nnpurify_return retval = new ChemicalChunkerParser.nnpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal318=null;
        Token TOKEN319=null;

        Object string_literal318_tree=null;
        Object TOKEN319_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(226, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:226:9: ( 'NN-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:226:10: 'NN-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(226,10);
            string_literal318=(Token)match(input,83,FOLLOW_83_in_nnpurify1596); 
            string_literal318_tree = (Object)adaptor.create(string_literal318);
            adaptor.addChild(root_0, string_literal318_tree);

            dbg.location(226,22);
            TOKEN319=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpurify1598); 
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
        dbg.location(226, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:229:1: vbquench : 'VB-QUENCH' TOKEN ;
    public final ChemicalChunkerParser.vbquench_return vbquench() throws RecognitionException {
        ChemicalChunkerParser.vbquench_return retval = new ChemicalChunkerParser.vbquench_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal320=null;
        Token TOKEN321=null;

        Object string_literal320_tree=null;
        Object TOKEN321_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbquench");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(229, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:229:9: ( 'VB-QUENCH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:229:10: 'VB-QUENCH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(229,10);
            string_literal320=(Token)match(input,84,FOLLOW_84_in_vbquench1605); 
            string_literal320_tree = (Object)adaptor.create(string_literal320);
            adaptor.addChild(root_0, string_literal320_tree);

            dbg.location(229,22);
            TOKEN321=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbquench1607); 
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
        dbg.location(229, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:232:1: vbrecover : 'VB-RECOVER' TOKEN ;
    public final ChemicalChunkerParser.vbrecover_return vbrecover() throws RecognitionException {
        ChemicalChunkerParser.vbrecover_return retval = new ChemicalChunkerParser.vbrecover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal322=null;
        Token TOKEN323=null;

        Object string_literal322_tree=null;
        Object TOKEN323_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbrecover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:232:10: ( 'VB-RECOVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:232:11: 'VB-RECOVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(232,11);
            string_literal322=(Token)match(input,85,FOLLOW_85_in_vbrecover1614); 
            string_literal322_tree = (Object)adaptor.create(string_literal322);
            adaptor.addChild(root_0, string_literal322_tree);

            dbg.location(232,24);
            TOKEN323=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbrecover1616); 
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
        dbg.location(232, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:235:1: vbremove : 'VB-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.vbremove_return vbremove() throws RecognitionException {
        ChemicalChunkerParser.vbremove_return retval = new ChemicalChunkerParser.vbremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal324=null;
        Token TOKEN325=null;

        Object string_literal324_tree=null;
        Object TOKEN325_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(235, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:235:9: ( 'VB-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:235:10: 'VB-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(235,10);
            string_literal324=(Token)match(input,86,FOLLOW_86_in_vbremove1623); 
            string_literal324_tree = (Object)adaptor.create(string_literal324);
            adaptor.addChild(root_0, string_literal324_tree);

            dbg.location(235,22);
            TOKEN325=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbremove1625); 
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
        dbg.location(235, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:236:1: nnremove : 'NN-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.nnremove_return nnremove() throws RecognitionException {
        ChemicalChunkerParser.nnremove_return retval = new ChemicalChunkerParser.nnremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal326=null;
        Token TOKEN327=null;

        Object string_literal326_tree=null;
        Object TOKEN327_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(236, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:236:9: ( 'NN-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:236:10: 'NN-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(236,10);
            string_literal326=(Token)match(input,87,FOLLOW_87_in_nnremove1630); 
            string_literal326_tree = (Object)adaptor.create(string_literal326);
            adaptor.addChild(root_0, string_literal326_tree);

            dbg.location(236,22);
            TOKEN327=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnremove1632); 
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
        dbg.location(236, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:239:1: vbstir : 'VB-STIR' TOKEN ;
    public final ChemicalChunkerParser.vbstir_return vbstir() throws RecognitionException {
        ChemicalChunkerParser.vbstir_return retval = new ChemicalChunkerParser.vbstir_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal328=null;
        Token TOKEN329=null;

        Object string_literal328_tree=null;
        Object TOKEN329_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbstir");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(239, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:239:7: ( 'VB-STIR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:239:8: 'VB-STIR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(239,8);
            string_literal328=(Token)match(input,88,FOLLOW_88_in_vbstir1639); 
            string_literal328_tree = (Object)adaptor.create(string_literal328);
            adaptor.addChild(root_0, string_literal328_tree);

            dbg.location(239,18);
            TOKEN329=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbstir1641); 
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
        dbg.location(239, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:242:1: vbsynthesize : 'VB-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.vbsynthesize_return vbsynthesize() throws RecognitionException {
        ChemicalChunkerParser.vbsynthesize_return retval = new ChemicalChunkerParser.vbsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal330=null;
        Token TOKEN331=null;

        Object string_literal330_tree=null;
        Object TOKEN331_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(242, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:242:13: ( 'VB-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:242:14: 'VB-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(242,14);
            string_literal330=(Token)match(input,89,FOLLOW_89_in_vbsynthesize1648); 
            string_literal330_tree = (Object)adaptor.create(string_literal330);
            adaptor.addChild(root_0, string_literal330_tree);

            dbg.location(242,30);
            TOKEN331=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsynthesize1650); 
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
        dbg.location(242, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:243:1: nnsynthesize : 'NN-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.nnsynthesize_return nnsynthesize() throws RecognitionException {
        ChemicalChunkerParser.nnsynthesize_return retval = new ChemicalChunkerParser.nnsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal332=null;
        Token TOKEN333=null;

        Object string_literal332_tree=null;
        Object TOKEN333_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(243, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:243:13: ( 'NN-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:243:14: 'NN-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(243,14);
            string_literal332=(Token)match(input,90,FOLLOW_90_in_nnsynthesize1655); 
            string_literal332_tree = (Object)adaptor.create(string_literal332);
            adaptor.addChild(root_0, string_literal332_tree);

            dbg.location(243,30);
            TOKEN333=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnsynthesize1657); 
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
        dbg.location(243, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:246:1: vbwait : 'VB-WAIT' TOKEN ;
    public final ChemicalChunkerParser.vbwait_return vbwait() throws RecognitionException {
        ChemicalChunkerParser.vbwait_return retval = new ChemicalChunkerParser.vbwait_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal334=null;
        Token TOKEN335=null;

        Object string_literal334_tree=null;
        Object TOKEN335_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwait");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:246:7: ( 'VB-WAIT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:246:8: 'VB-WAIT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(246,8);
            string_literal334=(Token)match(input,91,FOLLOW_91_in_vbwait1664); 
            string_literal334_tree = (Object)adaptor.create(string_literal334);
            adaptor.addChild(root_0, string_literal334_tree);

            dbg.location(246,18);
            TOKEN335=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwait1666); 
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
        dbg.location(246, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:249:1: vbwash : 'VB-WASH' TOKEN ;
    public final ChemicalChunkerParser.vbwash_return vbwash() throws RecognitionException {
        ChemicalChunkerParser.vbwash_return retval = new ChemicalChunkerParser.vbwash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal336=null;
        Token TOKEN337=null;

        Object string_literal336_tree=null;
        Object TOKEN337_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(249, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:249:7: ( 'VB-WASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:249:8: 'VB-WASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(249,8);
            string_literal336=(Token)match(input,92,FOLLOW_92_in_vbwash1673); 
            string_literal336_tree = (Object)adaptor.create(string_literal336);
            adaptor.addChild(root_0, string_literal336_tree);

            dbg.location(249,18);
            TOKEN337=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwash1675); 
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
        dbg.location(249, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:252:1: vbyield : 'VB-YIELD' TOKEN ;
    public final ChemicalChunkerParser.vbyield_return vbyield() throws RecognitionException {
        ChemicalChunkerParser.vbyield_return retval = new ChemicalChunkerParser.vbyield_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal338=null;
        Token TOKEN339=null;

        Object string_literal338_tree=null;
        Object TOKEN339_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbyield");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(252, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:252:8: ( 'VB-YIELD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:252:9: 'VB-YIELD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(252,9);
            string_literal338=(Token)match(input,93,FOLLOW_93_in_vbyield1682); 
            string_literal338_tree = (Object)adaptor.create(string_literal338);
            adaptor.addChild(root_0, string_literal338_tree);

            dbg.location(252,20);
            TOKEN339=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbyield1684); 
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
        dbg.location(252, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:255:1: colon : 'COLON' TOKEN ;
    public final ChemicalChunkerParser.colon_return colon() throws RecognitionException {
        ChemicalChunkerParser.colon_return retval = new ChemicalChunkerParser.colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal340=null;
        Token TOKEN341=null;

        Object string_literal340_tree=null;
        Object TOKEN341_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(255, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:255:6: ( 'COLON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:255:7: 'COLON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(255,7);
            string_literal340=(Token)match(input,94,FOLLOW_94_in_colon1691); 
            string_literal340_tree = (Object)adaptor.create(string_literal340);
            adaptor.addChild(root_0, string_literal340_tree);

            dbg.location(255,15);
            TOKEN341=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_colon1693); 
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
        dbg.location(255, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:256:1: comma : 'COMMA' TOKEN ;
    public final ChemicalChunkerParser.comma_return comma() throws RecognitionException {
        ChemicalChunkerParser.comma_return retval = new ChemicalChunkerParser.comma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal342=null;
        Token TOKEN343=null;

        Object string_literal342_tree=null;
        Object TOKEN343_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(256, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:256:6: ( 'COMMA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:256:7: 'COMMA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(256,7);
            string_literal342=(Token)match(input,95,FOLLOW_95_in_comma1698); 
            string_literal342_tree = (Object)adaptor.create(string_literal342);
            adaptor.addChild(root_0, string_literal342_tree);

            dbg.location(256,15);
            TOKEN343=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_comma1700); 
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
        dbg.location(256, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:257:1: apost : 'APOST' TOKEN ;
    public final ChemicalChunkerParser.apost_return apost() throws RecognitionException {
        ChemicalChunkerParser.apost_return retval = new ChemicalChunkerParser.apost_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal344=null;
        Token TOKEN345=null;

        Object string_literal344_tree=null;
        Object TOKEN345_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "apost");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(257, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:257:6: ( 'APOST' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:257:7: 'APOST' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(257,7);
            string_literal344=(Token)match(input,96,FOLLOW_96_in_apost1705); 
            string_literal344_tree = (Object)adaptor.create(string_literal344);
            adaptor.addChild(root_0, string_literal344_tree);

            dbg.location(257,15);
            TOKEN345=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_apost1707); 
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
        dbg.location(257, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:258:1: neg : 'NEG' TOKEN ;
    public final ChemicalChunkerParser.neg_return neg() throws RecognitionException {
        ChemicalChunkerParser.neg_return retval = new ChemicalChunkerParser.neg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal346=null;
        Token TOKEN347=null;

        Object string_literal346_tree=null;
        Object TOKEN347_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "neg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(258, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:258:4: ( 'NEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:258:5: 'NEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(258,5);
            string_literal346=(Token)match(input,97,FOLLOW_97_in_neg1712); 
            string_literal346_tree = (Object)adaptor.create(string_literal346);
            adaptor.addChild(root_0, string_literal346_tree);

            dbg.location(258,11);
            TOKEN347=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_neg1714); 
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
        dbg.location(258, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:259:1: dash : 'DASH' TOKEN ;
    public final ChemicalChunkerParser.dash_return dash() throws RecognitionException {
        ChemicalChunkerParser.dash_return retval = new ChemicalChunkerParser.dash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal348=null;
        Token TOKEN349=null;

        Object string_literal348_tree=null;
        Object TOKEN349_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(259, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:259:5: ( 'DASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:259:6: 'DASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(259,6);
            string_literal348=(Token)match(input,98,FOLLOW_98_in_dash1719); 
            string_literal348_tree = (Object)adaptor.create(string_literal348);
            adaptor.addChild(root_0, string_literal348_tree);

            dbg.location(259,13);
            TOKEN349=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dash1721); 
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
        dbg.location(259, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:260:1: stop : 'STOP' TOKEN ;
    public final ChemicalChunkerParser.stop_return stop() throws RecognitionException {
        ChemicalChunkerParser.stop_return retval = new ChemicalChunkerParser.stop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal350=null;
        Token TOKEN351=null;

        Object string_literal350_tree=null;
        Object TOKEN351_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(260, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:260:5: ( 'STOP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:260:6: 'STOP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(260,6);
            string_literal350=(Token)match(input,99,FOLLOW_99_in_stop1726); 
            string_literal350_tree = (Object)adaptor.create(string_literal350);
            adaptor.addChild(root_0, string_literal350_tree);

            dbg.location(260,13);
            TOKEN351=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_stop1728); 
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
        dbg.location(260, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:261:1: nnpercent : 'NN-PERCENT' TOKEN ;
    public final ChemicalChunkerParser.nnpercent_return nnpercent() throws RecognitionException {
        ChemicalChunkerParser.nnpercent_return retval = new ChemicalChunkerParser.nnpercent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal352=null;
        Token TOKEN353=null;

        Object string_literal352_tree=null;
        Object TOKEN353_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpercent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:261:10: ( 'NN-PERCENT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:261:11: 'NN-PERCENT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(261,11);
            string_literal352=(Token)match(input,100,FOLLOW_100_in_nnpercent1733); 
            string_literal352_tree = (Object)adaptor.create(string_literal352);
            adaptor.addChild(root_0, string_literal352_tree);

            dbg.location(261,24);
            TOKEN353=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpercent1735); 
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
        dbg.location(261, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:262:1: lsqb : 'LSQB' TOKEN ;
    public final ChemicalChunkerParser.lsqb_return lsqb() throws RecognitionException {
        ChemicalChunkerParser.lsqb_return retval = new ChemicalChunkerParser.lsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal354=null;
        Token TOKEN355=null;

        Object string_literal354_tree=null;
        Object TOKEN355_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(262, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:262:5: ( 'LSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:262:6: 'LSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(262,6);
            string_literal354=(Token)match(input,101,FOLLOW_101_in_lsqb1740); 
            string_literal354_tree = (Object)adaptor.create(string_literal354);
            adaptor.addChild(root_0, string_literal354_tree);

            dbg.location(262,13);
            TOKEN355=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lsqb1742); 
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
        dbg.location(262, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:263:1: rsqb : 'RSQB' TOKEN ;
    public final ChemicalChunkerParser.rsqb_return rsqb() throws RecognitionException {
        ChemicalChunkerParser.rsqb_return retval = new ChemicalChunkerParser.rsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal356=null;
        Token TOKEN357=null;

        Object string_literal356_tree=null;
        Object TOKEN357_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(263, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:263:5: ( 'RSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:263:6: 'RSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(263,6);
            string_literal356=(Token)match(input,102,FOLLOW_102_in_rsqb1747); 
            string_literal356_tree = (Object)adaptor.create(string_literal356);
            adaptor.addChild(root_0, string_literal356_tree);

            dbg.location(263,13);
            TOKEN357=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rsqb1749); 
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
        dbg.location(263, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:264:1: lrb : '-LRB-' TOKEN ;
    public final ChemicalChunkerParser.lrb_return lrb() throws RecognitionException {
        ChemicalChunkerParser.lrb_return retval = new ChemicalChunkerParser.lrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal358=null;
        Token TOKEN359=null;

        Object string_literal358_tree=null;
        Object TOKEN359_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(264, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:264:4: ( '-LRB-' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:264:5: '-LRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(264,5);
            string_literal358=(Token)match(input,103,FOLLOW_103_in_lrb1754); 
            string_literal358_tree = (Object)adaptor.create(string_literal358);
            adaptor.addChild(root_0, string_literal358_tree);

            dbg.location(264,13);
            TOKEN359=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lrb1756); 
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
        dbg.location(264, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:265:1: rrb : '-RRB-' TOKEN ;
    public final ChemicalChunkerParser.rrb_return rrb() throws RecognitionException {
        ChemicalChunkerParser.rrb_return retval = new ChemicalChunkerParser.rrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal360=null;
        Token TOKEN361=null;

        Object string_literal360_tree=null;
        Object TOKEN361_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:265:4: ( '-RRB-' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:265:5: '-RRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(265,5);
            string_literal360=(Token)match(input,104,FOLLOW_104_in_rrb1761); 
            string_literal360_tree = (Object)adaptor.create(string_literal360);
            adaptor.addChild(root_0, string_literal360_tree);

            dbg.location(265,13);
            TOKEN361=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rrb1763); 
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
        dbg.location(265, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:270:1: abl : 'ABL' TOKEN ;
    public final ChemicalChunkerParser.abl_return abl() throws RecognitionException {
        ChemicalChunkerParser.abl_return retval = new ChemicalChunkerParser.abl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal362=null;
        Token TOKEN363=null;

        Object string_literal362_tree=null;
        Object TOKEN363_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(270, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:270:4: ( 'ABL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:270:5: 'ABL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(270,5);
            string_literal362=(Token)match(input,105,FOLLOW_105_in_abl1772); 
            string_literal362_tree = (Object)adaptor.create(string_literal362);
            adaptor.addChild(root_0, string_literal362_tree);

            dbg.location(270,11);
            TOKEN363=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abl1774); 
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
        dbg.location(270, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:273:1: abn : 'ABN' TOKEN ;
    public final ChemicalChunkerParser.abn_return abn() throws RecognitionException {
        ChemicalChunkerParser.abn_return retval = new ChemicalChunkerParser.abn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal364=null;
        Token TOKEN365=null;

        Object string_literal364_tree=null;
        Object TOKEN365_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(273, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:273:4: ( 'ABN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:273:5: 'ABN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(273,5);
            string_literal364=(Token)match(input,106,FOLLOW_106_in_abn1781); 
            string_literal364_tree = (Object)adaptor.create(string_literal364);
            adaptor.addChild(root_0, string_literal364_tree);

            dbg.location(273,11);
            TOKEN365=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abn1783); 
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
        dbg.location(273, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:276:1: abx : 'ABX' TOKEN ;
    public final ChemicalChunkerParser.abx_return abx() throws RecognitionException {
        ChemicalChunkerParser.abx_return retval = new ChemicalChunkerParser.abx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal366=null;
        Token TOKEN367=null;

        Object string_literal366_tree=null;
        Object TOKEN367_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(276, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:276:4: ( 'ABX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:276:5: 'ABX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(276,5);
            string_literal366=(Token)match(input,107,FOLLOW_107_in_abx1790); 
            string_literal366_tree = (Object)adaptor.create(string_literal366);
            adaptor.addChild(root_0, string_literal366_tree);

            dbg.location(276,11);
            TOKEN367=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abx1792); 
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
        dbg.location(276, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:279:1: ap : 'AP' TOKEN ;
    public final ChemicalChunkerParser.ap_return ap() throws RecognitionException {
        ChemicalChunkerParser.ap_return retval = new ChemicalChunkerParser.ap_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal368=null;
        Token TOKEN369=null;

        Object string_literal368_tree=null;
        Object TOKEN369_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ap");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:279:3: ( 'AP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:279:4: 'AP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(279,4);
            string_literal368=(Token)match(input,108,FOLLOW_108_in_ap1799); 
            string_literal368_tree = (Object)adaptor.create(string_literal368);
            adaptor.addChild(root_0, string_literal368_tree);

            dbg.location(279,9);
            TOKEN369=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ap1801); 
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
        dbg.location(279, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:282:1: at : 'AT' TOKEN ;
    public final ChemicalChunkerParser.at_return at() throws RecognitionException {
        ChemicalChunkerParser.at_return retval = new ChemicalChunkerParser.at_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal370=null;
        Token TOKEN371=null;

        Object string_literal370_tree=null;
        Object TOKEN371_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "at");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(282, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:282:3: ( 'AT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:282:4: 'AT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(282,4);
            string_literal370=(Token)match(input,109,FOLLOW_109_in_at1808); 
            string_literal370_tree = (Object)adaptor.create(string_literal370);
            adaptor.addChild(root_0, string_literal370_tree);

            dbg.location(282,9);
            TOKEN371=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_at1810); 
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
        dbg.location(282, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:285:1: be : 'BE' TOKEN ;
    public final ChemicalChunkerParser.be_return be() throws RecognitionException {
        ChemicalChunkerParser.be_return retval = new ChemicalChunkerParser.be_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal372=null;
        Token TOKEN373=null;

        Object string_literal372_tree=null;
        Object TOKEN373_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "be");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(285, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:285:3: ( 'BE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:285:4: 'BE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(285,4);
            string_literal372=(Token)match(input,110,FOLLOW_110_in_be1817); 
            string_literal372_tree = (Object)adaptor.create(string_literal372);
            adaptor.addChild(root_0, string_literal372_tree);

            dbg.location(285,9);
            TOKEN373=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_be1819); 
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
        dbg.location(285, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:288:1: bed : 'BED' TOKEN ;
    public final ChemicalChunkerParser.bed_return bed() throws RecognitionException {
        ChemicalChunkerParser.bed_return retval = new ChemicalChunkerParser.bed_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal374=null;
        Token TOKEN375=null;

        Object string_literal374_tree=null;
        Object TOKEN375_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(288, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:288:4: ( 'BED' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:288:5: 'BED' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(288,5);
            string_literal374=(Token)match(input,111,FOLLOW_111_in_bed1826); 
            string_literal374_tree = (Object)adaptor.create(string_literal374);
            adaptor.addChild(root_0, string_literal374_tree);

            dbg.location(288,11);
            TOKEN375=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bed1828); 
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
        dbg.location(288, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:291:1: bedz : 'BEDZ' TOKEN ;
    public final ChemicalChunkerParser.bedz_return bedz() throws RecognitionException {
        ChemicalChunkerParser.bedz_return retval = new ChemicalChunkerParser.bedz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal376=null;
        Token TOKEN377=null;

        Object string_literal376_tree=null;
        Object TOKEN377_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bedz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(291, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:291:5: ( 'BEDZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:291:6: 'BEDZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(291,6);
            string_literal376=(Token)match(input,112,FOLLOW_112_in_bedz1835); 
            string_literal376_tree = (Object)adaptor.create(string_literal376);
            adaptor.addChild(root_0, string_literal376_tree);

            dbg.location(291,13);
            TOKEN377=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bedz1837); 
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
        dbg.location(291, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:294:1: beg : 'BEG' TOKEN ;
    public final ChemicalChunkerParser.beg_return beg() throws RecognitionException {
        ChemicalChunkerParser.beg_return retval = new ChemicalChunkerParser.beg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal378=null;
        Token TOKEN379=null;

        Object string_literal378_tree=null;
        Object TOKEN379_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "beg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(294, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:294:4: ( 'BEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:294:5: 'BEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(294,5);
            string_literal378=(Token)match(input,113,FOLLOW_113_in_beg1844); 
            string_literal378_tree = (Object)adaptor.create(string_literal378);
            adaptor.addChild(root_0, string_literal378_tree);

            dbg.location(294,11);
            TOKEN379=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_beg1846); 
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
        dbg.location(294, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:297:1: bem : 'BEM' TOKEN ;
    public final ChemicalChunkerParser.bem_return bem() throws RecognitionException {
        ChemicalChunkerParser.bem_return retval = new ChemicalChunkerParser.bem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal380=null;
        Token TOKEN381=null;

        Object string_literal380_tree=null;
        Object TOKEN381_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bem");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(297, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:297:4: ( 'BEM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:297:5: 'BEM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(297,5);
            string_literal380=(Token)match(input,114,FOLLOW_114_in_bem1853); 
            string_literal380_tree = (Object)adaptor.create(string_literal380);
            adaptor.addChild(root_0, string_literal380_tree);

            dbg.location(297,11);
            TOKEN381=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bem1855); 
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
        dbg.location(297, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:300:1: ben : 'BEN' TOKEN ;
    public final ChemicalChunkerParser.ben_return ben() throws RecognitionException {
        ChemicalChunkerParser.ben_return retval = new ChemicalChunkerParser.ben_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal382=null;
        Token TOKEN383=null;

        Object string_literal382_tree=null;
        Object TOKEN383_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ben");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(300, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:300:4: ( 'BEN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:300:5: 'BEN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(300,5);
            string_literal382=(Token)match(input,115,FOLLOW_115_in_ben1862); 
            string_literal382_tree = (Object)adaptor.create(string_literal382);
            adaptor.addChild(root_0, string_literal382_tree);

            dbg.location(300,11);
            TOKEN383=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ben1864); 
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
        dbg.location(300, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:303:1: ber : 'BER' TOKEN ;
    public final ChemicalChunkerParser.ber_return ber() throws RecognitionException {
        ChemicalChunkerParser.ber_return retval = new ChemicalChunkerParser.ber_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal384=null;
        Token TOKEN385=null;

        Object string_literal384_tree=null;
        Object TOKEN385_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ber");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(303, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:303:4: ( 'BER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:303:5: 'BER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(303,5);
            string_literal384=(Token)match(input,116,FOLLOW_116_in_ber1871); 
            string_literal384_tree = (Object)adaptor.create(string_literal384);
            adaptor.addChild(root_0, string_literal384_tree);

            dbg.location(303,11);
            TOKEN385=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ber1873); 
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
        dbg.location(303, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:306:1: bez : 'BEZ' TOKEN ;
    public final ChemicalChunkerParser.bez_return bez() throws RecognitionException {
        ChemicalChunkerParser.bez_return retval = new ChemicalChunkerParser.bez_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal386=null;
        Token TOKEN387=null;

        Object string_literal386_tree=null;
        Object TOKEN387_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bez");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(306, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:306:4: ( 'BEZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:306:5: 'BEZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(306,5);
            string_literal386=(Token)match(input,117,FOLLOW_117_in_bez1880); 
            string_literal386_tree = (Object)adaptor.create(string_literal386);
            adaptor.addChild(root_0, string_literal386_tree);

            dbg.location(306,11);
            TOKEN387=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bez1882); 
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
        dbg.location(306, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:309:1: cc : 'CC' TOKEN ;
    public final ChemicalChunkerParser.cc_return cc() throws RecognitionException {
        ChemicalChunkerParser.cc_return retval = new ChemicalChunkerParser.cc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal388=null;
        Token TOKEN389=null;

        Object string_literal388_tree=null;
        Object TOKEN389_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(309, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:309:3: ( 'CC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:309:4: 'CC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(309,4);
            string_literal388=(Token)match(input,118,FOLLOW_118_in_cc1889); 
            string_literal388_tree = (Object)adaptor.create(string_literal388);
            adaptor.addChild(root_0, string_literal388_tree);

            dbg.location(309,9);
            TOKEN389=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cc1891); 
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
        dbg.location(309, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:312:1: cd : 'CD' TOKEN ;
    public final ChemicalChunkerParser.cd_return cd() throws RecognitionException {
        ChemicalChunkerParser.cd_return retval = new ChemicalChunkerParser.cd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal390=null;
        Token TOKEN391=null;

        Object string_literal390_tree=null;
        Object TOKEN391_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(312, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:312:3: ( 'CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:312:4: 'CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(312,4);
            string_literal390=(Token)match(input,119,FOLLOW_119_in_cd1898); 
            string_literal390_tree = (Object)adaptor.create(string_literal390);
            adaptor.addChild(root_0, string_literal390_tree);

            dbg.location(312,9);
            TOKEN391=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cd1900); 
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
        dbg.location(312, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:315:1: cs : 'CS' TOKEN ;
    public final ChemicalChunkerParser.cs_return cs() throws RecognitionException {
        ChemicalChunkerParser.cs_return retval = new ChemicalChunkerParser.cs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal392=null;
        Token TOKEN393=null;

        Object string_literal392_tree=null;
        Object TOKEN393_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(315, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:315:3: ( 'CS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:315:4: 'CS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(315,4);
            string_literal392=(Token)match(input,120,FOLLOW_120_in_cs1907); 
            string_literal392_tree = (Object)adaptor.create(string_literal392);
            adaptor.addChild(root_0, string_literal392_tree);

            dbg.location(315,9);
            TOKEN393=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cs1909); 
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
        dbg.location(315, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:318:1: dotok : 'DO' TOKEN ;
    public final ChemicalChunkerParser.dotok_return dotok() throws RecognitionException {
        ChemicalChunkerParser.dotok_return retval = new ChemicalChunkerParser.dotok_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal394=null;
        Token TOKEN395=null;

        Object string_literal394_tree=null;
        Object TOKEN395_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dotok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(318, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:318:7: ( 'DO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:318:8: 'DO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(318,8);
            string_literal394=(Token)match(input,121,FOLLOW_121_in_dotok1917); 
            string_literal394_tree = (Object)adaptor.create(string_literal394);
            adaptor.addChild(root_0, string_literal394_tree);

            dbg.location(318,13);
            TOKEN395=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dotok1919); 
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
        dbg.location(318, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:321:1: dod : 'DOD' TOKEN ;
    public final ChemicalChunkerParser.dod_return dod() throws RecognitionException {
        ChemicalChunkerParser.dod_return retval = new ChemicalChunkerParser.dod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal396=null;
        Token TOKEN397=null;

        Object string_literal396_tree=null;
        Object TOKEN397_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(321, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:321:4: ( 'DOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:321:5: 'DOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(321,5);
            string_literal396=(Token)match(input,122,FOLLOW_122_in_dod1926); 
            string_literal396_tree = (Object)adaptor.create(string_literal396);
            adaptor.addChild(root_0, string_literal396_tree);

            dbg.location(321,11);
            TOKEN397=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dod1928); 
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
        dbg.location(321, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:324:1: doz : 'DOZ' TOKEN ;
    public final ChemicalChunkerParser.doz_return doz() throws RecognitionException {
        ChemicalChunkerParser.doz_return retval = new ChemicalChunkerParser.doz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal398=null;
        Token TOKEN399=null;

        Object string_literal398_tree=null;
        Object TOKEN399_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:324:4: ( 'DOZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:324:5: 'DOZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(324,5);
            string_literal398=(Token)match(input,123,FOLLOW_123_in_doz1935); 
            string_literal398_tree = (Object)adaptor.create(string_literal398);
            adaptor.addChild(root_0, string_literal398_tree);

            dbg.location(324,11);
            TOKEN399=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_doz1937); 
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
        dbg.location(324, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:327:1: dt : 'DT' TOKEN ;
    public final ChemicalChunkerParser.dt_return dt() throws RecognitionException {
        ChemicalChunkerParser.dt_return retval = new ChemicalChunkerParser.dt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal400=null;
        Token TOKEN401=null;

        Object string_literal400_tree=null;
        Object TOKEN401_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(327, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:327:3: ( 'DT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:327:4: 'DT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(327,4);
            string_literal400=(Token)match(input,124,FOLLOW_124_in_dt1944); 
            string_literal400_tree = (Object)adaptor.create(string_literal400);
            adaptor.addChild(root_0, string_literal400_tree);

            dbg.location(327,9);
            TOKEN401=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dt1946); 
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
        dbg.location(327, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:330:1: dti : 'DTI' TOKEN ;
    public final ChemicalChunkerParser.dti_return dti() throws RecognitionException {
        ChemicalChunkerParser.dti_return retval = new ChemicalChunkerParser.dti_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal402=null;
        Token TOKEN403=null;

        Object string_literal402_tree=null;
        Object TOKEN403_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dti");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(330, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:330:4: ( 'DTI' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:330:5: 'DTI' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(330,5);
            string_literal402=(Token)match(input,125,FOLLOW_125_in_dti1953); 
            string_literal402_tree = (Object)adaptor.create(string_literal402);
            adaptor.addChild(root_0, string_literal402_tree);

            dbg.location(330,11);
            TOKEN403=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dti1955); 
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
        dbg.location(330, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:333:1: dts : 'DTS' TOKEN ;
    public final ChemicalChunkerParser.dts_return dts() throws RecognitionException {
        ChemicalChunkerParser.dts_return retval = new ChemicalChunkerParser.dts_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal404=null;
        Token TOKEN405=null;

        Object string_literal404_tree=null;
        Object TOKEN405_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dts");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(333, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:333:4: ( 'DTS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:333:5: 'DTS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(333,5);
            string_literal404=(Token)match(input,126,FOLLOW_126_in_dts1962); 
            string_literal404_tree = (Object)adaptor.create(string_literal404);
            adaptor.addChild(root_0, string_literal404_tree);

            dbg.location(333,11);
            TOKEN405=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dts1964); 
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
        dbg.location(333, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:336:1: dtx : 'DTX' TOKEN ;
    public final ChemicalChunkerParser.dtx_return dtx() throws RecognitionException {
        ChemicalChunkerParser.dtx_return retval = new ChemicalChunkerParser.dtx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal406=null;
        Token TOKEN407=null;

        Object string_literal406_tree=null;
        Object TOKEN407_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dtx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(336, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:336:4: ( 'DTX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:336:5: 'DTX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(336,5);
            string_literal406=(Token)match(input,127,FOLLOW_127_in_dtx1971); 
            string_literal406_tree = (Object)adaptor.create(string_literal406);
            adaptor.addChild(root_0, string_literal406_tree);

            dbg.location(336,11);
            TOKEN407=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dtx1973); 
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
        dbg.location(336, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:339:1: ex : 'EX' TOKEN ;
    public final ChemicalChunkerParser.ex_return ex() throws RecognitionException {
        ChemicalChunkerParser.ex_return retval = new ChemicalChunkerParser.ex_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal408=null;
        Token TOKEN409=null;

        Object string_literal408_tree=null;
        Object TOKEN409_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ex");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(339, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:339:3: ( 'EX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:339:4: 'EX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(339,4);
            string_literal408=(Token)match(input,128,FOLLOW_128_in_ex1980); 
            string_literal408_tree = (Object)adaptor.create(string_literal408);
            adaptor.addChild(root_0, string_literal408_tree);

            dbg.location(339,9);
            TOKEN409=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ex1982); 
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
        dbg.location(339, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:342:1: fw : 'FW' TOKEN ;
    public final ChemicalChunkerParser.fw_return fw() throws RecognitionException {
        ChemicalChunkerParser.fw_return retval = new ChemicalChunkerParser.fw_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal410=null;
        Token TOKEN411=null;

        Object string_literal410_tree=null;
        Object TOKEN411_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(342, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:342:3: ( 'FW' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:342:4: 'FW' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(342,4);
            string_literal410=(Token)match(input,129,FOLLOW_129_in_fw1989); 
            string_literal410_tree = (Object)adaptor.create(string_literal410);
            adaptor.addChild(root_0, string_literal410_tree);

            dbg.location(342,9);
            TOKEN411=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_fw1991); 
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
        dbg.location(342, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:345:1: hv : 'HV' TOKEN ;
    public final ChemicalChunkerParser.hv_return hv() throws RecognitionException {
        ChemicalChunkerParser.hv_return retval = new ChemicalChunkerParser.hv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal412=null;
        Token TOKEN413=null;

        Object string_literal412_tree=null;
        Object TOKEN413_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(345, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:345:3: ( 'HV' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:345:4: 'HV' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(345,4);
            string_literal412=(Token)match(input,130,FOLLOW_130_in_hv1998); 
            string_literal412_tree = (Object)adaptor.create(string_literal412);
            adaptor.addChild(root_0, string_literal412_tree);

            dbg.location(345,9);
            TOKEN413=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hv2000); 
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
        dbg.location(345, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:348:1: hvd : 'HVD' TOKEN ;
    public final ChemicalChunkerParser.hvd_return hvd() throws RecognitionException {
        ChemicalChunkerParser.hvd_return retval = new ChemicalChunkerParser.hvd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal414=null;
        Token TOKEN415=null;

        Object string_literal414_tree=null;
        Object TOKEN415_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(348, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:348:4: ( 'HVD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:348:5: 'HVD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(348,5);
            string_literal414=(Token)match(input,131,FOLLOW_131_in_hvd2007); 
            string_literal414_tree = (Object)adaptor.create(string_literal414);
            adaptor.addChild(root_0, string_literal414_tree);

            dbg.location(348,11);
            TOKEN415=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvd2009); 
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
        dbg.location(348, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:351:1: hvg : 'HVG' TOKEN ;
    public final ChemicalChunkerParser.hvg_return hvg() throws RecognitionException {
        ChemicalChunkerParser.hvg_return retval = new ChemicalChunkerParser.hvg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal416=null;
        Token TOKEN417=null;

        Object string_literal416_tree=null;
        Object TOKEN417_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(351, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:351:4: ( 'HVG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:351:5: 'HVG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(351,5);
            string_literal416=(Token)match(input,132,FOLLOW_132_in_hvg2016); 
            string_literal416_tree = (Object)adaptor.create(string_literal416);
            adaptor.addChild(root_0, string_literal416_tree);

            dbg.location(351,11);
            TOKEN417=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvg2018); 
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
        dbg.location(351, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:354:1: hvn : 'HVN' TOKEN ;
    public final ChemicalChunkerParser.hvn_return hvn() throws RecognitionException {
        ChemicalChunkerParser.hvn_return retval = new ChemicalChunkerParser.hvn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal418=null;
        Token TOKEN419=null;

        Object string_literal418_tree=null;
        Object TOKEN419_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(354, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:354:4: ( 'HVN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:354:5: 'HVN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(354,5);
            string_literal418=(Token)match(input,133,FOLLOW_133_in_hvn2025); 
            string_literal418_tree = (Object)adaptor.create(string_literal418);
            adaptor.addChild(root_0, string_literal418_tree);

            dbg.location(354,11);
            TOKEN419=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvn2027); 
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
        dbg.location(354, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:357:1: in : 'IN' TOKEN ;
    public final ChemicalChunkerParser.in_return in() throws RecognitionException {
        ChemicalChunkerParser.in_return retval = new ChemicalChunkerParser.in_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal420=null;
        Token TOKEN421=null;

        Object string_literal420_tree=null;
        Object TOKEN421_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "in");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(357, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:357:3: ( 'IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:357:4: 'IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(357,4);
            string_literal420=(Token)match(input,134,FOLLOW_134_in_in2034); 
            string_literal420_tree = (Object)adaptor.create(string_literal420);
            adaptor.addChild(root_0, string_literal420_tree);

            dbg.location(357,9);
            TOKEN421=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_in2036); 
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
        dbg.location(357, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:360:1: jj : 'JJ' TOKEN ;
    public final ChemicalChunkerParser.jj_return jj() throws RecognitionException {
        ChemicalChunkerParser.jj_return retval = new ChemicalChunkerParser.jj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal422=null;
        Token TOKEN423=null;

        Object string_literal422_tree=null;
        Object TOKEN423_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(360, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:360:3: ( 'JJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:360:4: 'JJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(360,4);
            string_literal422=(Token)match(input,135,FOLLOW_135_in_jj2043); 
            string_literal422_tree = (Object)adaptor.create(string_literal422);
            adaptor.addChild(root_0, string_literal422_tree);

            dbg.location(360,9);
            TOKEN423=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jj2045); 
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
        dbg.location(360, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:363:1: jjr : 'JJR' TOKEN ;
    public final ChemicalChunkerParser.jjr_return jjr() throws RecognitionException {
        ChemicalChunkerParser.jjr_return retval = new ChemicalChunkerParser.jjr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal424=null;
        Token TOKEN425=null;

        Object string_literal424_tree=null;
        Object TOKEN425_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(363, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:363:4: ( 'JJR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:363:5: 'JJR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(363,5);
            string_literal424=(Token)match(input,136,FOLLOW_136_in_jjr2052); 
            string_literal424_tree = (Object)adaptor.create(string_literal424);
            adaptor.addChild(root_0, string_literal424_tree);

            dbg.location(363,11);
            TOKEN425=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjr2054); 
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
        dbg.location(363, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:366:1: jjs : 'JJS' TOKEN ;
    public final ChemicalChunkerParser.jjs_return jjs() throws RecognitionException {
        ChemicalChunkerParser.jjs_return retval = new ChemicalChunkerParser.jjs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal426=null;
        Token TOKEN427=null;

        Object string_literal426_tree=null;
        Object TOKEN427_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(366, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:366:4: ( 'JJS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:366:5: 'JJS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(366,5);
            string_literal426=(Token)match(input,137,FOLLOW_137_in_jjs2061); 
            string_literal426_tree = (Object)adaptor.create(string_literal426);
            adaptor.addChild(root_0, string_literal426_tree);

            dbg.location(366,11);
            TOKEN427=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjs2063); 
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
        dbg.location(366, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:369:1: jjt : 'JJT' TOKEN ;
    public final ChemicalChunkerParser.jjt_return jjt() throws RecognitionException {
        ChemicalChunkerParser.jjt_return retval = new ChemicalChunkerParser.jjt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal428=null;
        Token TOKEN429=null;

        Object string_literal428_tree=null;
        Object TOKEN429_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(369, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:369:4: ( 'JJT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:369:5: 'JJT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(369,5);
            string_literal428=(Token)match(input,138,FOLLOW_138_in_jjt2070); 
            string_literal428_tree = (Object)adaptor.create(string_literal428);
            adaptor.addChild(root_0, string_literal428_tree);

            dbg.location(369,11);
            TOKEN429=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjt2072); 
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
        dbg.location(369, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:372:1: md : 'MD' TOKEN ;
    public final ChemicalChunkerParser.md_return md() throws RecognitionException {
        ChemicalChunkerParser.md_return retval = new ChemicalChunkerParser.md_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal430=null;
        Token TOKEN431=null;

        Object string_literal430_tree=null;
        Object TOKEN431_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "md");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(372, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:372:3: ( 'MD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:372:4: 'MD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(372,4);
            string_literal430=(Token)match(input,139,FOLLOW_139_in_md2079); 
            string_literal430_tree = (Object)adaptor.create(string_literal430);
            adaptor.addChild(root_0, string_literal430_tree);

            dbg.location(372,9);
            TOKEN431=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_md2081); 
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
        dbg.location(372, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:375:1: nc : 'NC' TOKEN ;
    public final ChemicalChunkerParser.nc_return nc() throws RecognitionException {
        ChemicalChunkerParser.nc_return retval = new ChemicalChunkerParser.nc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal432=null;
        Token TOKEN433=null;

        Object string_literal432_tree=null;
        Object TOKEN433_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(375, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:375:3: ( 'NC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:375:4: 'NC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(375,4);
            string_literal432=(Token)match(input,140,FOLLOW_140_in_nc2088); 
            string_literal432_tree = (Object)adaptor.create(string_literal432);
            adaptor.addChild(root_0, string_literal432_tree);

            dbg.location(375,9);
            TOKEN433=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nc2090); 
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
        dbg.location(375, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:378:1: nn : 'NN' TOKEN ;
    public final ChemicalChunkerParser.nn_return nn() throws RecognitionException {
        ChemicalChunkerParser.nn_return retval = new ChemicalChunkerParser.nn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal434=null;
        Token TOKEN435=null;

        Object string_literal434_tree=null;
        Object TOKEN435_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(378, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:378:3: ( 'NN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:378:4: 'NN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(378,4);
            string_literal434=(Token)match(input,141,FOLLOW_141_in_nn2097); 
            string_literal434_tree = (Object)adaptor.create(string_literal434);
            adaptor.addChild(root_0, string_literal434_tree);

            dbg.location(378,9);
            TOKEN435=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn2099); 
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
        dbg.location(378, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:381:1: nn_poss : 'NN$' TOKEN ;
    public final ChemicalChunkerParser.nn_poss_return nn_poss() throws RecognitionException {
        ChemicalChunkerParser.nn_poss_return retval = new ChemicalChunkerParser.nn_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal436=null;
        Token TOKEN437=null;

        Object string_literal436_tree=null;
        Object TOKEN437_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:381:8: ( 'NN$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:381:9: 'NN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(381,9);
            string_literal436=(Token)match(input,142,FOLLOW_142_in_nn_poss2106); 
            string_literal436_tree = (Object)adaptor.create(string_literal436);
            adaptor.addChild(root_0, string_literal436_tree);

            dbg.location(381,15);
            TOKEN437=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn_poss2108); 
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
        dbg.location(381, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:384:1: nns : 'NNS' TOKEN ;
    public final ChemicalChunkerParser.nns_return nns() throws RecognitionException {
        ChemicalChunkerParser.nns_return retval = new ChemicalChunkerParser.nns_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal438=null;
        Token TOKEN439=null;

        Object string_literal438_tree=null;
        Object TOKEN439_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(384, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:384:4: ( 'NNS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:384:5: 'NNS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(384,5);
            string_literal438=(Token)match(input,143,FOLLOW_143_in_nns2115); 
            string_literal438_tree = (Object)adaptor.create(string_literal438);
            adaptor.addChild(root_0, string_literal438_tree);

            dbg.location(384,11);
            TOKEN439=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns2117); 
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
        dbg.location(384, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:387:1: nns_poss : 'NNS$' TOKEN ;
    public final ChemicalChunkerParser.nns_poss_return nns_poss() throws RecognitionException {
        ChemicalChunkerParser.nns_poss_return retval = new ChemicalChunkerParser.nns_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal440=null;
        Token TOKEN441=null;

        Object string_literal440_tree=null;
        Object TOKEN441_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(387, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:387:9: ( 'NNS$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:387:10: 'NNS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(387,10);
            string_literal440=(Token)match(input,144,FOLLOW_144_in_nns_poss2124); 
            string_literal440_tree = (Object)adaptor.create(string_literal440);
            adaptor.addChild(root_0, string_literal440_tree);

            dbg.location(387,17);
            TOKEN441=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns_poss2126); 
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
        dbg.location(387, 22);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:390:1: np : 'NP' TOKEN ;
    public final ChemicalChunkerParser.np_return np() throws RecognitionException {
        ChemicalChunkerParser.np_return retval = new ChemicalChunkerParser.np_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal442=null;
        Token TOKEN443=null;

        Object string_literal442_tree=null;
        Object TOKEN443_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(390, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:390:3: ( 'NP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:390:4: 'NP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(390,4);
            string_literal442=(Token)match(input,145,FOLLOW_145_in_np2133); 
            string_literal442_tree = (Object)adaptor.create(string_literal442);
            adaptor.addChild(root_0, string_literal442_tree);

            dbg.location(390,9);
            TOKEN443=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np2135); 
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
        dbg.location(390, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:393:1: np_poss : 'NP$' TOKEN ;
    public final ChemicalChunkerParser.np_poss_return np_poss() throws RecognitionException {
        ChemicalChunkerParser.np_poss_return retval = new ChemicalChunkerParser.np_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal444=null;
        Token TOKEN445=null;

        Object string_literal444_tree=null;
        Object TOKEN445_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(393, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:393:8: ( 'NP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:393:9: 'NP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(393,9);
            string_literal444=(Token)match(input,146,FOLLOW_146_in_np_poss2142); 
            string_literal444_tree = (Object)adaptor.create(string_literal444);
            adaptor.addChild(root_0, string_literal444_tree);

            dbg.location(393,15);
            TOKEN445=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np_poss2144); 
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
        dbg.location(393, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:396:1: nps : 'NPS' TOKEN ;
    public final ChemicalChunkerParser.nps_return nps() throws RecognitionException {
        ChemicalChunkerParser.nps_return retval = new ChemicalChunkerParser.nps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal446=null;
        Token TOKEN447=null;

        Object string_literal446_tree=null;
        Object TOKEN447_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(396, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:396:4: ( 'NPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:396:5: 'NPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(396,5);
            string_literal446=(Token)match(input,147,FOLLOW_147_in_nps2151); 
            string_literal446_tree = (Object)adaptor.create(string_literal446);
            adaptor.addChild(root_0, string_literal446_tree);

            dbg.location(396,11);
            TOKEN447=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps2153); 
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
        dbg.location(396, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:399:1: nps_poss : 'NPS$' TOKEN ;
    public final ChemicalChunkerParser.nps_poss_return nps_poss() throws RecognitionException {
        ChemicalChunkerParser.nps_poss_return retval = new ChemicalChunkerParser.nps_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal448=null;
        Token TOKEN449=null;

        Object string_literal448_tree=null;
        Object TOKEN449_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(399, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:399:9: ( 'NPS$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:399:10: 'NPS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(399,10);
            string_literal448=(Token)match(input,148,FOLLOW_148_in_nps_poss2160); 
            string_literal448_tree = (Object)adaptor.create(string_literal448);
            adaptor.addChild(root_0, string_literal448_tree);

            dbg.location(399,17);
            TOKEN449=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps_poss2162); 
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
        dbg.location(399, 22);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:402:1: nr : 'NR' TOKEN ;
    public final ChemicalChunkerParser.nr_return nr() throws RecognitionException {
        ChemicalChunkerParser.nr_return retval = new ChemicalChunkerParser.nr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal450=null;
        Token TOKEN451=null;

        Object string_literal450_tree=null;
        Object TOKEN451_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(402, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:402:3: ( 'NR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:402:4: 'NR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(402,4);
            string_literal450=(Token)match(input,149,FOLLOW_149_in_nr2169); 
            string_literal450_tree = (Object)adaptor.create(string_literal450);
            adaptor.addChild(root_0, string_literal450_tree);

            dbg.location(402,9);
            TOKEN451=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nr2171); 
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
        dbg.location(402, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:405:1: od : 'OD' TOKEN ;
    public final ChemicalChunkerParser.od_return od() throws RecognitionException {
        ChemicalChunkerParser.od_return retval = new ChemicalChunkerParser.od_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal452=null;
        Token TOKEN453=null;

        Object string_literal452_tree=null;
        Object TOKEN453_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "od");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(405, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:405:3: ( 'OD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:405:4: 'OD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(405,4);
            string_literal452=(Token)match(input,150,FOLLOW_150_in_od2178); 
            string_literal452_tree = (Object)adaptor.create(string_literal452);
            adaptor.addChild(root_0, string_literal452_tree);

            dbg.location(405,9);
            TOKEN453=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_od2180); 
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
        dbg.location(405, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:408:1: pn : 'PN' TOKEN ;
    public final ChemicalChunkerParser.pn_return pn() throws RecognitionException {
        ChemicalChunkerParser.pn_return retval = new ChemicalChunkerParser.pn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal454=null;
        Token TOKEN455=null;

        Object string_literal454_tree=null;
        Object TOKEN455_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(408, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:408:3: ( 'PN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:408:4: 'PN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(408,4);
            string_literal454=(Token)match(input,151,FOLLOW_151_in_pn2187); 
            string_literal454_tree = (Object)adaptor.create(string_literal454);
            adaptor.addChild(root_0, string_literal454_tree);

            dbg.location(408,9);
            TOKEN455=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn2189); 
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
        dbg.location(408, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:411:1: pn_poss : 'PN$' TOKEN ;
    public final ChemicalChunkerParser.pn_poss_return pn_poss() throws RecognitionException {
        ChemicalChunkerParser.pn_poss_return retval = new ChemicalChunkerParser.pn_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal456=null;
        Token TOKEN457=null;

        Object string_literal456_tree=null;
        Object TOKEN457_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(411, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:411:8: ( 'PN$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:411:9: 'PN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(411,9);
            string_literal456=(Token)match(input,152,FOLLOW_152_in_pn_poss2196); 
            string_literal456_tree = (Object)adaptor.create(string_literal456);
            adaptor.addChild(root_0, string_literal456_tree);

            dbg.location(411,15);
            TOKEN457=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn_poss2198); 
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
        dbg.location(411, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:414:1: pp_poss : 'PP$' TOKEN ;
    public final ChemicalChunkerParser.pp_poss_return pp_poss() throws RecognitionException {
        ChemicalChunkerParser.pp_poss_return retval = new ChemicalChunkerParser.pp_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal458=null;
        Token TOKEN459=null;

        Object string_literal458_tree=null;
        Object TOKEN459_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pp_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(414, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:414:8: ( 'PP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:414:9: 'PP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(414,9);
            string_literal458=(Token)match(input,153,FOLLOW_153_in_pp_poss2205); 
            string_literal458_tree = (Object)adaptor.create(string_literal458);
            adaptor.addChild(root_0, string_literal458_tree);

            dbg.location(414,15);
            TOKEN459=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pp_poss2207); 
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
        dbg.location(414, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:417:1: pp_poss_poss : 'PP$$' TOKEN ;
    public final ChemicalChunkerParser.pp_poss_poss_return pp_poss_poss() throws RecognitionException {
        ChemicalChunkerParser.pp_poss_poss_return retval = new ChemicalChunkerParser.pp_poss_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal460=null;
        Token TOKEN461=null;

        Object string_literal460_tree=null;
        Object TOKEN461_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pp_poss_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(417, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:417:13: ( 'PP$$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:417:14: 'PP$$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(417,14);
            string_literal460=(Token)match(input,154,FOLLOW_154_in_pp_poss_poss2214); 
            string_literal460_tree = (Object)adaptor.create(string_literal460);
            adaptor.addChild(root_0, string_literal460_tree);

            dbg.location(417,21);
            TOKEN461=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pp_poss_poss2216); 
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
        dbg.location(417, 26);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:420:1: ppl : 'PPL' TOKEN ;
    public final ChemicalChunkerParser.ppl_return ppl() throws RecognitionException {
        ChemicalChunkerParser.ppl_return retval = new ChemicalChunkerParser.ppl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal462=null;
        Token TOKEN463=null;

        Object string_literal462_tree=null;
        Object TOKEN463_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(420, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:420:4: ( 'PPL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:420:5: 'PPL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(420,5);
            string_literal462=(Token)match(input,155,FOLLOW_155_in_ppl2223); 
            string_literal462_tree = (Object)adaptor.create(string_literal462);
            adaptor.addChild(root_0, string_literal462_tree);

            dbg.location(420,11);
            TOKEN463=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppl2225); 
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
        dbg.location(420, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:423:1: ppls : 'PPLS' TOKEN ;
    public final ChemicalChunkerParser.ppls_return ppls() throws RecognitionException {
        ChemicalChunkerParser.ppls_return retval = new ChemicalChunkerParser.ppls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal464=null;
        Token TOKEN465=null;

        Object string_literal464_tree=null;
        Object TOKEN465_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(423, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:423:5: ( 'PPLS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:423:6: 'PPLS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(423,6);
            string_literal464=(Token)match(input,156,FOLLOW_156_in_ppls2232); 
            string_literal464_tree = (Object)adaptor.create(string_literal464);
            adaptor.addChild(root_0, string_literal464_tree);

            dbg.location(423,13);
            TOKEN465=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppls2234); 
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
        dbg.location(423, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:426:1: ppo : 'PPO' TOKEN ;
    public final ChemicalChunkerParser.ppo_return ppo() throws RecognitionException {
        ChemicalChunkerParser.ppo_return retval = new ChemicalChunkerParser.ppo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal466=null;
        Token TOKEN467=null;

        Object string_literal466_tree=null;
        Object TOKEN467_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(426, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:426:4: ( 'PPO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:426:5: 'PPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(426,5);
            string_literal466=(Token)match(input,157,FOLLOW_157_in_ppo2241); 
            string_literal466_tree = (Object)adaptor.create(string_literal466);
            adaptor.addChild(root_0, string_literal466_tree);

            dbg.location(426,11);
            TOKEN467=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppo2243); 
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
        dbg.location(426, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:429:1: pps : 'PPS' TOKEN ;
    public final ChemicalChunkerParser.pps_return pps() throws RecognitionException {
        ChemicalChunkerParser.pps_return retval = new ChemicalChunkerParser.pps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal468=null;
        Token TOKEN469=null;

        Object string_literal468_tree=null;
        Object TOKEN469_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(429, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:429:4: ( 'PPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:429:5: 'PPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(429,5);
            string_literal468=(Token)match(input,158,FOLLOW_158_in_pps2250); 
            string_literal468_tree = (Object)adaptor.create(string_literal468);
            adaptor.addChild(root_0, string_literal468_tree);

            dbg.location(429,11);
            TOKEN469=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pps2252); 
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
        dbg.location(429, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:432:1: ppss : 'PPSS' TOKEN ;
    public final ChemicalChunkerParser.ppss_return ppss() throws RecognitionException {
        ChemicalChunkerParser.ppss_return retval = new ChemicalChunkerParser.ppss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal470=null;
        Token TOKEN471=null;

        Object string_literal470_tree=null;
        Object TOKEN471_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(432, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:432:5: ( 'PPSS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:432:6: 'PPSS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(432,6);
            string_literal470=(Token)match(input,159,FOLLOW_159_in_ppss2259); 
            string_literal470_tree = (Object)adaptor.create(string_literal470);
            adaptor.addChild(root_0, string_literal470_tree);

            dbg.location(432,13);
            TOKEN471=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppss2261); 
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
        dbg.location(432, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:435:1: ql : 'QL' TOKEN ;
    public final ChemicalChunkerParser.ql_return ql() throws RecognitionException {
        ChemicalChunkerParser.ql_return retval = new ChemicalChunkerParser.ql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal472=null;
        Token TOKEN473=null;

        Object string_literal472_tree=null;
        Object TOKEN473_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(435, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:435:3: ( 'QL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:435:4: 'QL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(435,4);
            string_literal472=(Token)match(input,160,FOLLOW_160_in_ql2268); 
            string_literal472_tree = (Object)adaptor.create(string_literal472);
            adaptor.addChild(root_0, string_literal472_tree);

            dbg.location(435,9);
            TOKEN473=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ql2270); 
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
        dbg.location(435, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:438:1: qlp : 'QLP' TOKEN ;
    public final ChemicalChunkerParser.qlp_return qlp() throws RecognitionException {
        ChemicalChunkerParser.qlp_return retval = new ChemicalChunkerParser.qlp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal474=null;
        Token TOKEN475=null;

        Object string_literal474_tree=null;
        Object TOKEN475_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "qlp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(438, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:438:4: ( 'QLP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:438:5: 'QLP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(438,5);
            string_literal474=(Token)match(input,161,FOLLOW_161_in_qlp2277); 
            string_literal474_tree = (Object)adaptor.create(string_literal474);
            adaptor.addChild(root_0, string_literal474_tree);

            dbg.location(438,11);
            TOKEN475=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_qlp2279); 
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
        dbg.location(438, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:441:1: rb : 'RB' TOKEN ;
    public final ChemicalChunkerParser.rb_return rb() throws RecognitionException {
        ChemicalChunkerParser.rb_return retval = new ChemicalChunkerParser.rb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal476=null;
        Token TOKEN477=null;

        Object string_literal476_tree=null;
        Object TOKEN477_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(441, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:441:3: ( 'RB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:441:4: 'RB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(441,4);
            string_literal476=(Token)match(input,162,FOLLOW_162_in_rb2286); 
            string_literal476_tree = (Object)adaptor.create(string_literal476);
            adaptor.addChild(root_0, string_literal476_tree);

            dbg.location(441,9);
            TOKEN477=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rb2288); 
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
        dbg.location(441, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:444:1: rbr : 'RBR' TOKEN ;
    public final ChemicalChunkerParser.rbr_return rbr() throws RecognitionException {
        ChemicalChunkerParser.rbr_return retval = new ChemicalChunkerParser.rbr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal478=null;
        Token TOKEN479=null;

        Object string_literal478_tree=null;
        Object TOKEN479_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(444, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:444:4: ( 'RBR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:444:5: 'RBR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(444,5);
            string_literal478=(Token)match(input,163,FOLLOW_163_in_rbr2295); 
            string_literal478_tree = (Object)adaptor.create(string_literal478);
            adaptor.addChild(root_0, string_literal478_tree);

            dbg.location(444,11);
            TOKEN479=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbr2297); 
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
        dbg.location(444, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:447:1: rbt : 'RBT' TOKEN ;
    public final ChemicalChunkerParser.rbt_return rbt() throws RecognitionException {
        ChemicalChunkerParser.rbt_return retval = new ChemicalChunkerParser.rbt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal480=null;
        Token TOKEN481=null;

        Object string_literal480_tree=null;
        Object TOKEN481_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(447, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:447:4: ( 'RBT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:447:5: 'RBT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(447,5);
            string_literal480=(Token)match(input,164,FOLLOW_164_in_rbt2304); 
            string_literal480_tree = (Object)adaptor.create(string_literal480);
            adaptor.addChild(root_0, string_literal480_tree);

            dbg.location(447,11);
            TOKEN481=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbt2306); 
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
        dbg.location(447, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:450:1: rn : 'RN' TOKEN ;
    public final ChemicalChunkerParser.rn_return rn() throws RecognitionException {
        ChemicalChunkerParser.rn_return retval = new ChemicalChunkerParser.rn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal482=null;
        Token TOKEN483=null;

        Object string_literal482_tree=null;
        Object TOKEN483_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(450, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:450:3: ( 'RN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:450:4: 'RN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(450,4);
            string_literal482=(Token)match(input,165,FOLLOW_165_in_rn2313); 
            string_literal482_tree = (Object)adaptor.create(string_literal482);
            adaptor.addChild(root_0, string_literal482_tree);

            dbg.location(450,9);
            TOKEN483=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rn2315); 
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
        dbg.location(450, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:453:1: rp : 'RP' TOKEN ;
    public final ChemicalChunkerParser.rp_return rp() throws RecognitionException {
        ChemicalChunkerParser.rp_return retval = new ChemicalChunkerParser.rp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal484=null;
        Token TOKEN485=null;

        Object string_literal484_tree=null;
        Object TOKEN485_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(453, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:453:3: ( 'RP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:453:4: 'RP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(453,4);
            string_literal484=(Token)match(input,166,FOLLOW_166_in_rp2322); 
            string_literal484_tree = (Object)adaptor.create(string_literal484);
            adaptor.addChild(root_0, string_literal484_tree);

            dbg.location(453,9);
            TOKEN485=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rp2324); 
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
        dbg.location(453, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rp"

    public static class sym_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sym"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:456:1: sym : 'SYM' TOKEN ;
    public final ChemicalChunkerParser.sym_return sym() throws RecognitionException {
        ChemicalChunkerParser.sym_return retval = new ChemicalChunkerParser.sym_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal486=null;
        Token TOKEN487=null;

        Object string_literal486_tree=null;
        Object TOKEN487_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "sym");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(456, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:456:5: ( 'SYM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:456:7: 'SYM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(456,7);
            string_literal486=(Token)match(input,167,FOLLOW_167_in_sym2333); 
            string_literal486_tree = (Object)adaptor.create(string_literal486);
            adaptor.addChild(root_0, string_literal486_tree);

            dbg.location(456,13);
            TOKEN487=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_sym2335); 
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
        dbg.location(456, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sym");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "sym"

    public static class to_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "to"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:459:1: to : 'TO' TOKEN ;
    public final ChemicalChunkerParser.to_return to() throws RecognitionException {
        ChemicalChunkerParser.to_return retval = new ChemicalChunkerParser.to_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal488=null;
        Token TOKEN489=null;

        Object string_literal488_tree=null;
        Object TOKEN489_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "to");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(459, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:459:3: ( 'TO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:459:4: 'TO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(459,4);
            string_literal488=(Token)match(input,168,FOLLOW_168_in_to2342); 
            string_literal488_tree = (Object)adaptor.create(string_literal488);
            adaptor.addChild(root_0, string_literal488_tree);

            dbg.location(459,9);
            TOKEN489=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_to2344); 
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
        dbg.location(459, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:462:1: uh : 'UH' TOKEN ;
    public final ChemicalChunkerParser.uh_return uh() throws RecognitionException {
        ChemicalChunkerParser.uh_return retval = new ChemicalChunkerParser.uh_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal490=null;
        Token TOKEN491=null;

        Object string_literal490_tree=null;
        Object TOKEN491_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "uh");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(462, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:462:3: ( 'UH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:462:4: 'UH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(462,4);
            string_literal490=(Token)match(input,169,FOLLOW_169_in_uh2351); 
            string_literal490_tree = (Object)adaptor.create(string_literal490);
            adaptor.addChild(root_0, string_literal490_tree);

            dbg.location(462,9);
            TOKEN491=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_uh2353); 
            TOKEN491_tree = (Object)adaptor.create(TOKEN491);
            adaptor.addChild(root_0, TOKEN491_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(462, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:465:1: vb : 'VB' TOKEN ;
    public final ChemicalChunkerParser.vb_return vb() throws RecognitionException {
        ChemicalChunkerParser.vb_return retval = new ChemicalChunkerParser.vb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal492=null;
        Token TOKEN493=null;

        Object string_literal492_tree=null;
        Object TOKEN493_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(465, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:465:3: ( 'VB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:465:4: 'VB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(465,4);
            string_literal492=(Token)match(input,170,FOLLOW_170_in_vb2360); 
            string_literal492_tree = (Object)adaptor.create(string_literal492);
            adaptor.addChild(root_0, string_literal492_tree);

            dbg.location(465,9);
            TOKEN493=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vb2362); 
            TOKEN493_tree = (Object)adaptor.create(TOKEN493);
            adaptor.addChild(root_0, TOKEN493_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(465, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:468:1: vbd : 'VBD' TOKEN ;
    public final ChemicalChunkerParser.vbd_return vbd() throws RecognitionException {
        ChemicalChunkerParser.vbd_return retval = new ChemicalChunkerParser.vbd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal494=null;
        Token TOKEN495=null;

        Object string_literal494_tree=null;
        Object TOKEN495_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(468, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:468:4: ( 'VBD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:468:5: 'VBD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(468,5);
            string_literal494=(Token)match(input,171,FOLLOW_171_in_vbd2369); 
            string_literal494_tree = (Object)adaptor.create(string_literal494);
            adaptor.addChild(root_0, string_literal494_tree);

            dbg.location(468,11);
            TOKEN495=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbd2371); 
            TOKEN495_tree = (Object)adaptor.create(TOKEN495);
            adaptor.addChild(root_0, TOKEN495_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:471:1: vbg : 'VBG' TOKEN ;
    public final ChemicalChunkerParser.vbg_return vbg() throws RecognitionException {
        ChemicalChunkerParser.vbg_return retval = new ChemicalChunkerParser.vbg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal496=null;
        Token TOKEN497=null;

        Object string_literal496_tree=null;
        Object TOKEN497_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(471, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:471:4: ( 'VBG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:471:5: 'VBG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(471,5);
            string_literal496=(Token)match(input,172,FOLLOW_172_in_vbg2378); 
            string_literal496_tree = (Object)adaptor.create(string_literal496);
            adaptor.addChild(root_0, string_literal496_tree);

            dbg.location(471,11);
            TOKEN497=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbg2380); 
            TOKEN497_tree = (Object)adaptor.create(TOKEN497);
            adaptor.addChild(root_0, TOKEN497_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(471, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:474:1: vbn : 'VBN' TOKEN ;
    public final ChemicalChunkerParser.vbn_return vbn() throws RecognitionException {
        ChemicalChunkerParser.vbn_return retval = new ChemicalChunkerParser.vbn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal498=null;
        Token TOKEN499=null;

        Object string_literal498_tree=null;
        Object TOKEN499_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(474, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:474:4: ( 'VBN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:474:5: 'VBN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(474,5);
            string_literal498=(Token)match(input,173,FOLLOW_173_in_vbn2387); 
            string_literal498_tree = (Object)adaptor.create(string_literal498);
            adaptor.addChild(root_0, string_literal498_tree);

            dbg.location(474,11);
            TOKEN499=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbn2389); 
            TOKEN499_tree = (Object)adaptor.create(TOKEN499);
            adaptor.addChild(root_0, TOKEN499_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(474, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:477:1: vbz : 'VBZ' TOKEN ;
    public final ChemicalChunkerParser.vbz_return vbz() throws RecognitionException {
        ChemicalChunkerParser.vbz_return retval = new ChemicalChunkerParser.vbz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal500=null;
        Token TOKEN501=null;

        Object string_literal500_tree=null;
        Object TOKEN501_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(477, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:477:4: ( 'VBZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:477:5: 'VBZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(477,5);
            string_literal500=(Token)match(input,174,FOLLOW_174_in_vbz2396); 
            string_literal500_tree = (Object)adaptor.create(string_literal500);
            adaptor.addChild(root_0, string_literal500_tree);

            dbg.location(477,11);
            TOKEN501=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbz2398); 
            TOKEN501_tree = (Object)adaptor.create(TOKEN501);
            adaptor.addChild(root_0, TOKEN501_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(477, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:480:1: wdt : 'WDT' TOKEN ;
    public final ChemicalChunkerParser.wdt_return wdt() throws RecognitionException {
        ChemicalChunkerParser.wdt_return retval = new ChemicalChunkerParser.wdt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal502=null;
        Token TOKEN503=null;

        Object string_literal502_tree=null;
        Object TOKEN503_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wdt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(480, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:480:4: ( 'WDT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:480:5: 'WDT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(480,5);
            string_literal502=(Token)match(input,175,FOLLOW_175_in_wdt2405); 
            string_literal502_tree = (Object)adaptor.create(string_literal502);
            adaptor.addChild(root_0, string_literal502_tree);

            dbg.location(480,11);
            TOKEN503=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wdt2407); 
            TOKEN503_tree = (Object)adaptor.create(TOKEN503);
            adaptor.addChild(root_0, TOKEN503_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(480, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:483:1: wp_poss : 'WP$' TOKEN ;
    public final ChemicalChunkerParser.wp_poss_return wp_poss() throws RecognitionException {
        ChemicalChunkerParser.wp_poss_return retval = new ChemicalChunkerParser.wp_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal504=null;
        Token TOKEN505=null;

        Object string_literal504_tree=null;
        Object TOKEN505_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wp_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(483, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:483:8: ( 'WP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:483:9: 'WP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(483,9);
            string_literal504=(Token)match(input,176,FOLLOW_176_in_wp_poss2414); 
            string_literal504_tree = (Object)adaptor.create(string_literal504);
            adaptor.addChild(root_0, string_literal504_tree);

            dbg.location(483,15);
            TOKEN505=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wp_poss2416); 
            TOKEN505_tree = (Object)adaptor.create(TOKEN505);
            adaptor.addChild(root_0, TOKEN505_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(483, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:486:1: wpo : 'WPO' TOKEN ;
    public final ChemicalChunkerParser.wpo_return wpo() throws RecognitionException {
        ChemicalChunkerParser.wpo_return retval = new ChemicalChunkerParser.wpo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal506=null;
        Token TOKEN507=null;

        Object string_literal506_tree=null;
        Object TOKEN507_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wpo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(486, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:486:4: ( 'WPO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:486:5: 'WPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(486,5);
            string_literal506=(Token)match(input,177,FOLLOW_177_in_wpo2423); 
            string_literal506_tree = (Object)adaptor.create(string_literal506);
            adaptor.addChild(root_0, string_literal506_tree);

            dbg.location(486,11);
            TOKEN507=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wpo2425); 
            TOKEN507_tree = (Object)adaptor.create(TOKEN507);
            adaptor.addChild(root_0, TOKEN507_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(486, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:489:1: wps : 'WPS' TOKEN ;
    public final ChemicalChunkerParser.wps_return wps() throws RecognitionException {
        ChemicalChunkerParser.wps_return retval = new ChemicalChunkerParser.wps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal508=null;
        Token TOKEN509=null;

        Object string_literal508_tree=null;
        Object TOKEN509_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(489, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:489:4: ( 'WPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:489:5: 'WPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(489,5);
            string_literal508=(Token)match(input,178,FOLLOW_178_in_wps2432); 
            string_literal508_tree = (Object)adaptor.create(string_literal508);
            adaptor.addChild(root_0, string_literal508_tree);

            dbg.location(489,11);
            TOKEN509=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wps2434); 
            TOKEN509_tree = (Object)adaptor.create(TOKEN509);
            adaptor.addChild(root_0, TOKEN509_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(489, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:492:1: wql : 'WQL' TOKEN ;
    public final ChemicalChunkerParser.wql_return wql() throws RecognitionException {
        ChemicalChunkerParser.wql_return retval = new ChemicalChunkerParser.wql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal510=null;
        Token TOKEN511=null;

        Object string_literal510_tree=null;
        Object TOKEN511_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(492, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:492:4: ( 'WQL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:492:5: 'WQL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(492,5);
            string_literal510=(Token)match(input,179,FOLLOW_179_in_wql2441); 
            string_literal510_tree = (Object)adaptor.create(string_literal510);
            adaptor.addChild(root_0, string_literal510_tree);

            dbg.location(492,11);
            TOKEN511=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wql2443); 
            TOKEN511_tree = (Object)adaptor.create(TOKEN511);
            adaptor.addChild(root_0, TOKEN511_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(492, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:495:1: wrb : 'WRB' TOKEN ;
    public final ChemicalChunkerParser.wrb_return wrb() throws RecognitionException {
        ChemicalChunkerParser.wrb_return retval = new ChemicalChunkerParser.wrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal512=null;
        Token TOKEN513=null;

        Object string_literal512_tree=null;
        Object TOKEN513_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(495, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:495:4: ( 'WRB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:495:5: 'WRB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(495,5);
            string_literal512=(Token)match(input,180,FOLLOW_180_in_wrb2450); 
            string_literal512_tree = (Object)adaptor.create(string_literal512);
            adaptor.addChild(root_0, string_literal512_tree);

            dbg.location(495,11);
            TOKEN513=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wrb2452); 
            TOKEN513_tree = (Object)adaptor.create(TOKEN513);
            adaptor.addChild(root_0, TOKEN513_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(495, 16);

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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA2_eotS =
        "\110\uffff";
    static final String DFA2_eofS =
        "\1\1\107\uffff";
    static final String DFA2_minS =
        "\1\12\107\uffff";
    static final String DFA2_maxS =
        "\1\u00b2\107\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\3\42\1\44\2";
    static final String DFA2_specialS =
        "\110\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\11\1\7\1\42\22\uffff\1\13\1\14\2\uffff\1\15\1\16\1\uffff"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
            "\1\12\1\50\1\51\1\52\1\53\1\uffff\1\43\1\54\1\55\1\56\1\57\1"+
            "\60\1\61\1\62\1\63\1\33\1\64\1\34\1\65\1\66\1\67\1\70\1\uffff"+
            "\1\71\1\uffff\1\72\1\uffff\1\73\1\74\1\75\1\76\1\uffff\1\77"+
            "\1\uffff\1\100\1\101\1\102\1\uffff\1\103\1\104\1\41\1\105\1"+
            "\106\1\107\1\uffff\1\1\3\uffff\1\1\22\uffff\1\1\1\10\4\uffff"+
            "\1\2\12\uffff\1\3\1\4\1\5\1\6\27\uffff\1\44\1\45\1\46\6\uffff"+
            "\1\47\3\uffff\1\35\1\36\1\37\1\40",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()+ loopback of 32:4: ( nounphrase | verbphrase )+";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA6_eotS =
        "\36\uffff";
    static final String DFA6_eofS =
        "\1\1\35\uffff";
    static final String DFA6_minS =
        "\1\12\35\uffff";
    static final String DFA6_maxS =
        "\1\u00b2\35\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\2\34\1";
    static final String DFA6_specialS =
        "\36\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\3\1\1\1\34\2\uffff\20\1\1\5\1\6\2\uffff\1\7\1\10\1\uffff"+
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
            "\1\4\4\1\1\uffff\1\35\10\1\1\25\1\1\1\26\4\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\33\3"+
            "\1\1\uffff\1\1\3\uffff\1\1\22\uffff\1\1\1\2\4\uffff\1\1\11\uffff"+
            "\5\1\27\uffff\3\1\6\uffff\1\1\3\uffff\1\27\1\30\1\31\1\32",
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()+ loopback of 37:12: ( noun )+";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA7_eotS =
        "\112\uffff";
    static final String DFA7_eofS =
        "\1\1\2\uffff\1\1\106\uffff";
    static final String DFA7_minS =
        "\1\12\1\uffff\1\11\1\12\34\11\1\41\33\uffff\4\11\4\30\1\11\1\12"+
        "\2\11\2\uffff";
    static final String DFA7_maxS =
        "\1\u00b2\1\uffff\1\11\1\u00b2\34\11\1\144\33\uffff\4\11\4\30\1\11"+
        "\1\62\2\11\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\2\37\uffff\33\1\14\uffff\2\1";
    static final String DFA7_specialS =
        "\112\uffff}>";
    static final String[] DFA7_transitionS = {
            "\3\1\2\uffff\22\1\2\uffff\2\1\1\uffff\21\1\1\uffff\20\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\6\1\1\uffff\1\2\3\uffff\1\1\22\uffff\2\1\4\uffff\1\1\11\uffff"+
            "\5\1\27\uffff\3\1\6\uffff\1\1\3\uffff\4\1",
            "",
            "\1\3",
            "\1\5\1\1\1\36\22\uffff\1\7\1\10\2\uffff\1\11\1\12\1\uffff\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\6\4\1\1\uffff\1\37\10\1\1\27\1\1\1\30\4\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\35\3"+
            "\1\1\uffff\1\1\3\uffff\1\1\22\uffff\1\1\1\4\4\uffff\1\1\12\uffff"+
            "\4\1\27\uffff\3\1\6\uffff\1\1\3\uffff\1\31\1\32\1\33\1\34",
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
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\75\1\77\2\uffff\1\76\76\uffff\1\74",
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
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\105",
            "\1\106\47\uffff\1\107",
            "\1\110",
            "\1\111",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 37:18: ( comma noun )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA8_eotS =
        "\112\uffff";
    static final String DFA8_eofS =
        "\1\1\2\uffff\1\1\106\uffff";
    static final String DFA8_minS =
        "\1\12\1\uffff\1\11\1\12\34\11\1\41\33\uffff\4\11\4\30\1\11\1\12"+
        "\2\11\2\uffff";
    static final String DFA8_maxS =
        "\1\u00b2\1\uffff\1\11\1\u00b2\34\11\1\144\33\uffff\4\11\4\30\1\11"+
        "\1\62\2\11\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\37\uffff\33\1\14\uffff\2\1";
    static final String DFA8_specialS =
        "\112\uffff}>";
    static final String[] DFA8_transitionS = {
            "\3\1\2\uffff\22\1\2\uffff\2\1\1\uffff\21\1\1\uffff\20\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\6\1\1\uffff\1\1\3\uffff\1\1\22\uffff\1\2\1\1\4\uffff\1\1\11"+
            "\uffff\5\1\27\uffff\3\1\6\uffff\1\1\3\uffff\4\1",
            "",
            "\1\3",
            "\1\5\1\1\1\36\22\uffff\1\7\1\10\2\uffff\1\11\1\12\1\uffff\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\6\4\1\1\uffff\1\37\10\1\1\27\1\1\1\30\4\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\35\3"+
            "\1\1\uffff\1\1\3\uffff\1\1\22\uffff\1\1\1\4\4\uffff\1\1\12\uffff"+
            "\4\1\27\uffff\3\1\6\uffff\1\1\3\uffff\1\31\1\32\1\33\1\34",
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
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\75\1\77\2\uffff\1\76\76\uffff\1\74",
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
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\104",
            "\1\105",
            "\1\107\47\uffff\1\106",
            "\1\110",
            "\1\111",
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
            return "()* loopback of 37:32: ( cc noun )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA17_eotS =
        "\50\uffff";
    static final String DFA17_eofS =
        "\50\uffff";
    static final String DFA17_minS =
        "\1\12\1\11\33\uffff\1\41\4\11\4\30\1\11\1\12";
    static final String DFA17_maxS =
        "\1\u00b2\1\11\33\uffff\1\144\4\11\4\30\1\11\1\62";
    static final String DFA17_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\13\uffff";
    static final String DFA17_specialS =
        "\50\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\1\33\22\uffff\1\4\1\5\2\uffff\1\6\1\7\1\uffff\1"+
            "\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1"+
            "\3\5\uffff\1\34\10\uffff\1\24\1\uffff\1\25\26\uffff\1\32\34"+
            "\uffff\1\1\67\uffff\1\26\1\27\1\30\1\31",
            "\1\35",
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
            "\1\41\1\36\2\uffff\1\40\76\uffff\1\37",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\47",
            "\1\2\47\uffff\1\3"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "48:1: noun : ( unnamedmolecule | molecule | nnstate | nntime | nnatmosphere | nneq | nnchementity | nntemp | nnflash | nngeneral | nnmethod | nnamount | nnpressure | nncolumn | nnchromatography | nnvacuum | nncycle | nntimes | nnapparatus | nnconcentrate | wdt | wp_poss | wpo | wps | nnsynthesize | oscaront | nnmixture );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA20_eotS =
        "\62\uffff";
    static final String DFA20_eofS =
        "\62\uffff";
    static final String DFA20_minS =
        "\1\17\24\11\21\12\2\167\1\40\3\11\3\uffff\2\12\1\40";
    static final String DFA20_maxS =
        "\1\u0087\24\11\21\u00b2\1\u0087\1\167\1\47\3\11\3\uffff\2\u00b2"+
        "\1\144";
    static final String DFA20_acceptS =
        "\54\uffff\1\1\1\3\1\2\3\uffff";
    static final String DFA20_specialS =
        "\62\uffff}>";
    static final String[] DFA20_transitionS = {
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
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\4\uffff"+
            "\1\51\12\uffff\1\52\3\54\44\uffff\4\54",
            "\1\24\17\uffff\1\23",
            "\1\24",
            "\1\55\6\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\17\uffff"+
            "\1\52\3\54\44\uffff\4\54",
            "\3\54\22\uffff\2\54\2\uffff\2\54\1\uffff\15\54\5\uffff\1\54"+
            "\10\uffff\1\54\1\uffff\1\54\26\uffff\1\54\34\uffff\1\53\17\uffff"+
            "\4\54\44\uffff\4\54",
            "\1\55\2\54\2\uffff\1\54\1\uffff\1\56\74\uffff\1\54"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "58:1: prepphrase : ( prepphraseOther | prepphraseTemp | prepphraseTime );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_sentence_in_document151 = new BitSet(new long[]{0xFF7FFFD980001C02L,0x108000003F75EAFFL,0x0007881C00000780L});
    public static final BitSet FOLLOW_nounphrase_in_sentence176 = new BitSet(new long[]{0xFF7FFFD980001C02L,0x10C00008BF75EAFFL,0x0007881C00000780L});
    public static final BitSet FOLLOW_verbphrase_in_sentence178 = new BitSet(new long[]{0xFF7FFFD980001C02L,0x10C00008BF75EAFFL,0x0007881C00000780L});
    public static final BitSet FOLLOW_comma_in_sentence183 = new BitSet(new long[]{0x0000000000000002L,0x0040000880000000L});
    public static final BitSet FOLLOW_cc_in_sentence185 = new BitSet(new long[]{0x0000000000000002L,0x0040000880000000L});
    public static final BitSet FOLLOW_stop_in_sentence187 = new BitSet(new long[]{0x0000000000000002L,0x0040000880000000L});
    public static final BitSet FOLLOW_dt_in_nounphrase223 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_adj_in_nounphrase226 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_noun_in_nounphrase229 = new BitSet(new long[]{0x0107FFD981041C02L,0x10C000008400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_comma_in_nounphrase233 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_noun_in_nounphrase235 = new BitSet(new long[]{0x0000000001040002L,0x0040000080000000L});
    public static final BitSet FOLLOW_cc_in_nounphrase240 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_noun_in_nounphrase242 = new BitSet(new long[]{0x0000000001040002L,0x0040000000000000L});
    public static final BitSet FOLLOW_prepphraseOf_in_nounphrase246 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_prepphraseIN_in_nounphrase249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adv_in_verbphrase263 = new BitSet(new long[]{0xFF7FFFD9FFFF9C00L,0x108000003F75EAFFL,0x0007881C000007C0L});
    public static final BitSet FOLLOW_vbd_in_verbphrase266 = new BitSet(new long[]{0xFF7FFFD9FFFF9C00L,0x108000003F75EAFFL,0x0007881C000007C0L});
    public static final BitSet FOLLOW_verb_in_verbphrase269 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x0000001C000000C0L});
    public static final BitSet FOLLOW_adv_in_verbphrase271 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x0000001C000000C0L});
    public static final BitSet FOLLOW_prepphrase_in_verbphrase274 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_vbuse_in_verb285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbchange_in_verb287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsubmerge_in_verb289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsubject_in_verb291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbadd_in_verb293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcharge_in_verb295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcontain_in_verb297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdrop_in_verb299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbfill_in_verb301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsuspend_in_verb303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbtreat_in_verb305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbapparatus_in_verb307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbconcentrate_in_verb309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcool_in_verb311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdegass_in_verb313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdissolve_in_verb315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdry_in_verb317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbextract_in_verb319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbfilter_in_verb321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbheat_in_verb325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbincrease_in_verb327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbpartition_in_verb329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbprecipitate_in_verb331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbpurify_in_verb333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbquench_in_verb335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbrecover_in_verb337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbremove_in_verb339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbstir_in_verb341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsynthesize_in_verb343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbwait_in_verb345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbwash_in_verb347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbyield_in_verb349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_number368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcd_in_number370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmolecule_in_noun379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecule_in_noun381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnstate_in_noun383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntime_in_noun385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnatmosphere_in_noun387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nneq_in_noun389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnchementity_in_noun391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntemp_in_noun393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnflash_in_noun395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nngeneral_in_noun397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnmethod_in_noun399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnamount_in_noun401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnpressure_in_noun403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nncolumn_in_noun405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnchromatography_in_noun407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnvacuum_in_noun409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nncycle_in_noun411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntimes_in_noun413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnapparatus_in_noun415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnconcentrate_in_noun418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wdt_in_noun420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wp_poss_in_noun422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wpo_in_noun424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wps_in_noun426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnsynthesize_in_noun428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscaront_in_noun430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnmixture_in_noun432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lrb_in_mixture440 = new BitSet(new long[]{0x0004000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarCompound_in_mixture442 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_dash_in_mixture444 = new BitSet(new long[]{0x0004000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarCompound_in_mixture446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_sym_in_mixture448 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_cd_in_mixture450 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rrb_in_mixture452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jj_in_adj462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjr_in_adj464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjs_in_adj466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjt_in_adj468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcj_in_adj470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rb_in_adv478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rbr_in_adv480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rbt_in_adv482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseOther_in_prepphrase493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTemp_in_prepphrase495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTime_in_prepphrase497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseOther509 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_nounphrase_in_prepphraseOther512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inof_in_prepphraseOf535 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_nounphrase_in_prepphraseOf538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inin_in_prepphraseIN562 = new BitSet(new long[]{0x0004000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_molecule_in_prepphraseIN564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseTime588 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_dt_in_prepphraseTime591 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_jj_in_prepphraseTime594 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_cd_in_prepphraseTime597 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_nntime_in_prepphraseTime599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseTemp629 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_dt_in_prepphraseTemp632 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_jj_in_prepphraseTemp635 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_cd_in_prepphraseTemp638 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_nntemp_in_prepphraseTemp640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_in_inAll673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inafter_in_inAll675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inas_in_inAll677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inbefore_in_inAll679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inby_in_inAll681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infor_in_inAll683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infrom_in_inAll685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inin_in_inAll687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ininto_in_inAll689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inof_in_inAll691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inoff_in_inAll693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inon_in_inAll695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inover_in_inAll697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inunder_in_inAll699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invia_in_inAll701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inwith_in_inAll703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inwithout_in_inAll705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_mmol719 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_nnmol_in_mmol721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_gram742 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_nngram_in_gram744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_percent765 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_nnpercent_in_percent767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_volume788 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_nnvol_in_volume790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mmol_in_measurements812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gram_in_measurements814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percent_in_measurements816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_measurements818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcm_in_oscarCompound827 = new BitSet(new long[]{0x0004000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_measurements_in_moleculeamount1848 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_inof_in_moleculeamount1850 = new BitSet(new long[]{0x0004000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarCompound_in_moleculeamount1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarCompound_in_moleculeamount2860 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_amount_in_moleculeamount2862 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_moleculeamount1_in_moleculeamount872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moleculeamount2_in_moleculeamount876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moleculeamount_in_molecule897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_measurements_in_unnamedmoleculeamount1916 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_inof_in_unnamedmoleculeamount1918 = new BitSet(new long[]{0x0000000000000400L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarcd_in_unnamedmoleculeamount1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcd_in_unnamedmoleculeamount2928 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_amount_in_unnamedmoleculeamount2930 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_unnamedmoleculeamount1_in_unnamedmoleculeamount940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmoleculeamount2_in_unnamedmoleculeamount944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmoleculeamount_in_unnamedmolecule957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lrb_in_amount978 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_measurements_in_amount980 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
    public static final BitSet FOLLOW_comma_in_amount983 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_measurements_in_amount986 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
    public static final BitSet FOLLOW_rrb_in_amount991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nngeneral_in_method1028 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_nn_in_method1030 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_nnmethod_in_method1034 = new BitSet(new long[]{0x0000000000000402L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarcd_in_method1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_method1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_oscarcd1050 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcd1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_oscarcj1057 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcj1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_oscaront1065 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscaront1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_tmunicode1072 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_tmunicode1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_cdunicode1079 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cdunicode1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_inas1088 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inas1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_inbefore1095 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inbefore1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_inafter1102 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inafter1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_inin1109 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inin1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ininto1116 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ininto1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_inwith1123 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inwith1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_inwithout1130 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inwithout1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_inby1137 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inby1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_invia1144 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_invia1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_inof1151 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inof1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_inon1158 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inon1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_infor1165 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_infor1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_infrom1172 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_infrom1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_inunder1179 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inunder1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_inover1186 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inover1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_inoff1193 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inoff1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_nnstate1202 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnstate1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_nntime1209 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntime1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_nngram1216 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nngram1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_nnmol1223 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmol1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_nnatmosphere1230 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnatmosphere1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_nneq1237 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nneq1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nnvol1244 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnvol1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_nnchementity1251 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnchementity1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nntemp1258 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntemp1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_nnflash1265 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnflash1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_nngeneral1272 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nngeneral1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_nnmethod1279 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmethod1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_nnamount1286 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnamount1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_nnpressure1293 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpressure1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_nncolumn1300 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nncolumn1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_nnchromatography1307 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnchromatography1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_nnvacuum1314 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnvacuum1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_nncycle1321 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nncycle1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_nntimes1328 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntimes1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_oscarcm1337 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcm1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_vbuse1346 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbuse1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_vbchange1353 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbchange1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_vbsubmerge1360 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubmerge1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_vbsubject1367 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubject1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_nnadd1376 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnadd1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_nnmixture1383 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmixture1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_vbadd1390 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbadd1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_vbcharge1397 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcharge1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_vbcontain1404 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcontain1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_vbdrop1411 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdrop1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_vbfill1418 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbfill1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_vbsuspend1425 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsuspend1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_vbtreat1432 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbtreat1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_vbapparatus1441 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbapparatus1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_nnapparatus1448 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnapparatus1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_vbconcentrate1457 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbconcentrate1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_nnconcentrate1464 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnconcentrate1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_vbcool1473 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcool1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_vbdegass1482 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdegass1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_vbdissolve1491 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdissolve1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_vbdry1500 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdry1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_nndry1507 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nndry1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_vbextract1516 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbextract1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_nnextract1523 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnextract1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_vbfilter1532 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbfilter1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_nnfilter1539 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnfilter1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_vbheat1548 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbheat1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_vbincrease1555 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbincrease1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_vbpartition1564 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbpartition1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_vbprecipitate1573 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbprecipitate1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_nnprecipitate1580 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnprecipitate1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_vbpurify1589 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbpurify1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_nnpurify1596 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpurify1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_vbquench1605 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbquench1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_vbrecover1614 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbrecover1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_vbremove1623 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbremove1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_nnremove1630 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnremove1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_vbstir1639 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbstir1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_vbsynthesize1648 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsynthesize1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_nnsynthesize1655 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnsynthesize1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_vbwait1664 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbwait1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_vbwash1673 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbwash1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_vbyield1682 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbyield1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_colon1691 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_colon1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_comma1698 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_comma1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_apost1705 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_apost1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_neg1712 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_neg1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_dash1719 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dash1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_stop1726 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_stop1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_nnpercent1733 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpercent1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_lsqb1740 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_lsqb1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rsqb1747 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rsqb1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_lrb1754 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_lrb1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rrb1761 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rrb1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_abl1772 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abl1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_abn1781 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abn1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_abx1790 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abx1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ap1799 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ap1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_at1808 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_at1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_be1817 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_be1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_bed1826 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bed1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_bedz1835 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bedz1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_beg1844 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_beg1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_bem1853 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bem1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ben1862 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ben1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ber1871 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ber1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_bez1880 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bez1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_cc1889 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cc1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_cd1898 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cd1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_cs1907 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cs1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_dotok1917 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dotok1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_dod1926 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dod1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_doz1935 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_doz1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_dt1944 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dt1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_dti1953 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dti1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_dts1962 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dts1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_dtx1971 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dtx1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ex1980 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ex1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fw1989 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_fw1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_hv1998 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hv2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_hvd2007 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvd2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_hvg2016 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvg2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_hvn2025 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvn2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_in2034 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_in2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_jj2043 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jj2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_jjr2052 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjr2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_jjs2061 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjs2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_jjt2070 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjt2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_md2079 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_md2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_nc2088 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nc2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_nn2097 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nn2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_nn_poss2106 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nn_poss2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_nns2115 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nns2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_nns_poss2124 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nns_poss2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_np2133 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_np2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_np_poss2142 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_np_poss2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_nps2151 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nps2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_nps_poss2160 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nps_poss2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_nr2169 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nr2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_od2178 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_od2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_pn2187 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pn2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_pn_poss2196 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pn_poss2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_pp_poss2205 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pp_poss2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_pp_poss_poss2214 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pp_poss_poss2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ppl2223 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppl2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ppls2232 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppls2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ppo2241 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppo2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_pps2250 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pps2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ppss2259 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppss2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ql2268 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ql2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_qlp2277 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_qlp2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_rb2286 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rb2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_rbr2295 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rbr2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_rbt2304 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rbt2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_rn2313 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rn2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_rp2322 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rp2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_sym2333 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_sym2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_to2342 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_to2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_uh2351 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_uh2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_vb2360 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vb2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_vbd2369 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbd2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_vbg2378 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbg2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_vbn2387 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbn2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_vbz2396 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbz2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_wdt2405 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wdt2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_wp_poss2414 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wp_poss2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_wpo2423 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wpo2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_wps2432 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wps2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_wql2441 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wql2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_wrb2450 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wrb2452 = new BitSet(new long[]{0x0000000000000002L});

}