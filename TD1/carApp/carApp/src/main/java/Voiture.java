public class Voiture {
    private static final int VITESSE_MAX = 120;
    private static final int INCREMENT_STANDARD = 10;

    private String modele;
    private String couleur;
    private int vitesse;

    public Voiture(String model, String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (vitesse + INCREMENT_STANDARD <= VITESSE_MAX) {
            vitesse += INCREMENT_STANDARD;
            afficherDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - INCREMENT_STANDARD >= 0) {
            vitesse -= INCREMENT_STANDARD;
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