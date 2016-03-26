package symbols;

public class InitialPLSymbol extends PLSymbol {

    private int errors;
    private PrgPLSymbol prg;

    public InitialPLSymbol(
            PrgPLSymbol prg,
            int errors
    ) {
        super(prg);
        this.prg = prg;
        this.errors = errors;
    }

    @Override
    public String toString() {
        if (errors > 0) {
            return errorReport();
        } else {
            return "Ok";
        }
    }

    private String errorReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parser completed: " + errors + " error" + (errors > 1 ? "s" : "") + " found");
        return sb.toString();
    }

    public static InitialPLSymbol create(
            PrgPLSymbol prg,
            int errors
    ) {
        return new InitialPLSymbol(prg, errors);
    }

}
