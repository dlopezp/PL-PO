package symbols;

public class ExpOpPLSymbol extends ExpPLSymbol {

    private final ExpPLSymbol expA;
    private final OpPLSymbol op;
    private final ExpPLSymbol expB;

    public ExpOpPLSymbol(ExpPLSymbol expA, OpPLSymbol op, ExpPLSymbol expB) {
        super(expB);
        this.expA = expA;
        this.op = op;
        this.expB = expB;
    }
}
