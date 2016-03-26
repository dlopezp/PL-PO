package symbols;

public abstract class FactorPLSymbol extends PLSymbol {

    public FactorPLSymbol(PLSymbol lastSymbol) {
        super(lastSymbol);
    }

    public static FactorPLSymbol create(SimpValuePLSymbol simpvalue) {
        return new FactorSimpPLSymbol(simpvalue);
    }

    public static FactorPLSymbol create(
            TerminalSymbol not,
            FactorPLSymbol factor
    ) {
        return new FactorNotPLSymbol(not, factor);
    }

    public static FactorPLSymbol create(
            TerminalSymbol leftParenthesis,
            ExpPLSymbol exp,
            TerminalSymbol rightParenthesis
    ) {
        return new FactorExpPLSymbol(leftParenthesis, exp, rightParenthesis);
    }

    public static FactorPLSymbol create(
            TerminalSymbol identifier,
            SubParamListPLSymbol subparamlist
    ) {
        return new FactorSubParamPLSymbol(identifier, subparamlist);
    }

    public static FactorPLSymbol create(
            TerminalSymbol identifier,
            TerminalSymbol leftBracket,
            ExpPLSymbol exp,
            TerminalSymbol rightBracket
    ) {
        return new FactorArrayPLSymbol(identifier, leftBracket, exp, rightBracket);
    }

    public static FactorPLSymbol create(
            TerminalSymbol identifierA,
            TerminalSymbol dot,
            TerminalSymbol identifierB
    ) {
        return new FactorRecordPLSymbol(identifierA, dot, identifierB);
    }
}
