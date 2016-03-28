package symbols;

public class TerminalSymbolFloat extends TerminalSymbol {

    private final float value;

    public TerminalSymbolFloat(String raw, float value, Location location) {
        super(raw, location);
        this.value = value;
    }
}
