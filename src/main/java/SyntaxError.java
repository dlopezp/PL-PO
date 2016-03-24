import symbols.AsigPLSymbol;
import symbols.PLSymbol;
import symbols.Location;

/**
 * Created by dlopez on 24/3/16.
 */
public enum SyntaxError {

    MISSING_SEMI_COLONS {
        @Override
        public String comment() {
            return "Missing semi colons";
        }

        @Override
        public Location location(PLSymbol s) {
            AsigPLSymbol asig = (AsigPLSymbol) s;
            return asig.endLocation();
        }
    };

    public abstract String comment();
    public abstract Location location(PLSymbol s);
}
