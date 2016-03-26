package symbols;

public class DclVarPLSymbol extends DclPLSymbol {

    private final DefVarPLSymbol defvar;

    public DclVarPLSymbol(DefVarPLSymbol defvar) {
        super(defvar);
        this.defvar = defvar;
    }
}
