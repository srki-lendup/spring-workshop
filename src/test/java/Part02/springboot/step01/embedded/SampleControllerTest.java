package Part02.springboot.step01.embedded;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static io.restassured.RestAssured.when;

@RunWith( SpringRunner.class )
@SpringBootTest( classes = { Application.class } )
@WebAppConfiguration
public class SampleControllerTest {
    @Value( "${local.server.port:8080}" )
    int port;

    @Test
    public void home( ) throws Exception {
        RestAssured.port = port;
        when( ).
                get( "/" ).
        then( ).
                statusCode( HttpStatus.SC_OK ).
                body( Matchers.is( "Hello World!" ) );
    }

}