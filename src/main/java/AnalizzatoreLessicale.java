import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;

public class AnalizzatoreLessicale {

    private StreamTokenizer input;
    private Simboli simbolo;

    public AnalizzatoreLessicale(Reader in) {
        input = new StreamTokenizer(in);
        input.resetSyntax();
        input.eolIsSignificant(false);
        input.wordChars('a', 'z');
        input.wordChars('A', 'Z');
        input.parseNumbers();
        input.whitespaceChars('\u0000', ' ');
        input.ordinaryChar('(');
        input.ordinaryChar(')');
        input.ordinaryChar(',');
        input.ordinaryChar('.');
        input.quoteChar('"');
    }

    public String getString() {
        return input.sval;
    }

    public Simboli prossimoSimbolo() {
        try {
            switch (input.nextToken()) {

                case StreamTokenizer.TT_EOF:
                    simbolo = Simboli.EOF;
                    System.out.println("EOF");
                    break;
                case StreamTokenizer.TT_NUMBER:
                    simbolo = Simboli.POSFLOAT;
                    System.out.println("POSFLOAT");
                    break;
                case StreamTokenizer.TT_WORD:
                    String word = input.sval.toLowerCase();
                    switch (word) {
                        case "new":
                            simbolo = Simboli.NEW;
                            System.out.println("NEW");
                            break;
                        case "del":
                            simbolo = Simboli.DEL;
                            System.out.println("DEL");
                            break;
                        case "mv":
                            simbolo = Simboli.MV;
                            System.out.println("MV");
                            break;
                        case "mvoff":
                            simbolo = Simboli.MVOFF;
                            System.out.println("MVOFF");
                            break;
                        case "scale":
                            simbolo = Simboli.SCALE;
                            System.out.println("SCALE");
                            break;
                        case "ls":
                            simbolo = Simboli.LS;
                            System.out.println("LS");
                            break;
                        case "grp":
                            simbolo = Simboli.GRP;
                            System.out.println("GRP");
                            break;
                        case "ungrp":
                            simbolo = Simboli.UNGRP;
                            System.out.println("UNGRP");
                            break;
                        case "area":
                            simbolo = Simboli.AREA;
                            System.out.println("AREA");
                            break;
                        case "perimeter":
                            simbolo = Simboli.PERIMETER;
                            System.out.println("PERIMETER");
                            break;
                        case "circle":
                            simbolo = Simboli.CIRCLE;
                            System.out.println("CIRCLE");
                            break;
                        case "rectangle":
                            simbolo = Simboli.RECTANGLE;
                            System.out.println("RECTANGLE");
                            break;
                        case "img":
                            simbolo = Simboli.IMG;
                            System.out.println("IMG");
                            break;
                        default:
                            simbolo = Simboli.OBJID;
                            System.out.println("OBJID");
                            break;
                    }
                    break;

                case '(':
                    simbolo = Simboli.TONDA_APERTA;
                    System.out.println("TONDA_APERTA");
                    break;
                case ')':
                    simbolo = Simboli.TONDA_CHIUSA;
                    System.out.println("TONDA_CHIUSA");
                    break;
                case ',':
                    simbolo = Simboli.VIRGOLA;
                    System.out.println("VIRGOLA");
                    break;
                default:
                    simbolo = Simboli.INVALID;
                    System.out.println("INVALID");
                    break;
            }
        } catch (IOException e) {
            simbolo = Simboli.EOF;
            System.out.println("EOF");
        }
        return simbolo;
    }

    public double getNumber() {
        return input.nval;
    }
}
