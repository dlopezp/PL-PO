package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class FactorPLSymbol extends PLSymbol {

    private SimpValuePLSymbol simpValue;

    FactorPLSymbol(SimpValuePLSymbol sv) {
        simpValue = sv;
    }

    @Override
    public Location endLocation() {
        return simpValue.endLocation();
    }
}
