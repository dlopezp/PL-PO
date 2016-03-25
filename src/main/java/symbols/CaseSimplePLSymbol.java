package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public class CaseSimplePLSymbol extends PLSymbol {

    private ExpPLSymbol exp;
    private SentPLSymbol sent;

    CaseSimplePLSymbol(ExpPLSymbol e, SentPLSymbol s) {
        exp = e;
        sent = s;
    }

    @Override
    public Location endLocation() {
        return sent.endLocation();
    }
}
