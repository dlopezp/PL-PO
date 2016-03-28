package symbols;

public class TerminalSymbolInteger extends TerminalSymbol {

    private final int value;

    public TerminalSymbolInteger(String raw, int value, Location location) {
        super(raw, location);
        this.value = value;
    }
}
