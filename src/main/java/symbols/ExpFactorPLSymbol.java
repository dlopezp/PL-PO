package symbols;

public class ExpFactorPLSymbol extends ExpPLSymbol {

    private final FactorPLSymbol factor;

    public ExpFactorPLSymbol(FactorPLSymbol factor) {
        super(factor);
        this.factor = factor;
    }
}
