package Part02.springboot.step03.actuators;

import org.springframework.stereotype.Component;

@Component
public class HealthCheck /* implements HealthIndicator */ {

    private int status = 1;

    /*@Override
    public Health health() {
        return status != 0 ? Health.down( ).build( ) : Health.up( ).build( );
    }*/

    public void setErrorCode( int status) {
        this.status = status;
    }
}
