// Comando per calcolare l'area di un oggetto grafico
public class ComandoArea implements Comando {
    private String id;

    public ComandoArea(String id) {
        this.id = id;
    }

    @Override
   public void esegui() {
//        OggettoGrafico oggetto = SistemaGrafico.getInstance().getOggetto(id);
//        if (oggetto != null) {
//            System.out.println("Area: " + oggetto.calcolaArea());
//        }
    }

    @Override
    public void undo() {
        // Nessuna operazione di undo necessaria per il calcolo dell'area
    }
}