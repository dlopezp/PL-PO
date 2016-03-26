package symbols;

public class FactorArrayPLSymbol extends FactorPLSymbol {

    private final TerminalSymbol identifier;
    private final TerminalSymbol leftBracket;
    private final ExpPLSymbol exp;
    private final TerminalSymbol rightBracket;

    public FactorArrayPLSymbol(
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
