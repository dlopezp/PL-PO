package symbols;

public class DclBlqVarPLSymbol extends DclBlqPLSymbol {

    private final DefVarPLSymbol defvar;

    public DclBlqVarPLSymbol(DefVarPLSymbol defvar) {
        super(defvar);
        this.defvar = defvar;
    }
}
