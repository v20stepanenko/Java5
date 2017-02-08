package goJava.modul10;

/**
 * Created by Vova on 08.02.2017.
 */
public class FirstTask {
    public static void main(String[] args) {
        try {
            throw new Exception("Exceprion for task");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("chek finally block");
        }
    }
}
