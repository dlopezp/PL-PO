package symbols;

public class DefProcPLSymbol extends PLSymbol {

    private final TerminalSymbol procedure;
    private final TerminalSymbol identifier;
    private final FormalParamListPLSymbol formalParamList;
    private final TerminalSymbol semiColonsA;
    private final BlqPLSymbol blq;
    private final TerminalSymbol semiColonsB;

    public DefProcPLSymbol(
            TerminalSymbol procedure,
            TerminalSymbol identifier,
            FormalParamListPLSymbol formal_paramlist,
            TerminalSymbol semiColonsA,
            BlqPLSymbol blq,
            TerminalSymbol semiColonsB
    ) {
        super(semiColonsB);
        this.procedure = procedure;
        this.identifier = identifier;
        this.formalParamList = formal_paramlist;
        this.semiColonsA = semiColonsA;
        this.blq = blq;
        this.semiColonsB = semiColonsB;
    }

    public static DefProcPLSymbol create(
            TerminalSymbol procedure,
            TerminalSymbol identifier,
            FormalParamListPLSymbol formal_paramlist,
            TerminalSymbol semiColonsA,
            BlqPLSymbol blq,
            TerminalSymbol semiColonsB
    ) {
        return new DefProcPLSymbol(procedure, identifier, formal_paramlist, semiColonsA, blq, semiColonsB);
    }
}
