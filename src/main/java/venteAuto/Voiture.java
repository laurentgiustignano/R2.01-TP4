package venteAuto;

public class Voiture {
  private String nom;
  private int vitesse;

  public Voiture(String nom) {
    this.nom = nom;
    this.vitesse = 0;
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

  public  int getVitesseMaximale() {
    return 240;
  }

  public void accelerer() {
    int v = getVitesse() + 25;
    setVitesse(v < getVitesseMaximale() ? v : getVitesseMaximale());
  }

  public void freiner() {
    int v = getVitesse() - 35;
    setVitesse(v > 0 ? v : 0);
  }
}
