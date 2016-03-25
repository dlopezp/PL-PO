package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public class AllTypesPLSymbolTbas extends AllTypesPLSymbol {

    private TbasPLSymbol tbas;

    public AllTypesPLSymbolTbas(TbasPLSymbol tbas) {
        super();
        this.tbas = tbas;
    }

    public Location endLocation() {
        return tbas.endLocation();
    }
}
