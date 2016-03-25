package symbols;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dlopez on 25/3/16.
 */
public class DefVarListPLSymbol extends PLSymbol {

    private List<DefVarPLSymbol> defvars;

    DefVarListPLSymbol(VarListPLSymbol vl, AllTypesPLSymbol at) {
        defvars = new ArrayList<DefVarPLSymbol>();
        addVarList(new DefVarPLSymbol(vl, at));
    }

    private void addVarList(DefVarPLSymbol defVar) {
        defvars.add(defVar);
    }

    @Override
    public Location endLocation() {
        return null;
    }
}
