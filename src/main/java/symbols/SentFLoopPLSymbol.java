package symbols;

public class SentFLoopPLSymbol extends SentPLSymbol {

    private final FLoopPLSymbol floop;

    public SentFLoopPLSymbol(FLoopPLSymbol floop) {
        super(floop);
        this.floop = floop;
    }
}
