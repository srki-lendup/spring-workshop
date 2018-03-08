package Part02.springboot.step03.actuators;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.properties.PropertyMapping;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static io.restassured.RestAssured.when;

@RunWith( SpringRunner.class )
@SpringBootTest( classes = { Application.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class SampleControllerTest {
    @LocalServerPort
    private int port;

    @Before
    public void before() {
        // you will need a config that enables actuators, and the library in the gradle
        RestAssured.port = port;
    }

    @Test
    public void health( ) throws Exception {
        when( ).
                get( "/actuator/health" ).
        then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    public void trace( ) throws Exception {
        when( ).
                get( "/actuator/httptrace" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    public void beans( ) throws Exception {
        when( ).
                get( "/actuator/beans" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    public void auditevents( ) throws Exception {
        when( ).
                get( "/actuator/auditevents" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    public void configprops( ) throws Exception {
        when( ).
                get( "/actuator/configprops" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    public void loggers( ) throws Exception {
        when( ).
                get( "/actuator/loggers" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    public void env( ) throws Exception {
        when( ).
                get( "/actuator/env" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

}