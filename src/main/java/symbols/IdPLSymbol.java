package symbols;

public abstract class IdPLSymbol extends PLSymbol {

    IdPLSymbol(PLSymbol lastSymbol) {
        super(lastSymbol);
    }

    public static IdPLSymbol create(TerminalSymbol identifier) {
        return new IdSimplePLSymbol(identifier);
    }

    public static IdPLSymbol create(
            TerminalSymbol identifier,
            TerminalSymbol leftBracket,
            ExpPLSymbol exp,
            TerminalSymbol rightBracket
    ) {
        return new IdArrayPLSymbol(identifier, leftBracket, exp, rightBracket);
    }

    public static IdPLSymbol create(TerminalSymbol identifierA, TerminalSymbol dot, TerminalSymbol identifierB) {
        return new IdRecordPLSymbol(identifierA, dot, identifierB);
    }
}
