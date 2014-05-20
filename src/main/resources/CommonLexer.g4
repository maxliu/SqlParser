/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar CommonLexer;

WHITE_SPACE : ' ' -> skip;
TAB : '\t' -> skip; //tab
NEWLINE : '\r'? '\n' -> skip;

//+\-
PLUS_SIGN : '+';
MINUS_SIGN : '-';

DOUBLE_QUOTE : '"';
PERCENT : '%';
AMPERSAND : '&';
QUOTE : '\'';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
ASTERISK : '*';
COMMA : ',';
PERIOD : '.';
SOLIDUS : '/';
COLON : ':';
SEMICOLON : ';';
LESS_THAN : '<';
LESS_THAN_OR_EQ : '<=';
EQ : '=';
NOT_EQ : '<>'|'!=';
GREATER_THAN : '>';
GREATER_THAN_OR_EQ : '>=';
QUESTION_MARK : '?';
UNDERSCORE : '_';
VERTICAL_BAR : '|';
LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';

CONCATENATION : '||';
DOUBLE_PERIOD : '..';

NULL : 'NULL';
DEFAULT : 'DEFAULT';
SOME : 'SOME';
ANY : 'ANY';
ALL : 'ALL';
DISTINCT : 'DISTINCT';
AVG : 'AVG';
SUM : 'SUM';
MIN : 'MIN';
MAX : 'MAX';
COUNT : 'COUNT';

fragment
    DIGIT : [0-9];
fragment
    ALPHA : [a-zA-Z];
fragment
    ZERO : '0';
fragment
    IDENTIFIER_BEGINNING_LETTER : [a-zA-Z_];
fragment
    IDENTIFIER_BEGINNING_LETTER_LOOSE : [a-zA-Z_\u0080...\uFFFE];
fragment
    IDENTIFIER_FOLLOW_BEGIN_LETTER : [a-zA-Z_\u0080...\uFFFE0-9$];
fragment
    HEX : [0-9a-fA-F];
fragment
    UNICODE : 'uU' HEX HEX HEX HEX; //unicode
fragment
    BIT : [01]; //binary
fragment
    SEXAGESIMAL : [0-5] [0-9]|[0-9]|'60';
fragment
    DECIMAL : PERIOD DIGIT+;
fragment
    TIME_ZONE_INTERVAL : (PLUS_SIGN|MINUS_SIGN) HOURS_VALUE COLON MINUTES_VALUE;//+10:59 -10:59
fragment
    YEAR_MONTH_LITERAL : YEARS_VALUE | (YEARS_VALUE MINUS_SIGN)? MONTHS_VALUE;//2012 or 12 or 2012-12
fragment
    DAY_TIME_LITERAL : DAY_TIME_INTERVAL|TIME_INTERVAL;
fragment
    DAY_TIME_INTERVAL : DAYS_VALUE (WHITE_SPACE HOURS_VALUE (COLON MINUTES_VALUE (COLON SECONDS_VALUE)?)?)?;//31 12:59:59
fragment
    TIME_INTERVAL : HOURS_VALUE (COLON MINUTES_VALUE (COLON SECONDS_VALUE)?)? | MINUTES_VALUE (COLON SECONDS_VALUE)? | SECONDS_VALUE;//12:59:59
fragment
	YEARS_VALUE : [1-9] [0-9]*; //2012
fragment
	MONTHS_VALUE : ('0'? [1-9])|'1' [0-2]; //09，9
fragment
	DAYS_VALUE : ('0'? [1-9])|[1-2] [0-9]|'3' [0-1]; //31，03
//时间
fragment
	HOURS_VALUE : '0'? [0-9]|'1' [0-9]|'2' [0-4];
fragment
	MINUTES_VALUE : SEXAGESIMAL;
fragment
	SECONDS_VALUE : SECONDS_INTEGER_VALUE (PERIOD SECONDS_FRACTION)?;
fragment
	SECONDS_INTEGER_VALUE : SEXAGESIMAL;
fragment
	SECONDS_FRACTION : DIGIT DIGIT DIGIT;
fragment
    ADA : 'ADA';
fragment
    C : 'C';
fragment
    COBOL : 'COBOL';
fragment
    FORTRAN : 'FORTRAN';
fragment
    MUMPS : 'MUMPS';
fragment
    PASCAL : 'PASCAL';
fragment
    PLI : 'PLI';
fragment
    CHARACTER_REPRESENTATION : ~'\''|'\'\'';
fragment
    COMMENT_INTRODUCER : MINUS_SIGN MINUS_SIGN MINUS_SIGN*;

//-1
SIGNED_INTEGER : (PLUS_SIGN|MINUS_SIGN) UNSIGNED_INTEGER;
//1
UNSIGNED_INTEGER : ZERO | [1-9] DIGIT*;
//1.0
DECIMAL_LITERAL : (PLUS_SIGN|MINUS_SIGN)? UNSIGNED_INTEGER? DECIMAL;
//1.2e10
APPROXIMATE_NUMERIC_LITERAL :(DECIMAL_LITERAL|(PLUS_SIGN|MINUS_SIGN)? UNSIGNED_INTEGER) [Ee] (PLUS_SIGN|MINUS_SIGN)? UNSIGNED_INTEGER;

TIMESTAMP_STRING : QUOTE DATE_VALUE WHITE_SPACE TIME_VALUE TIME_ZONE_INTERVAL? QUOTE;

DATE_STRING : QUOTE DATE_VALUE QUOTE; //'2014-01-01'
DATE_VALUE : YEARS_VALUE MINUS_SIGN MONTHS_VALUE MINUS_SIGN DAYS_VALUE;//2014-1-2 2014-01-02 2014-12-31

TIME_STRING : QUOTE TIME_VALUE QUOTE; //'12:00:00'
TIME_VALUE : HOURS_VALUE COLON MINUTES_VALUE COLON SECONDS_VALUE; //10:59:59

INTERVAL_STRING : QUOTE (YEAR_MONTH_LITERAL|DAY_TIME_LITERAL) QUOTE;//'2012-12'

COMMENT : COMMENT_INTRODUCER QUOTE_STRING* NEWLINE -> skip;//comment
QUOTE_BIT : QUOTE BIT+ QUOTE;
QUOTE_HEX : QUOTE HEX HEX HEX HEX QUOTE;//'FFEE'
LANGUAGE_NAME : ADA|C|COBOL|FORTRAN|MUMPS|PASCAL|PLI;
QUOTE_STRING : QUOTE CHARACTER_REPRESENTATION* QUOTE;
SQL_LANGUAGE_IDENTIFIER : ALPHA (UNDERSCORE|DIGIT|ALPHA)*;
IDENTIFIER : IDENTIFIER_BEGINNING_LETTER_LOOSE IDENTIFIER_FOLLOW_BEGIN_LETTER*;
