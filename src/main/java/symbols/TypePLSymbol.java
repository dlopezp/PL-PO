package symbols;

public class TypePLSymbol extends PLSymbol {

    private final TerminalSymbol identifier;
    private final TerminalSymbol eq;
    private final PLSymbol udtype;
    private final TerminalSymbol semiColons;

    public TypePLSymbol(
            TerminalSymbol identifier,
            TerminalSymbol eq,
            PLSymbol udtype,
            TerminalSymbol semiColons
    ) {
        super(udtype);
        this.identifier = identifier;
        this.eq = eq;
        this.udtype = udtype;
        this.semiColons = semiColons;
    }

    public static TypePLSymbol create(
            TerminalSymbol identifier,
            TerminalSymbol eq,
            UdTypePLSymbol udtype,
            TerminalSymbol semiColons
    ) {
        return new TypePLSymbol(identifier, eq, udtype, semiColons);
    }
}
