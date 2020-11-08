import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {
    private final List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public List<String> getAllQuotes() {
        List<String> result = new ArrayList<>();

        for (Quote quote : quotes) {
            result.add(quote.getQuote());
        }
        return result;
    }

    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> result = new ArrayList<>();

        for (Quote quote : quotes) {
            if (quote.getAuthor().equalsIgnoreCase(author)) {
                result.add(quote);
            }
        }
        return result;
    }

    public List<String> getAuthors() {
        List<String> result = new ArrayList<>();

        for (Quote quote : quotes) {
            result.add(quote.getAuthor());
        }
        return result;
    }

    public void setFavourite(int id) {
        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                quote.setFavourite(true);
            }
        }
    }

    public List<Quote> getAll() {
        List<Quote> result = new ArrayList<>(quotes);
        return result;
    }

    public List<Quote> getFavourites() {
        List<Quote> result = new ArrayList<>();

        for (Quote quote : quotes) {
            if (quote.isFavourite()) {
                result.add(quote);
            }
        }
        return result;
    }

    public String getRandomQuote() {
        Random number = new Random();
        int id = number.nextInt(quotes.size());

        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                return quote.getQuote();
            }
        }
        return null;
    }
}
