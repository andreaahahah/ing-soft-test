// Comando per rimuovere un oggetto grafico
public class ComandoRimuovi implements Comando {
    private String id;

    public ComandoRimuovi(String id) {
        this.id = id;
    }

    @Override
    public void esegui() {
        //SistemaGrafico.getInstance().rimuoviOggetto(id);
    }

    @Override
    public String toString() {
        return "ComandoRimuovi{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    public void undo() {
        // Implementare il ripristino dell'oggetto rimosso se necessario
    }
}
