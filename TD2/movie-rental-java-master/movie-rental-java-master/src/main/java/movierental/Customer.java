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
            frequentRenterPoints += rental.frequentRenterPoints();

            // show figures for this rental
            result += rental.showFigureForThisRental(rental, rental.getThisAmount(rental));
            totalAmount += rental.getThisAmount(rental);
        }

        // add footer lines
        result += rental.addFooterLine(totalAmount, frequentRenterPoints);

        return result;
    }

    private String addHeader() {
        return "Rental Record for " + getName() + "\n";
    }



}
