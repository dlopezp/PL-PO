package symbols;

import java.util.ArrayList;
import java.util.List;

public class DclListPLSymbol extends PLSymbol {

    private List<DclPLSymbol> dcls;

    public DclListPLSymbol() {
        super(null);
        dcls = new ArrayList<DclPLSymbol>();
    }

    public void addDcl(DclPLSymbol dcl) {
        dcls.add(dcl);
    }

    @Override
    public Location endLocation() {
        return dcls.get(0).endLocation();
    }

    public static DclListPLSymbol create() {
        return new DclListPLSymbol();
    }
}
