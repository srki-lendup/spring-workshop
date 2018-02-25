package step3.beanScopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Component
@Scope( SCOPE_PROTOTYPE )
public class Book {

    private String title;
    private double price;
    private Author author;

    @Autowired
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
