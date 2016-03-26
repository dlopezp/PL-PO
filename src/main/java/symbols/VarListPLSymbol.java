package symbols;

import java.util.ArrayList;
import java.util.List;

public class VarListPLSymbol extends PLSymbol {

    private List<TerminalSymbol> identifiers;

    public VarListPLSymbol(TerminalSymbol identifier) {
        super(identifier);
        identifiers = new ArrayList<TerminalSymbol>();
        addIdentifier(identifier);
    }

    public void addIdentifier(TerminalSymbol identifier) {
        identifiers.add(identifier);
    }

    public void add(TerminalSymbol identifier, TerminalSymbol comma) {
        identifiers.add(comma);
        identifiers.add(identifier);
    }

    public static VarListPLSymbol create(TerminalSymbol identifier) {
        return new VarListPLSymbol(identifier);
    }
}
