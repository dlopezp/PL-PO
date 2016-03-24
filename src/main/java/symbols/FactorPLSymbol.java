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
    Location endLocation() {
        return simpValue.endLocation();
    }
}
