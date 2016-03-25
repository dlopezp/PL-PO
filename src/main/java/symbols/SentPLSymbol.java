package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class SentPLSymbol extends PLSymbol {

    private AsigPLSymbol asig;

    SentPLSymbol(AsigPLSymbol a) {
        asig = a;
    }

    @Override
    public Location endLocation() {
        return asig.endLocation();
    }
}
