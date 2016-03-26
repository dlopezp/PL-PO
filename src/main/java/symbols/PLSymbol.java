package symbols;

public abstract class PLSymbol implements Localizable {

    private PLSymbol lastSymbol;

    PLSymbol(PLSymbol lastSymbol) {
        this.lastSymbol = lastSymbol;
    }

    public Location endLocation() {
        return lastSymbol.endLocation();
    }

}
