package symbols;

public abstract class OpPLSymbol extends PLSymbol {

    public OpPLSymbol(PLSymbol lastSymbol) {
        super(lastSymbol);
    }

    public static OpPLSymbol create(OpCompPLSymbol opcomp) {
        return new OpCompWrapperPLSymbol(opcomp);
    }

    public static OpPLSymbol create(OpLogPLSymbol oplog) {
        return new OpLogWrapperPLSymbol(oplog);
    }

    public static OpPLSymbol create(OpAritPLSymbol oparit) {
        return new OpAritWrapperPLSymbol(oparit);
    }
}
