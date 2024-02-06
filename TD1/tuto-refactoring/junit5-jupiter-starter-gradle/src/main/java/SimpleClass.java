import java.time.LocalDate;
public class SimpleClass {

    public static void main(String[] args) {
        new SimpleClass().add(1, 2);

        
    }

    public class DateUtils {
        public static boolean isNowBetween(LocalDate startingDate, LocalDate
                endingDate) {
            LocalDate date = LocalDate.now();
            return date.isBefore(endingDate) && date.isAfter(startingDate);
        }
        public static boolean isDateBetween(LocalDate date, LocalDate startingDate,
                                            LocalDate endingDate) {
            return date.isBefore(endingDate) && date.isAfter(startingDate);
        }

        public static boolean isDateOutside(LocalDate date, LocalDate startingDate,
                                            LocalDate endingDate) {
            return !isDateBetween(date, startingDate, endingDate);
        }
    }
    /**
     * Adds a and b
     * @param firstNumber the first number
     * @param b the second number
     */
    public int add(int firstNumber, int b){
        return firstNumber + b;
    }

    private static LocalDate getLocalDate() {
        return LocalDate.now();
    }

    //isNowBetween(LocalDate.MIN, LocalDate.MAX);
    //isDateBetween(LocalDate.of(2019, 1, 1), LocalDate.MIN, LocalDate.MAX);

}
