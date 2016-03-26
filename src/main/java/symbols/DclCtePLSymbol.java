package symbols;

public class DclCtePLSymbol extends DclPLSymbol {

    private final DefCtePLSymbol defcte;

    public DclCtePLSymbol(DefCtePLSymbol defcte) {
        super(defcte);
        this.defcte = defcte;
    }
}
