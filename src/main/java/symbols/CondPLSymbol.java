package symbols;

public class CondPLSymbol extends PLSymbol {

    private final TerminalSymbol if_;
    private final PLSymbol exp;
    private final TerminalSymbol then;
    private final PLSymbol sent;
    private final PLSymbol elsecond;

    public CondPLSymbol(TerminalSymbol if_, PLSymbol exp, TerminalSymbol then, PLSymbol sent, PLSymbol elsecond) {
        super(elsecond != null ? elsecond : sent);
        this.if_ = if_;
        this.exp = exp;
        this.then = then;
        this.sent = sent;
        this.elsecond = elsecond;
    }

    public static CondPLSymbol create(
            TerminalSymbol if_,
            ExpPLSymbol exp,
            TerminalSymbol then,
            SentPLSymbol sent,
            ElseCondPLSymbol elsecond
    ) {
        return new CondPLSymbol(if_, exp, then, sent, elsecond);
    }
}
