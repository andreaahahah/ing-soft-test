import java.awt.geom.Point2D;

// Comando per spostare un oggetto grafico con offset
public class ComandoSpostaOffset implements Comando {
    private String id;
    private Point2D.Double offset;
    private Point2D.Double vecchiaPosizione;

    public ComandoSpostaOffset(String id, Point2D.Double offset) {
        this.id = id;
        this.offset = offset;
    }

    @Override
    public void esegui() {
//        OggettoGrafico oggetto = SistemaGrafico.getInstance().getOggetto(id);
//        if (oggetto != null) {
//            vecchiaPosizione = oggetto.getPosizione();
//            Point2D.Double nuovaPosizione = new Posizione(
//                    vecchiaPosizione.getX() + offset.getX(),
//                    vecchiaPosizione.getY() + offset.getY()
//            );
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
        return "ComandoSpostaOffset{" +
                "id='" + id + '\'' +
                ", offset=" + offset ;
    }
}