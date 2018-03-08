package Part01.springContext.step01.applicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfiguration {

    @Bean
    public Author author() {
        return new Author( );
    }

    @Bean
    public Book book( Author author ) {
        return new Book( author );
    }

}
