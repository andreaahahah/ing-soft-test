import java.awt.geom.Point2D;
import java.util.Arrays;

public class ComandoNuovo implements Comando {
    private String tipo;
    private Object[] parametri;
    private String id;

    public ComandoNuovo(String tipo, Object[] parametri) {
        this.tipo = tipo;
        this.parametri = parametri;
    }

    @Override
    public void esegui() {
//        id = IDGenerator.generaID();
//        if (tipo.equals("circle")) {
//            double raggio = (double) parametri[0];
//            Point2D.Double posizione = (Point2D.Double) parametri[1];
//            Cerchio cerchio = new Cerchio(id, posizione, raggio);
//            SistemaGrafico.getInstance().aggiungiOggetto(cerchio);
//        } else if (tipo.equals("img")) {
//            String path = (String) parametri[0];
//            Point2D.Double posizione = (Point2D.Double) parametri[1];
//            Immagine immagine = new Immagine(id, posizione, path);
//            SistemaGrafico.getInstance().aggiungiOggetto(immagine);
//        }
      // Aggiungere altri tipi di oggetti se necessario
    }

    @Override
    public void undo() {
        //SistemaGrafico.getInstance().rimuoviOggetto(id);
    }

    @Override
    public String toString() {
        return "ComandoNuovo{" +
                "tipo='" + tipo + '\'' +
                ", parametri=" + Arrays.toString(parametri) +
                ", id='" + id + '\'' +
                '}';
    }
}
