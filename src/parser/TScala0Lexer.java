// Generated from D:\MyProjects\Eclipse\LunaWorkspace\tinyScala0\src\parser\TScala0.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TScala0Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, CLASS=7, NULL=8, THIS=9, 
		BOOLIT=10, CLASSID=11, ID=12, INTLIT=13, STRLIT=14, OP1=15, OP2=16, ASSIGN=17, 
		LPAR=18, RPAR=19, COMMENT=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'.'", "','", "':'", "'}'", "'?'", "'class'", "'null'", "'this'", 
		"BOOLIT", "CLASSID", "ID", "INTLIT", "STRLIT", "OP1", "OP2", "'='", "'('", 
		"')'", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "CLASS", "NULL", "THIS", 
		"BOOLIT", "CLASSID", "ID", "INTLIT", "STRLIT", "OP1", "OP2", "ASSIGN", 
		"LPAR", "RPAR", "ESC", "COMMENT", "WS"
	};


	public TScala0Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TScala0.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 21: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13U\n\13\3\f\3\f\7\fY\n\f\f\f\16\f\\\13\f\3\r\3\r\7\r`\n\r\f\r\16"+
		"\rc\13\r\3\16\3\16\3\16\7\16h\n\16\f\16\16\16k\13\16\5\16m\n\16\3\17\3"+
		"\17\3\17\7\17r\n\17\f\17\16\17u\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008a"+
		"\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\7\26\u0099\n\26\f\26\16\26\u009c\13\26\3\26\5\26\u009f\n\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\4s\u009a\30\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\2\1+\26\2-\27\3\3\2\13\3\2C\\\5\2\62"+
		";C\\c|\3\2c|\3\2\63;\3\2\62;\4\2##//\5\2,-//\61\61\b\2$$^^ddppttvv\5\2"+
		"\13\f\17\17\"\"\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9"+
		"\3\2\2\2\17;\3\2\2\2\21A\3\2\2\2\23F\3\2\2\2\25T\3\2\2\2\27V\3\2\2\2\31"+
		"]\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37x\3\2\2\2!\u0089\3\2\2\2#\u008b\3"+
		"\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0091\3\2\2\2+\u0094\3\2\2\2-\u00a4"+
		"\3\2\2\2/\60\7}\2\2\60\4\3\2\2\2\61\62\7\60\2\2\62\6\3\2\2\2\63\64\7."+
		"\2\2\64\b\3\2\2\2\65\66\7<\2\2\66\n\3\2\2\2\678\7\177\2\28\f\3\2\2\29"+
		":\7A\2\2:\16\3\2\2\2;<\7e\2\2<=\7n\2\2=>\7c\2\2>?\7u\2\2?@\7u\2\2@\20"+
		"\3\2\2\2AB\7p\2\2BC\7w\2\2CD\7n\2\2DE\7n\2\2E\22\3\2\2\2FG\7v\2\2GH\7"+
		"j\2\2HI\7k\2\2IJ\7u\2\2J\24\3\2\2\2KL\7v\2\2LM\7t\2\2MN\7w\2\2NU\7g\2"+
		"\2OP\7h\2\2PQ\7c\2\2QR\7n\2\2RS\7u\2\2SU\7g\2\2TK\3\2\2\2TO\3\2\2\2U\26"+
		"\3\2\2\2VZ\t\2\2\2WY\t\3\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[\30\3\2\2\2\\Z\3\2\2\2]a\t\4\2\2^`\t\3\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2b\32\3\2\2\2ca\3\2\2\2dm\7\62\2\2ei\t\5\2\2fh\t\6\2\2gf"+
		"\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2ld\3\2\2\2l"+
		"e\3\2\2\2m\34\3\2\2\2ns\7$\2\2or\5)\25\2pr\13\2\2\2qo\3\2\2\2qp\3\2\2"+
		"\2ru\3\2\2\2st\3\2\2\2sq\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7$\2\2w\36\3\2"+
		"\2\2xy\t\7\2\2y \3\2\2\2z\u008a\t\b\2\2{|\7(\2\2|\u008a\7(\2\2}~\7~\2"+
		"\2~\u008a\7~\2\2\177\u0080\7?\2\2\u0080\u008a\7?\2\2\u0081\u0082\7#\2"+
		"\2\u0082\u008a\7?\2\2\u0083\u008a\7@\2\2\u0084\u0085\7@\2\2\u0085\u008a"+
		"\7?\2\2\u0086\u008a\7>\2\2\u0087\u0088\7>\2\2\u0088\u008a\7?\2\2\u0089"+
		"z\3\2\2\2\u0089{\3\2\2\2\u0089}\3\2\2\2\u0089\177\3\2\2\2\u0089\u0081"+
		"\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0086\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\"\3\2\2\2\u008b\u008c\7?\2\2\u008c$\3\2\2\2\u008d"+
		"\u008e\7*\2\2\u008e&\3\2\2\2\u008f\u0090\7+\2\2\u0090(\3\2\2\2\u0091\u0092"+
		"\7^\2\2\u0092\u0093\t\t\2\2\u0093*\3\2\2\2\u0094\u0095\7\61\2\2\u0095"+
		"\u0096\7\61\2\2\u0096\u009a\3\2\2\2\u0097\u0099\13\2\2\2\u0098\u0097\3"+
		"\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\7\17\2\2\u009e\u009d\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\b\26\2\2\u00a3,\3\2\2\2\u00a4\u00a5\t\n\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\27\3\2\u00a7.\3\2\2\2\r\2TZailqs\u0089"+
		"\u009a\u009e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}