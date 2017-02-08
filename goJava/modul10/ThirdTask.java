package goJava.modul10;

/**
 * Created by Vova on 08.02.2017.
 */
public class ThirdTask {

    public static void main(String[] args) {

        MyNewObject newObject = null;

        try {
            newObject.printSqr();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("You'd better run for it while I divert their attention. It's null pointer exception");
        }
    }
}
