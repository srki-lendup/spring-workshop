package Part02.springboot.step03.actuators;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.actuate.health.Health;

public class HealthCheckTest {

    @Test
    public void badHealth( ) throws Exception {
        final HealthCheck healthCheck = new HealthCheck( );
        healthCheck.setErrorCode( 1 );
        final Health health = healthCheck.health( );
        Assert.assertEquals( health, Health.down().build() );

    }

    @Test
    public void goodHealth( ) throws Exception {
        final HealthCheck healthCheck = new HealthCheck( );
        healthCheck.setErrorCode( 0 );
        final Health health = healthCheck.health( );
        Assert.assertEquals( health, Health.up().build() );
    }
}
