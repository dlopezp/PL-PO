package symbols;

public class FormalParamItemPLSymbol extends PLSymbol {

    private final VarListPLSymbol varlist;
    private final TerminalSymbol colons;
    private final AllTypesPLSymbol alltypes;

    public FormalParamItemPLSymbol(
            VarListPLSymbol varlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes
    ) {
        super(alltypes);
        this.varlist = varlist;
        this.colons = colons;
        this.alltypes = alltypes;
    }

    public static FormalParamItemPLSymbol create(
            VarListPLSymbol varlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes
    ) {
        return new FormalParamItemPLSymbol(varlist, colons, alltypes);
    }
}
