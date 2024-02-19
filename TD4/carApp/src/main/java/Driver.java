public class Driver extends Application {
    private String nom;
    private int age;
    private final int majorite = 18;


    public Driver(final String name, final int nombreAnnee) {
        this.nom = name;
        this.age = nombreAnnee;
    }

    public boolean isAdult() {
        return age >= majorite;
    }

    public void startCar(final Car voiture) {
        if (isAdult()) {
            System.out.println(nom + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopSpeed(final Car voiture) {
        System.out.println(nom + " arrête la voiture.");
    }

    public void changeSpeed(final Car voiture, final int nouvelleVitesse) {
        System.out.println(nom + " change la vitesse de la voiture à " + nouvelleVitesse);
        voiture.accelerate();
    }
}