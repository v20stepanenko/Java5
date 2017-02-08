package goJava.modul10;

/**
 * Created by Vova on 08.02.2017.
 */
public class FourthTask {

    public static void main(String[] args) {
        try {
            new FourthTask().f();
        } catch (ExceptionFromTaskException04 e) {
            e.printString();
        }
    }

    public void g() throws SecondTaskException {
        throw new SecondTaskException("Exception from g method") ;
    }

    public void f() throws ExceptionFromTaskException04 {
        try {
            g();
        } catch (SecondTaskException e) {
            e.printString();
            throw new ExceptionFromTaskException04("Exception from f method");
        }
    }

}
