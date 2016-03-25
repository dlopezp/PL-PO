package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class SymbolFactory {

    public static TerminalSymbol terminal(String value, Location location) {
        return new TerminalSymbol(value, location);
    }

    public static TerminalSymbol terminal(String value, int line, int column) {
        return new TerminalSymbol(value, location(line, column));
    }

    public static Location location(int line, int column) {
        return new Location(line, column);
    }

    public static ResultPLSymbol result(int errors) {
        return new ResultPLSymbol(errors);
    }

    public static PLSymbol simpvalue(String value, int line, int column) {
        TerminalSymbol terminal = terminal(value, line, column);
        return new SimpValuePLSymbol(terminal);
    }

    public static PLSymbol factor(PLSymbol simpvalue) {
        return new FactorPLSymbol((SimpValuePLSymbol) simpvalue);
    }

    public static PLSymbol exp(PLSymbol factor) {
        return new ExpPLSymbol((FactorPLSymbol) factor);
    }

    public static PLSymbol id(String identifier, int line, int column) {
        TerminalSymbol terminal = terminal(identifier, line, column);
        return new IdPLSymbol(terminal);
    }

    public static PLSymbol asig(PLSymbol id, Object assign, PLSymbol exp) {
        return new AsigPLSymbol((IdPLSymbol) id, (String) assign, (ExpPLSymbol) exp);
    }

    public static PLSymbol alltypes(PLSymbol tbas) {
        return AllTypesPLSymbol.build((TbasPLSymbol) tbas);
    }

    public static PLSymbol alltypes(String identifier, int line, int column) {
        return AllTypesPLSymbol.build(identifier, line, column);
    }

    public static PLSymbol varlist(String identifier, int line, int column) {
        return new VarListPLSymbol(terminal(identifier, line, column));
    }

    public static PLSymbol defvarlist(PLSymbol varlist, PLSymbol alltypes) {
        return new DefVarListPLSymbol((VarListPLSymbol) varlist, (AllTypesPLSymbol) alltypes);
    }

    public static PLSymbol caselist(PLSymbol exp, TerminalSymbol colons, PLSymbol sent, TerminalSymbol semiColons) {
        return new CaseListPLSymbol((ExpPLSymbol) exp, colons, (SentPLSymbol) sent, semiColons);
    }

    public static PLSymbol caseBlq(TerminalSymbol case_, ExpPLSymbol exp, TerminalSymbol of, CaseListPLSymbol caselist, TerminalSymbol end) {
        return new CasePLSymbol(case_, exp, of, caselist, end);
    }

    public static PLSymbol floop(
            TerminalSymbol for_,
            TerminalSymbol identifier,
            TerminalSymbol assign,
            ExpPLSymbol expA,
            TerminalSymbol to,
            ExpPLSymbol expB,
            TerminalSymbol do_,
            SentPLSymbol sent
    ) {
        return new FLoopPLSymbol(for_, identifier, assign, expA, to, expB, do_, sent);
    }

    public static PLSymbol wloop(
            TerminalSymbol while_,
            ExpPLSymbol exp,
            TerminalSymbol do_,
            SentPLSymbol sent
    ) {
        return new WLoopPLSymbol(while_, exp, do_, sent);
    }

    public static PLSymbol elsecond(TerminalSymbol else_, SentPLSymbol sent) {
        return new ElseCondPLSymbol(else_, sent);
    }

}
