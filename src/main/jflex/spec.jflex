import java_cup.runtime.*;

%%

%class Lexer

%unicode
%cup
%line
%column

%{
    private static boolean DEBUG = false;

    private Symbol symbol(int type) {
        if (DEBUG) print(String.valueOf(type) + " " + yytext());
        return new Symbol(type, yyline+1, yycolumn+1);
    }

    private Symbol symbol(int type, Object value) {
        if (DEBUG) print(String.valueOf(type) + " " + yytext());
        return new Symbol(type, yyline+1, yycolumn+1, value);
    }

    private void error (LexicalError error) {
        System.err.println("LEXICAL ERROR");
        System.err.println("Line " + (yyline + 1) + ", Column " + (yycolumn + 1));
        System.err.println(error.comment());
        System.err.println();
        System.exit(0);
    }

    private String parseString (String s) {
        return s.replaceAll("''", "'");
    }

    private void print (String s) {
        System.out.println(s);
    }

    private void print () {
        if (DEBUG) System.out.println(yytext());

    }
%}

/*
%eof{
%eof}
*/

LineTerminator = \r|\n|\r\n
//InputCharacter = [^\r\n]
BlankSpace = [ \t\f]
WhiteSpace = {LineTerminator} | {BlankSpace}

LetterLower = [a-z]
LetterUpper = [A-Z]
Letter = {LetterLower} | {LetterUpper}

NumberNatural = [1-9]
Number = 0 | {NumberNatural}*

/* comments */
CommentDelimiterBegin1 = "{"
CommentDelimiterEnd1 = "}"
InvalidComment1 = {CommentDelimiterBegin1} ([^}])+
Comment1 = {InvalidComment1}{CommentDelimiterEnd1}

CommentDelimiterBegin2 = "(*"
CommentDelimiterEnd2 = "*)"
InvalidComment2 = {CommentDelimiterBegin2} ([^(*\))])+
Comment2 = {InvalidComment2}{CommentDelimiterEnd2}

Comment = {Comment1} | {Comment2}
InvalidComment = {InvalidComment1} | {InvalidComment2}
CommentDelimiterEnd = {CommentDelimiterEnd1} | {CommentDelimiterEnd2}

/* identifiers */
IdentifierFirstChar = {Letter} | "_"
IdentifierValidChar = {IdentifierFirstChar} | {Number}
Identifier = {IdentifierFirstChar} {IdentifierValidChar}*

InvalidIdentifierFirstChar = [^a-zA-Z_ \t\f\r\n]
IdentifierInvalidChar = [^a-zA-Z_0-9 \t\f\r\n]
InvalidIdentifier = {InvalidIdentifierFirstChar} {IdentifierValidChar}?

/* integer literals */
Sign = [+-]
IntegerNumber = 0 | {NumberNatural} {Number}*
IntegerDecimalConstant = {Sign}? {IntegerNumber}

HexDigit = [0-9a-fA-F]
HexDecimalConstant = "$" {Sign}? {HexDigit}+

DecimalConstant = {IntegerDecimalConstant} | {HexDecimalConstant}

/* floating point literals */
IntegerFloatConstant = {IntegerDecimalConstant} "." {Number}+
HexFloatConstant = {HexDecimalConstant} "." {HexDigit}
FloatConstant = {IntegerFloatConstant} | {HexFloatConstant}

//NumericConstant = {DecimalConstant} | {FloatConstant}

