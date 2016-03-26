package symbols;

public class CaseSimplePLSymbol extends PLSymbol {

    private ExpPLSymbol exp;
    private TerminalSymbol colons;
    private SentPLSymbol sent;
    private TerminalSymbol semiColons;

    public CaseSimplePLSymbol(
            ExpPLSymbol exp,
            TerminalSymbol colons,
            SentPLSymbol sent,
            TerminalSymbol semiColons
    ) {
        super(semiColons);
        this.exp = exp;
        this.colons = colons;
        this.sent = sent;
        this.semiColons = semiColons;
    }

    @Override
    public Location endLocation() {
        return semiColons.endLocation();
    }
}
