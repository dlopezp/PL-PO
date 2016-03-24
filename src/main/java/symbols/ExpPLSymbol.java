package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class ExpPLSymbol extends PLSymbol {

    private FactorPLSymbol factor;

    ExpPLSymbol(FactorPLSymbol f) {
        factor = f;
    }

    @Override
    Location endLocation() {
        return factor.endLocation();
    }
}
