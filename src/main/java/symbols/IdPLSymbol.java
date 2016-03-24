package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class IdPLSymbol extends PLSymbol {

    private TerminalSymbol identifier;

    IdPLSymbol(TerminalSymbol i) {
        identifier = i;
    }

    @Override
    Location endLocation() {
        return identifier.getLocation();
    }
}
