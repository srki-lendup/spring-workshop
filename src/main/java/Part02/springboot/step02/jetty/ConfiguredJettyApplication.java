package Part02.springboot.step02.jetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.context.annotation.Bean;
*/

@SpringBootApplication
public class ConfiguredJettyApplication {
    public static void main( String[] args ) {
        SpringApplication.run( ConfiguredJettyApplication.class, args );
    }

    /*@Bean
    public JettyServletWebServerFactory jettyEmbeddedServletContainerFactory() {

        JettyServletWebServerFactory jettyContainer =
                new JettyServletWebServerFactory();

        jettyContainer.setPort(9000);
        return jettyContainer;
    }*/
}


