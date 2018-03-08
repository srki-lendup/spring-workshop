package Part01.springContext.step03.beanScopes;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeDemo {

    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext( BeanScanConfiguration.class );

        System.out.println( "This is a demo for Bean scopes" );

        Book book1 = context.getBean( Book.class );
        Book book2 = context.getBean( Book.class );

        System.out.println("Are Book1 and Book2 same? " + (book1 == book2));
        System.out.println("Book 1::" + book1);
        System.out.println("Book 2::" + book2);

    }

}
