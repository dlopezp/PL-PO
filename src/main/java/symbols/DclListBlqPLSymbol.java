package symbols;

import java.util.ArrayList;
import java.util.List;

public class DclListBlqPLSymbol extends PLSymbol {

    private List<DclBlqPLSymbol> dcls;
    private List<TerminalSymbol> semiColons;

    public DclListBlqPLSymbol() {
        super(null);
        dcls = new ArrayList<DclBlqPLSymbol>();
        semiColons = new ArrayList<TerminalSymbol>();
    }

    public void addBlq(TerminalSymbol semiColons, DclBlqPLSymbol dcl_blq) {
        dcls.add(dcl_blq);
        this.semiColons.add(semiColons);
    }

    @Override
    public Location endLocation() {
        return dcls.get(0).endLocation();
    }

    public static DclListBlqPLSymbol create() {
        return new DclListBlqPLSymbol();
    }

}