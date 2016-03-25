package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public class CondPLSymbol extends PLSymbol {

    private final TerminalSymbol if_;
    private final PLSymbol exp;
    private final TerminalSymbol then;
    private final PLSymbol sent;
    private final PLSymbol elsecond;

    public CondPLSymbol(TerminalSymbol if_, PLSymbol exp, TerminalSymbol then, PLSymbol sent, PLSymbol elsecond) {
        super();

        this.if_ = if_;
        this.exp = exp;
        this.then = then;
        this.sent = sent;
        this.elsecond = elsecond;
    }

    @Override
    public Location endLocation() {
        return elsecond.endLocation();
    }
}
