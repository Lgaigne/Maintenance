package movierental;

public class Movie {

    public static final int CHILDRENS = 2;

    private String title;
    private EnumPriceCode moviePriceCode;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public Movie(String title, EnumPriceCode moviePriceCode) {
        this.title= title;
        this.moviePriceCode = moviePriceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle() {
        return title;
    }


    public EnumPriceCode getMoviePrice() {
        return this.moviePriceCode;
    }
}
