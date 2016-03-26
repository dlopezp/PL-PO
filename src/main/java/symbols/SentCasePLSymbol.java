package symbols;

public class SentCasePLSymbol extends SentPLSymbol {

    private final CasePLSymbol case_;

    public SentCasePLSymbol(CasePLSymbol case_) {
        super(case_);
        this.case_ = case_;
    }
}
