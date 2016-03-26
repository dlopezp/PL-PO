package symbols;

public class DefVarPLSymbol extends PLSymbol {

    private final TerminalSymbol var;
    private final DefVarListPLSymbol defvarlist;
    private final TerminalSymbol semiColons;

    public DefVarPLSymbol(TerminalSymbol var, DefVarListPLSymbol defvarlist, TerminalSymbol semiColons) {
        super(semiColons);
        this.var = var;
        this.defvarlist = defvarlist;
        this.semiColons = semiColons;
    }

    @Override
    public Location endLocation() {
        return null;
    }

    public static DefVarPLSymbol create(
            TerminalSymbol var,
            DefVarListPLSymbol defvarlist,
            TerminalSymbol semiColons
    ) {
        return new DefVarPLSymbol(var, defvarlist, semiColons);
    }
}
