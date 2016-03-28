import java_cup.runtime.*;

import symbols.PLSymbolFactory;

%%

%class Lexer

%unicode
%cup
%line
%column

%init{
    errors = 0;
%init}

%{
    private static boolean DEBUG = false;
    private int errors;

    public int getErrors() {
        return errors;
    }

    private Symbol symbol(int type) {
        return symbol(type, yyline+1, yycolumn+1, yytext(), yytext());
    }

    private Symbol symbol(int type, String value) {
        return symbol(type, yyline+1, yycolumn+1, value, yytext());
    }

    private Symbol symbol(int type, int value) {
        return symbol(type, yyline+1, yycolumn+1, value, yytext());
    }

    private Symbol symbol(int type, float value) {
        return symbol(type, yyline+1, yycolumn+1, value, yytext());
    }

    private Symbol symbol(int type, int line, int column, String raw, String value) {
        if (DEBUG) printDebug(type, line, column, raw);
        return new Symbol(type, line, column, PLSymbolFactory.terminal(raw, value, line, column));
    }

    private Symbol symbol(int type, int line, int column, int value, String raw) {
        if (DEBUG) printDebug(type, line, column, raw);
        return new Symbol(type, line, column, PLSymbolFactory.terminal(raw, value, line, column));
    }

    private Symbol symbol(int type, int line, int column, float value, String raw) {
        if (DEBUG) printDebug(type, line, column, raw);
        return new Symbol(type, line, column, PLSymbolFactory.terminal(raw, value, line, column));
    }

    private void error (LexicalError error) {
        errors++;
        StringBuilder sb = new StringBuilder();
        sb.append("LexicalError => ");
        sb.append(error.location(yyline + 1, yycolumn + 1));
        sb.append(": " + error.comment());
        System.out.println(sb.toString());
    }

    private String parseString (String s) {
        return s.replaceAll("''", "'");
    }

    private int parseDecimal (String decimalText) {
        int result;
        if (decimalText.contains("$")) {
            result = parseHexDecimal(decimalText);
        } else {
            result = Integer.parseInt(decimalText);
        }
        return result;
    }

    private int parseHexDecimal(String decimalText) {
        return Integer.parseInt(decimalText.replace("$", ""), 16);
    }

    private float parseFloat (String floatText) {
        float result;
        if (floatText.contains("$")) {
            result = parseHexFloat(floatText);
        } else {
            result = Float.parseFloat(floatText.replace("$", ""));
        }
        return result;
    }

    private float parseHexFloat(String floatText) {
        String[] parts = floatText.replace("$", "").split("\\.");
        int integerValue = Integer.parseInt(parts[0], 16);
        int floatValue = Integer.parseInt(parts[1], 16);
        return Float.parseFloat(String.valueOf(integerValue) + "." + String.valueOf(floatValue));
    }

    private void printDebug (int type, int line, int column, String value) {
        String intFormat = "%3d";
        System.out.println("LexDebug => (" + String.format(intFormat, line) +", "+String.format(intFormat, column)+") ["+String.format(intFormat, type)+"] " + value);
    }
%}


LineTerminator = \r|\n|\r\n
BlankSpace = [ \t\f]
WhiteSpace = {LineTerminator} | {BlankSpace}

LetterLower = [a-z]
LetterUpper = [A-Z]
Letter = {LetterLower} | {LetterUpper}

Digit = [0-9]
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
CommentDelimiterEnd = {CommentDelimiterEnd1} | {CommentDelimiterEnd2}

/* identifiers */
IdentifierFirstChar = {Letter} | "_"
IdentifierValidChar = {IdentifierFirstChar} | {Number}
Identifier = {IdentifierFirstChar} {IdentifierValidChar}*

InvalidIdentifier = {Digit}+ {IdentifierValidChar}+

/* integer literals */
Sign = [+-]
IntegerNumber = 0 | {NumberNatural} {Number}*
IntegerDecimalConstant = {Sign}? {IntegerNumber}

HexDigit = [0-9a-fA-F]
HexDecimalConstant = "$" {Sign}? {HexDigit}+

DecimalConstant = {IntegerDecimalConstant} | {HexDecimalConstant}

/* floating point literals */
IntegerFloatConstant = {IntegerDecimalConstant} "." {Digit}+
HexFloatConstant = {HexDecimalConstant} "." {HexDigit}+
FloatConstant = {IntegerFloatConstant} | {HexFloatConstant}


/* string and character literals */
StringDelimiter = "'"
StringDelimiterInside = "''"
StringValidContent = [^'\n] | {StringDelimiterInside}

UnclosedString = {StringDelimiter} ({StringValidContent})*;
UnopenString = ({StringValidContent})* {StringDelimiter};
String = {StringDelimiter} ({StringValidContent})* {StringDelimiter}


%%

<YYINITIAL> {

    {Comment} {}

    {CommentDelimiterEnd} {
        error(LexicalError.UNOPEN_COMMENT);
    }

    {String} {
        return symbol(sym.STRING_CONST, parseString(yytext()));
    }

    {UnclosedString} {
        error(LexicalError.UNCLOSED_STRING);
    }

    {UnopenString} {
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


    {DecimalConstant}   { return symbol(sym.NUMERIC_INTEGER_CONST, parseDecimal(yytext())); }
    {FloatConstant}     { return symbol(sym.NUMERIC_REAL_CONST, parseFloat(yytext())); }

    {Identifier}        { return symbol(sym.IDENTIFIER); }

    {InvalidIdentifier} {
         error(LexicalError.INVALID_IDENTIFIER);
         return symbol(sym.IDENTIFIER, "fakeIdentifier");
    }

    {WhiteSpace}        {}
    [^]                 { error(LexicalError.ILEGAL_CHARACTER); }

}
