/**
 * Created by dlopez on 13/3/16.
 */
public class Program {

    private String name;

    Program(String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "program " + name;
    }
}
