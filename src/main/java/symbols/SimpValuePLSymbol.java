package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class SimpValuePLSymbol extends PLSymbol {

    private TerminalSymbol value;

    SimpValuePLSymbol(TerminalSymbol v) {
        value = v;
    }

    @Override
    public Location endLocation() {
        return value.endLocation();
    }
}
