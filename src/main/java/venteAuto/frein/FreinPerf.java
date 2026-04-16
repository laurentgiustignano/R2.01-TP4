package venteAuto.frein;

import venteAuto.IFrein;
import venteAuto.Voiture;

public class FreinPerf implements IFrein {
    @Override
    public void freiner(Voiture v) {
        int vitesseFuture = v.getVitesse() - 35;
        v.setVitesse(vitesseFuture > 0 ? vitesseFuture : 0);
    }
}
