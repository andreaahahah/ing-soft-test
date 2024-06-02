// Comando per visualizzare le proprietà di un oggetto grafico
public class ComandoVisualizza implements Comando {
    private String id;

    public ComandoVisualizza(String id) {
        this.id = id;
    }

    //TODO verificare cosa è arrivato, se all o il type
    @Override
    public void esegui() {
//        OggettoGrafico oggetto = SistemaGrafico.getInstance().getOggetto(id);
//        if (oggetto != null) {
//            System.out.println(oggetto);
//        }
    }

    @Override
    public void undo() {
        // Nessuna operazione di undo necessaria per la visualizzazione
    }

    @Override
    public String toString() {
        return "ComandoVisualizza{" +
                "id='" + id + '\'' +
                '}';
    }
}