package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public class DefType extends PLSymbol {

    private final TerminalSymbol type;
    private final PLSymbol typelist;

    public DefType(TerminalSymbol type, PLSymbol typelist) {
        super();
        this.type = type;
        this.typelist = typelist;
    }

    @Override
    public Location endLocation() {
        return typelist.endLocation();
    }
}
