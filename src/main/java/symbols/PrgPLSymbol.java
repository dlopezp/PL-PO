package symbols;

public class PrgPLSymbol extends PLSymbol {

    private final TerminalSymbol program;
    private final TerminalSymbol identifier;
    private final TerminalSymbol semiColons;
    private final BlqPLSymbol blq;
    private final TerminalSymbol dot;

    public static PrgPLSymbol create(
            TerminalSymbol program,
            TerminalSymbol identifier,
            TerminalSymbol semiColons,
            BlqPLSymbol blq,
            TerminalSymbol dot
    ) {
        return new PrgPLSymbol(program, identifier, semiColons, blq, dot);
    }

    public PrgPLSymbol(TerminalSymbol program, TerminalSymbol identifier, TerminalSymbol semiColons, BlqPLSymbol blq, TerminalSymbol dot) {
        super(dot);
        this.program = program;
        this.identifier = identifier;
        this.semiColons = semiColons;
        this.blq = blq;
        this.dot = dot;
    }
}
