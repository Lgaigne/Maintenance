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
            double thisAmount = getThisAmount(rental);
            frequentRenterPoints += addFrequentRenterPoints(rental);

            // show figures for this rental
            result += showFigureForThisRental(rental, thisAmount);
            totalAmount += thisAmount;
        }

        // add footer lines
        result += addFooterLine(totalAmount, frequentRenterPoints);

        return result;
    }

    private String addHeader() {
        return "Rental Record for " + getName() + "\n";
    }

    private static String addFooterLine(double totalAmount, int frequentRenterPoints) {
        return "Amount owed is " + (totalAmount) + "\n"
                + "You earned " + (frequentRenterPoints) + " frequent renter points";
    }

    private static String showFigureForThisRental(Rental each, double thisAmount) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
    }

    private int addFrequentRenterPoints(Rental each) {
        int rentalFrequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
            rentalFrequentRenterPoints += 1;
        return rentalFrequentRenterPoints;
        }

    private static double getThisAmount(Rental each) {
        double thisAmount = 0;

        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (each.getDaysRented() > 2)
                    thisAmount += (each.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += each.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (each.getDaysRented() > 3)
                    thisAmount += (each.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }
}
