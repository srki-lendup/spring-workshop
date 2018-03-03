package step06.beanQualifiers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanQualifierDemo {

    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext( AppConfig.class );

        VehicleService vehicleService = context.getBean( VehicleService.class );
        vehicleService.service();
    }

}
