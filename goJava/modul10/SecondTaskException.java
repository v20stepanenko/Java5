package goJava.modul10;

/**
 * Created by Vova on 08.02.2017.
 */
public class SecondTaskException extends Exception {

    private String text;

    public SecondTaskException(String text) {
        this.text = text;
    }

    public void printString(){
        System.out.println(text);
    }
}

class ExceptionFromTaskException04 extends SecondTaskException {

    public ExceptionFromTaskException04(String text) {
        super(text);
    }
}
