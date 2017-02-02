package goJava.modul3.home_work2;

/**
 * Created by Vova on 09.11.2016.
 */
public class Adder extends Arithmetic {

    static boolean check (Integer  a, Integer  b){
        return a>b;
    }

    public static void main(String[] args) {

        Adder intTest = new Adder();
        System.out.println(intTest.add(5,6));
        System.out.println(intTest.check(10,7));

    }

}
