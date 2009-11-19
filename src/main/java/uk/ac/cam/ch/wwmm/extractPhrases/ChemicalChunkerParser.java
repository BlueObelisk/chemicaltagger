// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g 2009-11-18 23:06:09

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WS", "NEWLINE", "ACHAR", "DIGIT", "TOKEN", "'DT'", "'NN'", "'PPN'", "'VB'", "'OSCAR-CD'", "'OSCAR-CJ'", "'TM-UNICODE'", "'CD-UNICODE'", "'IN-AS'", "'IN-BEFORE'", "'IN-AFTER'", "'IN-IN'", "'IN-INTO'", "'IN-WITH'", "'IN-WITHOUT'", "'IN-BY'", "'IN-VIA'", "'IN-OF'", "'IN-ON'", "'IN-FOR'", "'IN-FROM'", "'IN-UNDER'", "'IN-OVER'", "'IN-OFF'", "'TO'", "'NN-STATE'", "'NN-TIME'", "'CD'", "'NN-GRAM'", "'NN-MOL'", "'NN-ATMOSPHERE'", "'NN-EQ'", "'NN-VOL'", "'NN-TEMP'", "'NN-FLASH'", "'NN-GENERAL'", "'NN-METHOD'", "'NN-AMOUNT'", "'NN-PRESSURE'", "'NN-COLUMN'", "'NN-CHROMATOGRAPHY'", "'NN-VACUUM'", "'NN-CYCLE'", "'NN-TIMES'", "'NN-CHEMENTITY'", "'OSCAR-CM'", "'VB-USE'", "'VB-CHANGE'", "'VB-SUBMERGE'", "'VB-SUBJECT'", "'JJ'", "'NN-ADD'", "'NN-MIXTURE'", "'VB-ADD'", "'VB-CHARGE'", "'VB-CONTAIN'", "'VB-DROP'", "'VB-FILL'", "'VB-SUSPEND'", "'VB-TREAT'", "'VB-APPARATUS'", "'NN-APPARATUS'", "'VB-CONCENTRATE'", "'NN-CONCENTRATE'", "'VB-COOL'", "'VB-DEGASS'", "'VB-DISSOLVE'", "'VB-DRY'", "'NN-DRY'", "'VB-EXTRACT'", "'NN-EXTRACT'", "'VB-FILTER'", "'NN-FILTER'", "'VB-HEAT'", "'VB-INCREASE'", "'VB-PARTITION'", "'VB-PRECIPITATE'", "'NN-PRECIPITATE'", "'VB-PURIFY'", "'NN-PURIFY'", "'VB-QUENCH'", "'VB-RECOVER'", "'VB-REMOVE'", "'NN-REMOVE'", "'VB-STIR'", "'VB-SYNTHESIZE'", "'NN-SYNTHESIZE'", "'VB-WAIT'", "'VB-WASH'", "'VB-YIELD'", "'RB'", "'COLON'", "'COMMA'", "'APOST'", "'NEG'", "'DASH'", "'STOP'", "'NN-PERCENT'", "'LSQB'", "'RSQB'"
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
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
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
        "invalidRule", "rb", "vbadd", "inunder", "vbtok", "oscarcj", "vbsubmerge", 
        "nntimes", "vbwash", "nnvacuum", "vbcharge", "nnamount", "nnmixture", 
        "vbrecover", "nncolumn", "tmunicode", "inwithout", "nnpercent", 
        "vbcontain", "vbwait", "ppntok", "nnflash", "apost", "vbdissolve", 
        "ininto", "nnpurify", "inon", "infrom", "gram", "inin", "nneq", 
        "molecule", "vbstir", "inwith", "vbquench", "nntime", "nnfilter", 
        "to", "jj", "inafter", "vbremove", "nnmol", "inof", "cdunicode", 
        "sentence", "oscarcd", "vbfilter", "nnremove", "comma", "inby", 
        "vbdrop", "inoff", "oscarcm", "vbpartition", "dttok", "inas", "nngram", 
        "nnstate", "vbtreat", "vbdegass", "vbprecipitate", "nnextract", 
        "dash", "vbheat", "vbincrease", "rsqb", "vbpurify", "vbcool", "nndry", 
        "nnconcentrate", "vbuse", "nnsynthesize", "vbyield", "document", 
        "vbconcentrate", "nnatmosphere", "nnapparatus", "vbsubject", "colon", 
        "nncycle", "nnmethod", "nnprecipitate", "stop", "nntok", "inbefore", 
        "cd", "infor", "nnadd", "nnchementity", "neg", "vbsynthesize", "nnpressure", 
        "amount", "nngeneral", "mol", "vbextract", "nnchromatography", "vbdry", 
        "vbfill", "vbsuspend", "invia", "nntemp", "nnvol", "vbchange", "lsqb", 
        "inover", "vbapparatus"
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
    public String getGrammarFileName() { return "/home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g"; }


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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:56:1: document : ( sentence )+ ;
    public final void document() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "document");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:56:9: ( ( sentence )+ )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:56:11: ( sentence )+
            {
            dbg.location(56,11);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:56:11: ( sentence )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==36||LA1_0==54) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:56:11: sentence
            	    {
            	    dbg.location(56,11);
            	    pushFollow(FOLLOW_sentence_in_document110);
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


    // $ANTLR start "sentence"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:57:1: sentence : ( amount | molecule );
    public final void sentence() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "sentence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:57:10: ( amount | molecule )
            int alt2=2;
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
                alt2=1;
            }
            else if ( (LA2_0==54) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:57:12: amount
                    {
                    dbg.location(57,12);
                    pushFollow(FOLLOW_amount_in_sentence118);
                    amount();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:57:20: molecule
                    {
                    dbg.location(57,20);
                    pushFollow(FOLLOW_molecule_in_sentence121);
                    molecule();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(57, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sentence");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sentence"


    // $ANTLR start "mol"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:58:1: mol : cd nnmol ;
    public final void mol() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:58:5: ( cd nnmol )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:58:7: cd nnmol
            {
            dbg.location(58,7);
            pushFollow(FOLLOW_cd_in_mol129);
            cd();

            state._fsp--;

            dbg.location(58,10);
            pushFollow(FOLLOW_nnmol_in_mol131);
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


    // $ANTLR start "gram"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:60:1: gram : cd nngram ;
    public final void gram() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "gram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:60:6: ( cd nngram )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:60:8: cd nngram
            {
            dbg.location(60,8);
            pushFollow(FOLLOW_cd_in_gram139);
            cd();

            state._fsp--;

            dbg.location(60,11);
            pushFollow(FOLLOW_nngram_in_gram141);
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
        dbg.location(60, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "gram");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "gram"


    // $ANTLR start "molecule"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:61:1: molecule : oscarcm amount ;
    public final void molecule() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "molecule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:62:2: ( oscarcm amount )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:62:5: oscarcm amount
            {
            dbg.location(62,5);
            pushFollow(FOLLOW_oscarcm_in_molecule160);
            oscarcm();

            state._fsp--;

            dbg.location(62,13);
            pushFollow(FOLLOW_amount_in_molecule162);
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
        dbg.location(62, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:63:1: amount : gram comma mol ;
    public final void amount() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "amount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:63:9: ( gram comma mol )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:63:10: gram comma mol
            {
            dbg.location(63,10);
            pushFollow(FOLLOW_gram_in_amount170);
            gram();

            state._fsp--;

            dbg.location(63,15);
            pushFollow(FOLLOW_comma_in_amount172);
            comma();

            state._fsp--;

            dbg.location(63,22);
            pushFollow(FOLLOW_mol_in_amount175);
            mol();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(63, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:65:1: dttok : 'DT' TOKEN ;
    public final void dttok() throws RecognitionException {
        Token TOKEN1=null;

        try { dbg.enterRule(getGrammarFileName(), "dttok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:65:7: ( 'DT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:65:8: 'DT' TOKEN
            {
            dbg.location(65,8);
            match(input,9,FOLLOW_9_in_dttok182); 
            dbg.location(65,14);
            TOKEN1=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dttok185); 
            dbg.location(66,1);

                addElement("DT", (TOKEN1!=null?TOKEN1.getText():null));
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(68, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dttok");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dttok"


    // $ANTLR start "nntok"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:80:1: nntok : 'NN' TOKEN ;
    public final void nntok() throws RecognitionException {
        Token TOKEN2=null;

        try { dbg.enterRule(getGrammarFileName(), "nntok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:80:6: ( 'NN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:80:7: 'NN' TOKEN
            {
            dbg.location(80,7);
            match(input,10,FOLLOW_10_in_nntok201); 
            dbg.location(80,13);
            TOKEN2=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntok204); 
            dbg.location(81,1);

                addElement("NN", (TOKEN2!=null?TOKEN2.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(83, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:84:1: ppntok : 'PPN' TOKEN ;
    public final void ppntok() throws RecognitionException {
        Token TOKEN3=null;

        try { dbg.enterRule(getGrammarFileName(), "ppntok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:84:8: ( 'PPN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:84:9: 'PPN' TOKEN
            {
            dbg.location(84,9);
            match(input,11,FOLLOW_11_in_ppntok212); 
            dbg.location(84,16);
            TOKEN3=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ppntok215); 
            dbg.location(85,1);


                addElement("PPN", (TOKEN3!=null?TOKEN3.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(88, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:89:1: vbtok : 'VB' TOKEN ;
    public final void vbtok() throws RecognitionException {
        Token TOKEN4=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtok");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:89:7: ( 'VB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:89:8: 'VB' TOKEN
            {
            dbg.location(89,8);
            match(input,12,FOLLOW_12_in_vbtok223); 
            dbg.location(89,14);
            TOKEN4=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtok226); 
            dbg.location(90,1);

                addElement("VB", (TOKEN4!=null?TOKEN4.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(92, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:95:1: oscarcd : 'OSCAR-CD' TOKEN ;
    public final void oscarcd() throws RecognitionException {
        Token TOKEN5=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:95:8: ( 'OSCAR-CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:95:9: 'OSCAR-CD' TOKEN
            {
            dbg.location(95,9);
            match(input,13,FOLLOW_13_in_oscarcd235); 
            dbg.location(95,21);
            TOKEN5=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcd238); 
            dbg.location(96,1);

            	 addElement("OSCAR-CD",(TOKEN5!=null?TOKEN5.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(98, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:99:1: oscarcj : 'OSCAR-CJ' TOKEN ;
    public final void oscarcj() throws RecognitionException {
        Token TOKEN6=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:99:8: ( 'OSCAR-CJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:99:9: 'OSCAR-CJ' TOKEN
            {
            dbg.location(99,9);
            match(input,14,FOLLOW_14_in_oscarcj245); 
            dbg.location(99,21);
            TOKEN6=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcj248); 
            dbg.location(100,1);

            	 addElement("OSCAR-CJ",(TOKEN6!=null?TOKEN6.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(102, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:103:1: tmunicode : 'TM-UNICODE' TOKEN ;
    public final void tmunicode() throws RecognitionException {
        Token TOKEN7=null;

        try { dbg.enterRule(getGrammarFileName(), "tmunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:103:10: ( 'TM-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:103:11: 'TM-UNICODE' TOKEN
            {
            dbg.location(103,11);
            match(input,15,FOLLOW_15_in_tmunicode255); 
            dbg.location(103,25);
            TOKEN7=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_tmunicode258); 
            dbg.location(104,1);

            	 addElement("TM-UNICODE",(TOKEN7!=null?TOKEN7.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(106, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:107:1: cdunicode : 'CD-UNICODE' TOKEN ;
    public final void cdunicode() throws RecognitionException {
        Token TOKEN8=null;

        try { dbg.enterRule(getGrammarFileName(), "cdunicode");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:107:10: ( 'CD-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:107:11: 'CD-UNICODE' TOKEN
            {
            dbg.location(107,11);
            match(input,16,FOLLOW_16_in_cdunicode265); 
            dbg.location(107,25);
            TOKEN8=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cdunicode268); 
            dbg.location(108,1);

            	 addElement("CD-UNICODE",(TOKEN8!=null?TOKEN8.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(110, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:113:1: inas : 'IN-AS' TOKEN ;
    public final void inas() throws RecognitionException {
        Token TOKEN9=null;

        try { dbg.enterRule(getGrammarFileName(), "inas");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:113:5: ( 'IN-AS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:113:6: 'IN-AS' TOKEN
            {
            dbg.location(113,6);
            match(input,17,FOLLOW_17_in_inas277); 
            dbg.location(113,15);
            TOKEN9=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inas280); 
            dbg.location(114,1);

            	 addElement("IN-AS",(TOKEN9!=null?TOKEN9.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(116, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:117:1: inbefore : 'IN-BEFORE' TOKEN ;
    public final void inbefore() throws RecognitionException {
        Token TOKEN10=null;

        try { dbg.enterRule(getGrammarFileName(), "inbefore");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:117:9: ( 'IN-BEFORE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:117:10: 'IN-BEFORE' TOKEN
            {
            dbg.location(117,10);
            match(input,18,FOLLOW_18_in_inbefore287); 
            dbg.location(117,23);
            TOKEN10=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inbefore290); 
            dbg.location(118,1);

            	 addElement("IN-BEFORE",(TOKEN10!=null?TOKEN10.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(120, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:121:1: inafter : 'IN-AFTER' TOKEN ;
    public final void inafter() throws RecognitionException {
        Token TOKEN11=null;

        try { dbg.enterRule(getGrammarFileName(), "inafter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:121:8: ( 'IN-AFTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:121:9: 'IN-AFTER' TOKEN
            {
            dbg.location(121,9);
            match(input,19,FOLLOW_19_in_inafter297); 
            dbg.location(121,21);
            TOKEN11=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inafter300); 
            dbg.location(122,1);

            	 addElement("IN-AFTER",(TOKEN11!=null?TOKEN11.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "inafter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inafter"


    // $ANTLR start "inin"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:125:1: inin : 'IN-IN' TOKEN ;
    public final void inin() throws RecognitionException {
        Token TOKEN12=null;

        try { dbg.enterRule(getGrammarFileName(), "inin");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:125:5: ( 'IN-IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:125:6: 'IN-IN' TOKEN
            {
            dbg.location(125,6);
            match(input,20,FOLLOW_20_in_inin307); 
            dbg.location(125,15);
            TOKEN12=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inin310); 
            dbg.location(126,1);

            	 addElement("IN-IN",(TOKEN12!=null?TOKEN12.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "inin");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inin"


    // $ANTLR start "ininto"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:129:1: ininto : 'IN-INTO' TOKEN ;
    public final void ininto() throws RecognitionException {
        Token TOKEN13=null;

        try { dbg.enterRule(getGrammarFileName(), "ininto");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:129:7: ( 'IN-INTO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:129:8: 'IN-INTO' TOKEN
            {
            dbg.location(129,8);
            match(input,21,FOLLOW_21_in_ininto317); 
            dbg.location(129,19);
            TOKEN13=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_ininto320); 
            dbg.location(130,1);

            	 addElement("IN-INTO",(TOKEN13!=null?TOKEN13.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "ininto");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ininto"


    // $ANTLR start "inwith"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:133:1: inwith : 'IN-WITH' TOKEN ;
    public final void inwith() throws RecognitionException {
        Token TOKEN14=null;

        try { dbg.enterRule(getGrammarFileName(), "inwith");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:133:7: ( 'IN-WITH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:133:8: 'IN-WITH' TOKEN
            {
            dbg.location(133,8);
            match(input,22,FOLLOW_22_in_inwith327); 
            dbg.location(133,19);
            TOKEN14=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwith330); 
            dbg.location(134,1);

            	 addElement("IN-WITH",(TOKEN14!=null?TOKEN14.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "inwith");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inwith"


    // $ANTLR start "inwithout"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:137:1: inwithout : 'IN-WITHOUT' TOKEN ;
    public final void inwithout() throws RecognitionException {
        Token TOKEN15=null;

        try { dbg.enterRule(getGrammarFileName(), "inwithout");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:137:10: ( 'IN-WITHOUT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:137:11: 'IN-WITHOUT' TOKEN
            {
            dbg.location(137,11);
            match(input,23,FOLLOW_23_in_inwithout337); 
            dbg.location(137,25);
            TOKEN15=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inwithout340); 
            dbg.location(138,1);

            	 addElement("IN-WITHOUT",(TOKEN15!=null?TOKEN15.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(140, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:141:1: inby : 'IN-BY' TOKEN ;
    public final void inby() throws RecognitionException {
        Token TOKEN16=null;

        try { dbg.enterRule(getGrammarFileName(), "inby");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:141:5: ( 'IN-BY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:141:6: 'IN-BY' TOKEN
            {
            dbg.location(141,6);
            match(input,24,FOLLOW_24_in_inby347); 
            dbg.location(141,15);
            TOKEN16=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inby350); 
            dbg.location(142,1);

            	 addElement("IN-BY",(TOKEN16!=null?TOKEN16.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(144, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:145:1: invia : 'IN-VIA' TOKEN ;
    public final void invia() throws RecognitionException {
        Token TOKEN17=null;

        try { dbg.enterRule(getGrammarFileName(), "invia");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:145:6: ( 'IN-VIA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:145:7: 'IN-VIA' TOKEN
            {
            dbg.location(145,7);
            match(input,25,FOLLOW_25_in_invia357); 
            dbg.location(145,17);
            TOKEN17=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_invia360); 
            dbg.location(146,1);

            	 addElement("IN-VIA",(TOKEN17!=null?TOKEN17.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(148, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:149:1: inof : 'IN-OF' TOKEN ;
    public final void inof() throws RecognitionException {
        Token TOKEN18=null;

        try { dbg.enterRule(getGrammarFileName(), "inof");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:149:5: ( 'IN-OF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:149:6: 'IN-OF' TOKEN
            {
            dbg.location(149,6);
            match(input,26,FOLLOW_26_in_inof367); 
            dbg.location(149,15);
            TOKEN18=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inof370); 
            dbg.location(150,1);

            	 addElement("IN-OF",(TOKEN18!=null?TOKEN18.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(152, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:153:1: inon : 'IN-ON' TOKEN ;
    public final void inon() throws RecognitionException {
        Token TOKEN19=null;

        try { dbg.enterRule(getGrammarFileName(), "inon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:153:5: ( 'IN-ON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:153:6: 'IN-ON' TOKEN
            {
            dbg.location(153,6);
            match(input,27,FOLLOW_27_in_inon377); 
            dbg.location(153,15);
            TOKEN19=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inon380); 
            dbg.location(154,1);

            	 addElement("IN-ON",(TOKEN19!=null?TOKEN19.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(156, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:157:1: infor : 'IN-FOR' TOKEN ;
    public final void infor() throws RecognitionException {
        Token TOKEN20=null;

        try { dbg.enterRule(getGrammarFileName(), "infor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:157:6: ( 'IN-FOR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:157:7: 'IN-FOR' TOKEN
            {
            dbg.location(157,7);
            match(input,28,FOLLOW_28_in_infor387); 
            dbg.location(157,17);
            TOKEN20=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infor390); 
            dbg.location(158,1);

            	 addElement("IN-FOR",(TOKEN20!=null?TOKEN20.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(160, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:161:1: infrom : 'IN-FROM' TOKEN ;
    public final void infrom() throws RecognitionException {
        Token TOKEN21=null;

        try { dbg.enterRule(getGrammarFileName(), "infrom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:161:7: ( 'IN-FROM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:161:8: 'IN-FROM' TOKEN
            {
            dbg.location(161,8);
            match(input,29,FOLLOW_29_in_infrom397); 
            dbg.location(161,19);
            TOKEN21=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_infrom400); 
            dbg.location(162,1);

            	 addElement("IN-FROM",(TOKEN21!=null?TOKEN21.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(164, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:165:1: inunder : 'IN-UNDER' TOKEN ;
    public final void inunder() throws RecognitionException {
        Token TOKEN22=null;

        try { dbg.enterRule(getGrammarFileName(), "inunder");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(165, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:165:8: ( 'IN-UNDER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:165:9: 'IN-UNDER' TOKEN
            {
            dbg.location(165,9);
            match(input,30,FOLLOW_30_in_inunder407); 
            dbg.location(165,21);
            TOKEN22=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inunder410); 
            dbg.location(166,1);

            	 addElement("IN-UNDER",(TOKEN22!=null?TOKEN22.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(168, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:169:1: inover : 'IN-OVER' TOKEN ;
    public final void inover() throws RecognitionException {
        Token TOKEN23=null;

        try { dbg.enterRule(getGrammarFileName(), "inover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:169:7: ( 'IN-OVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:169:8: 'IN-OVER' TOKEN
            {
            dbg.location(169,8);
            match(input,31,FOLLOW_31_in_inover417); 
            dbg.location(169,19);
            TOKEN23=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inover420); 
            dbg.location(170,1);

            	 addElement("IN-OVER",(TOKEN23!=null?TOKEN23.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(172, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:173:1: inoff : 'IN-OFF' TOKEN ;
    public final void inoff() throws RecognitionException {
        Token TOKEN24=null;

        try { dbg.enterRule(getGrammarFileName(), "inoff");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:173:6: ( 'IN-OFF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:173:7: 'IN-OFF' TOKEN
            {
            dbg.location(173,7);
            match(input,32,FOLLOW_32_in_inoff427); 
            dbg.location(173,17);
            TOKEN24=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_inoff430); 
            dbg.location(174,1);

            	 addElement("IN-OFF",(TOKEN24!=null?TOKEN24.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(176, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:177:1: to : 'TO' TOKEN ;
    public final void to() throws RecognitionException {
        Token TOKEN25=null;

        try { dbg.enterRule(getGrammarFileName(), "to");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:177:3: ( 'TO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:177:4: 'TO' TOKEN
            {
            dbg.location(177,4);
            match(input,33,FOLLOW_33_in_to437); 
            dbg.location(177,10);
            TOKEN25=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_to440); 
            dbg.location(178,1);

            	 addElement("TO",(TOKEN25!=null?TOKEN25.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(180, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:182:1: nnstate : 'NN-STATE' TOKEN ;
    public final void nnstate() throws RecognitionException {
        Token TOKEN26=null;

        try { dbg.enterRule(getGrammarFileName(), "nnstate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:182:8: ( 'NN-STATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:182:9: 'NN-STATE' TOKEN
            {
            dbg.location(182,9);
            match(input,34,FOLLOW_34_in_nnstate448); 
            dbg.location(182,21);
            TOKEN26=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnstate451); 
            dbg.location(183,1);

            	 addElement("NN-STATE",(TOKEN26!=null?TOKEN26.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(185, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:187:1: nntime : 'NN-TIME' TOKEN ;
    public final void nntime() throws RecognitionException {
        Token TOKEN27=null;

        try { dbg.enterRule(getGrammarFileName(), "nntime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:187:7: ( 'NN-TIME' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:187:8: 'NN-TIME' TOKEN
            {
            dbg.location(187,8);
            match(input,35,FOLLOW_35_in_nntime459); 
            dbg.location(187,19);
            TOKEN27=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntime462); 
            dbg.location(188,1);

            	 addElement("NN-TIME",(TOKEN27!=null?TOKEN27.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "nntime");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nntime"


    // $ANTLR start "cd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:191:1: cd : 'CD' TOKEN ;
    public final void cd() throws RecognitionException {
        Token TOKEN28=null;

        try { dbg.enterRule(getGrammarFileName(), "cd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:191:3: ( 'CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:191:4: 'CD' TOKEN
            {
            dbg.location(191,4);
            match(input,36,FOLLOW_36_in_cd469); 
            dbg.location(191,10);
            TOKEN28=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cd472); 
            dbg.location(192,1);

            	 addElement("CD",(TOKEN28!=null?TOKEN28.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "cd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cd"


    // $ANTLR start "nngram"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:195:1: nngram : 'NN-GRAM' TOKEN ;
    public final void nngram() throws RecognitionException {
        Token TOKEN29=null;

        try { dbg.enterRule(getGrammarFileName(), "nngram");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(195, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:195:7: ( 'NN-GRAM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:195:8: 'NN-GRAM' TOKEN
            {
            dbg.location(195,8);
            match(input,37,FOLLOW_37_in_nngram479); 
            dbg.location(195,19);
            TOKEN29=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngram482); 
            dbg.location(196,1);

            	 addElement("NN-GRAM",(TOKEN29!=null?TOKEN29.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "nngram");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nngram"


    // $ANTLR start "nnmol"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:199:1: nnmol : 'NN-MOL' TOKEN ;
    public final void nnmol() throws RecognitionException {
        Token TOKEN30=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:199:6: ( 'NN-MOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:199:7: 'NN-MOL' TOKEN
            {
            dbg.location(199,7);
            match(input,38,FOLLOW_38_in_nnmol489); 
            dbg.location(199,17);
            TOKEN30=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmol492); 
            dbg.location(200,1);

            	 addElement("NN-MOL",(TOKEN30!=null?TOKEN30.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "nnmol");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnmol"


    // $ANTLR start "nnatmosphere"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:203:1: nnatmosphere : 'NN-ATMOSPHERE' TOKEN ;
    public final void nnatmosphere() throws RecognitionException {
        Token TOKEN31=null;

        try { dbg.enterRule(getGrammarFileName(), "nnatmosphere");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(203, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:203:13: ( 'NN-ATMOSPHERE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:203:14: 'NN-ATMOSPHERE' TOKEN
            {
            dbg.location(203,14);
            match(input,39,FOLLOW_39_in_nnatmosphere499); 
            dbg.location(203,31);
            TOKEN31=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnatmosphere502); 
            dbg.location(204,1);

            	 addElement("NN-ATMOSPHERE",(TOKEN31!=null?TOKEN31.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "nnatmosphere");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnatmosphere"


    // $ANTLR start "nneq"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:207:1: nneq : 'NN-EQ' TOKEN ;
    public final void nneq() throws RecognitionException {
        Token TOKEN32=null;

        try { dbg.enterRule(getGrammarFileName(), "nneq");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(207, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:207:5: ( 'NN-EQ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:207:6: 'NN-EQ' TOKEN
            {
            dbg.location(207,6);
            match(input,40,FOLLOW_40_in_nneq509); 
            dbg.location(207,15);
            TOKEN32=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nneq512); 
            dbg.location(208,1);

            	 addElement("NN-EQ",(TOKEN32!=null?TOKEN32.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(210, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:211:1: nnvol : 'NN-VOL' TOKEN ;
    public final void nnvol() throws RecognitionException {
        Token TOKEN33=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:211:6: ( 'NN-VOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:211:7: 'NN-VOL' TOKEN
            {
            dbg.location(211,7);
            match(input,41,FOLLOW_41_in_nnvol519); 
            dbg.location(211,17);
            TOKEN33=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvol522); 
            dbg.location(212,1);

            	 addElement("NN-VOL",(TOKEN33!=null?TOKEN33.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(214, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:216:1: nntemp : 'NN-TEMP' TOKEN ;
    public final void nntemp() throws RecognitionException {
        Token TOKEN34=null;

        try { dbg.enterRule(getGrammarFileName(), "nntemp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(216, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:216:7: ( 'NN-TEMP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:216:8: 'NN-TEMP' TOKEN
            {
            dbg.location(216,8);
            match(input,42,FOLLOW_42_in_nntemp530); 
            dbg.location(216,19);
            TOKEN34=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntemp533); 
            dbg.location(217,1);

            	 addElement("NN-TEMP",(TOKEN34!=null?TOKEN34.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(219, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:220:1: nnflash : 'NN-FLASH' TOKEN ;
    public final void nnflash() throws RecognitionException {
        Token TOKEN35=null;

        try { dbg.enterRule(getGrammarFileName(), "nnflash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(220, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:220:8: ( 'NN-FLASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:220:9: 'NN-FLASH' TOKEN
            {
            dbg.location(220,9);
            match(input,43,FOLLOW_43_in_nnflash540); 
            dbg.location(220,21);
            TOKEN35=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnflash543); 
            dbg.location(221,1);

            	 addElement("NN-FLASH",(TOKEN35!=null?TOKEN35.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(223, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:224:1: nngeneral : 'NN-GENERAL' TOKEN ;
    public final void nngeneral() throws RecognitionException {
        Token TOKEN36=null;

        try { dbg.enterRule(getGrammarFileName(), "nngeneral");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(224, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:224:10: ( 'NN-GENERAL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:224:11: 'NN-GENERAL' TOKEN
            {
            dbg.location(224,11);
            match(input,44,FOLLOW_44_in_nngeneral550); 
            dbg.location(224,25);
            TOKEN36=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nngeneral553); 
            dbg.location(225,1);

            	 addElement("NN-GENERAL",(TOKEN36!=null?TOKEN36.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(227, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:228:1: nnmethod : 'NN-METHOD' TOKEN ;
    public final void nnmethod() throws RecognitionException {
        Token TOKEN37=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmethod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:228:9: ( 'NN-METHOD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:228:10: 'NN-METHOD' TOKEN
            {
            dbg.location(228,10);
            match(input,45,FOLLOW_45_in_nnmethod560); 
            dbg.location(228,23);
            TOKEN37=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmethod563); 
            dbg.location(229,1);

            	 addElement("NN-METHOD",(TOKEN37!=null?TOKEN37.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(231, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:232:1: nnamount : 'NN-AMOUNT' TOKEN ;
    public final void nnamount() throws RecognitionException {
        Token TOKEN38=null;

        try { dbg.enterRule(getGrammarFileName(), "nnamount");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:232:9: ( 'NN-AMOUNT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:232:10: 'NN-AMOUNT' TOKEN
            {
            dbg.location(232,10);
            match(input,46,FOLLOW_46_in_nnamount570); 
            dbg.location(232,23);
            TOKEN38=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnamount573); 
            dbg.location(233,1);

            	 addElement("NN-AMOUNT",(TOKEN38!=null?TOKEN38.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(235, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:236:1: nnpressure : 'NN-PRESSURE' TOKEN ;
    public final void nnpressure() throws RecognitionException {
        Token TOKEN39=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpressure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(236, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:236:11: ( 'NN-PRESSURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:236:12: 'NN-PRESSURE' TOKEN
            {
            dbg.location(236,12);
            match(input,47,FOLLOW_47_in_nnpressure580); 
            dbg.location(236,27);
            TOKEN39=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpressure583); 
            dbg.location(237,1);

            	 addElement("NN-PRESSURE",(TOKEN39!=null?TOKEN39.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(239, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:240:1: nncolumn : 'NN-COLUMN' TOKEN ;
    public final void nncolumn() throws RecognitionException {
        Token TOKEN40=null;

        try { dbg.enterRule(getGrammarFileName(), "nncolumn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:240:9: ( 'NN-COLUMN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:240:10: 'NN-COLUMN' TOKEN
            {
            dbg.location(240,10);
            match(input,48,FOLLOW_48_in_nncolumn590); 
            dbg.location(240,23);
            TOKEN40=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncolumn593); 
            dbg.location(241,1);

            	 addElement("NN-COLUMN",(TOKEN40!=null?TOKEN40.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(243, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:244:1: nnchromatography : 'NN-CHROMATOGRAPHY' TOKEN ;
    public final void nnchromatography() throws RecognitionException {
        Token TOKEN41=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchromatography");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(244, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:244:17: ( 'NN-CHROMATOGRAPHY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:244:18: 'NN-CHROMATOGRAPHY' TOKEN
            {
            dbg.location(244,18);
            match(input,49,FOLLOW_49_in_nnchromatography600); 
            dbg.location(244,39);
            TOKEN41=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchromatography603); 
            dbg.location(245,1);

            	 addElement("NN-CHROMATOGRAPHY",(TOKEN41!=null?TOKEN41.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(247, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:248:1: nnvacuum : 'NN-VACUUM' TOKEN ;
    public final void nnvacuum() throws RecognitionException {
        Token TOKEN42=null;

        try { dbg.enterRule(getGrammarFileName(), "nnvacuum");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(248, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:248:9: ( 'NN-VACUUM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:248:10: 'NN-VACUUM' TOKEN
            {
            dbg.location(248,10);
            match(input,50,FOLLOW_50_in_nnvacuum610); 
            dbg.location(248,23);
            TOKEN42=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnvacuum613); 
            dbg.location(249,1);

            	 addElement("NN-VACUUM",(TOKEN42!=null?TOKEN42.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(251, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:252:1: nncycle : 'NN-CYCLE' TOKEN ;
    public final void nncycle() throws RecognitionException {
        Token TOKEN43=null;

        try { dbg.enterRule(getGrammarFileName(), "nncycle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(252, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:252:8: ( 'NN-CYCLE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:252:9: 'NN-CYCLE' TOKEN
            {
            dbg.location(252,9);
            match(input,51,FOLLOW_51_in_nncycle620); 
            dbg.location(252,21);
            TOKEN43=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nncycle623); 
            dbg.location(253,1);

            	 addElement("NN-CYCLE",(TOKEN43!=null?TOKEN43.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(255, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:256:1: nntimes : 'NN-TIMES' TOKEN ;
    public final void nntimes() throws RecognitionException {
        Token TOKEN44=null;

        try { dbg.enterRule(getGrammarFileName(), "nntimes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(256, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:256:8: ( 'NN-TIMES' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:256:9: 'NN-TIMES' TOKEN
            {
            dbg.location(256,9);
            match(input,52,FOLLOW_52_in_nntimes630); 
            dbg.location(256,21);
            TOKEN44=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nntimes633); 
            dbg.location(257,1);

            	 addElement("NN-TIMES",(TOKEN44!=null?TOKEN44.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(259, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:261:1: nnchementity : 'NN-CHEMENTITY' TOKEN ;
    public final void nnchementity() throws RecognitionException {
        Token TOKEN45=null;

        try { dbg.enterRule(getGrammarFileName(), "nnchementity");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:261:13: ( 'NN-CHEMENTITY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:261:14: 'NN-CHEMENTITY' TOKEN
            {
            dbg.location(261,14);
            match(input,53,FOLLOW_53_in_nnchementity641); 
            dbg.location(261,31);
            TOKEN45=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnchementity644); 
            dbg.location(262,1);

            	 addElement("NN-CHEMENTITY",(TOKEN45!=null?TOKEN45.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(264, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:265:1: oscarcm : 'OSCAR-CM' TOKEN ;
    public final void oscarcm() throws RecognitionException {
        Token TOKEN46=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(265, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:265:8: ( 'OSCAR-CM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:265:9: 'OSCAR-CM' TOKEN
            {
            dbg.location(265,9);
            match(input,54,FOLLOW_54_in_oscarcm651); 
            dbg.location(265,21);
            TOKEN46=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcm654); 
            dbg.location(266,1);

            	 addElement("OSCAR-CM",(TOKEN46!=null?TOKEN46.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(268, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:270:1: vbuse : 'VB-USE' TOKEN ;
    public final void vbuse() throws RecognitionException {
        Token TOKEN47=null;

        try { dbg.enterRule(getGrammarFileName(), "vbuse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(270, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:270:6: ( 'VB-USE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:270:7: 'VB-USE' TOKEN
            {
            dbg.location(270,7);
            match(input,55,FOLLOW_55_in_vbuse662); 
            dbg.location(270,17);
            TOKEN47=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbuse665); 
            dbg.location(271,1);

            	 addElement("VB-USE",(TOKEN47!=null?TOKEN47.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "vbuse");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbuse"


    // $ANTLR start "vbchange"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:274:1: vbchange : 'VB-CHANGE' TOKEN ;
    public final void vbchange() throws RecognitionException {
        Token TOKEN48=null;

        try { dbg.enterRule(getGrammarFileName(), "vbchange");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(274, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:274:9: ( 'VB-CHANGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:274:10: 'VB-CHANGE' TOKEN
            {
            dbg.location(274,10);
            match(input,56,FOLLOW_56_in_vbchange672); 
            dbg.location(274,23);
            TOKEN48=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbchange675); 
            dbg.location(275,1);

            	 addElement("VB-CHANGE",(TOKEN48!=null?TOKEN48.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "vbchange");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbchange"


    // $ANTLR start "vbsubmerge"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:278:1: vbsubmerge : 'VB-SUBMERGE' TOKEN ;
    public final void vbsubmerge() throws RecognitionException {
        Token TOKEN49=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubmerge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(278, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:278:11: ( 'VB-SUBMERGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:278:12: 'VB-SUBMERGE' TOKEN
            {
            dbg.location(278,12);
            match(input,57,FOLLOW_57_in_vbsubmerge682); 
            dbg.location(278,27);
            TOKEN49=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubmerge685); 
            dbg.location(279,1);

            	 addElement("VB-SUBMERGE",(TOKEN49!=null?TOKEN49.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "vbsubmerge");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbsubmerge"


    // $ANTLR start "vbsubject"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:282:1: vbsubject : 'VB-SUBJECT' TOKEN ;
    public final void vbsubject() throws RecognitionException {
        Token TOKEN50=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubject");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(282, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:282:10: ( 'VB-SUBJECT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:282:11: 'VB-SUBJECT' TOKEN
            {
            dbg.location(282,11);
            match(input,58,FOLLOW_58_in_vbsubject692); 
            dbg.location(282,25);
            TOKEN50=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubject695); 
            dbg.location(283,1);

            	 addElement("VB-SUBJECT",(TOKEN50!=null?TOKEN50.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "vbsubject");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbsubject"


    // $ANTLR start "jj"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:287:1: jj : 'JJ' TOKEN ;
    public final void jj() throws RecognitionException {
        Token TOKEN51=null;

        try { dbg.enterRule(getGrammarFileName(), "jj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(287, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:287:3: ( 'JJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:287:4: 'JJ' TOKEN
            {
            dbg.location(287,4);
            match(input,59,FOLLOW_59_in_jj703); 
            dbg.location(287,10);
            TOKEN51=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jj706); 
            dbg.location(288,1);

            	 addElement("JJ",(TOKEN51!=null?TOKEN51.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "jj");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "jj"


    // $ANTLR start "nnadd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:292:1: nnadd : 'NN-ADD' TOKEN ;
    public final void nnadd() throws RecognitionException {
        Token TOKEN52=null;

        try { dbg.enterRule(getGrammarFileName(), "nnadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:292:6: ( 'NN-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:292:7: 'NN-ADD' TOKEN
            {
            dbg.location(292,7);
            match(input,60,FOLLOW_60_in_nnadd714); 
            dbg.location(292,17);
            TOKEN52=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnadd717); 
            dbg.location(293,1);

            	 addElement("NN-ADD",(TOKEN52!=null?TOKEN52.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(295, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:296:1: nnmixture : 'NN-MIXTURE' TOKEN ;
    public final void nnmixture() throws RecognitionException {
        Token TOKEN53=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(296, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:296:10: ( 'NN-MIXTURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:296:11: 'NN-MIXTURE' TOKEN
            {
            dbg.location(296,11);
            match(input,61,FOLLOW_61_in_nnmixture724); 
            dbg.location(296,25);
            TOKEN53=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmixture727); 
            dbg.location(297,1);

            	 addElement("NN-MIXTURE",(TOKEN53!=null?TOKEN53.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "nnmixture");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnmixture"


    // $ANTLR start "vbadd"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:300:1: vbadd : 'VB-ADD' TOKEN ;
    public final void vbadd() throws RecognitionException {
        Token TOKEN54=null;

        try { dbg.enterRule(getGrammarFileName(), "vbadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(300, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:300:6: ( 'VB-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:300:7: 'VB-ADD' TOKEN
            {
            dbg.location(300,7);
            match(input,62,FOLLOW_62_in_vbadd734); 
            dbg.location(300,17);
            TOKEN54=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbadd737); 
            dbg.location(301,1);

            	 addElement("VB-ADD",(TOKEN54!=null?TOKEN54.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "vbadd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbadd"


    // $ANTLR start "vbcharge"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:304:1: vbcharge : 'VB-CHARGE' TOKEN ;
    public final void vbcharge() throws RecognitionException {
        Token TOKEN55=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcharge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:304:9: ( 'VB-CHARGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:304:10: 'VB-CHARGE' TOKEN
            {
            dbg.location(304,10);
            match(input,63,FOLLOW_63_in_vbcharge744); 
            dbg.location(304,23);
            TOKEN55=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcharge747); 
            dbg.location(305,1);

            	 addElement("VB-CHARGE",(TOKEN55!=null?TOKEN55.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "vbcharge");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbcharge"


    // $ANTLR start "vbcontain"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:308:1: vbcontain : 'VB-CONTAIN' TOKEN ;
    public final void vbcontain() throws RecognitionException {
        Token TOKEN56=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcontain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(308, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:308:10: ( 'VB-CONTAIN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:308:11: 'VB-CONTAIN' TOKEN
            {
            dbg.location(308,11);
            match(input,64,FOLLOW_64_in_vbcontain754); 
            dbg.location(308,25);
            TOKEN56=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcontain757); 
            dbg.location(309,1);

            	 addElement("VB-CONTAIN",(TOKEN56!=null?TOKEN56.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "vbcontain");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbcontain"


    // $ANTLR start "vbdrop"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:312:1: vbdrop : 'VB-DROP' TOKEN ;
    public final void vbdrop() throws RecognitionException {
        Token TOKEN57=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdrop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(312, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:312:7: ( 'VB-DROP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:312:8: 'VB-DROP' TOKEN
            {
            dbg.location(312,8);
            match(input,65,FOLLOW_65_in_vbdrop764); 
            dbg.location(312,19);
            TOKEN57=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdrop767); 
            dbg.location(313,1);

            	 addElement("VB-DROP",(TOKEN57!=null?TOKEN57.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(315, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:316:1: vbfill : 'VB-FILL' TOKEN ;
    public final void vbfill() throws RecognitionException {
        Token TOKEN58=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfill");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:316:7: ( 'VB-FILL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:316:8: 'VB-FILL' TOKEN
            {
            dbg.location(316,8);
            match(input,66,FOLLOW_66_in_vbfill774); 
            dbg.location(316,19);
            TOKEN58=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfill777); 
            dbg.location(317,1);

            	 addElement("VB-FILL",(TOKEN58!=null?TOKEN58.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(319, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:320:1: vbsuspend : 'VB-SUSPEND' TOKEN ;
    public final void vbsuspend() throws RecognitionException {
        Token TOKEN59=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsuspend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:320:10: ( 'VB-SUSPEND' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:320:11: 'VB-SUSPEND' TOKEN
            {
            dbg.location(320,11);
            match(input,67,FOLLOW_67_in_vbsuspend784); 
            dbg.location(320,25);
            TOKEN59=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsuspend787); 
            dbg.location(321,1);

            	 addElement("VB-SUSPEND",(TOKEN59!=null?TOKEN59.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(323, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:324:1: vbtreat : 'VB-TREAT' TOKEN ;
    public final void vbtreat() throws RecognitionException {
        Token TOKEN60=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtreat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:324:8: ( 'VB-TREAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:324:9: 'VB-TREAT' TOKEN
            {
            dbg.location(324,9);
            match(input,68,FOLLOW_68_in_vbtreat794); 
            dbg.location(324,21);
            TOKEN60=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtreat797); 
            dbg.location(325,1);

            	 addElement("VB-TREAT",(TOKEN60!=null?TOKEN60.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(327, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:329:1: vbapparatus : 'VB-APPARATUS' TOKEN ;
    public final void vbapparatus() throws RecognitionException {
        Token TOKEN61=null;

        try { dbg.enterRule(getGrammarFileName(), "vbapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(329, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:329:12: ( 'VB-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:329:13: 'VB-APPARATUS' TOKEN
            {
            dbg.location(329,13);
            match(input,69,FOLLOW_69_in_vbapparatus805); 
            dbg.location(329,29);
            TOKEN61=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbapparatus808); 
            dbg.location(330,1);

            	 addElement("VB-APPARATUS",(TOKEN61!=null?TOKEN61.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(332, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:333:1: nnapparatus : 'NN-APPARATUS' TOKEN ;
    public final void nnapparatus() throws RecognitionException {
        Token TOKEN62=null;

        try { dbg.enterRule(getGrammarFileName(), "nnapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(333, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:333:12: ( 'NN-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:333:13: 'NN-APPARATUS' TOKEN
            {
            dbg.location(333,13);
            match(input,70,FOLLOW_70_in_nnapparatus815); 
            dbg.location(333,29);
            TOKEN62=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnapparatus818); 
            dbg.location(334,1);

            	 addElement("NN-APPARATUS",(TOKEN62!=null?TOKEN62.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(336, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:338:1: vbconcentrate : 'VB-CONCENTRATE' TOKEN ;
    public final void vbconcentrate() throws RecognitionException {
        Token TOKEN63=null;

        try { dbg.enterRule(getGrammarFileName(), "vbconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(338, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:338:14: ( 'VB-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:338:15: 'VB-CONCENTRATE' TOKEN
            {
            dbg.location(338,15);
            match(input,71,FOLLOW_71_in_vbconcentrate826); 
            dbg.location(338,33);
            TOKEN63=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbconcentrate829); 
            dbg.location(339,1);

            	 addElement("VB-CONCENTRATE",(TOKEN63!=null?TOKEN63.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "vbconcentrate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vbconcentrate"


    // $ANTLR start "nnconcentrate"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:342:1: nnconcentrate : 'NN-CONCENTRATE' TOKEN ;
    public final void nnconcentrate() throws RecognitionException {
        Token TOKEN64=null;

        try { dbg.enterRule(getGrammarFileName(), "nnconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(342, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:342:14: ( 'NN-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:342:15: 'NN-CONCENTRATE' TOKEN
            {
            dbg.location(342,15);
            match(input,72,FOLLOW_72_in_nnconcentrate836); 
            dbg.location(342,33);
            TOKEN64=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnconcentrate839); 
            dbg.location(343,1);

            	 addElement("NN-CONCENTRATE",(TOKEN64!=null?TOKEN64.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "nnconcentrate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nnconcentrate"


    // $ANTLR start "vbcool"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:347:1: vbcool : 'VB-COOL' TOKEN ;
    public final void vbcool() throws RecognitionException {
        Token TOKEN65=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(347, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:347:7: ( 'VB-COOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:347:8: 'VB-COOL' TOKEN
            {
            dbg.location(347,8);
            match(input,73,FOLLOW_73_in_vbcool847); 
            dbg.location(347,19);
            TOKEN65=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcool850); 
            dbg.location(348,1);

            	 addElement("VB-COOL",(TOKEN65!=null?TOKEN65.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(350, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:352:1: vbdegass : 'VB-DEGASS' TOKEN ;
    public final void vbdegass() throws RecognitionException {
        Token TOKEN66=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdegass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(352, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:352:9: ( 'VB-DEGASS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:352:10: 'VB-DEGASS' TOKEN
            {
            dbg.location(352,10);
            match(input,74,FOLLOW_74_in_vbdegass858); 
            dbg.location(352,23);
            TOKEN66=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdegass861); 
            dbg.location(353,1);

            	 addElement("VB-DEGASS",(TOKEN66!=null?TOKEN66.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(355, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:357:1: vbdissolve : 'VB-DISSOLVE' TOKEN ;
    public final void vbdissolve() throws RecognitionException {
        Token TOKEN67=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdissolve");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(357, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:357:11: ( 'VB-DISSOLVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:357:12: 'VB-DISSOLVE' TOKEN
            {
            dbg.location(357,12);
            match(input,75,FOLLOW_75_in_vbdissolve869); 
            dbg.location(357,27);
            TOKEN67=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdissolve872); 
            dbg.location(358,1);

            	 addElement("VB-DISSOLVE",(TOKEN67!=null?TOKEN67.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(360, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:362:1: vbdry : 'VB-DRY' TOKEN ;
    public final void vbdry() throws RecognitionException {
        Token TOKEN68=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(362, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:362:6: ( 'VB-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:362:7: 'VB-DRY' TOKEN
            {
            dbg.location(362,7);
            match(input,76,FOLLOW_76_in_vbdry880); 
            dbg.location(362,17);
            TOKEN68=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdry883); 
            dbg.location(363,1);

            	 addElement("VB-DRY",(TOKEN68!=null?TOKEN68.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(365, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:366:1: nndry : 'NN-DRY' TOKEN ;
    public final void nndry() throws RecognitionException {
        Token TOKEN69=null;

        try { dbg.enterRule(getGrammarFileName(), "nndry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(366, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:366:6: ( 'NN-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:366:7: 'NN-DRY' TOKEN
            {
            dbg.location(366,7);
            match(input,77,FOLLOW_77_in_nndry890); 
            dbg.location(366,17);
            TOKEN69=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nndry893); 
            dbg.location(367,1);

            	 addElement("NN-DRY",(TOKEN69!=null?TOKEN69.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(369, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:371:1: vbextract : 'VB-EXTRACT' TOKEN ;
    public final void vbextract() throws RecognitionException {
        Token TOKEN70=null;

        try { dbg.enterRule(getGrammarFileName(), "vbextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(371, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:371:10: ( 'VB-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:371:11: 'VB-EXTRACT' TOKEN
            {
            dbg.location(371,11);
            match(input,78,FOLLOW_78_in_vbextract901); 
            dbg.location(371,25);
            TOKEN70=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbextract904); 
            dbg.location(372,1);

            	 addElement("VB-EXTRACT",(TOKEN70!=null?TOKEN70.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(374, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:375:1: nnextract : 'NN-EXTRACT' TOKEN ;
    public final void nnextract() throws RecognitionException {
        Token TOKEN71=null;

        try { dbg.enterRule(getGrammarFileName(), "nnextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(375, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:375:10: ( 'NN-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:375:11: 'NN-EXTRACT' TOKEN
            {
            dbg.location(375,11);
            match(input,79,FOLLOW_79_in_nnextract911); 
            dbg.location(375,25);
            TOKEN71=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnextract914); 
            dbg.location(376,1);

            	 addElement("NN-EXTRACT",(TOKEN71!=null?TOKEN71.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(378, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:380:1: vbfilter : 'VB-FILTER' TOKEN ;
    public final void vbfilter() throws RecognitionException {
        Token TOKEN72=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(380, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:380:9: ( 'VB-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:380:10: 'VB-FILTER' TOKEN
            {
            dbg.location(380,10);
            match(input,80,FOLLOW_80_in_vbfilter922); 
            dbg.location(380,23);
            TOKEN72=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfilter925); 
            dbg.location(381,1);

            	 addElement("VB-FILTER",(TOKEN72!=null?TOKEN72.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(383, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:384:1: nnfilter : 'NN-FILTER' TOKEN ;
    public final void nnfilter() throws RecognitionException {
        Token TOKEN73=null;

        try { dbg.enterRule(getGrammarFileName(), "nnfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(384, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:384:9: ( 'NN-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:384:10: 'NN-FILTER' TOKEN
            {
            dbg.location(384,10);
            match(input,81,FOLLOW_81_in_nnfilter932); 
            dbg.location(384,23);
            TOKEN73=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnfilter935); 
            dbg.location(385,1);

            	 addElement("NN-FILTER",(TOKEN73!=null?TOKEN73.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(387, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:389:1: vbheat : 'VB-HEAT' TOKEN ;
    public final void vbheat() throws RecognitionException {
        Token TOKEN74=null;

        try { dbg.enterRule(getGrammarFileName(), "vbheat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(389, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:389:7: ( 'VB-HEAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:389:8: 'VB-HEAT' TOKEN
            {
            dbg.location(389,8);
            match(input,82,FOLLOW_82_in_vbheat943); 
            dbg.location(389,19);
            TOKEN74=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbheat946); 
            dbg.location(390,1);

            	 addElement("VB-HEAT",(TOKEN74!=null?TOKEN74.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(392, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:393:1: vbincrease : 'VB-INCREASE' TOKEN ;
    public final void vbincrease() throws RecognitionException {
        Token TOKEN75=null;

        try { dbg.enterRule(getGrammarFileName(), "vbincrease");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(393, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:393:11: ( 'VB-INCREASE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:393:12: 'VB-INCREASE' TOKEN
            {
            dbg.location(393,12);
            match(input,83,FOLLOW_83_in_vbincrease953); 
            dbg.location(393,27);
            TOKEN75=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbincrease956); 
            dbg.location(394,1);

            	 addElement("VB-INCREASE",(TOKEN75!=null?TOKEN75.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(396, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:398:1: vbpartition : 'VB-PARTITION' TOKEN ;
    public final void vbpartition() throws RecognitionException {
        Token TOKEN76=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpartition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(398, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:398:12: ( 'VB-PARTITION' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:398:13: 'VB-PARTITION' TOKEN
            {
            dbg.location(398,13);
            match(input,84,FOLLOW_84_in_vbpartition964); 
            dbg.location(398,29);
            TOKEN76=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpartition967); 
            dbg.location(399,1);

            	 addElement("VB-PARTITION",(TOKEN76!=null?TOKEN76.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(401, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:403:1: vbprecipitate : 'VB-PRECIPITATE' TOKEN ;
    public final void vbprecipitate() throws RecognitionException {
        Token TOKEN77=null;

        try { dbg.enterRule(getGrammarFileName(), "vbprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(403, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:403:14: ( 'VB-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:403:15: 'VB-PRECIPITATE' TOKEN
            {
            dbg.location(403,15);
            match(input,85,FOLLOW_85_in_vbprecipitate975); 
            dbg.location(403,33);
            TOKEN77=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbprecipitate978); 
            dbg.location(404,1);

            	 addElement("VB-PRECIPITATE",(TOKEN77!=null?TOKEN77.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(406, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:407:1: nnprecipitate : 'NN-PRECIPITATE' TOKEN ;
    public final void nnprecipitate() throws RecognitionException {
        Token TOKEN78=null;

        try { dbg.enterRule(getGrammarFileName(), "nnprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(407, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:407:14: ( 'NN-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:407:15: 'NN-PRECIPITATE' TOKEN
            {
            dbg.location(407,15);
            match(input,86,FOLLOW_86_in_nnprecipitate985); 
            dbg.location(407,33);
            TOKEN78=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnprecipitate988); 
            dbg.location(408,1);

            	 addElement("NN-PRECIPITATE",(TOKEN78!=null?TOKEN78.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(410, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:412:1: vbpurify : 'VB-PURIFY' TOKEN ;
    public final void vbpurify() throws RecognitionException {
        Token TOKEN79=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(412, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:412:9: ( 'VB-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:412:10: 'VB-PURIFY' TOKEN
            {
            dbg.location(412,10);
            match(input,87,FOLLOW_87_in_vbpurify996); 
            dbg.location(412,23);
            TOKEN79=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpurify999); 
            dbg.location(413,1);

            	 addElement("VB-PURIFY",(TOKEN79!=null?TOKEN79.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(415, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:416:1: nnpurify : 'NN-PURIFY' TOKEN ;
    public final void nnpurify() throws RecognitionException {
        Token TOKEN80=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(416, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:416:9: ( 'NN-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:416:10: 'NN-PURIFY' TOKEN
            {
            dbg.location(416,10);
            match(input,88,FOLLOW_88_in_nnpurify1006); 
            dbg.location(416,23);
            TOKEN80=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpurify1009); 
            dbg.location(417,1);

            	 addElement("NN-PURIFY",(TOKEN80!=null?TOKEN80.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(419, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:421:1: vbquench : 'VB-QUENCH' TOKEN ;
    public final void vbquench() throws RecognitionException {
        Token TOKEN81=null;

        try { dbg.enterRule(getGrammarFileName(), "vbquench");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(421, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:421:9: ( 'VB-QUENCH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:421:10: 'VB-QUENCH' TOKEN
            {
            dbg.location(421,10);
            match(input,89,FOLLOW_89_in_vbquench1017); 
            dbg.location(421,23);
            TOKEN81=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbquench1020); 
            dbg.location(422,1);

            	 addElement("VB-QUENCH",(TOKEN81!=null?TOKEN81.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(424, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:426:1: vbrecover : 'VB-RECOVER' TOKEN ;
    public final void vbrecover() throws RecognitionException {
        Token TOKEN82=null;

        try { dbg.enterRule(getGrammarFileName(), "vbrecover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(426, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:426:10: ( 'VB-RECOVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:426:11: 'VB-RECOVER' TOKEN
            {
            dbg.location(426,11);
            match(input,90,FOLLOW_90_in_vbrecover1028); 
            dbg.location(426,25);
            TOKEN82=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbrecover1031); 
            dbg.location(427,1);

            	 addElement("VB-RECOVER",(TOKEN82!=null?TOKEN82.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(429, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:431:1: vbremove : 'VB-REMOVE' TOKEN ;
    public final void vbremove() throws RecognitionException {
        Token TOKEN83=null;

        try { dbg.enterRule(getGrammarFileName(), "vbremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(431, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:431:9: ( 'VB-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:431:10: 'VB-REMOVE' TOKEN
            {
            dbg.location(431,10);
            match(input,91,FOLLOW_91_in_vbremove1039); 
            dbg.location(431,23);
            TOKEN83=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbremove1042); 
            dbg.location(432,1);

            	 addElement("VB-REMOVE",(TOKEN83!=null?TOKEN83.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(434, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:435:1: nnremove : 'NN-REMOVE' TOKEN ;
    public final void nnremove() throws RecognitionException {
        Token TOKEN84=null;

        try { dbg.enterRule(getGrammarFileName(), "nnremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(435, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:435:9: ( 'NN-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:435:10: 'NN-REMOVE' TOKEN
            {
            dbg.location(435,10);
            match(input,92,FOLLOW_92_in_nnremove1049); 
            dbg.location(435,23);
            TOKEN84=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnremove1052); 
            dbg.location(436,1);

            	 addElement("NN-REMOVE",(TOKEN84!=null?TOKEN84.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(438, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:440:1: vbstir : 'VB-STIR' TOKEN ;
    public final void vbstir() throws RecognitionException {
        Token TOKEN85=null;

        try { dbg.enterRule(getGrammarFileName(), "vbstir");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(440, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:440:7: ( 'VB-STIR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:440:8: 'VB-STIR' TOKEN
            {
            dbg.location(440,8);
            match(input,93,FOLLOW_93_in_vbstir1060); 
            dbg.location(440,19);
            TOKEN85=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbstir1063); 
            dbg.location(441,1);

            	 addElement("VB-STIR",(TOKEN85!=null?TOKEN85.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(443, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:445:1: vbsynthesize : 'VB-SYNTHESIZE' TOKEN ;
    public final void vbsynthesize() throws RecognitionException {
        Token TOKEN86=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(445, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:445:13: ( 'VB-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:445:14: 'VB-SYNTHESIZE' TOKEN
            {
            dbg.location(445,14);
            match(input,94,FOLLOW_94_in_vbsynthesize1071); 
            dbg.location(445,31);
            TOKEN86=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsynthesize1074); 
            dbg.location(446,1);

            	 addElement("VB-SYNTHESIZE",(TOKEN86!=null?TOKEN86.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(448, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:449:1: nnsynthesize : 'NN-SYNTHESIZE' TOKEN ;
    public final void nnsynthesize() throws RecognitionException {
        Token TOKEN87=null;

        try { dbg.enterRule(getGrammarFileName(), "nnsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(449, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:449:13: ( 'NN-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:449:14: 'NN-SYNTHESIZE' TOKEN
            {
            dbg.location(449,14);
            match(input,95,FOLLOW_95_in_nnsynthesize1081); 
            dbg.location(449,31);
            TOKEN87=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnsynthesize1084); 
            dbg.location(450,1);

            	 addElement("NN-SYNTHESIZE",(TOKEN87!=null?TOKEN87.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(452, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:454:1: vbwait : 'VB-WAIT' TOKEN ;
    public final void vbwait() throws RecognitionException {
        Token TOKEN88=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwait");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(454, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:454:7: ( 'VB-WAIT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:454:8: 'VB-WAIT' TOKEN
            {
            dbg.location(454,8);
            match(input,96,FOLLOW_96_in_vbwait1092); 
            dbg.location(454,19);
            TOKEN88=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwait1095); 
            dbg.location(455,1);

            	 addElement("VB-WAIT",(TOKEN88!=null?TOKEN88.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(457, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:459:1: vbwash : 'VB-WASH' TOKEN ;
    public final void vbwash() throws RecognitionException {
        Token TOKEN89=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(459, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:459:7: ( 'VB-WASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:459:8: 'VB-WASH' TOKEN
            {
            dbg.location(459,8);
            match(input,97,FOLLOW_97_in_vbwash1103); 
            dbg.location(459,19);
            TOKEN89=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwash1106); 
            dbg.location(460,1);

            	 addElement("VB-WASH",(TOKEN89!=null?TOKEN89.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(462, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:464:1: vbyield : 'VB-YIELD' TOKEN ;
    public final void vbyield() throws RecognitionException {
        Token TOKEN90=null;

        try { dbg.enterRule(getGrammarFileName(), "vbyield");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(464, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:464:8: ( 'VB-YIELD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:464:9: 'VB-YIELD' TOKEN
            {
            dbg.location(464,9);
            match(input,98,FOLLOW_98_in_vbyield1114); 
            dbg.location(464,21);
            TOKEN90=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbyield1117); 
            dbg.location(465,1);

            	 addElement("VB-YIELD",(TOKEN90!=null?TOKEN90.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(467, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:469:1: rb : 'RB' TOKEN ;
    public final void rb() throws RecognitionException {
        Token TOKEN91=null;

        try { dbg.enterRule(getGrammarFileName(), "rb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(469, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:469:3: ( 'RB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:469:4: 'RB' TOKEN
            {
            dbg.location(469,4);
            match(input,99,FOLLOW_99_in_rb1125); 
            dbg.location(469,10);
            TOKEN91=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rb1128); 
            dbg.location(470,1);

            	 addElement("RB",(TOKEN91!=null?TOKEN91.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(472, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:474:1: colon : 'COLON' TOKEN ;
    public final void colon() throws RecognitionException {
        Token TOKEN92=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(474, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:474:6: ( 'COLON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:474:7: 'COLON' TOKEN
            {
            dbg.location(474,7);
            match(input,100,FOLLOW_100_in_colon1136); 
            dbg.location(474,16);
            TOKEN92=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_colon1139); 
            dbg.location(475,1);

            	 addElement("COLON",(TOKEN92!=null?TOKEN92.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(477, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:478:1: comma : 'COMMA' TOKEN ;
    public final void comma() throws RecognitionException {
        Token TOKEN93=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(478, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:478:6: ( 'COMMA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:478:7: 'COMMA' TOKEN
            {
            dbg.location(478,7);
            match(input,101,FOLLOW_101_in_comma1146); 
            dbg.location(478,16);
            TOKEN93=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_comma1149); 
            dbg.location(479,1);

            	 addElement("COMMA",(TOKEN93!=null?TOKEN93.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(481, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:482:1: apost : 'APOST' TOKEN ;
    public final void apost() throws RecognitionException {
        Token TOKEN94=null;

        try { dbg.enterRule(getGrammarFileName(), "apost");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(482, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:482:6: ( 'APOST' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:482:7: 'APOST' TOKEN
            {
            dbg.location(482,7);
            match(input,102,FOLLOW_102_in_apost1156); 
            dbg.location(482,16);
            TOKEN94=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_apost1159); 
            dbg.location(483,1);

            	 addElement("APOST",(TOKEN94!=null?TOKEN94.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(485, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:486:1: neg : 'NEG' TOKEN ;
    public final void neg() throws RecognitionException {
        Token TOKEN95=null;

        try { dbg.enterRule(getGrammarFileName(), "neg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(486, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:486:4: ( 'NEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:486:5: 'NEG' TOKEN
            {
            dbg.location(486,5);
            match(input,103,FOLLOW_103_in_neg1166); 
            dbg.location(486,12);
            TOKEN95=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_neg1169); 
            dbg.location(487,1);

            	 addElement("NEG",(TOKEN95!=null?TOKEN95.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(489, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:490:1: dash : 'DASH' TOKEN ;
    public final void dash() throws RecognitionException {
        Token TOKEN96=null;

        try { dbg.enterRule(getGrammarFileName(), "dash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(490, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:490:5: ( 'DASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:490:6: 'DASH' TOKEN
            {
            dbg.location(490,6);
            match(input,104,FOLLOW_104_in_dash1176); 
            dbg.location(490,14);
            TOKEN96=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dash1179); 
            dbg.location(491,1);

            	 addElement("DASH",(TOKEN96!=null?TOKEN96.getText():null));


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
            dbg.exitRule(getGrammarFileName(), "dash");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dash"


    // $ANTLR start "stop"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:494:1: stop : 'STOP' TOKEN ;
    public final void stop() throws RecognitionException {
        Token TOKEN97=null;

        try { dbg.enterRule(getGrammarFileName(), "stop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(494, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:494:5: ( 'STOP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:494:6: 'STOP' TOKEN
            {
            dbg.location(494,6);
            match(input,105,FOLLOW_105_in_stop1186); 
            dbg.location(494,14);
            TOKEN97=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_stop1189); 
            dbg.location(495,1);

            	 addElement("STOP",(TOKEN97!=null?TOKEN97.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(497, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:498:1: nnpercent : 'NN-PERCENT' TOKEN ;
    public final void nnpercent() throws RecognitionException {
        Token TOKEN98=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpercent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(498, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:498:10: ( 'NN-PERCENT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:498:11: 'NN-PERCENT' TOKEN
            {
            dbg.location(498,11);
            match(input,106,FOLLOW_106_in_nnpercent1196); 
            dbg.location(498,25);
            TOKEN98=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpercent1199); 
            dbg.location(499,1);

            	 addElement("NN-PERCENT",(TOKEN98!=null?TOKEN98.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(501, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:502:1: lsqb : 'LSQB' TOKEN ;
    public final void lsqb() throws RecognitionException {
        Token TOKEN99=null;

        try { dbg.enterRule(getGrammarFileName(), "lsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(502, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:502:5: ( 'LSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:502:6: 'LSQB' TOKEN
            {
            dbg.location(502,6);
            match(input,107,FOLLOW_107_in_lsqb1206); 
            dbg.location(502,14);
            TOKEN99=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lsqb1209); 
            dbg.location(503,1);

            	 addElement("LSQB",(TOKEN99!=null?TOKEN99.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(505, 2);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:506:1: rsqb : 'RSQB' TOKEN ;
    public final void rsqb() throws RecognitionException {
        Token TOKEN100=null;

        try { dbg.enterRule(getGrammarFileName(), "rsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(506, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:506:5: ( 'RSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/ChemicalChunker.g:506:6: 'RSQB' TOKEN
            {
            dbg.location(506,6);
            match(input,108,FOLLOW_108_in_rsqb1216); 
            dbg.location(506,14);
            TOKEN100=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rsqb1219); 
            dbg.location(507,1);

            	 addElement("RSQB",(TOKEN100!=null?TOKEN100.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(509, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rsqb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rsqb"

    // Delegated rules


 

    public static final BitSet FOLLOW_sentence_in_document110 = new BitSet(new long[]{0x0040001000000002L});
    public static final BitSet FOLLOW_amount_in_sentence118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecule_in_sentence121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_mol129 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_nnmol_in_mol131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_gram139 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_nngram_in_gram141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oscarcm_in_molecule160 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_amount_in_molecule162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gram_in_amount170 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_comma_in_amount172 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_mol_in_amount175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_dttok182 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dttok185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_nntok201 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntok204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ppntok212 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ppntok215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_vbtok223 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbtok226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_oscarcd235 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcd238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_oscarcj245 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcj248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_tmunicode255 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_tmunicode258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_cdunicode265 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cdunicode268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_inas277 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inas280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_inbefore287 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inbefore290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_inafter297 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inafter300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_inin307 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inin310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ininto317 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_ininto320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_inwith327 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inwith330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_inwithout337 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inwithout340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_inby347 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inby350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_invia357 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_invia360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_inof367 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inof370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_inon377 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inon380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_infor387 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_infor390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_infrom397 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_infrom400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_inunder407 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inunder410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_inover417 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inover420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_inoff427 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_inoff430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_to437 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_to440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_nnstate448 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnstate451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_nntime459 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntime462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_cd469 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cd472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_nngram479 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nngram482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_nnmol489 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmol492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nnatmosphere499 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnatmosphere502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_nneq509 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nneq512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_nnvol519 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnvol522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_nntemp530 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntemp533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_nnflash540 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnflash543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_nngeneral550 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nngeneral553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_nnmethod560 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmethod563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_nnamount570 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnamount573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_nnpressure580 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpressure583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_nncolumn590 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nncolumn593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_nnchromatography600 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnchromatography603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_nnvacuum610 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnvacuum613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_nncycle620 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nncycle623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_nntimes630 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nntimes633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_nnchementity641 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnchementity644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_oscarcm651 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcm654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_vbuse662 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbuse665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_vbchange672 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbchange675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_vbsubmerge682 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubmerge685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_vbsubject692 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubject695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_jj703 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jj706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_nnadd714 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnadd717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_nnmixture724 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmixture727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_vbadd734 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbadd737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_vbcharge744 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcharge747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_vbcontain754 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcontain757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_vbdrop764 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdrop767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_vbfill774 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbfill777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_vbsuspend784 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsuspend787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_vbtreat794 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbtreat797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_vbapparatus805 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbapparatus808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_nnapparatus815 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnapparatus818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_vbconcentrate826 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbconcentrate829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_nnconcentrate836 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnconcentrate839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_vbcool847 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcool850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_vbdegass858 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdegass861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_vbdissolve869 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdissolve872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_vbdry880 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdry883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_nndry890 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nndry893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_vbextract901 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbextract904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_nnextract911 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnextract914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_vbfilter922 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbfilter925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_nnfilter932 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnfilter935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_vbheat943 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbheat946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_vbincrease953 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbincrease956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_vbpartition964 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbpartition967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_vbprecipitate975 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbprecipitate978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_nnprecipitate985 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnprecipitate988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_vbpurify996 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbpurify999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_nnpurify1006 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpurify1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_vbquench1017 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbquench1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_vbrecover1028 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbrecover1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_vbremove1039 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbremove1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_nnremove1049 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnremove1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_vbstir1060 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbstir1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_vbsynthesize1071 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsynthesize1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_nnsynthesize1081 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnsynthesize1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_vbwait1092 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbwait1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_vbwash1103 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbwash1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_vbyield1114 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbyield1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rb1125 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rb1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_colon1136 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_colon1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_comma1146 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_comma1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_apost1156 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_apost1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_neg1166 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_neg1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_dash1176 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dash1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_stop1186 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_stop1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_nnpercent1196 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpercent1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_lsqb1206 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_lsqb1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rsqb1216 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rsqb1219 = new BitSet(new long[]{0x0000000000000002L});

}