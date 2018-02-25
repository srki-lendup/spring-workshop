package step1.applicationContext;


public class Book {

    private String title;
    private double price;
    private Author author;

    public Book( final Author author ) {
        this.title = "Spring In Action";
        this.price = 20.0;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }
}
