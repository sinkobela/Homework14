import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileReader = new Scanner(new FileReader("C:\\Users\\SBela\\Desktop\\JAVA\\Homework14\\src\\quotes.txt"));
        String[] lineArray;
        String author;
        String quote;
        List<Quote> quoteList = new ArrayList<>();

        while (fileReader.hasNextLine()) {
            lineArray = fileReader.nextLine().split("~");
            author = lineArray[0];
            quote = lineArray[1];
            quoteList.add(new Quote(author, quote, false));
        }

        QuoteService quoteService = new QuoteService(quoteList);

        System.out.println("\n");
        System.out.println("All the quotes:");
        for (String allQuote : quoteService.getAllQuotes()) {
            System.out.println(allQuote);
        }

        System.out.println("\n");
        System.out.println("The quotes for the author:");
        for (Quote authorQuote : quoteService.getQuotesForAuthor("Benjamin Franklin")) {
            System.out.println(authorQuote);
        }

        System.out.println("\n");
        System.out.println("All the authors:");
        for (String everyAuthor : quoteService.getAuthors()) {
            System.out.println(everyAuthor);
        }

        quoteService.setFavourite(6);
        quoteService.setFavourite(66);
        quoteService.setFavourite(666);
        quoteService.setFavourite(1200);
        quoteService.setFavourite(3333);
        quoteService.setFavourite(5000);

        System.out.println("\n");
        System.out.println("All the Quote objects:");
        for (Quote everyQuote : quoteService.getAll()) {
            System.out.println(everyQuote);
        }

        System.out.println("\n");
        System.out.println("The favourite quotes are:");
        for (Quote favouriteQuote : quoteService.getFavourites()) {
            System.out.println(favouriteQuote);
        }

        System.out.println("\n");
        System.out.println("Just a random quote:");
        System.out.println(quoteService.getRandomQuote());
    }
}
