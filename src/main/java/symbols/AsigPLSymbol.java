package symbols;

public class AsigPLSymbol extends PLSymbol {

    private IdPLSymbol id;
    private TerminalSymbol assign;
    private ExpPLSymbol exp;

    public AsigPLSymbol(IdPLSymbol id, TerminalSymbol assign, ExpPLSymbol exp) {
        super(exp);
        this.id = id;
        this.assign = assign;
        this.exp = exp;
    }

    public static AsigPLSymbol create(IdPLSymbol id, TerminalSymbol assign, ExpPLSymbol exp) {
        return new AsigPLSymbol(id, assign, exp);
    }
}
