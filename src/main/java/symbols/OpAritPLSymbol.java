package symbols;

public class OpAritPLSymbol extends PLSymbol {

    private final TerminalSymbol aritOp;

    public OpAritPLSymbol(TerminalSymbol aritOp) {
        super(aritOp);
        this.aritOp = aritOp;
    }

    public static OpAritPLSymbol create(TerminalSymbol aritOp) {
        return new OpAritPLSymbol(aritOp);
    }
}
