package step09.springMvc.model;

import org.springframework.stereotype.Component;

@Component
public class Author {

    private String firstName;
    private String lastName;

    public Author( ) {
        this.firstName = "Craig";
        this.lastName = "Walls";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
