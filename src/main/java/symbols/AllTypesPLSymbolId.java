package symbols;

public class AllTypesPLSymbolId extends AllTypesPLSymbol {

    private TerminalSymbol identifier;

    public AllTypesPLSymbolId(TerminalSymbol identifier) {
        super(identifier);
        this.identifier = identifier;
    }

    @Override
    public Location endLocation() {
        return identifier.endLocation();
    }
}
