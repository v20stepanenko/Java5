package goJava.modul3.homeWork3;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by Vova on 09.11.2016.
 */
public class Solution {
    public static void main(String[] args) throws ParseException {

        Course java5 = new Course("01-01-2017", "Java5");
        Course androidJava = new Course("25-11-2016", "Go IT Android! WOW!");
        Course developerJava = new Course("14-05-2017", "Developer");
        Course gogo = new Course("26-07-2018", "GOgo develop");
        Course goJava = new Course(90, "go Java", "Vasiliy");
        Course [] coursesTaken = new Course[5];
        coursesTaken [0] = java5;
        coursesTaken [1] = androidJava;
        coursesTaken [2] = developerJava;
        coursesTaken [3] = gogo;
        coursesTaken [4] =goJava;
        Student nameIgor = new Student("Igor","Kolomoyskiy",3);
        Student nameSveta = new Student("Jijeshova", coursesTaken);
        CollegeStudent nameVova = new CollegeStudent("Vova", "Makarevich", 5);
        CollegeStudent nameAlina = new CollegeStudent("Zimova", coursesTaken);
        CollegeStudent namePetya = new CollegeStudent("Petro", "Ivanec", 4, 26, coursesTaken, "Машиностроительный коледж", 86, 864656841);
        SpecialStudent nameIvan = new SpecialStudent("Ivan", "Figachit",9);
        SpecialStudent nameSergay = new SpecialStudent("Zukov", coursesTaken);
        SpecialStudent nameKolya = new SpecialStudent("Nikolay", "Tukov", 5, 51, coursesTaken, "college сельского хозяйства", 75, 545488,272647627);
    }

}
