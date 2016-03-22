import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main (String args[]) {
        if (args.length == 0) {
            System.out.println("Inserta nombre de archivo\n( Usage : java Analizador <inputfile> )");
        } else {

            Lexer lexer = null;
            for (int i = 0; i < args.length; i++) {
                System.out.println("Analizando " + args[i]);
                try {
                    lexer = new Lexer(new FileReader(args[i]));
                    Parser parser = new Parser(lexer);
                    Program prg = (Program) parser.parse().value;
                    System.out.println(prg);
                }
                catch (FileNotFoundException e) {
                    System.out.println("Archivo \""+args[i]+"\" no encontrado.");
                }
                catch (Exception e) {
                    System.out.println("Exception:");
                    e.printStackTrace();
                }
           }
        }
    }



}
