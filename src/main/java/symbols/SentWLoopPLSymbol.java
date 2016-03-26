package symbols;

public class SentWLoopPLSymbol extends SentPLSymbol {

    private final WLoopPLSymbol wloop;

    public SentWLoopPLSymbol(WLoopPLSymbol wloop) {
        super(wloop);
        this.wloop = wloop;
    }
}
