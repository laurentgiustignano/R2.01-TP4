package venteAuto;

import venteAuto.frein.FreinPerf;

public class Voiture {
  private String nom;
  private int vitesse;
  private IFrein frein;

  public Voiture(String nom, IFrein frein) {
    this.nom = nom;
    this.vitesse = 0;
    this.frein = frein;
  }

// méthodes finales : non redéfinissables dans les sous-classes
  public final String getNom() {
    return nom;
  }

  public final int getVitesse() {
    return vitesse;
  }

  public final void setVitesse(int v) {
    vitesse = v;
  }

  // méthodes redéfinissables
  @Override
  public final String toString() {
    return nom;
  }

  public int getVitesseMaximale() {
    return 240;
  }

  public void accelerer() {
    int v = getVitesse() + 25;
    setVitesse(v < getVitesseMaximale() ? v : getVitesseMaximale());
  }

  public void freiner() {
    frein.freiner(this);
  }
}
