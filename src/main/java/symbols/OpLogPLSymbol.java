package symbols;

public class OpLogPLSymbol extends PLSymbol {

    private final TerminalSymbol logOp;

    public OpLogPLSymbol(TerminalSymbol logOp) {
        super(logOp);
        this.logOp = logOp;
    }

    public static OpLogPLSymbol create(TerminalSymbol logOp) {
        return new OpLogPLSymbol(logOp);
    }
}
