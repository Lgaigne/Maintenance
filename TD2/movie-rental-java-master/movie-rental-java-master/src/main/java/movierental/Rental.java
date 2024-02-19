package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public String addFooterLine(double totalAmount, int frequentRenterPoints) {
        return "Amount owed is " + totalAmount + "\n"
                + "You earned " + frequentRenterPoints + " frequent renter points";
    }

     public String showFigureForThisRental(Rental rental, double thisAmount) {
        return "\t" + getMovie().getTitle() + "\t" + thisAmount + "\n";
    }

    public double getThisAmount(Rental rental) {

        if (getMovie().getPriceCode() == Movie.CHILDRENS) {
            double thisAmount = 1.5;
            if (getDaysRented() > 3)
                thisAmount += (getDaysRented() - 3) * 1.5;
            return thisAmount;
        }
        if(getMovie().getMoviePrice()== EnumPriceCode.REGULAR){
            getMovie().getMoviePrice().getComputeAmount().apply(getDaysRented());
        }
        return 0;
    }

     public int getRentalFrequentRenterPoints() {
        if ((getMovie().getPriceCode() == EnumPriceCode.NEW_RELEASE.ordinal()) && getDaysRented() > 1)
            return 1;
        return 0;
    }
     public int frequentRenterPoints() {
        return 1 + getRentalFrequentRenterPoints();
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}
