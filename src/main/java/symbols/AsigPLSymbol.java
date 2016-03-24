package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class AsigPLSymbol extends PLSymbol {

    private IdPLSymbol id;
    private String assign;
    private ExpPLSymbol exp;

    AsigPLSymbol(IdPLSymbol i, String a, ExpPLSymbol e) {
        id = i;
        assign = a;
        exp = e;
    }

    public Location endLocation() {
        return exp.endLocation();
    }
}
