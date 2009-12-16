// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g 2009-12-15 12:35:38

    package uk.ac.cam.ch.wwmm.chemicaltagger;
 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
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
        "invalidRule", "synpred117_ChemicalChunker", "synpred38_ChemicalChunker", 
        "nnconcentrate", "rbr", "synpred100_ChemicalChunker", "synpred40_ChemicalChunker", 
        "synpred1_ChemicalChunker", "vbremove", "hvd", "synpred2_ChemicalChunker", 
        "synpred19_ChemicalChunker", "synpred12_ChemicalChunker", "nntime", 
        "synpred123_ChemicalChunker", "ap", "nns_poss", "synpred112_ChemicalChunker", 
        "synpred48_ChemicalChunker", "rb", "synpred43_ChemicalChunker", 
        "vbheat", "synpred76_ChemicalChunker", "vbextract", "unnamedmoleculeamount1", 
        "synpred74_ChemicalChunker", "synpred109_ChemicalChunker", "nnextract", 
        "synpred23_ChemicalChunker", "synpred90_ChemicalChunker", "ppss", 
        "inbefore", "dotok", "cc", "synpred104_ChemicalChunker", "vbyield", 
        "amount", "synpred46_ChemicalChunker", "synpred79_ChemicalChunker", 
        "synpred63_ChemicalChunker", "beg", "synpred16_ChemicalChunker", 
        "synpred17_ChemicalChunker", "abl", "to", "vbdissolve", "nnchementity", 
        "synpred30_ChemicalChunker", "pps", "synpred101_ChemicalChunker", 
        "synpred83_ChemicalChunker", "synpred75_ChemicalChunker", "synpred7_ChemicalChunker", 
        "synpred42_ChemicalChunker", "verbphrase", "adv", "synpred54_ChemicalChunker", 
        "sym", "synpred28_ChemicalChunker", "pp_poss", "prepphraseTime", 
        "rp", "synpred44_ChemicalChunker", "synpred91_ChemicalChunker", 
        "comma", "synpred59_ChemicalChunker", "synpred32_ChemicalChunker", 
        "synpred31_ChemicalChunker", "nnchromatography", "inof", "nnvol", 
        "uh", "synpred35_ChemicalChunker", "synpred80_ChemicalChunker", 
        "synpred114_ChemicalChunker", "gram", "ql", "fw", "nnvacuum", "ber", 
        "synpred52_ChemicalChunker", "synpred14_ChemicalChunker", "adj", 
        "synpred39_ChemicalChunker", "nnmethod", "synpred86_ChemicalChunker", 
        "percent", "nns", "noun", "bem", "infor", "oscarcj", "oscaront", 
        "vbsubmerge", "nn", "synpred10_ChemicalChunker", "inAll", "rsqb", 
        "vbrecover", "synpred6_ChemicalChunker", "pn", "vbdrop", "synpred96_ChemicalChunker", 
        "synpred110_ChemicalChunker", "dts", "inoff", "wpo", "nneq", "synpred36_ChemicalChunker", 
        "synpred37_ChemicalChunker", "md", "synpred73_ChemicalChunker", 
        "synpred106_ChemicalChunker", "synpred97_ChemicalChunker", "vbsuspend", 
        "vb", "synpred71_ChemicalChunker", "nnpressure", "synpred94_ChemicalChunker", 
        "oscarcd", "synpred89_ChemicalChunker", "synpred70_ChemicalChunker", 
        "dod", "nnfilter", "synpred29_ChemicalChunker", "synpred82_ChemicalChunker", 
        "neg", "vbuse", "synpred78_ChemicalChunker", "synpred18_ChemicalChunker", 
        "synpred68_ChemicalChunker", "wql", "vbdry", "nnsynthesize", "tmunicode", 
        "doz", "hvn", "vbsubject", "vbquench", "vbwait", "synpred60_ChemicalChunker", 
        "synpred34_ChemicalChunker", "nnstate", "abn", "bed", "synpred50_ChemicalChunker", 
        "vbstir", "synpred105_ChemicalChunker", "synpred92_ChemicalChunker", 
        "np", "synpred67_ChemicalChunker", "be", "synpred47_ChemicalChunker", 
        "synpred58_ChemicalChunker", "synpred53_ChemicalChunker", "synpred116_ChemicalChunker", 
        "synpred77_ChemicalChunker", "vbn", "vbchange", "rrb", "wp_poss", 
        "volume", "nngeneral", "rbt", "inwithout", "synpred98_ChemicalChunker", 
        "synpred64_ChemicalChunker", "lsqb", "nntemp", "pn_poss", "vbfill", 
        "dash", "mmol", "stop", "abx", "vbpartition", "synpred49_ChemicalChunker", 
        "vbsynthesize", "synpred124_ChemicalChunker", "synpred66_ChemicalChunker", 
        "unnamedmoleculeamount2", "ininto", "ppl", "vbd", "vbincrease", 
        "dt", "synpred65_ChemicalChunker", "measurements", "number", "prepphraseOf", 
        "inover", "synpred102_ChemicalChunker", "lrb", "synpred95_ChemicalChunker", 
        "sentence", "synpred108_ChemicalChunker", "synpred5_ChemicalChunker", 
        "wrb", "vbpurify", "vbtreat", "synpred81_ChemicalChunker", "nnadd", 
        "infrom", "synpred88_ChemicalChunker", "nnmixture", "inwith", "inafter", 
        "inon", "inby", "synpred8_ChemicalChunker", "wdt", "vbprecipitate", 
        "cs", "synpred41_ChemicalChunker", "synpred93_ChemicalChunker", 
        "nounphrase", "oscarCompound", "vbcool", "wps", "np_poss", "prepphraseOther", 
        "nnflash", "prepphrase", "inin", "synpred22_ChemicalChunker", "invia", 
        "dtx", "synpred107_ChemicalChunker", "nncycle", "synpred111_ChemicalChunker", 
        "inas", "synpred26_ChemicalChunker", "synpred57_ChemicalChunker", 
        "synpred33_ChemicalChunker", "nnprecipitate", "synpred99_ChemicalChunker", 
        "moleculeamount", "synpred27_ChemicalChunker", "synpred122_ChemicalChunker", 
        "synpred85_ChemicalChunker", "unnamedmolecule", "od", "synpred11_ChemicalChunker", 
        "vbapparatus", "nnatmosphere", "method", "oscarcm", "vbwash", "hv", 
        "vbconcentrate", "nnremove", "nngram", "synpred55_ChemicalChunker", 
        "synpred4_ChemicalChunker", "unnamedmoleculeamount", "synpred24_ChemicalChunker", 
        "vbcharge", "nps", "synpred20_ChemicalChunker", "synpred87_ChemicalChunker", 
        "synpred113_ChemicalChunker", "cd", "jj", "moleculeamount2", "prepphraseIN", 
        "synpred62_ChemicalChunker", "synpred56_ChemicalChunker", "synpred45_ChemicalChunker", 
        "pp_poss_poss", "synpred120_ChemicalChunker", "nc", "nnpurify", 
        "nncolumn", "synpred84_ChemicalChunker", "hvg", "synpred118_ChemicalChunker", 
        "jjr", "rn", "nps_poss", "nr", "vbg", "verb", "synpred72_ChemicalChunker", 
        "nnpercent", "synpred51_ChemicalChunker", "bedz", "synpred13_ChemicalChunker", 
        "ex", "synpred119_ChemicalChunker", "ppo", "vbdegass", "molecule", 
        "ben", "synpred25_ChemicalChunker", "vbz", "nntimes", "synpred115_ChemicalChunker", 
        "inunder", "synpred69_ChemicalChunker", "mixture", "document", "apost", 
        "at", "ppls", "vbfilter", "nn_poss", "synpred21_ChemicalChunker", 
        "moleculeamount1", "synpred3_ChemicalChunker", "nnapparatus", "vbadd", 
        "jjt", "nnmol", "nnamount", "bez", "in", "synpred103_ChemicalChunker", 
        "dti", "qlp", "colon", "prepphraseTemp", "synpred9_ChemicalChunker", 
        "synpred61_ChemicalChunker", "nndry", "synpred15_ChemicalChunker", 
        "cdunicode", "vbcontain", "jjs", "synpred121_ChemicalChunker"
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
    public String getGrammarFileName() { return "C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g"; }


    public static class document_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "document"
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:29:1: document : ( sentence )+ -> ( ^( NODE[\"Sentence\"] sentence ) )+ ;
    public final ChemicalChunkerParser.document_return document() throws RecognitionException {
        ChemicalChunkerParser.document_return retval = new ChemicalChunkerParser.document_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.sentence_return sentence1 = null;


        RewriteRuleSubtreeStream stream_sentence=new RewriteRuleSubtreeStream(adaptor,"rule sentence");
        try { dbg.enterRule(getGrammarFileName(), "document");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:29:9: ( ( sentence )+ -> ( ^( NODE[\"Sentence\"] sentence ) )+ )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:29:11: ( sentence )+
            {
            dbg.location(29,11);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:29:11: ( sentence )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=10 && LA1_0<=12)||(LA1_0>=31 && LA1_0<=32)||(LA1_0>=35 && LA1_0<=36)||(LA1_0>=38 && LA1_0<=54)||(LA1_0>=56 && LA1_0<=71)||LA1_0==73||LA1_0==75||(LA1_0>=77 && LA1_0<=80)||LA1_0==82||(LA1_0>=84 && LA1_0<=86)||(LA1_0>=88 && LA1_0<=93)||LA1_0==103||LA1_0==119||LA1_0==124||(LA1_0>=135 && LA1_0<=138)||(LA1_0>=162 && LA1_0<=164)||LA1_0==168||LA1_0==171||(LA1_0>=175 && LA1_0<=178)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: sentence
            	    {
            	    dbg.location(29,11);
            	    pushFollow(FOLLOW_sentence_in_document164);
            	    sentence1=sentence();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sentence.add(sentence1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 29:21: -> ( ^( NODE[\"Sentence\"] sentence ) )+
            {
                dbg.location(29,24);
                if ( !(stream_sentence.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_sentence.hasNext() ) {
                    dbg.location(29,24);
                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:29:24: ^( NODE[\"Sentence\"] sentence )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(29,26);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "Sentence"), root_1);

                    dbg.location(29,44);
                    adaptor.addChild(root_1, stream_sentence.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_sentence.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(29, 55);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:32:1: sentence : ( nounphrase | verbphrase )+ ( comma | cc | stop )* -> ( ^( NODE[\"NounPhrase\"] nounphrase ) )* ( ^( NODE[\"VerbPhrase\"] verbphrase ) )* ;
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
        dbg.location(32, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:1: ( ( nounphrase | verbphrase )+ ( comma | cc | stop )* -> ( ^( NODE[\"NounPhrase\"] nounphrase ) )* ( ^( NODE[\"VerbPhrase\"] verbphrase ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:4: ( nounphrase | verbphrase )+ ( comma | cc | stop )*
            {
            dbg.location(33,4);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:4: ( nounphrase | verbphrase )+
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

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:5: nounphrase
            	    {
            	    dbg.location(33,5);
            	    pushFollow(FOLLOW_nounphrase_in_sentence189);
            	    nounphrase2=nounphrase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_nounphrase.add(nounphrase2.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:16: verbphrase
            	    {
            	    dbg.location(33,16);
            	    pushFollow(FOLLOW_verbphrase_in_sentence191);
            	    verbphrase3=verbphrase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_verbphrase.add(verbphrase3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(33,29);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:29: ( comma | cc | stop )*
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

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:30: comma
            	    {
            	    dbg.location(33,30);
            	    pushFollow(FOLLOW_comma_in_sentence196);
            	    comma4=comma();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_comma.add(comma4.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:36: cc
            	    {
            	    dbg.location(33,36);
            	    pushFollow(FOLLOW_cc_in_sentence198);
            	    cc5=cc();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_cc.add(cc5.getTree());

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:39: stop
            	    {
            	    dbg.location(33,39);
            	    pushFollow(FOLLOW_stop_in_sentence200);
            	    stop6=stop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stop.add(stop6.getTree());

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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 33:46: -> ( ^( NODE[\"NounPhrase\"] nounphrase ) )* ( ^( NODE[\"VerbPhrase\"] verbphrase ) )*
            {
                dbg.location(33,49);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:49: ( ^( NODE[\"NounPhrase\"] nounphrase ) )*
                while ( stream_nounphrase.hasNext() ) {
                    dbg.location(33,49);
                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:49: ^( NODE[\"NounPhrase\"] nounphrase )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(33,51);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "NounPhrase"), root_1);

                    dbg.location(33,71);
                    adaptor.addChild(root_1, stream_nounphrase.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_nounphrase.reset();
                dbg.location(33,85);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:85: ( ^( NODE[\"VerbPhrase\"] verbphrase ) )*
                while ( stream_verbphrase.hasNext() ) {
                    dbg.location(33,85);
                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:85: ^( NODE[\"VerbPhrase\"] verbphrase )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(33,87);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "VerbPhrase"), root_1);

                    dbg.location(33,107);
                    adaptor.addChild(root_1, stream_verbphrase.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_verbphrase.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(33, 119);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:37:1: nounphrase : ( dt )? ( adj )* ( noun )+ ( comma noun )* ( cc noun )* ( prepphraseOf )* ( prepphraseIN )? ;
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
        dbg.location(37, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:2: ( ( dt )? ( adj )* ( noun )+ ( comma noun )* ( cc noun )* ( prepphraseOf )* ( prepphraseIN )? )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:3: ( dt )? ( adj )* ( noun )+ ( comma noun )* ( cc noun )* ( prepphraseOf )* ( prepphraseIN )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(38,3);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:3: ( dt )?
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

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: dt
                    {
                    dbg.location(38,3);
                    pushFollow(FOLLOW_dt_in_nounphrase236);
                    dt7=dt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dt7.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(38,7);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:7: ( adj )*
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

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: adj
            	    {
            	    dbg.location(38,7);
            	    pushFollow(FOLLOW_adj_in_nounphrase239);
            	    adj8=adj();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, adj8.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(38,12);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:12: ( noun )+
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

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: noun
            	    {
            	    dbg.location(38,12);
            	    pushFollow(FOLLOW_noun_in_nounphrase242);
            	    noun9=noun();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, noun9.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt6++;
            } while (true);
            } finally {dbg.exitSubRule(6);}

            dbg.location(38,18);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:18: ( comma noun )*
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

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:19: comma noun
            	    {
            	    dbg.location(38,19);
            	    pushFollow(FOLLOW_comma_in_nounphrase246);
            	    comma10=comma();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, comma10.getTree());
            	    dbg.location(38,25);
            	    pushFollow(FOLLOW_noun_in_nounphrase248);
            	    noun11=noun();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, noun11.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(38,32);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:32: ( cc noun )*
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

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:33: cc noun
            	    {
            	    dbg.location(38,33);
            	    pushFollow(FOLLOW_cc_in_nounphrase253);
            	    cc12=cc();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cc12.getTree());
            	    dbg.location(38,36);
            	    pushFollow(FOLLOW_noun_in_nounphrase255);
            	    noun13=noun();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, noun13.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(38,43);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:43: ( prepphraseOf )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred12_ChemicalChunker()) ) {
                        alt9=1;
                    }


                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: prepphraseOf
            	    {
            	    dbg.location(38,43);
            	    pushFollow(FOLLOW_prepphraseOf_in_nounphrase259);
            	    prepphraseOf14=prepphraseOf();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prepphraseOf14.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}

            dbg.location(38,57);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:57: ( prepphraseIN )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred13_ChemicalChunker()) ) {
                    alt10=1;
                }
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: prepphraseIN
                    {
                    dbg.location(38,57);
                    pushFollow(FOLLOW_prepphraseIN_in_nounphrase262);
                    prepphraseIN15=prepphraseIN();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prepphraseIN15.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(38, 70);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:40:1: verbphrase : ( to )? ( adv )* ( vbd )* verb ( adv )* ( prepphrase )* ;
    public final ChemicalChunkerParser.verbphrase_return verbphrase() throws RecognitionException {
        ChemicalChunkerParser.verbphrase_return retval = new ChemicalChunkerParser.verbphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.to_return to16 = null;

        ChemicalChunkerParser.adv_return adv17 = null;

        ChemicalChunkerParser.vbd_return vbd18 = null;

        ChemicalChunkerParser.verb_return verb19 = null;

        ChemicalChunkerParser.adv_return adv20 = null;

        ChemicalChunkerParser.prepphrase_return prepphrase21 = null;



        try { dbg.enterRule(getGrammarFileName(), "verbphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:2: ( ( to )? ( adv )* ( vbd )* verb ( adv )* ( prepphrase )* )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:4: ( to )? ( adv )* ( vbd )* verb ( adv )* ( prepphrase )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(41,4);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:4: ( to )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==168) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: to
                    {
                    dbg.location(41,4);
                    pushFollow(FOLLOW_to_in_verbphrase276);
                    to16=to();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, to16.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(41,8);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:8: ( adv )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12);

                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=162 && LA12_0<=164)) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: adv
            	    {
            	    dbg.location(41,8);
            	    pushFollow(FOLLOW_adv_in_verbphrase279);
            	    adv17=adv();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, adv17.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(41,13);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:13: ( vbd )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==171) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: vbd
            	    {
            	    dbg.location(41,13);
            	    pushFollow(FOLLOW_vbd_in_verbphrase282);
            	    vbd18=vbd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbd18.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(41,18);
            pushFollow(FOLLOW_verb_in_verbphrase285);
            verb19=verb();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, verb19.getTree());
            dbg.location(41,23);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:23: ( adv )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                switch ( input.LA(1) ) {
                case 162:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==TOKEN) ) {
                        int LA14_5 = input.LA(3);

                        if ( (synpred17_ChemicalChunker()) ) {
                            alt14=1;
                        }


                    }


                    }
                    break;
                case 163:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (LA14_3==TOKEN) ) {
                        int LA14_6 = input.LA(3);

                        if ( (synpred17_ChemicalChunker()) ) {
                            alt14=1;
                        }


                    }


                    }
                    break;
                case 164:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (LA14_4==TOKEN) ) {
                        int LA14_7 = input.LA(3);

                        if ( (synpred17_ChemicalChunker()) ) {
                            alt14=1;
                        }


                    }


                    }
                    break;

                }

                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: adv
            	    {
            	    dbg.location(41,23);
            	    pushFollow(FOLLOW_adv_in_verbphrase287);
            	    adv20=adv();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, adv20.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}

            dbg.location(41,28);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:28: ( prepphrase )*
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

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: prepphrase
            	    {
            	    dbg.location(41,28);
            	    pushFollow(FOLLOW_prepphrase_in_verbphrase290);
            	    prepphrase21=prepphrase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prepphrase21.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(41, 39);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:43:1: verb : ( vbuse | vbchange | vbsubmerge | vbsubject | vbadd | vbcharge | vbcontain | vbdrop | vbfill | vbsuspend | vbtreat | vbapparatus | vbconcentrate | vbcool | vbdegass | vbdissolve | vbdry | vbextract | vbfilter | vbheat | vbincrease | vbpartition | vbprecipitate | vbpurify | vbquench | vbrecover | vbremove | vbstir | vbsynthesize | vbwait | vbwash | vbyield );
    public final ChemicalChunkerParser.verb_return verb() throws RecognitionException {
        ChemicalChunkerParser.verb_return retval = new ChemicalChunkerParser.verb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.vbuse_return vbuse22 = null;

        ChemicalChunkerParser.vbchange_return vbchange23 = null;

        ChemicalChunkerParser.vbsubmerge_return vbsubmerge24 = null;

        ChemicalChunkerParser.vbsubject_return vbsubject25 = null;

        ChemicalChunkerParser.vbadd_return vbadd26 = null;

        ChemicalChunkerParser.vbcharge_return vbcharge27 = null;

        ChemicalChunkerParser.vbcontain_return vbcontain28 = null;

        ChemicalChunkerParser.vbdrop_return vbdrop29 = null;

        ChemicalChunkerParser.vbfill_return vbfill30 = null;

        ChemicalChunkerParser.vbsuspend_return vbsuspend31 = null;

        ChemicalChunkerParser.vbtreat_return vbtreat32 = null;

        ChemicalChunkerParser.vbapparatus_return vbapparatus33 = null;

        ChemicalChunkerParser.vbconcentrate_return vbconcentrate34 = null;

        ChemicalChunkerParser.vbcool_return vbcool35 = null;

        ChemicalChunkerParser.vbdegass_return vbdegass36 = null;

        ChemicalChunkerParser.vbdissolve_return vbdissolve37 = null;

        ChemicalChunkerParser.vbdry_return vbdry38 = null;

        ChemicalChunkerParser.vbextract_return vbextract39 = null;

        ChemicalChunkerParser.vbfilter_return vbfilter40 = null;

        ChemicalChunkerParser.vbheat_return vbheat41 = null;

        ChemicalChunkerParser.vbincrease_return vbincrease42 = null;

        ChemicalChunkerParser.vbpartition_return vbpartition43 = null;

        ChemicalChunkerParser.vbprecipitate_return vbprecipitate44 = null;

        ChemicalChunkerParser.vbpurify_return vbpurify45 = null;

        ChemicalChunkerParser.vbquench_return vbquench46 = null;

        ChemicalChunkerParser.vbrecover_return vbrecover47 = null;

        ChemicalChunkerParser.vbremove_return vbremove48 = null;

        ChemicalChunkerParser.vbstir_return vbstir49 = null;

        ChemicalChunkerParser.vbsynthesize_return vbsynthesize50 = null;

        ChemicalChunkerParser.vbwait_return vbwait51 = null;

        ChemicalChunkerParser.vbwash_return vbwash52 = null;

        ChemicalChunkerParser.vbyield_return vbyield53 = null;



        try { dbg.enterRule(getGrammarFileName(), "verb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:44:2: ( vbuse | vbchange | vbsubmerge | vbsubject | vbadd | vbcharge | vbcontain | vbdrop | vbfill | vbsuspend | vbtreat | vbapparatus | vbconcentrate | vbcool | vbdegass | vbdissolve | vbdry | vbextract | vbfilter | vbheat | vbincrease | vbpartition | vbprecipitate | vbpurify | vbquench | vbrecover | vbremove | vbstir | vbsynthesize | vbwait | vbwash | vbyield )
            int alt16=32;
            try { dbg.enterDecision(16);

            switch ( input.LA(1) ) {
            case 51:
                {
                alt16=1;
                }
                break;
            case 52:
                {
                alt16=2;
                }
                break;
            case 53:
                {
                alt16=3;
                }
                break;
            case 54:
                {
                alt16=4;
                }
                break;
            case 57:
                {
                alt16=5;
                }
                break;
            case 58:
                {
                alt16=6;
                }
                break;
            case 59:
                {
                alt16=7;
                }
                break;
            case 60:
                {
                alt16=8;
                }
                break;
            case 61:
                {
                alt16=9;
                }
                break;
            case 62:
                {
                alt16=10;
                }
                break;
            case 63:
                {
                alt16=11;
                }
                break;
            case 64:
                {
                alt16=12;
                }
                break;
            case 66:
                {
                alt16=13;
                }
                break;
            case 68:
                {
                alt16=14;
                }
                break;
            case 69:
                {
                alt16=15;
                }
                break;
            case 70:
                {
                alt16=16;
                }
                break;
            case 71:
                {
                alt16=17;
                }
                break;
            case 73:
                {
                alt16=18;
                }
                break;
            case 75:
                {
                alt16=19;
                }
                break;
            case 77:
                {
                alt16=20;
                }
                break;
            case 78:
                {
                alt16=21;
                }
                break;
            case 79:
                {
                alt16=22;
                }
                break;
            case 80:
                {
                alt16=23;
                }
                break;
            case 82:
                {
                alt16=24;
                }
                break;
            case 84:
                {
                alt16=25;
                }
                break;
            case 85:
                {
                alt16=26;
                }
                break;
            case 86:
                {
                alt16=27;
                }
                break;
            case 88:
                {
                alt16=28;
                }
                break;
            case 89:
                {
                alt16=29;
                }
                break;
            case 91:
                {
                alt16=30;
                }
                break;
            case 92:
                {
                alt16=31;
                }
                break;
            case 93:
                {
                alt16=32;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:2: vbuse
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,2);
                    pushFollow(FOLLOW_vbuse_in_verb301);
                    vbuse22=vbuse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbuse22.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:8: vbchange
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,8);
                    pushFollow(FOLLOW_vbchange_in_verb303);
                    vbchange23=vbchange();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbchange23.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:17: vbsubmerge
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,17);
                    pushFollow(FOLLOW_vbsubmerge_in_verb305);
                    vbsubmerge24=vbsubmerge();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbsubmerge24.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:28: vbsubject
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,28);
                    pushFollow(FOLLOW_vbsubject_in_verb307);
                    vbsubject25=vbsubject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbsubject25.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:38: vbadd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,38);
                    pushFollow(FOLLOW_vbadd_in_verb309);
                    vbadd26=vbadd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbadd26.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:44: vbcharge
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,44);
                    pushFollow(FOLLOW_vbcharge_in_verb311);
                    vbcharge27=vbcharge();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbcharge27.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:53: vbcontain
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,53);
                    pushFollow(FOLLOW_vbcontain_in_verb313);
                    vbcontain28=vbcontain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbcontain28.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:63: vbdrop
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,63);
                    pushFollow(FOLLOW_vbdrop_in_verb315);
                    vbdrop29=vbdrop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbdrop29.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:70: vbfill
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,70);
                    pushFollow(FOLLOW_vbfill_in_verb317);
                    vbfill30=vbfill();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbfill30.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:77: vbsuspend
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,77);
                    pushFollow(FOLLOW_vbsuspend_in_verb319);
                    vbsuspend31=vbsuspend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbsuspend31.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:87: vbtreat
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,87);
                    pushFollow(FOLLOW_vbtreat_in_verb321);
                    vbtreat32=vbtreat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbtreat32.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:95: vbapparatus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,95);
                    pushFollow(FOLLOW_vbapparatus_in_verb323);
                    vbapparatus33=vbapparatus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbapparatus33.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:107: vbconcentrate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,107);
                    pushFollow(FOLLOW_vbconcentrate_in_verb325);
                    vbconcentrate34=vbconcentrate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbconcentrate34.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:121: vbcool
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,121);
                    pushFollow(FOLLOW_vbcool_in_verb327);
                    vbcool35=vbcool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbcool35.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:128: vbdegass
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,128);
                    pushFollow(FOLLOW_vbdegass_in_verb329);
                    vbdegass36=vbdegass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbdegass36.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:137: vbdissolve
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,137);
                    pushFollow(FOLLOW_vbdissolve_in_verb331);
                    vbdissolve37=vbdissolve();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbdissolve37.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:148: vbdry
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,148);
                    pushFollow(FOLLOW_vbdry_in_verb333);
                    vbdry38=vbdry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbdry38.getTree());

                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:154: vbextract
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,154);
                    pushFollow(FOLLOW_vbextract_in_verb335);
                    vbextract39=vbextract();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbextract39.getTree());

                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:45:164: vbfilter
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(45,164);
                    pushFollow(FOLLOW_vbfilter_in_verb337);
                    vbfilter40=vbfilter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbfilter40.getTree());

                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:3: vbheat
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,3);
                    pushFollow(FOLLOW_vbheat_in_verb341);
                    vbheat41=vbheat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbheat41.getTree());

                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:10: vbincrease
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,10);
                    pushFollow(FOLLOW_vbincrease_in_verb343);
                    vbincrease42=vbincrease();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbincrease42.getTree());

                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:21: vbpartition
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,21);
                    pushFollow(FOLLOW_vbpartition_in_verb345);
                    vbpartition43=vbpartition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbpartition43.getTree());

                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:33: vbprecipitate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,33);
                    pushFollow(FOLLOW_vbprecipitate_in_verb347);
                    vbprecipitate44=vbprecipitate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbprecipitate44.getTree());

                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:47: vbpurify
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,47);
                    pushFollow(FOLLOW_vbpurify_in_verb349);
                    vbpurify45=vbpurify();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbpurify45.getTree());

                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:56: vbquench
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,56);
                    pushFollow(FOLLOW_vbquench_in_verb351);
                    vbquench46=vbquench();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbquench46.getTree());

                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:65: vbrecover
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,65);
                    pushFollow(FOLLOW_vbrecover_in_verb353);
                    vbrecover47=vbrecover();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbrecover47.getTree());

                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:75: vbremove
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,75);
                    pushFollow(FOLLOW_vbremove_in_verb355);
                    vbremove48=vbremove();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbremove48.getTree());

                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:84: vbstir
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,84);
                    pushFollow(FOLLOW_vbstir_in_verb357);
                    vbstir49=vbstir();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbstir49.getTree());

                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:91: vbsynthesize
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,91);
                    pushFollow(FOLLOW_vbsynthesize_in_verb359);
                    vbsynthesize50=vbsynthesize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbsynthesize50.getTree());

                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:104: vbwait
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,104);
                    pushFollow(FOLLOW_vbwait_in_verb361);
                    vbwait51=vbwait();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbwait51.getTree());

                    }
                    break;
                case 31 :
                    dbg.enterAlt(31);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:111: vbwash
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,111);
                    pushFollow(FOLLOW_vbwash_in_verb363);
                    vbwash52=vbwash();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbwash52.getTree());

                    }
                    break;
                case 32 :
                    dbg.enterAlt(32);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:46:118: vbyield
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(46,118);
                    pushFollow(FOLLOW_vbyield_in_verb365);
                    vbyield53=vbyield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vbyield53.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(46, 125);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:47:1: number : ( cd | oscarcd );
    public final ChemicalChunkerParser.number_return number() throws RecognitionException {
        ChemicalChunkerParser.number_return retval = new ChemicalChunkerParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd54 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd55 = null;



        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:48:2: ( cd | oscarcd )
            int alt17=2;
            try { dbg.enterDecision(17);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==119) ) {
                alt17=1;
            }
            else if ( (LA17_0==10) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:48:4: cd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,4);
                    pushFollow(FOLLOW_cd_in_number384);
                    cd54=cd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cd54.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:48:7: oscarcd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(48,7);
                    pushFollow(FOLLOW_oscarcd_in_number386);
                    oscarcd55=oscarcd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oscarcd55.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(48, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:49:1: noun : ( unnamedmolecule | molecule | nnstate | nntime | nnatmosphere | nneq | nnchementity | nntemp | nnflash | nngeneral | nnmethod | nnamount | nnpressure | nncolumn | nnchromatography | nnvacuum | nncycle | nntimes | nnapparatus | nnconcentrate | wdt | wp_poss | wpo | wps | nnsynthesize | oscaront | nnmixture | mixture | amount | cd );
    public final ChemicalChunkerParser.noun_return noun() throws RecognitionException {
        ChemicalChunkerParser.noun_return retval = new ChemicalChunkerParser.noun_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.unnamedmolecule_return unnamedmolecule56 = null;

        ChemicalChunkerParser.molecule_return molecule57 = null;

        ChemicalChunkerParser.nnstate_return nnstate58 = null;

        ChemicalChunkerParser.nntime_return nntime59 = null;

        ChemicalChunkerParser.nnatmosphere_return nnatmosphere60 = null;

        ChemicalChunkerParser.nneq_return nneq61 = null;

        ChemicalChunkerParser.nnchementity_return nnchementity62 = null;

        ChemicalChunkerParser.nntemp_return nntemp63 = null;

        ChemicalChunkerParser.nnflash_return nnflash64 = null;

        ChemicalChunkerParser.nngeneral_return nngeneral65 = null;

        ChemicalChunkerParser.nnmethod_return nnmethod66 = null;

        ChemicalChunkerParser.nnamount_return nnamount67 = null;

        ChemicalChunkerParser.nnpressure_return nnpressure68 = null;

        ChemicalChunkerParser.nncolumn_return nncolumn69 = null;

        ChemicalChunkerParser.nnchromatography_return nnchromatography70 = null;

        ChemicalChunkerParser.nnvacuum_return nnvacuum71 = null;

        ChemicalChunkerParser.nncycle_return nncycle72 = null;

        ChemicalChunkerParser.nntimes_return nntimes73 = null;

        ChemicalChunkerParser.nnapparatus_return nnapparatus74 = null;

        ChemicalChunkerParser.nnconcentrate_return nnconcentrate75 = null;

        ChemicalChunkerParser.wdt_return wdt76 = null;

        ChemicalChunkerParser.wp_poss_return wp_poss77 = null;

        ChemicalChunkerParser.wpo_return wpo78 = null;

        ChemicalChunkerParser.wps_return wps79 = null;

        ChemicalChunkerParser.nnsynthesize_return nnsynthesize80 = null;

        ChemicalChunkerParser.oscaront_return oscaront81 = null;

        ChemicalChunkerParser.nnmixture_return nnmixture82 = null;

        ChemicalChunkerParser.mixture_return mixture83 = null;

        ChemicalChunkerParser.amount_return amount84 = null;

        ChemicalChunkerParser.cd_return cd85 = null;



        try { dbg.enterRule(getGrammarFileName(), "noun");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:49:6: ( unnamedmolecule | molecule | nnstate | nntime | nnatmosphere | nneq | nnchementity | nntemp | nnflash | nngeneral | nnmethod | nnamount | nnpressure | nncolumn | nnchromatography | nnvacuum | nncycle | nntimes | nnapparatus | nnconcentrate | wdt | wp_poss | wpo | wps | nnsynthesize | oscaront | nnmixture | mixture | amount | cd )
            int alt18=30;
            try { dbg.enterDecision(18);

            try {
                isCyclicDecision = true;
                alt18 = dfa18.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:1: unnamedmolecule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,1);
                    pushFollow(FOLLOW_unnamedmolecule_in_noun395);
                    unnamedmolecule56=unnamedmolecule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unnamedmolecule56.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:17: molecule
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,17);
                    pushFollow(FOLLOW_molecule_in_noun397);
                    molecule57=molecule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, molecule57.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:26: nnstate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,26);
                    pushFollow(FOLLOW_nnstate_in_noun399);
                    nnstate58=nnstate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnstate58.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:34: nntime
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,34);
                    pushFollow(FOLLOW_nntime_in_noun401);
                    nntime59=nntime();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nntime59.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:41: nnatmosphere
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,41);
                    pushFollow(FOLLOW_nnatmosphere_in_noun403);
                    nnatmosphere60=nnatmosphere();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnatmosphere60.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:54: nneq
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,54);
                    pushFollow(FOLLOW_nneq_in_noun405);
                    nneq61=nneq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nneq61.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:59: nnchementity
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,59);
                    pushFollow(FOLLOW_nnchementity_in_noun407);
                    nnchementity62=nnchementity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnchementity62.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:72: nntemp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,72);
                    pushFollow(FOLLOW_nntemp_in_noun409);
                    nntemp63=nntemp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nntemp63.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:79: nnflash
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,79);
                    pushFollow(FOLLOW_nnflash_in_noun411);
                    nnflash64=nnflash();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnflash64.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:87: nngeneral
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,87);
                    pushFollow(FOLLOW_nngeneral_in_noun413);
                    nngeneral65=nngeneral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nngeneral65.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:97: nnmethod
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,97);
                    pushFollow(FOLLOW_nnmethod_in_noun415);
                    nnmethod66=nnmethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnmethod66.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:106: nnamount
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,106);
                    pushFollow(FOLLOW_nnamount_in_noun417);
                    nnamount67=nnamount();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnamount67.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:115: nnpressure
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,115);
                    pushFollow(FOLLOW_nnpressure_in_noun419);
                    nnpressure68=nnpressure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnpressure68.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:126: nncolumn
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,126);
                    pushFollow(FOLLOW_nncolumn_in_noun421);
                    nncolumn69=nncolumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nncolumn69.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:135: nnchromatography
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,135);
                    pushFollow(FOLLOW_nnchromatography_in_noun423);
                    nnchromatography70=nnchromatography();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnchromatography70.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:152: nnvacuum
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,152);
                    pushFollow(FOLLOW_nnvacuum_in_noun425);
                    nnvacuum71=nnvacuum();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnvacuum71.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:161: nncycle
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,161);
                    pushFollow(FOLLOW_nncycle_in_noun427);
                    nncycle72=nncycle();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nncycle72.getTree());

                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:169: nntimes
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,169);
                    pushFollow(FOLLOW_nntimes_in_noun429);
                    nntimes73=nntimes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nntimes73.getTree());

                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:50:177: nnapparatus
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(50,177);
                    pushFollow(FOLLOW_nnapparatus_in_noun431);
                    nnapparatus74=nnapparatus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnapparatus74.getTree());

                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:1: nnconcentrate
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,1);
                    pushFollow(FOLLOW_nnconcentrate_in_noun434);
                    nnconcentrate75=nnconcentrate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnconcentrate75.getTree());

                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:15: wdt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,15);
                    pushFollow(FOLLOW_wdt_in_noun436);
                    wdt76=wdt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, wdt76.getTree());

                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:19: wp_poss
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,19);
                    pushFollow(FOLLOW_wp_poss_in_noun438);
                    wp_poss77=wp_poss();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, wp_poss77.getTree());

                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:27: wpo
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,27);
                    pushFollow(FOLLOW_wpo_in_noun440);
                    wpo78=wpo();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, wpo78.getTree());

                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:31: wps
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,31);
                    pushFollow(FOLLOW_wps_in_noun442);
                    wps79=wps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, wps79.getTree());

                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:35: nnsynthesize
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,35);
                    pushFollow(FOLLOW_nnsynthesize_in_noun444);
                    nnsynthesize80=nnsynthesize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnsynthesize80.getTree());

                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:48: oscaront
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,48);
                    pushFollow(FOLLOW_oscaront_in_noun446);
                    oscaront81=oscaront();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oscaront81.getTree());

                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:57: nnmixture
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,57);
                    pushFollow(FOLLOW_nnmixture_in_noun448);
                    nnmixture82=nnmixture();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nnmixture82.getTree());

                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:67: mixture
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,67);
                    pushFollow(FOLLOW_mixture_in_noun450);
                    mixture83=mixture();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixture83.getTree());

                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:75: amount
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,75);
                    pushFollow(FOLLOW_amount_in_noun452);
                    amount84=amount();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, amount84.getTree());

                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:51:82: cd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,82);
                    pushFollow(FOLLOW_cd_in_noun454);
                    cd85=cd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cd85.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(51, 84);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:52:1: mixture : lrb oscarCompound dash oscarCompound sym cd rrb ;
    public final ChemicalChunkerParser.mixture_return mixture() throws RecognitionException {
        ChemicalChunkerParser.mixture_return retval = new ChemicalChunkerParser.mixture_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.lrb_return lrb86 = null;

        ChemicalChunkerParser.oscarCompound_return oscarCompound87 = null;

        ChemicalChunkerParser.dash_return dash88 = null;

        ChemicalChunkerParser.oscarCompound_return oscarCompound89 = null;

        ChemicalChunkerParser.sym_return sym90 = null;

        ChemicalChunkerParser.cd_return cd91 = null;

        ChemicalChunkerParser.rrb_return rrb92 = null;



        try { dbg.enterRule(getGrammarFileName(), "mixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:52:9: ( lrb oscarCompound dash oscarCompound sym cd rrb )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:52:12: lrb oscarCompound dash oscarCompound sym cd rrb
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(52,12);
            pushFollow(FOLLOW_lrb_in_mixture462);
            lrb86=lrb();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lrb86.getTree());
            dbg.location(52,16);
            pushFollow(FOLLOW_oscarCompound_in_mixture464);
            oscarCompound87=oscarCompound();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oscarCompound87.getTree());
            dbg.location(52,30);
            pushFollow(FOLLOW_dash_in_mixture466);
            dash88=dash();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dash88.getTree());
            dbg.location(52,35);
            pushFollow(FOLLOW_oscarCompound_in_mixture468);
            oscarCompound89=oscarCompound();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oscarCompound89.getTree());
            dbg.location(52,49);
            pushFollow(FOLLOW_sym_in_mixture470);
            sym90=sym();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sym90.getTree());
            dbg.location(52,53);
            pushFollow(FOLLOW_cd_in_mixture472);
            cd91=cd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cd91.getTree());
            dbg.location(52,56);
            pushFollow(FOLLOW_rrb_in_mixture474);
            rrb92=rrb();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rrb92.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(52, 59);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:55:1: adj : ( jj | jjr | jjs | jjt | oscarcj );
    public final ChemicalChunkerParser.adj_return adj() throws RecognitionException {
        ChemicalChunkerParser.adj_return retval = new ChemicalChunkerParser.adj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.jj_return jj93 = null;

        ChemicalChunkerParser.jjr_return jjr94 = null;

        ChemicalChunkerParser.jjs_return jjs95 = null;

        ChemicalChunkerParser.jjt_return jjt96 = null;

        ChemicalChunkerParser.oscarcj_return oscarcj97 = null;



        try { dbg.enterRule(getGrammarFileName(), "adj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:55:5: ( jj | jjr | jjs | jjt | oscarcj )
            int alt19=5;
            try { dbg.enterDecision(19);

            switch ( input.LA(1) ) {
            case 135:
                {
                alt19=1;
                }
                break;
            case 136:
                {
                alt19=2;
                }
                break;
            case 137:
                {
                alt19=3;
                }
                break;
            case 138:
                {
                alt19=4;
                }
                break;
            case 11:
                {
                alt19=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:55:7: jj
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(55,7);
                    pushFollow(FOLLOW_jj_in_adj484);
                    jj93=jj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jj93.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:55:10: jjr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(55,10);
                    pushFollow(FOLLOW_jjr_in_adj486);
                    jjr94=jjr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jjr94.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:55:14: jjs
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(55,14);
                    pushFollow(FOLLOW_jjs_in_adj488);
                    jjs95=jjs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jjs95.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:55:18: jjt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(55,18);
                    pushFollow(FOLLOW_jjt_in_adj490);
                    jjt96=jjt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jjt96.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:55:22: oscarcj
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(55,22);
                    pushFollow(FOLLOW_oscarcj_in_adj492);
                    oscarcj97=oscarcj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oscarcj97.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(55, 29);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:57:1: adv : ( rb | rbr | rbt );
    public final ChemicalChunkerParser.adv_return adv() throws RecognitionException {
        ChemicalChunkerParser.adv_return retval = new ChemicalChunkerParser.adv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.rb_return rb98 = null;

        ChemicalChunkerParser.rbr_return rbr99 = null;

        ChemicalChunkerParser.rbt_return rbt100 = null;



        try { dbg.enterRule(getGrammarFileName(), "adv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:57:5: ( rb | rbr | rbt )
            int alt20=3;
            try { dbg.enterDecision(20);

            switch ( input.LA(1) ) {
            case 162:
                {
                alt20=1;
                }
                break;
            case 163:
                {
                alt20=2;
                }
                break;
            case 164:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:57:7: rb
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,7);
                    pushFollow(FOLLOW_rb_in_adv500);
                    rb98=rb();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rb98.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:57:10: rbr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,10);
                    pushFollow(FOLLOW_rbr_in_adv502);
                    rbr99=rbr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rbr99.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:57:14: rbt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,14);
                    pushFollow(FOLLOW_rbt_in_adv504);
                    rbt100=rbt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rbt100.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(57, 17);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:59:1: prepphrase : ( prepphraseOther | prepphraseTemp | prepphraseTime );
    public final ChemicalChunkerParser.prepphrase_return prepphrase() throws RecognitionException {
        ChemicalChunkerParser.prepphrase_return retval = new ChemicalChunkerParser.prepphrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.prepphraseOther_return prepphraseOther101 = null;

        ChemicalChunkerParser.prepphraseTemp_return prepphraseTemp102 = null;

        ChemicalChunkerParser.prepphraseTime_return prepphraseTime103 = null;



        try { dbg.enterRule(getGrammarFileName(), "prepphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:60:2: ( prepphraseOther | prepphraseTemp | prepphraseTime )
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

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:60:5: prepphraseOther
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(60,5);
                    pushFollow(FOLLOW_prepphraseOther_in_prepphrase515);
                    prepphraseOther101=prepphraseOther();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prepphraseOther101.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:60:21: prepphraseTemp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(60,21);
                    pushFollow(FOLLOW_prepphraseTemp_in_prepphrase517);
                    prepphraseTemp102=prepphraseTemp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prepphraseTemp102.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:60:36: prepphraseTime
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(60,36);
                    pushFollow(FOLLOW_prepphraseTime_in_prepphrase519);
                    prepphraseTime103=prepphraseTime();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prepphraseTime103.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(60, 52);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:62:2: prepphraseOther : ( inAll )+ nounphrase -> ^( NODE[\"PrepPhrase\"] inAll nounphrase ) ;
    public final ChemicalChunkerParser.prepphraseOther_return prepphraseOther() throws RecognitionException {
        ChemicalChunkerParser.prepphraseOther_return retval = new ChemicalChunkerParser.prepphraseOther_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll104 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase105 = null;


        RewriteRuleSubtreeStream stream_nounphrase=new RewriteRuleSubtreeStream(adaptor,"rule nounphrase");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseOther");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 2);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:63:2: ( ( inAll )+ nounphrase -> ^( NODE[\"PrepPhrase\"] inAll nounphrase ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:63:4: ( inAll )+ nounphrase
            {
            dbg.location(63,4);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:63:4: ( inAll )+
            int cnt22=0;
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22);

                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=15 && LA22_0<=30)||LA22_0==134||LA22_0==168) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: inAll
            	    {
            	    dbg.location(63,4);
            	    pushFollow(FOLLOW_inAll_in_prepphraseOther531);
            	    inAll104=inAll();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inAll.add(inAll104.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt22++;
            } while (true);
            } finally {dbg.exitSubRule(22);}

            dbg.location(63,12);
            pushFollow(FOLLOW_nounphrase_in_prepphraseOther535);
            nounphrase105=nounphrase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nounphrase.add(nounphrase105.getTree());


            // AST REWRITE
            // elements: inAll, nounphrase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:23: -> ^( NODE[\"PrepPhrase\"] inAll nounphrase )
            {
                dbg.location(63,27);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:63:27: ^( NODE[\"PrepPhrase\"] inAll nounphrase )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(63,29);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PrepPhrase"), root_1);

                dbg.location(63,49);
                adaptor.addChild(root_1, stream_inAll.nextTree());
                dbg.location(63,56);
                adaptor.addChild(root_1, stream_nounphrase.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(63, 67);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:64:1: prepphraseOf : inof nounphrase -> ^( NODE[\"PrepPhrase\"] inof nounphrase ) ;
    public final ChemicalChunkerParser.prepphraseOf_return prepphraseOf() throws RecognitionException {
        ChemicalChunkerParser.prepphraseOf_return retval = new ChemicalChunkerParser.prepphraseOf_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inof_return inof106 = null;

        ChemicalChunkerParser.nounphrase_return nounphrase107 = null;


        RewriteRuleSubtreeStream stream_nounphrase=new RewriteRuleSubtreeStream(adaptor,"rule nounphrase");
        RewriteRuleSubtreeStream stream_inof=new RewriteRuleSubtreeStream(adaptor,"rule inof");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseOf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:65:2: ( inof nounphrase -> ^( NODE[\"PrepPhrase\"] inof nounphrase ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:65:4: inof nounphrase
            {
            dbg.location(65,4);
            pushFollow(FOLLOW_inof_in_prepphraseOf558);
            inof106=inof();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inof.add(inof106.getTree());
            dbg.location(65,10);
            pushFollow(FOLLOW_nounphrase_in_prepphraseOf561);
            nounphrase107=nounphrase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nounphrase.add(nounphrase107.getTree());


            // AST REWRITE
            // elements: inof, nounphrase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:20: -> ^( NODE[\"PrepPhrase\"] inof nounphrase )
            {
                dbg.location(65,24);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:65:24: ^( NODE[\"PrepPhrase\"] inof nounphrase )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(65,26);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PrepPhrase"), root_1);

                dbg.location(65,46);
                adaptor.addChild(root_1, stream_inof.nextTree());
                dbg.location(65,52);
                adaptor.addChild(root_1, stream_nounphrase.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(65, 63);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:67:1: prepphraseIN : inin molecule -> ^( NODE[\"INMolecule\"] inin molecule ) ;
    public final ChemicalChunkerParser.prepphraseIN_return prepphraseIN() throws RecognitionException {
        ChemicalChunkerParser.prepphraseIN_return retval = new ChemicalChunkerParser.prepphraseIN_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inin_return inin108 = null;

        ChemicalChunkerParser.molecule_return molecule109 = null;


        RewriteRuleSubtreeStream stream_inin=new RewriteRuleSubtreeStream(adaptor,"rule inin");
        RewriteRuleSubtreeStream stream_molecule=new RewriteRuleSubtreeStream(adaptor,"rule molecule");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseIN");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:68:2: ( inin molecule -> ^( NODE[\"INMolecule\"] inin molecule ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:68:5: inin molecule
            {
            dbg.location(68,5);
            pushFollow(FOLLOW_inin_in_prepphraseIN585);
            inin108=inin();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inin.add(inin108.getTree());
            dbg.location(68,10);
            pushFollow(FOLLOW_molecule_in_prepphraseIN587);
            molecule109=molecule();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_molecule.add(molecule109.getTree());


            // AST REWRITE
            // elements: molecule, inin
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:19: -> ^( NODE[\"INMolecule\"] inin molecule )
            {
                dbg.location(68,23);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:68:23: ^( NODE[\"INMolecule\"] inin molecule )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(68,25);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "INMolecule"), root_1);

                dbg.location(68,45);
                adaptor.addChild(root_1, stream_inin.nextTree());
                dbg.location(68,51);
                adaptor.addChild(root_1, stream_molecule.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(68, 60);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:71:1: prepphraseTime : ( inAll )? ( dt )? ( jj )? cd nntime -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime ) ;
    public final ChemicalChunkerParser.prepphraseTime_return prepphraseTime() throws RecognitionException {
        ChemicalChunkerParser.prepphraseTime_return retval = new ChemicalChunkerParser.prepphraseTime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll110 = null;

        ChemicalChunkerParser.dt_return dt111 = null;

        ChemicalChunkerParser.jj_return jj112 = null;

        ChemicalChunkerParser.cd_return cd113 = null;

        ChemicalChunkerParser.nntime_return nntime114 = null;


        RewriteRuleSubtreeStream stream_dt=new RewriteRuleSubtreeStream(adaptor,"rule dt");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        RewriteRuleSubtreeStream stream_nntime=new RewriteRuleSubtreeStream(adaptor,"rule nntime");
        RewriteRuleSubtreeStream stream_jj=new RewriteRuleSubtreeStream(adaptor,"rule jj");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseTime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:71:15: ( ( inAll )? ( dt )? ( jj )? cd nntime -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:72:2: ( inAll )? ( dt )? ( jj )? cd nntime
            {
            dbg.location(72,2);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:72:2: ( inAll )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=15 && LA23_0<=30)||LA23_0==134||LA23_0==168) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: inAll
                    {
                    dbg.location(72,2);
                    pushFollow(FOLLOW_inAll_in_prepphraseTime611);
                    inAll110=inAll();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inAll.add(inAll110.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

            dbg.location(72,9);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:72:9: ( dt )?
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

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: dt
                    {
                    dbg.location(72,9);
                    pushFollow(FOLLOW_dt_in_prepphraseTime614);
                    dt111=dt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dt.add(dt111.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(72,13);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:72:13: ( jj )?
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

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: jj
                    {
                    dbg.location(72,13);
                    pushFollow(FOLLOW_jj_in_prepphraseTime617);
                    jj112=jj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_jj.add(jj112.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(72,17);
            pushFollow(FOLLOW_cd_in_prepphraseTime620);
            cd113=cd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cd.add(cd113.getTree());
            dbg.location(72,20);
            pushFollow(FOLLOW_nntime_in_prepphraseTime622);
            nntime114=nntime();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nntime.add(nntime114.getTree());


            // AST REWRITE
            // elements: inAll, cd, jj, nntime, dt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 72:27: -> ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime )
            {
                dbg.location(72,31);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:72:31: ^( NODE[\"TimePhrase\"] ( inAll )? ( dt )? ( jj )? cd nntime )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(72,33);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "TimePhrase"), root_1);

                dbg.location(72,53);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:72:53: ( inAll )?
                if ( stream_inAll.hasNext() ) {
                    dbg.location(72,53);
                    adaptor.addChild(root_1, stream_inAll.nextTree());

                }
                stream_inAll.reset();
                dbg.location(72,60);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:72:60: ( dt )?
                if ( stream_dt.hasNext() ) {
                    dbg.location(72,60);
                    adaptor.addChild(root_1, stream_dt.nextTree());

                }
                stream_dt.reset();
                dbg.location(72,64);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:72:64: ( jj )?
                if ( stream_jj.hasNext() ) {
                    dbg.location(72,64);
                    adaptor.addChild(root_1, stream_jj.nextTree());

                }
                stream_jj.reset();
                dbg.location(72,68);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(72,71);
                adaptor.addChild(root_1, stream_nntime.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(72, 78);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:74:1: prepphraseTemp : ( inAll )? ( dt )? ( jj )? cd nntemp -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp ) ;
    public final ChemicalChunkerParser.prepphraseTemp_return prepphraseTemp() throws RecognitionException {
        ChemicalChunkerParser.prepphraseTemp_return retval = new ChemicalChunkerParser.prepphraseTemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.inAll_return inAll115 = null;

        ChemicalChunkerParser.dt_return dt116 = null;

        ChemicalChunkerParser.jj_return jj117 = null;

        ChemicalChunkerParser.cd_return cd118 = null;

        ChemicalChunkerParser.nntemp_return nntemp119 = null;


        RewriteRuleSubtreeStream stream_dt=new RewriteRuleSubtreeStream(adaptor,"rule dt");
        RewriteRuleSubtreeStream stream_inAll=new RewriteRuleSubtreeStream(adaptor,"rule inAll");
        RewriteRuleSubtreeStream stream_nntemp=new RewriteRuleSubtreeStream(adaptor,"rule nntemp");
        RewriteRuleSubtreeStream stream_jj=new RewriteRuleSubtreeStream(adaptor,"rule jj");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "prepphraseTemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:74:15: ( ( inAll )? ( dt )? ( jj )? cd nntemp -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:75:2: ( inAll )? ( dt )? ( jj )? cd nntemp
            {
            dbg.location(75,2);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:75:2: ( inAll )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=15 && LA26_0<=30)||LA26_0==134||LA26_0==168) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: inAll
                    {
                    dbg.location(75,2);
                    pushFollow(FOLLOW_inAll_in_prepphraseTemp652);
                    inAll115=inAll();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inAll.add(inAll115.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(75,9);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:75:9: ( dt )?
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

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: dt
                    {
                    dbg.location(75,9);
                    pushFollow(FOLLOW_dt_in_prepphraseTemp655);
                    dt116=dt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dt.add(dt116.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(75,13);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:75:13: ( jj )?
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

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: jj
                    {
                    dbg.location(75,13);
                    pushFollow(FOLLOW_jj_in_prepphraseTemp658);
                    jj117=jj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_jj.add(jj117.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(28);}

            dbg.location(75,17);
            pushFollow(FOLLOW_cd_in_prepphraseTemp661);
            cd118=cd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cd.add(cd118.getTree());
            dbg.location(75,20);
            pushFollow(FOLLOW_nntemp_in_prepphraseTemp663);
            nntemp119=nntemp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nntemp.add(nntemp119.getTree());


            // AST REWRITE
            // elements: cd, jj, dt, nntemp, inAll
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 75:27: -> ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp )
            {
                dbg.location(75,31);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:75:31: ^( NODE[\"TempPhrase\"] ( inAll )? ( dt )? ( jj )? cd nntemp )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(75,33);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "TempPhrase"), root_1);

                dbg.location(75,53);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:75:53: ( inAll )?
                if ( stream_inAll.hasNext() ) {
                    dbg.location(75,53);
                    adaptor.addChild(root_1, stream_inAll.nextTree());

                }
                stream_inAll.reset();
                dbg.location(75,60);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:75:60: ( dt )?
                if ( stream_dt.hasNext() ) {
                    dbg.location(75,60);
                    adaptor.addChild(root_1, stream_dt.nextTree());

                }
                stream_dt.reset();
                dbg.location(75,64);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:75:64: ( jj )?
                if ( stream_jj.hasNext() ) {
                    dbg.location(75,64);
                    adaptor.addChild(root_1, stream_jj.nextTree());

                }
                stream_jj.reset();
                dbg.location(75,68);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(75,71);
                adaptor.addChild(root_1, stream_nntemp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(75, 78);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:1: inAll : ( in | inafter | inas | inbefore | inby | infor | infrom | inin | ininto | inof | inoff | inon | inover | inunder | invia | inwith | inwithout | to );
    public final ChemicalChunkerParser.inAll_return inAll() throws RecognitionException {
        ChemicalChunkerParser.inAll_return retval = new ChemicalChunkerParser.inAll_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.in_return in120 = null;

        ChemicalChunkerParser.inafter_return inafter121 = null;

        ChemicalChunkerParser.inas_return inas122 = null;

        ChemicalChunkerParser.inbefore_return inbefore123 = null;

        ChemicalChunkerParser.inby_return inby124 = null;

        ChemicalChunkerParser.infor_return infor125 = null;

        ChemicalChunkerParser.infrom_return infrom126 = null;

        ChemicalChunkerParser.inin_return inin127 = null;

        ChemicalChunkerParser.ininto_return ininto128 = null;

        ChemicalChunkerParser.inof_return inof129 = null;

        ChemicalChunkerParser.inoff_return inoff130 = null;

        ChemicalChunkerParser.inon_return inon131 = null;

        ChemicalChunkerParser.inover_return inover132 = null;

        ChemicalChunkerParser.inunder_return inunder133 = null;

        ChemicalChunkerParser.invia_return invia134 = null;

        ChemicalChunkerParser.inwith_return inwith135 = null;

        ChemicalChunkerParser.inwithout_return inwithout136 = null;

        ChemicalChunkerParser.to_return to137 = null;



        try { dbg.enterRule(getGrammarFileName(), "inAll");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:7: ( in | inafter | inas | inbefore | inby | infor | infrom | inin | ininto | inof | inoff | inon | inover | inunder | invia | inwith | inwithout | to )
            int alt29=18;
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
            case 168:
                {
                alt29=18;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:9: in
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,9);
                    pushFollow(FOLLOW_in_in_inAll696);
                    in120=in();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, in120.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:12: inafter
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,12);
                    pushFollow(FOLLOW_inafter_in_inAll698);
                    inafter121=inafter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inafter121.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:20: inas
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,20);
                    pushFollow(FOLLOW_inas_in_inAll700);
                    inas122=inas();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inas122.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:25: inbefore
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,25);
                    pushFollow(FOLLOW_inbefore_in_inAll702);
                    inbefore123=inbefore();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inbefore123.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:34: inby
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,34);
                    pushFollow(FOLLOW_inby_in_inAll704);
                    inby124=inby();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inby124.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:39: infor
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,39);
                    pushFollow(FOLLOW_infor_in_inAll706);
                    infor125=infor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, infor125.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:45: infrom
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,45);
                    pushFollow(FOLLOW_infrom_in_inAll708);
                    infrom126=infrom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, infrom126.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:52: inin
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,52);
                    pushFollow(FOLLOW_inin_in_inAll710);
                    inin127=inin();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inin127.getTree());

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:57: ininto
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,57);
                    pushFollow(FOLLOW_ininto_in_inAll712);
                    ininto128=ininto();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ininto128.getTree());

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:64: inof
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,64);
                    pushFollow(FOLLOW_inof_in_inAll714);
                    inof129=inof();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inof129.getTree());

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:69: inoff
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,69);
                    pushFollow(FOLLOW_inoff_in_inAll716);
                    inoff130=inoff();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inoff130.getTree());

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:75: inon
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,75);
                    pushFollow(FOLLOW_inon_in_inAll718);
                    inon131=inon();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inon131.getTree());

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:80: inover
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,80);
                    pushFollow(FOLLOW_inover_in_inAll720);
                    inover132=inover();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inover132.getTree());

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:87: inunder
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,87);
                    pushFollow(FOLLOW_inunder_in_inAll722);
                    inunder133=inunder();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inunder133.getTree());

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:95: invia
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,95);
                    pushFollow(FOLLOW_invia_in_inAll724);
                    invia134=invia();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, invia134.getTree());

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:101: inwith
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,101);
                    pushFollow(FOLLOW_inwith_in_inAll726);
                    inwith135=inwith();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inwith135.getTree());

                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:108: inwithout
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,108);
                    pushFollow(FOLLOW_inwithout_in_inAll728);
                    inwithout136=inwithout();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inwithout136.getTree());

                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:79:118: to
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(79,118);
                    pushFollow(FOLLOW_to_in_inAll730);
                    to137=to();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, to137.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(79, 120);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:83:1: mmol : cd nnmol -> ^( NODE[\"MMOL\"] cd nnmol ) ;
    public final ChemicalChunkerParser.mmol_return mmol() throws RecognitionException {
        ChemicalChunkerParser.mmol_return retval = new ChemicalChunkerParser.mmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd138 = null;

        ChemicalChunkerParser.nnmol_return nnmol139 = null;


        RewriteRuleSubtreeStream stream_nnmol=new RewriteRuleSubtreeStream(adaptor,"rule nnmol");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "mmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:83:6: ( cd nnmol -> ^( NODE[\"MMOL\"] cd nnmol ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:83:8: cd nnmol
            {
            dbg.location(83,8);
            pushFollow(FOLLOW_cd_in_mmol743);
            cd138=cd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cd.add(cd138.getTree());
            dbg.location(83,11);
            pushFollow(FOLLOW_nnmol_in_mmol745);
            nnmol139=nnmol();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nnmol.add(nnmol139.getTree());


            // AST REWRITE
            // elements: nnmol, cd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:17: -> ^( NODE[\"MMOL\"] cd nnmol )
            {
                dbg.location(83,20);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:83:20: ^( NODE[\"MMOL\"] cd nnmol )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(83,22);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "MMOL"), root_1);

                dbg.location(83,37);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(83,40);
                adaptor.addChild(root_1, stream_nnmol.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(83, 47);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:84:1: gram : cd nngram -> ^( NODE[\"GRAM\"] cd nngram ) ;
    public final ChemicalChunkerParser.gram_return gram() throws RecognitionException {
        ChemicalChunkerParser.gram_return retval = new ChemicalChunkerParser.gram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd140 = null;

        ChemicalChunkerParser.nngram_return nngram141 = null;


        RewriteRuleSubtreeStream stream_nngram=new RewriteRuleSubtreeStream(adaptor,"rule nngram");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "gram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:84:6: ( cd nngram -> ^( NODE[\"GRAM\"] cd nngram ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:84:8: cd nngram
            {
            dbg.location(84,8);
            pushFollow(FOLLOW_cd_in_gram766);
            cd140=cd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cd.add(cd140.getTree());
            dbg.location(84,11);
            pushFollow(FOLLOW_nngram_in_gram768);
            nngram141=nngram();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nngram.add(nngram141.getTree());


            // AST REWRITE
            // elements: nngram, cd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 84:17: -> ^( NODE[\"GRAM\"] cd nngram )
            {
                dbg.location(84,20);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:84:20: ^( NODE[\"GRAM\"] cd nngram )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(84,22);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "GRAM"), root_1);

                dbg.location(84,37);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(84,40);
                adaptor.addChild(root_1, stream_nngram.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(84, 48);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:85:1: percent : cd nnpercent -> ^( NODE[\"PERCENT\"] cd nnpercent ) ;
    public final ChemicalChunkerParser.percent_return percent() throws RecognitionException {
        ChemicalChunkerParser.percent_return retval = new ChemicalChunkerParser.percent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd142 = null;

        ChemicalChunkerParser.nnpercent_return nnpercent143 = null;


        RewriteRuleSubtreeStream stream_nnpercent=new RewriteRuleSubtreeStream(adaptor,"rule nnpercent");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "percent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:85:9: ( cd nnpercent -> ^( NODE[\"PERCENT\"] cd nnpercent ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:85:11: cd nnpercent
            {
            dbg.location(85,11);
            pushFollow(FOLLOW_cd_in_percent789);
            cd142=cd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cd.add(cd142.getTree());
            dbg.location(85,14);
            pushFollow(FOLLOW_nnpercent_in_percent791);
            nnpercent143=nnpercent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nnpercent.add(nnpercent143.getTree());


            // AST REWRITE
            // elements: cd, nnpercent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:24: -> ^( NODE[\"PERCENT\"] cd nnpercent )
            {
                dbg.location(85,27);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:85:27: ^( NODE[\"PERCENT\"] cd nnpercent )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(85,29);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "PERCENT"), root_1);

                dbg.location(85,47);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(85,50);
                adaptor.addChild(root_1, stream_nnpercent.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(85, 61);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:86:1: volume : cd nnvol -> ^( NODE[\"VOLUME\"] cd nnvol ) ;
    public final ChemicalChunkerParser.volume_return volume() throws RecognitionException {
        ChemicalChunkerParser.volume_return retval = new ChemicalChunkerParser.volume_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.cd_return cd144 = null;

        ChemicalChunkerParser.nnvol_return nnvol145 = null;


        RewriteRuleSubtreeStream stream_nnvol=new RewriteRuleSubtreeStream(adaptor,"rule nnvol");
        RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"rule cd");
        try { dbg.enterRule(getGrammarFileName(), "volume");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:86:8: ( cd nnvol -> ^( NODE[\"VOLUME\"] cd nnvol ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:86:10: cd nnvol
            {
            dbg.location(86,10);
            pushFollow(FOLLOW_cd_in_volume812);
            cd144=cd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cd.add(cd144.getTree());
            dbg.location(86,13);
            pushFollow(FOLLOW_nnvol_in_volume814);
            nnvol145=nnvol();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nnvol.add(nnvol145.getTree());


            // AST REWRITE
            // elements: nnvol, cd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:19: -> ^( NODE[\"VOLUME\"] cd nnvol )
            {
                dbg.location(86,22);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:86:22: ^( NODE[\"VOLUME\"] cd nnvol )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(86,24);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "VOLUME"), root_1);

                dbg.location(86,41);
                adaptor.addChild(root_1, stream_cd.nextTree());
                dbg.location(86,44);
                adaptor.addChild(root_1, stream_nnvol.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(86, 51);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:88:1: measurements : ( mmol | gram | percent | volume );
    public final ChemicalChunkerParser.measurements_return measurements() throws RecognitionException {
        ChemicalChunkerParser.measurements_return retval = new ChemicalChunkerParser.measurements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.mmol_return mmol146 = null;

        ChemicalChunkerParser.gram_return gram147 = null;

        ChemicalChunkerParser.percent_return percent148 = null;

        ChemicalChunkerParser.volume_return volume149 = null;



        try { dbg.enterRule(getGrammarFileName(), "measurements");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:89:2: ( mmol | gram | percent | volume )
            int alt30=4;
            try { dbg.enterDecision(30);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==119) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==TOKEN) ) {
                    switch ( input.LA(3) ) {
                    case 33:
                        {
                        alt30=2;
                        }
                        break;
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
                    case 37:
                        {
                        alt30=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:89:3: mmol
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(89,3);
                    pushFollow(FOLLOW_mmol_in_measurements836);
                    mmol146=mmol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mmol146.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:89:8: gram
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(89,8);
                    pushFollow(FOLLOW_gram_in_measurements838);
                    gram147=gram();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gram147.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:89:13: percent
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(89,13);
                    pushFollow(FOLLOW_percent_in_measurements840);
                    percent148=percent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, percent148.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:89:21: volume
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(89,21);
                    pushFollow(FOLLOW_volume_in_measurements842);
                    volume149=volume();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, volume149.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:91:1: oscarCompound : ( oscarcm )+ -> ^( NODE[\"OSCARCM\"] ( oscarcm )+ ) ;
    public final ChemicalChunkerParser.oscarCompound_return oscarCompound() throws RecognitionException {
        ChemicalChunkerParser.oscarCompound_return retval = new ChemicalChunkerParser.oscarCompound_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarcm_return oscarcm150 = null;


        RewriteRuleSubtreeStream stream_oscarcm=new RewriteRuleSubtreeStream(adaptor,"rule oscarcm");
        try { dbg.enterRule(getGrammarFileName(), "oscarCompound");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:91:15: ( ( oscarcm )+ -> ^( NODE[\"OSCARCM\"] ( oscarcm )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:91:17: ( oscarcm )+
            {
            dbg.location(91,17);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:91:17: ( oscarcm )+
            int cnt31=0;
            try { dbg.enterSubRule(31);

            loop31:
            do {
                int alt31=2;
                try { dbg.enterDecision(31);

                int LA31_0 = input.LA(1);

                if ( (LA31_0==50) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred115_ChemicalChunker()) ) {
                        alt31=1;
                    }


                }


                } finally {dbg.exitDecision(31);}

                switch (alt31) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: oscarcm
            	    {
            	    dbg.location(91,17);
            	    pushFollow(FOLLOW_oscarcm_in_oscarCompound851);
            	    oscarcm150=oscarcm();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_oscarcm.add(oscarcm150.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt31++;
            } while (true);
            } finally {dbg.exitSubRule(31);}



            // AST REWRITE
            // elements: oscarcm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:26: -> ^( NODE[\"OSCARCM\"] ( oscarcm )+ )
            {
                dbg.location(91,29);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:91:29: ^( NODE[\"OSCARCM\"] ( oscarcm )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(91,31);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "OSCARCM"), root_1);

                dbg.location(91,48);
                if ( !(stream_oscarcm.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_oscarcm.hasNext() ) {
                    dbg.location(91,48);
                    adaptor.addChild(root_1, stream_oscarcm.nextTree());

                }
                stream_oscarcm.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(91, 57);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:94:1: moleculeamount1 : measurements inof oscarCompound ;
    public final ChemicalChunkerParser.moleculeamount1_return moleculeamount1() throws RecognitionException {
        ChemicalChunkerParser.moleculeamount1_return retval = new ChemicalChunkerParser.moleculeamount1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.measurements_return measurements151 = null;

        ChemicalChunkerParser.inof_return inof152 = null;

        ChemicalChunkerParser.oscarCompound_return oscarCompound153 = null;



        try { dbg.enterRule(getGrammarFileName(), "moleculeamount1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:95:2: ( measurements inof oscarCompound )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:95:3: measurements inof oscarCompound
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(95,3);
            pushFollow(FOLLOW_measurements_in_moleculeamount1872);
            measurements151=measurements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, measurements151.getTree());
            dbg.location(95,16);
            pushFollow(FOLLOW_inof_in_moleculeamount1874);
            inof152=inof();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inof152.getTree());
            dbg.location(95,21);
            pushFollow(FOLLOW_oscarCompound_in_moleculeamount1876);
            oscarCompound153=oscarCompound();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oscarCompound153.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(95, 34);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:96:1: moleculeamount2 : oscarCompound ( amount )* ;
    public final ChemicalChunkerParser.moleculeamount2_return moleculeamount2() throws RecognitionException {
        ChemicalChunkerParser.moleculeamount2_return retval = new ChemicalChunkerParser.moleculeamount2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarCompound_return oscarCompound154 = null;

        ChemicalChunkerParser.amount_return amount155 = null;



        try { dbg.enterRule(getGrammarFileName(), "moleculeamount2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(96, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:97:2: ( oscarCompound ( amount )* )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:97:3: oscarCompound ( amount )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(97,3);
            pushFollow(FOLLOW_oscarCompound_in_moleculeamount2884);
            oscarCompound154=oscarCompound();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oscarCompound154.getTree());
            dbg.location(97,17);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:97:17: ( amount )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                try {
                    isCyclicDecision = true;
                    alt32 = dfa32.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: amount
            	    {
            	    dbg.location(97,17);
            	    pushFollow(FOLLOW_amount_in_moleculeamount2886);
            	    amount155=amount();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, amount155.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(97, 24);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:98:1: moleculeamount : ( moleculeamount1 | moleculeamount2 );
    public final ChemicalChunkerParser.moleculeamount_return moleculeamount() throws RecognitionException {
        ChemicalChunkerParser.moleculeamount_return retval = new ChemicalChunkerParser.moleculeamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.moleculeamount1_return moleculeamount1156 = null;

        ChemicalChunkerParser.moleculeamount2_return moleculeamount2157 = null;



        try { dbg.enterRule(getGrammarFileName(), "moleculeamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:99:2: ( moleculeamount1 | moleculeamount2 )
            int alt33=2;
            try { dbg.enterDecision(33);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==119) ) {
                alt33=1;
            }
            else if ( (LA33_0==50) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:99:3: moleculeamount1
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(99,3);
                    pushFollow(FOLLOW_moleculeamount1_in_moleculeamount896);
                    moleculeamount1156=moleculeamount1();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, moleculeamount1156.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:99:21: moleculeamount2
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(99,21);
                    pushFollow(FOLLOW_moleculeamount2_in_moleculeamount900);
                    moleculeamount2157=moleculeamount2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, moleculeamount2157.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(99, 37);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:100:1: molecule : moleculeamount -> ^( NODE[\"MOLECULE\"] moleculeamount ) ;
    public final ChemicalChunkerParser.molecule_return molecule() throws RecognitionException {
        ChemicalChunkerParser.molecule_return retval = new ChemicalChunkerParser.molecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.moleculeamount_return moleculeamount158 = null;


        RewriteRuleSubtreeStream stream_moleculeamount=new RewriteRuleSubtreeStream(adaptor,"rule moleculeamount");
        try { dbg.enterRule(getGrammarFileName(), "molecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:101:2: ( moleculeamount -> ^( NODE[\"MOLECULE\"] moleculeamount ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:101:5: moleculeamount
            {
            dbg.location(101,5);
            pushFollow(FOLLOW_moleculeamount_in_molecule921);
            moleculeamount158=moleculeamount();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moleculeamount.add(moleculeamount158.getTree());


            // AST REWRITE
            // elements: moleculeamount
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 101:19: -> ^( NODE[\"MOLECULE\"] moleculeamount )
            {
                dbg.location(101,22);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:101:22: ^( NODE[\"MOLECULE\"] moleculeamount )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(101,24);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "MOLECULE"), root_1);

                dbg.location(101,42);
                adaptor.addChild(root_1, stream_moleculeamount.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(101, 58);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:103:1: unnamedmoleculeamount1 : measurements inof oscarcd ;
    public final ChemicalChunkerParser.unnamedmoleculeamount1_return unnamedmoleculeamount1() throws RecognitionException {
        ChemicalChunkerParser.unnamedmoleculeamount1_return retval = new ChemicalChunkerParser.unnamedmoleculeamount1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.measurements_return measurements159 = null;

        ChemicalChunkerParser.inof_return inof160 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd161 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmoleculeamount1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:104:2: ( measurements inof oscarcd )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:104:3: measurements inof oscarcd
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(104,3);
            pushFollow(FOLLOW_measurements_in_unnamedmoleculeamount1940);
            measurements159=measurements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, measurements159.getTree());
            dbg.location(104,16);
            pushFollow(FOLLOW_inof_in_unnamedmoleculeamount1942);
            inof160=inof();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inof160.getTree());
            dbg.location(104,21);
            pushFollow(FOLLOW_oscarcd_in_unnamedmoleculeamount1944);
            oscarcd161=oscarcd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oscarcd161.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(104, 28);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:105:1: unnamedmoleculeamount2 : oscarcd ( amount )* ;
    public final ChemicalChunkerParser.unnamedmoleculeamount2_return unnamedmoleculeamount2() throws RecognitionException {
        ChemicalChunkerParser.unnamedmoleculeamount2_return retval = new ChemicalChunkerParser.unnamedmoleculeamount2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd162 = null;

        ChemicalChunkerParser.amount_return amount163 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmoleculeamount2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:106:2: ( oscarcd ( amount )* )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:106:3: oscarcd ( amount )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(106,3);
            pushFollow(FOLLOW_oscarcd_in_unnamedmoleculeamount2952);
            oscarcd162=oscarcd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, oscarcd162.getTree());
            dbg.location(106,11);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:106:11: ( amount )*
            try { dbg.enterSubRule(34);

            loop34:
            do {
                int alt34=2;
                try { dbg.enterDecision(34);

                try {
                    isCyclicDecision = true;
                    alt34 = dfa34.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(34);}

                switch (alt34) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:0:0: amount
            	    {
            	    dbg.location(106,11);
            	    pushFollow(FOLLOW_amount_in_unnamedmoleculeamount2954);
            	    amount163=amount();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, amount163.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);
            } finally {dbg.exitSubRule(34);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(106, 18);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:107:1: unnamedmoleculeamount : ( unnamedmoleculeamount1 | unnamedmoleculeamount2 );
    public final ChemicalChunkerParser.unnamedmoleculeamount_return unnamedmoleculeamount() throws RecognitionException {
        ChemicalChunkerParser.unnamedmoleculeamount_return retval = new ChemicalChunkerParser.unnamedmoleculeamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.unnamedmoleculeamount1_return unnamedmoleculeamount1164 = null;

        ChemicalChunkerParser.unnamedmoleculeamount2_return unnamedmoleculeamount2165 = null;



        try { dbg.enterRule(getGrammarFileName(), "unnamedmoleculeamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:108:2: ( unnamedmoleculeamount1 | unnamedmoleculeamount2 )
            int alt35=2;
            try { dbg.enterDecision(35);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==119) ) {
                alt35=1;
            }
            else if ( (LA35_0==10) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:108:3: unnamedmoleculeamount1
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(108,3);
                    pushFollow(FOLLOW_unnamedmoleculeamount1_in_unnamedmoleculeamount964);
                    unnamedmoleculeamount1164=unnamedmoleculeamount1();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unnamedmoleculeamount1164.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:108:28: unnamedmoleculeamount2
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(108,28);
                    pushFollow(FOLLOW_unnamedmoleculeamount2_in_unnamedmoleculeamount968);
                    unnamedmoleculeamount2165=unnamedmoleculeamount2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unnamedmoleculeamount2165.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(108, 51);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:111:1: unnamedmolecule : unnamedmoleculeamount -> ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount ) ;
    public final ChemicalChunkerParser.unnamedmolecule_return unnamedmolecule() throws RecognitionException {
        ChemicalChunkerParser.unnamedmolecule_return retval = new ChemicalChunkerParser.unnamedmolecule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.unnamedmoleculeamount_return unnamedmoleculeamount166 = null;


        RewriteRuleSubtreeStream stream_unnamedmoleculeamount=new RewriteRuleSubtreeStream(adaptor,"rule unnamedmoleculeamount");
        try { dbg.enterRule(getGrammarFileName(), "unnamedmolecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:112:2: ( unnamedmoleculeamount -> ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:112:4: unnamedmoleculeamount
            {
            dbg.location(112,4);
            pushFollow(FOLLOW_unnamedmoleculeamount_in_unnamedmolecule981);
            unnamedmoleculeamount166=unnamedmoleculeamount();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unnamedmoleculeamount.add(unnamedmoleculeamount166.getTree());


            // AST REWRITE
            // elements: unnamedmoleculeamount
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:26: -> ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount )
            {
                dbg.location(112,29);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:112:29: ^( NODE[\"UNNAMEDMOLECULE\"] unnamedmoleculeamount )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(112,31);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "UNNAMEDMOLECULE"), root_1);

                dbg.location(112,55);
                adaptor.addChild(root_1, stream_unnamedmoleculeamount.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(112, 77);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:114:1: amount : lrb measurements ( comma measurements )* rrb -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb ) ;
    public final ChemicalChunkerParser.amount_return amount() throws RecognitionException {
        ChemicalChunkerParser.amount_return retval = new ChemicalChunkerParser.amount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.lrb_return lrb167 = null;

        ChemicalChunkerParser.measurements_return measurements168 = null;

        ChemicalChunkerParser.comma_return comma169 = null;

        ChemicalChunkerParser.measurements_return measurements170 = null;

        ChemicalChunkerParser.rrb_return rrb171 = null;


        RewriteRuleSubtreeStream stream_measurements=new RewriteRuleSubtreeStream(adaptor,"rule measurements");
        RewriteRuleSubtreeStream stream_comma=new RewriteRuleSubtreeStream(adaptor,"rule comma");
        RewriteRuleSubtreeStream stream_lrb=new RewriteRuleSubtreeStream(adaptor,"rule lrb");
        RewriteRuleSubtreeStream stream_rrb=new RewriteRuleSubtreeStream(adaptor,"rule rrb");
        try { dbg.enterRule(getGrammarFileName(), "amount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:114:9: ( lrb measurements ( comma measurements )* rrb -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb ) )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:114:11: lrb measurements ( comma measurements )* rrb
            {
            dbg.location(114,11);
            pushFollow(FOLLOW_lrb_in_amount1002);
            lrb167=lrb();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lrb.add(lrb167.getTree());
            dbg.location(114,15);
            pushFollow(FOLLOW_measurements_in_amount1004);
            measurements168=measurements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_measurements.add(measurements168.getTree());
            dbg.location(114,28);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:114:28: ( comma measurements )*
            try { dbg.enterSubRule(36);

            loop36:
            do {
                int alt36=2;
                try { dbg.enterDecision(36);

                int LA36_0 = input.LA(1);

                if ( (LA36_0==95) ) {
                    alt36=1;
                }


                } finally {dbg.exitDecision(36);}

                switch (alt36) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:114:29: comma measurements
            	    {
            	    dbg.location(114,29);
            	    pushFollow(FOLLOW_comma_in_amount1007);
            	    comma169=comma();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_comma.add(comma169.getTree());
            	    dbg.location(114,36);
            	    pushFollow(FOLLOW_measurements_in_amount1010);
            	    measurements170=measurements();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_measurements.add(measurements170.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);
            } finally {dbg.exitSubRule(36);}

            dbg.location(114,52);
            pushFollow(FOLLOW_rrb_in_amount1015);
            rrb171=rrb();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rrb.add(rrb171.getTree());


            // AST REWRITE
            // elements: measurements, measurements, lrb, comma, rrb
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 114:56: -> ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb )
            {
                dbg.location(114,61);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:114:61: ^( NODE[\"AMOUNT\"] lrb measurements ( comma measurements )* rrb )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(114,63);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "AMOUNT"), root_1);

                dbg.location(114,79);
                adaptor.addChild(root_1, stream_lrb.nextTree());
                dbg.location(114,83);
                adaptor.addChild(root_1, stream_measurements.nextTree());
                dbg.location(114,96);
                // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:114:96: ( comma measurements )*
                while ( stream_measurements.hasNext()||stream_comma.hasNext() ) {
                    dbg.location(114,97);
                    adaptor.addChild(root_1, stream_comma.nextTree());
                    dbg.location(114,104);
                    adaptor.addChild(root_1, stream_measurements.nextTree());

                }
                stream_measurements.reset();
                stream_comma.reset();
                dbg.location(114,120);
                adaptor.addChild(root_1, stream_rrb.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(114, 124);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:116:1: method : ( nngeneral | nn )? nnmethod ( oscarcd | cd )? ;
    public final ChemicalChunkerParser.method_return method() throws RecognitionException {
        ChemicalChunkerParser.method_return retval = new ChemicalChunkerParser.method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ChemicalChunkerParser.nngeneral_return nngeneral172 = null;

        ChemicalChunkerParser.nn_return nn173 = null;

        ChemicalChunkerParser.nnmethod_return nnmethod174 = null;

        ChemicalChunkerParser.oscarcd_return oscarcd175 = null;

        ChemicalChunkerParser.cd_return cd176 = null;



        try { dbg.enterRule(getGrammarFileName(), "method");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:116:7: ( ( nngeneral | nn )? nnmethod ( oscarcd | cd )? )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:117:5: ( nngeneral | nn )? nnmethod ( oscarcd | cd )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(117,5);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:117:5: ( nngeneral | nn )?
            int alt37=3;
            try { dbg.enterSubRule(37);
            try { dbg.enterDecision(37);

            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            else if ( (LA37_0==141) ) {
                alt37=2;
            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:117:6: nngeneral
                    {
                    dbg.location(117,6);
                    pushFollow(FOLLOW_nngeneral_in_method1052);
                    nngeneral172=nngeneral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nngeneral172.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:117:16: nn
                    {
                    dbg.location(117,16);
                    pushFollow(FOLLOW_nn_in_method1054);
                    nn173=nn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nn173.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(37);}

            dbg.location(117,21);
            pushFollow(FOLLOW_nnmethod_in_method1058);
            nnmethod174=nnmethod();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, nnmethod174.getTree());
            dbg.location(117,30);
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:117:30: ( oscarcd | cd )?
            int alt38=3;
            try { dbg.enterSubRule(38);
            try { dbg.enterDecision(38);

            int LA38_0 = input.LA(1);

            if ( (LA38_0==10) ) {
                alt38=1;
            }
            else if ( (LA38_0==119) ) {
                alt38=2;
            }
            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:117:31: oscarcd
                    {
                    dbg.location(117,31);
                    pushFollow(FOLLOW_oscarcd_in_method1061);
                    oscarcd175=oscarcd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oscarcd175.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:117:39: cd
                    {
                    dbg.location(117,39);
                    pushFollow(FOLLOW_cd_in_method1063);
                    cd176=cd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cd176.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(38);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(117, 45);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:120:1: oscarcd : 'OSCAR-CD' TOKEN ;
    public final ChemicalChunkerParser.oscarcd_return oscarcd() throws RecognitionException {
        ChemicalChunkerParser.oscarcd_return retval = new ChemicalChunkerParser.oscarcd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal177=null;
        Token TOKEN178=null;

        Object string_literal177_tree=null;
        Object TOKEN178_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:120:8: ( 'OSCAR-CD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:120:9: 'OSCAR-CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(120,9);
            string_literal177=(Token)match(input,10,FOLLOW_10_in_oscarcd1074); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal177_tree = (Object)adaptor.create(string_literal177);
            adaptor.addChild(root_0, string_literal177_tree);
            }
            dbg.location(120,20);
            TOKEN178=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcd1076); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN178_tree = (Object)adaptor.create(TOKEN178);
            adaptor.addChild(root_0, TOKEN178_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:121:1: oscarcj : 'OSCAR-CJ' TOKEN ;
    public final ChemicalChunkerParser.oscarcj_return oscarcj() throws RecognitionException {
        ChemicalChunkerParser.oscarcj_return retval = new ChemicalChunkerParser.oscarcj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal179=null;
        Token TOKEN180=null;

        Object string_literal179_tree=null;
        Object TOKEN180_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:121:8: ( 'OSCAR-CJ' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:121:9: 'OSCAR-CJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(121,9);
            string_literal179=(Token)match(input,11,FOLLOW_11_in_oscarcj1081); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal179_tree = (Object)adaptor.create(string_literal179);
            adaptor.addChild(root_0, string_literal179_tree);
            }
            dbg.location(121,20);
            TOKEN180=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcj1083); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN180_tree = (Object)adaptor.create(TOKEN180);
            adaptor.addChild(root_0, TOKEN180_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(121, 25);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:122:1: oscaront : 'OSCAR-ONT' TOKEN ;
    public final ChemicalChunkerParser.oscaront_return oscaront() throws RecognitionException {
        ChemicalChunkerParser.oscaront_return retval = new ChemicalChunkerParser.oscaront_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal181=null;
        Token TOKEN182=null;

        Object string_literal181_tree=null;
        Object TOKEN182_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscaront");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:122:9: ( 'OSCAR-ONT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:122:11: 'OSCAR-ONT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(122,11);
            string_literal181=(Token)match(input,12,FOLLOW_12_in_oscaront1089); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal181_tree = (Object)adaptor.create(string_literal181);
            adaptor.addChild(root_0, string_literal181_tree);
            }
            dbg.location(122,23);
            TOKEN182=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscaront1091); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN182_tree = (Object)adaptor.create(TOKEN182);
            adaptor.addChild(root_0, TOKEN182_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(122, 28);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:123:1: tmunicode : 'TM-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.tmunicode_return tmunicode() throws RecognitionException {
        ChemicalChunkerParser.tmunicode_return retval = new ChemicalChunkerParser.tmunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal183=null;
        Token TOKEN184=null;

        Object string_literal183_tree=null;
        Object TOKEN184_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "tmunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:123:10: ( 'TM-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:123:11: 'TM-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(123,11);
            string_literal183=(Token)match(input,13,FOLLOW_13_in_tmunicode1096); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal183_tree = (Object)adaptor.create(string_literal183);
            adaptor.addChild(root_0, string_literal183_tree);
            }
            dbg.location(123,24);
            TOKEN184=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_tmunicode1098); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN184_tree = (Object)adaptor.create(TOKEN184);
            adaptor.addChild(root_0, TOKEN184_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:124:1: cdunicode : 'CD-UNICODE' TOKEN ;
    public final ChemicalChunkerParser.cdunicode_return cdunicode() throws RecognitionException {
        ChemicalChunkerParser.cdunicode_return retval = new ChemicalChunkerParser.cdunicode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal185=null;
        Token TOKEN186=null;

        Object string_literal185_tree=null;
        Object TOKEN186_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cdunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:124:10: ( 'CD-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:124:11: 'CD-UNICODE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(124,11);
            string_literal185=(Token)match(input,14,FOLLOW_14_in_cdunicode1103); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal185_tree = (Object)adaptor.create(string_literal185);
            adaptor.addChild(root_0, string_literal185_tree);
            }
            dbg.location(124,24);
            TOKEN186=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cdunicode1105); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN186_tree = (Object)adaptor.create(TOKEN186);
            adaptor.addChild(root_0, TOKEN186_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(124, 29);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:127:1: inas : 'IN-AS' TOKEN ;
    public final ChemicalChunkerParser.inas_return inas() throws RecognitionException {
        ChemicalChunkerParser.inas_return retval = new ChemicalChunkerParser.inas_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal187=null;
        Token TOKEN188=null;

        Object string_literal187_tree=null;
        Object TOKEN188_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inas");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:127:5: ( 'IN-AS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:127:6: 'IN-AS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(127,6);
            string_literal187=(Token)match(input,15,FOLLOW_15_in_inas1112); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal187_tree = (Object)adaptor.create(string_literal187);
            adaptor.addChild(root_0, string_literal187_tree);
            }
            dbg.location(127,14);
            TOKEN188=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inas1114); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN188_tree = (Object)adaptor.create(TOKEN188);
            adaptor.addChild(root_0, TOKEN188_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(127, 19);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:128:1: inbefore : 'IN-BEFORE' TOKEN ;
    public final ChemicalChunkerParser.inbefore_return inbefore() throws RecognitionException {
        ChemicalChunkerParser.inbefore_return retval = new ChemicalChunkerParser.inbefore_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal189=null;
        Token TOKEN190=null;

        Object string_literal189_tree=null;
        Object TOKEN190_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inbefore");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:128:9: ( 'IN-BEFORE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:128:10: 'IN-BEFORE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,10);
            string_literal189=(Token)match(input,16,FOLLOW_16_in_inbefore1119); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal189_tree = (Object)adaptor.create(string_literal189);
            adaptor.addChild(root_0, string_literal189_tree);
            }
            dbg.location(128,22);
            TOKEN190=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inbefore1121); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN190_tree = (Object)adaptor.create(TOKEN190);
            adaptor.addChild(root_0, TOKEN190_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(128, 27);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:129:1: inafter : 'IN-AFTER' TOKEN ;
    public final ChemicalChunkerParser.inafter_return inafter() throws RecognitionException {
        ChemicalChunkerParser.inafter_return retval = new ChemicalChunkerParser.inafter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal191=null;
        Token TOKEN192=null;

        Object string_literal191_tree=null;
        Object TOKEN192_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inafter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:129:8: ( 'IN-AFTER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:129:9: 'IN-AFTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(129,9);
            string_literal191=(Token)match(input,17,FOLLOW_17_in_inafter1126); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal191_tree = (Object)adaptor.create(string_literal191);
            adaptor.addChild(root_0, string_literal191_tree);
            }
            dbg.location(129,20);
            TOKEN192=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inafter1128); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN192_tree = (Object)adaptor.create(TOKEN192);
            adaptor.addChild(root_0, TOKEN192_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:130:1: inin : 'IN-IN' TOKEN ;
    public final ChemicalChunkerParser.inin_return inin() throws RecognitionException {
        ChemicalChunkerParser.inin_return retval = new ChemicalChunkerParser.inin_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal193=null;
        Token TOKEN194=null;

        Object string_literal193_tree=null;
        Object TOKEN194_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inin");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(130, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:130:5: ( 'IN-IN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:130:6: 'IN-IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(130,6);
            string_literal193=(Token)match(input,18,FOLLOW_18_in_inin1133); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal193_tree = (Object)adaptor.create(string_literal193);
            adaptor.addChild(root_0, string_literal193_tree);
            }
            dbg.location(130,14);
            TOKEN194=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inin1135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN194_tree = (Object)adaptor.create(TOKEN194);
            adaptor.addChild(root_0, TOKEN194_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(130, 19);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:131:1: ininto : 'IN-INTO' TOKEN ;
    public final ChemicalChunkerParser.ininto_return ininto() throws RecognitionException {
        ChemicalChunkerParser.ininto_return retval = new ChemicalChunkerParser.ininto_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal195=null;
        Token TOKEN196=null;

        Object string_literal195_tree=null;
        Object TOKEN196_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ininto");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:131:7: ( 'IN-INTO' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:131:8: 'IN-INTO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(131,8);
            string_literal195=(Token)match(input,19,FOLLOW_19_in_ininto1140); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal195_tree = (Object)adaptor.create(string_literal195);
            adaptor.addChild(root_0, string_literal195_tree);
            }
            dbg.location(131,18);
            TOKEN196=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ininto1142); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN196_tree = (Object)adaptor.create(TOKEN196);
            adaptor.addChild(root_0, TOKEN196_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:132:1: inwith : 'IN-WITH' TOKEN ;
    public final ChemicalChunkerParser.inwith_return inwith() throws RecognitionException {
        ChemicalChunkerParser.inwith_return retval = new ChemicalChunkerParser.inwith_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal197=null;
        Token TOKEN198=null;

        Object string_literal197_tree=null;
        Object TOKEN198_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:132:7: ( 'IN-WITH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:132:8: 'IN-WITH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(132,8);
            string_literal197=(Token)match(input,20,FOLLOW_20_in_inwith1147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal197_tree = (Object)adaptor.create(string_literal197);
            adaptor.addChild(root_0, string_literal197_tree);
            }
            dbg.location(132,18);
            TOKEN198=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwith1149); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN198_tree = (Object)adaptor.create(TOKEN198);
            adaptor.addChild(root_0, TOKEN198_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:133:1: inwithout : 'IN-WITHOUT' TOKEN ;
    public final ChemicalChunkerParser.inwithout_return inwithout() throws RecognitionException {
        ChemicalChunkerParser.inwithout_return retval = new ChemicalChunkerParser.inwithout_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal199=null;
        Token TOKEN200=null;

        Object string_literal199_tree=null;
        Object TOKEN200_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inwithout");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:133:10: ( 'IN-WITHOUT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:133:11: 'IN-WITHOUT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(133,11);
            string_literal199=(Token)match(input,21,FOLLOW_21_in_inwithout1154); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal199_tree = (Object)adaptor.create(string_literal199);
            adaptor.addChild(root_0, string_literal199_tree);
            }
            dbg.location(133,24);
            TOKEN200=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwithout1156); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN200_tree = (Object)adaptor.create(TOKEN200);
            adaptor.addChild(root_0, TOKEN200_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(133, 29);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:134:1: inby : 'IN-BY' TOKEN ;
    public final ChemicalChunkerParser.inby_return inby() throws RecognitionException {
        ChemicalChunkerParser.inby_return retval = new ChemicalChunkerParser.inby_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal201=null;
        Token TOKEN202=null;

        Object string_literal201_tree=null;
        Object TOKEN202_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inby");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:134:5: ( 'IN-BY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:134:6: 'IN-BY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(134,6);
            string_literal201=(Token)match(input,22,FOLLOW_22_in_inby1161); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal201_tree = (Object)adaptor.create(string_literal201);
            adaptor.addChild(root_0, string_literal201_tree);
            }
            dbg.location(134,14);
            TOKEN202=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inby1163); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN202_tree = (Object)adaptor.create(TOKEN202);
            adaptor.addChild(root_0, TOKEN202_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:135:1: invia : 'IN-VIA' TOKEN ;
    public final ChemicalChunkerParser.invia_return invia() throws RecognitionException {
        ChemicalChunkerParser.invia_return retval = new ChemicalChunkerParser.invia_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal203=null;
        Token TOKEN204=null;

        Object string_literal203_tree=null;
        Object TOKEN204_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "invia");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:135:6: ( 'IN-VIA' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:135:7: 'IN-VIA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(135,7);
            string_literal203=(Token)match(input,23,FOLLOW_23_in_invia1168); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal203_tree = (Object)adaptor.create(string_literal203);
            adaptor.addChild(root_0, string_literal203_tree);
            }
            dbg.location(135,16);
            TOKEN204=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_invia1170); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN204_tree = (Object)adaptor.create(TOKEN204);
            adaptor.addChild(root_0, TOKEN204_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(135, 21);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:136:1: inof : 'IN-OF' TOKEN ;
    public final ChemicalChunkerParser.inof_return inof() throws RecognitionException {
        ChemicalChunkerParser.inof_return retval = new ChemicalChunkerParser.inof_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal205=null;
        Token TOKEN206=null;

        Object string_literal205_tree=null;
        Object TOKEN206_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inof");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:136:5: ( 'IN-OF' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:136:6: 'IN-OF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(136,6);
            string_literal205=(Token)match(input,24,FOLLOW_24_in_inof1175); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal205_tree = (Object)adaptor.create(string_literal205);
            adaptor.addChild(root_0, string_literal205_tree);
            }
            dbg.location(136,14);
            TOKEN206=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inof1177); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN206_tree = (Object)adaptor.create(TOKEN206);
            adaptor.addChild(root_0, TOKEN206_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:137:1: inon : 'IN-ON' TOKEN ;
    public final ChemicalChunkerParser.inon_return inon() throws RecognitionException {
        ChemicalChunkerParser.inon_return retval = new ChemicalChunkerParser.inon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal207=null;
        Token TOKEN208=null;

        Object string_literal207_tree=null;
        Object TOKEN208_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:137:5: ( 'IN-ON' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:137:6: 'IN-ON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(137,6);
            string_literal207=(Token)match(input,25,FOLLOW_25_in_inon1182); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal207_tree = (Object)adaptor.create(string_literal207);
            adaptor.addChild(root_0, string_literal207_tree);
            }
            dbg.location(137,14);
            TOKEN208=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inon1184); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN208_tree = (Object)adaptor.create(TOKEN208);
            adaptor.addChild(root_0, TOKEN208_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(137, 19);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:138:1: infor : 'IN-FOR' TOKEN ;
    public final ChemicalChunkerParser.infor_return infor() throws RecognitionException {
        ChemicalChunkerParser.infor_return retval = new ChemicalChunkerParser.infor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal209=null;
        Token TOKEN210=null;

        Object string_literal209_tree=null;
        Object TOKEN210_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:138:6: ( 'IN-FOR' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:138:7: 'IN-FOR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(138,7);
            string_literal209=(Token)match(input,26,FOLLOW_26_in_infor1189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal209_tree = (Object)adaptor.create(string_literal209);
            adaptor.addChild(root_0, string_literal209_tree);
            }
            dbg.location(138,16);
            TOKEN210=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infor1191); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN210_tree = (Object)adaptor.create(TOKEN210);
            adaptor.addChild(root_0, TOKEN210_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(138, 21);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:139:1: infrom : 'IN-FROM' TOKEN ;
    public final ChemicalChunkerParser.infrom_return infrom() throws RecognitionException {
        ChemicalChunkerParser.infrom_return retval = new ChemicalChunkerParser.infrom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal211=null;
        Token TOKEN212=null;

        Object string_literal211_tree=null;
        Object TOKEN212_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "infrom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:139:7: ( 'IN-FROM' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:139:8: 'IN-FROM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,8);
            string_literal211=(Token)match(input,27,FOLLOW_27_in_infrom1196); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal211_tree = (Object)adaptor.create(string_literal211);
            adaptor.addChild(root_0, string_literal211_tree);
            }
            dbg.location(139,18);
            TOKEN212=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infrom1198); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN212_tree = (Object)adaptor.create(TOKEN212);
            adaptor.addChild(root_0, TOKEN212_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:140:1: inunder : 'IN-UNDER' TOKEN ;
    public final ChemicalChunkerParser.inunder_return inunder() throws RecognitionException {
        ChemicalChunkerParser.inunder_return retval = new ChemicalChunkerParser.inunder_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal213=null;
        Token TOKEN214=null;

        Object string_literal213_tree=null;
        Object TOKEN214_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inunder");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:140:8: ( 'IN-UNDER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:140:9: 'IN-UNDER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(140,9);
            string_literal213=(Token)match(input,28,FOLLOW_28_in_inunder1203); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal213_tree = (Object)adaptor.create(string_literal213);
            adaptor.addChild(root_0, string_literal213_tree);
            }
            dbg.location(140,20);
            TOKEN214=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inunder1205); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN214_tree = (Object)adaptor.create(TOKEN214);
            adaptor.addChild(root_0, TOKEN214_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(140, 25);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:141:1: inover : 'IN-OVER' TOKEN ;
    public final ChemicalChunkerParser.inover_return inover() throws RecognitionException {
        ChemicalChunkerParser.inover_return retval = new ChemicalChunkerParser.inover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal215=null;
        Token TOKEN216=null;

        Object string_literal215_tree=null;
        Object TOKEN216_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:141:7: ( 'IN-OVER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:141:8: 'IN-OVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(141,8);
            string_literal215=(Token)match(input,29,FOLLOW_29_in_inover1210); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal215_tree = (Object)adaptor.create(string_literal215);
            adaptor.addChild(root_0, string_literal215_tree);
            }
            dbg.location(141,18);
            TOKEN216=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inover1212); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN216_tree = (Object)adaptor.create(TOKEN216);
            adaptor.addChild(root_0, TOKEN216_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(141, 23);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:142:1: inoff : 'IN-OFF' TOKEN ;
    public final ChemicalChunkerParser.inoff_return inoff() throws RecognitionException {
        ChemicalChunkerParser.inoff_return retval = new ChemicalChunkerParser.inoff_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal217=null;
        Token TOKEN218=null;

        Object string_literal217_tree=null;
        Object TOKEN218_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inoff");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:142:6: ( 'IN-OFF' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:142:7: 'IN-OFF' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(142,7);
            string_literal217=(Token)match(input,30,FOLLOW_30_in_inoff1217); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal217_tree = (Object)adaptor.create(string_literal217);
            adaptor.addChild(root_0, string_literal217_tree);
            }
            dbg.location(142,16);
            TOKEN218=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inoff1219); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN218_tree = (Object)adaptor.create(TOKEN218);
            adaptor.addChild(root_0, TOKEN218_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(142, 21);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:145:1: nnstate : 'NN-STATE' TOKEN ;
    public final ChemicalChunkerParser.nnstate_return nnstate() throws RecognitionException {
        ChemicalChunkerParser.nnstate_return retval = new ChemicalChunkerParser.nnstate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal219=null;
        Token TOKEN220=null;

        Object string_literal219_tree=null;
        Object TOKEN220_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnstate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:145:8: ( 'NN-STATE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:145:9: 'NN-STATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(145,9);
            string_literal219=(Token)match(input,31,FOLLOW_31_in_nnstate1226); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal219_tree = (Object)adaptor.create(string_literal219);
            adaptor.addChild(root_0, string_literal219_tree);
            }
            dbg.location(145,20);
            TOKEN220=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnstate1228); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN220_tree = (Object)adaptor.create(TOKEN220);
            adaptor.addChild(root_0, TOKEN220_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:146:1: nntime : 'NN-TIME' TOKEN ;
    public final ChemicalChunkerParser.nntime_return nntime() throws RecognitionException {
        ChemicalChunkerParser.nntime_return retval = new ChemicalChunkerParser.nntime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal221=null;
        Token TOKEN222=null;

        Object string_literal221_tree=null;
        Object TOKEN222_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:146:7: ( 'NN-TIME' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:146:8: 'NN-TIME' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(146,8);
            string_literal221=(Token)match(input,32,FOLLOW_32_in_nntime1233); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal221_tree = (Object)adaptor.create(string_literal221);
            adaptor.addChild(root_0, string_literal221_tree);
            }
            dbg.location(146,18);
            TOKEN222=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntime1235); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN222_tree = (Object)adaptor.create(TOKEN222);
            adaptor.addChild(root_0, TOKEN222_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:147:1: nngram : 'NN-GRAM' TOKEN ;
    public final ChemicalChunkerParser.nngram_return nngram() throws RecognitionException {
        ChemicalChunkerParser.nngram_return retval = new ChemicalChunkerParser.nngram_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal223=null;
        Token TOKEN224=null;

        Object string_literal223_tree=null;
        Object TOKEN224_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:147:7: ( 'NN-GRAM' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:147:8: 'NN-GRAM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(147,8);
            string_literal223=(Token)match(input,33,FOLLOW_33_in_nngram1240); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal223_tree = (Object)adaptor.create(string_literal223);
            adaptor.addChild(root_0, string_literal223_tree);
            }
            dbg.location(147,18);
            TOKEN224=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngram1242); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN224_tree = (Object)adaptor.create(TOKEN224);
            adaptor.addChild(root_0, TOKEN224_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(147, 23);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:148:1: nnmol : 'NN-MOL' TOKEN ;
    public final ChemicalChunkerParser.nnmol_return nnmol() throws RecognitionException {
        ChemicalChunkerParser.nnmol_return retval = new ChemicalChunkerParser.nnmol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal225=null;
        Token TOKEN226=null;

        Object string_literal225_tree=null;
        Object TOKEN226_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:148:6: ( 'NN-MOL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:148:7: 'NN-MOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(148,7);
            string_literal225=(Token)match(input,34,FOLLOW_34_in_nnmol1247); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal225_tree = (Object)adaptor.create(string_literal225);
            adaptor.addChild(root_0, string_literal225_tree);
            }
            dbg.location(148,16);
            TOKEN226=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmol1249); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN226_tree = (Object)adaptor.create(TOKEN226);
            adaptor.addChild(root_0, TOKEN226_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:149:1: nnatmosphere : 'NN-ATMOSPHERE' TOKEN ;
    public final ChemicalChunkerParser.nnatmosphere_return nnatmosphere() throws RecognitionException {
        ChemicalChunkerParser.nnatmosphere_return retval = new ChemicalChunkerParser.nnatmosphere_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal227=null;
        Token TOKEN228=null;

        Object string_literal227_tree=null;
        Object TOKEN228_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnatmosphere");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:149:13: ( 'NN-ATMOSPHERE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:149:14: 'NN-ATMOSPHERE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(149,14);
            string_literal227=(Token)match(input,35,FOLLOW_35_in_nnatmosphere1254); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal227_tree = (Object)adaptor.create(string_literal227);
            adaptor.addChild(root_0, string_literal227_tree);
            }
            dbg.location(149,30);
            TOKEN228=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnatmosphere1256); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN228_tree = (Object)adaptor.create(TOKEN228);
            adaptor.addChild(root_0, TOKEN228_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(149, 35);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:150:1: nneq : 'NN-EQ' TOKEN ;
    public final ChemicalChunkerParser.nneq_return nneq() throws RecognitionException {
        ChemicalChunkerParser.nneq_return retval = new ChemicalChunkerParser.nneq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal229=null;
        Token TOKEN230=null;

        Object string_literal229_tree=null;
        Object TOKEN230_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nneq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:150:5: ( 'NN-EQ' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:150:6: 'NN-EQ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(150,6);
            string_literal229=(Token)match(input,36,FOLLOW_36_in_nneq1261); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal229_tree = (Object)adaptor.create(string_literal229);
            adaptor.addChild(root_0, string_literal229_tree);
            }
            dbg.location(150,14);
            TOKEN230=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nneq1263); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN230_tree = (Object)adaptor.create(TOKEN230);
            adaptor.addChild(root_0, TOKEN230_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(150, 19);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:151:1: nnvol : 'NN-VOL' TOKEN ;
    public final ChemicalChunkerParser.nnvol_return nnvol() throws RecognitionException {
        ChemicalChunkerParser.nnvol_return retval = new ChemicalChunkerParser.nnvol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal231=null;
        Token TOKEN232=null;

        Object string_literal231_tree=null;
        Object TOKEN232_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:151:6: ( 'NN-VOL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:151:7: 'NN-VOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(151,7);
            string_literal231=(Token)match(input,37,FOLLOW_37_in_nnvol1268); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal231_tree = (Object)adaptor.create(string_literal231);
            adaptor.addChild(root_0, string_literal231_tree);
            }
            dbg.location(151,16);
            TOKEN232=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvol1270); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN232_tree = (Object)adaptor.create(TOKEN232);
            adaptor.addChild(root_0, TOKEN232_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(151, 21);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:152:1: nnchementity : 'NN-CHEMENTITY' TOKEN ;
    public final ChemicalChunkerParser.nnchementity_return nnchementity() throws RecognitionException {
        ChemicalChunkerParser.nnchementity_return retval = new ChemicalChunkerParser.nnchementity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal233=null;
        Token TOKEN234=null;

        Object string_literal233_tree=null;
        Object TOKEN234_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchementity");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:152:13: ( 'NN-CHEMENTITY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:152:14: 'NN-CHEMENTITY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(152,14);
            string_literal233=(Token)match(input,38,FOLLOW_38_in_nnchementity1275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal233_tree = (Object)adaptor.create(string_literal233);
            adaptor.addChild(root_0, string_literal233_tree);
            }
            dbg.location(152,30);
            TOKEN234=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchementity1277); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN234_tree = (Object)adaptor.create(TOKEN234);
            adaptor.addChild(root_0, TOKEN234_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(152, 35);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:153:1: nntemp : 'NN-TEMP' TOKEN ;
    public final ChemicalChunkerParser.nntemp_return nntemp() throws RecognitionException {
        ChemicalChunkerParser.nntemp_return retval = new ChemicalChunkerParser.nntemp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal235=null;
        Token TOKEN236=null;

        Object string_literal235_tree=null;
        Object TOKEN236_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:153:7: ( 'NN-TEMP' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:153:8: 'NN-TEMP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(153,8);
            string_literal235=(Token)match(input,39,FOLLOW_39_in_nntemp1282); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal235_tree = (Object)adaptor.create(string_literal235);
            adaptor.addChild(root_0, string_literal235_tree);
            }
            dbg.location(153,18);
            TOKEN236=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntemp1284); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN236_tree = (Object)adaptor.create(TOKEN236);
            adaptor.addChild(root_0, TOKEN236_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(153, 23);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:154:1: nnflash : 'NN-FLASH' TOKEN ;
    public final ChemicalChunkerParser.nnflash_return nnflash() throws RecognitionException {
        ChemicalChunkerParser.nnflash_return retval = new ChemicalChunkerParser.nnflash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal237=null;
        Token TOKEN238=null;

        Object string_literal237_tree=null;
        Object TOKEN238_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnflash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:154:8: ( 'NN-FLASH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:154:9: 'NN-FLASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(154,9);
            string_literal237=(Token)match(input,40,FOLLOW_40_in_nnflash1289); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal237_tree = (Object)adaptor.create(string_literal237);
            adaptor.addChild(root_0, string_literal237_tree);
            }
            dbg.location(154,20);
            TOKEN238=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnflash1291); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN238_tree = (Object)adaptor.create(TOKEN238);
            adaptor.addChild(root_0, TOKEN238_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(154, 25);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:155:1: nngeneral : 'NN-GENERAL' TOKEN ;
    public final ChemicalChunkerParser.nngeneral_return nngeneral() throws RecognitionException {
        ChemicalChunkerParser.nngeneral_return retval = new ChemicalChunkerParser.nngeneral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal239=null;
        Token TOKEN240=null;

        Object string_literal239_tree=null;
        Object TOKEN240_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nngeneral");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:155:10: ( 'NN-GENERAL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:155:11: 'NN-GENERAL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(155,11);
            string_literal239=(Token)match(input,41,FOLLOW_41_in_nngeneral1296); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal239_tree = (Object)adaptor.create(string_literal239);
            adaptor.addChild(root_0, string_literal239_tree);
            }
            dbg.location(155,24);
            TOKEN240=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngeneral1298); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN240_tree = (Object)adaptor.create(TOKEN240);
            adaptor.addChild(root_0, TOKEN240_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:156:1: nnmethod : 'NN-METHOD' TOKEN ;
    public final ChemicalChunkerParser.nnmethod_return nnmethod() throws RecognitionException {
        ChemicalChunkerParser.nnmethod_return retval = new ChemicalChunkerParser.nnmethod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal241=null;
        Token TOKEN242=null;

        Object string_literal241_tree=null;
        Object TOKEN242_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmethod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:156:9: ( 'NN-METHOD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:156:10: 'NN-METHOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,10);
            string_literal241=(Token)match(input,42,FOLLOW_42_in_nnmethod1303); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal241_tree = (Object)adaptor.create(string_literal241);
            adaptor.addChild(root_0, string_literal241_tree);
            }
            dbg.location(156,22);
            TOKEN242=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmethod1305); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN242_tree = (Object)adaptor.create(TOKEN242);
            adaptor.addChild(root_0, TOKEN242_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:157:1: nnamount : 'NN-AMOUNT' TOKEN ;
    public final ChemicalChunkerParser.nnamount_return nnamount() throws RecognitionException {
        ChemicalChunkerParser.nnamount_return retval = new ChemicalChunkerParser.nnamount_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal243=null;
        Token TOKEN244=null;

        Object string_literal243_tree=null;
        Object TOKEN244_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:157:9: ( 'NN-AMOUNT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:157:10: 'NN-AMOUNT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(157,10);
            string_literal243=(Token)match(input,43,FOLLOW_43_in_nnamount1310); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal243_tree = (Object)adaptor.create(string_literal243);
            adaptor.addChild(root_0, string_literal243_tree);
            }
            dbg.location(157,22);
            TOKEN244=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnamount1312); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN244_tree = (Object)adaptor.create(TOKEN244);
            adaptor.addChild(root_0, TOKEN244_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:158:1: nnpressure : 'NN-PRESSURE' TOKEN ;
    public final ChemicalChunkerParser.nnpressure_return nnpressure() throws RecognitionException {
        ChemicalChunkerParser.nnpressure_return retval = new ChemicalChunkerParser.nnpressure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal245=null;
        Token TOKEN246=null;

        Object string_literal245_tree=null;
        Object TOKEN246_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpressure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:158:11: ( 'NN-PRESSURE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:158:12: 'NN-PRESSURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(158,12);
            string_literal245=(Token)match(input,44,FOLLOW_44_in_nnpressure1317); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal245_tree = (Object)adaptor.create(string_literal245);
            adaptor.addChild(root_0, string_literal245_tree);
            }
            dbg.location(158,26);
            TOKEN246=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpressure1319); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN246_tree = (Object)adaptor.create(TOKEN246);
            adaptor.addChild(root_0, TOKEN246_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(158, 31);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:159:1: nncolumn : 'NN-COLUMN' TOKEN ;
    public final ChemicalChunkerParser.nncolumn_return nncolumn() throws RecognitionException {
        ChemicalChunkerParser.nncolumn_return retval = new ChemicalChunkerParser.nncolumn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal247=null;
        Token TOKEN248=null;

        Object string_literal247_tree=null;
        Object TOKEN248_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncolumn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:159:9: ( 'NN-COLUMN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:159:10: 'NN-COLUMN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(159,10);
            string_literal247=(Token)match(input,45,FOLLOW_45_in_nncolumn1324); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal247_tree = (Object)adaptor.create(string_literal247);
            adaptor.addChild(root_0, string_literal247_tree);
            }
            dbg.location(159,22);
            TOKEN248=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncolumn1326); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN248_tree = (Object)adaptor.create(TOKEN248);
            adaptor.addChild(root_0, TOKEN248_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:160:1: nnchromatography : 'NN-CHROMATOGRAPHY' TOKEN ;
    public final ChemicalChunkerParser.nnchromatography_return nnchromatography() throws RecognitionException {
        ChemicalChunkerParser.nnchromatography_return retval = new ChemicalChunkerParser.nnchromatography_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal249=null;
        Token TOKEN250=null;

        Object string_literal249_tree=null;
        Object TOKEN250_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchromatography");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:160:17: ( 'NN-CHROMATOGRAPHY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:160:18: 'NN-CHROMATOGRAPHY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(160,18);
            string_literal249=(Token)match(input,46,FOLLOW_46_in_nnchromatography1331); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal249_tree = (Object)adaptor.create(string_literal249);
            adaptor.addChild(root_0, string_literal249_tree);
            }
            dbg.location(160,38);
            TOKEN250=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchromatography1333); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN250_tree = (Object)adaptor.create(TOKEN250);
            adaptor.addChild(root_0, TOKEN250_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(160, 43);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:161:1: nnvacuum : 'NN-VACUUM' TOKEN ;
    public final ChemicalChunkerParser.nnvacuum_return nnvacuum() throws RecognitionException {
        ChemicalChunkerParser.nnvacuum_return retval = new ChemicalChunkerParser.nnvacuum_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal251=null;
        Token TOKEN252=null;

        Object string_literal251_tree=null;
        Object TOKEN252_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvacuum");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:161:9: ( 'NN-VACUUM' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:161:10: 'NN-VACUUM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(161,10);
            string_literal251=(Token)match(input,47,FOLLOW_47_in_nnvacuum1338); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal251_tree = (Object)adaptor.create(string_literal251);
            adaptor.addChild(root_0, string_literal251_tree);
            }
            dbg.location(161,22);
            TOKEN252=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvacuum1340); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN252_tree = (Object)adaptor.create(TOKEN252);
            adaptor.addChild(root_0, TOKEN252_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(161, 27);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:162:1: nncycle : 'NN-CYCLE' TOKEN ;
    public final ChemicalChunkerParser.nncycle_return nncycle() throws RecognitionException {
        ChemicalChunkerParser.nncycle_return retval = new ChemicalChunkerParser.nncycle_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal253=null;
        Token TOKEN254=null;

        Object string_literal253_tree=null;
        Object TOKEN254_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nncycle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(162, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:162:8: ( 'NN-CYCLE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:162:9: 'NN-CYCLE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(162,9);
            string_literal253=(Token)match(input,48,FOLLOW_48_in_nncycle1345); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal253_tree = (Object)adaptor.create(string_literal253);
            adaptor.addChild(root_0, string_literal253_tree);
            }
            dbg.location(162,20);
            TOKEN254=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncycle1347); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN254_tree = (Object)adaptor.create(TOKEN254);
            adaptor.addChild(root_0, TOKEN254_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:163:1: nntimes : 'NN-TIMES' TOKEN ;
    public final ChemicalChunkerParser.nntimes_return nntimes() throws RecognitionException {
        ChemicalChunkerParser.nntimes_return retval = new ChemicalChunkerParser.nntimes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal255=null;
        Token TOKEN256=null;

        Object string_literal255_tree=null;
        Object TOKEN256_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nntimes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:163:8: ( 'NN-TIMES' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:163:9: 'NN-TIMES' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(163,9);
            string_literal255=(Token)match(input,49,FOLLOW_49_in_nntimes1352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal255_tree = (Object)adaptor.create(string_literal255);
            adaptor.addChild(root_0, string_literal255_tree);
            }
            dbg.location(163,20);
            TOKEN256=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntimes1354); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN256_tree = (Object)adaptor.create(TOKEN256);
            adaptor.addChild(root_0, TOKEN256_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(163, 25);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:166:1: oscarcm : 'OSCAR-CM' TOKEN ;
    public final ChemicalChunkerParser.oscarcm_return oscarcm() throws RecognitionException {
        ChemicalChunkerParser.oscarcm_return retval = new ChemicalChunkerParser.oscarcm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal257=null;
        Token TOKEN258=null;

        Object string_literal257_tree=null;
        Object TOKEN258_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:166:8: ( 'OSCAR-CM' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:166:9: 'OSCAR-CM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(166,9);
            string_literal257=(Token)match(input,50,FOLLOW_50_in_oscarcm1361); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal257_tree = (Object)adaptor.create(string_literal257);
            adaptor.addChild(root_0, string_literal257_tree);
            }
            dbg.location(166,20);
            TOKEN258=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcm1363); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN258_tree = (Object)adaptor.create(TOKEN258);
            adaptor.addChild(root_0, TOKEN258_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(166, 25);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:169:1: vbuse : 'VB-USE' TOKEN ;
    public final ChemicalChunkerParser.vbuse_return vbuse() throws RecognitionException {
        ChemicalChunkerParser.vbuse_return retval = new ChemicalChunkerParser.vbuse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal259=null;
        Token TOKEN260=null;

        Object string_literal259_tree=null;
        Object TOKEN260_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbuse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:169:6: ( 'VB-USE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:169:7: 'VB-USE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(169,7);
            string_literal259=(Token)match(input,51,FOLLOW_51_in_vbuse1370); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal259_tree = (Object)adaptor.create(string_literal259);
            adaptor.addChild(root_0, string_literal259_tree);
            }
            dbg.location(169,16);
            TOKEN260=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbuse1372); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN260_tree = (Object)adaptor.create(TOKEN260);
            adaptor.addChild(root_0, TOKEN260_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(169, 21);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:170:1: vbchange : 'VB-CHANGE' TOKEN ;
    public final ChemicalChunkerParser.vbchange_return vbchange() throws RecognitionException {
        ChemicalChunkerParser.vbchange_return retval = new ChemicalChunkerParser.vbchange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal261=null;
        Token TOKEN262=null;

        Object string_literal261_tree=null;
        Object TOKEN262_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbchange");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:170:9: ( 'VB-CHANGE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:170:10: 'VB-CHANGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(170,10);
            string_literal261=(Token)match(input,52,FOLLOW_52_in_vbchange1377); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal261_tree = (Object)adaptor.create(string_literal261);
            adaptor.addChild(root_0, string_literal261_tree);
            }
            dbg.location(170,22);
            TOKEN262=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbchange1379); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN262_tree = (Object)adaptor.create(TOKEN262);
            adaptor.addChild(root_0, TOKEN262_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(170, 27);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:171:1: vbsubmerge : 'VB-SUBMERGE' TOKEN ;
    public final ChemicalChunkerParser.vbsubmerge_return vbsubmerge() throws RecognitionException {
        ChemicalChunkerParser.vbsubmerge_return retval = new ChemicalChunkerParser.vbsubmerge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal263=null;
        Token TOKEN264=null;

        Object string_literal263_tree=null;
        Object TOKEN264_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubmerge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:171:11: ( 'VB-SUBMERGE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:171:12: 'VB-SUBMERGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(171,12);
            string_literal263=(Token)match(input,53,FOLLOW_53_in_vbsubmerge1384); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal263_tree = (Object)adaptor.create(string_literal263);
            adaptor.addChild(root_0, string_literal263_tree);
            }
            dbg.location(171,26);
            TOKEN264=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubmerge1386); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN264_tree = (Object)adaptor.create(TOKEN264);
            adaptor.addChild(root_0, TOKEN264_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(171, 31);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:172:1: vbsubject : 'VB-SUBJECT' TOKEN ;
    public final ChemicalChunkerParser.vbsubject_return vbsubject() throws RecognitionException {
        ChemicalChunkerParser.vbsubject_return retval = new ChemicalChunkerParser.vbsubject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal265=null;
        Token TOKEN266=null;

        Object string_literal265_tree=null;
        Object TOKEN266_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubject");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:172:10: ( 'VB-SUBJECT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:172:11: 'VB-SUBJECT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(172,11);
            string_literal265=(Token)match(input,54,FOLLOW_54_in_vbsubject1391); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal265_tree = (Object)adaptor.create(string_literal265);
            adaptor.addChild(root_0, string_literal265_tree);
            }
            dbg.location(172,24);
            TOKEN266=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubject1393); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN266_tree = (Object)adaptor.create(TOKEN266);
            adaptor.addChild(root_0, TOKEN266_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(172, 29);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:175:1: nnadd : 'NN-ADD' TOKEN ;
    public final ChemicalChunkerParser.nnadd_return nnadd() throws RecognitionException {
        ChemicalChunkerParser.nnadd_return retval = new ChemicalChunkerParser.nnadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal267=null;
        Token TOKEN268=null;

        Object string_literal267_tree=null;
        Object TOKEN268_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:175:6: ( 'NN-ADD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:175:7: 'NN-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(175,7);
            string_literal267=(Token)match(input,55,FOLLOW_55_in_nnadd1400); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal267_tree = (Object)adaptor.create(string_literal267);
            adaptor.addChild(root_0, string_literal267_tree);
            }
            dbg.location(175,16);
            TOKEN268=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnadd1402); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN268_tree = (Object)adaptor.create(TOKEN268);
            adaptor.addChild(root_0, TOKEN268_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:176:1: nnmixture : 'NN-MIXTURE' TOKEN ;
    public final ChemicalChunkerParser.nnmixture_return nnmixture() throws RecognitionException {
        ChemicalChunkerParser.nnmixture_return retval = new ChemicalChunkerParser.nnmixture_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal269=null;
        Token TOKEN270=null;

        Object string_literal269_tree=null;
        Object TOKEN270_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:176:10: ( 'NN-MIXTURE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:176:11: 'NN-MIXTURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(176,11);
            string_literal269=(Token)match(input,56,FOLLOW_56_in_nnmixture1407); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal269_tree = (Object)adaptor.create(string_literal269);
            adaptor.addChild(root_0, string_literal269_tree);
            }
            dbg.location(176,24);
            TOKEN270=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmixture1409); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN270_tree = (Object)adaptor.create(TOKEN270);
            adaptor.addChild(root_0, TOKEN270_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(176, 29);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:177:1: vbadd : 'VB-ADD' TOKEN ;
    public final ChemicalChunkerParser.vbadd_return vbadd() throws RecognitionException {
        ChemicalChunkerParser.vbadd_return retval = new ChemicalChunkerParser.vbadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal271=null;
        Token TOKEN272=null;

        Object string_literal271_tree=null;
        Object TOKEN272_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:177:6: ( 'VB-ADD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:177:7: 'VB-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(177,7);
            string_literal271=(Token)match(input,57,FOLLOW_57_in_vbadd1414); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal271_tree = (Object)adaptor.create(string_literal271);
            adaptor.addChild(root_0, string_literal271_tree);
            }
            dbg.location(177,16);
            TOKEN272=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbadd1416); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN272_tree = (Object)adaptor.create(TOKEN272);
            adaptor.addChild(root_0, TOKEN272_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(177, 21);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:178:1: vbcharge : 'VB-CHARGE' TOKEN ;
    public final ChemicalChunkerParser.vbcharge_return vbcharge() throws RecognitionException {
        ChemicalChunkerParser.vbcharge_return retval = new ChemicalChunkerParser.vbcharge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal273=null;
        Token TOKEN274=null;

        Object string_literal273_tree=null;
        Object TOKEN274_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcharge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:178:9: ( 'VB-CHARGE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:178:10: 'VB-CHARGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(178,10);
            string_literal273=(Token)match(input,58,FOLLOW_58_in_vbcharge1421); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal273_tree = (Object)adaptor.create(string_literal273);
            adaptor.addChild(root_0, string_literal273_tree);
            }
            dbg.location(178,22);
            TOKEN274=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcharge1423); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN274_tree = (Object)adaptor.create(TOKEN274);
            adaptor.addChild(root_0, TOKEN274_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(178, 27);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:179:1: vbcontain : 'VB-CONTAIN' TOKEN ;
    public final ChemicalChunkerParser.vbcontain_return vbcontain() throws RecognitionException {
        ChemicalChunkerParser.vbcontain_return retval = new ChemicalChunkerParser.vbcontain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal275=null;
        Token TOKEN276=null;

        Object string_literal275_tree=null;
        Object TOKEN276_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcontain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:179:10: ( 'VB-CONTAIN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:179:11: 'VB-CONTAIN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(179,11);
            string_literal275=(Token)match(input,59,FOLLOW_59_in_vbcontain1428); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal275_tree = (Object)adaptor.create(string_literal275);
            adaptor.addChild(root_0, string_literal275_tree);
            }
            dbg.location(179,24);
            TOKEN276=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcontain1430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN276_tree = (Object)adaptor.create(TOKEN276);
            adaptor.addChild(root_0, TOKEN276_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(179, 29);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:180:1: vbdrop : 'VB-DROP' TOKEN ;
    public final ChemicalChunkerParser.vbdrop_return vbdrop() throws RecognitionException {
        ChemicalChunkerParser.vbdrop_return retval = new ChemicalChunkerParser.vbdrop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal277=null;
        Token TOKEN278=null;

        Object string_literal277_tree=null;
        Object TOKEN278_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdrop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:180:7: ( 'VB-DROP' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:180:8: 'VB-DROP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(180,8);
            string_literal277=(Token)match(input,60,FOLLOW_60_in_vbdrop1435); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal277_tree = (Object)adaptor.create(string_literal277);
            adaptor.addChild(root_0, string_literal277_tree);
            }
            dbg.location(180,18);
            TOKEN278=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdrop1437); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN278_tree = (Object)adaptor.create(TOKEN278);
            adaptor.addChild(root_0, TOKEN278_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:181:1: vbfill : 'VB-FILL' TOKEN ;
    public final ChemicalChunkerParser.vbfill_return vbfill() throws RecognitionException {
        ChemicalChunkerParser.vbfill_return retval = new ChemicalChunkerParser.vbfill_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal279=null;
        Token TOKEN280=null;

        Object string_literal279_tree=null;
        Object TOKEN280_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfill");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(181, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:181:7: ( 'VB-FILL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:181:8: 'VB-FILL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(181,8);
            string_literal279=(Token)match(input,61,FOLLOW_61_in_vbfill1442); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal279_tree = (Object)adaptor.create(string_literal279);
            adaptor.addChild(root_0, string_literal279_tree);
            }
            dbg.location(181,18);
            TOKEN280=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfill1444); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN280_tree = (Object)adaptor.create(TOKEN280);
            adaptor.addChild(root_0, TOKEN280_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(181, 23);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:182:1: vbsuspend : 'VB-SUSPEND' TOKEN ;
    public final ChemicalChunkerParser.vbsuspend_return vbsuspend() throws RecognitionException {
        ChemicalChunkerParser.vbsuspend_return retval = new ChemicalChunkerParser.vbsuspend_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal281=null;
        Token TOKEN282=null;

        Object string_literal281_tree=null;
        Object TOKEN282_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsuspend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:182:10: ( 'VB-SUSPEND' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:182:11: 'VB-SUSPEND' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(182,11);
            string_literal281=(Token)match(input,62,FOLLOW_62_in_vbsuspend1449); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal281_tree = (Object)adaptor.create(string_literal281);
            adaptor.addChild(root_0, string_literal281_tree);
            }
            dbg.location(182,24);
            TOKEN282=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsuspend1451); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN282_tree = (Object)adaptor.create(TOKEN282);
            adaptor.addChild(root_0, TOKEN282_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:183:1: vbtreat : 'VB-TREAT' TOKEN ;
    public final ChemicalChunkerParser.vbtreat_return vbtreat() throws RecognitionException {
        ChemicalChunkerParser.vbtreat_return retval = new ChemicalChunkerParser.vbtreat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal283=null;
        Token TOKEN284=null;

        Object string_literal283_tree=null;
        Object TOKEN284_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtreat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:183:8: ( 'VB-TREAT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:183:9: 'VB-TREAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(183,9);
            string_literal283=(Token)match(input,63,FOLLOW_63_in_vbtreat1456); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal283_tree = (Object)adaptor.create(string_literal283);
            adaptor.addChild(root_0, string_literal283_tree);
            }
            dbg.location(183,20);
            TOKEN284=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtreat1458); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN284_tree = (Object)adaptor.create(TOKEN284);
            adaptor.addChild(root_0, TOKEN284_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(183, 25);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:186:1: vbapparatus : 'VB-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.vbapparatus_return vbapparatus() throws RecognitionException {
        ChemicalChunkerParser.vbapparatus_return retval = new ChemicalChunkerParser.vbapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal285=null;
        Token TOKEN286=null;

        Object string_literal285_tree=null;
        Object TOKEN286_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:186:12: ( 'VB-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:186:13: 'VB-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(186,13);
            string_literal285=(Token)match(input,64,FOLLOW_64_in_vbapparatus1465); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal285_tree = (Object)adaptor.create(string_literal285);
            adaptor.addChild(root_0, string_literal285_tree);
            }
            dbg.location(186,28);
            TOKEN286=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbapparatus1467); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN286_tree = (Object)adaptor.create(TOKEN286);
            adaptor.addChild(root_0, TOKEN286_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:187:1: nnapparatus : 'NN-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.nnapparatus_return nnapparatus() throws RecognitionException {
        ChemicalChunkerParser.nnapparatus_return retval = new ChemicalChunkerParser.nnapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal287=null;
        Token TOKEN288=null;

        Object string_literal287_tree=null;
        Object TOKEN288_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:187:12: ( 'NN-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:187:13: 'NN-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(187,13);
            string_literal287=(Token)match(input,65,FOLLOW_65_in_nnapparatus1472); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal287_tree = (Object)adaptor.create(string_literal287);
            adaptor.addChild(root_0, string_literal287_tree);
            }
            dbg.location(187,28);
            TOKEN288=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnapparatus1474); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN288_tree = (Object)adaptor.create(TOKEN288);
            adaptor.addChild(root_0, TOKEN288_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(187, 33);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:190:1: vbconcentrate : 'VB-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.vbconcentrate_return vbconcentrate() throws RecognitionException {
        ChemicalChunkerParser.vbconcentrate_return retval = new ChemicalChunkerParser.vbconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal289=null;
        Token TOKEN290=null;

        Object string_literal289_tree=null;
        Object TOKEN290_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:190:14: ( 'VB-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:190:15: 'VB-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(190,15);
            string_literal289=(Token)match(input,66,FOLLOW_66_in_vbconcentrate1481); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal289_tree = (Object)adaptor.create(string_literal289);
            adaptor.addChild(root_0, string_literal289_tree);
            }
            dbg.location(190,32);
            TOKEN290=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbconcentrate1483); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN290_tree = (Object)adaptor.create(TOKEN290);
            adaptor.addChild(root_0, TOKEN290_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:191:1: nnconcentrate : 'NN-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.nnconcentrate_return nnconcentrate() throws RecognitionException {
        ChemicalChunkerParser.nnconcentrate_return retval = new ChemicalChunkerParser.nnconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal291=null;
        Token TOKEN292=null;

        Object string_literal291_tree=null;
        Object TOKEN292_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:191:14: ( 'NN-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:191:15: 'NN-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(191,15);
            string_literal291=(Token)match(input,67,FOLLOW_67_in_nnconcentrate1488); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal291_tree = (Object)adaptor.create(string_literal291);
            adaptor.addChild(root_0, string_literal291_tree);
            }
            dbg.location(191,32);
            TOKEN292=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnconcentrate1490); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN292_tree = (Object)adaptor.create(TOKEN292);
            adaptor.addChild(root_0, TOKEN292_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(191, 37);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:194:1: vbcool : 'VB-COOL' TOKEN ;
    public final ChemicalChunkerParser.vbcool_return vbcool() throws RecognitionException {
        ChemicalChunkerParser.vbcool_return retval = new ChemicalChunkerParser.vbcool_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal293=null;
        Token TOKEN294=null;

        Object string_literal293_tree=null;
        Object TOKEN294_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:194:7: ( 'VB-COOL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:194:8: 'VB-COOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(194,8);
            string_literal293=(Token)match(input,68,FOLLOW_68_in_vbcool1497); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal293_tree = (Object)adaptor.create(string_literal293);
            adaptor.addChild(root_0, string_literal293_tree);
            }
            dbg.location(194,18);
            TOKEN294=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcool1499); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN294_tree = (Object)adaptor.create(TOKEN294);
            adaptor.addChild(root_0, TOKEN294_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:197:1: vbdegass : 'VB-DEGASS' TOKEN ;
    public final ChemicalChunkerParser.vbdegass_return vbdegass() throws RecognitionException {
        ChemicalChunkerParser.vbdegass_return retval = new ChemicalChunkerParser.vbdegass_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal295=null;
        Token TOKEN296=null;

        Object string_literal295_tree=null;
        Object TOKEN296_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdegass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(197, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:197:9: ( 'VB-DEGASS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:197:10: 'VB-DEGASS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(197,10);
            string_literal295=(Token)match(input,69,FOLLOW_69_in_vbdegass1506); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal295_tree = (Object)adaptor.create(string_literal295);
            adaptor.addChild(root_0, string_literal295_tree);
            }
            dbg.location(197,22);
            TOKEN296=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdegass1508); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN296_tree = (Object)adaptor.create(TOKEN296);
            adaptor.addChild(root_0, TOKEN296_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(197, 27);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:200:1: vbdissolve : 'VB-DISSOLVE' TOKEN ;
    public final ChemicalChunkerParser.vbdissolve_return vbdissolve() throws RecognitionException {
        ChemicalChunkerParser.vbdissolve_return retval = new ChemicalChunkerParser.vbdissolve_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal297=null;
        Token TOKEN298=null;

        Object string_literal297_tree=null;
        Object TOKEN298_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdissolve");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(200, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:200:11: ( 'VB-DISSOLVE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:200:12: 'VB-DISSOLVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(200,12);
            string_literal297=(Token)match(input,70,FOLLOW_70_in_vbdissolve1515); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal297_tree = (Object)adaptor.create(string_literal297);
            adaptor.addChild(root_0, string_literal297_tree);
            }
            dbg.location(200,26);
            TOKEN298=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdissolve1517); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN298_tree = (Object)adaptor.create(TOKEN298);
            adaptor.addChild(root_0, TOKEN298_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(200, 31);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:203:1: vbdry : 'VB-DRY' TOKEN ;
    public final ChemicalChunkerParser.vbdry_return vbdry() throws RecognitionException {
        ChemicalChunkerParser.vbdry_return retval = new ChemicalChunkerParser.vbdry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal299=null;
        Token TOKEN300=null;

        Object string_literal299_tree=null;
        Object TOKEN300_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(203, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:203:6: ( 'VB-DRY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:203:7: 'VB-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(203,7);
            string_literal299=(Token)match(input,71,FOLLOW_71_in_vbdry1524); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal299_tree = (Object)adaptor.create(string_literal299);
            adaptor.addChild(root_0, string_literal299_tree);
            }
            dbg.location(203,16);
            TOKEN300=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdry1526); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN300_tree = (Object)adaptor.create(TOKEN300);
            adaptor.addChild(root_0, TOKEN300_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:204:1: nndry : 'NN-DRY' TOKEN ;
    public final ChemicalChunkerParser.nndry_return nndry() throws RecognitionException {
        ChemicalChunkerParser.nndry_return retval = new ChemicalChunkerParser.nndry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal301=null;
        Token TOKEN302=null;

        Object string_literal301_tree=null;
        Object TOKEN302_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nndry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(204, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:204:6: ( 'NN-DRY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:204:7: 'NN-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(204,7);
            string_literal301=(Token)match(input,72,FOLLOW_72_in_nndry1531); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal301_tree = (Object)adaptor.create(string_literal301);
            adaptor.addChild(root_0, string_literal301_tree);
            }
            dbg.location(204,16);
            TOKEN302=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nndry1533); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN302_tree = (Object)adaptor.create(TOKEN302);
            adaptor.addChild(root_0, TOKEN302_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(204, 21);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:207:1: vbextract : 'VB-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.vbextract_return vbextract() throws RecognitionException {
        ChemicalChunkerParser.vbextract_return retval = new ChemicalChunkerParser.vbextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal303=null;
        Token TOKEN304=null;

        Object string_literal303_tree=null;
        Object TOKEN304_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(207, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:207:10: ( 'VB-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:207:11: 'VB-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(207,11);
            string_literal303=(Token)match(input,73,FOLLOW_73_in_vbextract1540); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal303_tree = (Object)adaptor.create(string_literal303);
            adaptor.addChild(root_0, string_literal303_tree);
            }
            dbg.location(207,24);
            TOKEN304=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbextract1542); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN304_tree = (Object)adaptor.create(TOKEN304);
            adaptor.addChild(root_0, TOKEN304_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:208:1: nnextract : 'NN-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.nnextract_return nnextract() throws RecognitionException {
        ChemicalChunkerParser.nnextract_return retval = new ChemicalChunkerParser.nnextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal305=null;
        Token TOKEN306=null;

        Object string_literal305_tree=null;
        Object TOKEN306_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:208:10: ( 'NN-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:208:11: 'NN-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(208,11);
            string_literal305=(Token)match(input,74,FOLLOW_74_in_nnextract1547); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal305_tree = (Object)adaptor.create(string_literal305);
            adaptor.addChild(root_0, string_literal305_tree);
            }
            dbg.location(208,24);
            TOKEN306=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnextract1549); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN306_tree = (Object)adaptor.create(TOKEN306);
            adaptor.addChild(root_0, TOKEN306_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:211:1: vbfilter : 'VB-FILTER' TOKEN ;
    public final ChemicalChunkerParser.vbfilter_return vbfilter() throws RecognitionException {
        ChemicalChunkerParser.vbfilter_return retval = new ChemicalChunkerParser.vbfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal307=null;
        Token TOKEN308=null;

        Object string_literal307_tree=null;
        Object TOKEN308_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:211:9: ( 'VB-FILTER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:211:10: 'VB-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(211,10);
            string_literal307=(Token)match(input,75,FOLLOW_75_in_vbfilter1556); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal307_tree = (Object)adaptor.create(string_literal307);
            adaptor.addChild(root_0, string_literal307_tree);
            }
            dbg.location(211,22);
            TOKEN308=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfilter1558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN308_tree = (Object)adaptor.create(TOKEN308);
            adaptor.addChild(root_0, TOKEN308_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:212:1: nnfilter : 'NN-FILTER' TOKEN ;
    public final ChemicalChunkerParser.nnfilter_return nnfilter() throws RecognitionException {
        ChemicalChunkerParser.nnfilter_return retval = new ChemicalChunkerParser.nnfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal309=null;
        Token TOKEN310=null;

        Object string_literal309_tree=null;
        Object TOKEN310_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(212, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:212:9: ( 'NN-FILTER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:212:10: 'NN-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(212,10);
            string_literal309=(Token)match(input,76,FOLLOW_76_in_nnfilter1563); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal309_tree = (Object)adaptor.create(string_literal309);
            adaptor.addChild(root_0, string_literal309_tree);
            }
            dbg.location(212,22);
            TOKEN310=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnfilter1565); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN310_tree = (Object)adaptor.create(TOKEN310);
            adaptor.addChild(root_0, TOKEN310_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:215:1: vbheat : 'VB-HEAT' TOKEN ;
    public final ChemicalChunkerParser.vbheat_return vbheat() throws RecognitionException {
        ChemicalChunkerParser.vbheat_return retval = new ChemicalChunkerParser.vbheat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal311=null;
        Token TOKEN312=null;

        Object string_literal311_tree=null;
        Object TOKEN312_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbheat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:215:7: ( 'VB-HEAT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:215:8: 'VB-HEAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(215,8);
            string_literal311=(Token)match(input,77,FOLLOW_77_in_vbheat1572); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal311_tree = (Object)adaptor.create(string_literal311);
            adaptor.addChild(root_0, string_literal311_tree);
            }
            dbg.location(215,18);
            TOKEN312=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbheat1574); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN312_tree = (Object)adaptor.create(TOKEN312);
            adaptor.addChild(root_0, TOKEN312_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:216:1: vbincrease : 'VB-INCREASE' TOKEN ;
    public final ChemicalChunkerParser.vbincrease_return vbincrease() throws RecognitionException {
        ChemicalChunkerParser.vbincrease_return retval = new ChemicalChunkerParser.vbincrease_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal313=null;
        Token TOKEN314=null;

        Object string_literal313_tree=null;
        Object TOKEN314_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbincrease");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(216, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:216:11: ( 'VB-INCREASE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:216:12: 'VB-INCREASE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(216,12);
            string_literal313=(Token)match(input,78,FOLLOW_78_in_vbincrease1579); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal313_tree = (Object)adaptor.create(string_literal313);
            adaptor.addChild(root_0, string_literal313_tree);
            }
            dbg.location(216,26);
            TOKEN314=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbincrease1581); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN314_tree = (Object)adaptor.create(TOKEN314);
            adaptor.addChild(root_0, TOKEN314_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(216, 31);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:219:1: vbpartition : 'VB-PARTITION' TOKEN ;
    public final ChemicalChunkerParser.vbpartition_return vbpartition() throws RecognitionException {
        ChemicalChunkerParser.vbpartition_return retval = new ChemicalChunkerParser.vbpartition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal315=null;
        Token TOKEN316=null;

        Object string_literal315_tree=null;
        Object TOKEN316_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpartition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(219, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:219:12: ( 'VB-PARTITION' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:219:13: 'VB-PARTITION' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(219,13);
            string_literal315=(Token)match(input,79,FOLLOW_79_in_vbpartition1588); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal315_tree = (Object)adaptor.create(string_literal315);
            adaptor.addChild(root_0, string_literal315_tree);
            }
            dbg.location(219,28);
            TOKEN316=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpartition1590); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN316_tree = (Object)adaptor.create(TOKEN316);
            adaptor.addChild(root_0, TOKEN316_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(219, 33);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:222:1: vbprecipitate : 'VB-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.vbprecipitate_return vbprecipitate() throws RecognitionException {
        ChemicalChunkerParser.vbprecipitate_return retval = new ChemicalChunkerParser.vbprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal317=null;
        Token TOKEN318=null;

        Object string_literal317_tree=null;
        Object TOKEN318_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(222, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:222:14: ( 'VB-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:222:15: 'VB-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(222,15);
            string_literal317=(Token)match(input,80,FOLLOW_80_in_vbprecipitate1597); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal317_tree = (Object)adaptor.create(string_literal317);
            adaptor.addChild(root_0, string_literal317_tree);
            }
            dbg.location(222,32);
            TOKEN318=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbprecipitate1599); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN318_tree = (Object)adaptor.create(TOKEN318);
            adaptor.addChild(root_0, TOKEN318_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:223:1: nnprecipitate : 'NN-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.nnprecipitate_return nnprecipitate() throws RecognitionException {
        ChemicalChunkerParser.nnprecipitate_return retval = new ChemicalChunkerParser.nnprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal319=null;
        Token TOKEN320=null;

        Object string_literal319_tree=null;
        Object TOKEN320_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(223, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:223:14: ( 'NN-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:223:15: 'NN-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(223,15);
            string_literal319=(Token)match(input,81,FOLLOW_81_in_nnprecipitate1604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal319_tree = (Object)adaptor.create(string_literal319);
            adaptor.addChild(root_0, string_literal319_tree);
            }
            dbg.location(223,32);
            TOKEN320=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnprecipitate1606); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN320_tree = (Object)adaptor.create(TOKEN320);
            adaptor.addChild(root_0, TOKEN320_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(223, 37);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:226:1: vbpurify : 'VB-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.vbpurify_return vbpurify() throws RecognitionException {
        ChemicalChunkerParser.vbpurify_return retval = new ChemicalChunkerParser.vbpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal321=null;
        Token TOKEN322=null;

        Object string_literal321_tree=null;
        Object TOKEN322_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(226, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:226:9: ( 'VB-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:226:10: 'VB-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(226,10);
            string_literal321=(Token)match(input,82,FOLLOW_82_in_vbpurify1613); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal321_tree = (Object)adaptor.create(string_literal321);
            adaptor.addChild(root_0, string_literal321_tree);
            }
            dbg.location(226,22);
            TOKEN322=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpurify1615); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN322_tree = (Object)adaptor.create(TOKEN322);
            adaptor.addChild(root_0, TOKEN322_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:227:1: nnpurify : 'NN-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.nnpurify_return nnpurify() throws RecognitionException {
        ChemicalChunkerParser.nnpurify_return retval = new ChemicalChunkerParser.nnpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal323=null;
        Token TOKEN324=null;

        Object string_literal323_tree=null;
        Object TOKEN324_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(227, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:227:9: ( 'NN-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:227:10: 'NN-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(227,10);
            string_literal323=(Token)match(input,83,FOLLOW_83_in_nnpurify1620); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal323_tree = (Object)adaptor.create(string_literal323);
            adaptor.addChild(root_0, string_literal323_tree);
            }
            dbg.location(227,22);
            TOKEN324=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpurify1622); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN324_tree = (Object)adaptor.create(TOKEN324);
            adaptor.addChild(root_0, TOKEN324_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(227, 27);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:230:1: vbquench : 'VB-QUENCH' TOKEN ;
    public final ChemicalChunkerParser.vbquench_return vbquench() throws RecognitionException {
        ChemicalChunkerParser.vbquench_return retval = new ChemicalChunkerParser.vbquench_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal325=null;
        Token TOKEN326=null;

        Object string_literal325_tree=null;
        Object TOKEN326_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbquench");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(230, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:230:9: ( 'VB-QUENCH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:230:10: 'VB-QUENCH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(230,10);
            string_literal325=(Token)match(input,84,FOLLOW_84_in_vbquench1629); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal325_tree = (Object)adaptor.create(string_literal325);
            adaptor.addChild(root_0, string_literal325_tree);
            }
            dbg.location(230,22);
            TOKEN326=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbquench1631); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN326_tree = (Object)adaptor.create(TOKEN326);
            adaptor.addChild(root_0, TOKEN326_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(230, 27);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:233:1: vbrecover : 'VB-RECOVER' TOKEN ;
    public final ChemicalChunkerParser.vbrecover_return vbrecover() throws RecognitionException {
        ChemicalChunkerParser.vbrecover_return retval = new ChemicalChunkerParser.vbrecover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal327=null;
        Token TOKEN328=null;

        Object string_literal327_tree=null;
        Object TOKEN328_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbrecover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(233, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:233:10: ( 'VB-RECOVER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:233:11: 'VB-RECOVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(233,11);
            string_literal327=(Token)match(input,85,FOLLOW_85_in_vbrecover1638); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal327_tree = (Object)adaptor.create(string_literal327);
            adaptor.addChild(root_0, string_literal327_tree);
            }
            dbg.location(233,24);
            TOKEN328=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbrecover1640); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN328_tree = (Object)adaptor.create(TOKEN328);
            adaptor.addChild(root_0, TOKEN328_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(233, 29);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:236:1: vbremove : 'VB-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.vbremove_return vbremove() throws RecognitionException {
        ChemicalChunkerParser.vbremove_return retval = new ChemicalChunkerParser.vbremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal329=null;
        Token TOKEN330=null;

        Object string_literal329_tree=null;
        Object TOKEN330_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(236, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:236:9: ( 'VB-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:236:10: 'VB-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(236,10);
            string_literal329=(Token)match(input,86,FOLLOW_86_in_vbremove1647); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal329_tree = (Object)adaptor.create(string_literal329);
            adaptor.addChild(root_0, string_literal329_tree);
            }
            dbg.location(236,22);
            TOKEN330=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbremove1649); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN330_tree = (Object)adaptor.create(TOKEN330);
            adaptor.addChild(root_0, TOKEN330_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:237:1: nnremove : 'NN-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.nnremove_return nnremove() throws RecognitionException {
        ChemicalChunkerParser.nnremove_return retval = new ChemicalChunkerParser.nnremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal331=null;
        Token TOKEN332=null;

        Object string_literal331_tree=null;
        Object TOKEN332_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(237, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:237:9: ( 'NN-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:237:10: 'NN-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(237,10);
            string_literal331=(Token)match(input,87,FOLLOW_87_in_nnremove1654); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal331_tree = (Object)adaptor.create(string_literal331);
            adaptor.addChild(root_0, string_literal331_tree);
            }
            dbg.location(237,22);
            TOKEN332=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnremove1656); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN332_tree = (Object)adaptor.create(TOKEN332);
            adaptor.addChild(root_0, TOKEN332_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(237, 27);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:240:1: vbstir : 'VB-STIR' TOKEN ;
    public final ChemicalChunkerParser.vbstir_return vbstir() throws RecognitionException {
        ChemicalChunkerParser.vbstir_return retval = new ChemicalChunkerParser.vbstir_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal333=null;
        Token TOKEN334=null;

        Object string_literal333_tree=null;
        Object TOKEN334_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbstir");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:240:7: ( 'VB-STIR' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:240:8: 'VB-STIR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(240,8);
            string_literal333=(Token)match(input,88,FOLLOW_88_in_vbstir1663); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal333_tree = (Object)adaptor.create(string_literal333);
            adaptor.addChild(root_0, string_literal333_tree);
            }
            dbg.location(240,18);
            TOKEN334=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbstir1665); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN334_tree = (Object)adaptor.create(TOKEN334);
            adaptor.addChild(root_0, TOKEN334_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(240, 23);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:243:1: vbsynthesize : 'VB-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.vbsynthesize_return vbsynthesize() throws RecognitionException {
        ChemicalChunkerParser.vbsynthesize_return retval = new ChemicalChunkerParser.vbsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal335=null;
        Token TOKEN336=null;

        Object string_literal335_tree=null;
        Object TOKEN336_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(243, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:243:13: ( 'VB-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:243:14: 'VB-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(243,14);
            string_literal335=(Token)match(input,89,FOLLOW_89_in_vbsynthesize1672); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal335_tree = (Object)adaptor.create(string_literal335);
            adaptor.addChild(root_0, string_literal335_tree);
            }
            dbg.location(243,30);
            TOKEN336=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsynthesize1674); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN336_tree = (Object)adaptor.create(TOKEN336);
            adaptor.addChild(root_0, TOKEN336_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:244:1: nnsynthesize : 'NN-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.nnsynthesize_return nnsynthesize() throws RecognitionException {
        ChemicalChunkerParser.nnsynthesize_return retval = new ChemicalChunkerParser.nnsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal337=null;
        Token TOKEN338=null;

        Object string_literal337_tree=null;
        Object TOKEN338_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(244, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:244:13: ( 'NN-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:244:14: 'NN-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(244,14);
            string_literal337=(Token)match(input,90,FOLLOW_90_in_nnsynthesize1679); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal337_tree = (Object)adaptor.create(string_literal337);
            adaptor.addChild(root_0, string_literal337_tree);
            }
            dbg.location(244,30);
            TOKEN338=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnsynthesize1681); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN338_tree = (Object)adaptor.create(TOKEN338);
            adaptor.addChild(root_0, TOKEN338_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(244, 35);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:247:1: vbwait : 'VB-WAIT' TOKEN ;
    public final ChemicalChunkerParser.vbwait_return vbwait() throws RecognitionException {
        ChemicalChunkerParser.vbwait_return retval = new ChemicalChunkerParser.vbwait_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal339=null;
        Token TOKEN340=null;

        Object string_literal339_tree=null;
        Object TOKEN340_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwait");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(247, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:247:7: ( 'VB-WAIT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:247:8: 'VB-WAIT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(247,8);
            string_literal339=(Token)match(input,91,FOLLOW_91_in_vbwait1688); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal339_tree = (Object)adaptor.create(string_literal339);
            adaptor.addChild(root_0, string_literal339_tree);
            }
            dbg.location(247,18);
            TOKEN340=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwait1690); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN340_tree = (Object)adaptor.create(TOKEN340);
            adaptor.addChild(root_0, TOKEN340_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(247, 23);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:250:1: vbwash : 'VB-WASH' TOKEN ;
    public final ChemicalChunkerParser.vbwash_return vbwash() throws RecognitionException {
        ChemicalChunkerParser.vbwash_return retval = new ChemicalChunkerParser.vbwash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal341=null;
        Token TOKEN342=null;

        Object string_literal341_tree=null;
        Object TOKEN342_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(250, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:250:7: ( 'VB-WASH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:250:8: 'VB-WASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(250,8);
            string_literal341=(Token)match(input,92,FOLLOW_92_in_vbwash1697); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal341_tree = (Object)adaptor.create(string_literal341);
            adaptor.addChild(root_0, string_literal341_tree);
            }
            dbg.location(250,18);
            TOKEN342=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwash1699); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN342_tree = (Object)adaptor.create(TOKEN342);
            adaptor.addChild(root_0, TOKEN342_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(250, 23);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:253:1: vbyield : 'VB-YIELD' TOKEN ;
    public final ChemicalChunkerParser.vbyield_return vbyield() throws RecognitionException {
        ChemicalChunkerParser.vbyield_return retval = new ChemicalChunkerParser.vbyield_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal343=null;
        Token TOKEN344=null;

        Object string_literal343_tree=null;
        Object TOKEN344_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbyield");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(253, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:253:8: ( 'VB-YIELD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:253:9: 'VB-YIELD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(253,9);
            string_literal343=(Token)match(input,93,FOLLOW_93_in_vbyield1706); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal343_tree = (Object)adaptor.create(string_literal343);
            adaptor.addChild(root_0, string_literal343_tree);
            }
            dbg.location(253,20);
            TOKEN344=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbyield1708); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN344_tree = (Object)adaptor.create(TOKEN344);
            adaptor.addChild(root_0, TOKEN344_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(253, 25);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:256:1: colon : 'COLON' TOKEN ;
    public final ChemicalChunkerParser.colon_return colon() throws RecognitionException {
        ChemicalChunkerParser.colon_return retval = new ChemicalChunkerParser.colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal345=null;
        Token TOKEN346=null;

        Object string_literal345_tree=null;
        Object TOKEN346_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(256, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:256:6: ( 'COLON' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:256:7: 'COLON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(256,7);
            string_literal345=(Token)match(input,94,FOLLOW_94_in_colon1715); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal345_tree = (Object)adaptor.create(string_literal345);
            adaptor.addChild(root_0, string_literal345_tree);
            }
            dbg.location(256,15);
            TOKEN346=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_colon1717); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN346_tree = (Object)adaptor.create(TOKEN346);
            adaptor.addChild(root_0, TOKEN346_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:257:1: comma : 'COMMA' TOKEN ;
    public final ChemicalChunkerParser.comma_return comma() throws RecognitionException {
        ChemicalChunkerParser.comma_return retval = new ChemicalChunkerParser.comma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal347=null;
        Token TOKEN348=null;

        Object string_literal347_tree=null;
        Object TOKEN348_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(257, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:257:6: ( 'COMMA' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:257:7: 'COMMA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(257,7);
            string_literal347=(Token)match(input,95,FOLLOW_95_in_comma1722); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal347_tree = (Object)adaptor.create(string_literal347);
            adaptor.addChild(root_0, string_literal347_tree);
            }
            dbg.location(257,15);
            TOKEN348=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_comma1724); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN348_tree = (Object)adaptor.create(TOKEN348);
            adaptor.addChild(root_0, TOKEN348_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:258:1: apost : 'APOST' TOKEN ;
    public final ChemicalChunkerParser.apost_return apost() throws RecognitionException {
        ChemicalChunkerParser.apost_return retval = new ChemicalChunkerParser.apost_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal349=null;
        Token TOKEN350=null;

        Object string_literal349_tree=null;
        Object TOKEN350_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "apost");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(258, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:258:6: ( 'APOST' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:258:7: 'APOST' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(258,7);
            string_literal349=(Token)match(input,96,FOLLOW_96_in_apost1729); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal349_tree = (Object)adaptor.create(string_literal349);
            adaptor.addChild(root_0, string_literal349_tree);
            }
            dbg.location(258,15);
            TOKEN350=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_apost1731); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN350_tree = (Object)adaptor.create(TOKEN350);
            adaptor.addChild(root_0, TOKEN350_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(258, 20);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:259:1: neg : 'NEG' TOKEN ;
    public final ChemicalChunkerParser.neg_return neg() throws RecognitionException {
        ChemicalChunkerParser.neg_return retval = new ChemicalChunkerParser.neg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal351=null;
        Token TOKEN352=null;

        Object string_literal351_tree=null;
        Object TOKEN352_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "neg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(259, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:259:4: ( 'NEG' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:259:5: 'NEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(259,5);
            string_literal351=(Token)match(input,97,FOLLOW_97_in_neg1736); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal351_tree = (Object)adaptor.create(string_literal351);
            adaptor.addChild(root_0, string_literal351_tree);
            }
            dbg.location(259,11);
            TOKEN352=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_neg1738); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN352_tree = (Object)adaptor.create(TOKEN352);
            adaptor.addChild(root_0, TOKEN352_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(259, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:260:1: dash : 'DASH' TOKEN ;
    public final ChemicalChunkerParser.dash_return dash() throws RecognitionException {
        ChemicalChunkerParser.dash_return retval = new ChemicalChunkerParser.dash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal353=null;
        Token TOKEN354=null;

        Object string_literal353_tree=null;
        Object TOKEN354_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(260, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:260:5: ( 'DASH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:260:6: 'DASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(260,6);
            string_literal353=(Token)match(input,98,FOLLOW_98_in_dash1743); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal353_tree = (Object)adaptor.create(string_literal353);
            adaptor.addChild(root_0, string_literal353_tree);
            }
            dbg.location(260,13);
            TOKEN354=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dash1745); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN354_tree = (Object)adaptor.create(TOKEN354);
            adaptor.addChild(root_0, TOKEN354_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:261:1: stop : 'STOP' TOKEN ;
    public final ChemicalChunkerParser.stop_return stop() throws RecognitionException {
        ChemicalChunkerParser.stop_return retval = new ChemicalChunkerParser.stop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal355=null;
        Token TOKEN356=null;

        Object string_literal355_tree=null;
        Object TOKEN356_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:261:5: ( 'STOP' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:261:6: 'STOP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(261,6);
            string_literal355=(Token)match(input,99,FOLLOW_99_in_stop1750); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal355_tree = (Object)adaptor.create(string_literal355);
            adaptor.addChild(root_0, string_literal355_tree);
            }
            dbg.location(261,13);
            TOKEN356=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_stop1752); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN356_tree = (Object)adaptor.create(TOKEN356);
            adaptor.addChild(root_0, TOKEN356_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:262:1: nnpercent : 'NN-PERCENT' TOKEN ;
    public final ChemicalChunkerParser.nnpercent_return nnpercent() throws RecognitionException {
        ChemicalChunkerParser.nnpercent_return retval = new ChemicalChunkerParser.nnpercent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal357=null;
        Token TOKEN358=null;

        Object string_literal357_tree=null;
        Object TOKEN358_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpercent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(262, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:262:10: ( 'NN-PERCENT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:262:11: 'NN-PERCENT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(262,11);
            string_literal357=(Token)match(input,100,FOLLOW_100_in_nnpercent1757); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal357_tree = (Object)adaptor.create(string_literal357);
            adaptor.addChild(root_0, string_literal357_tree);
            }
            dbg.location(262,24);
            TOKEN358=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpercent1759); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN358_tree = (Object)adaptor.create(TOKEN358);
            adaptor.addChild(root_0, TOKEN358_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(262, 29);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:263:1: lsqb : 'LSQB' TOKEN ;
    public final ChemicalChunkerParser.lsqb_return lsqb() throws RecognitionException {
        ChemicalChunkerParser.lsqb_return retval = new ChemicalChunkerParser.lsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal359=null;
        Token TOKEN360=null;

        Object string_literal359_tree=null;
        Object TOKEN360_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(263, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:263:5: ( 'LSQB' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:263:6: 'LSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(263,6);
            string_literal359=(Token)match(input,101,FOLLOW_101_in_lsqb1764); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal359_tree = (Object)adaptor.create(string_literal359);
            adaptor.addChild(root_0, string_literal359_tree);
            }
            dbg.location(263,13);
            TOKEN360=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lsqb1766); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN360_tree = (Object)adaptor.create(TOKEN360);
            adaptor.addChild(root_0, TOKEN360_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:264:1: rsqb : 'RSQB' TOKEN ;
    public final ChemicalChunkerParser.rsqb_return rsqb() throws RecognitionException {
        ChemicalChunkerParser.rsqb_return retval = new ChemicalChunkerParser.rsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal361=null;
        Token TOKEN362=null;

        Object string_literal361_tree=null;
        Object TOKEN362_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(264, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:264:5: ( 'RSQB' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:264:6: 'RSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(264,6);
            string_literal361=(Token)match(input,102,FOLLOW_102_in_rsqb1771); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal361_tree = (Object)adaptor.create(string_literal361);
            adaptor.addChild(root_0, string_literal361_tree);
            }
            dbg.location(264,13);
            TOKEN362=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rsqb1773); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN362_tree = (Object)adaptor.create(TOKEN362);
            adaptor.addChild(root_0, TOKEN362_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:265:1: lrb : '-LRB-' TOKEN ;
    public final ChemicalChunkerParser.lrb_return lrb() throws RecognitionException {
        ChemicalChunkerParser.lrb_return retval = new ChemicalChunkerParser.lrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal363=null;
        Token TOKEN364=null;

        Object string_literal363_tree=null;
        Object TOKEN364_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:265:4: ( '-LRB-' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:265:5: '-LRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(265,5);
            string_literal363=(Token)match(input,103,FOLLOW_103_in_lrb1778); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal363_tree = (Object)adaptor.create(string_literal363);
            adaptor.addChild(root_0, string_literal363_tree);
            }
            dbg.location(265,13);
            TOKEN364=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lrb1780); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN364_tree = (Object)adaptor.create(TOKEN364);
            adaptor.addChild(root_0, TOKEN364_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:266:1: rrb : '-RRB-' TOKEN ;
    public final ChemicalChunkerParser.rrb_return rrb() throws RecognitionException {
        ChemicalChunkerParser.rrb_return retval = new ChemicalChunkerParser.rrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal365=null;
        Token TOKEN366=null;

        Object string_literal365_tree=null;
        Object TOKEN366_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(266, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:266:4: ( '-RRB-' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:266:5: '-RRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(266,5);
            string_literal365=(Token)match(input,104,FOLLOW_104_in_rrb1785); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal365_tree = (Object)adaptor.create(string_literal365);
            adaptor.addChild(root_0, string_literal365_tree);
            }
            dbg.location(266,13);
            TOKEN366=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rrb1787); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN366_tree = (Object)adaptor.create(TOKEN366);
            adaptor.addChild(root_0, TOKEN366_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(266, 18);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:271:1: abl : 'ABL' TOKEN ;
    public final ChemicalChunkerParser.abl_return abl() throws RecognitionException {
        ChemicalChunkerParser.abl_return retval = new ChemicalChunkerParser.abl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal367=null;
        Token TOKEN368=null;

        Object string_literal367_tree=null;
        Object TOKEN368_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(271, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:271:4: ( 'ABL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:271:5: 'ABL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(271,5);
            string_literal367=(Token)match(input,105,FOLLOW_105_in_abl1796); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal367_tree = (Object)adaptor.create(string_literal367);
            adaptor.addChild(root_0, string_literal367_tree);
            }
            dbg.location(271,11);
            TOKEN368=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abl1798); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN368_tree = (Object)adaptor.create(TOKEN368);
            adaptor.addChild(root_0, TOKEN368_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(271, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:274:1: abn : 'ABN' TOKEN ;
    public final ChemicalChunkerParser.abn_return abn() throws RecognitionException {
        ChemicalChunkerParser.abn_return retval = new ChemicalChunkerParser.abn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal369=null;
        Token TOKEN370=null;

        Object string_literal369_tree=null;
        Object TOKEN370_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(274, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:274:4: ( 'ABN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:274:5: 'ABN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(274,5);
            string_literal369=(Token)match(input,106,FOLLOW_106_in_abn1805); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal369_tree = (Object)adaptor.create(string_literal369);
            adaptor.addChild(root_0, string_literal369_tree);
            }
            dbg.location(274,11);
            TOKEN370=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abn1807); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN370_tree = (Object)adaptor.create(TOKEN370);
            adaptor.addChild(root_0, TOKEN370_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:277:1: abx : 'ABX' TOKEN ;
    public final ChemicalChunkerParser.abx_return abx() throws RecognitionException {
        ChemicalChunkerParser.abx_return retval = new ChemicalChunkerParser.abx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal371=null;
        Token TOKEN372=null;

        Object string_literal371_tree=null;
        Object TOKEN372_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "abx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(277, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:277:4: ( 'ABX' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:277:5: 'ABX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(277,5);
            string_literal371=(Token)match(input,107,FOLLOW_107_in_abx1814); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal371_tree = (Object)adaptor.create(string_literal371);
            adaptor.addChild(root_0, string_literal371_tree);
            }
            dbg.location(277,11);
            TOKEN372=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_abx1816); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN372_tree = (Object)adaptor.create(TOKEN372);
            adaptor.addChild(root_0, TOKEN372_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:280:1: ap : 'AP' TOKEN ;
    public final ChemicalChunkerParser.ap_return ap() throws RecognitionException {
        ChemicalChunkerParser.ap_return retval = new ChemicalChunkerParser.ap_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal373=null;
        Token TOKEN374=null;

        Object string_literal373_tree=null;
        Object TOKEN374_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ap");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(280, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:280:3: ( 'AP' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:280:4: 'AP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(280,4);
            string_literal373=(Token)match(input,108,FOLLOW_108_in_ap1823); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal373_tree = (Object)adaptor.create(string_literal373);
            adaptor.addChild(root_0, string_literal373_tree);
            }
            dbg.location(280,9);
            TOKEN374=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ap1825); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN374_tree = (Object)adaptor.create(TOKEN374);
            adaptor.addChild(root_0, TOKEN374_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(280, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:283:1: at : 'AT' TOKEN ;
    public final ChemicalChunkerParser.at_return at() throws RecognitionException {
        ChemicalChunkerParser.at_return retval = new ChemicalChunkerParser.at_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal375=null;
        Token TOKEN376=null;

        Object string_literal375_tree=null;
        Object TOKEN376_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "at");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(283, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:283:3: ( 'AT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:283:4: 'AT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(283,4);
            string_literal375=(Token)match(input,109,FOLLOW_109_in_at1832); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal375_tree = (Object)adaptor.create(string_literal375);
            adaptor.addChild(root_0, string_literal375_tree);
            }
            dbg.location(283,9);
            TOKEN376=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_at1834); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN376_tree = (Object)adaptor.create(TOKEN376);
            adaptor.addChild(root_0, TOKEN376_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(283, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:286:1: be : 'BE' TOKEN ;
    public final ChemicalChunkerParser.be_return be() throws RecognitionException {
        ChemicalChunkerParser.be_return retval = new ChemicalChunkerParser.be_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal377=null;
        Token TOKEN378=null;

        Object string_literal377_tree=null;
        Object TOKEN378_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "be");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:286:3: ( 'BE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:286:4: 'BE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(286,4);
            string_literal377=(Token)match(input,110,FOLLOW_110_in_be1841); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal377_tree = (Object)adaptor.create(string_literal377);
            adaptor.addChild(root_0, string_literal377_tree);
            }
            dbg.location(286,9);
            TOKEN378=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_be1843); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN378_tree = (Object)adaptor.create(TOKEN378);
            adaptor.addChild(root_0, TOKEN378_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(286, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:289:1: bed : 'BED' TOKEN ;
    public final ChemicalChunkerParser.bed_return bed() throws RecognitionException {
        ChemicalChunkerParser.bed_return retval = new ChemicalChunkerParser.bed_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal379=null;
        Token TOKEN380=null;

        Object string_literal379_tree=null;
        Object TOKEN380_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bed");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(289, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:289:4: ( 'BED' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:289:5: 'BED' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(289,5);
            string_literal379=(Token)match(input,111,FOLLOW_111_in_bed1850); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal379_tree = (Object)adaptor.create(string_literal379);
            adaptor.addChild(root_0, string_literal379_tree);
            }
            dbg.location(289,11);
            TOKEN380=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bed1852); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN380_tree = (Object)adaptor.create(TOKEN380);
            adaptor.addChild(root_0, TOKEN380_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:292:1: bedz : 'BEDZ' TOKEN ;
    public final ChemicalChunkerParser.bedz_return bedz() throws RecognitionException {
        ChemicalChunkerParser.bedz_return retval = new ChemicalChunkerParser.bedz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal381=null;
        Token TOKEN382=null;

        Object string_literal381_tree=null;
        Object TOKEN382_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bedz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:292:5: ( 'BEDZ' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:292:6: 'BEDZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(292,6);
            string_literal381=(Token)match(input,112,FOLLOW_112_in_bedz1859); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal381_tree = (Object)adaptor.create(string_literal381);
            adaptor.addChild(root_0, string_literal381_tree);
            }
            dbg.location(292,13);
            TOKEN382=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bedz1861); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN382_tree = (Object)adaptor.create(TOKEN382);
            adaptor.addChild(root_0, TOKEN382_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(292, 18);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:295:1: beg : 'BEG' TOKEN ;
    public final ChemicalChunkerParser.beg_return beg() throws RecognitionException {
        ChemicalChunkerParser.beg_return retval = new ChemicalChunkerParser.beg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal383=null;
        Token TOKEN384=null;

        Object string_literal383_tree=null;
        Object TOKEN384_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "beg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(295, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:295:4: ( 'BEG' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:295:5: 'BEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(295,5);
            string_literal383=(Token)match(input,113,FOLLOW_113_in_beg1868); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal383_tree = (Object)adaptor.create(string_literal383);
            adaptor.addChild(root_0, string_literal383_tree);
            }
            dbg.location(295,11);
            TOKEN384=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_beg1870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN384_tree = (Object)adaptor.create(TOKEN384);
            adaptor.addChild(root_0, TOKEN384_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(295, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:298:1: bem : 'BEM' TOKEN ;
    public final ChemicalChunkerParser.bem_return bem() throws RecognitionException {
        ChemicalChunkerParser.bem_return retval = new ChemicalChunkerParser.bem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal385=null;
        Token TOKEN386=null;

        Object string_literal385_tree=null;
        Object TOKEN386_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bem");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(298, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:298:4: ( 'BEM' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:298:5: 'BEM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(298,5);
            string_literal385=(Token)match(input,114,FOLLOW_114_in_bem1877); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal385_tree = (Object)adaptor.create(string_literal385);
            adaptor.addChild(root_0, string_literal385_tree);
            }
            dbg.location(298,11);
            TOKEN386=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bem1879); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN386_tree = (Object)adaptor.create(TOKEN386);
            adaptor.addChild(root_0, TOKEN386_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(298, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:301:1: ben : 'BEN' TOKEN ;
    public final ChemicalChunkerParser.ben_return ben() throws RecognitionException {
        ChemicalChunkerParser.ben_return retval = new ChemicalChunkerParser.ben_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal387=null;
        Token TOKEN388=null;

        Object string_literal387_tree=null;
        Object TOKEN388_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ben");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(301, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:301:4: ( 'BEN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:301:5: 'BEN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(301,5);
            string_literal387=(Token)match(input,115,FOLLOW_115_in_ben1886); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal387_tree = (Object)adaptor.create(string_literal387);
            adaptor.addChild(root_0, string_literal387_tree);
            }
            dbg.location(301,11);
            TOKEN388=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ben1888); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN388_tree = (Object)adaptor.create(TOKEN388);
            adaptor.addChild(root_0, TOKEN388_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:304:1: ber : 'BER' TOKEN ;
    public final ChemicalChunkerParser.ber_return ber() throws RecognitionException {
        ChemicalChunkerParser.ber_return retval = new ChemicalChunkerParser.ber_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal389=null;
        Token TOKEN390=null;

        Object string_literal389_tree=null;
        Object TOKEN390_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ber");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:304:4: ( 'BER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:304:5: 'BER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(304,5);
            string_literal389=(Token)match(input,116,FOLLOW_116_in_ber1895); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal389_tree = (Object)adaptor.create(string_literal389);
            adaptor.addChild(root_0, string_literal389_tree);
            }
            dbg.location(304,11);
            TOKEN390=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ber1897); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN390_tree = (Object)adaptor.create(TOKEN390);
            adaptor.addChild(root_0, TOKEN390_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:307:1: bez : 'BEZ' TOKEN ;
    public final ChemicalChunkerParser.bez_return bez() throws RecognitionException {
        ChemicalChunkerParser.bez_return retval = new ChemicalChunkerParser.bez_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal391=null;
        Token TOKEN392=null;

        Object string_literal391_tree=null;
        Object TOKEN392_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bez");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(307, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:307:4: ( 'BEZ' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:307:5: 'BEZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(307,5);
            string_literal391=(Token)match(input,117,FOLLOW_117_in_bez1904); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal391_tree = (Object)adaptor.create(string_literal391);
            adaptor.addChild(root_0, string_literal391_tree);
            }
            dbg.location(307,11);
            TOKEN392=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_bez1906); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN392_tree = (Object)adaptor.create(TOKEN392);
            adaptor.addChild(root_0, TOKEN392_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:310:1: cc : 'CC' TOKEN ;
    public final ChemicalChunkerParser.cc_return cc() throws RecognitionException {
        ChemicalChunkerParser.cc_return retval = new ChemicalChunkerParser.cc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal393=null;
        Token TOKEN394=null;

        Object string_literal393_tree=null;
        Object TOKEN394_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(310, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:310:3: ( 'CC' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:310:4: 'CC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(310,4);
            string_literal393=(Token)match(input,118,FOLLOW_118_in_cc1913); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal393_tree = (Object)adaptor.create(string_literal393);
            adaptor.addChild(root_0, string_literal393_tree);
            }
            dbg.location(310,9);
            TOKEN394=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cc1915); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN394_tree = (Object)adaptor.create(TOKEN394);
            adaptor.addChild(root_0, TOKEN394_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(310, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:313:1: cd : 'CD' TOKEN ;
    public final ChemicalChunkerParser.cd_return cd() throws RecognitionException {
        ChemicalChunkerParser.cd_return retval = new ChemicalChunkerParser.cd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal395=null;
        Token TOKEN396=null;

        Object string_literal395_tree=null;
        Object TOKEN396_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(313, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:313:3: ( 'CD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:313:4: 'CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(313,4);
            string_literal395=(Token)match(input,119,FOLLOW_119_in_cd1922); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal395_tree = (Object)adaptor.create(string_literal395);
            adaptor.addChild(root_0, string_literal395_tree);
            }
            dbg.location(313,9);
            TOKEN396=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cd1924); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN396_tree = (Object)adaptor.create(TOKEN396);
            adaptor.addChild(root_0, TOKEN396_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(313, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:316:1: cs : 'CS' TOKEN ;
    public final ChemicalChunkerParser.cs_return cs() throws RecognitionException {
        ChemicalChunkerParser.cs_return retval = new ChemicalChunkerParser.cs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal397=null;
        Token TOKEN398=null;

        Object string_literal397_tree=null;
        Object TOKEN398_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:316:3: ( 'CS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:316:4: 'CS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(316,4);
            string_literal397=(Token)match(input,120,FOLLOW_120_in_cs1931); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal397_tree = (Object)adaptor.create(string_literal397);
            adaptor.addChild(root_0, string_literal397_tree);
            }
            dbg.location(316,9);
            TOKEN398=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cs1933); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN398_tree = (Object)adaptor.create(TOKEN398);
            adaptor.addChild(root_0, TOKEN398_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(316, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:319:1: dotok : 'DO' TOKEN ;
    public final ChemicalChunkerParser.dotok_return dotok() throws RecognitionException {
        ChemicalChunkerParser.dotok_return retval = new ChemicalChunkerParser.dotok_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal399=null;
        Token TOKEN400=null;

        Object string_literal399_tree=null;
        Object TOKEN400_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dotok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(319, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:319:7: ( 'DO' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:319:8: 'DO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(319,8);
            string_literal399=(Token)match(input,121,FOLLOW_121_in_dotok1941); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal399_tree = (Object)adaptor.create(string_literal399);
            adaptor.addChild(root_0, string_literal399_tree);
            }
            dbg.location(319,13);
            TOKEN400=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dotok1943); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN400_tree = (Object)adaptor.create(TOKEN400);
            adaptor.addChild(root_0, TOKEN400_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(319, 18);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:322:1: dod : 'DOD' TOKEN ;
    public final ChemicalChunkerParser.dod_return dod() throws RecognitionException {
        ChemicalChunkerParser.dod_return retval = new ChemicalChunkerParser.dod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal401=null;
        Token TOKEN402=null;

        Object string_literal401_tree=null;
        Object TOKEN402_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(322, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:322:4: ( 'DOD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:322:5: 'DOD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(322,5);
            string_literal401=(Token)match(input,122,FOLLOW_122_in_dod1950); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal401_tree = (Object)adaptor.create(string_literal401);
            adaptor.addChild(root_0, string_literal401_tree);
            }
            dbg.location(322,11);
            TOKEN402=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dod1952); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN402_tree = (Object)adaptor.create(TOKEN402);
            adaptor.addChild(root_0, TOKEN402_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(322, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:325:1: doz : 'DOZ' TOKEN ;
    public final ChemicalChunkerParser.doz_return doz() throws RecognitionException {
        ChemicalChunkerParser.doz_return retval = new ChemicalChunkerParser.doz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal403=null;
        Token TOKEN404=null;

        Object string_literal403_tree=null;
        Object TOKEN404_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(325, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:325:4: ( 'DOZ' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:325:5: 'DOZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(325,5);
            string_literal403=(Token)match(input,123,FOLLOW_123_in_doz1959); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal403_tree = (Object)adaptor.create(string_literal403);
            adaptor.addChild(root_0, string_literal403_tree);
            }
            dbg.location(325,11);
            TOKEN404=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_doz1961); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN404_tree = (Object)adaptor.create(TOKEN404);
            adaptor.addChild(root_0, TOKEN404_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(325, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:328:1: dt : 'DT' TOKEN ;
    public final ChemicalChunkerParser.dt_return dt() throws RecognitionException {
        ChemicalChunkerParser.dt_return retval = new ChemicalChunkerParser.dt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal405=null;
        Token TOKEN406=null;

        Object string_literal405_tree=null;
        Object TOKEN406_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(328, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:328:3: ( 'DT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:328:4: 'DT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(328,4);
            string_literal405=(Token)match(input,124,FOLLOW_124_in_dt1968); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal405_tree = (Object)adaptor.create(string_literal405);
            adaptor.addChild(root_0, string_literal405_tree);
            }
            dbg.location(328,9);
            TOKEN406=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dt1970); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN406_tree = (Object)adaptor.create(TOKEN406);
            adaptor.addChild(root_0, TOKEN406_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(328, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:331:1: dti : 'DTI' TOKEN ;
    public final ChemicalChunkerParser.dti_return dti() throws RecognitionException {
        ChemicalChunkerParser.dti_return retval = new ChemicalChunkerParser.dti_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal407=null;
        Token TOKEN408=null;

        Object string_literal407_tree=null;
        Object TOKEN408_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dti");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(331, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:331:4: ( 'DTI' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:331:5: 'DTI' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(331,5);
            string_literal407=(Token)match(input,125,FOLLOW_125_in_dti1977); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal407_tree = (Object)adaptor.create(string_literal407);
            adaptor.addChild(root_0, string_literal407_tree);
            }
            dbg.location(331,11);
            TOKEN408=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dti1979); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN408_tree = (Object)adaptor.create(TOKEN408);
            adaptor.addChild(root_0, TOKEN408_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:334:1: dts : 'DTS' TOKEN ;
    public final ChemicalChunkerParser.dts_return dts() throws RecognitionException {
        ChemicalChunkerParser.dts_return retval = new ChemicalChunkerParser.dts_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal409=null;
        Token TOKEN410=null;

        Object string_literal409_tree=null;
        Object TOKEN410_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dts");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(334, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:334:4: ( 'DTS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:334:5: 'DTS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(334,5);
            string_literal409=(Token)match(input,126,FOLLOW_126_in_dts1986); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal409_tree = (Object)adaptor.create(string_literal409);
            adaptor.addChild(root_0, string_literal409_tree);
            }
            dbg.location(334,11);
            TOKEN410=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dts1988); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN410_tree = (Object)adaptor.create(TOKEN410);
            adaptor.addChild(root_0, TOKEN410_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:337:1: dtx : 'DTX' TOKEN ;
    public final ChemicalChunkerParser.dtx_return dtx() throws RecognitionException {
        ChemicalChunkerParser.dtx_return retval = new ChemicalChunkerParser.dtx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal411=null;
        Token TOKEN412=null;

        Object string_literal411_tree=null;
        Object TOKEN412_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dtx");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(337, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:337:4: ( 'DTX' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:337:5: 'DTX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(337,5);
            string_literal411=(Token)match(input,127,FOLLOW_127_in_dtx1995); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal411_tree = (Object)adaptor.create(string_literal411);
            adaptor.addChild(root_0, string_literal411_tree);
            }
            dbg.location(337,11);
            TOKEN412=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dtx1997); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN412_tree = (Object)adaptor.create(TOKEN412);
            adaptor.addChild(root_0, TOKEN412_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(337, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:340:1: ex : 'EX' TOKEN ;
    public final ChemicalChunkerParser.ex_return ex() throws RecognitionException {
        ChemicalChunkerParser.ex_return retval = new ChemicalChunkerParser.ex_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal413=null;
        Token TOKEN414=null;

        Object string_literal413_tree=null;
        Object TOKEN414_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ex");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(340, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:340:3: ( 'EX' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:340:4: 'EX' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(340,4);
            string_literal413=(Token)match(input,128,FOLLOW_128_in_ex2004); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal413_tree = (Object)adaptor.create(string_literal413);
            adaptor.addChild(root_0, string_literal413_tree);
            }
            dbg.location(340,9);
            TOKEN414=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ex2006); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN414_tree = (Object)adaptor.create(TOKEN414);
            adaptor.addChild(root_0, TOKEN414_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:343:1: fw : 'FW' TOKEN ;
    public final ChemicalChunkerParser.fw_return fw() throws RecognitionException {
        ChemicalChunkerParser.fw_return retval = new ChemicalChunkerParser.fw_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal415=null;
        Token TOKEN416=null;

        Object string_literal415_tree=null;
        Object TOKEN416_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(343, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:343:3: ( 'FW' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:343:4: 'FW' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(343,4);
            string_literal415=(Token)match(input,129,FOLLOW_129_in_fw2013); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal415_tree = (Object)adaptor.create(string_literal415);
            adaptor.addChild(root_0, string_literal415_tree);
            }
            dbg.location(343,9);
            TOKEN416=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_fw2015); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN416_tree = (Object)adaptor.create(TOKEN416);
            adaptor.addChild(root_0, TOKEN416_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(343, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:346:1: hv : 'HV' TOKEN ;
    public final ChemicalChunkerParser.hv_return hv() throws RecognitionException {
        ChemicalChunkerParser.hv_return retval = new ChemicalChunkerParser.hv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal417=null;
        Token TOKEN418=null;

        Object string_literal417_tree=null;
        Object TOKEN418_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hv");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(346, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:346:3: ( 'HV' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:346:4: 'HV' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(346,4);
            string_literal417=(Token)match(input,130,FOLLOW_130_in_hv2022); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal417_tree = (Object)adaptor.create(string_literal417);
            adaptor.addChild(root_0, string_literal417_tree);
            }
            dbg.location(346,9);
            TOKEN418=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hv2024); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN418_tree = (Object)adaptor.create(TOKEN418);
            adaptor.addChild(root_0, TOKEN418_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(346, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:349:1: hvd : 'HVD' TOKEN ;
    public final ChemicalChunkerParser.hvd_return hvd() throws RecognitionException {
        ChemicalChunkerParser.hvd_return retval = new ChemicalChunkerParser.hvd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal419=null;
        Token TOKEN420=null;

        Object string_literal419_tree=null;
        Object TOKEN420_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(349, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:349:4: ( 'HVD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:349:5: 'HVD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(349,5);
            string_literal419=(Token)match(input,131,FOLLOW_131_in_hvd2031); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal419_tree = (Object)adaptor.create(string_literal419);
            adaptor.addChild(root_0, string_literal419_tree);
            }
            dbg.location(349,11);
            TOKEN420=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvd2033); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN420_tree = (Object)adaptor.create(TOKEN420);
            adaptor.addChild(root_0, TOKEN420_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:352:1: hvg : 'HVG' TOKEN ;
    public final ChemicalChunkerParser.hvg_return hvg() throws RecognitionException {
        ChemicalChunkerParser.hvg_return retval = new ChemicalChunkerParser.hvg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal421=null;
        Token TOKEN422=null;

        Object string_literal421_tree=null;
        Object TOKEN422_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(352, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:352:4: ( 'HVG' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:352:5: 'HVG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(352,5);
            string_literal421=(Token)match(input,132,FOLLOW_132_in_hvg2040); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal421_tree = (Object)adaptor.create(string_literal421);
            adaptor.addChild(root_0, string_literal421_tree);
            }
            dbg.location(352,11);
            TOKEN422=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvg2042); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN422_tree = (Object)adaptor.create(TOKEN422);
            adaptor.addChild(root_0, TOKEN422_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(352, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:355:1: hvn : 'HVN' TOKEN ;
    public final ChemicalChunkerParser.hvn_return hvn() throws RecognitionException {
        ChemicalChunkerParser.hvn_return retval = new ChemicalChunkerParser.hvn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal423=null;
        Token TOKEN424=null;

        Object string_literal423_tree=null;
        Object TOKEN424_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "hvn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(355, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:355:4: ( 'HVN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:355:5: 'HVN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(355,5);
            string_literal423=(Token)match(input,133,FOLLOW_133_in_hvn2049); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal423_tree = (Object)adaptor.create(string_literal423);
            adaptor.addChild(root_0, string_literal423_tree);
            }
            dbg.location(355,11);
            TOKEN424=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_hvn2051); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN424_tree = (Object)adaptor.create(TOKEN424);
            adaptor.addChild(root_0, TOKEN424_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(355, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:358:1: in : 'IN' TOKEN ;
    public final ChemicalChunkerParser.in_return in() throws RecognitionException {
        ChemicalChunkerParser.in_return retval = new ChemicalChunkerParser.in_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal425=null;
        Token TOKEN426=null;

        Object string_literal425_tree=null;
        Object TOKEN426_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "in");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:358:3: ( 'IN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:358:4: 'IN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(358,4);
            string_literal425=(Token)match(input,134,FOLLOW_134_in_in2058); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal425_tree = (Object)adaptor.create(string_literal425);
            adaptor.addChild(root_0, string_literal425_tree);
            }
            dbg.location(358,9);
            TOKEN426=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_in2060); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN426_tree = (Object)adaptor.create(TOKEN426);
            adaptor.addChild(root_0, TOKEN426_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:361:1: jj : 'JJ' TOKEN ;
    public final ChemicalChunkerParser.jj_return jj() throws RecognitionException {
        ChemicalChunkerParser.jj_return retval = new ChemicalChunkerParser.jj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal427=null;
        Token TOKEN428=null;

        Object string_literal427_tree=null;
        Object TOKEN428_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(361, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:361:3: ( 'JJ' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:361:4: 'JJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(361,4);
            string_literal427=(Token)match(input,135,FOLLOW_135_in_jj2067); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal427_tree = (Object)adaptor.create(string_literal427);
            adaptor.addChild(root_0, string_literal427_tree);
            }
            dbg.location(361,9);
            TOKEN428=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jj2069); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN428_tree = (Object)adaptor.create(TOKEN428);
            adaptor.addChild(root_0, TOKEN428_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(361, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:364:1: jjr : 'JJR' TOKEN ;
    public final ChemicalChunkerParser.jjr_return jjr() throws RecognitionException {
        ChemicalChunkerParser.jjr_return retval = new ChemicalChunkerParser.jjr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal429=null;
        Token TOKEN430=null;

        Object string_literal429_tree=null;
        Object TOKEN430_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(364, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:364:4: ( 'JJR' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:364:5: 'JJR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(364,5);
            string_literal429=(Token)match(input,136,FOLLOW_136_in_jjr2076); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal429_tree = (Object)adaptor.create(string_literal429);
            adaptor.addChild(root_0, string_literal429_tree);
            }
            dbg.location(364,11);
            TOKEN430=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjr2078); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN430_tree = (Object)adaptor.create(TOKEN430);
            adaptor.addChild(root_0, TOKEN430_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:367:1: jjs : 'JJS' TOKEN ;
    public final ChemicalChunkerParser.jjs_return jjs() throws RecognitionException {
        ChemicalChunkerParser.jjs_return retval = new ChemicalChunkerParser.jjs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal431=null;
        Token TOKEN432=null;

        Object string_literal431_tree=null;
        Object TOKEN432_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(367, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:367:4: ( 'JJS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:367:5: 'JJS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(367,5);
            string_literal431=(Token)match(input,137,FOLLOW_137_in_jjs2085); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal431_tree = (Object)adaptor.create(string_literal431);
            adaptor.addChild(root_0, string_literal431_tree);
            }
            dbg.location(367,11);
            TOKEN432=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjs2087); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN432_tree = (Object)adaptor.create(TOKEN432);
            adaptor.addChild(root_0, TOKEN432_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(367, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:370:1: jjt : 'JJT' TOKEN ;
    public final ChemicalChunkerParser.jjt_return jjt() throws RecognitionException {
        ChemicalChunkerParser.jjt_return retval = new ChemicalChunkerParser.jjt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal433=null;
        Token TOKEN434=null;

        Object string_literal433_tree=null;
        Object TOKEN434_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jjt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(370, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:370:4: ( 'JJT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:370:5: 'JJT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(370,5);
            string_literal433=(Token)match(input,138,FOLLOW_138_in_jjt2094); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal433_tree = (Object)adaptor.create(string_literal433);
            adaptor.addChild(root_0, string_literal433_tree);
            }
            dbg.location(370,11);
            TOKEN434=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jjt2096); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN434_tree = (Object)adaptor.create(TOKEN434);
            adaptor.addChild(root_0, TOKEN434_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(370, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:373:1: md : 'MD' TOKEN ;
    public final ChemicalChunkerParser.md_return md() throws RecognitionException {
        ChemicalChunkerParser.md_return retval = new ChemicalChunkerParser.md_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal435=null;
        Token TOKEN436=null;

        Object string_literal435_tree=null;
        Object TOKEN436_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "md");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(373, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:373:3: ( 'MD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:373:4: 'MD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(373,4);
            string_literal435=(Token)match(input,139,FOLLOW_139_in_md2103); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal435_tree = (Object)adaptor.create(string_literal435);
            adaptor.addChild(root_0, string_literal435_tree);
            }
            dbg.location(373,9);
            TOKEN436=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_md2105); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN436_tree = (Object)adaptor.create(TOKEN436);
            adaptor.addChild(root_0, TOKEN436_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(373, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:376:1: nc : 'NC' TOKEN ;
    public final ChemicalChunkerParser.nc_return nc() throws RecognitionException {
        ChemicalChunkerParser.nc_return retval = new ChemicalChunkerParser.nc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal437=null;
        Token TOKEN438=null;

        Object string_literal437_tree=null;
        Object TOKEN438_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(376, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:376:3: ( 'NC' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:376:4: 'NC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(376,4);
            string_literal437=(Token)match(input,140,FOLLOW_140_in_nc2112); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal437_tree = (Object)adaptor.create(string_literal437);
            adaptor.addChild(root_0, string_literal437_tree);
            }
            dbg.location(376,9);
            TOKEN438=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nc2114); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN438_tree = (Object)adaptor.create(TOKEN438);
            adaptor.addChild(root_0, TOKEN438_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(376, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:379:1: nn : 'NN' TOKEN ;
    public final ChemicalChunkerParser.nn_return nn() throws RecognitionException {
        ChemicalChunkerParser.nn_return retval = new ChemicalChunkerParser.nn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal439=null;
        Token TOKEN440=null;

        Object string_literal439_tree=null;
        Object TOKEN440_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(379, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:379:3: ( 'NN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:379:4: 'NN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(379,4);
            string_literal439=(Token)match(input,141,FOLLOW_141_in_nn2121); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal439_tree = (Object)adaptor.create(string_literal439);
            adaptor.addChild(root_0, string_literal439_tree);
            }
            dbg.location(379,9);
            TOKEN440=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn2123); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN440_tree = (Object)adaptor.create(TOKEN440);
            adaptor.addChild(root_0, TOKEN440_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(379, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:382:1: nn_poss : 'NN$' TOKEN ;
    public final ChemicalChunkerParser.nn_poss_return nn_poss() throws RecognitionException {
        ChemicalChunkerParser.nn_poss_return retval = new ChemicalChunkerParser.nn_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal441=null;
        Token TOKEN442=null;

        Object string_literal441_tree=null;
        Object TOKEN442_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(382, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:382:8: ( 'NN$' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:382:9: 'NN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(382,9);
            string_literal441=(Token)match(input,142,FOLLOW_142_in_nn_poss2130); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal441_tree = (Object)adaptor.create(string_literal441);
            adaptor.addChild(root_0, string_literal441_tree);
            }
            dbg.location(382,15);
            TOKEN442=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn_poss2132); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN442_tree = (Object)adaptor.create(TOKEN442);
            adaptor.addChild(root_0, TOKEN442_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(382, 20);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:385:1: nns : 'NNS' TOKEN ;
    public final ChemicalChunkerParser.nns_return nns() throws RecognitionException {
        ChemicalChunkerParser.nns_return retval = new ChemicalChunkerParser.nns_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal443=null;
        Token TOKEN444=null;

        Object string_literal443_tree=null;
        Object TOKEN444_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(385, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:385:4: ( 'NNS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:385:5: 'NNS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(385,5);
            string_literal443=(Token)match(input,143,FOLLOW_143_in_nns2139); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal443_tree = (Object)adaptor.create(string_literal443);
            adaptor.addChild(root_0, string_literal443_tree);
            }
            dbg.location(385,11);
            TOKEN444=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns2141); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN444_tree = (Object)adaptor.create(TOKEN444);
            adaptor.addChild(root_0, TOKEN444_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(385, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:388:1: nns_poss : 'NNS$' TOKEN ;
    public final ChemicalChunkerParser.nns_poss_return nns_poss() throws RecognitionException {
        ChemicalChunkerParser.nns_poss_return retval = new ChemicalChunkerParser.nns_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal445=null;
        Token TOKEN446=null;

        Object string_literal445_tree=null;
        Object TOKEN446_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nns_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(388, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:388:9: ( 'NNS$' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:388:10: 'NNS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(388,10);
            string_literal445=(Token)match(input,144,FOLLOW_144_in_nns_poss2148); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal445_tree = (Object)adaptor.create(string_literal445);
            adaptor.addChild(root_0, string_literal445_tree);
            }
            dbg.location(388,17);
            TOKEN446=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nns_poss2150); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN446_tree = (Object)adaptor.create(TOKEN446);
            adaptor.addChild(root_0, TOKEN446_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(388, 22);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:391:1: np : 'NP' TOKEN ;
    public final ChemicalChunkerParser.np_return np() throws RecognitionException {
        ChemicalChunkerParser.np_return retval = new ChemicalChunkerParser.np_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal447=null;
        Token TOKEN448=null;

        Object string_literal447_tree=null;
        Object TOKEN448_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(391, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:391:3: ( 'NP' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:391:4: 'NP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(391,4);
            string_literal447=(Token)match(input,145,FOLLOW_145_in_np2157); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal447_tree = (Object)adaptor.create(string_literal447);
            adaptor.addChild(root_0, string_literal447_tree);
            }
            dbg.location(391,9);
            TOKEN448=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np2159); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN448_tree = (Object)adaptor.create(TOKEN448);
            adaptor.addChild(root_0, TOKEN448_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(391, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:394:1: np_poss : 'NP$' TOKEN ;
    public final ChemicalChunkerParser.np_poss_return np_poss() throws RecognitionException {
        ChemicalChunkerParser.np_poss_return retval = new ChemicalChunkerParser.np_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal449=null;
        Token TOKEN450=null;

        Object string_literal449_tree=null;
        Object TOKEN450_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "np_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(394, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:394:8: ( 'NP$' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:394:9: 'NP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(394,9);
            string_literal449=(Token)match(input,146,FOLLOW_146_in_np_poss2166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal449_tree = (Object)adaptor.create(string_literal449);
            adaptor.addChild(root_0, string_literal449_tree);
            }
            dbg.location(394,15);
            TOKEN450=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_np_poss2168); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN450_tree = (Object)adaptor.create(TOKEN450);
            adaptor.addChild(root_0, TOKEN450_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:397:1: nps : 'NPS' TOKEN ;
    public final ChemicalChunkerParser.nps_return nps() throws RecognitionException {
        ChemicalChunkerParser.nps_return retval = new ChemicalChunkerParser.nps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal451=null;
        Token TOKEN452=null;

        Object string_literal451_tree=null;
        Object TOKEN452_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(397, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:397:4: ( 'NPS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:397:5: 'NPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(397,5);
            string_literal451=(Token)match(input,147,FOLLOW_147_in_nps2175); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal451_tree = (Object)adaptor.create(string_literal451);
            adaptor.addChild(root_0, string_literal451_tree);
            }
            dbg.location(397,11);
            TOKEN452=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps2177); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN452_tree = (Object)adaptor.create(TOKEN452);
            adaptor.addChild(root_0, TOKEN452_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(397, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:400:1: nps_poss : 'NPS$' TOKEN ;
    public final ChemicalChunkerParser.nps_poss_return nps_poss() throws RecognitionException {
        ChemicalChunkerParser.nps_poss_return retval = new ChemicalChunkerParser.nps_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal453=null;
        Token TOKEN454=null;

        Object string_literal453_tree=null;
        Object TOKEN454_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nps_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(400, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:400:9: ( 'NPS$' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:400:10: 'NPS$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(400,10);
            string_literal453=(Token)match(input,148,FOLLOW_148_in_nps_poss2184); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal453_tree = (Object)adaptor.create(string_literal453);
            adaptor.addChild(root_0, string_literal453_tree);
            }
            dbg.location(400,17);
            TOKEN454=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nps_poss2186); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN454_tree = (Object)adaptor.create(TOKEN454);
            adaptor.addChild(root_0, TOKEN454_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(400, 22);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:403:1: nr : 'NR' TOKEN ;
    public final ChemicalChunkerParser.nr_return nr() throws RecognitionException {
        ChemicalChunkerParser.nr_return retval = new ChemicalChunkerParser.nr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal455=null;
        Token TOKEN456=null;

        Object string_literal455_tree=null;
        Object TOKEN456_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(403, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:403:3: ( 'NR' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:403:4: 'NR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(403,4);
            string_literal455=(Token)match(input,149,FOLLOW_149_in_nr2193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal455_tree = (Object)adaptor.create(string_literal455);
            adaptor.addChild(root_0, string_literal455_tree);
            }
            dbg.location(403,9);
            TOKEN456=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nr2195); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN456_tree = (Object)adaptor.create(TOKEN456);
            adaptor.addChild(root_0, TOKEN456_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(403, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:406:1: od : 'OD' TOKEN ;
    public final ChemicalChunkerParser.od_return od() throws RecognitionException {
        ChemicalChunkerParser.od_return retval = new ChemicalChunkerParser.od_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal457=null;
        Token TOKEN458=null;

        Object string_literal457_tree=null;
        Object TOKEN458_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "od");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(406, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:406:3: ( 'OD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:406:4: 'OD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(406,4);
            string_literal457=(Token)match(input,150,FOLLOW_150_in_od2202); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal457_tree = (Object)adaptor.create(string_literal457);
            adaptor.addChild(root_0, string_literal457_tree);
            }
            dbg.location(406,9);
            TOKEN458=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_od2204); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN458_tree = (Object)adaptor.create(TOKEN458);
            adaptor.addChild(root_0, TOKEN458_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(406, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:409:1: pn : 'PN' TOKEN ;
    public final ChemicalChunkerParser.pn_return pn() throws RecognitionException {
        ChemicalChunkerParser.pn_return retval = new ChemicalChunkerParser.pn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal459=null;
        Token TOKEN460=null;

        Object string_literal459_tree=null;
        Object TOKEN460_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(409, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:409:3: ( 'PN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:409:4: 'PN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(409,4);
            string_literal459=(Token)match(input,151,FOLLOW_151_in_pn2211); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal459_tree = (Object)adaptor.create(string_literal459);
            adaptor.addChild(root_0, string_literal459_tree);
            }
            dbg.location(409,9);
            TOKEN460=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn2213); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN460_tree = (Object)adaptor.create(TOKEN460);
            adaptor.addChild(root_0, TOKEN460_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(409, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:412:1: pn_poss : 'PN$' TOKEN ;
    public final ChemicalChunkerParser.pn_poss_return pn_poss() throws RecognitionException {
        ChemicalChunkerParser.pn_poss_return retval = new ChemicalChunkerParser.pn_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal461=null;
        Token TOKEN462=null;

        Object string_literal461_tree=null;
        Object TOKEN462_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pn_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(412, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:412:8: ( 'PN$' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:412:9: 'PN$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(412,9);
            string_literal461=(Token)match(input,152,FOLLOW_152_in_pn_poss2220); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal461_tree = (Object)adaptor.create(string_literal461);
            adaptor.addChild(root_0, string_literal461_tree);
            }
            dbg.location(412,15);
            TOKEN462=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pn_poss2222); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN462_tree = (Object)adaptor.create(TOKEN462);
            adaptor.addChild(root_0, TOKEN462_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(412, 20);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:415:1: pp_poss : 'PP$' TOKEN ;
    public final ChemicalChunkerParser.pp_poss_return pp_poss() throws RecognitionException {
        ChemicalChunkerParser.pp_poss_return retval = new ChemicalChunkerParser.pp_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal463=null;
        Token TOKEN464=null;

        Object string_literal463_tree=null;
        Object TOKEN464_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pp_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(415, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:415:8: ( 'PP$' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:415:9: 'PP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(415,9);
            string_literal463=(Token)match(input,153,FOLLOW_153_in_pp_poss2229); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal463_tree = (Object)adaptor.create(string_literal463);
            adaptor.addChild(root_0, string_literal463_tree);
            }
            dbg.location(415,15);
            TOKEN464=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pp_poss2231); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN464_tree = (Object)adaptor.create(TOKEN464);
            adaptor.addChild(root_0, TOKEN464_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(415, 20);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:418:1: pp_poss_poss : 'PP$$' TOKEN ;
    public final ChemicalChunkerParser.pp_poss_poss_return pp_poss_poss() throws RecognitionException {
        ChemicalChunkerParser.pp_poss_poss_return retval = new ChemicalChunkerParser.pp_poss_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal465=null;
        Token TOKEN466=null;

        Object string_literal465_tree=null;
        Object TOKEN466_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pp_poss_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(418, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:418:13: ( 'PP$$' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:418:14: 'PP$$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(418,14);
            string_literal465=(Token)match(input,154,FOLLOW_154_in_pp_poss_poss2238); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal465_tree = (Object)adaptor.create(string_literal465);
            adaptor.addChild(root_0, string_literal465_tree);
            }
            dbg.location(418,21);
            TOKEN466=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pp_poss_poss2240); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN466_tree = (Object)adaptor.create(TOKEN466);
            adaptor.addChild(root_0, TOKEN466_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(418, 26);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:421:1: ppl : 'PPL' TOKEN ;
    public final ChemicalChunkerParser.ppl_return ppl() throws RecognitionException {
        ChemicalChunkerParser.ppl_return retval = new ChemicalChunkerParser.ppl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal467=null;
        Token TOKEN468=null;

        Object string_literal467_tree=null;
        Object TOKEN468_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(421, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:421:4: ( 'PPL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:421:5: 'PPL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(421,5);
            string_literal467=(Token)match(input,155,FOLLOW_155_in_ppl2247); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal467_tree = (Object)adaptor.create(string_literal467);
            adaptor.addChild(root_0, string_literal467_tree);
            }
            dbg.location(421,11);
            TOKEN468=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppl2249); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN468_tree = (Object)adaptor.create(TOKEN468);
            adaptor.addChild(root_0, TOKEN468_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(421, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:424:1: ppls : 'PPLS' TOKEN ;
    public final ChemicalChunkerParser.ppls_return ppls() throws RecognitionException {
        ChemicalChunkerParser.ppls_return retval = new ChemicalChunkerParser.ppls_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal469=null;
        Token TOKEN470=null;

        Object string_literal469_tree=null;
        Object TOKEN470_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppls");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(424, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:424:5: ( 'PPLS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:424:6: 'PPLS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(424,6);
            string_literal469=(Token)match(input,156,FOLLOW_156_in_ppls2256); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal469_tree = (Object)adaptor.create(string_literal469);
            adaptor.addChild(root_0, string_literal469_tree);
            }
            dbg.location(424,13);
            TOKEN470=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppls2258); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN470_tree = (Object)adaptor.create(TOKEN470);
            adaptor.addChild(root_0, TOKEN470_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(424, 18);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:427:1: ppo : 'PPO' TOKEN ;
    public final ChemicalChunkerParser.ppo_return ppo() throws RecognitionException {
        ChemicalChunkerParser.ppo_return retval = new ChemicalChunkerParser.ppo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal471=null;
        Token TOKEN472=null;

        Object string_literal471_tree=null;
        Object TOKEN472_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(427, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:427:4: ( 'PPO' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:427:5: 'PPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(427,5);
            string_literal471=(Token)match(input,157,FOLLOW_157_in_ppo2265); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal471_tree = (Object)adaptor.create(string_literal471);
            adaptor.addChild(root_0, string_literal471_tree);
            }
            dbg.location(427,11);
            TOKEN472=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppo2267); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN472_tree = (Object)adaptor.create(TOKEN472);
            adaptor.addChild(root_0, TOKEN472_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:430:1: pps : 'PPS' TOKEN ;
    public final ChemicalChunkerParser.pps_return pps() throws RecognitionException {
        ChemicalChunkerParser.pps_return retval = new ChemicalChunkerParser.pps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal473=null;
        Token TOKEN474=null;

        Object string_literal473_tree=null;
        Object TOKEN474_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "pps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(430, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:430:4: ( 'PPS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:430:5: 'PPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(430,5);
            string_literal473=(Token)match(input,158,FOLLOW_158_in_pps2274); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal473_tree = (Object)adaptor.create(string_literal473);
            adaptor.addChild(root_0, string_literal473_tree);
            }
            dbg.location(430,11);
            TOKEN474=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_pps2276); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN474_tree = (Object)adaptor.create(TOKEN474);
            adaptor.addChild(root_0, TOKEN474_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(430, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:433:1: ppss : 'PPSS' TOKEN ;
    public final ChemicalChunkerParser.ppss_return ppss() throws RecognitionException {
        ChemicalChunkerParser.ppss_return retval = new ChemicalChunkerParser.ppss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal475=null;
        Token TOKEN476=null;

        Object string_literal475_tree=null;
        Object TOKEN476_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(433, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:433:5: ( 'PPSS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:433:6: 'PPSS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(433,6);
            string_literal475=(Token)match(input,159,FOLLOW_159_in_ppss2283); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal475_tree = (Object)adaptor.create(string_literal475);
            adaptor.addChild(root_0, string_literal475_tree);
            }
            dbg.location(433,13);
            TOKEN476=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppss2285); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN476_tree = (Object)adaptor.create(TOKEN476);
            adaptor.addChild(root_0, TOKEN476_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(433, 18);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:436:1: ql : 'QL' TOKEN ;
    public final ChemicalChunkerParser.ql_return ql() throws RecognitionException {
        ChemicalChunkerParser.ql_return retval = new ChemicalChunkerParser.ql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal477=null;
        Token TOKEN478=null;

        Object string_literal477_tree=null;
        Object TOKEN478_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(436, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:436:3: ( 'QL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:436:4: 'QL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(436,4);
            string_literal477=(Token)match(input,160,FOLLOW_160_in_ql2292); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal477_tree = (Object)adaptor.create(string_literal477);
            adaptor.addChild(root_0, string_literal477_tree);
            }
            dbg.location(436,9);
            TOKEN478=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ql2294); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN478_tree = (Object)adaptor.create(TOKEN478);
            adaptor.addChild(root_0, TOKEN478_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:439:1: qlp : 'QLP' TOKEN ;
    public final ChemicalChunkerParser.qlp_return qlp() throws RecognitionException {
        ChemicalChunkerParser.qlp_return retval = new ChemicalChunkerParser.qlp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal479=null;
        Token TOKEN480=null;

        Object string_literal479_tree=null;
        Object TOKEN480_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "qlp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(439, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:439:4: ( 'QLP' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:439:5: 'QLP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(439,5);
            string_literal479=(Token)match(input,161,FOLLOW_161_in_qlp2301); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal479_tree = (Object)adaptor.create(string_literal479);
            adaptor.addChild(root_0, string_literal479_tree);
            }
            dbg.location(439,11);
            TOKEN480=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_qlp2303); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN480_tree = (Object)adaptor.create(TOKEN480);
            adaptor.addChild(root_0, TOKEN480_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(439, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:442:1: rb : 'RB' TOKEN ;
    public final ChemicalChunkerParser.rb_return rb() throws RecognitionException {
        ChemicalChunkerParser.rb_return retval = new ChemicalChunkerParser.rb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal481=null;
        Token TOKEN482=null;

        Object string_literal481_tree=null;
        Object TOKEN482_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(442, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:442:3: ( 'RB' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:442:4: 'RB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(442,4);
            string_literal481=(Token)match(input,162,FOLLOW_162_in_rb2310); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal481_tree = (Object)adaptor.create(string_literal481);
            adaptor.addChild(root_0, string_literal481_tree);
            }
            dbg.location(442,9);
            TOKEN482=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rb2312); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN482_tree = (Object)adaptor.create(TOKEN482);
            adaptor.addChild(root_0, TOKEN482_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:445:1: rbr : 'RBR' TOKEN ;
    public final ChemicalChunkerParser.rbr_return rbr() throws RecognitionException {
        ChemicalChunkerParser.rbr_return retval = new ChemicalChunkerParser.rbr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal483=null;
        Token TOKEN484=null;

        Object string_literal483_tree=null;
        Object TOKEN484_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(445, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:445:4: ( 'RBR' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:445:5: 'RBR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(445,5);
            string_literal483=(Token)match(input,163,FOLLOW_163_in_rbr2319); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal483_tree = (Object)adaptor.create(string_literal483);
            adaptor.addChild(root_0, string_literal483_tree);
            }
            dbg.location(445,11);
            TOKEN484=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbr2321); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN484_tree = (Object)adaptor.create(TOKEN484);
            adaptor.addChild(root_0, TOKEN484_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:448:1: rbt : 'RBT' TOKEN ;
    public final ChemicalChunkerParser.rbt_return rbt() throws RecognitionException {
        ChemicalChunkerParser.rbt_return retval = new ChemicalChunkerParser.rbt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal485=null;
        Token TOKEN486=null;

        Object string_literal485_tree=null;
        Object TOKEN486_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rbt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(448, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:448:4: ( 'RBT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:448:5: 'RBT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(448,5);
            string_literal485=(Token)match(input,164,FOLLOW_164_in_rbt2328); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal485_tree = (Object)adaptor.create(string_literal485);
            adaptor.addChild(root_0, string_literal485_tree);
            }
            dbg.location(448,11);
            TOKEN486=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rbt2330); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN486_tree = (Object)adaptor.create(TOKEN486);
            adaptor.addChild(root_0, TOKEN486_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:451:1: rn : 'RN' TOKEN ;
    public final ChemicalChunkerParser.rn_return rn() throws RecognitionException {
        ChemicalChunkerParser.rn_return retval = new ChemicalChunkerParser.rn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal487=null;
        Token TOKEN488=null;

        Object string_literal487_tree=null;
        Object TOKEN488_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(451, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:451:3: ( 'RN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:451:4: 'RN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(451,4);
            string_literal487=(Token)match(input,165,FOLLOW_165_in_rn2337); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal487_tree = (Object)adaptor.create(string_literal487);
            adaptor.addChild(root_0, string_literal487_tree);
            }
            dbg.location(451,9);
            TOKEN488=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rn2339); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN488_tree = (Object)adaptor.create(TOKEN488);
            adaptor.addChild(root_0, TOKEN488_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(451, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:454:1: rp : 'RP' TOKEN ;
    public final ChemicalChunkerParser.rp_return rp() throws RecognitionException {
        ChemicalChunkerParser.rp_return retval = new ChemicalChunkerParser.rp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal489=null;
        Token TOKEN490=null;

        Object string_literal489_tree=null;
        Object TOKEN490_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(454, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:454:3: ( 'RP' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:454:4: 'RP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(454,4);
            string_literal489=(Token)match(input,166,FOLLOW_166_in_rp2346); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal489_tree = (Object)adaptor.create(string_literal489);
            adaptor.addChild(root_0, string_literal489_tree);
            }
            dbg.location(454,9);
            TOKEN490=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rp2348); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN490_tree = (Object)adaptor.create(TOKEN490);
            adaptor.addChild(root_0, TOKEN490_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(454, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:457:1: sym : 'SYM' TOKEN ;
    public final ChemicalChunkerParser.sym_return sym() throws RecognitionException {
        ChemicalChunkerParser.sym_return retval = new ChemicalChunkerParser.sym_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal491=null;
        Token TOKEN492=null;

        Object string_literal491_tree=null;
        Object TOKEN492_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "sym");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(457, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:457:5: ( 'SYM' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:457:7: 'SYM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(457,7);
            string_literal491=(Token)match(input,167,FOLLOW_167_in_sym2357); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal491_tree = (Object)adaptor.create(string_literal491);
            adaptor.addChild(root_0, string_literal491_tree);
            }
            dbg.location(457,13);
            TOKEN492=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_sym2359); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN492_tree = (Object)adaptor.create(TOKEN492);
            adaptor.addChild(root_0, TOKEN492_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(457, 18);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:460:1: to : 'TO' TOKEN ;
    public final ChemicalChunkerParser.to_return to() throws RecognitionException {
        ChemicalChunkerParser.to_return retval = new ChemicalChunkerParser.to_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal493=null;
        Token TOKEN494=null;

        Object string_literal493_tree=null;
        Object TOKEN494_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "to");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(460, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:460:3: ( 'TO' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:460:4: 'TO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(460,4);
            string_literal493=(Token)match(input,168,FOLLOW_168_in_to2366); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal493_tree = (Object)adaptor.create(string_literal493);
            adaptor.addChild(root_0, string_literal493_tree);
            }
            dbg.location(460,9);
            TOKEN494=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_to2368); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN494_tree = (Object)adaptor.create(TOKEN494);
            adaptor.addChild(root_0, TOKEN494_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(460, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:463:1: uh : 'UH' TOKEN ;
    public final ChemicalChunkerParser.uh_return uh() throws RecognitionException {
        ChemicalChunkerParser.uh_return retval = new ChemicalChunkerParser.uh_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal495=null;
        Token TOKEN496=null;

        Object string_literal495_tree=null;
        Object TOKEN496_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "uh");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(463, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:463:3: ( 'UH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:463:4: 'UH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(463,4);
            string_literal495=(Token)match(input,169,FOLLOW_169_in_uh2375); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal495_tree = (Object)adaptor.create(string_literal495);
            adaptor.addChild(root_0, string_literal495_tree);
            }
            dbg.location(463,9);
            TOKEN496=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_uh2377); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN496_tree = (Object)adaptor.create(TOKEN496);
            adaptor.addChild(root_0, TOKEN496_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(463, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:466:1: vb : 'VB' TOKEN ;
    public final ChemicalChunkerParser.vb_return vb() throws RecognitionException {
        ChemicalChunkerParser.vb_return retval = new ChemicalChunkerParser.vb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal497=null;
        Token TOKEN498=null;

        Object string_literal497_tree=null;
        Object TOKEN498_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(466, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:466:3: ( 'VB' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:466:4: 'VB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(466,4);
            string_literal497=(Token)match(input,170,FOLLOW_170_in_vb2384); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal497_tree = (Object)adaptor.create(string_literal497);
            adaptor.addChild(root_0, string_literal497_tree);
            }
            dbg.location(466,9);
            TOKEN498=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vb2386); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN498_tree = (Object)adaptor.create(TOKEN498);
            adaptor.addChild(root_0, TOKEN498_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(466, 14);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:469:1: vbd : 'VBD' TOKEN ;
    public final ChemicalChunkerParser.vbd_return vbd() throws RecognitionException {
        ChemicalChunkerParser.vbd_return retval = new ChemicalChunkerParser.vbd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal499=null;
        Token TOKEN500=null;

        Object string_literal499_tree=null;
        Object TOKEN500_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(469, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:469:4: ( 'VBD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:469:5: 'VBD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(469,5);
            string_literal499=(Token)match(input,171,FOLLOW_171_in_vbd2393); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal499_tree = (Object)adaptor.create(string_literal499);
            adaptor.addChild(root_0, string_literal499_tree);
            }
            dbg.location(469,11);
            TOKEN500=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbd2395); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN500_tree = (Object)adaptor.create(TOKEN500);
            adaptor.addChild(root_0, TOKEN500_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:472:1: vbg : 'VBG' TOKEN ;
    public final ChemicalChunkerParser.vbg_return vbg() throws RecognitionException {
        ChemicalChunkerParser.vbg_return retval = new ChemicalChunkerParser.vbg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal501=null;
        Token TOKEN502=null;

        Object string_literal501_tree=null;
        Object TOKEN502_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(472, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:472:4: ( 'VBG' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:472:5: 'VBG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(472,5);
            string_literal501=(Token)match(input,172,FOLLOW_172_in_vbg2402); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal501_tree = (Object)adaptor.create(string_literal501);
            adaptor.addChild(root_0, string_literal501_tree);
            }
            dbg.location(472,11);
            TOKEN502=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbg2404); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN502_tree = (Object)adaptor.create(TOKEN502);
            adaptor.addChild(root_0, TOKEN502_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:475:1: vbn : 'VBN' TOKEN ;
    public final ChemicalChunkerParser.vbn_return vbn() throws RecognitionException {
        ChemicalChunkerParser.vbn_return retval = new ChemicalChunkerParser.vbn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal503=null;
        Token TOKEN504=null;

        Object string_literal503_tree=null;
        Object TOKEN504_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(475, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:475:4: ( 'VBN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:475:5: 'VBN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(475,5);
            string_literal503=(Token)match(input,173,FOLLOW_173_in_vbn2411); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal503_tree = (Object)adaptor.create(string_literal503);
            adaptor.addChild(root_0, string_literal503_tree);
            }
            dbg.location(475,11);
            TOKEN504=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbn2413); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN504_tree = (Object)adaptor.create(TOKEN504);
            adaptor.addChild(root_0, TOKEN504_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(475, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:478:1: vbz : 'VBZ' TOKEN ;
    public final ChemicalChunkerParser.vbz_return vbz() throws RecognitionException {
        ChemicalChunkerParser.vbz_return retval = new ChemicalChunkerParser.vbz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal505=null;
        Token TOKEN506=null;

        Object string_literal505_tree=null;
        Object TOKEN506_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbz");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(478, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:478:4: ( 'VBZ' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:478:5: 'VBZ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(478,5);
            string_literal505=(Token)match(input,174,FOLLOW_174_in_vbz2420); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal505_tree = (Object)adaptor.create(string_literal505);
            adaptor.addChild(root_0, string_literal505_tree);
            }
            dbg.location(478,11);
            TOKEN506=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbz2422); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN506_tree = (Object)adaptor.create(TOKEN506);
            adaptor.addChild(root_0, TOKEN506_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(478, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:481:1: wdt : 'WDT' TOKEN ;
    public final ChemicalChunkerParser.wdt_return wdt() throws RecognitionException {
        ChemicalChunkerParser.wdt_return retval = new ChemicalChunkerParser.wdt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal507=null;
        Token TOKEN508=null;

        Object string_literal507_tree=null;
        Object TOKEN508_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wdt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(481, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:481:4: ( 'WDT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:481:5: 'WDT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(481,5);
            string_literal507=(Token)match(input,175,FOLLOW_175_in_wdt2429); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal507_tree = (Object)adaptor.create(string_literal507);
            adaptor.addChild(root_0, string_literal507_tree);
            }
            dbg.location(481,11);
            TOKEN508=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wdt2431); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN508_tree = (Object)adaptor.create(TOKEN508);
            adaptor.addChild(root_0, TOKEN508_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(481, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:484:1: wp_poss : 'WP$' TOKEN ;
    public final ChemicalChunkerParser.wp_poss_return wp_poss() throws RecognitionException {
        ChemicalChunkerParser.wp_poss_return retval = new ChemicalChunkerParser.wp_poss_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal509=null;
        Token TOKEN510=null;

        Object string_literal509_tree=null;
        Object TOKEN510_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wp_poss");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(484, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:484:8: ( 'WP$' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:484:9: 'WP$' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(484,9);
            string_literal509=(Token)match(input,176,FOLLOW_176_in_wp_poss2438); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal509_tree = (Object)adaptor.create(string_literal509);
            adaptor.addChild(root_0, string_literal509_tree);
            }
            dbg.location(484,15);
            TOKEN510=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wp_poss2440); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN510_tree = (Object)adaptor.create(TOKEN510);
            adaptor.addChild(root_0, TOKEN510_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(484, 20);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:487:1: wpo : 'WPO' TOKEN ;
    public final ChemicalChunkerParser.wpo_return wpo() throws RecognitionException {
        ChemicalChunkerParser.wpo_return retval = new ChemicalChunkerParser.wpo_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal511=null;
        Token TOKEN512=null;

        Object string_literal511_tree=null;
        Object TOKEN512_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wpo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(487, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:487:4: ( 'WPO' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:487:5: 'WPO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(487,5);
            string_literal511=(Token)match(input,177,FOLLOW_177_in_wpo2447); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal511_tree = (Object)adaptor.create(string_literal511);
            adaptor.addChild(root_0, string_literal511_tree);
            }
            dbg.location(487,11);
            TOKEN512=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wpo2449); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN512_tree = (Object)adaptor.create(TOKEN512);
            adaptor.addChild(root_0, TOKEN512_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(487, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:490:1: wps : 'WPS' TOKEN ;
    public final ChemicalChunkerParser.wps_return wps() throws RecognitionException {
        ChemicalChunkerParser.wps_return retval = new ChemicalChunkerParser.wps_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal513=null;
        Token TOKEN514=null;

        Object string_literal513_tree=null;
        Object TOKEN514_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wps");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(490, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:490:4: ( 'WPS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:490:5: 'WPS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(490,5);
            string_literal513=(Token)match(input,178,FOLLOW_178_in_wps2456); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal513_tree = (Object)adaptor.create(string_literal513);
            adaptor.addChild(root_0, string_literal513_tree);
            }
            dbg.location(490,11);
            TOKEN514=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wps2458); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN514_tree = (Object)adaptor.create(TOKEN514);
            adaptor.addChild(root_0, TOKEN514_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(490, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:493:1: wql : 'WQL' TOKEN ;
    public final ChemicalChunkerParser.wql_return wql() throws RecognitionException {
        ChemicalChunkerParser.wql_return retval = new ChemicalChunkerParser.wql_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal515=null;
        Token TOKEN516=null;

        Object string_literal515_tree=null;
        Object TOKEN516_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wql");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(493, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:493:4: ( 'WQL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:493:5: 'WQL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(493,5);
            string_literal515=(Token)match(input,179,FOLLOW_179_in_wql2465); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal515_tree = (Object)adaptor.create(string_literal515);
            adaptor.addChild(root_0, string_literal515_tree);
            }
            dbg.location(493,11);
            TOKEN516=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wql2467); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN516_tree = (Object)adaptor.create(TOKEN516);
            adaptor.addChild(root_0, TOKEN516_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(493, 16);

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
    // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:496:1: wrb : 'WRB' TOKEN ;
    public final ChemicalChunkerParser.wrb_return wrb() throws RecognitionException {
        ChemicalChunkerParser.wrb_return retval = new ChemicalChunkerParser.wrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal517=null;
        Token TOKEN518=null;

        Object string_literal517_tree=null;
        Object TOKEN518_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(496, 1);

        try {
            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:496:4: ( 'WRB' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:496:5: 'WRB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(496,5);
            string_literal517=(Token)match(input,180,FOLLOW_180_in_wrb2474); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal517_tree = (Object)adaptor.create(string_literal517);
            adaptor.addChild(root_0, string_literal517_tree);
            }
            dbg.location(496,11);
            TOKEN518=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_wrb2476); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TOKEN518_tree = (Object)adaptor.create(TOKEN518);
            adaptor.addChild(root_0, TOKEN518_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(496, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wrb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wrb"

    // $ANTLR start synpred2_ChemicalChunker
    public final void synpred2_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:5: ( nounphrase )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:5: nounphrase
        {
        dbg.location(33,5);
        pushFollow(FOLLOW_nounphrase_in_synpred2_ChemicalChunker189);
        nounphrase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_ChemicalChunker

    // $ANTLR start synpred3_ChemicalChunker
    public final void synpred3_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:16: ( verbphrase )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:33:16: verbphrase
        {
        dbg.location(33,16);
        pushFollow(FOLLOW_verbphrase_in_synpred3_ChemicalChunker191);
        verbphrase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_ChemicalChunker

    // $ANTLR start synpred9_ChemicalChunker
    public final void synpred9_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:12: ( noun )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:12: noun
        {
        dbg.location(38,12);
        pushFollow(FOLLOW_noun_in_synpred9_ChemicalChunker242);
        noun();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_ChemicalChunker

    // $ANTLR start synpred10_ChemicalChunker
    public final void synpred10_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:19: ( comma noun )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:19: comma noun
        {
        dbg.location(38,19);
        pushFollow(FOLLOW_comma_in_synpred10_ChemicalChunker246);
        comma();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(38,25);
        pushFollow(FOLLOW_noun_in_synpred10_ChemicalChunker248);
        noun();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_ChemicalChunker

    // $ANTLR start synpred11_ChemicalChunker
    public final void synpred11_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:33: ( cc noun )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:33: cc noun
        {
        dbg.location(38,33);
        pushFollow(FOLLOW_cc_in_synpred11_ChemicalChunker253);
        cc();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(38,36);
        pushFollow(FOLLOW_noun_in_synpred11_ChemicalChunker255);
        noun();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_ChemicalChunker

    // $ANTLR start synpred12_ChemicalChunker
    public final void synpred12_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:43: ( prepphraseOf )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:43: prepphraseOf
        {
        dbg.location(38,43);
        pushFollow(FOLLOW_prepphraseOf_in_synpred12_ChemicalChunker259);
        prepphraseOf();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_ChemicalChunker

    // $ANTLR start synpred13_ChemicalChunker
    public final void synpred13_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:57: ( prepphraseIN )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:38:57: prepphraseIN
        {
        dbg.location(38,57);
        pushFollow(FOLLOW_prepphraseIN_in_synpred13_ChemicalChunker262);
        prepphraseIN();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_ChemicalChunker

    // $ANTLR start synpred17_ChemicalChunker
    public final void synpred17_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:23: ( adv )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:23: adv
        {
        dbg.location(41,23);
        pushFollow(FOLLOW_adv_in_synpred17_ChemicalChunker287);
        adv();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_ChemicalChunker

    // $ANTLR start synpred18_ChemicalChunker
    public final void synpred18_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:28: ( prepphrase )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:41:28: prepphrase
        {
        dbg.location(41,28);
        pushFollow(FOLLOW_prepphrase_in_synpred18_ChemicalChunker290);
        prepphrase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_ChemicalChunker

    // $ANTLR start synpred86_ChemicalChunker
    public final void synpred86_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:60:5: ( prepphraseOther )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:60:5: prepphraseOther
        {
        dbg.location(60,5);
        pushFollow(FOLLOW_prepphraseOther_in_synpred86_ChemicalChunker515);
        prepphraseOther();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_ChemicalChunker

    // $ANTLR start synpred87_ChemicalChunker
    public final void synpred87_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:60:21: ( prepphraseTemp )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:60:21: prepphraseTemp
        {
        dbg.location(60,21);
        pushFollow(FOLLOW_prepphraseTemp_in_synpred87_ChemicalChunker517);
        prepphraseTemp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_ChemicalChunker

    // $ANTLR start synpred115_ChemicalChunker
    public final void synpred115_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:91:17: ( oscarcm )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:91:17: oscarcm
        {
        dbg.location(91,17);
        pushFollow(FOLLOW_oscarcm_in_synpred115_ChemicalChunker851);
        oscarcm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_ChemicalChunker

    // $ANTLR start synpred116_ChemicalChunker
    public final void synpred116_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:97:17: ( amount )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:97:17: amount
        {
        dbg.location(97,17);
        pushFollow(FOLLOW_amount_in_synpred116_ChemicalChunker886);
        amount();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_ChemicalChunker

    // $ANTLR start synpred118_ChemicalChunker
    public final void synpred118_ChemicalChunker_fragment() throws RecognitionException {   
        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:106:11: ( amount )
        dbg.enterAlt(1);

        // C:\\Users\\pm286\\workspaceOld\\chemicaltagger\\src\\main\\antlr3\\uk\\ac\\cam\\ch\\wwmm\\chemicaltagger\\ChemicalChunker.g:106:11: amount
        {
        dbg.location(106,11);
        pushFollow(FOLLOW_amount_in_synpred118_ChemicalChunker954);
        amount();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred118_ChemicalChunker

    // Delegated rules

    public final boolean synpred3_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred3_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred115_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred86_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred11_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred17_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred12_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred18_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred87_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred9_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred13_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred116_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred10_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred118_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_ChemicalChunker() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_ChemicalChunker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA2_eotS =
        "\114\uffff";
    static final String DFA2_eofS =
        "\1\1\113\uffff";
    static final String DFA2_minS =
        "\1\12\1\uffff\110\0\2\uffff";
    static final String DFA2_maxS =
        "\1\u00b2\1\uffff\110\0\2\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\3\110\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\2\uffff\1\25\1\44\1\62\1\32\1\41\1\56\1\37\1\60\1\67\1\6\1\42"+
        "\1\53\1\65\1\76\1\72\1\77\1\7\1\0\1\14\1\30\1\22\1\36\1\33\1\52"+
        "\1\57\1\54\1\40\1\106\1\4\1\17\1\10\1\45\1\104\1\15\1\13\1\43\1"+
        "\46\1\1\1\12\1\63\1\73\1\100\1\105\1\2\1\23\1\26\1\34\1\107\1\103"+
        "\1\74\1\70\1\61\1\47\1\24\1\21\1\16\1\11\1\102\1\71\1\66\1\50\1"+
        "\51\1\35\1\31\1\3\1\5\1\75\1\101\1\55\1\64\1\27\1\20\2\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\11\1\7\1\42\22\uffff\1\13\1\14\2\uffff\1\15\1\16\1\uffff"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
            "\1\12\1\52\1\53\1\54\1\55\1\uffff\1\43\1\56\1\57\1\60\1\61\1"+
            "\62\1\63\1\64\1\65\1\33\1\66\1\34\1\67\1\70\1\71\1\72\1\uffff"+
            "\1\73\1\uffff\1\74\1\uffff\1\75\1\76\1\77\1\100\1\uffff\1\101"+
            "\1\uffff\1\102\1\103\1\104\1\uffff\1\105\1\106\1\41\1\107\1"+
            "\110\1\111\1\uffff\1\1\3\uffff\1\1\3\uffff\1\44\16\uffff\1\1"+
            "\1\10\4\uffff\1\2\12\uffff\1\3\1\4\1\5\1\6\27\uffff\1\46\1\47"+
            "\1\50\3\uffff\1\45\2\uffff\1\51\3\uffff\1\35\1\36\1\37\1\40",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "()+ loopback of 33:4: ( nounphrase | verbphrase )+";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_19 = input.LA(1);

                         
                        int index2_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_39 = input.LA(1);

                         
                        int index2_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_39);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_45 = input.LA(1);

                         
                        int index2_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_45);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_66 = input.LA(1);

                         
                        int index2_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_66);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_30 = input.LA(1);

                         
                        int index2_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_30);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_67 = input.LA(1);

                         
                        int index2_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_67);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_18 = input.LA(1);

                         
                        int index2_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_32 = input.LA(1);

                         
                        int index2_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_32);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_58 = input.LA(1);

                         
                        int index2_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_58);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_40 = input.LA(1);

                         
                        int index2_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_40);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_36 = input.LA(1);

                         
                        int index2_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_36);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA2_20 = input.LA(1);

                         
                        int index2_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_20);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA2_35 = input.LA(1);

                         
                        int index2_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_35);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA2_57 = input.LA(1);

                         
                        int index2_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_57);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA2_31 = input.LA(1);

                         
                        int index2_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_31);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA2_73 = input.LA(1);

                         
                        int index2_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_73);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA2_56 = input.LA(1);

                         
                        int index2_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_56);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA2_22 = input.LA(1);

                         
                        int index2_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_22);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA2_46 = input.LA(1);

                         
                        int index2_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_46);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA2_55 = input.LA(1);

                         
                        int index2_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_55);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA2_47 = input.LA(1);

                         
                        int index2_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_47);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA2_72 = input.LA(1);

                         
                        int index2_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_72);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA2_21 = input.LA(1);

                         
                        int index2_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_21);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA2_65 = input.LA(1);

                         
                        int index2_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_65);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA2_24 = input.LA(1);

                         
                        int index2_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_24);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA2_48 = input.LA(1);

                         
                        int index2_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_48);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA2_64 = input.LA(1);

                         
                        int index2_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_64);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA2_23 = input.LA(1);

                         
                        int index2_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_23);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA2_28 = input.LA(1);

                         
                        int index2_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_28);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_12);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA2_37 = input.LA(1);

                         
                        int index2_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_37);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA2_33 = input.LA(1);

                         
                        int index2_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_33);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA2_38 = input.LA(1);

                         
                        int index2_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_38);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA2_54 = input.LA(1);

                         
                        int index2_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_54);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA2_62 = input.LA(1);

                         
                        int index2_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_62);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA2_63 = input.LA(1);

                         
                        int index2_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_63);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA2_25 = input.LA(1);

                         
                        int index2_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_25);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_13);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA2_27 = input.LA(1);

                         
                        int index2_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_27);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA2_70 = input.LA(1);

                         
                        int index2_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_70);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA2_26 = input.LA(1);

                         
                        int index2_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_26);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA2_53 = input.LA(1);

                         
                        int index2_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_53);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA2_41 = input.LA(1);

                         
                        int index2_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_41);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA2_71 = input.LA(1);

                         
                        int index2_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_71);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA2_14 = input.LA(1);

                         
                        int index2_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_14);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA2_61 = input.LA(1);

                         
                        int index2_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_61);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_10);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA2_52 = input.LA(1);

                         
                        int index2_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_52);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA2_60 = input.LA(1);

                         
                        int index2_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_60);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA2_16 = input.LA(1);

                         
                        int index2_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_16);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA2_42 = input.LA(1);

                         
                        int index2_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_42);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA2_51 = input.LA(1);

                         
                        int index2_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_51);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA2_68 = input.LA(1);

                         
                        int index2_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_68);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_15);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA2_17 = input.LA(1);

                         
                        int index2_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_17);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA2_43 = input.LA(1);

                         
                        int index2_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_43);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA2_69 = input.LA(1);

                         
                        int index2_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_69);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA2_59 = input.LA(1);

                         
                        int index2_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_59);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA2_50 = input.LA(1);

                         
                        int index2_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_50);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA2_34 = input.LA(1);

                         
                        int index2_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_34);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA2_44 = input.LA(1);

                         
                        int index2_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_44);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA2_29 = input.LA(1);

                         
                        int index2_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ChemicalChunker()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_29);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA2_49 = input.LA(1);

                         
                        int index2_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_ChemicalChunker()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_49);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA6_eotS =
        "\40\uffff";
    static final String DFA6_eofS =
        "\1\1\37\uffff";
    static final String DFA6_minS =
        "\1\12\1\uffff\35\0\1\uffff";
    static final String DFA6_maxS =
        "\1\u00b2\1\uffff\35\0\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\2\35\uffff\1\1";
    static final String DFA6_specialS =
        "\2\uffff\1\30\1\10\1\2\1\15\1\6\1\12\1\5\1\24\1\14\1\4\1\34\1\25"+
        "\1\26\1\20\1\32\1\3\1\13\1\21\1\33\1\31\1\11\1\27\1\1\1\7\1\16\1"+
        "\0\1\23\1\22\1\17\1\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\3\1\1\1\34\2\uffff\20\1\1\5\1\6\2\uffff\1\7\1\10\1\uffff"+
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
            "\1\4\4\1\1\uffff\1\35\10\1\1\25\1\1\1\26\4\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\33\3"+
            "\1\1\uffff\1\1\3\uffff\1\1\3\uffff\1\36\16\uffff\1\1\1\2\4\uffff"+
            "\1\1\11\uffff\5\1\27\uffff\3\1\3\uffff\1\1\2\uffff\1\1\3\uffff"+
            "\1\27\1\30\1\31\1\32",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "()+ loopback of 38:12: ( noun )+";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_27 = input.LA(1);

                         
                        int index6_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_27);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_24 = input.LA(1);

                         
                        int index6_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_17 = input.LA(1);

                         
                        int index6_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_11 = input.LA(1);

                         
                        int index6_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_8 = input.LA(1);

                         
                        int index6_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_25 = input.LA(1);

                         
                        int index6_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_25);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_22 = input.LA(1);

                         
                        int index6_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_22);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA6_18 = input.LA(1);

                         
                        int index6_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_18);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA6_10 = input.LA(1);

                         
                        int index6_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_10);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA6_26 = input.LA(1);

                         
                        int index6_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_26);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA6_30 = input.LA(1);

                         
                        int index6_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_30);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA6_15 = input.LA(1);

                         
                        int index6_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_15);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA6_19 = input.LA(1);

                         
                        int index6_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA6_29 = input.LA(1);

                         
                        int index6_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_29);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA6_28 = input.LA(1);

                         
                        int index6_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_28);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA6_9 = input.LA(1);

                         
                        int index6_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_9);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA6_13 = input.LA(1);

                         
                        int index6_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_13);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA6_14 = input.LA(1);

                         
                        int index6_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_14);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA6_23 = input.LA(1);

                         
                        int index6_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_23);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA6_21 = input.LA(1);

                         
                        int index6_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_21);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA6_16 = input.LA(1);

                         
                        int index6_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_16);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA6_20 = input.LA(1);

                         
                        int index6_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_20);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA6_12 = input.LA(1);

                         
                        int index6_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_ChemicalChunker()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\143\uffff";
    static final String DFA7_eofS =
        "\1\1\2\uffff\1\1\137\uffff";
    static final String DFA7_minS =
        "\1\12\1\uffff\1\11\1\12\35\11\34\0\1\62\1\uffff\2\11\1\41\1\62"+
        "\5\11\4\137\1\62\3\11\1\167\1\0\1\62\2\11\1\41\1\167\5\11\4\137"+
        "\1\150\1\11\1\0";
    static final String DFA7_maxS =
        "\1\u00b2\1\uffff\1\11\1\u00b2\35\11\34\0\1\167\1\uffff\2\11\1\144"+
        "\1\142\5\11\4\150\1\62\3\11\1\167\1\0\1\u00a7\2\11\1\144\1\167\5"+
        "\11\5\150\1\11\1\0";
    static final String DFA7_acceptS =
        "\1\uffff\1\2\74\uffff\1\1\44\uffff";
    static final String DFA7_specialS =
        "\41\uffff\1\31\1\5\1\35\1\6\1\10\1\21\1\22\1\25\1\27\1\30\1\33"+
        "\1\3\1\1\1\7\1\17\1\13\1\20\1\24\1\23\1\34\1\26\1\2\1\12\1\16\1"+
        "\14\1\15\1\32\1\4\24\uffff\1\0\20\uffff\1\11}>";
    static final String[] DFA7_transitionS = {
            "\3\1\2\uffff\22\1\2\uffff\2\1\1\uffff\21\1\1\uffff\20\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\6\1\1\uffff\1\2\3\uffff\1\1\3\uffff\1\1\16\uffff\2\1\4\uffff"+
            "\1\1\11\uffff\5\1\27\uffff\3\1\3\uffff\1\1\2\uffff\1\1\3\uffff"+
            "\4\1",
            "",
            "\1\3",
            "\1\5\1\1\1\36\22\uffff\1\7\1\10\2\uffff\1\11\1\12\1\uffff"+
            "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
            "\1\6\4\1\1\uffff\1\37\10\1\1\27\1\1\1\30\4\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\35\3"+
            "\1\1\uffff\1\1\3\uffff\1\1\3\uffff\1\40\16\uffff\1\1\1\4\4\uffff"+
            "\1\1\12\uffff\4\1\27\uffff\3\1\3\uffff\1\1\2\uffff\1\1\3\uffff"+
            "\1\31\1\32\1\33\1\34",
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
            "\1\74",
            "\1\75",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\100\104\uffff\1\77",
            "",
            "\1\101",
            "\1\102",
            "\1\104\1\106\2\uffff\1\103\76\uffff\1\105",
            "\1\100\57\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115\10\uffff\1\116",
            "\1\115\10\uffff\1\116",
            "\1\115\10\uffff\1\116",
            "\1\115\10\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\uffff",
            "\1\117\164\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\131\1\127\2\uffff\1\132\76\uffff\1\130",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\115\10\uffff\1\116",
            "\1\115\10\uffff\1\116",
            "\1\115\10\uffff\1\116",
            "\1\115\10\uffff\1\116",
            "\1\141",
            "\1\142",
            "\1\uffff"
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
            return "()* loopback of 38:18: ( comma noun )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_81 = input.LA(1);

                         
                        int index7_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_81);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_45 = input.LA(1);

                         
                        int index7_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_45);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_54 = input.LA(1);

                         
                        int index7_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_54);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_44 = input.LA(1);

                         
                        int index7_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_44);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_60 = input.LA(1);

                         
                        int index7_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_60);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_34 = input.LA(1);

                         
                        int index7_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_34);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_36 = input.LA(1);

                         
                        int index7_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_36);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_46 = input.LA(1);

                         
                        int index7_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_46);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_37 = input.LA(1);

                         
                        int index7_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_37);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_98 = input.LA(1);

                         
                        int index7_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_98);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA7_55 = input.LA(1);

                         
                        int index7_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_55);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA7_48 = input.LA(1);

                         
                        int index7_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_48);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA7_57 = input.LA(1);

                         
                        int index7_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_57);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA7_58 = input.LA(1);

                         
                        int index7_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_58);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA7_56 = input.LA(1);

                         
                        int index7_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_56);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA7_47 = input.LA(1);

                         
                        int index7_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_47);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA7_49 = input.LA(1);

                         
                        int index7_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_49);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA7_38 = input.LA(1);

                         
                        int index7_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_38);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA7_39 = input.LA(1);

                         
                        int index7_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_39);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA7_51 = input.LA(1);

                         
                        int index7_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_51);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA7_50 = input.LA(1);

                         
                        int index7_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_50);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA7_40 = input.LA(1);

                         
                        int index7_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_40);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA7_53 = input.LA(1);

                         
                        int index7_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_53);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA7_41 = input.LA(1);

                         
                        int index7_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_41);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA7_42 = input.LA(1);

                         
                        int index7_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_42);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA7_33 = input.LA(1);

                         
                        int index7_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_33);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA7_59 = input.LA(1);

                         
                        int index7_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_59);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA7_43 = input.LA(1);

                         
                        int index7_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_43);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA7_52 = input.LA(1);

                         
                        int index7_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_52);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA7_35 = input.LA(1);

                         
                        int index7_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\143\uffff";
    static final String DFA8_eofS =
        "\1\1\2\uffff\1\1\137\uffff";
    static final String DFA8_minS =
        "\1\12\1\uffff\1\11\1\12\35\11\34\0\1\62\1\uffff\2\11\1\62\1\41"+
        "\5\11\1\62\4\137\3\11\1\62\1\167\1\0\2\11\1\167\1\41\5\11\1\150"+
        "\4\137\1\11\1\0";
    static final String DFA8_maxS =
        "\1\u00b2\1\uffff\1\11\1\u00b2\35\11\34\0\1\167\1\uffff\2\11\1\142"+
        "\1\144\5\11\1\62\4\150\3\11\1\u00a7\1\167\1\0\2\11\1\167\1\144\5"+
        "\11\5\150\1\11\1\0";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\74\uffff\1\1\44\uffff";
    static final String DFA8_specialS =
        "\41\uffff\1\25\1\27\1\16\1\10\1\0\1\33\1\30\1\26\1\24\1\20\1\17"+
        "\1\14\1\13\1\7\1\5\1\1\1\31\1\32\1\34\1\35\1\23\1\15\1\12\1\3\1"+
        "\4\1\6\1\22\1\11\25\uffff\1\2\17\uffff\1\21}>";
    static final String[] DFA8_transitionS = {
            "\3\1\2\uffff\22\1\2\uffff\2\1\1\uffff\21\1\1\uffff\20\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\6\1\1\uffff\1\1\3\uffff\1\1\3\uffff\1\1\16\uffff\1\2\1\1\4"+
            "\uffff\1\1\11\uffff\5\1\27\uffff\3\1\3\uffff\1\1\2\uffff\1\1"+
            "\3\uffff\4\1",
            "",
            "\1\3",
            "\1\5\1\1\1\36\22\uffff\1\7\1\10\2\uffff\1\11\1\12\1\uffff"+
            "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
            "\1\6\4\1\1\uffff\1\37\10\1\1\27\1\1\1\30\4\1\1\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\35\3"+
            "\1\1\uffff\1\1\3\uffff\1\1\3\uffff\1\40\16\uffff\1\1\1\4\4\uffff"+
            "\1\1\12\uffff\4\1\27\uffff\3\1\3\uffff\1\1\2\uffff\1\1\3\uffff"+
            "\1\31\1\32\1\33\1\34",
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
            "\1\74",
            "\1\75",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\77\104\uffff\1\100",
            "",
            "\1\101",
            "\1\102",
            "\1\77\57\uffff\1\103",
            "\1\105\1\106\2\uffff\1\104\76\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116\10\uffff\1\117",
            "\1\116\10\uffff\1\117",
            "\1\116\10\uffff\1\117",
            "\1\116\10\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\115\164\uffff\1\123",
            "\1\124",
            "\1\uffff",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\131\1\132\2\uffff\1\133\76\uffff\1\130",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\116\10\uffff\1\117",
            "\1\116\10\uffff\1\117",
            "\1\116\10\uffff\1\117",
            "\1\116\10\uffff\1\117",
            "\1\142",
            "\1\uffff"
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
            return "()* loopback of 38:32: ( cc noun )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_37 = input.LA(1);

                         
                        int index8_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_37);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_48 = input.LA(1);

                         
                        int index8_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_48);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_82 = input.LA(1);

                         
                        int index8_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_82);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_56 = input.LA(1);

                         
                        int index8_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_56);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_57 = input.LA(1);

                         
                        int index8_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_57);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_47 = input.LA(1);

                         
                        int index8_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_47);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_58 = input.LA(1);

                         
                        int index8_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_58);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_46 = input.LA(1);

                         
                        int index8_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_46);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_36 = input.LA(1);

                         
                        int index8_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_36);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_60 = input.LA(1);

                         
                        int index8_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_60);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_55 = input.LA(1);

                         
                        int index8_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_55);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA8_45 = input.LA(1);

                         
                        int index8_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_45);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA8_44 = input.LA(1);

                         
                        int index8_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_44);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA8_54 = input.LA(1);

                         
                        int index8_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_54);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA8_35 = input.LA(1);

                         
                        int index8_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_35);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA8_43 = input.LA(1);

                         
                        int index8_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_43);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA8_42 = input.LA(1);

                         
                        int index8_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_42);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA8_98 = input.LA(1);

                         
                        int index8_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_98);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA8_59 = input.LA(1);

                         
                        int index8_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_59);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA8_53 = input.LA(1);

                         
                        int index8_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_53);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA8_41 = input.LA(1);

                         
                        int index8_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_41);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA8_33 = input.LA(1);

                         
                        int index8_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_33);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA8_40 = input.LA(1);

                         
                        int index8_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_40);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA8_34 = input.LA(1);

                         
                        int index8_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_34);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA8_39 = input.LA(1);

                         
                        int index8_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_39);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA8_49 = input.LA(1);

                         
                        int index8_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_49);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA8_50 = input.LA(1);

                         
                        int index8_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_50);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA8_38 = input.LA(1);

                         
                        int index8_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_38);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA8_51 = input.LA(1);

                         
                        int index8_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_51);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA8_52 = input.LA(1);

                         
                        int index8_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_ChemicalChunker()) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index8_52);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\17\uffff";
    static final String DFA15_eofS =
        "\1\1\10\uffff\1\1\5\uffff";
    static final String DFA15_minS =
        "\1\12\1\uffff\4\11\1\uffff\4\12\2\11\2\0";
    static final String DFA15_maxS =
        "\1\u00b2\1\uffff\4\11\1\uffff\4\u00b2\2\11\2\0";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\4\uffff\1\1\10\uffff";
    static final String DFA15_specialS =
        "\15\uffff\1\0\1\1}>";
    static final String[] DFA15_transitionS = {
            "\3\1\2\uffff\20\6\2\1\2\uffff\2\1\1\uffff\21\1\1\uffff\20\1"+
            "\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1"+
            "\1\uffff\6\1\1\uffff\1\1\3\uffff\1\1\3\uffff\1\1\16\uffff\1"+
            "\1\1\4\4\uffff\1\2\11\uffff\1\6\1\3\3\1\27\uffff\3\1\3\uffff"+
            "\1\5\2\uffff\1\1\3\uffff\4\1",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            "\3\1\22\uffff\2\1\2\uffff\2\1\1\uffff\15\1\5\uffff\1\1\10"+
            "\uffff\1\1\1\uffff\1\1\26\uffff\1\1\14\uffff\1\1\17\uffff\1"+
            "\4\17\uffff\1\3\3\1\44\uffff\4\1",
            "\3\1\22\uffff\2\1\2\uffff\2\1\1\uffff\15\1\5\uffff\1\1\10"+
            "\uffff\1\1\1\uffff\1\1\26\uffff\1\1\14\uffff\1\1\17\uffff\1"+
            "\4\17\uffff\4\1\44\uffff\4\1",
            "\3\1\5\uffff\1\1\5\uffff\1\1\6\uffff\1\1\1\14\6\1\1\13\17"+
            "\1\1\uffff\20\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff"+
            "\1\1\1\uffff\3\1\1\uffff\6\1\1\uffff\1\1\3\uffff\2\1\2\uffff"+
            "\1\1\16\uffff\2\1\4\uffff\1\1\12\uffff\4\1\27\uffff\3\1\3\uffff"+
            "\1\1\2\uffff\1\1\3\uffff\4\1",
            "\3\6\2\uffff\22\6\2\uffff\2\6\1\uffff\15\6\4\1\1\uffff\1\6"+
            "\10\1\1\6\1\1\1\6\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1"+
            "\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\6\3\1\11\uffff\1\6\17\uffff"+
            "\1\6\4\uffff\1\6\11\uffff\5\6\27\uffff\3\1\3\uffff\1\6\2\uffff"+
            "\1\1\3\uffff\4\6",
            "\1\15",
            "\1\16",
            "\1\uffff",
            "\1\uffff"
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
            return "()* loopback of 41:28: ( prepphrase )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_ChemicalChunker()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_14 = input.LA(1);

                         
                        int index15_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_ChemicalChunker()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\55\uffff";
    static final String DFA18_eofS =
        "\36\uffff\1\40\16\uffff";
    static final String DFA18_minS =
        "\1\12\1\11\33\uffff\1\11\1\12\1\62\1\uffff\4\11\2\uffff\4\30\1"+
        "\11\1\12";
    static final String DFA18_maxS =
        "\1\u00b2\1\11\33\uffff\1\11\1\u00b2\1\167\1\uffff\4\11\2\uffff"+
        "\4\30\1\11\1\62";
    static final String DFA18_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\3\uffff\1\36\4\uffff\1\35\1\34\6\uffff";
    static final String DFA18_specialS =
        "\55\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\1\33\22\uffff\1\4\1\5\2\uffff\1\6\1\7\1\uffff"+
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\1\3\5\uffff\1\34\10\uffff\1\24\1\uffff\1\25\26\uffff\1\32\14"+
            "\uffff\1\35\17\uffff\1\1\67\uffff\1\26\1\27\1\30\1\31",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "\3\40\2\uffff\22\40\1\43\1\41\2\40\1\44\21\40\1\uffff\20\40"+
            "\1\uffff\1\40\1\uffff\1\40\1\uffff\4\40\1\uffff\1\40\1\uffff"+
            "\3\40\1\uffff\6\40\1\uffff\1\40\3\uffff\1\40\1\42\2\uffff\1"+
            "\40\16\uffff\2\40\4\uffff\1\40\11\uffff\5\40\27\uffff\3\40\3"+
            "\uffff\1\40\2\uffff\1\40\3\uffff\4\40",
            "\1\46\104\uffff\1\45",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\54",
            "\1\2\47\uffff\1\3"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "49:1: noun : ( unnamedmolecule | molecule | nnstate | nntime | nnatmosphere | nneq | nnchementity | nntemp | nnflash | nngeneral | nnmethod | nnamount | nnpressure | nncolumn | nnchromatography | nnvacuum | nncycle | nntimes | nnapparatus | nnconcentrate | wdt | wp_poss | wpo | wps | nnsynthesize | oscaront | nnmixture | mixture | amount | cd );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA21_eotS =
        "\70\uffff";
    static final String DFA21_eofS =
        "\63\uffff\1\56\4\uffff";
    static final String DFA21_minS =
        "\1\17\25\11\22\12\2\167\1\40\3\11\3\uffff\3\12\2\11\2\0";
    static final String DFA21_maxS =
        "\1\u00a8\25\11\22\u00b2\1\u0087\1\167\1\47\3\11\3\uffff\3\u00b2"+
        "\2\11\2\0";
    static final String DFA21_acceptS =
        "\56\uffff\1\1\1\3\1\2\7\uffff";
    static final String DFA21_specialS =
        "\66\uffff\1\0\1\1}>";
    static final String[] DFA21_transitionS = {
            "\1\3\1\4\1\2\1\10\1\11\1\20\1\21\1\5\1\17\1\12\1\14\1\6\1\7"+
            "\1\16\1\15\1\13\130\uffff\1\25\4\uffff\1\23\11\uffff\1\1\1\24"+
            "\40\uffff\1\22",
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
            "\1\52",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\3\56\2\uffff\22\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\4\uffff\1\53\11\uffff\1\56\1\54\3\56\35\uffff\1\56\6\uffff"+
            "\4\56",
            "\1\25\17\uffff\1\24",
            "\1\25",
            "\1\57\6\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "\3\56\22\uffff\2\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\17\uffff\1\54\3\56\44\uffff\4\56",
            "\3\56\22\uffff\2\56\2\uffff\2\56\1\uffff\15\56\5\uffff\1\56"+
            "\10\uffff\1\56\1\uffff\1\56\26\uffff\1\56\14\uffff\1\56\17\uffff"+
            "\1\55\17\uffff\4\56\44\uffff\4\56",
            "\3\56\2\uffff\21\56\1\64\6\56\1\65\17\56\1\uffff\20\56\1\uffff"+
            "\1\56\1\uffff\1\56\1\uffff\4\56\1\uffff\1\56\1\uffff\3\56\1"+
            "\uffff\6\56\1\uffff\1\56\3\uffff\2\56\2\uffff\1\56\16\uffff"+
            "\2\56\4\uffff\1\56\11\uffff\5\56\27\uffff\3\56\3\uffff\1\56"+
            "\2\uffff\1\56\3\uffff\4\56",
            "\1\66",
            "\1\67",
            "\1\uffff",
            "\1\uffff"
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
            return "59:1: prepphrase : ( prepphraseOther | prepphraseTemp | prepphraseTime );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_54 = input.LA(1);

                         
                        int index21_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_ChemicalChunker()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index21_54);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_55 = input.LA(1);

                         
                        int index21_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_ChemicalChunker()) ) {s = 46;}

                        else if ( (synpred87_ChemicalChunker()) ) {s = 48;}

                         
                        input.seek(index21_55);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\35\uffff";
    static final String DFA32_eofS =
        "\1\1\34\uffff";
    static final String DFA32_minS =
        "\1\12\1\uffff\1\11\1\62\1\11\1\41\4\11\4\137\2\11\1\167\1\0\1\11"+
        "\1\uffff\1\41\4\11\4\137";
    static final String DFA32_maxS =
        "\1\u00b2\1\uffff\1\11\1\167\1\11\1\144\4\11\4\150\2\11\1\167\1"+
        "\0\1\11\1\uffff\1\144\4\11\4\150";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\21\uffff\1\1\11\uffff";
    static final String DFA32_specialS =
        "\21\uffff\1\0\13\uffff}>";
    static final String[] DFA32_transitionS = {
            "\3\1\2\uffff\22\1\2\uffff\2\1\1\uffff\21\1\1\uffff\20\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\6\1\1\uffff\1\1\3\uffff\1\1\3\uffff\1\2\16\uffff\2\1\4\uffff"+
            "\1\1\11\uffff\5\1\27\uffff\3\1\3\uffff\1\1\2\uffff\1\1\3\uffff"+
            "\4\1",
            "",
            "\1\3",
            "\1\1\104\uffff\1\4",
            "\1\5",
            "\1\7\1\6\2\uffff\1\11\76\uffff\1\10",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\uffff",
            "\1\24",
            "",
            "\1\27\1\25\2\uffff\1\26\76\uffff\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 97:17: ( amount )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_17 = input.LA(1);

                         
                        int index32_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_ChemicalChunker()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\35\uffff";
    static final String DFA34_eofS =
        "\1\1\34\uffff";
    static final String DFA34_minS =
        "\1\12\1\uffff\1\11\1\62\1\11\1\41\4\11\4\137\2\11\1\167\1\0\1\11"+
        "\1\uffff\1\41\4\11\4\137";
    static final String DFA34_maxS =
        "\1\u00b2\1\uffff\1\11\1\167\1\11\1\144\4\11\4\150\2\11\1\167\1"+
        "\0\1\11\1\uffff\1\144\4\11\4\150";
    static final String DFA34_acceptS =
        "\1\uffff\1\2\21\uffff\1\1\11\uffff";
    static final String DFA34_specialS =
        "\21\uffff\1\0\13\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\1\2\uffff\22\1\2\uffff\2\1\1\uffff\21\1\1\uffff\20\1\1\uffff"+
            "\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\6\1\1\uffff\1\1\3\uffff\1\1\3\uffff\1\2\16\uffff\2\1\4\uffff"+
            "\1\1\11\uffff\5\1\27\uffff\3\1\3\uffff\1\1\2\uffff\1\1\3\uffff"+
            "\4\1",
            "",
            "\1\3",
            "\1\1\104\uffff\1\4",
            "\1\5",
            "\1\7\1\6\2\uffff\1\10\76\uffff\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\uffff",
            "\1\24",
            "",
            "\1\30\1\25\2\uffff\1\27\76\uffff\1\26",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17",
            "\1\16\10\uffff\1\17"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "()* loopback of 106:11: ( amount )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_17 = input.LA(1);

                         
                        int index34_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred118_ChemicalChunker()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_sentence_in_document164 = new BitSet(new long[]{0xFF7FFFD980001C02L,0x108000803F75EAFFL,0x0007891C00000780L});
    public static final BitSet FOLLOW_nounphrase_in_sentence189 = new BitSet(new long[]{0xFF7FFFD980001C02L,0x10C00088BF75EAFFL,0x0007891C00000780L});
    public static final BitSet FOLLOW_verbphrase_in_sentence191 = new BitSet(new long[]{0xFF7FFFD980001C02L,0x10C00088BF75EAFFL,0x0007891C00000780L});
    public static final BitSet FOLLOW_comma_in_sentence196 = new BitSet(new long[]{0x0000000000000002L,0x0040000880000000L});
    public static final BitSet FOLLOW_cc_in_sentence198 = new BitSet(new long[]{0x0000000000000002L,0x0040000880000000L});
    public static final BitSet FOLLOW_stop_in_sentence200 = new BitSet(new long[]{0x0000000000000002L,0x0040000880000000L});
    public static final BitSet FOLLOW_dt_in_nounphrase236 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000800400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_adj_in_nounphrase239 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000800400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_noun_in_nounphrase242 = new BitSet(new long[]{0x0107FFD981041C02L,0x10C000808400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_comma_in_nounphrase246 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000800400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_noun_in_nounphrase248 = new BitSet(new long[]{0x0000000001040002L,0x0040000080000000L});
    public static final BitSet FOLLOW_cc_in_nounphrase253 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000800400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_noun_in_nounphrase255 = new BitSet(new long[]{0x0000000001040002L,0x0040000000000000L});
    public static final BitSet FOLLOW_prepphraseOf_in_nounphrase259 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_prepphraseIN_in_nounphrase262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_in_verbphrase276 = new BitSet(new long[]{0xFF7FFFD9FFFF9C00L,0x108000803F75EAFFL,0x0007891C000007C0L});
    public static final BitSet FOLLOW_adv_in_verbphrase279 = new BitSet(new long[]{0xFF7FFFD9FFFF9C00L,0x108000803F75EAFFL,0x0007891C000007C0L});
    public static final BitSet FOLLOW_vbd_in_verbphrase282 = new BitSet(new long[]{0xFF7FFFD9FFFF9C00L,0x108000803F75EAFFL,0x0007891C000007C0L});
    public static final BitSet FOLLOW_verb_in_verbphrase285 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x0000011C000000C0L});
    public static final BitSet FOLLOW_adv_in_verbphrase287 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x0000011C000000C0L});
    public static final BitSet FOLLOW_prepphrase_in_verbphrase290 = new BitSet(new long[]{0x000000007FFF8002L,0x1080000000000000L,0x00000100000000C0L});
    public static final BitSet FOLLOW_vbuse_in_verb301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbchange_in_verb303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsubmerge_in_verb305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsubject_in_verb307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbadd_in_verb309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcharge_in_verb311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcontain_in_verb313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdrop_in_verb315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbfill_in_verb317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsuspend_in_verb319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbtreat_in_verb321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbapparatus_in_verb323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbconcentrate_in_verb325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbcool_in_verb327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdegass_in_verb329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdissolve_in_verb331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbdry_in_verb333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbextract_in_verb335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbfilter_in_verb337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbheat_in_verb341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbincrease_in_verb343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbpartition_in_verb345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbprecipitate_in_verb347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbpurify_in_verb349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbquench_in_verb351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbrecover_in_verb353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbremove_in_verb355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbstir_in_verb357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbsynthesize_in_verb359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbwait_in_verb361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbwash_in_verb363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbyield_in_verb365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_number384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcd_in_number386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmolecule_in_noun395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecule_in_noun397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnstate_in_noun399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntime_in_noun401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnatmosphere_in_noun403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nneq_in_noun405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnchementity_in_noun407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntemp_in_noun409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnflash_in_noun411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nngeneral_in_noun413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnmethod_in_noun415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnamount_in_noun417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnpressure_in_noun419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nncolumn_in_noun421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnchromatography_in_noun423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnvacuum_in_noun425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nncycle_in_noun427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nntimes_in_noun429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnapparatus_in_noun431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnconcentrate_in_noun434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wdt_in_noun436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wp_poss_in_noun438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wpo_in_noun440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wps_in_noun442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnsynthesize_in_noun444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscaront_in_noun446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nnmixture_in_noun448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixture_in_noun450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amount_in_noun452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_noun454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lrb_in_mixture462 = new BitSet(new long[]{0x0004000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarCompound_in_mixture464 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_dash_in_mixture466 = new BitSet(new long[]{0x0004000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarCompound_in_mixture468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_sym_in_mixture470 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_cd_in_mixture472 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rrb_in_mixture474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jj_in_adj484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjr_in_adj486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjs_in_adj488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jjt_in_adj490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcj_in_adj492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rb_in_adv500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rbr_in_adv502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rbt_in_adv504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseOther_in_prepphrase515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTemp_in_prepphrase517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTime_in_prepphrase519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseOther531 = new BitSet(new long[]{0x0107FFD9FFFF9C00L,0x108000800400000AL,0x00078100000007C0L});
    public static final BitSet FOLLOW_nounphrase_in_prepphraseOther535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inof_in_prepphraseOf558 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000800400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_nounphrase_in_prepphraseOf561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inin_in_prepphraseIN585 = new BitSet(new long[]{0x0004000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_molecule_in_prepphraseIN587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseTime611 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_dt_in_prepphraseTime614 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_jj_in_prepphraseTime617 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_cd_in_prepphraseTime620 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_nntime_in_prepphraseTime622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inAll_in_prepphraseTemp652 = new BitSet(new long[]{0x0000000000000000L,0x1080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_dt_in_prepphraseTemp655 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_jj_in_prepphraseTemp658 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_cd_in_prepphraseTemp661 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_nntemp_in_prepphraseTemp663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_in_inAll696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inafter_in_inAll698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inas_in_inAll700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inbefore_in_inAll702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inby_in_inAll704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infor_in_inAll706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_infrom_in_inAll708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inin_in_inAll710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ininto_in_inAll712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inof_in_inAll714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inoff_in_inAll716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inon_in_inAll718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inover_in_inAll720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inunder_in_inAll722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invia_in_inAll724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inwith_in_inAll726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inwithout_in_inAll728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_in_inAll730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_mmol743 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_nnmol_in_mmol745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_gram766 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_nngram_in_gram768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_percent789 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_nnpercent_in_percent791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_volume812 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_nnvol_in_volume814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mmol_in_measurements836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gram_in_measurements838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percent_in_measurements840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_measurements842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcm_in_oscarCompound851 = new BitSet(new long[]{0x0004000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_measurements_in_moleculeamount1872 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_inof_in_moleculeamount1874 = new BitSet(new long[]{0x0004000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarCompound_in_moleculeamount1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarCompound_in_moleculeamount2884 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_amount_in_moleculeamount2886 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_moleculeamount1_in_moleculeamount896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moleculeamount2_in_moleculeamount900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moleculeamount_in_molecule921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_measurements_in_unnamedmoleculeamount1940 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_inof_in_unnamedmoleculeamount1942 = new BitSet(new long[]{0x0000000000000400L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarcd_in_unnamedmoleculeamount1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcd_in_unnamedmoleculeamount2952 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_amount_in_unnamedmoleculeamount2954 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_unnamedmoleculeamount1_in_unnamedmoleculeamount964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmoleculeamount2_in_unnamedmoleculeamount968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamedmoleculeamount_in_unnamedmolecule981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lrb_in_amount1002 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_measurements_in_amount1004 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
    public static final BitSet FOLLOW_comma_in_amount1007 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_measurements_in_amount1010 = new BitSet(new long[]{0x0000000000000000L,0x0000010080000000L});
    public static final BitSet FOLLOW_rrb_in_amount1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nngeneral_in_method1052 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_nn_in_method1054 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_nnmethod_in_method1058 = new BitSet(new long[]{0x0000000000000402L,0x0080000000000000L});
    public static final BitSet FOLLOW_oscarcd_in_method1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_method1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_oscarcd1074 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcd1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_oscarcj1081 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcj1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_oscaront1089 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscaront1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_tmunicode1096 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_tmunicode1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_cdunicode1103 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cdunicode1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_inas1112 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inas1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_inbefore1119 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inbefore1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_inafter1126 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inafter1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_inin1133 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inin1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ininto1140 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ininto1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_inwith1147 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inwith1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_inwithout1154 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inwithout1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_inby1161 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inby1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_invia1168 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_invia1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_inof1175 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inof1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_inon1182 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inon1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_infor1189 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_infor1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_infrom1196 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_infrom1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_inunder1203 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inunder1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_inover1210 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inover1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_inoff1217 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_inoff1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_nnstate1226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnstate1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_nntime1233 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntime1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_nngram1240 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nngram1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_nnmol1247 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmol1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_nnatmosphere1254 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnatmosphere1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_nneq1261 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nneq1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nnvol1268 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnvol1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_nnchementity1275 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnchementity1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nntemp1282 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntemp1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_nnflash1289 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnflash1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_nngeneral1296 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nngeneral1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_nnmethod1303 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmethod1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_nnamount1310 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnamount1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_nnpressure1317 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpressure1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_nncolumn1324 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nncolumn1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_nnchromatography1331 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnchromatography1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_nnvacuum1338 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnvacuum1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_nncycle1345 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nncycle1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_nntimes1352 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nntimes1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_oscarcm1361 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcm1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_vbuse1370 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbuse1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_vbchange1377 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbchange1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_vbsubmerge1384 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubmerge1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_vbsubject1391 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubject1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_nnadd1400 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnadd1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_nnmixture1407 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnmixture1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_vbadd1414 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbadd1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_vbcharge1421 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcharge1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_vbcontain1428 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcontain1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_vbdrop1435 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdrop1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_vbfill1442 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbfill1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_vbsuspend1449 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsuspend1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_vbtreat1456 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbtreat1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_vbapparatus1465 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbapparatus1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_nnapparatus1472 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnapparatus1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_vbconcentrate1481 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbconcentrate1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_nnconcentrate1488 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnconcentrate1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_vbcool1497 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbcool1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_vbdegass1506 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdegass1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_vbdissolve1515 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdissolve1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_vbdry1524 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbdry1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_nndry1531 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nndry1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_vbextract1540 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbextract1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_nnextract1547 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnextract1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_vbfilter1556 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbfilter1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_nnfilter1563 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnfilter1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_vbheat1572 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbheat1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_vbincrease1579 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbincrease1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_vbpartition1588 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbpartition1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_vbprecipitate1597 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbprecipitate1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_nnprecipitate1604 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnprecipitate1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_vbpurify1613 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbpurify1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_nnpurify1620 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpurify1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_vbquench1629 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbquench1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_vbrecover1638 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbrecover1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_vbremove1647 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbremove1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_nnremove1654 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnremove1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_vbstir1663 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbstir1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_vbsynthesize1672 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbsynthesize1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_nnsynthesize1679 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnsynthesize1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_vbwait1688 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbwait1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_vbwash1697 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbwash1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_vbyield1706 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbyield1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_colon1715 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_colon1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_comma1722 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_comma1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_apost1729 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_apost1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_neg1736 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_neg1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_dash1743 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dash1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_stop1750 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_stop1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_nnpercent1757 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nnpercent1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_lsqb1764 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_lsqb1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rsqb1771 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rsqb1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_lrb1778 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_lrb1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rrb1785 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rrb1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_abl1796 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abl1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_abn1805 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abn1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_abx1814 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_abx1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ap1823 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ap1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_at1832 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_at1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_be1841 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_be1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_bed1850 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bed1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_bedz1859 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bedz1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_beg1868 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_beg1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_bem1877 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bem1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ben1886 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ben1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ber1895 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ber1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_bez1904 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_bez1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_cc1913 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cc1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_cd1922 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cd1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_cs1931 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_cs1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_dotok1941 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dotok1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_dod1950 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dod1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_doz1959 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_doz1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_dt1968 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dt1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_dti1977 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dti1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_dts1986 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dts1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_dtx1995 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_dtx1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ex2004 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ex2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fw2013 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_fw2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_hv2022 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hv2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_hvd2031 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvd2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_hvg2040 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvg2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_hvn2049 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_hvn2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_in2058 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_in2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_jj2067 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jj2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_jjr2076 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjr2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_jjs2085 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjs2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_jjt2094 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_jjt2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_md2103 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_md2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_nc2112 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nc2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_nn2121 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nn2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_nn_poss2130 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nn_poss2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_nns2139 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nns2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_nns_poss2148 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nns_poss2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_np2157 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_np2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_np_poss2166 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_np_poss2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_nps2175 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nps2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_nps_poss2184 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nps_poss2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_nr2193 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_nr2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_od2202 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_od2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_pn2211 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pn2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_pn_poss2220 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pn_poss2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_pp_poss2229 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pp_poss2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_pp_poss_poss2238 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pp_poss_poss2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ppl2247 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ppls2256 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppls2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ppo2265 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppo2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_pps2274 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_pps2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ppss2283 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ppss2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ql2292 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_ql2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_qlp2301 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_qlp2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_rb2310 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rb2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_rbr2319 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rbr2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_rbt2328 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rbt2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_rn2337 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rn2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_rp2346 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_rp2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_sym2357 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_sym2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_to2366 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_to2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_uh2375 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_uh2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_vb2384 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vb2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_vbd2393 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbd2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_vbg2402 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbg2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_vbn2411 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbn2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_vbz2420 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_vbz2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_wdt2429 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wdt2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_wp_poss2438 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wp_poss2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_wpo2447 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wpo2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_wps2456 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wps2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_wql2465 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wql2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_wrb2474 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TOKEN_in_wrb2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nounphrase_in_synpred2_ChemicalChunker189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verbphrase_in_synpred3_ChemicalChunker191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_noun_in_synpred9_ChemicalChunker242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comma_in_synpred10_ChemicalChunker246 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000800400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_noun_in_synpred10_ChemicalChunker248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cc_in_synpred11_ChemicalChunker253 = new BitSet(new long[]{0x0107FFD980001C00L,0x108000800400000AL,0x0007800000000780L});
    public static final BitSet FOLLOW_noun_in_synpred11_ChemicalChunker255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseOf_in_synpred12_ChemicalChunker259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseIN_in_synpred13_ChemicalChunker262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_adv_in_synpred17_ChemicalChunker287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphrase_in_synpred18_ChemicalChunker290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseOther_in_synpred86_ChemicalChunker515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prepphraseTemp_in_synpred87_ChemicalChunker517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcm_in_synpred115_ChemicalChunker851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amount_in_synpred116_ChemicalChunker886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amount_in_synpred118_ChemicalChunker954 = new BitSet(new long[]{0x0000000000000002L});

}