/* string and character literals */
StringDelimiter = "'"
StringDelimiterInside = "''"
StringValidContent = [^'\n] | {StringDelimiterInside}

UnclosedString = {StringDelimiter} ({StringValidContent})*;
UnopenString = ({StringValidContent})* {StringDelimiter};
//InvalidString = {UnclosedString} | {UnopenString}
String = {StringDelimiter} ({StringValidContent})* {StringDelimiter}
//String2 = {UnclosedString} {StringDelimiter}

%s COMMENT_1, COMMENT_2

%%

<YYINITIAL> {

    {Comment} {
        print("Comment: "+yytext());
    }

/*
    {CommentDelimiterBegin1} {
        yybegin(COMMENT_1);
    }

    {CommentDelimiterBegin2} {
        yybegin(COMMENT_2);
    }
*/
    {CommentDelimiterEnd} {
        print("CommentDelimiterEnd:");
        error(LexicalError.UNOPEN_COMMENT);
    }

    {String} {
        print("String: "); return symbol(sym.STRING_CONST, parseString(yytext()));
    }

    {UnclosedString} {
        print("UnclosedString:");
        error(LexicalError.UNCLOSED_STRING);
    }

    {UnopenString} {
        print("UnopenString:");
        error(LexicalError.UNOPEN_STRING);
    }

    "array"             { print();return symbol(sym.ARRAY); }
    "begin"             { print();return symbol(sym.BEGIN); }
    "case"              { print();return symbol(sym.CASE); }
    "const"             { print();return symbol(sym.CONST); }
    "do"                { print();return symbol(sym.DO); }
    "else"              { print();return symbol(sym.ELSE); }
    "end"               { print();return symbol(sym.END); }
    "for"               { print();return symbol(sym.FOR); }
    "function"          { print();return symbol(sym.FUNCTION); }
    "if"                { print();return symbol(sym.IF); }
    "of"                { print();return symbol(sym.OF); }
    "procedure"         { print();return symbol(sym.PROCEDURE); }

    "program"           { print();return symbol(sym.PROGRAM); }

    "record"            { print();return symbol(sym.RECORD); }
    "then"              { print();return symbol(sym.THEN); }
    "to"                { print();return symbol(sym.TO); }
    "type"              { print();return symbol(sym.TYPE); }
    "var"               { print();return symbol(sym.VAR); }
    "while"             { print();return symbol(sym.WHILE); }

    "INTEGER"           { print();return symbol(sym.INTEGER); }
    "REAL"              { print();return symbol(sym.REAL); }
    "CHARACTER"         { print();return symbol(sym.CHARACTER); }

    ";"                 { print();return symbol(sym.SEMI_COLONS); }

    ":"                 { print();return symbol(sym.COLONS); }
    ".."                { print();return symbol(sym.DOUBLE_DOT); }
    "."                 { print();return symbol(sym.DOT); }
    ","                 { print();return symbol(sym.COMMA); }
    "("                 { print();return symbol(sym.LEFT_PARENTHESIS); }
    ")"                 { print();return symbol(sym.RIGHT_PARENTHESIS); }
    "["                 { print();return symbol(sym.LEFT_BRACKET); }
    "]"                 { print();return symbol(sym.RIGHT_BRACKET); }

    ":="                { print();return symbol(sym.ASSIGN); }

    "="                 { print();return symbol(sym.EQ); }
    "<>"                { print();return symbol(sym.NEQ); }
    ">"                 { print();return symbol(sym.GT); }
    ">="                { print();return symbol(sym.GEQ); }
    "<"                 { print();return symbol(sym.LT); }
    "<="                { print();return symbol(sym.LEQ); }

    "+"                 { print();return symbol(sym.ADD); }
    "-"                 { print();return symbol(sym.SUB); }
    "*"                 { print();return symbol(sym.MUL); }
    "div"               { print();return symbol(sym.DIV); }
    "mod"               { print();return symbol(sym.MOD); }

    "and"               { print();return symbol(sym.AND); }
    "not"               { print();return symbol(sym.NOT); }
    "or"                { print();return symbol(sym.OR); }


    {DecimalConstant}   { return symbol(sym.NUMERIC_INTEGER_CONST, yytext()); }
    {FloatConstant}     { return symbol(sym.NUMERIC_REAL_CONST, yytext()); }

    {Identifier}        { return symbol(sym.IDENTIFIER, yytext()); }
    /*
    {InvalidIdentifier} {
        print(); error(LexicalError.INVALID_IDENTIFIER);
    }
    */
    {WhiteSpace}        {}
    [^]                 { error(LexicalError.ILEGAL_CHARACTER); }

}

/*
<COMMENT_1> {
    {CommentDelimiterEnd1} {
        yybegin(YYINITIAL);
    }
}

<COMMENT_2> {
    {CommentDelimiterEnd2} {
        yybegin(YYINITIAL);
    }
}

<COMMENT_1, COMMENT_2> {
    [^] {}
}
*/