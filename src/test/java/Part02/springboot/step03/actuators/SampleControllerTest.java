package Part02.springboot.step03.actuators;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static io.restassured.RestAssured.when;

@RunWith( SpringRunner.class )
@SpringBootTest( classes = { Application.class } )
@WebAppConfiguration
public class SampleControllerTest {

    public void before() {
        // you will need a config that enables actuators, and the library in the gradle
        RestAssured.port = 8080;
    }

    @Test
    @Ignore
    public void health( ) throws Exception {
        when( ).
                get( "/actuator/health" ).
        then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    @Ignore
    public void trace( ) throws Exception {
        when( ).
                get( "/actuator/httptrace" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    @Ignore
    public void beans( ) throws Exception {
        when( ).
                get( "/actuator/beans" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    @Ignore
    public void auditevents( ) throws Exception {
        when( ).
                get( "/actuator/auditevents" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    @Ignore
    public void configprops( ) throws Exception {
        when( ).
                get( "/actuator/configprops" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    @Ignore
    public void loggers( ) throws Exception {
        when( ).
                get( "/actuator/loggers" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

    @Test
    @Ignore
    public void env( ) throws Exception {
        when( ).
                get( "/actuator/env" ).
                then( ).
                statusCode( HttpStatus.SC_OK );
    }

}