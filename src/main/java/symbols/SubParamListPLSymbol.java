package symbols;

public class SubParamListPLSymbol extends PLSymbol {

    private final TerminalSymbol leftParenthesis;
    private final ExpListPLSymbol explist;
    private final TerminalSymbol rightParenthesis;

    public SubParamListPLSymbol(
            TerminalSymbol leftParenthesis,
            ExpListPLSymbol explist,
            TerminalSymbol rightParenthesis
    ) {
        super(rightParenthesis);
        this.leftParenthesis = leftParenthesis;
        this.explist = explist;
        this.rightParenthesis = rightParenthesis;
    }

    public static SubParamListPLSymbol create(
            TerminalSymbol leftParenthesis,
            ExpListPLSymbol explist,
            TerminalSymbol rightParenthesis
    ) {
        return new SubParamListPLSymbol(leftParenthesis, explist, rightParenthesis);
    }
}
