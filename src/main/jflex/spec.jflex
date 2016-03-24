import java_cup.runtime.*;

%%

%class Lexer

%unicode
%cup
%line
%column

%init{
%init}

%{
    private static boolean DEBUG = false;

    private Symbol symbol(int type) {
        return symbol(type, yyline+1, yycolumn+1, yytext());
    }

    private Symbol symbol(int type, Object value) {
        return symbol(type, yyline+1, yycolumn+1, value);
    }

    private Symbol symbol(int type, int line, int column, Object value) {
        String intFormat = "%3d";
        if (DEBUG) print("LexDebug => (" + String.format(intFormat, line) +", "+String.format(intFormat, column)+") ["+String.format(intFormat, type)+"] " + value);
        return new Symbol(type, line, column, value);
    }

    private void error (LexicalError error) {
        System.err.println("LEXICAL ERROR");
        System.err.println("Line " + (yyline + 1) + ", Column " + (yycolumn + 1));
        System.err.println(error.comment());
        System.err.println();
        //System.exit(0);
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

%eof{
%eof}

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
//InvalidComment = {InvalidComment1} | {InvalidComment2}
CommentDelimiterEnd = {CommentDelimiterEnd1} | {CommentDelimiterEnd2}

/* identifiers */
IdentifierFirstChar = {Letter} | "_"
IdentifierValidChar = {IdentifierFirstChar} | {Number}
Identifier = {IdentifierFirstChar} {IdentifierValidChar}*

//InvalidIdentifierFirstChar = [^a-zA-Z_ \t\f\r\n]
//IdentifierInvalidChar = [^a-zA-Z_0-9 \t\f\r\n]
//InvalidIdentifier = {InvalidIdentifierFirstChar} {IdentifierValidChar}?

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

//%s COMMENT_1, COMMENT_2

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
        return symbol(sym.STRING_CONST, parseString(yytext()));
    }

    {UnclosedString} {
        print("UnclosedString:");
        error(LexicalError.UNCLOSED_STRING);
    }

    {UnopenString} {
        print("UnopenString:");
        error(LexicalError.UNOPEN_STRING);
    }

    "array"             { return symbol(sym.ARRAY); }
    "begin"             { return symbol(sym.BEGIN); }
    "case"              { return symbol(sym.CASE); }
    "const"             { return symbol(sym.CONST); }
    "do"                { return symbol(sym.DO); }
    "else"              { return symbol(sym.ELSE); }
    "end"               { return symbol(sym.END); }
    "for"               { return symbol(sym.FOR); }
    "function"          { return symbol(sym.FUNCTION); }
    "if"                { return symbol(sym.IF); }
    "of"                { return symbol(sym.OF); }
    "procedure"         { return symbol(sym.PROCEDURE); }

    "program"           { return symbol(sym.PROGRAM); }

    "record"            { return symbol(sym.RECORD); }
    "then"              { return symbol(sym.THEN); }
    "to"                { return symbol(sym.TO); }
    "type"              { return symbol(sym.TYPE); }
    "var"               { return symbol(sym.VAR); }
    "while"             { return symbol(sym.WHILE); }

    "INTEGER"           { return symbol(sym.INTEGER); }
    "REAL"              { return symbol(sym.REAL); }
    "CHARACTER"         { return symbol(sym.CHARACTER); }

    ";"                 { return symbol(sym.SEMI_COLONS); }

    ":"                 { return symbol(sym.COLONS); }
    ".."                { return symbol(sym.DOUBLE_DOT); }
    "."                 { return symbol(sym.DOT); }
    ","                 { return symbol(sym.COMMA); }
    "("                 { return symbol(sym.LEFT_PARENTHESIS); }
    ")"                 { return symbol(sym.RIGHT_PARENTHESIS); }
    "["                 { return symbol(sym.LEFT_BRACKET); }
    "]"                 { return symbol(sym.RIGHT_BRACKET); }

    ":="                { return symbol(sym.ASSIGN); }

    "="                 { return symbol(sym.EQ); }
    "<>"                { return symbol(sym.NEQ); }
    ">"                 { return symbol(sym.GT); }
    ">="                { return symbol(sym.GEQ); }
    "<"                 { return symbol(sym.LT); }
    "<="                { return symbol(sym.LEQ); }

    "+"                 { return symbol(sym.ADD); }
    "-"                 { return symbol(sym.SUB); }
    "*"                 { return symbol(sym.MUL); }
    "div"               { return symbol(sym.DIV); }
    "mod"               { return symbol(sym.MOD); }

    "and"               { return symbol(sym.AND); }
    "not"               { return symbol(sym.NOT); }
    "or"                { return symbol(sym.OR); }


    {DecimalConstant}   { return symbol(sym.NUMERIC_INTEGER_CONST); }
    {FloatConstant}     { return symbol(sym.NUMERIC_REAL_CONST); }

    {Identifier}        { return symbol(sym.IDENTIFIER); }
    /*
    {InvalidIdentifier} {
         error(LexicalError.INVALID_IDENTIFIER);
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