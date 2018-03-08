package Part01.springContext.step08.lazyInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class Address {

    private final String city;
    private final String street;
    private final String country;

    public Address( ) {
        this.city = "Pune";
        this.street = "MG Road";
        this.country = "India";
    }

    @PostConstruct
    public void init() {
        System.out.println("Address initialized");
    }

    public String get() {
        return city+","+street+","+country;
    }
}
