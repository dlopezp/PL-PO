package symbols;

import java.util.ArrayList;
import java.util.List;

public class TypeListPLSymbol extends PLSymbol {

    private List<TypePLSymbol> types;

    public TypeListPLSymbol(
            TypePLSymbol type
    ) {
        super(type);
        types = new ArrayList<TypePLSymbol>();
        addType(type);
    }

    public void addType(TypePLSymbol type) {
        types.add(type);
    }

    public static TypeListPLSymbol create(
            TypePLSymbol type
    ) {
        return new TypeListPLSymbol(type);
    }

}
