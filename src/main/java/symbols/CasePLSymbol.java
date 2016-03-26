package symbols;

public class CasePLSymbol extends PLSymbol {

    private TerminalSymbol case_;
    private ExpPLSymbol exp;
    private TerminalSymbol of;
    private CaseListPLSymbol caselist;
    private TerminalSymbol end;

    CasePLSymbol(
            TerminalSymbol case_,
            ExpPLSymbol exp,
            TerminalSymbol of,
            CaseListPLSymbol caselist,
            TerminalSymbol end
    ) {
        super(end);
        this.case_ = case_;
        this.exp = exp;
        this.of = of;
        this.caselist = caselist;
        this.end = end;
    }

    public static CasePLSymbol create(
            TerminalSymbol case_,
            ExpPLSymbol exp,
            TerminalSymbol of,
            CaseListPLSymbol caselist,
            TerminalSymbol end
    ) {
        return new CasePLSymbol(case_, exp, of, caselist, end);
    }
}
