package symbols;

public class SimpValuePLSymbol extends PLSymbol {

    private TerminalSymbol value;

    public SimpValuePLSymbol(TerminalSymbol v) {
        super(v);
        value = v;
    }

    public static SimpValuePLSymbol create(TerminalSymbol value) {
        return new SimpValuePLSymbol(value);
    }
}
