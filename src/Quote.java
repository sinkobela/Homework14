import java.util.Objects;

public class Quote {
    private final int id;
    private static int idCounter = 1;
    private final String author;
    private final String quote;
    private boolean favourite;

    public Quote(String author, String quote, boolean favourite) {
        this.id = idCounter++;
        this.author = author;
        this.quote = quote;
        this.favourite = favourite;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(final boolean favourite) {
        this.favourite = favourite;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                ", favourite=" + favourite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return favourite == quote1.favourite &&
                Objects.equals(author, quote1.author) &&
                Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, quote, favourite);
    }
}
