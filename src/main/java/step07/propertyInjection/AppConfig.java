package step07.propertyInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource( {"classpath:book.properties", "classpath:author.properties"} )
public class AppConfig {

    @Value( "${book.title}" )
    private String title;

    @Value( "${book.price}" )
    private double price;

    @Value( "${author.firstName}" )
    private String firstName;

    @Value( "${author.lastName}" )
    private String lastName;

    @Bean
    public Author author() {
        return new Author( firstName, lastName );
    }

    @Bean
    public Book book(Author author) {
        return new Book( title, price, author );
    }


}
