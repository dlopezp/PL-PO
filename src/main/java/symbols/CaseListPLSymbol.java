package symbols;

import java.util.ArrayList;
import java.util.List;

public class CaseListPLSymbol extends PLSymbol {

    private List<CaseSimplePLSymbol> cases;

    public CaseListPLSymbol(ExpPLSymbol exp, TerminalSymbol colons, SentPLSymbol sent) {
        super(sent);
        cases = new ArrayList<CaseSimplePLSymbol>();
        addCase(exp, colons, sent);
    }

    public CaseListPLSymbol(CaseSimplePLSymbol casesimple) {
        super(casesimple);
        cases = new ArrayList<CaseSimplePLSymbol>();
        addCase(casesimple);
    }

    public void addCase(CaseSimplePLSymbol casesimple) {
        cases.add(casesimple);
    }

    public void addCase(ExpPLSymbol exp, TerminalSymbol colons, SentPLSymbol sent) {
        cases.add(new CaseSimplePLSymbol(exp, colons, sent));
    }

    public static CaseListPLSymbol create(
            ExpPLSymbol exp,
            TerminalSymbol colons,
            SentPLSymbol sent
    ) {
        return new CaseListPLSymbol(exp, colons, sent);
    }

    public static CaseListPLSymbol create(CaseSimplePLSymbol casesimple) {
        return new CaseListPLSymbol(casesimple);
    }
}
