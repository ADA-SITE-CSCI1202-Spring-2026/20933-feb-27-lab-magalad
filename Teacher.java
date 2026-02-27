public class Teacher extends Person {

    private String department;
    private String courses;

    // Constructor
    public Teacher(String firstName, String lastName, String gender,
                   String department, String courses) {

        super(firstName, lastName, gender);  // call Person constructor
        this.department = department;
        this.courses = courses;
    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    // toString() - overriding
    @Override
    public String toString() {
        return super.toString() +
               ", Teacher [department=" + department +
               ", courses=" + courses + "]";
    }

    // equals(Teacher t)
    public boolean equals(Teacher t) {
        if (t == null) return false;

        return super.equals(t) &&
               this.department.equals(t.department) &&
               this.courses.equals(t.courses);
    }
}