public class Person {
    private String FirstName;
    private String LastName;

    public Person(String first,String last) {
        FirstName = first;
        LastName = last;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

}
