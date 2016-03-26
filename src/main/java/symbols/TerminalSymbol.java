package symbols;

public class TerminalSymbol extends PLSymbol {

    private String value;
    private Location location;

    public TerminalSymbol(String v, Location l) {
        super(null);
        value = v;
        location = l;
    }

    public Location getLocation() {
        return location;
    }

    public String getValue() {
        return value;
    }

    public Location endLocation() {
        return PLSymbolFactory.location(location.getLine(), location.getColumn() + value.length());
    }

    @Override
    public String toString() {
        return location + " " + value;
    }
}
