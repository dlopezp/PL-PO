package symbols;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dlopez on 25/3/16.
 */
public class TypeListPLSymbol extends PLSymbol {

    private List<TypePLSymbol> types;
    public TypeListPLSymbol(TerminalSymbol identifier, TerminalSymbol eq, PLSymbol udtype, TerminalSymbol semiColons) {
        super();
        types = new ArrayList<TypePLSymbol>();
        addType(identifier, eq, udtype);
    }

    public void addType(TerminalSymbol identifier, TerminalSymbol eq, PLSymbol udtype) {
        types.add(new TypePLSymbol(identifier, eq, udtype));
    }

    @Override
    public Location endLocation() {
        return types.get(0).endLocation();
    }
}
