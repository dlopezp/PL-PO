package symbols;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dlopez on 25/3/16.
 */
public class CaseListPLSymbol extends PLSymbol {

    private List<CaseSimplePLSymbol> cases;

    CaseListPLSymbol(ExpPLSymbol exp, TerminalSymbol colons, SentPLSymbol sent, TerminalSymbol semiColons) {
        cases = new ArrayList<CaseSimplePLSymbol>();
        addCase(new CaseSimplePLSymbol(exp, colons, sent, semiColons));
    }

    public void addCase(CaseSimplePLSymbol caseSimple) {
        cases.add(caseSimple);
    }

    @Override
    public Location endLocation() {
        return cases.get(0).endLocation();
    }
}
