package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public abstract class AllTypesPLSymbol extends PLSymbol {

    public static AllTypesPLSymbol build(TbasPLSymbol tbas) {
        return new AllTypesPLSymbolTbas(tbas);
    }

    public static AllTypesPLSymbol build(TerminalSymbol identifier) {
        return new AllTypesPLSymbolId(identifier);
    }

}
