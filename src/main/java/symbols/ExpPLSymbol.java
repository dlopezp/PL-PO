package symbols;

public abstract class ExpPLSymbol extends PLSymbol {

    public ExpPLSymbol(PLSymbol lastSymbol) {
        super(lastSymbol);
    }

    public static ExpPLSymbol create(ExpPLSymbol expA, OpPLSymbol op, ExpPLSymbol expB) {
        return new ExpOpPLSymbol(expA, op, expB);
    }

    public static ExpPLSymbol create(FactorPLSymbol factor) {
        return new ExpFactorPLSymbol(factor);
    }
}
