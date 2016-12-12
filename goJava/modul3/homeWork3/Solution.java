package goJava.modul3.homeWork3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Vova on 09.11.2016.
 */
public class Solution {
    public static void main(String[] args) throws ParseException {
        Date createDate1 = installDate("8-11-2016");
        Date createDate2 = installDate("18-04-2017");
        Date createDate3 = installDate("15-09-2017");
        Date createDate4 = installDate("17-12-2016");
        Course java5 = new Course(createDate1, "Java5");
        Course androidJava = new Course(createDate2, "Go IT Android! WOW!");
        Course developerJava = new Course(createDate3, "Developer");
        Course gogo = new Course(createDate4, "GOgo develop");
        Course goJava = new Course(90, "go Java", "Vasiliy");

        Course[] coursesTaken = {java5, androidJava, developerJava, gogo, goJava};

        Student nameIgor = new Student("Igor", "Kolomoyskiy", 3);
        Student nameSveta = new Student("Jijeshova", coursesTaken);
        CollegeStudent nameVova = new CollegeStudent("Vova", "Makarevich", 5);
        CollegeStudent nameAlina = new CollegeStudent("Zimova", coursesTaken);
        CollegeStudent namePetya = new CollegeStudent("Petro", "Ivanec", 4, 26, coursesTaken, "Машиностроительный коледж", 86, 864656841);
        SpecialStudent nameIvan = new SpecialStudent("Ivan", "Figachit", 9);
        SpecialStudent nameSergay = new SpecialStudent("Zukov", coursesTaken);
        SpecialStudent nameKolya = new SpecialStudent("Nikolay", "Tukov", 5, 51, coursesTaken, "college сельского хозяйства", 75, 545488, 272647627);
    }


    static Date installDate(String ddAndMAndYyyy) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        Date date = new Date();
        date = sdf.parse(ddAndMAndYyyy);
        return date;
    }
}





