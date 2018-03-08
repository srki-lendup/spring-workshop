package Part02.springboot.step04.interceptorsAndMetrics;

import Part02.springboot.step03.actuators.Application;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static io.restassured.RestAssured.when;

@RunWith( SpringRunner.class )
@SpringBootTest( classes = { Application.class } )
// note that now we require a WebAppConfiguration for the metric to be registered correctly
@WebAppConfiguration
public class MetricMagicTest {

    @Before
    public void before() {
        // this requires a micrometer-registry-prometheus on the classpath to work
        RestAssured.port = 8080;
    }

    @Test
    public void actuator( ) throws Exception {
        when( ).
                get( "/" ).
        then( ).
                statusCode( HttpStatus.SC_OK );

        when( ).
                get( "/actuator/prometheus" ).
        then( ).
                statusCode( HttpStatus.SC_OK ).
                body( Matchers.containsString( "service_name=\"Metric Service\"" ) );
    }
}