package goJava.modul2.homeWork2;import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Created by Vova on 27.10.2016.
 */
public class BankOperation {

    static double balance;
    static double withdrawal;
    static double comision;

    public static void main(String[] args) throws IOException {


        System.out.println("Задайте баланс, по условию задачи");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        loopValid1:
        while (true) {
            boolean i = false;

            try {
                balance = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите число");
                i = true;
                continue loopValid1;

            } finally {
                if (i) break;
            }
        }
        System.out.println("Сколько бабла снять ?");

        loopValid2:
        while (true) {
            boolean i = false;

            try {
                withdrawal = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите число");
                i = true;
                continue loopValid2;

            } finally {
                if (i) break;
            }
        }
        withdrawal(withdrawal);

    }

    public static void withdrawal(double withdrawal) {

        comision=withdrawal*0.05;
        if(balance>=(comision+withdrawal)) {
            balance -= (withdrawal + comision);
            System.out.printf(new Locale("ru"),"OK \n balance = %.2f, comision =%.2f ",balance,comision);
        }
        else System.out.println("NO");

    }
}
