// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g 2009-11-20 15:39:16

    package uk.ac.cam.ch.wwmm.extractPhrases.antlr;
 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class ChemicalChunkerParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WS", "NEWLINE", "ACHAR", "DIGIT", "TOKEN", "'OSCAR-CD'", "'CJ'", "'TM-UNICODE'", "'CD-UNICODE'", "'IN-AS'", "'IN-BEFORE'", "'IN-AFTER'", "'IN-IN'", "'IN-INTO'", "'IN-WITH'", "'IN-WITHOUT'", "'IN-BY'", "'IN-VIA'", "'IN-OF'", "'IN-ON'", "'IN-FOR'", "'IN-FROM'", "'IN-UNDER'", "'IN-OVER'", "'IN-OFF'", "'NN-STATE'", "'NN-TIME'", "'NN-GRAM'", "'NN-MOL'", "'CM'", "'VB-USE'", "'VB-CHANGE'", "'VB-SUBMERGE'", "'VB-SUBJECT'", "'NN-ADD'", "'NN-MIXTURE'", "'VB-ADD'", "'VB-CHARGE'", "'VB-CONTAIN'", "'VB-DROP'", "'VB-FILL'", "'VB-SUSPEND'", "'VB-TREAT'", "'VB-APPARATUS'", "'NN-APPARATUS'", "'VB-CONCENTRATE'", "'NN-CONCENTRATE'", "'VB-COOL'", "'VB-DEGASS'", "'VB-DISSOLVE'", "'VB-DRY'", "'NN-DRY'", "'VB-EXTRACT'", "'NN-EXTRACT'", "'VB-FILTER'", "'NN-FILTER'", "'VB-HEAT'", "'VB-INCREASE'", "'VB-PARTITION'", "'VB-PRECIPITATE'", "'NN-PRECIPITATE'", "'VB-PURIFY'", "'NN-PURIFY'", "'VB-QUENCH'", "'VB-RECOVER'", "'VB-REMOVE'", "'NN-REMOVE'", "'VB-STIR'", "'VB-SYNTHESIZE'", "'NN-SYNTHESIZE'", "'VB-WAIT'", "'VB-WASH'", "'VB-YIELD'", "'COLON'", "'COMMA'", "'APOST'", "'NEG'", "'DASH'", "'STOP'", "'NN-PERCENT'", "'LSQB'", "'RSQB'", "'-LRB-'", "'-RRB-'", "'CC'", "'CD'", "'DT'", "'JJ'", "'NN'", "'RB'", "'TO'", "'VBD'"
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
    public static final int T__71=71;
    public static final int WS=4;
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
    public static final int T__59=59;
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
        "invalidRule", "inbefore", "vbdissolve", "vbuse", "nnstate", "dash", 
        "jj", "stop", "rsqb", "vbsubmerge", "ininto", "nounphrase", "nnconcentrate", 
        "inwithout", "oscarcd", "apost", "vbwash", "oscarcj", "vbyield", 
        "vbincrease", "inin", "inon", "molecule", "invia", "nnpercent", 
        "inunder", "nnprecipitate", "vbsuspend", "rrb", "vbapparatus", "sentence", 
        "vbtreat", "vbd", "nnmol", "dt", "inover", "inof", "vbcontain", 
        "infrom", "vbsubject", "vbdry", "vbdrop", "vbrecover", "vbprecipitate", 
        "cd", "cdunicode", "tmunicode", "vbcool", "nn", "nnfilter", "vbcharge", 
        "lrb", "vbremove", "verbphraseADD", "vbpartition", "vbchange", "vbdegass", 
        "prepphrase", "lsqb", "mol", "inby", "nnpurify", "cc", "nnextract", 
        "gram", "vbfill", "amount", "molecules", "rb", "vbextract", "nnsynthesize", 
        "nnremove", "inoff", "vbquench", "nndry", "nngram", "vbsynthesize", 
        "infor", "inas", "inwith", "vbstir", "vbconcentrate", "vbpurify", 
        "oscarcm", "vbheat", "nnadd", "vbfilter", "document", "comma", "vbadd", 
        "to", "colon", "inafter", "nnapparatus", "vbwait", "nntime", "neg", 
        "nnmixture"
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
    public String getGrammarFileName() { return "/home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g"; }


    public static class document_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "document"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:24:1: document : ( sentence )+ ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:24:9: ( ( sentence )+ )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:24:11: ( sentence )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(24,11);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:24:11: ( sentence )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==33||LA1_0==90) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:24:11: sentence
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:26:1: mol : cd nnmol ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:26:5: ( cd nnmol )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:26:7: cd nnmol
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:27:1: sentence : nounphrase verbphraseADD prepphrase ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:28:2: ( nounphrase verbphraseADD prepphrase )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:28:5: nounphrase verbphraseADD prepphrase
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:30:1: nounphrase : molecules ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:31:2: ( molecules )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:31:3: molecules
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:33:1: verbphraseADD : ( vbd )* vbadd ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:34:2: ( ( vbd )* vbadd )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:34:4: ( vbd )* vbadd
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(34,4);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:34:4: ( vbd )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==95) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:34:4: vbd
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:37:1: prepphrase : to molecule ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:38:2: ( to molecule )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:38:4: to molecule
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:40:1: gram : cd nngram ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:40:6: ( cd nngram )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:40:8: cd nngram
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:42:1: molecules : molecule cc molecule ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:43:2: ( molecule cc molecule )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:43:4: molecule cc molecule
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:44:1: molecule : ( dt )* ( oscarcm )+ amount ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:45:2: ( ( dt )* ( oscarcm )+ amount )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:45:5: ( dt )* ( oscarcm )+ amount
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(45,5);
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:45:5: ( dt )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==90) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:45:5: dt
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:45:9: ( oscarcm )+
            int cnt4=0;
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==33) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:45:9: oscarcm
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:46:1: amount : lrb gram comma mol rrb ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:46:9: ( lrb gram comma mol rrb )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:46:11: lrb gram comma mol rrb
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:49:1: oscarcd : 'OSCAR-CD' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:49:8: ( 'OSCAR-CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:49:9: 'OSCAR-CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(49,9);
            string_literal25=(Token)match(input,9,FOLLOW_9_in_oscarcd279); 
            string_literal25_tree = (Object)adaptor.create(string_literal25);
            adaptor.addChild(root_0, string_literal25_tree);

            dbg.location(49,20);
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
        dbg.location(49, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:50:1: oscarcj : 'CJ' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:50:8: ( 'CJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:50:9: 'CJ' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:51:1: tmunicode : 'TM-UNICODE' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:51:10: ( 'TM-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:51:11: 'TM-UNICODE' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:52:1: cdunicode : 'CD-UNICODE' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:52:10: ( 'CD-UNICODE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:52:11: 'CD-UNICODE' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:55:1: inas : 'IN-AS' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:55:5: ( 'IN-AS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:55:6: 'IN-AS' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:56:1: inbefore : 'IN-BEFORE' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:56:9: ( 'IN-BEFORE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:56:10: 'IN-BEFORE' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:57:1: inafter : 'IN-AFTER' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:57:8: ( 'IN-AFTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:57:9: 'IN-AFTER' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:58:1: inin : 'IN-IN' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:58:5: ( 'IN-IN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:58:6: 'IN-IN' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:59:1: ininto : 'IN-INTO' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:59:7: ( 'IN-INTO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:59:8: 'IN-INTO' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:60:1: inwith : 'IN-WITH' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:60:7: ( 'IN-WITH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:60:8: 'IN-WITH' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:61:1: inwithout : 'IN-WITHOUT' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:61:10: ( 'IN-WITHOUT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:61:11: 'IN-WITHOUT' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:62:1: inby : 'IN-BY' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:62:5: ( 'IN-BY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:62:6: 'IN-BY' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:63:1: invia : 'IN-VIA' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:63:6: ( 'IN-VIA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:63:7: 'IN-VIA' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:64:1: inof : 'IN-OF' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:64:5: ( 'IN-OF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:64:6: 'IN-OF' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:65:1: inon : 'IN-ON' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:65:5: ( 'IN-ON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:65:6: 'IN-ON' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:66:1: infor : 'IN-FOR' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:66:6: ( 'IN-FOR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:66:7: 'IN-FOR' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:67:1: infrom : 'IN-FROM' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:67:7: ( 'IN-FROM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:67:8: 'IN-FROM' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:68:1: inunder : 'IN-UNDER' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:68:8: ( 'IN-UNDER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:68:9: 'IN-UNDER' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:69:1: inover : 'IN-OVER' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:69:7: ( 'IN-OVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:69:8: 'IN-OVER' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:70:1: inoff : 'IN-OFF' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:70:6: ( 'IN-OFF' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:70:7: 'IN-OFF' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:73:1: nnstate : 'NN-STATE' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:73:8: ( 'NN-STATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:73:9: 'NN-STATE' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:74:1: nntime : 'NN-TIME' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:74:7: ( 'NN-TIME' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:74:8: 'NN-TIME' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:75:1: nngram : 'NN-GRAM' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:75:7: ( 'NN-GRAM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:75:8: 'NN-GRAM' TOKEN
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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:76:1: nnmol : 'NN-MOL' TOKEN ;
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
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:76:6: ( 'NN-MOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:76:7: 'NN-MOL' TOKEN
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

    public static class oscarcm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oscarcm"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:79:1: oscarcm : 'CM' TOKEN ;
    public final ChemicalChunkerParser.oscarcm_return oscarcm() throws RecognitionException {
        ChemicalChunkerParser.oscarcm_return retval = new ChemicalChunkerParser.oscarcm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal73=null;
        Token TOKEN74=null;

        Object string_literal73_tree=null;
        Object TOKEN74_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "oscarcm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:79:8: ( 'CM' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:79:9: 'CM' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(79,9);
            string_literal73=(Token)match(input,33,FOLLOW_33_in_oscarcm453); 
            string_literal73_tree = (Object)adaptor.create(string_literal73);
            adaptor.addChild(root_0, string_literal73_tree);

            dbg.location(79,14);
            TOKEN74=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_oscarcm455); 
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
        dbg.location(79, 19);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:82:1: vbuse : 'VB-USE' TOKEN ;
    public final ChemicalChunkerParser.vbuse_return vbuse() throws RecognitionException {
        ChemicalChunkerParser.vbuse_return retval = new ChemicalChunkerParser.vbuse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal75=null;
        Token TOKEN76=null;

        Object string_literal75_tree=null;
        Object TOKEN76_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbuse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:82:6: ( 'VB-USE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:82:7: 'VB-USE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(82,7);
            string_literal75=(Token)match(input,34,FOLLOW_34_in_vbuse462); 
            string_literal75_tree = (Object)adaptor.create(string_literal75);
            adaptor.addChild(root_0, string_literal75_tree);

            dbg.location(82,16);
            TOKEN76=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbuse464); 
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
        dbg.location(82, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:83:1: vbchange : 'VB-CHANGE' TOKEN ;
    public final ChemicalChunkerParser.vbchange_return vbchange() throws RecognitionException {
        ChemicalChunkerParser.vbchange_return retval = new ChemicalChunkerParser.vbchange_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal77=null;
        Token TOKEN78=null;

        Object string_literal77_tree=null;
        Object TOKEN78_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbchange");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:83:9: ( 'VB-CHANGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:83:10: 'VB-CHANGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(83,10);
            string_literal77=(Token)match(input,35,FOLLOW_35_in_vbchange469); 
            string_literal77_tree = (Object)adaptor.create(string_literal77);
            adaptor.addChild(root_0, string_literal77_tree);

            dbg.location(83,22);
            TOKEN78=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbchange471); 
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
        dbg.location(83, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:84:1: vbsubmerge : 'VB-SUBMERGE' TOKEN ;
    public final ChemicalChunkerParser.vbsubmerge_return vbsubmerge() throws RecognitionException {
        ChemicalChunkerParser.vbsubmerge_return retval = new ChemicalChunkerParser.vbsubmerge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;
        Token TOKEN80=null;

        Object string_literal79_tree=null;
        Object TOKEN80_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubmerge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:84:11: ( 'VB-SUBMERGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:84:12: 'VB-SUBMERGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(84,12);
            string_literal79=(Token)match(input,36,FOLLOW_36_in_vbsubmerge476); 
            string_literal79_tree = (Object)adaptor.create(string_literal79);
            adaptor.addChild(root_0, string_literal79_tree);

            dbg.location(84,26);
            TOKEN80=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubmerge478); 
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
        dbg.location(84, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:85:1: vbsubject : 'VB-SUBJECT' TOKEN ;
    public final ChemicalChunkerParser.vbsubject_return vbsubject() throws RecognitionException {
        ChemicalChunkerParser.vbsubject_return retval = new ChemicalChunkerParser.vbsubject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal81=null;
        Token TOKEN82=null;

        Object string_literal81_tree=null;
        Object TOKEN82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsubject");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:85:10: ( 'VB-SUBJECT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:85:11: 'VB-SUBJECT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(85,11);
            string_literal81=(Token)match(input,37,FOLLOW_37_in_vbsubject483); 
            string_literal81_tree = (Object)adaptor.create(string_literal81);
            adaptor.addChild(root_0, string_literal81_tree);

            dbg.location(85,24);
            TOKEN82=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsubject485); 
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
        dbg.location(85, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:88:1: nnadd : 'NN-ADD' TOKEN ;
    public final ChemicalChunkerParser.nnadd_return nnadd() throws RecognitionException {
        ChemicalChunkerParser.nnadd_return retval = new ChemicalChunkerParser.nnadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;
        Token TOKEN84=null;

        Object string_literal83_tree=null;
        Object TOKEN84_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:88:6: ( 'NN-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:88:7: 'NN-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(88,7);
            string_literal83=(Token)match(input,38,FOLLOW_38_in_nnadd492); 
            string_literal83_tree = (Object)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);

            dbg.location(88,16);
            TOKEN84=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnadd494); 
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
        dbg.location(88, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:89:1: nnmixture : 'NN-MIXTURE' TOKEN ;
    public final ChemicalChunkerParser.nnmixture_return nnmixture() throws RecognitionException {
        ChemicalChunkerParser.nnmixture_return retval = new ChemicalChunkerParser.nnmixture_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal85=null;
        Token TOKEN86=null;

        Object string_literal85_tree=null;
        Object TOKEN86_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnmixture");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:89:10: ( 'NN-MIXTURE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:89:11: 'NN-MIXTURE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(89,11);
            string_literal85=(Token)match(input,39,FOLLOW_39_in_nnmixture499); 
            string_literal85_tree = (Object)adaptor.create(string_literal85);
            adaptor.addChild(root_0, string_literal85_tree);

            dbg.location(89,24);
            TOKEN86=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnmixture501); 
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
        dbg.location(89, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:90:1: vbadd : 'VB-ADD' TOKEN ;
    public final ChemicalChunkerParser.vbadd_return vbadd() throws RecognitionException {
        ChemicalChunkerParser.vbadd_return retval = new ChemicalChunkerParser.vbadd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token TOKEN88=null;

        Object string_literal87_tree=null;
        Object TOKEN88_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbadd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:90:6: ( 'VB-ADD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:90:7: 'VB-ADD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(90,7);
            string_literal87=(Token)match(input,40,FOLLOW_40_in_vbadd506); 
            string_literal87_tree = (Object)adaptor.create(string_literal87);
            adaptor.addChild(root_0, string_literal87_tree);

            dbg.location(90,16);
            TOKEN88=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbadd508); 
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
        dbg.location(90, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:91:1: vbcharge : 'VB-CHARGE' TOKEN ;
    public final ChemicalChunkerParser.vbcharge_return vbcharge() throws RecognitionException {
        ChemicalChunkerParser.vbcharge_return retval = new ChemicalChunkerParser.vbcharge_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal89=null;
        Token TOKEN90=null;

        Object string_literal89_tree=null;
        Object TOKEN90_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcharge");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:91:9: ( 'VB-CHARGE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:91:10: 'VB-CHARGE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(91,10);
            string_literal89=(Token)match(input,41,FOLLOW_41_in_vbcharge513); 
            string_literal89_tree = (Object)adaptor.create(string_literal89);
            adaptor.addChild(root_0, string_literal89_tree);

            dbg.location(91,22);
            TOKEN90=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcharge515); 
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
        dbg.location(91, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:92:1: vbcontain : 'VB-CONTAIN' TOKEN ;
    public final ChemicalChunkerParser.vbcontain_return vbcontain() throws RecognitionException {
        ChemicalChunkerParser.vbcontain_return retval = new ChemicalChunkerParser.vbcontain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal91=null;
        Token TOKEN92=null;

        Object string_literal91_tree=null;
        Object TOKEN92_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcontain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:92:10: ( 'VB-CONTAIN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:92:11: 'VB-CONTAIN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(92,11);
            string_literal91=(Token)match(input,42,FOLLOW_42_in_vbcontain520); 
            string_literal91_tree = (Object)adaptor.create(string_literal91);
            adaptor.addChild(root_0, string_literal91_tree);

            dbg.location(92,24);
            TOKEN92=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcontain522); 
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
        dbg.location(92, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:93:1: vbdrop : 'VB-DROP' TOKEN ;
    public final ChemicalChunkerParser.vbdrop_return vbdrop() throws RecognitionException {
        ChemicalChunkerParser.vbdrop_return retval = new ChemicalChunkerParser.vbdrop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal93=null;
        Token TOKEN94=null;

        Object string_literal93_tree=null;
        Object TOKEN94_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdrop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:93:7: ( 'VB-DROP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:93:8: 'VB-DROP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(93,8);
            string_literal93=(Token)match(input,43,FOLLOW_43_in_vbdrop527); 
            string_literal93_tree = (Object)adaptor.create(string_literal93);
            adaptor.addChild(root_0, string_literal93_tree);

            dbg.location(93,18);
            TOKEN94=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdrop529); 
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
        dbg.location(93, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:94:1: vbfill : 'VB-FILL' TOKEN ;
    public final ChemicalChunkerParser.vbfill_return vbfill() throws RecognitionException {
        ChemicalChunkerParser.vbfill_return retval = new ChemicalChunkerParser.vbfill_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal95=null;
        Token TOKEN96=null;

        Object string_literal95_tree=null;
        Object TOKEN96_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfill");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:94:7: ( 'VB-FILL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:94:8: 'VB-FILL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(94,8);
            string_literal95=(Token)match(input,44,FOLLOW_44_in_vbfill534); 
            string_literal95_tree = (Object)adaptor.create(string_literal95);
            adaptor.addChild(root_0, string_literal95_tree);

            dbg.location(94,18);
            TOKEN96=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfill536); 
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
        dbg.location(94, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:95:1: vbsuspend : 'VB-SUSPEND' TOKEN ;
    public final ChemicalChunkerParser.vbsuspend_return vbsuspend() throws RecognitionException {
        ChemicalChunkerParser.vbsuspend_return retval = new ChemicalChunkerParser.vbsuspend_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal97=null;
        Token TOKEN98=null;

        Object string_literal97_tree=null;
        Object TOKEN98_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsuspend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:95:10: ( 'VB-SUSPEND' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:95:11: 'VB-SUSPEND' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(95,11);
            string_literal97=(Token)match(input,45,FOLLOW_45_in_vbsuspend541); 
            string_literal97_tree = (Object)adaptor.create(string_literal97);
            adaptor.addChild(root_0, string_literal97_tree);

            dbg.location(95,24);
            TOKEN98=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsuspend543); 
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
        dbg.location(95, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:96:1: vbtreat : 'VB-TREAT' TOKEN ;
    public final ChemicalChunkerParser.vbtreat_return vbtreat() throws RecognitionException {
        ChemicalChunkerParser.vbtreat_return retval = new ChemicalChunkerParser.vbtreat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal99=null;
        Token TOKEN100=null;

        Object string_literal99_tree=null;
        Object TOKEN100_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbtreat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(96, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:96:8: ( 'VB-TREAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:96:9: 'VB-TREAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(96,9);
            string_literal99=(Token)match(input,46,FOLLOW_46_in_vbtreat548); 
            string_literal99_tree = (Object)adaptor.create(string_literal99);
            adaptor.addChild(root_0, string_literal99_tree);

            dbg.location(96,20);
            TOKEN100=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbtreat550); 
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
        dbg.location(96, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:99:1: vbapparatus : 'VB-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.vbapparatus_return vbapparatus() throws RecognitionException {
        ChemicalChunkerParser.vbapparatus_return retval = new ChemicalChunkerParser.vbapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal101=null;
        Token TOKEN102=null;

        Object string_literal101_tree=null;
        Object TOKEN102_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:99:12: ( 'VB-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:99:13: 'VB-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(99,13);
            string_literal101=(Token)match(input,47,FOLLOW_47_in_vbapparatus557); 
            string_literal101_tree = (Object)adaptor.create(string_literal101);
            adaptor.addChild(root_0, string_literal101_tree);

            dbg.location(99,28);
            TOKEN102=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbapparatus559); 
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
        dbg.location(99, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:100:1: nnapparatus : 'NN-APPARATUS' TOKEN ;
    public final ChemicalChunkerParser.nnapparatus_return nnapparatus() throws RecognitionException {
        ChemicalChunkerParser.nnapparatus_return retval = new ChemicalChunkerParser.nnapparatus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal103=null;
        Token TOKEN104=null;

        Object string_literal103_tree=null;
        Object TOKEN104_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnapparatus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:100:12: ( 'NN-APPARATUS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:100:13: 'NN-APPARATUS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(100,13);
            string_literal103=(Token)match(input,48,FOLLOW_48_in_nnapparatus564); 
            string_literal103_tree = (Object)adaptor.create(string_literal103);
            adaptor.addChild(root_0, string_literal103_tree);

            dbg.location(100,28);
            TOKEN104=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnapparatus566); 
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
        dbg.location(100, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:103:1: vbconcentrate : 'VB-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.vbconcentrate_return vbconcentrate() throws RecognitionException {
        ChemicalChunkerParser.vbconcentrate_return retval = new ChemicalChunkerParser.vbconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal105=null;
        Token TOKEN106=null;

        Object string_literal105_tree=null;
        Object TOKEN106_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:103:14: ( 'VB-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:103:15: 'VB-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(103,15);
            string_literal105=(Token)match(input,49,FOLLOW_49_in_vbconcentrate573); 
            string_literal105_tree = (Object)adaptor.create(string_literal105);
            adaptor.addChild(root_0, string_literal105_tree);

            dbg.location(103,32);
            TOKEN106=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbconcentrate575); 
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
        dbg.location(103, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:104:1: nnconcentrate : 'NN-CONCENTRATE' TOKEN ;
    public final ChemicalChunkerParser.nnconcentrate_return nnconcentrate() throws RecognitionException {
        ChemicalChunkerParser.nnconcentrate_return retval = new ChemicalChunkerParser.nnconcentrate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal107=null;
        Token TOKEN108=null;

        Object string_literal107_tree=null;
        Object TOKEN108_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnconcentrate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:104:14: ( 'NN-CONCENTRATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:104:15: 'NN-CONCENTRATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(104,15);
            string_literal107=(Token)match(input,50,FOLLOW_50_in_nnconcentrate580); 
            string_literal107_tree = (Object)adaptor.create(string_literal107);
            adaptor.addChild(root_0, string_literal107_tree);

            dbg.location(104,32);
            TOKEN108=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnconcentrate582); 
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
        dbg.location(104, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:107:1: vbcool : 'VB-COOL' TOKEN ;
    public final ChemicalChunkerParser.vbcool_return vbcool() throws RecognitionException {
        ChemicalChunkerParser.vbcool_return retval = new ChemicalChunkerParser.vbcool_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal109=null;
        Token TOKEN110=null;

        Object string_literal109_tree=null;
        Object TOKEN110_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbcool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:107:7: ( 'VB-COOL' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:107:8: 'VB-COOL' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(107,8);
            string_literal109=(Token)match(input,51,FOLLOW_51_in_vbcool589); 
            string_literal109_tree = (Object)adaptor.create(string_literal109);
            adaptor.addChild(root_0, string_literal109_tree);

            dbg.location(107,18);
            TOKEN110=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbcool591); 
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
        dbg.location(107, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:110:1: vbdegass : 'VB-DEGASS' TOKEN ;
    public final ChemicalChunkerParser.vbdegass_return vbdegass() throws RecognitionException {
        ChemicalChunkerParser.vbdegass_return retval = new ChemicalChunkerParser.vbdegass_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal111=null;
        Token TOKEN112=null;

        Object string_literal111_tree=null;
        Object TOKEN112_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdegass");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:110:9: ( 'VB-DEGASS' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:110:10: 'VB-DEGASS' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(110,10);
            string_literal111=(Token)match(input,52,FOLLOW_52_in_vbdegass598); 
            string_literal111_tree = (Object)adaptor.create(string_literal111);
            adaptor.addChild(root_0, string_literal111_tree);

            dbg.location(110,22);
            TOKEN112=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdegass600); 
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
        dbg.location(110, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:113:1: vbdissolve : 'VB-DISSOLVE' TOKEN ;
    public final ChemicalChunkerParser.vbdissolve_return vbdissolve() throws RecognitionException {
        ChemicalChunkerParser.vbdissolve_return retval = new ChemicalChunkerParser.vbdissolve_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal113=null;
        Token TOKEN114=null;

        Object string_literal113_tree=null;
        Object TOKEN114_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdissolve");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:113:11: ( 'VB-DISSOLVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:113:12: 'VB-DISSOLVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(113,12);
            string_literal113=(Token)match(input,53,FOLLOW_53_in_vbdissolve607); 
            string_literal113_tree = (Object)adaptor.create(string_literal113);
            adaptor.addChild(root_0, string_literal113_tree);

            dbg.location(113,26);
            TOKEN114=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdissolve609); 
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
        dbg.location(113, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:116:1: vbdry : 'VB-DRY' TOKEN ;
    public final ChemicalChunkerParser.vbdry_return vbdry() throws RecognitionException {
        ChemicalChunkerParser.vbdry_return retval = new ChemicalChunkerParser.vbdry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal115=null;
        Token TOKEN116=null;

        Object string_literal115_tree=null;
        Object TOKEN116_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbdry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:116:6: ( 'VB-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:116:7: 'VB-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(116,7);
            string_literal115=(Token)match(input,54,FOLLOW_54_in_vbdry616); 
            string_literal115_tree = (Object)adaptor.create(string_literal115);
            adaptor.addChild(root_0, string_literal115_tree);

            dbg.location(116,16);
            TOKEN116=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbdry618); 
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
        dbg.location(116, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:117:1: nndry : 'NN-DRY' TOKEN ;
    public final ChemicalChunkerParser.nndry_return nndry() throws RecognitionException {
        ChemicalChunkerParser.nndry_return retval = new ChemicalChunkerParser.nndry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal117=null;
        Token TOKEN118=null;

        Object string_literal117_tree=null;
        Object TOKEN118_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nndry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:117:6: ( 'NN-DRY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:117:7: 'NN-DRY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(117,7);
            string_literal117=(Token)match(input,55,FOLLOW_55_in_nndry623); 
            string_literal117_tree = (Object)adaptor.create(string_literal117);
            adaptor.addChild(root_0, string_literal117_tree);

            dbg.location(117,16);
            TOKEN118=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nndry625); 
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
        dbg.location(117, 21);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:120:1: vbextract : 'VB-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.vbextract_return vbextract() throws RecognitionException {
        ChemicalChunkerParser.vbextract_return retval = new ChemicalChunkerParser.vbextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal119=null;
        Token TOKEN120=null;

        Object string_literal119_tree=null;
        Object TOKEN120_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:120:10: ( 'VB-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:120:11: 'VB-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(120,11);
            string_literal119=(Token)match(input,56,FOLLOW_56_in_vbextract632); 
            string_literal119_tree = (Object)adaptor.create(string_literal119);
            adaptor.addChild(root_0, string_literal119_tree);

            dbg.location(120,24);
            TOKEN120=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbextract634); 
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
        dbg.location(120, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:121:1: nnextract : 'NN-EXTRACT' TOKEN ;
    public final ChemicalChunkerParser.nnextract_return nnextract() throws RecognitionException {
        ChemicalChunkerParser.nnextract_return retval = new ChemicalChunkerParser.nnextract_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal121=null;
        Token TOKEN122=null;

        Object string_literal121_tree=null;
        Object TOKEN122_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnextract");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:121:10: ( 'NN-EXTRACT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:121:11: 'NN-EXTRACT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(121,11);
            string_literal121=(Token)match(input,57,FOLLOW_57_in_nnextract639); 
            string_literal121_tree = (Object)adaptor.create(string_literal121);
            adaptor.addChild(root_0, string_literal121_tree);

            dbg.location(121,24);
            TOKEN122=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnextract641); 
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
        dbg.location(121, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:124:1: vbfilter : 'VB-FILTER' TOKEN ;
    public final ChemicalChunkerParser.vbfilter_return vbfilter() throws RecognitionException {
        ChemicalChunkerParser.vbfilter_return retval = new ChemicalChunkerParser.vbfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal123=null;
        Token TOKEN124=null;

        Object string_literal123_tree=null;
        Object TOKEN124_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:124:9: ( 'VB-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:124:10: 'VB-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(124,10);
            string_literal123=(Token)match(input,58,FOLLOW_58_in_vbfilter648); 
            string_literal123_tree = (Object)adaptor.create(string_literal123);
            adaptor.addChild(root_0, string_literal123_tree);

            dbg.location(124,22);
            TOKEN124=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbfilter650); 
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
        dbg.location(124, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:125:1: nnfilter : 'NN-FILTER' TOKEN ;
    public final ChemicalChunkerParser.nnfilter_return nnfilter() throws RecognitionException {
        ChemicalChunkerParser.nnfilter_return retval = new ChemicalChunkerParser.nnfilter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal125=null;
        Token TOKEN126=null;

        Object string_literal125_tree=null;
        Object TOKEN126_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnfilter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:125:9: ( 'NN-FILTER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:125:10: 'NN-FILTER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(125,10);
            string_literal125=(Token)match(input,59,FOLLOW_59_in_nnfilter655); 
            string_literal125_tree = (Object)adaptor.create(string_literal125);
            adaptor.addChild(root_0, string_literal125_tree);

            dbg.location(125,22);
            TOKEN126=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnfilter657); 
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
        dbg.location(125, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:128:1: vbheat : 'VB-HEAT' TOKEN ;
    public final ChemicalChunkerParser.vbheat_return vbheat() throws RecognitionException {
        ChemicalChunkerParser.vbheat_return retval = new ChemicalChunkerParser.vbheat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal127=null;
        Token TOKEN128=null;

        Object string_literal127_tree=null;
        Object TOKEN128_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbheat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:128:7: ( 'VB-HEAT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:128:8: 'VB-HEAT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,8);
            string_literal127=(Token)match(input,60,FOLLOW_60_in_vbheat664); 
            string_literal127_tree = (Object)adaptor.create(string_literal127);
            adaptor.addChild(root_0, string_literal127_tree);

            dbg.location(128,18);
            TOKEN128=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbheat666); 
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
        dbg.location(128, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:129:1: vbincrease : 'VB-INCREASE' TOKEN ;
    public final ChemicalChunkerParser.vbincrease_return vbincrease() throws RecognitionException {
        ChemicalChunkerParser.vbincrease_return retval = new ChemicalChunkerParser.vbincrease_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal129=null;
        Token TOKEN130=null;

        Object string_literal129_tree=null;
        Object TOKEN130_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbincrease");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:129:11: ( 'VB-INCREASE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:129:12: 'VB-INCREASE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(129,12);
            string_literal129=(Token)match(input,61,FOLLOW_61_in_vbincrease671); 
            string_literal129_tree = (Object)adaptor.create(string_literal129);
            adaptor.addChild(root_0, string_literal129_tree);

            dbg.location(129,26);
            TOKEN130=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbincrease673); 
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
        dbg.location(129, 31);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:132:1: vbpartition : 'VB-PARTITION' TOKEN ;
    public final ChemicalChunkerParser.vbpartition_return vbpartition() throws RecognitionException {
        ChemicalChunkerParser.vbpartition_return retval = new ChemicalChunkerParser.vbpartition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal131=null;
        Token TOKEN132=null;

        Object string_literal131_tree=null;
        Object TOKEN132_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpartition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:132:12: ( 'VB-PARTITION' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:132:13: 'VB-PARTITION' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(132,13);
            string_literal131=(Token)match(input,62,FOLLOW_62_in_vbpartition680); 
            string_literal131_tree = (Object)adaptor.create(string_literal131);
            adaptor.addChild(root_0, string_literal131_tree);

            dbg.location(132,28);
            TOKEN132=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpartition682); 
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
        dbg.location(132, 33);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:135:1: vbprecipitate : 'VB-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.vbprecipitate_return vbprecipitate() throws RecognitionException {
        ChemicalChunkerParser.vbprecipitate_return retval = new ChemicalChunkerParser.vbprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal133=null;
        Token TOKEN134=null;

        Object string_literal133_tree=null;
        Object TOKEN134_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:135:14: ( 'VB-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:135:15: 'VB-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(135,15);
            string_literal133=(Token)match(input,63,FOLLOW_63_in_vbprecipitate689); 
            string_literal133_tree = (Object)adaptor.create(string_literal133);
            adaptor.addChild(root_0, string_literal133_tree);

            dbg.location(135,32);
            TOKEN134=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbprecipitate691); 
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
        dbg.location(135, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:136:1: nnprecipitate : 'NN-PRECIPITATE' TOKEN ;
    public final ChemicalChunkerParser.nnprecipitate_return nnprecipitate() throws RecognitionException {
        ChemicalChunkerParser.nnprecipitate_return retval = new ChemicalChunkerParser.nnprecipitate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal135=null;
        Token TOKEN136=null;

        Object string_literal135_tree=null;
        Object TOKEN136_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnprecipitate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:136:14: ( 'NN-PRECIPITATE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:136:15: 'NN-PRECIPITATE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(136,15);
            string_literal135=(Token)match(input,64,FOLLOW_64_in_nnprecipitate696); 
            string_literal135_tree = (Object)adaptor.create(string_literal135);
            adaptor.addChild(root_0, string_literal135_tree);

            dbg.location(136,32);
            TOKEN136=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnprecipitate698); 
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
        dbg.location(136, 37);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:139:1: vbpurify : 'VB-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.vbpurify_return vbpurify() throws RecognitionException {
        ChemicalChunkerParser.vbpurify_return retval = new ChemicalChunkerParser.vbpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal137=null;
        Token TOKEN138=null;

        Object string_literal137_tree=null;
        Object TOKEN138_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:139:9: ( 'VB-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:139:10: 'VB-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,10);
            string_literal137=(Token)match(input,65,FOLLOW_65_in_vbpurify705); 
            string_literal137_tree = (Object)adaptor.create(string_literal137);
            adaptor.addChild(root_0, string_literal137_tree);

            dbg.location(139,22);
            TOKEN138=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbpurify707); 
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
        dbg.location(139, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:140:1: nnpurify : 'NN-PURIFY' TOKEN ;
    public final ChemicalChunkerParser.nnpurify_return nnpurify() throws RecognitionException {
        ChemicalChunkerParser.nnpurify_return retval = new ChemicalChunkerParser.nnpurify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal139=null;
        Token TOKEN140=null;

        Object string_literal139_tree=null;
        Object TOKEN140_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpurify");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:140:9: ( 'NN-PURIFY' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:140:10: 'NN-PURIFY' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(140,10);
            string_literal139=(Token)match(input,66,FOLLOW_66_in_nnpurify712); 
            string_literal139_tree = (Object)adaptor.create(string_literal139);
            adaptor.addChild(root_0, string_literal139_tree);

            dbg.location(140,22);
            TOKEN140=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpurify714); 
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
        dbg.location(140, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:143:1: vbquench : 'VB-QUENCH' TOKEN ;
    public final ChemicalChunkerParser.vbquench_return vbquench() throws RecognitionException {
        ChemicalChunkerParser.vbquench_return retval = new ChemicalChunkerParser.vbquench_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal141=null;
        Token TOKEN142=null;

        Object string_literal141_tree=null;
        Object TOKEN142_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbquench");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:143:9: ( 'VB-QUENCH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:143:10: 'VB-QUENCH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(143,10);
            string_literal141=(Token)match(input,67,FOLLOW_67_in_vbquench721); 
            string_literal141_tree = (Object)adaptor.create(string_literal141);
            adaptor.addChild(root_0, string_literal141_tree);

            dbg.location(143,22);
            TOKEN142=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbquench723); 
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
        dbg.location(143, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:146:1: vbrecover : 'VB-RECOVER' TOKEN ;
    public final ChemicalChunkerParser.vbrecover_return vbrecover() throws RecognitionException {
        ChemicalChunkerParser.vbrecover_return retval = new ChemicalChunkerParser.vbrecover_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal143=null;
        Token TOKEN144=null;

        Object string_literal143_tree=null;
        Object TOKEN144_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbrecover");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:146:10: ( 'VB-RECOVER' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:146:11: 'VB-RECOVER' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(146,11);
            string_literal143=(Token)match(input,68,FOLLOW_68_in_vbrecover730); 
            string_literal143_tree = (Object)adaptor.create(string_literal143);
            adaptor.addChild(root_0, string_literal143_tree);

            dbg.location(146,24);
            TOKEN144=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbrecover732); 
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
        dbg.location(146, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:149:1: vbremove : 'VB-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.vbremove_return vbremove() throws RecognitionException {
        ChemicalChunkerParser.vbremove_return retval = new ChemicalChunkerParser.vbremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal145=null;
        Token TOKEN146=null;

        Object string_literal145_tree=null;
        Object TOKEN146_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:149:9: ( 'VB-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:149:10: 'VB-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(149,10);
            string_literal145=(Token)match(input,69,FOLLOW_69_in_vbremove739); 
            string_literal145_tree = (Object)adaptor.create(string_literal145);
            adaptor.addChild(root_0, string_literal145_tree);

            dbg.location(149,22);
            TOKEN146=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbremove741); 
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
        dbg.location(149, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:150:1: nnremove : 'NN-REMOVE' TOKEN ;
    public final ChemicalChunkerParser.nnremove_return nnremove() throws RecognitionException {
        ChemicalChunkerParser.nnremove_return retval = new ChemicalChunkerParser.nnremove_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal147=null;
        Token TOKEN148=null;

        Object string_literal147_tree=null;
        Object TOKEN148_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnremove");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:150:9: ( 'NN-REMOVE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:150:10: 'NN-REMOVE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(150,10);
            string_literal147=(Token)match(input,70,FOLLOW_70_in_nnremove746); 
            string_literal147_tree = (Object)adaptor.create(string_literal147);
            adaptor.addChild(root_0, string_literal147_tree);

            dbg.location(150,22);
            TOKEN148=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnremove748); 
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
        dbg.location(150, 27);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:153:1: vbstir : 'VB-STIR' TOKEN ;
    public final ChemicalChunkerParser.vbstir_return vbstir() throws RecognitionException {
        ChemicalChunkerParser.vbstir_return retval = new ChemicalChunkerParser.vbstir_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal149=null;
        Token TOKEN150=null;

        Object string_literal149_tree=null;
        Object TOKEN150_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbstir");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:153:7: ( 'VB-STIR' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:153:8: 'VB-STIR' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(153,8);
            string_literal149=(Token)match(input,71,FOLLOW_71_in_vbstir755); 
            string_literal149_tree = (Object)adaptor.create(string_literal149);
            adaptor.addChild(root_0, string_literal149_tree);

            dbg.location(153,18);
            TOKEN150=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbstir757); 
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
        dbg.location(153, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:156:1: vbsynthesize : 'VB-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.vbsynthesize_return vbsynthesize() throws RecognitionException {
        ChemicalChunkerParser.vbsynthesize_return retval = new ChemicalChunkerParser.vbsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal151=null;
        Token TOKEN152=null;

        Object string_literal151_tree=null;
        Object TOKEN152_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:156:13: ( 'VB-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:156:14: 'VB-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,14);
            string_literal151=(Token)match(input,72,FOLLOW_72_in_vbsynthesize764); 
            string_literal151_tree = (Object)adaptor.create(string_literal151);
            adaptor.addChild(root_0, string_literal151_tree);

            dbg.location(156,30);
            TOKEN152=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbsynthesize766); 
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
        dbg.location(156, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:157:1: nnsynthesize : 'NN-SYNTHESIZE' TOKEN ;
    public final ChemicalChunkerParser.nnsynthesize_return nnsynthesize() throws RecognitionException {
        ChemicalChunkerParser.nnsynthesize_return retval = new ChemicalChunkerParser.nnsynthesize_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal153=null;
        Token TOKEN154=null;

        Object string_literal153_tree=null;
        Object TOKEN154_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnsynthesize");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:157:13: ( 'NN-SYNTHESIZE' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:157:14: 'NN-SYNTHESIZE' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(157,14);
            string_literal153=(Token)match(input,73,FOLLOW_73_in_nnsynthesize771); 
            string_literal153_tree = (Object)adaptor.create(string_literal153);
            adaptor.addChild(root_0, string_literal153_tree);

            dbg.location(157,30);
            TOKEN154=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnsynthesize773); 
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
        dbg.location(157, 35);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:160:1: vbwait : 'VB-WAIT' TOKEN ;
    public final ChemicalChunkerParser.vbwait_return vbwait() throws RecognitionException {
        ChemicalChunkerParser.vbwait_return retval = new ChemicalChunkerParser.vbwait_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal155=null;
        Token TOKEN156=null;

        Object string_literal155_tree=null;
        Object TOKEN156_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwait");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:160:7: ( 'VB-WAIT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:160:8: 'VB-WAIT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(160,8);
            string_literal155=(Token)match(input,74,FOLLOW_74_in_vbwait780); 
            string_literal155_tree = (Object)adaptor.create(string_literal155);
            adaptor.addChild(root_0, string_literal155_tree);

            dbg.location(160,18);
            TOKEN156=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwait782); 
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
        dbg.location(160, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:163:1: vbwash : 'VB-WASH' TOKEN ;
    public final ChemicalChunkerParser.vbwash_return vbwash() throws RecognitionException {
        ChemicalChunkerParser.vbwash_return retval = new ChemicalChunkerParser.vbwash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal157=null;
        Token TOKEN158=null;

        Object string_literal157_tree=null;
        Object TOKEN158_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbwash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:163:7: ( 'VB-WASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:163:8: 'VB-WASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(163,8);
            string_literal157=(Token)match(input,75,FOLLOW_75_in_vbwash789); 
            string_literal157_tree = (Object)adaptor.create(string_literal157);
            adaptor.addChild(root_0, string_literal157_tree);

            dbg.location(163,18);
            TOKEN158=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbwash791); 
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
        dbg.location(163, 23);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:166:1: vbyield : 'VB-YIELD' TOKEN ;
    public final ChemicalChunkerParser.vbyield_return vbyield() throws RecognitionException {
        ChemicalChunkerParser.vbyield_return retval = new ChemicalChunkerParser.vbyield_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal159=null;
        Token TOKEN160=null;

        Object string_literal159_tree=null;
        Object TOKEN160_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbyield");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:166:8: ( 'VB-YIELD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:166:9: 'VB-YIELD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(166,9);
            string_literal159=(Token)match(input,76,FOLLOW_76_in_vbyield798); 
            string_literal159_tree = (Object)adaptor.create(string_literal159);
            adaptor.addChild(root_0, string_literal159_tree);

            dbg.location(166,20);
            TOKEN160=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbyield800); 
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
        dbg.location(166, 25);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:169:1: colon : 'COLON' TOKEN ;
    public final ChemicalChunkerParser.colon_return colon() throws RecognitionException {
        ChemicalChunkerParser.colon_return retval = new ChemicalChunkerParser.colon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal161=null;
        Token TOKEN162=null;

        Object string_literal161_tree=null;
        Object TOKEN162_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:169:6: ( 'COLON' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:169:7: 'COLON' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(169,7);
            string_literal161=(Token)match(input,77,FOLLOW_77_in_colon807); 
            string_literal161_tree = (Object)adaptor.create(string_literal161);
            adaptor.addChild(root_0, string_literal161_tree);

            dbg.location(169,15);
            TOKEN162=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_colon809); 
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
        dbg.location(169, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:170:1: comma : 'COMMA' TOKEN ;
    public final ChemicalChunkerParser.comma_return comma() throws RecognitionException {
        ChemicalChunkerParser.comma_return retval = new ChemicalChunkerParser.comma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal163=null;
        Token TOKEN164=null;

        Object string_literal163_tree=null;
        Object TOKEN164_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:170:6: ( 'COMMA' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:170:7: 'COMMA' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(170,7);
            string_literal163=(Token)match(input,78,FOLLOW_78_in_comma814); 
            string_literal163_tree = (Object)adaptor.create(string_literal163);
            adaptor.addChild(root_0, string_literal163_tree);

            dbg.location(170,15);
            TOKEN164=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_comma816); 
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
        dbg.location(170, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:171:1: apost : 'APOST' TOKEN ;
    public final ChemicalChunkerParser.apost_return apost() throws RecognitionException {
        ChemicalChunkerParser.apost_return retval = new ChemicalChunkerParser.apost_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal165=null;
        Token TOKEN166=null;

        Object string_literal165_tree=null;
        Object TOKEN166_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "apost");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:171:6: ( 'APOST' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:171:7: 'APOST' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(171,7);
            string_literal165=(Token)match(input,79,FOLLOW_79_in_apost821); 
            string_literal165_tree = (Object)adaptor.create(string_literal165);
            adaptor.addChild(root_0, string_literal165_tree);

            dbg.location(171,15);
            TOKEN166=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_apost823); 
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
        dbg.location(171, 20);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:172:1: neg : 'NEG' TOKEN ;
    public final ChemicalChunkerParser.neg_return neg() throws RecognitionException {
        ChemicalChunkerParser.neg_return retval = new ChemicalChunkerParser.neg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal167=null;
        Token TOKEN168=null;

        Object string_literal167_tree=null;
        Object TOKEN168_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "neg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:172:4: ( 'NEG' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:172:5: 'NEG' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(172,5);
            string_literal167=(Token)match(input,80,FOLLOW_80_in_neg828); 
            string_literal167_tree = (Object)adaptor.create(string_literal167);
            adaptor.addChild(root_0, string_literal167_tree);

            dbg.location(172,11);
            TOKEN168=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_neg830); 
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
        dbg.location(172, 16);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:173:1: dash : 'DASH' TOKEN ;
    public final ChemicalChunkerParser.dash_return dash() throws RecognitionException {
        ChemicalChunkerParser.dash_return retval = new ChemicalChunkerParser.dash_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal169=null;
        Token TOKEN170=null;

        Object string_literal169_tree=null;
        Object TOKEN170_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dash");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:173:5: ( 'DASH' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:173:6: 'DASH' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(173,6);
            string_literal169=(Token)match(input,81,FOLLOW_81_in_dash835); 
            string_literal169_tree = (Object)adaptor.create(string_literal169);
            adaptor.addChild(root_0, string_literal169_tree);

            dbg.location(173,13);
            TOKEN170=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dash837); 
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
        dbg.location(173, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:174:1: stop : 'STOP' TOKEN ;
    public final ChemicalChunkerParser.stop_return stop() throws RecognitionException {
        ChemicalChunkerParser.stop_return retval = new ChemicalChunkerParser.stop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal171=null;
        Token TOKEN172=null;

        Object string_literal171_tree=null;
        Object TOKEN172_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "stop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(174, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:174:5: ( 'STOP' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:174:6: 'STOP' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(174,6);
            string_literal171=(Token)match(input,82,FOLLOW_82_in_stop842); 
            string_literal171_tree = (Object)adaptor.create(string_literal171);
            adaptor.addChild(root_0, string_literal171_tree);

            dbg.location(174,13);
            TOKEN172=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_stop844); 
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
        dbg.location(174, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:175:1: nnpercent : 'NN-PERCENT' TOKEN ;
    public final ChemicalChunkerParser.nnpercent_return nnpercent() throws RecognitionException {
        ChemicalChunkerParser.nnpercent_return retval = new ChemicalChunkerParser.nnpercent_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal173=null;
        Token TOKEN174=null;

        Object string_literal173_tree=null;
        Object TOKEN174_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nnpercent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:175:10: ( 'NN-PERCENT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:175:11: 'NN-PERCENT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(175,11);
            string_literal173=(Token)match(input,83,FOLLOW_83_in_nnpercent849); 
            string_literal173_tree = (Object)adaptor.create(string_literal173);
            adaptor.addChild(root_0, string_literal173_tree);

            dbg.location(175,24);
            TOKEN174=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nnpercent851); 
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
        dbg.location(175, 29);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:176:1: lsqb : 'LSQB' TOKEN ;
    public final ChemicalChunkerParser.lsqb_return lsqb() throws RecognitionException {
        ChemicalChunkerParser.lsqb_return retval = new ChemicalChunkerParser.lsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal175=null;
        Token TOKEN176=null;

        Object string_literal175_tree=null;
        Object TOKEN176_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:176:5: ( 'LSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:176:6: 'LSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(176,6);
            string_literal175=(Token)match(input,84,FOLLOW_84_in_lsqb856); 
            string_literal175_tree = (Object)adaptor.create(string_literal175);
            adaptor.addChild(root_0, string_literal175_tree);

            dbg.location(176,13);
            TOKEN176=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lsqb858); 
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
        dbg.location(176, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:177:1: rsqb : 'RSQB' TOKEN ;
    public final ChemicalChunkerParser.rsqb_return rsqb() throws RecognitionException {
        ChemicalChunkerParser.rsqb_return retval = new ChemicalChunkerParser.rsqb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal177=null;
        Token TOKEN178=null;

        Object string_literal177_tree=null;
        Object TOKEN178_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rsqb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:177:5: ( 'RSQB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:177:6: 'RSQB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(177,6);
            string_literal177=(Token)match(input,85,FOLLOW_85_in_rsqb863); 
            string_literal177_tree = (Object)adaptor.create(string_literal177);
            adaptor.addChild(root_0, string_literal177_tree);

            dbg.location(177,13);
            TOKEN178=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rsqb865); 
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
        dbg.location(177, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:178:1: lrb : '-LRB-' TOKEN ;
    public final ChemicalChunkerParser.lrb_return lrb() throws RecognitionException {
        ChemicalChunkerParser.lrb_return retval = new ChemicalChunkerParser.lrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal179=null;
        Token TOKEN180=null;

        Object string_literal179_tree=null;
        Object TOKEN180_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "lrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:178:4: ( '-LRB-' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:178:5: '-LRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(178,5);
            string_literal179=(Token)match(input,86,FOLLOW_86_in_lrb870); 
            string_literal179_tree = (Object)adaptor.create(string_literal179);
            adaptor.addChild(root_0, string_literal179_tree);

            dbg.location(178,13);
            TOKEN180=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_lrb872); 
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
        dbg.location(178, 18);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:179:1: rrb : '-RRB-' TOKEN ;
    public final ChemicalChunkerParser.rrb_return rrb() throws RecognitionException {
        ChemicalChunkerParser.rrb_return retval = new ChemicalChunkerParser.rrb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal181=null;
        Token TOKEN182=null;

        Object string_literal181_tree=null;
        Object TOKEN182_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rrb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:179:4: ( '-RRB-' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:179:5: '-RRB-' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(179,5);
            string_literal181=(Token)match(input,87,FOLLOW_87_in_rrb877); 
            string_literal181_tree = (Object)adaptor.create(string_literal181);
            adaptor.addChild(root_0, string_literal181_tree);

            dbg.location(179,13);
            TOKEN182=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rrb879); 
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
        dbg.location(179, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rrb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rrb"

    public static class cc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cc"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:183:1: cc : 'CC' TOKEN ;
    public final ChemicalChunkerParser.cc_return cc() throws RecognitionException {
        ChemicalChunkerParser.cc_return retval = new ChemicalChunkerParser.cc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal183=null;
        Token TOKEN184=null;

        Object string_literal183_tree=null;
        Object TOKEN184_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:183:3: ( 'CC' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:183:4: 'CC' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(183,4);
            string_literal183=(Token)match(input,88,FOLLOW_88_in_cc887); 
            string_literal183_tree = (Object)adaptor.create(string_literal183);
            adaptor.addChild(root_0, string_literal183_tree);

            dbg.location(183,9);
            TOKEN184=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cc889); 
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
        dbg.location(183, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:186:1: cd : 'CD' TOKEN ;
    public final ChemicalChunkerParser.cd_return cd() throws RecognitionException {
        ChemicalChunkerParser.cd_return retval = new ChemicalChunkerParser.cd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal185=null;
        Token TOKEN186=null;

        Object string_literal185_tree=null;
        Object TOKEN186_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:186:3: ( 'CD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:186:4: 'CD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(186,4);
            string_literal185=(Token)match(input,89,FOLLOW_89_in_cd896); 
            string_literal185_tree = (Object)adaptor.create(string_literal185);
            adaptor.addChild(root_0, string_literal185_tree);

            dbg.location(186,9);
            TOKEN186=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_cd898); 
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
        dbg.location(186, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:190:1: dt : 'DT' TOKEN ;
    public final ChemicalChunkerParser.dt_return dt() throws RecognitionException {
        ChemicalChunkerParser.dt_return retval = new ChemicalChunkerParser.dt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal187=null;
        Token TOKEN188=null;

        Object string_literal187_tree=null;
        Object TOKEN188_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:190:3: ( 'DT' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:190:4: 'DT' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(190,4);
            string_literal187=(Token)match(input,90,FOLLOW_90_in_dt906); 
            string_literal187_tree = (Object)adaptor.create(string_literal187);
            adaptor.addChild(root_0, string_literal187_tree);

            dbg.location(190,9);
            TOKEN188=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dt908); 
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
        dbg.location(190, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dt"

    public static class jj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jj"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:194:1: jj : 'JJ' TOKEN ;
    public final ChemicalChunkerParser.jj_return jj() throws RecognitionException {
        ChemicalChunkerParser.jj_return retval = new ChemicalChunkerParser.jj_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal189=null;
        Token TOKEN190=null;

        Object string_literal189_tree=null;
        Object TOKEN190_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jj");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:194:3: ( 'JJ' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:194:4: 'JJ' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(194,4);
            string_literal189=(Token)match(input,91,FOLLOW_91_in_jj916); 
            string_literal189_tree = (Object)adaptor.create(string_literal189);
            adaptor.addChild(root_0, string_literal189_tree);

            dbg.location(194,9);
            TOKEN190=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_jj918); 
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
        dbg.location(194, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:196:1: nn : 'NN' TOKEN ;
    public final ChemicalChunkerParser.nn_return nn() throws RecognitionException {
        ChemicalChunkerParser.nn_return retval = new ChemicalChunkerParser.nn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal191=null;
        Token TOKEN192=null;

        Object string_literal191_tree=null;
        Object TOKEN192_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(196, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:196:3: ( 'NN' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:196:4: 'NN' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(196,4);
            string_literal191=(Token)match(input,92,FOLLOW_92_in_nn924); 
            string_literal191_tree = (Object)adaptor.create(string_literal191);
            adaptor.addChild(root_0, string_literal191_tree);

            dbg.location(196,9);
            TOKEN192=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_nn926); 
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
        dbg.location(196, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nn"

    public static class rb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rb"
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:200:1: rb : 'RB' TOKEN ;
    public final ChemicalChunkerParser.rb_return rb() throws RecognitionException {
        ChemicalChunkerParser.rb_return retval = new ChemicalChunkerParser.rb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal193=null;
        Token TOKEN194=null;

        Object string_literal193_tree=null;
        Object TOKEN194_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(200, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:200:3: ( 'RB' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:200:4: 'RB' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(200,4);
            string_literal193=(Token)match(input,93,FOLLOW_93_in_rb934); 
            string_literal193_tree = (Object)adaptor.create(string_literal193);
            adaptor.addChild(root_0, string_literal193_tree);

            dbg.location(200,9);
            TOKEN194=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_rb936); 
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
        dbg.location(200, 14);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:203:1: to : 'TO' TOKEN ;
    public final ChemicalChunkerParser.to_return to() throws RecognitionException {
        ChemicalChunkerParser.to_return retval = new ChemicalChunkerParser.to_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal195=null;
        Token TOKEN196=null;

        Object string_literal195_tree=null;
        Object TOKEN196_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "to");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(203, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:203:3: ( 'TO' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:203:5: 'TO' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(203,5);
            string_literal195=(Token)match(input,94,FOLLOW_94_in_to944); 
            string_literal195_tree = (Object)adaptor.create(string_literal195);
            adaptor.addChild(root_0, string_literal195_tree);

            dbg.location(203,10);
            TOKEN196=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_to946); 
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
        dbg.location(203, 15);

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
    // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:205:1: vbd : 'VBD' TOKEN ;
    public final ChemicalChunkerParser.vbd_return vbd() throws RecognitionException {
        ChemicalChunkerParser.vbd_return retval = new ChemicalChunkerParser.vbd_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal197=null;
        Token TOKEN198=null;

        Object string_literal197_tree=null;
        Object TOKEN198_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vbd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(205, 1);

        try {
            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:205:4: ( 'VBD' TOKEN )
            dbg.enterAlt(1);

            // /home/lezan/NetBeansProjects/chemicaltagger/src/main/java/uk/ac/cam/ch/wwmm/extractPhrases/antlr/ChemicalChunker.g:205:5: 'VBD' TOKEN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(205,5);
            string_literal197=(Token)match(input,95,FOLLOW_95_in_vbd952); 
            string_literal197_tree = (Object)adaptor.create(string_literal197);
            adaptor.addChild(root_0, string_literal197_tree);

            dbg.location(205,11);
            TOKEN198=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_vbd954); 
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
        dbg.location(205, 16);

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


 

    public static final BitSet FOLLOW_sentence_in_document135 = new BitSet(new long[]{0x0000000200000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_cd_in_mol144 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_nnmol_in_mol146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nounphrase_in_sentence156 = new BitSet(new long[]{0x0000010000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_verbphraseADD_in_sentence158 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_prepphrase_in_sentence160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecules_in_nounphrase169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vbd_in_verbphraseADD183 = new BitSet(new long[]{0x0000010000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_vbadd_in_verbphraseADD186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_in_prepphrase197 = new BitSet(new long[]{0x0000000200000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_molecule_in_prepphrase199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_in_gram210 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_nngram_in_gram212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_molecule_in_molecules223 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_cc_in_molecules225 = new BitSet(new long[]{0x0000000200000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_molecule_in_molecules227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dt_in_molecule248 = new BitSet(new long[]{0x0000000200000000L,0x0000000004400000L});
    public static final BitSet FOLLOW_oscarcm_in_molecule251 = new BitSet(new long[]{0x0000000200000000L,0x0000000004400000L});
    public static final BitSet FOLLOW_amount_in_molecule254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lrb_in_amount263 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_gram_in_amount265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comma_in_amount267 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_mol_in_amount270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
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
    public static final BitSet FOLLOW_33_in_oscarcm453 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_oscarcm455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_vbuse462 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbuse464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_vbchange469 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbchange471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_vbsubmerge476 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubmerge478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_vbsubject483 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsubject485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_nnadd492 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnadd494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nnmixture499 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnmixture501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_vbadd506 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbadd508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_vbcharge513 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcharge515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_vbcontain520 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcontain522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_vbdrop527 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdrop529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_vbfill534 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbfill536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_vbsuspend541 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsuspend543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_vbtreat548 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbtreat550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_vbapparatus557 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbapparatus559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_nnapparatus564 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnapparatus566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_vbconcentrate573 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbconcentrate575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_nnconcentrate580 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnconcentrate582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_vbcool589 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbcool591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_vbdegass598 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdegass600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_vbdissolve607 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdissolve609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_vbdry616 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbdry618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_nndry623 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nndry625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_vbextract632 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbextract634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_nnextract639 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnextract641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_vbfilter648 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbfilter650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_nnfilter655 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnfilter657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_vbheat664 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbheat666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_vbincrease671 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbincrease673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_vbpartition680 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbpartition682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_vbprecipitate689 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbprecipitate691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_nnprecipitate696 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnprecipitate698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_vbpurify705 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbpurify707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_nnpurify712 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpurify714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_vbquench721 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbquench723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_vbrecover730 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbrecover732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_vbremove739 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbremove741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_nnremove746 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnremove748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_vbstir755 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbstir757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_vbsynthesize764 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbsynthesize766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_nnsynthesize771 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnsynthesize773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_vbwait780 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbwait782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_vbwash789 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbwash791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_vbyield798 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbyield800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_colon807 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_colon809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_comma814 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_comma816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_apost821 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_apost823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_neg828 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_neg830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_dash835 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dash837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_stop842 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_stop844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_nnpercent849 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nnpercent851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_lsqb856 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_lsqb858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rsqb863 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rsqb865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_lrb870 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_lrb872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rrb877 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rrb879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_cc887 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cc889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_cd896 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_cd898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_dt906 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_dt908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_jj916 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_jj918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_nn924 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_nn926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rb934 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_rb936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_to944 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_to946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_vbd952 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TOKEN_in_vbd954 = new BitSet(new long[]{0x0000000000000002L});

}