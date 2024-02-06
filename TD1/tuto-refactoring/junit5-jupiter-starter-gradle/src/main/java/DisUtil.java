import java.time.LocalDate;

public class DisUtil {
    private static void isDateBetween(LocalDate of, LocalDate min, LocalDate max) {
    }

    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate now = SimpleClass.getLocalDate();
        return now.isAfter(startingDate) &&
                now.isBefore(endingDate);
    }
}