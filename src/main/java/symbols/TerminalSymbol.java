package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class TerminalSymbol {

    private String value;
    private Location location;

    TerminalSymbol(String v, Location l) {
        value = v;
        location = l;
    }

    public Location getLocation() {
        return location;
    }

    public Location getEndLocation() {
        return SymbolFactory.location(location.getLine(), location.getColumn() + value.length());
    }
}
