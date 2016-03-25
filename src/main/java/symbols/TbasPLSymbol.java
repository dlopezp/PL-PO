package symbols;

public class TbasPLSymbol extends PLSymbol {

    private TerminalSymbol identifier;

    TbasPLSymbol(TerminalSymbol i) {
        identifier = i;
    }

    @Override
    public Location endLocation() {
        return identifier.getLocation();
    }
}
