package movierental;
import java.util.function.Function;

public enum EnumPriceCode {
    REGULAR((daysRented)->{double amount =2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;}),
    NEW_RELEASE((daysRented)-> daysRented * 3.0);

    private final Function<Integer, Double> computeAmount;

    EnumPriceCode(Function<Integer, Double> computeAmount) {
        this.computeAmount = computeAmount;
    }

    public Function<Integer, Double> getComputeAmount() {
        return computeAmount;
    }
}
