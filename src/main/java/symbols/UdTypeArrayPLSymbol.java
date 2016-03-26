package symbols;

public class UdTypeArrayPLSymbol extends UdTypePLSymbol {
    private final TerminalSymbol array_;
    private final TerminalSymbol leftBracket;
    private final SimpValuePLSymbol simpValueA;
    private final TerminalSymbol doubleDot;
    private final SimpValuePLSymbol simpValueB;
    private final TerminalSymbol rightBracket;
    private final TerminalSymbol of;
    private final AllTypesPLSymbol allTypes;

    public UdTypeArrayPLSymbol(
            TerminalSymbol array_,
            TerminalSymbol leftBracket,
            SimpValuePLSymbol simpvalueA,
            TerminalSymbol doubleDot,
            SimpValuePLSymbol simpvalueB,
            TerminalSymbol rightBracket,
            TerminalSymbol of,
            AllTypesPLSymbol alltypes
    ) {
        super(alltypes);
        this.array_ = array_;
        this.leftBracket = leftBracket;
        this.simpValueA = simpvalueA;
        this.doubleDot = doubleDot;
        this.simpValueB = simpvalueB;
        this.rightBracket = rightBracket;
        this.of = of;
        this.allTypes = alltypes;
    }
}
