package symbols;

public class OpCompPLSymbol extends PLSymbol {

    private final TerminalSymbol lt;

    public OpCompPLSymbol(TerminalSymbol lt) {
        super(lt);
        this.lt = lt;
    }

    public static OpCompPLSymbol create(TerminalSymbol lt) {
        return new OpCompPLSymbol(lt);
    }
}
