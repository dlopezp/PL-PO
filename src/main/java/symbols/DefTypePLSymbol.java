package symbols;

public class DefTypePLSymbol extends PLSymbol {

    private final TerminalSymbol type;
    private final PLSymbol typelist;

    public DefTypePLSymbol(TerminalSymbol type, PLSymbol typelist) {
        super(typelist);
        this.type = type;
        this.typelist = typelist;
    }

    public static DefTypePLSymbol create(TerminalSymbol type, TypeListPLSymbol typelist) {
        return new DefTypePLSymbol(type, typelist);
    }
}
