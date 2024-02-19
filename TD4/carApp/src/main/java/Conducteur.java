public class Conducteur {
    private String nom;
    private int age;

    public Conducteur(String name, int years) {
        this.nom = name;
        this.age = years;
    }

    public boolean estAdulte() {
        return age >= 10;
    }

    public void demarrerVoiture(Voiture voiture) {
        if (estAdulte()) {
            System.out.println(nom + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void arreterVoiture(Voiture voiture) {
        System.out.println(nom + " arrête la voiture.");
    }

    public void changerVitesse(Voiture voiture, int nouvelleVitesse) {
        System.out.println(nom + " change la vitesse de la voiture à " + nouvelleVitesse);
        voiture.accelerer();
    }
}