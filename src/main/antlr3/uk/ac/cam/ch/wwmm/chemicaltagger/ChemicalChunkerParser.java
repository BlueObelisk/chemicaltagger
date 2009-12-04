// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g 2009-12-04 09:59:02

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
        "invalidRule", "inbefore", "ap", "infrom", "jjr", "vbsubject", "oscarCM", 
        "jjs", "vbd", "volume", "nns", "adj", "pn", "nncycle", "inon", "inas", 
        "hvg", "moleculeamount1", "rn", "nnatmosphere", "oscarcd", "nnremove", 
        "vbsuspend", "inoff", "cdunicode", "cc", "prepphraseIN", "nnfilter", 
        "nr", "number", "nnvol", "ben", "qlp", "tmunicode", "vbwait", "prepphraseOf", 
        "vbrecover", "vbz", "inin", "ininto", "percent", "inwith", "jj", 
        "rrb", "vbg", "nnmixture", "inafter", "apost", "nnchromatography", 
        "dti", "nnmol", "oscarcj", "pps", "nncolumn", "hv", "method", "pp_poss", 
        "od", "fw", "molecule", "inby", "vbremove", "vb", "sentence", "wrb", 
        "inwithout", "wps", "vbadd", "nounphrase", "uh", "prepphraseTime", 
        "comma", "colon", "vbconcentrate", "nnchementity", "nnpercent", 
        "nnsynthesize", "nngeneral", "vbsubmerge", "prepphraseTemp", "vbcool", 
        "moleculeamount", "wql", "bed", "np_poss", "mmol", "nnamount", "adv", 
        "nps_poss", "document", "ppss", "inAll", "inunder", "vbyield", "dtx", 
        "rsqb", "nns_poss", "bez", "pn_poss", "oscarcm", "nnflash", "nc", 
        "np", "nngram", "inof", "vbcharge", "vbpartition", "vbdrop", "to", 
        "in", "vbdegass", "vbfilter", "nntimes", "vbprecipitate", "prepphrase", 
        "verbphrase", "vbtreat", "nnvacuum", "vbapparatus", "hvn", "nnconcentrate", 
        "vbcontain", "hvd", "nntemp", "noun", "oscaront", "nneq", "vbn", 
        "inover", "dod", "beg", "at", "ber", "vbsynthesize", "abx", "rbt", 
        "unnamedmolecule", "nnpressure", "moleculeamount2", "gram", "rbr", 
        "nndry", "nnprecipitate", "vbuse", "abn", "dash", "dts", "nnapparatus", 
        "verb", "measurements", "vbincrease", "vbstir", "vbfill", "ppo", 
        "nnmethod", "vbextract", "neg", "vbquench", "stop", "infor", "bedz", 
        "unnamedmoleculeamount", "nps", "vbdry", "nnadd", "nnpurify", "unnamedmoleculeamount2", 
        "vbheat", "rb", "pp_poss_poss", "jjt", "ppls", "nntime", "wp_poss", 
        "nnstate", "invia", "unnamedmoleculeamount1", "doz", "cs", "wpo", 
        "ppl", "ex", "rp", "vbchange", "ql", "nn", "lsqb", "amount", "nnextract", 
        "bem", "md", "nn_poss", "vbdissolve", "cd", "vbpurify", "dotok", 
        "prepphraseOther", "wdt", "lrb", "abl", "be", "vbwash", "dt"
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

                if ( ((LA1_0>=10 && LA1_0<=12)||(LA1_0>=31 && LA1_0<=32)||(LA1_0>=35 && LA1_0<=36)||(LA1_0>=38 && LA1_0<=54)||(LA1_0>=56 && LA1_0<=71)||LA1_0==73||LA1_0==75||(LA1_0>=77 && LA1_0<=80)||LA1_0==82||(LA1_0>=84 && LA1_0<=86)||(LA1_0>=88 && LA1_0<=93)||LA1_0==119||LA1_0==124||(LA1_0>=135 && LA1_0<=138)||(LA1_0>=162 && LA1_0<=164)||LA1_0==170||(LA1_0>=174 && LA1_0<=177)) ) {
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
            	    pushFollow(FOLLOW_nounphrase_in_sentence174);
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
            	    pushFollow(FOLLOW_verbphrase_in_sentence176);
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
            	    pushFollow(FOLLOW_comma_in_sentence181);
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
            	    pushFollow(FOLLOW_cc_in_sentence183);
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
            	    pushFollow(FOLLOW_stop_in_sentence185);
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
                    pushFollow(FOLLOW_dt_in_nounphrase221);
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
            	    pushFollow(FOLLOW_adj_in_nounphrase224);
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
            	    pushFollow(FOLLOW_noun_in_nounphrase227);
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
            	    pushFollow(FOLLOW_comma_in_nounphrase231);
            	    comma10=comma();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comma10.getTree());
            	    dbg.location(37,25);
            	    pushFollow(FOLLOW_noun_in_nounphrase233);
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
            	    pushFollow(FOLLOW_cc_in_nounphrase238);
            	    cc12=cc();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cc12.getTree());
            	    dbg.location(37,36);
            	    pushFollow(FOLLOW_noun_in_nounphrase240);
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
            	    pushFollow(FOLLOW_prepphraseOf_in_nounphrase244);
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
                    pushFollow(FOLLOW_prepphraseIN_in_nounphrase247);
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
            	    pushFollow(FOLLOW_adv_in_verbphrase261);
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

                if ( (LA12_0==170) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:40:9: vbd
            	    {
            	    dbg.location(40,9);
            	    pushFollow(FOLLOW_vbd_in_verbphrase264);
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
            pushFollow(FOLLOW_verb_in_verbphrase267);
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
            	    pushFollow(FOLLOW_adv_in_verbphrase269);
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
            	    pushFollow(FOLLOW_prepphrase_in_verbphrase272);
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
                    pushFollow(FOLLOW_vbuse_in_verb283);
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
                    pushFollow(FOLLOW_vbchange_in_verb285);
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
                    pushFollow(FOLLOW_vbsubmerge_in_verb287);
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
                    pushFollow(FOLLOW_vbsubject_in_verb289);
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
                    pushFollow(FOLLOW_vbadd_in_verb291);
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
                    pushFollow(FOLLOW_vbcharge_in_verb293);
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
                    pushFollow(FOLLOW_vbcontain_in_verb295);
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
                    pushFollow(FOLLOW_vbdrop_in_verb297);
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
                    pushFollow(FOLLOW_vbfill_in_verb299);
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
                    pushFollow(FOLLOW_vbsuspend_in_verb301);
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
                    pushFollow(FOLLOW_vbtreat_in_verb303);
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
                    pushFollow(FOLLOW_vbapparatus_in_verb305);
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
                    pushFollow(FOLLOW_vbconcentrate_in_verb307);
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
                    pushFollow(FOLLOW_vbcool_in_verb309);
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
                    pushFollow(FOLLOW_vbdegass_in_verb311);
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
                    pushFollow(FOLLOW_vbdissolve_in_verb313);
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
                    pushFollow(FOLLOW_vbdry_in_verb315);
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
                    pushFollow(FOLLOW_vbextract_in_verb317);
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
                    pushFollow(FOLLOW_vbfilter_in_verb319);
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
                    pushFollow(FOLLOW_vbheat_in_verb323);
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
                    pushFollow(FOLLOW_vbincrease_in_verb325);
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
                    pushFollow(FOLLOW_vbpartition_in_verb327);
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
                    pushFollow(FOLLOW_vbprecipitate_in_verb329);
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
                    pushFollow(FOLLOW_vbpurify_in_verb331);
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
                    pushFollow(FOLLOW_vbquench_in_verb333);
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
                    pushFollow(FOLLOW_vbrecover_in_verb335);
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
                    pushFollow(FOLLOW_vbremove_in_verb337);
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
                    pushFollow(FOLLOW_vbstir_in_verb339);
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
                    pushFollow(FOLLOW_vbsynthesize_in_verb341);
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
                    pushFollow(FOLLOW_vbwait_in_verb343);
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
                    pushFollow(FOLLOW_vbwash_in_verb345);
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
                    pushFollow(FOLLOW_vbyield_in_verb347);
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
                    pushFollow(FOLLOW_cd_in_number366);
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
                    pushFollow(FOLLOW_oscarcd_in_number368);
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
                    pushFollow(FOLLOW_unnamedmolecule_in_noun377);
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
                    pushFollow(FOLLOW_molecule_in_noun379);
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
                    pushFollow(FOLLOW_nnstate_in_noun381);
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
                    pushFollow(FOLLOW_nntime_in_noun383);
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
                    pushFollow(FOLLOW_nnatmosphere_in_noun385);
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
                    pushFollow(FOLLOW_nneq_in_noun387);
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
                    pushFollow(FOLLOW_nnchementity_in_noun389);
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
                    pushFollow(FOLLOW_nntemp_in_noun391);
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
                    pushFollow(FOLLOW_nnflash_in_noun393);
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
                    pushFollow(FOLLOW_nngeneral_in_noun395);
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
                    pushFollow(FOLLOW_nnmethod_in_noun397);
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
                    pushFollow(FOLLOW_nnamount_in_noun399);
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
                    pushFollow(FOLLOW_nnpressure_in_noun401);
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
                    pushFollow(FOLLOW_nncolumn_in_noun403);
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
                    pushFollow(FOLLOW_nnchromatography_in_noun405);
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
                    pushFollow(FOLLOW_nnvacuum_in_noun407);
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
                    pushFollow(FOLLOW_nncycle_in_noun409);
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
                    pushFollow(FOLLOW_nntimes_in_noun411);
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
                    pushFollow(FOLLOW_nnapparatus_in_noun413);
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
                    pushFollow(FOLLOW_nnconcentrate_in_noun416);
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
                    pushFollow(FOLLOW_wdt_in_noun418);
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
                    pushFollow(FOLLOW_wp_poss_in_noun420);
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
                    pushFollow(FOLLOW_wpo_in_noun422);
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
                    pushFollow(FOLLOW_wps_in_noun424);
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
                    pushFollow(FOLLOW_nnsynthesize_in_noun426);
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
                    pushFollow(FOLLOW_oscaront_in_noun428);
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
                    pushFollow(FOLLOW_nnmixture_in_noun430);
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

    public static class adj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "adj"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:1: adj : ( jj | jjr | jjs | jjt | oscarcj );
    public final ChemicalChunkerParser.adj_return adj() throws RecognitionException {
        ChemicalChunkerParser.adj_return retval = new ChemicalChunkerParser.adj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.jj_return jj82 = null;

        ChemicalChunkerParser.jjr_return jjr83 = null;

        ChemicalChunkerParser.jjs_return jjs84 = null;

        ChemicalChunkerParser.jjt_return jjt85 = null;

        ChemicalChunkerParser.oscarcj_return oscarcj86 = null;



        try { dbg.enterRule(getGrammarFileName(), "adj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:5: ( jj | jjr | jjs | jjt | oscarcj )
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:7: jj
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(53,7);
                    pushFollow(FOLLOW_jj_in_adj439);
                    jj82=jj();

                    state._fsp--;

                    adaptor.addChild(root_0, jj82.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:10: jjr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(53,10);
                    pushFollow(FOLLOW_jjr_in_adj441);
                    jjr83=jjr();

                    state._fsp--;

                    adaptor.addChild(root_0, jjr83.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:14: jjs
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(53,14);
                    pushFollow(FOLLOW_jjs_in_adj443);
                    jjs84=jjs();

                    state._fsp--;

                    adaptor.addChild(root_0, jjs84.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:18: jjt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(53,18);
                    pushFollow(FOLLOW_jjt_in_adj445);
                    jjt85=jjt();

                    state._fsp--;

                    adaptor.addChild(root_0, jjt85.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:53:22: oscarcj
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(53,22);
                    pushFollow(FOLLOW_oscarcj_in_adj447);
                    oscarcj86=oscarcj();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcj86.getTree());

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
        dbg.location(53, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:55:1: adv : ( rb | rbr | rbt );
    public final ChemicalChunkerParser.adv_return adv() throws RecognitionException {
        ChemicalChunkerParser.adv_return retval = new ChemicalChunkerParser.adv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.rb_return rb87 = null;

        ChemicalChunkerParser.rbr_return rbr88 = null;

        ChemicalChunkerParser.rbt_return rbt89 = null;



        try { dbg.enterRule(getGrammarFileName(), "adv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:55:5: ( rb | rbr | rbt )
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:55:7: rb
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(55,7);
                    pushFollow(FOLLOW_rb_in_adv455);
                    rb87=rb();

                    state._fsp--;

                    adaptor.addChild(root_0, rb87.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:55:10: rbr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(55,10);
                    pushFollow(FOLLOW_rbr_in_adv457);
                    rbr88=rbr();

                    state._fsp--;

                    adaptor.addChild(root_0, rbr88.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:55:14: rbt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(55,14);
                    pushFollow(FOLLOW_rbt_in_adv459);
                    rbt89=rbt();

                    state._fsp--;

                    adaptor.addChild(root_0, rbt89.getTree());

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
        dbg.location(55, 17);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:57:1: prepphrase : ( prepphraseOther | prepphraseTemp | prepphraseTime );
    public final ChemicalChunkerParser.prepphrase_return prepphrase() throws RecognitionException {
        ChemicalChunkerParser.prepphrase_return retval = new ChemicalChunkerParser.prepphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.prepphraseOther_return prepphraseOther90 = null;

        ChemicalChunkerParser.prepphraseTemp_return prepphraseTemp91 = null;

        ChemicalChunkerParser.prepphraseTime_return prepphraseTime92 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:58:2: ( prepphraseOther | prepphraseTemp | prepphraseTime )
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:58:5: prepphraseOther
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(58,5);
                    pushFollow(FOLLOW_prepphraseOther_in_prepphrase470);
                    prepphraseOther90=prepphraseOther();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseOther90.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:58:21: prepphraseTemp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(58,21);
                    pushFollow(FOLLOW_prepphraseTemp_in_prepphrase472);
                    prepphraseTemp91=prepphraseTemp();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseTemp91.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:58:36: prepphraseTime
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(58,36);
                    pushFollow(FOLLOW_prepphraseTime_in_prepphrase474);
                    prepphraseTime92=prepphraseTime();

                    state._fsp--;

                    adaptor.addChild(root_0, prepphraseTime92.getTree());

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
        dbg.location(58, 52);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:60:2: prepphraseOther : inAll nounphrase -> ^( NODE[\"PrepPhrase\"] inAll nounphrase ) ;
    public final ChemicalChunkerParser.prepphraseOther_return prepphraseOther() throws RecognitionException {
        ChemicalChunkerParser.prepphraseOther_return retval = new ChemicalChunkerParser.prepphraseOther_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll93 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase94 = null;


        RewriteRuleSubtreeStream stream_nounphrase=new RewriteRuleSubtreeStream(adaptor,"rule nounphrase");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseOther");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 2);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:61:2: ( inAll nounphrase -> ^( NODE[\"PrepPhrase\"] inAll nounphrase ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:61:4: inAll nounphrase
            {
            dbg.location(61,4);
            pushFollow(FOLLOW_inAll_in_prepphraseOther486);
            inAll93=inAll();

            state._fsp--;

            stream_inAll.add(inAll93.getTree());
            dbg.location(61,11);
            pushFollow(FOLLOW_nounphrase_in_prepphraseOther489);
            nounphrase94=nounphrase();

            state._fsp--;

            stream_nounphrase.add(nounphrase94.getTree());


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
            // 61:22: -> ^( NODE[\"PrepPhrase\"] inAll nounphrase )
            {
                dbg.location(61,26);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:61:26: ^( NODE[\"PrepPhrase\"] inAll nounphrase )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(61,28);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PrepPhrase"), root_1);

                dbg.location(61,48);
                adaptor.addChild(root_1, stream_inAll.nextTree());
                dbg.location(61,55);
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
        dbg.location(61, 66);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:62:1: prepphraseOf : inof nounphrase -> ^( NODE[\"PrepPhrase\"] inof nounphrase ) ;
    public final ChemicalChunkerParser.prepphraseOf_return prepphraseOf() throws RecognitionException {
        ChemicalChunkerParser.prepphraseOf_return retval = new ChemicalChunkerParser.prepphraseOf_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inof_return inof95 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase96 = null;


        RewriteRuleSubtreeStream stream_nounphrase=new RewriteRuleSubtreeStream(adaptor,"rule nounphrase");
        RewriteRuleSubtreeStream stream_inof=new RewriteRuleSubtreeStream(adaptor,"rule inof");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseOf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:63:2: ( inof nounphrase -> ^( NODE[\"PrepPhrase\"] inof nounphrase ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:63:4: inof nounphrase
            {
            dbg.location(63,4);
            pushFollow(FOLLOW_inof_in_prepphraseOf512);
            inof95=inof();

            state._fsp--;

            stream_inof.add(inof95.getTree());
            dbg.location(63,10);
            pushFollow(FOLLOW_nounphrase_in_prepphraseOf515);
            nounphrase96=nounphrase();

            state._fsp--;

            stream_nounphrase.add(nounphrase96.getTree());


            // AST REWRITE
            // elements: inof, nounphrase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:20: -> ^( NODE[\"PrepPhrase\"] inof nounphrase )
            {
                dbg.location(63,24);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:63:24: ^( NODE[\"PrepPhrase\"] inof nounphrase )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(63,26);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PrepPhrase"), root_1);

                dbg.location(63,46);
                adaptor.addChild(root_1, stream_inof.nextTree());
                dbg.location(63,52);
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
        dbg.location(63, 63);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:65:1: prepphraseIN : inin molecule -> ^( NODE[\"INMolecule\"] inin molecule ) ;
    public final ChemicalChunkerParser.prepphraseIN_return prepphraseIN() throws RecognitionException {
        ChemicalChunkerParser.prepphraseIN_return retval = new ChemicalChunkerParser.prepphraseIN_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inin_return inin97 = null;

        ChemicalChunkerParser.molecule_return molecule98 = null;


        RewriteRuleSubtreeStream stream_inin=new RewriteRuleSubtreeStream(adaptor,"rule inin");
        RewriteRuleSubtreeStream stream_molecule=new RewriteRuleSubtreeStream(adaptor,"rule molecule");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseIN");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:66:2: ( inin molecule -> ^( NODE[\"INMolecule\"] inin molecule ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:66:5: inin molecule
            {
            dbg.location(66,5);
            pushFollow(FOLLOW_inin_in_prepphraseIN539);
            inin97=inin();

            state._fsp--;

            stream_inin.add(inin97.getTree());
            dbg.location(66,10);
            pushFollow(FOLLOW_molecule_in_prepphraseIN541);
            molecule98=molecule();

            state._fsp--;

            stream_molecule.add(molecule98.getTree());


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
            // 66:19: -> ^( NODE[\"INMolecule\"] inin molecule )
            {
                dbg.location(66,23);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:66:23: ^( NODE[\"INMolecule\"] inin molecule )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(66,25);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "INMolecule"), root_1);

                dbg.location(66,45);
                adaptor.addChild(root_1, stream_inin.nextTree());
                dbg.location(66,51);
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
        dbg.location(66, 60);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:69:1: prepphraseTime : ( inAll )? ( dt )? ( jj )? cd nntime -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime ) ;
    public final ChemicalChunkerParser.prepphraseTime_return prepphraseTime() throws RecognitionException {
        ChemicalChunkerParser.prepphraseTime_return retval = new ChemicalChunkerParser.prepphraseTime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll99 = null;

        ChemicalChunkerParser.dt_return dt100 = null;

        ChemicalChunkerParser.jj_return jj101 = null;

        ChemicalChunkerParser.cd_return cd102 = null;

        ChemicalChunkerParser.nntime_return nntime103 = null;


        RewriteRuleSubtreeStream stream_dt=new RewriteRuleSubtreeStream(adaptor,"rule dt");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        RewriteRuleSubtreeStream stream_nntime=new RewriteRuleSubtreeStream(adaptor,"rule nntime");
        RewriteRuleSubtreeStream stream_jj=new RewriteRuleSubtreeStream(adaptor,"rule jj");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseTime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:69:15: ( ( inAll )? ( dt )? ( jj )? cd nntime -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:2: ( inAll )? ( dt )? ( jj )? cd nntime
            {
            dbg.location(70,2);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:2: ( inAll )?
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:2: inAll
                    {
                    dbg.location(70,2);
                    pushFollow(FOLLOW_inAll_in_prepphraseTime565);
                    inAll99=inAll();

                    state._fsp--;

                    stream_inAll.add(inAll99.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(70,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:9: ( dt )?
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:9: dt
                    {
                    dbg.location(70,9);
                    pushFollow(FOLLOW_dt_in_prepphraseTime568);
                    dt100=dt();

                    state._fsp--;

                    stream_dt.add(dt100.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}

            dbg.location(70,13);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:13: ( jj )?
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:13: jj
                    {
                    dbg.location(70,13);
                    pushFollow(FOLLOW_jj_in_prepphraseTime571);
                    jj101=jj();

                    state._fsp--;

                    stream_jj.add(jj101.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

            dbg.location(70,17);
            pushFollow(FOLLOW_cd_in_prepphraseTime574);
            cd102=cd();

            state._fsp--;

            stream_cd.add(cd102.getTree());
            dbg.location(70,20);
            pushFollow(FOLLOW_nntime_in_prepphraseTime576);
            nntime103=nntime();

            state._fsp--;

            stream_nntime.add(nntime103.getTree());


            // AST REWRITE
            // elements: nntime, dt, inAll, jj, cd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 70:27: -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime )
            {
                dbg.location(70,31);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:31: ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(70,33);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "TimePhrase"), root_1);

                dbg.location(70,53);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:53: ( inAll )?
                if ( stream_inAll.hasNext() ) {
                    dbg.location(70,53);
                    adaptor.addChild(root_1, stream_inAll.nextTree());

                }
                stream_inAll.reset();
                dbg.location(70,60);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:60: ( dt )?
                if ( stream_dt.hasNext() ) {
                    dbg.location(70,60);
                    adaptor.addChild(root_1, stream_dt.nextTree());

                }
                stream_dt.reset();
                dbg.location(70,64);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:70:64: ( jj )?
                if ( stream_jj.hasNext() ) {
                    dbg.location(70,64);
                    adaptor.addChild(root_1, stream_jj.nextTree());

                }
                stream_jj.reset();
                dbg.location(70,68);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(70,71);
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
        dbg.location(70, 78);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:72:1: prepphraseTemp : ( inAll )? ( dt )? ( jj )? cd nntemp -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp ) ;
    public final ChemicalChunkerParser.prepphraseTemp_return prepphraseTemp() throws RecognitionException {
        ChemicalChunkerParser.prepphraseTemp_return retval = new ChemicalChunkerParser.prepphraseTemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll104 = null;

        ChemicalChunkerParser.dt_return dt105 = null;

        ChemicalChunkerParser.jj_return jj106 = null;

        ChemicalChunkerParser.cd_return cd107 = null;

        ChemicalChunkerParser.nntemp_return nntemp108 = null;


        RewriteRuleSubtreeStream stream_dt=new RewriteRuleSubtreeStream(adaptor,"rule dt");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        RewriteRuleSubtreeStream stream_nntemp=new RewriteRuleSubtreeStream(adaptor,"rule nntemp");
        RewriteRuleSubtreeStream stream_jj=new RewriteRuleSubtreeStream(adaptor,"rule jj");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseTemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:72:15: ( ( inAll )? ( dt )? ( jj )? cd nntemp -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:2: ( inAll )? ( dt )? ( jj )? cd nntemp
            {
            dbg.location(73,2);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:2: ( inAll )?
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:2: inAll
                    {
                    dbg.location(73,2);
                    pushFollow(FOLLOW_inAll_in_prepphraseTemp606);
                    inAll104=inAll();

                    state._fsp--;

                    stream_inAll.add(inAll104.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(73,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:9: ( dt )?
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:9: dt
                    {
                    dbg.location(73,9);
                    pushFollow(FOLLOW_dt_in_prepphraseTemp609);
                    dt105=dt();

                    state._fsp--;

                    stream_dt.add(dt105.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(73,13);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:13: ( jj )?
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:13: jj
                    {
                    dbg.location(73,13);
                    pushFollow(FOLLOW_jj_in_prepphraseTemp612);
                    jj106=jj();

                    state._fsp--;

                    stream_jj.add(jj106.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(73,17);
            pushFollow(FOLLOW_cd_in_prepphraseTemp615);
            cd107=cd();

            state._fsp--;

            stream_cd.add(cd107.getTree());
            dbg.location(73,20);
            pushFollow(FOLLOW_nntemp_in_prepphraseTemp617);
            nntemp108=nntemp();

            state._fsp--;

            stream_nntemp.add(nntemp108.getTree());


            // AST REWRITE
            // elements: nntemp, dt, cd, inAll, jj
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 73:27: -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp )
            {
                dbg.location(73,31);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:31: ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(73,33);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "TempPhrase"), root_1);

                dbg.location(73,53);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:53: ( inAll )?
                if ( stream_inAll.hasNext() ) {
                    dbg.location(73,53);
                    adaptor.addChild(root_1, stream_inAll.nextTree());

                }
                stream_inAll.reset();
                dbg.location(73,60);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:60: ( dt )?
                if ( stream_dt.hasNext() ) {
                    dbg.location(73,60);
                    adaptor.addChild(root_1, stream_dt.nextTree());

                }
                stream_dt.reset();
                dbg.location(73,64);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:73:64: ( jj )?
                if ( stream_jj.hasNext() ) {
                    dbg.location(73,64);
                    adaptor.addChild(root_1, stream_jj.nextTree());

                }
                stream_jj.reset();
                dbg.location(73,68);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(73,71);
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
        dbg.location(73, 78);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:1: inAll : ( in | inafter | inas | inbefore | inby | infor | infrom | inin | ininto | inof | inoff | inon | inover | inunder | invia | inwith | inwithout );
    public final ChemicalChunkerParser.inAll_return inAll() throws RecognitionException {
        ChemicalChunkerParser.inAll_return retval = new ChemicalChunkerParser.inAll_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.in_return in109 = null;

        ChemicalChunkerParser.inafter_return inafter110 = null;

        ChemicalChunkerParser.inas_return inas111 = null;

        ChemicalChunkerParser.inbefore_return inbefore112 = null;

        ChemicalChunkerParser.inby_return inby113 = null;

        ChemicalChunkerParser.infor_return infor114 = null;

        ChemicalChunkerParser.infrom_return infrom115 = null;

        ChemicalChunkerParser.inin_return inin116 = null;

        ChemicalChunkerParser.ininto_return ininto117 = null;

        ChemicalChunkerParser.inof_return inof118 = null;

        ChemicalChunkerParser.inoff_return inoff119 = null;

        ChemicalChunkerParser.inon_return inon120 = null;

        ChemicalChunkerParser.inover_return inover121 = null;

        ChemicalChunkerParser.inunder_return inunder122 = null;

        ChemicalChunkerParser.invia_return invia123 = null;

        ChemicalChunkerParser.inwith_return inwith124 = null;

        ChemicalChunkerParser.inwithout_return inwithout125 = null;



        try { dbg.enterRule(getGrammarFileName(), "inAll");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:7: ( in | inafter | inas | inbefore | inby | infor | infrom | inin | ininto | inof | inoff | inon | inover | inunder | invia | inwith | inwithout )
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:9: in
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,9);
                    pushFollow(FOLLOW_in_in_inAll650);
                    in109=in();

                    state._fsp--;

                    adaptor.addChild(root_0, in109.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:12: inafter
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,12);
                    pushFollow(FOLLOW_inafter_in_inAll652);
                    inafter110=inafter();

                    state._fsp--;

                    adaptor.addChild(root_0, inafter110.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:20: inas
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,20);
                    pushFollow(FOLLOW_inas_in_inAll654);
                    inas111=inas();

                    state._fsp--;

                    adaptor.addChild(root_0, inas111.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:25: inbefore
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,25);
                    pushFollow(FOLLOW_inbefore_in_inAll656);
                    inbefore112=inbefore();

                    state._fsp--;

                    adaptor.addChild(root_0, inbefore112.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:34: inby
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,34);
                    pushFollow(FOLLOW_inby_in_inAll658);
                    inby113=inby();

                    state._fsp--;

                    adaptor.addChild(root_0, inby113.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:39: infor
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,39);
                    pushFollow(FOLLOW_infor_in_inAll660);
                    infor114=infor();

                    state._fsp--;

                    adaptor.addChild(root_0, infor114.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:45: infrom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,45);
                    pushFollow(FOLLOW_infrom_in_inAll662);
                    infrom115=infrom();

                    state._fsp--;

                    adaptor.addChild(root_0, infrom115.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:52: inin
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,52);
                    pushFollow(FOLLOW_inin_in_inAll664);
                    inin116=inin();

                    state._fsp--;

                    adaptor.addChild(root_0, inin116.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:57: ininto
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,57);
                    pushFollow(FOLLOW_ininto_in_inAll666);
                    ininto117=ininto();

                    state._fsp--;

                    adaptor.addChild(root_0, ininto117.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:64: inof
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,64);
                    pushFollow(FOLLOW_inof_in_inAll668);
                    inof118=inof();

                    state._fsp--;

                    adaptor.addChild(root_0, inof118.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:69: inoff
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,69);
                    pushFollow(FOLLOW_inoff_in_inAll670);
                    inoff119=inoff();

                    state._fsp--;

                    adaptor.addChild(root_0, inoff119.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:75: inon
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,75);
                    pushFollow(FOLLOW_inon_in_inAll672);
                    inon120=inon();

                    state._fsp--;

                    adaptor.addChild(root_0, inon120.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:80: inover
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,80);
                    pushFollow(FOLLOW_inover_in_inAll674);
                    inover121=inover();

                    state._fsp--;

                    adaptor.addChild(root_0, inover121.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:87: inunder
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,87);
                    pushFollow(FOLLOW_inunder_in_inAll676);
                    inunder122=inunder();

                    state._fsp--;

                    adaptor.addChild(root_0, inunder122.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:95: invia
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,95);
                    pushFollow(FOLLOW_invia_in_inAll678);
                    invia123=invia();

                    state._fsp--;

                    adaptor.addChild(root_0, invia123.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:101: inwith
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,101);
                    pushFollow(FOLLOW_inwith_in_inAll680);
                    inwith124=inwith();

                    state._fsp--;

                    adaptor.addChild(root_0, inwith124.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:77:108: inwithout
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,108);
                    pushFollow(FOLLOW_inwithout_in_inAll682);
                    inwithout125=inwithout();

                    state._fsp--;

                    adaptor.addChild(root_0, inwithout125.getTree());

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
        dbg.location(77, 118);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:81:1: mmol : cd nnmol -> ^( NODE[\"MMOL\"] cd nnmol ) ;
    public final ChemicalChunkerParser.mmol_return mmol() throws RecognitionException {
        ChemicalChunkerParser.mmol_return retval = new ChemicalChunkerParser.mmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd126 = null;

        ChemicalChunkerParser.nnmol_return nnmol127 = null;


        RewriteRuleSubtreeStream stream_nnmol=new RewriteRuleSubtreeStream(adaptor,"rule nnmol");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "mmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:81:6: ( cd nnmol -> ^( NODE[\"MMOL\"] cd nnmol ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:81:8: cd nnmol
            {
            dbg.location(81,8);
            pushFollow(FOLLOW_cd_in_mmol696);
            cd126=cd();

            state._fsp--;

            stream_cd.add(cd126.getTree());
            dbg.location(81,11);
            pushFollow(FOLLOW_nnmol_in_mmol698);
            nnmol127=nnmol();

            state._fsp--;

            stream_nnmol.add(nnmol127.getTree());


            // AST REWRITE
            // elements: cd, nnmol
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:17: -> ^( NODE[\"MMOL\"] cd nnmol )
            {
                dbg.location(81,20);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:81:20: ^( NODE[\"MMOL\"] cd nnmol )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(81,22);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "MMOL"), root_1);

                dbg.location(81,37);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(81,40);
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
        dbg.location(81, 47);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:1: gram : cd nngram -> ^( NODE[\"GRAM\"] cd nngram ) ;
    public final ChemicalChunkerParser.gram_return gram() throws RecognitionException {
        ChemicalChunkerParser.gram_return retval = new ChemicalChunkerParser.gram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd128 = null;

        ChemicalChunkerParser.nngram_return nngram129 = null;


        RewriteRuleSubtreeStream stream_nngram=new RewriteRuleSubtreeStream(adaptor,"rule nngram");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "gram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:6: ( cd nngram -> ^( NODE[\"GRAM\"] cd nngram ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:8: cd nngram
            {
            dbg.location(82,8);
            pushFollow(FOLLOW_cd_in_gram719);
            cd128=cd();

            state._fsp--;

            stream_cd.add(cd128.getTree());
            dbg.location(82,11);
            pushFollow(FOLLOW_nngram_in_gram721);
            nngram129=nngram();

            state._fsp--;

            stream_nngram.add(nngram129.getTree());


            // AST REWRITE
            // elements: nngram, cd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:17: -> ^( NODE[\"GRAM\"] cd nngram )
            {
                dbg.location(82,20);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:82:20: ^( NODE[\"GRAM\"] cd nngram )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(82,22);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "GRAM"), root_1);

                dbg.location(82,37);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(82,40);
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
        dbg.location(82, 48);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:83:1: percent : cd nnpercent -> ^( NODE[\"PERCENT\"] cd nnpercent ) ;
    public final ChemicalChunkerParser.percent_return percent() throws RecognitionException {
        ChemicalChunkerParser.percent_return retval = new ChemicalChunkerParser.percent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd130 = null;

        ChemicalChunkerParser.nnpercent_return nnpercent131 = null;


        RewriteRuleSubtreeStream stream_nnpercent=new RewriteRuleSubtreeStream(adaptor,"rule nnpercent");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "percent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:83:9: ( cd nnpercent -> ^( NODE[\"PERCENT\"] cd nnpercent ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:83:11: cd nnpercent
            {
            dbg.location(83,11);
            pushFollow(FOLLOW_cd_in_percent742);
            cd130=cd();

            state._fsp--;

            stream_cd.add(cd130.getTree());
            dbg.location(83,14);
            pushFollow(FOLLOW_nnpercent_in_percent744);
            nnpercent131=nnpercent();

            state._fsp--;

            stream_nnpercent.add(nnpercent131.getTree());


            // AST REWRITE
            // elements: cd, nnpercent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:24: -> ^( NODE[\"PERCENT\"] cd nnpercent )
            {
                dbg.location(83,27);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:83:27: ^( NODE[\"PERCENT\"] cd nnpercent )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(83,29);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PERCENT"), root_1);

                dbg.location(83,47);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(83,50);
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
        dbg.location(83, 61);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:1: volume : cd nnvol -> ^( NODE[\"VOLUME\"] cd nnvol ) ;
    public final ChemicalChunkerParser.volume_return volume() throws RecognitionException {
        ChemicalChunkerParser.volume_return retval = new ChemicalChunkerParser.volume_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd132 = null;

        ChemicalChunkerParser.nnvol_return nnvol133 = null;


        RewriteRuleSubtreeStream stream_nnvol=new RewriteRuleSubtreeStream(adaptor,"rule nnvol");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "volume");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:8: ( cd nnvol -> ^( NODE[\"VOLUME\"] cd nnvol ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:10: cd nnvol
            {
            dbg.location(84,10);
            pushFollow(FOLLOW_cd_in_volume765);
            cd132=cd();

            state._fsp--;

            stream_cd.add(cd132.getTree());
            dbg.location(84,13);
            pushFollow(FOLLOW_nnvol_in_volume767);
            nnvol133=nnvol();

            state._fsp--;

            stream_nnvol.add(nnvol133.getTree());


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
            // 84:19: -> ^( NODE[\"VOLUME\"] cd nnvol )
            {
                dbg.location(84,22);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:84:22: ^( NODE[\"VOLUME\"] cd nnvol )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(84,24);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "VOLUME"), root_1);

                dbg.location(84,41);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(84,44);
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
        dbg.location(84, 51);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:86:1: measurements : ( mmol | gram | percent | volume );
    public final ChemicalChunkerParser.measurements_return measurements() throws RecognitionException {
        ChemicalChunkerParser.measurements_return retval = new ChemicalChunkerParser.measurements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.mmol_return mmol134 = null;

        ChemicalChunkerParser.gram_return gram135 = null;

        ChemicalChunkerParser.percent_return percent136 = null;

        ChemicalChunkerParser.volume_return volume137 = null;



        try { dbg.enterRule(getGrammarFileName(), "measurements");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:87:2: ( mmol | gram | percent | volume )
            int alt28=4;
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==119) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==TOKEN) ) {
                    switch ( input.LA(3) ) {
                    case 33:
                        {
                        alt28=2;
                        }
                        break;
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:87:3: mmol
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(87,3);
                    pushFollow(FOLLOW_mmol_in_measurements789);
                    mmol134=mmol();

                    state._fsp--;

                    adaptor.addChild(root_0, mmol134.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:87:8: gram
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(87,8);
                    pushFollow(FOLLOW_gram_in_measurements791);
                    gram135=gram();

                    state._fsp--;

                    adaptor.addChild(root_0, gram135.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:87:13: percent
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(87,13);
                    pushFollow(FOLLOW_percent_in_measurements793);
                    percent136=percent();

                    state._fsp--;

                    adaptor.addChild(root_0, percent136.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:87:21: volume
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(87,21);
                    pushFollow(FOLLOW_volume_in_measurements795);
                    volume137=volume();

                    state._fsp--;

                    adaptor.addChild(root_0, volume137.getTree());

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
        dbg.location(87, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "measurements");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "measurements"

    public static class oscarCM_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oscarCM"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:1: oscarCM : ( oscarcm )+ -> ^( NODE[\"OSCARCM\"] ( oscarcm )+ ) ;
    public final ChemicalChunkerParser.oscarCM_return oscarCM() throws RecognitionException {
        ChemicalChunkerParser.oscarCM_return retval = new ChemicalChunkerParser.oscarCM_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarcm_return oscarcm138 = null;


        RewriteRuleSubtreeStream stream_oscarcm=new RewriteRuleSubtreeStream(adaptor,"rule oscarcm");
        try { dbg.enterRule(getGrammarFileName(), "oscarCM");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:9: ( ( oscarcm )+ -> ^( NODE[\"OSCARCM\"] ( oscarcm )+ ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:11: ( oscarcm )+
            {
            dbg.location(89,11);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:11: ( oscarcm )+
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

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:11: oscarcm
            	    {
            	    dbg.location(89,11);
            	    pushFollow(FOLLOW_oscarcm_in_oscarCM804);
            	    oscarcm138=oscarcm();

            	    state._fsp--;

            	    stream_oscarcm.add(oscarcm138.getTree());

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
            // 89:20: -> ^( NODE[\"OSCARCM\"] ( oscarcm )+ )
            {
                dbg.location(89,23);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:89:23: ^( NODE[\"OSCARCM\"] ( oscarcm )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(89,25);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "OSCARCM"), root_1);

                dbg.location(89,42);
                if ( !(stream_oscarcm.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_oscarcm.hasNext() ) {
                    dbg.location(89,42);
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
        dbg.location(89, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oscarCM");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oscarCM"

    public static class moleculeamount1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moleculeamount1"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:92:1: moleculeamount1 : measurements inof oscarCM ;
    public final ChemicalChunkerParser.moleculeamount1_return moleculeamount1() throws RecognitionException {
        ChemicalChunkerParser.moleculeamount1_return retval = new ChemicalChunkerParser.moleculeamount1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.measurements_return measurements139 = null;

        ChemicalChunkerParser.inof_return inof140 = null;

        ChemicalChunkerParser.oscarCM_return oscarCM141 = null;



        try { dbg.enterRule(getGrammarFileName(), "moleculeamount1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:2: ( measurements inof oscarCM )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:93:3: measurements inof oscarCM
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(93,3);
            pushFollow(FOLLOW_measurements_in_moleculeamount1825);
            measurements139=measurements();

            state._fsp--;

            adaptor.addChild(root_0, measurements139.getTree());
            dbg.location(93,16);
            pushFollow(FOLLOW_inof_in_moleculeamount1827);
            inof140=inof();

            state._fsp--;

            adaptor.addChild(root_0, inof140.getTree());
            dbg.location(93,21);
            pushFollow(FOLLOW_oscarCM_in_moleculeamount1829);
            oscarCM141=oscarCM();

            state._fsp--;

            adaptor.addChild(root_0, oscarCM141.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(93, 28);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:94:1: moleculeamount2 : oscarCM ( amount )* ;
    public final ChemicalChunkerParser.moleculeamount2_return moleculeamount2() throws RecognitionException {
        ChemicalChunkerParser.moleculeamount2_return retval = new ChemicalChunkerParser.moleculeamount2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarCM_return oscarCM142 = null;

        ChemicalChunkerParser.amount_return amount143 = null;



        try { dbg.enterRule(getGrammarFileName(), "moleculeamount2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:95:2: ( oscarCM ( amount )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:95:3: oscarCM ( amount )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(95,3);
            pushFollow(FOLLOW_oscarCM_in_moleculeamount2837);
            oscarCM142=oscarCM();

            state._fsp--;

            adaptor.addChild(root_0, oscarCM142.getTree());
            dbg.location(95,11);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:95:11: ( amount )*
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

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:95:11: amount
            	    {
            	    dbg.location(95,11);
            	    pushFollow(FOLLOW_amount_in_moleculeamount2839);
            	    amount143=amount();

            	    state._fsp--;

            	    adaptor.addChild(root_0, amount143.getTree());

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
        dbg.location(95, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:96:1: moleculeamount : ( moleculeamount1 | moleculeamount2 );
    public final ChemicalChunkerParser.moleculeamount_return moleculeamount() throws RecognitionException {
        ChemicalChunkerParser.moleculeamount_return retval = new ChemicalChunkerParser.moleculeamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.moleculeamount1_return moleculeamount1144 = null;

        ChemicalChunkerParser.moleculeamount2_return moleculeamount2145 = null;



        try { dbg.enterRule(getGrammarFileName(), "moleculeamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(96, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:97:2: ( moleculeamount1 | moleculeamount2 )
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:97:3: moleculeamount1
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(97,3);
                    pushFollow(FOLLOW_moleculeamount1_in_moleculeamount849);
                    moleculeamount1144=moleculeamount1();

                    state._fsp--;

                    adaptor.addChild(root_0, moleculeamount1144.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:97:21: moleculeamount2
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(97,21);
                    pushFollow(FOLLOW_moleculeamount2_in_moleculeamount853);
                    moleculeamount2145=moleculeamount2();

                    state._fsp--;

                    adaptor.addChild(root_0, moleculeamount2145.getTree());

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
        dbg.location(97, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:98:1: molecule : moleculeamount -> ^( NODE[\"MOLECULE\"] moleculeamount ) ;
    public final ChemicalChunkerParser.molecule_return molecule() throws RecognitionException {
        ChemicalChunkerParser.molecule_return retval = new ChemicalChunkerParser.molecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.moleculeamount_return moleculeamount146 = null;


        RewriteRuleSubtreeStream stream_moleculeamount=new RewriteRuleSubtreeStream(adaptor,"rule moleculeamount");
        try { dbg.enterRule(getGrammarFileName(), "molecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:99:2: ( moleculeamount -> ^( NODE[\"MOLECULE\"] moleculeamount ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:99:5: moleculeamount
            {
            dbg.location(99,5);
            pushFollow(FOLLOW_moleculeamount_in_molecule874);
            moleculeamount146=moleculeamount();

            state._fsp--;

            stream_moleculeamount.add(moleculeamount146.getTree());


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
            // 99:19: -> ^( NODE[\"MOLECULE\"] moleculeamount )
            {
                dbg.location(99,22);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:99:22: ^( NODE[\"MOLECULE\"] moleculeamount )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(99,24);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "MOLECULE"), root_1);

                dbg.location(99,42);
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
        dbg.location(99, 58);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:101:1: unnamedmoleculeamount1 : measurements inof oscarcd ;
    public final ChemicalChunkerParser.unnamedmoleculeamount1_return unnamedmoleculeamount1() throws RecognitionException {
        ChemicalChunkerParser.unnamedmoleculeamount1_return retval = new ChemicalChunkerParser.unnamedmoleculeamount1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.measurements_return measurements147 = null;

        ChemicalChunkerParser.inof_return inof148 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd149 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmoleculeamount1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:102:2: ( measurements inof oscarcd )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:102:3: measurements inof oscarcd
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(102,3);
            pushFollow(FOLLOW_measurements_in_unnamedmoleculeamount1893);
            measurements147=measurements();

            state._fsp--;

            adaptor.addChild(root_0, measurements147.getTree());
            dbg.location(102,16);
            pushFollow(FOLLOW_inof_in_unnamedmoleculeamount1895);
            inof148=inof();

            state._fsp--;

            adaptor.addChild(root_0, inof148.getTree());
            dbg.location(102,21);
            pushFollow(FOLLOW_oscarcd_in_unnamedmoleculeamount1897);
            oscarcd149=oscarcd();

            state._fsp--;

            adaptor.addChild(root_0, oscarcd149.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(102, 28);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:103:1: unnamedmoleculeamount2 : oscarcd ( amount )* ;
    public final ChemicalChunkerParser.unnamedmoleculeamount2_return unnamedmoleculeamount2() throws RecognitionException {
        ChemicalChunkerParser.unnamedmoleculeamount2_return retval = new ChemicalChunkerParser.unnamedmoleculeamount2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd150 = null;

        ChemicalChunkerParser.amount_return amount151 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmoleculeamount2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:104:2: ( oscarcd ( amount )* )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:104:3: oscarcd ( amount )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(104,3);
            pushFollow(FOLLOW_oscarcd_in_unnamedmoleculeamount2905);
            oscarcd150=oscarcd();

            state._fsp--;

            adaptor.addChild(root_0, oscarcd150.getTree());
            dbg.location(104,11);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:104:11: ( amount )*
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

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:104:11: amount
            	    {
            	    dbg.location(104,11);
            	    pushFollow(FOLLOW_amount_in_unnamedmoleculeamount2907);
            	    amount151=amount();

            	    state._fsp--;

            	    adaptor.addChild(root_0, amount151.getTree());

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
        dbg.location(104, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:105:1: unnamedmoleculeamount : ( unnamedmoleculeamount1 | unnamedmoleculeamount2 );
    public final ChemicalChunkerParser.unnamedmoleculeamount_return unnamedmoleculeamount() throws RecognitionException {
        ChemicalChunkerParser.unnamedmoleculeamount_return retval = new ChemicalChunkerParser.unnamedmoleculeamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.unnamedmoleculeamount1_return unnamedmoleculeamount1152 = null;

        ChemicalChunkerParser.unnamedmoleculeamount2_return unnamedmoleculeamount2153 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmoleculeamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:106:2: ( unnamedmoleculeamount1 | unnamedmoleculeamount2 )
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:106:3: unnamedmoleculeamount1
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(106,3);
                    pushFollow(FOLLOW_unnamedmoleculeamount1_in_unnamedmoleculeamount917);
                    unnamedmoleculeamount1152=unnamedmoleculeamount1();

                    state._fsp--;

                    adaptor.addChild(root_0, unnamedmoleculeamount1152.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:106:28: unnamedmoleculeamount2
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(106,28);
                    pushFollow(FOLLOW_unnamedmoleculeamount2_in_unnamedmoleculeamount921);
                    unnamedmoleculeamount2153=unnamedmoleculeamount2();

                    state._fsp--;

                    adaptor.addChild(root_0, unnamedmoleculeamount2153.getTree());

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
        dbg.location(106, 51);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:109:1: unnamedmolecule : unnamedmoleculeamount -> ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount ) ;
    public final ChemicalChunkerParser.unnamedmolecule_return unnamedmolecule() throws RecognitionException {
        ChemicalChunkerParser.unnamedmolecule_return retval = new ChemicalChunkerParser.unnamedmolecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.unnamedmoleculeamount_return unnamedmoleculeamount154 = null;


        RewriteRuleSubtreeStream stream_unnamedmoleculeamount=new RewriteRuleSubtreeStream(adaptor,"rule unnamedmoleculeamount");
        try { dbg.enterRule(getGrammarFileName(), "unnamedmolecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:110:2: ( unnamedmoleculeamount -> ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:110:4: unnamedmoleculeamount
            {
            dbg.location(110,4);
            pushFollow(FOLLOW_unnamedmoleculeamount_in_unnamedmolecule934);
            unnamedmoleculeamount154=unnamedmoleculeamount();

            state._fsp--;

            stream_unnamedmoleculeamount.add(unnamedmoleculeamount154.getTree());


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
            // 110:26: -> ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount )
            {
                dbg.location(110,29);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:110:29: ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(110,31);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "UNNAMEDMOLECULE"), root_1);

                dbg.location(110,55);
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
        dbg.location(110, 77);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:1: amount : lrb measurements ( comma measurements )* rrb -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb ) ;
    public final ChemicalChunkerParser.amount_return amount() throws RecognitionException {
        ChemicalChunkerParser.amount_return retval = new ChemicalChunkerParser.amount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.lrb_return lrb155 = null;

        ChemicalChunkerParser.measurements_return measurements156 = null;

        ChemicalChunkerParser.comma_return comma157 = null;

        ChemicalChunkerParser.measurements_return measurements158 = null;

        ChemicalChunkerParser.rrb_return rrb159 = null;


        RewriteRuleSubtreeStream stream_measurements=new RewriteRuleSubtreeStream(adaptor,"rule measurements");
        RewriteRuleSubtreeStream stream_comma=new RewriteRuleSubtreeStream(adaptor,"rule comma");
        RewriteRuleSubtreeStream stream_lrb=new RewriteRuleSubtreeStream(adaptor,"rule lrb");
        RewriteRuleSubtreeStream stream_rrb=new RewriteRuleSubtreeStream(adaptor,"rule rrb");
        try { dbg.enterRule(getGrammarFileName(), "amount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:9: ( lrb measurements ( comma measurements )* rrb -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb ) )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:11: lrb measurements ( comma measurements )* rrb
            {
            dbg.location(112,11);
            pushFollow(FOLLOW_lrb_in_amount955);
            lrb155=lrb();

            state._fsp--;

            stream_lrb.add(lrb155.getTree());
            dbg.location(112,15);
            pushFollow(FOLLOW_measurements_in_amount957);
            measurements156=measurements();

            state._fsp--;

            stream_measurements.add(measurements156.getTree());
            dbg.location(112,28);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:28: ( comma measurements )*
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

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:29: comma measurements
            	    {
            	    dbg.location(112,29);
            	    pushFollow(FOLLOW_comma_in_amount960);
            	    comma157=comma();

            	    state._fsp--;

            	    stream_comma.add(comma157.getTree());
            	    dbg.location(112,36);
            	    pushFollow(FOLLOW_measurements_in_amount963);
            	    measurements158=measurements();

            	    state._fsp--;

            	    stream_measurements.add(measurements158.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);
            } finally {dbg.exitSubRule(34);}

            dbg.location(112,52);
            pushFollow(FOLLOW_rrb_in_amount968);
            rrb159=rrb();

            state._fsp--;

            stream_rrb.add(rrb159.getTree());


            // AST REWRITE
            // elements: measurements, comma, lrb, rrb, measurements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:56: -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb )
            {
                dbg.location(112,61);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:61: ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(112,63);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "AMOUNT"), root_1);

                dbg.location(112,79);
                adaptor.addChild(root_1, stream_lrb.nextTree());
                dbg.location(112,83);
                adaptor.addChild(root_1, stream_measurements.nextTree());
                dbg.location(112,96);
                // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:112:96: ( comma measurements )*
                while ( stream_measurements.hasNext()||stream_comma.hasNext() ) {
                    dbg.location(112,97);
                    adaptor.addChild(root_1, stream_comma.nextTree());
                    dbg.location(112,104);
                    adaptor.addChild(root_1, stream_measurements.nextTree());

                }
                stream_measurements.reset();
                stream_comma.reset();
                dbg.location(112,120);
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
        dbg.location(112, 124);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:114:1: method : ( nngeneral | nn )? nnmethod ( oscarcd | cd )? ;
    public final ChemicalChunkerParser.method_return method() throws RecognitionException {
        ChemicalChunkerParser.method_return retval = new ChemicalChunkerParser.method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.nngeneral_return nngeneral160 = null;

        ChemicalChunkerParser.nn_return nn161 = null;

        ChemicalChunkerParser.nnmethod_return nnmethod162 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd163 = null;

        ChemicalChunkerParser.cd_return cd164 = null;



        try { dbg.enterRule(getGrammarFileName(), "method");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:114:7: ( ( nngeneral | nn )? nnmethod ( oscarcd | cd )? )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:5: ( nngeneral | nn )? nnmethod ( oscarcd | cd )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(115,5);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:5: ( nngeneral | nn )?
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:6: nngeneral
                    {
                    dbg.location(115,6);
                    pushFollow(FOLLOW_nngeneral_in_method1005);
                    nngeneral160=nngeneral();

                    state._fsp--;

                    adaptor.addChild(root_0, nngeneral160.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:16: nn
                    {
                    dbg.location(115,16);
                    pushFollow(FOLLOW_nn_in_method1007);
                    nn161=nn();

                    state._fsp--;

                    adaptor.addChild(root_0, nn161.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(35);}

            dbg.location(115,21);
            pushFollow(FOLLOW_nnmethod_in_method1011);
            nnmethod162=nnmethod();

            state._fsp--;

            adaptor.addChild(root_0, nnmethod162.getTree());
            dbg.location(115,30);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:30: ( oscarcd | cd )?
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

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:31: oscarcd
                    {
                    dbg.location(115,31);
                    pushFollow(FOLLOW_oscarcd_in_method1014);
                    oscarcd163=oscarcd();

                    state._fsp--;

                    adaptor.addChild(root_0, oscarcd163.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:115:39: cd
                    {
                    dbg.location(115,39);
                    pushFollow(FOLLOW_cd_in_method1016);
                    cd164=cd();

                    state._fsp--;

                    adaptor.addChild(root_0, cd164.getTree());

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
        dbg.location(115, 45);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:118:1: oscarcd : 'OSCAR-CD' TOKEN ;
    public final ChemicalChunkerParser.oscarcd_return oscarcd() throws RecognitionException {
        ChemicalChunkerParser.oscarcd_return retval = new ChemicalChunkerParser.oscarcd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal165=null;
        Token TOKEN166=null;

        Object string_literal165_tree=null;
        Object TOKEN166_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:118:8: ( 'OSCAR-CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:118:9: 'OSCAR-CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(118,9);
            string_literal165=(Token)match(input,10,FOLLOW_10_in_oscarcd1027); 
            string_literal165_tree = (Object)adaptor.create(string_literal165);
            adaptor.addChild(root_0, string_literal165_tree);

            dbg.location(118,20);
            TOKEN166=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcd1029); 
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
        dbg.location(118, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:1: oscarcj : 'OSCAR-CJ' TOKEN ;
    public final ChemicalChunkerParser.oscarcj_return oscarcj() throws RecognitionException {
        ChemicalChunkerParser.oscarcj_return retval = new ChemicalChunkerParser.oscarcj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal167=null;
        Token TOKEN168=null;

        Object string_literal167_tree=null;
        Object TOKEN168_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:8: ( 'OSCAR-CJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:119:9: 'OSCAR-CJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(119,9);
            string_literal167=(Token)match(input,11,FOLLOW_11_in_oscarcj1034); 
            string_literal167_tree = (Object)adaptor.create(string_literal167);
            adaptor.addChild(root_0, string_literal167_tree);

            dbg.location(119,20);
            TOKEN168=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcj1036); 
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
        dbg.location(119, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:1: oscaront : 'OSCAR-ONT' TOKEN ;
    public final ChemicalChunkerParser.oscaront_return oscaront() throws RecognitionException {
        ChemicalChunkerParser.oscaront_return retval = new ChemicalChunkerParser.oscaront_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal169=null;
        Token TOKEN170=null;

        Object string_literal169_tree=null;
        Object TOKEN170_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscaront");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:9: ( 'OSCAR-ONT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:120:11: 'OSCAR-ONT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(120,11);
            string_literal169=(Token)match(input,12,FOLLOW_12_in_oscaront1042); 
            string_literal169_tree = (Object)adaptor.create(string_literal169);
            adaptor.addChild(root_0, string_literal169_tree);

            dbg.location(120,23);
            TOKEN170=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscaront1044); 
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
        dbg.location(120, 28);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:1: tmunicode : 'TM-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.tmunicode_return tmunicode() throws RecognitionException {
        ChemicalChunkerParser.tmunicode_return retval = new ChemicalChunkerParser.tmunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal171=null;
        Token TOKEN172=null;

        Object string_literal171_tree=null;
        Object TOKEN172_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "tmunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:10: ( 'TM-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:121:11: 'TM-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(121,11);
            string_literal171=(Token)match(input,13,FOLLOW_13_in_tmunicode1049); 
            string_literal171_tree = (Object)adaptor.create(string_literal171);
            adaptor.addChild(root_0, string_literal171_tree);

            dbg.location(121,24);
            TOKEN172=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_tmunicode1051); 
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
        dbg.location(121, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:122:1: cdunicode : 'CD-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.cdunicode_return cdunicode() throws RecognitionException {
        ChemicalChunkerParser.cdunicode_return retval = new ChemicalChunkerParser.cdunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal173=null;
        Token TOKEN174=null;

        Object string_literal173_tree=null;
        Object TOKEN174_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cdunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:122:10: ( 'CD-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:122:11: 'CD-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(122,11);
            string_literal173=(Token)match(input,14,FOLLOW_14_in_cdunicode1056); 
            string_literal173_tree = (Object)adaptor.create(string_literal173);
            adaptor.addChild(root_0, string_literal173_tree);

            dbg.location(122,24);
            TOKEN174=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cdunicode1058); 
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
        dbg.location(122, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:125:1: inas : 'IN-AS' TOKEN ;
    public final ChemicalChunkerParser.inas_return inas() throws RecognitionException {
        ChemicalChunkerParser.inas_return retval = new ChemicalChunkerParser.inas_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal175=null;
        Token TOKEN176=null;

        Object string_literal175_tree=null;
        Object TOKEN176_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inas");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:125:5: ( 'IN-AS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:125:6: 'IN-AS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(125,6);
            string_literal175=(Token)match(input,15,FOLLOW_15_in_inas1065); 
            string_literal175_tree = (Object)adaptor.create(string_literal175);
            adaptor.addChild(root_0, string_literal175_tree);

            dbg.location(125,14);
            TOKEN176=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inas1067); 
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
        dbg.location(125, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:1: inbefore : 'IN-BEFORE' TOKEN ;
    public final ChemicalChunkerParser.inbefore_return inbefore() throws RecognitionException {
        ChemicalChunkerParser.inbefore_return retval = new ChemicalChunkerParser.inbefore_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal177=null;
        Token TOKEN178=null;

        Object string_literal177_tree=null;
        Object TOKEN178_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inbefore");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:9: ( 'IN-BEFORE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:126:10: 'IN-BEFORE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(126,10);
            string_literal177=(Token)match(input,16,FOLLOW_16_in_inbefore1072); 
            string_literal177_tree = (Object)adaptor.create(string_literal177);
            adaptor.addChild(root_0, string_literal177_tree);

            dbg.location(126,22);
            TOKEN178=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inbefore1074); 
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
        dbg.location(126, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:1: inafter : 'IN-AFTER' TOKEN ;
    public final ChemicalChunkerParser.inafter_return inafter() throws RecognitionException {
        ChemicalChunkerParser.inafter_return retval = new ChemicalChunkerParser.inafter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal179=null;
        Token TOKEN180=null;

        Object string_literal179_tree=null;
        Object TOKEN180_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inafter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:8: ( 'IN-AFTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:127:9: 'IN-AFTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(127,9);
            string_literal179=(Token)match(input,17,FOLLOW_17_in_inafter1079); 
            string_literal179_tree = (Object)adaptor.create(string_literal179);
            adaptor.addChild(root_0, string_literal179_tree);

            dbg.location(127,20);
            TOKEN180=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inafter1081); 
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
        dbg.location(127, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:1: inin : 'IN-IN' TOKEN ;
    public final ChemicalChunkerParser.inin_return inin() throws RecognitionException {
        ChemicalChunkerParser.inin_return retval = new ChemicalChunkerParser.inin_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal181=null;
        Token TOKEN182=null;

        Object string_literal181_tree=null;
        Object TOKEN182_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inin");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:5: ( 'IN-IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:128:6: 'IN-IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,6);
            string_literal181=(Token)match(input,18,FOLLOW_18_in_inin1086); 
            string_literal181_tree = (Object)adaptor.create(string_literal181);
            adaptor.addChild(root_0, string_literal181_tree);

            dbg.location(128,14);
            TOKEN182=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inin1088); 
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
        dbg.location(128, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:1: ininto : 'IN-INTO' TOKEN ;
    public final ChemicalChunkerParser.ininto_return ininto() throws RecognitionException {
        ChemicalChunkerParser.ininto_return retval = new ChemicalChunkerParser.ininto_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal183=null;
        Token TOKEN184=null;

        Object string_literal183_tree=null;
        Object TOKEN184_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ininto");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:7: ( 'IN-INTO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:129:8: 'IN-INTO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(129,8);
            string_literal183=(Token)match(input,19,FOLLOW_19_in_ininto1093); 
            string_literal183_tree = (Object)adaptor.create(string_literal183);
            adaptor.addChild(root_0, string_literal183_tree);

            dbg.location(129,18);
            TOKEN184=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ininto1095); 
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
        dbg.location(129, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:1: inwith : 'IN-WITH' TOKEN ;
    public final ChemicalChunkerParser.inwith_return inwith() throws RecognitionException {
        ChemicalChunkerParser.inwith_return retval = new ChemicalChunkerParser.inwith_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal185=null;
        Token TOKEN186=null;

        Object string_literal185_tree=null;
        Object TOKEN186_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(130, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:7: ( 'IN-WITH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:130:8: 'IN-WITH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(130,8);
            string_literal185=(Token)match(input,20,FOLLOW_20_in_inwith1100); 
            string_literal185_tree = (Object)adaptor.create(string_literal185);
            adaptor.addChild(root_0, string_literal185_tree);

            dbg.location(130,18);
            TOKEN186=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwith1102); 
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
        dbg.location(130, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:1: inwithout : 'IN-WITHOUT' TOKEN ;
    public final ChemicalChunkerParser.inwithout_return inwithout() throws RecognitionException {
        ChemicalChunkerParser.inwithout_return retval = new ChemicalChunkerParser.inwithout_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal187=null;
        Token TOKEN188=null;

        Object string_literal187_tree=null;
        Object TOKEN188_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwithout");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:10: ( 'IN-WITHOUT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:131:11: 'IN-WITHOUT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(131,11);
            string_literal187=(Token)match(input,21,FOLLOW_21_in_inwithout1107); 
            string_literal187_tree = (Object)adaptor.create(string_literal187);
            adaptor.addChild(root_0, string_literal187_tree);

            dbg.location(131,24);
            TOKEN188=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwithout1109); 
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
        dbg.location(131, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:1: inby : 'IN-BY' TOKEN ;
    public final ChemicalChunkerParser.inby_return inby() throws RecognitionException {
        ChemicalChunkerParser.inby_return retval = new ChemicalChunkerParser.inby_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal189=null;
        Token TOKEN190=null;

        Object string_literal189_tree=null;
        Object TOKEN190_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inby");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:5: ( 'IN-BY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:132:6: 'IN-BY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(132,6);
            string_literal189=(Token)match(input,22,FOLLOW_22_in_inby1114); 
            string_literal189_tree = (Object)adaptor.create(string_literal189);
            adaptor.addChild(root_0, string_literal189_tree);

            dbg.location(132,14);
            TOKEN190=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inby1116); 
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
        dbg.location(132, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:1: invia : 'IN-VIA' TOKEN ;
    public final ChemicalChunkerParser.invia_return invia() throws RecognitionException {
        ChemicalChunkerParser.invia_return retval = new ChemicalChunkerParser.invia_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal191=null;
        Token TOKEN192=null;

        Object string_literal191_tree=null;
        Object TOKEN192_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "invia");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:6: ( 'IN-VIA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:133:7: 'IN-VIA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(133,7);
            string_literal191=(Token)match(input,23,FOLLOW_23_in_invia1121); 
            string_literal191_tree = (Object)adaptor.create(string_literal191);
            adaptor.addChild(root_0, string_literal191_tree);

            dbg.location(133,16);
            TOKEN192=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_invia1123); 
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
        dbg.location(133, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:1: inof : 'IN-OF' TOKEN ;
    public final ChemicalChunkerParser.inof_return inof() throws RecognitionException {
        ChemicalChunkerParser.inof_return retval = new ChemicalChunkerParser.inof_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal193=null;
        Token TOKEN194=null;

        Object string_literal193_tree=null;
        Object TOKEN194_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inof");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:5: ( 'IN-OF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:134:6: 'IN-OF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(134,6);
            string_literal193=(Token)match(input,24,FOLLOW_24_in_inof1128); 
            string_literal193_tree = (Object)adaptor.create(string_literal193);
            adaptor.addChild(root_0, string_literal193_tree);

            dbg.location(134,14);
            TOKEN194=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inof1130); 
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
        dbg.location(134, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:1: inon : 'IN-ON' TOKEN ;
    public final ChemicalChunkerParser.inon_return inon() throws RecognitionException {
        ChemicalChunkerParser.inon_return retval = new ChemicalChunkerParser.inon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal195=null;
        Token TOKEN196=null;

        Object string_literal195_tree=null;
        Object TOKEN196_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:5: ( 'IN-ON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:135:6: 'IN-ON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(135,6);
            string_literal195=(Token)match(input,25,FOLLOW_25_in_inon1135); 
            string_literal195_tree = (Object)adaptor.create(string_literal195);
            adaptor.addChild(root_0, string_literal195_tree);

            dbg.location(135,14);
            TOKEN196=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inon1137); 
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
        dbg.location(135, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:1: infor : 'IN-FOR' TOKEN ;
    public final ChemicalChunkerParser.infor_return infor() throws RecognitionException {
        ChemicalChunkerParser.infor_return retval = new ChemicalChunkerParser.infor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal197=null;
        Token TOKEN198=null;

        Object string_literal197_tree=null;
        Object TOKEN198_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:6: ( 'IN-FOR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:136:7: 'IN-FOR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(136,7);
            string_literal197=(Token)match(input,26,FOLLOW_26_in_infor1142); 
            string_literal197_tree = (Object)adaptor.create(string_literal197);
            adaptor.addChild(root_0, string_literal197_tree);

            dbg.location(136,16);
            TOKEN198=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infor1144); 
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
        dbg.location(136, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:1: infrom : 'IN-FROM' TOKEN ;
    public final ChemicalChunkerParser.infrom_return infrom() throws RecognitionException {
        ChemicalChunkerParser.infrom_return retval = new ChemicalChunkerParser.infrom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal199=null;
        Token TOKEN200=null;

        Object string_literal199_tree=null;
        Object TOKEN200_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infrom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:7: ( 'IN-FROM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:137:8: 'IN-FROM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(137,8);
            string_literal199=(Token)match(input,27,FOLLOW_27_in_infrom1149); 
            string_literal199_tree = (Object)adaptor.create(string_literal199);
            adaptor.addChild(root_0, string_literal199_tree);

            dbg.location(137,18);
            TOKEN200=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infrom1151); 
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
        dbg.location(137, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:1: inunder : 'IN-UNDER' TOKEN ;
    public final ChemicalChunkerParser.inunder_return inunder() throws RecognitionException {
        ChemicalChunkerParser.inunder_return retval = new ChemicalChunkerParser.inunder_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal201=null;
        Token TOKEN202=null;

        Object string_literal201_tree=null;
        Object TOKEN202_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inunder");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:8: ( 'IN-UNDER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:138:9: 'IN-UNDER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(138,9);
            string_literal201=(Token)match(input,28,FOLLOW_28_in_inunder1156); 
            string_literal201_tree = (Object)adaptor.create(string_literal201);
            adaptor.addChild(root_0, string_literal201_tree);

            dbg.location(138,20);
            TOKEN202=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inunder1158); 
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
        dbg.location(138, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:1: inover : 'IN-OVER' TOKEN ;
    public final ChemicalChunkerParser.inover_return inover() throws RecognitionException {
        ChemicalChunkerParser.inover_return retval = new ChemicalChunkerParser.inover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal203=null;
        Token TOKEN204=null;

        Object string_literal203_tree=null;
        Object TOKEN204_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:7: ( 'IN-OVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:139:8: 'IN-OVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,8);
            string_literal203=(Token)match(input,29,FOLLOW_29_in_inover1163); 
            string_literal203_tree = (Object)adaptor.create(string_literal203);
            adaptor.addChild(root_0, string_literal203_tree);

            dbg.location(139,18);
            TOKEN204=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inover1165); 
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
        dbg.location(139, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:1: inoff : 'IN-OFF' TOKEN ;
    public final ChemicalChunkerParser.inoff_return inoff() throws RecognitionException {
        ChemicalChunkerParser.inoff_return retval = new ChemicalChunkerParser.inoff_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal205=null;
        Token TOKEN206=null;

        Object string_literal205_tree=null;
        Object TOKEN206_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inoff");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:6: ( 'IN-OFF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:140:7: 'IN-OFF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(140,7);
            string_literal205=(Token)match(input,30,FOLLOW_30_in_inoff1170); 
            string_literal205_tree = (Object)adaptor.create(string_literal205);
            adaptor.addChild(root_0, string_literal205_tree);

            dbg.location(140,16);
            TOKEN206=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inoff1172); 
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
        dbg.location(140, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:143:1: nnstate : 'NN-STATE' TOKEN ;
    public final ChemicalChunkerParser.nnstate_return nnstate() throws RecognitionException {
        ChemicalChunkerParser.nnstate_return retval = new ChemicalChunkerParser.nnstate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal207=null;
        Token TOKEN208=null;

        Object string_literal207_tree=null;
        Object TOKEN208_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnstate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:143:8: ( 'NN-STATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:143:9: 'NN-STATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(143,9);
            string_literal207=(Token)match(input,31,FOLLOW_31_in_nnstate1179); 
            string_literal207_tree = (Object)adaptor.create(string_literal207);
            adaptor.addChild(root_0, string_literal207_tree);

            dbg.location(143,20);
            TOKEN208=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnstate1181); 
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
        dbg.location(143, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:144:1: nntime : 'NN-TIME' TOKEN ;
    public final ChemicalChunkerParser.nntime_return nntime() throws RecognitionException {
        ChemicalChunkerParser.nntime_return retval = new ChemicalChunkerParser.nntime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal209=null;
        Token TOKEN210=null;

        Object string_literal209_tree=null;
        Object TOKEN210_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:144:7: ( 'NN-TIME' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:144:8: 'NN-TIME' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(144,8);
            string_literal209=(Token)match(input,32,FOLLOW_32_in_nntime1186); 
            string_literal209_tree = (Object)adaptor.create(string_literal209);
            adaptor.addChild(root_0, string_literal209_tree);

            dbg.location(144,18);
            TOKEN210=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntime1188); 
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
        dbg.location(144, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:1: nngram : 'NN-GRAM' TOKEN ;
    public final ChemicalChunkerParser.nngram_return nngram() throws RecognitionException {
        ChemicalChunkerParser.nngram_return retval = new ChemicalChunkerParser.nngram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal211=null;
        Token TOKEN212=null;

        Object string_literal211_tree=null;
        Object TOKEN212_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:7: ( 'NN-GRAM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:145:8: 'NN-GRAM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(145,8);
            string_literal211=(Token)match(input,33,FOLLOW_33_in_nngram1193); 
            string_literal211_tree = (Object)adaptor.create(string_literal211);
            adaptor.addChild(root_0, string_literal211_tree);

            dbg.location(145,18);
            TOKEN212=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngram1195); 
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
        dbg.location(145, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:146:1: nnmol : 'NN-MOL' TOKEN ;
    public final ChemicalChunkerParser.nnmol_return nnmol() throws RecognitionException {
        ChemicalChunkerParser.nnmol_return retval = new ChemicalChunkerParser.nnmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal213=null;
        Token TOKEN214=null;

        Object string_literal213_tree=null;
        Object TOKEN214_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:146:6: ( 'NN-MOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:146:7: 'NN-MOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(146,7);
            string_literal213=(Token)match(input,34,FOLLOW_34_in_nnmol1200); 
            string_literal213_tree = (Object)adaptor.create(string_literal213);
            adaptor.addChild(root_0, string_literal213_tree);

            dbg.location(146,16);
            TOKEN214=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmol1202); 
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
        dbg.location(146, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:147:1: nnatmosphere : 'NN-ATMOSPHERE' TOKEN ;
    public final ChemicalChunkerParser.nnatmosphere_return nnatmosphere() throws RecognitionException {
        ChemicalChunkerParser.nnatmosphere_return retval = new ChemicalChunkerParser.nnatmosphere_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal215=null;
        Token TOKEN216=null;

        Object string_literal215_tree=null;
        Object TOKEN216_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnatmosphere");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:147:13: ( 'NN-ATMOSPHERE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:147:14: 'NN-ATMOSPHERE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(147,14);
            string_literal215=(Token)match(input,35,FOLLOW_35_in_nnatmosphere1207); 
            string_literal215_tree = (Object)adaptor.create(string_literal215);
            adaptor.addChild(root_0, string_literal215_tree);

            dbg.location(147,30);
            TOKEN216=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnatmosphere1209); 
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
        dbg.location(147, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:1: nneq : 'NN-EQ' TOKEN ;
    public final ChemicalChunkerParser.nneq_return nneq() throws RecognitionException {
        ChemicalChunkerParser.nneq_return retval = new ChemicalChunkerParser.nneq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal217=null;
        Token TOKEN218=null;

        Object string_literal217_tree=null;
        Object TOKEN218_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nneq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:5: ( 'NN-EQ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:148:6: 'NN-EQ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(148,6);
            string_literal217=(Token)match(input,36,FOLLOW_36_in_nneq1214); 
            string_literal217_tree = (Object)adaptor.create(string_literal217);
            adaptor.addChild(root_0, string_literal217_tree);

            dbg.location(148,14);
            TOKEN218=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nneq1216); 
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
        dbg.location(148, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:1: nnvol : 'NN-VOL' TOKEN ;
    public final ChemicalChunkerParser.nnvol_return nnvol() throws RecognitionException {
        ChemicalChunkerParser.nnvol_return retval = new ChemicalChunkerParser.nnvol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal219=null;
        Token TOKEN220=null;

        Object string_literal219_tree=null;
        Object TOKEN220_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:6: ( 'NN-VOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:149:7: 'NN-VOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(149,7);
            string_literal219=(Token)match(input,37,FOLLOW_37_in_nnvol1221); 
            string_literal219_tree = (Object)adaptor.create(string_literal219);
            adaptor.addChild(root_0, string_literal219_tree);

            dbg.location(149,16);
            TOKEN220=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvol1223); 
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
        dbg.location(149, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:1: nnchementity : 'NN-CHEMENTITY' TOKEN ;
    public final ChemicalChunkerParser.nnchementity_return nnchementity() throws RecognitionException {
        ChemicalChunkerParser.nnchementity_return retval = new ChemicalChunkerParser.nnchementity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal221=null;
        Token TOKEN222=null;

        Object string_literal221_tree=null;
        Object TOKEN222_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchementity");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:13: ( 'NN-CHEMENTITY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:150:14: 'NN-CHEMENTITY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(150,14);
            string_literal221=(Token)match(input,38,FOLLOW_38_in_nnchementity1228); 
            string_literal221_tree = (Object)adaptor.create(string_literal221);
            adaptor.addChild(root_0, string_literal221_tree);

            dbg.location(150,30);
            TOKEN222=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchementity1230); 
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
        dbg.location(150, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:1: nntemp : 'NN-TEMP' TOKEN ;
    public final ChemicalChunkerParser.nntemp_return nntemp() throws RecognitionException {
        ChemicalChunkerParser.nntemp_return retval = new ChemicalChunkerParser.nntemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal223=null;
        Token TOKEN224=null;

        Object string_literal223_tree=null;
        Object TOKEN224_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:7: ( 'NN-TEMP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:151:8: 'NN-TEMP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(151,8);
            string_literal223=(Token)match(input,39,FOLLOW_39_in_nntemp1235); 
            string_literal223_tree = (Object)adaptor.create(string_literal223);
            adaptor.addChild(root_0, string_literal223_tree);

            dbg.location(151,18);
            TOKEN224=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntemp1237); 
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
        dbg.location(151, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:152:1: nnflash : 'NN-FLASH' TOKEN ;
    public final ChemicalChunkerParser.nnflash_return nnflash() throws RecognitionException {
        ChemicalChunkerParser.nnflash_return retval = new ChemicalChunkerParser.nnflash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal225=null;
        Token TOKEN226=null;

        Object string_literal225_tree=null;
        Object TOKEN226_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnflash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:152:8: ( 'NN-FLASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:152:9: 'NN-FLASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(152,9);
            string_literal225=(Token)match(input,40,FOLLOW_40_in_nnflash1242); 
            string_literal225_tree = (Object)adaptor.create(string_literal225);
            adaptor.addChild(root_0, string_literal225_tree);

            dbg.location(152,20);
            TOKEN226=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnflash1244); 
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
        dbg.location(152, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:153:1: nngeneral : 'NN-GENERAL' TOKEN ;
    public final ChemicalChunkerParser.nngeneral_return nngeneral() throws RecognitionException {
        ChemicalChunkerParser.nngeneral_return retval = new ChemicalChunkerParser.nngeneral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal227=null;
        Token TOKEN228=null;

        Object string_literal227_tree=null;
        Object TOKEN228_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngeneral");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:153:10: ( 'NN-GENERAL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:153:11: 'NN-GENERAL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(153,11);
            string_literal227=(Token)match(input,41,FOLLOW_41_in_nngeneral1249); 
            string_literal227_tree = (Object)adaptor.create(string_literal227);
            adaptor.addChild(root_0, string_literal227_tree);

            dbg.location(153,24);
            TOKEN228=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngeneral1251); 
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
        dbg.location(153, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:1: nnmethod : 'NN-METHOD' TOKEN ;
    public final ChemicalChunkerParser.nnmethod_return nnmethod() throws RecognitionException {
        ChemicalChunkerParser.nnmethod_return retval = new ChemicalChunkerParser.nnmethod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal229=null;
        Token TOKEN230=null;

        Object string_literal229_tree=null;
        Object TOKEN230_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmethod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:9: ( 'NN-METHOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:154:10: 'NN-METHOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(154,10);
            string_literal229=(Token)match(input,42,FOLLOW_42_in_nnmethod1256); 
            string_literal229_tree = (Object)adaptor.create(string_literal229);
            adaptor.addChild(root_0, string_literal229_tree);

            dbg.location(154,22);
            TOKEN230=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmethod1258); 
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
        dbg.location(154, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:1: nnamount : 'NN-AMOUNT' TOKEN ;
    public final ChemicalChunkerParser.nnamount_return nnamount() throws RecognitionException {
        ChemicalChunkerParser.nnamount_return retval = new ChemicalChunkerParser.nnamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal231=null;
        Token TOKEN232=null;

        Object string_literal231_tree=null;
        Object TOKEN232_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:9: ( 'NN-AMOUNT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:155:10: 'NN-AMOUNT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(155,10);
            string_literal231=(Token)match(input,43,FOLLOW_43_in_nnamount1263); 
            string_literal231_tree = (Object)adaptor.create(string_literal231);
            adaptor.addChild(root_0, string_literal231_tree);

            dbg.location(155,22);
            TOKEN232=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnamount1265); 
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
        dbg.location(155, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:1: nnpressure : 'NN-PRESSURE' TOKEN ;
    public final ChemicalChunkerParser.nnpressure_return nnpressure() throws RecognitionException {
        ChemicalChunkerParser.nnpressure_return retval = new ChemicalChunkerParser.nnpressure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal233=null;
        Token TOKEN234=null;

        Object string_literal233_tree=null;
        Object TOKEN234_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpressure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:11: ( 'NN-PRESSURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:156:12: 'NN-PRESSURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,12);
            string_literal233=(Token)match(input,44,FOLLOW_44_in_nnpressure1270); 
            string_literal233_tree = (Object)adaptor.create(string_literal233);
            adaptor.addChild(root_0, string_literal233_tree);

            dbg.location(156,26);
            TOKEN234=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpressure1272); 
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
        dbg.location(156, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:1: nncolumn : 'NN-COLUMN' TOKEN ;
    public final ChemicalChunkerParser.nncolumn_return nncolumn() throws RecognitionException {
        ChemicalChunkerParser.nncolumn_return retval = new ChemicalChunkerParser.nncolumn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal235=null;
        Token TOKEN236=null;

        Object string_literal235_tree=null;
        Object TOKEN236_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncolumn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:9: ( 'NN-COLUMN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:157:10: 'NN-COLUMN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(157,10);
            string_literal235=(Token)match(input,45,FOLLOW_45_in_nncolumn1277); 
            string_literal235_tree = (Object)adaptor.create(string_literal235);
            adaptor.addChild(root_0, string_literal235_tree);

            dbg.location(157,22);
            TOKEN236=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncolumn1279); 
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
        dbg.location(157, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:1: nnchromatography : 'NN-CHROMATOGRAPHY' TOKEN ;
    public final ChemicalChunkerParser.nnchromatography_return nnchromatography() throws RecognitionException {
        ChemicalChunkerParser.nnchromatography_return retval = new ChemicalChunkerParser.nnchromatography_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal237=null;
        Token TOKEN238=null;

        Object string_literal237_tree=null;
        Object TOKEN238_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchromatography");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:17: ( 'NN-CHROMATOGRAPHY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:158:18: 'NN-CHROMATOGRAPHY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(158,18);
            string_literal237=(Token)match(input,46,FOLLOW_46_in_nnchromatography1284); 
            string_literal237_tree = (Object)adaptor.create(string_literal237);
            adaptor.addChild(root_0, string_literal237_tree);

            dbg.location(158,38);
            TOKEN238=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchromatography1286); 
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
        dbg.location(158, 43);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:1: nnvacuum : 'NN-VACUUM' TOKEN ;
    public final ChemicalChunkerParser.nnvacuum_return nnvacuum() throws RecognitionException {
        ChemicalChunkerParser.nnvacuum_return retval = new ChemicalChunkerParser.nnvacuum_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal239=null;
        Token TOKEN240=null;

        Object string_literal239_tree=null;
        Object TOKEN240_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvacuum");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:9: ( 'NN-VACUUM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:159:10: 'NN-VACUUM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(159,10);
            string_literal239=(Token)match(input,47,FOLLOW_47_in_nnvacuum1291); 
            string_literal239_tree = (Object)adaptor.create(string_literal239);
            adaptor.addChild(root_0, string_literal239_tree);

            dbg.location(159,22);
            TOKEN240=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvacuum1293); 
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
        dbg.location(159, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:1: nncycle : 'NN-CYCLE' TOKEN ;
    public final ChemicalChunkerParser.nncycle_return nncycle() throws RecognitionException {
        ChemicalChunkerParser.nncycle_return retval = new ChemicalChunkerParser.nncycle_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal241=null;
        Token TOKEN242=null;

        Object string_literal241_tree=null;
        Object TOKEN242_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncycle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:8: ( 'NN-CYCLE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:160:9: 'NN-CYCLE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(160,9);
            string_literal241=(Token)match(input,48,FOLLOW_48_in_nncycle1298); 
            string_literal241_tree = (Object)adaptor.create(string_literal241);
            adaptor.addChild(root_0, string_literal241_tree);

            dbg.location(160,20);
            TOKEN242=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncycle1300); 
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
        dbg.location(160, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:1: nntimes : 'NN-TIMES' TOKEN ;
    public final ChemicalChunkerParser.nntimes_return nntimes() throws RecognitionException {
        ChemicalChunkerParser.nntimes_return retval = new ChemicalChunkerParser.nntimes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal243=null;
        Token TOKEN244=null;

        Object string_literal243_tree=null;
        Object TOKEN244_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntimes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:8: ( 'NN-TIMES' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:161:9: 'NN-TIMES' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(161,9);
            string_literal243=(Token)match(input,49,FOLLOW_49_in_nntimes1305); 
            string_literal243_tree = (Object)adaptor.create(string_literal243);
            adaptor.addChild(root_0, string_literal243_tree);

            dbg.location(161,20);
            TOKEN244=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntimes1307); 
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
        dbg.location(161, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:164:1: oscarcm : 'OSCAR-CM' TOKEN ;
    public final ChemicalChunkerParser.oscarcm_return oscarcm() throws RecognitionException {
        ChemicalChunkerParser.oscarcm_return retval = new ChemicalChunkerParser.oscarcm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal245=null;
        Token TOKEN246=null;

        Object string_literal245_tree=null;
        Object TOKEN246_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(164, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:164:8: ( 'OSCAR-CM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:164:9: 'OSCAR-CM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(164,9);
            string_literal245=(Token)match(input,50,FOLLOW_50_in_oscarcm1314); 
            string_literal245_tree = (Object)adaptor.create(string_literal245);
            adaptor.addChild(root_0, string_literal245_tree);

            dbg.location(164,20);
            TOKEN246=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcm1316); 
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
        dbg.location(164, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:167:1: vbuse : 'VB-USE' TOKEN ;
    public final ChemicalChunkerParser.vbuse_return vbuse() throws RecognitionException {
        ChemicalChunkerParser.vbuse_return retval = new ChemicalChunkerParser.vbuse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal247=null;
        Token TOKEN248=null;

        Object string_literal247_tree=null;
        Object TOKEN248_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbuse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(167, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:167:6: ( 'VB-USE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:167:7: 'VB-USE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(167,7);
            string_literal247=(Token)match(input,51,FOLLOW_51_in_vbuse1323); 
            string_literal247_tree = (Object)adaptor.create(string_literal247);
            adaptor.addChild(root_0, string_literal247_tree);

            dbg.location(167,16);
            TOKEN248=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbuse1325); 
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
        dbg.location(167, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:168:1: vbchange : 'VB-CHANGE' TOKEN ;
    public final ChemicalChunkerParser.vbchange_return vbchange() throws RecognitionException {
        ChemicalChunkerParser.vbchange_return retval = new ChemicalChunkerParser.vbchange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal249=null;
        Token TOKEN250=null;

        Object string_literal249_tree=null;
        Object TOKEN250_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbchange");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:168:9: ( 'VB-CHANGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:168:10: 'VB-CHANGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(168,10);
            string_literal249=(Token)match(input,52,FOLLOW_52_in_vbchange1330); 
            string_literal249_tree = (Object)adaptor.create(string_literal249);
            adaptor.addChild(root_0, string_literal249_tree);

            dbg.location(168,22);
            TOKEN250=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbchange1332); 
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
        dbg.location(168, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:1: vbsubmerge : 'VB-SUBMERGE' TOKEN ;
    public final ChemicalChunkerParser.vbsubmerge_return vbsubmerge() throws RecognitionException {
        ChemicalChunkerParser.vbsubmerge_return retval = new ChemicalChunkerParser.vbsubmerge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal251=null;
        Token TOKEN252=null;

        Object string_literal251_tree=null;
        Object TOKEN252_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubmerge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:11: ( 'VB-SUBMERGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:169:12: 'VB-SUBMERGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(169,12);
            string_literal251=(Token)match(input,53,FOLLOW_53_in_vbsubmerge1337); 
            string_literal251_tree = (Object)adaptor.create(string_literal251);
            adaptor.addChild(root_0, string_literal251_tree);

            dbg.location(169,26);
            TOKEN252=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubmerge1339); 
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
        dbg.location(169, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:1: vbsubject : 'VB-SUBJECT' TOKEN ;
    public final ChemicalChunkerParser.vbsubject_return vbsubject() throws RecognitionException {
        ChemicalChunkerParser.vbsubject_return retval = new ChemicalChunkerParser.vbsubject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal253=null;
        Token TOKEN254=null;

        Object string_literal253_tree=null;
        Object TOKEN254_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubject");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:10: ( 'VB-SUBJECT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:170:11: 'VB-SUBJECT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(170,11);
            string_literal253=(Token)match(input,54,FOLLOW_54_in_vbsubject1344); 
            string_literal253_tree = (Object)adaptor.create(string_literal253);
            adaptor.addChild(root_0, string_literal253_tree);

            dbg.location(170,24);
            TOKEN254=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubject1346); 
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
        dbg.location(170, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:173:1: nnadd : 'NN-ADD' TOKEN ;
    public final ChemicalChunkerParser.nnadd_return nnadd() throws RecognitionException {
        ChemicalChunkerParser.nnadd_return retval = new ChemicalChunkerParser.nnadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal255=null;
        Token TOKEN256=null;

        Object string_literal255_tree=null;
        Object TOKEN256_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:173:6: ( 'NN-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:173:7: 'NN-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(173,7);
            string_literal255=(Token)match(input,55,FOLLOW_55_in_nnadd1353); 
            string_literal255_tree = (Object)adaptor.create(string_literal255);
            adaptor.addChild(root_0, string_literal255_tree);

            dbg.location(173,16);
            TOKEN256=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnadd1355); 
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
        dbg.location(173, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:174:1: nnmixture : 'NN-MIXTURE' TOKEN ;
    public final ChemicalChunkerParser.nnmixture_return nnmixture() throws RecognitionException {
        ChemicalChunkerParser.nnmixture_return retval = new ChemicalChunkerParser.nnmixture_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal257=null;
        Token TOKEN258=null;

        Object string_literal257_tree=null;
        Object TOKEN258_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(174, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:174:10: ( 'NN-MIXTURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:174:11: 'NN-MIXTURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(174,11);
            string_literal257=(Token)match(input,56,FOLLOW_56_in_nnmixture1360); 
            string_literal257_tree = (Object)adaptor.create(string_literal257);
            adaptor.addChild(root_0, string_literal257_tree);

            dbg.location(174,24);
            TOKEN258=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmixture1362); 
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
        dbg.location(174, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:175:1: vbadd : 'VB-ADD' TOKEN ;
    public final ChemicalChunkerParser.vbadd_return vbadd() throws RecognitionException {
        ChemicalChunkerParser.vbadd_return retval = new ChemicalChunkerParser.vbadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal259=null;
        Token TOKEN260=null;

        Object string_literal259_tree=null;
        Object TOKEN260_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:175:6: ( 'VB-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:175:7: 'VB-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(175,7);
            string_literal259=(Token)match(input,57,FOLLOW_57_in_vbadd1367); 
            string_literal259_tree = (Object)adaptor.create(string_literal259);
            adaptor.addChild(root_0, string_literal259_tree);

            dbg.location(175,16);
            TOKEN260=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbadd1369); 
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
        dbg.location(175, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:1: vbcharge : 'VB-CHARGE' TOKEN ;
    public final ChemicalChunkerParser.vbcharge_return vbcharge() throws RecognitionException {
        ChemicalChunkerParser.vbcharge_return retval = new ChemicalChunkerParser.vbcharge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal261=null;
        Token TOKEN262=null;

        Object string_literal261_tree=null;
        Object TOKEN262_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcharge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:9: ( 'VB-CHARGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:176:10: 'VB-CHARGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(176,10);
            string_literal261=(Token)match(input,58,FOLLOW_58_in_vbcharge1374); 
            string_literal261_tree = (Object)adaptor.create(string_literal261);
            adaptor.addChild(root_0, string_literal261_tree);

            dbg.location(176,22);
            TOKEN262=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcharge1376); 
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
        dbg.location(176, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:177:1: vbcontain : 'VB-CONTAIN' TOKEN ;
    public final ChemicalChunkerParser.vbcontain_return vbcontain() throws RecognitionException {
        ChemicalChunkerParser.vbcontain_return retval = new ChemicalChunkerParser.vbcontain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal263=null;
        Token TOKEN264=null;

        Object string_literal263_tree=null;
        Object TOKEN264_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcontain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:177:10: ( 'VB-CONTAIN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:177:11: 'VB-CONTAIN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(177,11);
            string_literal263=(Token)match(input,59,FOLLOW_59_in_vbcontain1381); 
            string_literal263_tree = (Object)adaptor.create(string_literal263);
            adaptor.addChild(root_0, string_literal263_tree);

            dbg.location(177,24);
            TOKEN264=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcontain1383); 
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
        dbg.location(177, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:178:1: vbdrop : 'VB-DROP' TOKEN ;
    public final ChemicalChunkerParser.vbdrop_return vbdrop() throws RecognitionException {
        ChemicalChunkerParser.vbdrop_return retval = new ChemicalChunkerParser.vbdrop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal265=null;
        Token TOKEN266=null;

        Object string_literal265_tree=null;
        Object TOKEN266_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdrop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:178:7: ( 'VB-DROP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:178:8: 'VB-DROP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(178,8);
            string_literal265=(Token)match(input,60,FOLLOW_60_in_vbdrop1388); 
            string_literal265_tree = (Object)adaptor.create(string_literal265);
            adaptor.addChild(root_0, string_literal265_tree);

            dbg.location(178,18);
            TOKEN266=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdrop1390); 
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
        dbg.location(178, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:1: vbfill : 'VB-FILL' TOKEN ;
    public final ChemicalChunkerParser.vbfill_return vbfill() throws RecognitionException {
        ChemicalChunkerParser.vbfill_return retval = new ChemicalChunkerParser.vbfill_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal267=null;
        Token TOKEN268=null;

        Object string_literal267_tree=null;
        Object TOKEN268_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfill");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:7: ( 'VB-FILL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:179:8: 'VB-FILL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(179,8);
            string_literal267=(Token)match(input,61,FOLLOW_61_in_vbfill1395); 
            string_literal267_tree = (Object)adaptor.create(string_literal267);
            adaptor.addChild(root_0, string_literal267_tree);

            dbg.location(179,18);
            TOKEN268=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfill1397); 
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
        dbg.location(179, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:180:1: vbsuspend : 'VB-SUSPEND' TOKEN ;
    public final ChemicalChunkerParser.vbsuspend_return vbsuspend() throws RecognitionException {
        ChemicalChunkerParser.vbsuspend_return retval = new ChemicalChunkerParser.vbsuspend_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal269=null;
        Token TOKEN270=null;

        Object string_literal269_tree=null;
        Object TOKEN270_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsuspend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:180:10: ( 'VB-SUSPEND' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:180:11: 'VB-SUSPEND' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(180,11);
            string_literal269=(Token)match(input,62,FOLLOW_62_in_vbsuspend1402); 
            string_literal269_tree = (Object)adaptor.create(string_literal269);
            adaptor.addChild(root_0, string_literal269_tree);

            dbg.location(180,24);
            TOKEN270=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsuspend1404); 
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
        dbg.location(180, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:181:1: vbtreat : 'VB-TREAT' TOKEN ;
    public final ChemicalChunkerParser.vbtreat_return vbtreat() throws RecognitionException {
        ChemicalChunkerParser.vbtreat_return retval = new ChemicalChunkerParser.vbtreat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal271=null;
        Token TOKEN272=null;

        Object string_literal271_tree=null;
        Object TOKEN272_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtreat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(181, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:181:8: ( 'VB-TREAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:181:9: 'VB-TREAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(181,9);
            string_literal271=(Token)match(input,63,FOLLOW_63_in_vbtreat1409); 
            string_literal271_tree = (Object)adaptor.create(string_literal271);
            adaptor.addChild(root_0, string_literal271_tree);

            dbg.location(181,20);
            TOKEN272=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtreat1411); 
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
        dbg.location(181, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:184:1: vbapparatus : 'VB-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.vbapparatus_return vbapparatus() throws RecognitionException {
        ChemicalChunkerParser.vbapparatus_return retval = new ChemicalChunkerParser.vbapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal273=null;
        Token TOKEN274=null;

        Object string_literal273_tree=null;
        Object TOKEN274_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:184:12: ( 'VB-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:184:13: 'VB-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(184,13);
            string_literal273=(Token)match(input,64,FOLLOW_64_in_vbapparatus1418); 
            string_literal273_tree = (Object)adaptor.create(string_literal273);
            adaptor.addChild(root_0, string_literal273_tree);

            dbg.location(184,28);
            TOKEN274=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbapparatus1420); 
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
        dbg.location(184, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:185:1: nnapparatus : 'NN-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.nnapparatus_return nnapparatus() throws RecognitionException {
        ChemicalChunkerParser.nnapparatus_return retval = new ChemicalChunkerParser.nnapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal275=null;
        Token TOKEN276=null;

        Object string_literal275_tree=null;
        Object TOKEN276_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:185:12: ( 'NN-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:185:13: 'NN-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(185,13);
            string_literal275=(Token)match(input,65,FOLLOW_65_in_nnapparatus1425); 
            string_literal275_tree = (Object)adaptor.create(string_literal275);
            adaptor.addChild(root_0, string_literal275_tree);

            dbg.location(185,28);
            TOKEN276=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnapparatus1427); 
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
        dbg.location(185, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:188:1: vbconcentrate : 'VB-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.vbconcentrate_return vbconcentrate() throws RecognitionException {
        ChemicalChunkerParser.vbconcentrate_return retval = new ChemicalChunkerParser.vbconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal277=null;
        Token TOKEN278=null;

        Object string_literal277_tree=null;
        Object TOKEN278_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(188, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:188:14: ( 'VB-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:188:15: 'VB-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(188,15);
            string_literal277=(Token)match(input,66,FOLLOW_66_in_vbconcentrate1434); 
            string_literal277_tree = (Object)adaptor.create(string_literal277);
            adaptor.addChild(root_0, string_literal277_tree);

            dbg.location(188,32);
            TOKEN278=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbconcentrate1436); 
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
        dbg.location(188, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:189:1: nnconcentrate : 'NN-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.nnconcentrate_return nnconcentrate() throws RecognitionException {
        ChemicalChunkerParser.nnconcentrate_return retval = new ChemicalChunkerParser.nnconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal279=null;
        Token TOKEN280=null;

        Object string_literal279_tree=null;
        Object TOKEN280_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:189:14: ( 'NN-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:189:15: 'NN-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(189,15);
            string_literal279=(Token)match(input,67,FOLLOW_67_in_nnconcentrate1441); 
            string_literal279_tree = (Object)adaptor.create(string_literal279);
            adaptor.addChild(root_0, string_literal279_tree);

            dbg.location(189,32);
            TOKEN280=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnconcentrate1443); 
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
        dbg.location(189, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:192:1: vbcool : 'VB-COOL' TOKEN ;
    public final ChemicalChunkerParser.vbcool_return vbcool() throws RecognitionException {
        ChemicalChunkerParser.vbcool_return retval = new ChemicalChunkerParser.vbcool_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal281=null;
        Token TOKEN282=null;

        Object string_literal281_tree=null;
        Object TOKEN282_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(192, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:192:7: ( 'VB-COOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:192:8: 'VB-COOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(192,8);
            string_literal281=(Token)match(input,68,FOLLOW_68_in_vbcool1450); 
            string_literal281_tree = (Object)adaptor.create(string_literal281);
            adaptor.addChild(root_0, string_literal281_tree);

            dbg.location(192,18);
            TOKEN282=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcool1452); 
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
        dbg.location(192, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:195:1: vbdegass : 'VB-DEGASS' TOKEN ;
    public final ChemicalChunkerParser.vbdegass_return vbdegass() throws RecognitionException {
        ChemicalChunkerParser.vbdegass_return retval = new ChemicalChunkerParser.vbdegass_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal283=null;
        Token TOKEN284=null;

        Object string_literal283_tree=null;
        Object TOKEN284_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdegass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(195, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:195:9: ( 'VB-DEGASS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:195:10: 'VB-DEGASS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(195,10);
            string_literal283=(Token)match(input,69,FOLLOW_69_in_vbdegass1459); 
            string_literal283_tree = (Object)adaptor.create(string_literal283);
            adaptor.addChild(root_0, string_literal283_tree);

            dbg.location(195,22);
            TOKEN284=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdegass1461); 
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
        dbg.location(195, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:198:1: vbdissolve : 'VB-DISSOLVE' TOKEN ;
    public final ChemicalChunkerParser.vbdissolve_return vbdissolve() throws RecognitionException {
        ChemicalChunkerParser.vbdissolve_return retval = new ChemicalChunkerParser.vbdissolve_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal285=null;
        Token TOKEN286=null;

        Object string_literal285_tree=null;
        Object TOKEN286_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdissolve");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(198, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:198:11: ( 'VB-DISSOLVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:198:12: 'VB-DISSOLVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(198,12);
            string_literal285=(Token)match(input,70,FOLLOW_70_in_vbdissolve1468); 
            string_literal285_tree = (Object)adaptor.create(string_literal285);
            adaptor.addChild(root_0, string_literal285_tree);

            dbg.location(198,26);
            TOKEN286=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdissolve1470); 
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
        dbg.location(198, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:201:1: vbdry : 'VB-DRY' TOKEN ;
    public final ChemicalChunkerParser.vbdry_return vbdry() throws RecognitionException {
        ChemicalChunkerParser.vbdry_return retval = new ChemicalChunkerParser.vbdry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal287=null;
        Token TOKEN288=null;

        Object string_literal287_tree=null;
        Object TOKEN288_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:201:6: ( 'VB-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:201:7: 'VB-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(201,7);
            string_literal287=(Token)match(input,71,FOLLOW_71_in_vbdry1477); 
            string_literal287_tree = (Object)adaptor.create(string_literal287);
            adaptor.addChild(root_0, string_literal287_tree);

            dbg.location(201,16);
            TOKEN288=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdry1479); 
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
        dbg.location(201, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:202:1: nndry : 'NN-DRY' TOKEN ;
    public final ChemicalChunkerParser.nndry_return nndry() throws RecognitionException {
        ChemicalChunkerParser.nndry_return retval = new ChemicalChunkerParser.nndry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal289=null;
        Token TOKEN290=null;

        Object string_literal289_tree=null;
        Object TOKEN290_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nndry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(202, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:202:6: ( 'NN-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:202:7: 'NN-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(202,7);
            string_literal289=(Token)match(input,72,FOLLOW_72_in_nndry1484); 
            string_literal289_tree = (Object)adaptor.create(string_literal289);
            adaptor.addChild(root_0, string_literal289_tree);

            dbg.location(202,16);
            TOKEN290=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nndry1486); 
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
        dbg.location(202, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:205:1: vbextract : 'VB-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.vbextract_return vbextract() throws RecognitionException {
        ChemicalChunkerParser.vbextract_return retval = new ChemicalChunkerParser.vbextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal291=null;
        Token TOKEN292=null;

        Object string_literal291_tree=null;
        Object TOKEN292_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(205, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:205:10: ( 'VB-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:205:11: 'VB-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(205,11);
            string_literal291=(Token)match(input,73,FOLLOW_73_in_vbextract1493); 
            string_literal291_tree = (Object)adaptor.create(string_literal291);
            adaptor.addChild(root_0, string_literal291_tree);

            dbg.location(205,24);
            TOKEN292=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbextract1495); 
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
        dbg.location(205, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:206:1: nnextract : 'NN-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.nnextract_return nnextract() throws RecognitionException {
        ChemicalChunkerParser.nnextract_return retval = new ChemicalChunkerParser.nnextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal293=null;
        Token TOKEN294=null;

        Object string_literal293_tree=null;
        Object TOKEN294_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(206, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:206:10: ( 'NN-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:206:11: 'NN-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(206,11);
            string_literal293=(Token)match(input,74,FOLLOW_74_in_nnextract1500); 
            string_literal293_tree = (Object)adaptor.create(string_literal293);
            adaptor.addChild(root_0, string_literal293_tree);

            dbg.location(206,24);
            TOKEN294=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnextract1502); 
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
        dbg.location(206, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:209:1: vbfilter : 'VB-FILTER' TOKEN ;
    public final ChemicalChunkerParser.vbfilter_return vbfilter() throws RecognitionException {
        ChemicalChunkerParser.vbfilter_return retval = new ChemicalChunkerParser.vbfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal295=null;
        Token TOKEN296=null;

        Object string_literal295_tree=null;
        Object TOKEN296_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(209, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:209:9: ( 'VB-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:209:10: 'VB-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(209,10);
            string_literal295=(Token)match(input,75,FOLLOW_75_in_vbfilter1509); 
            string_literal295_tree = (Object)adaptor.create(string_literal295);
            adaptor.addChild(root_0, string_literal295_tree);

            dbg.location(209,22);
            TOKEN296=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfilter1511); 
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
        dbg.location(209, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:210:1: nnfilter : 'NN-FILTER' TOKEN ;
    public final ChemicalChunkerParser.nnfilter_return nnfilter() throws RecognitionException {
        ChemicalChunkerParser.nnfilter_return retval = new ChemicalChunkerParser.nnfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal297=null;
        Token TOKEN298=null;

        Object string_literal297_tree=null;
        Object TOKEN298_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(210, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:210:9: ( 'NN-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:210:10: 'NN-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(210,10);
            string_literal297=(Token)match(input,76,FOLLOW_76_in_nnfilter1516); 
            string_literal297_tree = (Object)adaptor.create(string_literal297);
            adaptor.addChild(root_0, string_literal297_tree);

            dbg.location(210,22);
            TOKEN298=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnfilter1518); 
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
        dbg.location(210, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:213:1: vbheat : 'VB-HEAT' TOKEN ;
    public final ChemicalChunkerParser.vbheat_return vbheat() throws RecognitionException {
        ChemicalChunkerParser.vbheat_return retval = new ChemicalChunkerParser.vbheat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal299=null;
        Token TOKEN300=null;

        Object string_literal299_tree=null;
        Object TOKEN300_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbheat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(213, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:213:7: ( 'VB-HEAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:213:8: 'VB-HEAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(213,8);
            string_literal299=(Token)match(input,77,FOLLOW_77_in_vbheat1525); 
            string_literal299_tree = (Object)adaptor.create(string_literal299);
            adaptor.addChild(root_0, string_literal299_tree);

            dbg.location(213,18);
            TOKEN300=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbheat1527); 
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
        dbg.location(213, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:214:1: vbincrease : 'VB-INCREASE' TOKEN ;
    public final ChemicalChunkerParser.vbincrease_return vbincrease() throws RecognitionException {
        ChemicalChunkerParser.vbincrease_return retval = new ChemicalChunkerParser.vbincrease_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal301=null;
        Token TOKEN302=null;

        Object string_literal301_tree=null;
        Object TOKEN302_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbincrease");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(214, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:214:11: ( 'VB-INCREASE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:214:12: 'VB-INCREASE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(214,12);
            string_literal301=(Token)match(input,78,FOLLOW_78_in_vbincrease1532); 
            string_literal301_tree = (Object)adaptor.create(string_literal301);
            adaptor.addChild(root_0, string_literal301_tree);

            dbg.location(214,26);
            TOKEN302=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbincrease1534); 
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
        dbg.location(214, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:217:1: vbpartition : 'VB-PARTITION' TOKEN ;
    public final ChemicalChunkerParser.vbpartition_return vbpartition() throws RecognitionException {
        ChemicalChunkerParser.vbpartition_return retval = new ChemicalChunkerParser.vbpartition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal303=null;
        Token TOKEN304=null;

        Object string_literal303_tree=null;
        Object TOKEN304_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpartition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:217:12: ( 'VB-PARTITION' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:217:13: 'VB-PARTITION' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(217,13);
            string_literal303=(Token)match(input,79,FOLLOW_79_in_vbpartition1541); 
            string_literal303_tree = (Object)adaptor.create(string_literal303);
            adaptor.addChild(root_0, string_literal303_tree);

            dbg.location(217,28);
            TOKEN304=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpartition1543); 
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
        dbg.location(217, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:220:1: vbprecipitate : 'VB-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.vbprecipitate_return vbprecipitate() throws RecognitionException {
        ChemicalChunkerParser.vbprecipitate_return retval = new ChemicalChunkerParser.vbprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal305=null;
        Token TOKEN306=null;

        Object string_literal305_tree=null;
        Object TOKEN306_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(220, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:220:14: ( 'VB-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:220:15: 'VB-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(220,15);
            string_literal305=(Token)match(input,80,FOLLOW_80_in_vbprecipitate1550); 
            string_literal305_tree = (Object)adaptor.create(string_literal305);
            adaptor.addChild(root_0, string_literal305_tree);

            dbg.location(220,32);
            TOKEN306=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbprecipitate1552); 
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
        dbg.location(220, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:221:1: nnprecipitate : 'NN-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.nnprecipitate_return nnprecipitate() throws RecognitionException {
        ChemicalChunkerParser.nnprecipitate_return retval = new ChemicalChunkerParser.nnprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal307=null;
        Token TOKEN308=null;

        Object string_literal307_tree=null;
        Object TOKEN308_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:221:14: ( 'NN-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:221:15: 'NN-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(221,15);
            string_literal307=(Token)match(input,81,FOLLOW_81_in_nnprecipitate1557); 
            string_literal307_tree = (Object)adaptor.create(string_literal307);
            adaptor.addChild(root_0, string_literal307_tree);

            dbg.location(221,32);
            TOKEN308=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnprecipitate1559); 
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
        dbg.location(221, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:224:1: vbpurify : 'VB-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.vbpurify_return vbpurify() throws RecognitionException {
        ChemicalChunkerParser.vbpurify_return retval = new ChemicalChunkerParser.vbpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal309=null;
        Token TOKEN310=null;

        Object string_literal309_tree=null;
        Object TOKEN310_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(224, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:224:9: ( 'VB-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:224:10: 'VB-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(224,10);
            string_literal309=(Token)match(input,82,FOLLOW_82_in_vbpurify1566); 
            string_literal309_tree = (Object)adaptor.create(string_literal309);
            adaptor.addChild(root_0, string_literal309_tree);

            dbg.location(224,22);
            TOKEN310=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpurify1568); 
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
        dbg.location(224, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:225:1: nnpurify : 'NN-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.nnpurify_return nnpurify() throws RecognitionException {
        ChemicalChunkerParser.nnpurify_return retval = new ChemicalChunkerParser.nnpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal311=null;
        Token TOKEN312=null;

        Object string_literal311_tree=null;
        Object TOKEN312_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:225:9: ( 'NN-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:225:10: 'NN-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(225,10);
            string_literal311=(Token)match(input,83,FOLLOW_83_in_nnpurify1573); 
            string_literal311_tree = (Object)adaptor.create(string_literal311);
            adaptor.addChild(root_0, string_literal311_tree);

            dbg.location(225,22);
            TOKEN312=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpurify1575); 
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
        dbg.location(225, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:228:1: vbquench : 'VB-QUENCH' TOKEN ;
    public final ChemicalChunkerParser.vbquench_return vbquench() throws RecognitionException {
        ChemicalChunkerParser.vbquench_return retval = new ChemicalChunkerParser.vbquench_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal313=null;
        Token TOKEN314=null;

        Object string_literal313_tree=null;
        Object TOKEN314_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbquench");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:228:9: ( 'VB-QUENCH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:228:10: 'VB-QUENCH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(228,10);
            string_literal313=(Token)match(input,84,FOLLOW_84_in_vbquench1582); 
            string_literal313_tree = (Object)adaptor.create(string_literal313);
            adaptor.addChild(root_0, string_literal313_tree);

            dbg.location(228,22);
            TOKEN314=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbquench1584); 
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
        dbg.location(228, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:231:1: vbrecover : 'VB-RECOVER' TOKEN ;
    public final ChemicalChunkerParser.vbrecover_return vbrecover() throws RecognitionException {
        ChemicalChunkerParser.vbrecover_return retval = new ChemicalChunkerParser.vbrecover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal315=null;
        Token TOKEN316=null;

        Object string_literal315_tree=null;
        Object TOKEN316_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbrecover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(231, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:231:10: ( 'VB-RECOVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:231:11: 'VB-RECOVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(231,11);
            string_literal315=(Token)match(input,85,FOLLOW_85_in_vbrecover1591); 
            string_literal315_tree = (Object)adaptor.create(string_literal315);
            adaptor.addChild(root_0, string_literal315_tree);

            dbg.location(231,24);
            TOKEN316=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbrecover1593); 
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
        dbg.location(231, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:234:1: vbremove : 'VB-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.vbremove_return vbremove() throws RecognitionException {
        ChemicalChunkerParser.vbremove_return retval = new ChemicalChunkerParser.vbremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal317=null;
        Token TOKEN318=null;

        Object string_literal317_tree=null;
        Object TOKEN318_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(234, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:234:9: ( 'VB-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:234:10: 'VB-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(234,10);
            string_literal317=(Token)match(input,86,FOLLOW_86_in_vbremove1600); 
            string_literal317_tree = (Object)adaptor.create(string_literal317);
            adaptor.addChild(root_0, string_literal317_tree);

            dbg.location(234,22);
            TOKEN318=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbremove1602); 
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
        dbg.location(234, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:235:1: nnremove : 'NN-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.nnremove_return nnremove() throws RecognitionException {
        ChemicalChunkerParser.nnremove_return retval = new ChemicalChunkerParser.nnremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal319=null;
        Token TOKEN320=null;

        Object string_literal319_tree=null;
        Object TOKEN320_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(235, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:235:9: ( 'NN-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:235:10: 'NN-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(235,10);
            string_literal319=(Token)match(input,87,FOLLOW_87_in_nnremove1607); 
            string_literal319_tree = (Object)adaptor.create(string_literal319);
            adaptor.addChild(root_0, string_literal319_tree);

            dbg.location(235,22);
            TOKEN320=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnremove1609); 
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
        dbg.location(235, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:238:1: vbstir : 'VB-STIR' TOKEN ;
    public final ChemicalChunkerParser.vbstir_return vbstir() throws RecognitionException {
        ChemicalChunkerParser.vbstir_return retval = new ChemicalChunkerParser.vbstir_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal321=null;
        Token TOKEN322=null;

        Object string_literal321_tree=null;
        Object TOKEN322_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbstir");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:238:7: ( 'VB-STIR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:238:8: 'VB-STIR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(238,8);
            string_literal321=(Token)match(input,88,FOLLOW_88_in_vbstir1616); 
            string_literal321_tree = (Object)adaptor.create(string_literal321);
            adaptor.addChild(root_0, string_literal321_tree);

            dbg.location(238,18);
            TOKEN322=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbstir1618); 
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
        dbg.location(238, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:241:1: vbsynthesize : 'VB-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.vbsynthesize_return vbsynthesize() throws RecognitionException {
        ChemicalChunkerParser.vbsynthesize_return retval = new ChemicalChunkerParser.vbsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal323=null;
        Token TOKEN324=null;

        Object string_literal323_tree=null;
        Object TOKEN324_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(241, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:241:13: ( 'VB-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:241:14: 'VB-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(241,14);
            string_literal323=(Token)match(input,89,FOLLOW_89_in_vbsynthesize1625); 
            string_literal323_tree = (Object)adaptor.create(string_literal323);
            adaptor.addChild(root_0, string_literal323_tree);

            dbg.location(241,30);
            TOKEN324=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsynthesize1627); 
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
        dbg.location(241, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:242:1: nnsynthesize : 'NN-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.nnsynthesize_return nnsynthesize() throws RecognitionException {
        ChemicalChunkerParser.nnsynthesize_return retval = new ChemicalChunkerParser.nnsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal325=null;
        Token TOKEN326=null;

        Object string_literal325_tree=null;
        Object TOKEN326_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(242, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:242:13: ( 'NN-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:242:14: 'NN-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(242,14);
            string_literal325=(Token)match(input,90,FOLLOW_90_in_nnsynthesize1632); 
            string_literal325_tree = (Object)adaptor.create(string_literal325);
            adaptor.addChild(root_0, string_literal325_tree);

            dbg.location(242,30);
            TOKEN326=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnsynthesize1634); 
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
        dbg.location(242, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:245:1: vbwait : 'VB-WAIT' TOKEN ;
    public final ChemicalChunkerParser.vbwait_return vbwait() throws RecognitionException {
        ChemicalChunkerParser.vbwait_return retval = new ChemicalChunkerParser.vbwait_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal327=null;
        Token TOKEN328=null;

        Object string_literal327_tree=null;
        Object TOKEN328_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwait");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(245, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:245:7: ( 'VB-WAIT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:245:8: 'VB-WAIT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(245,8);
            string_literal327=(Token)match(input,91,FOLLOW_91_in_vbwait1641); 
            string_literal327_tree = (Object)adaptor.create(string_literal327);
            adaptor.addChild(root_0, string_literal327_tree);

            dbg.location(245,18);
            TOKEN328=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwait1643); 
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
        dbg.location(245, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:248:1: vbwash : 'VB-WASH' TOKEN ;
    public final ChemicalChunkerParser.vbwash_return vbwash() throws RecognitionException {
        ChemicalChunkerParser.vbwash_return retval = new ChemicalChunkerParser.vbwash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal329=null;
        Token TOKEN330=null;

        Object string_literal329_tree=null;
        Object TOKEN330_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(248, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:248:7: ( 'VB-WASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:248:8: 'VB-WASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(248,8);
            string_literal329=(Token)match(input,92,FOLLOW_92_in_vbwash1650); 
            string_literal329_tree = (Object)adaptor.create(string_literal329);
            adaptor.addChild(root_0, string_literal329_tree);

            dbg.location(248,18);
            TOKEN330=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwash1652); 
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
        dbg.location(248, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:251:1: vbyield : 'VB-YIELD' TOKEN ;
    public final ChemicalChunkerParser.vbyield_return vbyield() throws RecognitionException {
        ChemicalChunkerParser.vbyield_return retval = new ChemicalChunkerParser.vbyield_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal331=null;
        Token TOKEN332=null;

        Object string_literal331_tree=null;
        Object TOKEN332_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbyield");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(251, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:251:8: ( 'VB-YIELD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:251:9: 'VB-YIELD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(251,9);
            string_literal331=(Token)match(input,93,FOLLOW_93_in_vbyield1659); 
            string_literal331_tree = (Object)adaptor.create(string_literal331);
            adaptor.addChild(root_0, string_literal331_tree);

            dbg.location(251,20);
            TOKEN332=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbyield1661); 
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
        dbg.location(251, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:254:1: colon : 'COLON' TOKEN ;
    public final ChemicalChunkerParser.colon_return colon() throws RecognitionException {
        ChemicalChunkerParser.colon_return retval = new ChemicalChunkerParser.colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal333=null;
        Token TOKEN334=null;

        Object string_literal333_tree=null;
        Object TOKEN334_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(254, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:254:6: ( 'COLON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:254:7: 'COLON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(254,7);
            string_literal333=(Token)match(input,94,FOLLOW_94_in_colon1668); 
            string_literal333_tree = (Object)adaptor.create(string_literal333);
            adaptor.addChild(root_0, string_literal333_tree);

            dbg.location(254,15);
            TOKEN334=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_colon1670); 
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
        dbg.location(254, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:255:1: comma : 'COMMA' TOKEN ;
    public final ChemicalChunkerParser.comma_return comma() throws RecognitionException {
        ChemicalChunkerParser.comma_return retval = new ChemicalChunkerParser.comma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal335=null;
        Token TOKEN336=null;

        Object string_literal335_tree=null;
        Object TOKEN336_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(255, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:255:6: ( 'COMMA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:255:7: 'COMMA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(255,7);
            string_literal335=(Token)match(input,95,FOLLOW_95_in_comma1675); 
            string_literal335_tree = (Object)adaptor.create(string_literal335);
            adaptor.addChild(root_0, string_literal335_tree);

            dbg.location(255,15);
            TOKEN336=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_comma1677); 
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
        dbg.location(255, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:256:1: apost : 'APOST' TOKEN ;
    public final ChemicalChunkerParser.apost_return apost() throws RecognitionException {
        ChemicalChunkerParser.apost_return retval = new ChemicalChunkerParser.apost_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal337=null;
        Token TOKEN338=null;

        Object string_literal337_tree=null;
        Object TOKEN338_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "apost");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(256, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:256:6: ( 'APOST' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:256:7: 'APOST' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(256,7);
            string_literal337=(Token)match(input,96,FOLLOW_96_in_apost1682); 
            string_literal337_tree = (Object)adaptor.create(string_literal337);
            adaptor.addChild(root_0, string_literal337_tree);

            dbg.location(256,15);
            TOKEN338=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_apost1684); 
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
        dbg.location(256, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:257:1: neg : 'NEG' TOKEN ;
    public final ChemicalChunkerParser.neg_return neg() throws RecognitionException {
        ChemicalChunkerParser.neg_return retval = new ChemicalChunkerParser.neg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal339=null;
        Token TOKEN340=null;

        Object string_literal339_tree=null;
        Object TOKEN340_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "neg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(257, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:257:4: ( 'NEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:257:5: 'NEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(257,5);
            string_literal339=(Token)match(input,97,FOLLOW_97_in_neg1689); 
            string_literal339_tree = (Object)adaptor.create(string_literal339);
            adaptor.addChild(root_0, string_literal339_tree);

            dbg.location(257,11);
            TOKEN340=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_neg1691); 
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
        dbg.location(257, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:258:1: dash : 'DASH' TOKEN ;
    public final ChemicalChunkerParser.dash_return dash() throws RecognitionException {
        ChemicalChunkerParser.dash_return retval = new ChemicalChunkerParser.dash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal341=null;
        Token TOKEN342=null;

        Object string_literal341_tree=null;
        Object TOKEN342_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(258, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:258:5: ( 'DASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:258:6: 'DASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(258,6);
            string_literal341=(Token)match(input,98,FOLLOW_98_in_dash1696); 
            string_literal341_tree = (Object)adaptor.create(string_literal341);
            adaptor.addChild(root_0, string_literal341_tree);

            dbg.location(258,13);
            TOKEN342=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dash1698); 
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
        dbg.location(258, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:259:1: stop : 'STOP' TOKEN ;
    public final ChemicalChunkerParser.stop_return stop() throws RecognitionException {
        ChemicalChunkerParser.stop_return retval = new ChemicalChunkerParser.stop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal343=null;
        Token TOKEN344=null;

        Object string_literal343_tree=null;
        Object TOKEN344_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(259, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:259:5: ( 'STOP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:259:6: 'STOP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(259,6);
            string_literal343=(Token)match(input,99,FOLLOW_99_in_stop1703); 
            string_literal343_tree = (Object)adaptor.create(string_literal343);
            adaptor.addChild(root_0, string_literal343_tree);

            dbg.location(259,13);
            TOKEN344=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_stop1705); 
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
        dbg.location(259, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:260:1: nnpercent : 'NN-PERCENT' TOKEN ;
    public final ChemicalChunkerParser.nnpercent_return nnpercent() throws RecognitionException {
        ChemicalChunkerParser.nnpercent_return retval = new ChemicalChunkerParser.nnpercent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal345=null;
        Token TOKEN346=null;

        Object string_literal345_tree=null;
        Object TOKEN346_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpercent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(260, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:260:10: ( 'NN-PERCENT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:260:11: 'NN-PERCENT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(260,11);
            string_literal345=(Token)match(input,100,FOLLOW_100_in_nnpercent1710); 
            string_literal345_tree = (Object)adaptor.create(string_literal345);
            adaptor.addChild(root_0, string_literal345_tree);

            dbg.location(260,24);
            TOKEN346=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpercent1712); 
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
        dbg.location(260, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:261:1: lsqb : 'LSQB' TOKEN ;
    public final ChemicalChunkerParser.lsqb_return lsqb() throws RecognitionException {
        ChemicalChunkerParser.lsqb_return retval = new ChemicalChunkerParser.lsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal347=null;
        Token TOKEN348=null;

        Object string_literal347_tree=null;
        Object TOKEN348_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:261:5: ( 'LSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:261:6: 'LSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(261,6);
            string_literal347=(Token)match(input,101,FOLLOW_101_in_lsqb1717); 
            string_literal347_tree = (Object)adaptor.create(string_literal347);
            adaptor.addChild(root_0, string_literal347_tree);

            dbg.location(261,13);
            TOKEN348=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lsqb1719); 
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
        dbg.location(261, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:262:1: rsqb : 'RSQB' TOKEN ;
    public final ChemicalChunkerParser.rsqb_return rsqb() throws RecognitionException {
        ChemicalChunkerParser.rsqb_return retval = new ChemicalChunkerParser.rsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal349=null;
        Token TOKEN350=null;

        Object string_literal349_tree=null;
        Object TOKEN350_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(262, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:262:5: ( 'RSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:262:6: 'RSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(262,6);
            string_literal349=(Token)match(input,102,FOLLOW_102_in_rsqb1724); 
            string_literal349_tree = (Object)adaptor.create(string_literal349);
            adaptor.addChild(root_0, string_literal349_tree);

            dbg.location(262,13);
            TOKEN350=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rsqb1726); 
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
        dbg.location(262, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:263:1: lrb : '-LRB-' TOKEN ;
    public final ChemicalChunkerParser.lrb_return lrb() throws RecognitionException {
        ChemicalChunkerParser.lrb_return retval = new ChemicalChunkerParser.lrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal351=null;
        Token TOKEN352=null;

        Object string_literal351_tree=null;
        Object TOKEN352_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(263, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:263:4: ( '-LRB-' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:263:5: '-LRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(263,5);
            string_literal351=(Token)match(input,103,FOLLOW_103_in_lrb1731); 
            string_literal351_tree = (Object)adaptor.create(string_literal351);
            adaptor.addChild(root_0, string_literal351_tree);

            dbg.location(263,13);
            TOKEN352=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lrb1733); 
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
        dbg.location(263, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:264:1: rrb : '-RRB-' TOKEN ;
    public final ChemicalChunkerParser.rrb_return rrb() throws RecognitionException {
        ChemicalChunkerParser.rrb_return retval = new ChemicalChunkerParser.rrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal353=null;
        Token TOKEN354=null;

        Object string_literal353_tree=null;
        Object TOKEN354_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(264, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:264:4: ( '-RRB-' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:264:5: '-RRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(264,5);
            string_literal353=(Token)match(input,104,FOLLOW_104_in_rrb1738); 
            string_literal353_tree = (Object)adaptor.create(string_literal353);
            adaptor.addChild(root_0, string_literal353_tree);

            dbg.location(264,13);
            TOKEN354=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rrb1740); 
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
        dbg.location(264, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:269:1: abl : 'ABL' TOKEN ;
    public final ChemicalChunkerParser.abl_return abl() throws RecognitionException {
        ChemicalChunkerParser.abl_return retval = new ChemicalChunkerParser.abl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal355=null;
        Token TOKEN356=null;

        Object string_literal355_tree=null;
        Object TOKEN356_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(269, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:269:4: ( 'ABL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:269:5: 'ABL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(269,5);
            string_literal355=(Token)match(input,105,FOLLOW_105_in_abl1749); 
            string_literal355_tree = (Object)adaptor.create(string_literal355);
            adaptor.addChild(root_0, string_literal355_tree);

            dbg.location(269,11);
            TOKEN356=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abl1751); 
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
        dbg.location(269, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:272:1: abn : 'ABN' TOKEN ;
    public final ChemicalChunkerParser.abn_return abn() throws RecognitionException {
        ChemicalChunkerParser.abn_return retval = new ChemicalChunkerParser.abn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal357=null;
        Token TOKEN358=null;

        Object string_literal357_tree=null;
        Object TOKEN358_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(272, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:272:4: ( 'ABN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:272:5: 'ABN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(272,5);
            string_literal357=(Token)match(input,106,FOLLOW_106_in_abn1758); 
            string_literal357_tree = (Object)adaptor.create(string_literal357);
            adaptor.addChild(root_0, string_literal357_tree);

            dbg.location(272,11);
            TOKEN358=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abn1760); 
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
        dbg.location(272, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:275:1: abx : 'ABX' TOKEN ;
    public final ChemicalChunkerParser.abx_return abx() throws RecognitionException {
        ChemicalChunkerParser.abx_return retval = new ChemicalChunkerParser.abx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal359=null;
        Token TOKEN360=null;

        Object string_literal359_tree=null;
        Object TOKEN360_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(275, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:275:4: ( 'ABX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:275:5: 'ABX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(275,5);
            string_literal359=(Token)match(input,107,FOLLOW_107_in_abx1767); 
            string_literal359_tree = (Object)adaptor.create(string_literal359);
            adaptor.addChild(root_0, string_literal359_tree);

            dbg.location(275,11);
            TOKEN360=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abx1769); 
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
        dbg.location(275, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:278:1: ap : 'AP' TOKEN ;
    public final ChemicalChunkerParser.ap_return ap() throws RecognitionException {
        ChemicalChunkerParser.ap_return retval = new ChemicalChunkerParser.ap_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal361=null;
        Token TOKEN362=null;

        Object string_literal361_tree=null;
        Object TOKEN362_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ap");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(278, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:278:3: ( 'AP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:278:4: 'AP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(278,4);
            string_literal361=(Token)match(input,108,FOLLOW_108_in_ap1776); 
            string_literal361_tree = (Object)adaptor.create(string_literal361);
            adaptor.addChild(root_0, string_literal361_tree);

            dbg.location(278,9);
            TOKEN362=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ap1778); 
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
        dbg.location(278, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:281:1: at : 'AT' TOKEN ;
    public final ChemicalChunkerParser.at_return at() throws RecognitionException {
        ChemicalChunkerParser.at_return retval = new ChemicalChunkerParser.at_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal363=null;
        Token TOKEN364=null;

        Object string_literal363_tree=null;
        Object TOKEN364_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "at");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(281, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:281:3: ( 'AT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:281:4: 'AT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(281,4);
            string_literal363=(Token)match(input,109,FOLLOW_109_in_at1785); 
            string_literal363_tree = (Object)adaptor.create(string_literal363);
            adaptor.addChild(root_0, string_literal363_tree);

            dbg.location(281,9);
            TOKEN364=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_at1787); 
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
        dbg.location(281, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:284:1: be : 'BE' TOKEN ;
    public final ChemicalChunkerParser.be_return be() throws RecognitionException {
        ChemicalChunkerParser.be_return retval = new ChemicalChunkerParser.be_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal365=null;
        Token TOKEN366=null;

        Object string_literal365_tree=null;
        Object TOKEN366_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "be");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(284, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:284:3: ( 'BE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:284:4: 'BE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(284,4);
            string_literal365=(Token)match(input,110,FOLLOW_110_in_be1794); 
            string_literal365_tree = (Object)adaptor.create(string_literal365);
            adaptor.addChild(root_0, string_literal365_tree);

            dbg.location(284,9);
            TOKEN366=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_be1796); 
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
        dbg.location(284, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:287:1: bed : 'BED' TOKEN ;
    public final ChemicalChunkerParser.bed_return bed() throws RecognitionException {
        ChemicalChunkerParser.bed_return retval = new ChemicalChunkerParser.bed_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal367=null;
        Token TOKEN368=null;

        Object string_literal367_tree=null;
        Object TOKEN368_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(287, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:287:4: ( 'BED' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:287:5: 'BED' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(287,5);
            string_literal367=(Token)match(input,111,FOLLOW_111_in_bed1803); 
            string_literal367_tree = (Object)adaptor.create(string_literal367);
            adaptor.addChild(root_0, string_literal367_tree);

            dbg.location(287,11);
            TOKEN368=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bed1805); 
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
        dbg.location(287, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:290:1: bedz : 'BEDZ' TOKEN ;
    public final ChemicalChunkerParser.bedz_return bedz() throws RecognitionException {
        ChemicalChunkerParser.bedz_return retval = new ChemicalChunkerParser.bedz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal369=null;
        Token TOKEN370=null;

        Object string_literal369_tree=null;
        Object TOKEN370_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bedz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(290, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:290:5: ( 'BEDZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:290:6: 'BEDZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(290,6);
            string_literal369=(Token)match(input,112,FOLLOW_112_in_bedz1812); 
            string_literal369_tree = (Object)adaptor.create(string_literal369);
            adaptor.addChild(root_0, string_literal369_tree);

            dbg.location(290,13);
            TOKEN370=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bedz1814); 
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
        dbg.location(290, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:293:1: beg : 'BEG' TOKEN ;
    public final ChemicalChunkerParser.beg_return beg() throws RecognitionException {
        ChemicalChunkerParser.beg_return retval = new ChemicalChunkerParser.beg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal371=null;
        Token TOKEN372=null;

        Object string_literal371_tree=null;
        Object TOKEN372_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "beg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(293, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:293:4: ( 'BEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:293:5: 'BEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(293,5);
            string_literal371=(Token)match(input,113,FOLLOW_113_in_beg1821); 
            string_literal371_tree = (Object)adaptor.create(string_literal371);
            adaptor.addChild(root_0, string_literal371_tree);

            dbg.location(293,11);
            TOKEN372=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_beg1823); 
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
        dbg.location(293, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:296:1: bem : 'BEM' TOKEN ;
    public final ChemicalChunkerParser.bem_return bem() throws RecognitionException {
        ChemicalChunkerParser.bem_return retval = new ChemicalChunkerParser.bem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal373=null;
        Token TOKEN374=null;

        Object string_literal373_tree=null;
        Object TOKEN374_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bem");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(296, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:296:4: ( 'BEM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:296:5: 'BEM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(296,5);
            string_literal373=(Token)match(input,114,FOLLOW_114_in_bem1830); 
            string_literal373_tree = (Object)adaptor.create(string_literal373);
            adaptor.addChild(root_0, string_literal373_tree);

            dbg.location(296,11);
            TOKEN374=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bem1832); 
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
        dbg.location(296, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:299:1: ben : 'BEN' TOKEN ;
    public final ChemicalChunkerParser.ben_return ben() throws RecognitionException {
        ChemicalChunkerParser.ben_return retval = new ChemicalChunkerParser.ben_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal375=null;
        Token TOKEN376=null;

        Object string_literal375_tree=null;
        Object TOKEN376_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ben");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(299, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:299:4: ( 'BEN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:299:5: 'BEN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(299,5);
            string_literal375=(Token)match(input,115,FOLLOW_115_in_ben1839); 
            string_literal375_tree = (Object)adaptor.create(string_literal375);
            adaptor.addChild(root_0, string_literal375_tree);

            dbg.location(299,11);
            TOKEN376=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ben1841); 
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
        dbg.location(299, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:302:1: ber : 'BER' TOKEN ;
    public final ChemicalChunkerParser.ber_return ber() throws RecognitionException {
        ChemicalChunkerParser.ber_return retval = new ChemicalChunkerParser.ber_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal377=null;
        Token TOKEN378=null;

        Object string_literal377_tree=null;
        Object TOKEN378_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ber");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(302, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:302:4: ( 'BER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:302:5: 'BER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(302,5);
            string_literal377=(Token)match(input,116,FOLLOW_116_in_ber1848); 
            string_literal377_tree = (Object)adaptor.create(string_literal377);
            adaptor.addChild(root_0, string_literal377_tree);

            dbg.location(302,11);
            TOKEN378=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ber1850); 
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
        dbg.location(302, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:305:1: bez : 'BEZ' TOKEN ;
    public final ChemicalChunkerParser.bez_return bez() throws RecognitionException {
        ChemicalChunkerParser.bez_return retval = new ChemicalChunkerParser.bez_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal379=null;
        Token TOKEN380=null;

        Object string_literal379_tree=null;
        Object TOKEN380_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bez");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(305, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:305:4: ( 'BEZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:305:5: 'BEZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(305,5);
            string_literal379=(Token)match(input,117,FOLLOW_117_in_bez1857); 
            string_literal379_tree = (Object)adaptor.create(string_literal379);
            adaptor.addChild(root_0, string_literal379_tree);

            dbg.location(305,11);
            TOKEN380=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bez1859); 
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
        dbg.location(305, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:308:1: cc : 'CC' TOKEN ;
    public final ChemicalChunkerParser.cc_return cc() throws RecognitionException {
        ChemicalChunkerParser.cc_return retval = new ChemicalChunkerParser.cc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal381=null;
        Token TOKEN382=null;

        Object string_literal381_tree=null;
        Object TOKEN382_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(308, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:308:3: ( 'CC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:308:4: 'CC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(308,4);
            string_literal381=(Token)match(input,118,FOLLOW_118_in_cc1866); 
            string_literal381_tree = (Object)adaptor.create(string_literal381);
            adaptor.addChild(root_0, string_literal381_tree);

            dbg.location(308,9);
            TOKEN382=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cc1868); 
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
        dbg.location(308, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:311:1: cd : 'CD' TOKEN ;
    public final ChemicalChunkerParser.cd_return cd() throws RecognitionException {
        ChemicalChunkerParser.cd_return retval = new ChemicalChunkerParser.cd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal383=null;
        Token TOKEN384=null;

        Object string_literal383_tree=null;
        Object TOKEN384_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(311, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:311:3: ( 'CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:311:4: 'CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(311,4);
            string_literal383=(Token)match(input,119,FOLLOW_119_in_cd1875); 
            string_literal383_tree = (Object)adaptor.create(string_literal383);
            adaptor.addChild(root_0, string_literal383_tree);

            dbg.location(311,9);
            TOKEN384=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cd1877); 
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
        dbg.location(311, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:314:1: cs : 'CS' TOKEN ;
    public final ChemicalChunkerParser.cs_return cs() throws RecognitionException {
        ChemicalChunkerParser.cs_return retval = new ChemicalChunkerParser.cs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal385=null;
        Token TOKEN386=null;

        Object string_literal385_tree=null;
        Object TOKEN386_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(314, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:314:3: ( 'CS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:314:4: 'CS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(314,4);
            string_literal385=(Token)match(input,120,FOLLOW_120_in_cs1884); 
            string_literal385_tree = (Object)adaptor.create(string_literal385);
            adaptor.addChild(root_0, string_literal385_tree);

            dbg.location(314,9);
            TOKEN386=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cs1886); 
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
        dbg.location(314, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:317:1: dotok : 'DO' TOKEN ;
    public final ChemicalChunkerParser.dotok_return dotok() throws RecognitionException {
        ChemicalChunkerParser.dotok_return retval = new ChemicalChunkerParser.dotok_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal387=null;
        Token TOKEN388=null;

        Object string_literal387_tree=null;
        Object TOKEN388_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dotok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(317, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:317:7: ( 'DO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:317:8: 'DO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(317,8);
            string_literal387=(Token)match(input,121,FOLLOW_121_in_dotok1894); 
            string_literal387_tree = (Object)adaptor.create(string_literal387);
            adaptor.addChild(root_0, string_literal387_tree);

            dbg.location(317,13);
            TOKEN388=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dotok1896); 
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
        dbg.location(317, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:320:1: dod : 'DOD' TOKEN ;
    public final ChemicalChunkerParser.dod_return dod() throws RecognitionException {
        ChemicalChunkerParser.dod_return retval = new ChemicalChunkerParser.dod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal389=null;
        Token TOKEN390=null;

        Object string_literal389_tree=null;
        Object TOKEN390_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:320:4: ( 'DOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:320:5: 'DOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(320,5);
            string_literal389=(Token)match(input,122,FOLLOW_122_in_dod1903); 
            string_literal389_tree = (Object)adaptor.create(string_literal389);
            adaptor.addChild(root_0, string_literal389_tree);

            dbg.location(320,11);
            TOKEN390=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dod1905); 
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
        dbg.location(320, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:323:1: doz : 'DOZ' TOKEN ;
    public final ChemicalChunkerParser.doz_return doz() throws RecognitionException {
        ChemicalChunkerParser.doz_return retval = new ChemicalChunkerParser.doz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal391=null;
        Token TOKEN392=null;

        Object string_literal391_tree=null;
        Object TOKEN392_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(323, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:323:4: ( 'DOZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:323:5: 'DOZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(323,5);
            string_literal391=(Token)match(input,123,FOLLOW_123_in_doz1912); 
            string_literal391_tree = (Object)adaptor.create(string_literal391);
            adaptor.addChild(root_0, string_literal391_tree);

            dbg.location(323,11);
            TOKEN392=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_doz1914); 
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
        dbg.location(323, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:326:1: dt : 'DT' TOKEN ;
    public final ChemicalChunkerParser.dt_return dt() throws RecognitionException {
        ChemicalChunkerParser.dt_return retval = new ChemicalChunkerParser.dt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal393=null;
        Token TOKEN394=null;

        Object string_literal393_tree=null;
        Object TOKEN394_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(326, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:326:3: ( 'DT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:326:4: 'DT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(326,4);
            string_literal393=(Token)match(input,124,FOLLOW_124_in_dt1921); 
            string_literal393_tree = (Object)adaptor.create(string_literal393);
            adaptor.addChild(root_0, string_literal393_tree);

            dbg.location(326,9);
            TOKEN394=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dt1923); 
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
        dbg.location(326, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:329:1: dti : 'DTI' TOKEN ;
    public final ChemicalChunkerParser.dti_return dti() throws RecognitionException {
        ChemicalChunkerParser.dti_return retval = new ChemicalChunkerParser.dti_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal395=null;
        Token TOKEN396=null;

        Object string_literal395_tree=null;
        Object TOKEN396_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dti");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(329, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:329:4: ( 'DTI' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:329:5: 'DTI' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(329,5);
            string_literal395=(Token)match(input,125,FOLLOW_125_in_dti1930); 
            string_literal395_tree = (Object)adaptor.create(string_literal395);
            adaptor.addChild(root_0, string_literal395_tree);

            dbg.location(329,11);
            TOKEN396=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dti1932); 
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
        dbg.location(329, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:332:1: dts : 'DTS' TOKEN ;
    public final ChemicalChunkerParser.dts_return dts() throws RecognitionException {
        ChemicalChunkerParser.dts_return retval = new ChemicalChunkerParser.dts_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal397=null;
        Token TOKEN398=null;

        Object string_literal397_tree=null;
        Object TOKEN398_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dts");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(332, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:332:4: ( 'DTS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:332:5: 'DTS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(332,5);
            string_literal397=(Token)match(input,126,FOLLOW_126_in_dts1939); 
            string_literal397_tree = (Object)adaptor.create(string_literal397);
            adaptor.addChild(root_0, string_literal397_tree);

            dbg.location(332,11);
            TOKEN398=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dts1941); 
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
        dbg.location(332, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:335:1: dtx : 'DTX' TOKEN ;
    public final ChemicalChunkerParser.dtx_return dtx() throws RecognitionException {
        ChemicalChunkerParser.dtx_return retval = new ChemicalChunkerParser.dtx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal399=null;
        Token TOKEN400=null;

        Object string_literal399_tree=null;
        Object TOKEN400_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dtx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(335, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:335:4: ( 'DTX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:335:5: 'DTX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(335,5);
            string_literal399=(Token)match(input,127,FOLLOW_127_in_dtx1948); 
            string_literal399_tree = (Object)adaptor.create(string_literal399);
            adaptor.addChild(root_0, string_literal399_tree);

            dbg.location(335,11);
            TOKEN400=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dtx1950); 
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
        dbg.location(335, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:338:1: ex : 'EX' TOKEN ;
    public final ChemicalChunkerParser.ex_return ex() throws RecognitionException {
        ChemicalChunkerParser.ex_return retval = new ChemicalChunkerParser.ex_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal401=null;
        Token TOKEN402=null;

        Object string_literal401_tree=null;
        Object TOKEN402_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ex");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(338, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:338:3: ( 'EX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:338:4: 'EX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(338,4);
            string_literal401=(Token)match(input,128,FOLLOW_128_in_ex1957); 
            string_literal401_tree = (Object)adaptor.create(string_literal401);
            adaptor.addChild(root_0, string_literal401_tree);

            dbg.location(338,9);
            TOKEN402=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ex1959); 
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
        dbg.location(338, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:341:1: fw : 'FW' TOKEN ;
    public final ChemicalChunkerParser.fw_return fw() throws RecognitionException {
        ChemicalChunkerParser.fw_return retval = new ChemicalChunkerParser.fw_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal403=null;
        Token TOKEN404=null;

        Object string_literal403_tree=null;
        Object TOKEN404_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(341, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:341:3: ( 'FW' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:341:4: 'FW' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(341,4);
            string_literal403=(Token)match(input,129,FOLLOW_129_in_fw1966); 
            string_literal403_tree = (Object)adaptor.create(string_literal403);
            adaptor.addChild(root_0, string_literal403_tree);

            dbg.location(341,9);
            TOKEN404=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_fw1968); 
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
        dbg.location(341, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:344:1: hv : 'HV' TOKEN ;
    public final ChemicalChunkerParser.hv_return hv() throws RecognitionException {
        ChemicalChunkerParser.hv_return retval = new ChemicalChunkerParser.hv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal405=null;
        Token TOKEN406=null;

        Object string_literal405_tree=null;
        Object TOKEN406_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(344, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:344:3: ( 'HV' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:344:4: 'HV' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(344,4);
            string_literal405=(Token)match(input,130,FOLLOW_130_in_hv1975); 
            string_literal405_tree = (Object)adaptor.create(string_literal405);
            adaptor.addChild(root_0, string_literal405_tree);

            dbg.location(344,9);
            TOKEN406=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hv1977); 
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
        dbg.location(344, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:347:1: hvd : 'HVD' TOKEN ;
    public final ChemicalChunkerParser.hvd_return hvd() throws RecognitionException {
        ChemicalChunkerParser.hvd_return retval = new ChemicalChunkerParser.hvd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal407=null;
        Token TOKEN408=null;

        Object string_literal407_tree=null;
        Object TOKEN408_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(347, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:347:4: ( 'HVD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:347:5: 'HVD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(347,5);
            string_literal407=(Token)match(input,131,FOLLOW_131_in_hvd1984); 
            string_literal407_tree = (Object)adaptor.create(string_literal407);
            adaptor.addChild(root_0, string_literal407_tree);

            dbg.location(347,11);
            TOKEN408=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvd1986); 
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
        dbg.location(347, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:350:1: hvg : 'HVG' TOKEN ;
    public final ChemicalChunkerParser.hvg_return hvg() throws RecognitionException {
        ChemicalChunkerParser.hvg_return retval = new ChemicalChunkerParser.hvg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal409=null;
        Token TOKEN410=null;

        Object string_literal409_tree=null;
        Object TOKEN410_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(350, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:350:4: ( 'HVG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:350:5: 'HVG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(350,5);
            string_literal409=(Token)match(input,132,FOLLOW_132_in_hvg1993); 
            string_literal409_tree = (Object)adaptor.create(string_literal409);
            adaptor.addChild(root_0, string_literal409_tree);

            dbg.location(350,11);
            TOKEN410=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvg1995); 
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
        dbg.location(350, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:353:1: hvn : 'HVN' TOKEN ;
    public final ChemicalChunkerParser.hvn_return hvn() throws RecognitionException {
        ChemicalChunkerParser.hvn_return retval = new ChemicalChunkerParser.hvn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal411=null;
        Token TOKEN412=null;

        Object string_literal411_tree=null;
        Object TOKEN412_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(353, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:353:4: ( 'HVN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:353:5: 'HVN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(353,5);
            string_literal411=(Token)match(input,133,FOLLOW_133_in_hvn2002); 
            string_literal411_tree = (Object)adaptor.create(string_literal411);
            adaptor.addChild(root_0, string_literal411_tree);

            dbg.location(353,11);
            TOKEN412=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvn2004); 
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
        dbg.location(353, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:356:1: in : 'IN' TOKEN ;
    public final ChemicalChunkerParser.in_return in() throws RecognitionException {
        ChemicalChunkerParser.in_return retval = new ChemicalChunkerParser.in_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal413=null;
        Token TOKEN414=null;

        Object string_literal413_tree=null;
        Object TOKEN414_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "in");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(356, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:356:3: ( 'IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:356:4: 'IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(356,4);
            string_literal413=(Token)match(input,134,FOLLOW_134_in_in2011); 
            string_literal413_tree = (Object)adaptor.create(string_literal413);
            adaptor.addChild(root_0, string_literal413_tree);

            dbg.location(356,9);
            TOKEN414=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_in2013); 
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
        dbg.location(356, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:359:1: jj : 'JJ' TOKEN ;
    public final ChemicalChunkerParser.jj_return jj() throws RecognitionException {
        ChemicalChunkerParser.jj_return retval = new ChemicalChunkerParser.jj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal415=null;
        Token TOKEN416=null;

        Object string_literal415_tree=null;
        Object TOKEN416_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(359, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:359:3: ( 'JJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:359:4: 'JJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(359,4);
            string_literal415=(Token)match(input,135,FOLLOW_135_in_jj2020); 
            string_literal415_tree = (Object)adaptor.create(string_literal415);
            adaptor.addChild(root_0, string_literal415_tree);

            dbg.location(359,9);
            TOKEN416=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jj2022); 
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
        dbg.location(359, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:362:1: jjr : 'JJR' TOKEN ;
    public final ChemicalChunkerParser.jjr_return jjr() throws RecognitionException {
        ChemicalChunkerParser.jjr_return retval = new ChemicalChunkerParser.jjr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal417=null;
        Token TOKEN418=null;

        Object string_literal417_tree=null;
        Object TOKEN418_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(362, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:362:4: ( 'JJR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:362:5: 'JJR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(362,5);
            string_literal417=(Token)match(input,136,FOLLOW_136_in_jjr2029); 
            string_literal417_tree = (Object)adaptor.create(string_literal417);
            adaptor.addChild(root_0, string_literal417_tree);

            dbg.location(362,11);
            TOKEN418=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjr2031); 
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
        dbg.location(362, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:365:1: jjs : 'JJS' TOKEN ;
    public final ChemicalChunkerParser.jjs_return jjs() throws RecognitionException {
        ChemicalChunkerParser.jjs_return retval = new ChemicalChunkerParser.jjs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal419=null;
        Token TOKEN420=null;

        Object string_literal419_tree=null;
        Object TOKEN420_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(365, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:365:4: ( 'JJS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:365:5: 'JJS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(365,5);
            string_literal419=(Token)match(input,137,FOLLOW_137_in_jjs2038); 
            string_literal419_tree = (Object)adaptor.create(string_literal419);
            adaptor.addChild(root_0, string_literal419_tree);

            dbg.location(365,11);
            TOKEN420=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjs2040); 
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
        dbg.location(365, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:368:1: jjt : 'JJT' TOKEN ;
    public final ChemicalChunkerParser.jjt_return jjt() throws RecognitionException {
        ChemicalChunkerParser.jjt_return retval = new ChemicalChunkerParser.jjt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal421=null;
        Token TOKEN422=null;

        Object string_literal421_tree=null;
        Object TOKEN422_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(368, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:368:4: ( 'JJT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:368:5: 'JJT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(368,5);
            string_literal421=(Token)match(input,138,FOLLOW_138_in_jjt2047); 
            string_literal421_tree = (Object)adaptor.create(string_literal421);
            adaptor.addChild(root_0, string_literal421_tree);

            dbg.location(368,11);
            TOKEN422=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjt2049); 
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
        dbg.location(368, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:371:1: md : 'MD' TOKEN ;
    public final ChemicalChunkerParser.md_return md() throws RecognitionException {
        ChemicalChunkerParser.md_return retval = new ChemicalChunkerParser.md_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal423=null;
        Token TOKEN424=null;

        Object string_literal423_tree=null;
        Object TOKEN424_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "md");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(371, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:371:3: ( 'MD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:371:4: 'MD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(371,4);
            string_literal423=(Token)match(input,139,FOLLOW_139_in_md2056); 
            string_literal423_tree = (Object)adaptor.create(string_literal423);
            adaptor.addChild(root_0, string_literal423_tree);

            dbg.location(371,9);
            TOKEN424=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_md2058); 
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
        dbg.location(371, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:374:1: nc : 'NC' TOKEN ;
    public final ChemicalChunkerParser.nc_return nc() throws RecognitionException {
        ChemicalChunkerParser.nc_return retval = new ChemicalChunkerParser.nc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal425=null;
        Token TOKEN426=null;

        Object string_literal425_tree=null;
        Object TOKEN426_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(374, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:374:3: ( 'NC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:374:4: 'NC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(374,4);
            string_literal425=(Token)match(input,140,FOLLOW_140_in_nc2065); 
            string_literal425_tree = (Object)adaptor.create(string_literal425);
            adaptor.addChild(root_0, string_literal425_tree);

            dbg.location(374,9);
            TOKEN426=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nc2067); 
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
        dbg.location(374, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:377:1: nn : 'NN' TOKEN ;
    public final ChemicalChunkerParser.nn_return nn() throws RecognitionException {
        ChemicalChunkerParser.nn_return retval = new ChemicalChunkerParser.nn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal427=null;
        Token TOKEN428=null;

        Object string_literal427_tree=null;
        Object TOKEN428_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(377, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:377:3: ( 'NN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:377:4: 'NN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(377,4);
            string_literal427=(Token)match(input,141,FOLLOW_141_in_nn2074); 
            string_literal427_tree = (Object)adaptor.create(string_literal427);
            adaptor.addChild(root_0, string_literal427_tree);

            dbg.location(377,9);
            TOKEN428=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn2076); 
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
        dbg.location(377, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:380:1: nn_poss : 'NN$' TOKEN ;
    public final ChemicalChunkerParser.nn_poss_return nn_poss() throws RecognitionException {
        ChemicalChunkerParser.nn_poss_return retval = new ChemicalChunkerParser.nn_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal429=null;
        Token TOKEN430=null;

        Object string_literal429_tree=null;
        Object TOKEN430_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(380, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:380:8: ( 'NN$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:380:9: 'NN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(380,9);
            string_literal429=(Token)match(input,142,FOLLOW_142_in_nn_poss2083); 
            string_literal429_tree = (Object)adaptor.create(string_literal429);
            adaptor.addChild(root_0, string_literal429_tree);

            dbg.location(380,15);
            TOKEN430=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn_poss2085); 
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
        dbg.location(380, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:383:1: nns : 'NNS' TOKEN ;
    public final ChemicalChunkerParser.nns_return nns() throws RecognitionException {
        ChemicalChunkerParser.nns_return retval = new ChemicalChunkerParser.nns_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal431=null;
        Token TOKEN432=null;

        Object string_literal431_tree=null;
        Object TOKEN432_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(383, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:383:4: ( 'NNS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:383:5: 'NNS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(383,5);
            string_literal431=(Token)match(input,143,FOLLOW_143_in_nns2092); 
            string_literal431_tree = (Object)adaptor.create(string_literal431);
            adaptor.addChild(root_0, string_literal431_tree);

            dbg.location(383,11);
            TOKEN432=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns2094); 
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
        dbg.location(383, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:386:1: nns_poss : 'NNS$' TOKEN ;
    public final ChemicalChunkerParser.nns_poss_return nns_poss() throws RecognitionException {
        ChemicalChunkerParser.nns_poss_return retval = new ChemicalChunkerParser.nns_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal433=null;
        Token TOKEN434=null;

        Object string_literal433_tree=null;
        Object TOKEN434_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(386, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:386:9: ( 'NNS$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:386:10: 'NNS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(386,10);
            string_literal433=(Token)match(input,144,FOLLOW_144_in_nns_poss2101); 
            string_literal433_tree = (Object)adaptor.create(string_literal433);
            adaptor.addChild(root_0, string_literal433_tree);

            dbg.location(386,17);
            TOKEN434=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns_poss2103); 
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
        dbg.location(386, 22);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:389:1: np : 'NP' TOKEN ;
    public final ChemicalChunkerParser.np_return np() throws RecognitionException {
        ChemicalChunkerParser.np_return retval = new ChemicalChunkerParser.np_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal435=null;
        Token TOKEN436=null;

        Object string_literal435_tree=null;
        Object TOKEN436_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(389, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:389:3: ( 'NP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:389:4: 'NP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(389,4);
            string_literal435=(Token)match(input,145,FOLLOW_145_in_np2110); 
            string_literal435_tree = (Object)adaptor.create(string_literal435);
            adaptor.addChild(root_0, string_literal435_tree);

            dbg.location(389,9);
            TOKEN436=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np2112); 
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
        dbg.location(389, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:392:1: np_poss : 'NP$' TOKEN ;
    public final ChemicalChunkerParser.np_poss_return np_poss() throws RecognitionException {
        ChemicalChunkerParser.np_poss_return retval = new ChemicalChunkerParser.np_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal437=null;
        Token TOKEN438=null;

        Object string_literal437_tree=null;
        Object TOKEN438_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(392, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:392:8: ( 'NP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:392:9: 'NP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(392,9);
            string_literal437=(Token)match(input,146,FOLLOW_146_in_np_poss2119); 
            string_literal437_tree = (Object)adaptor.create(string_literal437);
            adaptor.addChild(root_0, string_literal437_tree);

            dbg.location(392,15);
            TOKEN438=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np_poss2121); 
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
        dbg.location(392, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:395:1: nps : 'NPS' TOKEN ;
    public final ChemicalChunkerParser.nps_return nps() throws RecognitionException {
        ChemicalChunkerParser.nps_return retval = new ChemicalChunkerParser.nps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal439=null;
        Token TOKEN440=null;

        Object string_literal439_tree=null;
        Object TOKEN440_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(395, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:395:4: ( 'NPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:395:5: 'NPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(395,5);
            string_literal439=(Token)match(input,147,FOLLOW_147_in_nps2128); 
            string_literal439_tree = (Object)adaptor.create(string_literal439);
            adaptor.addChild(root_0, string_literal439_tree);

            dbg.location(395,11);
            TOKEN440=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps2130); 
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
        dbg.location(395, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:398:1: nps_poss : 'NPS$' TOKEN ;
    public final ChemicalChunkerParser.nps_poss_return nps_poss() throws RecognitionException {
        ChemicalChunkerParser.nps_poss_return retval = new ChemicalChunkerParser.nps_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal441=null;
        Token TOKEN442=null;

        Object string_literal441_tree=null;
        Object TOKEN442_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(398, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:398:9: ( 'NPS$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:398:10: 'NPS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(398,10);
            string_literal441=(Token)match(input,148,FOLLOW_148_in_nps_poss2137); 
            string_literal441_tree = (Object)adaptor.create(string_literal441);
            adaptor.addChild(root_0, string_literal441_tree);

            dbg.location(398,17);
            TOKEN442=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps_poss2139); 
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
        dbg.location(398, 22);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:401:1: nr : 'NR' TOKEN ;
    public final ChemicalChunkerParser.nr_return nr() throws RecognitionException {
        ChemicalChunkerParser.nr_return retval = new ChemicalChunkerParser.nr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal443=null;
        Token TOKEN444=null;

        Object string_literal443_tree=null;
        Object TOKEN444_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(401, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:401:3: ( 'NR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:401:4: 'NR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(401,4);
            string_literal443=(Token)match(input,149,FOLLOW_149_in_nr2146); 
            string_literal443_tree = (Object)adaptor.create(string_literal443);
            adaptor.addChild(root_0, string_literal443_tree);

            dbg.location(401,9);
            TOKEN444=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nr2148); 
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
        dbg.location(401, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:404:1: od : 'OD' TOKEN ;
    public final ChemicalChunkerParser.od_return od() throws RecognitionException {
        ChemicalChunkerParser.od_return retval = new ChemicalChunkerParser.od_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal445=null;
        Token TOKEN446=null;

        Object string_literal445_tree=null;
        Object TOKEN446_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "od");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(404, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:404:3: ( 'OD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:404:4: 'OD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(404,4);
            string_literal445=(Token)match(input,150,FOLLOW_150_in_od2155); 
            string_literal445_tree = (Object)adaptor.create(string_literal445);
            adaptor.addChild(root_0, string_literal445_tree);

            dbg.location(404,9);
            TOKEN446=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_od2157); 
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
        dbg.location(404, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:407:1: pn : 'PN' TOKEN ;
    public final ChemicalChunkerParser.pn_return pn() throws RecognitionException {
        ChemicalChunkerParser.pn_return retval = new ChemicalChunkerParser.pn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal447=null;
        Token TOKEN448=null;

        Object string_literal447_tree=null;
        Object TOKEN448_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(407, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:407:3: ( 'PN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:407:4: 'PN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(407,4);
            string_literal447=(Token)match(input,151,FOLLOW_151_in_pn2164); 
            string_literal447_tree = (Object)adaptor.create(string_literal447);
            adaptor.addChild(root_0, string_literal447_tree);

            dbg.location(407,9);
            TOKEN448=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn2166); 
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
        dbg.location(407, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:410:1: pn_poss : 'PN$' TOKEN ;
    public final ChemicalChunkerParser.pn_poss_return pn_poss() throws RecognitionException {
        ChemicalChunkerParser.pn_poss_return retval = new ChemicalChunkerParser.pn_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal449=null;
        Token TOKEN450=null;

        Object string_literal449_tree=null;
        Object TOKEN450_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(410, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:410:8: ( 'PN$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:410:9: 'PN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(410,9);
            string_literal449=(Token)match(input,152,FOLLOW_152_in_pn_poss2173); 
            string_literal449_tree = (Object)adaptor.create(string_literal449);
            adaptor.addChild(root_0, string_literal449_tree);

            dbg.location(410,15);
            TOKEN450=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn_poss2175); 
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
        dbg.location(410, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:413:1: pp_poss : 'PP$' TOKEN ;
    public final ChemicalChunkerParser.pp_poss_return pp_poss() throws RecognitionException {
        ChemicalChunkerParser.pp_poss_return retval = new ChemicalChunkerParser.pp_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal451=null;
        Token TOKEN452=null;

        Object string_literal451_tree=null;
        Object TOKEN452_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pp_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(413, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:413:8: ( 'PP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:413:9: 'PP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(413,9);
            string_literal451=(Token)match(input,153,FOLLOW_153_in_pp_poss2182); 
            string_literal451_tree = (Object)adaptor.create(string_literal451);
            adaptor.addChild(root_0, string_literal451_tree);

            dbg.location(413,15);
            TOKEN452=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pp_poss2184); 
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
        dbg.location(413, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:416:1: pp_poss_poss : 'PP$$' TOKEN ;
    public final ChemicalChunkerParser.pp_poss_poss_return pp_poss_poss() throws RecognitionException {
        ChemicalChunkerParser.pp_poss_poss_return retval = new ChemicalChunkerParser.pp_poss_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal453=null;
        Token TOKEN454=null;

        Object string_literal453_tree=null;
        Object TOKEN454_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pp_poss_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(416, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:416:13: ( 'PP$$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:416:14: 'PP$$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(416,14);
            string_literal453=(Token)match(input,154,FOLLOW_154_in_pp_poss_poss2191); 
            string_literal453_tree = (Object)adaptor.create(string_literal453);
            adaptor.addChild(root_0, string_literal453_tree);

            dbg.location(416,21);
            TOKEN454=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pp_poss_poss2193); 
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
        dbg.location(416, 26);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:419:1: ppl : 'PPL' TOKEN ;
    public final ChemicalChunkerParser.ppl_return ppl() throws RecognitionException {
        ChemicalChunkerParser.ppl_return retval = new ChemicalChunkerParser.ppl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal455=null;
        Token TOKEN456=null;

        Object string_literal455_tree=null;
        Object TOKEN456_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(419, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:419:4: ( 'PPL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:419:5: 'PPL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(419,5);
            string_literal455=(Token)match(input,155,FOLLOW_155_in_ppl2200); 
            string_literal455_tree = (Object)adaptor.create(string_literal455);
            adaptor.addChild(root_0, string_literal455_tree);

            dbg.location(419,11);
            TOKEN456=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppl2202); 
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
        dbg.location(419, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:422:1: ppls : 'PPLS' TOKEN ;
    public final ChemicalChunkerParser.ppls_return ppls() throws RecognitionException {
        ChemicalChunkerParser.ppls_return retval = new ChemicalChunkerParser.ppls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal457=null;
        Token TOKEN458=null;

        Object string_literal457_tree=null;
        Object TOKEN458_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(422, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:422:5: ( 'PPLS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:422:6: 'PPLS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(422,6);
            string_literal457=(Token)match(input,156,FOLLOW_156_in_ppls2209); 
            string_literal457_tree = (Object)adaptor.create(string_literal457);
            adaptor.addChild(root_0, string_literal457_tree);

            dbg.location(422,13);
            TOKEN458=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppls2211); 
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
        dbg.location(422, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:425:1: ppo : 'PPO' TOKEN ;
    public final ChemicalChunkerParser.ppo_return ppo() throws RecognitionException {
        ChemicalChunkerParser.ppo_return retval = new ChemicalChunkerParser.ppo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal459=null;
        Token TOKEN460=null;

        Object string_literal459_tree=null;
        Object TOKEN460_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(425, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:425:4: ( 'PPO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:425:5: 'PPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(425,5);
            string_literal459=(Token)match(input,157,FOLLOW_157_in_ppo2218); 
            string_literal459_tree = (Object)adaptor.create(string_literal459);
            adaptor.addChild(root_0, string_literal459_tree);

            dbg.location(425,11);
            TOKEN460=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppo2220); 
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
        dbg.location(425, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:428:1: pps : 'PPS' TOKEN ;
    public final ChemicalChunkerParser.pps_return pps() throws RecognitionException {
        ChemicalChunkerParser.pps_return retval = new ChemicalChunkerParser.pps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal461=null;
        Token TOKEN462=null;

        Object string_literal461_tree=null;
        Object TOKEN462_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(428, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:428:4: ( 'PPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:428:5: 'PPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(428,5);
            string_literal461=(Token)match(input,158,FOLLOW_158_in_pps2227); 
            string_literal461_tree = (Object)adaptor.create(string_literal461);
            adaptor.addChild(root_0, string_literal461_tree);

            dbg.location(428,11);
            TOKEN462=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pps2229); 
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
        dbg.location(428, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:431:1: ppss : 'PPSS' TOKEN ;
    public final ChemicalChunkerParser.ppss_return ppss() throws RecognitionException {
        ChemicalChunkerParser.ppss_return retval = new ChemicalChunkerParser.ppss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal463=null;
        Token TOKEN464=null;

        Object string_literal463_tree=null;
        Object TOKEN464_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(431, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:431:5: ( 'PPSS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:431:6: 'PPSS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(431,6);
            string_literal463=(Token)match(input,159,FOLLOW_159_in_ppss2236); 
            string_literal463_tree = (Object)adaptor.create(string_literal463);
            adaptor.addChild(root_0, string_literal463_tree);

            dbg.location(431,13);
            TOKEN464=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppss2238); 
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
        dbg.location(431, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:434:1: ql : 'QL' TOKEN ;
    public final ChemicalChunkerParser.ql_return ql() throws RecognitionException {
        ChemicalChunkerParser.ql_return retval = new ChemicalChunkerParser.ql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal465=null;
        Token TOKEN466=null;

        Object string_literal465_tree=null;
        Object TOKEN466_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(434, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:434:3: ( 'QL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:434:4: 'QL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(434,4);
            string_literal465=(Token)match(input,160,FOLLOW_160_in_ql2245); 
            string_literal465_tree = (Object)adaptor.create(string_literal465);
            adaptor.addChild(root_0, string_literal465_tree);

            dbg.location(434,9);
            TOKEN466=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ql2247); 
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
        dbg.location(434, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:437:1: qlp : 'QLP' TOKEN ;
    public final ChemicalChunkerParser.qlp_return qlp() throws RecognitionException {
        ChemicalChunkerParser.qlp_return retval = new ChemicalChunkerParser.qlp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal467=null;
        Token TOKEN468=null;

        Object string_literal467_tree=null;
        Object TOKEN468_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "qlp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(437, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:437:4: ( 'QLP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:437:5: 'QLP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(437,5);
            string_literal467=(Token)match(input,161,FOLLOW_161_in_qlp2254); 
            string_literal467_tree = (Object)adaptor.create(string_literal467);
            adaptor.addChild(root_0, string_literal467_tree);

            dbg.location(437,11);
            TOKEN468=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_qlp2256); 
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
        dbg.location(437, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:440:1: rb : 'RB' TOKEN ;
    public final ChemicalChunkerParser.rb_return rb() throws RecognitionException {
        ChemicalChunkerParser.rb_return retval = new ChemicalChunkerParser.rb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal469=null;
        Token TOKEN470=null;

        Object string_literal469_tree=null;
        Object TOKEN470_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(440, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:440:3: ( 'RB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:440:4: 'RB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(440,4);
            string_literal469=(Token)match(input,162,FOLLOW_162_in_rb2263); 
            string_literal469_tree = (Object)adaptor.create(string_literal469);
            adaptor.addChild(root_0, string_literal469_tree);

            dbg.location(440,9);
            TOKEN470=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rb2265); 
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
        dbg.location(440, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:443:1: rbr : 'RBR' TOKEN ;
    public final ChemicalChunkerParser.rbr_return rbr() throws RecognitionException {
        ChemicalChunkerParser.rbr_return retval = new ChemicalChunkerParser.rbr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal471=null;
        Token TOKEN472=null;

        Object string_literal471_tree=null;
        Object TOKEN472_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(443, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:443:4: ( 'RBR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:443:5: 'RBR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(443,5);
            string_literal471=(Token)match(input,163,FOLLOW_163_in_rbr2272); 
            string_literal471_tree = (Object)adaptor.create(string_literal471);
            adaptor.addChild(root_0, string_literal471_tree);

            dbg.location(443,11);
            TOKEN472=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbr2274); 
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
        dbg.location(443, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:446:1: rbt : 'RBT' TOKEN ;
    public final ChemicalChunkerParser.rbt_return rbt() throws RecognitionException {
        ChemicalChunkerParser.rbt_return retval = new ChemicalChunkerParser.rbt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal473=null;
        Token TOKEN474=null;

        Object string_literal473_tree=null;
        Object TOKEN474_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(446, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:446:4: ( 'RBT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:446:5: 'RBT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(446,5);
            string_literal473=(Token)match(input,164,FOLLOW_164_in_rbt2281); 
            string_literal473_tree = (Object)adaptor.create(string_literal473);
            adaptor.addChild(root_0, string_literal473_tree);

            dbg.location(446,11);
            TOKEN474=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbt2283); 
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
        dbg.location(446, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:449:1: rn : 'RN' TOKEN ;
    public final ChemicalChunkerParser.rn_return rn() throws RecognitionException {
        ChemicalChunkerParser.rn_return retval = new ChemicalChunkerParser.rn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal475=null;
        Token TOKEN476=null;

        Object string_literal475_tree=null;
        Object TOKEN476_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(449, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:449:3: ( 'RN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:449:4: 'RN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(449,4);
            string_literal475=(Token)match(input,165,FOLLOW_165_in_rn2290); 
            string_literal475_tree = (Object)adaptor.create(string_literal475);
            adaptor.addChild(root_0, string_literal475_tree);

            dbg.location(449,9);
            TOKEN476=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rn2292); 
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
        dbg.location(449, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:452:1: rp : 'RP' TOKEN ;
    public final ChemicalChunkerParser.rp_return rp() throws RecognitionException {
        ChemicalChunkerParser.rp_return retval = new ChemicalChunkerParser.rp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal477=null;
        Token TOKEN478=null;

        Object string_literal477_tree=null;
        Object TOKEN478_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(452, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:452:3: ( 'RP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:452:4: 'RP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(452,4);
            string_literal477=(Token)match(input,166,FOLLOW_166_in_rp2299); 
            string_literal477_tree = (Object)adaptor.create(string_literal477);
            adaptor.addChild(root_0, string_literal477_tree);

            dbg.location(452,9);
            TOKEN478=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rp2301); 
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
        dbg.location(452, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:455:1: to : 'TO' TOKEN ;
    public final ChemicalChunkerParser.to_return to() throws RecognitionException {
        ChemicalChunkerParser.to_return retval = new ChemicalChunkerParser.to_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal479=null;
        Token TOKEN480=null;

        Object string_literal479_tree=null;
        Object TOKEN480_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "to");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(455, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:455:3: ( 'TO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:455:4: 'TO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(455,4);
            string_literal479=(Token)match(input,167,FOLLOW_167_in_to2308); 
            string_literal479_tree = (Object)adaptor.create(string_literal479);
            adaptor.addChild(root_0, string_literal479_tree);

            dbg.location(455,9);
            TOKEN480=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_to2310); 
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
        dbg.location(455, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:458:1: uh : 'UH' TOKEN ;
    public final ChemicalChunkerParser.uh_return uh() throws RecognitionException {
        ChemicalChunkerParser.uh_return retval = new ChemicalChunkerParser.uh_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal481=null;
        Token TOKEN482=null;

        Object string_literal481_tree=null;
        Object TOKEN482_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "uh");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(458, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:458:3: ( 'UH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:458:4: 'UH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(458,4);
            string_literal481=(Token)match(input,168,FOLLOW_168_in_uh2317); 
            string_literal481_tree = (Object)adaptor.create(string_literal481);
            adaptor.addChild(root_0, string_literal481_tree);

            dbg.location(458,9);
            TOKEN482=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_uh2319); 
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
        dbg.location(458, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:461:1: vb : 'VB' TOKEN ;
    public final ChemicalChunkerParser.vb_return vb() throws RecognitionException {
        ChemicalChunkerParser.vb_return retval = new ChemicalChunkerParser.vb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal483=null;
        Token TOKEN484=null;

        Object string_literal483_tree=null;
        Object TOKEN484_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(461, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:461:3: ( 'VB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:461:4: 'VB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(461,4);
            string_literal483=(Token)match(input,169,FOLLOW_169_in_vb2326); 
            string_literal483_tree = (Object)adaptor.create(string_literal483);
            adaptor.addChild(root_0, string_literal483_tree);

            dbg.location(461,9);
            TOKEN484=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vb2328); 
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
        dbg.location(461, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:464:1: vbd : 'VBD' TOKEN ;
    public final ChemicalChunkerParser.vbd_return vbd() throws RecognitionException {
        ChemicalChunkerParser.vbd_return retval = new ChemicalChunkerParser.vbd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal485=null;
        Token TOKEN486=null;

        Object string_literal485_tree=null;
        Object TOKEN486_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(464, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:464:4: ( 'VBD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:464:5: 'VBD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(464,5);
            string_literal485=(Token)match(input,170,FOLLOW_170_in_vbd2335); 
            string_literal485_tree = (Object)adaptor.create(string_literal485);
            adaptor.addChild(root_0, string_literal485_tree);

            dbg.location(464,11);
            TOKEN486=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbd2337); 
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
        dbg.location(464, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:467:1: vbg : 'VBG' TOKEN ;
    public final ChemicalChunkerParser.vbg_return vbg() throws RecognitionException {
        ChemicalChunkerParser.vbg_return retval = new ChemicalChunkerParser.vbg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal487=null;
        Token TOKEN488=null;

        Object string_literal487_tree=null;
        Object TOKEN488_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(467, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:467:4: ( 'VBG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:467:5: 'VBG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(467,5);
            string_literal487=(Token)match(input,171,FOLLOW_171_in_vbg2344); 
            string_literal487_tree = (Object)adaptor.create(string_literal487);
            adaptor.addChild(root_0, string_literal487_tree);

            dbg.location(467,11);
            TOKEN488=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbg2346); 
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
        dbg.location(467, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:470:1: vbn : 'VBN' TOKEN ;
    public final ChemicalChunkerParser.vbn_return vbn() throws RecognitionException {
        ChemicalChunkerParser.vbn_return retval = new ChemicalChunkerParser.vbn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal489=null;
        Token TOKEN490=null;

        Object string_literal489_tree=null;
        Object TOKEN490_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(470, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:470:4: ( 'VBN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:470:5: 'VBN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(470,5);
            string_literal489=(Token)match(input,172,FOLLOW_172_in_vbn2353); 
            string_literal489_tree = (Object)adaptor.create(string_literal489);
            adaptor.addChild(root_0, string_literal489_tree);

            dbg.location(470,11);
            TOKEN490=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbn2355); 
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
        dbg.location(470, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:473:1: vbz : 'VBZ' TOKEN ;
    public final ChemicalChunkerParser.vbz_return vbz() throws RecognitionException {
        ChemicalChunkerParser.vbz_return retval = new ChemicalChunkerParser.vbz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal491=null;
        Token TOKEN492=null;

        Object string_literal491_tree=null;
        Object TOKEN492_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(473, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:473:4: ( 'VBZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:473:5: 'VBZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(473,5);
            string_literal491=(Token)match(input,173,FOLLOW_173_in_vbz2362); 
            string_literal491_tree = (Object)adaptor.create(string_literal491);
            adaptor.addChild(root_0, string_literal491_tree);

            dbg.location(473,11);
            TOKEN492=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbz2364); 
            TOKEN492_tree = (Object)adaptor.create(TOKEN492);
            adaptor.addChild(root_0, TOKEN492_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(473, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:476:1: wdt : 'WDT' TOKEN ;
    public final ChemicalChunkerParser.wdt_return wdt() throws RecognitionException {
        ChemicalChunkerParser.wdt_return retval = new ChemicalChunkerParser.wdt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal493=null;
        Token TOKEN494=null;

        Object string_literal493_tree=null;
        Object TOKEN494_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wdt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(476, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:476:4: ( 'WDT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:476:5: 'WDT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(476,5);
            string_literal493=(Token)match(input,174,FOLLOW_174_in_wdt2371); 
            string_literal493_tree = (Object)adaptor.create(string_literal493);
            adaptor.addChild(root_0, string_literal493_tree);

            dbg.location(476,11);
            TOKEN494=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wdt2373); 
            TOKEN494_tree = (Object)adaptor.create(TOKEN494);
            adaptor.addChild(root_0, TOKEN494_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(476, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:479:1: wp_poss : 'WP$' TOKEN ;
    public final ChemicalChunkerParser.wp_poss_return wp_poss() throws RecognitionException {
        ChemicalChunkerParser.wp_poss_return retval = new ChemicalChunkerParser.wp_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal495=null;
        Token TOKEN496=null;

        Object string_literal495_tree=null;
        Object TOKEN496_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wp_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(479, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:479:8: ( 'WP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:479:9: 'WP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(479,9);
            string_literal495=(Token)match(input,175,FOLLOW_175_in_wp_poss2380); 
            string_literal495_tree = (Object)adaptor.create(string_literal495);
            adaptor.addChild(root_0, string_literal495_tree);

            dbg.location(479,15);
            TOKEN496=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wp_poss2382); 
            TOKEN496_tree = (Object)adaptor.create(TOKEN496);
            adaptor.addChild(root_0, TOKEN496_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(479, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:482:1: wpo : 'WPO' TOKEN ;
    public final ChemicalChunkerParser.wpo_return wpo() throws RecognitionException {
        ChemicalChunkerParser.wpo_return retval = new ChemicalChunkerParser.wpo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal497=null;
        Token TOKEN498=null;

        Object string_literal497_tree=null;
        Object TOKEN498_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wpo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(482, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:482:4: ( 'WPO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:482:5: 'WPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(482,5);
            string_literal497=(Token)match(input,176,FOLLOW_176_in_wpo2389); 
            string_literal497_tree = (Object)adaptor.create(string_literal497);
            adaptor.addChild(root_0, string_literal497_tree);

            dbg.location(482,11);
            TOKEN498=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wpo2391); 
            TOKEN498_tree = (Object)adaptor.create(TOKEN498);
            adaptor.addChild(root_0, TOKEN498_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(482, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:485:1: wps : 'WPS' TOKEN ;
    public final ChemicalChunkerParser.wps_return wps() throws RecognitionException {
        ChemicalChunkerParser.wps_return retval = new ChemicalChunkerParser.wps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal499=null;
        Token TOKEN500=null;

        Object string_literal499_tree=null;
        Object TOKEN500_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(485, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:485:4: ( 'WPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:485:5: 'WPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(485,5);
            string_literal499=(Token)match(input,177,FOLLOW_177_in_wps2398); 
            string_literal499_tree = (Object)adaptor.create(string_literal499);
            adaptor.addChild(root_0, string_literal499_tree);

            dbg.location(485,11);
            TOKEN500=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wps2400); 
            TOKEN500_tree = (Object)adaptor.create(TOKEN500);
            adaptor.addChild(root_0, TOKEN500_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(485, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:488:1: wql : 'WQL' TOKEN ;
    public final ChemicalChunkerParser.wql_return wql() throws RecognitionException {
        ChemicalChunkerParser.wql_return retval = new ChemicalChunkerParser.wql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal501=null;
        Token TOKEN502=null;

        Object string_literal501_tree=null;
        Object TOKEN502_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(488, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:488:4: ( 'WQL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:488:5: 'WQL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(488,5);
            string_literal501=(Token)match(input,178,FOLLOW_178_in_wql2407); 
            string_literal501_tree = (Object)adaptor.create(string_literal501);
            adaptor.addChild(root_0, string_literal501_tree);

            dbg.location(488,11);
            TOKEN502=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wql2409); 
            TOKEN502_tree = (Object)adaptor.create(TOKEN502);
            adaptor.addChild(root_0, TOKEN502_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(488, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:491:1: wrb : 'WRB' TOKEN ;
    public final ChemicalChunkerParser.wrb_return wrb() throws RecognitionException {
        ChemicalChunkerParser.wrb_return retval = new ChemicalChunkerParser.wrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal503=null;
        Token TOKEN504=null;

        Object string_literal503_tree=null;
        Object TOKEN504_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(491, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:491:4: ( 'WRB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/uk/ac/cam/ch/wwmm/chemicaltagger/ChemicalChunker.g:491:5: 'WRB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(491,5);
            string_literal503=(Token)match(input,179,FOLLOW_179_in_wrb2416); 
            string_literal503_tree = (Object)adaptor.create(string_literal503);
            adaptor.addChild(root_0, string_literal503_tree);

            dbg.location(491,11);
            TOKEN504=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wrb2418); 
            TOKEN504_tree = (Object)adaptor.create(TOKEN504);
            adaptor.addChild(root_0, TOKEN504_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(491, 16);

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
        "\1\u00b1\107\uffff";
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
            "\1\2\12\uffff\1\3\1\4\1\5\1\6\27\uffff\1\44\1\45\1\46\5\uffff"+
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
        "\1\u00b1\35\uffff";
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
            "\5\1\27\uffff\3\1\5\uffff\1\1\3\uffff\1\27\1\30\1\31\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\1\u00b1\1\uffff\1\11\1\u00b1\34\11\1\144\33\uffff\4\11\4\30\1\11"+
        "\1\62\2\11\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\2\37\uffff\33\1\14\uffff\2\1";
    static final String DFA7_specialS =
        "\112\uffff}>";
    static final String[] DFA7_transitionS = {
            "\3\1\2\uffff\22\1\2\uffff\2\1\1\uffff\21\1\1\uffff\20\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\6\1\1\uffff\1\2\3\uffff\1\1\22\uffff\2\1\4\uffff\1\1\11\uffff"+
            "\5\1\27\uffff\3\1\5\uffff\1\1\3\uffff\4\1",
            "",
            "\1\3",
            "\1\5\1\1\1\36\22\uffff\1\7\1\10\2\uffff\1\11\1\12\1\uffff\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\6\4\1\1\uffff\1\37\10\1\1\27\1\1\1\30\4\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\35\3"+
            "\1\1\uffff\1\1\3\uffff\1\1\22\uffff\1\1\1\4\4\uffff\1\1\12\uffff"+
            "\4\1\27\uffff\3\1\5\uffff\1\1\3\uffff\1\31\1\32\1\33\1\34",
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
            "\1\74\1\76\2\uffff\1\77\76\uffff\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\1\u00b1\1\uffff\1\11\1\u00b1\34\11\1\144\33\uffff\4\11\4\30\1\11"+
        "\1\62\2\11\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\37\uffff\33\1\14\uffff\2\1";
    static final String DFA8_specialS =
        "\112\uffff}>";
    static final String[] DFA8_transitionS = {
            "\3\1\2\uffff\22\1\2\uffff\2\1\1\uffff\21\1\1\uffff\20\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\6\1\1\uffff\1\1\3\uffff\1\1\22\uffff\1\2\1\1\4\uffff\1\1\11"+
            "\uffff\5\1\27\uffff\3\1\5\uffff\1\1\3\uffff\4\1",
            "",
            "\1\3",
            "\1\5\1\1\1\36\22\uffff\1\7\1\10\2\uffff\1\11\1\12\1\uffff\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\6\4\1\1\uffff\1\37\10\1\1\27\1\1\1\30\4\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\35\3"+
            "\1\1\uffff\1\1\3\uffff\1\1\22\uffff\1\1\1\4\4\uffff\1\1\12\uffff"+
            "\4\1\27\uffff\3\1\5\uffff\1\1\3\uffff\1\31\1\32\1\33\1\34",
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
            "\1\74\1\76\2\uffff\1\75\76\uffff\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
        "\1\u00b1\1\11\33\uffff\1\144\4\11\4\30\1\11\1\62";
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
            "\uffff\1\1\66\uffff\1\26\1\27\1\30\1\31",
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
            "\1\40\1\36\2\uffff\1\41\76\uffff\1\37",
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
        "\1\17\24\11\21\12\2\167\1\40\2\11\1\uffff\1\11\2\uffff\2\12\1\40";
    static final String DFA20_maxS =
        "\1\u0087\24\11\21\u00b1\1\u0087\1\167\1\47\2\11\1\uffff\1\11\2\uffff"+
        "\2\u00b1\1\144";
    static final String DFA20_acceptS =
        "\53\uffff\1\1\1\uffff\1\3\1\2\3\uffff";
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
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\4\uffff"+
            "\1\51\12\uffff\1\52\3\53\43\uffff\4\53",
            "\1\24\17\uffff\1\23",
            "\1\24",
            "\1\55\6\uffff\1\56",
            "\1\57",
            "\1\60",
            "",
            "\1\61",
            "",
            "",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\17\uffff"+
            "\1\52\3\53\43\uffff\4\53",
            "\3\53\22\uffff\2\53\2\uffff\2\53\1\uffff\15\53\5\uffff\1\53"+
            "\10\uffff\1\53\1\uffff\1\53\26\uffff\1\53\34\uffff\1\54\17\uffff"+
            "\4\53\43\uffff\4\53",
            "\1\55\2\53\2\uffff\1\53\1\uffff\1\56\74\uffff\1\53"
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
            return "57:1: prepphrase : ( prepphraseOther | prepphraseTemp | prepphraseTime );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_sentence_in_document149 = new BitSet(new long[]{0xFF7FFFD980001C02L,0x108000003F75EAFFL,0x0003C41C00000780L});
    public static final BitSet FOLLOW_nounphrase_in_sentence174 = new BitSet(new long[]{0xFF7FFFD980001C02L,0x10C00008BF75EAFFL,0x0003C41C00000780L});
    public static final BitSet FOLLOW_verbphrase_in_sentence176 = new BitSet(new long[]{0xFF7FFFD980001C02L,0x10C00008BF75EAFFL,0x0003C41C00000780L});
    public static final BitSet FOLLOW_comma_in_sentence181 = new BitSet(new long[]{0x0000000000000002L,0x0040000880000000L});
    public static final BitSet FOLLOW_cc_in_sentence183 = new BitSet(new long[]{0x0000000000000002L,0x0040000880000000L});
    public static final BitSet FOLLOW_stop_in_sentence185 = new BitSet(new long[]{0x0000000000000002L,0x0040000880000000L});
    public static final BitSet FOLLOW_dt_in_nounphrase221 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0003C00000000780L});
    public static final BitSet FOLLOW_adj_in_nounphrase224 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0003C00000000780L});
    public static final BitSet FOLLOW_noun_in_nounphrase227 = new BitSet(new long[]{0x0107FFD981041C02L,0x10C000008400000AL,0x0003C00000000780L});
    public static final BitSet FOLLOW_comma_in_nounphrase231 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0003C00000000780L});
    public static final BitSet FOLLOW_noun_in_nounphrase233 = new BitSet(new long[]{0x0000000001040002L,0x0040000080000000L});
    public static final BitSet FOLLOW_cc_in_nounphrase238 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0003C00000000780L});
    public static final BitSet FOLLOW_noun_in_nounphrase240 = new BitSet(new long[]{0x0000000001040002L,0x0040000000000000L});
    public static final BitSet FOLLOW_prepphraseOf_in_nounphrase244 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_prepphraseIN_in_nounphrase247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adv_in_verbphrase261 = new BitSet(new long[]{0xFF7FFFD9FFFF9C00L,0x108000003F75EAFFL,0x0003C41C000007C0L});
    public static final BitSet FOLLOW_vbd_in_verbphrase264 = new BitSet(new long[]{0xFF7FFFD9FFFF9C00L,0x108000003F75EAFFL,0x0003C41C000007C0L});
    public static final BitSet FOLLOW_verb_in_verbphrase267 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x0000001C000000C0L});
    public static final BitSet FOLLOW_adv_in_verbphrase269 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x0000001C000000C0L});
    public static final BitSet FOLLOW_prepphrase_in_verbphrase272 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_vbuse_in_verb283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbchange_in_verb285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsubmerge_in_verb287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsubject_in_verb289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbadd_in_verb291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcharge_in_verb293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcontain_in_verb295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdrop_in_verb297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbfill_in_verb299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsuspend_in_verb301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbtreat_in_verb303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbapparatus_in_verb305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbconcentrate_in_verb307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcool_in_verb309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdegass_in_verb311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdissolve_in_verb313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdry_in_verb315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbextract_in_verb317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbfilter_in_verb319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbheat_in_verb323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbincrease_in_verb325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbpartition_in_verb327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbprecipitate_in_verb329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbpurify_in_verb331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbquench_in_verb333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbrecover_in_verb335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbremove_in_verb337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbstir_in_verb339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsynthesize_in_verb341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbwait_in_verb343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbwash_in_verb345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbyield_in_verb347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_number366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcd_in_number368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmolecule_in_noun377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecule_in_noun379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnstate_in_noun381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntime_in_noun383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnatmosphere_in_noun385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nneq_in_noun387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnchementity_in_noun389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntemp_in_noun391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnflash_in_noun393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nngeneral_in_noun395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnmethod_in_noun397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnamount_in_noun399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnpressure_in_noun401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nncolumn_in_noun403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnchromatography_in_noun405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnvacuum_in_noun407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nncycle_in_noun409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntimes_in_noun411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnapparatus_in_noun413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnconcentrate_in_noun416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wdt_in_noun418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wp_poss_in_noun420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wpo_in_noun422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wps_in_noun424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnsynthesize_in_noun426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscaront_in_noun428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnmixture_in_noun430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jj_in_adj439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjr_in_adj441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjs_in_adj443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjt_in_adj445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcj_in_adj447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rb_in_adv455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rbr_in_adv457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rbt_in_adv459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseOther_in_prepphrase470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTemp_in_prepphrase472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTime_in_prepphrase474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseOther486 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0003C00000000780L});
    public static final BitSet FOLLOW_nounphrase_in_prepphraseOther489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inof_in_prepphraseOf512 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000000400000AL,0x0003C00000000780L});
    public static final BitSet FOLLOW_nounphrase_in_prepphraseOf515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inin_in_prepphraseIN539 = new BitSet(new long[]{0x0004000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_molecule_in_prepphraseIN541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseTime565 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_dt_in_prepphraseTime568 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_jj_in_prepphraseTime571 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_cd_in_prepphraseTime574 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_nntime_in_prepphraseTime576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseTemp606 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_dt_in_prepphraseTemp609 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_jj_in_prepphraseTemp612 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_cd_in_prepphraseTemp615 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_nntemp_in_prepphraseTemp617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_in_inAll650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inafter_in_inAll652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inas_in_inAll654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inbefore_in_inAll656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inby_in_inAll658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infor_in_inAll660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infrom_in_inAll662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inin_in_inAll664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ininto_in_inAll666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inof_in_inAll668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inoff_in_inAll670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inon_in_inAll672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inover_in_inAll674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inunder_in_inAll676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invia_in_inAll678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inwith_in_inAll680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inwithout_in_inAll682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_mmol696 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_nnmol_in_mmol698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_gram719 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_nngram_in_gram721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_percent742 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_nnpercent_in_percent744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_volume765 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_nnvol_in_volume767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mmol_in_measurements789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gram_in_measurements791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percent_in_measurements793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_measurements795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcm_in_oscarCM804 = new BitSet(new long[]{0x0004000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_measurements_in_moleculeamount1825 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_inof_in_moleculeamount1827 = new BitSet(new long[]{0x0004000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarCM_in_moleculeamount1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarCM_in_moleculeamount2837 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_amount_in_moleculeamount2839 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_moleculeamount1_in_moleculeamount849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moleculeamount2_in_moleculeamount853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moleculeamount_in_molecule874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_measurements_in_unnamedmoleculeamount1893 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_inof_in_unnamedmoleculeamount1895 = new BitSet(new long[]{0x0000000000000400L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarcd_in_unnamedmoleculeamount1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcd_in_unnamedmoleculeamount2905 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_amount_in_unnamedmoleculeamount2907 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_unnamedmoleculeamount1_in_unnamedmoleculeamount917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmoleculeamount2_in_unnamedmoleculeamount921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmoleculeamount_in_unnamedmolecule934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lrb_in_amount955 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_measurements_in_amount957 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
    public static final BitSet FOLLOW_comma_in_amount960 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_measurements_in_amount963 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
    public static final BitSet FOLLOW_rrb_in_amount968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nngeneral_in_method1005 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_nn_in_method1007 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_nnmethod_in_method1011 = new BitSet(new long[]{0x0000000000000402L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarcd_in_method1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_method1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_oscarcd1027 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcd1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_oscarcj1034 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcj1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_oscaront1042 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscaront1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_tmunicode1049 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_tmunicode1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_cdunicode1056 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cdunicode1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_inas1065 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inas1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_inbefore1072 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inbefore1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_inafter1079 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inafter1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_inin1086 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inin1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ininto1093 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ininto1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_inwith1100 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inwith1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_inwithout1107 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inwithout1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_inby1114 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inby1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_invia1121 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_invia1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_inof1128 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inof1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_inon1135 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inon1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_infor1142 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_infor1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_infrom1149 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_infrom1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_inunder1156 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inunder1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_inover1163 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inover1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_inoff1170 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inoff1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_nnstate1179 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnstate1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_nntime1186 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntime1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_nngram1193 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nngram1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_nnmol1200 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmol1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_nnatmosphere1207 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnatmosphere1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_nneq1214 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nneq1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nnvol1221 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnvol1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_nnchementity1228 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnchementity1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nntemp1235 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntemp1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_nnflash1242 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnflash1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_nngeneral1249 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nngeneral1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_nnmethod1256 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmethod1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_nnamount1263 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnamount1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_nnpressure1270 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpressure1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_nncolumn1277 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nncolumn1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_nnchromatography1284 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnchromatography1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_nnvacuum1291 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnvacuum1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_nncycle1298 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nncycle1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_nntimes1305 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntimes1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_oscarcm1314 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcm1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_vbuse1323 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbuse1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_vbchange1330 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbchange1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_vbsubmerge1337 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubmerge1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_vbsubject1344 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubject1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_nnadd1353 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnadd1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_nnmixture1360 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmixture1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_vbadd1367 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbadd1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_vbcharge1374 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcharge1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_vbcontain1381 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcontain1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_vbdrop1388 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdrop1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_vbfill1395 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbfill1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_vbsuspend1402 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsuspend1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_vbtreat1409 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbtreat1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_vbapparatus1418 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbapparatus1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_nnapparatus1425 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnapparatus1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_vbconcentrate1434 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbconcentrate1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_nnconcentrate1441 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnconcentrate1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_vbcool1450 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcool1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_vbdegass1459 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdegass1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_vbdissolve1468 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdissolve1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_vbdry1477 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdry1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_nndry1484 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nndry1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_vbextract1493 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbextract1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_nnextract1500 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnextract1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_vbfilter1509 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbfilter1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_nnfilter1516 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnfilter1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_vbheat1525 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbheat1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_vbincrease1532 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbincrease1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_vbpartition1541 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbpartition1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_vbprecipitate1550 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbprecipitate1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_nnprecipitate1557 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnprecipitate1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_vbpurify1566 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbpurify1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_nnpurify1573 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpurify1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_vbquench1582 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbquench1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_vbrecover1591 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbrecover1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_vbremove1600 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbremove1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_nnremove1607 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnremove1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_vbstir1616 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbstir1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_vbsynthesize1625 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsynthesize1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_nnsynthesize1632 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnsynthesize1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_vbwait1641 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbwait1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_vbwash1650 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbwash1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_vbyield1659 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbyield1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_colon1668 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_colon1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_comma1675 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_comma1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_apost1682 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_apost1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_neg1689 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_neg1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_dash1696 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dash1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_stop1703 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_stop1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_nnpercent1710 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpercent1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_lsqb1717 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_lsqb1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rsqb1724 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rsqb1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_lrb1731 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_lrb1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rrb1738 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rrb1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_abl1749 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abl1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_abn1758 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abn1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_abx1767 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abx1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ap1776 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ap1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_at1785 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_at1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_be1794 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_be1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_bed1803 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bed1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_bedz1812 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bedz1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_beg1821 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_beg1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_bem1830 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bem1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ben1839 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ben1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ber1848 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ber1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_bez1857 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bez1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_cc1866 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cc1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_cd1875 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cd1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_cs1884 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cs1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_dotok1894 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dotok1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_dod1903 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dod1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_doz1912 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_doz1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_dt1921 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dt1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_dti1930 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dti1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_dts1939 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dts1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_dtx1948 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dtx1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ex1957 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ex1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fw1966 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_fw1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_hv1975 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hv1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_hvd1984 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvd1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_hvg1993 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvg1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_hvn2002 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvn2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_in2011 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_in2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_jj2020 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jj2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_jjr2029 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjr2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_jjs2038 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjs2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_jjt2047 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjt2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_md2056 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_md2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_nc2065 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nc2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_nn2074 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nn2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_nn_poss2083 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nn_poss2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_nns2092 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nns2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_nns_poss2101 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nns_poss2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_np2110 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_np2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_np_poss2119 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_np_poss2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_nps2128 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nps2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_nps_poss2137 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nps_poss2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_nr2146 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nr2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_od2155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_od2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_pn2164 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pn2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_pn_poss2173 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pn_poss2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_pp_poss2182 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pp_poss2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_pp_poss_poss2191 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pp_poss_poss2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ppl2200 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppl2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ppls2209 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppls2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ppo2218 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppo2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_pps2227 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pps2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ppss2236 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppss2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ql2245 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ql2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_qlp2254 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_qlp2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_rb2263 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rb2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_rbr2272 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rbr2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_rbt2281 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rbt2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_rn2290 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rn2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_rp2299 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rp2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_to2308 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_to2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_uh2317 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_uh2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_vb2326 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vb2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_vbd2335 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbd2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_vbg2344 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbg2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_vbn2353 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbn2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_vbz2362 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbz2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_wdt2371 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wdt2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_wp_poss2380 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wp_poss2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_wpo2389 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wpo2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_wps2398 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wps2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_wql2407 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wql2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_wrb2416 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wrb2418 = new BitSet(new long[]{0x0000000000000002L});

}