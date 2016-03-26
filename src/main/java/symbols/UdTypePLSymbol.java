package symbols;

public abstract class UdTypePLSymbol extends PLSymbol {

    UdTypePLSymbol(PLSymbol lastSymbol) {
        super(lastSymbol);
    }

    public static UdTypePLSymbol create(
            TerminalSymbol array_,
            TerminalSymbol leftBracket,
            SimpValuePLSymbol simpvalueA,
            TerminalSymbol doubleDot,
            SimpValuePLSymbol simpvalueB,
            TerminalSymbol rightBracket,
            TerminalSymbol of,
            AllTypesPLSymbol alltypes
    ) {
        return new UdTypeArrayPLSymbol(array_, leftBracket, simpvalueA, doubleDot, simpvalueB, rightBracket, of, alltypes);
    }

    public static UdTypePLSymbol create(
            TerminalSymbol record,
            DefVarListPLSymbol defvarlist,
            TerminalSymbol end
    ) {
        return new UdTypeRecordPLSymbol(record, defvarlist, end);
    }
}
