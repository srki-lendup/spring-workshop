package step2.componentScan;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanDemo {

    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext( ComponentScanConfiguration.class );

        Book book1 = context.getBean( Book.class );
        System.out.println( "This is a demo using component scan based configuration" );
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Price: " + book1.getPrice());
        System.out.println("Author: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());

        Book book2 = context.getBean( Book.class );
        System.out.println("Are Book1 and Book2 same? " + (book1 == book2));

    }

}
