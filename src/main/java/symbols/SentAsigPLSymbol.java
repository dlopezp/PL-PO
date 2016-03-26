package symbols;

public class SentAsigPLSymbol extends SentPLSymbol {

    private final AsigPLSymbol asig;
    private final TerminalSymbol semiColons;

    public SentAsigPLSymbol(AsigPLSymbol asig, TerminalSymbol semiColons) {
        super(semiColons);
        this.asig = asig;
        this.semiColons = semiColons;
    }
}
