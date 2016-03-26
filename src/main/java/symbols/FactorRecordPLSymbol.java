package symbols;

public class FactorRecordPLSymbol extends FactorPLSymbol {

    private final TerminalSymbol identifierA;
    private final TerminalSymbol dot;
    private final TerminalSymbol identifierB;

    public FactorRecordPLSymbol(
            TerminalSymbol identifierA,
            TerminalSymbol dot,
            TerminalSymbol identifierB
    ) {
        super(identifierB);
        this.identifierA = identifierA;
        this.dot = dot;
        this.identifierB = identifierB;
    }
}
