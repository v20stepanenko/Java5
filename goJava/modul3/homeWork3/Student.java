package goJava.modul3.homeWork3;

/**
 * Created by Vova on 09.11.2016.
 */
public class Student {

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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public static void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public static void setAge(int age) {
        this.age = age;
    }

    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    Student(String firstName, String lastName, int group) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;

    }

    Student(String lastName, Course[] coursesTaken) {

        this.lastName = lastName;
        this.coursesTaken = coursesTaken;

    }
}
