package goJava.modul2.homeWork2;

import java.io.BufferedReader;
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

    static public boolean isValid(String input) {
        int count = 0;

        if (input.isEmpty()) return false;

        for (char ch : input.toCharArray()) {
            if(ch=='.') ++count;
            if (count>1) return false;
            if (!Character.isDigit(ch)&& ch!='.') {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) throws IOException {


        System.out.println("Задайте баланс, по условию задачи");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        while (true) {
            String input;
            System.out.println("Введите число");
            input = reader.readLine();
            if (isValid(input)) {
                balance = Double.parseDouble(input);
                break;
            }
        }

        System.out.println("Сколько денег снять ?");

        while (true) {
            String input;
            System.out.println("Введите число");
            input = reader.readLine();
            if (isValid(input)) {
                withdrawal = Double.parseDouble(input);
                break;
            }
        }

        withdrawal(withdrawal);

    }


    public static void withdrawal(double withdrawal) {

        comision = withdrawal * 0.05;
        if (balance >= (comision + withdrawal)) {
            balance -= (withdrawal + comision);
            System.out.printf(new Locale("ru"), "OK \n balance = %.2f, comision =%.2f ", balance, comision);
        } else System.out.println("NO");

    }
}
