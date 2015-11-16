package pl.zgora.jug.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import pl.zgora.jug.xtext.services.DemoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LBRACE", "RULE_RBRACE", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'off'", "'error'", "'warn'", "'info'", "'debug'", "'trace'", "'period'", "'appender'", "'root'", "'append-to'", "'logger'", "'.'", "'scan'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_LBRACE=4;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_RBRACE=5;
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
    public String getGrammarFileName() { return "../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g"; }


     
     	private DemoDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DemoDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleLoggerConfig"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:60:1: entryRuleLoggerConfig : ruleLoggerConfig EOF ;
    public final void entryRuleLoggerConfig() throws RecognitionException {
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:61:1: ( ruleLoggerConfig EOF )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:62:1: ruleLoggerConfig EOF
            {
             before(grammarAccess.getLoggerConfigRule()); 
            pushFollow(FOLLOW_ruleLoggerConfig_in_entryRuleLoggerConfig61);
            ruleLoggerConfig();

            state._fsp--;

             after(grammarAccess.getLoggerConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoggerConfig68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoggerConfig"


    // $ANTLR start "ruleLoggerConfig"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:69:1: ruleLoggerConfig : ( ( rule__LoggerConfig__Group__0 ) ) ;
    public final void ruleLoggerConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:73:2: ( ( ( rule__LoggerConfig__Group__0 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:74:1: ( ( rule__LoggerConfig__Group__0 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:74:1: ( ( rule__LoggerConfig__Group__0 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:75:1: ( rule__LoggerConfig__Group__0 )
            {
             before(grammarAccess.getLoggerConfigAccess().getGroup()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:76:1: ( rule__LoggerConfig__Group__0 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:76:2: rule__LoggerConfig__Group__0
            {
            pushFollow(FOLLOW_rule__LoggerConfig__Group__0_in_ruleLoggerConfig94);
            rule__LoggerConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoggerConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoggerConfig"


    // $ANTLR start "entryRuleAppender"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:88:1: entryRuleAppender : ruleAppender EOF ;
    public final void entryRuleAppender() throws RecognitionException {
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:89:1: ( ruleAppender EOF )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:90:1: ruleAppender EOF
            {
             before(grammarAccess.getAppenderRule()); 
            pushFollow(FOLLOW_ruleAppender_in_entryRuleAppender121);
            ruleAppender();

            state._fsp--;

             after(grammarAccess.getAppenderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppender128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppender"


    // $ANTLR start "ruleAppender"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:97:1: ruleAppender : ( ( rule__Appender__Group__0 ) ) ;
    public final void ruleAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:101:2: ( ( ( rule__Appender__Group__0 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:102:1: ( ( rule__Appender__Group__0 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:102:1: ( ( rule__Appender__Group__0 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:103:1: ( rule__Appender__Group__0 )
            {
             before(grammarAccess.getAppenderAccess().getGroup()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:104:1: ( rule__Appender__Group__0 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:104:2: rule__Appender__Group__0
            {
            pushFollow(FOLLOW_rule__Appender__Group__0_in_ruleAppender154);
            rule__Appender__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppenderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppender"


    // $ANTLR start "entryRuleRootLogger"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:116:1: entryRuleRootLogger : ruleRootLogger EOF ;
    public final void entryRuleRootLogger() throws RecognitionException {
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:117:1: ( ruleRootLogger EOF )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:118:1: ruleRootLogger EOF
            {
             before(grammarAccess.getRootLoggerRule()); 
            pushFollow(FOLLOW_ruleRootLogger_in_entryRuleRootLogger181);
            ruleRootLogger();

            state._fsp--;

             after(grammarAccess.getRootLoggerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootLogger188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRootLogger"


    // $ANTLR start "ruleRootLogger"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:125:1: ruleRootLogger : ( ( rule__RootLogger__Group__0 ) ) ;
    public final void ruleRootLogger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:129:2: ( ( ( rule__RootLogger__Group__0 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:130:1: ( ( rule__RootLogger__Group__0 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:130:1: ( ( rule__RootLogger__Group__0 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:131:1: ( rule__RootLogger__Group__0 )
            {
             before(grammarAccess.getRootLoggerAccess().getGroup()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:132:1: ( rule__RootLogger__Group__0 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:132:2: rule__RootLogger__Group__0
            {
            pushFollow(FOLLOW_rule__RootLogger__Group__0_in_ruleRootLogger214);
            rule__RootLogger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootLoggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootLogger"


    // $ANTLR start "entryRuleLogger"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:144:1: entryRuleLogger : ruleLogger EOF ;
    public final void entryRuleLogger() throws RecognitionException {
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:145:1: ( ruleLogger EOF )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:146:1: ruleLogger EOF
            {
             before(grammarAccess.getLoggerRule()); 
            pushFollow(FOLLOW_ruleLogger_in_entryRuleLogger241);
            ruleLogger();

            state._fsp--;

             after(grammarAccess.getLoggerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogger248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogger"


    // $ANTLR start "ruleLogger"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:153:1: ruleLogger : ( ( rule__Logger__Group__0 ) ) ;
    public final void ruleLogger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:157:2: ( ( ( rule__Logger__Group__0 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:158:1: ( ( rule__Logger__Group__0 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:158:1: ( ( rule__Logger__Group__0 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:159:1: ( rule__Logger__Group__0 )
            {
             before(grammarAccess.getLoggerAccess().getGroup()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:160:1: ( rule__Logger__Group__0 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:160:2: rule__Logger__Group__0
            {
            pushFollow(FOLLOW_rule__Logger__Group__0_in_ruleLogger274);
            rule__Logger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogger"


    // $ANTLR start "entryRuleFQN"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:172:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:173:1: ( ruleFQN EOF )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:174:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN301);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:181:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:185:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:186:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:186:1: ( ( rule__FQN__Group__0 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:187:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:188:1: ( rule__FQN__Group__0 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:188:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN334);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleLevel"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:203:1: ruleLevel : ( ( rule__Level__Alternatives ) ) ;
    public final void ruleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:207:1: ( ( ( rule__Level__Alternatives ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:208:1: ( ( rule__Level__Alternatives ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:208:1: ( ( rule__Level__Alternatives ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:209:1: ( rule__Level__Alternatives )
            {
             before(grammarAccess.getLevelAccess().getAlternatives()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:210:1: ( rule__Level__Alternatives )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:210:2: rule__Level__Alternatives
            {
            pushFollow(FOLLOW_rule__Level__Alternatives_in_ruleLevel373);
            rule__Level__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLevel"


    // $ANTLR start "rule__Level__Alternatives"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:222:1: rule__Level__Alternatives : ( ( ( 'off' ) ) | ( ( 'error' ) ) | ( ( 'warn' ) ) | ( ( 'info' ) ) | ( ( 'debug' ) ) | ( ( 'trace' ) ) );
    public final void rule__Level__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:226:1: ( ( ( 'off' ) ) | ( ( 'error' ) ) | ( ( 'warn' ) ) | ( ( 'info' ) ) | ( ( 'debug' ) ) | ( ( 'trace' ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            case 17:
                {
                alt1=5;
                }
                break;
            case 18:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:227:1: ( ( 'off' ) )
                    {
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:227:1: ( ( 'off' ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:228:1: ( 'off' )
                    {
                     before(grammarAccess.getLevelAccess().getOFFEnumLiteralDeclaration_0()); 
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:229:1: ( 'off' )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:229:3: 'off'
                    {
                    match(input,13,FOLLOW_13_in_rule__Level__Alternatives410); 

                    }

                     after(grammarAccess.getLevelAccess().getOFFEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:234:6: ( ( 'error' ) )
                    {
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:234:6: ( ( 'error' ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:235:1: ( 'error' )
                    {
                     before(grammarAccess.getLevelAccess().getERROREnumLiteralDeclaration_1()); 
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:236:1: ( 'error' )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:236:3: 'error'
                    {
                    match(input,14,FOLLOW_14_in_rule__Level__Alternatives431); 

                    }

                     after(grammarAccess.getLevelAccess().getERROREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:241:6: ( ( 'warn' ) )
                    {
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:241:6: ( ( 'warn' ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:242:1: ( 'warn' )
                    {
                     before(grammarAccess.getLevelAccess().getWARNINGEnumLiteralDeclaration_2()); 
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:243:1: ( 'warn' )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:243:3: 'warn'
                    {
                    match(input,15,FOLLOW_15_in_rule__Level__Alternatives452); 

                    }

                     after(grammarAccess.getLevelAccess().getWARNINGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:248:6: ( ( 'info' ) )
                    {
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:248:6: ( ( 'info' ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:249:1: ( 'info' )
                    {
                     before(grammarAccess.getLevelAccess().getINFOEnumLiteralDeclaration_3()); 
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:250:1: ( 'info' )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:250:3: 'info'
                    {
                    match(input,16,FOLLOW_16_in_rule__Level__Alternatives473); 

                    }

                     after(grammarAccess.getLevelAccess().getINFOEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:255:6: ( ( 'debug' ) )
                    {
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:255:6: ( ( 'debug' ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:256:1: ( 'debug' )
                    {
                     before(grammarAccess.getLevelAccess().getDEBUGEnumLiteralDeclaration_4()); 
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:257:1: ( 'debug' )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:257:3: 'debug'
                    {
                    match(input,17,FOLLOW_17_in_rule__Level__Alternatives494); 

                    }

                     after(grammarAccess.getLevelAccess().getDEBUGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:262:6: ( ( 'trace' ) )
                    {
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:262:6: ( ( 'trace' ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:263:1: ( 'trace' )
                    {
                     before(grammarAccess.getLevelAccess().getTRACEEnumLiteralDeclaration_5()); 
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:264:1: ( 'trace' )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:264:3: 'trace'
                    {
                    match(input,18,FOLLOW_18_in_rule__Level__Alternatives515); 

                    }

                     after(grammarAccess.getLevelAccess().getTRACEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Level__Alternatives"


    // $ANTLR start "rule__LoggerConfig__Group__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:276:1: rule__LoggerConfig__Group__0 : rule__LoggerConfig__Group__0__Impl rule__LoggerConfig__Group__1 ;
    public final void rule__LoggerConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:280:1: ( rule__LoggerConfig__Group__0__Impl rule__LoggerConfig__Group__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:281:2: rule__LoggerConfig__Group__0__Impl rule__LoggerConfig__Group__1
            {
            pushFollow(FOLLOW_rule__LoggerConfig__Group__0__Impl_in_rule__LoggerConfig__Group__0548);
            rule__LoggerConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoggerConfig__Group__1_in_rule__LoggerConfig__Group__0551);
            rule__LoggerConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group__0"


    // $ANTLR start "rule__LoggerConfig__Group__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:288:1: rule__LoggerConfig__Group__0__Impl : ( ( rule__LoggerConfig__UnorderedGroup_0 ) ) ;
    public final void rule__LoggerConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:292:1: ( ( ( rule__LoggerConfig__UnorderedGroup_0 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:293:1: ( ( rule__LoggerConfig__UnorderedGroup_0 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:293:1: ( ( rule__LoggerConfig__UnorderedGroup_0 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:294:1: ( rule__LoggerConfig__UnorderedGroup_0 )
            {
             before(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:295:1: ( rule__LoggerConfig__UnorderedGroup_0 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:295:2: rule__LoggerConfig__UnorderedGroup_0
            {
            pushFollow(FOLLOW_rule__LoggerConfig__UnorderedGroup_0_in_rule__LoggerConfig__Group__0__Impl578);
            rule__LoggerConfig__UnorderedGroup_0();

            state._fsp--;


            }

             after(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group__0__Impl"


    // $ANTLR start "rule__LoggerConfig__Group__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:305:1: rule__LoggerConfig__Group__1 : rule__LoggerConfig__Group__1__Impl rule__LoggerConfig__Group__2 ;
    public final void rule__LoggerConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:309:1: ( rule__LoggerConfig__Group__1__Impl rule__LoggerConfig__Group__2 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:310:2: rule__LoggerConfig__Group__1__Impl rule__LoggerConfig__Group__2
            {
            pushFollow(FOLLOW_rule__LoggerConfig__Group__1__Impl_in_rule__LoggerConfig__Group__1608);
            rule__LoggerConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoggerConfig__Group__2_in_rule__LoggerConfig__Group__1611);
            rule__LoggerConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group__1"


    // $ANTLR start "rule__LoggerConfig__Group__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:317:1: rule__LoggerConfig__Group__1__Impl : ( ( ( rule__LoggerConfig__AppendersAssignment_1 ) ) ( ( rule__LoggerConfig__AppendersAssignment_1 )* ) ) ;
    public final void rule__LoggerConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:321:1: ( ( ( ( rule__LoggerConfig__AppendersAssignment_1 ) ) ( ( rule__LoggerConfig__AppendersAssignment_1 )* ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:322:1: ( ( ( rule__LoggerConfig__AppendersAssignment_1 ) ) ( ( rule__LoggerConfig__AppendersAssignment_1 )* ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:322:1: ( ( ( rule__LoggerConfig__AppendersAssignment_1 ) ) ( ( rule__LoggerConfig__AppendersAssignment_1 )* ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:323:1: ( ( rule__LoggerConfig__AppendersAssignment_1 ) ) ( ( rule__LoggerConfig__AppendersAssignment_1 )* )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:323:1: ( ( rule__LoggerConfig__AppendersAssignment_1 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:324:1: ( rule__LoggerConfig__AppendersAssignment_1 )
            {
             before(grammarAccess.getLoggerConfigAccess().getAppendersAssignment_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:325:1: ( rule__LoggerConfig__AppendersAssignment_1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:325:2: rule__LoggerConfig__AppendersAssignment_1
            {
            pushFollow(FOLLOW_rule__LoggerConfig__AppendersAssignment_1_in_rule__LoggerConfig__Group__1__Impl640);
            rule__LoggerConfig__AppendersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoggerConfigAccess().getAppendersAssignment_1()); 

            }

            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:328:1: ( ( rule__LoggerConfig__AppendersAssignment_1 )* )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:329:1: ( rule__LoggerConfig__AppendersAssignment_1 )*
            {
             before(grammarAccess.getLoggerConfigAccess().getAppendersAssignment_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:330:1: ( rule__LoggerConfig__AppendersAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:330:2: rule__LoggerConfig__AppendersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__LoggerConfig__AppendersAssignment_1_in_rule__LoggerConfig__Group__1__Impl652);
            	    rule__LoggerConfig__AppendersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getLoggerConfigAccess().getAppendersAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group__1__Impl"


    // $ANTLR start "rule__LoggerConfig__Group__2"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:341:1: rule__LoggerConfig__Group__2 : rule__LoggerConfig__Group__2__Impl ;
    public final void rule__LoggerConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:345:1: ( rule__LoggerConfig__Group__2__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:346:2: rule__LoggerConfig__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LoggerConfig__Group__2__Impl_in_rule__LoggerConfig__Group__2685);
            rule__LoggerConfig__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group__2"


    // $ANTLR start "rule__LoggerConfig__Group__2__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:352:1: rule__LoggerConfig__Group__2__Impl : ( ( rule__LoggerConfig__RootLoggerAssignment_2 ) ) ;
    public final void rule__LoggerConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:356:1: ( ( ( rule__LoggerConfig__RootLoggerAssignment_2 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:357:1: ( ( rule__LoggerConfig__RootLoggerAssignment_2 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:357:1: ( ( rule__LoggerConfig__RootLoggerAssignment_2 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:358:1: ( rule__LoggerConfig__RootLoggerAssignment_2 )
            {
             before(grammarAccess.getLoggerConfigAccess().getRootLoggerAssignment_2()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:359:1: ( rule__LoggerConfig__RootLoggerAssignment_2 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:359:2: rule__LoggerConfig__RootLoggerAssignment_2
            {
            pushFollow(FOLLOW_rule__LoggerConfig__RootLoggerAssignment_2_in_rule__LoggerConfig__Group__2__Impl712);
            rule__LoggerConfig__RootLoggerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoggerConfigAccess().getRootLoggerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group__2__Impl"


    // $ANTLR start "rule__LoggerConfig__Group_0_1__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:375:1: rule__LoggerConfig__Group_0_1__0 : rule__LoggerConfig__Group_0_1__0__Impl rule__LoggerConfig__Group_0_1__1 ;
    public final void rule__LoggerConfig__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:379:1: ( rule__LoggerConfig__Group_0_1__0__Impl rule__LoggerConfig__Group_0_1__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:380:2: rule__LoggerConfig__Group_0_1__0__Impl rule__LoggerConfig__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__LoggerConfig__Group_0_1__0__Impl_in_rule__LoggerConfig__Group_0_1__0748);
            rule__LoggerConfig__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoggerConfig__Group_0_1__1_in_rule__LoggerConfig__Group_0_1__0751);
            rule__LoggerConfig__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group_0_1__0"


    // $ANTLR start "rule__LoggerConfig__Group_0_1__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:387:1: rule__LoggerConfig__Group_0_1__0__Impl : ( ( rule__LoggerConfig__ScanAssignment_0_1_0 ) ) ;
    public final void rule__LoggerConfig__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:391:1: ( ( ( rule__LoggerConfig__ScanAssignment_0_1_0 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:392:1: ( ( rule__LoggerConfig__ScanAssignment_0_1_0 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:392:1: ( ( rule__LoggerConfig__ScanAssignment_0_1_0 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:393:1: ( rule__LoggerConfig__ScanAssignment_0_1_0 )
            {
             before(grammarAccess.getLoggerConfigAccess().getScanAssignment_0_1_0()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:394:1: ( rule__LoggerConfig__ScanAssignment_0_1_0 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:394:2: rule__LoggerConfig__ScanAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__LoggerConfig__ScanAssignment_0_1_0_in_rule__LoggerConfig__Group_0_1__0__Impl778);
            rule__LoggerConfig__ScanAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLoggerConfigAccess().getScanAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group_0_1__0__Impl"


    // $ANTLR start "rule__LoggerConfig__Group_0_1__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:404:1: rule__LoggerConfig__Group_0_1__1 : rule__LoggerConfig__Group_0_1__1__Impl ;
    public final void rule__LoggerConfig__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:408:1: ( rule__LoggerConfig__Group_0_1__1__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:409:2: rule__LoggerConfig__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LoggerConfig__Group_0_1__1__Impl_in_rule__LoggerConfig__Group_0_1__1808);
            rule__LoggerConfig__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group_0_1__1"


    // $ANTLR start "rule__LoggerConfig__Group_0_1__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:415:1: rule__LoggerConfig__Group_0_1__1__Impl : ( ( rule__LoggerConfig__Group_0_1_1__0 )? ) ;
    public final void rule__LoggerConfig__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:419:1: ( ( ( rule__LoggerConfig__Group_0_1_1__0 )? ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:420:1: ( ( rule__LoggerConfig__Group_0_1_1__0 )? )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:420:1: ( ( rule__LoggerConfig__Group_0_1_1__0 )? )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:421:1: ( rule__LoggerConfig__Group_0_1_1__0 )?
            {
             before(grammarAccess.getLoggerConfigAccess().getGroup_0_1_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:422:1: ( rule__LoggerConfig__Group_0_1_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:422:2: rule__LoggerConfig__Group_0_1_1__0
                    {
                    pushFollow(FOLLOW_rule__LoggerConfig__Group_0_1_1__0_in_rule__LoggerConfig__Group_0_1__1__Impl835);
                    rule__LoggerConfig__Group_0_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoggerConfigAccess().getGroup_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group_0_1__1__Impl"


    // $ANTLR start "rule__LoggerConfig__Group_0_1_1__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:436:1: rule__LoggerConfig__Group_0_1_1__0 : rule__LoggerConfig__Group_0_1_1__0__Impl rule__LoggerConfig__Group_0_1_1__1 ;
    public final void rule__LoggerConfig__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:440:1: ( rule__LoggerConfig__Group_0_1_1__0__Impl rule__LoggerConfig__Group_0_1_1__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:441:2: rule__LoggerConfig__Group_0_1_1__0__Impl rule__LoggerConfig__Group_0_1_1__1
            {
            pushFollow(FOLLOW_rule__LoggerConfig__Group_0_1_1__0__Impl_in_rule__LoggerConfig__Group_0_1_1__0870);
            rule__LoggerConfig__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LoggerConfig__Group_0_1_1__1_in_rule__LoggerConfig__Group_0_1_1__0873);
            rule__LoggerConfig__Group_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group_0_1_1__0"


    // $ANTLR start "rule__LoggerConfig__Group_0_1_1__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:448:1: rule__LoggerConfig__Group_0_1_1__0__Impl : ( 'period' ) ;
    public final void rule__LoggerConfig__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:452:1: ( ( 'period' ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:453:1: ( 'period' )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:453:1: ( 'period' )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:454:1: 'period'
            {
             before(grammarAccess.getLoggerConfigAccess().getPeriodKeyword_0_1_1_0()); 
            match(input,19,FOLLOW_19_in_rule__LoggerConfig__Group_0_1_1__0__Impl901); 
             after(grammarAccess.getLoggerConfigAccess().getPeriodKeyword_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__LoggerConfig__Group_0_1_1__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:467:1: rule__LoggerConfig__Group_0_1_1__1 : rule__LoggerConfig__Group_0_1_1__1__Impl ;
    public final void rule__LoggerConfig__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:471:1: ( rule__LoggerConfig__Group_0_1_1__1__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:472:2: rule__LoggerConfig__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LoggerConfig__Group_0_1_1__1__Impl_in_rule__LoggerConfig__Group_0_1_1__1932);
            rule__LoggerConfig__Group_0_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group_0_1_1__1"


    // $ANTLR start "rule__LoggerConfig__Group_0_1_1__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:478:1: rule__LoggerConfig__Group_0_1_1__1__Impl : ( ( rule__LoggerConfig__PeriodAssignment_0_1_1_1 ) ) ;
    public final void rule__LoggerConfig__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:482:1: ( ( ( rule__LoggerConfig__PeriodAssignment_0_1_1_1 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:483:1: ( ( rule__LoggerConfig__PeriodAssignment_0_1_1_1 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:483:1: ( ( rule__LoggerConfig__PeriodAssignment_0_1_1_1 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:484:1: ( rule__LoggerConfig__PeriodAssignment_0_1_1_1 )
            {
             before(grammarAccess.getLoggerConfigAccess().getPeriodAssignment_0_1_1_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:485:1: ( rule__LoggerConfig__PeriodAssignment_0_1_1_1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:485:2: rule__LoggerConfig__PeriodAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_rule__LoggerConfig__PeriodAssignment_0_1_1_1_in_rule__LoggerConfig__Group_0_1_1__1__Impl959);
            rule__LoggerConfig__PeriodAssignment_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLoggerConfigAccess().getPeriodAssignment_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__Appender__Group__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:499:1: rule__Appender__Group__0 : rule__Appender__Group__0__Impl rule__Appender__Group__1 ;
    public final void rule__Appender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:503:1: ( rule__Appender__Group__0__Impl rule__Appender__Group__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:504:2: rule__Appender__Group__0__Impl rule__Appender__Group__1
            {
            pushFollow(FOLLOW_rule__Appender__Group__0__Impl_in_rule__Appender__Group__0993);
            rule__Appender__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Appender__Group__1_in_rule__Appender__Group__0996);
            rule__Appender__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__Group__0"


    // $ANTLR start "rule__Appender__Group__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:511:1: rule__Appender__Group__0__Impl : ( 'appender' ) ;
    public final void rule__Appender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:515:1: ( ( 'appender' ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:516:1: ( 'appender' )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:516:1: ( 'appender' )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:517:1: 'appender'
            {
             before(grammarAccess.getAppenderAccess().getAppenderKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Appender__Group__0__Impl1024); 
             after(grammarAccess.getAppenderAccess().getAppenderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__Group__0__Impl"


    // $ANTLR start "rule__Appender__Group__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:530:1: rule__Appender__Group__1 : rule__Appender__Group__1__Impl rule__Appender__Group__2 ;
    public final void rule__Appender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:534:1: ( rule__Appender__Group__1__Impl rule__Appender__Group__2 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:535:2: rule__Appender__Group__1__Impl rule__Appender__Group__2
            {
            pushFollow(FOLLOW_rule__Appender__Group__1__Impl_in_rule__Appender__Group__11055);
            rule__Appender__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Appender__Group__2_in_rule__Appender__Group__11058);
            rule__Appender__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__Group__1"


    // $ANTLR start "rule__Appender__Group__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:542:1: rule__Appender__Group__1__Impl : ( ( rule__Appender__NameAssignment_1 ) ) ;
    public final void rule__Appender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:546:1: ( ( ( rule__Appender__NameAssignment_1 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:547:1: ( ( rule__Appender__NameAssignment_1 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:547:1: ( ( rule__Appender__NameAssignment_1 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:548:1: ( rule__Appender__NameAssignment_1 )
            {
             before(grammarAccess.getAppenderAccess().getNameAssignment_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:549:1: ( rule__Appender__NameAssignment_1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:549:2: rule__Appender__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Appender__NameAssignment_1_in_rule__Appender__Group__1__Impl1085);
            rule__Appender__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppenderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__Group__1__Impl"


    // $ANTLR start "rule__Appender__Group__2"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:559:1: rule__Appender__Group__2 : rule__Appender__Group__2__Impl rule__Appender__Group__3 ;
    public final void rule__Appender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:563:1: ( rule__Appender__Group__2__Impl rule__Appender__Group__3 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:564:2: rule__Appender__Group__2__Impl rule__Appender__Group__3
            {
            pushFollow(FOLLOW_rule__Appender__Group__2__Impl_in_rule__Appender__Group__21115);
            rule__Appender__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Appender__Group__3_in_rule__Appender__Group__21118);
            rule__Appender__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__Group__2"


    // $ANTLR start "rule__Appender__Group__2__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:571:1: rule__Appender__Group__2__Impl : ( ( rule__Appender__ClassAssignment_2 ) ) ;
    public final void rule__Appender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:575:1: ( ( ( rule__Appender__ClassAssignment_2 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:576:1: ( ( rule__Appender__ClassAssignment_2 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:576:1: ( ( rule__Appender__ClassAssignment_2 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:577:1: ( rule__Appender__ClassAssignment_2 )
            {
             before(grammarAccess.getAppenderAccess().getClassAssignment_2()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:578:1: ( rule__Appender__ClassAssignment_2 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:578:2: rule__Appender__ClassAssignment_2
            {
            pushFollow(FOLLOW_rule__Appender__ClassAssignment_2_in_rule__Appender__Group__2__Impl1145);
            rule__Appender__ClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAppenderAccess().getClassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__Group__2__Impl"


    // $ANTLR start "rule__Appender__Group__3"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:588:1: rule__Appender__Group__3 : rule__Appender__Group__3__Impl ;
    public final void rule__Appender__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:592:1: ( rule__Appender__Group__3__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:593:2: rule__Appender__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Appender__Group__3__Impl_in_rule__Appender__Group__31175);
            rule__Appender__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__Group__3"


    // $ANTLR start "rule__Appender__Group__3__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:599:1: rule__Appender__Group__3__Impl : ( ( rule__Appender__PatternAssignment_3 )? ) ;
    public final void rule__Appender__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:603:1: ( ( ( rule__Appender__PatternAssignment_3 )? ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:604:1: ( ( rule__Appender__PatternAssignment_3 )? )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:604:1: ( ( rule__Appender__PatternAssignment_3 )? )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:605:1: ( rule__Appender__PatternAssignment_3 )?
            {
             before(grammarAccess.getAppenderAccess().getPatternAssignment_3()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:606:1: ( rule__Appender__PatternAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:606:2: rule__Appender__PatternAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Appender__PatternAssignment_3_in_rule__Appender__Group__3__Impl1202);
                    rule__Appender__PatternAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAppenderAccess().getPatternAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__Group__3__Impl"


    // $ANTLR start "rule__RootLogger__Group__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:624:1: rule__RootLogger__Group__0 : rule__RootLogger__Group__0__Impl rule__RootLogger__Group__1 ;
    public final void rule__RootLogger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:628:1: ( rule__RootLogger__Group__0__Impl rule__RootLogger__Group__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:629:2: rule__RootLogger__Group__0__Impl rule__RootLogger__Group__1
            {
            pushFollow(FOLLOW_rule__RootLogger__Group__0__Impl_in_rule__RootLogger__Group__01241);
            rule__RootLogger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootLogger__Group__1_in_rule__RootLogger__Group__01244);
            rule__RootLogger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group__0"


    // $ANTLR start "rule__RootLogger__Group__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:636:1: rule__RootLogger__Group__0__Impl : ( 'root' ) ;
    public final void rule__RootLogger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:640:1: ( ( 'root' ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:641:1: ( 'root' )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:641:1: ( 'root' )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:642:1: 'root'
            {
             before(grammarAccess.getRootLoggerAccess().getRootKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__RootLogger__Group__0__Impl1272); 
             after(grammarAccess.getRootLoggerAccess().getRootKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group__0__Impl"


    // $ANTLR start "rule__RootLogger__Group__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:655:1: rule__RootLogger__Group__1 : rule__RootLogger__Group__1__Impl rule__RootLogger__Group__2 ;
    public final void rule__RootLogger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:659:1: ( rule__RootLogger__Group__1__Impl rule__RootLogger__Group__2 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:660:2: rule__RootLogger__Group__1__Impl rule__RootLogger__Group__2
            {
            pushFollow(FOLLOW_rule__RootLogger__Group__1__Impl_in_rule__RootLogger__Group__11303);
            rule__RootLogger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootLogger__Group__2_in_rule__RootLogger__Group__11306);
            rule__RootLogger__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group__1"


    // $ANTLR start "rule__RootLogger__Group__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:667:1: rule__RootLogger__Group__1__Impl : ( ( rule__RootLogger__LevelAssignment_1 ) ) ;
    public final void rule__RootLogger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:671:1: ( ( ( rule__RootLogger__LevelAssignment_1 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:672:1: ( ( rule__RootLogger__LevelAssignment_1 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:672:1: ( ( rule__RootLogger__LevelAssignment_1 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:673:1: ( rule__RootLogger__LevelAssignment_1 )
            {
             before(grammarAccess.getRootLoggerAccess().getLevelAssignment_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:674:1: ( rule__RootLogger__LevelAssignment_1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:674:2: rule__RootLogger__LevelAssignment_1
            {
            pushFollow(FOLLOW_rule__RootLogger__LevelAssignment_1_in_rule__RootLogger__Group__1__Impl1333);
            rule__RootLogger__LevelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootLoggerAccess().getLevelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group__1__Impl"


    // $ANTLR start "rule__RootLogger__Group__2"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:684:1: rule__RootLogger__Group__2 : rule__RootLogger__Group__2__Impl rule__RootLogger__Group__3 ;
    public final void rule__RootLogger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:688:1: ( rule__RootLogger__Group__2__Impl rule__RootLogger__Group__3 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:689:2: rule__RootLogger__Group__2__Impl rule__RootLogger__Group__3
            {
            pushFollow(FOLLOW_rule__RootLogger__Group__2__Impl_in_rule__RootLogger__Group__21363);
            rule__RootLogger__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootLogger__Group__3_in_rule__RootLogger__Group__21366);
            rule__RootLogger__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group__2"


    // $ANTLR start "rule__RootLogger__Group__2__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:696:1: rule__RootLogger__Group__2__Impl : ( 'append-to' ) ;
    public final void rule__RootLogger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:700:1: ( ( 'append-to' ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:701:1: ( 'append-to' )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:701:1: ( 'append-to' )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:702:1: 'append-to'
            {
             before(grammarAccess.getRootLoggerAccess().getAppendToKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__RootLogger__Group__2__Impl1394); 
             after(grammarAccess.getRootLoggerAccess().getAppendToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group__2__Impl"


    // $ANTLR start "rule__RootLogger__Group__3"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:715:1: rule__RootLogger__Group__3 : rule__RootLogger__Group__3__Impl rule__RootLogger__Group__4 ;
    public final void rule__RootLogger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:719:1: ( rule__RootLogger__Group__3__Impl rule__RootLogger__Group__4 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:720:2: rule__RootLogger__Group__3__Impl rule__RootLogger__Group__4
            {
            pushFollow(FOLLOW_rule__RootLogger__Group__3__Impl_in_rule__RootLogger__Group__31425);
            rule__RootLogger__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootLogger__Group__4_in_rule__RootLogger__Group__31428);
            rule__RootLogger__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group__3"


    // $ANTLR start "rule__RootLogger__Group__3__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:727:1: rule__RootLogger__Group__3__Impl : ( ( ( rule__RootLogger__AppendersAssignment_3 ) ) ( ( rule__RootLogger__AppendersAssignment_3 )* ) ) ;
    public final void rule__RootLogger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:731:1: ( ( ( ( rule__RootLogger__AppendersAssignment_3 ) ) ( ( rule__RootLogger__AppendersAssignment_3 )* ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:732:1: ( ( ( rule__RootLogger__AppendersAssignment_3 ) ) ( ( rule__RootLogger__AppendersAssignment_3 )* ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:732:1: ( ( ( rule__RootLogger__AppendersAssignment_3 ) ) ( ( rule__RootLogger__AppendersAssignment_3 )* ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:733:1: ( ( rule__RootLogger__AppendersAssignment_3 ) ) ( ( rule__RootLogger__AppendersAssignment_3 )* )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:733:1: ( ( rule__RootLogger__AppendersAssignment_3 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:734:1: ( rule__RootLogger__AppendersAssignment_3 )
            {
             before(grammarAccess.getRootLoggerAccess().getAppendersAssignment_3()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:735:1: ( rule__RootLogger__AppendersAssignment_3 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:735:2: rule__RootLogger__AppendersAssignment_3
            {
            pushFollow(FOLLOW_rule__RootLogger__AppendersAssignment_3_in_rule__RootLogger__Group__3__Impl1457);
            rule__RootLogger__AppendersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRootLoggerAccess().getAppendersAssignment_3()); 

            }

            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:738:1: ( ( rule__RootLogger__AppendersAssignment_3 )* )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:739:1: ( rule__RootLogger__AppendersAssignment_3 )*
            {
             before(grammarAccess.getRootLoggerAccess().getAppendersAssignment_3()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:740:1: ( rule__RootLogger__AppendersAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:740:2: rule__RootLogger__AppendersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__RootLogger__AppendersAssignment_3_in_rule__RootLogger__Group__3__Impl1469);
            	    rule__RootLogger__AppendersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRootLoggerAccess().getAppendersAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group__3__Impl"


    // $ANTLR start "rule__RootLogger__Group__4"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:751:1: rule__RootLogger__Group__4 : rule__RootLogger__Group__4__Impl ;
    public final void rule__RootLogger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:755:1: ( rule__RootLogger__Group__4__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:756:2: rule__RootLogger__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RootLogger__Group__4__Impl_in_rule__RootLogger__Group__41502);
            rule__RootLogger__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group__4"


    // $ANTLR start "rule__RootLogger__Group__4__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:762:1: rule__RootLogger__Group__4__Impl : ( ( rule__RootLogger__Group_4__0 )? ) ;
    public final void rule__RootLogger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:766:1: ( ( ( rule__RootLogger__Group_4__0 )? ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:767:1: ( ( rule__RootLogger__Group_4__0 )? )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:767:1: ( ( rule__RootLogger__Group_4__0 )? )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:768:1: ( rule__RootLogger__Group_4__0 )?
            {
             before(grammarAccess.getRootLoggerAccess().getGroup_4()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:769:1: ( rule__RootLogger__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LBRACE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:769:2: rule__RootLogger__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RootLogger__Group_4__0_in_rule__RootLogger__Group__4__Impl1529);
                    rule__RootLogger__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootLoggerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group__4__Impl"


    // $ANTLR start "rule__RootLogger__Group_4__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:789:1: rule__RootLogger__Group_4__0 : rule__RootLogger__Group_4__0__Impl rule__RootLogger__Group_4__1 ;
    public final void rule__RootLogger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:793:1: ( rule__RootLogger__Group_4__0__Impl rule__RootLogger__Group_4__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:794:2: rule__RootLogger__Group_4__0__Impl rule__RootLogger__Group_4__1
            {
            pushFollow(FOLLOW_rule__RootLogger__Group_4__0__Impl_in_rule__RootLogger__Group_4__01570);
            rule__RootLogger__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootLogger__Group_4__1_in_rule__RootLogger__Group_4__01573);
            rule__RootLogger__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group_4__0"


    // $ANTLR start "rule__RootLogger__Group_4__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:801:1: rule__RootLogger__Group_4__0__Impl : ( RULE_LBRACE ) ;
    public final void rule__RootLogger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:805:1: ( ( RULE_LBRACE ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:806:1: ( RULE_LBRACE )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:806:1: ( RULE_LBRACE )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:807:1: RULE_LBRACE
            {
             before(grammarAccess.getRootLoggerAccess().getLBRACETerminalRuleCall_4_0()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__RootLogger__Group_4__0__Impl1600); 
             after(grammarAccess.getRootLoggerAccess().getLBRACETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group_4__0__Impl"


    // $ANTLR start "rule__RootLogger__Group_4__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:818:1: rule__RootLogger__Group_4__1 : rule__RootLogger__Group_4__1__Impl rule__RootLogger__Group_4__2 ;
    public final void rule__RootLogger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:822:1: ( rule__RootLogger__Group_4__1__Impl rule__RootLogger__Group_4__2 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:823:2: rule__RootLogger__Group_4__1__Impl rule__RootLogger__Group_4__2
            {
            pushFollow(FOLLOW_rule__RootLogger__Group_4__1__Impl_in_rule__RootLogger__Group_4__11629);
            rule__RootLogger__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootLogger__Group_4__2_in_rule__RootLogger__Group_4__11632);
            rule__RootLogger__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group_4__1"


    // $ANTLR start "rule__RootLogger__Group_4__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:830:1: rule__RootLogger__Group_4__1__Impl : ( ( rule__RootLogger__LoggersAssignment_4_1 )* ) ;
    public final void rule__RootLogger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:834:1: ( ( ( rule__RootLogger__LoggersAssignment_4_1 )* ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:835:1: ( ( rule__RootLogger__LoggersAssignment_4_1 )* )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:835:1: ( ( rule__RootLogger__LoggersAssignment_4_1 )* )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:836:1: ( rule__RootLogger__LoggersAssignment_4_1 )*
            {
             before(grammarAccess.getRootLoggerAccess().getLoggersAssignment_4_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:837:1: ( rule__RootLogger__LoggersAssignment_4_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:837:2: rule__RootLogger__LoggersAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__RootLogger__LoggersAssignment_4_1_in_rule__RootLogger__Group_4__1__Impl1659);
            	    rule__RootLogger__LoggersAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRootLoggerAccess().getLoggersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group_4__1__Impl"


    // $ANTLR start "rule__RootLogger__Group_4__2"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:847:1: rule__RootLogger__Group_4__2 : rule__RootLogger__Group_4__2__Impl ;
    public final void rule__RootLogger__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:851:1: ( rule__RootLogger__Group_4__2__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:852:2: rule__RootLogger__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__RootLogger__Group_4__2__Impl_in_rule__RootLogger__Group_4__21690);
            rule__RootLogger__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group_4__2"


    // $ANTLR start "rule__RootLogger__Group_4__2__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:858:1: rule__RootLogger__Group_4__2__Impl : ( RULE_RBRACE ) ;
    public final void rule__RootLogger__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:862:1: ( ( RULE_RBRACE ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:863:1: ( RULE_RBRACE )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:863:1: ( RULE_RBRACE )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:864:1: RULE_RBRACE
            {
             before(grammarAccess.getRootLoggerAccess().getRBRACETerminalRuleCall_4_2()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__RootLogger__Group_4__2__Impl1717); 
             after(grammarAccess.getRootLoggerAccess().getRBRACETerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__Group_4__2__Impl"


    // $ANTLR start "rule__Logger__Group__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:881:1: rule__Logger__Group__0 : rule__Logger__Group__0__Impl rule__Logger__Group__1 ;
    public final void rule__Logger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:885:1: ( rule__Logger__Group__0__Impl rule__Logger__Group__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:886:2: rule__Logger__Group__0__Impl rule__Logger__Group__1
            {
            pushFollow(FOLLOW_rule__Logger__Group__0__Impl_in_rule__Logger__Group__01752);
            rule__Logger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logger__Group__1_in_rule__Logger__Group__01755);
            rule__Logger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group__0"


    // $ANTLR start "rule__Logger__Group__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:893:1: rule__Logger__Group__0__Impl : ( 'logger' ) ;
    public final void rule__Logger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:897:1: ( ( 'logger' ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:898:1: ( 'logger' )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:898:1: ( 'logger' )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:899:1: 'logger'
            {
             before(grammarAccess.getLoggerAccess().getLoggerKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Logger__Group__0__Impl1783); 
             after(grammarAccess.getLoggerAccess().getLoggerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group__0__Impl"


    // $ANTLR start "rule__Logger__Group__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:912:1: rule__Logger__Group__1 : rule__Logger__Group__1__Impl rule__Logger__Group__2 ;
    public final void rule__Logger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:916:1: ( rule__Logger__Group__1__Impl rule__Logger__Group__2 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:917:2: rule__Logger__Group__1__Impl rule__Logger__Group__2
            {
            pushFollow(FOLLOW_rule__Logger__Group__1__Impl_in_rule__Logger__Group__11814);
            rule__Logger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logger__Group__2_in_rule__Logger__Group__11817);
            rule__Logger__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group__1"


    // $ANTLR start "rule__Logger__Group__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:924:1: rule__Logger__Group__1__Impl : ( ( rule__Logger__NameAssignment_1 ) ) ;
    public final void rule__Logger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:928:1: ( ( ( rule__Logger__NameAssignment_1 ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:929:1: ( ( rule__Logger__NameAssignment_1 ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:929:1: ( ( rule__Logger__NameAssignment_1 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:930:1: ( rule__Logger__NameAssignment_1 )
            {
             before(grammarAccess.getLoggerAccess().getNameAssignment_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:931:1: ( rule__Logger__NameAssignment_1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:931:2: rule__Logger__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Logger__NameAssignment_1_in_rule__Logger__Group__1__Impl1844);
            rule__Logger__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoggerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group__1__Impl"


    // $ANTLR start "rule__Logger__Group__2"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:941:1: rule__Logger__Group__2 : rule__Logger__Group__2__Impl rule__Logger__Group__3 ;
    public final void rule__Logger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:945:1: ( rule__Logger__Group__2__Impl rule__Logger__Group__3 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:946:2: rule__Logger__Group__2__Impl rule__Logger__Group__3
            {
            pushFollow(FOLLOW_rule__Logger__Group__2__Impl_in_rule__Logger__Group__21874);
            rule__Logger__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logger__Group__3_in_rule__Logger__Group__21877);
            rule__Logger__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group__2"


    // $ANTLR start "rule__Logger__Group__2__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:953:1: rule__Logger__Group__2__Impl : ( ( rule__Logger__LevelAssignment_2 )? ) ;
    public final void rule__Logger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:957:1: ( ( ( rule__Logger__LevelAssignment_2 )? ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:958:1: ( ( rule__Logger__LevelAssignment_2 )? )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:958:1: ( ( rule__Logger__LevelAssignment_2 )? )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:959:1: ( rule__Logger__LevelAssignment_2 )?
            {
             before(grammarAccess.getLoggerAccess().getLevelAssignment_2()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:960:1: ( rule__Logger__LevelAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=13 && LA8_0<=18)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:960:2: rule__Logger__LevelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Logger__LevelAssignment_2_in_rule__Logger__Group__2__Impl1904);
                    rule__Logger__LevelAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoggerAccess().getLevelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group__2__Impl"


    // $ANTLR start "rule__Logger__Group__3"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:970:1: rule__Logger__Group__3 : rule__Logger__Group__3__Impl rule__Logger__Group__4 ;
    public final void rule__Logger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:974:1: ( rule__Logger__Group__3__Impl rule__Logger__Group__4 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:975:2: rule__Logger__Group__3__Impl rule__Logger__Group__4
            {
            pushFollow(FOLLOW_rule__Logger__Group__3__Impl_in_rule__Logger__Group__31935);
            rule__Logger__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logger__Group__4_in_rule__Logger__Group__31938);
            rule__Logger__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group__3"


    // $ANTLR start "rule__Logger__Group__3__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:982:1: rule__Logger__Group__3__Impl : ( ( rule__Logger__Group_3__0 )? ) ;
    public final void rule__Logger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:986:1: ( ( ( rule__Logger__Group_3__0 )? ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:987:1: ( ( rule__Logger__Group_3__0 )? )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:987:1: ( ( rule__Logger__Group_3__0 )? )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:988:1: ( rule__Logger__Group_3__0 )?
            {
             before(grammarAccess.getLoggerAccess().getGroup_3()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:989:1: ( rule__Logger__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:989:2: rule__Logger__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Logger__Group_3__0_in_rule__Logger__Group__3__Impl1965);
                    rule__Logger__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoggerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group__3__Impl"


    // $ANTLR start "rule__Logger__Group__4"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:999:1: rule__Logger__Group__4 : rule__Logger__Group__4__Impl ;
    public final void rule__Logger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1003:1: ( rule__Logger__Group__4__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1004:2: rule__Logger__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Logger__Group__4__Impl_in_rule__Logger__Group__41996);
            rule__Logger__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group__4"


    // $ANTLR start "rule__Logger__Group__4__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1010:1: rule__Logger__Group__4__Impl : ( ( rule__Logger__Group_4__0 )? ) ;
    public final void rule__Logger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1014:1: ( ( ( rule__Logger__Group_4__0 )? ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1015:1: ( ( rule__Logger__Group_4__0 )? )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1015:1: ( ( rule__Logger__Group_4__0 )? )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1016:1: ( rule__Logger__Group_4__0 )?
            {
             before(grammarAccess.getLoggerAccess().getGroup_4()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1017:1: ( rule__Logger__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_LBRACE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1017:2: rule__Logger__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Logger__Group_4__0_in_rule__Logger__Group__4__Impl2023);
                    rule__Logger__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoggerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group__4__Impl"


    // $ANTLR start "rule__Logger__Group_3__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1037:1: rule__Logger__Group_3__0 : rule__Logger__Group_3__0__Impl rule__Logger__Group_3__1 ;
    public final void rule__Logger__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1041:1: ( rule__Logger__Group_3__0__Impl rule__Logger__Group_3__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1042:2: rule__Logger__Group_3__0__Impl rule__Logger__Group_3__1
            {
            pushFollow(FOLLOW_rule__Logger__Group_3__0__Impl_in_rule__Logger__Group_3__02064);
            rule__Logger__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logger__Group_3__1_in_rule__Logger__Group_3__02067);
            rule__Logger__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group_3__0"


    // $ANTLR start "rule__Logger__Group_3__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1049:1: rule__Logger__Group_3__0__Impl : ( 'append-to' ) ;
    public final void rule__Logger__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1053:1: ( ( 'append-to' ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1054:1: ( 'append-to' )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1054:1: ( 'append-to' )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1055:1: 'append-to'
            {
             before(grammarAccess.getLoggerAccess().getAppendToKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Logger__Group_3__0__Impl2095); 
             after(grammarAccess.getLoggerAccess().getAppendToKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group_3__0__Impl"


    // $ANTLR start "rule__Logger__Group_3__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1068:1: rule__Logger__Group_3__1 : rule__Logger__Group_3__1__Impl ;
    public final void rule__Logger__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1072:1: ( rule__Logger__Group_3__1__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1073:2: rule__Logger__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Logger__Group_3__1__Impl_in_rule__Logger__Group_3__12126);
            rule__Logger__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group_3__1"


    // $ANTLR start "rule__Logger__Group_3__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1079:1: rule__Logger__Group_3__1__Impl : ( ( ( rule__Logger__AppendersAssignment_3_1 ) ) ( ( rule__Logger__AppendersAssignment_3_1 )* ) ) ;
    public final void rule__Logger__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1083:1: ( ( ( ( rule__Logger__AppendersAssignment_3_1 ) ) ( ( rule__Logger__AppendersAssignment_3_1 )* ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1084:1: ( ( ( rule__Logger__AppendersAssignment_3_1 ) ) ( ( rule__Logger__AppendersAssignment_3_1 )* ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1084:1: ( ( ( rule__Logger__AppendersAssignment_3_1 ) ) ( ( rule__Logger__AppendersAssignment_3_1 )* ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1085:1: ( ( rule__Logger__AppendersAssignment_3_1 ) ) ( ( rule__Logger__AppendersAssignment_3_1 )* )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1085:1: ( ( rule__Logger__AppendersAssignment_3_1 ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1086:1: ( rule__Logger__AppendersAssignment_3_1 )
            {
             before(grammarAccess.getLoggerAccess().getAppendersAssignment_3_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1087:1: ( rule__Logger__AppendersAssignment_3_1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1087:2: rule__Logger__AppendersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Logger__AppendersAssignment_3_1_in_rule__Logger__Group_3__1__Impl2155);
            rule__Logger__AppendersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoggerAccess().getAppendersAssignment_3_1()); 

            }

            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1090:1: ( ( rule__Logger__AppendersAssignment_3_1 )* )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1091:1: ( rule__Logger__AppendersAssignment_3_1 )*
            {
             before(grammarAccess.getLoggerAccess().getAppendersAssignment_3_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1092:1: ( rule__Logger__AppendersAssignment_3_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1092:2: rule__Logger__AppendersAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Logger__AppendersAssignment_3_1_in_rule__Logger__Group_3__1__Impl2167);
            	    rule__Logger__AppendersAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLoggerAccess().getAppendersAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group_3__1__Impl"


    // $ANTLR start "rule__Logger__Group_4__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1107:1: rule__Logger__Group_4__0 : rule__Logger__Group_4__0__Impl rule__Logger__Group_4__1 ;
    public final void rule__Logger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1111:1: ( rule__Logger__Group_4__0__Impl rule__Logger__Group_4__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1112:2: rule__Logger__Group_4__0__Impl rule__Logger__Group_4__1
            {
            pushFollow(FOLLOW_rule__Logger__Group_4__0__Impl_in_rule__Logger__Group_4__02204);
            rule__Logger__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logger__Group_4__1_in_rule__Logger__Group_4__02207);
            rule__Logger__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group_4__0"


    // $ANTLR start "rule__Logger__Group_4__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1119:1: rule__Logger__Group_4__0__Impl : ( RULE_LBRACE ) ;
    public final void rule__Logger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1123:1: ( ( RULE_LBRACE ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1124:1: ( RULE_LBRACE )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1124:1: ( RULE_LBRACE )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1125:1: RULE_LBRACE
            {
             before(grammarAccess.getLoggerAccess().getLBRACETerminalRuleCall_4_0()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__Logger__Group_4__0__Impl2234); 
             after(grammarAccess.getLoggerAccess().getLBRACETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group_4__0__Impl"


    // $ANTLR start "rule__Logger__Group_4__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1136:1: rule__Logger__Group_4__1 : rule__Logger__Group_4__1__Impl rule__Logger__Group_4__2 ;
    public final void rule__Logger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1140:1: ( rule__Logger__Group_4__1__Impl rule__Logger__Group_4__2 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1141:2: rule__Logger__Group_4__1__Impl rule__Logger__Group_4__2
            {
            pushFollow(FOLLOW_rule__Logger__Group_4__1__Impl_in_rule__Logger__Group_4__12263);
            rule__Logger__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Logger__Group_4__2_in_rule__Logger__Group_4__12266);
            rule__Logger__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group_4__1"


    // $ANTLR start "rule__Logger__Group_4__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1148:1: rule__Logger__Group_4__1__Impl : ( ( rule__Logger__LoggersAssignment_4_1 )* ) ;
    public final void rule__Logger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1152:1: ( ( ( rule__Logger__LoggersAssignment_4_1 )* ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1153:1: ( ( rule__Logger__LoggersAssignment_4_1 )* )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1153:1: ( ( rule__Logger__LoggersAssignment_4_1 )* )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1154:1: ( rule__Logger__LoggersAssignment_4_1 )*
            {
             before(grammarAccess.getLoggerAccess().getLoggersAssignment_4_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1155:1: ( rule__Logger__LoggersAssignment_4_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1155:2: rule__Logger__LoggersAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Logger__LoggersAssignment_4_1_in_rule__Logger__Group_4__1__Impl2293);
            	    rule__Logger__LoggersAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLoggerAccess().getLoggersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group_4__1__Impl"


    // $ANTLR start "rule__Logger__Group_4__2"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1165:1: rule__Logger__Group_4__2 : rule__Logger__Group_4__2__Impl ;
    public final void rule__Logger__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1169:1: ( rule__Logger__Group_4__2__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1170:2: rule__Logger__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Logger__Group_4__2__Impl_in_rule__Logger__Group_4__22324);
            rule__Logger__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group_4__2"


    // $ANTLR start "rule__Logger__Group_4__2__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1176:1: rule__Logger__Group_4__2__Impl : ( RULE_RBRACE ) ;
    public final void rule__Logger__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1180:1: ( ( RULE_RBRACE ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1181:1: ( RULE_RBRACE )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1181:1: ( RULE_RBRACE )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1182:1: RULE_RBRACE
            {
             before(grammarAccess.getLoggerAccess().getRBRACETerminalRuleCall_4_2()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__Logger__Group_4__2__Impl2351); 
             after(grammarAccess.getLoggerAccess().getRBRACETerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__Group_4__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1199:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1203:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1204:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02386);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02389);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1211:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1215:1: ( ( RULE_ID ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1216:1: ( RULE_ID )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1216:1: ( RULE_ID )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1217:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2416); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1228:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1232:1: ( rule__FQN__Group__1__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1233:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12445);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1239:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1243:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1244:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1244:1: ( ( rule__FQN__Group_1__0 )* )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1245:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1246:1: ( rule__FQN__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1246:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2472);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1260:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1264:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1265:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02507);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02510);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1272:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1276:1: ( ( '.' ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1277:1: ( '.' )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1277:1: ( '.' )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1278:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__FQN__Group_1__0__Impl2538); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1291:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1295:1: ( rule__FQN__Group_1__1__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1296:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12569);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1302:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1306:1: ( ( RULE_ID ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1307:1: ( RULE_ID )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1307:1: ( RULE_ID )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1308:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2596); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__LoggerConfig__UnorderedGroup_0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1324:1: rule__LoggerConfig__UnorderedGroup_0 : ( rule__LoggerConfig__UnorderedGroup_0__0 )? ;
    public final void rule__LoggerConfig__UnorderedGroup_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0());
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1329:1: ( ( rule__LoggerConfig__UnorderedGroup_0__0 )? )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1330:2: ( rule__LoggerConfig__UnorderedGroup_0__0 )?
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1330:2: ( rule__LoggerConfig__UnorderedGroup_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1330:2: rule__LoggerConfig__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_rule__LoggerConfig__UnorderedGroup_0__0_in_rule__LoggerConfig__UnorderedGroup_02630);
                    rule__LoggerConfig__UnorderedGroup_0__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__UnorderedGroup_0"


    // $ANTLR start "rule__LoggerConfig__UnorderedGroup_0__Impl"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1340:1: rule__LoggerConfig__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__LoggerConfig__DebugAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LoggerConfig__Group_0_1__0 ) ) ) ) ) ;
    public final void rule__LoggerConfig__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1345:1: ( ( ({...}? => ( ( ( rule__LoggerConfig__DebugAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LoggerConfig__Group_0_1__0 ) ) ) ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1346:3: ( ({...}? => ( ( ( rule__LoggerConfig__DebugAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LoggerConfig__Group_0_1__0 ) ) ) ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1346:3: ( ({...}? => ( ( ( rule__LoggerConfig__DebugAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__LoggerConfig__Group_0_1__0 ) ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1348:4: ({...}? => ( ( ( rule__LoggerConfig__DebugAssignment_0_0 ) ) ) )
                    {
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1348:4: ({...}? => ( ( ( rule__LoggerConfig__DebugAssignment_0_0 ) ) ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1349:5: {...}? => ( ( ( rule__LoggerConfig__DebugAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__LoggerConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 0)");
                    }
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1349:109: ( ( ( rule__LoggerConfig__DebugAssignment_0_0 ) ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1350:6: ( ( rule__LoggerConfig__DebugAssignment_0_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1356:6: ( ( rule__LoggerConfig__DebugAssignment_0_0 ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1358:7: ( rule__LoggerConfig__DebugAssignment_0_0 )
                    {
                     before(grammarAccess.getLoggerConfigAccess().getDebugAssignment_0_0()); 
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1359:7: ( rule__LoggerConfig__DebugAssignment_0_0 )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1359:8: rule__LoggerConfig__DebugAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__LoggerConfig__DebugAssignment_0_0_in_rule__LoggerConfig__UnorderedGroup_0__Impl2717);
                    rule__LoggerConfig__DebugAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLoggerConfigAccess().getDebugAssignment_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1365:4: ({...}? => ( ( ( rule__LoggerConfig__Group_0_1__0 ) ) ) )
                    {
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1365:4: ({...}? => ( ( ( rule__LoggerConfig__Group_0_1__0 ) ) ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1366:5: {...}? => ( ( ( rule__LoggerConfig__Group_0_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__LoggerConfig__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 1)");
                    }
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1366:109: ( ( ( rule__LoggerConfig__Group_0_1__0 ) ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1367:6: ( ( rule__LoggerConfig__Group_0_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1373:6: ( ( rule__LoggerConfig__Group_0_1__0 ) )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1375:7: ( rule__LoggerConfig__Group_0_1__0 )
                    {
                     before(grammarAccess.getLoggerConfigAccess().getGroup_0_1()); 
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1376:7: ( rule__LoggerConfig__Group_0_1__0 )
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1376:8: rule__LoggerConfig__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__LoggerConfig__Group_0_1__0_in_rule__LoggerConfig__UnorderedGroup_0__Impl2808);
                    rule__LoggerConfig__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLoggerConfigAccess().getGroup_0_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__LoggerConfig__UnorderedGroup_0__0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1391:1: rule__LoggerConfig__UnorderedGroup_0__0 : rule__LoggerConfig__UnorderedGroup_0__Impl ( rule__LoggerConfig__UnorderedGroup_0__1 )? ;
    public final void rule__LoggerConfig__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1395:1: ( rule__LoggerConfig__UnorderedGroup_0__Impl ( rule__LoggerConfig__UnorderedGroup_0__1 )? )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1396:2: rule__LoggerConfig__UnorderedGroup_0__Impl ( rule__LoggerConfig__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_rule__LoggerConfig__UnorderedGroup_0__Impl_in_rule__LoggerConfig__UnorderedGroup_0__02867);
            rule__LoggerConfig__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1397:2: ( rule__LoggerConfig__UnorderedGroup_0__1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoggerConfigAccess().getUnorderedGroup_0(), 1) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1397:2: rule__LoggerConfig__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_rule__LoggerConfig__UnorderedGroup_0__1_in_rule__LoggerConfig__UnorderedGroup_0__02870);
                    rule__LoggerConfig__UnorderedGroup_0__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__UnorderedGroup_0__0"


    // $ANTLR start "rule__LoggerConfig__UnorderedGroup_0__1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1404:1: rule__LoggerConfig__UnorderedGroup_0__1 : rule__LoggerConfig__UnorderedGroup_0__Impl ;
    public final void rule__LoggerConfig__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1408:1: ( rule__LoggerConfig__UnorderedGroup_0__Impl )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1409:2: rule__LoggerConfig__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_rule__LoggerConfig__UnorderedGroup_0__Impl_in_rule__LoggerConfig__UnorderedGroup_0__12895);
            rule__LoggerConfig__UnorderedGroup_0__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__UnorderedGroup_0__1"


    // $ANTLR start "rule__LoggerConfig__DebugAssignment_0_0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1420:1: rule__LoggerConfig__DebugAssignment_0_0 : ( ( 'debug' ) ) ;
    public final void rule__LoggerConfig__DebugAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1424:1: ( ( ( 'debug' ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1425:1: ( ( 'debug' ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1425:1: ( ( 'debug' ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1426:1: ( 'debug' )
            {
             before(grammarAccess.getLoggerConfigAccess().getDebugDebugKeyword_0_0_0()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1427:1: ( 'debug' )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1428:1: 'debug'
            {
             before(grammarAccess.getLoggerConfigAccess().getDebugDebugKeyword_0_0_0()); 
            match(input,17,FOLLOW_17_in_rule__LoggerConfig__DebugAssignment_0_02932); 
             after(grammarAccess.getLoggerConfigAccess().getDebugDebugKeyword_0_0_0()); 

            }

             after(grammarAccess.getLoggerConfigAccess().getDebugDebugKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__DebugAssignment_0_0"


    // $ANTLR start "rule__LoggerConfig__ScanAssignment_0_1_0"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1443:1: rule__LoggerConfig__ScanAssignment_0_1_0 : ( ( 'scan' ) ) ;
    public final void rule__LoggerConfig__ScanAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1447:1: ( ( ( 'scan' ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1448:1: ( ( 'scan' ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1448:1: ( ( 'scan' ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1449:1: ( 'scan' )
            {
             before(grammarAccess.getLoggerConfigAccess().getScanScanKeyword_0_1_0_0()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1450:1: ( 'scan' )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1451:1: 'scan'
            {
             before(grammarAccess.getLoggerConfigAccess().getScanScanKeyword_0_1_0_0()); 
            match(input,25,FOLLOW_25_in_rule__LoggerConfig__ScanAssignment_0_1_02976); 
             after(grammarAccess.getLoggerConfigAccess().getScanScanKeyword_0_1_0_0()); 

            }

             after(grammarAccess.getLoggerConfigAccess().getScanScanKeyword_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__ScanAssignment_0_1_0"


    // $ANTLR start "rule__LoggerConfig__PeriodAssignment_0_1_1_1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1466:1: rule__LoggerConfig__PeriodAssignment_0_1_1_1 : ( RULE_STRING ) ;
    public final void rule__LoggerConfig__PeriodAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1470:1: ( ( RULE_STRING ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1471:1: ( RULE_STRING )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1471:1: ( RULE_STRING )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1472:1: RULE_STRING
            {
             before(grammarAccess.getLoggerConfigAccess().getPeriodSTRINGTerminalRuleCall_0_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LoggerConfig__PeriodAssignment_0_1_1_13015); 
             after(grammarAccess.getLoggerConfigAccess().getPeriodSTRINGTerminalRuleCall_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__PeriodAssignment_0_1_1_1"


    // $ANTLR start "rule__LoggerConfig__AppendersAssignment_1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1481:1: rule__LoggerConfig__AppendersAssignment_1 : ( ruleAppender ) ;
    public final void rule__LoggerConfig__AppendersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1485:1: ( ( ruleAppender ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1486:1: ( ruleAppender )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1486:1: ( ruleAppender )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1487:1: ruleAppender
            {
             before(grammarAccess.getLoggerConfigAccess().getAppendersAppenderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAppender_in_rule__LoggerConfig__AppendersAssignment_13046);
            ruleAppender();

            state._fsp--;

             after(grammarAccess.getLoggerConfigAccess().getAppendersAppenderParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__AppendersAssignment_1"


    // $ANTLR start "rule__LoggerConfig__RootLoggerAssignment_2"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1496:1: rule__LoggerConfig__RootLoggerAssignment_2 : ( ruleRootLogger ) ;
    public final void rule__LoggerConfig__RootLoggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1500:1: ( ( ruleRootLogger ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1501:1: ( ruleRootLogger )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1501:1: ( ruleRootLogger )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1502:1: ruleRootLogger
            {
             before(grammarAccess.getLoggerConfigAccess().getRootLoggerRootLoggerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRootLogger_in_rule__LoggerConfig__RootLoggerAssignment_23077);
            ruleRootLogger();

            state._fsp--;

             after(grammarAccess.getLoggerConfigAccess().getRootLoggerRootLoggerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoggerConfig__RootLoggerAssignment_2"


    // $ANTLR start "rule__Appender__NameAssignment_1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1511:1: rule__Appender__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Appender__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1515:1: ( ( RULE_ID ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1516:1: ( RULE_ID )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1516:1: ( RULE_ID )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1517:1: RULE_ID
            {
             before(grammarAccess.getAppenderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Appender__NameAssignment_13108); 
             after(grammarAccess.getAppenderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__NameAssignment_1"


    // $ANTLR start "rule__Appender__ClassAssignment_2"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1526:1: rule__Appender__ClassAssignment_2 : ( ruleFQN ) ;
    public final void rule__Appender__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1530:1: ( ( ruleFQN ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1531:1: ( ruleFQN )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1531:1: ( ruleFQN )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1532:1: ruleFQN
            {
             before(grammarAccess.getAppenderAccess().getClassFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Appender__ClassAssignment_23139);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAppenderAccess().getClassFQNParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__ClassAssignment_2"


    // $ANTLR start "rule__Appender__PatternAssignment_3"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1541:1: rule__Appender__PatternAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Appender__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1545:1: ( ( RULE_STRING ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1546:1: ( RULE_STRING )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1546:1: ( RULE_STRING )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1547:1: RULE_STRING
            {
             before(grammarAccess.getAppenderAccess().getPatternSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Appender__PatternAssignment_33170); 
             after(grammarAccess.getAppenderAccess().getPatternSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__PatternAssignment_3"


    // $ANTLR start "rule__RootLogger__LevelAssignment_1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1556:1: rule__RootLogger__LevelAssignment_1 : ( ruleLevel ) ;
    public final void rule__RootLogger__LevelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1560:1: ( ( ruleLevel ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1561:1: ( ruleLevel )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1561:1: ( ruleLevel )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1562:1: ruleLevel
            {
             before(grammarAccess.getRootLoggerAccess().getLevelLevelEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLevel_in_rule__RootLogger__LevelAssignment_13201);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getRootLoggerAccess().getLevelLevelEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__LevelAssignment_1"


    // $ANTLR start "rule__RootLogger__AppendersAssignment_3"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1571:1: rule__RootLogger__AppendersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RootLogger__AppendersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1575:1: ( ( ( RULE_ID ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1576:1: ( ( RULE_ID ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1576:1: ( ( RULE_ID ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1577:1: ( RULE_ID )
            {
             before(grammarAccess.getRootLoggerAccess().getAppendersAppenderCrossReference_3_0()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1578:1: ( RULE_ID )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1579:1: RULE_ID
            {
             before(grammarAccess.getRootLoggerAccess().getAppendersAppenderIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RootLogger__AppendersAssignment_33236); 
             after(grammarAccess.getRootLoggerAccess().getAppendersAppenderIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRootLoggerAccess().getAppendersAppenderCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__AppendersAssignment_3"


    // $ANTLR start "rule__RootLogger__LoggersAssignment_4_1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1590:1: rule__RootLogger__LoggersAssignment_4_1 : ( ruleLogger ) ;
    public final void rule__RootLogger__LoggersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1594:1: ( ( ruleLogger ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1595:1: ( ruleLogger )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1595:1: ( ruleLogger )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1596:1: ruleLogger
            {
             before(grammarAccess.getRootLoggerAccess().getLoggersLoggerParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleLogger_in_rule__RootLogger__LoggersAssignment_4_13271);
            ruleLogger();

            state._fsp--;

             after(grammarAccess.getRootLoggerAccess().getLoggersLoggerParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootLogger__LoggersAssignment_4_1"


    // $ANTLR start "rule__Logger__NameAssignment_1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1605:1: rule__Logger__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Logger__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1609:1: ( ( ruleFQN ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1610:1: ( ruleFQN )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1610:1: ( ruleFQN )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1611:1: ruleFQN
            {
             before(grammarAccess.getLoggerAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Logger__NameAssignment_13302);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getLoggerAccess().getNameFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__NameAssignment_1"


    // $ANTLR start "rule__Logger__LevelAssignment_2"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1620:1: rule__Logger__LevelAssignment_2 : ( ruleLevel ) ;
    public final void rule__Logger__LevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1624:1: ( ( ruleLevel ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1625:1: ( ruleLevel )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1625:1: ( ruleLevel )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1626:1: ruleLevel
            {
             before(grammarAccess.getLoggerAccess().getLevelLevelEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLevel_in_rule__Logger__LevelAssignment_23333);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getLoggerAccess().getLevelLevelEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__LevelAssignment_2"


    // $ANTLR start "rule__Logger__AppendersAssignment_3_1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1635:1: rule__Logger__AppendersAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Logger__AppendersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1639:1: ( ( ( RULE_ID ) ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1640:1: ( ( RULE_ID ) )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1640:1: ( ( RULE_ID ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1641:1: ( RULE_ID )
            {
             before(grammarAccess.getLoggerAccess().getAppendersAppenderCrossReference_3_1_0()); 
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1642:1: ( RULE_ID )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1643:1: RULE_ID
            {
             before(grammarAccess.getLoggerAccess().getAppendersAppenderIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Logger__AppendersAssignment_3_13368); 
             after(grammarAccess.getLoggerAccess().getAppendersAppenderIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getLoggerAccess().getAppendersAppenderCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__AppendersAssignment_3_1"


    // $ANTLR start "rule__Logger__LoggersAssignment_4_1"
    // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1654:1: rule__Logger__LoggersAssignment_4_1 : ( ruleLogger ) ;
    public final void rule__Logger__LoggersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1658:1: ( ( ruleLogger ) )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1659:1: ( ruleLogger )
            {
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1659:1: ( ruleLogger )
            // ../pl.zgora.jug.xtext.demo.ui/src-gen/pl/zgora/jug/xtext/ui/contentassist/antlr/internal/InternalDemoDsl.g:1660:1: ruleLogger
            {
             before(grammarAccess.getLoggerAccess().getLoggersLoggerParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleLogger_in_rule__Logger__LoggersAssignment_4_13403);
            ruleLogger();

            state._fsp--;

             after(grammarAccess.getLoggerAccess().getLoggersLoggerParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logger__LoggersAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLoggerConfig_in_entryRuleLoggerConfig61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoggerConfig68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group__0_in_ruleLoggerConfig94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppender_in_entryRuleAppender121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppender128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Appender__Group__0_in_ruleAppender154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootLogger_in_entryRuleRootLogger181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootLogger188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__Group__0_in_ruleRootLogger214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogger_in_entryRuleLogger241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogger248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group__0_in_ruleLogger274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Level__Alternatives_in_ruleLevel373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Level__Alternatives410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Level__Alternatives431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Level__Alternatives452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Level__Alternatives473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Level__Alternatives494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Level__Alternatives515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group__0__Impl_in_rule__LoggerConfig__Group__0548 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group__1_in_rule__LoggerConfig__Group__0551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__UnorderedGroup_0_in_rule__LoggerConfig__Group__0__Impl578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group__1__Impl_in_rule__LoggerConfig__Group__1608 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group__2_in_rule__LoggerConfig__Group__1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__AppendersAssignment_1_in_rule__LoggerConfig__Group__1__Impl640 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__AppendersAssignment_1_in_rule__LoggerConfig__Group__1__Impl652 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group__2__Impl_in_rule__LoggerConfig__Group__2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__RootLoggerAssignment_2_in_rule__LoggerConfig__Group__2__Impl712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group_0_1__0__Impl_in_rule__LoggerConfig__Group_0_1__0748 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group_0_1__1_in_rule__LoggerConfig__Group_0_1__0751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__ScanAssignment_0_1_0_in_rule__LoggerConfig__Group_0_1__0__Impl778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group_0_1__1__Impl_in_rule__LoggerConfig__Group_0_1__1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group_0_1_1__0_in_rule__LoggerConfig__Group_0_1__1__Impl835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group_0_1_1__0__Impl_in_rule__LoggerConfig__Group_0_1_1__0870 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group_0_1_1__1_in_rule__LoggerConfig__Group_0_1_1__0873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LoggerConfig__Group_0_1_1__0__Impl901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group_0_1_1__1__Impl_in_rule__LoggerConfig__Group_0_1_1__1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__PeriodAssignment_0_1_1_1_in_rule__LoggerConfig__Group_0_1_1__1__Impl959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Appender__Group__0__Impl_in_rule__Appender__Group__0993 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Appender__Group__1_in_rule__Appender__Group__0996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Appender__Group__0__Impl1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Appender__Group__1__Impl_in_rule__Appender__Group__11055 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Appender__Group__2_in_rule__Appender__Group__11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Appender__NameAssignment_1_in_rule__Appender__Group__1__Impl1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Appender__Group__2__Impl_in_rule__Appender__Group__21115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Appender__Group__3_in_rule__Appender__Group__21118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Appender__ClassAssignment_2_in_rule__Appender__Group__2__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Appender__Group__3__Impl_in_rule__Appender__Group__31175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Appender__PatternAssignment_3_in_rule__Appender__Group__3__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__Group__0__Impl_in_rule__RootLogger__Group__01241 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__RootLogger__Group__1_in_rule__RootLogger__Group__01244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RootLogger__Group__0__Impl1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__Group__1__Impl_in_rule__RootLogger__Group__11303 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RootLogger__Group__2_in_rule__RootLogger__Group__11306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__LevelAssignment_1_in_rule__RootLogger__Group__1__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__Group__2__Impl_in_rule__RootLogger__Group__21363 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RootLogger__Group__3_in_rule__RootLogger__Group__21366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RootLogger__Group__2__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__Group__3__Impl_in_rule__RootLogger__Group__31425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootLogger__Group__4_in_rule__RootLogger__Group__31428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__AppendersAssignment_3_in_rule__RootLogger__Group__3__Impl1457 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__RootLogger__AppendersAssignment_3_in_rule__RootLogger__Group__3__Impl1469 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__RootLogger__Group__4__Impl_in_rule__RootLogger__Group__41502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__Group_4__0_in_rule__RootLogger__Group__4__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__Group_4__0__Impl_in_rule__RootLogger__Group_4__01570 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__RootLogger__Group_4__1_in_rule__RootLogger__Group_4__01573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__RootLogger__Group_4__0__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__Group_4__1__Impl_in_rule__RootLogger__Group_4__11629 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__RootLogger__Group_4__2_in_rule__RootLogger__Group_4__11632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootLogger__LoggersAssignment_4_1_in_rule__RootLogger__Group_4__1__Impl1659 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__RootLogger__Group_4__2__Impl_in_rule__RootLogger__Group_4__21690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__RootLogger__Group_4__2__Impl1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group__0__Impl_in_rule__Logger__Group__01752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Logger__Group__1_in_rule__Logger__Group__01755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Logger__Group__0__Impl1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group__1__Impl_in_rule__Logger__Group__11814 = new BitSet(new long[]{0x000000000047E010L});
    public static final BitSet FOLLOW_rule__Logger__Group__2_in_rule__Logger__Group__11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__NameAssignment_1_in_rule__Logger__Group__1__Impl1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group__2__Impl_in_rule__Logger__Group__21874 = new BitSet(new long[]{0x000000000047E010L});
    public static final BitSet FOLLOW_rule__Logger__Group__3_in_rule__Logger__Group__21877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__LevelAssignment_2_in_rule__Logger__Group__2__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group__3__Impl_in_rule__Logger__Group__31935 = new BitSet(new long[]{0x000000000047E010L});
    public static final BitSet FOLLOW_rule__Logger__Group__4_in_rule__Logger__Group__31938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group_3__0_in_rule__Logger__Group__3__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group__4__Impl_in_rule__Logger__Group__41996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group_4__0_in_rule__Logger__Group__4__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group_3__0__Impl_in_rule__Logger__Group_3__02064 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Logger__Group_3__1_in_rule__Logger__Group_3__02067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Logger__Group_3__0__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group_3__1__Impl_in_rule__Logger__Group_3__12126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__AppendersAssignment_3_1_in_rule__Logger__Group_3__1__Impl2155 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Logger__AppendersAssignment_3_1_in_rule__Logger__Group_3__1__Impl2167 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Logger__Group_4__0__Impl_in_rule__Logger__Group_4__02204 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__Logger__Group_4__1_in_rule__Logger__Group_4__02207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__Logger__Group_4__0__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__Group_4__1__Impl_in_rule__Logger__Group_4__12263 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__Logger__Group_4__2_in_rule__Logger__Group_4__12266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logger__LoggersAssignment_4_1_in_rule__Logger__Group_4__1__Impl2293 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Logger__Group_4__2__Impl_in_rule__Logger__Group_4__22324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__Logger__Group_4__2__Impl2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02386 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2472 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02507 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FQN__Group_1__0__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__UnorderedGroup_0__0_in_rule__LoggerConfig__UnorderedGroup_02630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__DebugAssignment_0_0_in_rule__LoggerConfig__UnorderedGroup_0__Impl2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__Group_0_1__0_in_rule__LoggerConfig__UnorderedGroup_0__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__UnorderedGroup_0__Impl_in_rule__LoggerConfig__UnorderedGroup_0__02867 = new BitSet(new long[]{0x0000000002020002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__UnorderedGroup_0__1_in_rule__LoggerConfig__UnorderedGroup_0__02870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoggerConfig__UnorderedGroup_0__Impl_in_rule__LoggerConfig__UnorderedGroup_0__12895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__LoggerConfig__DebugAssignment_0_02932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LoggerConfig__ScanAssignment_0_1_02976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LoggerConfig__PeriodAssignment_0_1_1_13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppender_in_rule__LoggerConfig__AppendersAssignment_13046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootLogger_in_rule__LoggerConfig__RootLoggerAssignment_23077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Appender__NameAssignment_13108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Appender__ClassAssignment_23139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Appender__PatternAssignment_33170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel_in_rule__RootLogger__LevelAssignment_13201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RootLogger__AppendersAssignment_33236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogger_in_rule__RootLogger__LoggersAssignment_4_13271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Logger__NameAssignment_13302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLevel_in_rule__Logger__LevelAssignment_23333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Logger__AppendersAssignment_3_13368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogger_in_rule__Logger__LoggersAssignment_4_13403 = new BitSet(new long[]{0x0000000000000002L});

}
