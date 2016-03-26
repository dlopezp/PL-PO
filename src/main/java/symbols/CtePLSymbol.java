package symbols;

public class CtePLSymbol extends PLSymbol {

    private final TerminalSymbol identifier;
    private final TerminalSymbol eq;
    private final SimpValuePLSymbol simpvalue;
    private final TerminalSymbol semiColons;

    public CtePLSymbol(
            TerminalSymbol identifier,
            TerminalSymbol eq,
            SimpValuePLSymbol simpvalue,
            TerminalSymbol semiColons
    ) {
        super(semiColons);
        this.identifier = identifier;
        this.eq = eq;
        this.simpvalue = simpvalue;
        this.semiColons = semiColons;
    }

    public static CtePLSymbol create(
            TerminalSymbol identifier,
            TerminalSymbol eq,
            SimpValuePLSymbol simpvalue,
            TerminalSymbol semiColons
    ) {
        return new CtePLSymbol(identifier, eq, simpvalue, semiColons);
    }
}
