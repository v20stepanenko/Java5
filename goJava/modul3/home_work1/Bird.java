package goJava.modul3.home_work1;

/**
 * Created by Vova on 09.11.2016.
 */
public class Bird {

    public static void main(String[] args) {

        sing("walking");
        sing("flying");
        sing("singing");
        sing("Bird");

    }

    static void sing (String sing){

        System.out.printf(" I am %s\n", sing );

    }
}
