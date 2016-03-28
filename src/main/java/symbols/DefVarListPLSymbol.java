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
            DefVarItemPLSymbol defvaritem
    ) {
        this.semiColons.add(semiColons);
        addVarList(defvaritem);
    }

    @Override
    public Location endLocation() {
        return defvars.get(defvars.size() - 1).endLocation();
    }

    public static DefVarListPLSymbol create(
            DefVarItemPLSymbol defvaritem
    ) {
        return new DefVarListPLSymbol(defvaritem);
    }
}
