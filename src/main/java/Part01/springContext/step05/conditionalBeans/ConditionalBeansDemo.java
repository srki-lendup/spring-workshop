package Part01.springContext.step05.conditionalBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionalBeansDemo {

    public static void main( String[] args ) {
        System.out.println( "This is a demo for Spring Profiles" );

        System.setProperty( "system.active.name", "Legacy" );
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext( AppConfig.class );

        ApiClient apiClient = applicationContext.getBean( ApiClient.class );
        apiClient.executeRemoteCall();
    }

}
