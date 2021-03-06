package goJava.modul3.home_work3;

/**
 * Created by Vova on 09.11.2016.
 */
public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;


    CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    CollegeStudent(String firstName, String lastName, int group, int age, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        super.setAge(age);
        super.setCoursesTaken(coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;

    }

    public String getCollegeName() {
        return collegeName;
    }

    private void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    private void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

}
