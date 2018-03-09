package Part02.springboot.step04.interceptorsAndMetrics;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.when;

@RunWith( SpringRunner.class )
@SpringBootTest( classes = { Application.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class MetricMagicTest {
    @LocalServerPort
    private int port;

    @Before
    public void before() {
        // this requires a micrometer-registry-prometheus on the classpath to work
        RestAssured.port = port;
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