package symbols;

public class DclTypePLSymbol extends DclPLSymbol {

    private final DefTypePLSymbol deftype;

    public DclTypePLSymbol(DefTypePLSymbol deftype) {
        super(deftype);
        this.deftype = deftype;
    }
}
