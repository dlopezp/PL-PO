package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public class ElseCondPLSymbol extends PLSymbol {

    private final SentPLSymbol sent;
    private final TerminalSymbol else_;

    public ElseCondPLSymbol(TerminalSymbol else_, SentPLSymbol sent) {
        super();

        this.else_ = else_;
        this.sent = sent;
    }

    @Override
    public Location endLocation() {
        return sent.endLocation();
    }
}
