package step08.lazyInitialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Employee {

    private String name;
    @Autowired
    @Lazy
    private Address address;

    @PostConstruct
    public void init() {
        System.out.println("Employee initialized");
    }

    public Address getAddress() {
        return address;
    }
}
