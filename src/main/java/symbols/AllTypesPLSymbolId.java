package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public class AllTypesPLSymbolId extends AllTypesPLSymbol {

    private TerminalSymbol identifier;

    public AllTypesPLSymbolId(TerminalSymbol identifier) {
        super();
        this.identifier = identifier;
    }

    @Override
    public Location endLocation() {
        return identifier.endLocation();
    }
}
