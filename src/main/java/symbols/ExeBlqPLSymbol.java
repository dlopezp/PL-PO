package symbols;

public class ExeBlqPLSymbol extends PLSymbol {

    private final DclListBlqPLSymbol dclListBlq;
    private final TerminalSymbol begin;
    private final SentListPLSymbol sentList;
    private final TerminalSymbol end;

    public ExeBlqPLSymbol(DclListBlqPLSymbol dcllist_blq, TerminalSymbol begin, SentListPLSymbol sentlist, TerminalSymbol end) {
        super(end);
        this.dclListBlq = dcllist_blq;
        this.begin = begin;
        this.sentList = sentlist;
        this.end = end;
    }

    public static ExeBlqPLSymbol create(
            DclListBlqPLSymbol dcllist_blq,
            TerminalSymbol begin,
            SentListPLSymbol sentlist,
            TerminalSymbol end
    ) {
        return new ExeBlqPLSymbol(dcllist_blq, begin, sentlist, end);
    }
}
