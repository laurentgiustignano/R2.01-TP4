package venteAuto.frein;

import venteAuto.IFrein;
import venteAuto.Voiture;

public class FreinPasCher implements IFrein {
    @Override
    public void freiner(Voiture v) {
        int vitesseFuture = v.getVitesse() - 20;
        v.setVitesse(vitesseFuture > 0 ? vitesseFuture : 0);
    }
}
