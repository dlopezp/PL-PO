package symbols;

public class DefFunPLSymbol extends PLSymbol {

    private final TerminalSymbol function;
    private final TerminalSymbol identifier;
    private final FormalParamListPLSymbol formalParamList;
    private final TerminalSymbol colons;
    private final AllTypesPLSymbol alltypes;
    private final TerminalSymbol semiColonsA;
    private final BlqPLSymbol blq;
    private final TerminalSymbol semiColonsB;

    public DefFunPLSymbol(
            TerminalSymbol function,
            TerminalSymbol identifier,
            FormalParamListPLSymbol formal_paramlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes,
            TerminalSymbol semiColonsA,
            BlqPLSymbol blq,
            TerminalSymbol semiColonsB
    ) {
        super(semiColonsB);
        this.function = function;
        this.identifier = identifier;
        this.formalParamList = formal_paramlist;
        this.colons = colons;
        this.alltypes = alltypes;
        this.semiColonsA = semiColonsA;
        this.blq = blq;
        this.semiColonsB = semiColonsB;
    }

    @Override
    public Location endLocation() {
        return null;
    }

    public static DefFunPLSymbol create(
            TerminalSymbol function,
            TerminalSymbol identifier,
            FormalParamListPLSymbol formal_paramlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes,
            TerminalSymbol semiColonsA,
            BlqPLSymbol blq,
            TerminalSymbol semiColonsB
    ) {
        return new DefFunPLSymbol(
                function,
                identifier,
                formal_paramlist,
                colons,
                alltypes,
                semiColonsA,
                blq, semiColonsB
        );
    }
}
