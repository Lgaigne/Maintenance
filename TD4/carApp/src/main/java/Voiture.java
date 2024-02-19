public class Voiture extends Application {
    private String modele;
    private String couleur;
    private int vitesse;
    private final int uniteVitesse = 10;
    private final int vitesseMin = 0;
    private final int vitesseMax = 130;
    public Voiture(final String model, final String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (vitesse + uniteVitesse <= vitesseMax - uniteVitesse) {
            vitesse += uniteVitesse;
            afficherDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - uniteVitesse > vitesseMin) {
            vitesse -= uniteVitesse;
            afficherDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    public void afficherDetails() {
        System.out.println("Modèle : " + modele);
        System.out.println("Couleur : " + couleur);
        System.out.println("Vitesse actuelle : " + vitesse);
    }
}