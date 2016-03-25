package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public class UdTypePLSymbol extends PLSymbol {

    private final TerminalSymbol record;
    private final PLSymbol defvarlist;
    private final TerminalSymbol end;

    public UdTypePLSymbol(TerminalSymbol record, PLSymbol defvarlist, TerminalSymbol end) {
        super();
        this.record = record;
        this.defvarlist = defvarlist;
        this.end = end;
    }

    @Override
    public Location endLocation() {
        return end.endLocation();
    }
}
