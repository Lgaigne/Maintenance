public class Car {
    public static final int SPEED_MAX = 130;
    public static final int SPEED_MIN = 0;
    public static final int SPEED_UNITE = 10;
    private String model;
    private String color;
    private int speed;


    public Car(final String actualModel, final String actualColor) {
        this.model = actualModel;
        this.color = actualColor;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (speed + SPEED_UNITE <= SPEED_MAX - SPEED_UNITE) {
            speed += SPEED_UNITE;
            showDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowDown() {
        if (speed - SPEED_UNITE >= SPEED_MIN) {
            speed -= SPEED_UNITE;
            showDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    public void showDetails() {
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }
}