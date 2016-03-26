package symbols;

public abstract class AllTypesPLSymbol extends PLSymbol {

    AllTypesPLSymbol(PLSymbol lastSymbol) {
        super(lastSymbol);
    }

    public static AllTypesPLSymbol build(TbasPLSymbol tbas) {
        return new AllTypesPLSymbolTbas(tbas);
    }

    public static AllTypesPLSymbol build(TerminalSymbol identifier) {
        return new AllTypesPLSymbolId(identifier);
    }

}
