package symbols;

public class IdRecordPLSymbol extends IdPLSymbol {

    private final TerminalSymbol identifierA;
    private final TerminalSymbol dot;
    private final TerminalSymbol identifierB;

    public IdRecordPLSymbol(TerminalSymbol identifierA, TerminalSymbol dot, TerminalSymbol identifierB) {
        super(identifierB);
        this.identifierA = identifierA;
        this.dot = dot;
        this.identifierB = identifierB;
    }
}
