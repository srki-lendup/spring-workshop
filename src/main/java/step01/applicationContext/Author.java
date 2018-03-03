package step01.applicationContext;


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
