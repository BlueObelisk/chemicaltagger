// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g 2009-11-19 11:20:22

    package uk.ac.cam.ch.wwmm.extractPhrases;
    import java.util.HashMap;
    import nu.xom.Attribute;
    import nu.xom.Element;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class ChemicalChunkerParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WS", "NEWLINE", "ACHAR", "DIGIT", "TOKEN", "'DT'", "'VBD'", "'CC'", "'TO'", "'NN'", "'PPN'", "'VB'", "'OSCAR-CD'", "'OSCAR-CJ'", "'TM-UNICODE'", "'CD-UNICODE'", "'IN-AS'", "'IN-BEFORE'", "'IN-AFTER'", "'IN-IN'", "'IN-INTO'", "'IN-WITH'", "'IN-WITHOUT'", "'IN-BY'", "'IN-VIA'", "'IN-OF'", "'IN-ON'", "'IN-FOR'", "'IN-FROM'", "'IN-UNDER'", "'IN-OVER'", "'IN-OFF'", "'NN-STATE'", "'NN-TIME'", "'CD'", "'NN-GRAM'", "'NN-MOL'", "'NN-ATMOSPHERE'", "'NN-EQ'", "'NN-VOL'", "'NN-TEMP'", "'NN-FLASH'", "'NN-GENERAL'", "'NN-METHOD'", "'NN-AMOUNT'", "'NN-PRESSURE'", "'NN-COLUMN'", "'NN-CHROMATOGRAPHY'", "'NN-VACUUM'", "'NN-CYCLE'", "'NN-TIMES'", "'NN-CHEMENTITY'", "'CM'", "'VB-USE'", "'VB-CHANGE'", "'VB-SUBMERGE'", "'VB-SUBJECT'", "'JJ'", "'NN-ADD'", "'NN-MIXTURE'", "'VB-ADD'", "'VB-CHARGE'", "'VB-CONTAIN'", "'VB-DROP'", "'VB-FILL'", "'VB-SUSPEND'", "'VB-TREAT'", "'VB-APPARATUS'", "'NN-APPARATUS'", "'VB-CONCENTRATE'", "'NN-CONCENTRATE'", "'VB-COOL'", "'VB-DEGASS'", "'VB-DISSOLVE'", "'VB-DRY'", "'NN-DRY'", "'VB-EXTRACT'", "'NN-EXTRACT'", "'VB-FILTER'", "'NN-FILTER'", "'VB-HEAT'", "'VB-INCREASE'", "'VB-PARTITION'", "'VB-PRECIPITATE'", "'NN-PRECIPITATE'", "'VB-PURIFY'", "'NN-PURIFY'", "'VB-QUENCH'", "'VB-RECOVER'", "'VB-REMOVE'", "'NN-REMOVE'", "'VB-STIR'", "'VB-SYNTHESIZE'", "'NN-SYNTHESIZE'", "'VB-WAIT'", "'VB-WASH'", "'VB-YIELD'", "'RB'", "'COLON'", "'COMMA'", "'APOST'", "'NEG'", "'DASH'", "'STOP'", "'NN-PERCENT'", "'LSQB'", "'RSQB'", "'-LRB-'", "'-RRB-'"
    };
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
    public static final int T__15=15;
    public static final int T__90=90;
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
    public static final int ACHAR=6;
    public static final int T__34=34;
    public static final int NEWLINE=5;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "stop", "apost", "nnchromatography", "nnpressure", 
        "nnconcentrate", "rb", "nnmethod", "vbdrop", "vbstir", "inbefore", 
        "rsqb", "dttok", "cdunicode", "neg", "infor", "jj", "vbd", "vbchange", 
        "vbtreat", "cd", "inwithout", "vbfill", "comma", "vbsubject", "vbextract", 
        "vbsuspend", "vbincrease", "nndry", "vbprecipitate", "vbtok", "vbsynthesize", 
        "colon", "nnsynthesize", "nnremove", "nnadd", "vbyield", "nncolumn", 
        "molecule", "nntime", "inafter", "nnvacuum", "nounphrase", "vbwait", 
        "vbconcentrate", "invia", "vbheat", "amount", "nncycle", "prepphrase", 
        "nnflash", "nntok", "infrom", "vbadd", "vbremove", "molecules", 
        "vbcontain", "nnextract", "inunder", "nntemp", "nnprecipitate", 
        "vbdegass", "nngeneral", "ppntok", "dash", "nnpurify", "tmunicode", 
        "nneq", "nnatmosphere", "mol", "inby", "cc", "nnapparatus", "vbfilter", 
        "vbpurify", "vbrecover", "inwith", "vbquench", "lsqb", "inin", "nnvol", 
        "vbdissolve", "inover", "vbcool", "nnfilter", "sentence", "vbwash", 
        "inof", "oscarcd", "document", "inas", "inoff", "vbpartition", "totok", 
        "nnchementity", "nnpercent", "nnmol", "oscarcm", "nntimes", "to", 
        "nnstate", "oscarcj", "nngram", "verbphraseADD", "ininto", "nnmixture", 
        "vbapparatus", "inon", "vbsubmerge", "vbuse", "rrb", "lrb", "vbcharge", 
        "gram", "vbdry", "nnamount"
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
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public ChemicalChunkerParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return ChemicalChunkerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g"; }


      HashMap<String, Object> objectMap = new HashMap<String, Object>();
        Element rootElement = new Element("root");
        Element tableElement;
        Element cellElement;
        Element arrayElement;
        Element nounElement;
        Element currentElement;
        Element phraseElement;
        Element dtElement;
        Element nnElement;
        String tag;

        private Element addToken(String token) {
            return addElement(tag, token);
        }	
        private Element addElement(String name, String content) {
            ensureCurrentElement();
    	System.out.println("add "+name+"/"+content);
            Element newElement = addElement(name);
            newElement.appendChild(content);
            return newElement;
        }
        private Element addElement(String name) {
    	Element newElement = new Element(name);
            currentElement.appendChild(newElement);
            return newElement;
        }
        private void ensureCurrentElement() {
            rootElement = new Element("root");
            currentElement = rootElement;
        }



    // $ANTLR start "document"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:56:1: document : ( sentence )+ ;
    public final void document() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "document");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:56:9: ( ( sentence )+ )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:56:11: ( sentence )+
            {
            dbg.location(56,11);
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:56:11: ( sentence )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==9||LA1_0==56) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:56:11: sentence
            	    {
            	    dbg.location(56,11);
            	    pushFollow(FOLLOW_sentence_in_document116);
            	    sentence();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(56, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "document");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "document"


    // $ANTLR start "mol"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:58:1: mol : cd nnmol ;
    public final void mol() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:58:5: ( cd nnmol )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:58:7: cd nnmol
            {
            dbg.location(58,7);
            pushFollow(FOLLOW_cd_in_mol125);
            cd();

            state._fsp--;

            dbg.location(58,10);
            pushFollow(FOLLOW_nnmol_in_mol127);
            nnmol();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(58, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mol");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "mol"


    // $ANTLR start "sentence"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:59:1: sentence : nounphrase verbphraseADD prepphrase ;
    public final void sentence() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "sentence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:60:2: ( nounphrase verbphraseADD prepphrase )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:60:5: nounphrase verbphraseADD prepphrase
            {
            dbg.location(60,5);
            pushFollow(FOLLOW_nounphrase_in_sentence137);
            nounphrase();

            state._fsp--;

            dbg.location(60,16);
            pushFollow(FOLLOW_verbphraseADD_in_sentence139);
            verbphraseADD();

            state._fsp--;

            dbg.location(60,30);
            pushFollow(FOLLOW_prepphrase_in_sentence141);
            prepphrase();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(60, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sentence");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sentence"


    // $ANTLR start "nounphrase"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:62:1: nounphrase : molecules ;
    public final void nounphrase() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "nounphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:63:2: ( molecules )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:63:3: molecules
            {
            dbg.location(63,3);
            pushFollow(FOLLOW_molecules_in_nounphrase150);
            molecules();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(63, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nounphrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nounphrase"


    // $ANTLR start "verbphraseADD"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:64:1: verbphraseADD : ( vbd )* vbadd ;
    public final void verbphraseADD() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "verbphraseADD");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:65:2: ( ( vbd )* vbadd )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:65:4: ( vbd )* vbadd
            {
            dbg.location(65,4);
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:65:4: ( vbd )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==10) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:65:4: vbd
            	    {
            	    dbg.location(65,4);
            	    pushFollow(FOLLOW_vbd_in_verbphraseADD163);
            	    vbd();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(65,9);
            pushFollow(FOLLOW_vbadd_in_verbphraseADD166);
            vbadd();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(65, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "verbphraseADD");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "verbphraseADD"


    // $ANTLR start "prepphrase"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:68:1: prepphrase : totok molecule ;
    public final void prepphrase() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prepphrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:69:2: ( totok molecule )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:69:4: totok molecule
            {
            dbg.location(69,4);
            pushFollow(FOLLOW_totok_in_prepphrase177);
            totok();

            state._fsp--;

            dbg.location(69,10);
            pushFollow(FOLLOW_molecule_in_prepphrase179);
            molecule();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(69, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prepphrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "prepphrase"


    // $ANTLR start "gram"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:70:1: gram : cd nngram ;
    public final void gram() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "gram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:70:6: ( cd nngram )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:70:8: cd nngram
            {
            dbg.location(70,8);
            pushFollow(FOLLOW_cd_in_gram189);
            cd();

            state._fsp--;

            dbg.location(70,11);
            pushFollow(FOLLOW_nngram_in_gram191);
            nngram();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(70, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "gram");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "gram"


    // $ANTLR start "molecules"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:72:1: molecules : molecule cc molecule ;
    public final void molecules() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "molecules");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:73:2: ( molecule cc molecule )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:73:4: molecule cc molecule
            {
            dbg.location(73,4);
            pushFollow(FOLLOW_molecule_in_molecules202);
            molecule();

            state._fsp--;

            dbg.location(73,13);
            pushFollow(FOLLOW_cc_in_molecules204);
            cc();

            state._fsp--;

            dbg.location(73,16);
            pushFollow(FOLLOW_molecule_in_molecules206);
            molecule();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(73, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "molecules");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "molecules"


    // $ANTLR start "molecule"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:74:1: molecule : ( dttok )* ( oscarcm )+ amount ;
    public final void molecule() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "molecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:75:2: ( ( dttok )* ( oscarcm )+ amount )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:75:5: ( dttok )* ( oscarcm )+ amount
            {
            dbg.location(75,5);
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:75:5: ( dttok )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==9) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:75:5: dttok
            	    {
            	    dbg.location(75,5);
            	    pushFollow(FOLLOW_dttok_in_molecule227);
            	    dttok();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(75,12);
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:75:12: ( oscarcm )+
            int cnt4=0;
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==56) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:75:12: oscarcm
            	    {
            	    dbg.location(75,12);
            	    pushFollow(FOLLOW_oscarcm_in_molecule230);
            	    oscarcm();

            	    state._fsp--;


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

            dbg.location(75,21);
            pushFollow(FOLLOW_amount_in_molecule233);
            amount();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(75, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "molecule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "molecule"


    // $ANTLR start "amount"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:76:1: amount : lrb gram comma mol rrb ;
    public final void amount() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "amount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:76:9: ( lrb gram comma mol rrb )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:76:11: lrb gram comma mol rrb
            {
            dbg.location(76,11);
            pushFollow(FOLLOW_lrb_in_amount242);
            lrb();

            state._fsp--;

            dbg.location(76,15);
            pushFollow(FOLLOW_gram_in_amount244);
            gram();

            state._fsp--;

            dbg.location(76,20);
            pushFollow(FOLLOW_comma_in_amount246);
            comma();

            state._fsp--;

            dbg.location(76,27);
            pushFollow(FOLLOW_mol_in_amount249);
            mol();

            state._fsp--;

            dbg.location(76,31);
            pushFollow(FOLLOW_rrb_in_amount251);
            rrb();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(76, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "amount");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "amount"


    // $ANTLR start "dttok"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:78:1: dttok : 'DT' TOKEN ;
    public final void dttok() throws RecognitionException {
        Token TOKEN1=null;

        try { dbg.enterRule(getGrammarFileName(), "dttok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:78:7: ( 'DT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:78:8: 'DT' TOKEN
            {
            dbg.location(78,8);
            match(input,9,FOLLOW_9_in_dttok258); 
            dbg.location(78,14);
            TOKEN1=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dttok261); 
            dbg.location(79,1);

                addElement("DT", (TOKEN1!=null?TOKEN1.getText():null));
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(81, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dttok");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dttok"


    // $ANTLR start "vbd"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:91:1: vbd : 'VBD' TOKEN ;
    public final void vbd() throws RecognitionException {
        Token TOKEN2=null;

        try { dbg.enterRule(getGrammarFileName(), "vbd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:91:5: ( 'VBD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:91:7: 'VBD' TOKEN
            {
            dbg.location(91,7);
            match(input,10,FOLLOW_10_in_vbd277); 
            dbg.location(91,13);
            TOKEN2=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbd279); 
            dbg.location(92,1);

                addElement("VBD", (TOKEN2!=null?TOKEN2.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(94, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbd"


    // $ANTLR start "cc"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:97:1: cc : 'CC' TOKEN ;
    public final void cc() throws RecognitionException {
        Token TOKEN3=null;

        try { dbg.enterRule(getGrammarFileName(), "cc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:97:3: ( 'CC' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:97:4: 'CC' TOKEN
            {
            dbg.location(97,4);
            match(input,11,FOLLOW_11_in_cc289); 
            dbg.location(97,10);
            TOKEN3=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cc292); 
            dbg.location(98,1);

                addElement("CC", (TOKEN3!=null?TOKEN3.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(100, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cc"


    // $ANTLR start "totok"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:102:1: totok : 'TO' TOKEN ;
    public final void totok() throws RecognitionException {
        Token TOKEN4=null;

        try { dbg.enterRule(getGrammarFileName(), "totok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:102:7: ( 'TO' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:102:10: 'TO' TOKEN
            {
            dbg.location(102,10);
            match(input,12,FOLLOW_12_in_totok303); 
            dbg.location(102,15);
            TOKEN4=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_totok305); 
            dbg.location(103,2);

                addElement("TO", (TOKEN4!=null?TOKEN4.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(105, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "totok");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "totok"


    // $ANTLR start "nntok"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:106:1: nntok : 'NN' TOKEN ;
    public final void nntok() throws RecognitionException {
        Token TOKEN5=null;

        try { dbg.enterRule(getGrammarFileName(), "nntok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:106:6: ( 'NN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:106:7: 'NN' TOKEN
            {
            dbg.location(106,7);
            match(input,13,FOLLOW_13_in_nntok313); 
            dbg.location(106,13);
            TOKEN5=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntok316); 
            dbg.location(107,1);

                addElement("NN", (TOKEN5!=null?TOKEN5.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(109, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nntok");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nntok"


    // $ANTLR start "ppntok"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:110:1: ppntok : 'PPN' TOKEN ;
    public final void ppntok() throws RecognitionException {
        Token TOKEN6=null;

        try { dbg.enterRule(getGrammarFileName(), "ppntok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:110:8: ( 'PPN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:110:9: 'PPN' TOKEN
            {
            dbg.location(110,9);
            match(input,14,FOLLOW_14_in_ppntok324); 
            dbg.location(110,16);
            TOKEN6=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppntok327); 
            dbg.location(111,1);


                addElement("PPN", (TOKEN6!=null?TOKEN6.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(114, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppntok");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ppntok"


    // $ANTLR start "vbtok"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:115:1: vbtok : 'VB' TOKEN ;
    public final void vbtok() throws RecognitionException {
        Token TOKEN7=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:115:7: ( 'VB' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:115:8: 'VB' TOKEN
            {
            dbg.location(115,8);
            match(input,15,FOLLOW_15_in_vbtok335); 
            dbg.location(115,14);
            TOKEN7=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtok338); 
            dbg.location(116,1);

                addElement("VB", (TOKEN7!=null?TOKEN7.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(118, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbtok");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbtok"


    // $ANTLR start "oscarcd"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:121:1: oscarcd : 'OSCAR-CD' TOKEN ;
    public final void oscarcd() throws RecognitionException {
        Token TOKEN8=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:121:8: ( 'OSCAR-CD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:121:9: 'OSCAR-CD' TOKEN
            {
            dbg.location(121,9);
            match(input,16,FOLLOW_16_in_oscarcd347); 
            dbg.location(121,21);
            TOKEN8=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcd350); 
            dbg.location(122,1);

            	 addElement("OSCAR-CD",(TOKEN8!=null?TOKEN8.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(124, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oscarcd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "oscarcd"


    // $ANTLR start "oscarcj"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:125:1: oscarcj : 'OSCAR-CJ' TOKEN ;
    public final void oscarcj() throws RecognitionException {
        Token TOKEN9=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:125:8: ( 'OSCAR-CJ' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:125:9: 'OSCAR-CJ' TOKEN
            {
            dbg.location(125,9);
            match(input,17,FOLLOW_17_in_oscarcj357); 
            dbg.location(125,21);
            TOKEN9=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcj360); 
            dbg.location(126,1);

            	 addElement("OSCAR-CJ",(TOKEN9!=null?TOKEN9.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(128, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oscarcj");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "oscarcj"


    // $ANTLR start "tmunicode"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:129:1: tmunicode : 'TM-UNICODE' TOKEN ;
    public final void tmunicode() throws RecognitionException {
        Token TOKEN10=null;

        try { dbg.enterRule(getGrammarFileName(), "tmunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:129:10: ( 'TM-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:129:11: 'TM-UNICODE' TOKEN
            {
            dbg.location(129,11);
            match(input,18,FOLLOW_18_in_tmunicode367); 
            dbg.location(129,25);
            TOKEN10=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_tmunicode370); 
            dbg.location(130,1);

            	 addElement("TM-UNICODE",(TOKEN10!=null?TOKEN10.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(132, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "tmunicode");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "tmunicode"


    // $ANTLR start "cdunicode"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:133:1: cdunicode : 'CD-UNICODE' TOKEN ;
    public final void cdunicode() throws RecognitionException {
        Token TOKEN11=null;

        try { dbg.enterRule(getGrammarFileName(), "cdunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:133:10: ( 'CD-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:133:11: 'CD-UNICODE' TOKEN
            {
            dbg.location(133,11);
            match(input,19,FOLLOW_19_in_cdunicode377); 
            dbg.location(133,25);
            TOKEN11=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cdunicode380); 
            dbg.location(134,1);

            	 addElement("CD-UNICODE",(TOKEN11!=null?TOKEN11.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(136, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cdunicode");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cdunicode"


    // $ANTLR start "inas"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:139:1: inas : 'IN-AS' TOKEN ;
    public final void inas() throws RecognitionException {
        Token TOKEN12=null;

        try { dbg.enterRule(getGrammarFileName(), "inas");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:139:5: ( 'IN-AS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:139:6: 'IN-AS' TOKEN
            {
            dbg.location(139,6);
            match(input,20,FOLLOW_20_in_inas389); 
            dbg.location(139,15);
            TOKEN12=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inas392); 
            dbg.location(140,1);

            	 addElement("IN-AS",(TOKEN12!=null?TOKEN12.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(142, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inas");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inas"


    // $ANTLR start "inbefore"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:143:1: inbefore : 'IN-BEFORE' TOKEN ;
    public final void inbefore() throws RecognitionException {
        Token TOKEN13=null;

        try { dbg.enterRule(getGrammarFileName(), "inbefore");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:143:9: ( 'IN-BEFORE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:143:10: 'IN-BEFORE' TOKEN
            {
            dbg.location(143,10);
            match(input,21,FOLLOW_21_in_inbefore399); 
            dbg.location(143,23);
            TOKEN13=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inbefore402); 
            dbg.location(144,1);

            	 addElement("IN-BEFORE",(TOKEN13!=null?TOKEN13.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(146, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inbefore");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inbefore"


    // $ANTLR start "inafter"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:147:1: inafter : 'IN-AFTER' TOKEN ;
    public final void inafter() throws RecognitionException {
        Token TOKEN14=null;

        try { dbg.enterRule(getGrammarFileName(), "inafter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:147:8: ( 'IN-AFTER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:147:9: 'IN-AFTER' TOKEN
            {
            dbg.location(147,9);
            match(input,22,FOLLOW_22_in_inafter409); 
            dbg.location(147,21);
            TOKEN14=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inafter412); 
            dbg.location(148,1);

            	 addElement("IN-AFTER",(TOKEN14!=null?TOKEN14.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(150, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inafter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inafter"


    // $ANTLR start "inin"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:151:1: inin : 'IN-IN' TOKEN ;
    public final void inin() throws RecognitionException {
        Token TOKEN15=null;

        try { dbg.enterRule(getGrammarFileName(), "inin");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:151:5: ( 'IN-IN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:151:6: 'IN-IN' TOKEN
            {
            dbg.location(151,6);
            match(input,23,FOLLOW_23_in_inin419); 
            dbg.location(151,15);
            TOKEN15=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inin422); 
            dbg.location(152,1);

            	 addElement("IN-IN",(TOKEN15!=null?TOKEN15.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(154, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inin");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inin"


    // $ANTLR start "ininto"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:155:1: ininto : 'IN-INTO' TOKEN ;
    public final void ininto() throws RecognitionException {
        Token TOKEN16=null;

        try { dbg.enterRule(getGrammarFileName(), "ininto");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:155:7: ( 'IN-INTO' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:155:8: 'IN-INTO' TOKEN
            {
            dbg.location(155,8);
            match(input,24,FOLLOW_24_in_ininto429); 
            dbg.location(155,19);
            TOKEN16=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ininto432); 
            dbg.location(156,1);

            	 addElement("IN-INTO",(TOKEN16!=null?TOKEN16.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(158, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ininto");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ininto"


    // $ANTLR start "inwith"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:159:1: inwith : 'IN-WITH' TOKEN ;
    public final void inwith() throws RecognitionException {
        Token TOKEN17=null;

        try { dbg.enterRule(getGrammarFileName(), "inwith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:159:7: ( 'IN-WITH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:159:8: 'IN-WITH' TOKEN
            {
            dbg.location(159,8);
            match(input,25,FOLLOW_25_in_inwith439); 
            dbg.location(159,19);
            TOKEN17=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwith442); 
            dbg.location(160,1);

            	 addElement("IN-WITH",(TOKEN17!=null?TOKEN17.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(162, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inwith");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inwith"


    // $ANTLR start "inwithout"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:163:1: inwithout : 'IN-WITHOUT' TOKEN ;
    public final void inwithout() throws RecognitionException {
        Token TOKEN18=null;

        try { dbg.enterRule(getGrammarFileName(), "inwithout");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:163:10: ( 'IN-WITHOUT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:163:11: 'IN-WITHOUT' TOKEN
            {
            dbg.location(163,11);
            match(input,26,FOLLOW_26_in_inwithout449); 
            dbg.location(163,25);
            TOKEN18=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwithout452); 
            dbg.location(164,1);

            	 addElement("IN-WITHOUT",(TOKEN18!=null?TOKEN18.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(166, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inwithout");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inwithout"


    // $ANTLR start "inby"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:167:1: inby : 'IN-BY' TOKEN ;
    public final void inby() throws RecognitionException {
        Token TOKEN19=null;

        try { dbg.enterRule(getGrammarFileName(), "inby");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(167, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:167:5: ( 'IN-BY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:167:6: 'IN-BY' TOKEN
            {
            dbg.location(167,6);
            match(input,27,FOLLOW_27_in_inby459); 
            dbg.location(167,15);
            TOKEN19=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inby462); 
            dbg.location(168,1);

            	 addElement("IN-BY",(TOKEN19!=null?TOKEN19.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(170, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inby");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inby"


    // $ANTLR start "invia"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:171:1: invia : 'IN-VIA' TOKEN ;
    public final void invia() throws RecognitionException {
        Token TOKEN20=null;

        try { dbg.enterRule(getGrammarFileName(), "invia");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:171:6: ( 'IN-VIA' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:171:7: 'IN-VIA' TOKEN
            {
            dbg.location(171,7);
            match(input,28,FOLLOW_28_in_invia469); 
            dbg.location(171,17);
            TOKEN20=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_invia472); 
            dbg.location(172,1);

            	 addElement("IN-VIA",(TOKEN20!=null?TOKEN20.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(174, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "invia");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "invia"


    // $ANTLR start "inof"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:175:1: inof : 'IN-OF' TOKEN ;
    public final void inof() throws RecognitionException {
        Token TOKEN21=null;

        try { dbg.enterRule(getGrammarFileName(), "inof");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:175:5: ( 'IN-OF' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:175:6: 'IN-OF' TOKEN
            {
            dbg.location(175,6);
            match(input,29,FOLLOW_29_in_inof479); 
            dbg.location(175,15);
            TOKEN21=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inof482); 
            dbg.location(176,1);

            	 addElement("IN-OF",(TOKEN21!=null?TOKEN21.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(178, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inof");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inof"


    // $ANTLR start "inon"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:179:1: inon : 'IN-ON' TOKEN ;
    public final void inon() throws RecognitionException {
        Token TOKEN22=null;

        try { dbg.enterRule(getGrammarFileName(), "inon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:179:5: ( 'IN-ON' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:179:6: 'IN-ON' TOKEN
            {
            dbg.location(179,6);
            match(input,30,FOLLOW_30_in_inon489); 
            dbg.location(179,15);
            TOKEN22=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inon492); 
            dbg.location(180,1);

            	 addElement("IN-ON",(TOKEN22!=null?TOKEN22.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(182, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inon");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inon"


    // $ANTLR start "infor"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:183:1: infor : 'IN-FOR' TOKEN ;
    public final void infor() throws RecognitionException {
        Token TOKEN23=null;

        try { dbg.enterRule(getGrammarFileName(), "infor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:183:6: ( 'IN-FOR' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:183:7: 'IN-FOR' TOKEN
            {
            dbg.location(183,7);
            match(input,31,FOLLOW_31_in_infor499); 
            dbg.location(183,17);
            TOKEN23=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infor502); 
            dbg.location(184,1);

            	 addElement("IN-FOR",(TOKEN23!=null?TOKEN23.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(186, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "infor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "infor"


    // $ANTLR start "infrom"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:187:1: infrom : 'IN-FROM' TOKEN ;
    public final void infrom() throws RecognitionException {
        Token TOKEN24=null;

        try { dbg.enterRule(getGrammarFileName(), "infrom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:187:7: ( 'IN-FROM' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:187:8: 'IN-FROM' TOKEN
            {
            dbg.location(187,8);
            match(input,32,FOLLOW_32_in_infrom509); 
            dbg.location(187,19);
            TOKEN24=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infrom512); 
            dbg.location(188,1);

            	 addElement("IN-FROM",(TOKEN24!=null?TOKEN24.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(190, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "infrom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "infrom"


    // $ANTLR start "inunder"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:191:1: inunder : 'IN-UNDER' TOKEN ;
    public final void inunder() throws RecognitionException {
        Token TOKEN25=null;

        try { dbg.enterRule(getGrammarFileName(), "inunder");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:191:8: ( 'IN-UNDER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:191:9: 'IN-UNDER' TOKEN
            {
            dbg.location(191,9);
            match(input,33,FOLLOW_33_in_inunder519); 
            dbg.location(191,21);
            TOKEN25=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inunder522); 
            dbg.location(192,1);

            	 addElement("IN-UNDER",(TOKEN25!=null?TOKEN25.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(194, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inunder");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inunder"


    // $ANTLR start "inover"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:195:1: inover : 'IN-OVER' TOKEN ;
    public final void inover() throws RecognitionException {
        Token TOKEN26=null;

        try { dbg.enterRule(getGrammarFileName(), "inover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(195, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:195:7: ( 'IN-OVER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:195:8: 'IN-OVER' TOKEN
            {
            dbg.location(195,8);
            match(input,34,FOLLOW_34_in_inover529); 
            dbg.location(195,19);
            TOKEN26=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inover532); 
            dbg.location(196,1);

            	 addElement("IN-OVER",(TOKEN26!=null?TOKEN26.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(198, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inover");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inover"


    // $ANTLR start "inoff"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:199:1: inoff : 'IN-OFF' TOKEN ;
    public final void inoff() throws RecognitionException {
        Token TOKEN27=null;

        try { dbg.enterRule(getGrammarFileName(), "inoff");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:199:6: ( 'IN-OFF' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:199:7: 'IN-OFF' TOKEN
            {
            dbg.location(199,7);
            match(input,35,FOLLOW_35_in_inoff539); 
            dbg.location(199,17);
            TOKEN27=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inoff542); 
            dbg.location(200,1);

            	 addElement("IN-OFF",(TOKEN27!=null?TOKEN27.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(202, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inoff");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inoff"


    // $ANTLR start "to"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:203:1: to : 'TO' TOKEN ;
    public final void to() throws RecognitionException {
        Token TOKEN28=null;

        try { dbg.enterRule(getGrammarFileName(), "to");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(203, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:203:3: ( 'TO' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:203:4: 'TO' TOKEN
            {
            dbg.location(203,4);
            match(input,12,FOLLOW_12_in_to549); 
            dbg.location(203,10);
            TOKEN28=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_to552); 
            dbg.location(204,1);

            	 addElement("TO",(TOKEN28!=null?TOKEN28.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(206, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "to");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "to"


    // $ANTLR start "nnstate"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:208:1: nnstate : 'NN-STATE' TOKEN ;
    public final void nnstate() throws RecognitionException {
        Token TOKEN29=null;

        try { dbg.enterRule(getGrammarFileName(), "nnstate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:208:8: ( 'NN-STATE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:208:9: 'NN-STATE' TOKEN
            {
            dbg.location(208,9);
            match(input,36,FOLLOW_36_in_nnstate560); 
            dbg.location(208,21);
            TOKEN29=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnstate563); 
            dbg.location(209,1);

            	 addElement("NN-STATE",(TOKEN29!=null?TOKEN29.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(211, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnstate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnstate"


    // $ANTLR start "nntime"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:213:1: nntime : 'NN-TIME' TOKEN ;
    public final void nntime() throws RecognitionException {
        Token TOKEN30=null;

        try { dbg.enterRule(getGrammarFileName(), "nntime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(213, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:213:7: ( 'NN-TIME' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:213:8: 'NN-TIME' TOKEN
            {
            dbg.location(213,8);
            match(input,37,FOLLOW_37_in_nntime571); 
            dbg.location(213,19);
            TOKEN30=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntime574); 
            dbg.location(214,1);

            	 addElement("NN-TIME",(TOKEN30!=null?TOKEN30.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(216, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nntime");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nntime"


    // $ANTLR start "cd"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:217:1: cd : 'CD' TOKEN ;
    public final void cd() throws RecognitionException {
        Token TOKEN31=null;

        try { dbg.enterRule(getGrammarFileName(), "cd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:217:3: ( 'CD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:217:4: 'CD' TOKEN
            {
            dbg.location(217,4);
            match(input,38,FOLLOW_38_in_cd581); 
            dbg.location(217,10);
            TOKEN31=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cd584); 
            dbg.location(218,1);

            	 addElement("CD",(TOKEN31!=null?TOKEN31.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(220, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cd"


    // $ANTLR start "nngram"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:221:1: nngram : 'NN-GRAM' TOKEN ;
    public final void nngram() throws RecognitionException {
        Token TOKEN32=null;

        try { dbg.enterRule(getGrammarFileName(), "nngram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:221:7: ( 'NN-GRAM' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:221:8: 'NN-GRAM' TOKEN
            {
            dbg.location(221,8);
            match(input,39,FOLLOW_39_in_nngram591); 
            dbg.location(221,19);
            TOKEN32=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngram594); 
            dbg.location(222,1);

            	 addElement("NN-GRAM",(TOKEN32!=null?TOKEN32.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(224, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nngram");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nngram"


    // $ANTLR start "nnmol"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:225:1: nnmol : 'NN-MOL' TOKEN ;
    public final void nnmol() throws RecognitionException {
        Token TOKEN33=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:225:6: ( 'NN-MOL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:225:7: 'NN-MOL' TOKEN
            {
            dbg.location(225,7);
            match(input,40,FOLLOW_40_in_nnmol601); 
            dbg.location(225,17);
            TOKEN33=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmol604); 
            dbg.location(226,1);

            	 addElement("NN-MOL",(TOKEN33!=null?TOKEN33.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(228, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnmol");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnmol"


    // $ANTLR start "nnatmosphere"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:229:1: nnatmosphere : 'NN-ATMOSPHERE' TOKEN ;
    public final void nnatmosphere() throws RecognitionException {
        Token TOKEN34=null;

        try { dbg.enterRule(getGrammarFileName(), "nnatmosphere");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(229, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:229:13: ( 'NN-ATMOSPHERE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:229:14: 'NN-ATMOSPHERE' TOKEN
            {
            dbg.location(229,14);
            match(input,41,FOLLOW_41_in_nnatmosphere611); 
            dbg.location(229,31);
            TOKEN34=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnatmosphere614); 
            dbg.location(230,1);

            	 addElement("NN-ATMOSPHERE",(TOKEN34!=null?TOKEN34.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(232, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnatmosphere");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnatmosphere"


    // $ANTLR start "nneq"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:233:1: nneq : 'NN-EQ' TOKEN ;
    public final void nneq() throws RecognitionException {
        Token TOKEN35=null;

        try { dbg.enterRule(getGrammarFileName(), "nneq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(233, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:233:5: ( 'NN-EQ' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:233:6: 'NN-EQ' TOKEN
            {
            dbg.location(233,6);
            match(input,42,FOLLOW_42_in_nneq621); 
            dbg.location(233,15);
            TOKEN35=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nneq624); 
            dbg.location(234,1);

            	 addElement("NN-EQ",(TOKEN35!=null?TOKEN35.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(236, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nneq");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nneq"


    // $ANTLR start "nnvol"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:237:1: nnvol : 'NN-VOL' TOKEN ;
    public final void nnvol() throws RecognitionException {
        Token TOKEN36=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(237, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:237:6: ( 'NN-VOL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:237:7: 'NN-VOL' TOKEN
            {
            dbg.location(237,7);
            match(input,43,FOLLOW_43_in_nnvol631); 
            dbg.location(237,17);
            TOKEN36=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvol634); 
            dbg.location(238,1);

            	 addElement("NN-VOL",(TOKEN36!=null?TOKEN36.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(240, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnvol");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnvol"


    // $ANTLR start "nntemp"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:242:1: nntemp : 'NN-TEMP' TOKEN ;
    public final void nntemp() throws RecognitionException {
        Token TOKEN37=null;

        try { dbg.enterRule(getGrammarFileName(), "nntemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(242, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:242:7: ( 'NN-TEMP' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:242:8: 'NN-TEMP' TOKEN
            {
            dbg.location(242,8);
            match(input,44,FOLLOW_44_in_nntemp642); 
            dbg.location(242,19);
            TOKEN37=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntemp645); 
            dbg.location(243,1);

            	 addElement("NN-TEMP",(TOKEN37!=null?TOKEN37.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(245, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nntemp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nntemp"


    // $ANTLR start "nnflash"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:246:1: nnflash : 'NN-FLASH' TOKEN ;
    public final void nnflash() throws RecognitionException {
        Token TOKEN38=null;

        try { dbg.enterRule(getGrammarFileName(), "nnflash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:246:8: ( 'NN-FLASH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:246:9: 'NN-FLASH' TOKEN
            {
            dbg.location(246,9);
            match(input,45,FOLLOW_45_in_nnflash652); 
            dbg.location(246,21);
            TOKEN38=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnflash655); 
            dbg.location(247,1);

            	 addElement("NN-FLASH",(TOKEN38!=null?TOKEN38.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(249, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnflash");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnflash"


    // $ANTLR start "nngeneral"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:250:1: nngeneral : 'NN-GENERAL' TOKEN ;
    public final void nngeneral() throws RecognitionException {
        Token TOKEN39=null;

        try { dbg.enterRule(getGrammarFileName(), "nngeneral");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(250, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:250:10: ( 'NN-GENERAL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:250:11: 'NN-GENERAL' TOKEN
            {
            dbg.location(250,11);
            match(input,46,FOLLOW_46_in_nngeneral662); 
            dbg.location(250,25);
            TOKEN39=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngeneral665); 
            dbg.location(251,1);

            	 addElement("NN-GENERAL",(TOKEN39!=null?TOKEN39.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(253, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nngeneral");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nngeneral"


    // $ANTLR start "nnmethod"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:254:1: nnmethod : 'NN-METHOD' TOKEN ;
    public final void nnmethod() throws RecognitionException {
        Token TOKEN40=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmethod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(254, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:254:9: ( 'NN-METHOD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:254:10: 'NN-METHOD' TOKEN
            {
            dbg.location(254,10);
            match(input,47,FOLLOW_47_in_nnmethod672); 
            dbg.location(254,23);
            TOKEN40=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmethod675); 
            dbg.location(255,1);

            	 addElement("NN-METHOD",(TOKEN40!=null?TOKEN40.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(257, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnmethod");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnmethod"


    // $ANTLR start "nnamount"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:258:1: nnamount : 'NN-AMOUNT' TOKEN ;
    public final void nnamount() throws RecognitionException {
        Token TOKEN41=null;

        try { dbg.enterRule(getGrammarFileName(), "nnamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(258, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:258:9: ( 'NN-AMOUNT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:258:10: 'NN-AMOUNT' TOKEN
            {
            dbg.location(258,10);
            match(input,48,FOLLOW_48_in_nnamount682); 
            dbg.location(258,23);
            TOKEN41=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnamount685); 
            dbg.location(259,1);

            	 addElement("NN-AMOUNT",(TOKEN41!=null?TOKEN41.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(261, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnamount");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnamount"


    // $ANTLR start "nnpressure"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:262:1: nnpressure : 'NN-PRESSURE' TOKEN ;
    public final void nnpressure() throws RecognitionException {
        Token TOKEN42=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpressure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(262, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:262:11: ( 'NN-PRESSURE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:262:12: 'NN-PRESSURE' TOKEN
            {
            dbg.location(262,12);
            match(input,49,FOLLOW_49_in_nnpressure692); 
            dbg.location(262,27);
            TOKEN42=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpressure695); 
            dbg.location(263,1);

            	 addElement("NN-PRESSURE",(TOKEN42!=null?TOKEN42.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(265, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnpressure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnpressure"


    // $ANTLR start "nncolumn"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:266:1: nncolumn : 'NN-COLUMN' TOKEN ;
    public final void nncolumn() throws RecognitionException {
        Token TOKEN43=null;

        try { dbg.enterRule(getGrammarFileName(), "nncolumn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(266, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:266:9: ( 'NN-COLUMN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:266:10: 'NN-COLUMN' TOKEN
            {
            dbg.location(266,10);
            match(input,50,FOLLOW_50_in_nncolumn702); 
            dbg.location(266,23);
            TOKEN43=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncolumn705); 
            dbg.location(267,1);

            	 addElement("NN-COLUMN",(TOKEN43!=null?TOKEN43.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(269, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nncolumn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nncolumn"


    // $ANTLR start "nnchromatography"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:270:1: nnchromatography : 'NN-CHROMATOGRAPHY' TOKEN ;
    public final void nnchromatography() throws RecognitionException {
        Token TOKEN44=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchromatography");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(270, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:270:17: ( 'NN-CHROMATOGRAPHY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:270:18: 'NN-CHROMATOGRAPHY' TOKEN
            {
            dbg.location(270,18);
            match(input,51,FOLLOW_51_in_nnchromatography712); 
            dbg.location(270,39);
            TOKEN44=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchromatography715); 
            dbg.location(271,1);

            	 addElement("NN-CHROMATOGRAPHY",(TOKEN44!=null?TOKEN44.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(273, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnchromatography");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnchromatography"


    // $ANTLR start "nnvacuum"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:274:1: nnvacuum : 'NN-VACUUM' TOKEN ;
    public final void nnvacuum() throws RecognitionException {
        Token TOKEN45=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvacuum");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(274, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:274:9: ( 'NN-VACUUM' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:274:10: 'NN-VACUUM' TOKEN
            {
            dbg.location(274,10);
            match(input,52,FOLLOW_52_in_nnvacuum722); 
            dbg.location(274,23);
            TOKEN45=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvacuum725); 
            dbg.location(275,1);

            	 addElement("NN-VACUUM",(TOKEN45!=null?TOKEN45.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(277, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnvacuum");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnvacuum"


    // $ANTLR start "nncycle"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:278:1: nncycle : 'NN-CYCLE' TOKEN ;
    public final void nncycle() throws RecognitionException {
        Token TOKEN46=null;

        try { dbg.enterRule(getGrammarFileName(), "nncycle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(278, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:278:8: ( 'NN-CYCLE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:278:9: 'NN-CYCLE' TOKEN
            {
            dbg.location(278,9);
            match(input,53,FOLLOW_53_in_nncycle732); 
            dbg.location(278,21);
            TOKEN46=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncycle735); 
            dbg.location(279,1);

            	 addElement("NN-CYCLE",(TOKEN46!=null?TOKEN46.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(281, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nncycle");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nncycle"


    // $ANTLR start "nntimes"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:282:1: nntimes : 'NN-TIMES' TOKEN ;
    public final void nntimes() throws RecognitionException {
        Token TOKEN47=null;

        try { dbg.enterRule(getGrammarFileName(), "nntimes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(282, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:282:8: ( 'NN-TIMES' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:282:9: 'NN-TIMES' TOKEN
            {
            dbg.location(282,9);
            match(input,54,FOLLOW_54_in_nntimes742); 
            dbg.location(282,21);
            TOKEN47=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntimes745); 
            dbg.location(283,1);

            	 addElement("NN-TIMES",(TOKEN47!=null?TOKEN47.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(285, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nntimes");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nntimes"


    // $ANTLR start "nnchementity"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:287:1: nnchementity : 'NN-CHEMENTITY' TOKEN ;
    public final void nnchementity() throws RecognitionException {
        Token TOKEN48=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchementity");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(287, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:287:13: ( 'NN-CHEMENTITY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:287:14: 'NN-CHEMENTITY' TOKEN
            {
            dbg.location(287,14);
            match(input,55,FOLLOW_55_in_nnchementity753); 
            dbg.location(287,31);
            TOKEN48=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchementity756); 
            dbg.location(288,1);

            	 addElement("NN-CHEMENTITY",(TOKEN48!=null?TOKEN48.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(290, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnchementity");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnchementity"


    // $ANTLR start "oscarcm"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:291:1: oscarcm : 'CM' TOKEN ;
    public final void oscarcm() throws RecognitionException {
        Token TOKEN49=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(291, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:291:8: ( 'CM' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:291:9: 'CM' TOKEN
            {
            dbg.location(291,9);
            match(input,56,FOLLOW_56_in_oscarcm763); 
            dbg.location(291,15);
            TOKEN49=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcm766); 
            dbg.location(292,1);

            	 addElement("OSCAR-CM",(TOKEN49!=null?TOKEN49.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(294, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "oscarcm");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "oscarcm"


    // $ANTLR start "vbuse"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:296:1: vbuse : 'VB-USE' TOKEN ;
    public final void vbuse() throws RecognitionException {
        Token TOKEN50=null;

        try { dbg.enterRule(getGrammarFileName(), "vbuse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(296, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:296:6: ( 'VB-USE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:296:7: 'VB-USE' TOKEN
            {
            dbg.location(296,7);
            match(input,57,FOLLOW_57_in_vbuse774); 
            dbg.location(296,17);
            TOKEN50=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbuse777); 
            dbg.location(297,1);

            	 addElement("VB-USE",(TOKEN50!=null?TOKEN50.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(299, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbuse");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbuse"


    // $ANTLR start "vbchange"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:300:1: vbchange : 'VB-CHANGE' TOKEN ;
    public final void vbchange() throws RecognitionException {
        Token TOKEN51=null;

        try { dbg.enterRule(getGrammarFileName(), "vbchange");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(300, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:300:9: ( 'VB-CHANGE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:300:10: 'VB-CHANGE' TOKEN
            {
            dbg.location(300,10);
            match(input,58,FOLLOW_58_in_vbchange784); 
            dbg.location(300,23);
            TOKEN51=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbchange787); 
            dbg.location(301,1);

            	 addElement("VB-CHANGE",(TOKEN51!=null?TOKEN51.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(303, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbchange");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbchange"


    // $ANTLR start "vbsubmerge"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:304:1: vbsubmerge : 'VB-SUBMERGE' TOKEN ;
    public final void vbsubmerge() throws RecognitionException {
        Token TOKEN52=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubmerge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:304:11: ( 'VB-SUBMERGE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:304:12: 'VB-SUBMERGE' TOKEN
            {
            dbg.location(304,12);
            match(input,59,FOLLOW_59_in_vbsubmerge794); 
            dbg.location(304,27);
            TOKEN52=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubmerge797); 
            dbg.location(305,1);

            	 addElement("VB-SUBMERGE",(TOKEN52!=null?TOKEN52.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(307, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbsubmerge");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbsubmerge"


    // $ANTLR start "vbsubject"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:308:1: vbsubject : 'VB-SUBJECT' TOKEN ;
    public final void vbsubject() throws RecognitionException {
        Token TOKEN53=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubject");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(308, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:308:10: ( 'VB-SUBJECT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:308:11: 'VB-SUBJECT' TOKEN
            {
            dbg.location(308,11);
            match(input,60,FOLLOW_60_in_vbsubject804); 
            dbg.location(308,25);
            TOKEN53=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubject807); 
            dbg.location(309,1);

            	 addElement("VB-SUBJECT",(TOKEN53!=null?TOKEN53.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(311, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbsubject");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbsubject"


    // $ANTLR start "jj"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:313:1: jj : 'JJ' TOKEN ;
    public final void jj() throws RecognitionException {
        Token TOKEN54=null;

        try { dbg.enterRule(getGrammarFileName(), "jj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(313, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:313:3: ( 'JJ' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:313:4: 'JJ' TOKEN
            {
            dbg.location(313,4);
            match(input,61,FOLLOW_61_in_jj815); 
            dbg.location(313,10);
            TOKEN54=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jj818); 
            dbg.location(314,1);

            	 addElement("JJ",(TOKEN54!=null?TOKEN54.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(316, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "jj");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "jj"


    // $ANTLR start "nnadd"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:318:1: nnadd : 'NN-ADD' TOKEN ;
    public final void nnadd() throws RecognitionException {
        Token TOKEN55=null;

        try { dbg.enterRule(getGrammarFileName(), "nnadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(318, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:318:6: ( 'NN-ADD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:318:7: 'NN-ADD' TOKEN
            {
            dbg.location(318,7);
            match(input,62,FOLLOW_62_in_nnadd826); 
            dbg.location(318,17);
            TOKEN55=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnadd829); 
            dbg.location(319,1);

            	 addElement("NN-ADD",(TOKEN55!=null?TOKEN55.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(321, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnadd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnadd"


    // $ANTLR start "nnmixture"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:322:1: nnmixture : 'NN-MIXTURE' TOKEN ;
    public final void nnmixture() throws RecognitionException {
        Token TOKEN56=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(322, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:322:10: ( 'NN-MIXTURE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:322:11: 'NN-MIXTURE' TOKEN
            {
            dbg.location(322,11);
            match(input,63,FOLLOW_63_in_nnmixture836); 
            dbg.location(322,25);
            TOKEN56=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmixture839); 
            dbg.location(323,1);

            	 addElement("NN-MIXTURE",(TOKEN56!=null?TOKEN56.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(325, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnmixture");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnmixture"


    // $ANTLR start "vbadd"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:326:1: vbadd : 'VB-ADD' TOKEN ;
    public final void vbadd() throws RecognitionException {
        Token TOKEN57=null;

        try { dbg.enterRule(getGrammarFileName(), "vbadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(326, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:326:6: ( 'VB-ADD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:326:7: 'VB-ADD' TOKEN
            {
            dbg.location(326,7);
            match(input,64,FOLLOW_64_in_vbadd846); 
            dbg.location(326,17);
            TOKEN57=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbadd849); 
            dbg.location(327,1);

            	 addElement("VB-ADD",(TOKEN57!=null?TOKEN57.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(329, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbadd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbadd"


    // $ANTLR start "vbcharge"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:330:1: vbcharge : 'VB-CHARGE' TOKEN ;
    public final void vbcharge() throws RecognitionException {
        Token TOKEN58=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcharge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(330, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:330:9: ( 'VB-CHARGE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:330:10: 'VB-CHARGE' TOKEN
            {
            dbg.location(330,10);
            match(input,65,FOLLOW_65_in_vbcharge856); 
            dbg.location(330,23);
            TOKEN58=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcharge859); 
            dbg.location(331,1);

            	 addElement("VB-CHARGE",(TOKEN58!=null?TOKEN58.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(333, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbcharge");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbcharge"


    // $ANTLR start "vbcontain"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:334:1: vbcontain : 'VB-CONTAIN' TOKEN ;
    public final void vbcontain() throws RecognitionException {
        Token TOKEN59=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcontain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(334, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:334:10: ( 'VB-CONTAIN' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:334:11: 'VB-CONTAIN' TOKEN
            {
            dbg.location(334,11);
            match(input,66,FOLLOW_66_in_vbcontain866); 
            dbg.location(334,25);
            TOKEN59=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcontain869); 
            dbg.location(335,1);

            	 addElement("VB-CONTAIN",(TOKEN59!=null?TOKEN59.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(337, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbcontain");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbcontain"


    // $ANTLR start "vbdrop"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:338:1: vbdrop : 'VB-DROP' TOKEN ;
    public final void vbdrop() throws RecognitionException {
        Token TOKEN60=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdrop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(338, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:338:7: ( 'VB-DROP' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:338:8: 'VB-DROP' TOKEN
            {
            dbg.location(338,8);
            match(input,67,FOLLOW_67_in_vbdrop876); 
            dbg.location(338,19);
            TOKEN60=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdrop879); 
            dbg.location(339,1);

            	 addElement("VB-DROP",(TOKEN60!=null?TOKEN60.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(341, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbdrop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbdrop"


    // $ANTLR start "vbfill"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:342:1: vbfill : 'VB-FILL' TOKEN ;
    public final void vbfill() throws RecognitionException {
        Token TOKEN61=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfill");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(342, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:342:7: ( 'VB-FILL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:342:8: 'VB-FILL' TOKEN
            {
            dbg.location(342,8);
            match(input,68,FOLLOW_68_in_vbfill886); 
            dbg.location(342,19);
            TOKEN61=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfill889); 
            dbg.location(343,1);

            	 addElement("VB-FILL",(TOKEN61!=null?TOKEN61.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(345, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbfill");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbfill"


    // $ANTLR start "vbsuspend"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:346:1: vbsuspend : 'VB-SUSPEND' TOKEN ;
    public final void vbsuspend() throws RecognitionException {
        Token TOKEN62=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsuspend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(346, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:346:10: ( 'VB-SUSPEND' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:346:11: 'VB-SUSPEND' TOKEN
            {
            dbg.location(346,11);
            match(input,69,FOLLOW_69_in_vbsuspend896); 
            dbg.location(346,25);
            TOKEN62=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsuspend899); 
            dbg.location(347,1);

            	 addElement("VB-SUSPEND",(TOKEN62!=null?TOKEN62.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(349, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbsuspend");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbsuspend"


    // $ANTLR start "vbtreat"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:350:1: vbtreat : 'VB-TREAT' TOKEN ;
    public final void vbtreat() throws RecognitionException {
        Token TOKEN63=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtreat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(350, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:350:8: ( 'VB-TREAT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:350:9: 'VB-TREAT' TOKEN
            {
            dbg.location(350,9);
            match(input,70,FOLLOW_70_in_vbtreat906); 
            dbg.location(350,21);
            TOKEN63=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtreat909); 
            dbg.location(351,1);

            	 addElement("VB-TREAT",(TOKEN63!=null?TOKEN63.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(353, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbtreat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbtreat"


    // $ANTLR start "vbapparatus"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:355:1: vbapparatus : 'VB-APPARATUS' TOKEN ;
    public final void vbapparatus() throws RecognitionException {
        Token TOKEN64=null;

        try { dbg.enterRule(getGrammarFileName(), "vbapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(355, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:355:12: ( 'VB-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:355:13: 'VB-APPARATUS' TOKEN
            {
            dbg.location(355,13);
            match(input,71,FOLLOW_71_in_vbapparatus917); 
            dbg.location(355,29);
            TOKEN64=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbapparatus920); 
            dbg.location(356,1);

            	 addElement("VB-APPARATUS",(TOKEN64!=null?TOKEN64.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(358, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbapparatus");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbapparatus"


    // $ANTLR start "nnapparatus"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:359:1: nnapparatus : 'NN-APPARATUS' TOKEN ;
    public final void nnapparatus() throws RecognitionException {
        Token TOKEN65=null;

        try { dbg.enterRule(getGrammarFileName(), "nnapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(359, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:359:12: ( 'NN-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:359:13: 'NN-APPARATUS' TOKEN
            {
            dbg.location(359,13);
            match(input,72,FOLLOW_72_in_nnapparatus927); 
            dbg.location(359,29);
            TOKEN65=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnapparatus930); 
            dbg.location(360,1);

            	 addElement("NN-APPARATUS",(TOKEN65!=null?TOKEN65.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(362, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnapparatus");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnapparatus"


    // $ANTLR start "vbconcentrate"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:364:1: vbconcentrate : 'VB-CONCENTRATE' TOKEN ;
    public final void vbconcentrate() throws RecognitionException {
        Token TOKEN66=null;

        try { dbg.enterRule(getGrammarFileName(), "vbconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(364, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:364:14: ( 'VB-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:364:15: 'VB-CONCENTRATE' TOKEN
            {
            dbg.location(364,15);
            match(input,73,FOLLOW_73_in_vbconcentrate938); 
            dbg.location(364,33);
            TOKEN66=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbconcentrate941); 
            dbg.location(365,1);

            	 addElement("VB-CONCENTRATE",(TOKEN66!=null?TOKEN66.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(367, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbconcentrate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbconcentrate"


    // $ANTLR start "nnconcentrate"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:368:1: nnconcentrate : 'NN-CONCENTRATE' TOKEN ;
    public final void nnconcentrate() throws RecognitionException {
        Token TOKEN67=null;

        try { dbg.enterRule(getGrammarFileName(), "nnconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(368, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:368:14: ( 'NN-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:368:15: 'NN-CONCENTRATE' TOKEN
            {
            dbg.location(368,15);
            match(input,74,FOLLOW_74_in_nnconcentrate948); 
            dbg.location(368,33);
            TOKEN67=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnconcentrate951); 
            dbg.location(369,1);

            	 addElement("NN-CONCENTRATE",(TOKEN67!=null?TOKEN67.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(371, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnconcentrate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnconcentrate"


    // $ANTLR start "vbcool"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:373:1: vbcool : 'VB-COOL' TOKEN ;
    public final void vbcool() throws RecognitionException {
        Token TOKEN68=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(373, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:373:7: ( 'VB-COOL' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:373:8: 'VB-COOL' TOKEN
            {
            dbg.location(373,8);
            match(input,75,FOLLOW_75_in_vbcool959); 
            dbg.location(373,19);
            TOKEN68=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcool962); 
            dbg.location(374,1);

            	 addElement("VB-COOL",(TOKEN68!=null?TOKEN68.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(376, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbcool");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbcool"


    // $ANTLR start "vbdegass"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:378:1: vbdegass : 'VB-DEGASS' TOKEN ;
    public final void vbdegass() throws RecognitionException {
        Token TOKEN69=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdegass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(378, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:378:9: ( 'VB-DEGASS' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:378:10: 'VB-DEGASS' TOKEN
            {
            dbg.location(378,10);
            match(input,76,FOLLOW_76_in_vbdegass970); 
            dbg.location(378,23);
            TOKEN69=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdegass973); 
            dbg.location(379,1);

            	 addElement("VB-DEGASS",(TOKEN69!=null?TOKEN69.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(381, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbdegass");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbdegass"


    // $ANTLR start "vbdissolve"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:383:1: vbdissolve : 'VB-DISSOLVE' TOKEN ;
    public final void vbdissolve() throws RecognitionException {
        Token TOKEN70=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdissolve");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(383, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:383:11: ( 'VB-DISSOLVE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:383:12: 'VB-DISSOLVE' TOKEN
            {
            dbg.location(383,12);
            match(input,77,FOLLOW_77_in_vbdissolve981); 
            dbg.location(383,27);
            TOKEN70=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdissolve984); 
            dbg.location(384,1);

            	 addElement("VB-DISSOLVE",(TOKEN70!=null?TOKEN70.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(386, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbdissolve");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbdissolve"


    // $ANTLR start "vbdry"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:388:1: vbdry : 'VB-DRY' TOKEN ;
    public final void vbdry() throws RecognitionException {
        Token TOKEN71=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(388, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:388:6: ( 'VB-DRY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:388:7: 'VB-DRY' TOKEN
            {
            dbg.location(388,7);
            match(input,78,FOLLOW_78_in_vbdry992); 
            dbg.location(388,17);
            TOKEN71=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdry995); 
            dbg.location(389,1);

            	 addElement("VB-DRY",(TOKEN71!=null?TOKEN71.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(391, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbdry");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbdry"


    // $ANTLR start "nndry"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:392:1: nndry : 'NN-DRY' TOKEN ;
    public final void nndry() throws RecognitionException {
        Token TOKEN72=null;

        try { dbg.enterRule(getGrammarFileName(), "nndry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(392, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:392:6: ( 'NN-DRY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:392:7: 'NN-DRY' TOKEN
            {
            dbg.location(392,7);
            match(input,79,FOLLOW_79_in_nndry1002); 
            dbg.location(392,17);
            TOKEN72=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nndry1005); 
            dbg.location(393,1);

            	 addElement("NN-DRY",(TOKEN72!=null?TOKEN72.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(395, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nndry");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nndry"


    // $ANTLR start "vbextract"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:397:1: vbextract : 'VB-EXTRACT' TOKEN ;
    public final void vbextract() throws RecognitionException {
        Token TOKEN73=null;

        try { dbg.enterRule(getGrammarFileName(), "vbextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(397, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:397:10: ( 'VB-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:397:11: 'VB-EXTRACT' TOKEN
            {
            dbg.location(397,11);
            match(input,80,FOLLOW_80_in_vbextract1013); 
            dbg.location(397,25);
            TOKEN73=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbextract1016); 
            dbg.location(398,1);

            	 addElement("VB-EXTRACT",(TOKEN73!=null?TOKEN73.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(400, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbextract");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbextract"


    // $ANTLR start "nnextract"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:401:1: nnextract : 'NN-EXTRACT' TOKEN ;
    public final void nnextract() throws RecognitionException {
        Token TOKEN74=null;

        try { dbg.enterRule(getGrammarFileName(), "nnextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(401, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:401:10: ( 'NN-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:401:11: 'NN-EXTRACT' TOKEN
            {
            dbg.location(401,11);
            match(input,81,FOLLOW_81_in_nnextract1023); 
            dbg.location(401,25);
            TOKEN74=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnextract1026); 
            dbg.location(402,1);

            	 addElement("NN-EXTRACT",(TOKEN74!=null?TOKEN74.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(404, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnextract");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnextract"


    // $ANTLR start "vbfilter"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:406:1: vbfilter : 'VB-FILTER' TOKEN ;
    public final void vbfilter() throws RecognitionException {
        Token TOKEN75=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(406, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:406:9: ( 'VB-FILTER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:406:10: 'VB-FILTER' TOKEN
            {
            dbg.location(406,10);
            match(input,82,FOLLOW_82_in_vbfilter1034); 
            dbg.location(406,23);
            TOKEN75=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfilter1037); 
            dbg.location(407,1);

            	 addElement("VB-FILTER",(TOKEN75!=null?TOKEN75.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(409, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbfilter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbfilter"


    // $ANTLR start "nnfilter"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:410:1: nnfilter : 'NN-FILTER' TOKEN ;
    public final void nnfilter() throws RecognitionException {
        Token TOKEN76=null;

        try { dbg.enterRule(getGrammarFileName(), "nnfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(410, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:410:9: ( 'NN-FILTER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:410:10: 'NN-FILTER' TOKEN
            {
            dbg.location(410,10);
            match(input,83,FOLLOW_83_in_nnfilter1044); 
            dbg.location(410,23);
            TOKEN76=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnfilter1047); 
            dbg.location(411,1);

            	 addElement("NN-FILTER",(TOKEN76!=null?TOKEN76.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(413, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnfilter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnfilter"


    // $ANTLR start "vbheat"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:415:1: vbheat : 'VB-HEAT' TOKEN ;
    public final void vbheat() throws RecognitionException {
        Token TOKEN77=null;

        try { dbg.enterRule(getGrammarFileName(), "vbheat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(415, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:415:7: ( 'VB-HEAT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:415:8: 'VB-HEAT' TOKEN
            {
            dbg.location(415,8);
            match(input,84,FOLLOW_84_in_vbheat1055); 
            dbg.location(415,19);
            TOKEN77=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbheat1058); 
            dbg.location(416,1);

            	 addElement("VB-HEAT",(TOKEN77!=null?TOKEN77.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(418, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbheat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbheat"


    // $ANTLR start "vbincrease"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:419:1: vbincrease : 'VB-INCREASE' TOKEN ;
    public final void vbincrease() throws RecognitionException {
        Token TOKEN78=null;

        try { dbg.enterRule(getGrammarFileName(), "vbincrease");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(419, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:419:11: ( 'VB-INCREASE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:419:12: 'VB-INCREASE' TOKEN
            {
            dbg.location(419,12);
            match(input,85,FOLLOW_85_in_vbincrease1065); 
            dbg.location(419,27);
            TOKEN78=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbincrease1068); 
            dbg.location(420,1);

            	 addElement("VB-INCREASE",(TOKEN78!=null?TOKEN78.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(422, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbincrease");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbincrease"


    // $ANTLR start "vbpartition"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:424:1: vbpartition : 'VB-PARTITION' TOKEN ;
    public final void vbpartition() throws RecognitionException {
        Token TOKEN79=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpartition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(424, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:424:12: ( 'VB-PARTITION' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:424:13: 'VB-PARTITION' TOKEN
            {
            dbg.location(424,13);
            match(input,86,FOLLOW_86_in_vbpartition1076); 
            dbg.location(424,29);
            TOKEN79=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpartition1079); 
            dbg.location(425,1);

            	 addElement("VB-PARTITION",(TOKEN79!=null?TOKEN79.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(427, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbpartition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbpartition"


    // $ANTLR start "vbprecipitate"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:429:1: vbprecipitate : 'VB-PRECIPITATE' TOKEN ;
    public final void vbprecipitate() throws RecognitionException {
        Token TOKEN80=null;

        try { dbg.enterRule(getGrammarFileName(), "vbprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(429, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:429:14: ( 'VB-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:429:15: 'VB-PRECIPITATE' TOKEN
            {
            dbg.location(429,15);
            match(input,87,FOLLOW_87_in_vbprecipitate1087); 
            dbg.location(429,33);
            TOKEN80=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbprecipitate1090); 
            dbg.location(430,1);

            	 addElement("VB-PRECIPITATE",(TOKEN80!=null?TOKEN80.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(432, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbprecipitate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbprecipitate"


    // $ANTLR start "nnprecipitate"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:433:1: nnprecipitate : 'NN-PRECIPITATE' TOKEN ;
    public final void nnprecipitate() throws RecognitionException {
        Token TOKEN81=null;

        try { dbg.enterRule(getGrammarFileName(), "nnprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(433, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:433:14: ( 'NN-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:433:15: 'NN-PRECIPITATE' TOKEN
            {
            dbg.location(433,15);
            match(input,88,FOLLOW_88_in_nnprecipitate1097); 
            dbg.location(433,33);
            TOKEN81=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnprecipitate1100); 
            dbg.location(434,1);

            	 addElement("NN-PRECIPITATE",(TOKEN81!=null?TOKEN81.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(436, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnprecipitate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnprecipitate"


    // $ANTLR start "vbpurify"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:438:1: vbpurify : 'VB-PURIFY' TOKEN ;
    public final void vbpurify() throws RecognitionException {
        Token TOKEN82=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(438, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:438:9: ( 'VB-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:438:10: 'VB-PURIFY' TOKEN
            {
            dbg.location(438,10);
            match(input,89,FOLLOW_89_in_vbpurify1108); 
            dbg.location(438,23);
            TOKEN82=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpurify1111); 
            dbg.location(439,1);

            	 addElement("VB-PURIFY",(TOKEN82!=null?TOKEN82.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(441, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbpurify");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbpurify"


    // $ANTLR start "nnpurify"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:442:1: nnpurify : 'NN-PURIFY' TOKEN ;
    public final void nnpurify() throws RecognitionException {
        Token TOKEN83=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(442, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:442:9: ( 'NN-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:442:10: 'NN-PURIFY' TOKEN
            {
            dbg.location(442,10);
            match(input,90,FOLLOW_90_in_nnpurify1118); 
            dbg.location(442,23);
            TOKEN83=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpurify1121); 
            dbg.location(443,1);

            	 addElement("NN-PURIFY",(TOKEN83!=null?TOKEN83.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(445, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnpurify");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnpurify"


    // $ANTLR start "vbquench"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:447:1: vbquench : 'VB-QUENCH' TOKEN ;
    public final void vbquench() throws RecognitionException {
        Token TOKEN84=null;

        try { dbg.enterRule(getGrammarFileName(), "vbquench");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(447, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:447:9: ( 'VB-QUENCH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:447:10: 'VB-QUENCH' TOKEN
            {
            dbg.location(447,10);
            match(input,91,FOLLOW_91_in_vbquench1129); 
            dbg.location(447,23);
            TOKEN84=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbquench1132); 
            dbg.location(448,1);

            	 addElement("VB-QUENCH",(TOKEN84!=null?TOKEN84.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(450, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbquench");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbquench"


    // $ANTLR start "vbrecover"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:452:1: vbrecover : 'VB-RECOVER' TOKEN ;
    public final void vbrecover() throws RecognitionException {
        Token TOKEN85=null;

        try { dbg.enterRule(getGrammarFileName(), "vbrecover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(452, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:452:10: ( 'VB-RECOVER' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:452:11: 'VB-RECOVER' TOKEN
            {
            dbg.location(452,11);
            match(input,92,FOLLOW_92_in_vbrecover1140); 
            dbg.location(452,25);
            TOKEN85=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbrecover1143); 
            dbg.location(453,1);

            	 addElement("VB-RECOVER",(TOKEN85!=null?TOKEN85.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(455, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbrecover");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbrecover"


    // $ANTLR start "vbremove"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:457:1: vbremove : 'VB-REMOVE' TOKEN ;
    public final void vbremove() throws RecognitionException {
        Token TOKEN86=null;

        try { dbg.enterRule(getGrammarFileName(), "vbremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(457, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:457:9: ( 'VB-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:457:10: 'VB-REMOVE' TOKEN
            {
            dbg.location(457,10);
            match(input,93,FOLLOW_93_in_vbremove1151); 
            dbg.location(457,23);
            TOKEN86=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbremove1154); 
            dbg.location(458,1);

            	 addElement("VB-REMOVE",(TOKEN86!=null?TOKEN86.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(460, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbremove");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbremove"


    // $ANTLR start "nnremove"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:461:1: nnremove : 'NN-REMOVE' TOKEN ;
    public final void nnremove() throws RecognitionException {
        Token TOKEN87=null;

        try { dbg.enterRule(getGrammarFileName(), "nnremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(461, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:461:9: ( 'NN-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:461:10: 'NN-REMOVE' TOKEN
            {
            dbg.location(461,10);
            match(input,94,FOLLOW_94_in_nnremove1161); 
            dbg.location(461,23);
            TOKEN87=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnremove1164); 
            dbg.location(462,1);

            	 addElement("NN-REMOVE",(TOKEN87!=null?TOKEN87.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(464, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnremove");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnremove"


    // $ANTLR start "vbstir"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:466:1: vbstir : 'VB-STIR' TOKEN ;
    public final void vbstir() throws RecognitionException {
        Token TOKEN88=null;

        try { dbg.enterRule(getGrammarFileName(), "vbstir");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(466, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:466:7: ( 'VB-STIR' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:466:8: 'VB-STIR' TOKEN
            {
            dbg.location(466,8);
            match(input,95,FOLLOW_95_in_vbstir1172); 
            dbg.location(466,19);
            TOKEN88=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbstir1175); 
            dbg.location(467,1);

            	 addElement("VB-STIR",(TOKEN88!=null?TOKEN88.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(469, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbstir");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbstir"


    // $ANTLR start "vbsynthesize"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:471:1: vbsynthesize : 'VB-SYNTHESIZE' TOKEN ;
    public final void vbsynthesize() throws RecognitionException {
        Token TOKEN89=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(471, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:471:13: ( 'VB-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:471:14: 'VB-SYNTHESIZE' TOKEN
            {
            dbg.location(471,14);
            match(input,96,FOLLOW_96_in_vbsynthesize1183); 
            dbg.location(471,31);
            TOKEN89=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsynthesize1186); 
            dbg.location(472,1);

            	 addElement("VB-SYNTHESIZE",(TOKEN89!=null?TOKEN89.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(474, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbsynthesize");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbsynthesize"


    // $ANTLR start "nnsynthesize"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:475:1: nnsynthesize : 'NN-SYNTHESIZE' TOKEN ;
    public final void nnsynthesize() throws RecognitionException {
        Token TOKEN90=null;

        try { dbg.enterRule(getGrammarFileName(), "nnsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(475, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:475:13: ( 'NN-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:475:14: 'NN-SYNTHESIZE' TOKEN
            {
            dbg.location(475,14);
            match(input,97,FOLLOW_97_in_nnsynthesize1193); 
            dbg.location(475,31);
            TOKEN90=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnsynthesize1196); 
            dbg.location(476,1);

            	 addElement("NN-SYNTHESIZE",(TOKEN90!=null?TOKEN90.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(478, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnsynthesize");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnsynthesize"


    // $ANTLR start "vbwait"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:480:1: vbwait : 'VB-WAIT' TOKEN ;
    public final void vbwait() throws RecognitionException {
        Token TOKEN91=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwait");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(480, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:480:7: ( 'VB-WAIT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:480:8: 'VB-WAIT' TOKEN
            {
            dbg.location(480,8);
            match(input,98,FOLLOW_98_in_vbwait1204); 
            dbg.location(480,19);
            TOKEN91=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwait1207); 
            dbg.location(481,1);

            	 addElement("VB-WAIT",(TOKEN91!=null?TOKEN91.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(483, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbwait");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbwait"


    // $ANTLR start "vbwash"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:485:1: vbwash : 'VB-WASH' TOKEN ;
    public final void vbwash() throws RecognitionException {
        Token TOKEN92=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(485, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:485:7: ( 'VB-WASH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:485:8: 'VB-WASH' TOKEN
            {
            dbg.location(485,8);
            match(input,99,FOLLOW_99_in_vbwash1215); 
            dbg.location(485,19);
            TOKEN92=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwash1218); 
            dbg.location(486,1);

            	 addElement("VB-WASH",(TOKEN92!=null?TOKEN92.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(488, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbwash");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbwash"


    // $ANTLR start "vbyield"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:490:1: vbyield : 'VB-YIELD' TOKEN ;
    public final void vbyield() throws RecognitionException {
        Token TOKEN93=null;

        try { dbg.enterRule(getGrammarFileName(), "vbyield");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(490, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:490:8: ( 'VB-YIELD' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:490:9: 'VB-YIELD' TOKEN
            {
            dbg.location(490,9);
            match(input,100,FOLLOW_100_in_vbyield1226); 
            dbg.location(490,21);
            TOKEN93=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbyield1229); 
            dbg.location(491,1);

            	 addElement("VB-YIELD",(TOKEN93!=null?TOKEN93.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(493, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vbyield");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbyield"


    // $ANTLR start "rb"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:495:1: rb : 'RB' TOKEN ;
    public final void rb() throws RecognitionException {
        Token TOKEN94=null;

        try { dbg.enterRule(getGrammarFileName(), "rb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(495, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:495:3: ( 'RB' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:495:4: 'RB' TOKEN
            {
            dbg.location(495,4);
            match(input,101,FOLLOW_101_in_rb1237); 
            dbg.location(495,10);
            TOKEN94=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rb1240); 
            dbg.location(496,1);

            	 addElement("RB",(TOKEN94!=null?TOKEN94.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(498, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rb"


    // $ANTLR start "colon"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:500:1: colon : 'COLON' TOKEN ;
    public final void colon() throws RecognitionException {
        Token TOKEN95=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(500, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:500:6: ( 'COLON' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:500:7: 'COLON' TOKEN
            {
            dbg.location(500,7);
            match(input,102,FOLLOW_102_in_colon1248); 
            dbg.location(500,16);
            TOKEN95=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_colon1251); 
            dbg.location(501,1);

            	 addElement("COLON",(TOKEN95!=null?TOKEN95.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(503, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "colon");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "colon"


    // $ANTLR start "comma"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:504:1: comma : 'COMMA' TOKEN ;
    public final void comma() throws RecognitionException {
        Token TOKEN96=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(504, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:504:6: ( 'COMMA' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:504:7: 'COMMA' TOKEN
            {
            dbg.location(504,7);
            match(input,103,FOLLOW_103_in_comma1258); 
            dbg.location(504,16);
            TOKEN96=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_comma1261); 
            dbg.location(505,1);

            	 addElement("COMMA",(TOKEN96!=null?TOKEN96.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(507, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "comma"


    // $ANTLR start "apost"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:508:1: apost : 'APOST' TOKEN ;
    public final void apost() throws RecognitionException {
        Token TOKEN97=null;

        try { dbg.enterRule(getGrammarFileName(), "apost");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(508, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:508:6: ( 'APOST' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:508:7: 'APOST' TOKEN
            {
            dbg.location(508,7);
            match(input,104,FOLLOW_104_in_apost1268); 
            dbg.location(508,16);
            TOKEN97=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_apost1271); 
            dbg.location(509,1);

            	 addElement("APOST",(TOKEN97!=null?TOKEN97.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(511, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "apost");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "apost"


    // $ANTLR start "neg"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:512:1: neg : 'NEG' TOKEN ;
    public final void neg() throws RecognitionException {
        Token TOKEN98=null;

        try { dbg.enterRule(getGrammarFileName(), "neg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(512, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:512:4: ( 'NEG' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:512:5: 'NEG' TOKEN
            {
            dbg.location(512,5);
            match(input,105,FOLLOW_105_in_neg1278); 
            dbg.location(512,12);
            TOKEN98=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_neg1281); 
            dbg.location(513,1);

            	 addElement("NEG",(TOKEN98!=null?TOKEN98.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(515, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "neg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "neg"


    // $ANTLR start "dash"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:516:1: dash : 'DASH' TOKEN ;
    public final void dash() throws RecognitionException {
        Token TOKEN99=null;

        try { dbg.enterRule(getGrammarFileName(), "dash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(516, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:516:5: ( 'DASH' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:516:6: 'DASH' TOKEN
            {
            dbg.location(516,6);
            match(input,106,FOLLOW_106_in_dash1288); 
            dbg.location(516,14);
            TOKEN99=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dash1291); 
            dbg.location(517,1);

            	 addElement("DASH",(TOKEN99!=null?TOKEN99.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(519, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dash");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dash"


    // $ANTLR start "stop"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:520:1: stop : 'STOP' TOKEN ;
    public final void stop() throws RecognitionException {
        Token TOKEN100=null;

        try { dbg.enterRule(getGrammarFileName(), "stop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(520, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:520:5: ( 'STOP' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:520:6: 'STOP' TOKEN
            {
            dbg.location(520,6);
            match(input,107,FOLLOW_107_in_stop1298); 
            dbg.location(520,14);
            TOKEN100=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_stop1301); 
            dbg.location(521,1);

            	 addElement("STOP",(TOKEN100!=null?TOKEN100.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(523, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stop"


    // $ANTLR start "nnpercent"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:524:1: nnpercent : 'NN-PERCENT' TOKEN ;
    public final void nnpercent() throws RecognitionException {
        Token TOKEN101=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpercent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(524, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:524:10: ( 'NN-PERCENT' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:524:11: 'NN-PERCENT' TOKEN
            {
            dbg.location(524,11);
            match(input,108,FOLLOW_108_in_nnpercent1308); 
            dbg.location(524,25);
            TOKEN101=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpercent1311); 
            dbg.location(525,1);

            	 addElement("NN-PERCENT",(TOKEN101!=null?TOKEN101.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(527, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nnpercent");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnpercent"


    // $ANTLR start "lsqb"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:528:1: lsqb : 'LSQB' TOKEN ;
    public final void lsqb() throws RecognitionException {
        Token TOKEN102=null;

        try { dbg.enterRule(getGrammarFileName(), "lsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(528, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:528:5: ( 'LSQB' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:528:6: 'LSQB' TOKEN
            {
            dbg.location(528,6);
            match(input,109,FOLLOW_109_in_lsqb1318); 
            dbg.location(528,14);
            TOKEN102=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lsqb1321); 
            dbg.location(529,1);

            	 addElement("LSQB",(TOKEN102!=null?TOKEN102.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(531, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lsqb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "lsqb"


    // $ANTLR start "rsqb"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:532:1: rsqb : 'RSQB' TOKEN ;
    public final void rsqb() throws RecognitionException {
        Token TOKEN103=null;

        try { dbg.enterRule(getGrammarFileName(), "rsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(532, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:532:5: ( 'RSQB' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:532:6: 'RSQB' TOKEN
            {
            dbg.location(532,6);
            match(input,110,FOLLOW_110_in_rsqb1328); 
            dbg.location(532,14);
            TOKEN103=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rsqb1331); 
            dbg.location(533,1);

            	 addElement("RSQB",(TOKEN103!=null?TOKEN103.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(535, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rsqb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rsqb"


    // $ANTLR start "lrb"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:537:1: lrb : '-LRB-' TOKEN ;
    public final void lrb() throws RecognitionException {
        Token TOKEN104=null;

        try { dbg.enterRule(getGrammarFileName(), "lrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(537, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:537:5: ( '-LRB-' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:537:6: '-LRB-' TOKEN
            {
            dbg.location(537,6);
            match(input,111,FOLLOW_111_in_lrb1340); 
            dbg.location(537,15);
            TOKEN104=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lrb1343); 
            dbg.location(538,1);

            	 addElement("LRB",(TOKEN104!=null?TOKEN104.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(540, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lrb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "lrb"


    // $ANTLR start "rrb"
    // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:542:1: rrb : '-RRB-' TOKEN ;
    public final void rrb() throws RecognitionException {
        Token TOKEN105=null;

        try { dbg.enterRule(getGrammarFileName(), "rrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(542, 1);

        try {
            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:542:5: ( '-RRB-' TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\pm286\\workspace\\chemicaltagger\\src\\main\\antlr\\grammar\\ChemicalChunker.g:542:6: '-RRB-' TOKEN
            {
            dbg.location(542,6);
            match(input,112,FOLLOW_112_in_rrb1352); 
            dbg.location(542,15);
            TOKEN105=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rrb1355); 
            dbg.location(543,1);

            	 addElement("RRB",(TOKEN105!=null?TOKEN105.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(545, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rrb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rrb"

    // Delegated rules


 

    public static final BitSet FOLLOW_sentence_in_document116 = new BitSet(new long[]{0x0100000000000202L});
    public static final BitSet FOLLOW_cd_in_mol125 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_nnmol_in_mol127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nounphrase_in_sentence137 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_verbphraseADD_in_sentence139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_prepphrase_in_sentence141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecules_in_nounphrase150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbd_in_verbphraseADD163 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000001L});
    public static final BitSet FOLLOW_vbadd_in_verbphraseADD166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_totok_in_prepphrase177 = new BitSet(new long[]{0x0100000000000200L});
    public static final BitSet FOLLOW_molecule_in_prepphrase179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_gram189 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_nngram_in_gram191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecule_in_molecules202 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_cc_in_molecules204 = new BitSet(new long[]{0x0100000000000200L});
    public static final BitSet FOLLOW_molecule_in_molecules206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dttok_in_molecule227 = new BitSet(new long[]{0x0100000000000200L,0x0000800000000000L});
    public static final BitSet FOLLOW_oscarcm_in_molecule230 = new BitSet(new long[]{0x0100000000000200L,0x0000800000000000L});
    public static final BitSet FOLLOW_amount_in_molecule233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lrb_in_amount242 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_gram_in_amount244 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_comma_in_amount246 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_mol_in_amount249 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_rrb_in_amount251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_dttok258 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dttok261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_vbd277 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbd279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_cc289 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cc292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_totok303 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_totok305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_nntok313 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntok316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ppntok324 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppntok327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_vbtok335 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbtok338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_oscarcd347 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcd350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_oscarcj357 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcj360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_tmunicode367 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_tmunicode370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_cdunicode377 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cdunicode380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_inas389 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inas392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_inbefore399 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inbefore402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_inafter409 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inafter412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_inin419 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inin422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ininto429 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ininto432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_inwith439 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inwith442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_inwithout449 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inwithout452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_inby459 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inby462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_invia469 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_invia472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_inof479 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inof482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_inon489 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inon492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_infor499 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_infor502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_infrom509 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_infrom512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_inunder519 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inunder522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_inover529 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inover532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_inoff539 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inoff542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_to549 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_to552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_nnstate560 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnstate563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nntime571 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntime574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_cd581 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cd584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nngram591 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nngram594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_nnmol601 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmol604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_nnatmosphere611 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnatmosphere614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_nneq621 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nneq624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_nnvol631 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnvol634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_nntemp642 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntemp645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_nnflash652 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnflash655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_nngeneral662 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nngeneral665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_nnmethod672 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmethod675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_nnamount682 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnamount685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_nnpressure692 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpressure695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_nncolumn702 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nncolumn705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_nnchromatography712 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnchromatography715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_nnvacuum722 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnvacuum725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_nncycle732 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nncycle735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_nntimes742 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntimes745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_nnchementity753 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnchementity756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_oscarcm763 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcm766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_vbuse774 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbuse777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_vbchange784 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbchange787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_vbsubmerge794 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubmerge797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_vbsubject804 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubject807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_jj815 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jj818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_nnadd826 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnadd829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_nnmixture836 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmixture839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_vbadd846 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbadd849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_vbcharge856 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcharge859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_vbcontain866 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcontain869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_vbdrop876 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdrop879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_vbfill886 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbfill889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_vbsuspend896 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsuspend899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_vbtreat906 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbtreat909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_vbapparatus917 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbapparatus920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_nnapparatus927 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnapparatus930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_vbconcentrate938 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbconcentrate941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_nnconcentrate948 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnconcentrate951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_vbcool959 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcool962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_vbdegass970 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdegass973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_vbdissolve981 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdissolve984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_vbdry992 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdry995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_nndry1002 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nndry1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_vbextract1013 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbextract1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_nnextract1023 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnextract1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_vbfilter1034 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbfilter1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_nnfilter1044 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnfilter1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_vbheat1055 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbheat1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_vbincrease1065 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbincrease1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_vbpartition1076 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbpartition1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_vbprecipitate1087 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbprecipitate1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_nnprecipitate1097 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnprecipitate1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_vbpurify1108 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbpurify1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_nnpurify1118 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpurify1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_vbquench1129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbquench1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_vbrecover1140 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbrecover1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_vbremove1151 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbremove1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_nnremove1161 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnremove1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_vbstir1172 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbstir1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_vbsynthesize1183 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsynthesize1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_nnsynthesize1193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnsynthesize1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_vbwait1204 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbwait1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_vbwash1215 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbwash1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_vbyield1226 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbyield1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rb1237 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rb1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_colon1248 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_colon1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_comma1258 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_comma1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_apost1268 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_apost1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_neg1278 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_neg1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_dash1288 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dash1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_stop1298 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_stop1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_nnpercent1308 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpercent1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_lsqb1318 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_lsqb1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_rsqb1328 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rsqb1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_lrb1340 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_lrb1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_rrb1352 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rrb1355 = new BitSet(new long[]{0x0000000000000002L});

}