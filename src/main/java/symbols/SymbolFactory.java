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
}