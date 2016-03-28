package symbols;

public class TerminalSymbolString extends TerminalSymbol {

    private String value;

    public TerminalSymbolString(String raw, String value, Location location) {
        super(raw, location);
        this.value = value;
    }
}
