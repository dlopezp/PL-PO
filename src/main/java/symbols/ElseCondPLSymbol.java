package symbols;

public class ElseCondPLSymbol extends PLSymbol {

    private final SentPLSymbol sent;
    private final TerminalSymbol else_;

    public ElseCondPLSymbol(TerminalSymbol else_, SentPLSymbol sent) {
        super(sent);
        this.else_ = else_;
        this.sent = sent;
    }

    public static ElseCondPLSymbol create(TerminalSymbol else_, SentPLSymbol sent) {
;        return new ElseCondPLSymbol(else_, sent);
    }
}
