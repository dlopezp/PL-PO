package symbols;

/**
 * Created by dlopez on 24/3/16.
 */
public class Location {

    private int line;
    private int column;

    Location(int l, int c) {
        line = l;
        column = c;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        String intFormat = "%3d";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(String.format(intFormat, line));
        sb.append(", ");
        sb.append(String.format(intFormat, column));
        sb.append("]");
        return sb.toString();
    }
}
