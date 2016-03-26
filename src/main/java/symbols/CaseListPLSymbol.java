package symbols;

import java.util.ArrayList;
import java.util.List;

public class CaseListPLSymbol extends PLSymbol {

    private List<CaseSimplePLSymbol> cases;

    public CaseListPLSymbol(ExpPLSymbol exp, TerminalSymbol colons, SentPLSymbol sent, TerminalSymbol semiColons) {
        super(semiColons);
        cases = new ArrayList<CaseSimplePLSymbol>();
        addCase(exp, colons, sent, semiColons);
    }

    public void addCase(ExpPLSymbol exp, TerminalSymbol colons, SentPLSymbol sent, TerminalSymbol semiColons) {
        cases.add(new CaseSimplePLSymbol(exp, colons, sent, semiColons));
    }

    public static CaseListPLSymbol create(
            ExpPLSymbol exp,
            TerminalSymbol colons,
            SentPLSymbol sent,
            TerminalSymbol semiColons
    ) {
        return new CaseListPLSymbol(exp, colons, sent, semiColons);
    }
}
