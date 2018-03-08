package Part01.springContext.step04.springProfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringProfilesDemo {

    public static void main( String[] args ) {

        System.out.println( "This is a demo for Spring Profiles" );

        System.setProperty( "spring.profiles.active", "local" );
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext( AppConfig.class );

        DatasourceConfig datasourceConfig = applicationContext.getBean( DatasourceConfig.class );
        datasourceConfig.setup();
    }

}
