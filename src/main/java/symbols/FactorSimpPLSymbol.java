package symbols;

public class FactorSimpPLSymbol extends FactorPLSymbol {

    private final SimpValuePLSymbol simpValue;

    public FactorSimpPLSymbol(SimpValuePLSymbol simpvalue) {
        super(simpvalue);
        this.simpValue = simpvalue;
    }
}
