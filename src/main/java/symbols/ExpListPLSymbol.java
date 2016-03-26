package symbols;

import java.util.ArrayList;
import java.util.List;

public class ExpListPLSymbol extends PLSymbol {

    private List<ExpPLSymbol> exps;
    private List<TerminalSymbol> commas;

    public ExpListPLSymbol(ExpPLSymbol exp) {
        super(exp);
        exps = new ArrayList<ExpPLSymbol>();
        commas = new ArrayList<TerminalSymbol>();
        addExp(exp);
    }

    private void addExp(ExpPLSymbol exp) {
        exps.add(exp);
    }

    public void addExp(ExpPLSymbol exp, TerminalSymbol comma) {
        commas.add(comma);
        exps.add(exp);
    }

    @Override
    public Location endLocation() {
        return null;
    }

    public static ExpListPLSymbol create(ExpPLSymbol exp) {
        return new ExpListPLSymbol(exp);
    }
}
