public class Derived extends Base {
    public static void main(String[] args) {
        Derived subject = new Derived();
        System.out.println("Doubling 21. Result: " + subject.doubleValue(21));
    }

    protected int doubleValue(int number) {
        return number + number;
    }
}
