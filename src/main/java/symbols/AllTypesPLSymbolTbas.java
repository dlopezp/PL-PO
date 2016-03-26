package symbols;

public class AllTypesPLSymbolTbas extends AllTypesPLSymbol {

    private TbasPLSymbol tbas;

    public AllTypesPLSymbolTbas(TbasPLSymbol tbas) {
        super(tbas);
        this.tbas = tbas;
    }

    public Location endLocation() {
        return tbas.endLocation();
    }
}
