package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public class CaseSimplePLSymbol extends PLSymbol {

    private ExpPLSymbol exp;
    private TerminalSymbol colons;
    private SentPLSymbol sent;
    private TerminalSymbol semiColons;

    CaseSimplePLSymbol(
            ExpPLSymbol exp,
            TerminalSymbol colons,
            SentPLSymbol sent,
            TerminalSymbol semiColons
    ) {
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
