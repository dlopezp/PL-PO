package symbols;

import java.util.ArrayList;
import java.util.List;

public class FormalParamPLSymbol extends PLSymbol {

    private List<FormalParamItemPLSymbol> params;
    private List<TerminalSymbol> semiColons;

    public FormalParamPLSymbol(FormalParamItemPLSymbol formalParamItem) {
        super(formalParamItem);
        params = new ArrayList<FormalParamItemPLSymbol>();
        semiColons = new ArrayList<TerminalSymbol>();
        addParam(formalParamItem);
    }

    private void addParam(FormalParamItemPLSymbol formalParamItem) {
        params.add(formalParamItem);
    }

    public void addParam(
            VarListPLSymbol varlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes,
            TerminalSymbol semiColons
    ) {
        addParam(new FormalParamItemPLSymbol(varlist, colons, alltypes));
        this.semiColons.add(semiColons);
    }

    public static FormalParamPLSymbol create(
            VarListPLSymbol varlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes
    ) {
        return new FormalParamPLSymbol(new FormalParamItemPLSymbol(varlist, colons, alltypes));
    }

}
