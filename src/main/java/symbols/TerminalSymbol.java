package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class TerminalSymbol implements Localizable {

    private String value;
    private Location location;

    TerminalSymbol(String v, Location l) {
        value = v;
        location = l;
    }

    public Location getLocation() {
        return location;
    }

    public Location endLocation() {
        return SymbolFactory.location(location.getLine(), location.getColumn() + value.length());
    }
}
