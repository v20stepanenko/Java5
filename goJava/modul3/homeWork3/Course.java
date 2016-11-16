package goJava.modul3.homeWork3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Vova on 09.11.2016.
 */
public class Course {

    public Date getStartDate() {
        return startDate;
    }

    private void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    private void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    private void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    Course(Date startDate, String name) throws ParseException {

        this.startDate = startDate;
        this.name = name;

    }

    Course(int hourseDuration, String name, String teacherName) {

        this.name = name;
        this.hoursDuration = hourseDuration;
        this.teacherName = teacherName;

    }

}
