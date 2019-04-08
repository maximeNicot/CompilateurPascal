// Generated from /Users/jmc/Personnel/Enseignement/M1-Compilation/PMachine/src/PCode.g4 by ANTLR 4.7.2

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PCodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, INT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ADD'", "'SUB'", "'MULT'", "'DIV'", "'EQL'", "'NEQ'", "'GTR'", 
			"'LSS'", "'GEQ'", "'LEQ'", "'PRN'", "'INN'", "'INC'", "'-'", "'LDI'", 
			"'LDA'", "'LDV'", "'STO'", "'BRN'", "'BZE'", "'HLT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\6\27\u0086\n\27\r\27\16\27\u0087\3\30\6\30\u008b"+
		"\n\30\r\30\16\30\u008c\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\3\2\4\3\2\62;\5\2\13\f\17\17\"\"\2\u0091\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\65\3"+
		"\2\2\2\79\3\2\2\2\t>\3\2\2\2\13B\3\2\2\2\rF\3\2\2\2\17J\3\2\2\2\21N\3"+
		"\2\2\2\23R\3\2\2\2\25V\3\2\2\2\27Z\3\2\2\2\31^\3\2\2\2\33b\3\2\2\2\35"+
		"f\3\2\2\2\37h\3\2\2\2!l\3\2\2\2#p\3\2\2\2%t\3\2\2\2\'x\3\2\2\2)|\3\2\2"+
		"\2+\u0080\3\2\2\2-\u0085\3\2\2\2/\u008a\3\2\2\2\61\62\7C\2\2\62\63\7F"+
		"\2\2\63\64\7F\2\2\64\4\3\2\2\2\65\66\7U\2\2\66\67\7W\2\2\678\7D\2\28\6"+
		"\3\2\2\29:\7O\2\2:;\7W\2\2;<\7N\2\2<=\7V\2\2=\b\3\2\2\2>?\7F\2\2?@\7K"+
		"\2\2@A\7X\2\2A\n\3\2\2\2BC\7G\2\2CD\7S\2\2DE\7N\2\2E\f\3\2\2\2FG\7P\2"+
		"\2GH\7G\2\2HI\7S\2\2I\16\3\2\2\2JK\7I\2\2KL\7V\2\2LM\7T\2\2M\20\3\2\2"+
		"\2NO\7N\2\2OP\7U\2\2PQ\7U\2\2Q\22\3\2\2\2RS\7I\2\2ST\7G\2\2TU\7S\2\2U"+
		"\24\3\2\2\2VW\7N\2\2WX\7G\2\2XY\7S\2\2Y\26\3\2\2\2Z[\7R\2\2[\\\7T\2\2"+
		"\\]\7P\2\2]\30\3\2\2\2^_\7K\2\2_`\7P\2\2`a\7P\2\2a\32\3\2\2\2bc\7K\2\2"+
		"cd\7P\2\2de\7E\2\2e\34\3\2\2\2fg\7/\2\2g\36\3\2\2\2hi\7N\2\2ij\7F\2\2"+
		"jk\7K\2\2k \3\2\2\2lm\7N\2\2mn\7F\2\2no\7C\2\2o\"\3\2\2\2pq\7N\2\2qr\7"+
		"F\2\2rs\7X\2\2s$\3\2\2\2tu\7U\2\2uv\7V\2\2vw\7Q\2\2w&\3\2\2\2xy\7D\2\2"+
		"yz\7T\2\2z{\7P\2\2{(\3\2\2\2|}\7D\2\2}~\7\\\2\2~\177\7G\2\2\177*\3\2\2"+
		"\2\u0080\u0081\7J\2\2\u0081\u0082\7N\2\2\u0082\u0083\7V\2\2\u0083,\3\2"+
		"\2\2\u0084\u0086\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088.\3\2\2\2\u0089\u008b\t\3\2\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\30\2\2\u008f\60\3\2\2\2\5\2"+
		"\u0087\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}