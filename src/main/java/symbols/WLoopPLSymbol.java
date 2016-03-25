package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public class WLoopPLSymbol extends PLSymbol {

    private TerminalSymbol while_;
    private ExpPLSymbol exp;
    private TerminalSymbol do_;
    private SentPLSymbol sent;

    public WLoopPLSymbol(
            TerminalSymbol while_,
            ExpPLSymbol exp,
            TerminalSymbol do_,
            SentPLSymbol sent
    ) {
        super();

        this.while_ = while_;
        this.exp = exp;
        this.do_ = do_;
        this.sent = sent;
    }

    @Override
    public Location endLocation() {
        return sent.endLocation();
    }

}
