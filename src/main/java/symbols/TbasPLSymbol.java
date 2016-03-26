package symbols;

public class TbasPLSymbol extends PLSymbol {

    private TerminalSymbol value;

    TbasPLSymbol(TerminalSymbol value) {
        super(value);
        this.value = value;
    }

    public static TbasPLSymbol create(TerminalSymbol value) {
        return new TbasPLSymbol(value);
    }
}
