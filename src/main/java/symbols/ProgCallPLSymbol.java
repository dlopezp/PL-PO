package symbols;

public class ProgCallPLSymbol extends PLSymbol {

    private final TerminalSymbol identifier;
    private final SubParamListPLSymbol subParamList;

    public ProgCallPLSymbol(TerminalSymbol identifier, SubParamListPLSymbol subparamlist) {
        super(subparamlist);
        this.identifier = identifier;
        this.subParamList = subparamlist;
    }

    public static ProgCallPLSymbol create(
            TerminalSymbol identifier,
            SubParamListPLSymbol subparamlist
    ) {
        return new ProgCallPLSymbol(identifier, subparamlist);
    }
}
