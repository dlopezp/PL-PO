package symbols;

public class DclPLSymbol extends PLSymbol {

    public DclPLSymbol(PLSymbol lastSymbol) {
        super(lastSymbol);
    }

    public static DclPLSymbol create(DefFunPLSymbol deffun) {
        return new DclFunPLSymbol(deffun);
    }

    public static DclPLSymbol create(DefTypePLSymbol deftype) {
        return new DclTypePLSymbol(deftype);
    }

    public static DclPLSymbol create(DefProcPLSymbol defproc) {
        return new DclProcPLSymbol(defproc);
    }

    public static DclPLSymbol create(DefCtePLSymbol defcte) {
        return new DclCtePLSymbol(defcte);
    }

    public static DclPLSymbol create(DefVarPLSymbol defvar) {
        return new DclVarPLSymbol(defvar);
    }

}
