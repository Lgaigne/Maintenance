public class Application {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", 20);

        moi.demarrerVoiture(maVoiture);
        maVoiture.accelerer();
        moi.changerVitesse(maVoiture, 80);
        maVoiture.ralentir();
        moi.arreterVoiture(maVoiture);
        maVoiture.afficherDetails();
    }
}