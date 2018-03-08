package Part01.springContext.step06.beanQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    private Vehicle vehicle;


    //setter injection for demo purposes.
    //Ideally all the mandatory properties should be autowired using constructor injection
    //only the optional properties should be autowired using setter injection
    @Autowired
    public void setVehicle( @Qualifier("bikeBean") final Vehicle vehicle ) {
        this.vehicle = vehicle;
    }

    public void service() {
        vehicle.start();
        vehicle.stop();
    }
}
