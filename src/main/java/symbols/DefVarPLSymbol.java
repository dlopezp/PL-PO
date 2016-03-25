package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public class DefVarPLSymbol {

    private VarListPLSymbol varList;
    private AllTypesPLSymbol allTypes;

    public DefVarPLSymbol(VarListPLSymbol vl, AllTypesPLSymbol at) {
        varList = vl;
        allTypes = at;
    }

}
