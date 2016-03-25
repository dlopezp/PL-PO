package symbols;

/**
 * Created by dlopez on 25/3/16.
 */
public abstract class AllTypesPLSymbol extends PLSymbol {

    public static AllTypesPLSymbol build(TbasPLSymbol tbas) {
        return new AllTypesPLSymbolTbas(tbas);
    }

    public static AllTypesPLSymbol build(String identifier, int line, int column) {
        return new AllTypesPLSymbolId(SymbolFactory.terminal(identifier, line, column));
    }

}
