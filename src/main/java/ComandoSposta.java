import java.awt.geom.Point2D;

// Comando per spostare un oggetto grafico
public class ComandoSposta implements Comando {
    private String id;
    private Point2D.Double nuovaPosizione;
    private Point2D.Double vecchiaPosizione;

    public ComandoSposta(String id, Point2D.Double nuovaPosizione) {
        this.id = id;
        this.nuovaPosizione = nuovaPosizione;
    }

    @Override
    public void esegui() {
//        OggettoGrafico oggetto = SistemaGrafico.getInstance().getOggetto(id);
//        if (oggetto != null) {
//            vecchiaPosizione = oggetto.getPosizione();
//            oggetto.setPosizione(nuovaPosizione);
//        }
    }

    @Override
    public void undo() {
//        OggettoGrafico oggetto = SistemaGrafico.getInstance().getOggetto(id);
//        if (oggetto != null) {
//            oggetto.setPosizione(vecchiaPosizione);
//        }
    }

    @Override
    public String toString() {
        return "ComandoSposta{" +
                "id='" + id + '\'' +
                ", nuovaPosizione=" + nuovaPosizione;
    }
}