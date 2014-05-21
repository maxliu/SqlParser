// Generated from D:/Work/Code/Intelij IDEA/SqlParser/src/main/resources\CommonLexer.g4 by ANTLR 4.x
package com.laudandjolynn.sqlparser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITE_SPACE=1, TAB=2, NEWLINE=3, PLUS_SIGN=4, MINUS_SIGN=5, DOUBLE_QUOTE=6, 
		PERCENT=7, AMPERSAND=8, QUOTE=9, LEFT_PAREN=10, RIGHT_PAREN=11, ASTERISK=12, 
		COMMA=13, PERIOD=14, SOLIDUS=15, COLON=16, SEMICOLON=17, LESS_THAN=18, 
		LESS_THAN_OR_EQ=19, EQ=20, NOT_EQ=21, GREATER_THAN=22, GREATER_THAN_OR_EQ=23, 
		QUESTION_MARK=24, UNDERSCORE=25, VERTICAL_BAR=26, LEFT_BRACKET=27, RIGHT_BRACKET=28, 
		CONCATENATION=29, DOUBLE_PERIOD=30, NULL=31, DEFAULT=32, SOME=33, ANY=34, 
		ALL=35, DISTINCT=36, AVG=37, SUM=38, MIN=39, MAX=40, COUNT=41, SIGNED_INTEGER=42, 
		UNSIGNED_INTEGER=43, DECIMAL_LITERAL=44, APPROXIMATE_NUMERIC_LITERAL=45, 
		TIMESTAMP_STRING=46, DATE_STRING=47, DATE_VALUE=48, TIME_STRING=49, TIME_VALUE=50, 
		INTERVAL_STRING=51, COMMENT=52, QUOTE_BIT=53, QUOTE_HEX=54, LANGUAGE_NAME=55, 
		QUOTE_STRING=56, SQL_LANGUAGE_IDENTIFIER=57;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'"
	};
	public static final String[] ruleNames = {
		"WHITE_SPACE", "TAB", "NEWLINE", "PLUS_SIGN", "MINUS_SIGN", "DOUBLE_QUOTE", 
		"PERCENT", "AMPERSAND", "QUOTE", "LEFT_PAREN", "RIGHT_PAREN", "ASTERISK", 
		"COMMA", "PERIOD", "SOLIDUS", "COLON", "SEMICOLON", "LESS_THAN", "LESS_THAN_OR_EQ", 
		"EQ", "NOT_EQ", "GREATER_THAN", "GREATER_THAN_OR_EQ", "QUESTION_MARK", 
		"UNDERSCORE", "VERTICAL_BAR", "LEFT_BRACKET", "RIGHT_BRACKET", "CONCATENATION", 
		"DOUBLE_PERIOD", "NULL", "DEFAULT", "SOME", "ANY", "ALL", "DISTINCT", 
		"AVG", "SUM", "MIN", "MAX", "COUNT", "DIGIT", "ALPHA", "ZERO", "IDENTIFIER_BEGINNING_LETTER", 
		"IDENTIFIER_BEGINNING_LETTER_LOOSE", "IDENTIFIER_FOLLOW_BEGIN_LETTER", 
		"HEX", "UNICODE", "BIT", "SEXAGESIMAL", "DECIMAL", "TIME_ZONE_INTERVAL", 
		"YEAR_MONTH_LITERAL", "DAY_TIME_LITERAL", "DAY_TIME_INTERVAL", "TIME_INTERVAL", 
		"YEARS_VALUE", "MONTHS_VALUE", "DAYS_VALUE", "HOURS_VALUE", "MINUTES_VALUE", 
		"SECONDS_VALUE", "SECONDS_INTEGER_VALUE", "SECONDS_FRACTION", "ADA", "C", 
		"COBOL", "FORTRAN", "MUMPS", "PASCAL", "PLI", "CHARACTER_REPRESENTATION", 
		"COMMENT_INTRODUCER", "SIGNED_INTEGER", "UNSIGNED_INTEGER", "DECIMAL_LITERAL", 
		"APPROXIMATE_NUMERIC_LITERAL", "TIMESTAMP_STRING", "DATE_STRING", "DATE_VALUE", 
		"TIME_STRING", "TIME_VALUE", "INTERVAL_STRING", "COMMENT", "QUOTE_BIT", 
		"QUOTE_HEX", "LANGUAGE_NAME", "QUOTE_STRING", "SQL_LANGUAGE_IDENTIFIER"
	};


	public CommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommonLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2;\u027c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\5\4\u00c1\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\5\26\u00ee\n\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u015b\n\64\3\65\3\65\6\65\u015f\n\65\r\65\16\65\u0160"+
		"\3\66\3\66\5\66\u0165\n\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67"+
		"\u016f\n\67\3\67\5\67\u0172\n\67\38\38\58\u0176\n8\39\39\39\39\39\39\3"+
		"9\39\59\u0180\n9\59\u0182\n9\59\u0184\n9\3:\3:\3:\3:\3:\3:\5:\u018c\n"+
		":\5:\u018e\n:\3:\3:\3:\3:\5:\u0194\n:\3:\5:\u0197\n:\3;\3;\7;\u019b\n"+
		";\f;\16;\u019e\13;\3<\5<\u01a1\n<\3<\3<\3<\5<\u01a6\n<\3=\5=\u01a9\n="+
		"\3=\3=\3=\3=\3=\5=\u01b0\n=\3>\5>\u01b3\n>\3>\3>\3>\3>\3>\5>\u01ba\n>"+
		"\3?\3?\3@\3@\3@\3@\5@\u01c2\n@\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3E"+
		"\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H"+
		"\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\5J\u01f2\nJ\3K\3K\3K\7K\u01f7\nK\fK\16"+
		"K\u01fa\13K\3L\3L\5L\u01fe\nL\3L\3L\3M\3M\3M\7M\u0205\nM\fM\16M\u0208"+
		"\13M\5M\u020a\nM\3N\3N\5N\u020e\nN\3N\5N\u0211\nN\3N\3N\3O\3O\3O\5O\u0218"+
		"\nO\3O\5O\u021b\nO\3O\3O\3O\5O\u0220\nO\3O\3O\3P\3P\3P\3P\3P\5P\u0229"+
		"\nP\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T"+
		"\3U\3U\3U\5U\u0244\nU\3U\3U\3V\3V\7V\u024a\nV\fV\16V\u024d\13V\3V\3V\3"+
		"V\3V\3W\3W\6W\u0255\nW\rW\16W\u0256\3W\3W\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\5Y\u0269\nY\3Z\3Z\7Z\u026d\nZ\fZ\16Z\u0270\13Z\3Z\3Z\3["+
		"\3[\3[\3[\7[\u0278\n[\f[\16[\u027b\13[\2\2\\\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2"+
		"\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091"+
		"\2\u0093\2\u0095\2\u0097,\u0099-\u009b.\u009d/\u009f\60\u00a1\61\u00a3"+
		"\62\u00a5\63\u00a7\64\u00a9\65\u00ab\66\u00ad\67\u00af8\u00b19\u00b3:"+
		"\u00b5;\3\2\20\3\2\62;\4\2C\\c|\5\2C\\aac|\b\2\60\60C\\aac|\u0082\u0082"+
		"\0\0\n\2&&\60\60\62;C\\aac|\u0082\u0082\0\0\5\2\62;CHch\3\2\62\63\3\2"+
		"\62\67\3\2\63;\3\2\62\64\3\2\63\64\3\2\62\66\3\2))\4\2GGgg\u0290\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\3\u00b7\3\2\2\2\5\u00bb\3\2\2\2\7\u00c0"+
		"\3\2\2\2\t\u00c6\3\2\2\2\13\u00c8\3\2\2\2\r\u00ca\3\2\2\2\17\u00cc\3\2"+
		"\2\2\21\u00ce\3\2\2\2\23\u00d0\3\2\2\2\25\u00d2\3\2\2\2\27\u00d4\3\2\2"+
		"\2\31\u00d6\3\2\2\2\33\u00d8\3\2\2\2\35\u00da\3\2\2\2\37\u00dc\3\2\2\2"+
		"!\u00de\3\2\2\2#\u00e0\3\2\2\2%\u00e2\3\2\2\2\'\u00e4\3\2\2\2)\u00e7\3"+
		"\2\2\2+\u00ed\3\2\2\2-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f4\3\2\2\2\63"+
		"\u00f6\3\2\2\2\65\u00f8\3\2\2\2\67\u00fa\3\2\2\29\u00fc\3\2\2\2;\u00fe"+
		"\3\2\2\2=\u0101\3\2\2\2?\u0104\3\2\2\2A\u0109\3\2\2\2C\u0111\3\2\2\2E"+
		"\u0116\3\2\2\2G\u011a\3\2\2\2I\u011e\3\2\2\2K\u0127\3\2\2\2M\u012b\3\2"+
		"\2\2O\u012f\3\2\2\2Q\u0133\3\2\2\2S\u0137\3\2\2\2U\u013d\3\2\2\2W\u013f"+
		"\3\2\2\2Y\u0141\3\2\2\2[\u0143\3\2\2\2]\u0145\3\2\2\2_\u0147\3\2\2\2a"+
		"\u0149\3\2\2\2c\u014b\3\2\2\2e\u0153\3\2\2\2g\u015a\3\2\2\2i\u015c\3\2"+
		"\2\2k\u0164\3\2\2\2m\u0171\3\2\2\2o\u0175\3\2\2\2q\u0177\3\2\2\2s\u0196"+
		"\3\2\2\2u\u0198\3\2\2\2w\u01a5\3\2\2\2y\u01af\3\2\2\2{\u01b9\3\2\2\2}"+
		"\u01bb\3\2\2\2\177\u01bd\3\2\2\2\u0081\u01c3\3\2\2\2\u0083\u01c5\3\2\2"+
		"\2\u0085\u01c9\3\2\2\2\u0087\u01cd\3\2\2\2\u0089\u01cf\3\2\2\2\u008b\u01d5"+
		"\3\2\2\2\u008d\u01dd\3\2\2\2\u008f\u01e3\3\2\2\2\u0091\u01ea\3\2\2\2\u0093"+
		"\u01f1\3\2\2\2\u0095\u01f3\3\2\2\2\u0097\u01fd\3\2\2\2\u0099\u0209\3\2"+
		"\2\2\u009b\u020d\3\2\2\2\u009d\u021a\3\2\2\2\u009f\u0223\3\2\2\2\u00a1"+
		"\u022c\3\2\2\2\u00a3\u0230\3\2\2\2\u00a5\u0236\3\2\2\2\u00a7\u023a\3\2"+
		"\2\2\u00a9\u0240\3\2\2\2\u00ab\u0247\3\2\2\2\u00ad\u0252\3\2\2\2\u00af"+
		"\u025a\3\2\2\2\u00b1\u0268\3\2\2\2\u00b3\u026a\3\2\2\2\u00b5\u0273\3\2"+
		"\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\2\2\2\u00ba"+
		"\4\3\2\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\3\2"+
		"\2\u00be\6\3\2\2\2\u00bf\u00c1\7\17\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\b\4\2\2\u00c5\b\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7\n\3\2\2\2\u00c8"+
		"\u00c9\7/\2\2\u00c9\f\3\2\2\2\u00ca\u00cb\7$\2\2\u00cb\16\3\2\2\2\u00cc"+
		"\u00cd\7\'\2\2\u00cd\20\3\2\2\2\u00ce\u00cf\7(\2\2\u00cf\22\3\2\2\2\u00d0"+
		"\u00d1\7)\2\2\u00d1\24\3\2\2\2\u00d2\u00d3\7*\2\2\u00d3\26\3\2\2\2\u00d4"+
		"\u00d5\7+\2\2\u00d5\30\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\32\3\2\2\2\u00d8"+
		"\u00d9\7.\2\2\u00d9\34\3\2\2\2\u00da\u00db\7\60\2\2\u00db\36\3\2\2\2\u00dc"+
		"\u00dd\7\61\2\2\u00dd \3\2\2\2\u00de\u00df\7<\2\2\u00df\"\3\2\2\2\u00e0"+
		"\u00e1\7=\2\2\u00e1$\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3&\3\2\2\2\u00e4\u00e5"+
		"\7>\2\2\u00e5\u00e6\7?\2\2\u00e6(\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8*\3"+
		"\2\2\2\u00e9\u00ea\7>\2\2\u00ea\u00ee\7@\2\2\u00eb\u00ec\7#\2\2\u00ec"+
		"\u00ee\7?\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee,\3\2\2\2\u00ef"+
		"\u00f0\7@\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7@\2\2\u00f2\u00f3\7?\2\2\u00f3"+
		"\60\3\2\2\2\u00f4\u00f5\7A\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7a\2\2\u00f7"+
		"\64\3\2\2\2\u00f8\u00f9\7~\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7]\2\2\u00fb"+
		"8\3\2\2\2\u00fc\u00fd\7_\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7~\2\2\u00ff\u0100"+
		"\7~\2\2\u0100<\3\2\2\2\u0101\u0102\7\60\2\2\u0102\u0103\7\60\2\2\u0103"+
		">\3\2\2\2\u0104\u0105\7P\2\2\u0105\u0106\7W\2\2\u0106\u0107\7N\2\2\u0107"+
		"\u0108\7N\2\2\u0108@\3\2\2\2\u0109\u010a\7F\2\2\u010a\u010b\7G\2\2\u010b"+
		"\u010c\7H\2\2\u010c\u010d\7C\2\2\u010d\u010e\7W\2\2\u010e\u010f\7N\2\2"+
		"\u010f\u0110\7V\2\2\u0110B\3\2\2\2\u0111\u0112\7U\2\2\u0112\u0113\7Q\2"+
		"\2\u0113\u0114\7O\2\2\u0114\u0115\7G\2\2\u0115D\3\2\2\2\u0116\u0117\7"+
		"C\2\2\u0117\u0118\7P\2\2\u0118\u0119\7[\2\2\u0119F\3\2\2\2\u011a\u011b"+
		"\7C\2\2\u011b\u011c\7N\2\2\u011c\u011d\7N\2\2\u011dH\3\2\2\2\u011e\u011f"+
		"\7F\2\2\u011f\u0120\7K\2\2\u0120\u0121\7U\2\2\u0121\u0122\7V\2\2\u0122"+
		"\u0123\7K\2\2\u0123\u0124\7P\2\2\u0124\u0125\7E\2\2\u0125\u0126\7V\2\2"+
		"\u0126J\3\2\2\2\u0127\u0128\7C\2\2\u0128\u0129\7X\2\2\u0129\u012a\7I\2"+
		"\2\u012aL\3\2\2\2\u012b\u012c\7U\2\2\u012c\u012d\7W\2\2\u012d\u012e\7"+
		"O\2\2\u012eN\3\2\2\2\u012f\u0130\7O\2\2\u0130\u0131\7K\2\2\u0131\u0132"+
		"\7P\2\2\u0132P\3\2\2\2\u0133\u0134\7O\2\2\u0134\u0135\7C\2\2\u0135\u0136"+
		"\7Z\2\2\u0136R\3\2\2\2\u0137\u0138\7E\2\2\u0138\u0139\7Q\2\2\u0139\u013a"+
		"\7W\2\2\u013a\u013b\7P\2\2\u013b\u013c\7V\2\2\u013cT\3\2\2\2\u013d\u013e"+
		"\t\2\2\2\u013eV\3\2\2\2\u013f\u0140\t\3\2\2\u0140X\3\2\2\2\u0141\u0142"+
		"\7\62\2\2\u0142Z\3\2\2\2\u0143\u0144\t\4\2\2\u0144\\\3\2\2\2\u0145\u0146"+
		"\t\5\2\2\u0146^\3\2\2\2\u0147\u0148\t\6\2\2\u0148`\3\2\2\2\u0149\u014a"+
		"\t\7\2\2\u014ab\3\2\2\2\u014b\u014c\7w\2\2\u014c\u014d\7W\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014f\5a\61\2\u014f\u0150\5a\61\2\u0150\u0151\5a\61\2\u0151"+
		"\u0152\5a\61\2\u0152d\3\2\2\2\u0153\u0154\t\b\2\2\u0154f\3\2\2\2\u0155"+
		"\u0156\t\t\2\2\u0156\u015b\t\2\2\2\u0157\u015b\t\2\2\2\u0158\u0159\78"+
		"\2\2\u0159\u015b\7\62\2\2\u015a\u0155\3\2\2\2\u015a\u0157\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015bh\3\2\2\2\u015c\u015e\5\35\17\2\u015d\u015f\5U+\2"+
		"\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161j\3\2\2\2\u0162\u0165\5\t\5\2\u0163\u0165\5\13\6\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\5{"+
		">\2\u0167\u0168\5!\21\2\u0168\u0169\5}?\2\u0169l\3\2\2\2\u016a\u0172\5"+
		"u;\2\u016b\u016c\5u;\2\u016c\u016d\5\13\6\2\u016d\u016f\3\2\2\2\u016e"+
		"\u016b\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\5w"+
		"<\2\u0171\u016a\3\2\2\2\u0171\u016e\3\2\2\2\u0172n\3\2\2\2\u0173\u0176"+
		"\5q9\2\u0174\u0176\5s:\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176"+
		"p\3\2\2\2\u0177\u0183\5y=\2\u0178\u0179\5\3\2\2\u0179\u0181\5{>\2\u017a"+
		"\u017b\5!\21\2\u017b\u017f\5}?\2\u017c\u017d\5!\21\2\u017d\u017e\5\177"+
		"@\2\u017e\u0180\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0182\3\2\2\2\u0181\u017a\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2"+
		"\2\2\u0183\u0178\3\2\2\2\u0183\u0184\3\2\2\2\u0184r\3\2\2\2\u0185\u018d"+
		"\5{>\2\u0186\u0187\5!\21\2\u0187\u018b\5}?\2\u0188\u0189\5!\21\2\u0189"+
		"\u018a\5\177@\2\u018a\u018c\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u018c\3"+
		"\2\2\2\u018c\u018e\3\2\2\2\u018d\u0186\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0197\3\2\2\2\u018f\u0193\5}?\2\u0190\u0191\5!\21\2\u0191\u0192\5\177"+
		"@\2\u0192\u0194\3\2\2\2\u0193\u0190\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0197\5\177@\2\u0196\u0185\3\2\2\2\u0196\u018f\3"+
		"\2\2\2\u0196\u0195\3\2\2\2\u0197t\3\2\2\2\u0198\u019c\t\n\2\2\u0199\u019b"+
		"\t\2\2\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019dv\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a1\7\62\2\2"+
		"\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6"+
		"\t\n\2\2\u01a3\u01a4\7\63\2\2\u01a4\u01a6\t\13\2\2\u01a5\u01a0\3\2\2\2"+
		"\u01a5\u01a3\3\2\2\2\u01a6x\3\2\2\2\u01a7\u01a9\7\62\2\2\u01a8\u01a7\3"+
		"\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01b0\t\n\2\2\u01ab"+
		"\u01ac\t\f\2\2\u01ac\u01b0\t\2\2\2\u01ad\u01ae\7\65\2\2\u01ae\u01b0\t"+
		"\b\2\2\u01af\u01a8\3\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"z\3\2\2\2\u01b1\u01b3\7\62\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2"+
		"\u01b3\u01b4\3\2\2\2\u01b4\u01ba\t\2\2\2\u01b5\u01b6\7\63\2\2\u01b6\u01ba"+
		"\t\2\2\2\u01b7\u01b8\7\64\2\2\u01b8\u01ba\t\r\2\2\u01b9\u01b2\3\2\2\2"+
		"\u01b9\u01b5\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba|\3\2\2\2\u01bb\u01bc\5"+
		"g\64\2\u01bc~\3\2\2\2\u01bd\u01c1\5\u0081A\2\u01be\u01bf\5\35\17\2\u01bf"+
		"\u01c0\5\u0083B\2\u01c0\u01c2\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u0080\3\2\2\2\u01c3\u01c4\5g\64\2\u01c4\u0082\3\2\2\2\u01c5"+
		"\u01c6\5U+\2\u01c6\u01c7\5U+\2\u01c7\u01c8\5U+\2\u01c8\u0084\3\2\2\2\u01c9"+
		"\u01ca\7C\2\2\u01ca\u01cb\7F\2\2\u01cb\u01cc\7C\2\2\u01cc\u0086\3\2\2"+
		"\2\u01cd\u01ce\7E\2\2\u01ce\u0088\3\2\2\2\u01cf\u01d0\7E\2\2\u01d0\u01d1"+
		"\7Q\2\2\u01d1\u01d2\7D\2\2\u01d2\u01d3\7Q\2\2\u01d3\u01d4\7N\2\2\u01d4"+
		"\u008a\3\2\2\2\u01d5\u01d6\7H\2\2\u01d6\u01d7\7Q\2\2\u01d7\u01d8\7T\2"+
		"\2\u01d8\u01d9\7V\2\2\u01d9\u01da\7T\2\2\u01da\u01db\7C\2\2\u01db\u01dc"+
		"\7P\2\2\u01dc\u008c\3\2\2\2\u01dd\u01de\7O\2\2\u01de\u01df\7W\2\2\u01df"+
		"\u01e0\7O\2\2\u01e0\u01e1\7R\2\2\u01e1\u01e2\7U\2\2\u01e2\u008e\3\2\2"+
		"\2\u01e3\u01e4\7R\2\2\u01e4\u01e5\7C\2\2\u01e5\u01e6\7U\2\2\u01e6\u01e7"+
		"\7E\2\2\u01e7\u01e8\7C\2\2\u01e8\u01e9\7N\2\2\u01e9\u0090\3\2\2\2\u01ea"+
		"\u01eb\7R\2\2\u01eb\u01ec\7N\2\2\u01ec\u01ed\7K\2\2\u01ed\u0092\3\2\2"+
		"\2\u01ee\u01f2\n\16\2\2\u01ef\u01f0\7)\2\2\u01f0\u01f2\7)\2\2\u01f1\u01ee"+
		"\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u0094\3\2\2\2\u01f3\u01f4\5\13\6\2"+
		"\u01f4\u01f8\5\13\6\2\u01f5\u01f7\5\13\6\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa"+
		"\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0096\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fb\u01fe\5\t\5\2\u01fc\u01fe\5\13\6\2\u01fd\u01fb\3"+
		"\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\5\u0099M\2"+
		"\u0200\u0098\3\2\2\2\u0201\u020a\5Y-\2\u0202\u0206\t\n\2\2\u0203\u0205"+
		"\5U+\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u0201\3\2"+
		"\2\2\u0209\u0202\3\2\2\2\u020a\u009a\3\2\2\2\u020b\u020e\5\t\5\2\u020c"+
		"\u020e\5\13\6\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3"+
		"\2\2\2\u020e\u0210\3\2\2\2\u020f\u0211\5\u0099M\2\u0210\u020f\3\2\2\2"+
		"\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\5i\65\2\u0213\u009c"+
		"\3\2\2\2\u0214\u021b\5\u009bN\2\u0215\u0218\5\t\5\2\u0216\u0218\5\13\6"+
		"\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u021b\5\u0099M\2\u021a\u0214\3\2\2\2\u021a\u0217\3\2\2"+
		"\2\u021b\u021c\3\2\2\2\u021c\u021f\t\17\2\2\u021d\u0220\5\t\5\2\u021e"+
		"\u0220\5\13\6\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u021f\u0220\3"+
		"\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\5\u0099M\2\u0222\u009e\3\2\2\2"+
		"\u0223\u0224\5\23\n\2\u0224\u0225\5\u00a3R\2\u0225\u0226\5\3\2\2\u0226"+
		"\u0228\5\u00a7T\2\u0227\u0229\5k\66\2\u0228\u0227\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\5\23\n\2\u022b\u00a0\3\2\2\2"+
		"\u022c\u022d\5\23\n\2\u022d\u022e\5\u00a3R\2\u022e\u022f\5\23\n\2\u022f"+
		"\u00a2\3\2\2\2\u0230\u0231\5u;\2\u0231\u0232\5\13\6\2\u0232\u0233\5w<"+
		"\2\u0233\u0234\5\13\6\2\u0234\u0235\5y=\2\u0235\u00a4\3\2\2\2\u0236\u0237"+
		"\5\23\n\2\u0237\u0238\5\u00a7T\2\u0238\u0239\5\23\n\2\u0239\u00a6\3\2"+
		"\2\2\u023a\u023b\5{>\2\u023b\u023c\5!\21\2\u023c\u023d\5}?\2\u023d\u023e"+
		"\5!\21\2\u023e\u023f\5\177@\2\u023f\u00a8\3\2\2\2\u0240\u0243\5\23\n\2"+
		"\u0241\u0244\5m\67\2\u0242\u0244\5o8\2\u0243\u0241\3\2\2\2\u0243\u0242"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\5\23\n\2\u0246\u00aa\3\2\2\2"+
		"\u0247\u024b\5\u0095K\2\u0248\u024a\5\u00b3Z\2\u0249\u0248\3\2\2\2\u024a"+
		"\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2"+
		"\2\2\u024d\u024b\3\2\2\2\u024e\u024f\5\7\4\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\bV\2\2\u0251\u00ac\3\2\2\2\u0252\u0254\5\23\n\2\u0253\u0255\5e"+
		"\63\2\u0254\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0254\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\5\23\n\2\u0259\u00ae\3"+
		"\2\2\2\u025a\u025b\5\23\n\2\u025b\u025c\5a\61\2\u025c\u025d\5a\61\2\u025d"+
		"\u025e\5a\61\2\u025e\u025f\5a\61\2\u025f\u0260\5\23\n\2\u0260\u00b0\3"+
		"\2\2\2\u0261\u0269\5\u0085C\2\u0262\u0269\5\u0087D\2\u0263\u0269\5\u0089"+
		"E\2\u0264\u0269\5\u008bF\2\u0265\u0269\5\u008dG\2\u0266\u0269\5\u008f"+
		"H\2\u0267\u0269\5\u0091I\2\u0268\u0261\3\2\2\2\u0268\u0262\3\2\2\2\u0268"+
		"\u0263\3\2\2\2\u0268\u0264\3\2\2\2\u0268\u0265\3\2\2\2\u0268\u0266\3\2"+
		"\2\2\u0268\u0267\3\2\2\2\u0269\u00b2\3\2\2\2\u026a\u026e\5\23\n\2\u026b"+
		"\u026d\5\u0093J\2\u026c\u026b\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c"+
		"\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271\3\2\2\2\u0270\u026e\3\2\2\2\u0271"+
		"\u0272\5\23\n\2\u0272\u00b4\3\2\2\2\u0273\u0279\5W,\2\u0274\u0278\5\63"+
		"\32\2\u0275\u0278\5U+\2\u0276\u0278\5W,\2\u0277\u0274\3\2\2\2\u0277\u0275"+
		"\3\2\2\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u00b6\3\2\2\2\u027b\u0279\3\2\2\2,\2\u00c0\u00ed"+
		"\u015a\u0160\u0164\u016e\u0171\u0175\u017f\u0181\u0183\u018b\u018d\u0193"+
		"\u0196\u019c\u01a0\u01a5\u01a8\u01af\u01b2\u01b9\u01c1\u01f1\u01f8\u01fd"+
		"\u0206\u0209\u020d\u0210\u0217\u021a\u021f\u0228\u0243\u024b\u0256\u0268"+
		"\u026e\u0277\u0279\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}