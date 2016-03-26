package symbols;

public class DclBlqTypePLSymbol extends DclBlqPLSymbol {

    private final DefTypePLSymbol deftype;

    public DclBlqTypePLSymbol(DefTypePLSymbol deftype) {
        super(deftype);
        this.deftype = deftype;
    }
}
