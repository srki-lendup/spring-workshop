package Part01.springContext.step07.propertyInjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyInjectionDemo {

    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext( AppConfig.class );

        Book book = context.getBean( Book.class );
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Author: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
    }

}
