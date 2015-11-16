package pl.zgora.jug.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pl.zgora.jug.xtext.services.DemoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_LBRACE", "RULE_RBRACE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'debug'", "'scan'", "'period'", "'appender'", "'root'", "'append-to'", "'logger'", "'.'", "'off'", "'error'", "'warn'", "'info'", "'trace'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_LBRACE=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_RBRACE=7;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDemoDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDemoDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDemoDslParser.tokenNames; }
    public String getGrammarFileName() { return "../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g"; }



     	private DemoDslGrammarAccess grammarAccess;
     	
        public InternalDemoDslParser(TokenStream input, DemoDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LoggerConfig";	
       	}
       	
       	@Override
       	protected DemoDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLoggerConfig"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:68:1: entryRuleLoggerConfig returns [EObject current=null] : iv_ruleLoggerConfig= ruleLoggerConfig EOF ;
    public final EObject entryRuleLoggerConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoggerConfig = null;


        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:69:2: (iv_ruleLoggerConfig= ruleLoggerConfig EOF )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:70:2: iv_ruleLoggerConfig= ruleLoggerConfig EOF
            {
             newCompositeNode(grammarAccess.getLoggerConfigRule()); 
            pushFollow(FOLLOW_ruleLoggerConfig_in_entryRuleLoggerConfig75);
            iv_ruleLoggerConfig=ruleLoggerConfig();

            state._fsp--;

             current =iv_ruleLoggerConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoggerConfig85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoggerConfig"


    // $ANTLR start "ruleLoggerConfig"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:77:1: ruleLoggerConfig returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )* ) ) ) ( (lv_appenders_5_0= ruleAppender ) )+ ( (lv_rootLogger_6_0= ruleRootLogger ) ) ) ;
    public final EObject ruleLoggerConfig() throws RecognitionException {
        EObject current = null;

        Token lv_debug_1_0=null;
        Token lv_scan_2_0=null;
        Token otherlv_3=null;
        Token lv_period_4_0=null;
        EObject lv_appenders_5_0 = null;

        EObject lv_rootLogger_6_0 = null;


         enterRule(); 
            
        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:80:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )* ) ) ) ( (lv_appenders_5_0= ruleAppender ) )+ ( (lv_rootLogger_6_0= ruleRootLogger ) ) ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:81:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )* ) ) ) ( (lv_appenders_5_0= ruleAppender ) )+ ( (lv_rootLogger_6_0= ruleRootLogger ) ) )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:81:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )* ) ) ) ( (lv_appenders_5_0= ruleAppender ) )+ ( (lv_rootLogger_6_0= ruleRootLogger ) ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:81:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )* ) ) ) ( (lv_appenders_5_0= ruleAppender ) )+ ( (lv_rootLogger_6_0= ruleRootLogger ) )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:81:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )* ) ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:83:1: ( ( ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )* ) )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:83:1: ( ( ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )* ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:84:2: ( ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0());
            	
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:87:2: ( ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )* )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:88:3: ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )*
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:88:3: ( ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:90:4: ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) )
            	    {
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:90:4: ({...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) ) )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:91:5: {...}? => ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLoggerConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:91:109: ( ({...}? => ( (lv_debug_1_0= 'debug' ) ) ) )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:92:6: ({...}? => ( (lv_debug_1_0= 'debug' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:95:6: ({...}? => ( (lv_debug_1_0= 'debug' ) ) )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:95:7: {...}? => ( (lv_debug_1_0= 'debug' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLoggerConfig", "true");
            	    }
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:95:16: ( (lv_debug_1_0= 'debug' ) )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:96:1: (lv_debug_1_0= 'debug' )
            	    {
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:96:1: (lv_debug_1_0= 'debug' )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:97:3: lv_debug_1_0= 'debug'
            	    {
            	    lv_debug_1_0=(Token)match(input,13,FOLLOW_13_in_ruleLoggerConfig173); 

            	            newLeafNode(lv_debug_1_0, grammarAccess.getLoggerConfigAccess().getDebugDebugKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLoggerConfigRule());
            	    	        }
            	           		setWithLastConsumed(current, "debug", true, "debug");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:117:4: ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:117:4: ({...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) ) )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:118:5: {...}? => ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLoggerConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:118:109: ( ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) ) )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:119:6: ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:122:6: ({...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? ) )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:122:7: {...}? => ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLoggerConfig", "true");
            	    }
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:122:16: ( ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )? )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:122:17: ( (lv_scan_2_0= 'scan' ) ) (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )?
            	    {
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:122:17: ( (lv_scan_2_0= 'scan' ) )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:123:1: (lv_scan_2_0= 'scan' )
            	    {
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:123:1: (lv_scan_2_0= 'scan' )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:124:3: lv_scan_2_0= 'scan'
            	    {
            	    lv_scan_2_0=(Token)match(input,14,FOLLOW_14_in_ruleLoggerConfig259); 

            	            newLeafNode(lv_scan_2_0, grammarAccess.getLoggerConfigAccess().getScanScanKeyword_0_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLoggerConfigRule());
            	    	        }
            	           		setWithLastConsumed(current, "scan", true, "scan");
            	    	    

            	    }


            	    }

            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:137:2: (otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) ) )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==15) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:137:4: otherlv_3= 'period' ( (lv_period_4_0= RULE_STRING ) )
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleLoggerConfig285); 

            	                	newLeafNode(otherlv_3, grammarAccess.getLoggerConfigAccess().getPeriodKeyword_0_1_1_0());
            	                
            	            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:141:1: ( (lv_period_4_0= RULE_STRING ) )
            	            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:142:1: (lv_period_4_0= RULE_STRING )
            	            {
            	            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:142:1: (lv_period_4_0= RULE_STRING )
            	            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:143:3: lv_period_4_0= RULE_STRING
            	            {
            	            lv_period_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLoggerConfig302); 

            	            			newLeafNode(lv_period_4_0, grammarAccess.getLoggerConfigAccess().getPeriodSTRINGTerminalRuleCall_0_1_1_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLoggerConfigRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"period",
            	                    		lv_period_4_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0());
            	

            }

            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:173:2: ( (lv_appenders_5_0= ruleAppender ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:174:1: (lv_appenders_5_0= ruleAppender )
            	    {
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:174:1: (lv_appenders_5_0= ruleAppender )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:175:3: lv_appenders_5_0= ruleAppender
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLoggerConfigAccess().getAppendersAppenderParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAppender_in_ruleLoggerConfig371);
            	    lv_appenders_5_0=ruleAppender();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLoggerConfigRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"appenders",
            	            		lv_appenders_5_0, 
            	            		"Appender");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:191:3: ( (lv_rootLogger_6_0= ruleRootLogger ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:192:1: (lv_rootLogger_6_0= ruleRootLogger )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:192:1: (lv_rootLogger_6_0= ruleRootLogger )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:193:3: lv_rootLogger_6_0= ruleRootLogger
            {
             
            	        newCompositeNode(grammarAccess.getLoggerConfigAccess().getRootLoggerRootLoggerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRootLogger_in_ruleLoggerConfig393);
            lv_rootLogger_6_0=ruleRootLogger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoggerConfigRule());
            	        }
                   		set(
                   			current, 
                   			"rootLogger",
                    		lv_rootLogger_6_0, 
                    		"RootLogger");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoggerConfig"


    // $ANTLR start "entryRuleAppender"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:217:1: entryRuleAppender returns [EObject current=null] : iv_ruleAppender= ruleAppender EOF ;
    public final EObject entryRuleAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppender = null;


        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:218:2: (iv_ruleAppender= ruleAppender EOF )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:219:2: iv_ruleAppender= ruleAppender EOF
            {
             newCompositeNode(grammarAccess.getAppenderRule()); 
            pushFollow(FOLLOW_ruleAppender_in_entryRuleAppender429);
            iv_ruleAppender=ruleAppender();

            state._fsp--;

             current =iv_ruleAppender; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppender439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppender"


    // $ANTLR start "ruleAppender"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:226:1: ruleAppender returns [EObject current=null] : (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) ( (lv_class_2_0= ruleFQN ) ) ( (lv_pattern_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_pattern_3_0=null;
        AntlrDatatypeRuleToken lv_class_2_0 = null;


         enterRule(); 
            
        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:229:28: ( (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) ( (lv_class_2_0= ruleFQN ) ) ( (lv_pattern_3_0= RULE_STRING ) )? ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:230:1: (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) ( (lv_class_2_0= ruleFQN ) ) ( (lv_pattern_3_0= RULE_STRING ) )? )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:230:1: (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) ( (lv_class_2_0= ruleFQN ) ) ( (lv_pattern_3_0= RULE_STRING ) )? )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:230:3: otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) ( (lv_class_2_0= ruleFQN ) ) ( (lv_pattern_3_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAppender476); 

                	newLeafNode(otherlv_0, grammarAccess.getAppenderAccess().getAppenderKeyword_0());
                
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:234:1: ( (lv_name_1_0= RULE_ID ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:235:1: (lv_name_1_0= RULE_ID )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:235:1: (lv_name_1_0= RULE_ID )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:236:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppender493); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAppenderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAppenderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:252:2: ( (lv_class_2_0= ruleFQN ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:253:1: (lv_class_2_0= ruleFQN )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:253:1: (lv_class_2_0= ruleFQN )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:254:3: lv_class_2_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getAppenderAccess().getClassFQNParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAppender519);
            lv_class_2_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAppenderRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_2_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:270:2: ( (lv_pattern_3_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:271:1: (lv_pattern_3_0= RULE_STRING )
                    {
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:271:1: (lv_pattern_3_0= RULE_STRING )
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:272:3: lv_pattern_3_0= RULE_STRING
                    {
                    lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAppender536); 

                    			newLeafNode(lv_pattern_3_0, grammarAccess.getAppenderAccess().getPatternSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAppenderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pattern",
                            		lv_pattern_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppender"


    // $ANTLR start "entryRuleRootLogger"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:296:1: entryRuleRootLogger returns [EObject current=null] : iv_ruleRootLogger= ruleRootLogger EOF ;
    public final EObject entryRuleRootLogger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootLogger = null;


        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:297:2: (iv_ruleRootLogger= ruleRootLogger EOF )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:298:2: iv_ruleRootLogger= ruleRootLogger EOF
            {
             newCompositeNode(grammarAccess.getRootLoggerRule()); 
            pushFollow(FOLLOW_ruleRootLogger_in_entryRuleRootLogger578);
            iv_ruleRootLogger=ruleRootLogger();

            state._fsp--;

             current =iv_ruleRootLogger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootLogger588); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootLogger"


    // $ANTLR start "ruleRootLogger"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:305:1: ruleRootLogger returns [EObject current=null] : (otherlv_0= 'root' ( (lv_level_1_0= ruleLevel ) ) otherlv_2= 'append-to' ( (otherlv_3= RULE_ID ) )+ (this_LBRACE_4= RULE_LBRACE ( (lv_loggers_5_0= ruleLogger ) )* this_RBRACE_6= RULE_RBRACE )? ) ;
    public final EObject ruleRootLogger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_LBRACE_4=null;
        Token this_RBRACE_6=null;
        Enumerator lv_level_1_0 = null;

        EObject lv_loggers_5_0 = null;


         enterRule(); 
            
        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:308:28: ( (otherlv_0= 'root' ( (lv_level_1_0= ruleLevel ) ) otherlv_2= 'append-to' ( (otherlv_3= RULE_ID ) )+ (this_LBRACE_4= RULE_LBRACE ( (lv_loggers_5_0= ruleLogger ) )* this_RBRACE_6= RULE_RBRACE )? ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:309:1: (otherlv_0= 'root' ( (lv_level_1_0= ruleLevel ) ) otherlv_2= 'append-to' ( (otherlv_3= RULE_ID ) )+ (this_LBRACE_4= RULE_LBRACE ( (lv_loggers_5_0= ruleLogger ) )* this_RBRACE_6= RULE_RBRACE )? )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:309:1: (otherlv_0= 'root' ( (lv_level_1_0= ruleLevel ) ) otherlv_2= 'append-to' ( (otherlv_3= RULE_ID ) )+ (this_LBRACE_4= RULE_LBRACE ( (lv_loggers_5_0= ruleLogger ) )* this_RBRACE_6= RULE_RBRACE )? )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:309:3: otherlv_0= 'root' ( (lv_level_1_0= ruleLevel ) ) otherlv_2= 'append-to' ( (otherlv_3= RULE_ID ) )+ (this_LBRACE_4= RULE_LBRACE ( (lv_loggers_5_0= ruleLogger ) )* this_RBRACE_6= RULE_RBRACE )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleRootLogger625); 

                	newLeafNode(otherlv_0, grammarAccess.getRootLoggerAccess().getRootKeyword_0());
                
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:313:1: ( (lv_level_1_0= ruleLevel ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:314:1: (lv_level_1_0= ruleLevel )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:314:1: (lv_level_1_0= ruleLevel )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:315:3: lv_level_1_0= ruleLevel
            {
             
            	        newCompositeNode(grammarAccess.getRootLoggerAccess().getLevelLevelEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLevel_in_ruleRootLogger646);
            lv_level_1_0=ruleLevel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootLoggerRule());
            	        }
                   		set(
                   			current, 
                   			"level",
                    		lv_level_1_0, 
                    		"Level");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleRootLogger658); 

                	newLeafNode(otherlv_2, grammarAccess.getRootLoggerAccess().getAppendToKeyword_2());
                
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:335:1: ( (otherlv_3= RULE_ID ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:336:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:336:1: (otherlv_3= RULE_ID )
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:337:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRootLoggerRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRootLogger678); 

            	    		newLeafNode(otherlv_3, grammarAccess.getRootLoggerAccess().getAppendersAppenderCrossReference_3_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:348:3: (this_LBRACE_4= RULE_LBRACE ( (lv_loggers_5_0= ruleLogger ) )* this_RBRACE_6= RULE_RBRACE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LBRACE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:348:4: this_LBRACE_4= RULE_LBRACE ( (lv_loggers_5_0= ruleLogger ) )* this_RBRACE_6= RULE_RBRACE
                    {
                    this_LBRACE_4=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleRootLogger691); 
                     
                        newLeafNode(this_LBRACE_4, grammarAccess.getRootLoggerAccess().getLBRACETerminalRuleCall_4_0()); 
                        
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:352:1: ( (lv_loggers_5_0= ruleLogger ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:353:1: (lv_loggers_5_0= ruleLogger )
                    	    {
                    	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:353:1: (lv_loggers_5_0= ruleLogger )
                    	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:354:3: lv_loggers_5_0= ruleLogger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRootLoggerAccess().getLoggersLoggerParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLogger_in_ruleRootLogger711);
                    	    lv_loggers_5_0=ruleLogger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRootLoggerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"loggers",
                    	            		lv_loggers_5_0, 
                    	            		"Logger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    this_RBRACE_6=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleRootLogger723); 
                     
                        newLeafNode(this_RBRACE_6, grammarAccess.getRootLoggerAccess().getRBRACETerminalRuleCall_4_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootLogger"


    // $ANTLR start "entryRuleLogger"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:382:1: entryRuleLogger returns [EObject current=null] : iv_ruleLogger= ruleLogger EOF ;
    public final EObject entryRuleLogger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogger = null;


        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:383:2: (iv_ruleLogger= ruleLogger EOF )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:384:2: iv_ruleLogger= ruleLogger EOF
            {
             newCompositeNode(grammarAccess.getLoggerRule()); 
            pushFollow(FOLLOW_ruleLogger_in_entryRuleLogger760);
            iv_ruleLogger=ruleLogger();

            state._fsp--;

             current =iv_ruleLogger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogger770); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogger"


    // $ANTLR start "ruleLogger"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:391:1: ruleLogger returns [EObject current=null] : (otherlv_0= 'logger' ( (lv_name_1_0= ruleFQN ) ) ( (lv_level_2_0= ruleLevel ) )? (otherlv_3= 'append-to' ( (otherlv_4= RULE_ID ) )+ )? (this_LBRACE_5= RULE_LBRACE ( (lv_loggers_6_0= ruleLogger ) )* this_RBRACE_7= RULE_RBRACE )? ) ;
    public final EObject ruleLogger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_LBRACE_5=null;
        Token this_RBRACE_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_level_2_0 = null;

        EObject lv_loggers_6_0 = null;


         enterRule(); 
            
        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:394:28: ( (otherlv_0= 'logger' ( (lv_name_1_0= ruleFQN ) ) ( (lv_level_2_0= ruleLevel ) )? (otherlv_3= 'append-to' ( (otherlv_4= RULE_ID ) )+ )? (this_LBRACE_5= RULE_LBRACE ( (lv_loggers_6_0= ruleLogger ) )* this_RBRACE_7= RULE_RBRACE )? ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:395:1: (otherlv_0= 'logger' ( (lv_name_1_0= ruleFQN ) ) ( (lv_level_2_0= ruleLevel ) )? (otherlv_3= 'append-to' ( (otherlv_4= RULE_ID ) )+ )? (this_LBRACE_5= RULE_LBRACE ( (lv_loggers_6_0= ruleLogger ) )* this_RBRACE_7= RULE_RBRACE )? )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:395:1: (otherlv_0= 'logger' ( (lv_name_1_0= ruleFQN ) ) ( (lv_level_2_0= ruleLevel ) )? (otherlv_3= 'append-to' ( (otherlv_4= RULE_ID ) )+ )? (this_LBRACE_5= RULE_LBRACE ( (lv_loggers_6_0= ruleLogger ) )* this_RBRACE_7= RULE_RBRACE )? )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:395:3: otherlv_0= 'logger' ( (lv_name_1_0= ruleFQN ) ) ( (lv_level_2_0= ruleLevel ) )? (otherlv_3= 'append-to' ( (otherlv_4= RULE_ID ) )+ )? (this_LBRACE_5= RULE_LBRACE ( (lv_loggers_6_0= ruleLogger ) )* this_RBRACE_7= RULE_RBRACE )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleLogger807); 

                	newLeafNode(otherlv_0, grammarAccess.getLoggerAccess().getLoggerKeyword_0());
                
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:399:1: ( (lv_name_1_0= ruleFQN ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:400:1: (lv_name_1_0= ruleFQN )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:400:1: (lv_name_1_0= ruleFQN )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:401:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getLoggerAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleLogger828);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoggerRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:417:2: ( (lv_level_2_0= ruleLevel ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13||(LA8_0>=21 && LA8_0<=25)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:418:1: (lv_level_2_0= ruleLevel )
                    {
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:418:1: (lv_level_2_0= ruleLevel )
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:419:3: lv_level_2_0= ruleLevel
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoggerAccess().getLevelLevelEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLevel_in_ruleLogger849);
                    lv_level_2_0=ruleLevel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoggerRule());
                    	        }
                           		set(
                           			current, 
                           			"level",
                            		lv_level_2_0, 
                            		"Level");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:435:3: (otherlv_3= 'append-to' ( (otherlv_4= RULE_ID ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:435:5: otherlv_3= 'append-to' ( (otherlv_4= RULE_ID ) )+
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleLogger863); 

                        	newLeafNode(otherlv_3, grammarAccess.getLoggerAccess().getAppendToKeyword_3_0());
                        
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:439:1: ( (otherlv_4= RULE_ID ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:440:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:440:1: (otherlv_4= RULE_ID )
                    	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:441:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getLoggerRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLogger883); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getLoggerAccess().getAppendersAppenderCrossReference_3_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }

            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:452:5: (this_LBRACE_5= RULE_LBRACE ( (lv_loggers_6_0= ruleLogger ) )* this_RBRACE_7= RULE_RBRACE )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LBRACE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:452:6: this_LBRACE_5= RULE_LBRACE ( (lv_loggers_6_0= ruleLogger ) )* this_RBRACE_7= RULE_RBRACE
                    {
                    this_LBRACE_5=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleLogger898); 
                     
                        newLeafNode(this_LBRACE_5, grammarAccess.getLoggerAccess().getLBRACETerminalRuleCall_4_0()); 
                        
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:456:1: ( (lv_loggers_6_0= ruleLogger ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:457:1: (lv_loggers_6_0= ruleLogger )
                    	    {
                    	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:457:1: (lv_loggers_6_0= ruleLogger )
                    	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:458:3: lv_loggers_6_0= ruleLogger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLoggerAccess().getLoggersLoggerParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLogger_in_ruleLogger918);
                    	    lv_loggers_6_0=ruleLogger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLoggerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"loggers",
                    	            		lv_loggers_6_0, 
                    	            		"Logger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    this_RBRACE_7=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleLogger930); 
                     
                        newLeafNode(this_RBRACE_7, grammarAccess.getLoggerAccess().getRBRACETerminalRuleCall_4_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogger"


    // $ANTLR start "entryRuleFQN"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:486:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:487:2: (iv_ruleFQN= ruleFQN EOF )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:488:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN968);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN979); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:495:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:498:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:499:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:499:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:499:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1019); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:506:1: (kw= '.' this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:507:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleFQN1038); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1053); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleLevel"
    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:529:1: ruleLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'off' ) | (enumLiteral_1= 'error' ) | (enumLiteral_2= 'warn' ) | (enumLiteral_3= 'info' ) | (enumLiteral_4= 'debug' ) | (enumLiteral_5= 'trace' ) ) ;
    public final Enumerator ruleLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:531:28: ( ( (enumLiteral_0= 'off' ) | (enumLiteral_1= 'error' ) | (enumLiteral_2= 'warn' ) | (enumLiteral_3= 'info' ) | (enumLiteral_4= 'debug' ) | (enumLiteral_5= 'trace' ) ) )
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:532:1: ( (enumLiteral_0= 'off' ) | (enumLiteral_1= 'error' ) | (enumLiteral_2= 'warn' ) | (enumLiteral_3= 'info' ) | (enumLiteral_4= 'debug' ) | (enumLiteral_5= 'trace' ) )
            {
            // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:532:1: ( (enumLiteral_0= 'off' ) | (enumLiteral_1= 'error' ) | (enumLiteral_2= 'warn' ) | (enumLiteral_3= 'info' ) | (enumLiteral_4= 'debug' ) | (enumLiteral_5= 'trace' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 22:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            case 24:
                {
                alt14=4;
                }
                break;
            case 13:
                {
                alt14=5;
                }
                break;
            case 25:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:532:2: (enumLiteral_0= 'off' )
                    {
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:532:2: (enumLiteral_0= 'off' )
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:532:4: enumLiteral_0= 'off'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleLevel1116); 

                            current = grammarAccess.getLevelAccess().getOFFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLevelAccess().getOFFEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:538:6: (enumLiteral_1= 'error' )
                    {
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:538:6: (enumLiteral_1= 'error' )
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:538:8: enumLiteral_1= 'error'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleLevel1133); 

                            current = grammarAccess.getLevelAccess().getERROREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLevelAccess().getERROREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:544:6: (enumLiteral_2= 'warn' )
                    {
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:544:6: (enumLiteral_2= 'warn' )
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:544:8: enumLiteral_2= 'warn'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_23_in_ruleLevel1150); 

                            current = grammarAccess.getLevelAccess().getWARNINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLevelAccess().getWARNINGEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:550:6: (enumLiteral_3= 'info' )
                    {
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:550:6: (enumLiteral_3= 'info' )
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:550:8: enumLiteral_3= 'info'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_24_in_ruleLevel1167); 

                            current = grammarAccess.getLevelAccess().getINFOEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLevelAccess().getINFOEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:556:6: (enumLiteral_4= 'debug' )
                    {
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:556:6: (enumLiteral_4= 'debug' )
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:556:8: enumLiteral_4= 'debug'
                    {
                    enumLiteral_4=(Token)match(input,13,FOLLOW_13_in_ruleLevel1184); 

                            current = grammarAccess.getLevelAccess().getDEBUGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLevelAccess().getDEBUGEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:562:6: (enumLiteral_5= 'trace' )
                    {
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:562:6: (enumLiteral_5= 'trace' )
                    // ../pl.zgora.jug.xtext.demo/src-gen/pl/zgora/jug/xtext/parser/antlr/internal/InternalDemoDsl.g:562:8: enumLiteral_5= 'trace'
                    {
                    enumLiteral_5=(Token)match(input,25,FOLLOW_25_in_ruleLevel1201); 

                            current = grammarAccess.getLevelAccess().getTRACEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getLevelAccess().getTRACEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLevel"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLoggerConfig_in_entryRuleLoggerConfig75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoggerConfig85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLoggerConfig173 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_14_in_ruleLoggerConfig259 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_15_in_ruleLoggerConfig285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLoggerConfig302 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_ruleAppender_in_ruleLoggerConfig371 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleRootLogger_in_ruleLoggerConfig393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppender_in_entryRuleAppender429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppender439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAppender476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppender493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAppender519 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAppender536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootLogger_in_entryRuleRootLogger578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootLogger588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRootLogger625 = new BitSet(new long[]{0x0000000003E02000L});
    public static final BitSet FOLLOW_ruleLevel_in_ruleRootLogger646 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRootLogger658 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRootLogger678 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleRootLogger691 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_ruleLogger_in_ruleRootLogger711 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleRootLogger723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogger_in_entryRuleLogger760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogger770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleLogger807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLogger828 = new BitSet(new long[]{0x0000000003E42042L});
    public static final BitSet FOLLOW_ruleLevel_in_ruleLogger849 = new BitSet(new long[]{0x0000000000040042L});
    public static final BitSet FOLLOW_18_in_ruleLogger863 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLogger883 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleLogger898 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_ruleLogger_in_ruleLogger918 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleLogger930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1019 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFQN1038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1053 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21_in_ruleLevel1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLevel1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLevel1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLevel1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLevel1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLevel1201 = new BitSet(new long[]{0x0000000000000002L});

}
