import java.io.StringReader;
import java.util.Scanner;

public class Interprete {
    StringReader input;

    public Interprete(StringReader input) {
        this.input = input;
    }
    private void interpreta() throws Exception {
        Comando parser = new Parser(input).parse();
        System.out.println(parser.toString());

    }
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Per favore, inserisci una frase:");

        String frase = scanner.nextLine();
        StringReader sr = new StringReader(frase);

        new Interprete(sr).interpreta();
    }


}
