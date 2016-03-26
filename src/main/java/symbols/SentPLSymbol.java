package symbols;

public abstract class SentPLSymbol extends PLSymbol {

    SentPLSymbol(PLSymbol lastSymbol) {
        super(lastSymbol);
    }

    public static SentPLSymbol create(AsigPLSymbol asig, TerminalSymbol semiColons) {
        return new SentAsigPLSymbol(asig, semiColons);
    }

    public static SentPLSymbol create(ProgCallPLSymbol progCall, TerminalSymbol semiColons) {
        return new SentProgCallPLSymbol(progCall, semiColons);
    }

    public static SentPLSymbol create(ExeBlqPLSymbol exeblq) {
        return new SentExeBlqPLSymbol(exeblq);
    }

    public static SentPLSymbol create(CondPLSymbol cond) {
        return new SentCondPLSymbol(cond);
    }

    public static SentPLSymbol create(WLoopPLSymbol wloop) {
        return new SentWLoopPLSymbol(wloop);
    }

    public static SentPLSymbol create(FLoopPLSymbol floop) {
        return new SentFLoopPLSymbol(floop);
    }

    public static SentPLSymbol create(CasePLSymbol case_) {
        return new SentCasePLSymbol(case_);
    }
}
