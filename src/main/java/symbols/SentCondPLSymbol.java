package symbols;

public class SentCondPLSymbol extends SentPLSymbol {

    private final CondPLSymbol cond;

    public SentCondPLSymbol(CondPLSymbol cond) {
        super(cond);
        this.cond = cond;
    }
}
