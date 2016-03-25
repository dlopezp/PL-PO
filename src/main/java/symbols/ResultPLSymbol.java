package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class ResultPLSymbol extends PLSymbol {

    private int errors;

    public ResultPLSymbol(int e) {
        errors = e;
    }

    @Override
    public String toString() {
        return "Parse finish with " + errors + " error" + (errors > 1 ? "s" : "");
    }

    @Override
    public Location endLocation() {
        return null;
    }
}
