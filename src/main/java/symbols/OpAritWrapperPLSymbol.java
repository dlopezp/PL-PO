package symbols;

public class OpAritWrapperPLSymbol extends OpPLSymbol {

    private final OpAritPLSymbol oparit;

    public OpAritWrapperPLSymbol(OpAritPLSymbol oparit) {
        super(oparit);
        this.oparit = oparit;
    }
}
