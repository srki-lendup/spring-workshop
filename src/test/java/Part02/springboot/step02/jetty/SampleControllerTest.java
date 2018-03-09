package Part02.springboot.step02.jetty;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.when;

@RunWith( SpringRunner.class )
@SpringBootTest( classes = { ConfiguredJettyApplication.class },
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT )
public class SampleControllerTest {

    @Test
    @Ignore
    public void home( ) throws Exception {
        // watch out, there's an evil non-default port!
        // see the comment section in ConfiguredJettyApplication for that one
        RestAssured.port = 9000;
        when( ).
                get( "/" ).
        then( ).
                statusCode( HttpStatus.SC_OK ).
                body( Matchers.is( "Hello World!" ) );
    }

}