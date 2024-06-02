// Comando per rimuovere un gruppo di oggetti grafici
public class ComandoSgruppa implements Comando {
    private String gruppoId;

    public ComandoSgruppa(String gruppoId) {
        this.gruppoId = gruppoId;
    }

    @Override
    public void esegui() {
        //SistemaGrafico.getInstance().rimuoviGruppo(gruppoId);
    }

    @Override
    public void undo() {
        // Implementare il ripristino del gruppo rimosso se necessario
    }
}