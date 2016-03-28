package symbols;

public class TerminalSymbol extends PLSymbol {

    protected String raw;
    protected Location location;

    public TerminalSymbol(String raw, Location location) {
        super(null);
        this.raw = raw;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public Location endLocation() {
        return PLSymbolFactory.location(location.getLine(), location.getColumn() + raw.length());
    }

    @Override
    public String toString() {
        return location + " " + raw;
    }

    public static TerminalSymbol create(
            String raw,
            Location location
    ) {
        return create(raw, raw, location);
    }

    public static TerminalSymbol create(
            String raw,
            String value,
            Location location
    ) {
        return new TerminalSymbolString(raw, value, location);
    }

    public static TerminalSymbol create(
            String raw,
            int value,
            Location location
    ) {
        return new TerminalSymbolInteger(raw, value, location);
    }

    public static TerminalSymbol create(
            String raw,
            float value,
            Location location
            ) {
        return new TerminalSymbolFloat(raw, value, location);
    }

}
