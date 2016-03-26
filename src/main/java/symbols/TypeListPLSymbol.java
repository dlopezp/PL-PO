package symbols;

import java.util.ArrayList;
import java.util.List;

public class TypeListPLSymbol extends PLSymbol {

    private List<TypePLSymbol> types;
    private List<TerminalSymbol> semiColons;

    public TypeListPLSymbol(
            TerminalSymbol identifier,
            TerminalSymbol eq,
            PLSymbol udtype,
            TerminalSymbol semiColons
    ) {
        super(semiColons);
        types = new ArrayList<TypePLSymbol>();
        addType(identifier, eq, udtype);
    }

    public void addType(TerminalSymbol identifier, TerminalSymbol eq, PLSymbol udtype) {
        types.add(new TypePLSymbol(identifier, eq, udtype));
    }

    public void addType(
            TerminalSymbol identifier,
            TerminalSymbol eq,
            UdTypePLSymbol udtype,
            TerminalSymbol semiColons
    ) {
        addType(identifier, eq, udtype);
        this.semiColons.add(semiColons);
    }

    public static TypeListPLSymbol create(
            TerminalSymbol identifier,
            TerminalSymbol eq,
            UdTypePLSymbol udtype,
            TerminalSymbol semiColons
    ) {
        return new TypeListPLSymbol(identifier, eq, udtype, semiColons);
    }

}
