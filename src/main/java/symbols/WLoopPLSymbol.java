package symbols;

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
        super(sent);
        this.while_ = while_;
        this.exp = exp;
        this.do_ = do_;
        this.sent = sent;
    }

    public static WLoopPLSymbol create(TerminalSymbol while_, ExpPLSymbol exp, TerminalSymbol do_, SentPLSymbol sent) {
        return new WLoopPLSymbol(while_, exp, do_, sent);
    }
}
