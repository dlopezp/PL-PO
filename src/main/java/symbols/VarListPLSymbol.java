package symbols;

import java.util.ArrayList;
import java.util.List;

public class VarListPLSymbol extends PLSymbol {

    private List<TerminalSymbol> identifiers;

    public VarListPLSymbol(TerminalSymbol identifier) {
        identifiers = new ArrayList<TerminalSymbol>();
        addIdentifier(identifier);
    }

    public void addIdentifier(TerminalSymbol identifier) {
        identifiers.add(identifier);
    }

    @Override
    public Location endLocation() {
        return identifiers.get(0).endLocation();
    }
}
