package symbols;

public class FactorNotPLSymbol extends FactorPLSymbol {

    private final TerminalSymbol not;
    private final FactorPLSymbol factor;

    public FactorNotPLSymbol(TerminalSymbol not, FactorPLSymbol factor) {
        super(factor);
        this.not = not;
        this.factor = factor;
    }
}
