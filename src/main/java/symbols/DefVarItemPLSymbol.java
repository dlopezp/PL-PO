package symbols;

public class DefVarItemPLSymbol extends PLSymbol {

    private final VarListPLSymbol varlist;
    private final TerminalSymbol colons;
    private final AllTypesPLSymbol alltypes;

    public DefVarItemPLSymbol(VarListPLSymbol varlist, TerminalSymbol colons, AllTypesPLSymbol alltypes) {
        super(alltypes);
        this.varlist = varlist;
        this.colons = colons;
        this.alltypes = alltypes;
    }
}
