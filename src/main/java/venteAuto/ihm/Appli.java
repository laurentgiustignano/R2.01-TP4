package venteAuto.ihm;

import venteAuto.*;
import venteAuto.frein.FreinPasCher;
import venteAuto.frein.FreinPerf;


public class Appli {

    public static void essaiCircuit(Voiture v) {
        if (v.getVitesse() > 0)
            throw new IllegalArgumentException();
        System.out.println("Essai circuit de " + v.getNom());
        while (v.getVitesse() < v.getVitesseMaximale()) {
            v.accelerer();
            System.out.print(v.getVitesse() + " ");
        }
        System.out.println();
        while (v.getVitesse() > 0) {
            v.freiner();
            System.out.print(v.getVitesse() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Voiture[] garage = {
                new Voiture("luxe", new FreinPerf()),
                new VoiturePasCher("pas cher", new FreinPasCher())
        };
        for (Voiture v : garage)
            essaiCircuit(v);
    }
}
