package symbols;

public class CaseSimplePLSymbol extends PLSymbol {

    private ExpPLSymbol exp;
    private TerminalSymbol colons;
    private SentPLSymbol sent;

    public CaseSimplePLSymbol(
            ExpPLSymbol exp,
            TerminalSymbol colons,
            SentPLSymbol sent
    ) {
        super(sent);
        this.exp = exp;
        this.colons = colons;
        this.sent = sent;
    }

    public static CaseSimplePLSymbol create(
            ExpPLSymbol exp,
            TerminalSymbol colons,
            SentPLSymbol sent
    ) {
        return new CaseSimplePLSymbol(exp, colons, sent);
    }
}
