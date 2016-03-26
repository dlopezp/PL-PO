package symbols;

public class SentProgCallPLSymbol extends SentPLSymbol {

    private final ProgCallPLSymbol progCall;
    private final TerminalSymbol semiColons;

    public SentProgCallPLSymbol(ProgCallPLSymbol progCall, TerminalSymbol semiColons) {
        super(semiColons);
        this.progCall = progCall;
        this.semiColons = semiColons;
    }
}
