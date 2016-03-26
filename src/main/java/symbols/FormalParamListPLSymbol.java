package symbols;

public class FormalParamListPLSymbol extends PLSymbol {

    private final TerminalSymbol leftParenthesis;
    private final FormalParamPLSymbol formalParam;
    private final TerminalSymbol rightParenthesis;

    public FormalParamListPLSymbol(TerminalSymbol leftParenthesis, FormalParamPLSymbol formal_param, TerminalSymbol rightParenthesis) {
        super(rightParenthesis);
        this.leftParenthesis = leftParenthesis;
        this.formalParam = formal_param;
        this.rightParenthesis = rightParenthesis;
    }

    public static FormalParamListPLSymbol create(
            TerminalSymbol leftParenthesis,
            FormalParamPLSymbol formal_param,
            TerminalSymbol rightParenthesis
    ) {
        return new FormalParamListPLSymbol(leftParenthesis, formal_param, rightParenthesis);
    }
}
