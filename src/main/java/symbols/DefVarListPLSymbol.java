package symbols;

import java.util.ArrayList;
import java.util.List;

public class DefVarListPLSymbol extends PLSymbol {

    private List<DefVarItemPLSymbol> defvars;
    private List<TerminalSymbol> semiColons;

    public DefVarListPLSymbol(DefVarItemPLSymbol defVarItem) {
        super(defVarItem);
        defvars = new ArrayList<DefVarItemPLSymbol>();
        semiColons = new ArrayList<TerminalSymbol>();
        addVarList(defVarItem);
    }

    private void addVarList(DefVarItemPLSymbol defVarItem) {
        defvars.add(defVarItem);
    }

    public void addVarList(
            TerminalSymbol semiColons,
            VarListPLSymbol varlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes
    ) {
        this.semiColons.add(semiColons);
        addVarList(new DefVarItemPLSymbol(varlist, colons, alltypes));
    }

    public static DefVarListPLSymbol create(
            VarListPLSymbol varlist,
            TerminalSymbol colons,
            AllTypesPLSymbol alltypes) {
        return new DefVarListPLSymbol(new DefVarItemPLSymbol(varlist, colons, alltypes));
    }
}
