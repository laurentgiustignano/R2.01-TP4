package venteAuto;

public class VoiturePasCher extends Voiture {


    public VoiturePasCher(String nom, IFrein frein) {
        super(nom, frein);
    }

    @Override
    public int getVitesseMaximale() {
        return 150;
    }

    @Override
    public void accelerer() {
        int v = getVitesse() + 15;
        setVitesse(v < getVitesseMaximale() ? v : getVitesseMaximale());
    }

}
