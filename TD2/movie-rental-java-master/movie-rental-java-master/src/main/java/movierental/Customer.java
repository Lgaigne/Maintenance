package movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = addHeader   ();

        for (Rental rental : rentals) {
            double thisAmount = Rental.getThisAmount(rental);
            frequentRenterPoints += addFrequentRenterPoints(rental);

            // show figures for this rental
            result += Rental.showFigureForThisRental(rental, thisAmount);
            totalAmount += thisAmount;
        }

        // add footer lines
        result += Rental.addFooterLine(totalAmount, frequentRenterPoints);

        return result;
    }

    private String addHeader() {
        return "Rental Record for " + getName() + "\n";
    }

    private int addFrequentRenterPoints(Rental rental) {
        // add bonus for a two day new release rental
        return 1 + Rental.getRentalFrequentRenterPoints(rental);
        }

}
