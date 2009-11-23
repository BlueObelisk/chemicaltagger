// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g 2009-11-23 03:13:40

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WS", "NEWLINE", "ACHAR", "DIGIT", "TOKEN", "'CD'", "'CJ'", "'TM-UNICODE'", "'CD-UNICODE'", "'IN-AS'", "'IN-BEFORE'", "'IN-AFTER'", "'IN-IN'", "'IN-INTO'", "'IN-WITH'", "'IN-WITHOUT'", "'IN-BY'", "'IN-VIA'", "'IN-OF'", "'IN-ON'", "'IN-FOR'", "'IN-FROM'", "'IN-UNDER'", "'IN-OVER'", "'IN-OFF'", "'NN-STATE'", "'NN-TIME'", "'NN-GRAM'", "'NN-MOL'", "'NN-ATMOSPHERE'", "'NN-EQ'", "'NN-VOL'", "'NN-CHEMENTITY'", "'NN-TEMP'", "'NN-FLASH'", "'NN-GENERAL'", "'NN-METHOD'", "'NN-AMOUNT'", "'NN-PRESSURE'", "'NN-COLUMN'", "'NN-CHROMATOGRAPHY'", "'NN-VACUUM'", "'NN-CYCLE'", "'NN-TIMES'", "'CM'", "'VB-USE'", "'VB-CHANGE'", "'VB-SUBMERGE'", "'VB-SUBJECT'", "'NN-ADD'", "'NN-MIXTURE'", "'VB-ADD'", "'VB-CHARGE'", "'VB-CONTAIN'", "'VB-DROP'", "'VB-FILL'", "'VB-SUSPEND'", "'VB-TREAT'", "'VB-APPARATUS'", "'NN-APPARATUS'", "'VB-CONCENTRATE'", "'NN-CONCENTRATE'", "'VB-COOL'", "'VB-DEGASS'", "'VB-DISSOLVE'", "'VB-DRY'", "'NN-DRY'", "'VB-EXTRACT'", "'NN-EXTRACT'", "'VB-FILTER'", "'NN-FILTER'", "'VB-HEAT'", "'VB-INCREASE'", "'VB-PARTITION'", "'VB-PRECIPITATE'", "'NN-PRECIPITATE'", "'VB-PURIFY'", "'NN-PURIFY'", "'VB-QUENCH'", "'VB-RECOVER'", "'VB-REMOVE'", "'NN-REMOVE'", "'VB-STIR'", "'VB-SYNTHESIZE'", "'NN-SYNTHESIZE'", "'VB-WAIT'", "'VB-WASH'", "'VB-YIELD'", "'COLON'", "'COMMA'", "'APOST'", "'NEG'", "'DASH'", "'STOP'", "'NN-PERCENT'", "'LSQB'", "'RSQB'", "'LRB'", "'RRB'", "'ABL'", "'ABN'", "'ABX'", "'AP'", "'AT'", "'BE'", "'BED'", "'BEDZ'", "'BEG'", "'BEM'", "'BEN'", "'BER'", "'BEZ'", "'CC'", "'DT'", "'IN'", "'DTI'", "'DTS'", "'DTX'", "'EX'", "'FW'", "'HV'", "'HVD'", "'HVG'", "'HVN'", "'JJR'", "'JJS'", "'JJT'", "'MD'", "'NC'", "'WP$'", "'WPO'", "'WPS'", "'WQL'", "'WRB'", "'UH'", "'VB'", "'VBG'", "'VBN'", "'VBZ'", "'WDT'", "'RBR'", "'RBT'", "'RN'", "'RP'", "'PN'", "'PN$'", "'PP$'", "'PP$$'", "'PPL'", "'PPLS'", "'PPO'", "'PPS'", "'PPSS'", "'QL'", "'QLP'", "'NN$'", "'NNS$'", "'NP'", "'NP$'", "'NPS'", "'NPS$'", "'NR'", "'OD'", "'CS'", "'DO'", "'DOD'", "'DOZ'", "'JJ'", "'NN'", "'NNS'", "'RB'", "'TO'", "'VBD'"
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
    public static final int T__34=34;
    public static final int NEWLINE=5;
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
        "invalidRule", "nnstate", "rb", "ppss", "vbincrease", "vbyield", 
        "nounphrase", "dts", "dash", "inunder", "nr", "vb", "pndollar", 
        "md", "nnamount", "vbz", "wps", "vbd", "nc", "rbt", "qlp", "nndry", 
        "vbsuspend", "infor", "nnprecipitate", "nncycle", "nn", "nngram", 
        "oscarcm", "vbremove", "inby", "wrb", "ben", "vbquench", "oscarcd", 
        "ppdollardollar", "wpo", "inon", "colon", "dt", "nnconcentrate", 
        "pn", "np", "ap", "vbapparatus", "vbrecover", "nnapparatus", "dotoken", 
        "nnadd", "nnpurify", "hvd", "nnpressure", "gram", "bedz", "doz", 
        "rrb", "comma", "ppo", "cd", "document", "hvn", "vbn", "infrom", 
        "nnflash", "nnmol", "vbextract", "nnchementity", "vbsubject", "nnsynthesize", 
        "vbdegass", "nntemp", "amount", "vbsubmerge", "rp", "bez", "vbprecipitate", 
        "ppdollar", "bem", "vbcharge", "vbchange", "inwith", "nngeneral", 
        "ber", "pps", "vbdissolve", "nncolumn", "ininto", "fw", "molecules", 
        "at", "inafter", "invia", "inwithout", "nnvol", "nnextract", "vbheat", 
        "nndollar", "ppls", "lsqb", "vbconcentrate", "ql", "molecule", "oscarcj", 
        "prepphrase", "neg", "cs", "vbwash", "ppl", "wpdollar", "tmunicode", 
        "vbsynthesize", "nnvacuum", "hv", "vbdry", "nnfilter", "hvg", "vbtreat", 
        "bed", "lrb", "dti", "nnmixture", "nps", "nnatmosphere", "nnremove", 
        "npsdollar", "ex", "beg", "vbfill", "nns", "vbdrop", "nntime", "wql", 
        "be", "inas", "inoff", "od", "dtx", "vbpartition", "vbpurify", "inof", 
        "npdollar", "vbcool", "abn", "sentence", "mol", "inin", "inover", 
        "to", "rbr", "cc", "vbfilter", "apost", "rn", "nnpercent", "abl", 
        "nnmethod", "vbstir", "jjr", "in", "nnsdollar", "inbefore", "vbuse", 
        "vbadd", "vbcontain", "rsqb", "uh", "cdunicode", "nneq", "vbg", 
        "verbphraseADD", "jj", "abx", "jjt", "nnchromatography", "stop", 
        "nntimes", "wdt", "vbwait", "dod", "jjs"
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
    public String getGrammarFileName() { return "/home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g"; }


    public static class document_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "document"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:24:1: document : ( sentence )+ ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:24:9: ( ( sentence )+ )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:24:11: ( sentence )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(24,11);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:24:11: ( sentence )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==48||LA1_0==117) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:24:11: sentence
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

    public static class mol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mol"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:26:1: mol : cd nnmol ;
    public final ChemicalChunkerParser.mol_return mol() throws RecognitionException {
        ChemicalChunkerParser.mol_return retval = new ChemicalChunkerParser.mol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd2 = null;

        ChemicalChunkerParser.nnmol_return nnmol3 = null;



        try { dbg.enterRule(getGrammarFileName(), "mol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:26:5: ( cd nnmol )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:26:7: cd nnmol
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(26,7);
            pushFollow(FOLLOW_cd_in_mol144);
            cd2=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd2.getTree());
            dbg.location(26,10);
            pushFollow(FOLLOW_nnmol_in_mol146);
            nnmol3=nnmol();

            state._fsp--;

            adaptor.addChild(root_0, nnmol3.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(26, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mol");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mol"

    public static class sentence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sentence"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:27:1: sentence : nounphrase verbphraseADD prepphrase ;
    public final ChemicalChunkerParser.sentence_return sentence() throws RecognitionException {
        ChemicalChunkerParser.sentence_return retval = new ChemicalChunkerParser.sentence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase4 = null;

        ChemicalChunkerParser.verbphraseADD_return verbphraseADD5 = null;

        ChemicalChunkerParser.prepphrase_return prepphrase6 = null;



        try { dbg.enterRule(getGrammarFileName(), "sentence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:28:2: ( nounphrase verbphraseADD prepphrase )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:28:5: nounphrase verbphraseADD prepphrase
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(28,5);
            pushFollow(FOLLOW_nounphrase_in_sentence156);
            nounphrase4=nounphrase();

            state._fsp--;

            adaptor.addChild(root_0, nounphrase4.getTree());
            dbg.location(28,16);
            pushFollow(FOLLOW_verbphraseADD_in_sentence158);
            verbphraseADD5=verbphraseADD();

            state._fsp--;

            adaptor.addChild(root_0, verbphraseADD5.getTree());
            dbg.location(28,30);
            pushFollow(FOLLOW_prepphrase_in_sentence160);
            prepphrase6=prepphrase();

            state._fsp--;

            adaptor.addChild(root_0, prepphrase6.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(28, 40);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:30:1: nounphrase : molecules ;
    public final ChemicalChunkerParser.nounphrase_return nounphrase() throws RecognitionException {
        ChemicalChunkerParser.nounphrase_return retval = new ChemicalChunkerParser.nounphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.molecules_return molecules7 = null;



        try { dbg.enterRule(getGrammarFileName(), "nounphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:31:2: ( molecules )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:31:3: molecules
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(31,3);
            pushFollow(FOLLOW_molecules_in_nounphrase169);
            molecules7=molecules();

            state._fsp--;

            adaptor.addChild(root_0, molecules7.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(31, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nounphrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nounphrase"

    public static class verbphraseADD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verbphraseADD"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:33:1: verbphraseADD : ( vbd )* vbadd ;
    public final ChemicalChunkerParser.verbphraseADD_return verbphraseADD() throws RecognitionException {
        ChemicalChunkerParser.verbphraseADD_return retval = new ChemicalChunkerParser.verbphraseADD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.vbd_return vbd8 = null;

        ChemicalChunkerParser.vbadd_return vbadd9 = null;



        try { dbg.enterRule(getGrammarFileName(), "verbphraseADD");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:34:2: ( ( vbd )* vbadd )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:34:4: ( vbd )* vbadd
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(34,4);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:34:4: ( vbd )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==176) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:34:4: vbd
            	    {
            	    dbg.location(34,4);
            	    pushFollow(FOLLOW_vbd_in_verbphraseADD183);
            	    vbd8=vbd();

            	    state._fsp--;

            	    adaptor.addChild(root_0, vbd8.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(34,9);
            pushFollow(FOLLOW_vbadd_in_verbphraseADD186);
            vbadd9=vbadd();

            state._fsp--;

            adaptor.addChild(root_0, vbadd9.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(34, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "verbphraseADD");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "verbphraseADD"

    public static class prepphrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prepphrase"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:37:1: prepphrase : to molecule ;
    public final ChemicalChunkerParser.prepphrase_return prepphrase() throws RecognitionException {
        ChemicalChunkerParser.prepphrase_return retval = new ChemicalChunkerParser.prepphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.to_return to10 = null;

        ChemicalChunkerParser.molecule_return molecule11 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:38:2: ( to molecule )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:38:4: to molecule
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(38,4);
            pushFollow(FOLLOW_to_in_prepphrase197);
            to10=to();

            state._fsp--;

            adaptor.addChild(root_0, to10.getTree());
            dbg.location(38,7);
            pushFollow(FOLLOW_molecule_in_prepphrase199);
            molecule11=molecule();

            state._fsp--;

            adaptor.addChild(root_0, molecule11.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(38, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prepphrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prepphrase"

    public static class gram_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "gram"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:40:1: gram : cd nngram ;
    public final ChemicalChunkerParser.gram_return gram() throws RecognitionException {
        ChemicalChunkerParser.gram_return retval = new ChemicalChunkerParser.gram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd12 = null;

        ChemicalChunkerParser.nngram_return nngram13 = null;



        try { dbg.enterRule(getGrammarFileName(), "gram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:40:6: ( cd nngram )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:40:8: cd nngram
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(40,8);
            pushFollow(FOLLOW_cd_in_gram210);
            cd12=cd();

            state._fsp--;

            adaptor.addChild(root_0, cd12.getTree());
            dbg.location(40,11);
            pushFollow(FOLLOW_nngram_in_gram212);
            nngram13=nngram();

            state._fsp--;

            adaptor.addChild(root_0, nngram13.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(40, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "gram");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "gram"

    public static class molecules_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "molecules"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:42:1: molecules : molecule cc molecule ;
    public final ChemicalChunkerParser.molecules_return molecules() throws RecognitionException {
        ChemicalChunkerParser.molecules_return retval = new ChemicalChunkerParser.molecules_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.molecule_return molecule14 = null;

        ChemicalChunkerParser.cc_return cc15 = null;

        ChemicalChunkerParser.molecule_return molecule16 = null;



        try { dbg.enterRule(getGrammarFileName(), "molecules");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:43:2: ( molecule cc molecule )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:43:4: molecule cc molecule
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(43,4);
            pushFollow(FOLLOW_molecule_in_molecules223);
            molecule14=molecule();

            state._fsp--;

            adaptor.addChild(root_0, molecule14.getTree());
            dbg.location(43,13);
            pushFollow(FOLLOW_cc_in_molecules225);
            cc15=cc();

            state._fsp--;

            adaptor.addChild(root_0, cc15.getTree());
            dbg.location(43,16);
            pushFollow(FOLLOW_molecule_in_molecules227);
            molecule16=molecule();

            state._fsp--;

            adaptor.addChild(root_0, molecule16.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(43, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "molecules");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "molecules"

    public static class molecule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "molecule"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:44:1: molecule : ( dt )* ( oscarcm )+ amount ;
    public final ChemicalChunkerParser.molecule_return molecule() throws RecognitionException {
        ChemicalChunkerParser.molecule_return retval = new ChemicalChunkerParser.molecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.dt_return dt17 = null;

        ChemicalChunkerParser.oscarcm_return oscarcm18 = null;

        ChemicalChunkerParser.amount_return amount19 = null;



        try { dbg.enterRule(getGrammarFileName(), "molecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:45:2: ( ( dt )* ( oscarcm )+ amount )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:45:5: ( dt )* ( oscarcm )+ amount
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(45,5);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:45:5: ( dt )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==117) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:45:5: dt
            	    {
            	    dbg.location(45,5);
            	    pushFollow(FOLLOW_dt_in_molecule248);
            	    dt17=dt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, dt17.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(45,9);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:45:9: ( oscarcm )+
            int cnt4=0;
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==48) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:45:9: oscarcm
            	    {
            	    dbg.location(45,9);
            	    pushFollow(FOLLOW_oscarcm_in_molecule251);
            	    oscarcm18=oscarcm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, oscarcm18.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt4++;
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(45,18);
            pushFollow(FOLLOW_amount_in_molecule254);
            amount19=amount();

            state._fsp--;

            adaptor.addChild(root_0, amount19.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(45, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "molecule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "molecule"

    public static class amount_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "amount"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:46:1: amount : lrb gram comma mol rrb ;
    public final ChemicalChunkerParser.amount_return amount() throws RecognitionException {
        ChemicalChunkerParser.amount_return retval = new ChemicalChunkerParser.amount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.lrb_return lrb20 = null;

        ChemicalChunkerParser.gram_return gram21 = null;

        ChemicalChunkerParser.comma_return comma22 = null;

        ChemicalChunkerParser.mol_return mol23 = null;

        ChemicalChunkerParser.rrb_return rrb24 = null;



        try { dbg.enterRule(getGrammarFileName(), "amount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:46:9: ( lrb gram comma mol rrb )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:46:11: lrb gram comma mol rrb
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(46,11);
            pushFollow(FOLLOW_lrb_in_amount263);
            lrb20=lrb();

            state._fsp--;

            adaptor.addChild(root_0, lrb20.getTree());
            dbg.location(46,15);
            pushFollow(FOLLOW_gram_in_amount265);
            gram21=gram();

            state._fsp--;

            adaptor.addChild(root_0, gram21.getTree());
            dbg.location(46,20);
            pushFollow(FOLLOW_comma_in_amount267);
            comma22=comma();

            state._fsp--;

            adaptor.addChild(root_0, comma22.getTree());
            dbg.location(46,27);
            pushFollow(FOLLOW_mol_in_amount270);
            mol23=mol();

            state._fsp--;

            adaptor.addChild(root_0, mol23.getTree());
            dbg.location(46,31);
            pushFollow(FOLLOW_rrb_in_amount272);
            rrb24=rrb();

            state._fsp--;

            adaptor.addChild(root_0, rrb24.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(46, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "amount");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "amount"

    public static class oscarcd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oscarcd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:49:1: oscarcd : 'CD' TOKEN ;
    public final ChemicalChunkerParser.oscarcd_return oscarcd() throws RecognitionException {
        ChemicalChunkerParser.oscarcd_return retval = new ChemicalChunkerParser.oscarcd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal25=null;
        Token TOKEN26=null;

        Object string_literal25_tree=null;
        Object TOKEN26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:49:8: ( 'CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:49:9: 'CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(49,9);
            string_literal25=(Token)match(input,9,FOLLOW_9_in_oscarcd279); 
            string_literal25_tree = (Object)adaptor.create(string_literal25);
            adaptor.addChild(root_0, string_literal25_tree);

            dbg.location(49,14);
            TOKEN26=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcd281); 
            TOKEN26_tree = (Object)adaptor.create(TOKEN26);
            adaptor.addChild(root_0, TOKEN26_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(49, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:50:1: oscarcj : 'CJ' TOKEN ;
    public final ChemicalChunkerParser.oscarcj_return oscarcj() throws RecognitionException {
        ChemicalChunkerParser.oscarcj_return retval = new ChemicalChunkerParser.oscarcj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal27=null;
        Token TOKEN28=null;

        Object string_literal27_tree=null;
        Object TOKEN28_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:50:8: ( 'CJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:50:9: 'CJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(50,9);
            string_literal27=(Token)match(input,10,FOLLOW_10_in_oscarcj286); 
            string_literal27_tree = (Object)adaptor.create(string_literal27);
            adaptor.addChild(root_0, string_literal27_tree);

            dbg.location(50,14);
            TOKEN28=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcj288); 
            TOKEN28_tree = (Object)adaptor.create(TOKEN28);
            adaptor.addChild(root_0, TOKEN28_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(50, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oscarcj");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "oscarcj"

    public static class tmunicode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tmunicode"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:51:1: tmunicode : 'TM-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.tmunicode_return tmunicode() throws RecognitionException {
        ChemicalChunkerParser.tmunicode_return retval = new ChemicalChunkerParser.tmunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal29=null;
        Token TOKEN30=null;

        Object string_literal29_tree=null;
        Object TOKEN30_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "tmunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:51:10: ( 'TM-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:51:11: 'TM-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(51,11);
            string_literal29=(Token)match(input,11,FOLLOW_11_in_tmunicode293); 
            string_literal29_tree = (Object)adaptor.create(string_literal29);
            adaptor.addChild(root_0, string_literal29_tree);

            dbg.location(51,24);
            TOKEN30=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_tmunicode295); 
            TOKEN30_tree = (Object)adaptor.create(TOKEN30);
            adaptor.addChild(root_0, TOKEN30_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:52:1: cdunicode : 'CD-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.cdunicode_return cdunicode() throws RecognitionException {
        ChemicalChunkerParser.cdunicode_return retval = new ChemicalChunkerParser.cdunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal31=null;
        Token TOKEN32=null;

        Object string_literal31_tree=null;
        Object TOKEN32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cdunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:52:10: ( 'CD-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:52:11: 'CD-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(52,11);
            string_literal31=(Token)match(input,12,FOLLOW_12_in_cdunicode300); 
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            dbg.location(52,24);
            TOKEN32=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cdunicode302); 
            TOKEN32_tree = (Object)adaptor.create(TOKEN32);
            adaptor.addChild(root_0, TOKEN32_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(52, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:55:1: inas : 'IN-AS' TOKEN ;
    public final ChemicalChunkerParser.inas_return inas() throws RecognitionException {
        ChemicalChunkerParser.inas_return retval = new ChemicalChunkerParser.inas_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal33=null;
        Token TOKEN34=null;

        Object string_literal33_tree=null;
        Object TOKEN34_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inas");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:55:5: ( 'IN-AS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:55:6: 'IN-AS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(55,6);
            string_literal33=(Token)match(input,13,FOLLOW_13_in_inas309); 
            string_literal33_tree = (Object)adaptor.create(string_literal33);
            adaptor.addChild(root_0, string_literal33_tree);

            dbg.location(55,14);
            TOKEN34=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inas311); 
            TOKEN34_tree = (Object)adaptor.create(TOKEN34);
            adaptor.addChild(root_0, TOKEN34_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(55, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:56:1: inbefore : 'IN-BEFORE' TOKEN ;
    public final ChemicalChunkerParser.inbefore_return inbefore() throws RecognitionException {
        ChemicalChunkerParser.inbefore_return retval = new ChemicalChunkerParser.inbefore_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal35=null;
        Token TOKEN36=null;

        Object string_literal35_tree=null;
        Object TOKEN36_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inbefore");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:56:9: ( 'IN-BEFORE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:56:10: 'IN-BEFORE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(56,10);
            string_literal35=(Token)match(input,14,FOLLOW_14_in_inbefore316); 
            string_literal35_tree = (Object)adaptor.create(string_literal35);
            adaptor.addChild(root_0, string_literal35_tree);

            dbg.location(56,22);
            TOKEN36=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inbefore318); 
            TOKEN36_tree = (Object)adaptor.create(TOKEN36);
            adaptor.addChild(root_0, TOKEN36_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(56, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:57:1: inafter : 'IN-AFTER' TOKEN ;
    public final ChemicalChunkerParser.inafter_return inafter() throws RecognitionException {
        ChemicalChunkerParser.inafter_return retval = new ChemicalChunkerParser.inafter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal37=null;
        Token TOKEN38=null;

        Object string_literal37_tree=null;
        Object TOKEN38_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inafter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:57:8: ( 'IN-AFTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:57:9: 'IN-AFTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(57,9);
            string_literal37=(Token)match(input,15,FOLLOW_15_in_inafter323); 
            string_literal37_tree = (Object)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);

            dbg.location(57,20);
            TOKEN38=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inafter325); 
            TOKEN38_tree = (Object)adaptor.create(TOKEN38);
            adaptor.addChild(root_0, TOKEN38_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(57, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:58:1: inin : 'IN-IN' TOKEN ;
    public final ChemicalChunkerParser.inin_return inin() throws RecognitionException {
        ChemicalChunkerParser.inin_return retval = new ChemicalChunkerParser.inin_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal39=null;
        Token TOKEN40=null;

        Object string_literal39_tree=null;
        Object TOKEN40_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inin");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:58:5: ( 'IN-IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:58:6: 'IN-IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(58,6);
            string_literal39=(Token)match(input,16,FOLLOW_16_in_inin330); 
            string_literal39_tree = (Object)adaptor.create(string_literal39);
            adaptor.addChild(root_0, string_literal39_tree);

            dbg.location(58,14);
            TOKEN40=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inin332); 
            TOKEN40_tree = (Object)adaptor.create(TOKEN40);
            adaptor.addChild(root_0, TOKEN40_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(58, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:59:1: ininto : 'IN-INTO' TOKEN ;
    public final ChemicalChunkerParser.ininto_return ininto() throws RecognitionException {
        ChemicalChunkerParser.ininto_return retval = new ChemicalChunkerParser.ininto_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal41=null;
        Token TOKEN42=null;

        Object string_literal41_tree=null;
        Object TOKEN42_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ininto");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:59:7: ( 'IN-INTO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:59:8: 'IN-INTO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(59,8);
            string_literal41=(Token)match(input,17,FOLLOW_17_in_ininto337); 
            string_literal41_tree = (Object)adaptor.create(string_literal41);
            adaptor.addChild(root_0, string_literal41_tree);

            dbg.location(59,18);
            TOKEN42=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ininto339); 
            TOKEN42_tree = (Object)adaptor.create(TOKEN42);
            adaptor.addChild(root_0, TOKEN42_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(59, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:60:1: inwith : 'IN-WITH' TOKEN ;
    public final ChemicalChunkerParser.inwith_return inwith() throws RecognitionException {
        ChemicalChunkerParser.inwith_return retval = new ChemicalChunkerParser.inwith_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        Token TOKEN44=null;

        Object string_literal43_tree=null;
        Object TOKEN44_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:60:7: ( 'IN-WITH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:60:8: 'IN-WITH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(60,8);
            string_literal43=(Token)match(input,18,FOLLOW_18_in_inwith344); 
            string_literal43_tree = (Object)adaptor.create(string_literal43);
            adaptor.addChild(root_0, string_literal43_tree);

            dbg.location(60,18);
            TOKEN44=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwith346); 
            TOKEN44_tree = (Object)adaptor.create(TOKEN44);
            adaptor.addChild(root_0, TOKEN44_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(60, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:61:1: inwithout : 'IN-WITHOUT' TOKEN ;
    public final ChemicalChunkerParser.inwithout_return inwithout() throws RecognitionException {
        ChemicalChunkerParser.inwithout_return retval = new ChemicalChunkerParser.inwithout_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal45=null;
        Token TOKEN46=null;

        Object string_literal45_tree=null;
        Object TOKEN46_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwithout");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:61:10: ( 'IN-WITHOUT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:61:11: 'IN-WITHOUT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(61,11);
            string_literal45=(Token)match(input,19,FOLLOW_19_in_inwithout351); 
            string_literal45_tree = (Object)adaptor.create(string_literal45);
            adaptor.addChild(root_0, string_literal45_tree);

            dbg.location(61,24);
            TOKEN46=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwithout353); 
            TOKEN46_tree = (Object)adaptor.create(TOKEN46);
            adaptor.addChild(root_0, TOKEN46_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(61, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:62:1: inby : 'IN-BY' TOKEN ;
    public final ChemicalChunkerParser.inby_return inby() throws RecognitionException {
        ChemicalChunkerParser.inby_return retval = new ChemicalChunkerParser.inby_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal47=null;
        Token TOKEN48=null;

        Object string_literal47_tree=null;
        Object TOKEN48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inby");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:62:5: ( 'IN-BY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:62:6: 'IN-BY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(62,6);
            string_literal47=(Token)match(input,20,FOLLOW_20_in_inby358); 
            string_literal47_tree = (Object)adaptor.create(string_literal47);
            adaptor.addChild(root_0, string_literal47_tree);

            dbg.location(62,14);
            TOKEN48=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inby360); 
            TOKEN48_tree = (Object)adaptor.create(TOKEN48);
            adaptor.addChild(root_0, TOKEN48_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(62, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:63:1: invia : 'IN-VIA' TOKEN ;
    public final ChemicalChunkerParser.invia_return invia() throws RecognitionException {
        ChemicalChunkerParser.invia_return retval = new ChemicalChunkerParser.invia_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        Token TOKEN50=null;

        Object string_literal49_tree=null;
        Object TOKEN50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "invia");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:63:6: ( 'IN-VIA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:63:7: 'IN-VIA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(63,7);
            string_literal49=(Token)match(input,21,FOLLOW_21_in_invia365); 
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            adaptor.addChild(root_0, string_literal49_tree);

            dbg.location(63,16);
            TOKEN50=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_invia367); 
            TOKEN50_tree = (Object)adaptor.create(TOKEN50);
            adaptor.addChild(root_0, TOKEN50_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(63, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:64:1: inof : 'IN-OF' TOKEN ;
    public final ChemicalChunkerParser.inof_return inof() throws RecognitionException {
        ChemicalChunkerParser.inof_return retval = new ChemicalChunkerParser.inof_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal51=null;
        Token TOKEN52=null;

        Object string_literal51_tree=null;
        Object TOKEN52_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inof");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:64:5: ( 'IN-OF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:64:6: 'IN-OF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(64,6);
            string_literal51=(Token)match(input,22,FOLLOW_22_in_inof372); 
            string_literal51_tree = (Object)adaptor.create(string_literal51);
            adaptor.addChild(root_0, string_literal51_tree);

            dbg.location(64,14);
            TOKEN52=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inof374); 
            TOKEN52_tree = (Object)adaptor.create(TOKEN52);
            adaptor.addChild(root_0, TOKEN52_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(64, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:65:1: inon : 'IN-ON' TOKEN ;
    public final ChemicalChunkerParser.inon_return inon() throws RecognitionException {
        ChemicalChunkerParser.inon_return retval = new ChemicalChunkerParser.inon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal53=null;
        Token TOKEN54=null;

        Object string_literal53_tree=null;
        Object TOKEN54_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:65:5: ( 'IN-ON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:65:6: 'IN-ON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(65,6);
            string_literal53=(Token)match(input,23,FOLLOW_23_in_inon379); 
            string_literal53_tree = (Object)adaptor.create(string_literal53);
            adaptor.addChild(root_0, string_literal53_tree);

            dbg.location(65,14);
            TOKEN54=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inon381); 
            TOKEN54_tree = (Object)adaptor.create(TOKEN54);
            adaptor.addChild(root_0, TOKEN54_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(65, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:66:1: infor : 'IN-FOR' TOKEN ;
    public final ChemicalChunkerParser.infor_return infor() throws RecognitionException {
        ChemicalChunkerParser.infor_return retval = new ChemicalChunkerParser.infor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal55=null;
        Token TOKEN56=null;

        Object string_literal55_tree=null;
        Object TOKEN56_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:66:6: ( 'IN-FOR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:66:7: 'IN-FOR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(66,7);
            string_literal55=(Token)match(input,24,FOLLOW_24_in_infor386); 
            string_literal55_tree = (Object)adaptor.create(string_literal55);
            adaptor.addChild(root_0, string_literal55_tree);

            dbg.location(66,16);
            TOKEN56=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infor388); 
            TOKEN56_tree = (Object)adaptor.create(TOKEN56);
            adaptor.addChild(root_0, TOKEN56_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(66, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:67:1: infrom : 'IN-FROM' TOKEN ;
    public final ChemicalChunkerParser.infrom_return infrom() throws RecognitionException {
        ChemicalChunkerParser.infrom_return retval = new ChemicalChunkerParser.infrom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal57=null;
        Token TOKEN58=null;

        Object string_literal57_tree=null;
        Object TOKEN58_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infrom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:67:7: ( 'IN-FROM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:67:8: 'IN-FROM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(67,8);
            string_literal57=(Token)match(input,25,FOLLOW_25_in_infrom393); 
            string_literal57_tree = (Object)adaptor.create(string_literal57);
            adaptor.addChild(root_0, string_literal57_tree);

            dbg.location(67,18);
            TOKEN58=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infrom395); 
            TOKEN58_tree = (Object)adaptor.create(TOKEN58);
            adaptor.addChild(root_0, TOKEN58_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(67, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:68:1: inunder : 'IN-UNDER' TOKEN ;
    public final ChemicalChunkerParser.inunder_return inunder() throws RecognitionException {
        ChemicalChunkerParser.inunder_return retval = new ChemicalChunkerParser.inunder_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal59=null;
        Token TOKEN60=null;

        Object string_literal59_tree=null;
        Object TOKEN60_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inunder");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:68:8: ( 'IN-UNDER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:68:9: 'IN-UNDER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(68,9);
            string_literal59=(Token)match(input,26,FOLLOW_26_in_inunder400); 
            string_literal59_tree = (Object)adaptor.create(string_literal59);
            adaptor.addChild(root_0, string_literal59_tree);

            dbg.location(68,20);
            TOKEN60=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inunder402); 
            TOKEN60_tree = (Object)adaptor.create(TOKEN60);
            adaptor.addChild(root_0, TOKEN60_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(68, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:69:1: inover : 'IN-OVER' TOKEN ;
    public final ChemicalChunkerParser.inover_return inover() throws RecognitionException {
        ChemicalChunkerParser.inover_return retval = new ChemicalChunkerParser.inover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal61=null;
        Token TOKEN62=null;

        Object string_literal61_tree=null;
        Object TOKEN62_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:69:7: ( 'IN-OVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:69:8: 'IN-OVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(69,8);
            string_literal61=(Token)match(input,27,FOLLOW_27_in_inover407); 
            string_literal61_tree = (Object)adaptor.create(string_literal61);
            adaptor.addChild(root_0, string_literal61_tree);

            dbg.location(69,18);
            TOKEN62=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inover409); 
            TOKEN62_tree = (Object)adaptor.create(TOKEN62);
            adaptor.addChild(root_0, TOKEN62_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(69, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:70:1: inoff : 'IN-OFF' TOKEN ;
    public final ChemicalChunkerParser.inoff_return inoff() throws RecognitionException {
        ChemicalChunkerParser.inoff_return retval = new ChemicalChunkerParser.inoff_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal63=null;
        Token TOKEN64=null;

        Object string_literal63_tree=null;
        Object TOKEN64_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inoff");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:70:6: ( 'IN-OFF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:70:7: 'IN-OFF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(70,7);
            string_literal63=(Token)match(input,28,FOLLOW_28_in_inoff414); 
            string_literal63_tree = (Object)adaptor.create(string_literal63);
            adaptor.addChild(root_0, string_literal63_tree);

            dbg.location(70,16);
            TOKEN64=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inoff416); 
            TOKEN64_tree = (Object)adaptor.create(TOKEN64);
            adaptor.addChild(root_0, TOKEN64_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(70, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:73:1: nnstate : 'NN-STATE' TOKEN ;
    public final ChemicalChunkerParser.nnstate_return nnstate() throws RecognitionException {
        ChemicalChunkerParser.nnstate_return retval = new ChemicalChunkerParser.nnstate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal65=null;
        Token TOKEN66=null;

        Object string_literal65_tree=null;
        Object TOKEN66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnstate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:73:8: ( 'NN-STATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:73:9: 'NN-STATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(73,9);
            string_literal65=(Token)match(input,29,FOLLOW_29_in_nnstate423); 
            string_literal65_tree = (Object)adaptor.create(string_literal65);
            adaptor.addChild(root_0, string_literal65_tree);

            dbg.location(73,20);
            TOKEN66=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnstate425); 
            TOKEN66_tree = (Object)adaptor.create(TOKEN66);
            adaptor.addChild(root_0, TOKEN66_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(73, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:74:1: nntime : 'NN-TIME' TOKEN ;
    public final ChemicalChunkerParser.nntime_return nntime() throws RecognitionException {
        ChemicalChunkerParser.nntime_return retval = new ChemicalChunkerParser.nntime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal67=null;
        Token TOKEN68=null;

        Object string_literal67_tree=null;
        Object TOKEN68_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:74:7: ( 'NN-TIME' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:74:8: 'NN-TIME' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(74,8);
            string_literal67=(Token)match(input,30,FOLLOW_30_in_nntime430); 
            string_literal67_tree = (Object)adaptor.create(string_literal67);
            adaptor.addChild(root_0, string_literal67_tree);

            dbg.location(74,18);
            TOKEN68=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntime432); 
            TOKEN68_tree = (Object)adaptor.create(TOKEN68);
            adaptor.addChild(root_0, TOKEN68_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(74, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:75:1: nngram : 'NN-GRAM' TOKEN ;
    public final ChemicalChunkerParser.nngram_return nngram() throws RecognitionException {
        ChemicalChunkerParser.nngram_return retval = new ChemicalChunkerParser.nngram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal69=null;
        Token TOKEN70=null;

        Object string_literal69_tree=null;
        Object TOKEN70_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:75:7: ( 'NN-GRAM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:75:8: 'NN-GRAM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(75,8);
            string_literal69=(Token)match(input,31,FOLLOW_31_in_nngram437); 
            string_literal69_tree = (Object)adaptor.create(string_literal69);
            adaptor.addChild(root_0, string_literal69_tree);

            dbg.location(75,18);
            TOKEN70=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngram439); 
            TOKEN70_tree = (Object)adaptor.create(TOKEN70);
            adaptor.addChild(root_0, TOKEN70_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(75, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:76:1: nnmol : 'NN-MOL' TOKEN ;
    public final ChemicalChunkerParser.nnmol_return nnmol() throws RecognitionException {
        ChemicalChunkerParser.nnmol_return retval = new ChemicalChunkerParser.nnmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal71=null;
        Token TOKEN72=null;

        Object string_literal71_tree=null;
        Object TOKEN72_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:76:6: ( 'NN-MOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:76:7: 'NN-MOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(76,7);
            string_literal71=(Token)match(input,32,FOLLOW_32_in_nnmol444); 
            string_literal71_tree = (Object)adaptor.create(string_literal71);
            adaptor.addChild(root_0, string_literal71_tree);

            dbg.location(76,16);
            TOKEN72=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmol446); 
            TOKEN72_tree = (Object)adaptor.create(TOKEN72);
            adaptor.addChild(root_0, TOKEN72_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(76, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:77:1: nnatmosphere : 'NN-ATMOSPHERE' TOKEN ;
    public final ChemicalChunkerParser.nnatmosphere_return nnatmosphere() throws RecognitionException {
        ChemicalChunkerParser.nnatmosphere_return retval = new ChemicalChunkerParser.nnatmosphere_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal73=null;
        Token TOKEN74=null;

        Object string_literal73_tree=null;
        Object TOKEN74_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnatmosphere");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:77:13: ( 'NN-ATMOSPHERE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:77:14: 'NN-ATMOSPHERE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(77,14);
            string_literal73=(Token)match(input,33,FOLLOW_33_in_nnatmosphere451); 
            string_literal73_tree = (Object)adaptor.create(string_literal73);
            adaptor.addChild(root_0, string_literal73_tree);

            dbg.location(77,30);
            TOKEN74=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnatmosphere453); 
            TOKEN74_tree = (Object)adaptor.create(TOKEN74);
            adaptor.addChild(root_0, TOKEN74_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(77, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:78:1: nneq : 'NN-EQ' TOKEN ;
    public final ChemicalChunkerParser.nneq_return nneq() throws RecognitionException {
        ChemicalChunkerParser.nneq_return retval = new ChemicalChunkerParser.nneq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal75=null;
        Token TOKEN76=null;

        Object string_literal75_tree=null;
        Object TOKEN76_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nneq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:78:5: ( 'NN-EQ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:78:6: 'NN-EQ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(78,6);
            string_literal75=(Token)match(input,34,FOLLOW_34_in_nneq458); 
            string_literal75_tree = (Object)adaptor.create(string_literal75);
            adaptor.addChild(root_0, string_literal75_tree);

            dbg.location(78,14);
            TOKEN76=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nneq460); 
            TOKEN76_tree = (Object)adaptor.create(TOKEN76);
            adaptor.addChild(root_0, TOKEN76_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(78, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:79:1: nnvol : 'NN-VOL' TOKEN ;
    public final ChemicalChunkerParser.nnvol_return nnvol() throws RecognitionException {
        ChemicalChunkerParser.nnvol_return retval = new ChemicalChunkerParser.nnvol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal77=null;
        Token TOKEN78=null;

        Object string_literal77_tree=null;
        Object TOKEN78_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:79:6: ( 'NN-VOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:79:7: 'NN-VOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(79,7);
            string_literal77=(Token)match(input,35,FOLLOW_35_in_nnvol465); 
            string_literal77_tree = (Object)adaptor.create(string_literal77);
            adaptor.addChild(root_0, string_literal77_tree);

            dbg.location(79,16);
            TOKEN78=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvol467); 
            TOKEN78_tree = (Object)adaptor.create(TOKEN78);
            adaptor.addChild(root_0, TOKEN78_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(79, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:80:1: nnchementity : 'NN-CHEMENTITY' TOKEN ;
    public final ChemicalChunkerParser.nnchementity_return nnchementity() throws RecognitionException {
        ChemicalChunkerParser.nnchementity_return retval = new ChemicalChunkerParser.nnchementity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;
        Token TOKEN80=null;

        Object string_literal79_tree=null;
        Object TOKEN80_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchementity");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:80:13: ( 'NN-CHEMENTITY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:80:14: 'NN-CHEMENTITY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(80,14);
            string_literal79=(Token)match(input,36,FOLLOW_36_in_nnchementity472); 
            string_literal79_tree = (Object)adaptor.create(string_literal79);
            adaptor.addChild(root_0, string_literal79_tree);

            dbg.location(80,30);
            TOKEN80=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchementity474); 
            TOKEN80_tree = (Object)adaptor.create(TOKEN80);
            adaptor.addChild(root_0, TOKEN80_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(80, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:81:1: nntemp : 'NN-TEMP' TOKEN ;
    public final ChemicalChunkerParser.nntemp_return nntemp() throws RecognitionException {
        ChemicalChunkerParser.nntemp_return retval = new ChemicalChunkerParser.nntemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal81=null;
        Token TOKEN82=null;

        Object string_literal81_tree=null;
        Object TOKEN82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:81:7: ( 'NN-TEMP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:81:8: 'NN-TEMP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(81,8);
            string_literal81=(Token)match(input,37,FOLLOW_37_in_nntemp479); 
            string_literal81_tree = (Object)adaptor.create(string_literal81);
            adaptor.addChild(root_0, string_literal81_tree);

            dbg.location(81,18);
            TOKEN82=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntemp481); 
            TOKEN82_tree = (Object)adaptor.create(TOKEN82);
            adaptor.addChild(root_0, TOKEN82_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:82:1: nnflash : 'NN-FLASH' TOKEN ;
    public final ChemicalChunkerParser.nnflash_return nnflash() throws RecognitionException {
        ChemicalChunkerParser.nnflash_return retval = new ChemicalChunkerParser.nnflash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;
        Token TOKEN84=null;

        Object string_literal83_tree=null;
        Object TOKEN84_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnflash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:82:8: ( 'NN-FLASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:82:9: 'NN-FLASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(82,9);
            string_literal83=(Token)match(input,38,FOLLOW_38_in_nnflash486); 
            string_literal83_tree = (Object)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);

            dbg.location(82,20);
            TOKEN84=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnflash488); 
            TOKEN84_tree = (Object)adaptor.create(TOKEN84);
            adaptor.addChild(root_0, TOKEN84_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(82, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:83:1: nngeneral : 'NN-GENERAL' TOKEN ;
    public final ChemicalChunkerParser.nngeneral_return nngeneral() throws RecognitionException {
        ChemicalChunkerParser.nngeneral_return retval = new ChemicalChunkerParser.nngeneral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal85=null;
        Token TOKEN86=null;

        Object string_literal85_tree=null;
        Object TOKEN86_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngeneral");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:83:10: ( 'NN-GENERAL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:83:11: 'NN-GENERAL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(83,11);
            string_literal85=(Token)match(input,39,FOLLOW_39_in_nngeneral493); 
            string_literal85_tree = (Object)adaptor.create(string_literal85);
            adaptor.addChild(root_0, string_literal85_tree);

            dbg.location(83,24);
            TOKEN86=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngeneral495); 
            TOKEN86_tree = (Object)adaptor.create(TOKEN86);
            adaptor.addChild(root_0, TOKEN86_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(83, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:84:1: nnmethod : 'NN-METHOD' TOKEN ;
    public final ChemicalChunkerParser.nnmethod_return nnmethod() throws RecognitionException {
        ChemicalChunkerParser.nnmethod_return retval = new ChemicalChunkerParser.nnmethod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token TOKEN88=null;

        Object string_literal87_tree=null;
        Object TOKEN88_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmethod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:84:9: ( 'NN-METHOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:84:10: 'NN-METHOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(84,10);
            string_literal87=(Token)match(input,40,FOLLOW_40_in_nnmethod500); 
            string_literal87_tree = (Object)adaptor.create(string_literal87);
            adaptor.addChild(root_0, string_literal87_tree);

            dbg.location(84,22);
            TOKEN88=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmethod502); 
            TOKEN88_tree = (Object)adaptor.create(TOKEN88);
            adaptor.addChild(root_0, TOKEN88_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(84, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:85:1: nnamount : 'NN-AMOUNT' TOKEN ;
    public final ChemicalChunkerParser.nnamount_return nnamount() throws RecognitionException {
        ChemicalChunkerParser.nnamount_return retval = new ChemicalChunkerParser.nnamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal89=null;
        Token TOKEN90=null;

        Object string_literal89_tree=null;
        Object TOKEN90_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:85:9: ( 'NN-AMOUNT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:85:10: 'NN-AMOUNT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(85,10);
            string_literal89=(Token)match(input,41,FOLLOW_41_in_nnamount507); 
            string_literal89_tree = (Object)adaptor.create(string_literal89);
            adaptor.addChild(root_0, string_literal89_tree);

            dbg.location(85,22);
            TOKEN90=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnamount509); 
            TOKEN90_tree = (Object)adaptor.create(TOKEN90);
            adaptor.addChild(root_0, TOKEN90_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:86:1: nnpressure : 'NN-PRESSURE' TOKEN ;
    public final ChemicalChunkerParser.nnpressure_return nnpressure() throws RecognitionException {
        ChemicalChunkerParser.nnpressure_return retval = new ChemicalChunkerParser.nnpressure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal91=null;
        Token TOKEN92=null;

        Object string_literal91_tree=null;
        Object TOKEN92_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpressure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:86:11: ( 'NN-PRESSURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:86:12: 'NN-PRESSURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(86,12);
            string_literal91=(Token)match(input,42,FOLLOW_42_in_nnpressure514); 
            string_literal91_tree = (Object)adaptor.create(string_literal91);
            adaptor.addChild(root_0, string_literal91_tree);

            dbg.location(86,26);
            TOKEN92=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpressure516); 
            TOKEN92_tree = (Object)adaptor.create(TOKEN92);
            adaptor.addChild(root_0, TOKEN92_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(86, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:87:1: nncolumn : 'NN-COLUMN' TOKEN ;
    public final ChemicalChunkerParser.nncolumn_return nncolumn() throws RecognitionException {
        ChemicalChunkerParser.nncolumn_return retval = new ChemicalChunkerParser.nncolumn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal93=null;
        Token TOKEN94=null;

        Object string_literal93_tree=null;
        Object TOKEN94_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncolumn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:87:9: ( 'NN-COLUMN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:87:10: 'NN-COLUMN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(87,10);
            string_literal93=(Token)match(input,43,FOLLOW_43_in_nncolumn521); 
            string_literal93_tree = (Object)adaptor.create(string_literal93);
            adaptor.addChild(root_0, string_literal93_tree);

            dbg.location(87,22);
            TOKEN94=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncolumn523); 
            TOKEN94_tree = (Object)adaptor.create(TOKEN94);
            adaptor.addChild(root_0, TOKEN94_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:88:1: nnchromatography : 'NN-CHROMATOGRAPHY' TOKEN ;
    public final ChemicalChunkerParser.nnchromatography_return nnchromatography() throws RecognitionException {
        ChemicalChunkerParser.nnchromatography_return retval = new ChemicalChunkerParser.nnchromatography_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal95=null;
        Token TOKEN96=null;

        Object string_literal95_tree=null;
        Object TOKEN96_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchromatography");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:88:17: ( 'NN-CHROMATOGRAPHY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:88:18: 'NN-CHROMATOGRAPHY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(88,18);
            string_literal95=(Token)match(input,44,FOLLOW_44_in_nnchromatography528); 
            string_literal95_tree = (Object)adaptor.create(string_literal95);
            adaptor.addChild(root_0, string_literal95_tree);

            dbg.location(88,38);
            TOKEN96=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchromatography530); 
            TOKEN96_tree = (Object)adaptor.create(TOKEN96);
            adaptor.addChild(root_0, TOKEN96_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(88, 43);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:89:1: nnvacuum : 'NN-VACUUM' TOKEN ;
    public final ChemicalChunkerParser.nnvacuum_return nnvacuum() throws RecognitionException {
        ChemicalChunkerParser.nnvacuum_return retval = new ChemicalChunkerParser.nnvacuum_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal97=null;
        Token TOKEN98=null;

        Object string_literal97_tree=null;
        Object TOKEN98_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvacuum");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:89:9: ( 'NN-VACUUM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:89:10: 'NN-VACUUM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(89,10);
            string_literal97=(Token)match(input,45,FOLLOW_45_in_nnvacuum535); 
            string_literal97_tree = (Object)adaptor.create(string_literal97);
            adaptor.addChild(root_0, string_literal97_tree);

            dbg.location(89,22);
            TOKEN98=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvacuum537); 
            TOKEN98_tree = (Object)adaptor.create(TOKEN98);
            adaptor.addChild(root_0, TOKEN98_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(89, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:90:1: nncycle : 'NN-CYCLE' TOKEN ;
    public final ChemicalChunkerParser.nncycle_return nncycle() throws RecognitionException {
        ChemicalChunkerParser.nncycle_return retval = new ChemicalChunkerParser.nncycle_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal99=null;
        Token TOKEN100=null;

        Object string_literal99_tree=null;
        Object TOKEN100_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncycle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:90:8: ( 'NN-CYCLE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:90:9: 'NN-CYCLE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(90,9);
            string_literal99=(Token)match(input,46,FOLLOW_46_in_nncycle542); 
            string_literal99_tree = (Object)adaptor.create(string_literal99);
            adaptor.addChild(root_0, string_literal99_tree);

            dbg.location(90,20);
            TOKEN100=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncycle544); 
            TOKEN100_tree = (Object)adaptor.create(TOKEN100);
            adaptor.addChild(root_0, TOKEN100_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(90, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:91:1: nntimes : 'NN-TIMES' TOKEN ;
    public final ChemicalChunkerParser.nntimes_return nntimes() throws RecognitionException {
        ChemicalChunkerParser.nntimes_return retval = new ChemicalChunkerParser.nntimes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal101=null;
        Token TOKEN102=null;

        Object string_literal101_tree=null;
        Object TOKEN102_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntimes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:91:8: ( 'NN-TIMES' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:91:9: 'NN-TIMES' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(91,9);
            string_literal101=(Token)match(input,47,FOLLOW_47_in_nntimes549); 
            string_literal101_tree = (Object)adaptor.create(string_literal101);
            adaptor.addChild(root_0, string_literal101_tree);

            dbg.location(91,20);
            TOKEN102=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntimes551); 
            TOKEN102_tree = (Object)adaptor.create(TOKEN102);
            adaptor.addChild(root_0, TOKEN102_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(91, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:94:1: oscarcm : 'CM' TOKEN ;
    public final ChemicalChunkerParser.oscarcm_return oscarcm() throws RecognitionException {
        ChemicalChunkerParser.oscarcm_return retval = new ChemicalChunkerParser.oscarcm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal103=null;
        Token TOKEN104=null;

        Object string_literal103_tree=null;
        Object TOKEN104_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:94:8: ( 'CM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:94:9: 'CM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(94,9);
            string_literal103=(Token)match(input,48,FOLLOW_48_in_oscarcm558); 
            string_literal103_tree = (Object)adaptor.create(string_literal103);
            adaptor.addChild(root_0, string_literal103_tree);

            dbg.location(94,14);
            TOKEN104=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcm560); 
            TOKEN104_tree = (Object)adaptor.create(TOKEN104);
            adaptor.addChild(root_0, TOKEN104_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(94, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:97:1: vbuse : 'VB-USE' TOKEN ;
    public final ChemicalChunkerParser.vbuse_return vbuse() throws RecognitionException {
        ChemicalChunkerParser.vbuse_return retval = new ChemicalChunkerParser.vbuse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal105=null;
        Token TOKEN106=null;

        Object string_literal105_tree=null;
        Object TOKEN106_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbuse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:97:6: ( 'VB-USE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:97:7: 'VB-USE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(97,7);
            string_literal105=(Token)match(input,49,FOLLOW_49_in_vbuse567); 
            string_literal105_tree = (Object)adaptor.create(string_literal105);
            adaptor.addChild(root_0, string_literal105_tree);

            dbg.location(97,16);
            TOKEN106=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbuse569); 
            TOKEN106_tree = (Object)adaptor.create(TOKEN106);
            adaptor.addChild(root_0, TOKEN106_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(97, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:98:1: vbchange : 'VB-CHANGE' TOKEN ;
    public final ChemicalChunkerParser.vbchange_return vbchange() throws RecognitionException {
        ChemicalChunkerParser.vbchange_return retval = new ChemicalChunkerParser.vbchange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal107=null;
        Token TOKEN108=null;

        Object string_literal107_tree=null;
        Object TOKEN108_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbchange");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:98:9: ( 'VB-CHANGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:98:10: 'VB-CHANGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(98,10);
            string_literal107=(Token)match(input,50,FOLLOW_50_in_vbchange574); 
            string_literal107_tree = (Object)adaptor.create(string_literal107);
            adaptor.addChild(root_0, string_literal107_tree);

            dbg.location(98,22);
            TOKEN108=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbchange576); 
            TOKEN108_tree = (Object)adaptor.create(TOKEN108);
            adaptor.addChild(root_0, TOKEN108_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(98, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:99:1: vbsubmerge : 'VB-SUBMERGE' TOKEN ;
    public final ChemicalChunkerParser.vbsubmerge_return vbsubmerge() throws RecognitionException {
        ChemicalChunkerParser.vbsubmerge_return retval = new ChemicalChunkerParser.vbsubmerge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal109=null;
        Token TOKEN110=null;

        Object string_literal109_tree=null;
        Object TOKEN110_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubmerge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:99:11: ( 'VB-SUBMERGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:99:12: 'VB-SUBMERGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(99,12);
            string_literal109=(Token)match(input,51,FOLLOW_51_in_vbsubmerge581); 
            string_literal109_tree = (Object)adaptor.create(string_literal109);
            adaptor.addChild(root_0, string_literal109_tree);

            dbg.location(99,26);
            TOKEN110=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubmerge583); 
            TOKEN110_tree = (Object)adaptor.create(TOKEN110);
            adaptor.addChild(root_0, TOKEN110_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(99, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:100:1: vbsubject : 'VB-SUBJECT' TOKEN ;
    public final ChemicalChunkerParser.vbsubject_return vbsubject() throws RecognitionException {
        ChemicalChunkerParser.vbsubject_return retval = new ChemicalChunkerParser.vbsubject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal111=null;
        Token TOKEN112=null;

        Object string_literal111_tree=null;
        Object TOKEN112_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubject");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:100:10: ( 'VB-SUBJECT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:100:11: 'VB-SUBJECT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(100,11);
            string_literal111=(Token)match(input,52,FOLLOW_52_in_vbsubject588); 
            string_literal111_tree = (Object)adaptor.create(string_literal111);
            adaptor.addChild(root_0, string_literal111_tree);

            dbg.location(100,24);
            TOKEN112=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubject590); 
            TOKEN112_tree = (Object)adaptor.create(TOKEN112);
            adaptor.addChild(root_0, TOKEN112_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(100, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:103:1: nnadd : 'NN-ADD' TOKEN ;
    public final ChemicalChunkerParser.nnadd_return nnadd() throws RecognitionException {
        ChemicalChunkerParser.nnadd_return retval = new ChemicalChunkerParser.nnadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal113=null;
        Token TOKEN114=null;

        Object string_literal113_tree=null;
        Object TOKEN114_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:103:6: ( 'NN-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:103:7: 'NN-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(103,7);
            string_literal113=(Token)match(input,53,FOLLOW_53_in_nnadd597); 
            string_literal113_tree = (Object)adaptor.create(string_literal113);
            adaptor.addChild(root_0, string_literal113_tree);

            dbg.location(103,16);
            TOKEN114=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnadd599); 
            TOKEN114_tree = (Object)adaptor.create(TOKEN114);
            adaptor.addChild(root_0, TOKEN114_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(103, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:104:1: nnmixture : 'NN-MIXTURE' TOKEN ;
    public final ChemicalChunkerParser.nnmixture_return nnmixture() throws RecognitionException {
        ChemicalChunkerParser.nnmixture_return retval = new ChemicalChunkerParser.nnmixture_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal115=null;
        Token TOKEN116=null;

        Object string_literal115_tree=null;
        Object TOKEN116_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:104:10: ( 'NN-MIXTURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:104:11: 'NN-MIXTURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(104,11);
            string_literal115=(Token)match(input,54,FOLLOW_54_in_nnmixture604); 
            string_literal115_tree = (Object)adaptor.create(string_literal115);
            adaptor.addChild(root_0, string_literal115_tree);

            dbg.location(104,24);
            TOKEN116=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmixture606); 
            TOKEN116_tree = (Object)adaptor.create(TOKEN116);
            adaptor.addChild(root_0, TOKEN116_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(104, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:105:1: vbadd : 'VB-ADD' TOKEN ;
    public final ChemicalChunkerParser.vbadd_return vbadd() throws RecognitionException {
        ChemicalChunkerParser.vbadd_return retval = new ChemicalChunkerParser.vbadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal117=null;
        Token TOKEN118=null;

        Object string_literal117_tree=null;
        Object TOKEN118_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:105:6: ( 'VB-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:105:7: 'VB-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(105,7);
            string_literal117=(Token)match(input,55,FOLLOW_55_in_vbadd611); 
            string_literal117_tree = (Object)adaptor.create(string_literal117);
            adaptor.addChild(root_0, string_literal117_tree);

            dbg.location(105,16);
            TOKEN118=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbadd613); 
            TOKEN118_tree = (Object)adaptor.create(TOKEN118);
            adaptor.addChild(root_0, TOKEN118_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(105, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:106:1: vbcharge : 'VB-CHARGE' TOKEN ;
    public final ChemicalChunkerParser.vbcharge_return vbcharge() throws RecognitionException {
        ChemicalChunkerParser.vbcharge_return retval = new ChemicalChunkerParser.vbcharge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal119=null;
        Token TOKEN120=null;

        Object string_literal119_tree=null;
        Object TOKEN120_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcharge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:106:9: ( 'VB-CHARGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:106:10: 'VB-CHARGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(106,10);
            string_literal119=(Token)match(input,56,FOLLOW_56_in_vbcharge618); 
            string_literal119_tree = (Object)adaptor.create(string_literal119);
            adaptor.addChild(root_0, string_literal119_tree);

            dbg.location(106,22);
            TOKEN120=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcharge620); 
            TOKEN120_tree = (Object)adaptor.create(TOKEN120);
            adaptor.addChild(root_0, TOKEN120_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(106, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:107:1: vbcontain : 'VB-CONTAIN' TOKEN ;
    public final ChemicalChunkerParser.vbcontain_return vbcontain() throws RecognitionException {
        ChemicalChunkerParser.vbcontain_return retval = new ChemicalChunkerParser.vbcontain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal121=null;
        Token TOKEN122=null;

        Object string_literal121_tree=null;
        Object TOKEN122_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcontain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:107:10: ( 'VB-CONTAIN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:107:11: 'VB-CONTAIN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(107,11);
            string_literal121=(Token)match(input,57,FOLLOW_57_in_vbcontain625); 
            string_literal121_tree = (Object)adaptor.create(string_literal121);
            adaptor.addChild(root_0, string_literal121_tree);

            dbg.location(107,24);
            TOKEN122=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcontain627); 
            TOKEN122_tree = (Object)adaptor.create(TOKEN122);
            adaptor.addChild(root_0, TOKEN122_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(107, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:108:1: vbdrop : 'VB-DROP' TOKEN ;
    public final ChemicalChunkerParser.vbdrop_return vbdrop() throws RecognitionException {
        ChemicalChunkerParser.vbdrop_return retval = new ChemicalChunkerParser.vbdrop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal123=null;
        Token TOKEN124=null;

        Object string_literal123_tree=null;
        Object TOKEN124_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdrop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:108:7: ( 'VB-DROP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:108:8: 'VB-DROP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(108,8);
            string_literal123=(Token)match(input,58,FOLLOW_58_in_vbdrop632); 
            string_literal123_tree = (Object)adaptor.create(string_literal123);
            adaptor.addChild(root_0, string_literal123_tree);

            dbg.location(108,18);
            TOKEN124=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdrop634); 
            TOKEN124_tree = (Object)adaptor.create(TOKEN124);
            adaptor.addChild(root_0, TOKEN124_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(108, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:109:1: vbfill : 'VB-FILL' TOKEN ;
    public final ChemicalChunkerParser.vbfill_return vbfill() throws RecognitionException {
        ChemicalChunkerParser.vbfill_return retval = new ChemicalChunkerParser.vbfill_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal125=null;
        Token TOKEN126=null;

        Object string_literal125_tree=null;
        Object TOKEN126_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfill");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:109:7: ( 'VB-FILL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:109:8: 'VB-FILL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(109,8);
            string_literal125=(Token)match(input,59,FOLLOW_59_in_vbfill639); 
            string_literal125_tree = (Object)adaptor.create(string_literal125);
            adaptor.addChild(root_0, string_literal125_tree);

            dbg.location(109,18);
            TOKEN126=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfill641); 
            TOKEN126_tree = (Object)adaptor.create(TOKEN126);
            adaptor.addChild(root_0, TOKEN126_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(109, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:110:1: vbsuspend : 'VB-SUSPEND' TOKEN ;
    public final ChemicalChunkerParser.vbsuspend_return vbsuspend() throws RecognitionException {
        ChemicalChunkerParser.vbsuspend_return retval = new ChemicalChunkerParser.vbsuspend_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal127=null;
        Token TOKEN128=null;

        Object string_literal127_tree=null;
        Object TOKEN128_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsuspend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:110:10: ( 'VB-SUSPEND' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:110:11: 'VB-SUSPEND' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(110,11);
            string_literal127=(Token)match(input,60,FOLLOW_60_in_vbsuspend646); 
            string_literal127_tree = (Object)adaptor.create(string_literal127);
            adaptor.addChild(root_0, string_literal127_tree);

            dbg.location(110,24);
            TOKEN128=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsuspend648); 
            TOKEN128_tree = (Object)adaptor.create(TOKEN128);
            adaptor.addChild(root_0, TOKEN128_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(110, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:111:1: vbtreat : 'VB-TREAT' TOKEN ;
    public final ChemicalChunkerParser.vbtreat_return vbtreat() throws RecognitionException {
        ChemicalChunkerParser.vbtreat_return retval = new ChemicalChunkerParser.vbtreat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal129=null;
        Token TOKEN130=null;

        Object string_literal129_tree=null;
        Object TOKEN130_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtreat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:111:8: ( 'VB-TREAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:111:9: 'VB-TREAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(111,9);
            string_literal129=(Token)match(input,61,FOLLOW_61_in_vbtreat653); 
            string_literal129_tree = (Object)adaptor.create(string_literal129);
            adaptor.addChild(root_0, string_literal129_tree);

            dbg.location(111,20);
            TOKEN130=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtreat655); 
            TOKEN130_tree = (Object)adaptor.create(TOKEN130);
            adaptor.addChild(root_0, TOKEN130_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(111, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:114:1: vbapparatus : 'VB-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.vbapparatus_return vbapparatus() throws RecognitionException {
        ChemicalChunkerParser.vbapparatus_return retval = new ChemicalChunkerParser.vbapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal131=null;
        Token TOKEN132=null;

        Object string_literal131_tree=null;
        Object TOKEN132_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:114:12: ( 'VB-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:114:13: 'VB-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(114,13);
            string_literal131=(Token)match(input,62,FOLLOW_62_in_vbapparatus662); 
            string_literal131_tree = (Object)adaptor.create(string_literal131);
            adaptor.addChild(root_0, string_literal131_tree);

            dbg.location(114,28);
            TOKEN132=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbapparatus664); 
            TOKEN132_tree = (Object)adaptor.create(TOKEN132);
            adaptor.addChild(root_0, TOKEN132_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(114, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:115:1: nnapparatus : 'NN-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.nnapparatus_return nnapparatus() throws RecognitionException {
        ChemicalChunkerParser.nnapparatus_return retval = new ChemicalChunkerParser.nnapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal133=null;
        Token TOKEN134=null;

        Object string_literal133_tree=null;
        Object TOKEN134_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:115:12: ( 'NN-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:115:13: 'NN-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(115,13);
            string_literal133=(Token)match(input,63,FOLLOW_63_in_nnapparatus669); 
            string_literal133_tree = (Object)adaptor.create(string_literal133);
            adaptor.addChild(root_0, string_literal133_tree);

            dbg.location(115,28);
            TOKEN134=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnapparatus671); 
            TOKEN134_tree = (Object)adaptor.create(TOKEN134);
            adaptor.addChild(root_0, TOKEN134_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(115, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:118:1: vbconcentrate : 'VB-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.vbconcentrate_return vbconcentrate() throws RecognitionException {
        ChemicalChunkerParser.vbconcentrate_return retval = new ChemicalChunkerParser.vbconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal135=null;
        Token TOKEN136=null;

        Object string_literal135_tree=null;
        Object TOKEN136_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:118:14: ( 'VB-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:118:15: 'VB-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(118,15);
            string_literal135=(Token)match(input,64,FOLLOW_64_in_vbconcentrate678); 
            string_literal135_tree = (Object)adaptor.create(string_literal135);
            adaptor.addChild(root_0, string_literal135_tree);

            dbg.location(118,32);
            TOKEN136=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbconcentrate680); 
            TOKEN136_tree = (Object)adaptor.create(TOKEN136);
            adaptor.addChild(root_0, TOKEN136_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(118, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:119:1: nnconcentrate : 'NN-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.nnconcentrate_return nnconcentrate() throws RecognitionException {
        ChemicalChunkerParser.nnconcentrate_return retval = new ChemicalChunkerParser.nnconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal137=null;
        Token TOKEN138=null;

        Object string_literal137_tree=null;
        Object TOKEN138_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:119:14: ( 'NN-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:119:15: 'NN-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(119,15);
            string_literal137=(Token)match(input,65,FOLLOW_65_in_nnconcentrate685); 
            string_literal137_tree = (Object)adaptor.create(string_literal137);
            adaptor.addChild(root_0, string_literal137_tree);

            dbg.location(119,32);
            TOKEN138=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnconcentrate687); 
            TOKEN138_tree = (Object)adaptor.create(TOKEN138);
            adaptor.addChild(root_0, TOKEN138_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(119, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:122:1: vbcool : 'VB-COOL' TOKEN ;
    public final ChemicalChunkerParser.vbcool_return vbcool() throws RecognitionException {
        ChemicalChunkerParser.vbcool_return retval = new ChemicalChunkerParser.vbcool_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal139=null;
        Token TOKEN140=null;

        Object string_literal139_tree=null;
        Object TOKEN140_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:122:7: ( 'VB-COOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:122:8: 'VB-COOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(122,8);
            string_literal139=(Token)match(input,66,FOLLOW_66_in_vbcool694); 
            string_literal139_tree = (Object)adaptor.create(string_literal139);
            adaptor.addChild(root_0, string_literal139_tree);

            dbg.location(122,18);
            TOKEN140=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcool696); 
            TOKEN140_tree = (Object)adaptor.create(TOKEN140);
            adaptor.addChild(root_0, TOKEN140_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:125:1: vbdegass : 'VB-DEGASS' TOKEN ;
    public final ChemicalChunkerParser.vbdegass_return vbdegass() throws RecognitionException {
        ChemicalChunkerParser.vbdegass_return retval = new ChemicalChunkerParser.vbdegass_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal141=null;
        Token TOKEN142=null;

        Object string_literal141_tree=null;
        Object TOKEN142_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdegass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:125:9: ( 'VB-DEGASS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:125:10: 'VB-DEGASS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(125,10);
            string_literal141=(Token)match(input,67,FOLLOW_67_in_vbdegass703); 
            string_literal141_tree = (Object)adaptor.create(string_literal141);
            adaptor.addChild(root_0, string_literal141_tree);

            dbg.location(125,22);
            TOKEN142=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdegass705); 
            TOKEN142_tree = (Object)adaptor.create(TOKEN142);
            adaptor.addChild(root_0, TOKEN142_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(125, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:128:1: vbdissolve : 'VB-DISSOLVE' TOKEN ;
    public final ChemicalChunkerParser.vbdissolve_return vbdissolve() throws RecognitionException {
        ChemicalChunkerParser.vbdissolve_return retval = new ChemicalChunkerParser.vbdissolve_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal143=null;
        Token TOKEN144=null;

        Object string_literal143_tree=null;
        Object TOKEN144_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdissolve");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:128:11: ( 'VB-DISSOLVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:128:12: 'VB-DISSOLVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,12);
            string_literal143=(Token)match(input,68,FOLLOW_68_in_vbdissolve712); 
            string_literal143_tree = (Object)adaptor.create(string_literal143);
            adaptor.addChild(root_0, string_literal143_tree);

            dbg.location(128,26);
            TOKEN144=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdissolve714); 
            TOKEN144_tree = (Object)adaptor.create(TOKEN144);
            adaptor.addChild(root_0, TOKEN144_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(128, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:131:1: vbdry : 'VB-DRY' TOKEN ;
    public final ChemicalChunkerParser.vbdry_return vbdry() throws RecognitionException {
        ChemicalChunkerParser.vbdry_return retval = new ChemicalChunkerParser.vbdry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal145=null;
        Token TOKEN146=null;

        Object string_literal145_tree=null;
        Object TOKEN146_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:131:6: ( 'VB-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:131:7: 'VB-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(131,7);
            string_literal145=(Token)match(input,69,FOLLOW_69_in_vbdry721); 
            string_literal145_tree = (Object)adaptor.create(string_literal145);
            adaptor.addChild(root_0, string_literal145_tree);

            dbg.location(131,16);
            TOKEN146=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdry723); 
            TOKEN146_tree = (Object)adaptor.create(TOKEN146);
            adaptor.addChild(root_0, TOKEN146_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(131, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:132:1: nndry : 'NN-DRY' TOKEN ;
    public final ChemicalChunkerParser.nndry_return nndry() throws RecognitionException {
        ChemicalChunkerParser.nndry_return retval = new ChemicalChunkerParser.nndry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal147=null;
        Token TOKEN148=null;

        Object string_literal147_tree=null;
        Object TOKEN148_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nndry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:132:6: ( 'NN-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:132:7: 'NN-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(132,7);
            string_literal147=(Token)match(input,70,FOLLOW_70_in_nndry728); 
            string_literal147_tree = (Object)adaptor.create(string_literal147);
            adaptor.addChild(root_0, string_literal147_tree);

            dbg.location(132,16);
            TOKEN148=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nndry730); 
            TOKEN148_tree = (Object)adaptor.create(TOKEN148);
            adaptor.addChild(root_0, TOKEN148_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(132, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:135:1: vbextract : 'VB-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.vbextract_return vbextract() throws RecognitionException {
        ChemicalChunkerParser.vbextract_return retval = new ChemicalChunkerParser.vbextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal149=null;
        Token TOKEN150=null;

        Object string_literal149_tree=null;
        Object TOKEN150_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:135:10: ( 'VB-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:135:11: 'VB-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(135,11);
            string_literal149=(Token)match(input,71,FOLLOW_71_in_vbextract737); 
            string_literal149_tree = (Object)adaptor.create(string_literal149);
            adaptor.addChild(root_0, string_literal149_tree);

            dbg.location(135,24);
            TOKEN150=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbextract739); 
            TOKEN150_tree = (Object)adaptor.create(TOKEN150);
            adaptor.addChild(root_0, TOKEN150_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(135, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:136:1: nnextract : 'NN-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.nnextract_return nnextract() throws RecognitionException {
        ChemicalChunkerParser.nnextract_return retval = new ChemicalChunkerParser.nnextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal151=null;
        Token TOKEN152=null;

        Object string_literal151_tree=null;
        Object TOKEN152_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:136:10: ( 'NN-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:136:11: 'NN-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(136,11);
            string_literal151=(Token)match(input,72,FOLLOW_72_in_nnextract744); 
            string_literal151_tree = (Object)adaptor.create(string_literal151);
            adaptor.addChild(root_0, string_literal151_tree);

            dbg.location(136,24);
            TOKEN152=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnextract746); 
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
        dbg.location(136, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:139:1: vbfilter : 'VB-FILTER' TOKEN ;
    public final ChemicalChunkerParser.vbfilter_return vbfilter() throws RecognitionException {
        ChemicalChunkerParser.vbfilter_return retval = new ChemicalChunkerParser.vbfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal153=null;
        Token TOKEN154=null;

        Object string_literal153_tree=null;
        Object TOKEN154_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:139:9: ( 'VB-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:139:10: 'VB-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,10);
            string_literal153=(Token)match(input,73,FOLLOW_73_in_vbfilter753); 
            string_literal153_tree = (Object)adaptor.create(string_literal153);
            adaptor.addChild(root_0, string_literal153_tree);

            dbg.location(139,22);
            TOKEN154=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfilter755); 
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
        dbg.location(139, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:140:1: nnfilter : 'NN-FILTER' TOKEN ;
    public final ChemicalChunkerParser.nnfilter_return nnfilter() throws RecognitionException {
        ChemicalChunkerParser.nnfilter_return retval = new ChemicalChunkerParser.nnfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal155=null;
        Token TOKEN156=null;

        Object string_literal155_tree=null;
        Object TOKEN156_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:140:9: ( 'NN-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:140:10: 'NN-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(140,10);
            string_literal155=(Token)match(input,74,FOLLOW_74_in_nnfilter760); 
            string_literal155_tree = (Object)adaptor.create(string_literal155);
            adaptor.addChild(root_0, string_literal155_tree);

            dbg.location(140,22);
            TOKEN156=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnfilter762); 
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
        dbg.location(140, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:143:1: vbheat : 'VB-HEAT' TOKEN ;
    public final ChemicalChunkerParser.vbheat_return vbheat() throws RecognitionException {
        ChemicalChunkerParser.vbheat_return retval = new ChemicalChunkerParser.vbheat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal157=null;
        Token TOKEN158=null;

        Object string_literal157_tree=null;
        Object TOKEN158_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbheat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:143:7: ( 'VB-HEAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:143:8: 'VB-HEAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(143,8);
            string_literal157=(Token)match(input,75,FOLLOW_75_in_vbheat769); 
            string_literal157_tree = (Object)adaptor.create(string_literal157);
            adaptor.addChild(root_0, string_literal157_tree);

            dbg.location(143,18);
            TOKEN158=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbheat771); 
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
        dbg.location(143, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:144:1: vbincrease : 'VB-INCREASE' TOKEN ;
    public final ChemicalChunkerParser.vbincrease_return vbincrease() throws RecognitionException {
        ChemicalChunkerParser.vbincrease_return retval = new ChemicalChunkerParser.vbincrease_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal159=null;
        Token TOKEN160=null;

        Object string_literal159_tree=null;
        Object TOKEN160_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbincrease");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:144:11: ( 'VB-INCREASE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:144:12: 'VB-INCREASE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(144,12);
            string_literal159=(Token)match(input,76,FOLLOW_76_in_vbincrease776); 
            string_literal159_tree = (Object)adaptor.create(string_literal159);
            adaptor.addChild(root_0, string_literal159_tree);

            dbg.location(144,26);
            TOKEN160=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbincrease778); 
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
        dbg.location(144, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:147:1: vbpartition : 'VB-PARTITION' TOKEN ;
    public final ChemicalChunkerParser.vbpartition_return vbpartition() throws RecognitionException {
        ChemicalChunkerParser.vbpartition_return retval = new ChemicalChunkerParser.vbpartition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal161=null;
        Token TOKEN162=null;

        Object string_literal161_tree=null;
        Object TOKEN162_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpartition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:147:12: ( 'VB-PARTITION' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:147:13: 'VB-PARTITION' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(147,13);
            string_literal161=(Token)match(input,77,FOLLOW_77_in_vbpartition785); 
            string_literal161_tree = (Object)adaptor.create(string_literal161);
            adaptor.addChild(root_0, string_literal161_tree);

            dbg.location(147,28);
            TOKEN162=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpartition787); 
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
        dbg.location(147, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:150:1: vbprecipitate : 'VB-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.vbprecipitate_return vbprecipitate() throws RecognitionException {
        ChemicalChunkerParser.vbprecipitate_return retval = new ChemicalChunkerParser.vbprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal163=null;
        Token TOKEN164=null;

        Object string_literal163_tree=null;
        Object TOKEN164_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:150:14: ( 'VB-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:150:15: 'VB-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(150,15);
            string_literal163=(Token)match(input,78,FOLLOW_78_in_vbprecipitate794); 
            string_literal163_tree = (Object)adaptor.create(string_literal163);
            adaptor.addChild(root_0, string_literal163_tree);

            dbg.location(150,32);
            TOKEN164=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbprecipitate796); 
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
        dbg.location(150, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:151:1: nnprecipitate : 'NN-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.nnprecipitate_return nnprecipitate() throws RecognitionException {
        ChemicalChunkerParser.nnprecipitate_return retval = new ChemicalChunkerParser.nnprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal165=null;
        Token TOKEN166=null;

        Object string_literal165_tree=null;
        Object TOKEN166_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:151:14: ( 'NN-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:151:15: 'NN-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(151,15);
            string_literal165=(Token)match(input,79,FOLLOW_79_in_nnprecipitate801); 
            string_literal165_tree = (Object)adaptor.create(string_literal165);
            adaptor.addChild(root_0, string_literal165_tree);

            dbg.location(151,32);
            TOKEN166=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnprecipitate803); 
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
        dbg.location(151, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:154:1: vbpurify : 'VB-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.vbpurify_return vbpurify() throws RecognitionException {
        ChemicalChunkerParser.vbpurify_return retval = new ChemicalChunkerParser.vbpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal167=null;
        Token TOKEN168=null;

        Object string_literal167_tree=null;
        Object TOKEN168_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:154:9: ( 'VB-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:154:10: 'VB-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(154,10);
            string_literal167=(Token)match(input,80,FOLLOW_80_in_vbpurify810); 
            string_literal167_tree = (Object)adaptor.create(string_literal167);
            adaptor.addChild(root_0, string_literal167_tree);

            dbg.location(154,22);
            TOKEN168=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpurify812); 
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
        dbg.location(154, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:155:1: nnpurify : 'NN-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.nnpurify_return nnpurify() throws RecognitionException {
        ChemicalChunkerParser.nnpurify_return retval = new ChemicalChunkerParser.nnpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal169=null;
        Token TOKEN170=null;

        Object string_literal169_tree=null;
        Object TOKEN170_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:155:9: ( 'NN-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:155:10: 'NN-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(155,10);
            string_literal169=(Token)match(input,81,FOLLOW_81_in_nnpurify817); 
            string_literal169_tree = (Object)adaptor.create(string_literal169);
            adaptor.addChild(root_0, string_literal169_tree);

            dbg.location(155,22);
            TOKEN170=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpurify819); 
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
        dbg.location(155, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:158:1: vbquench : 'VB-QUENCH' TOKEN ;
    public final ChemicalChunkerParser.vbquench_return vbquench() throws RecognitionException {
        ChemicalChunkerParser.vbquench_return retval = new ChemicalChunkerParser.vbquench_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal171=null;
        Token TOKEN172=null;

        Object string_literal171_tree=null;
        Object TOKEN172_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbquench");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:158:9: ( 'VB-QUENCH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:158:10: 'VB-QUENCH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(158,10);
            string_literal171=(Token)match(input,82,FOLLOW_82_in_vbquench826); 
            string_literal171_tree = (Object)adaptor.create(string_literal171);
            adaptor.addChild(root_0, string_literal171_tree);

            dbg.location(158,22);
            TOKEN172=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbquench828); 
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
        dbg.location(158, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:161:1: vbrecover : 'VB-RECOVER' TOKEN ;
    public final ChemicalChunkerParser.vbrecover_return vbrecover() throws RecognitionException {
        ChemicalChunkerParser.vbrecover_return retval = new ChemicalChunkerParser.vbrecover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal173=null;
        Token TOKEN174=null;

        Object string_literal173_tree=null;
        Object TOKEN174_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbrecover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:161:10: ( 'VB-RECOVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:161:11: 'VB-RECOVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(161,11);
            string_literal173=(Token)match(input,83,FOLLOW_83_in_vbrecover835); 
            string_literal173_tree = (Object)adaptor.create(string_literal173);
            adaptor.addChild(root_0, string_literal173_tree);

            dbg.location(161,24);
            TOKEN174=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbrecover837); 
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
        dbg.location(161, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:164:1: vbremove : 'VB-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.vbremove_return vbremove() throws RecognitionException {
        ChemicalChunkerParser.vbremove_return retval = new ChemicalChunkerParser.vbremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal175=null;
        Token TOKEN176=null;

        Object string_literal175_tree=null;
        Object TOKEN176_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(164, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:164:9: ( 'VB-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:164:10: 'VB-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(164,10);
            string_literal175=(Token)match(input,84,FOLLOW_84_in_vbremove844); 
            string_literal175_tree = (Object)adaptor.create(string_literal175);
            adaptor.addChild(root_0, string_literal175_tree);

            dbg.location(164,22);
            TOKEN176=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbremove846); 
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
        dbg.location(164, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:165:1: nnremove : 'NN-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.nnremove_return nnremove() throws RecognitionException {
        ChemicalChunkerParser.nnremove_return retval = new ChemicalChunkerParser.nnremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal177=null;
        Token TOKEN178=null;

        Object string_literal177_tree=null;
        Object TOKEN178_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(165, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:165:9: ( 'NN-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:165:10: 'NN-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(165,10);
            string_literal177=(Token)match(input,85,FOLLOW_85_in_nnremove851); 
            string_literal177_tree = (Object)adaptor.create(string_literal177);
            adaptor.addChild(root_0, string_literal177_tree);

            dbg.location(165,22);
            TOKEN178=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnremove853); 
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
        dbg.location(165, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:168:1: vbstir : 'VB-STIR' TOKEN ;
    public final ChemicalChunkerParser.vbstir_return vbstir() throws RecognitionException {
        ChemicalChunkerParser.vbstir_return retval = new ChemicalChunkerParser.vbstir_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal179=null;
        Token TOKEN180=null;

        Object string_literal179_tree=null;
        Object TOKEN180_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbstir");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:168:7: ( 'VB-STIR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:168:8: 'VB-STIR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(168,8);
            string_literal179=(Token)match(input,86,FOLLOW_86_in_vbstir860); 
            string_literal179_tree = (Object)adaptor.create(string_literal179);
            adaptor.addChild(root_0, string_literal179_tree);

            dbg.location(168,18);
            TOKEN180=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbstir862); 
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
        dbg.location(168, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:171:1: vbsynthesize : 'VB-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.vbsynthesize_return vbsynthesize() throws RecognitionException {
        ChemicalChunkerParser.vbsynthesize_return retval = new ChemicalChunkerParser.vbsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal181=null;
        Token TOKEN182=null;

        Object string_literal181_tree=null;
        Object TOKEN182_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:171:13: ( 'VB-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:171:14: 'VB-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(171,14);
            string_literal181=(Token)match(input,87,FOLLOW_87_in_vbsynthesize869); 
            string_literal181_tree = (Object)adaptor.create(string_literal181);
            adaptor.addChild(root_0, string_literal181_tree);

            dbg.location(171,30);
            TOKEN182=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsynthesize871); 
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
        dbg.location(171, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:172:1: nnsynthesize : 'NN-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.nnsynthesize_return nnsynthesize() throws RecognitionException {
        ChemicalChunkerParser.nnsynthesize_return retval = new ChemicalChunkerParser.nnsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal183=null;
        Token TOKEN184=null;

        Object string_literal183_tree=null;
        Object TOKEN184_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:172:13: ( 'NN-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:172:14: 'NN-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(172,14);
            string_literal183=(Token)match(input,88,FOLLOW_88_in_nnsynthesize876); 
            string_literal183_tree = (Object)adaptor.create(string_literal183);
            adaptor.addChild(root_0, string_literal183_tree);

            dbg.location(172,30);
            TOKEN184=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnsynthesize878); 
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
        dbg.location(172, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:175:1: vbwait : 'VB-WAIT' TOKEN ;
    public final ChemicalChunkerParser.vbwait_return vbwait() throws RecognitionException {
        ChemicalChunkerParser.vbwait_return retval = new ChemicalChunkerParser.vbwait_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal185=null;
        Token TOKEN186=null;

        Object string_literal185_tree=null;
        Object TOKEN186_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwait");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:175:7: ( 'VB-WAIT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:175:8: 'VB-WAIT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(175,8);
            string_literal185=(Token)match(input,89,FOLLOW_89_in_vbwait885); 
            string_literal185_tree = (Object)adaptor.create(string_literal185);
            adaptor.addChild(root_0, string_literal185_tree);

            dbg.location(175,18);
            TOKEN186=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwait887); 
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
        dbg.location(175, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:178:1: vbwash : 'VB-WASH' TOKEN ;
    public final ChemicalChunkerParser.vbwash_return vbwash() throws RecognitionException {
        ChemicalChunkerParser.vbwash_return retval = new ChemicalChunkerParser.vbwash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal187=null;
        Token TOKEN188=null;

        Object string_literal187_tree=null;
        Object TOKEN188_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:178:7: ( 'VB-WASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:178:8: 'VB-WASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(178,8);
            string_literal187=(Token)match(input,90,FOLLOW_90_in_vbwash894); 
            string_literal187_tree = (Object)adaptor.create(string_literal187);
            adaptor.addChild(root_0, string_literal187_tree);

            dbg.location(178,18);
            TOKEN188=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwash896); 
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
        dbg.location(178, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:181:1: vbyield : 'VB-YIELD' TOKEN ;
    public final ChemicalChunkerParser.vbyield_return vbyield() throws RecognitionException {
        ChemicalChunkerParser.vbyield_return retval = new ChemicalChunkerParser.vbyield_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal189=null;
        Token TOKEN190=null;

        Object string_literal189_tree=null;
        Object TOKEN190_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbyield");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(181, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:181:8: ( 'VB-YIELD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:181:9: 'VB-YIELD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(181,9);
            string_literal189=(Token)match(input,91,FOLLOW_91_in_vbyield903); 
            string_literal189_tree = (Object)adaptor.create(string_literal189);
            adaptor.addChild(root_0, string_literal189_tree);

            dbg.location(181,20);
            TOKEN190=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbyield905); 
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
        dbg.location(181, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:184:1: colon : 'COLON' TOKEN ;
    public final ChemicalChunkerParser.colon_return colon() throws RecognitionException {
        ChemicalChunkerParser.colon_return retval = new ChemicalChunkerParser.colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal191=null;
        Token TOKEN192=null;

        Object string_literal191_tree=null;
        Object TOKEN192_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:184:6: ( 'COLON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:184:7: 'COLON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(184,7);
            string_literal191=(Token)match(input,92,FOLLOW_92_in_colon912); 
            string_literal191_tree = (Object)adaptor.create(string_literal191);
            adaptor.addChild(root_0, string_literal191_tree);

            dbg.location(184,15);
            TOKEN192=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_colon914); 
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
        dbg.location(184, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:185:1: comma : 'COMMA' TOKEN ;
    public final ChemicalChunkerParser.comma_return comma() throws RecognitionException {
        ChemicalChunkerParser.comma_return retval = new ChemicalChunkerParser.comma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal193=null;
        Token TOKEN194=null;

        Object string_literal193_tree=null;
        Object TOKEN194_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:185:6: ( 'COMMA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:185:7: 'COMMA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(185,7);
            string_literal193=(Token)match(input,93,FOLLOW_93_in_comma919); 
            string_literal193_tree = (Object)adaptor.create(string_literal193);
            adaptor.addChild(root_0, string_literal193_tree);

            dbg.location(185,15);
            TOKEN194=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_comma921); 
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
        dbg.location(185, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:186:1: apost : 'APOST' TOKEN ;
    public final ChemicalChunkerParser.apost_return apost() throws RecognitionException {
        ChemicalChunkerParser.apost_return retval = new ChemicalChunkerParser.apost_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal195=null;
        Token TOKEN196=null;

        Object string_literal195_tree=null;
        Object TOKEN196_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "apost");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:186:6: ( 'APOST' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:186:7: 'APOST' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(186,7);
            string_literal195=(Token)match(input,94,FOLLOW_94_in_apost926); 
            string_literal195_tree = (Object)adaptor.create(string_literal195);
            adaptor.addChild(root_0, string_literal195_tree);

            dbg.location(186,15);
            TOKEN196=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_apost928); 
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
        dbg.location(186, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:187:1: neg : 'NEG' TOKEN ;
    public final ChemicalChunkerParser.neg_return neg() throws RecognitionException {
        ChemicalChunkerParser.neg_return retval = new ChemicalChunkerParser.neg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal197=null;
        Token TOKEN198=null;

        Object string_literal197_tree=null;
        Object TOKEN198_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "neg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:187:4: ( 'NEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:187:5: 'NEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(187,5);
            string_literal197=(Token)match(input,95,FOLLOW_95_in_neg933); 
            string_literal197_tree = (Object)adaptor.create(string_literal197);
            adaptor.addChild(root_0, string_literal197_tree);

            dbg.location(187,11);
            TOKEN198=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_neg935); 
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
        dbg.location(187, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:188:1: dash : 'DASH' TOKEN ;
    public final ChemicalChunkerParser.dash_return dash() throws RecognitionException {
        ChemicalChunkerParser.dash_return retval = new ChemicalChunkerParser.dash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal199=null;
        Token TOKEN200=null;

        Object string_literal199_tree=null;
        Object TOKEN200_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(188, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:188:5: ( 'DASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:188:6: 'DASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(188,6);
            string_literal199=(Token)match(input,96,FOLLOW_96_in_dash940); 
            string_literal199_tree = (Object)adaptor.create(string_literal199);
            adaptor.addChild(root_0, string_literal199_tree);

            dbg.location(188,13);
            TOKEN200=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dash942); 
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
        dbg.location(188, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:189:1: stop : 'STOP' TOKEN ;
    public final ChemicalChunkerParser.stop_return stop() throws RecognitionException {
        ChemicalChunkerParser.stop_return retval = new ChemicalChunkerParser.stop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal201=null;
        Token TOKEN202=null;

        Object string_literal201_tree=null;
        Object TOKEN202_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:189:5: ( 'STOP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:189:6: 'STOP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(189,6);
            string_literal201=(Token)match(input,97,FOLLOW_97_in_stop947); 
            string_literal201_tree = (Object)adaptor.create(string_literal201);
            adaptor.addChild(root_0, string_literal201_tree);

            dbg.location(189,13);
            TOKEN202=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_stop949); 
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
        dbg.location(189, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:190:1: nnpercent : 'NN-PERCENT' TOKEN ;
    public final ChemicalChunkerParser.nnpercent_return nnpercent() throws RecognitionException {
        ChemicalChunkerParser.nnpercent_return retval = new ChemicalChunkerParser.nnpercent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal203=null;
        Token TOKEN204=null;

        Object string_literal203_tree=null;
        Object TOKEN204_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpercent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:190:10: ( 'NN-PERCENT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:190:11: 'NN-PERCENT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(190,11);
            string_literal203=(Token)match(input,98,FOLLOW_98_in_nnpercent954); 
            string_literal203_tree = (Object)adaptor.create(string_literal203);
            adaptor.addChild(root_0, string_literal203_tree);

            dbg.location(190,24);
            TOKEN204=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpercent956); 
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
        dbg.location(190, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:191:1: lsqb : 'LSQB' TOKEN ;
    public final ChemicalChunkerParser.lsqb_return lsqb() throws RecognitionException {
        ChemicalChunkerParser.lsqb_return retval = new ChemicalChunkerParser.lsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal205=null;
        Token TOKEN206=null;

        Object string_literal205_tree=null;
        Object TOKEN206_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:191:5: ( 'LSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:191:6: 'LSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(191,6);
            string_literal205=(Token)match(input,99,FOLLOW_99_in_lsqb961); 
            string_literal205_tree = (Object)adaptor.create(string_literal205);
            adaptor.addChild(root_0, string_literal205_tree);

            dbg.location(191,13);
            TOKEN206=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lsqb963); 
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
        dbg.location(191, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:192:1: rsqb : 'RSQB' TOKEN ;
    public final ChemicalChunkerParser.rsqb_return rsqb() throws RecognitionException {
        ChemicalChunkerParser.rsqb_return retval = new ChemicalChunkerParser.rsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal207=null;
        Token TOKEN208=null;

        Object string_literal207_tree=null;
        Object TOKEN208_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(192, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:192:5: ( 'RSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:192:6: 'RSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(192,6);
            string_literal207=(Token)match(input,100,FOLLOW_100_in_rsqb968); 
            string_literal207_tree = (Object)adaptor.create(string_literal207);
            adaptor.addChild(root_0, string_literal207_tree);

            dbg.location(192,13);
            TOKEN208=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rsqb970); 
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
        dbg.location(192, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:193:1: lrb : 'LRB' TOKEN ;
    public final ChemicalChunkerParser.lrb_return lrb() throws RecognitionException {
        ChemicalChunkerParser.lrb_return retval = new ChemicalChunkerParser.lrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal209=null;
        Token TOKEN210=null;

        Object string_literal209_tree=null;
        Object TOKEN210_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(193, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:193:4: ( 'LRB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:193:5: 'LRB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(193,5);
            string_literal209=(Token)match(input,101,FOLLOW_101_in_lrb975); 
            string_literal209_tree = (Object)adaptor.create(string_literal209);
            adaptor.addChild(root_0, string_literal209_tree);

            dbg.location(193,11);
            TOKEN210=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lrb977); 
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
        dbg.location(193, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:194:1: rrb : 'RRB' TOKEN ;
    public final ChemicalChunkerParser.rrb_return rrb() throws RecognitionException {
        ChemicalChunkerParser.rrb_return retval = new ChemicalChunkerParser.rrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal211=null;
        Token TOKEN212=null;

        Object string_literal211_tree=null;
        Object TOKEN212_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:194:4: ( 'RRB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:194:5: 'RRB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(194,5);
            string_literal211=(Token)match(input,102,FOLLOW_102_in_rrb982); 
            string_literal211_tree = (Object)adaptor.create(string_literal211);
            adaptor.addChild(root_0, string_literal211_tree);

            dbg.location(194,11);
            TOKEN212=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rrb984); 
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
        dbg.location(194, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:199:1: abl : 'ABL' TOKEN ;
    public final ChemicalChunkerParser.abl_return abl() throws RecognitionException {
        ChemicalChunkerParser.abl_return retval = new ChemicalChunkerParser.abl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal213=null;
        Token TOKEN214=null;

        Object string_literal213_tree=null;
        Object TOKEN214_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:199:4: ( 'ABL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:199:5: 'ABL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(199,5);
            string_literal213=(Token)match(input,103,FOLLOW_103_in_abl993); 
            string_literal213_tree = (Object)adaptor.create(string_literal213);
            adaptor.addChild(root_0, string_literal213_tree);

            dbg.location(199,11);
            TOKEN214=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abl995); 
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
        dbg.location(199, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:202:1: abn : 'ABN' TOKEN ;
    public final ChemicalChunkerParser.abn_return abn() throws RecognitionException {
        ChemicalChunkerParser.abn_return retval = new ChemicalChunkerParser.abn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal215=null;
        Token TOKEN216=null;

        Object string_literal215_tree=null;
        Object TOKEN216_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(202, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:202:4: ( 'ABN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:202:5: 'ABN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(202,5);
            string_literal215=(Token)match(input,104,FOLLOW_104_in_abn1002); 
            string_literal215_tree = (Object)adaptor.create(string_literal215);
            adaptor.addChild(root_0, string_literal215_tree);

            dbg.location(202,11);
            TOKEN216=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abn1004); 
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
        dbg.location(202, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:205:1: abx : 'ABX' TOKEN ;
    public final ChemicalChunkerParser.abx_return abx() throws RecognitionException {
        ChemicalChunkerParser.abx_return retval = new ChemicalChunkerParser.abx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal217=null;
        Token TOKEN218=null;

        Object string_literal217_tree=null;
        Object TOKEN218_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(205, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:205:4: ( 'ABX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:205:5: 'ABX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(205,5);
            string_literal217=(Token)match(input,105,FOLLOW_105_in_abx1011); 
            string_literal217_tree = (Object)adaptor.create(string_literal217);
            adaptor.addChild(root_0, string_literal217_tree);

            dbg.location(205,11);
            TOKEN218=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abx1013); 
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
        dbg.location(205, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:208:1: ap : 'AP' TOKEN ;
    public final ChemicalChunkerParser.ap_return ap() throws RecognitionException {
        ChemicalChunkerParser.ap_return retval = new ChemicalChunkerParser.ap_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal219=null;
        Token TOKEN220=null;

        Object string_literal219_tree=null;
        Object TOKEN220_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ap");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:208:3: ( 'AP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:208:4: 'AP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(208,4);
            string_literal219=(Token)match(input,106,FOLLOW_106_in_ap1020); 
            string_literal219_tree = (Object)adaptor.create(string_literal219);
            adaptor.addChild(root_0, string_literal219_tree);

            dbg.location(208,9);
            TOKEN220=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ap1022); 
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
        dbg.location(208, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:211:1: at : 'AT' TOKEN ;
    public final ChemicalChunkerParser.at_return at() throws RecognitionException {
        ChemicalChunkerParser.at_return retval = new ChemicalChunkerParser.at_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal221=null;
        Token TOKEN222=null;

        Object string_literal221_tree=null;
        Object TOKEN222_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "at");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:211:3: ( 'AT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:211:4: 'AT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(211,4);
            string_literal221=(Token)match(input,107,FOLLOW_107_in_at1029); 
            string_literal221_tree = (Object)adaptor.create(string_literal221);
            adaptor.addChild(root_0, string_literal221_tree);

            dbg.location(211,9);
            TOKEN222=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_at1031); 
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
        dbg.location(211, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:214:1: be : 'BE' TOKEN ;
    public final ChemicalChunkerParser.be_return be() throws RecognitionException {
        ChemicalChunkerParser.be_return retval = new ChemicalChunkerParser.be_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal223=null;
        Token TOKEN224=null;

        Object string_literal223_tree=null;
        Object TOKEN224_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "be");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(214, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:214:3: ( 'BE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:214:4: 'BE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(214,4);
            string_literal223=(Token)match(input,108,FOLLOW_108_in_be1038); 
            string_literal223_tree = (Object)adaptor.create(string_literal223);
            adaptor.addChild(root_0, string_literal223_tree);

            dbg.location(214,9);
            TOKEN224=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_be1040); 
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
        dbg.location(214, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:217:1: bed : 'BED' TOKEN ;
    public final ChemicalChunkerParser.bed_return bed() throws RecognitionException {
        ChemicalChunkerParser.bed_return retval = new ChemicalChunkerParser.bed_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal225=null;
        Token TOKEN226=null;

        Object string_literal225_tree=null;
        Object TOKEN226_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:217:4: ( 'BED' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:217:5: 'BED' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(217,5);
            string_literal225=(Token)match(input,109,FOLLOW_109_in_bed1047); 
            string_literal225_tree = (Object)adaptor.create(string_literal225);
            adaptor.addChild(root_0, string_literal225_tree);

            dbg.location(217,11);
            TOKEN226=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bed1049); 
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
        dbg.location(217, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:220:1: bedz : 'BEDZ' TOKEN ;
    public final ChemicalChunkerParser.bedz_return bedz() throws RecognitionException {
        ChemicalChunkerParser.bedz_return retval = new ChemicalChunkerParser.bedz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal227=null;
        Token TOKEN228=null;

        Object string_literal227_tree=null;
        Object TOKEN228_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bedz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(220, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:220:5: ( 'BEDZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:220:6: 'BEDZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(220,6);
            string_literal227=(Token)match(input,110,FOLLOW_110_in_bedz1056); 
            string_literal227_tree = (Object)adaptor.create(string_literal227);
            adaptor.addChild(root_0, string_literal227_tree);

            dbg.location(220,13);
            TOKEN228=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bedz1058); 
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
        dbg.location(220, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:223:1: beg : 'BEG' TOKEN ;
    public final ChemicalChunkerParser.beg_return beg() throws RecognitionException {
        ChemicalChunkerParser.beg_return retval = new ChemicalChunkerParser.beg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal229=null;
        Token TOKEN230=null;

        Object string_literal229_tree=null;
        Object TOKEN230_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "beg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(223, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:223:4: ( 'BEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:223:5: 'BEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(223,5);
            string_literal229=(Token)match(input,111,FOLLOW_111_in_beg1065); 
            string_literal229_tree = (Object)adaptor.create(string_literal229);
            adaptor.addChild(root_0, string_literal229_tree);

            dbg.location(223,11);
            TOKEN230=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_beg1067); 
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
        dbg.location(223, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:226:1: bem : 'BEM' TOKEN ;
    public final ChemicalChunkerParser.bem_return bem() throws RecognitionException {
        ChemicalChunkerParser.bem_return retval = new ChemicalChunkerParser.bem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal231=null;
        Token TOKEN232=null;

        Object string_literal231_tree=null;
        Object TOKEN232_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bem");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(226, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:226:4: ( 'BEM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:226:5: 'BEM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(226,5);
            string_literal231=(Token)match(input,112,FOLLOW_112_in_bem1074); 
            string_literal231_tree = (Object)adaptor.create(string_literal231);
            adaptor.addChild(root_0, string_literal231_tree);

            dbg.location(226,11);
            TOKEN232=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bem1076); 
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
        dbg.location(226, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:229:1: ben : 'BEN' TOKEN ;
    public final ChemicalChunkerParser.ben_return ben() throws RecognitionException {
        ChemicalChunkerParser.ben_return retval = new ChemicalChunkerParser.ben_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal233=null;
        Token TOKEN234=null;

        Object string_literal233_tree=null;
        Object TOKEN234_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ben");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(229, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:229:4: ( 'BEN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:229:5: 'BEN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(229,5);
            string_literal233=(Token)match(input,113,FOLLOW_113_in_ben1083); 
            string_literal233_tree = (Object)adaptor.create(string_literal233);
            adaptor.addChild(root_0, string_literal233_tree);

            dbg.location(229,11);
            TOKEN234=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ben1085); 
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
        dbg.location(229, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:232:1: ber : 'BER' TOKEN ;
    public final ChemicalChunkerParser.ber_return ber() throws RecognitionException {
        ChemicalChunkerParser.ber_return retval = new ChemicalChunkerParser.ber_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal235=null;
        Token TOKEN236=null;

        Object string_literal235_tree=null;
        Object TOKEN236_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ber");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:232:4: ( 'BER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:232:5: 'BER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(232,5);
            string_literal235=(Token)match(input,114,FOLLOW_114_in_ber1092); 
            string_literal235_tree = (Object)adaptor.create(string_literal235);
            adaptor.addChild(root_0, string_literal235_tree);

            dbg.location(232,11);
            TOKEN236=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ber1094); 
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
        dbg.location(232, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:235:1: bez : 'BEZ' TOKEN ;
    public final ChemicalChunkerParser.bez_return bez() throws RecognitionException {
        ChemicalChunkerParser.bez_return retval = new ChemicalChunkerParser.bez_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal237=null;
        Token TOKEN238=null;

        Object string_literal237_tree=null;
        Object TOKEN238_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bez");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(235, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:235:4: ( 'BEZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:235:5: 'BEZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(235,5);
            string_literal237=(Token)match(input,115,FOLLOW_115_in_bez1101); 
            string_literal237_tree = (Object)adaptor.create(string_literal237);
            adaptor.addChild(root_0, string_literal237_tree);

            dbg.location(235,11);
            TOKEN238=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bez1103); 
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
        dbg.location(235, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:238:1: cc : 'CC' TOKEN ;
    public final ChemicalChunkerParser.cc_return cc() throws RecognitionException {
        ChemicalChunkerParser.cc_return retval = new ChemicalChunkerParser.cc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal239=null;
        Token TOKEN240=null;

        Object string_literal239_tree=null;
        Object TOKEN240_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:238:3: ( 'CC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:238:4: 'CC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(238,4);
            string_literal239=(Token)match(input,116,FOLLOW_116_in_cc1110); 
            string_literal239_tree = (Object)adaptor.create(string_literal239);
            adaptor.addChild(root_0, string_literal239_tree);

            dbg.location(238,9);
            TOKEN240=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cc1112); 
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
        dbg.location(238, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:241:1: cd : 'CD' TOKEN ;
    public final ChemicalChunkerParser.cd_return cd() throws RecognitionException {
        ChemicalChunkerParser.cd_return retval = new ChemicalChunkerParser.cd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal241=null;
        Token TOKEN242=null;

        Object string_literal241_tree=null;
        Object TOKEN242_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(241, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:241:3: ( 'CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:241:4: 'CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(241,4);
            string_literal241=(Token)match(input,9,FOLLOW_9_in_cd1119); 
            string_literal241_tree = (Object)adaptor.create(string_literal241);
            adaptor.addChild(root_0, string_literal241_tree);

            dbg.location(241,9);
            TOKEN242=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cd1121); 
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
        dbg.location(241, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cd"

    public static class dt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dt"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:246:1: dt : 'DT' TOKEN ;
    public final ChemicalChunkerParser.dt_return dt() throws RecognitionException {
        ChemicalChunkerParser.dt_return retval = new ChemicalChunkerParser.dt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal243=null;
        Token TOKEN244=null;

        Object string_literal243_tree=null;
        Object TOKEN244_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:246:3: ( 'DT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:246:4: 'DT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(246,4);
            string_literal243=(Token)match(input,117,FOLLOW_117_in_dt1130); 
            string_literal243_tree = (Object)adaptor.create(string_literal243);
            adaptor.addChild(root_0, string_literal243_tree);

            dbg.location(246,9);
            TOKEN244=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dt1132); 
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
        dbg.location(246, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dt"

    public static class in_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:250:1: in : 'IN' TOKEN ;
    public final ChemicalChunkerParser.in_return in() throws RecognitionException {
        ChemicalChunkerParser.in_return retval = new ChemicalChunkerParser.in_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal245=null;
        Token TOKEN246=null;

        Object string_literal245_tree=null;
        Object TOKEN246_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "in");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(250, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:250:3: ( 'IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:250:4: 'IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(250,4);
            string_literal245=(Token)match(input,118,FOLLOW_118_in_in1140); 
            string_literal245_tree = (Object)adaptor.create(string_literal245);
            adaptor.addChild(root_0, string_literal245_tree);

            dbg.location(250,9);
            TOKEN246=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_in1142); 
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
        dbg.location(250, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "in");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "in"

    public static class dti_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dti"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:252:1: dti : 'DTI' TOKEN ;
    public final ChemicalChunkerParser.dti_return dti() throws RecognitionException {
        ChemicalChunkerParser.dti_return retval = new ChemicalChunkerParser.dti_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal247=null;
        Token TOKEN248=null;

        Object string_literal247_tree=null;
        Object TOKEN248_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dti");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(252, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:255:4: ( 'DTI' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:255:5: 'DTI' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(255,5);
            string_literal247=(Token)match(input,119,FOLLOW_119_in_dti1152); 
            string_literal247_tree = (Object)adaptor.create(string_literal247);
            adaptor.addChild(root_0, string_literal247_tree);

            dbg.location(255,11);
            TOKEN248=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dti1154); 
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
        dbg.location(255, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:258:1: dts : 'DTS' TOKEN ;
    public final ChemicalChunkerParser.dts_return dts() throws RecognitionException {
        ChemicalChunkerParser.dts_return retval = new ChemicalChunkerParser.dts_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal249=null;
        Token TOKEN250=null;

        Object string_literal249_tree=null;
        Object TOKEN250_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dts");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(258, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:258:4: ( 'DTS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:258:5: 'DTS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(258,5);
            string_literal249=(Token)match(input,120,FOLLOW_120_in_dts1161); 
            string_literal249_tree = (Object)adaptor.create(string_literal249);
            adaptor.addChild(root_0, string_literal249_tree);

            dbg.location(258,11);
            TOKEN250=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dts1163); 
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
        dbg.location(258, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:261:1: dtx : 'DTX' TOKEN ;
    public final ChemicalChunkerParser.dtx_return dtx() throws RecognitionException {
        ChemicalChunkerParser.dtx_return retval = new ChemicalChunkerParser.dtx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal251=null;
        Token TOKEN252=null;

        Object string_literal251_tree=null;
        Object TOKEN252_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dtx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:261:4: ( 'DTX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:261:5: 'DTX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(261,5);
            string_literal251=(Token)match(input,121,FOLLOW_121_in_dtx1170); 
            string_literal251_tree = (Object)adaptor.create(string_literal251);
            adaptor.addChild(root_0, string_literal251_tree);

            dbg.location(261,11);
            TOKEN252=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dtx1172); 
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
        dbg.location(261, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:264:1: ex : 'EX' TOKEN ;
    public final ChemicalChunkerParser.ex_return ex() throws RecognitionException {
        ChemicalChunkerParser.ex_return retval = new ChemicalChunkerParser.ex_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal253=null;
        Token TOKEN254=null;

        Object string_literal253_tree=null;
        Object TOKEN254_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ex");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(264, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:264:3: ( 'EX' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:264:4: 'EX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(264,4);
            string_literal253=(Token)match(input,122,FOLLOW_122_in_ex1179); 
            string_literal253_tree = (Object)adaptor.create(string_literal253);
            adaptor.addChild(root_0, string_literal253_tree);

            dbg.location(264,9);
            TOKEN254=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ex1181); 
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
        dbg.location(264, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:267:1: fw : 'FW' TOKEN ;
    public final ChemicalChunkerParser.fw_return fw() throws RecognitionException {
        ChemicalChunkerParser.fw_return retval = new ChemicalChunkerParser.fw_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal255=null;
        Token TOKEN256=null;

        Object string_literal255_tree=null;
        Object TOKEN256_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(267, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:267:3: ( 'FW' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:267:4: 'FW' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(267,4);
            string_literal255=(Token)match(input,123,FOLLOW_123_in_fw1188); 
            string_literal255_tree = (Object)adaptor.create(string_literal255);
            adaptor.addChild(root_0, string_literal255_tree);

            dbg.location(267,9);
            TOKEN256=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_fw1190); 
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
        dbg.location(267, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:270:1: hv : 'HV' TOKEN ;
    public final ChemicalChunkerParser.hv_return hv() throws RecognitionException {
        ChemicalChunkerParser.hv_return retval = new ChemicalChunkerParser.hv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal257=null;
        Token TOKEN258=null;

        Object string_literal257_tree=null;
        Object TOKEN258_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(270, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:270:3: ( 'HV' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:270:4: 'HV' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(270,4);
            string_literal257=(Token)match(input,124,FOLLOW_124_in_hv1197); 
            string_literal257_tree = (Object)adaptor.create(string_literal257);
            adaptor.addChild(root_0, string_literal257_tree);

            dbg.location(270,9);
            TOKEN258=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hv1199); 
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
        dbg.location(270, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:273:1: hvd : 'HVD' TOKEN ;
    public final ChemicalChunkerParser.hvd_return hvd() throws RecognitionException {
        ChemicalChunkerParser.hvd_return retval = new ChemicalChunkerParser.hvd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal259=null;
        Token TOKEN260=null;

        Object string_literal259_tree=null;
        Object TOKEN260_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(273, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:273:4: ( 'HVD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:273:5: 'HVD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(273,5);
            string_literal259=(Token)match(input,125,FOLLOW_125_in_hvd1206); 
            string_literal259_tree = (Object)adaptor.create(string_literal259);
            adaptor.addChild(root_0, string_literal259_tree);

            dbg.location(273,11);
            TOKEN260=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvd1208); 
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
        dbg.location(273, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:276:1: hvg : 'HVG' TOKEN ;
    public final ChemicalChunkerParser.hvg_return hvg() throws RecognitionException {
        ChemicalChunkerParser.hvg_return retval = new ChemicalChunkerParser.hvg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal261=null;
        Token TOKEN262=null;

        Object string_literal261_tree=null;
        Object TOKEN262_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(276, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:276:4: ( 'HVG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:276:5: 'HVG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(276,5);
            string_literal261=(Token)match(input,126,FOLLOW_126_in_hvg1215); 
            string_literal261_tree = (Object)adaptor.create(string_literal261);
            adaptor.addChild(root_0, string_literal261_tree);

            dbg.location(276,11);
            TOKEN262=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvg1217); 
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
        dbg.location(276, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:279:1: hvn : 'HVN' TOKEN ;
    public final ChemicalChunkerParser.hvn_return hvn() throws RecognitionException {
        ChemicalChunkerParser.hvn_return retval = new ChemicalChunkerParser.hvn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal263=null;
        Token TOKEN264=null;

        Object string_literal263_tree=null;
        Object TOKEN264_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:279:4: ( 'HVN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:279:5: 'HVN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(279,5);
            string_literal263=(Token)match(input,127,FOLLOW_127_in_hvn1224); 
            string_literal263_tree = (Object)adaptor.create(string_literal263);
            adaptor.addChild(root_0, string_literal263_tree);

            dbg.location(279,11);
            TOKEN264=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvn1226); 
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
        dbg.location(279, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hvn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hvn"

    public static class jjr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jjr"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:283:1: jjr : 'JJR' TOKEN ;
    public final ChemicalChunkerParser.jjr_return jjr() throws RecognitionException {
        ChemicalChunkerParser.jjr_return retval = new ChemicalChunkerParser.jjr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal265=null;
        Token TOKEN266=null;

        Object string_literal265_tree=null;
        Object TOKEN266_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(283, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:283:4: ( 'JJR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:283:5: 'JJR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(283,5);
            string_literal265=(Token)match(input,128,FOLLOW_128_in_jjr1234); 
            string_literal265_tree = (Object)adaptor.create(string_literal265);
            adaptor.addChild(root_0, string_literal265_tree);

            dbg.location(283,11);
            TOKEN266=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjr1236); 
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
        dbg.location(283, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:286:1: jjs : 'JJS' TOKEN ;
    public final ChemicalChunkerParser.jjs_return jjs() throws RecognitionException {
        ChemicalChunkerParser.jjs_return retval = new ChemicalChunkerParser.jjs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal267=null;
        Token TOKEN268=null;

        Object string_literal267_tree=null;
        Object TOKEN268_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:286:4: ( 'JJS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:286:5: 'JJS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(286,5);
            string_literal267=(Token)match(input,129,FOLLOW_129_in_jjs1243); 
            string_literal267_tree = (Object)adaptor.create(string_literal267);
            adaptor.addChild(root_0, string_literal267_tree);

            dbg.location(286,11);
            TOKEN268=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjs1245); 
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
        dbg.location(286, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:289:1: jjt : 'JJT' TOKEN ;
    public final ChemicalChunkerParser.jjt_return jjt() throws RecognitionException {
        ChemicalChunkerParser.jjt_return retval = new ChemicalChunkerParser.jjt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal269=null;
        Token TOKEN270=null;

        Object string_literal269_tree=null;
        Object TOKEN270_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(289, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:289:4: ( 'JJT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:289:5: 'JJT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(289,5);
            string_literal269=(Token)match(input,130,FOLLOW_130_in_jjt1252); 
            string_literal269_tree = (Object)adaptor.create(string_literal269);
            adaptor.addChild(root_0, string_literal269_tree);

            dbg.location(289,11);
            TOKEN270=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjt1254); 
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
        dbg.location(289, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:292:1: md : 'MD' TOKEN ;
    public final ChemicalChunkerParser.md_return md() throws RecognitionException {
        ChemicalChunkerParser.md_return retval = new ChemicalChunkerParser.md_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal271=null;
        Token TOKEN272=null;

        Object string_literal271_tree=null;
        Object TOKEN272_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "md");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:292:3: ( 'MD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:292:4: 'MD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(292,4);
            string_literal271=(Token)match(input,131,FOLLOW_131_in_md1261); 
            string_literal271_tree = (Object)adaptor.create(string_literal271);
            adaptor.addChild(root_0, string_literal271_tree);

            dbg.location(292,9);
            TOKEN272=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_md1263); 
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
        dbg.location(292, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:295:1: nc : 'NC' TOKEN ;
    public final ChemicalChunkerParser.nc_return nc() throws RecognitionException {
        ChemicalChunkerParser.nc_return retval = new ChemicalChunkerParser.nc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal273=null;
        Token TOKEN274=null;

        Object string_literal273_tree=null;
        Object TOKEN274_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(295, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:295:3: ( 'NC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:295:4: 'NC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(295,4);
            string_literal273=(Token)match(input,132,FOLLOW_132_in_nc1270); 
            string_literal273_tree = (Object)adaptor.create(string_literal273);
            adaptor.addChild(root_0, string_literal273_tree);

            dbg.location(295,9);
            TOKEN274=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nc1272); 
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
        dbg.location(295, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nc"

    public static class wpdollar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wpdollar"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:298:1: wpdollar : 'WP$' TOKEN ;
    public final ChemicalChunkerParser.wpdollar_return wpdollar() throws RecognitionException {
        ChemicalChunkerParser.wpdollar_return retval = new ChemicalChunkerParser.wpdollar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal275=null;
        Token TOKEN276=null;

        Object string_literal275_tree=null;
        Object TOKEN276_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wpdollar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(298, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:298:9: ( 'WP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:298:10: 'WP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(298,10);
            string_literal275=(Token)match(input,133,FOLLOW_133_in_wpdollar1279); 
            string_literal275_tree = (Object)adaptor.create(string_literal275);
            adaptor.addChild(root_0, string_literal275_tree);

            dbg.location(298,16);
            TOKEN276=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wpdollar1281); 
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
        dbg.location(298, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wpdollar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wpdollar"

    public static class wpo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wpo"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:301:1: wpo : 'WPO' TOKEN ;
    public final ChemicalChunkerParser.wpo_return wpo() throws RecognitionException {
        ChemicalChunkerParser.wpo_return retval = new ChemicalChunkerParser.wpo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal277=null;
        Token TOKEN278=null;

        Object string_literal277_tree=null;
        Object TOKEN278_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wpo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(301, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:301:4: ( 'WPO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:301:5: 'WPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(301,5);
            string_literal277=(Token)match(input,134,FOLLOW_134_in_wpo1288); 
            string_literal277_tree = (Object)adaptor.create(string_literal277);
            adaptor.addChild(root_0, string_literal277_tree);

            dbg.location(301,11);
            TOKEN278=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wpo1290); 
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
        dbg.location(301, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:304:1: wps : 'WPS' TOKEN ;
    public final ChemicalChunkerParser.wps_return wps() throws RecognitionException {
        ChemicalChunkerParser.wps_return retval = new ChemicalChunkerParser.wps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal279=null;
        Token TOKEN280=null;

        Object string_literal279_tree=null;
        Object TOKEN280_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:304:4: ( 'WPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:304:5: 'WPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(304,5);
            string_literal279=(Token)match(input,135,FOLLOW_135_in_wps1297); 
            string_literal279_tree = (Object)adaptor.create(string_literal279);
            adaptor.addChild(root_0, string_literal279_tree);

            dbg.location(304,11);
            TOKEN280=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wps1299); 
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
        dbg.location(304, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:307:1: wql : 'WQL' TOKEN ;
    public final ChemicalChunkerParser.wql_return wql() throws RecognitionException {
        ChemicalChunkerParser.wql_return retval = new ChemicalChunkerParser.wql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal281=null;
        Token TOKEN282=null;

        Object string_literal281_tree=null;
        Object TOKEN282_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(307, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:307:4: ( 'WQL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:307:5: 'WQL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(307,5);
            string_literal281=(Token)match(input,136,FOLLOW_136_in_wql1306); 
            string_literal281_tree = (Object)adaptor.create(string_literal281);
            adaptor.addChild(root_0, string_literal281_tree);

            dbg.location(307,11);
            TOKEN282=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wql1308); 
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
        dbg.location(307, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:310:1: wrb : 'WRB' TOKEN ;
    public final ChemicalChunkerParser.wrb_return wrb() throws RecognitionException {
        ChemicalChunkerParser.wrb_return retval = new ChemicalChunkerParser.wrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal283=null;
        Token TOKEN284=null;

        Object string_literal283_tree=null;
        Object TOKEN284_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(310, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:310:4: ( 'WRB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:310:5: 'WRB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(310,5);
            string_literal283=(Token)match(input,137,FOLLOW_137_in_wrb1315); 
            string_literal283_tree = (Object)adaptor.create(string_literal283);
            adaptor.addChild(root_0, string_literal283_tree);

            dbg.location(310,11);
            TOKEN284=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wrb1317); 
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
        dbg.location(310, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wrb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wrb"

    public static class uh_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "uh"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:314:1: uh : 'UH' TOKEN ;
    public final ChemicalChunkerParser.uh_return uh() throws RecognitionException {
        ChemicalChunkerParser.uh_return retval = new ChemicalChunkerParser.uh_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal285=null;
        Token TOKEN286=null;

        Object string_literal285_tree=null;
        Object TOKEN286_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "uh");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(314, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:314:3: ( 'UH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:314:4: 'UH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(314,4);
            string_literal285=(Token)match(input,138,FOLLOW_138_in_uh1325); 
            string_literal285_tree = (Object)adaptor.create(string_literal285);
            adaptor.addChild(root_0, string_literal285_tree);

            dbg.location(314,9);
            TOKEN286=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_uh1327); 
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
        dbg.location(314, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:317:1: vb : 'VB' TOKEN ;
    public final ChemicalChunkerParser.vb_return vb() throws RecognitionException {
        ChemicalChunkerParser.vb_return retval = new ChemicalChunkerParser.vb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal287=null;
        Token TOKEN288=null;

        Object string_literal287_tree=null;
        Object TOKEN288_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(317, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:317:3: ( 'VB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:317:4: 'VB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(317,4);
            string_literal287=(Token)match(input,139,FOLLOW_139_in_vb1334); 
            string_literal287_tree = (Object)adaptor.create(string_literal287);
            adaptor.addChild(root_0, string_literal287_tree);

            dbg.location(317,9);
            TOKEN288=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vb1336); 
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
        dbg.location(317, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vb"

    public static class vbg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbg"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:320:1: vbg : 'VBG' TOKEN ;
    public final ChemicalChunkerParser.vbg_return vbg() throws RecognitionException {
        ChemicalChunkerParser.vbg_return retval = new ChemicalChunkerParser.vbg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal289=null;
        Token TOKEN290=null;

        Object string_literal289_tree=null;
        Object TOKEN290_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:320:4: ( 'VBG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:320:5: 'VBG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(320,5);
            string_literal289=(Token)match(input,140,FOLLOW_140_in_vbg1343); 
            string_literal289_tree = (Object)adaptor.create(string_literal289);
            adaptor.addChild(root_0, string_literal289_tree);

            dbg.location(320,11);
            TOKEN290=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbg1345); 
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
        dbg.location(320, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:323:1: vbn : 'VBN' TOKEN ;
    public final ChemicalChunkerParser.vbn_return vbn() throws RecognitionException {
        ChemicalChunkerParser.vbn_return retval = new ChemicalChunkerParser.vbn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal291=null;
        Token TOKEN292=null;

        Object string_literal291_tree=null;
        Object TOKEN292_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(323, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:323:4: ( 'VBN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:323:5: 'VBN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(323,5);
            string_literal291=(Token)match(input,141,FOLLOW_141_in_vbn1352); 
            string_literal291_tree = (Object)adaptor.create(string_literal291);
            adaptor.addChild(root_0, string_literal291_tree);

            dbg.location(323,11);
            TOKEN292=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbn1354); 
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
        dbg.location(323, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:326:1: vbz : 'VBZ' TOKEN ;
    public final ChemicalChunkerParser.vbz_return vbz() throws RecognitionException {
        ChemicalChunkerParser.vbz_return retval = new ChemicalChunkerParser.vbz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal293=null;
        Token TOKEN294=null;

        Object string_literal293_tree=null;
        Object TOKEN294_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(326, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:326:4: ( 'VBZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:326:5: 'VBZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(326,5);
            string_literal293=(Token)match(input,142,FOLLOW_142_in_vbz1361); 
            string_literal293_tree = (Object)adaptor.create(string_literal293);
            adaptor.addChild(root_0, string_literal293_tree);

            dbg.location(326,11);
            TOKEN294=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbz1363); 
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
        dbg.location(326, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:329:1: wdt : 'WDT' TOKEN ;
    public final ChemicalChunkerParser.wdt_return wdt() throws RecognitionException {
        ChemicalChunkerParser.wdt_return retval = new ChemicalChunkerParser.wdt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal295=null;
        Token TOKEN296=null;

        Object string_literal295_tree=null;
        Object TOKEN296_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wdt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(329, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:329:4: ( 'WDT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:329:5: 'WDT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(329,5);
            string_literal295=(Token)match(input,143,FOLLOW_143_in_wdt1370); 
            string_literal295_tree = (Object)adaptor.create(string_literal295);
            adaptor.addChild(root_0, string_literal295_tree);

            dbg.location(329,11);
            TOKEN296=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wdt1372); 
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
        dbg.location(329, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wdt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wdt"

    public static class rbr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rbr"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:333:1: rbr : 'RBR' TOKEN ;
    public final ChemicalChunkerParser.rbr_return rbr() throws RecognitionException {
        ChemicalChunkerParser.rbr_return retval = new ChemicalChunkerParser.rbr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal297=null;
        Token TOKEN298=null;

        Object string_literal297_tree=null;
        Object TOKEN298_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(333, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:333:4: ( 'RBR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:333:5: 'RBR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(333,5);
            string_literal297=(Token)match(input,144,FOLLOW_144_in_rbr1380); 
            string_literal297_tree = (Object)adaptor.create(string_literal297);
            adaptor.addChild(root_0, string_literal297_tree);

            dbg.location(333,11);
            TOKEN298=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbr1382); 
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
        dbg.location(333, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:336:1: rbt : 'RBT' TOKEN ;
    public final ChemicalChunkerParser.rbt_return rbt() throws RecognitionException {
        ChemicalChunkerParser.rbt_return retval = new ChemicalChunkerParser.rbt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal299=null;
        Token TOKEN300=null;

        Object string_literal299_tree=null;
        Object TOKEN300_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(336, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:336:4: ( 'RBT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:336:5: 'RBT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(336,5);
            string_literal299=(Token)match(input,145,FOLLOW_145_in_rbt1389); 
            string_literal299_tree = (Object)adaptor.create(string_literal299);
            adaptor.addChild(root_0, string_literal299_tree);

            dbg.location(336,11);
            TOKEN300=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbt1391); 
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
        dbg.location(336, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:339:1: rn : 'RN' TOKEN ;
    public final ChemicalChunkerParser.rn_return rn() throws RecognitionException {
        ChemicalChunkerParser.rn_return retval = new ChemicalChunkerParser.rn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal301=null;
        Token TOKEN302=null;

        Object string_literal301_tree=null;
        Object TOKEN302_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(339, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:339:3: ( 'RN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:339:4: 'RN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(339,4);
            string_literal301=(Token)match(input,146,FOLLOW_146_in_rn1398); 
            string_literal301_tree = (Object)adaptor.create(string_literal301);
            adaptor.addChild(root_0, string_literal301_tree);

            dbg.location(339,9);
            TOKEN302=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rn1400); 
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
        dbg.location(339, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:342:1: rp : 'RP' TOKEN ;
    public final ChemicalChunkerParser.rp_return rp() throws RecognitionException {
        ChemicalChunkerParser.rp_return retval = new ChemicalChunkerParser.rp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal303=null;
        Token TOKEN304=null;

        Object string_literal303_tree=null;
        Object TOKEN304_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(342, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:342:3: ( 'RP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:342:4: 'RP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(342,4);
            string_literal303=(Token)match(input,147,FOLLOW_147_in_rp1407); 
            string_literal303_tree = (Object)adaptor.create(string_literal303);
            adaptor.addChild(root_0, string_literal303_tree);

            dbg.location(342,9);
            TOKEN304=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rp1409); 
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
        dbg.location(342, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rp"

    public static class pn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pn"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:347:1: pn : 'PN' TOKEN ;
    public final ChemicalChunkerParser.pn_return pn() throws RecognitionException {
        ChemicalChunkerParser.pn_return retval = new ChemicalChunkerParser.pn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal305=null;
        Token TOKEN306=null;

        Object string_literal305_tree=null;
        Object TOKEN306_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(347, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:347:3: ( 'PN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:347:4: 'PN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(347,4);
            string_literal305=(Token)match(input,148,FOLLOW_148_in_pn1418); 
            string_literal305_tree = (Object)adaptor.create(string_literal305);
            adaptor.addChild(root_0, string_literal305_tree);

            dbg.location(347,9);
            TOKEN306=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn1420); 
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
        dbg.location(347, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pn"

    public static class pndollar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pndollar"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:350:1: pndollar : 'PN$' TOKEN ;
    public final ChemicalChunkerParser.pndollar_return pndollar() throws RecognitionException {
        ChemicalChunkerParser.pndollar_return retval = new ChemicalChunkerParser.pndollar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal307=null;
        Token TOKEN308=null;

        Object string_literal307_tree=null;
        Object TOKEN308_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pndollar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(350, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:350:9: ( 'PN$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:350:10: 'PN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(350,10);
            string_literal307=(Token)match(input,149,FOLLOW_149_in_pndollar1427); 
            string_literal307_tree = (Object)adaptor.create(string_literal307);
            adaptor.addChild(root_0, string_literal307_tree);

            dbg.location(350,16);
            TOKEN308=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pndollar1429); 
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
        dbg.location(350, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pndollar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pndollar"

    public static class ppdollar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppdollar"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:353:1: ppdollar : 'PP$' TOKEN ;
    public final ChemicalChunkerParser.ppdollar_return ppdollar() throws RecognitionException {
        ChemicalChunkerParser.ppdollar_return retval = new ChemicalChunkerParser.ppdollar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal309=null;
        Token TOKEN310=null;

        Object string_literal309_tree=null;
        Object TOKEN310_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppdollar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(353, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:353:9: ( 'PP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:353:10: 'PP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(353,10);
            string_literal309=(Token)match(input,150,FOLLOW_150_in_ppdollar1436); 
            string_literal309_tree = (Object)adaptor.create(string_literal309);
            adaptor.addChild(root_0, string_literal309_tree);

            dbg.location(353,16);
            TOKEN310=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppdollar1438); 
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
        dbg.location(353, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppdollar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppdollar"

    public static class ppdollardollar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppdollardollar"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:356:1: ppdollardollar : 'PP$$' TOKEN ;
    public final ChemicalChunkerParser.ppdollardollar_return ppdollardollar() throws RecognitionException {
        ChemicalChunkerParser.ppdollardollar_return retval = new ChemicalChunkerParser.ppdollardollar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal311=null;
        Token TOKEN312=null;

        Object string_literal311_tree=null;
        Object TOKEN312_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppdollardollar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(356, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:356:15: ( 'PP$$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:356:16: 'PP$$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(356,16);
            string_literal311=(Token)match(input,151,FOLLOW_151_in_ppdollardollar1445); 
            string_literal311_tree = (Object)adaptor.create(string_literal311);
            adaptor.addChild(root_0, string_literal311_tree);

            dbg.location(356,23);
            TOKEN312=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppdollardollar1447); 
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
        dbg.location(356, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppdollardollar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppdollardollar"

    public static class ppl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppl"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:359:1: ppl : 'PPL' TOKEN ;
    public final ChemicalChunkerParser.ppl_return ppl() throws RecognitionException {
        ChemicalChunkerParser.ppl_return retval = new ChemicalChunkerParser.ppl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal313=null;
        Token TOKEN314=null;

        Object string_literal313_tree=null;
        Object TOKEN314_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(359, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:359:4: ( 'PPL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:359:5: 'PPL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(359,5);
            string_literal313=(Token)match(input,152,FOLLOW_152_in_ppl1454); 
            string_literal313_tree = (Object)adaptor.create(string_literal313);
            adaptor.addChild(root_0, string_literal313_tree);

            dbg.location(359,11);
            TOKEN314=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppl1456); 
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
        dbg.location(359, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:362:1: ppls : 'PPLS' TOKEN ;
    public final ChemicalChunkerParser.ppls_return ppls() throws RecognitionException {
        ChemicalChunkerParser.ppls_return retval = new ChemicalChunkerParser.ppls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal315=null;
        Token TOKEN316=null;

        Object string_literal315_tree=null;
        Object TOKEN316_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(362, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:362:5: ( 'PPLS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:362:6: 'PPLS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(362,6);
            string_literal315=(Token)match(input,153,FOLLOW_153_in_ppls1463); 
            string_literal315_tree = (Object)adaptor.create(string_literal315);
            adaptor.addChild(root_0, string_literal315_tree);

            dbg.location(362,13);
            TOKEN316=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppls1465); 
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
        dbg.location(362, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:365:1: ppo : 'PPO' TOKEN ;
    public final ChemicalChunkerParser.ppo_return ppo() throws RecognitionException {
        ChemicalChunkerParser.ppo_return retval = new ChemicalChunkerParser.ppo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal317=null;
        Token TOKEN318=null;

        Object string_literal317_tree=null;
        Object TOKEN318_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(365, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:365:4: ( 'PPO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:365:5: 'PPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(365,5);
            string_literal317=(Token)match(input,154,FOLLOW_154_in_ppo1472); 
            string_literal317_tree = (Object)adaptor.create(string_literal317);
            adaptor.addChild(root_0, string_literal317_tree);

            dbg.location(365,11);
            TOKEN318=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppo1474); 
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
        dbg.location(365, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:368:1: pps : 'PPS' TOKEN ;
    public final ChemicalChunkerParser.pps_return pps() throws RecognitionException {
        ChemicalChunkerParser.pps_return retval = new ChemicalChunkerParser.pps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal319=null;
        Token TOKEN320=null;

        Object string_literal319_tree=null;
        Object TOKEN320_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(368, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:368:4: ( 'PPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:368:5: 'PPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(368,5);
            string_literal319=(Token)match(input,155,FOLLOW_155_in_pps1481); 
            string_literal319_tree = (Object)adaptor.create(string_literal319);
            adaptor.addChild(root_0, string_literal319_tree);

            dbg.location(368,11);
            TOKEN320=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pps1483); 
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
        dbg.location(368, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:371:1: ppss : 'PPSS' TOKEN ;
    public final ChemicalChunkerParser.ppss_return ppss() throws RecognitionException {
        ChemicalChunkerParser.ppss_return retval = new ChemicalChunkerParser.ppss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal321=null;
        Token TOKEN322=null;

        Object string_literal321_tree=null;
        Object TOKEN322_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(371, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:371:5: ( 'PPSS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:371:6: 'PPSS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(371,6);
            string_literal321=(Token)match(input,156,FOLLOW_156_in_ppss1490); 
            string_literal321_tree = (Object)adaptor.create(string_literal321);
            adaptor.addChild(root_0, string_literal321_tree);

            dbg.location(371,13);
            TOKEN322=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppss1492); 
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
        dbg.location(371, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:374:1: ql : 'QL' TOKEN ;
    public final ChemicalChunkerParser.ql_return ql() throws RecognitionException {
        ChemicalChunkerParser.ql_return retval = new ChemicalChunkerParser.ql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal323=null;
        Token TOKEN324=null;

        Object string_literal323_tree=null;
        Object TOKEN324_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(374, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:374:3: ( 'QL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:374:4: 'QL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(374,4);
            string_literal323=(Token)match(input,157,FOLLOW_157_in_ql1499); 
            string_literal323_tree = (Object)adaptor.create(string_literal323);
            adaptor.addChild(root_0, string_literal323_tree);

            dbg.location(374,9);
            TOKEN324=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ql1501); 
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
        dbg.location(374, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:377:1: qlp : 'QLP' TOKEN ;
    public final ChemicalChunkerParser.qlp_return qlp() throws RecognitionException {
        ChemicalChunkerParser.qlp_return retval = new ChemicalChunkerParser.qlp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal325=null;
        Token TOKEN326=null;

        Object string_literal325_tree=null;
        Object TOKEN326_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "qlp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(377, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:377:4: ( 'QLP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:377:5: 'QLP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(377,5);
            string_literal325=(Token)match(input,158,FOLLOW_158_in_qlp1508); 
            string_literal325_tree = (Object)adaptor.create(string_literal325);
            adaptor.addChild(root_0, string_literal325_tree);

            dbg.location(377,11);
            TOKEN326=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_qlp1510); 
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
        dbg.location(377, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "qlp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "qlp"

    public static class nndollar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nndollar"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:381:1: nndollar : 'NN$' TOKEN ;
    public final ChemicalChunkerParser.nndollar_return nndollar() throws RecognitionException {
        ChemicalChunkerParser.nndollar_return retval = new ChemicalChunkerParser.nndollar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal327=null;
        Token TOKEN328=null;

        Object string_literal327_tree=null;
        Object TOKEN328_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nndollar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:381:9: ( 'NN$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:381:10: 'NN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(381,10);
            string_literal327=(Token)match(input,159,FOLLOW_159_in_nndollar1518); 
            string_literal327_tree = (Object)adaptor.create(string_literal327);
            adaptor.addChild(root_0, string_literal327_tree);

            dbg.location(381,16);
            TOKEN328=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nndollar1520); 
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
        dbg.location(381, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nndollar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nndollar"

    public static class nnsdollar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nnsdollar"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:384:1: nnsdollar : 'NNS$' TOKEN ;
    public final ChemicalChunkerParser.nnsdollar_return nnsdollar() throws RecognitionException {
        ChemicalChunkerParser.nnsdollar_return retval = new ChemicalChunkerParser.nnsdollar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal329=null;
        Token TOKEN330=null;

        Object string_literal329_tree=null;
        Object TOKEN330_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnsdollar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(384, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:384:10: ( 'NNS$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:384:11: 'NNS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(384,11);
            string_literal329=(Token)match(input,160,FOLLOW_160_in_nnsdollar1527); 
            string_literal329_tree = (Object)adaptor.create(string_literal329);
            adaptor.addChild(root_0, string_literal329_tree);

            dbg.location(384,18);
            TOKEN330=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnsdollar1529); 
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
        dbg.location(384, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnsdollar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nnsdollar"

    public static class np_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "np"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:387:1: np : 'NP' TOKEN ;
    public final ChemicalChunkerParser.np_return np() throws RecognitionException {
        ChemicalChunkerParser.np_return retval = new ChemicalChunkerParser.np_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal331=null;
        Token TOKEN332=null;

        Object string_literal331_tree=null;
        Object TOKEN332_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(387, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:387:3: ( 'NP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:387:4: 'NP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(387,4);
            string_literal331=(Token)match(input,161,FOLLOW_161_in_np1536); 
            string_literal331_tree = (Object)adaptor.create(string_literal331);
            adaptor.addChild(root_0, string_literal331_tree);

            dbg.location(387,9);
            TOKEN332=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np1538); 
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
        dbg.location(387, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "np");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "np"

    public static class npdollar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "npdollar"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:390:1: npdollar : 'NP$' TOKEN ;
    public final ChemicalChunkerParser.npdollar_return npdollar() throws RecognitionException {
        ChemicalChunkerParser.npdollar_return retval = new ChemicalChunkerParser.npdollar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal333=null;
        Token TOKEN334=null;

        Object string_literal333_tree=null;
        Object TOKEN334_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "npdollar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(390, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:390:9: ( 'NP$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:390:10: 'NP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(390,10);
            string_literal333=(Token)match(input,162,FOLLOW_162_in_npdollar1545); 
            string_literal333_tree = (Object)adaptor.create(string_literal333);
            adaptor.addChild(root_0, string_literal333_tree);

            dbg.location(390,16);
            TOKEN334=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_npdollar1547); 
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
        dbg.location(390, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "npdollar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "npdollar"

    public static class nps_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nps"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:393:1: nps : 'NPS' TOKEN ;
    public final ChemicalChunkerParser.nps_return nps() throws RecognitionException {
        ChemicalChunkerParser.nps_return retval = new ChemicalChunkerParser.nps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal335=null;
        Token TOKEN336=null;

        Object string_literal335_tree=null;
        Object TOKEN336_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(393, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:393:4: ( 'NPS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:393:5: 'NPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(393,5);
            string_literal335=(Token)match(input,163,FOLLOW_163_in_nps1554); 
            string_literal335_tree = (Object)adaptor.create(string_literal335);
            adaptor.addChild(root_0, string_literal335_tree);

            dbg.location(393,11);
            TOKEN336=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps1556); 
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
        dbg.location(393, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nps");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nps"

    public static class npsdollar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "npsdollar"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:396:1: npsdollar : 'NPS$' TOKEN ;
    public final ChemicalChunkerParser.npsdollar_return npsdollar() throws RecognitionException {
        ChemicalChunkerParser.npsdollar_return retval = new ChemicalChunkerParser.npsdollar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal337=null;
        Token TOKEN338=null;

        Object string_literal337_tree=null;
        Object TOKEN338_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "npsdollar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(396, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:396:10: ( 'NPS$' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:396:11: 'NPS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(396,11);
            string_literal337=(Token)match(input,164,FOLLOW_164_in_npsdollar1563); 
            string_literal337_tree = (Object)adaptor.create(string_literal337);
            adaptor.addChild(root_0, string_literal337_tree);

            dbg.location(396,18);
            TOKEN338=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_npsdollar1565); 
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
        dbg.location(396, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "npsdollar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "npsdollar"

    public static class nr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nr"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:399:1: nr : 'NR' TOKEN ;
    public final ChemicalChunkerParser.nr_return nr() throws RecognitionException {
        ChemicalChunkerParser.nr_return retval = new ChemicalChunkerParser.nr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal339=null;
        Token TOKEN340=null;

        Object string_literal339_tree=null;
        Object TOKEN340_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(399, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:399:3: ( 'NR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:399:4: 'NR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(399,4);
            string_literal339=(Token)match(input,165,FOLLOW_165_in_nr1572); 
            string_literal339_tree = (Object)adaptor.create(string_literal339);
            adaptor.addChild(root_0, string_literal339_tree);

            dbg.location(399,9);
            TOKEN340=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nr1574); 
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
        dbg.location(399, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:402:1: od : 'OD' TOKEN ;
    public final ChemicalChunkerParser.od_return od() throws RecognitionException {
        ChemicalChunkerParser.od_return retval = new ChemicalChunkerParser.od_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal341=null;
        Token TOKEN342=null;

        Object string_literal341_tree=null;
        Object TOKEN342_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "od");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(402, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:402:3: ( 'OD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:402:4: 'OD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(402,4);
            string_literal341=(Token)match(input,166,FOLLOW_166_in_od1581); 
            string_literal341_tree = (Object)adaptor.create(string_literal341);
            adaptor.addChild(root_0, string_literal341_tree);

            dbg.location(402,9);
            TOKEN342=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_od1583); 
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
        dbg.location(402, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "od");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "od"

    public static class cs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cs"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:405:1: cs : 'CS' TOKEN ;
    public final ChemicalChunkerParser.cs_return cs() throws RecognitionException {
        ChemicalChunkerParser.cs_return retval = new ChemicalChunkerParser.cs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal343=null;
        Token TOKEN344=null;

        Object string_literal343_tree=null;
        Object TOKEN344_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(405, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:405:3: ( 'CS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:405:4: 'CS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(405,4);
            string_literal343=(Token)match(input,167,FOLLOW_167_in_cs1590); 
            string_literal343_tree = (Object)adaptor.create(string_literal343);
            adaptor.addChild(root_0, string_literal343_tree);

            dbg.location(405,9);
            TOKEN344=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cs1592); 
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
        dbg.location(405, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cs"

    public static class dotoken_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotoken"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:408:1: dotoken : 'DO' TOKEN ;
    public final ChemicalChunkerParser.dotoken_return dotoken() throws RecognitionException {
        ChemicalChunkerParser.dotoken_return retval = new ChemicalChunkerParser.dotoken_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal345=null;
        Token TOKEN346=null;

        Object string_literal345_tree=null;
        Object TOKEN346_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dotoken");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(408, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:408:8: ( 'DO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:408:9: 'DO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(408,9);
            string_literal345=(Token)match(input,168,FOLLOW_168_in_dotoken1599); 
            string_literal345_tree = (Object)adaptor.create(string_literal345);
            adaptor.addChild(root_0, string_literal345_tree);

            dbg.location(408,14);
            TOKEN346=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dotoken1601); 
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
        dbg.location(408, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dotoken");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dotoken"

    public static class dod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dod"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:411:1: dod : 'DOD' TOKEN ;
    public final ChemicalChunkerParser.dod_return dod() throws RecognitionException {
        ChemicalChunkerParser.dod_return retval = new ChemicalChunkerParser.dod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal347=null;
        Token TOKEN348=null;

        Object string_literal347_tree=null;
        Object TOKEN348_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(411, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:411:4: ( 'DOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:411:5: 'DOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(411,5);
            string_literal347=(Token)match(input,169,FOLLOW_169_in_dod1608); 
            string_literal347_tree = (Object)adaptor.create(string_literal347);
            adaptor.addChild(root_0, string_literal347_tree);

            dbg.location(411,11);
            TOKEN348=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dod1610); 
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
        dbg.location(411, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:414:1: doz : 'DOZ' TOKEN ;
    public final ChemicalChunkerParser.doz_return doz() throws RecognitionException {
        ChemicalChunkerParser.doz_return retval = new ChemicalChunkerParser.doz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal349=null;
        Token TOKEN350=null;

        Object string_literal349_tree=null;
        Object TOKEN350_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(414, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:414:4: ( 'DOZ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:414:5: 'DOZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(414,5);
            string_literal349=(Token)match(input,170,FOLLOW_170_in_doz1617); 
            string_literal349_tree = (Object)adaptor.create(string_literal349);
            adaptor.addChild(root_0, string_literal349_tree);

            dbg.location(414,11);
            TOKEN350=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_doz1619); 
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
        dbg.location(414, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "doz");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "doz"

    public static class jj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jj"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:416:1: jj : 'JJ' TOKEN ;
    public final ChemicalChunkerParser.jj_return jj() throws RecognitionException {
        ChemicalChunkerParser.jj_return retval = new ChemicalChunkerParser.jj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal351=null;
        Token TOKEN352=null;

        Object string_literal351_tree=null;
        Object TOKEN352_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(416, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:418:3: ( 'JJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:418:4: 'JJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(418,4);
            string_literal351=(Token)match(input,171,FOLLOW_171_in_jj1630); 
            string_literal351_tree = (Object)adaptor.create(string_literal351);
            adaptor.addChild(root_0, string_literal351_tree);

            dbg.location(418,9);
            TOKEN352=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jj1632); 
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
        dbg.location(418, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "jj");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "jj"

    public static class nn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nn"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:423:1: nn : 'NN' TOKEN ;
    public final ChemicalChunkerParser.nn_return nn() throws RecognitionException {
        ChemicalChunkerParser.nn_return retval = new ChemicalChunkerParser.nn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal353=null;
        Token TOKEN354=null;

        Object string_literal353_tree=null;
        Object TOKEN354_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(423, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:423:3: ( 'NN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:423:4: 'NN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(423,4);
            string_literal353=(Token)match(input,172,FOLLOW_172_in_nn1641); 
            string_literal353_tree = (Object)adaptor.create(string_literal353);
            adaptor.addChild(root_0, string_literal353_tree);

            dbg.location(423,9);
            TOKEN354=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn1643); 
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
        dbg.location(423, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nn"

    public static class nns_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nns"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:426:1: nns : 'NNS' TOKEN ;
    public final ChemicalChunkerParser.nns_return nns() throws RecognitionException {
        ChemicalChunkerParser.nns_return retval = new ChemicalChunkerParser.nns_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal355=null;
        Token TOKEN356=null;

        Object string_literal355_tree=null;
        Object TOKEN356_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(426, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:426:4: ( 'NNS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:426:5: 'NNS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(426,5);
            string_literal355=(Token)match(input,173,FOLLOW_173_in_nns1650); 
            string_literal355_tree = (Object)adaptor.create(string_literal355);
            adaptor.addChild(root_0, string_literal355_tree);

            dbg.location(426,11);
            TOKEN356=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns1652); 
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
        dbg.location(426, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nns");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nns"

    public static class rb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rb"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:429:1: rb : 'RB' TOKEN ;
    public final ChemicalChunkerParser.rb_return rb() throws RecognitionException {
        ChemicalChunkerParser.rb_return retval = new ChemicalChunkerParser.rb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal357=null;
        Token TOKEN358=null;

        Object string_literal357_tree=null;
        Object TOKEN358_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(429, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:429:3: ( 'RB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:429:4: 'RB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(429,4);
            string_literal357=(Token)match(input,174,FOLLOW_174_in_rb1659); 
            string_literal357_tree = (Object)adaptor.create(string_literal357);
            adaptor.addChild(root_0, string_literal357_tree);

            dbg.location(429,9);
            TOKEN358=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rb1661); 
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
        dbg.location(429, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rb"

    public static class to_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "to"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:433:1: to : 'TO' TOKEN ;
    public final ChemicalChunkerParser.to_return to() throws RecognitionException {
        ChemicalChunkerParser.to_return retval = new ChemicalChunkerParser.to_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal359=null;
        Token TOKEN360=null;

        Object string_literal359_tree=null;
        Object TOKEN360_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "to");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(433, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:433:3: ( 'TO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:433:4: 'TO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(433,4);
            string_literal359=(Token)match(input,175,FOLLOW_175_in_to1669); 
            string_literal359_tree = (Object)adaptor.create(string_literal359);
            adaptor.addChild(root_0, string_literal359_tree);

            dbg.location(433,9);
            TOKEN360=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_to1671); 
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
        dbg.location(433, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "to");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "to"

    public static class vbd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vbd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:437:1: vbd : 'VBD' TOKEN ;
    public final ChemicalChunkerParser.vbd_return vbd() throws RecognitionException {
        ChemicalChunkerParser.vbd_return retval = new ChemicalChunkerParser.vbd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal361=null;
        Token TOKEN362=null;

        Object string_literal361_tree=null;
        Object TOKEN362_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(437, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:437:4: ( 'VBD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr3/grammar/ChemicalChunker.g:437:5: 'VBD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(437,5);
            string_literal361=(Token)match(input,176,FOLLOW_176_in_vbd1679); 
            string_literal361_tree = (Object)adaptor.create(string_literal361);
            adaptor.addChild(root_0, string_literal361_tree);

            dbg.location(437,11);
            TOKEN362=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbd1681); 
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
        dbg.location(437, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vbd"

    // Delegated rules


 

    public static final BitSet FOLLOW_sentence_in_document135 = new BitSet(new long[]{0x0001000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_cd_in_mol144 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_nnmol_in_mol146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nounphrase_in_sentence156 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_verbphraseADD_in_sentence158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_prepphrase_in_sentence160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecules_in_nounphrase169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbd_in_verbphraseADD183 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_vbadd_in_verbphraseADD186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_in_prepphrase197 = new BitSet(new long[]{0x0001000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_molecule_in_prepphrase199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_gram210 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_nngram_in_gram212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecule_in_molecules223 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_cc_in_molecules225 = new BitSet(new long[]{0x0001000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_molecule_in_molecules227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dt_in_molecule248 = new BitSet(new long[]{0x0001000000000000L,0x0020002000000000L});
    public static final BitSet FOLLOW_oscarcm_in_molecule251 = new BitSet(new long[]{0x0001000000000000L,0x0020002000000000L});
    public static final BitSet FOLLOW_amount_in_molecule254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lrb_in_amount263 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_gram_in_amount265 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_comma_in_amount267 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_mol_in_amount270 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_rrb_in_amount272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_oscarcd279 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcd281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_oscarcj286 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcj288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_tmunicode293 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_tmunicode295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_cdunicode300 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cdunicode302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_inas309 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inas311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_inbefore316 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inbefore318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_inafter323 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inafter325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_inin330 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inin332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ininto337 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ininto339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_inwith344 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inwith346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_inwithout351 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inwithout353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_inby358 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inby360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_invia365 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_invia367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_inof372 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inof374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_inon379 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inon381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_infor386 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_infor388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_infrom393 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_infrom395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_inunder400 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inunder402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_inover407 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inover409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_inoff414 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inoff416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_nnstate423 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnstate425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_nntime430 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntime432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_nngram437 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nngram439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_nnmol444 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmol446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_nnatmosphere451 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnatmosphere453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_nneq458 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nneq460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_nnvol465 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnvol467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_nnchementity472 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnchementity474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nntemp479 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntemp481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_nnflash486 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnflash488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nngeneral493 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nngeneral495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_nnmethod500 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmethod502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_nnamount507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnamount509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_nnpressure514 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpressure516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_nncolumn521 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nncolumn523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_nnchromatography528 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnchromatography530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_nnvacuum535 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnvacuum537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_nncycle542 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nncycle544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_nntimes549 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntimes551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_oscarcm558 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcm560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_vbuse567 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbuse569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_vbchange574 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbchange576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_vbsubmerge581 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubmerge583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_vbsubject588 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubject590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_nnadd597 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnadd599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_nnmixture604 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmixture606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_vbadd611 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbadd613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_vbcharge618 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcharge620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_vbcontain625 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcontain627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_vbdrop632 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdrop634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_vbfill639 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbfill641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_vbsuspend646 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsuspend648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_vbtreat653 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbtreat655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_vbapparatus662 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbapparatus664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_nnapparatus669 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnapparatus671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_vbconcentrate678 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbconcentrate680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_nnconcentrate685 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnconcentrate687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_vbcool694 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcool696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_vbdegass703 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdegass705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_vbdissolve712 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdissolve714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_vbdry721 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdry723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_nndry728 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nndry730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_vbextract737 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbextract739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_nnextract744 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnextract746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_vbfilter753 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbfilter755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_nnfilter760 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnfilter762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_vbheat769 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbheat771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_vbincrease776 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbincrease778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_vbpartition785 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbpartition787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_vbprecipitate794 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbprecipitate796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_nnprecipitate801 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnprecipitate803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_vbpurify810 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbpurify812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_nnpurify817 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpurify819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_vbquench826 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbquench828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_vbrecover835 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbrecover837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_vbremove844 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbremove846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_nnremove851 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnremove853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_vbstir860 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbstir862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_vbsynthesize869 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsynthesize871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_nnsynthesize876 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnsynthesize878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_vbwait885 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbwait887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_vbwash894 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbwash896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_vbyield903 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbyield905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_colon912 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_colon914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_comma919 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_comma921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_apost926 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_apost928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_neg933 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_neg935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_dash940 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dash942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_stop947 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_stop949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_nnpercent954 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpercent956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_lsqb961 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_lsqb963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rsqb968 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rsqb970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_lrb975 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_lrb977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rrb982 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rrb984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_abl993 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_abl995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_abn1002 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_abn1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_abx1011 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_abx1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ap1020 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ap1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_at1029 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_at1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_be1038 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_be1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_bed1047 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_bed1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_bedz1056 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_bedz1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_beg1065 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_beg1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_bem1074 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_bem1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ben1083 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ben1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ber1092 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ber1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_bez1101 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_bez1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_cc1110 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cc1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_cd1119 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cd1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_dt1130 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dt1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_in1140 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_in1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_dti1152 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dti1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_dts1161 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dts1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_dtx1170 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dtx1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ex1179 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ex1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_fw1188 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_fw1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_hv1197 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_hv1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_hvd1206 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_hvd1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_hvg1215 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_hvg1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_hvn1224 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_hvn1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_jjr1234 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jjr1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_jjs1243 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jjs1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_jjt1252 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jjt1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_md1261 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_md1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_nc1270 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nc1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_wpdollar1279 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wpdollar1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_wpo1288 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wpo1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_wps1297 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wps1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_wql1306 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wql1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_wrb1315 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wrb1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_uh1325 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_uh1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_vb1334 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vb1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_vbg1343 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbg1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_vbn1352 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbn1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_vbz1361 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbz1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_wdt1370 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_wdt1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_rbr1380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rbr1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_rbt1389 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rbt1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_rn1398 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rn1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_rp1407 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rp1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_pn1418 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_pn1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_pndollar1427 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_pndollar1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ppdollar1436 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppdollar1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_ppdollardollar1445 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppdollardollar1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_ppl1454 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppl1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ppls1463 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppls1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ppo1472 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppo1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_pps1481 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_pps1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ppss1490 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppss1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ql1499 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ql1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_qlp1508 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_qlp1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_nndollar1518 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nndollar1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_nnsdollar1527 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnsdollar1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_np1536 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_np1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_npdollar1545 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_npdollar1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_nps1554 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nps1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_npsdollar1563 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_npsdollar1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_nr1572 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nr1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_od1581 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_od1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_cs1590 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cs1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_dotoken1599 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dotoken1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_dod1608 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dod1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_doz1617 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_doz1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_jj1630 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jj1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_nn1641 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nn1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_nns1650 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nns1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_rb1659 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rb1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_to1669 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_to1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_vbd1679 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbd1681 = new BitSet(new long[]{0x0000000000000002L});

}