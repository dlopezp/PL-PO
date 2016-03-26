package symbols;

public class FLoopPLSymbol extends PLSymbol {

    private TerminalSymbol for_;
    private TerminalSymbol identifier;
    private TerminalSymbol assign;
    private ExpPLSymbol expA;
    private TerminalSymbol to;
    private ExpPLSymbol expB;
    private TerminalSymbol do_;
    private SentPLSymbol sent;

    public FLoopPLSymbol(
            TerminalSymbol for_,
            TerminalSymbol identifier,
            TerminalSymbol assign,
            ExpPLSymbol expA,
            TerminalSymbol to,
            ExpPLSymbol expB,
            TerminalSymbol do_,
            SentPLSymbol sent
    ) {
        super(sent);
        this.for_ = for_;
        this.identifier = identifier;
        this.assign = assign;
        this.expA = expA;
        this.to = to;
        this.expB = expB;
        this.do_ = do_;
        this.sent = sent;
    }

    public static FLoopPLSymbol create(
            TerminalSymbol for_,
            TerminalSymbol identifier,
            TerminalSymbol assign,
            ExpPLSymbol expA,
            TerminalSymbol to,
            ExpPLSymbol expB,
            TerminalSymbol do_,
            SentPLSymbol sent
    ) {
        return new FLoopPLSymbol(for_, identifier, assign, expA, to, expB, do_, sent);
    }
}
