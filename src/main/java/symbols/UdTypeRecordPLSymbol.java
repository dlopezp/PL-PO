package symbols;

public class UdTypeRecordPLSymbol extends UdTypePLSymbol {

    private final TerminalSymbol record;
    private final DefVarListPLSymbol defVarList;
    private final TerminalSymbol end;

    public UdTypeRecordPLSymbol(TerminalSymbol record, DefVarListPLSymbol defvarlist, TerminalSymbol end) {
        super(end);
        this.record = record;
        this.defVarList = defvarlist;
        this.end = end;
    }
}
