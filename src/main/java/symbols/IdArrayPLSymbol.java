package symbols;

public class IdArrayPLSymbol extends IdPLSymbol {

    private final TerminalSymbol identifier;
    private final TerminalSymbol leftBracket;
    private final ExpPLSymbol exp;
    private final TerminalSymbol rightBracket;

    public IdArrayPLSymbol(
            TerminalSymbol identifier,
            TerminalSymbol leftBracket,
            ExpPLSymbol exp,
            TerminalSymbol rightBracket
    ) {
        super(rightBracket);
        this.identifier = identifier;
        this.leftBracket = leftBracket;
        this.exp = exp;
        this.rightBracket = rightBracket;
    }
}
