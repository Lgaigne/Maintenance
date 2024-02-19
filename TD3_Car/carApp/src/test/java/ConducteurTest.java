import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConducteurTest {

    private Driver conducteur;

    @BeforeEach
    public void setUp() {
        conducteur = new Driver("John", 20);
    }

    @Test
    public void testIsAdult() {
        assertThat(conducteur.isAdult()).isTrue();
    }

    @Test
    public void testStartCar() {
        Car voiture = new Car("Sedan", "Bleu");
        conducteur.startCar(voiture);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testStopCar() {
        Car voiture = new Car("Sedan", "Bleu");
        conducteur.stopSpeed(voiture);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangeSpeed() {
        Car voiture = new Car("Sedan", "Bleu");
        conducteur.changeSpeed(voiture, 80);
        assertThat(voiture.getSpeed()).isEqualTo(10);
    }
}
