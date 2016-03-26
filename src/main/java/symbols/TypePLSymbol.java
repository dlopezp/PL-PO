package symbols;

public class TypePLSymbol extends PLSymbol {

    private final TerminalSymbol identifier;
    private final TerminalSymbol eq;
    private final PLSymbol edtype;

    public TypePLSymbol(TerminalSymbol identifier, TerminalSymbol eq, PLSymbol udtype) {
        super(udtype);
        this.identifier = identifier;
        this.eq = eq;
        this.edtype = udtype;
    }

    @Override
    public Location endLocation() {
        return edtype.endLocation();
    }
}
