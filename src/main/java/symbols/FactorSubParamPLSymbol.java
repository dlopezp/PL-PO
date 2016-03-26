package symbols;

public class FactorSubParamPLSymbol extends FactorPLSymbol {

    private final TerminalSymbol identfier;
    private final SubParamListPLSymbol subParamList;

    public FactorSubParamPLSymbol(TerminalSymbol identifier, SubParamListPLSymbol subparamlist) {
        super(subparamlist != null ? subparamlist : identifier);
        this.identfier = identifier;
        this.subParamList = subparamlist;
    }
}
