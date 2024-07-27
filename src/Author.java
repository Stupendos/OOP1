public class Author {
    private final String firstName;
    private final String lastName;

    public Author(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getfirstName() {
        return firstName.toString();
    }

    public String getlastName() {
        return lastName.toString();
    }
}
