package step03.beanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Component
@Scope( SCOPE_PROTOTYPE )
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
