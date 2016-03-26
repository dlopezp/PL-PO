package symbols;

public abstract class DclBlqPLSymbol extends PLSymbol {

    DclBlqPLSymbol(PLSymbol lastSymbol) {
        super(lastSymbol);
    }

    public static DclBlqPLSymbol create(DefCtePLSymbol defcte) {
        return new DclBlqCtePLSymbol(defcte);
    }

    public static DclBlqPLSymbol create(DefTypePLSymbol deftype) {
        return new DclBlqTypePLSymbol(deftype);
    }

    public static DclBlqPLSymbol create(DefVarPLSymbol defvar) {
        return new DclBlqVarPLSymbol(defvar);
    }
}
