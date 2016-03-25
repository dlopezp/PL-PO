import symbols.Localizable;
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
        public Location location(Localizable s) {
            return s.endLocation();
        }
    };

    public abstract String comment();
    public abstract Location location(Localizable s);
}
