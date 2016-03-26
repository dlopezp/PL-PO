package symbols;

public class OpCompWrapperPLSymbol extends OpPLSymbol {

    private final OpCompPLSymbol opcomp;

    public OpCompWrapperPLSymbol(OpCompPLSymbol opcomp) {
        super(opcomp);
        this.opcomp = opcomp;
    }
}
