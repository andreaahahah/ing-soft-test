// Comando per calcolare il perimetro di un oggetto grafico
public class ComandoPerimetro implements Comando {
    private String id;

    public ComandoPerimetro(String id) {
        this.id = id;
    }

    @Override
    public void esegui() {
//        OggettoGrafico oggetto = SistemaGrafico.getInstance().getOggetto(id);
//        if (oggetto != null) {
//            System.out.println("Perimetro: " + oggetto.calcolaPerimetro());
//        }
    }

    @Override
    public void undo() {
        // Nessuna operazione di undo necessaria per il calcolo del perimetro
    }
}
