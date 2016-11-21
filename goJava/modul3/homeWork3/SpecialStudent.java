package goJava.modul3.homeWork3;

/**
 * Created by Vova on 09.11.2016.
 */
public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    SpecialStudent(String firstName,
                   String lastName,
                   int group,
                   int age,
                   Course[] coursesTaken,
                   String collegeName,
                   int rating,
                   long id,
                   long secretKey) {

        super(firstName, lastName, group, age, coursesTaken, collegeName, rating, id);
        this.secretKey = secretKey;

    }

    public long getSecretKey() {
        return secretKey;
    }

    private void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }
}
