package symbols;

public class FactorExpPLSymbol extends FactorPLSymbol {

    private final TerminalSymbol leftParenthesis;
    private final ExpPLSymbol exp;
    private final TerminalSymbol rightParenthesis;

    public FactorExpPLSymbol(
            TerminalSymbol leftParenthesis,
            ExpPLSymbol exp,
            TerminalSymbol rightParenthesis
    ) {
        super(rightParenthesis);
        this.leftParenthesis = leftParenthesis;
        this.exp = exp;
        this.rightParenthesis = rightParenthesis;
    }
}
