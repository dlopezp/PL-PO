package symbols;

import java.util.ArrayList;
import java.util.List;

public class CteListPLSymbol extends PLSymbol {

    private List<CtePLSymbol> ctes;

    public CteListPLSymbol(CtePLSymbol cte) {
        super(cte);
        ctes = new ArrayList<CtePLSymbol>();
        addCte(cte);
    }

    public void addCte(CtePLSymbol cte) {
        ctes.add(cte);
    }

    public void addCte(
            TerminalSymbol identifier,
            TerminalSymbol eq,
            SimpValuePLSymbol simpvalue,
            TerminalSymbol semiColons
    ) {
        addCte(new CtePLSymbol(identifier, eq, simpvalue, semiColons));
    }

    public static CteListPLSymbol create(
            CtePLSymbol cte
    ) {
        return new CteListPLSymbol(cte);
    }

}
