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

//    public int numberOfQuotes(List<Quote> quoteList) {
//        return quoteList.size();
//    }

    public List<String> getAuthors() {
        List<String> result = new ArrayList<>();

        for (Quote quote : quotes) {
            result.add(quote.getAuthor());
        }
        return result;
    }

//    public int numberOfAuthors(List<String> authors) {
//        return authors.size();
//    }

    public void setFavourite(int id) {
        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                quote.setFavourite(true);
            }
        }
    }

//    public List<Quote> getAll() {
//        List<Quote> result = new ArrayList<>();
//        result.addAll(quotes);
//        return result;
//    }

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
        String result = "";
        Random number = new Random();
        int id = number.nextInt(5421);

        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                result = quote.getQuote();
            }
        }
        return result;
    }
}


//4)    creati un obiect QuoteService care ofera urmatoarele metode:
//   x     - getAllQuotes():List<String>
//   x     - getQuotesForAuthor(String author): List<Quote>
//   x     - getAuthors(): List<String>
//   x     - setFavourite(int id)
//   x     - getFavourites():List<Quote>
//   x     - getRandomQuote():String : generati un numar random cu ajutorul
//           obiectului java.util.Random si returnati quote-ul cu acel id