package symbols;

public class BlqPLSymbol extends PLSymbol {

    private final DclListPLSymbol dcllist;
    private final TerminalSymbol begin;
    private final SentListPLSymbol sentlist;
    private final TerminalSymbol end;

    public BlqPLSymbol(DclListPLSymbol dcllist, TerminalSymbol begin, SentListPLSymbol sentlist, TerminalSymbol end) {
        super(end);
        this.dcllist = dcllist;
        this.begin = begin;
        this.sentlist = sentlist;
        this.end = end;
    }

    public static BlqPLSymbol create(
            DclListPLSymbol dcllist,
            TerminalSymbol begin,
            SentListPLSymbol sentlist,
            TerminalSymbol end
    ) {
        return new BlqPLSymbol(dcllist, begin, sentlist, end);
    }
}
