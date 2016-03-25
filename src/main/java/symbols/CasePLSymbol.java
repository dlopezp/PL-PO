package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
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
        this.case_ = case_;
        this.exp = exp;
        this.of = of;
        this.caselist = caselist;
        this.end = end;
    }

    @Override
    public Location endLocation() {
        return end.endLocation();
    }
}
