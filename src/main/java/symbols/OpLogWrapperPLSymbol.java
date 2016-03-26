package symbols;

public class OpLogWrapperPLSymbol extends OpPLSymbol {

    private final OpLogPLSymbol oplog;

    public OpLogWrapperPLSymbol(OpLogPLSymbol oplog) {
        super(oplog);
        this.oplog = oplog;
    }
}
