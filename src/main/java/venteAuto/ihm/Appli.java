package venteAuto.ihm;

import venteAuto.*;


public class Appli {

  public static void essaiCircuit(Voiture v) {
	  if (v.getVitesse() >0)
		  throw new IllegalArgumentException();
	 System.out.println("Essai circuit de "+v.getNom());
    while (v.getVitesse() < Voiture.getVitesseMaximale()) {
      v.accelerer();
      System.out.print(v.getVitesse()+ " ");
    }
    System.out.println();
    while (v.getVitesse() > 0) {
      v.freiner();
      System.out.print(v.getVitesse()+ " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Voiture[] tab = { 
        new Voiture("luxe")
    };
    for (Voiture v : tab)
    	essaiCircuit(v);
  }
}
