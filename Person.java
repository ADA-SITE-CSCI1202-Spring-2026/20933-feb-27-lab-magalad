public class Person {

    private String firstName;
    private String lastName;
    private String gender;

    // Constructor
    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // toString()
    @Override
    public String toString() {
        return "Person [firstName=" + firstName +
               ", lastName=" + lastName +
               ", gender=" + gender + "]";
    }

    // equals(Person p)
    public boolean equals(Person p) {
        if (p == null) return false;

        return this.firstName.equals(p.firstName) &&
               this.lastName.equals(p.lastName) &&
               this.gender.equals(p.gender);
    }
}