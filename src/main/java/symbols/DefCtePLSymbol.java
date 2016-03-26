package symbols;

public class DefCtePLSymbol extends PLSymbol {

    private final TerminalSymbol const_;
    private final CteListPLSymbol ctelist;

    public DefCtePLSymbol(TerminalSymbol const_, CteListPLSymbol ctelist) {
        super(ctelist);
        this.const_ = const_;
        this.ctelist = ctelist;
    }

    public static DefCtePLSymbol create(
            TerminalSymbol const_,
            CteListPLSymbol ctelist
    ) {
        return new DefCtePLSymbol(const_, ctelist);
    }
}
