package goJava.modul2.homeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 03.11.2016.
 */
public class BankOperation {

    static double withdrawal;

    public static void main(String[] args) throws IOException {

        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        System.out.println("Ведите имя на латынице");
        for (int i = 0; i < ownerNames.length; i++) {
            System.out.printf("%s - balance %.2f\n", ownerNames[i], balances[i]);
        }


        egegey:
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            boolean ok = false;
            int index = 0;
            for (int i = 0; i < ownerNames.length; i++) {
                if (ownerNames[i].equals(name)) {
                    ok = true;
                    index = i;
                    break;
                }
            }


            if (ok) {
                System.out.println("сколько денег добавить?");

                pipirka:
                while (true) {
                    int i = 0;

                    try {
                        withdrawal = Double.parseDouble(reader.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Введите число");
                        i = 1;
                        continue pipirka;

                    } finally {
                        if (i == 0) break;
                    }
                }

                balances[index] += withdrawal;
                System.out.printf("%s balance %.2f",name, balances[index]);
                break;

            } else {
                System.out.printf("Такого имени нету в даной базе\n \"Y\" или \"y\" для повторного воода\n");
                if (reader.readLine().toLowerCase().equals("y")) {

                    System.out.println("Вводите");
                    continue egegey;
                } else {
                    System.out.println("Программа остановлена");
                    break;
                }
            }
        }
    }
}






