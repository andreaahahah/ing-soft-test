// Comando per ridimensionare un oggetto grafico
public class ComandoRidimensiona implements Comando {
    private String id;
    private double fattoreScala;
    private double vecchioFattoreScala;

    public ComandoRidimensiona(String id, double fattoreScala) {
        this.id = id;
        this.fattoreScala = fattoreScala;
    }

    @Override
    public void esegui() {
//        OggettoGrafico oggetto = SistemaGrafico.getInstance().getOggetto(id);
//        if (oggetto instanceof Ridimensionabile) {
//            Ridimensionabile ridimensionabile = (Ridimensionabile) oggetto;
//            vecchioFattoreScala = ridimensionabile.getFattoreScala();
//            ridimensionabile.ridimensiona(fattoreScala);
//        }
    }

    @Override
    public void undo() {
//        OggettoGrafico oggetto = SistemaGrafico.getInstance().getOggetto(id);
//        if (oggetto instanceof Ridimensionabile) {
//            Ridimensionabile ridimensionabile = (Ridimensionabile) oggetto;
//            ridimensionabile.ridimensiona(vecchioFattoreScala);
//        }
    }

    @Override
    public String toString() {
        return "ComandoRidimensiona{" +
                "id='" + id + '\'' +
                ", fattoreScala=" + fattoreScala;
    }
}