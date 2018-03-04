package step08.lazyInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyDemo {

    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext( Config.class );
        System.out.println("Spring Application context initialization complete");

        final Employee employee = context.getBean( Employee.class );

        System.out.println("Doing something with address");
        final String address = employee.getAddress().get();
        System.out.println(address);
    }

}
