// Comando per creare un gruppo di oggetti grafici
public class ComandoGruppo implements Comando {
    private String[] ids;
    private String gruppoId;

    public ComandoGruppo(String[] ids) {
        this.ids = ids;
    }

    @Override
    public void esegui() {
//        gruppoId = IDGenerator.generaID();
//        Gruppo gruppo = new Gruppo(gruppoId);
//        for (String id : ids) {
//            OggettoGrafico oggetto = SistemaGrafico.getInstance().getOggetto(id);
//            if (oggetto != null) {
//                gruppo.addOggetto(oggetto);
//            }
//        }
//        SistemaGrafico.getInstance().aggiungiGruppo(gruppo);
    }

    @Override
    public void undo() {
        //SistemaGrafico.getInstance().rimuoviGruppo(gruppoId);
    }
}