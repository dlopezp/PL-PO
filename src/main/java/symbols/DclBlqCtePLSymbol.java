package symbols;

public class DclBlqCtePLSymbol extends DclBlqPLSymbol {

    private final DefCtePLSymbol defcte;

    public DclBlqCtePLSymbol(DefCtePLSymbol defcte) {
        super(defcte);
        this.defcte = defcte;
    }
}
