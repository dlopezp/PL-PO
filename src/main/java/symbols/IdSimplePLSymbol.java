package symbols;

public class IdSimplePLSymbol extends IdPLSymbol {

    private final TerminalSymbol identifier;

    public IdSimplePLSymbol(TerminalSymbol identifier) {
        super(identifier);
        this.identifier = identifier;
    }
}
