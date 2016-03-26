package symbols;

public class DclFunPLSymbol extends DclPLSymbol {

    private DefFunPLSymbol deffun;

    public DclFunPLSymbol(DefFunPLSymbol deffun) {
        super(deffun);
        this.deffun = deffun;
    }

}
