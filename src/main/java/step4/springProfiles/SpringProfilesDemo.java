package step4.springProfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringProfilesDemo {

    public static void main( String[] args ) {

        System.out.println( "This is a demo for Spring Profiles" );

        System.setProperty( "spring.profiles.active", "local" );
        ApplicationContext localProfileContext = new AnnotationConfigApplicationContext( AppConfig.class );

        DatasourceConfig localDatasourceConfig = localProfileContext.getBean( DatasourceConfig.class );
        localDatasourceConfig.setup();
    }

}
