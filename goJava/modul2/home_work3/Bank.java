package goJava.modul2.home_work3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * int[] balances = {1200, 250, 2000, 500, 3200};
 * String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 */
public class Bank {

    static double withdrawal;


    public static void main(String[] args) throws IOException {

        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        for (int i = 0; i < ownerNames.length; i++) {
            System.out.printf("%s - balance %.2f\n", ownerNames[i], balances[i]);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Ведите имя на латынице");
            String name = reader.readLine();


            if (validNames(name, ownerNames)) {

                System.out.println("сколько денег снять?");
                withdrawal = returnValue();
                double comision = withdrawal * 0.05;
                int index = indexOwner(name, ownerNames);
                double validBalanc = balances[index] - withdrawal - comision;

                if (validBalanc < 0) {
                    System.out.println("NO");
                    break;
                } else {
                    balances[index] = validBalanc;
                    System.out.printf("%s withdrawal  =  %.2f, balance  =  %.2f", name, withdrawal, balances[index]);
                    break;
                }
            }
            System.out.printf("Такого имени нету в даной базе\n \"Y\" или \"y\" для повторного воода\n");
            if (!reader.readLine().toLowerCase().equals("y")) break;

        }

    }

    static boolean validNames(String name, String[] ownerNames) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    static int indexOwner(String name, String[] ownerNames) {
        int index = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }

    static public boolean isValid(String input) {
        int count = 0;

        if (input.isEmpty()) return false;
        if (input.equals(".")) return false;


        for (char ch : input.toCharArray()) {
            if (ch == '.') ++count;
            if (count > 1) return false;
            if (!Character.isDigit(ch) && ch != '.') {
                return false;
            }
        }
        return true;
    }

    static public double returnValue() throws IOException {
        while (true) {
            System.out.println("Введите число");
            String input = new BufferedReader(new InputStreamReader(System.in)).readLine();

            if (isValid(input)) {
                return Double.parseDouble(input);
            }
        }
    }
}
