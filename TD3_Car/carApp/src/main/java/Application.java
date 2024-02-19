public class Application {
    public static void main(final String[] args) {
        final int actualSpeed = 80;
        final int actualAge = 20;
        Car mycar = new Car("Sedan", "Bleu");
        Driver me = new Driver("John", actualAge);

        me.startCar(mycar);
        mycar.accelerate();
        me.changeSpeed(mycar, actualSpeed);
        mycar.slowDown();
        me.stopSpeed(mycar);
        mycar.showDetails();
    }
}