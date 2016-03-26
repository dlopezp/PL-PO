package symbols;

public class DclProcPLSymbol extends DclPLSymbol {

    private DefProcPLSymbol defproc;

    public DclProcPLSymbol(DefProcPLSymbol defproc) {
        super(defproc);
        this.defproc = defproc;
    }
}
